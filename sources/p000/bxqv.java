package p000;

/* renamed from: bxqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxqv {

    /* renamed from: a */
    public final String f164430a;

    /* renamed from: b */
    public final boolean f164431b;

    public bxqv(String str, boolean z) {
        this.f164430a = str;
        this.f164431b = z;
    }

    public final String toString() {
        String str = this.f164430a;
        boolean z = this.f164431b;
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append("{");
        sb.append(str);
        sb.append(", ");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
