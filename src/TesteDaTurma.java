

class Aluno{
    String nome;
    int nota;
}

class Turma{
    Aluno [] alunos;
    
    void ImprimeNotas(){
        for(int i = 0; i < this.alunos.length;i++){
            Aluno aluno = this.alunos[i];
            if(aluno == null)
                continue;
            System.out.println(aluno.nota);   
        }
    }
}
class TesteDaTurma{
   public static void main(String[] args){
       Turma turma = new Turma();
       turma.alunos = new Aluno[10];
       
       turma.alunos[0] = new Aluno();
       turma.alunos[0].nome = "Rodolpho";
       turma.alunos[0].nota = 7;
       
       turma.alunos[1] = new Aluno();
       turma.alunos[1].nome = "Thiago";
       turma.alunos[1].nota =  8;
       
       turma.ImprimeNotas();
      
   }    
}
