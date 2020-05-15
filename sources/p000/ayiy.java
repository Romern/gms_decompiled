package p000;

/* renamed from: ayiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayiy {

    /* renamed from: a */
    public final ayja f97713a;

    /* renamed from: b */
    public final Integer f97714b;

    /* renamed from: c */
    private final String f97715c;

    public ayiy(Integer num, ayja ayja) {
        this.f97713a = ayja;
        this.f97714b = num;
        String str = ayja.f97726e.f96377a;
        String str2 = ayja.f97722a[num.intValue()];
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        this.f97715c = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayiy) {
            ayiy ayiy = (ayiy) obj;
            if (!ayiy.f97714b.equals(this.f97714b) || !ayiy.f97713a.equals(this.f97713a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f97714b.hashCode() ^ this.f97713a.hashCode();
    }

    public final String toString() {
        return this.f97715c;
    }
}
