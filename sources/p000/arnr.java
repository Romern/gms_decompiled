package p000;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: arnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnr implements arnq {

    /* renamed from: a */
    public final byte[] f87984a;

    public arnr() {
        this.f87984a = new byte[84];
    }

    /* renamed from: a */
    public final bowh mo48692a() {
        return bowh.m111606a(this.f87984a[0]);
    }

    /* renamed from: b */
    public final String mo48693b() {
        byte[] bArr = new byte[5];
        int i = 2;
        int i2 = 0;
        while (i < 7) {
            byte[] bArr2 = this.f87984a;
            bArr[i - 2] = bArr2[i];
            if (bArr2[i] != 0) {
                i2++;
                i++;
            }
        }
        try {
            return new String(bArr, 0, i2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    /* renamed from: c */
    public final byte[] mo48694c() {
        byte[] bArr = this.f87984a;
        return new byte[]{bArr[7], bArr[8]};
    }

    /* renamed from: d */
    public final int mo48695d() {
        return bovl.m111584a(this.f87984a[1]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arnr) {
            return Arrays.equals(this.f87984a, ((arnr) obj).f87984a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f87984a);
    }

    public arnr(byte[] bArr) {
        this.f87984a = Base64.decode(bArr, 0);
    }
}
