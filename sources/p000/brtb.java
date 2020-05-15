package p000;

/* renamed from: brtb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brtb extends brtc {

    /* renamed from: a */
    private final String f143311a;

    /* renamed from: b */
    private final String f143312b;

    public brtb(String str, String str2) {
        this.f143311a = str;
        this.f143312b = str2;
    }

    /* renamed from: a */
    public final String mo69850a() {
        return this.f143311a;
    }

    /* renamed from: b */
    public final String mo69851b() {
        return this.f143312b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brtc) {
            brtc brtc = (brtc) obj;
            return this.f143311a.equals(brtc.mo69850a()) && this.f143312b.equals(brtc.mo69851b());
        }
    }

    public final int hashCode() {
        return ((this.f143311a.hashCode() ^ 1000003) * 1000003) ^ this.f143312b.hashCode();
    }

    public final String toString() {
        String str = this.f143311a;
        String str2 = this.f143312b;
        StringBuilder sb = new StringBuilder(str.length() + 38 + str2.length());
        sb.append("LibraryVersion{libraryName=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
