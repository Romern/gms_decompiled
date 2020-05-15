package p000;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: arnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnx implements arnt {

    /* renamed from: a */
    public static final String f87988a = new String(new byte[]{0});

    /* renamed from: b */
    private final String f87989b;

    /* renamed from: c */
    private final arnr f87990c;

    public arnx(String str, arnr arnr) {
        this.f87989b = str;
        this.f87990c = arnr;
    }

    /* renamed from: a */
    public final String mo48698a() {
        return this.f87989b;
    }

    /* renamed from: b */
    public final arnq mo48699b() {
        return this.f87990c;
    }

    /* renamed from: c */
    public final String mo48700c() {
        StringBuilder sb = new StringBuilder();
        sb.append(new String(new byte[]{1}));
        sb.append(this.f87989b);
        try {
            sb.append(new String(Base64.encode(this.f87990c.f87984a, 3), "UTF-8"));
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arnx) {
            arnx arnx = (arnx) obj;
            if (this.f87989b.equals(arnx.f87989b)) {
                return this.f87990c.equals(arnx.f87990c);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f87989b.hashCode() * 31) + this.f87990c.hashCode();
    }

    public arnx(byte[] bArr) {
        boolean z;
        int i = 1;
        while (true) {
            if (i < 19) {
                if (bArr[i] == 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                i = 19;
                z = false;
                break;
            }
        }
        try {
            this.f87989b = new String(Arrays.copyOfRange(bArr, 1, i), "UTF-8");
            this.f87990c = new arnr(Arrays.copyOfRange(bArr, z ? i + 1 : i, bArr.length));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
