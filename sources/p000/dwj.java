package p000;

/* renamed from: dwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwj extends tjw {

    /* renamed from: a */
    public final bxda f14273a;

    public dwj(bxda bxda) {
        sdo.m34959a(bxda);
        this.f14273a = bxda;
    }

    /* renamed from: a */
    private static bxda m9629a(int i) {
        bxvd da = bxda.f163011d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxda bxda = (bxda) da.f164949b;
        bxda.f163014b = i - 1;
        bxda.f163013a |= 1;
        return (bxda) da.mo74062i();
    }

    /* renamed from: b */
    public static dwj m9631b() {
        return new dwj(m9629a(4));
    }

    /* renamed from: c */
    public static dwj m9632c() {
        return new dwj(m9629a(5));
    }

    /* renamed from: d */
    public final int mo9777d() {
        int a = bxcz.m122590a(this.f14273a.f163014b);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    /* renamed from: e */
    public final long mo9778e() {
        int d = mo9777d();
        if (d == 1) {
            return this.f14273a.f163015c;
        }
        String valueOf = String.valueOf(Integer.toString(d));
        throw new IllegalStateException(valueOf.length() == 0 ? new String("No duration for type ") : "No duration for type ".concat(valueOf));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(mo9777d()));
        if (mo9777d() == 1) {
            sb.append(" durn=");
            sb.append(mo9778e());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static dwj m9630a() {
        return new dwj(m9629a(3));
    }
}
