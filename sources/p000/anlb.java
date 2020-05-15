package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: anlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anlb extends ankw implements srl {

    /* renamed from: b */
    final /* synthetic */ AccountSignUpChimeraActivity f77042b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anlb(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        super(accountSignUpChimeraActivity);
        this.f77042b = accountSignUpChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21850a(Object obj) {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77042b;
        accountSignUpChimeraActivity.f82214a = (String) obj;
        accountSignUpChimeraActivity.mo46535a();
        return null;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        return !"<<default account>>".equals(this.f77042b.f82214a);
    }

    /* renamed from: d */
    public final void mo41918d() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77042b;
        anll anll = accountSignUpChimeraActivity.f82222i;
        try {
            ((antq) anll.mo25289B()).mo42275d(new anli(anll, this), accountSignUpChimeraActivity.f82220g);
        } catch (RemoteException e) {
            Log.e("AccountSignUpClient", e.getMessage(), e);
        }
    }
}
