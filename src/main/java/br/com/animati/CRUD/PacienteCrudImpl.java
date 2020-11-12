package br.com.animati.CRUD;

import java.util.ArrayList;
import java.util.List;

public class PacienteCrudImpl implements PacienteCrud{
    private List<Paciente> pacientes = new ArrayList<>();

    @Override
    public void add(Paciente p) {
        pacientes.add(p);
    }

    @Override
    public void edit(Paciente p) {
        for (int i = 0; i<pacientes.size();i++) {
            if(pacientes.get(i).getIdPaciente() == p.getIdPaciente()) {pacientes.set(i,p);}
        }
    }

    @Override
    public List<Paciente> list() {
        return pacientes;
    }

    @Override
    public void delete(long idPaciente) {
        for (int i = 0; i<pacientes.size();i++) {
            if(pacientes.get(i).getIdPaciente() == idPaciente) {pacientes.remove(i);}
        }
    }

    @Override
    public Paciente findById(long idPaciente) {
        for (int i = 0; i<pacientes.size();i++) {
            if(pacientes.get(i).getIdPaciente() == idPaciente) {return pacientes.get(i);}
        }
        return null;
    }
}
