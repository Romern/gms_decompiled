package p000;

/* renamed from: bcvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcvu extends bcvx {

    /* renamed from: a */
    private final String f105036a;

    public bcvu(String str) {
        this.f105036a = str;
    }

    /* renamed from: a */
    public final String mo57605a() {
        return this.f105036a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcvx) {
            return this.f105036a.equals(((bcvx) obj).mo57605a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f105036a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f105036a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("MediaDownloadResult{filename=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
