package p000;

/* renamed from: axzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axzf {

    /* renamed from: a */
    public final String f96814a;

    /* renamed from: b */
    public final String f96815b;

    public axzf(String str, String str2) {
        this.f96814a = str;
        this.f96815b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.f96814a.equals(((axzf) obj).f96814a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f96814a.hashCode();
    }

    public final String toString() {
        String str = this.f96814a;
        String str2 = this.f96815b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(str2).length());
        sb.append("NodeInternal{id='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }
}
