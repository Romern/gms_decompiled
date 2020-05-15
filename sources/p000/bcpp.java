package p000;

import android.util.Pair;

/* renamed from: bcpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcpp extends bcps {

    /* renamed from: a */
    private final Pair f104663a;

    /* renamed from: b */
    public final Pair mo57129b() {
        return this.f104663a;
    }

    /* renamed from: c */
    public final int mo57130c() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcoy) {
            bcoy bcoy = (bcoy) obj;
            return bcoy.mo57130c() == 3 && this.f104663a.equals(bcoy.mo57129b());
        }
    }

    public final int hashCode() {
        return this.f104663a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104663a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("OneOfId{curve25519=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpp(Pair pair) {
        this.f104663a = pair;
    }
}
