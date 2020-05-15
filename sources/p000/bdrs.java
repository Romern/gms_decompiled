package p000;

import java.util.concurrent.Executor;

/* renamed from: bdrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdrs implements bdry {

    /* renamed from: a */
    private final bdry f106327a;

    /* renamed from: b */
    private final bmzi f106328b;

    /* renamed from: c */
    private final Executor f106329c;

    public bdrs(bdry bdry, bmzi bmzi, Executor executor) {
        this.f106327a = bdry;
        this.f106328b = bmzi;
        this.f106329c = executor;
    }

    /* renamed from: a */
    private final bqgg m91353a(bqgg bqgg) {
        return bdvv.m91499a(bqgg, this.f106328b, this.f106329c);
    }

    public final void close() {
        this.f106327a.close();
    }

    /* renamed from: a */
    public final bqgg mo58334a() {
        return m91353a(this.f106327a.mo58334a());
    }

    /* renamed from: a */
    public final bqgg mo58335a(long j) {
        return m91353a(this.f106327a.mo58335a(j));
    }

    /* renamed from: a */
    public final bqgg mo58336a(bdrx bdrx, bdru bdru, Executor executor) {
        return m91353a(this.f106327a.mo58336a(bdrx, bdru, executor));
    }

    /* renamed from: a */
    public final bqgg mo58337a(ByteString bxtx) {
        return m91353a(this.f106327a.mo58337a(bxtx));
    }
}
