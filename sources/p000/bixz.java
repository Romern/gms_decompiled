package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: bixz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bixz implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ biyc f122247a;

    public bixz(biyc biyc) {
        this.f122247a = biyc;
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f122247a.mo64860a(new biya(7));
    }

    public final void onNullBinding(ComponentName componentName) {
        this.f122247a.mo64860a(new biya(6));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        bixk bixk;
        if (iBinder == null) {
            Log.w("SucServiceProvider", "Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        biyc biyc = this.f122247a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            bixk = queryLocalInterface instanceof bixk ? (bixk) queryLocalInterface : new bixk(iBinder);
        } else {
            bixk = null;
        }
        biyc.mo64860a(new biya(i, bixk));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f122247a.mo64860a(new biya(5));
    }
}
