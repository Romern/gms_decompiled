package p000;

/* renamed from: fcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fcj extends fdd {

    /* renamed from: a */
    public final bsxn f16270a;

    /* renamed from: b */
    public final bsxn f16271b;

    /* renamed from: c */
    public final bsxn f16272c;

    /* renamed from: d */
    public final bswk f16273d;

    /* renamed from: e */
    public final boolean f16274e;

    /* renamed from: f */
    public final boolean f16275f;

    /* renamed from: g */
    public final int f16276g;

    public fcj(int i, bsxn bsxn, bsxn bsxn2, bsxn bsxn3, bswk bswk, boolean z, boolean z2) {
        if (i != 0) {
            this.f16276g = i;
            this.f16270a = bsxn;
            this.f16271b = bsxn2;
            this.f16272c = bsxn3;
            this.f16273d = bswk;
            this.f16274e = z;
            this.f16275f = z2;
            return;
        }
        throw new NullPointerException("Null getHeaderType");
    }

    /* renamed from: a */
    public final bsxn mo10695a() {
        return this.f16270a;
    }

    /* renamed from: b */
    public final bsxn mo10696b() {
        return this.f16271b;
    }

    /* renamed from: c */
    public final bsxn mo10697c() {
        return this.f16272c;
    }

    /* renamed from: d */
    public final bswk mo10698d() {
        return this.f16273d;
    }

    /* renamed from: e */
    public final boolean mo10699e() {
        return this.f16274e;
    }

    public final boolean equals(Object obj) {
        bsxn bsxn;
        bsxn bsxn2;
        bsxn bsxn3;
        bswk bswk;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fdd)) {
            return false;
        }
        fdd fdd = (fdd) obj;
        return this.f16276g == fdd.mo10702g() && ((bsxn = this.f16270a) == null ? fdd.mo10695a() == null : bsxn.equals(fdd.mo10695a())) && ((bsxn2 = this.f16271b) == null ? fdd.mo10696b() == null : bsxn2.equals(fdd.mo10696b())) && ((bsxn3 = this.f16272c) == null ? fdd.mo10697c() == null : bsxn3.equals(fdd.mo10697c())) && ((bswk = this.f16273d) == null ? fdd.mo10698d() == null : bswk.equals(fdd.mo10698d())) && this.f16274e == fdd.mo10699e() && this.f16275f == fdd.mo10701f();
    }

    /* renamed from: f */
    public final boolean mo10701f() {
        return this.f16275f;
    }

    /* renamed from: g */
    public final int mo10702g() {
        return this.f16276g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (this.f16276g ^ 1000003) * 1000003;
        bsxn bsxn = this.f16270a;
        int i5 = 0;
        if (bsxn != null) {
            i = bsxn.f164758ag;
            if (i == 0) {
                i = bxxm.f165037a.mo74228a(bsxn).mo74216a(bsxn);
                bsxn.f164758ag = i;
            }
        } else {
            i = 0;
        }
        int i6 = (i4 ^ i) * 1000003;
        bsxn bsxn2 = this.f16271b;
        if (bsxn2 != null) {
            i2 = bsxn2.f164758ag;
            if (i2 == 0) {
                i2 = bxxm.f165037a.mo74228a(bsxn2).mo74216a(bsxn2);
                bsxn2.f164758ag = i2;
            }
        } else {
            i2 = 0;
        }
        int i7 = (i6 ^ i2) * 1000003;
        bsxn bsxn3 = this.f16272c;
        if (bsxn3 != null) {
            i3 = bsxn3.f164758ag;
            if (i3 == 0) {
                i3 = bxxm.f165037a.mo74228a(bsxn3).mo74216a(bsxn3);
                bsxn3.f164758ag = i3;
            }
        } else {
            i3 = 0;
        }
        int i8 = (i7 ^ i3) * 1000003;
        bswk bswk = this.f16273d;
        if (bswk != null && (i5 = bswk.f164758ag) == 0) {
            i5 = bxxm.f165037a.mo74228a(bswk).mo74216a(bswk);
            bswk.f164758ag = i5;
        }
        int i9 = (i8 ^ i5) * 1000003;
        int i10 = 1237;
        int i11 = (i9 ^ (!this.f16274e ? 1237 : 1231)) * 1000003;
        if (this.f16275f) {
            i10 = 1231;
        }
        return i11 ^ i10;
    }

    public final String toString() {
        int i = this.f16276g;
        String str = i != 1 ? i != 2 ? "PLACEHOLDER" : "SIMPLE" : "WELCOME";
        String valueOf = String.valueOf(this.f16270a);
        String valueOf2 = String.valueOf(this.f16271b);
        String valueOf3 = String.valueOf(this.f16272c);
        String valueOf4 = String.valueOf(this.f16273d);
        boolean z = this.f16274e;
        boolean z2 = this.f16275f;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 160 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("HeaderFrameBlueprint{getHeaderType=");
        sb.append(str);
        sb.append(", getWelcomeHeaderKey=");
        sb.append(valueOf);
        sb.append(", getOverflowMenuKey=");
        sb.append(valueOf2);
        sb.append(", getHelpItemTarget=");
        sb.append(valueOf3);
        sb.append(", getLeafScreenHeader=");
        sb.append(valueOf4);
        sb.append(", hasCloseButton=");
        sb.append(z);
        sb.append(", hasTopNav=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
