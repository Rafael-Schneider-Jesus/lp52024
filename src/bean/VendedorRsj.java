package bean;
// Generated 16/09/2024 12:26:42 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VendedorRsj generated by hbm2java
 */
@Entity
@Table(name = "vendedor_rsj",
         catalog = "db_rafael_jesus"
)
public class VendedorRsj implements java.io.Serializable {

    private int idvendedorRsj;
    private String nomeRsj;
    private String sobrenomeRsj;
    private String cpfRsj;
    private Date datanascimentoRsj;
    private String telefoneRsj;
    private String senhaRsj;
    private int funcaoRsj;

    public VendedorRsj() {
    }

    public VendedorRsj(int idvendedorRsj) {
        this.idvendedorRsj = idvendedorRsj;
    }

    public VendedorRsj(int idvendedorRsj, String nomeRsj, String sobrenomeRsj, String cpfRsj, Date datanascimentoRsj, String telefoneRsj, String senhaRsj, int funcaoRsj, Set vendaRsjs) {
        this.idvendedorRsj = idvendedorRsj;
        this.nomeRsj = nomeRsj;
        this.sobrenomeRsj = sobrenomeRsj;
        this.cpfRsj = cpfRsj;
        this.datanascimentoRsj = datanascimentoRsj;
        this.telefoneRsj = telefoneRsj;
        this.senhaRsj = senhaRsj;
        this.funcaoRsj = funcaoRsj;

    }

    @Id

    @Column(name = "idvendedor_rsj", unique = true, nullable = false)
    public int getIdvendedorRsj() {
        return this.idvendedorRsj;
    }

    public void setIdvendedorRsj(int idvendedorRsj) {
        this.idvendedorRsj = idvendedorRsj;
    }

    @Column(name = "nome_rsj", length = 45)
    public String getNomeRsj() {
        return this.nomeRsj;
    }

    public void setNomeRsj(String nomeRsj) {
        this.nomeRsj = nomeRsj;
    }

    @Column(name = "sobrenome_rsj", length = 45)
    public String getSobrenomeRsj() {
        return this.sobrenomeRsj;
    }

    public void setSobrenomeRsj(String sobrenomeRsj) {
        this.sobrenomeRsj = sobrenomeRsj;
    }

    @Column(name = "cpf_rsj", length = 45)
    public String getCpfRsj() {
        return this.cpfRsj;
    }

    public void setCpfRsj(String cpfRsj) {
        this.cpfRsj = cpfRsj;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "datanascimento_rsj", length = 10)
    public Date getDatanascimentoRsj() {
        return this.datanascimentoRsj;
    }

    public void setDatanascimentoRsj(Date datanascimentoRsj) {
        this.datanascimentoRsj = datanascimentoRsj;
    }

    @Column(name = "telefone_rsj", length = 20)
    public String getTelefoneRsj() {
        return this.telefoneRsj;
    }

    public void setTelefoneRsj(String telefoneRsj) {
        this.telefoneRsj = telefoneRsj;
    }

    @Column(name = "senha_rsj", length = 45)
    public String getSenhaRsj() {
        return this.senhaRsj;
    }

    public void setSenhaRsj(String senhaRsj) {
        this.senhaRsj = senhaRsj;
    }

    @Column(name = "funcao_rsj")
    public int getFuncaoRsj() {
        return this.funcaoRsj;
    }

    public void setFuncaoRsj(int funcaoRsj) {
        this.funcaoRsj = funcaoRsj;
    }

    @Override
    public String toString() {
        return this.nomeRsj;
    }
}
