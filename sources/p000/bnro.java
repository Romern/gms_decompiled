package p000;

import java.util.logging.Level;

/* renamed from: bnro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnro {

    /* renamed from: b */
    public final bnsx f132041b;

    protected bnro(bnsx bnsx) {
        bnuy.m110474a(bnsx, "backend");
        this.f132041b = bnsx;
    }

    /* renamed from: b */
    public final bnsi mo68387b() {
        return mo26019b(Level.SEVERE);
    }

    /* renamed from: b */
    public abstract bnsi mo26019b(Level level);

    /* renamed from: c */
    public final bnsi mo68388c() {
        return mo26019b(Level.WARNING);
    }

    /* renamed from: d */
    public final bnsi mo68390d() {
        return mo26019b(Level.INFO);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo68389c(Level level) {
        return this.f132041b.mo8545a(level);
    }
}
