package p000;

/* renamed from: fci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fci extends fcz {

    /* renamed from: a */
    public final bsxn f16269a;

    public fci(bsxn bsxn) {
        if (bsxn != null) {
            this.f16269a = bsxn;
            return;
        }
        throw new NullPointerException("Null screenKey");
    }

    /* renamed from: a */
    public final bsxn mo10691a() {
        return this.f16269a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fcz) {
            return this.f16269a.equals(((fcz) obj).mo10691a());
        }
        return false;
    }

    public final int hashCode() {
        bsxn bsxn = this.f16269a;
        int i = bsxn.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bsxn).mo74216a(bsxn);
            bsxn.f164758ag = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16269a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("CardsScreenBlueprint{screenKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
