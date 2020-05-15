package p000;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: tlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tlt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContextData f46244a;

    /* renamed from: b */
    final /* synthetic */ tlu f46245b;

    public tlt(tlu tlu, ContextData contextData) {
        this.f46245b = tlu;
        this.f46244a = contextData;
    }

    public final void run() {
        tlu tlu = this.f46245b;
        ContextData contextData = this.f46244a;
        synchronized (tlu.f46249d) {
            tjc tjc = tlu.f46247b;
            if (tjc != null) {
                tjc.mo9499a(contextData);
            }
        }
    }
}
