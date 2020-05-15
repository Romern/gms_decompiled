package p000;

/* renamed from: cjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjg {

    /* renamed from: a */
    public final String f6935a;

    public cjg(String str) {
        this.f6935a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjg) {
            return this.f6935a.equals(((cjg) obj).f6935a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6935a.hashCode();
    }

    public final String toString() {
        String str = this.f6935a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
