package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bndy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bndy extends bnny implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bmxj f131502a;

    /* renamed from: b */
    final bnny f131503b;

    public bndy(bmxj bmxj, bnny bnny) {
        bmxy.m108581a(bmxj);
        this.f131502a = bmxj;
        bmxy.m108581a(bnny);
        this.f131503b = bnny;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f131503b.compare(this.f131502a.apply(obj), this.f131502a.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bndy) {
            bndy bndy = (bndy) obj;
            return this.f131502a.equals(bndy.f131502a) && this.f131503b.equals(bndy.f131503b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f131502a, this.f131503b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131503b);
        String valueOf2 = String.valueOf(this.f131502a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
