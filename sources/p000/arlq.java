package p000;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;

/* renamed from: arlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arlq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arls f87852a;

    /* renamed from: b */
    final /* synthetic */ IBinder f87853b;

    public arlq(arls arls, IBinder iBinder) {
        this.f87852a = arls;
        this.f87853b = iBinder;
    }

    public final void run() {
        arwg arwg;
        arls arls = this.f87852a;
        IBinder iBinder = this.f87853b;
        aucf aucf = arls.f87861f;
        if (aucf != null) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.setup.accounts.internal.IAccountsService");
                arwg = queryLocalInterface instanceof arwg ? (arwg) queryLocalInterface : new arwe(iBinder);
            } else {
                arwg = null;
            }
            if (arwg == null) {
                arls.f87856a.mo25416d("AccountsService is null", new Object[0]);
                aucf.mo50392b((Exception) new rjp(new Status(13)));
                return;
            }
            arls.f87860e = arwg;
            aucf.mo50393b((Object) null);
        }
    }
}
