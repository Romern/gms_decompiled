package p000;

import com.google.android.gms.location.LocationRequest;

/* renamed from: bfql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfql {

    /* renamed from: a */
    public final String f114866a;

    /* renamed from: b */
    public final int f114867b;

    /* renamed from: c */
    public final String f114868c;

    public bfql(String str, int i, String str2) {
        this.f114866a = str == null ? "" : str;
        this.f114867b = i;
        this.f114868c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfql) {
            bfql bfql = (bfql) obj;
            if (!this.f114866a.equals(bfql.f114866a) || this.f114867b != bfql.f114867b || !bxbl.m122538a(this.f114868c, bfql.f114868c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f114866a.hashCode() * 31) + this.f114867b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f114866a);
        sb.append(", ");
        sb.append(LocationRequest.m66855a(this.f114867b));
        if (this.f114868c != null) {
            sb.append(", ");
            sb.append(this.f114868c);
        }
        sb.append("]");
        return sb.toString();
    }
}
