package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: butj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butj {

    /* renamed from: a */
    public AtomicBoolean f154849a;

    /* renamed from: b */
    public int f154850b;

    /* renamed from: c */
    private final Runnable f154851c;

    public butj(long j) {
        this(new buti(j));
    }

    /* renamed from: a */
    public final butk mo73110a() {
        if (this.f154851c == null) {
            ((bnsl) ahfp.f67119a.mo68388c()).mo68405a("AttemptRepeatedlyOptions.build() with null recoveryRunnable.");
        }
        return new butk(this.f154851c, this.f154849a, this.f154850b);
    }

    public butj(Runnable runnable) {
        this.f154850b = 3;
        this.f154851c = runnable;
    }
}
