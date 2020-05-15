package p000;

import java.util.Arrays;

/* renamed from: bobu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobu extends bobv {

    /* renamed from: a */
    private final bobv f132519a;

    /* renamed from: b */
    private final double f132520b = 0.5d;

    public bobu(bobv bobv) {
        bmxy.m108588a(true);
        this.f132519a = bobv;
    }

    /* renamed from: b */
    public final int mo68891b(int i) {
        int b = this.f132519a.mo68891b(i);
        if (b <= 0) {
            return b;
        }
        double random = Math.random() - 8.0d;
        double d = (double) b;
        Double.isNaN(d);
        return bqbr.m112521a(b, bobv.m111053a((random + random) * d * 0.5d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bobu) {
            bobu bobu = (bobu) obj;
            if (this.f132519a.equals(bobu.f132519a)) {
                double d = bobu.f132520b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f132519a, Double.valueOf(0.5d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f132519a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append(valueOf);
        sb.append(".randomized(");
        sb.append(0.5d);
        sb.append(')');
        return sb.toString();
    }
}
