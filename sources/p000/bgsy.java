package p000;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bgsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgsy {

    /* renamed from: a */
    public final Executor f117465a;

    /* renamed from: b */
    public final belh f117466b;

    public bgsy(Executor executor, String str) {
        befh a = befi.m94962a(rpr.m34216b());
        a.mo60660a("location");
        a.mo60663b(str.concat(".pb"));
        Uri a2 = a.mo60657a();
        bejq g = bejr.m95186g();
        g.mo60762a(a2);
        g.mo60764a(bgdv.f116182b);
        this.f117466b = adzg.f62956a.mo60765a(g.mo60761a());
        this.f117465a = executor;
    }

    /* renamed from: a */
    static final /* synthetic */ void m99874a(bqgg bqgg) {
        try {
            bqga.m112780a((Future) bqgg);
        } catch (ExecutionException e) {
        } catch (CancellationException e2) {
        }
    }
}
