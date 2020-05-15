package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: abow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abow implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ abox f57815a;

    public abow(abox abox) {
        this.f57815a = abox;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        abpb abpb;
        abox abox = this.f57815a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
            abpb = queryLocalInterface instanceof abpb ? (abpb) queryLocalInterface : new aboz(iBinder);
        } else {
            abpb = null;
        }
        abox.f57817a = abpb;
        this.f57815a.f57818b.countDown();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
