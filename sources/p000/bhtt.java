package p000;

import java.util.Arrays;

/* renamed from: bhtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhtt {

    /* renamed from: a */
    public final int f119571a;

    /* renamed from: b */
    public final byte[] f119572b;

    public bhtt(int i, byte[] bArr) {
        this.f119571a = i;
        this.f119572b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bhtt)) {
            return false;
        }
        bhtt bhtt = (bhtt) obj;
        return bhtt.f119571a == this.f119571a && Arrays.equals(bhtt.f119572b, this.f119572b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f119571a), Integer.valueOf(Arrays.hashCode(this.f119572b))});
    }

    public final String toString() {
        int i = this.f119571a;
        byte[] bArr = this.f119572b;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", Integer.valueOf(bArr[i2] & 255)));
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 34);
        sb3.append("BeaconId{type=");
        sb3.append(i);
        sb3.append(", bytes=");
        sb3.append(sb2);
        sb3.append("}");
        return sb3.toString();
    }
}
