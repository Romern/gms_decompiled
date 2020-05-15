package p000;

import java.nio.ByteBuffer;

/* renamed from: rfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rfa {

    /* renamed from: a */
    protected final rgb f42856a;

    protected rfa(rgb rgb) {
        this.f42856a = rgb;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: short} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean mo24571a(byte[] bArr) {
        boolean z;
        rgb rgb = this.f42856a;
        if (bArr.length == 32) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        long j = wrap.getLong(0);
        int i = rgb.f42902a[rgb.mo24612a(j)];
        while (true) {
            long[] jArr = rgb.f42903b;
            if (i >= jArr.length) {
                break;
            }
            long j2 = jArr[i];
            if (j2 > j) {
                break;
            } else if (j2 == j && jArr[i + 1] == wrap.getLong(8) && rgb.f42903b[i + 2] == wrap.getLong(16) && rgb.f42903b[i + 3] == wrap.getLong(24)) {
                return true;
            } else {
                i += 4;
            }
        }
        return false;
    }

    public rfa(rgb rgb, byte[] bArr) {
        this(rgb);
    }
}
