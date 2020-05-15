package p000;

/* renamed from: boad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boad {

    /* renamed from: a */
    public final String f132445a;

    static {
        new boad("about:invalid#zGuavaz");
    }

    public boad(String str) {
        if (str != null) {
            this.f132445a = str;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof boad) {
            return this.f132445a.equals(((boad) obj).f132445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f132445a.hashCode() ^ 18288376;
    }

    public final String toString() {
        String str = this.f132445a;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("SafeUrl{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
