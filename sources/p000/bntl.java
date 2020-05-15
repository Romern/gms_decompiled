package p000;

import java.util.logging.Level;

/* renamed from: bntl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bntl implements bnsw {

    /* renamed from: a */
    private final String f132134a;

    /* renamed from: b */
    private final bnsw f132135b;

    public bntl(RuntimeException runtimeException, bnsw bnsw) {
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append("\n  original message: ");
        if (bnsw.mo68442g() == null) {
            sb.append(bnsw.mo68444i());
        } else {
            sb.append(bnsw.mo68442g().f132133b);
            sb.append("\n  original arguments:");
            Object[] h = bnsw.mo68443h();
            for (Object obj : h) {
                sb.append("\n    ");
                sb.append(bnti.m110384a(obj));
            }
        }
        bnta k = bnsw.mo68446k();
        if (k.mo68393a() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < k.mo68393a(); i++) {
                sb.append("\n    ");
                sb.append(k.mo68395a(i));
                sb.append(": ");
                sb.append(k.mo68396b(i));
            }
        }
        sb.append("\n  level: ");
        sb.append(bnsw.mo68438c());
        sb.append("\n  timestamp (nanos): ");
        sb.append(bnsw.mo68439d());
        sb.append("\n  class: ");
        sb.append(bnsw.mo68441f().mo68449a());
        sb.append("\n  method: ");
        sb.append(bnsw.mo68441f().mo68450b());
        sb.append("\n  line number: ");
        sb.append(bnsw.mo68441f().mo68451c());
        this.f132134a = sb.toString();
        this.f132135b = bnsw;
    }

    /* renamed from: c */
    public final Level mo68438c() {
        return this.f132135b.mo68438c().intValue() > Level.WARNING.intValue() ? this.f132135b.mo68438c() : Level.WARNING;
    }

    /* renamed from: d */
    public final long mo68439d() {
        return this.f132135b.mo68439d();
    }

    /* renamed from: e */
    public final String mo68440e() {
        return this.f132135b.mo68440e();
    }

    /* renamed from: f */
    public final bnsc mo68441f() {
        return this.f132135b.mo68441f();
    }

    /* renamed from: g */
    public final bntk mo68442g() {
        return null;
    }

    /* renamed from: h */
    public final Object[] mo68443h() {
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public final Object mo68444i() {
        return this.f132134a;
    }

    /* renamed from: j */
    public final boolean mo68445j() {
        return false;
    }

    /* renamed from: k */
    public final bnta mo68446k() {
        return bnsz.f132117a;
    }
}
