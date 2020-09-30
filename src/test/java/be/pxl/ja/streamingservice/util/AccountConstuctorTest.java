package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Account;
import be.pxl.ja.streamingservice.model.Profile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountConstuctorTest {
    private Account account;
    private Profile profile;

    @BeforeEach
    public void init(){
        account = new Account("hacker@domain.com", "noon");
        profile = new Profile("profile1", null);
    }

    @Test
    public void AccountFirstProfileNameMustMatch() {
        Assertions.assertEquals(account.getFirstProfile().getName(), profile.getName());
    }
    @Test
    public void AccountFirstProfileDateOfBirthMustMatch() {
        Assertions.assertEquals(account.getFirstProfile().getDateOfBirth(), profile.getDateOfBirth());
    }
}
