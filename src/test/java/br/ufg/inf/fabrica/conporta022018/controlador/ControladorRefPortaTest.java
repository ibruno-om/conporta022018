package br.ufg.inf.fabrica.conporta022018.controlador;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ControladorRefPortaTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ControladorRefPorta.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void referenciarPortariaTest() {

    }
}
