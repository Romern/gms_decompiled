package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: aabz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabz implements ServiceConnection {

    /* renamed from: a */
    private final ServiceConnection f27916a;

    /* renamed from: b */
    private final sni f27917b;

    /* renamed from: c */
    private sni f27918c;

    public aabz(ServiceConnection serviceConnection, sni sni, sni sni2) {
        this.f27916a = serviceConnection;
        this.f27918c = sni;
        this.f27917b = sni2;
    }

    public final void onNullBinding(ComponentName componentName) {
        blji blji;
        sni sni = this.f27918c;
        if (sni != null) {
            blji = sni.mo25772b();
        } else {
            blji = null;
        }
        try {
            this.f27918c = null;
            this.f27916a.onNullBinding(componentName);
            if (blji != null) {
                blji.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        blji blji;
        sni sni = this.f27918c;
        if (sni != null) {
            blji = sni.mo25772b();
        } else {
            blji = null;
        }
        try {
            this.f27918c = null;
            this.f27916a.onServiceConnected(componentName, iBinder);
            if (blji != null) {
                blji.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f27918c = null;
        blji b = this.f27917b.mo25772b();
        try {
            this.f27916a.onServiceDisconnected(componentName);
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
