package p000;

import android.accounts.Account;
import android.os.Bundle;

/* renamed from: gyn */
final /* synthetic */ class gyn implements C0038ax {

    /* renamed from: a */
    private final gyt f19246a;

    public gyn(gyt gyt) {
        this.f19246a = gyt;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gyt gyt = this.f19246a;
        acyz acyz = (acyz) obj;
        gyt.f19256d.f61122a.mo2444a(gyt);
        int i = acyz.f61100a;
        if (i == -1) {
            Bundle extras = acyz.f61101b.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("errorMessage")) {
                String string = extras.getString("errorMessage");
                gyt.f19252a.mo25416d(string, new Object[0]);
                gyt.f19255c.mo12368a(haz.m14158b(string));
            } else if (extras.getBoolean("pickedFromAccountChips", false)) {
                String string2 = extras.getString("authAccount");
                String string3 = extras.getString("accountType");
                hay hay = gyt.f19255c;
                hay.f19384h.mo2453l(new Account(string2, string3));
            }
        } else if (i == 0) {
            gyt.f19255c.mo12368a(haz.m14155a());
        } else if (i == 10) {
            gyt.f19252a.mo25416d("No account was found and not allowed to add a new one", new Object[0]);
            gyt.f19255c.mo12368a(haz.m14158b("No account was found and not allowed to add a new one"));
        }
    }
}
