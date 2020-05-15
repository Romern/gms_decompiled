package p000;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: rmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmj implements sag {

    /* renamed from: a */
    public final boolean f43281a;

    /* renamed from: b */
    private final WeakReference f43282b;

    /* renamed from: c */
    private final rjo f43283c;

    public rmj(rms rms, rjo rjo, boolean z) {
        this.f43282b = new WeakReference(rms);
        this.f43283c = rjo;
        this.f43281a = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo24901a(ConnectionResult connectionResult) {
        boolean z;
        Lock lock;
        rms rms = (rms) this.f43282b.get();
        if (rms != null) {
            if (Looper.myLooper() == rms.f43296a.f43358l.f43324d) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            rms.f43297b.lock();
            try {
                if (rms.mo24908b(0)) {
                    if (!connectionResult.mo17671b()) {
                        rms.mo24907b(connectionResult, this.f43283c, this.f43281a);
                    }
                    if (rms.mo24909d()) {
                        rms.mo24910e();
                    }
                    lock = rms.f43297b;
                } else {
                    lock = rms.f43297b;
                }
                lock.unlock();
            } catch (Throwable th) {
                rms.f43297b.unlock();
                throw th;
            }
        }
    }
}
