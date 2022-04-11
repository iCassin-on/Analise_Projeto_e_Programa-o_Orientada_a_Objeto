
public class OperacaoOrdenar {

	public Valores ordenar(Valores v) {
		if (v.getV1() > v.getV2()) {
			double aux = v.getV1();
			v.setV1(v.getV2());
			v.setV2(aux);
		}

		if (v.getV2() > v.getV3()) {
			double aux = v.getV2();
			v.setV2(v.getV3());
			v.setV3(aux);
		}

		if (v.getV1() > v.getV2()) {
			double aux = v.getV1();
			v.setV1(v.getV2());
			v.setV2(aux);
		}

		return v;
	}
}
