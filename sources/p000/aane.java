package p000;

import java.io.IOException;

/* renamed from: aane */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aane {
    /* renamed from: a */
    public static byte m21624a(bxxc bxxc) {
        if (bxxc instanceof blmw) {
            return 0;
        }
        if (bxxc instanceof blmt) {
            return 1;
        }
        if (bxxc instanceof blmn) {
            return 4;
        }
        if (bxxc instanceof blnf) {
            return 2;
        }
        if (bxxc instanceof blng) {
            return 3;
        }
        if (bxxc instanceof blna) {
            return 7;
        }
        if (bxxc instanceof blmp) {
            return 8;
        }
        if (!(bxxc instanceof blmr)) {
            return bxxc == null ? (byte) -1 : -2;
        }
        return 17;
    }

    /* renamed from: b */
    public static int m21626b(bxxc bxxc) {
        if (bxxc instanceof blng) {
            return ((blng) bxxc).f126967c;
        }
        if (bxxc instanceof blna) {
            return ((blna) bxxc).f126928e;
        }
        if (bxxc instanceof blmp) {
            return ((blmp) bxxc).f126874i;
        }
        if (bxxc instanceof blmw) {
            return ((blmw) bxxc).f126910b;
        }
        if (bxxc instanceof blmt) {
            return ((blmt) bxxc).f126900b;
        }
        return -1;
    }

    /* renamed from: a */
    public static bxxc m21625a(byte b, byte[] bArr) {
        if (b == 0) {
            return (blmw) bxvk.m124014a(blmw.f126907e, bArr);
        }
        if (b == 1) {
            return (blmt) bxvk.m124014a(blmt.f126897e, bArr);
        }
        if (b == 2) {
            return (blnf) bxvk.m124014a(blnf.f126936z, bArr);
        }
        if (b == 3) {
            return (blng) bxvk.m124014a(blng.f126963e, bArr);
        }
        if (b == 4) {
            return (blmn) bxvk.m124014a(blmn.f126862a, bArr);
        }
        if (b == 7) {
            return (blna) bxvk.m124014a(blna.f126922g, bArr);
        }
        if (b == 8) {
            return (blmp) bxvk.m124014a(blmp.f126864r, bArr);
        }
        throw new IOException("Unknown tag");
    }
}
