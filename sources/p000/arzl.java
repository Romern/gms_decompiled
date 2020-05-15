package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: arzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arzl extends Fragment {

    /* renamed from: a */
    public static final sek f88526a = ascp.m73787a("D2D", "UI", "QRCodeFragment");

    /* renamed from: b */
    public String f88527b;

    /* renamed from: c */
    public View.OnClickListener f88528c;

    /* renamed from: d */
    private ImageView f88529d;

    /* renamed from: e */
    private GlifLayout f88530e;

    /* renamed from: f */
    private int f88531f;

    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069f, code lost:
        if (r15[r9] == 0) goto L_0x06a1;
     */
    /* renamed from: a */
    public final void mo48968a(String str) {
        canr canr;
        canw canw;
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        canl canl;
        cano cano;
        int i9;
        int i10;
        int i11;
        int i12;
        String str2 = str;
        try {
            this.f88530e.mo71364b(false);
            int i13 = this.f88531f;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Found empty contents");
            } else if (i13 >= 0) {
                canq canq = canq.f175393a;
                int i14 = canx.f175425a;
                int i15 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (i15 < str.length()) {
                        char charAt = str2.charAt(i15);
                        if (charAt >= '0') {
                            if (charAt <= '9') {
                                z2 = true;
                                i15++;
                            }
                        }
                        if (canx.m126848a(charAt) == -1) {
                            canr = canr.BYTE;
                            break;
                        } else {
                            z = true;
                            i15++;
                        }
                    } else if (z) {
                        canr = canr.ALPHANUMERIC;
                    } else if (z2) {
                        canr = canr.NUMERIC;
                    } else {
                        canr = canr.BYTE;
                    }
                }
                canl canl2 = new canl();
                canl2.mo74684a(canr.f175410k, 4);
                canl canl3 = new canl();
                int ordinal = canr.ordinal();
                if (ordinal == 1) {
                    int length = str.length();
                    int i16 = 0;
                    while (i16 < length) {
                        int charAt2 = str2.charAt(i16) - '0';
                        int i17 = i16 + 2;
                        if (i17 < length) {
                            canl3.mo74684a((charAt2 * 100) + ((str2.charAt(i16 + 1) - '0') * 10) + (str2.charAt(i17) - '0'), 10);
                            i16 += 3;
                        } else {
                            i16++;
                            if (i16 < length) {
                                canl3.mo74684a((charAt2 * 10) + (str2.charAt(i16) - '0'), 7);
                                i16 = i17;
                            } else {
                                canl3.mo74684a(charAt2, 4);
                            }
                        }
                    }
                } else if (ordinal == 2) {
                    int length2 = str.length();
                    int i18 = 0;
                    while (i18 < length2) {
                        int a = canx.m126848a(str2.charAt(i18));
                        if (a != -1) {
                            int i19 = i18 + 1;
                            if (i19 < length2) {
                                int a2 = canx.m126848a(str2.charAt(i19));
                                if (a2 != -1) {
                                    canl3.mo74684a((a * 45) + a2, 11);
                                    i18 += 2;
                                } else {
                                    throw new cank();
                                }
                            } else {
                                canl3.mo74684a(a, 6);
                                i18 = i19;
                            }
                        } else {
                            throw new cank();
                        }
                    }
                } else if (ordinal == 4) {
                    for (byte b : str2.getBytes("ISO-8859-1")) {
                        canl3.mo74684a(b, 8);
                    }
                } else if (ordinal == 6) {
                    byte[] bytes = str2.getBytes("Shift_JIS");
                    int length3 = bytes.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        byte b2 = (bytes[i20 + 1] & 255) | ((bytes[i20] & 255) << 8);
                        if (b2 < 33088 || b2 > 40956) {
                            i12 = (b2 < 57408 || b2 > 60351) ? -1 : b2 - 49472;
                        } else {
                            i12 = b2 - 33088;
                        }
                        if (i12 != -1) {
                            canl3.mo74684a(((i12 >> 8) * AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC) + (i12 & 255), 13);
                            i20 += 2;
                        } else {
                            throw new cank("Invalid byte sequence");
                        }
                    }
                } else {
                    throw new cank("Invalid mode: " + canr);
                }
                canu a3 = canx.m126849a(canl2.f175376b + canr.mo74703a(canx.m126849a(canl2.f175376b + canr.mo74703a(canu.m126842a(1)) + canl3.f175376b, canq)) + canl3.f175376b, canq);
                canl canl4 = new canl();
                canl4.mo74685a(canl2);
                int length4 = canr != canr.BYTE ? str.length() : canl3.mo74683a();
                int a4 = canr.mo74703a(a3);
                int i21 = 1 << a4;
                if (length4 < i21) {
                    canl4.mo74684a(length4, a4);
                    canl4.mo74685a(canl3);
                    cant a5 = a3.mo74706a(canq);
                    int b3 = a3.f175418b - a5.mo74705b();
                    int i22 = b3 << 3;
                    if (canl4.f175376b <= i22) {
                        int i23 = 0;
                        while (true) {
                            if (i23 >= 4) {
                                break;
                            } else if (canl4.f175376b >= i22) {
                                break;
                            } else {
                                canl4.mo74686a(false);
                                i23++;
                            }
                        }
                        int i24 = canl4.f175376b & 7;
                        if (i24 > 0) {
                            while (i24 < 8) {
                                canl4.mo74686a(false);
                                i24++;
                            }
                        }
                        int a6 = b3 - canl4.mo74683a();
                        for (int i25 = 0; i25 < a6; i25++) {
                            if ((i25 & 1) == 0) {
                                i11 = 236;
                            } else {
                                i11 = 17;
                            }
                            canl4.mo74684a(i11, 8);
                        }
                        if (canl4.f175376b == i22) {
                            int i26 = a3.f175418b;
                            int a7 = a5.mo74704a();
                            if (canl4.mo74683a() == b3) {
                                ArrayList<canv> arrayList = new ArrayList(a7);
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 0;
                                while (i27 < a7) {
                                    try {
                                        int[] iArr2 = new int[1];
                                        int[] iArr3 = new int[1];
                                        if (i27 < a7) {
                                            int i31 = i26 % a7;
                                            int i32 = i13;
                                            int i33 = a7 - i31;
                                            int i34 = i26 / a7;
                                            int i35 = b3 / a7;
                                            int i36 = i35 + 1;
                                            canu canu = a3;
                                            int i37 = i34 - i35;
                                            canr canr2 = canr;
                                            int i38 = (i34 + 1) - i36;
                                            if (i37 == i38) {
                                                canq canq2 = canq;
                                                if (a7 != i33 + i31) {
                                                    throw new cank("RS blocks mismatch");
                                                } else if (i26 == ((i35 + i37) * i33) + ((i36 + i38) * i31)) {
                                                    if (i27 >= i33) {
                                                        c = 0;
                                                        iArr2[0] = i36;
                                                        iArr3[0] = i38;
                                                    } else {
                                                        c = 0;
                                                        iArr2[0] = i35;
                                                        iArr3[0] = i37;
                                                    }
                                                    int i39 = iArr2[c];
                                                    byte[] bArr = new byte[i39];
                                                    int i40 = i30 * 8;
                                                    int i41 = 0;
                                                    while (i41 < i39) {
                                                        int i42 = a7;
                                                        int i43 = b3;
                                                        int i44 = i26;
                                                        canl canl5 = canl4;
                                                        int[] iArr4 = iArr2;
                                                        int i45 = i27;
                                                        int i46 = i28;
                                                        int i47 = i29;
                                                        int i48 = i30;
                                                        int i49 = i39;
                                                        int i50 = 0;
                                                        int i51 = 0;
                                                        while (i50 < 8) {
                                                            canl canl6 = canl5;
                                                            if (canl6.mo74687a(i40)) {
                                                                i51 |= 1 << (7 - i50);
                                                            }
                                                            i40++;
                                                            i50++;
                                                            canl5 = canl6;
                                                        }
                                                        bArr[i41] = (byte) i51;
                                                        i41++;
                                                        i29 = i47;
                                                        i39 = i49;
                                                        i28 = i46;
                                                        a7 = i42;
                                                        i26 = i44;
                                                        canl4 = canl5;
                                                        b3 = i43;
                                                        i27 = i45;
                                                        i30 = i48;
                                                        iArr2 = iArr4;
                                                    }
                                                    int i52 = iArr3[0];
                                                    int i53 = i39 + i52;
                                                    int[] iArr5 = new int[i53];
                                                    int i54 = 0;
                                                    while (i54 < i39) {
                                                        iArr5[i54] = bArr[i54] & 255;
                                                        i54++;
                                                        a7 = a7;
                                                    }
                                                    int i55 = a7;
                                                    canp canp = new canp(cann.f175381a);
                                                    if (i52 != 0) {
                                                        int i56 = i53 - i52;
                                                        if (i56 > 0) {
                                                            int i57 = i26;
                                                            if (i52 < canp.f175392b.size()) {
                                                                i4 = i39;
                                                                i8 = b3;
                                                                canl = canl4;
                                                                iArr = iArr2;
                                                                i7 = i27;
                                                                i5 = i28;
                                                                i3 = i29;
                                                                i6 = i30;
                                                            } else {
                                                                List list = canp.f175392b;
                                                                i8 = b3;
                                                                cano cano2 = (cano) list.get(list.size() - 1);
                                                                int size = canp.f175392b.size();
                                                                while (size <= i52) {
                                                                    canl canl7 = canl4;
                                                                    int i58 = i27;
                                                                    cann cann = canp.f175391a;
                                                                    int[] iArr6 = iArr2;
                                                                    int i59 = i30;
                                                                    int i60 = i28;
                                                                    int i61 = (size - 1) + cann.f175386f;
                                                                    cann.mo74693a();
                                                                    cano cano3 = new cano(cann, new int[]{1, cann.f175382b[i61]});
                                                                    if (cano2.f175389a.equals(cano3.f175389a)) {
                                                                        if (cano2.mo74701b()) {
                                                                            i10 = i39;
                                                                            i9 = i29;
                                                                        } else if (!cano3.mo74701b()) {
                                                                            int[] iArr7 = cano2.f175390b;
                                                                            int length5 = iArr7.length;
                                                                            int[] iArr8 = cano3.f175390b;
                                                                            int length6 = iArr8.length;
                                                                            int[] iArr9 = new int[((length5 + length6) - 1)];
                                                                            i10 = i39;
                                                                            int i62 = 0;
                                                                            while (i62 < length5) {
                                                                                int i63 = length5;
                                                                                int i64 = iArr7[i62];
                                                                                int[] iArr10 = iArr7;
                                                                                int i65 = 0;
                                                                                while (i65 < length6) {
                                                                                    int i66 = i62 + i65;
                                                                                    iArr9[i66] = cann.m126830a(iArr9[i66], cano2.f175389a.mo74694b(i64, iArr8[i65]));
                                                                                    i65++;
                                                                                    i62 = i62;
                                                                                    length6 = length6;
                                                                                    i29 = i29;
                                                                                }
                                                                                i62++;
                                                                                length5 = i63;
                                                                                iArr7 = iArr10;
                                                                            }
                                                                            cano2 = new cano(cano2.f175389a, iArr9);
                                                                            i9 = i29;
                                                                            canp.f175392b.add(cano2);
                                                                            size++;
                                                                            canl4 = canl7;
                                                                            i27 = i58;
                                                                            i30 = i59;
                                                                            iArr2 = iArr6;
                                                                            i28 = i60;
                                                                            i39 = i10;
                                                                            i29 = i9;
                                                                        } else {
                                                                            i10 = i39;
                                                                            i9 = i29;
                                                                        }
                                                                        cano2 = cano2.f175389a.mo74695b();
                                                                        canp.f175392b.add(cano2);
                                                                        size++;
                                                                        canl4 = canl7;
                                                                        i27 = i58;
                                                                        i30 = i59;
                                                                        iArr2 = iArr6;
                                                                        i28 = i60;
                                                                        i39 = i10;
                                                                        i29 = i9;
                                                                    } else {
                                                                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                                    }
                                                                }
                                                                i4 = i39;
                                                                canl = canl4;
                                                                iArr = iArr2;
                                                                i7 = i27;
                                                                i5 = i28;
                                                                i3 = i29;
                                                                i6 = i30;
                                                            }
                                                            cano cano4 = (cano) canp.f175392b.get(i52);
                                                            int[] iArr11 = new int[i56];
                                                            System.arraycopy(iArr5, 0, iArr11, 0, i56);
                                                            cano a8 = new cano(canp.f175391a, iArr11).mo74699a(i52, 1);
                                                            if (!a8.f175389a.equals(cano4.f175389a)) {
                                                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                                            } else if (!cano4.mo74701b()) {
                                                                cano b4 = a8.f175389a.mo74695b();
                                                                int a9 = cano4.mo74698a(cano4.mo74697a());
                                                                cann cann2 = a8.f175389a;
                                                                cann2.mo74693a();
                                                                if (a9 != 0) {
                                                                    int i67 = cann2.f175382b[(cann2.f175385e - cann2.f175383c[a9]) - 1];
                                                                    cano cano5 = a8;
                                                                    while (cano5.mo74697a() >= cano4.mo74697a() && !cano5.mo74701b()) {
                                                                        int a10 = cano5.mo74697a() - cano4.mo74697a();
                                                                        int b5 = a8.f175389a.mo74694b(cano5.mo74698a(cano5.mo74697a()), i67);
                                                                        cano a11 = cano4.mo74699a(a10, b5);
                                                                        cann cann3 = a8.f175389a;
                                                                        cann3.mo74693a();
                                                                        if (a10 >= 0) {
                                                                            if (b5 != 0) {
                                                                                int[] iArr12 = new int[(a10 + 1)];
                                                                                iArr12[0] = b5;
                                                                                cano = new cano(cann3, iArr12);
                                                                            } else {
                                                                                cano = cann3.f175384d;
                                                                            }
                                                                            b4 = b4.mo74700a(cano);
                                                                            cano5 = cano5.mo74700a(a11);
                                                                        } else {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                    }
                                                                    cano[] canoArr = {b4, cano5};
                                                                    int[] iArr13 = cano5.f175390b;
                                                                    int length7 = i52 - iArr13.length;
                                                                    for (int i68 = 0; i68 < length7; i68++) {
                                                                        iArr5[i56 + i68] = 0;
                                                                    }
                                                                    System.arraycopy(iArr13, 0, iArr5, i56 + length7, iArr13.length);
                                                                    byte[] bArr2 = new byte[i52];
                                                                    int i69 = 0;
                                                                    while (i69 < i52) {
                                                                        bArr2[i69] = (byte) iArr5[i4 + i69];
                                                                        i69++;
                                                                        i3 = i3;
                                                                        i4 = i4;
                                                                        i5 = i5;
                                                                    }
                                                                    arrayList.add(new canv(bArr, bArr2));
                                                                    i29 = Math.max(i3, i4);
                                                                    i28 = Math.max(i5, i52);
                                                                    i30 = i6 + iArr[0];
                                                                    i27 = i7 + 1;
                                                                    i13 = i32;
                                                                    canq = canq2;
                                                                    a7 = i55;
                                                                    i26 = i57;
                                                                    a3 = canu;
                                                                    canr = canr2;
                                                                    canl4 = canl;
                                                                    b3 = i8;
                                                                } else {
                                                                    throw new ArithmeticException();
                                                                }
                                                            } else {
                                                                throw new IllegalArgumentException("Divide by 0");
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException("No data bytes provided");
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("No error correction bytes");
                                                    }
                                                } else {
                                                    throw new cank("Total bytes mismatch");
                                                }
                                            } else {
                                                throw new cank("EC bytes mismatch");
                                            }
                                        } else {
                                            throw new cank("Block ID too large");
                                        }
                                    } catch (cank e) {
                                        e = e;
                                        f88526a.mo25410a((Throwable) e);
                                    }
                                }
                                int i70 = i13;
                                canq canq3 = canq;
                                canu canu2 = a3;
                                canr canr3 = canr;
                                int i71 = i26;
                                int i72 = i28;
                                int i73 = i29;
                                if (b3 == i30) {
                                    canl canl8 = new canl();
                                    for (int i74 = 0; i74 < i73; i74++) {
                                        for (canv canv : arrayList) {
                                            byte[] bArr3 = canv.f175420a;
                                            if (i74 < bArr3.length) {
                                                canl8.mo74684a(bArr3[i74], 8);
                                            }
                                        }
                                    }
                                    for (int i75 = 0; i75 < i72; i75++) {
                                        for (canv canv2 : arrayList) {
                                            byte[] bArr4 = canv2.f175421b;
                                            if (i75 < bArr4.length) {
                                                canl8.mo74684a(bArr4[i75], 8);
                                            }
                                        }
                                    }
                                    int i76 = i71;
                                    if (i76 == canl8.mo74683a()) {
                                        caoa caoa = new caoa();
                                        canq canq4 = canq3;
                                        caoa.f175432b = canq4;
                                        caoa.f175431a = canr3;
                                        canu canu3 = canu2;
                                        caoa.f175433c = canu3;
                                        int i77 = (canu3.f175417a * 4) + 17;
                                        canw canw2 = new canw(i77, i77);
                                        int i78 = Integer.MAX_VALUE;
                                        int i79 = -1;
                                        int i80 = 0;
                                        while (i80 < 8) {
                                            canz.m126854a(canl8, canq4, canu3, i80, canw2);
                                            int a12 = cany.m126850a(canw2, true) + cany.m126850a(canw2, false);
                                            byte[][] bArr5 = canw2.f175422a;
                                            int i81 = canw2.f175423b;
                                            int i82 = canw2.f175424c;
                                            int i83 = 0;
                                            int i84 = 0;
                                            while (i83 < i82 - 1) {
                                                int i85 = i78;
                                                int i86 = i80;
                                                int i87 = 0;
                                                while (i87 < i81 - 1) {
                                                    byte[] bArr6 = bArr5[i83];
                                                    byte b6 = bArr6[i87];
                                                    int i88 = i87 + 1;
                                                    if (b6 == bArr6[i88]) {
                                                        byte[] bArr7 = bArr5[i83 + 1];
                                                        if (b6 == bArr7[i87]) {
                                                            if (b6 == bArr7[i88]) {
                                                                i84++;
                                                            }
                                                        }
                                                    }
                                                    i87 = i88;
                                                }
                                                i83++;
                                                i78 = i85;
                                                i80 = i86;
                                            }
                                            int i89 = a12 + (i84 * 3);
                                            byte[][] bArr8 = canw2.f175422a;
                                            int i90 = canw2.f175423b;
                                            int i91 = canw2.f175424c;
                                            int i92 = 0;
                                            int i93 = 0;
                                            while (i92 < i91) {
                                                int i94 = i78;
                                                int i95 = 0;
                                                while (i95 < i90) {
                                                    int i96 = i95 + 6;
                                                    if (i96 < i90) {
                                                        byte[] bArr9 = bArr8[i92];
                                                        i2 = i89;
                                                        i = i80;
                                                        if (bArr9[i95] == 1 && bArr9[i95 + 1] == 0 && bArr9[i95 + 2] == 1 && bArr9[i95 + 3] == 1 && bArr9[i95 + 4] == 1 && bArr9[i95 + 5] == 0 && bArr9[i96] == 1) {
                                                            int i97 = i95 + 10;
                                                            if (i97 < i90 && bArr9[i95 + 7] == 0 && bArr9[i95 + 8] == 0) {
                                                                if (bArr9[i95 + 9] == 0) {
                                                                    if (bArr9[i97] == 0) {
                                                                        i93 += 40;
                                                                    }
                                                                }
                                                            }
                                                            int i98 = i95 - 4;
                                                            if (i98 >= 0) {
                                                                if (bArr9[i95 - 1] == 0) {
                                                                    if (bArr9[i95 - 2] == 0) {
                                                                        if (bArr9[i95 - 3] == 0) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2 = i89;
                                                        i = i80;
                                                    }
                                                    int i99 = i92 + 6;
                                                    if (i99 < i91) {
                                                        if (bArr8[i92][i95] == 1 && bArr8[i92 + 1][i95] == 0 && bArr8[i92 + 2][i95] == 1 && bArr8[i92 + 3][i95] == 1 && bArr8[i92 + 4][i95] == 1 && bArr8[i92 + 5][i95] == 0 && bArr8[i99][i95] == 1) {
                                                            int i100 = i92 + 10;
                                                            if (!(i100 < i91 && bArr8[i92 + 7][i95] == 0 && bArr8[i92 + 8][i95] == 0 && bArr8[i92 + 9][i95] == 0 && bArr8[i100][i95] == 0)) {
                                                                int i101 = i92 - 4;
                                                                if (i101 >= 0 && bArr8[i92 - 1][i95] == 0 && bArr8[i92 - 2][i95] == 0 && bArr8[i92 - 3][i95] == 0 && bArr8[i101][i95] == 0) {
                                                                }
                                                            }
                                                            i93 += 40;
                                                        }
                                                    }
                                                    i95++;
                                                    i89 = i2;
                                                    i80 = i;
                                                }
                                                i92++;
                                                i78 = i94;
                                            }
                                            int i102 = i89 + i93;
                                            byte[][] bArr10 = canw2.f175422a;
                                            int i103 = canw2.f175423b;
                                            int i104 = canw2.f175424c;
                                            int i105 = 0;
                                            int i106 = 0;
                                            while (i105 < i104) {
                                                byte[] bArr11 = bArr10[i105];
                                                int i107 = i106;
                                                int i108 = 0;
                                                while (i108 < i103) {
                                                    int i109 = i78;
                                                    if (bArr11[i108] == 1) {
                                                        i107++;
                                                    }
                                                    i108++;
                                                    i78 = i109;
                                                }
                                                i105++;
                                                i106 = i107;
                                            }
                                            double d = (double) i106;
                                            double d2 = (double) (canw2.f175424c * canw2.f175423b);
                                            Double.isNaN(d);
                                            Double.isNaN(d2);
                                            int abs = i102 + (((int) (Math.abs((d / d2) - 8.0d) * 20.0d)) * 10);
                                            if (abs < i78) {
                                                i79 = i80;
                                            }
                                            if (abs < i78) {
                                                i78 = abs;
                                            }
                                            i80++;
                                        }
                                        caoa.f175434d = i79;
                                        canz.m126854a(canl8, canq4, canu3, i79, canw2);
                                        caoa.f175435e = canw2;
                                        canw canw3 = caoa.f175435e;
                                        if (canw3 != null) {
                                            int i110 = canw3.f175423b;
                                            int i111 = canw3.f175424c;
                                            int i112 = i110 + 8;
                                            int i113 = i111 + 8;
                                            int max = Math.max(i70, i112);
                                            int max2 = Math.max(i70, i113);
                                            int min = Math.min(max / i112, max2 / i113);
                                            int i114 = (max - (i110 * min)) / 2;
                                            int i115 = (max2 - (i111 * min)) / 2;
                                            canm canm = new canm(max, max2);
                                            int i116 = 0;
                                            while (i116 < i111) {
                                                int i117 = i114;
                                                int i118 = 0;
                                                while (i118 < i110) {
                                                    if (canw3.mo74708a(i118, i116) != 1) {
                                                        canw = canw3;
                                                    } else if (i115 < 0 || i117 < 0) {
                                                        throw new IllegalArgumentException("Left and top must be nonnegative");
                                                    } else if (min > 0) {
                                                        int i119 = i117 + min;
                                                        int i120 = i115 + min;
                                                        if (i120 > canm.f175378b || i119 > canm.f175377a) {
                                                            throw new IllegalArgumentException("The region must fit inside the matrix");
                                                        }
                                                        for (int i121 = i115; i121 < i120; i121++) {
                                                            int i122 = canm.f175379c * i121;
                                                            int i123 = i117;
                                                            while (i123 < i119) {
                                                                int[] iArr14 = canm.f175380d;
                                                                int i124 = i122 + (i123 >> 5);
                                                                iArr14[i124] = iArr14[i124] | (1 << (i123 & 31));
                                                                i123++;
                                                                canw3 = canw3;
                                                            }
                                                        }
                                                        canw = canw3;
                                                    } else {
                                                        throw new IllegalArgumentException("Height and width must be at least 1");
                                                    }
                                                    i118++;
                                                    i117 += min;
                                                    canw3 = canw;
                                                }
                                                i116++;
                                                i115 += min;
                                            }
                                            int i125 = canm.f175378b;
                                            int i126 = canm.f175377a;
                                            int[] iArr15 = new int[(i126 * i125)];
                                            for (int i127 = 0; i127 < i125; i127++) {
                                                int i128 = i127 * i126;
                                                for (int i129 = 0; i129 < i126; i129++) {
                                                    iArr15[i128 + i129] = !canm.mo74689a(i129, i127) ? -1 : -16777216;
                                                }
                                            }
                                            try {
                                                this.f88529d.setImageBitmap(Bitmap.createBitmap(iArr15, i126, i125, Bitmap.Config.RGB_565));
                                                this.f88529d.setVisibility(0);
                                            } catch (cank e2) {
                                                e = e2;
                                                f88526a.mo25410a((Throwable) e);
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        throw new cank("Interleaving error: " + i76 + " and " + canl8.mo74683a() + " differ.");
                                    }
                                } else {
                                    throw new cank("Data bytes does not match offset");
                                }
                            } else {
                                throw new cank("Number of bits and data bytes does not match");
                            }
                        } else {
                            throw new cank("Bits size does not equal capacity");
                        }
                    } else {
                        throw new cank("data bits cannot fit in the QR Code" + canl4.f175376b + " > " + i22);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(length4);
                    sb.append(" is bigger than ");
                    sb.append(i21 - 1);
                    throw new cank(sb.toString());
                }
            } else {
                throw new IllegalArgumentException("Requested dimensions are too small: " + i13 + 'x' + i13);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new cank(e3);
        } catch (UnsupportedEncodingException e4) {
            throw new cank(e4);
        } catch (cank e5) {
            e = e5;
            f88526a.mo25410a((Throwable) e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.f88527b = arguments.getString("deeplinkUrl");
        this.f88531f = getResources().getDimensionPixelSize(C0126R.dimen.smartdevice_qr_size);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.smartdevice_qr_code_fragment, viewGroup, false);
        this.f88530e = glifLayout;
        biyo biyo = new biyo(this.f88530e.getContext());
        biyo.mo64883a(C0126R.string.smartdevice_action_try_another_way);
        biyo.f122328c = 7;
        biyo.f122329d = 2132018230;
        ((biyn) glifLayout.mo71342a(biyn.class)).mo52735b(biyo.mo64882a());
        this.f88530e.mo71364b(true);
        ((TextView) this.f88530e.findViewById(C0126R.C0129id.description)).setText((int) C0126R.string.smartdevice_qrcode_body_text);
        this.f88529d = (ImageView) this.f88530e.findViewById(C0126R.C0129id.qrCodeView);
        this.f88530e.mo71365c(C0126R.string.smartdevice_qrcode_scan_qr);
        if (!TextUtils.isEmpty(this.f88527b)) {
            mo48968a(this.f88527b);
        }
        return this.f88530e;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("deeplinkUrl", this.f88527b);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("deeplinkUrl");
            this.f88527b = string;
            if (!TextUtils.isEmpty(string)) {
                mo48968a(this.f88527b);
            }
        }
        biyp biyp = ((biyn) this.f88530e.mo71342a(biyn.class)).f122315g;
        View.OnClickListener onClickListener = this.f88528c;
        if (onClickListener != null) {
            biyp.f122336f = onClickListener;
            return;
        }
        throw new IllegalStateException("Listener is null");
    }
}
