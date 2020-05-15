package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: ord */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ord {

    /* renamed from: a */
    public final Semaphore f38269a;

    /* renamed from: b */
    public volatile otz f38270b;

    /* renamed from: c */
    private final Context f38271c;

    /* renamed from: d */
    private boolean f38272d;

    /* renamed from: e */
    private final ServiceConnection f38273e = new orc(this);

    public ord(Context context) {
        this.f38271c = context;
        this.f38269a = new Semaphore(0);
        this.f38272d = false;
    }

    /* renamed from: a */
    public final synchronized void mo22533a() {
        if (nly.m26778a("CAR.DATA.SERVICE", 3)) {
            Log.d("CAR.DATA.SERVICE", "connect");
        }
        boolean a = skh.m35531a().mo25690a(this.f38271c, new Intent("com.google.android.gms.carsetup.CAR_DATA").setPackage("com.google.android.gms"), this.f38273e, 1);
        this.f38272d = a;
        if (a) {
            try {
                if (this.f38269a.tryAcquire(5000, TimeUnit.MILLISECONDS)) {
                }
            } catch (InterruptedException e) {
            }
            skh.m35531a().mo25689a(this.f38271c, this.f38273e);
            this.f38272d = false;
            throw new RemoteException("Failed to connect");
        }
        throw new RemoteException("Failed to bind to service");
    }

    /* renamed from: b */
    public final synchronized void mo22534b() {
        if (nly.m26778a("CAR.DATA.SERVICE", 3)) {
            Log.d("CAR.DATA.SERVICE", "disconnect");
        }
        if (this.f38272d) {
            skh.m35531a().mo25689a(this.f38271c, this.f38273e);
            this.f38272d = false;
        }
    }
}
