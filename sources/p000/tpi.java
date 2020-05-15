package p000;

import android.graphics.drawable.Drawable;

/* renamed from: tpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tpi extends tpe {

    /* renamed from: a */
    private final String f46442a;

    /* renamed from: b */
    private final String f46443b;

    /* renamed from: c */
    private final Drawable f46444c;

    public tpi(String str, String str2, Drawable drawable) {
        if (str != null) {
            this.f46442a = str;
            if (str2 != null) {
                this.f46443b = str2;
                this.f46444c = drawable;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo26701a() {
        return this.f46442a;
    }

    /* renamed from: b */
    public final String mo26702b() {
        return this.f46443b;
    }

    /* renamed from: c */
    public final Drawable mo26703c() {
        return this.f46444c;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tpe) {
            tpe tpe = (tpe) obj;
            return this.f46442a.equals(tpe.mo26701a()) && this.f46443b.equals(tpe.mo26702b()) && ((drawable = this.f46444c) == null ? tpe.mo26703c() == null : drawable.equals(tpe.mo26703c()));
        }
    }

    public final int hashCode() {
        int hashCode = (((this.f46442a.hashCode() ^ 1000003) * 1000003) ^ this.f46443b.hashCode()) * 1000003;
        Drawable drawable = this.f46444c;
        return hashCode ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f46442a;
        String str2 = this.f46443b;
        String valueOf = String.valueOf(this.f46444c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 35 + str2.length() + String.valueOf(valueOf).length());
        sb.append("AppInfo{packageName=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
