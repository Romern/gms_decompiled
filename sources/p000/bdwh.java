package p000;

import java.util.concurrent.Executor;

/* renamed from: bdwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdwh implements bdwj {

    /* renamed from: a */
    private final bdwj f106525a;

    /* renamed from: b */
    private final bmzi f106526b;

    /* renamed from: c */
    private final Executor f106527c;

    public bdwh(bdwj bdwj, bmzi bmzi, Executor executor) {
        this.f106525a = bdwj;
        this.f106526b = bmzi;
        this.f106527c = executor;
    }

    /* renamed from: a */
    private final bqgg m91517a(bqgg bqgg) {
        return bdvv.m91499a(bqgg, this.f106526b, this.f106527c);
    }

    public final void close() {
        this.f106525a.close();
    }

    /* renamed from: a */
    public final bqgg mo58410a() {
        return m91517a(this.f106525a.mo58410a());
    }

    /* renamed from: a */
    public final bqgg mo58411a(Iterable iterable) {
        return m91517a(this.f106525a.mo58411a(iterable));
    }
}
