enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60){

}



class Formacao(val nome: String, nivel :Nivel ,var conteudos: List<ConteudoEducacional>){

    private val alunosMatriculados = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        alunosMatriculados.add(usuario)
        println("o usuario ${usuario.nome} foi adicionado com sucesso na formacao $nome")
    }
    fun listarAlunos(){
        println("alunos matriculados na formacao $nome")
        for( aluno in alunosMatriculados){
            println(aluno.nome)
        }
    }
}

fun main() {
    val POO = ConteudoEducacional("JAVA",40)
    val DESIGN = ConteudoEducacional("photoshop",40)
    val Economia = ConteudoEducacional("matematica discreta",60)


    val A = Formacao("ADS", Nivel.INTERMEDIARIO, listOf(POO))
    val D = Formacao("DESIGN", Nivel.INTERMEDIARIO, listOf(DESIGN))
    val E= Formacao("Economia", Nivel.INTERMEDIARIO, listOf(Economia))

    val user = Usuario("Lucas")
    val user1 = Usuario("vanessa")
    A.matricular(user)
    D.matricular(user1)
    E.matricular(user1)
    A.matricular(user1)

    A.listarAlunos()
    E.listarAlunos()
    D.listarAlunos()
}
