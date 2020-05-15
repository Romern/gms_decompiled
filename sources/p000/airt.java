package p000;

import java.nio.ByteBuffer;

/* renamed from: airt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class airt {

    /* renamed from: a */
    public final byte f69591a;

    /* renamed from: b */
    public final byte f69592b;

    /* renamed from: c */
    public final byte f69593c;

    /* renamed from: d */
    public final byte f69594d;

    /* renamed from: e */
    public final byte[] f69595e;

    /* renamed from: f */
    public final byte[] f69596f;

    /* renamed from: g */
    public final byte[] f69597g;

    /* renamed from: h */
    public final byte[] f69598h;

    /* renamed from: i */
    public final byte[] f69599i;

    public airt(byte b, byte b2, byte b3, byte b4, byte[] bArr, int i) {
        this.f69591a = b;
        this.f69592b = b2;
        this.f69593c = b3;
        this.f69594d = b4;
        this.f69597g = bArr;
        this.f69599i = airv.m57832a(i);
        byte[] a = airv.m57832a(bArr.length);
        this.f69596f = a;
        int length = a.length;
        this.f69595e = length != 2 ? new byte[0] : new byte[1];
        this.f69598h = (length == 0 && i > 255) ? new byte[1] : new byte[0];
    }

    /* renamed from: a */
    public static airt m57824a(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7 = bArr;
        int length = bArr7.length;
        if (length < 4) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("airt", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse request %s because the byte array was too short", ails.m57438a(bArr));
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b = wrap.get();
        byte b2 = wrap.get();
        byte b3 = wrap.get();
        byte b4 = wrap.get();
        if (length == 4) {
            bArr6 = new byte[0];
            bArr5 = new byte[0];
            bArr4 = new byte[0];
            bArr3 = new byte[0];
            bArr2 = new byte[0];
        } else if (length == 5) {
            bArr6 = new byte[0];
            bArr5 = new byte[0];
            bArr4 = new byte[0];
            bArr3 = new byte[1];
            bArr2 = new byte[0];
        } else {
            byte b5 = bArr7[4];
            if (b5 == 0 && length == 7) {
                bArr6 = new byte[0];
                bArr5 = new byte[0];
                bArr4 = new byte[1];
                bArr3 = new byte[2];
                bArr2 = new byte[0];
            } else if (b5 == 0) {
                byte[] bArr8 = new byte[1];
                byte[] bArr9 = {bArr7[5], bArr7[6]};
                if (length >= airv.m57831a(bArr9) + 7) {
                    int a = airv.m57831a(bArr9);
                    bArr2 = new byte[a];
                    byte[] bArr10 = new byte[0];
                    int i = length - (a + 7);
                    byte[] bArr11 = new byte[i];
                    if (i <= 2) {
                        bArr3 = bArr11;
                        bArr6 = bArr8;
                        bArr4 = bArr10;
                        bArr5 = bArr9;
                    } else {
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl2.mo68432a("airt", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("Failed to parse request %s because the byte array was too long", ails.m57438a(bArr));
                        return null;
                    }
                } else {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl3.mo68432a("airt", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Failed to parse request %s because the byte array was too short", ails.m57438a(bArr));
                    return null;
                }
            } else {
                bArr6 = new byte[0];
                byte[] bArr12 = {b5};
                if (length >= airv.m57831a(bArr12) + 5) {
                    int a2 = airv.m57831a(bArr12);
                    byte[] bArr13 = new byte[a2];
                    byte[] bArr14 = new byte[0];
                    int i2 = length - (a2 + 5);
                    byte[] bArr15 = new byte[i2];
                    if (i2 <= 2) {
                        bArr3 = bArr15;
                        bArr5 = bArr12;
                        bArr2 = bArr13;
                        bArr4 = bArr14;
                    } else {
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                        bnsl4.mo68432a("airt", "a", 135, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("Failed to parse request %s because the byte array was too long", ails.m57438a(bArr));
                        return null;
                    }
                } else {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl5.mo68432a("airt", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68420a("Failed to parse request %s because the byte array was too short", ails.m57438a(bArr));
                    return null;
                }
            }
        }
        wrap.get(bArr6);
        wrap.get(bArr5);
        wrap.get(bArr2);
        wrap.get(bArr4);
        wrap.get(bArr3);
        return new airt(b, b2, b3, b4, bArr2, airv.m57831a(bArr3));
    }
}
