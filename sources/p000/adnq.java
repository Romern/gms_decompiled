package p000;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adnq {

    /* renamed from: a */
    private final List f62231a = new ArrayList();

    /* renamed from: a */
    public final synchronized CancellationSignal mo33686a() {
        CancellationSignal cancellationSignal;
        cancellationSignal = new CancellationSignal();
        this.f62231a.add(cancellationSignal);
        return cancellationSignal;
    }

    /* renamed from: b */
    public final synchronized void mo33688b() {
        List list = this.f62231a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((CancellationSignal) list.get(i)).cancel();
        }
    }

    /* renamed from: a */
    public final void mo33687a(bqgg bqgg, Executor executor) {
        bqgg.mo741a(new adnp(this, bqgg), executor);
    }
}
