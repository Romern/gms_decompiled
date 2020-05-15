package p000;

import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;
import java.util.concurrent.Callable;

/* renamed from: ahjy */
final /* synthetic */ class ahjy implements Runnable {

    /* renamed from: a */
    private final Callable f67309a;

    /* renamed from: b */
    private final aigu f67310b;

    public ahjy(Callable callable, aigu aigu) {
        this.f67309a = callable;
        this.f67310b = aigu;
    }

    public final void run() {
        OnStartAdvertisingResultParams onStartAdvertisingResultParams;
        Callable callable = this.f67309a;
        aigu aigu = this.f67310b;
        try {
            onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) callable.call();
        } catch (Exception e) {
            aihw aihw = new aihw();
            aihw.mo37501a(13);
            onStartAdvertisingResultParams = aihw.f68903a;
        }
        try {
            aigu.mo36573a(onStartAdvertisingResultParams);
        } catch (RemoteException e2) {
            ahkm.m55982a(e2, "Exception invoking IStartAdvertisingResultListener callback", new Object[0]);
        }
    }
}
