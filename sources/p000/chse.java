package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: chse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chse {

    /* renamed from: b */
    private static final AtomicLong f189086b = new AtomicLong();

    /* renamed from: a */
    public final long f189087a;

    /* renamed from: c */
    private final String f189088c;

    /* renamed from: d */
    private final String f189089d;

    public chse(String str, String str2, long j) {
        bmxy.m108582a(str, "typeName");
        bmxy.m108589a(!str.isEmpty(), "empty type");
        this.f189088c = str;
        this.f189089d = str2;
        this.f189087a = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f189088c;
        long j = this.f189087a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
        sb2.append(str);
        sb2.append("<");
        sb2.append(j);
        sb2.append(">");
        sb.append(sb2.toString());
        if (this.f189089d != null) {
            sb.append(": (");
            sb.append(this.f189089d);
            sb.append(')');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static chse m149479a(Class cls, String str) {
        bmxy.m108582a(cls, "type");
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return m149480a(simpleName, str);
    }

    /* renamed from: a */
    public static chse m149480a(String str, String str2) {
        return new chse(str, str2, f189086b.incrementAndGet());
    }
}
