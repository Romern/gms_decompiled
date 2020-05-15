package p000;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: ref */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1590ref extends RequestFinishedInfo.Listener {

    /* renamed from: a */
    final /* synthetic */ Object f42792a;

    /* renamed from: b */
    final /* synthetic */ caik f42793b;

    /* renamed from: c */
    final /* synthetic */ bxtx f42794c;

    /* renamed from: d */
    final /* synthetic */ reg f42795d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1590ref(reg reg, Executor executor, Object obj, caik caik, bxtx bxtx) {
        super(executor);
        this.f42795d = reg;
        this.f42792a = obj;
        this.f42793b = caik;
        this.f42794c = bxtx;
    }

    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo.getFinishedReason() == 0 && requestFinishedInfo.getAnnotations().contains(this.f42792a)) {
            this.f42795d.f42797a.mo24450b(this.f42793b, requestFinishedInfo.getMetrics().getSentByteCount().longValue() - ((long) this.f42794c.mo73744a()));
        }
    }
}
