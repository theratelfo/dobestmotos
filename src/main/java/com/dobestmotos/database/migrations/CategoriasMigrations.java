package com.dobestmotos.database.migrations;

import com.dobestmotos.database.daos.CategoriaDAO;
import com.dobestmotos.database.models.Categoria;

public class CategoriasMigrations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Categoria categoria = new Categoria();
			categoria.setCodigo("accessories");
			categoria.setNombre("Accessories");

			CategoriaDAO categoriaDAO = new CategoriaDAO();
			categoriaDAO.insert(categoria);

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

			categoria = new Categoria();
			categoria.setCodigo("benell-accessories");
			categoria.setNombre("Benell");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-accessories");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-accessories");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-accessories");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-accessories");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-accessories");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-accessories");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-accessories");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-air-filter");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("harley-davidson-air-filter");
			categoria.setNombre("Harley Davidson");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-air-filter");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-air-filter");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("hyosung-air-filter");
			categoria.setNombre("Hyosung");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-air-filter");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-air-filter");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kymco-air-filter");
			categoria.setNombre("Kymco");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("piaggio-air-filter");
			categoria.setNombre("Piaggio");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-air-filter");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("sym-air-filter");
			categoria.setNombre("SYM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("triumph-air-filter");
			categoria.setNombre("Triumph");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("vespa-air-filter");
			categoria.setNombre("Vespa");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-air-filter");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-air-filter");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-brake-guard-with-installation-kit");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-brake-pads");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("buell-brake-pads");
			categoria.setNombre("Buell");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("can-am-brake-pads");
			categoria.setNombre("Can-am");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("cfmoto-brake-pads");
			categoria.setNombre("CFMOTO");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-brake-pads");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("harley-davidson-brake-pads");
			categoria.setNombre("Harley Davidson");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-brake-pads");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-brake-pads");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("hyosung-brake-pads");
			categoria.setNombre("Hyosung");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-brake-pads");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-brake-pads");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kymco-brake-pads");
			categoria.setNombre("Kymco");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-brake-pads");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-brake-pads");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("sym-brake-pads");
			categoria.setNombre("SYM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("triumph-brake-pads");
			categoria.setNombre("Triumph");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-brake-pads");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-brake-pads");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-brake-pump");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("arctic-cat-brake-pump");
			categoria.setNombre("Arctic Cat");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-brake-pump");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-brake-pump");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-brake-pump");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-brake-pump");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-brake-pump");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-brake-pump");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-brake-pump");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-brake-pump");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-brake-pump");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-carburetor-installation-repair-tool-kit");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-carburetor-intake-manifter-cuff");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-carburetor-intake-manifter-cuff");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-carburetor-intake-manifter-cuff");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-carburetor-intake-manifter-cuff");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-carburetor-intake-manifter-cuff");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-carburetor-intake-manifter-cuff");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-clutch-line");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-clutch-line");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-clutch-line");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-clutch-line");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-clutch-line");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-clutch-plate");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("buell-clutch-plate");
			categoria.setNombre("Buell");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("harley-davidson-clutch-plate");
			categoria.setNombre("Harley Davidson");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-clutch-plate");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-clutch-plate");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-clutch-plate");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-clutch-plate");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-clutch-plate");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("triumph-clutch-plate");
			categoria.setNombre("Triumph");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-clutch-plate");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-clutch-plate");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-connecting-rod");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-connecting-rod");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-connecting-rod");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-connecting-rod");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-connecting-rod");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-connecting-rod");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-damper-oil-seal");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-damper-oil-seal");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("harley-davidson-damper-oil-seal");
			categoria.setNombre("Harley Davidson");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-damper-oil-seal");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-damper-oil-seal");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("hyosung-damper-oil-seal");
			categoria.setNombre("Hyosung");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-damper-oil-seal");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-damper-oil-seal");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("triumph-damper-oil-seal");
			categoria.setNombre("Triumph");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-damper-oil-seal");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-damper-oil-seal");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("arctic-cat-drive-belt");
			categoria.setNombre("Arctic Cat");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-drive-belt");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("can-am-drive-belt");
			categoria.setNombre("Can-am");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("cfmoto-drive-belt");
			categoria.setNombre("CFMOTO");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-drive-belt");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-drive-belt");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kymco-drive-belt");
			categoria.setNombre("Kymco");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("piaggio");
			categoria.setNombre("Piaggio");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-drive-belt");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ski-doo-drive-belt");
			categoria.setNombre("Ski doo");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-drive-belt");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("sym-drive-belt");
			categoria.setNombre("SYM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-drive-belt");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-drive-belt");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("cfmoto-driven-wheel-centrifugal-clutch");
			categoria.setNombre("CFMOTO");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-driven-wheel-centrifugal-clutch");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-driven-wheel-centrifugal-clutch");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kymco-driven-wheel-centrifugal-clutch");
			categoria.setNombre("Kymco");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-driven-wheel-centrifugal-clutch");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-engine-clutch-starter-bearing");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("arctic-cat-engine-clutch-starter-bearing");
			categoria.setNombre("Arctic Cat");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-engine-clutch-starter-bearing");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("can-am-engine-clutch-starter-bearing");
			categoria.setNombre("Can-am");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("cfmoto-engine-clutch-starter-bearing");
			categoria.setNombre("CFMOTO");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-engine-clutch-starter-bearing");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-engine-clutch-starter-bearing");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-engine-clutch-starter-bearing");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-engine-clutch-starter-bearing");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-engine-clutch-starter-bearing");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kymco-engine-clutch-starter-bearing");
			categoria.setNombre("Kymco");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-engine-clutch-starter-bearing");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ski-doo-engine-clutch-starter-bearing");
			categoria.setNombre("Ski doo");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-engine-clutch-starter-bearing");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-engine-clutch-starter-bearing");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-engine-clutch-starter-bearing");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-engine-oil-filler-plug-fill-cap-screw");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-engine-oil-filler-plug-fill-cap-screw");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-engine-oil-filler-plug-fill-cap-screw");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-engine-oil-filler-plug-fill-cap-screw");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-engine-oil-filler-plug-fill-cap-screw");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-engine-oil-filler-plug-fill-cap-screw");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-engine-oil-filter");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-engine-oil-filter");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-engine-oil-filter");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("hyosung-engine-oil-filter");
			categoria.setNombre("Hyosung");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-engine-oil-filter");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-engine-oil-filter");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-engine-oil-filter");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-engine-oil-filter");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-engine-oil-filter");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("arctic-cat-engine-timing-chain");
			categoria.setNombre("Arctic Cat");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-engine-timing-chain");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-engine-timing-chain");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("husqvarna-engine-timing-chain");
			categoria.setNombre("Husqvarna");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-engine-timing-chain");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-engine-timing-chain");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-engine-timing-chain");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-engine-timing-chain");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-engine-timing-chain");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-film-screen-protector");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-film-screen-protector");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-film-screen-protector");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("harley-davidson-film-screen-protector");
			categoria.setNombre("Harley Davidson");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-film-screen-protector");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-film-screen-protector");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ktm-film-screen-protector");
			categoria.setNombre("KTM");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-film-screen-protector");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("triumph-film-screen-protector");
			categoria.setNombre("Triumph");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("vespa-film-screen-protector");
			categoria.setNombre("Vespa");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-film-screen-protector");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("other-film-screen-protector");
			categoria.setNombre("Other");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("aprilia-footrest-pedals-pegs");
			categoria.setNombre("Aprilia");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("bmw-footrest-pedals-pegs");
			categoria.setNombre("BMW");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("ducati-footrest-pedals-pegs");
			categoria.setNombre("Ducati");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-footrest-pedals-pegs");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("hyosung-footrest-pedals-pegs");
			categoria.setNombre("Hyosung");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-footrest-pedals-pegs");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-footrest-pedals-pegs");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("triumph-footrest-pedals-pegs");
			categoria.setNombre("Triumph");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-footrest-pedals-pegs");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("harley-davidson-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Harley Davidson");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("honda-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Honda");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("hyosung-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Hyosung");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("kawasaki-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Kawasaki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("polaris-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Polaris");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("suzuki-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Suzuki");
			categoriaDAO.insert(categoria);

			categoria = new Categoria();
			categoria.setCodigo("yamaha-fuel-cock-faucet-valve-switche-pump");
			categoria.setNombre("Yamaha");
			categoriaDAO.insert(categoria);

		} catch (Exception e) {
			System.out.println("error DB");
			System.out.println(e.getMessage());
		}

	}

}
