package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.security.SecureRandom;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: biu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biu {
    /* renamed from: a */
    public static final void m3135a() {
        byte[] bArr;
        String str;
        bix a = biy.m3166a();
        byte[] c = a.mo3182c(335621);
        byte[] c2 = a.mo3182c(335622);
        if (c != null) {
            String a2 = bji.m3198a((byte) bja.f3359a.length);
            String a3 = bji.m3201a(bja.f3359a);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(a3).length());
            sb.append("84");
            sb.append(a2);
            sb.append(a3);
            String sb2 = sb.toString();
            String a4 = bji.m3198a((byte) (sb2.length() / 2));
            StringBuilder sb3 = new StringBuilder(String.valueOf(a4).length() + 2 + String.valueOf(sb2).length());
            sb3.append("6F");
            sb3.append(a4);
            sb3.append(sb2);
            a.mo3174a(73496, bji.m3204a(sb3.toString()));
            String a5 = bji.m3201a(c);
            String a6 = bji.m3198a((byte) c.length);
            StringBuilder sb4 = new StringBuilder(String.valueOf(a6).length() + 4 + String.valueOf(a5).length());
            sb4.append("BF0C");
            sb4.append(a6);
            sb4.append(a5);
            String sb5 = sb4.toString();
            String a7 = bji.m3198a((byte) (sb5.length() / 2));
            StringBuilder sb6 = new StringBuilder(String.valueOf(a7).length() + 2 + String.valueOf(sb5).length());
            sb6.append("A5");
            sb6.append(a7);
            sb6.append(sb5);
            String sb7 = sb6.toString();
            String valueOf = String.valueOf(sb2);
            String valueOf2 = String.valueOf(sb7);
            String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            String a8 = bji.m3198a((byte) (str2.length() / 2));
            StringBuilder sb8 = new StringBuilder(String.valueOf(a8).length() + 2 + String.valueOf(str2).length());
            sb8.append("6F");
            sb8.append(a8);
            sb8.append(str2);
            a.mo3174a(73497, bji.m3204a(sb8.toString()));
            if (c2 != null) {
                String valueOf3 = String.valueOf(bji.m3201a(c));
                String valueOf4 = String.valueOf(bji.m3201a(c2));
                String str3 = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                String a9 = bji.m3198a((byte) (str3.length() / 2));
                StringBuilder sb9 = new StringBuilder(String.valueOf(a9).length() + 4 + String.valueOf(str3).length());
                sb9.append("BF0C");
                sb9.append(a9);
                sb9.append(str3);
                sb5 = sb9.toString();
                String a10 = bji.m3198a((byte) (sb5.length() / 2));
                StringBuilder sb10 = new StringBuilder(String.valueOf(a10).length() + 2 + String.valueOf(sb5).length());
                sb10.append("A5");
                sb10.append(a10);
                sb10.append(sb5);
                String sb11 = sb10.toString();
                String valueOf5 = String.valueOf(sb2);
                String valueOf6 = String.valueOf(sb11);
                String str4 = valueOf6.length() == 0 ? new String(valueOf5) : valueOf5.concat(valueOf6);
                String a11 = bji.m3198a((byte) (str4.length() / 2));
                StringBuilder sb12 = new StringBuilder(String.valueOf(a11).length() + 2 + String.valueOf(str4).length());
                sb12.append("6F");
                sb12.append(a11);
                sb12.append(str4);
                a.mo3174a(73498, bji.m3204a(sb12.toString()));
            }
            a.mo3179b(335623, bji.m3204a(sb5));
            if (a.mo3184d(335634)) {
                String a12 = bji.m3201a(a.mo3189g(335634));
                String a13 = bji.m3201a(a.mo3177a(73474));
                String a14 = bji.m3198a((byte) (a13.length() / 2));
                StringBuilder sb13 = new StringBuilder(String.valueOf(a14).length() + 2 + String.valueOf(a13).length());
                sb13.append("84");
                sb13.append(a14);
                sb13.append(a13);
                String valueOf7 = String.valueOf(sb13.toString());
                String valueOf8 = String.valueOf(a12);
                String str5 = valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
                String a15 = bji.m3198a((byte) (str5.length() / 2));
                StringBuilder sb14 = new StringBuilder(String.valueOf(a15).length() + 2 + String.valueOf(str5).length());
                sb14.append("6F");
                sb14.append(a15);
                sb14.append(str5);
                a.mo3174a(73486, bji.m3204a(sb14.toString()));
                if (a.mo3180b(73473)) {
                    if (a.mo3180b(73483)) {
                        if (a.f3348d.containsKey(73483)) {
                            bArr = (byte[]) a.f3348d.get(73483);
                            a.f3348d.remove(73483);
                        } else {
                            bArr = null;
                        }
                        String a16 = bji.m3201a(bArr);
                        String a17 = bji.m3199a(40760);
                        String a18 = bji.m3198a((byte) (a16.length() / 2));
                        StringBuilder sb15 = new StringBuilder(String.valueOf(a17).length() + String.valueOf(a18).length() + String.valueOf(a16).length());
                        sb15.append(a17);
                        sb15.append(a18);
                        sb15.append(a16);
                        String sb16 = sb15.toString();
                        bjg bjg = new bjg();
                        int a19 = bjh.m3190a(bji.m3204a(a12), 0, a12.length() / 2, 40760, bjg);
                        if (a19 == -1) {
                            String valueOf9 = String.valueOf(a12);
                            String valueOf10 = String.valueOf(sb16);
                            str = valueOf10.length() == 0 ? new String(valueOf9) : valueOf9.concat(valueOf10);
                        } else {
                            int i = a19 - bjg.f3364c;
                            String valueOf11 = String.valueOf(a12.substring(0, i + i));
                            String valueOf12 = String.valueOf(sb16);
                            String valueOf13 = String.valueOf(valueOf12.length() == 0 ? new String(valueOf11) : valueOf11.concat(valueOf12));
                            int i2 = a19 + bjg.f3363b;
                            String valueOf14 = String.valueOf(a12.substring(i2 + i2));
                            str = valueOf14.length() == 0 ? new String(valueOf13) : valueOf13.concat(valueOf14);
                        }
                        String a20 = bji.m3198a((byte) ((str.length() / 2) - 2));
                        String substring = str.substring(4);
                        StringBuilder sb17 = new StringBuilder(String.valueOf(a20).length() + 2 + String.valueOf(substring).length());
                        sb17.append("A5");
                        sb17.append(a20);
                        sb17.append(substring);
                        a12 = sb17.toString();
                    }
                    String a21 = bji.m3201a(a.mo3177a(73473));
                    String a22 = bji.m3198a((byte) (a21.length() / 2));
                    StringBuilder sb18 = new StringBuilder(String.valueOf(a22).length() + 2 + String.valueOf(a21).length());
                    sb18.append("84");
                    sb18.append(a22);
                    sb18.append(a21);
                    String valueOf15 = String.valueOf(sb18.toString());
                    String valueOf16 = String.valueOf(a12);
                    String str6 = valueOf16.length() == 0 ? new String(valueOf15) : valueOf15.concat(valueOf16);
                    String a23 = bji.m3198a((byte) (str6.length() / 2));
                    StringBuilder sb19 = new StringBuilder(String.valueOf(a23).length() + 2 + String.valueOf(str6).length());
                    sb19.append("6F");
                    sb19.append(a23);
                    sb19.append(str6);
                    a.mo3174a(73487, bji.m3204a(sb19.toString()));
                    return;
                }
                return;
            }
            throw new bic(bib.f3286p);
        }
        throw new bic(bib.f3286p);
    }

    /* renamed from: b */
    public static final void m3139b() {
        int i;
        bix a = biy.m3166a();
        int c = a.mo3181c();
        int a2 = bji.m3194a((byte) 0, a.f3346b[8]);
        if (c > a2) {
            int i2 = c - a2;
            for (int i3 = 0; i3 < i2; i3++) {
                a.mo3172a(true);
            }
            c = a2;
        }
        if (a.f3347c[40] == 92) {
            i = bji.m3195a(a.f3346b, 2);
        } else {
            i = a.mo3183d();
        }
        bji.m3202a(a.f3346b, 2, (short) i);
        a.f3346b[10] = (byte) c;
        if (a.f3347c[40] != 92) {
            bji.m3202a(a.f3346b, 0, (short) a.mo3172a(false).f3301d);
        }
    }

    /* renamed from: c */
    public static final void m3140c() {
        byte b;
        bix a = biy.m3166a();
        if (a.mo3180b(73479) && a.mo3180b(73475)) {
            m3136a(true);
            m3136a(false);
            b = -94;
        } else if (a.mo3180b(73475)) {
            m3136a(true);
            b = 19;
        } else if (a.mo3180b(73479)) {
            m3136a(false);
            b = -121;
        } else {
            throw new bic(bib.f3286p);
        }
        byte[] bArr = a.f3345a;
        bArr[17] = b;
        if (b == -94 || b == 19) {
            if (bArr[7] == 0) {
                throw new bic(bib.f3286p);
            } else if (bArr[8] == -1) {
                throw new bic(bib.f3286p);
            }
        }
        if ((b == -94 || b == -121) && bArr[6] == 0) {
            throw new bic(bib.f3286p);
        }
        byte[] bArr2 = a.f3347c;
        if (bArr2[0] == -91 && bArr[16] != bArr2[4]) {
            throw new bic(bib.f3285o);
        } else if (bArr2[40] != 92 && bArr[16] == 92 && bji.m3195a(bArr2, 2) != bji.m3195a(a.f3347c, 5)) {
            throw new bic(bib.f3282l);
        } else if (!a.mo3180b(73492) || !a.mo3180b(73493)) {
            throw new bic(bib.f3286p);
        } else if (a.mo3180b(73494)) {
            if (a.f3345a[16] == 92) {
                for (bih bih : a.f3349e.values()) {
                    if (bih.f3298a != null && bih.f3300c == null) {
                        throw new bic(bib.f3281k);
                    }
                }
            }
            if (a.f3347c[0] == 92 && bji.m3195a(a.f3346b, 0) > a.mo3172a(false).f3301d) {
                throw new bic(bib.f3286p);
            }
        } else {
            throw new bic(bib.f3286p);
        }
    }

    /* renamed from: a */
    private static final void m3136a(boolean z) {
        bix bix;
        bix a = biy.m3166a();
        byte[] a2 = a.mo3177a(73476);
        if (!z) {
            a2 = a.mo3177a(73480);
        }
        if (a2 != null) {
            int i = 0;
            while (i < a2.length) {
                int i2 = i + 1;
                int i3 = a2[i] >> 3;
                int i4 = i2 + 1;
                byte b = a2[i2];
                byte b2 = a2[i4];
                while (b <= b2) {
                    int a3 = bji.m3194a((byte) i3, b);
                    if (a3 == 257) {
                        a3 = z ? 8449 : 8450;
                    }
                    if (a.mo3180b(a3)) {
                        byte[] a4 = a.mo3177a(a3);
                        bjg bjg = new bjg();
                        int length = a4.length;
                        bix a5 = biy.m3166a();
                        int i5 = 0;
                        while (i5 < length) {
                            int a6 = bjh.m3191a(a4, i5, length, bjg);
                            if (a6 != 0) {
                                int i6 = bjg.f3363b;
                                if (i6 != 0) {
                                    byte[] bArr = new byte[i6];
                                    bix = a;
                                    System.arraycopy(a4, bjg.f3364c + i5, bArr, 0, i6);
                                    switch (a6) {
                                        case 87:
                                            if (a3 != 8450) {
                                                break;
                                            } else {
                                                String upperCase = bji.m3201a(bArr).toUpperCase();
                                                if (upperCase.substring(0, 2).compareToIgnoreCase("37") == 0 || upperCase.substring(0, 2).compareToIgnoreCase("34") == 0) {
                                                    int indexOf = upperCase.indexOf("D");
                                                    int i7 = bjg.f3364c;
                                                    byte[] bArr2 = a5.f3345a;
                                                    bArr2[22] = (byte) (i7 + i5 + (indexOf / 2) + 3);
                                                    bArr2[23] = indexOf % 2 == 0 ? (byte) -91 : 92;
                                                    break;
                                                } else {
                                                    throw new bic(bib.f3286p);
                                                }
                                            }
                                        case 90:
                                            a5.mo3174a(73492, bArr);
                                            break;
                                        case 140:
                                            if (z) {
                                                m3138a(bArr, 0, i6, 73484);
                                                break;
                                            } else {
                                                m3138a(bArr, 0, i6, 73485);
                                                break;
                                            }
                                        case 24356:
                                            if (bjg.f3363b == 3) {
                                                a5.mo3174a(73494, bArr);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 24360:
                                            if (bjg.f3363b == 2) {
                                                System.arraycopy(bArr, 0, a5.f3345a, 20, 2);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 24372:
                                            if (bjg.f3363b == 1) {
                                                a5.mo3174a(73493, bArr);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 40729:
                                            if (bjg.f3363b == 6) {
                                                a5.mo3174a(73503, bArr);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 40740:
                                            if (bjg.f3363b == 29) {
                                                a5.mo3174a(73504, bArr);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 40741:
                                            if (bjg.f3363b == 2) {
                                                a5.mo3174a(73505, bArr);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 40760:
                                            m3138a(bArr, 0, i6, 73481);
                                            break;
                                        case 40770:
                                            if (bjg.f3363b == 2) {
                                                System.arraycopy(bArr, 0, a5.f3345a, 18, 2);
                                                break;
                                            } else {
                                                throw new bic(bib.f3286p);
                                            }
                                        case 40775:
                                            a5.mo3174a(73495, bArr);
                                            break;
                                    }
                                } else {
                                    bix = a;
                                }
                                i5 += bjg.f3364c;
                                if (!bjg.f3365d) {
                                    i5 += bjg.f3363b;
                                }
                                a = bix;
                            } else {
                                continue;
                                b = (byte) (b + 1);
                                a = a;
                            }
                        }
                        b = (byte) (b + 1);
                        a = a;
                    } else {
                        throw new bic(bib.f3286p);
                    }
                }
                i = i4 + 2;
            }
            return;
        }
        throw new bic(bib.f3286p);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bix.a(byte[], boolean):void
     arg types: [byte[], int]
     candidates:
      bix.a(int, byte[]):void
      bix.a(byte[], boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:408:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:411:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f5  */
    /* renamed from: a */
    public static final void m3137a(byte[] bArr) {
        int i;
        int i2;
        int a;
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int a2 = bji.m3194a((byte) 0, bArr3[0]);
        int a3 = bji.m3194a((byte) 0, bArr3[1]);
        int a4 = bji.m3194a((byte) 0, bArr3[2]);
        int a5 = bji.m3195a(bArr3, 0);
        bix a6 = biy.m3166a();
        byte b = a6.f3347c[0];
        if (a4 == 255) {
            a4 = bji.m3195a(bArr3, 3);
            if (a4 + 5 == bArr3.length) {
                i = 3;
            } else {
                throw new bic(bib.f3286p);
            }
        } else if (a4 + 3 == bArr3.length) {
            i = 1;
        } else {
            throw new bic(bib.f3286p);
        }
        byte[] bArr4 = new byte[a4];
        System.arraycopy(bArr3, i + 2, bArr4, 0, a4);
        if ((a2 <= 0 || a2 >= 31 || a3 == 0) && !(a2 == 33 && (a3 == 1 || a3 == 2))) {
            bjg bjg = new bjg();
            switch (a5) {
                case 12289:
                    byte[] bArr5 = a6.f3345a;
                    bArr5[32] = -1;
                    bArr5[33] = -1;
                    int i3 = 0;
                    boolean z = false;
                    while (i3 < a4) {
                        int a7 = bjh.m3191a(bArr4, i3, a4, bjg);
                        if (a7 != 0) {
                            int i4 = bjg.f3363b;
                            byte[] bArr6 = new byte[i4];
                            System.arraycopy(bArr4, bjg.f3364c + i3, bArr6, 0, i4);
                            switch (a7) {
                                case 129:
                                    if (bjg.f3363b == 1) {
                                        System.arraycopy(bArr6, 0, a6.f3345a, 32, 1);
                                        break;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                case 130:
                                    if (bjg.f3363b == 5) {
                                        System.arraycopy(bArr6, 0, a6.f3345a, 33, 5);
                                        break;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                case 40743:
                                    if (bjg.f3363b == 1) {
                                        if (b != -91 || a6.f3345a[0] == bArr6[0]) {
                                            a6.f3345a[0] = bArr6[0];
                                            z |= true;
                                            break;
                                        } else {
                                            throw new bic(bib.f3286p);
                                        }
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                case 40758:
                                    if (bjg.f3363b == 2) {
                                        System.arraycopy(bArr6, 0, a6.f3346b, 0, 2);
                                        break;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                case 40770:
                                    if (bjg.f3363b == 2) {
                                        if (b != -91) {
                                            i2 = 18;
                                        } else {
                                            i2 = 18;
                                            if (bji.m3193a(bArr6, a6.f3345a, 18, 2) == -91) {
                                                throw new bic(bib.f3286p);
                                            }
                                        }
                                        System.arraycopy(bArr6, 0, a6.f3345a, i2, bjg.f3363b);
                                        break;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                case 40821:
                                    if (bjg.f3363b == 6) {
                                        a6.mo3174a(73500, bArr6);
                                        break;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                case 40826:
                                    if (bjg.f3363b == 5) {
                                        System.arraycopy(bArr6, 0, a6.f3345a, 1, 5);
                                        z |= true;
                                        break;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                default:
                                    throw new bic(bib.f3286p);
                            }
                            i3 += bjg.f3364c;
                            if (!bjg.f3365d) {
                                i3 += bjg.f3363b;
                            }
                        } else if (z) {
                            throw new bic(bib.f3286p);
                        } else {
                            return;
                        }
                    }
                    if (z) {
                    }
                    break;
                case 12290:
                    bix a8 = biy.m3166a();
                    bjg bjg2 = new bjg();
                    bjg bjg3 = new bjg();
                    int i5 = 0;
                    while (i5 < a4) {
                        int a9 = bjh.m3191a(bArr4, i5, a4, bjg2);
                        if (a9 != 0) {
                            if (a9 == 174 || a9 == 175) {
                                int a10 = bjh.m3190a(bArr4, bjg2.f3364c + i5, a4, 79, bjg3);
                                if (a10 != -1) {
                                    int i6 = bjg3.f3363b;
                                    byte[] bArr7 = new byte[i6];
                                    System.arraycopy(bArr4, a10, bArr7, 0, i6);
                                    int i7 = bjg2.f3363b;
                                    byte[] bArr8 = new byte[i7];
                                    System.arraycopy(bArr4, bjg2.f3364c + i5, bArr8, 0, i7);
                                    if (a9 == 174) {
                                        a8.mo3179b(335621, bArr8);
                                        a8.mo3174a(73474, bArr7);
                                    } else {
                                        a8.mo3179b(335622, bArr8);
                                        a8.mo3174a(73473, bArr7);
                                    }
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                            } else if (a9 == 177) {
                                int i8 = bjg2.f3364c + i5;
                                while (true) {
                                    int i9 = bjg2.f3364c + i5 + bjg2.f3363b;
                                    if (i8 < i9) {
                                        int a11 = bjh.m3191a(bArr4, i8, i9, bjg3);
                                        if (a11 != 0) {
                                            int i10 = bjg3.f3363b;
                                            byte[] bArr9 = new byte[i10];
                                            System.arraycopy(bArr4, bjg3.f3364c + i8, bArr9, 0, i10);
                                            if (a11 == 130) {
                                                a8.mo3174a(73477, bArr9);
                                            } else if (a11 == 148) {
                                                a8.mo3174a(73478, bArr9);
                                            } else if (a11 == 40760) {
                                                a8.mo3174a(73483, bArr9);
                                                m3138a(bArr9, 0, i10, 73482);
                                            }
                                            i8 += bjg3.f3364c;
                                            if (!bjg3.f3365d) {
                                                i8 += bjg3.f3363b;
                                            }
                                        }
                                    }
                                }
                            }
                            i5 += bjg2.f3364c;
                            if (!bjg2.f3365d) {
                                i5 += bjg2.f3363b;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                case 33281:
                    a6.mo3179b(335630, bArr4);
                    a6.f3347c[1] = 92;
                    return;
                case 33282:
                    a6.mo3179b(335629, bArr4);
                    a6.f3347c[1] = 92;
                    return;
                case 33283:
                    a6.mo3179b(335628, bArr4);
                    a6.f3347c[1] = 92;
                    return;
                case 33284:
                    a6.mo3179b(335627, bArr4);
                    a6.f3347c[1] = 92;
                    return;
                case 33285:
                    a6.mo3179b(335626, bArr4);
                    a6.f3347c[1] = 92;
                    return;
                case 33286:
                    a6.mo3179b(335625, bArr4);
                    return;
                case 33287:
                    a6.mo3179b(335624, bArr4);
                    return;
                case 37122:
                    a6.mo3179b(335634, bArr4);
                    int a12 = bjh.m3190a(bArr4, 0, a4, 40760, bjg);
                    if (a12 != -1) {
                        m3138a(bArr4, a12, bjg.f3363b + a12, 73481);
                    }
                    int a13 = bjh.m3190a(bArr4, 0, a4, 80, bjg);
                    if (a13 != -1) {
                        int i11 = bjg.f3363b;
                        byte[] bArr10 = new byte[i11];
                        System.arraycopy(bArr4, a13, bArr10, 0, i11);
                        a6.mo3174a(73501, bArr10);
                    }
                    int a14 = bjh.m3190a(bArr4, 0, a4, 24365, bjg);
                    if (a14 != -1) {
                        int i12 = bjg.f3363b;
                        byte[] bArr11 = new byte[i12];
                        System.arraycopy(bArr4, a14, bArr11, 0, i12);
                        a6.mo3174a(73502, bArr11);
                        return;
                    }
                    return;
                case 37124:
                case 37125:
                    int i13 = 0;
                    while (i13 < a4) {
                        int a15 = bjh.m3191a(bArr4, i13, a4, bjg);
                        if (a15 != 0) {
                            int i14 = bjg.f3363b;
                            byte[] bArr12 = new byte[i14];
                            System.arraycopy(bArr4, bjg.f3364c + i13, bArr12, 0, i14);
                            if (a15 != 130) {
                                if (a15 != 148) {
                                    throw new bic(bib.f3286p);
                                } else if (bjg.f3363b % 4 != 0) {
                                    throw new bic(bib.f3286p);
                                } else if (a5 != 37124) {
                                    a6.mo3174a(73480, bArr12);
                                } else {
                                    a6.mo3174a(73476, bArr12);
                                }
                            } else if (bjg.f3363b != 2) {
                                throw new bic(bib.f3286p);
                            } else if (a5 != 37124) {
                                a6.mo3174a(73479, bArr12);
                            } else {
                                a6.mo3174a(73475, bArr12);
                            }
                            i13 += bjg.f3364c;
                            if (!bjg.f3365d) {
                                i13 += bjg.f3363b;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                case 37632:
                    byte b2 = bArr4[i + 4];
                    if (b2 == 2 || b2 == 11 || b2 == 18) {
                        a6.f3345a[6] = b2;
                        return;
                    }
                    throw new bic(bib.f3286p);
                case 37633:
                    if (a4 >= 11) {
                        byte b3 = bArr4[i + 4];
                        if (b3 == 1 || b3 == 7 || b3 == 17) {
                            byte[] bArr13 = a6.f3345a;
                            bArr13[7] = b3;
                            byte b4 = bArr4[i + 9];
                            if (b4 == 1 || b4 == 2) {
                                bArr13[8] = b4;
                                if (a4 > 11) {
                                    int i15 = a4 - 11;
                                    byte[] bArr14 = new byte[i15];
                                    System.arraycopy(bArr4, i + 10, bArr14, 0, i15);
                                    a6.mo3174a(73488, bArr14);
                                    return;
                                }
                                return;
                            }
                            throw new bic(bib.f3286p);
                        }
                        throw new bic(bib.f3286p);
                    }
                    throw new bic(bib.f3286p);
                case 37889:
                    bjg bjg4 = new bjg();
                    bix a16 = biy.m3166a();
                    int i16 = 0;
                    while (i16 < a4) {
                        int a17 = bjh.m3191a(bArr4, i16, a4, bjg4);
                        if (a17 != 0) {
                            int i17 = bjg4.f3363b;
                            byte[] bArr15 = new byte[i17];
                            System.arraycopy(bArr4, bjg4.f3364c + i16, bArr15, 0, i17);
                            if (a17 != 137) {
                                if (a17 == 168) {
                                    a16.mo3176a(bArr15, true);
                                }
                            } else if (bjg4.f3363b == 2) {
                                System.arraycopy(bArr15, 0, a16.f3347c, 2, 2);
                            } else {
                                throw new bic(bib.f3286p);
                            }
                            i16 += bjg4.f3364c;
                            if (!bjg4.f3365d) {
                                i16 += bjg4.f3363b;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                case 38145:
                    bjg bjg5 = new bjg();
                    bix a18 = biy.m3166a();
                    byte b5 = a18.f3347c[0];
                    int i18 = 0;
                    while (i18 < a4 && (a = bjh.m3191a(bArr4, i18, a4, bjg5)) != 0) {
                        int i19 = bjg5.f3363b;
                        byte[] bArr16 = new byte[i19];
                        System.arraycopy(bArr4, bjg5.f3364c + i18, bArr16, 0, i19);
                        switch (a) {
                            case 128:
                                if (bjg5.f3363b != 2) {
                                    throw new bic(bib.f3286p);
                                } else if (b5 != -91 || bji.m3193a(bArr16, a18.f3346b, 4, 2) == 92) {
                                    System.arraycopy(bArr16, 0, a18.f3346b, 4, 2);
                                    break;
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                            case 129:
                                if (bjg5.f3363b != 2) {
                                    throw new bic(bib.f3286p);
                                } else if (b5 != -91 || bji.m3193a(bArr16, a18.f3345a, 9, 2) == 92) {
                                    System.arraycopy(bArr16, 0, a18.f3345a, 9, 2);
                                    break;
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                                break;
                            case 130:
                                if (bjg5.f3363b > 64) {
                                    throw new bic(bib.f3286p);
                                } else if (b5 != -91 || bji.m3193a(bArr16, a18.mo3177a(73489), 0, i19) == 92) {
                                    a18.mo3174a(73489, bArr16);
                                    break;
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                                break;
                            case 131:
                                if (bjg5.f3363b == 1) {
                                    a18.f3346b[6] = bArr16[0];
                                    a18.f3345a[11] = bArr16[0];
                                    break;
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                            case 132:
                                int i20 = bjg5.f3363b;
                                if (i20 <= 4 && i20 != 0) {
                                    System.arraycopy(bArr16, 0, a18.f3345a, (4 - i20) + 12, i20);
                                    break;
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                            case 133:
                                if (bjg5.f3363b != 3) {
                                    throw new bic(bib.f3286p);
                                } else if (b5 != -91 || bji.m3193a(bArr16, a18.f3346b, 7, i19) == 92) {
                                    System.arraycopy(bArr16, 0, a18.f3346b, 7, 3);
                                    break;
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                                break;
                        }
                        i18 += bjg5.f3364c;
                        if (!bjg5.f3365d) {
                            i18 += bjg5.f3363b;
                        }
                    }
                    if (a18.mo3177a(73489) == null) {
                        throw new bic(bib.f3286p);
                    }
                    return;
                case 38401:
                    if (a6.f3347c[0] != -91 || a6.f3345a[16] == 92) {
                        bjg bjg6 = new bjg();
                        bix a19 = biy.m3166a();
                        int i21 = 0;
                        while (i21 < a4) {
                            int a20 = bjh.m3191a(bArr4, i21, a4, bjg6);
                            if (a20 != 0) {
                                int i22 = bjg6.f3363b;
                                byte[] bArr17 = new byte[i22];
                                System.arraycopy(bArr4, bjg6.f3364c + i21, bArr17, 0, i22);
                                if (a20 == 130) {
                                    a19.mo3174a(73490, bArr17);
                                } else if (a20 == 131) {
                                    a19.mo3174a(73491, bArr17);
                                } else if (a20 != 137) {
                                    if (a20 == 172) {
                                        a19.mo3176a(bArr17, false);
                                    }
                                } else if (bjg6.f3363b == 2) {
                                    System.arraycopy(bArr17, 0, a19.f3347c, 5, 2);
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                                i21 += bjg6.f3364c;
                                if (!bjg6.f3365d) {
                                    i21 += bjg6.f3363b;
                                }
                            } else {
                                a19.f3345a[16] = 92;
                                bArr2 = a6.f3347c;
                                if (bArr2[0] != -91) {
                                    bArr2[4] = 92;
                                    return;
                                }
                                return;
                            }
                        }
                        a19.f3345a[16] = 92;
                        bArr2 = a6.f3347c;
                        if (bArr2[0] != -91) {
                        }
                    } else {
                        throw new bic(bib.f3286p);
                    }
                    break;
                default:
                    throw new bic(bib.f3286p);
            }
        } else if (biw.OPERATION.f3341b.equals(bii.REFRESH)) {
            throw new bic(bib.f3286p);
        } else if (b == -91 && a2 == 33) {
            throw new bic(bib.f3286p);
        } else {
            a6.mo3174a(a5, bArr4);
        }
    }

    /* renamed from: a */
    private static final void m3138a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        bjg bjg = new bjg();
        bix a = biy.m3166a();
        if (i3 == 73484) {
            bArr2 = new byte[9];
        } else if (i3 == 73485) {
            bArr2 = new byte[9];
        } else if (i3 == 73481 || i3 == 73482) {
            bArr2 = new byte[6];
        } else {
            throw new bic(bib.f3278h);
        }
        bji.m3203a(bArr2, 0, bArr2.length, (byte) -1);
        byte b = 0;
        while (i < i2) {
            int a2 = bjh.m3191a(bArr, i, i2, bjg);
            if (a2 != 0) {
                switch (a2) {
                    case 149:
                        bArr2[5] = b;
                        break;
                    case MfiClientException.TYPE_MFICLIENT_NOT_STARTED /*154*/:
                        bArr2[7] = b;
                        break;
                    case MfiClientException.TYPE_NO_ACCOUNT_INFO /*156*/:
                        bArr2[8] = b;
                        break;
                    case 24362:
                        bArr2[6] = b;
                        break;
                    case 40706:
                        bArr2[2] = b;
                        break;
                    case 40707:
                        bArr2[3] = b;
                        break;
                    case 40725:
                        bArr2[4] = b;
                        break;
                    case 40730:
                        bArr2[4] = b;
                        break;
                    case 40757:
                        bArr2[1] = b;
                        break;
                    case 40759:
                        bArr2[1] = b;
                        break;
                    case 40782:
                        bArr2[3] = b;
                        bArr2[5] = (byte) bjg.f3363b;
                        break;
                    case 40814:
                        bArr2[2] = b;
                        break;
                }
                b = (byte) (b + bjg.f3363b);
                i += bjg.f3364c;
            } else {
                bArr2[0] = b;
                a.mo3174a(i3, bArr2);
            }
        }
        bArr2[0] = b;
        a.mo3174a(i3, bArr2);
    }

    /* renamed from: a */
    public final void mo3168a(String str) {
        byte[] bArr;
        String str2;
        biq biq;
        byte[] bArr2;
        String str3;
        bix a = biy.m3166a();
        byte[] bytes = str.getBytes();
        Object[] a2 = bjd.m3180a(bytes);
        if (a2 == null) {
            bArr = bytes;
            str2 = null;
        } else if (a2.length > 3) {
            str2 = ((String) a2[3]).replace(".", "");
            String str4 = (String) a2[0];
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1);
            sb.append('1');
            sb.append(str4);
            String str5 = (String) a2[1];
            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 1);
            sb2.append('1');
            sb2.append(str5);
            String str6 = (String) a2[2];
            StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 1);
            sb3.append('1');
            sb3.append(str6);
            bArr = bjd.m3179a(sb.toString(), sb2.toString(), sb3.toString());
        } else {
            bArr = bytes;
            str2 = null;
        }
        if (a.f3347c[0] == -91 && str2 != null) {
            byte[] a3 = bji.m3204a(str2);
            if (bji.m3193a(a3, a.f3346b, 4, a3.length) != 92) {
                throw new bic(bib.f3288r);
            }
        }
        int length = bArr.length;
        int i = length + 16;
        byte[] bArr3 = new byte[i];
        biq f = a.mo3187f();
        biq biq2 = f;
        bix.m3145f(f.mo3146a(0, bArr, length, bArr3, i));
        if (biq2.f3334a) {
            bArr3 = biq2.mo3164a();
        }
        Object[] a4 = bjd.m3180a(bArr3);
        if (a4 != null) {
            String obj = a4[0].toString();
            Pattern compile = Pattern.compile("(#S[\\d]{4}#)");
            Pattern compile2 = Pattern.compile("(#E[\\d]{4}#)");
            Matcher matcher = compile.matcher(obj);
            Matcher matcher2 = compile2.matcher(obj);
            while (matcher.find() && matcher2.find()) {
                byte[] a5 = bji.m3204a(obj.substring(obj.indexOf(matcher.group()) + 7, obj.indexOf(matcher2.group())));
                if (biw.OPERATION.f3341b.equals(bii.REFRESH)) {
                    if (!bjb.f3361a.contains(Integer.valueOf(bji.m3195a(a5, 0)))) {
                        throw new bic(bib.f3278h);
                    }
                }
                m3137a(a5);
            }
            bix a6 = biy.m3166a();
            if (a6.f3347c[0] == 92) {
                byte[] bArr4 = a6.f3345a;
                if (bArr4[16] != 92) {
                    bArr4[16] = -91;
                }
            }
            m3140c();
            if (biy.m3166a().f3347c[0] == 92) {
                bix a7 = biy.m3166a();
                String a8 = bji.m3199a(bji.m3195a(a7.f3346b, 0));
                StringBuilder sb4 = new StringBuilder(String.valueOf(a8).length() + 1);
                sb4.append('2');
                sb4.append(a8);
                String sb5 = sb4.toString();
                String a9 = a7.mo3180b(73475) ? bji.m3201a(a7.mo3177a(73475)) : "0000";
                StringBuilder sb6 = new StringBuilder(String.valueOf(a9).length() + 1);
                sb6.append('2');
                sb6.append(a9);
                String sb7 = sb6.toString();
                StringBuilder sb8 = new StringBuilder(3);
                sb8.append("201");
                String sb9 = sb8.toString();
                String a10 = bji.m3198a(a7.f3345a[0]);
                StringBuilder sb10 = new StringBuilder(String.valueOf(a10).length() + 1);
                sb10.append('2');
                sb10.append(a10);
                String sb11 = sb10.toString();
                String a11 = bji.m3198a(a7.f3346b[8]);
                StringBuilder sb12 = new StringBuilder(String.valueOf(a11).length() + 1);
                sb12.append('2');
                sb12.append(a11);
                bix.m3145f(a7.mo3187f().mo3155c(bjd.m3179a(sb5, sb7, sb9, sb11, sb12.toString())));
            }
            bix a12 = biy.m3166a();
            if (a12.f3347c[1] == 92) {
                byte[] g = a12.mo3189g(335626);
                if (g != null) {
                    String a13 = bji.m3201a(g);
                    StringBuilder sb13 = new StringBuilder(String.valueOf(a13).length() + 1);
                    sb13.append('2');
                    sb13.append(a13);
                    String sb14 = sb13.toString();
                    byte[] g2 = a12.mo3189g(335627);
                    if (g2 != null) {
                        String a14 = bji.m3201a(g2);
                        StringBuilder sb15 = new StringBuilder(String.valueOf(a14).length() + 1);
                        sb15.append('2');
                        sb15.append(a14);
                        String sb16 = sb15.toString();
                        byte[] g3 = a12.mo3189g(335628);
                        if (g3 != null) {
                            String a15 = bji.m3201a(g3);
                            StringBuilder sb17 = new StringBuilder(String.valueOf(a15).length() + 1);
                            sb17.append('2');
                            sb17.append(a15);
                            String sb18 = sb17.toString();
                            byte[] g4 = a12.mo3189g(335629);
                            if (g4 != null) {
                                String a16 = bji.m3201a(g4);
                                StringBuilder sb19 = new StringBuilder(String.valueOf(a16).length() + 1);
                                sb19.append('2');
                                sb19.append(a16);
                                String sb20 = sb19.toString();
                                byte[] g5 = a12.mo3189g(335630);
                                if (g5 != null) {
                                    String a17 = bji.m3201a(g5);
                                    StringBuilder sb21 = new StringBuilder(String.valueOf(a17).length() + 1);
                                    sb21.append('2');
                                    sb21.append(a17);
                                    String sb22 = sb21.toString();
                                    byte[] g6 = a12.mo3189g(335625);
                                    if (g6 != null) {
                                        String a18 = bji.m3201a(g6);
                                        StringBuilder sb23 = new StringBuilder(String.valueOf(a18).length() + 1);
                                        sb23.append('2');
                                        sb23.append(a18);
                                        str3 = sb23.toString();
                                    } else {
                                        str3 = "0";
                                    }
                                    byte[] a19 = a12.mo3177a(73495);
                                    if (a19 != null) {
                                        String a20 = bji.m3201a(a19);
                                        StringBuilder sb24 = new StringBuilder(String.valueOf(a20).length() + 1);
                                        sb24.append('2');
                                        sb24.append(a20);
                                        String sb25 = sb24.toString();
                                        int c = bji.m3209c(a12.f3345a);
                                        byte[] bArr5 = new byte[8];
                                        new SecureRandom().nextBytes(bArr5);
                                        biq = biq2;
                                        System.arraycopy(bArr5, 0, a12.f3345a, 24, 8);
                                        bix.m3145f(a12.mo3187f().mo3147a(c, bjd.m3179a(sb18, sb20, sb14, sb16, sb22, str3, sb25), bArr5));
                                        a12.f3345a[36] = 92;
                                    } else {
                                        throw new bic(bib.f3286p);
                                    }
                                } else {
                                    throw new bic(bib.f3286p);
                                }
                            } else {
                                throw new bic(bib.f3286p);
                            }
                        } else {
                            throw new bic(bib.f3286p);
                        }
                    } else {
                        throw new bic(bib.f3286p);
                    }
                } else {
                    throw new bic(bib.f3286p);
                }
            } else {
                biq = biq2;
            }
            m3139b();
            bix a21 = biy.m3166a();
            byte b = a21.f3345a[16];
            TreeMap treeMap = a21.f3349e;
            StringBuilder sb26 = new StringBuilder();
            for (bih bih : treeMap.values()) {
                if (bih.f3298a != null) {
                    sb26.append('2');
                    sb26.append(Integer.toHexString(bih.f3298a.length));
                    sb26.append("-2");
                    sb26.append(bji.m3201a(bih.f3298a));
                    sb26.append("-2");
                    sb26.append(bji.m3201a(bih.f3299b));
                    sb26.append("-2");
                    sb26.append(bji.m3199a(bih.f3301d));
                    sb26.append("-");
                    if (b == 92) {
                        sb26.append('2');
                        sb26.append(bji.m3201a(bih.f3300c));
                        sb26.append("-");
                        bArr2 = null;
                        bih.f3300c = null;
                    } else {
                        bArr2 = null;
                    }
                    bih.f3298a = bArr2;
                    bih.f3299b = bArr2;
                }
            }
            String sb27 = sb26.toString();
            bix.m3145f(a21.mo3187f().mo3157d(bjd.m3179a((Object[]) sb27.substring(0, sb27.length() - 1).split("-"))));
            a.mo3191h(1);
            String a22 = bji.m3201a(bji.m3210d(obj.getBytes()));
            StringBuilder sb28 = new StringBuilder(String.valueOf(a22).length() + 1);
            sb28.append('1');
            sb28.append(a22);
            byte[] bArr6 = new byte[1024];
            bix.m3145f(biq.mo3161f(bjd.m3179a(sb28.toString()), bArr6));
            Object[] a23 = bjd.m3180a(bArr6);
            if (a23 != null) {
                a23[0].toString();
                return;
            }
            throw new bic(bib.f3286p);
        }
        throw new bic(bib.f3286p);
    }
}
