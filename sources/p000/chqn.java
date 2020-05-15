package p000;

/* renamed from: chqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chqn {

    /* renamed from: a */
    public final Object f189004a;

    /* renamed from: b */
    private final String f189005b;

    private chqn(String str, Object obj) {
        this.f189005b = str;
        this.f189004a = obj;
    }

    /* renamed from: a */
    public static chqn m149404a(String str) {
        bmxy.m108582a(str, "debugString");
        return new chqn(str, null);
    }

    public final String toString() {
        return this.f189005b;
    }

    /* renamed from: a */
    public static chqn m149405a(String str, Object obj) {
        bmxy.m108582a(str, "debugString");
        return new chqn(str, obj);
    }
}
