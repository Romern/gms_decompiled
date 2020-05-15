package p000;

import android.os.RemoteException;

/* renamed from: mep */
final /* synthetic */ class mep implements Runnable {

    /* renamed from: a */
    private final mqf f33529a;

    public mep(mqf mqf) {
        this.f33529a = mqf;
    }

    public final void run() {
        mqf mqf = this.f33529a;
        int i = meq.f33530a;
        try {
            mqf.mo20226a();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
