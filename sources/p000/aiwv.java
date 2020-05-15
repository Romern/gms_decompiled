package p000;

import java.util.Arrays;

/* renamed from: aiwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwv {

    /* renamed from: a */
    public final ajbx f69962a;

    public aiwv(byte[] bArr) {
        boolean z;
        if (bArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Bytes must be a namespace plus instance (16 bytes).");
        this.f69962a = new ajbx(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiwv) {
            return sdg.m34949a(this.f69962a, ((aiwv) obj).f69962a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69962a});
    }

    public final String toString() {
        String a = this.f69962a.mo38463a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 17);
        sb.append("EddystoneUid{id=");
        sb.append(a);
        sb.append('}');
        return sb.toString();
    }
}
