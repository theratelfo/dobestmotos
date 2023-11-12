package com.dobestmotos.database.migrations;

import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.models.Categoria;

public class CategoriasMigrations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Categoria categoria = new Categoria();
		categoria.setCodigo("59026");
		categoria.setNombre("PRODUCTS");

		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("accessories");
		categoria.setNombre("Accessories");
		categoriaDAO.insert(categoria);

<<<<<<< Updated upstream
		categoria=new Categoria();
		categoria.setCodigo("123");
		categoria.setNombre("nombre");
		categoriaDAO.insert(categoria);
		
=======
		categoria = new Categoria();
		categoria.setCodigo("air-filter");
		categoria.setNombre("Air Filter");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("brake-pads");
		categoria.setNombre("Brake Pads");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("brake-pump");
		categoria.setNombre("Brake Pump");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("carburetor-installation-repair-tool-kit");
		categoria.setNombre("Carburetor Installation Repair Tool Kit");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("carburetor-intake-manifter-cuff");
		categoria.setNombre("Carburetor Intake Manifter Cuff");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("clutch-line");
		categoria.setNombre("Clutch Line");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("clutch-plate");
		categoria.setNombre("Clutch Plate");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("connecting-rod");
		categoria.setNombre("Connecting Rod");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("damper-oil-seal");
		categoria.setNombre("Damper Oil Seal");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("drive-belt");
		categoria.setNombre("Drive Belt");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("driven-wheel-centrifugal-clutch");
		categoria.setNombre("Driven Wheel Centrifugal Clutch");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("engine-clutch-starter-bearing");
		categoria.setNombre("Engine Clutch Starter Bearing");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("engine-oil-filler-plug-fill-cap-screw");
		categoria.setNombre("Engine Oil Filler Plug Fill Cap Screw");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("engine-oil-filter");
		categoria.setNombre("Engine Oil Filter");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("engine-timing-chain");
		categoria.setNombre("Engine Timing Chain");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("film-screen-protector");
		categoria.setNombre("Film Screen Protector");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("footrest-pedals-pegs");
		categoria.setNombre("Footrest Pedals Pegs");
		categoriaDAO.insert(categoria);

		categoria = new Categoria();
		categoria.setCodigo("fuel-cock-faucet-valve-switche-pump");
		categoria.setNombre("Fuel Cock Faucet Valve Switche Pump");
		categoriaDAO.insert(categoria);
>>>>>>> Stashed changes

	}

}
