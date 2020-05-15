package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* renamed from: cisu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisu {

    /* renamed from: a */
    final cith f191350a;

    /* renamed from: b */
    final Executor f191351b;

    /* renamed from: c */
    final Executor f191352c;

    /* renamed from: d */
    final /* synthetic */ cisx f191353d;

    public cisu(cisx cisx, UrlRequest.Callback callback, Executor executor) {
        this.f191353d = cisx;
        this.f191350a = new cith(callback);
        if (!cisx.f191366h) {
            this.f191351b = new cita(executor);
            this.f191352c = executor;
            return;
        }
        this.f191351b = executor;
        this.f191352c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86469a() {
        mo86470a(new cisp(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86470a(cisy cisy) {
        try {
            this.f191351b.execute(new cism(this.f191353d, cisy));
        } catch (RejectedExecutionException e) {
            this.f191353d.mo86479a((CronetException) new cirj("Exception posting task to executor", e));
        }
    }
}
