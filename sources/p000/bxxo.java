package p000;

/* renamed from: bxxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxo implements bxwz {

    /* renamed from: a */
    public final bxxc f165043a;

    /* renamed from: b */
    public final String f165044b;

    /* renamed from: c */
    public final Object[] f165045c;

    /* renamed from: d */
    private final int f165046d;

    public bxxo(bxxc bxxc, String str, Object[] objArr) {
        char charAt;
        this.f165043a = bxxc;
        this.f165044b = str;
        this.f165045c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c | (charAt << i);
        }
        this.f165046d = charAt2;
    }

    /* renamed from: a */
    public final boolean mo74213a() {
        return (this.f165046d & 2) == 2;
    }

    /* renamed from: b */
    public final bxxc mo74214b() {
        return this.f165043a;
    }

    /* renamed from: c */
    public final int mo74215c() {
        return (this.f165046d & 1) != 1 ? 2 : 1;
    }
}
