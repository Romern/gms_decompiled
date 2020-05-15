package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: aeaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aeaa implements ServiceConnection {

    /* renamed from: a */
    private final adzu f62976a;

    public aeaa(String str) {
        this.f62976a = adzw.f62971d.mo16697a(getClass(), 12, str, "ServiceConnection");
    }

    /* renamed from: a */
    public abstract void mo6500a(ComponentName componentName);

    /* renamed from: a */
    public abstract void mo6501a(ComponentName componentName, IBinder iBinder);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        blji a = this.f62976a.mo16693a(componentName, "onServiceConnected");
        try {
            mo6501a(componentName, iBinder);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        blji a = this.f62976a.mo16693a(componentName, "onServiceDisconnected");
        try {
            mo6500a(componentName);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
