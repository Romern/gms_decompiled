package p000;

/* renamed from: kco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kco extends kcz {

    /* renamed from: a */
    public final String f23825a;

    /* renamed from: b */
    public final int f23826b;

    /* renamed from: c */
    public final CharSequence f23827c;

    public kco(String str, int i, CharSequence charSequence) {
        this.f23825a = str;
        this.f23826b = i;
        if (charSequence != null) {
            this.f23827c = charSequence;
            return;
        }
        throw new NullPointerException("Null contentDescription");
    }

    /* renamed from: a */
    public final String mo14379a() {
        return this.f23825a;
    }

    /* renamed from: b */
    public final int mo14380b() {
        return this.f23826b;
    }

    /* renamed from: c */
    public final CharSequence mo14381c() {
        return this.f23827c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kcz) {
            kcz kcz = (kcz) obj;
            return this.f23825a.equals(kcz.mo14379a()) && this.f23826b == kcz.mo14380b() && this.f23827c.equals(kcz.mo14381c());
        }
    }

    public final int hashCode() {
        return ((((this.f23825a.hashCode() ^ 1000003) * 1000003) ^ this.f23826b) * 1000003) ^ this.f23827c.hashCode();
    }

    public final String toString() {
        String str = this.f23825a;
        int i = this.f23826b;
        String valueOf = String.valueOf(this.f23827c);
        StringBuilder sb = new StringBuilder(str.length() + 57 + String.valueOf(valueOf).length());
        sb.append("Icon{resPackage=");
        sb.append(str);
        sb.append(", resId=");
        sb.append(i);
        sb.append(", contentDescription=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
