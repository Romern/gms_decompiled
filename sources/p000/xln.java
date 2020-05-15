package p000;

import java.util.Arrays;

/* renamed from: xln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xln {

    /* renamed from: a */
    public final byte[] f52671a;

    /* renamed from: b */
    public final byte[] f52672b;

    /* renamed from: c */
    public final byte[] f52673c;

    public xln(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z;
        boolean z2 = true;
        if (bArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int length = bArr2.length;
        if (length > 65535) {
            z2 = false;
        } else if (length <= 0) {
            z2 = false;
        }
        bmxy.m108589a(z2, "Credential ID length is not within a legitimate range");
        this.f52671a = bArr;
        this.f52672b = bArr2;
        this.f52673c = (byte[]) bmxy.m108581a(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xln) {
            xln xln = (xln) obj;
            if (!Arrays.equals(this.f52671a, xln.f52671a) || !Arrays.equals(this.f52672b, xln.f52672b) || !Arrays.equals(this.f52673c, xln.f52673c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f52671a)), Integer.valueOf(Arrays.hashCode(this.f52672b)), Integer.valueOf(Arrays.hashCode(this.f52673c))});
    }
}
