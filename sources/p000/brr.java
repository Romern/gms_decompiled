package p000;

import java.util.Arrays;

/* renamed from: brr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brr extends byv {

    /* renamed from: a */
    public static final bzc f5506a = new bzc(2);

    static {
        bzx bzx = bzx.MSD;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    public brr(bze bze, byte[] bArr, bzc bzc) {
        super(bze, bArr, bzc);
        boolean z;
        boolean z2;
        byte[] a;
        boolean z3;
        boolean z4 = false;
        if (bArr.length == 60) {
            z = true;
        } else {
            z = false;
        }
        cbb.m3881a(z, "data with length %d is expected", 60);
        if (bze.mo3622a()[0] == 63) {
            if (bze.mo3622a()[1] == 1 || bze.mo3622a()[1] == 2 || bze.mo3622a()[1] == 3 || bze.mo3622a()[1] == 4 || bze.mo3622a()[1] == 5 || bze.mo3622a()[1] == 6 || bze.mo3622a()[1] == 7 || bze.mo3622a()[1] == 8 || bze.mo3622a()[1] == 9 || bze.mo3622a()[1] == 10 || bze.mo3622a()[1] == 11 || bze.mo3622a()[1] == 12 || bze.mo3622a()[1] == 13 || bze.mo3622a()[1] == 14) {
                z2 = true;
                cbb.m3880a(z2, "DGI tag '3F0x' is expected where x = '1'-'F'");
                a = mo3467a(0, 2);
                if (a[0] == -33) {
                    z3 = a[1] == bze.mo3622a()[1];
                } else {
                    z3 = false;
                }
                cbb.m3880a(z3, "profile template tag 'DF0x' corresponding with DGI tag '3F0x' is expected");
                cbb.m3880a(mo3467a(2, 1)[0] == 57 ? true : z4, "profile template with length 57 is expected");
            } else if (bze.mo3622a()[1] == 15) {
                z2 = true;
                cbb.m3880a(z2, "DGI tag '3F0x' is expected where x = '1'-'F'");
                a = mo3467a(0, 2);
                if (a[0] == -33) {
                }
                cbb.m3880a(z3, "profile template tag 'DF0x' corresponding with DGI tag '3F0x' is expected");
                cbb.m3880a(mo3467a(2, 1)[0] == 57 ? true : z4, "profile template with length 57 is expected");
            }
        }
        z2 = false;
        cbb.m3880a(z2, "DGI tag '3F0x' is expected where x = '1'-'F'");
        a = mo3467a(0, 2);
        if (a[0] == -33) {
        }
        cbb.m3880a(z3, "profile template tag 'DF0x' corresponding with DGI tag '3F0x' is expected");
        cbb.m3880a(mo3467a(2, 1)[0] == 57 ? true : z4, "profile template with length 57 is expected");
    }

    /* renamed from: a */
    public final byte[] mo3467a(int i, int i2) {
        int i3 = i2 + i;
        if (mo3617k().length >= i3) {
            return Arrays.copyOfRange(mo3617k(), i, i3);
        }
        return null;
    }
}
