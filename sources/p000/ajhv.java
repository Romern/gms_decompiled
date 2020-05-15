package p000;

import android.accounts.Account;
import android.widget.ImageView;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;

/* renamed from: ajhv */
public final /* synthetic */ class ajhv implements aubw {

    /* renamed from: a */
    private final ConsentsChimeraActivity f70677a;

    public ajhv(ConsentsChimeraActivity consentsChimeraActivity) {
        this.f70677a = consentsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ConsentsChimeraActivity consentsChimeraActivity = this.f70677a;
        Account account = (Account) obj;
        if (account != null) {
            consentsChimeraActivity.f80836l.setText(account.name);
            aucb c = akhu.m59737c(consentsChimeraActivity, account);
            ImageView imageView = consentsChimeraActivity.f80835k;
            imageView.getClass();
            c.mo50373a(new ajhx(imageView));
            c.mo50372a(ajhy.f70680a);
            aucb b = akhu.m59733b(consentsChimeraActivity, account);
            b.mo50373a(new ajhz(consentsChimeraActivity));
            b.mo50372a(ajia.f70682a);
            ajvw ajvw = new ajvw(consentsChimeraActivity);
            bqgj b2 = ahhr.m55806b();
            aucb a = aucu.m76780a(b2, new ajvu(ajvw, account));
            b2.shutdown();
            a.mo50373a(new ajhq(consentsChimeraActivity));
            a.mo50372a(new ajhr(consentsChimeraActivity));
            return;
        }
        ((bnsl) ajvp.f71371a.mo68388c()).mo68405a("Unable to enable device contacts: account is null.");
        consentsChimeraActivity.mo44390i();
    }
}
