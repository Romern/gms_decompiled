package p000;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.concurrent.Callable;

/* renamed from: akeu */
final /* synthetic */ class akeu implements Callable {

    /* renamed from: a */
    private final akgy f71759a;

    /* renamed from: b */
    private final Contact f71760b;

    public akeu(akgy akgy, Contact contact) {
        this.f71759a = akgy;
        this.f71760b = contact;
    }

    public final Object call() {
        int i;
        akgy akgy = this.f71759a;
        Contact contact = this.f71760b;
        akcm akcm = akgy.f71947n;
        Account b = akcm.f71604c.mo39171b();
        if (b == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akcm", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68415a("Unable to mark contact %s: account is null.", contact.f80844a);
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
            i = akhb.mo39431a(b, (ajii) da.mo74062i());
            if (i == 0) {
                akcm.f71603b.mo39233c();
            }
        }
        if (i == 0) {
            akgy.mo39421n();
        }
        return Integer.valueOf(i);
    }
}
