package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: pce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pce {

    /* renamed from: a */
    public static final int[] f38811a = {2, 1};

    /* renamed from: b */
    public final Context f38812b;

    /* renamed from: c */
    public final Handler f38813c;

    /* renamed from: d */
    public final Handler f38814d;

    /* renamed from: e */
    public List f38815e;

    /* renamed from: f */
    public BluetoothProfile.ServiceListener f38816f;

    /* renamed from: g */
    BluetoothHeadset f38817g;

    /* renamed from: h */
    final Queue f38818h = new ConcurrentLinkedQueue();

    /* renamed from: i */
    public final pdy f38819i;

    /* renamed from: j */
    public final osy f38820j;

    static {
        odk.m28481a("CAR.WIFI.BT");
    }

    public pce(Context context, Handler handler, Handler handler2, pdy pdy, osy osy) {
        this.f38812b = context;
        this.f38813c = handler;
        this.f38814d = handler2;
        this.f38819i = pdy;
        this.f38820j = osy;
    }

    /* renamed from: a */
    public final void mo22900a(BluetoothDevice bluetoothDevice) {
        this.f38814d.post(new pbz(this, bluetoothDevice));
    }

    /* renamed from: a */
    public final void mo22901a(Queue queue) {
        while (true) {
            Runnable runnable = (Runnable) queue.poll();
            if (runnable != null) {
                this.f38814d.post(runnable);
            } else {
                return;
            }
        }
    }
}
