package p000;

/* renamed from: bcqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqw extends bcqz {

    /* renamed from: a */
    private final bngx f104682a;

    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.TYPEFACE_LIST;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.TYPEFACE_LIST != bcuj.mo57226b() || !bnkn.m109669a(this.f104682a, bcuj.mo57264k())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104682a.hashCode();
    }

    /* renamed from: k */
    public final bngx mo57264k() {
        return this.f104682a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104682a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("TextStyle{typefaceList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcqw(bngx bngx) {
        this.f104682a = bngx;
    }
}
