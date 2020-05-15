package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: cuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cuf {

    /* renamed from: a */
    protected final cug f12055a;

    protected cuf(cug cug) {
        this.f12055a = cug;
    }

    /* renamed from: a */
    public final byte mo8298a() {
        return this.f12055a.f12058c;
    }

    /* renamed from: b */
    public final byte mo8299b() {
        return this.f12055a.f12059d;
    }

    /* renamed from: c */
    public final Byte mo8300c() {
        return this.f12055a.f12060e;
    }

    /* renamed from: d */
    public final Byte mo8301d() {
        return this.f12055a.f12061f;
    }

    /* renamed from: e */
    public final byte[] mo8302e() {
        return this.f12055a.mo8304a();
    }

    /* renamed from: f */
    public void mo8303f() {
        byte[] e = mo8302e();
        Byte c = mo8300c();
        cuu cuu = cuu.WRONG_LENGTH;
        boolean z = false;
        if (!(e == null || c == null || c.byteValue() == e.length)) {
            z = true;
        }
        cuu.mo8315a(z);
    }

    /* renamed from: a */
    public static cuf m7596a(byte[] bArr) {
        Byte b;
        byte[] bArr2;
        boolean z;
        boolean z2;
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = bArr[2];
        byte b5 = bArr[3];
        int length = bArr.length;
        Byte b6 = null;
        if (length == 5) {
            b = Byte.valueOf(bArr[4]);
            bArr2 = null;
        } else if (length != 6) {
            int i = length - 1;
            b = Byte.valueOf(bArr[i]);
            b6 = Byte.valueOf(bArr[4]);
            bArr2 = Arrays.copyOfRange(bArr, 5, i);
        } else {
            Byte valueOf = Byte.valueOf(bArr[4]);
            bArr2 = new byte[]{bArr[5]};
            b = null;
            b6 = valueOf;
        }
        cug cug = new cug(b2, b3, b4, b5, b6, bArr2, b);
        byte b7 = cug.f12056a;
        byte b8 = cug.f12057b;
        Map map = (Map) cun.f12068f.get(Byte.valueOf(b7));
        if (map == null) {
            z = true;
        } else {
            z = false;
        }
        cuu cuu = cuu.CLASS_NOT_SUPPORTED;
        String a = cvz.m7704a(b7);
        cuu.mo8316a(z, a.length() == 0 ? new String("unknown class ") : "unknown class ".concat(a));
        cun cun = (cun) map.get(Byte.valueOf(b8));
        if (cun == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        cuu cuu2 = cuu.INSTRUCTION_CODE_NOT_SUPPORTED_OR_INVALID;
        String a2 = cvz.m7704a(b8);
        cuu2.mo8316a(z2, a2.length() == 0 ? new String("unknown instruction ") : "unknown instruction ".concat(a2));
        return cun.f12070g.mo8305a(cug);
    }
}
