package p000;

/* renamed from: bcwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcwm extends bcwp {

    /* renamed from: a */
    private final String f105068a;

    /* renamed from: b */
    private final int f105069b;

    public bcwm(String str, int i) {
        this.f105068a = str;
        this.f105069b = i;
    }

    /* renamed from: a */
    public final String mo57617a() {
        return this.f105068a;
    }

    /* renamed from: b */
    public final int mo57618b() {
        return this.f105069b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcwp) {
            bcwp bcwp = (bcwp) obj;
            return this.f105068a.equals(bcwp.mo57617a()) && this.f105069b == bcwp.mo57618b();
        }
    }

    public final int hashCode() {
        return ((this.f105068a.hashCode() ^ 1000003) * 1000003) ^ this.f105069b;
    }

    public final String toString() {
        String str = this.f105068a;
        int i = this.f105069b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append("LighterMediaId{resourceId=");
        sb.append(str);
        sb.append(", resourceRegion=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
