package p000;

import android.content.Context;

/* renamed from: ejh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejh extends ejm {

    /* renamed from: a */
    public final Context f15137a;

    /* renamed from: b */
    public final eme f15138b;

    /* renamed from: c */
    public final eme f15139c;

    /* renamed from: d */
    private final String f15140d;

    public ejh(Context context, eme eme, eme eme2, String str) {
        if (context != null) {
            this.f15137a = context;
            this.f15138b = eme;
            this.f15139c = eme2;
            if (str != null) {
                this.f15140d = str;
                return;
            }
            throw new NullPointerException("Null backendName");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: a */
    public final Context mo10203a() {
        return this.f15137a;
    }

    /* renamed from: b */
    public final eme mo10204b() {
        return this.f15138b;
    }

    /* renamed from: c */
    public final eme mo10205c() {
        return this.f15139c;
    }

    /* renamed from: d */
    public final String mo10206d() {
        return this.f15140d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejm) {
            ejm ejm = (ejm) obj;
            return this.f15137a.equals(ejm.mo10203a()) && this.f15138b.equals(ejm.mo10204b()) && this.f15139c.equals(ejm.mo10205c()) && this.f15140d.equals(ejm.mo10206d());
        }
    }

    public final int hashCode() {
        return ((((((this.f15137a.hashCode() ^ 1000003) * 1000003) ^ this.f15138b.hashCode()) * 1000003) ^ this.f15139c.hashCode()) * 1000003) ^ this.f15140d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15137a);
        String valueOf2 = String.valueOf(this.f15138b);
        String valueOf3 = String.valueOf(this.f15139c);
        String str = this.f15140d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + str.length());
        sb.append("CreationContext{applicationContext=");
        sb.append(valueOf);
        sb.append(", wallClock=");
        sb.append(valueOf2);
        sb.append(", monotonicClock=");
        sb.append(valueOf3);
        sb.append(", backendName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
