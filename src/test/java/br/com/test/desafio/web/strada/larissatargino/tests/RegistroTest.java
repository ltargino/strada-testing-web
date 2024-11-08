package br.com.test.desafio.web.strada.larissatargino.tests;

import br.com.test.desafio.web.strada.larissatargino.model.enums.*;
import br.com.test.desafio.web.strada.larissatargino.pages.RegistroPage;
import br.com.test.desafio.web.strada.larissatargino.utils.DriverFactory;
import org.junit.jupiter.api.Test;

public class RegistroTest {

    private RegistroPage registroPage;

    @Test
    public void registroTest() {
        this.registroPage = new RegistroPage(DriverFactory.getDriver());

        this.registroPage.goToRegistroPage();

        this.registroPage.fillName("Larissa");
        this.registroPage.fillLastName("Targino");
        this.registroPage.fillAddress("Rua Afonso Fonseca");
        this.registroPage.fillEmailAddress("l.targino@hotmail.com");
        this.registroPage.fillPhone("8388507206");
        this.registroPage.fillGender(Gender.Female);
        this.registroPage.fillHobbies(Hobbies.Movies);
//        this.registroPage.fillLanguages(Languages.Portuguese);
        this.registroPage.fillSkills(Skills.CSS);
        this.registroPage.fillCountry(Country.UnitedStatesOfAmerica);
        this.registroPage.fillDateOfBrith("25", 2, "1994");
        this.registroPage.fillPassword("TesteSenha$1");
        this.registroPage.fillConfirmPassword("TesteSenha$1");

//        this.registroPage.finishRegister();

        this.registroPage.close();
    }

}
