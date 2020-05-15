package p000;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: bqem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqem implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bqeu f140546a;

    /* renamed from: b */
    final /* synthetic */ Executor f140547b;

    public bqem(bqeu bqeu, Executor executor) {
        this.f140546a = bqeu;
        this.f140547b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f140546a.f140564b.mo69184b((Closeable) obj, this.f140547b);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
    }
}
