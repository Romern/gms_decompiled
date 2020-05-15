package p000;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.location.reporting.Deletion;
import java.util.ArrayList;

/* renamed from: efz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efz {

    /* renamed from: a */
    public static final String f14849a = ssv.m36267a("com.google.android.gms.contextmanager");

    /* renamed from: b */
    public final egi f14850b = new egi();

    /* renamed from: c */
    public final egg f14851c = new efx();

    /* renamed from: a */
    private final void m10340a(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("deletions");
        dof y = dwq.m9681y();
        int size = parcelableArrayListExtra.size();
        for (int i = 0; i < size; i++) {
            Deletion deletion = (Deletion) parcelableArrayListExtra.get(i);
            Account account = deletion.f79593a;
            dwq.m9681y();
            doh b = dof.m8924b(account.name);
            y.mo9335c();
            if (y.f13685a.contains(b)) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68390d();
                bnsl.mo68432a("efz", "a", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[SystemStateManager] Deleting location history data for account: %s", account);
                eel p = dwq.m9672p();
                tit tit = new tit();
                tkb tkb = new tkb();
                tkb.mo26622a(deletion.f79594b, deletion.f79595c);
                TimeFilterImpl a = tkb.mo26620a();
                for (int i2 : doi.f13691a) {
                    tit.mo26580a(i2, a);
                }
                p.mo10041b((ContextDataFilterImpl) tit.mo26578a(), dwq.m9652a(b, "SystemStateManager"));
            }
        }
    }

    /* renamed from: a */
    public final void mo10082a(efy efy, dqb dqb) {
        this.f14850b.mo10088a(efy, dqb);
    }
}
