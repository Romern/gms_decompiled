package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: enh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class enh implements ServiceConnection {

    /* renamed from: a */
    boolean f15323a = false;

    /* renamed from: b */
    private final BlockingQueue f15324b = new LinkedBlockingQueue();

    /* renamed from: a */
    public final IBinder mo10316a() {
        if (!this.f15323a) {
            this.f15323a = true;
            return (IBinder) this.f15324b.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15324b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
