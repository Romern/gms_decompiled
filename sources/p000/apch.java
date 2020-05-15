package p000;

import android.graphics.drawable.Drawable;

/* renamed from: apch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apch extends apcl {

    /* renamed from: a */
    private final String f84125a;

    /* renamed from: b */
    private final Drawable f84126b;

    public apch(String str, Drawable drawable) {
        if (str != null) {
            this.f84125a = str;
            this.f84126b = drawable;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    /* renamed from: a */
    public final String mo47104a() {
        return this.f84125a;
    }

    /* renamed from: b */
    public final Drawable mo47105b() {
        return this.f84126b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apcl) {
            apcl apcl = (apcl) obj;
            return this.f84125a.equals(apcl.mo47104a()) && this.f84126b.equals(apcl.mo47105b());
        }
    }

    public final int hashCode() {
        return ((this.f84125a.hashCode() ^ 1000003) * 1000003) ^ this.f84126b.hashCode();
    }

    public final String toString() {
        String str = this.f84125a;
        String valueOf = String.valueOf(this.f84126b);
        StringBuilder sb = new StringBuilder(str.length() + 36 + String.valueOf(valueOf).length());
        sb.append("ContactRowData{displayName=");
        sb.append(str);
        sb.append(", photo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
