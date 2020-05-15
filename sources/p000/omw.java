package p000;

/* renamed from: omw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class omw extends onx {

    /* renamed from: b */
    private final boolean f37968b;

    /* renamed from: c */
    private final boolean f37969c;

    /* renamed from: d */
    private final boolean f37970d;

    /* renamed from: e */
    private final boolean f37971e;

    /* renamed from: f */
    private final boolean f37972f;

    /* renamed from: g */
    private final boolean f37973g;

    /* renamed from: h */
    private final boolean f37974h;

    /* renamed from: i */
    private final boolean f37975i;

    public omw(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f37968b = z;
        this.f37969c = z2;
        this.f37970d = z3;
        this.f37971e = z4;
        this.f37972f = z5;
        this.f37973g = z6;
        this.f37974h = z7;
        this.f37975i = z8;
    }

    /* renamed from: a */
    public final boolean mo22331a() {
        return this.f37968b;
    }

    /* renamed from: b */
    public final boolean mo22332b() {
        return this.f37969c;
    }

    /* renamed from: c */
    public final boolean mo22333c() {
        return this.f37970d;
    }

    /* renamed from: d */
    public final boolean mo22334d() {
        return this.f37971e;
    }

    /* renamed from: e */
    public final boolean mo22335e() {
        return this.f37972f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof onx) {
            onx onx = (onx) obj;
            return this.f37968b == onx.mo22331a() && this.f37969c == onx.mo22332b() && this.f37970d == onx.mo22333c() && this.f37971e == onx.mo22334d() && this.f37972f == onx.mo22335e() && this.f37973g == onx.mo22337f() && this.f37974h == onx.mo22338g() && this.f37975i == onx.mo22339h();
        }
    }

    /* renamed from: f */
    public final boolean mo22337f() {
        return this.f37973g;
    }

    /* renamed from: g */
    public final boolean mo22338g() {
        return this.f37974h;
    }

    /* renamed from: h */
    public final boolean mo22339h() {
        return this.f37975i;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((!this.f37968b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.f37969c ? 1237 : 1231)) * 1000003) ^ (!this.f37970d ? 1237 : 1231)) * 1000003) ^ (!this.f37971e ? 1237 : 1231)) * 1000003) ^ (!this.f37972f ? 1237 : 1231)) * 1000003) ^ (!this.f37973g ? 1237 : 1231)) * 1000003) ^ (!this.f37974h ? 1237 : 1231)) * 1000003;
        if (this.f37975i) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f37968b;
        boolean z2 = this.f37969c;
        boolean z3 = this.f37970d;
        boolean z4 = this.f37971e;
        boolean z5 = this.f37972f;
        boolean z6 = this.f37973g;
        boolean z7 = this.f37974h;
        boolean z8 = this.f37975i;
        StringBuilder sb = new StringBuilder(172);
        sb.append("UsbState{configured=");
        sb.append(z);
        sb.append(", connected=");
        sb.append(z2);
        sb.append(", dataUnlocked=");
        sb.append(z3);
        sb.append(", functionAccessory=");
        sb.append(z4);
        sb.append(", functionAdb=");
        sb.append(z5);
        sb.append(", functionAudioSource=");
        sb.append(z6);
        sb.append(", functionMtp=");
        sb.append(z7);
        sb.append(", functionPtp=");
        sb.append(z8);
        sb.append("}");
        return sb.toString();
    }
}
