package p000;

/* renamed from: vax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vax implements van {

    /* renamed from: a */
    private final long f48893a;

    /* renamed from: b */
    private final int f48894b;

    /* renamed from: c */
    private final long f48895c;

    /* renamed from: d */
    private final String f48896d;

    public vax(String str, long j, int i, long j2) {
        boolean z = true;
        sdo.m34975b(j >= 0, "Duration must not be negative");
        sdo.m34975b(i >= 0, "Threshold must not be negative");
        sdo.m34975b(j2 < 0 ? false : z, "Window size must not be negative");
        sdo.m34959a((Object) str);
        this.f48896d = str;
        this.f48893a = j;
        this.f48894b = i;
        this.f48895c = j2;
    }

    /* renamed from: a */
    public final String mo28169a() {
        return this.f48896d;
    }

    /* renamed from: a */
    public final boolean mo28170a(long j) {
        return j < this.f48893a;
    }

    /* renamed from: a */
    public boolean mo28171a(vam vam, long j) {
        long a = j - ((var) vam).f48862b.mo28183a(this.f48894b - 1);
        return a >= 0 && a <= this.f48895c;
    }
}
