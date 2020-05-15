package p000;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: qkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qkf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ qkg f41592a;

    /* renamed from: b */
    private final qkb f41593b;

    public qkf(qkg qkg, qkb qkb) {
        this.f41592a = qkg;
        this.f41593b = qkb;
    }

    public final void run() {
        try {
            this.f41593b.mo11594a(this.f41592a);
        } catch (sju e) {
            Log.e(this.f41592a.f41597e, e.getMessage(), e);
            try {
                this.f41593b.mo11593a(e.f44595a);
            } catch (RemoteException e2) {
            }
        } catch (RemoteException e3) {
        }
        this.f41592a.f41596d.lock();
        try {
            qkg qkg = this.f41592a;
            qkg.f41595c--;
            qkg.mo24058a();
        } finally {
            this.f41592a.f41596d.unlock();
        }
    }
}
