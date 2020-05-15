package p000;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.location.reporting.Deletion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: efw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f14848a;

    public efw(Intent intent) {
        this.f14848a = intent;
    }

    public final void run() {
        efz A = dwq.m9644A();
        Intent intent = this.f14848a;
        String action = intent.getAction();
        new Object[1][0] = action;
        if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
            if ("com.google.android.gms.location.reporting.DELETE_OPERATION".equals(action)) {
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
            } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.COMMITTED".equals(action) || efz.f14849a.equals(action)) {
                String action2 = intent.getAction();
                if ((!"com.google.android.gms.phenotype.COMMITTED".equals(action2) && !efz.f14849a.equals(action2)) || intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME").equals("com.google.android.gms.contextmanager")) {
                    A.f14850b.mo10086a(A.f14851c);
                }
            }
        } else if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List<Account> b2 = gre.m13768b(intent);
            if (dss.m9250a(2)) {
                new Object[1][0] = Integer.valueOf(dwq.m9681y().mo9331a().size());
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    Object[] objArr = {(Account) it.next()};
                }
            }
            dwq.m9681y();
            for (Account account2 : b2) {
                new dry(dof.m8924b(account2.name)).mo9516a(dqy.m9123a("SystemStateManager_delete_account"));
            }
        }
    }
}
