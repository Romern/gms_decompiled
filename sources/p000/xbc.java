package p000;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: xbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbc {

    /* renamed from: a */
    public final xbb f51856a;

    /* renamed from: b */
    private final String f51857b;

    /* renamed from: c */
    private final byte[] f51858c;

    public xbc(String str) {
        sdo.m34977c(str);
        this.f51856a = xbb.ORIGIN;
        this.f51857b = str;
        this.f51858c = null;
    }

    /* renamed from: a */
    public final String mo29598a() {
        sdo.m34970a(this.f51856a == xbb.ORIGIN);
        return this.f51857b;
    }

    /* renamed from: b */
    public final String mo29600b() {
        boolean z;
        if (this.f51856a == xbb.ANDROID) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        String valueOf = String.valueOf(Base64.encodeToString(this.f51858c, 11));
        return valueOf.length() == 0 ? new String("android:apk-key-hash:") : "android:apk-key-hash:".concat(valueOf);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xbc) {
            xbc xbc = (xbc) obj;
            if (this.f51856a != xbc.f51856a || !bmxi.m108538a(this.f51857b, xbc.f51857b) || !Arrays.equals(this.f51858c, xbc.f51858c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51856a, this.f51857b, Integer.valueOf(Arrays.hashCode(this.f51858c))});
    }

    public final String toString() {
        xbb xbb = xbb.ORIGIN;
        int ordinal = this.f51856a.ordinal();
        if (ordinal == 0) {
            return mo29598a();
        }
        if (ordinal == 1) {
            return mo29600b();
        }
        throw new IllegalStateException("invalid type of facet");
    }

    /* renamed from: a */
    public final boolean mo29599a(xwj xwj, String str, xwg xwg) {
        boolean z;
        xbb xbb = xbb.ORIGIN;
        int ordinal = this.f51856a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (this.f51856a == xbb.ANDROID) {
                    z = true;
                } else {
                    z = false;
                }
                sdo.m34970a(z);
                String valueOf = String.valueOf(Base64.encodeToString(this.f51858c, 3));
                if (str.equals(valueOf.length() == 0 ? new String("android:apk-key-hash:") : "android:apk-key-hash:".concat(valueOf)) || str.equals(mo29600b())) {
                    xwg.mo30186a(xwj, xag.TYPE_APPID_VALIDATED_ALLOW);
                    return true;
                }
            } else {
                xwg.mo30186a(xwj, xag.TYPE_APPID_VALIDATION_FAILED);
                String valueOf2 = String.valueOf(this.f51856a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                sb.append("Illegal facet type: ");
                sb.append(valueOf2);
                throw new IllegalStateException(sb.toString());
            }
        } else if (mo29598a().startsWith(str)) {
            String substring = mo29598a().substring(str.length());
            if (substring.length() == 0 || substring.charAt(0) == '/') {
                xwg.mo30186a(xwj, xag.TYPE_APPID_VALIDATED_ALLOW);
                return true;
            }
        }
        return false;
    }

    public xbc(byte[] bArr) {
        boolean z = false;
        if (bArr != null && bArr.length == 32) {
            z = true;
        }
        sdo.m34974b(z);
        this.f51856a = xbb.ANDROID;
        this.f51857b = null;
        this.f51858c = bArr;
    }
}
