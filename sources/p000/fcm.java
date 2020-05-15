package p000;

/* renamed from: fcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fcm extends fet {

    /* renamed from: a */
    public final bsxn f16281a;

    public fcm(bsxn bsxn) {
        if (bsxn != null) {
            this.f16281a = bsxn;
            return;
        }
        throw new NullPointerException("Null topNavKey");
    }

    /* renamed from: a */
    public final bsxn mo10715a() {
        return this.f16281a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fet) {
            return this.f16281a.equals(((fet) obj).mo10715a());
        }
        return false;
    }

    public final int hashCode() {
        bsxn bsxn = this.f16281a;
        int i = bsxn.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bsxn).mo74216a(bsxn);
            bsxn.f164758ag = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16281a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("PagerFrameBlueprint{topNavKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
