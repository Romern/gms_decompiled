package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;

/* renamed from: bfub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfub implements IBinder.DeathRecipient, sqt {

    /* renamed from: e */
    private static final String[] f115306e = new String[0];

    /* renamed from: a */
    public final DeviceOrientationRequestInternal f115307a;

    /* renamed from: b */
    public final String f115308b;

    /* renamed from: c */
    public final int f115309c;

    /* renamed from: d */
    public final aehq f115310d;

    /* renamed from: f */
    private final bfuh f115311f;

    public bfub(int i, String str, DeviceOrientationRequestInternal deviceOrientationRequestInternal, bfuh bfuh, aehq aehq) {
        this.f115309c = i;
        this.f115308b = str;
        this.f115307a = deviceOrientationRequestInternal;
        this.f115311f = bfuh;
        this.f115310d = aehq;
        try {
            aehq.asBinder().linkToDeath(this, 0);
        } catch (RemoteException e) {
            this.f115311f.mo62279a(this.f115310d);
        }
    }

    /* renamed from: a */
    public final void mo62273a() {
        this.f115311f.mo62279a(this.f115310d);
    }

    public final void binderDied() {
        mo62273a();
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f115309c;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f115308b;
    }

    /* renamed from: l */
    public final String mo9759l() {
        return null;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        return f115306e;
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return false;
    }
}
