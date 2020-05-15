package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: pbb */
final /* synthetic */ class pbb implements Runnable {

    /* renamed from: a */
    private final pbd f38748a;

    /* renamed from: b */
    private final ComponentName f38749b;

    /* renamed from: c */
    private final IBinder f38750c;

    public pbb(pbd pbd, ComponentName componentName, IBinder iBinder) {
        this.f38748a = pbd;
        this.f38749b = componentName;
        this.f38750c = iBinder;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, boolean, java.lang.Object):void
     arg types: [java.lang.String, boolean, android.content.ComponentName]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    public final void run() {
        omm omm;
        boolean z;
        RemoteException e;
        pbd pbd = this.f38748a;
        ComponentName componentName = this.f38749b;
        IBinder iBinder = this.f38750c;
        pbm pbm = pbd.f38753a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.startup.IStartup");
            omm = queryLocalInterface instanceof omm ? (omm) queryLocalInterface : new omm(iBinder);
        } else {
            omm = null;
        }
        bnsn bnsn = pbm.f38775a;
        pbm.mo22871f();
        bmxy.m108588a(Objects.equals(componentName, pbm.f38787m.f38772e));
        try {
            z = omm.mo22303a(pbm.f38778d);
            try {
                bnsi d = pbm.f38775a.mo68390d();
                d.mo68432a("pbm", "a", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68434a("onStartupServiceAvailable - IStartup interest is %b for %s", z, (Object) componentName);
            } catch (RemoteException e2) {
                e = e2;
            }
        } catch (RemoteException e3) {
            e = e3;
            z = false;
            bnsi d2 = pbm.f38775a.mo68390d();
            d2.mo68437a(e);
            d2.mo68432a("pbm", "a", 459, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("onStartupServiceAvailable - RemoteException for %s", componentName);
            if (z) {
            }
            pbm.f38783i.mo22569a(componentName, z);
        }
        if (z) {
            pbl pbl = pbm.f38787m;
            pbl.f38772e = null;
            if (pbl.f38768a) {
                pbm.f38777c.unbindService(pbm.f38786l);
                pbm.f38787m.f38768a = false;
            }
        } else {
            pbm.f38787m.f38774g = omm;
        }
        pbm.f38783i.mo22569a(componentName, z);
    }
}
