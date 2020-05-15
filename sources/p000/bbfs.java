package p000;

/* renamed from: bbfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbfs extends bbfz {

    /* renamed from: a */
    public final bmxv f102564a;

    /* renamed from: b */
    public final int f102565b;

    /* renamed from: c */
    private final long f102566c;

    public bbfs(bmxv bmxv, int i, long j) {
        this.f102564a = bmxv;
        this.f102565b = i;
        this.f102566c = j;
    }

    /* renamed from: a */
    public final bmxv mo56111a() {
        return this.f102564a;
    }

    /* renamed from: b */
    public final long mo56112b() {
        return this.f102566c;
    }

    /* renamed from: c */
    public final int mo56113c() {
        return this.f102565b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbfz) {
            bbfz bbfz = (bbfz) obj;
            if (this.f102564a.equals(bbfz.mo56111a())) {
                int i = this.f102565b;
                int c = bbfz.mo56113c();
                if (i != 0) {
                    return i == c && this.f102566c == bbfz.mo56112b();
                }
                throw null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.f102564a.hashCode() ^ 1000003) * 1000003;
        int i = this.f102565b;
        if (i != 0) {
            long j = this.f102566c;
            return ((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102564a);
        String a = bbfy.m87974a(this.f102565b);
        long j = this.f102566c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + a.length());
        sb.append("Value{value=");
        sb.append(valueOf);
        sb.append(", state=");
        sb.append(a);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
