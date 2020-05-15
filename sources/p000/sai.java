package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: sai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sai implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ sam f43922a;

    /* renamed from: b */
    private final int f43923b;

    public sai(sam sam, int i) {
        this.f43922a = sam;
        this.f43923b = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        scn scn;
        int i;
        int i2;
        if (iBinder == null) {
            sam sam = this.f43922a;
            synchronized (sam.f43951u) {
                i = sam.f43956z;
            }
            if (i == 3) {
                sam.f43933D = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = sam.f43950t;
            handler.sendMessage(handler.obtainMessage(i2, sam.f43935F.get(), 16));
            return;
        }
        synchronized (this.f43922a.f43952v) {
            sam sam2 = this.f43922a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null) {
                if (queryLocalInterface instanceof scn) {
                    scn = (scn) queryLocalInterface;
                    sam2.f43953w = scn;
                }
            }
            scn = new scl(iBinder);
            sam2.f43953w = scn;
        }
        this.f43922a.mo25293a(0, this.f43923b);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f43922a.f43952v) {
            this.f43922a.f43953w = null;
        }
        Handler handler = this.f43922a.f43950t;
        handler.sendMessage(handler.obtainMessage(6, this.f43923b, 1));
    }
}
