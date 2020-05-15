package p000;

import java.util.Arrays;

/* renamed from: bnqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnqk implements bnqi {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnqi) {
            bnqi bnqi = (bnqi) obj;
            return bmxi.m108538a(mo68323a(), bnqi.mo68323a()) && bmxi.m108538a(mo68324b(), bnqi.mo68324b()) && bmxi.m108538a(mo68325c(), bnqi.mo68325c());
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo68323a(), mo68324b(), mo68325c()});
    }

    public final String toString() {
        String valueOf = String.valueOf(mo68323a());
        String valueOf2 = String.valueOf(mo68324b());
        String valueOf3 = String.valueOf(mo68325c());
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(",");
        sb.append(valueOf2);
        sb.append(")=");
        sb.append(valueOf3);
        return sb.toString();
    }
}
