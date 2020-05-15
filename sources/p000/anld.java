package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: anld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anld extends ankw {

    /* renamed from: b */
    final /* synthetic */ AccountSignUpChimeraActivity f77044b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anld(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        super(accountSignUpChimeraActivity);
        this.f77044b = accountSignUpChimeraActivity;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        return !this.f77044b.f82216c;
    }

    /* renamed from: d */
    public final void mo41918d() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77044b;
        anll anll = accountSignUpChimeraActivity.f82222i;
        try {
            ((antq) anll.mo25289B()).mo42269a(accountSignUpChimeraActivity.f82214a, accountSignUpChimeraActivity.f82220g);
        } catch (RemoteException e) {
            Log.e("AccountSignUpClient", e.getMessage(), e);
        }
        this.f77044b.f82216c = false;
        new adzt().post(new anlc(this));
    }
}
