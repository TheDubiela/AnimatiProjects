package br.com.animati.CRUD;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//testes feitos com base no codigo do Jobim

public class PacienteTest {
    Paciente pacienteA;
    Paciente pacienteB;
    Paciente pacienteC;
    PacienteCrud pacienteCrud = new PacienteCrudImpl();

    @Before
    public void init() {
        pacienteA = new Paciente.Builder(0,"Josesvaldo","888.888.888-00","masculino").Build();

        pacienteB = new Paciente.Builder(1,"Maria","456.786.132-45","feminino").NomeMae("Joana").cartaoSus("888954").Build();

        pacienteC = new Paciente.Builder(2,"Carlos","941.453.123-45","masculino").Email("Carlos@gmail.com").Build();

        pacienteCrud.add(pacienteA);
        pacienteCrud.add(pacienteB);
        pacienteCrud.add(pacienteC);
    }

    @Test
    public void NotFound(){
        Assert.assertNull(pacienteCrud.findById(5));
    }

    @Test
    public void Remove(){
        pacienteCrud.delete(2);
        Assert.assertEquals(2,pacienteCrud.list().size());
    }

    @Test
    public void SizeList(){
        Assert.assertEquals(3,pacienteCrud.list().size());
    }

    @Test
    public void Add(){
        Assert.assertEquals(pacienteA.getIdPaciente(), pacienteCrud.findById(pacienteA.getIdPaciente()).getIdPaciente());
        Assert.assertEquals(pacienteB.getIdPaciente(), pacienteCrud.findById(pacienteB.getIdPaciente()).getIdPaciente());
        Assert.assertEquals(pacienteC.getIdPaciente(), pacienteCrud.findById(pacienteC.getIdPaciente()).getIdPaciente());
    }


    @Test
    public void Edit(){
        pacienteA.setNomeMae("Joaquina");
        pacienteA.setCartaoSus("1891565");
        pacienteCrud.edit(pacienteA);

        Paciente pacienteEdit = pacienteCrud.findById(pacienteA.getIdPaciente());

        Assert.assertEquals(pacienteA.getNomeMae(),pacienteEdit.getNomeMae());
        Assert.assertEquals(pacienteA.getCartaoSus(),pacienteEdit.getCartaoSus());

    }

}
