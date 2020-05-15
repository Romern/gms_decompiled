package p000;

/* renamed from: bcvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcvv extends bcvz {

    /* renamed from: a */
    private final bcwp f105037a;

    public bcvv(bcwp bcwp) {
        this.f105037a = bcwp;
    }

    /* renamed from: a */
    public final bcwp mo57609a() {
        return this.f105037a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcvz) {
            return this.f105037a.equals(((bcvz) obj).mo57609a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f105037a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105037a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("MediaUploadResult{mediaId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
