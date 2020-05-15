package p000;

import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;
import java.util.Iterator;

/* renamed from: anky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anky extends ankw {

    /* renamed from: b */
    final /* synthetic */ AccountSignUpChimeraActivity f77039b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anky(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        super(accountSignUpChimeraActivity);
        this.f77039b = accountSignUpChimeraActivity;
    }

    /* renamed from: b */
    public final boolean mo41916b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77039b;
        return accountSignUpChimeraActivity.f82218e == null || accountSignUpChimeraActivity.f82219f != null;
    }

    /* renamed from: d */
    public final void mo41918d() {
        int i;
        boolean z;
        Iterator<ApplicationInfo> it = this.f77039b.getPackageManager().getInstalledApplications(128).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            ApplicationInfo next = it.next();
            if (next.packageName.equals(this.f77039b.f82221h)) {
                i = next.uid;
                break;
            }
        }
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77039b;
        anll anll = accountSignUpChimeraActivity.f82222i;
        try {
            ((antq) anll.mo25289B()).mo42267a(new anlk(anll, this), accountSignUpChimeraActivity.f82214a, accountSignUpChimeraActivity.f82221h, i, accountSignUpChimeraActivity.f82218e);
        } catch (RemoteException e) {
            Log.e("AccountSignUpClient", e.getMessage(), e);
        }
    }
}
