package principal;

import java.math.BigDecimal;

public class Boleto {
	private long idBoleto;
	private long idSorteo;
	private short reintegro;
	private short tipoApuesta;
	private BigDecimal premio;
	private short numeroAcertados;
	
	
	
	public short getNumeroAcertados() {
		return numeroAcertados;
	}



	public void setNumeroAcertados(short numeroAcertados) {
		this.numeroAcertados = numeroAcertados;
	}



	public Boleto() {
		idBoleto=0;
		idSorteo=0;
		reintegro=0;
		tipoApuesta=6;
		premio=new BigDecimal(0);
		numeroAcertados=0;
	}



	public Boleto(long idBoleto, long idSorteo, short reintegro, short tipoApuesta, BigDecimal premio,short numeroAcertados) {
		this.idBoleto = idBoleto;
		this.idSorteo = idSorteo;
		this.reintegro = reintegro;
		this.tipoApuesta = tipoApuesta;
		this.premio = premio;
		this.numeroAcertados=numeroAcertados;
	}



	/**
	 * @return the idBoleto
	 */
	public long getIdBoleto() {
		return idBoleto;
	}



	/**
	 * @param idBoleto the idBoleto to set
	 */
	public void setIdBoleto(long idBoleto) {
		this.idBoleto = idBoleto;
	}



	/**
	 * @return the idSorteo
	 */
	public long getIdSorteo() {
		return idSorteo;
	}



	/**
	 * @param idSorteo the idSorteo to set
	 */
	public void setIdSorteo(long idSorteo) {
		this.idSorteo = idSorteo;
	}



	/**
	 * @return the reintegro
	 */
	public short getReintegro() {
		return reintegro;
	}



	/**
	 * @param reintegro the reintegro to set
	 */
	public void setReintegro(short reintegro) {
		this.reintegro = reintegro;
	}



	/**
	 * @return the tipoApuesta
	 */
	public short getTipoApuesta() {
		return tipoApuesta;
	}



	/**
	 * @param tipoApuesta the tipoApuesta to set
	 */
	public void setTipoApuesta(short tipoApuesta) {
		this.tipoApuesta = tipoApuesta;
	}



	/**
	 * @return the premio
	 */
	public BigDecimal getPremio() {
		return premio;
	}



	/**
	 * @param premio the premio to set
	 */
	public void setPremio(BigDecimal premio) {
		this.premio = premio;
	}
	
	
}