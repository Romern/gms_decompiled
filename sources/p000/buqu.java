package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: buqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqu {

    /* renamed from: a */
    public final WeakReference f154739a;

    /* renamed from: b */
    public final ServiceConnection f154740b = new buqo(this);

    /* renamed from: c */
    public final busj f154741c;

    /* renamed from: d */
    public busi f154742d;

    public buqu(Context context, String str) {
        this.f154739a = new WeakReference(context);
        this.f154741c = new busj(this.f154739a, str);
    }

    /* renamed from: a */
    public final void mo73003a() {
        Log.w("AutoTestUiInjector", "tryUnregisterCallback called");
        busi busi = this.f154742d;
        if (busi != null) {
            try {
                busi.mo8530c(2, busi.mo8529bj());
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("iAutoTestService.unregister meet exception! ") : "iAutoTestService.unregister meet exception! ".concat(valueOf));
            }
        }
    }

    /* renamed from: a */
    public final void mo73004a(Object obj) {
        this.f154741c.f154814b = new WeakReference(obj);
        String valueOf = String.valueOf(obj.getClass().getSimpleName());
        Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Set target fragment to ") : "Set target fragment to ".concat(valueOf));
    }
}
