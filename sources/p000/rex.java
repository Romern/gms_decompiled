package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rex implements ServiceConnection {

    /* renamed from: a */
    boolean f42849a = false;

    /* renamed from: b */
    private final BlockingQueue f42850b = new LinkedBlockingQueue();

    /* renamed from: a */
    public final IBinder mo24567a() {
        sdo.m34973b("BlockingServiceConnection.getService() called on main thread");
        if (!this.f42849a) {
            this.f42849a = true;
            return (IBinder) this.f42850b.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f42850b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    /* renamed from: a */
    public final IBinder mo24568a(long j, TimeUnit timeUnit) {
        sdo.m34973b("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f42849a) {
            this.f42849a = true;
            IBinder iBinder = (IBinder) this.f42850b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
}
