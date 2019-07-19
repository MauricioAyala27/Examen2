package app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.DaoProducto;
import com.entity.Catalogo;
import com.entity.Producto;

@Controller
public class ProductoController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String handler(Model model) {
		model.addAttribute("Saludo","Bienvenido<");
		
		return "index";
	}
	
	@RequestMapping("/insert")
	public String insert(@RequestParam(value = "nombre")String nombreProducto,
			@RequestParam(value = "idCatalogo")int catalogo,
			@RequestParam(value = "idMarca")int marca,
			@RequestParam(value = "precio")double precio,
			@RequestParam(value = "descripcion")String descripcion, Model model) {
		
		Producto pro = new Producto();
		DaoProducto daoPro = new DaoProducto();
		
		pro.setNombreProducto(nombreProducto);
		pro.setIdCat(catalogo);
		pro.setIdMarc(marca);
		pro.setPrecio(precio);
		pro.setDescripcion(descripcion);
		pro.setExistencia(1);
		daoPro.guardarProducto(pro);
		
		return "index";
	}
	
	@RequestMapping("/listar")
	public String listarProducto(Model mv) {
		
		DaoProducto daoPro = new DaoProducto();
		List<Producto>productos = daoPro.listarProducto();
		mv.addAttribute("listP",productos);
		
		return "tablaProductos";
	}
	
	
	@RequestMapping(value ="/eliminar/{id}", method = RequestMethod.GET)
	public String eliminar(@PathVariable("id") int id) {

		DaoProducto daoPro = new DaoProducto();
		
		daoPro.eliminarProducto(id);
		
		return "index";
	}
	
	

	@RequestMapping("/marca")
	public String iraMarca() {
		
		return "marca";
	}

}
