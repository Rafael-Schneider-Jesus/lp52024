package bean;
// Generated 11/09/2024 09:05:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProdutoRsj generated by hbm2java
 */
@Entity
@Table(name="produto_rsj"
    ,catalog="db_rafael_jesus"
)
public class ProdutoRsj  implements java.io.Serializable {


     private int idprodutoRsj;
     private String saborRsj;
     private String tamanhoRsj;
     private String copooucasquinhaRsj;
     private String entregaRsj;
   

    public ProdutoRsj() {
    }

	
    public ProdutoRsj(int idprodutoRsj) {
        this.idprodutoRsj = idprodutoRsj;
    }
    public ProdutoRsj(int idprodutoRsj, String saborRsj, String tamanhoRsj, String copooucasquinhaRsj, String entregaRsj, Set vendaprodutoRsjs) {
       this.idprodutoRsj = idprodutoRsj;
       this.saborRsj = saborRsj;
       this.tamanhoRsj = tamanhoRsj;
       this.copooucasquinhaRsj = copooucasquinhaRsj;
       this.entregaRsj = entregaRsj;
      
    }
   
     @Id 

    
    @Column(name="idproduto_rsj", unique=true, nullable=false)
    public int getIdprodutoRsj() {
        return this.idprodutoRsj;
    }
    
    public void setIdprodutoRsj(int idprodutoRsj) {
        this.idprodutoRsj = idprodutoRsj;
    }

    
    @Column(name="sabor_rsj", length=45)
    public String getSaborRsj() {
        return this.saborRsj;
    }
    
    public void setSaborRsj(String saborRsj) {
        this.saborRsj = saborRsj;
    }

    
    @Column(name="tamanho_rsj", length=25)
    public String getTamanhoRsj() {
        return this.tamanhoRsj;
    }
    
    public void setTamanhoRsj(String tamanhoRsj) {
        this.tamanhoRsj = tamanhoRsj;
    }

    
    @Column(name="copooucasquinha_rsj", length=25)
    public String getCopooucasquinhaRsj() {
        return this.copooucasquinhaRsj;
    }
    
    public void setCopooucasquinhaRsj(String copooucasquinhaRsj) {
        this.copooucasquinhaRsj = copooucasquinhaRsj;
    }

    
    @Column(name="entrega_rsj", length=25)
    public String getEntregaRsj() {
        return this.entregaRsj;
    }
    
    public void setEntregaRsj(String entregaRsj) {
        this.entregaRsj = entregaRsj;
    }





}


