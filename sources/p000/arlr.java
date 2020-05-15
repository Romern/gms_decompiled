package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;
import java.lang.ref.WeakReference;

/* renamed from: arlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arlr extends scj {

    /* renamed from: a */
    private final Handler f87854a;

    /* renamed from: b */
    private final WeakReference f87855b;

    public arlr(Handler handler, arls arls) {
        this.f87854a = handler;
        this.f87855b = new WeakReference(arls);
    }

    /* renamed from: a */
    public final void mo16677a(int i, Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo16678a(int i, IBinder iBinder, Bundle bundle) {
    }

    public final IBinder asBinder() {
        return this;
    }

    /* renamed from: a */
    public final void mo16679a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        arls.f87856a.logVerbose("PostInitComplete %s - status %d", iBinder, Integer.valueOf(i));
        arls arls = (arls) this.f87855b.get();
        if (arls == null) {
            arls.f87856a.mo25416d("client is null", new Object[0]);
        } else {
            this.f87854a.post(new arlq(arls, iBinder));
        }
    }
}
