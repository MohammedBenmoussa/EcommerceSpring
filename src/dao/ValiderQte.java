package dao;

public class ValiderQte {
private int qte;
private int numero;
public ValiderQte(int qte, int numero) {
	super();
	this.qte = qte;
	this.numero = numero;
}
public ValiderQte() {
	super();
	// TODO Auto-generated constructor stub
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}

}
