import Dao.BD;
import Model.Odontologo;
import Service.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OdontologoTest {
    @Test
    public void listarOdontologos(){
        BD.crearTabla();
        OdontologoService odontologoService= new OdontologoService();
        List<Odontologo> odontologos = new ArrayList<>();
        odontologos = odontologoService.listarOdontologos();
        Assertions.assertFalse(odontologos.isEmpty());

    }

}
