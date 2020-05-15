package p000;

/* renamed from: bkvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkvn {

    /* renamed from: a */
    public final String f125333a;

    public bkvn(String str) {
        bkww.m106781a(str, "sessionId");
        this.f125333a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bkvn) {
            return this.f125333a.equals(((bkvn) obj).f125333a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125333a.hashCode();
    }

    public final String toString() {
        String str = this.f125333a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("SessionLeaveEvent [sessionId=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
