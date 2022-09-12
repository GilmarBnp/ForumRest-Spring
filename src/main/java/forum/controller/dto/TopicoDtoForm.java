package forum.controller.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import forum.model.Curso;
import forum.model.Topico;
import forum.repository.CursoRepository;

//classe Dto da classe Topico, mas para metodo POST, de postar uma requisição pelo corpo da requisição
//Campos necessários para cadastrar o tópico
//classe java POJO ou Java Bean
public class TopicoDtoForm {

	@NotNull @NotEmpty @Size(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Size(min = 10)
	private String mensagem;
	@NotNull @NotEmpty
	private String nomeCurso;//Não vai ser a própria classe Curso curso, porque não é
							//necessário puxar toda classe de domínio, só o nome do curso basta.
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public TopicoDtoForm() {
	
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	//o método coverter já devolve um objeto completo, com titulo, mensagem e o nome do curso
	public Topico converter(CursoRepository cursoRepository) {//com o Repository em mãos, pode carregar o nome do curso, do próprio banco de dados
		
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo,mensagem, curso);//aí passa o curso na hora de criar o topico
	}

}



















