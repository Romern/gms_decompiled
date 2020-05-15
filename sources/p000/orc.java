package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: orc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class orc implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ ord f38268a;

    public orc(ord ord) {
        this.f38268a = ord;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        otz otz;
        if (nly.m26778a("CAR.DATA.SERVICE", 3)) {
            Log.d("CAR.DATA.SERVICE", "connected");
        }
        ord ord = this.f38268a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ICarData");
            otz = queryLocalInterface instanceof otz ? (otz) queryLocalInterface : new otx(iBinder);
        } else {
            otz = null;
        }
        ord.f38270b = otz;
        this.f38268a.f38269a.release();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (nly.m26778a("CAR.DATA.SERVICE", 3)) {
            Log.d("CAR.DATA.SERVICE", "CarDataService disconnected");
        }
        this.f38268a.f38270b = null;
    }
}
