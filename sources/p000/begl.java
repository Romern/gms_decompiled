package p000;

/* renamed from: begl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begl {

    /* renamed from: a */
    public final String f111540a;

    /* renamed from: b */
    public final String f111541b;

    public begl(String str, String str2) {
        this.f111540a = str;
        this.f111541b = str2;
    }

    public final String toString() {
        if (this.f111541b == null) {
            return begm.m95022b(this.f111540a);
        }
        String b = begm.m95022b(this.f111540a);
        String b2 = begm.m95022b(this.f111541b);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(b2).length());
        sb.append(b);
        sb.append("=");
        sb.append(b2);
        return sb.toString();
    }
}
