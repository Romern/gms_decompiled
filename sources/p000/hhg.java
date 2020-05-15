package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: hhg */
final /* synthetic */ class hhg implements C0038ax {

    /* renamed from: a */
    private final hhj f19768a;

    public hhg(hhj hhj) {
        this.f19768a = hhj;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hhj hhj = this.f19768a;
        acyz acyz = (acyz) obj;
        int i = acyz.f61100a;
        if (i == -1) {
            Bundle extras = acyz.f61101b.getExtras();
            if (extras == null) {
                return;
            }
            if (extras.containsKey("errorMessage")) {
                String string = extras.getString("errorMessage");
                hhj.f19771a.mo25416d(string, new Object[0]);
                hhj.f19773b.mo12457a(new hgk(new Status(13, string), bmvz.f131120a));
            } else if (extras.getBoolean("pickedFromAccountChips", false)) {
                String string2 = extras.getString("authAccount");
                String string3 = extras.getString("accountType");
                hgl hgl = hhj.f19773b;
                hgl.f19721e.mo2453l(new Account(string2, string3));
            }
        } else if (i == 0) {
            hhj.f19773b.mo12457a(new hgk(Status.f30111e, bmvz.f131120a));
        } else if (i == 10) {
            hhj.f19771a.mo25416d("No account was found and not allowed to add a new one", new Object[0]);
            hhj.f19773b.mo12457a(new hgk(new Status(16, "No account was found and not allowed to add a new one"), bmvz.f131120a));
        }
    }
}
