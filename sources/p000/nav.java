package p000;

import java.util.Arrays;

/* renamed from: nav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nav extends nbc {

    /* renamed from: a */
    public final nbw f35150a;

    /* renamed from: b */
    private final byte[] f35151b;

    /* renamed from: c */
    private final byte[] f35152c;

    public nav(byte[] bArr, nbw nbw, byte[] bArr2) {
        if (bArr != null) {
            this.f35151b = bArr;
            this.f35150a = nbw;
            this.f35152c = bArr2;
            return;
        }
        throw new NullPointerException("Null encryptedBytes");
    }

    /* renamed from: a */
    public final byte[] mo20415a() {
        return this.f35151b;
    }

    /* renamed from: b */
    public final nbw mo20416b() {
        return this.f35150a;
    }

    /* renamed from: c */
    public final byte[] mo20417c() {
        return this.f35152c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nbc)) {
            return false;
        }
        nbc nbc = (nbc) obj;
        boolean z = nbc instanceof nav;
        if (Arrays.equals(this.f35151b, z ? ((nav) nbc).f35151b : nbc.mo20415a()) && this.f35150a.equals(nbc.mo20416b())) {
            if (Arrays.equals(this.f35152c, z ? ((nav) nbc).f35152c : nbc.mo20417c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f35151b) ^ 1000003) * 1000003) ^ this.f35150a.hashCode()) * 1000003) ^ Arrays.hashCode(this.f35152c);
    }
}
