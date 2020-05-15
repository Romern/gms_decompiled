package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: hbr */
final /* synthetic */ class hbr implements C0038ax {

    /* renamed from: a */
    private final hbu f19432a;

    public hbr(hbu hbu) {
        this.f19432a = hbu;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hbu hbu = this.f19432a;
        acyz acyz = (acyz) obj;
        int i = acyz.f61100a;
        if (i == -1) {
            Bundle extras = acyz.f61101b.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("errorMessage")) {
                String string = extras.getString("errorMessage");
                hbu.f19435a.mo25416d(string, new Object[0]);
                hbu.f19437b.mo12408a(new hdh(new Status(13, string), bmvz.f131120a));
            } else if (extras.getBoolean("pickedFromAccountChips", false)) {
                String string2 = extras.getString("authAccount");
                String string3 = extras.getString("accountType");
                hdi hdi = hbu.f19437b;
                hdi.f19526e.mo2453l(new Account(string2, string3));
            }
        } else if (i == 0) {
            hbu.f19437b.mo12408a(new hdh(Status.f30111e, bmvz.f131120a));
        } else if (i == 10) {
            hbu.f19435a.mo25416d("No account was found and not allowed to add a new one", new Object[0]);
            hbu.f19437b.mo12408a(new hdh(new Status(16, "No account was found and not allowed to add a new one"), bmvz.f131120a));
        }
    }
}
