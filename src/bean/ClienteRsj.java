package bean;
// Generated 27/07/2024 09:42:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClienteRsj generated by hbm2java
 */
@Entity
@Table(name = "cliente_rsj",
         catalog = "db_rafael_jesus"
)
public class ClienteRsj implements java.io.Serializable {

    private int idclienteRsj;
    private String nomeRsj;
    private String sobrenomeRsj;
    private String emailRsj;
    private String telefoneRsj;
    private String enderecoRsj;
    private String cidadeRsj;
    private String cepRsj;
    private Date datanascimentoRsj;
    private int generoRsj;
    private String profissaoRsj;
    private int estadocivilRsj;
    private int numerodependentesRsj;
    private int rendaanualRsj;
    private Date datacadastroRsj;

    public ClienteRsj() {
    }

    public ClienteRsj(int idclienteRsj) {
        this.idclienteRsj = idclienteRsj;
    }

    public ClienteRsj(int idclienteRsj, String nomeRsj, String sobrenomeRsj, String emailRsj, String telefoneRsj, String enderecoRsj, String cidadeRsj, String cepRsj, Date datanascimentoRsj, int generoRsj, String profissaoRsj, int estadocivilRsj, int numerodependentesRsj, int rendaanualRsj, Date datacadastroRsj) {
        this.idclienteRsj = idclienteRsj;
        this.nomeRsj = nomeRsj;
        this.sobrenomeRsj = sobrenomeRsj;
        this.emailRsj = emailRsj;
        this.telefoneRsj = telefoneRsj;
        this.enderecoRsj = enderecoRsj;
        this.cidadeRsj = cidadeRsj;
        this.cepRsj = cepRsj;
        this.datanascimentoRsj = datanascimentoRsj;
        this.generoRsj = generoRsj;
        this.profissaoRsj = profissaoRsj;
        this.estadocivilRsj = estadocivilRsj;
        this.numerodependentesRsj = numerodependentesRsj;
        this.rendaanualRsj = rendaanualRsj;
        this.datacadastroRsj = datacadastroRsj;
    }

    @Id

    @Column(name = "idcliente_rsj", unique = true, nullable = false)
    public int getIdclienteRsj() {
        return this.idclienteRsj;
    }

    public void setIdclienteRsj(int idclienteRsj) {
        this.idclienteRsj = idclienteRsj;
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

    @Column(name = "email_rsj", length = 45)
    public String getEmailRsj() {
        return this.emailRsj;
    }

    public void setEmailRsj(String emailRsj) {
        this.emailRsj = emailRsj;
    }

    @Column(name = "telefone_rsj", length = 45)
    public String getTelefoneRsj() {
        return this.telefoneRsj;
    }

    public void setTelefoneRsj(String telefoneRsj) {
        this.telefoneRsj = telefoneRsj;
    }

    @Column(name = "endereco_rsj", length = 45)
    public String getEnderecoRsj() {
        return this.enderecoRsj;
    }

    public void setEnderecoRsj(String enderecoRsj) {
        this.enderecoRsj = enderecoRsj;
    }

    @Column(name = "cidade_rsj", length = 45)
    public String getCidadeRsj() {
        return this.cidadeRsj;
    }

    public void setCidadeRsj(String cidadeRsj) {
        this.cidadeRsj = cidadeRsj;
    }

    @Column(name = "cep_rsj", length = 45)
    public String getCepRsj() {
        return this.cepRsj;
    }

    public void setCepRsj(String cepRsj) {
        this.cepRsj = cepRsj;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "datanascimento_rsj", length = 10)
    public Date getDatanascimentoRsj() {
        return this.datanascimentoRsj;
    }

    public void setDatanascimentoRsj(Date datanascimentoRsj) {
        this.datanascimentoRsj = datanascimentoRsj;
    }

    @Column(name = "genero_rsj")
    public int getGeneroRsj() {
        return this.generoRsj;
    }

    public void setGeneroRsj(int generoRsj) {
        this.generoRsj = generoRsj;
    }

    @Column(name = "profissao_rsj", length = 45)
    public String getProfissaoRsj() {
        return this.profissaoRsj;
    }

    public void setProfissaoRsj(String profissaoRsj) {
        this.profissaoRsj = profissaoRsj;
    }

    @Column(name = "estadocivil_rsj")
    public int getEstadocivilRsj() {
        return this.estadocivilRsj;
    }

    public void setEstadocivilRsj(int estadocivilRsj) {
        this.estadocivilRsj = estadocivilRsj;
    }

    @Column(name = "numerodependentes_rsj")
    public int getNumerodependentesRsj() {
        return this.numerodependentesRsj;
    }

    public void setNumerodependentesRsj(int numerodependentesRsj) {
        this.numerodependentesRsj = numerodependentesRsj;
    }

    @Column(name = "rendaanual_rsj")
    public int getRendaanualRsj() {
        return this.rendaanualRsj;
    }

    public void setRendaanualRsj(int rendaanualRsj) {
        this.rendaanualRsj = rendaanualRsj;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "datacadastro_rsj", length = 10)
    public Date getDatacadastroRsj() {
        return this.datacadastroRsj;
    }

    public void setDatacadastroRsj(Date datacadastroRsj) {
        this.datacadastroRsj = datacadastroRsj;
    }

}
