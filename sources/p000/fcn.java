package p000;

/* renamed from: fcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fcn extends ffa {

    /* renamed from: a */
    public final bsxn f16282a;

    public fcn(bsxn bsxn) {
        if (bsxn != null) {
            this.f16282a = bsxn;
            return;
        }
        throw new NullPointerException("Null screenKey");
    }

    /* renamed from: a */
    public final bsxn mo10719a() {
        return this.f16282a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffa) {
            return this.f16282a.equals(((ffa) obj).mo10719a());
        }
        return false;
    }

    public final int hashCode() {
        bsxn bsxn = this.f16282a;
        int i = bsxn.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bsxn).mo74216a(bsxn);
            bsxn.f164758ag = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16282a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("SearchScreenBlueprint{screenKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
