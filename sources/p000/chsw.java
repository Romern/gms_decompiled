package p000;

/* renamed from: chsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chsw extends chsm {
    static {
        chty.m149569a(new chsv());
    }

    /* renamed from: a */
    public abstract boolean mo85614a();

    /* renamed from: b */
    public abstract int mo85615b();

    /* renamed from: c */
    public abstract String mo85616c();

    /* renamed from: d */
    public chty mo85617d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("policy", mo85616c());
        a.mo66883a("priority", mo85615b());
        a.mo66886a("available", mo85614a());
        return a.toString();
    }
}
