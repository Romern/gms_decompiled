package p000;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: asth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class asth implements Serializable, Comparable {

    /* renamed from: k */
    public final byte[] f89685k;

    protected asth(byte[] bArr) {
        this.f89685k = bArr;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        byte[] bArr = this.f89685k;
        byte[] bArr2 = ((asth) obj).f89685k;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int a = bqcw.m112607a(bArr[i], bArr2[i]);
            if (a != 0) {
                return a;
            }
        }
        return bArr.length - bArr2.length;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass() == getClass() && Arrays.equals(this.f89685k, ((asth) obj).f89685k);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f89685k);
    }
}
