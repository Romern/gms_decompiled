package p000;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: ahjx */
final /* synthetic */ class ahjx implements Runnable {

    /* renamed from: a */
    private final Callable f67307a;

    /* renamed from: b */
    private final aigr f67308b;

    public ahjx(Callable callable, aigr aigr) {
        this.f67307a = callable;
        this.f67308b = aigr;
    }

    public final void run() {
        int i;
        Callable callable = this.f67307a;
        aigr aigr = this.f67308b;
        try {
            i = ((Integer) callable.call()).intValue();
        } catch (Exception e) {
            i = 13;
        }
        try {
            aigr.mo36548a(i);
        } catch (RemoteException e2) {
            ahkm.m55982a(e2, "Exception invoking IResultListener callback", new Object[0]);
        }
    }
}
