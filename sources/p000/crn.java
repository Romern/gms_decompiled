package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: crn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class crn {

    /* renamed from: a */
    protected final cro f11885a;

    protected crn(cro cro) {
        this.f11885a = cro;
    }

    /* renamed from: a */
    public final byte mo8191a() {
        return this.f11885a.f11888c;
    }

    /* renamed from: b */
    public final byte mo8192b() {
        return this.f11885a.f11889d;
    }

    /* renamed from: c */
    public final Byte mo8193c() {
        return this.f11885a.f11890e;
    }

    /* renamed from: d */
    public final Byte mo8194d() {
        return this.f11885a.f11891f;
    }

    /* renamed from: e */
    public final byte[] mo8195e() {
        return this.f11885a.mo8197a();
    }

    /* renamed from: f */
    public void mo8196f() {
        byte[] e = mo8195e();
        Byte c = mo8193c();
        css css = css.WRONG_LENGTH;
        boolean z = false;
        if (!(e == null || c == null || c.byteValue() == e.length)) {
            z = true;
        }
        css.mo8229a(z);
    }

    /* renamed from: a */
    public static crn m7413a(byte[] bArr) {
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
        cro cro = new cro(b2, b3, b4, b5, b6, bArr2, b);
        byte b7 = cro.f11886a;
        byte b8 = cro.f11887b;
        Map map = (Map) cru.f11897e.get(Byte.valueOf(b7));
        if (map == null) {
            z = true;
        } else {
            z = false;
        }
        css css = css.CLASS_NOT_SUPPORTED;
        String b9 = czm.m8019b(b7);
        css.mo8230a(z, b9.length() == 0 ? new String("unknown class ") : "unknown class ".concat(b9));
        cru cru = (cru) map.get(Byte.valueOf(b8));
        if (cru == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        css css2 = css.INSTRUCTION_CODE_NOT_SUPPORTED_OR_INVALID;
        String b10 = czm.m8019b(b8);
        css2.mo8230a(z2, b10.length() == 0 ? new String("unknown instruction ") : "unknown instruction ".concat(b10));
        return cru.f11899f.mo8198a(cro);
    }
}
