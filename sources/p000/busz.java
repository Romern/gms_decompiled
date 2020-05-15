package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: busz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class busz implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ bqgy f154837a;

    public busz(bqgy bqgy) {
        this.f154837a = bqgy;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f154837a.mo69138b(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
