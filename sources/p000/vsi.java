package p000;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: vsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vsi {

    /* renamed from: a */
    public final Context f49899a;

    /* renamed from: b */
    public vsh f49900b;

    /* renamed from: c */
    public volatile vuq f49901c;

    /* renamed from: d */
    int f49902d = 0;

    /* renamed from: e */
    private final Handler f49903e;

    /* renamed from: f */
    private final ServiceConnection f49904f = new vsg(this, "car_setup");

    public vsi(Context context) {
        this.f49899a = context;
        this.f49903e = new adzt(Looper.getMainLooper());
    }

    /* renamed from: a */
    private final synchronized void m41152a(int i) {
        this.f49902d = i;
    }

    /* renamed from: s */
    private final synchronized void m41153s() {
        skh.m35531a().mo25689a(this.f49899a, this.f49904f);
        m41152a(0);
    }

    /* renamed from: t */
    private final void m41154t() {
        if (this.f49900b != null) {
            this.f49903e.post(new vsf(this));
        }
    }

    /* renamed from: b */
    public final void mo28782b(String str) {
        vuk.m41322a();
        vuk.m41329h(this.f49899a).mo28840c();
        try {
            this.f49901c.mo28874b(str);
            mo28783b(true);
            this.f49901c.mo28879d(true);
            this.f49901c.mo28881e(true);
            this.f49901c.mo28875b(true);
            this.f49901c.mo28883f(true);
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vuq.a(boolean, int):boolean
     arg types: [int, int]
     candidates:
      vuq.a(java.lang.String, boolean):void
      vuq.a(boolean, int):boolean */
    /* renamed from: c */
    public final void mo28786c(vuu vuu) {
        try {
            this.f49901c.mo28872a(true, vuu.ordinal());
        } catch (RemoteException e) {
            Log.i("CAR.DRIVINGMODE", "startDrivingMode RemoteException", e);
        }
    }

    /* renamed from: d */
    public final boolean mo28788d() {
        int c = mo28775a().mo28743c();
        return (c == 3 || c == 0) ? false : true;
    }

    /* renamed from: e */
    public final boolean mo28789e() {
        try {
            return mo28788d() && this.f49901c.mo28882e();
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo28790f() {
        return ccra.m131311c() && vuv.m41426a(mo28775a().mo28740a());
    }

    /* renamed from: g */
    public final boolean mo28791g() {
        try {
            return mo28790f() && this.f49901c.mo28884f();
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return false;
        }
    }

    /* renamed from: h */
    public final boolean mo28792h() {
        int c;
        if (!ccul.f179984a.mo6606a().mo76843h() || (c = mo28775a().mo28743c()) == 3 || c == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo28793i() {
        try {
            return mo28792h() && this.f49901c.mo28885g();
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return false;
        }
    }

    /* renamed from: j */
    public final synchronized int mo28794j() {
        return this.f49902d;
    }

    /* renamed from: k */
    public final synchronized void mo28795k() {
        String str;
        if (mo28794j() == 0) {
            m41152a(1);
            skh a = skh.m35531a();
            Context context = this.f49899a;
            if (!ccrj.m131353b()) {
                str = "com.google.android.gms.DRIVING_MODE";
            } else {
                str = "com.google.android.gms.DRIVING_MODE_LOCATION";
            }
            if (!a.mo25690a(context, new Intent(str).setPackage("com.google.android.gms"), this.f49904f, 1)) {
                Log.e("CAR.DRIVINGMODE", "Failed to bind to service");
                m41153s();
            }
        }
    }

    /* renamed from: l */
    public final boolean mo28796l() {
        mo28795k();
        if (mo28797m()) {
            return true;
        }
        mo28798n();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        if (mo28794j() != 2) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        return false;
     */
    /* renamed from: m */
    public final synchronized boolean mo28797m() {
        if (mo28794j() == 2) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 10000 + elapsedRealtime;
        while (mo28794j() != 2 && elapsedRealtime < j) {
            try {
                wait(j - elapsedRealtime);
                elapsedRealtime = SystemClock.elapsedRealtime();
            } catch (InterruptedException e) {
                return false;
            }
        }
    }

    /* renamed from: n */
    public final synchronized void mo28798n() {
        if (mo28794j() != 0) {
            try {
                m41153s();
            } catch (IllegalArgumentException | IllegalStateException e) {
            }
        }
    }

    /* renamed from: o */
    public final vuu mo28799o() {
        try {
            return vuu.m41424b(this.f49901c.mo28888j());
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return null;
        }
    }

    /* renamed from: p */
    public final void mo28800p() {
        try {
            this.f49901c.mo28889k();
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        }
    }

    /* renamed from: q */
    public final synchronized void mo28801q() {
        m41152a(3);
        this.f49901c = null;
        notifyAll();
    }

    /* renamed from: r */
    public final void mo28802r() {
        String str;
        if (!mo28791g()) {
            int i = Build.VERSION.SDK_INT;
            if (ceuw.m138274b()) {
                vuk.m41322a();
                sex a = sex.m35104a(this.f49899a);
                Pair a2 = vqz.m41087a(a, new ComponentName(this.f49899a.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"));
                if (a2 != null) {
                    str = (String) a2.first;
                } else {
                    str = null;
                }
                if (str != null) {
                    a.mo25452d(str);
                }
            }
            vuk.m41322a();
            vqh a3 = vuk.m41321a(this.f49899a);
            aucb b = a3.f49792b.mo24729b(a3.f49791a);
            b.mo50373a(vqd.f49787a);
            b.mo50372a(vqe.f49788a);
            return;
        }
        vuk.m41322a();
        vuk.m41321a(this.f49899a).mo28738a();
    }

    /* renamed from: a */
    public final vrs mo28775a() {
        try {
            return vrs.m41126a(this.f49901c.mo28877c());
        } catch (RemoteException e) {
            Log.i("CAR.DRIVINGMODE", "getSavedBehaviorApp RemoteException", e);
            return vrs.m41128e(this.f49899a);
        }
    }

    /* renamed from: c */
    public final boolean mo28787c() {
        try {
            return this.f49901c.mo28880d();
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo28776a(IBinder iBinder) {
        vuq vuq;
        m41152a(2);
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drivingmode.IDrivingModeManager");
            vuq = queryLocalInterface instanceof vuq ? (vuq) queryLocalInterface : new vuo(iBinder);
        } else {
            vuq = null;
        }
        this.f49901c = vuq;
        notifyAll();
        m41154t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033 A[Catch:{ RemoteException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[Catch:{ RemoteException -> 0x003d }] */
    /* renamed from: b */
    public final void mo28783b(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (z) {
            vuk.m41322a();
            List c = vuk.m41324c(this.f49899a).mo28749c();
            int size = c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                int i2 = i + 1;
                if (mo28781a(vqw.m41076a((BluetoothDevice) c.get(i)))) {
                    z2 = true;
                    break;
                }
                i = i2;
            }
            vuq vuq = this.f49901c;
            if (z) {
                z3 = false;
            } else if (!z2) {
                z3 = false;
            }
            vuq.mo28869a(z3);
        }
        z2 = false;
        try {
            vuq vuq2 = this.f49901c;
            if (z) {
            }
            vuq2.mo28869a(z3);
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        }
    }

    /* renamed from: a */
    public final void mo28777a(String str, boolean z) {
        try {
            this.f49901c.mo28868a(str, z);
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        }
    }

    /* renamed from: b */
    public final boolean mo28784b() {
        try {
            return this.f49901c.mo28870a();
        } catch (RemoteException e) {
            Log.i("CAR.DRIVINGMODE", "isInDrivingMode RemoteException", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo28778a(vsh vsh) {
        this.f49900b = vsh;
        if (vsh != null && mo28794j() == 2) {
            m41154t();
        }
    }

    /* renamed from: b */
    public final boolean mo28785b(vuu vuu) {
        try {
            return this.f49901c.mo28876b(true, vuu.ordinal());
        } catch (RemoteException e) {
            Log.i("CAR.DRIVINGMODE", "endDrivingMode RemoteException", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo28779a(vuu vuu) {
        try {
            this.f49901c.mo28867a(vuu.ordinal());
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        }
    }

    /* renamed from: a */
    public final void mo28780a(boolean z) {
        try {
            this.f49901c.mo28878c(z);
            mo28802r();
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
        }
    }

    /* renamed from: a */
    public final boolean mo28781a(String str) {
        try {
            return this.f49901c.mo28871a(str);
        } catch (RemoteException e) {
            Log.e("CAR.DRIVINGMODE", "Disconnected from DrivingModeManager.", e);
            return false;
        }
    }
}
