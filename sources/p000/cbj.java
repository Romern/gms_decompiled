package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: cbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbj implements Serializable {

    /* renamed from: c */
    private static final char[] f6394c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public byte[] f6395a;

    /* renamed from: b */
    private int f6396b;

    public cbj() {
        this.f6395a = new byte[0];
    }

    /* renamed from: a */
    public final cbj mo3650a(cbj cbj) {
        cbj cbj2;
        int i;
        byte[] a = cbj.mo3651a();
        if (this.f6396b > cbj.f6396b) {
            cbj2 = new cbj(this.f6395a);
        } else {
            cbj2 = new cbj(a);
        }
        int i2 = 1;
        while (true) {
            int i3 = cbj2.f6396b;
            if (i2 > i3) {
                return cbj2;
            }
            int i4 = this.f6396b;
            if (i2 <= i4 && i2 <= (i = cbj.f6396b)) {
                cbj2.f6395a[i3 - i2] = (byte) (this.f6395a[i4 - i2] & a[i - i2]);
            } else {
                cbj2.f6395a[i3 - i2] = 0;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public final int mo3652b() {
        int i = 0;
        int i2 = 1;
        for (int i3 = this.f6396b - 1; i3 >= 0; i3--) {
            if (i3 >= this.f6396b - 4) {
                i += (this.f6395a[i3] & 255) * i2;
                i2 *= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass() || !Arrays.equals(this.f6395a, ((cbj) obj).f6395a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6395a) + 395;
    }

    public final String toString() {
        int i = this.f6396b;
        if (i <= 0) {
            return "";
        }
        byte[] bArr = new byte[(i + i)];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f6396b; i3++) {
            int i4 = i2 + 1;
            char[] cArr = f6394c;
            byte[] bArr2 = this.f6395a;
            bArr[i2] = (byte) cArr[(bArr2[i3] >> 4) & 15];
            i2 = i4 + 1;
            bArr[i4] = (byte) cArr[bArr2[i3] & 15];
        }
        try {
            return new String(bArr, "US-ASCII");
        } catch (Exception e) {
            return new String(bArr);
        }
    }

    public cbj(int i) {
        this.f6395a = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            byte[] bArr = this.f6395a;
            bArr[i2] = (byte) ((i >>> (((bArr.length - 1) - i2) * 8)) & 255);
        }
        this.f6396b = this.f6395a.length;
    }

    public cbj(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f6395a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        this.f6396b = length;
    }

    /* renamed from: a */
    public final byte[] mo3651a() {
        int i = this.f6396b;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f6395a, 0, bArr, 0, i);
        return bArr;
    }
}
