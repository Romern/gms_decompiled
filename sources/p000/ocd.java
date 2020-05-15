package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ocd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ocd extends aeaa {

    /* renamed from: a */
    public final aeaa f37149a;

    /* renamed from: b */
    public final AtomicBoolean f37150b = new AtomicBoolean();

    /* renamed from: c */
    private final oci f37151c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ocd(aeaa aeaa, Context context, boolean z, boolean z2, boolean z3) {
        super("car");
        oci oci = new oci(context, z, z2, z3);
        this.f37151c = oci;
        this.f37149a = aeaa;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f37150b.set(false);
        this.f37149a.mo6500a(componentName);
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f37150b.set(false);
        this.f37149a.onBindingDied(componentName);
    }

    public final void onNullBinding(ComponentName componentName) {
        this.f37150b.set(false);
        this.f37149a.onNullBinding(componentName);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nuu.a(android.content.Context, boolean):java.lang.String
     arg types: [android.content.Context, int]
     candidates:
      nuu.a(android.os.Looper, java.lang.Runnable):void
      nuu.a(android.content.Context, int):boolean
      nuu.a(android.content.Context, boolean):java.lang.String */
    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        int i;
        if (Log.isLoggable("CAR.PROJECTION.PLATSC", 3)) {
            Log.d("CAR.PROJECTION.PLATSC", String.format("doServiceConnected(name:%s, service:%s)", componentName.toShortString(), iBinder));
        }
        oci oci = this.f37151c;
        occ occ = new occ(this, componentName, iBinder);
        bmxy.m108600b(Looper.myLooper() == Looper.getMainLooper());
        if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
            Log.d("CAR.PROJECTION.PLSCM", "doOnProjectionLifetimeStart");
        }
        oce oce = new oce(oci, occ);
        bmxy.m108600b(Looper.myLooper() == Looper.getMainLooper());
        if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
            Log.d("CAR.PROJECTION.PLSCM", "registerProjectionLifetimeCallback");
        }
        if (!oci.f37163f) {
            Intent intent = new Intent().addCategory("com.google.android.gms.car.CATEGORY_PROJECTION_LIFETIME_SERVICE").setPackage(nuu.m27790a(oci.f37158a, true));
            if (oci.f37158a.getPackageManager().resolveService(intent, 0) != null) {
                oci.f37162e.add(oce);
                bmxy.m108601b(!oci.f37163f, "Lifetime service already bound.");
                if (Log.isLoggable("CAR.PROJECTION.PLSCM", 3)) {
                    Log.d("CAR.PROJECTION.PLSCM", String.format("bindService(intent:%s)", intent));
                }
                skh a = skh.m35531a();
                Context context = oci.f37158a;
                ServiceConnection serviceConnection = oci.f37161d;
                if (oci.f37159b) {
                    int i2 = Build.VERSION.SDK_INT;
                    i = 4161;
                } else {
                    i = 65;
                }
                if (!a.mo25690a(context, intent, serviceConnection, i)) {
                    if (Log.isLoggable("CAR.PROJECTION.PLSCM", 4)) {
                        Log.i("CAR.PROJECTION.PLSCM", "Lifetime service could not be bound. Unregistering callback.");
                    }
                    oci.f37162e.remove(oce);
                } else {
                    return;
                }
            } else if (Log.isLoggable("CAR.PROJECTION.PLSCM", 4)) {
                Log.i("CAR.PROJECTION.PLSCM", "Lifetime service does not exist.");
            }
            if (Log.isLoggable("CAR.PROJECTION.PLATSC", 4)) {
                Log.i("CAR.PROJECTION.PLATSC", String.format("Lifetime-aware service not available. name:%s, service:%s", componentName.toShortString(), iBinder));
            }
            this.f37150b.set(false);
            this.f37149a.mo6501a(componentName, iBinder);
            return;
        }
        oci.f37162e.add(oce);
    }
}
