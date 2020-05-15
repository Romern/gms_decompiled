package p000;

import java.security.KeyPair;

/* renamed from: bcpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpq extends bcps {

    /* renamed from: a */
    private final KeyPair f104664a;

    /* renamed from: a */
    public final KeyPair mo57128a() {
        return this.f104664a;
    }

    /* renamed from: c */
    public final int mo57130c() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcoy) {
            bcoy bcoy = (bcoy) obj;
            return bcoy.mo57130c() == 2 && this.f104664a.equals(bcoy.mo57128a());
        }
    }

    public final int hashCode() {
        return this.f104664a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104664a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("OneOfId{ecdsa=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpq(KeyPair keyPair) {
        this.f104664a = keyPair;
    }
}
