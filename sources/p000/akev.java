package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.concurrent.Callable;

/* renamed from: akev */
final /* synthetic */ class akev implements Callable {

    /* renamed from: a */
    private final akgy f71761a;

    /* renamed from: b */
    private final Contact f71762b;

    public akev(akgy akgy, Contact contact) {
        this.f71761a = akgy;
        this.f71762b = contact;
    }

    public final Object call() {
        int i;
        akgy akgy = this.f71761a;
        Contact contact = this.f71762b;
        akcm akcm = akgy.f71947n;
        Account b = akcm.f71604c.mo39171b();
        if (b == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akcm", "b", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Unable to unmark contact %s: account is null.", contact.f80844a);
            i = 35505;
        } else {
            akhb akhb = akcm.f71602a;
            bxvd da = ajii.f70710d.mo74144da();
            long j = contact.f80844a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajii ajii = (ajii) da.f164949b;
            int i2 = ajii.f70712a | 1;
            ajii.f70712a = i2;
            ajii.f70713b = j;
            String str = contact.f80845b;
            str.getClass();
            ajii.f70712a = i2 | 2;
            ajii.f70714c = str;
            int b2 = akhb.mo39435b(b, (ajii) da.mo74062i());
            if (b2 == 0) {
                if (contact.f80850g) {
                    akcm.f71603b.mo39231b();
                }
                akcm.f71603b.mo39233c();
            }
            i = b2;
        }
        if (i == 0) {
            akgy.mo39421n();
        }
        return Integer.valueOf(i);
    }
}
