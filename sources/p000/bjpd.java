package p000;

/* renamed from: bjpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpd extends bjht {

    /* renamed from: b */
    private final int f123072b;

    public bjpd(bjhw bjhw, String str, int i, int i2) {
        super(bjhw, str, i2);
        this.f123072b = i;
    }

    /* renamed from: a */
    public final boolean mo65090a() {
        String b = bmxx.m108578b(((bjhw) this.f122747a).f122753d);
        int i = this.f123072b - 1;
        if (i == 24) {
            return bjzi.m104977f(b);
        }
        if (i == 26) {
            return bjzi.m104990s(b);
        }
        switch (i) {
            case 7:
                return bjzi.m104982k(b);
            case 8:
                return bjzi.m104988q(b);
            case 9:
                return bjzi.m104978g(b);
            case 10:
                return bjzi.m104979h(b);
            case 11:
                return bjzi.m104986o(b);
            case 12:
                return bjzi.m104981j(b);
            case 13:
                return bjzi.m104983l(b);
            case 14:
                return bjzi.m104980i(b);
            case 15:
                return bjzi.m104985n(b);
            case 16:
                return bjzi.m104987p(b);
            case 17:
                return bjzi.m104989r(b);
            case 18:
                return bjzi.m104991t(b);
            case 19:
                return bjzi.m104992u(b);
            case 20:
                return bjzi.m104993v(b);
            case 21:
                return bjzi.m104984m(b);
            default:
                String valueOf = String.valueOf(Integer.toString(i));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Checksum type ");
                sb.append(valueOf);
                sb.append(" not supported");
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
