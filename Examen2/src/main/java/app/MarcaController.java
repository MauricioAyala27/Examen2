package app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.DaoMarca;
import com.entity.Marca;

@Controller
public class MarcaController {
	
	@RequestMapping("/insertM")
	public String insert(@RequestParam(value = "nombre")String nombreMarca,
			@RequestParam(value = "descripcion")String descripcion,
			@RequestParam(value = "paisEmsamblaje")String paisEmsamblaje,
			@RequestParam(value = "idProveedor")int proveedor) {
		
		Marca marc = new Marca();
		DaoMarca daoMarc = new DaoMarca();
		
		marc.setNombreMarca(nombreMarca);
		marc.setDescripcion(descripcion);
		marc.setPaisEmsamblaje(paisEmsamblaje);
		marc.setIdProv(proveedor);
		daoMarc.guardarMarca(marc);
		
		return "marca";
		
	}
	
	@RequestMapping("/listarM")
	public String listarMarca(Model mv) {
		
		DaoMarca daoMarc = new DaoMarca();
		List<Marca>marcas = daoMarc.listarMarca();
		
		mv.addAttribute("listM",marcas);
		
		return "tablaMarcas";
	}
}
