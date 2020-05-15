package p000;

import android.os.RemoteException;

/* renamed from: pxn */
final /* synthetic */ class pxn implements Runnable {

    /* renamed from: a */
    private final pyf f40574a;

    /* renamed from: b */
    private final ptt f40575b;

    public pxn(pyf pyf, ptt ptt) {
        this.f40574a = pyf;
        this.f40575b = ptt;
    }

    public final void run() {
        pyf pyf = this.f40574a;
        ptt ptt = this.f40575b;
        if (pyf.f40623e != null) {
            pyf.mo23805b();
        }
        pyf.f40623e = ptt;
        try {
            pyf.f40623e.asBinder().linkToDeath(pyf, 0);
        } catch (RemoteException e) {
            pyf.f40622d.mo23677d("client disconnected before listener was set", new Object[0]);
            pyf.mo23806b(false);
        }
    }
}
