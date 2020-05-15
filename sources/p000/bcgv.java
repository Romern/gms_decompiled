package p000;

import java.util.Set;

/* renamed from: bcgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgv extends bcho {

    /* renamed from: a */
    private final String f104127a;

    /* renamed from: b */
    private final boolean f104128b;

    /* renamed from: c */
    private final boolean f104129c;

    /* renamed from: d */
    private final Set f104130d;

    public bcgv(String str, boolean z, boolean z2, Set set) {
        this.f104127a = str;
        this.f104128b = z;
        this.f104129c = z2;
        this.f104130d = set;
    }

    /* renamed from: a */
    public final String mo56834a() {
        return this.f104127a;
    }

    /* renamed from: b */
    public final boolean mo56835b() {
        return this.f104128b;
    }

    /* renamed from: c */
    public final boolean mo56836c() {
        return this.f104129c;
    }

    /* renamed from: d */
    public final Set mo56837d() {
        return this.f104130d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcho) {
            bcho bcho = (bcho) obj;
            return this.f104127a.equals(bcho.mo56834a()) && this.f104128b == bcho.mo56835b() && this.f104129c == bcho.mo56836c() && this.f104130d.equals(bcho.mo56837d());
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f104127a.hashCode() ^ 1000003) * 1000003;
        int i2 = 1237;
        if (!this.f104128b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (this.f104129c) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ this.f104130d.hashCode();
    }

    public final String toString() {
        String str = this.f104127a;
        boolean z = this.f104128b;
        boolean z2 = this.f104129c;
        String valueOf = String.valueOf(this.f104130d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90 + String.valueOf(valueOf).length());
        sb.append("GroupMetadata{handlerId=");
        sb.append(str);
        sb.append(", supportsBlocking=");
        sb.append(z);
        sb.append(", isBlocked=");
        sb.append(z2);
        sb.append(", importantParticipants=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
