package p000;

/* renamed from: boaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boaa {

    /* renamed from: a */
    public final String f132440a;

    static {
        new boaa("");
    }

    public boaa(String str) {
        if (str != null) {
            this.f132440a = str;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof boaa) {
            return this.f132440a.equals(((boaa) obj).f132440a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f132440a.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.f132440a;
        StringBuilder sb = new StringBuilder(str.length() + 10);
        sb.append("SafeHtml{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
