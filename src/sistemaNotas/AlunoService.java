package sistemaNotas;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AlunoService {

	private static StringBuilder append1 = new StringBuilder();

	public static Aluno atualizarAluno(Aluno aluno) throws IOException {

		Aluno alunoNovo = new Aluno();
		FileWriter arquivo = new FileWriter("c:\\teste\\SistemaMedia.txt");

		PrintWriter gravarArq = new PrintWriter(arquivo);
		String condicaoMedia[] = ProcessarMedia.calcularMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNota3(),
				aluno.getNome());

		if (condicaoMedia != null) {
			alunoNovo.setCondicao(condicaoMedia[0]);
			alunoNovo.setMedia(condicaoMedia[1]);
			alunoNovo.setNota1(aluno.getNota1());
			alunoNovo.setNota2(aluno.getNota2());
			alunoNovo.setNota3(aluno.getNota3());
			alunoNovo.setNome(aluno.getNome());
			append1.append(alunoNovo + "\n");
			gravarArq.println(append1);
			gravarArq.close();
			return alunoNovo;
		}
		return null;
	}

}
