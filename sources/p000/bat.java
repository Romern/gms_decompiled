package p000;

import java.util.List;

/* renamed from: bat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bat {

    /* renamed from: a */
    public final List f2809a;

    /* renamed from: b */
    public final double f2810b;

    /* renamed from: c */
    private final char f2811c;

    /* renamed from: d */
    private final String f2812d;

    /* renamed from: e */
    private final String f2813e;

    public bat(List list, char c, double d, String str, String str2) {
        this.f2809a = list;
        this.f2811c = c;
        this.f2810b = d;
        this.f2812d = str;
        this.f2813e = str2;
    }

    /* renamed from: a */
    public static int m2604a(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public final int hashCode() {
        return m2604a(this.f2811c, this.f2813e, this.f2812d);
    }
}
