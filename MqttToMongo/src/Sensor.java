
public class Sensor {
	String dataPassagem;
	String horaPassagem;
	String nomeEvento;
	String tipoSensor;
	
	public Sensor(String dataPassagem, String horaPassagem, String nomeEvento, String tipoSensor) {
		this.dataPassagem = dataPassagem;
		this.horaPassagem = horaPassagem;
		this.nomeEvento = nomeEvento;
		this.tipoSensor = tipoSensor;
	}

	public String getDataPassagem() {
		return dataPassagem;
	}

	public void setDataPassagem(String dataPassagem) {
		this.dataPassagem = dataPassagem;
	}

	public String getHoraPassagem() {
		return horaPassagem;
	}

	public void setHoraPassagem(String horaPassagem) {
		this.horaPassagem = horaPassagem;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(String tipoSensor) {
		this.tipoSensor = tipoSensor;
	}
	
	
	
	

}
