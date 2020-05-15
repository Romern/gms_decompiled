package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jsv extends sbm {

    /* renamed from: b */
    public static final /* synthetic */ int f23157b = 0;

    /* renamed from: a */
    public final List f23158a = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthService");
        if (queryLocalInterface instanceof jsp) {
            return (jsp) queryLocalInterface;
        }
        return new jsn(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.proximity.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.proximity.internal.IProximityAuthService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12200000;
    }

    /* renamed from: g */
    public final boolean mo12787g() {
        return false;
    }

    /* renamed from: j */
    public final void mo14032j() {
        if (mo25301p()) {
            try {
                ((jsp) mo25289B()).mo13879a();
            } catch (RemoteException e) {
                Log.e("ProximityAuthClient", "Remote exception when disconnecting", e);
            }
        }
        super.mo14032j();
    }

    public jsv(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 108, sat, rjz, rka);
        new jsu(this);
    }
}
