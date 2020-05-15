package p000;

/* renamed from: bcob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bcob extends bcuo {

    /* renamed from: a */
    public final bngx f104602a;

    public bcob(bngx bngx) {
        if (bngx != null) {
            this.f104602a = bngx;
            return;
        }
        throw new NullPointerException("Null lines");
    }

    /* renamed from: a */
    public final bngx mo57034a() {
        return this.f104602a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcuo) {
            return bnkn.m109669a(this.f104602a, ((bcuo) obj).mo57034a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f104602a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104602a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("RichText{lines=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
