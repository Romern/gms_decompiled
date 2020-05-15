package p000;

/* renamed from: fck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fck extends fdy {

    /* renamed from: a */
    public final bsxn f16277a;

    public fck(bsxn bsxn) {
        if (bsxn != null) {
            this.f16277a = bsxn;
            return;
        }
        throw new NullPointerException("Null screenKey");
    }

    /* renamed from: a */
    public final bsxn mo10705a() {
        return this.f16277a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdy) {
            return this.f16277a.equals(((fdy) obj).mo10705a());
        }
        return false;
    }

    public final int hashCode() {
        bsxn bsxn = this.f16277a;
        int i = bsxn.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bsxn).mo74216a(bsxn);
            bsxn.f164758ag = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16277a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("MessageScreenBlueprint{screenKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
