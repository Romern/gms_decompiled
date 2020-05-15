package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: nfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nfn extends sbm {

    /* renamed from: b */
    private static final rnt f35457b = new nfm();

    /* renamed from: a */
    public final nfs f35458a = new nfs();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.beacon.internal.IBleService");
        if (queryLocalInterface instanceof nfy) {
            return (nfy) queryLocalInterface;
        }
        return new nfw(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.beacon.internal.IBleService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.beacon.internal.IBleService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    /* renamed from: j */
    public final synchronized void mo14032j() {
        int a = this.f35458a.mo20566a();
        if (a > 0) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("disconnect(): Cleaning up ");
            sb.append(a);
            sb.append(" dangling listeners.");
            Log.w("BleClientImpl", sb.toString());
            for (int i = a - 1; i >= 0; i--) {
                nfu a2 = this.f35458a.mo20567a(i);
                a2.f35466a.mo24967a();
                try {
                    mo20565k().mo20576a(f35457b, a2);
                } catch (RemoteException e) {
                    Log.e("BleClientImpl", "RemoteException cleaning up listeners on disconnect.", e);
                }
            }
        }
        super.mo14032j();
    }

    /* renamed from: k */
    public final nfy mo20565k() {
        return (nfy) mo25289B();
    }

    public nfn(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 111, sat, rjz, rka);
    }

    /* renamed from: a */
    public final synchronized rod mo20564a(rkb rkb, nej nej) {
        return this.f35458a.mo20570a(rkb, nej);
    }
}
