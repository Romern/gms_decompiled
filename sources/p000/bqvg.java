package p000;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: bqvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvg {

    /* renamed from: a */
    public static final /* synthetic */ int f141671a = 0;

    /* renamed from: b */
    private static final bqvc f141672b = new bqvc(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: c */
    private static final bqvd f141673c = new bqvd(new bqve(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: a */
    private static int m113459a(int i, int i2) {
        int i3 = ((i ^ i2) ^ -1) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    /* renamed from: b */
    private static long m113466b(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | m113460a(bArr, i);
    }

    /* renamed from: c */
    private static bqve m113468c(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        byte b = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + b);
            bArr2[i4] = b2;
            int i5 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i5 << 4));
            i4++;
            b = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + b);
        bqvd bqvd = new bqvd(f141673c);
        bqvf bqvf = new bqvf();
        for (i = 1; i < 64; i += 2) {
            bqvc bqvc = new bqvc(f141672b);
            m113461a(bqvc, i / 2, bArr2[i]);
            bqvf.m113458a(bqvf, bqvd);
            m113463a(bqvd, bqvf, bqvc);
        }
        bqve bqve = new bqve();
        bqve.m113456a(bqve, bqvd);
        m113462a(bqvd, bqve);
        bqve.m113456a(bqve, bqvd);
        m113462a(bqvd, bqve);
        bqve.m113456a(bqve, bqvd);
        m113462a(bqvd, bqve);
        bqve.m113456a(bqve, bqvd);
        m113462a(bqvd, bqve);
        for (int i6 = 0; i6 < 64; i6 += 2) {
            bqvc bqvc2 = new bqvc(f141672b);
            m113461a(bqvc2, i6 / 2, bArr2[i6]);
            bqvf.m113458a(bqvf, bqvd);
            m113463a(bqvd, bqvf, bqvc2);
        }
        bqve bqve2 = new bqve(bqvd);
        long[] jArr = new long[10];
        bqvy.m113504b(jArr, bqve2.f141666a);
        long[] jArr2 = new long[10];
        bqvy.m113504b(jArr2, bqve2.f141667b);
        long[] jArr3 = new long[10];
        bqvy.m113504b(jArr3, bqve2.f141668c);
        long[] jArr4 = new long[10];
        bqvy.m113504b(jArr4, jArr3);
        long[] jArr5 = new long[10];
        bqvy.m113505b(jArr5, jArr2, jArr);
        bqvy.m113506c(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        bqvy.m113506c(jArr6, jArr, jArr2);
        bqvy.m113506c(jArr6, jArr6, bqvi.f141676a);
        bqvy.m113501a(jArr6, jArr6, jArr4);
        bqvy.m113500a(jArr6, jArr6);
        if (bqup.m113432a(bqvy.m113502a(jArr5), bqvy.m113502a(jArr6))) {
            return bqve2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* renamed from: d */
    private static void m113469d(byte[] bArr) {
        long a = m113460a(bArr, 0);
        long b = m113466b(bArr, 2);
        long a2 = m113460a(bArr, 5);
        long b2 = m113466b(bArr, 7);
        long b3 = m113466b(bArr, 10);
        long a3 = m113460a(bArr, 13);
        long b4 = m113466b(bArr, 15);
        long a4 = m113460a(bArr, 18);
        long a5 = m113460a(bArr, 21);
        long b5 = m113466b(bArr, 23);
        long a6 = m113460a(bArr, 26);
        long b6 = m113466b(bArr, 28);
        long b7 = m113466b(bArr, 31);
        long a7 = m113460a(bArr, 34);
        long b8 = m113466b(bArr, 36);
        long a8 = m113460a(bArr, 39);
        long a9 = m113460a(bArr, 42);
        long b9 = m113466b(bArr, 44);
        long a10 = (m113460a(bArr, 47) >> 2) & 2097151;
        long b10 = (m113466b(bArr, 49) >> 7) & 2097151;
        long b11 = (m113466b(bArr, 52) >> 4) & 2097151;
        long a11 = (m113460a(bArr, 55) >> 1) & 2097151;
        long b12 = (m113466b(bArr, 57) >> 6) & 2097151;
        long b13 = m113466b(bArr, 60) >> 3;
        long j = (a9 & 2097151) - (b13 * 683901);
        long j2 = ((((b8 >> 6) & 2097151) - (b13 * 997805)) + (b12 * 136657)) - (a11 * 683901);
        long j3 = ((((((b7 >> 4) & 2097151) + (b13 * 470296)) + (b12 * 654183)) - (a11 * 997805)) + (b11 * 136657)) - (b10 * 683901);
        long j4 = ((b4 >> 6) & 2097151) + (a10 * 666643);
        long j5 = (a5 & 2097151) + (b11 * 666643) + (b10 * 470296) + (a10 * 654183);
        long j6 = ((((((a6 >> 2) & 2097151) + (b12 * 666643)) + (a11 * 470296)) + (b11 * 654183)) - (b10 * 997805)) + (a10 * 136657);
        long j7 = (j4 + 1048576) >> 21;
        long j8 = (a4 >> 3) + (b10 * 666643) + (a10 * 470296) + j7;
        long j9 = (j5 + 1048576) >> 21;
        long j10 = ((((((b5 >> 5) & 2097151) + (a11 * 666643)) + (b11 * 470296)) + (b10 * 654183)) - (a10 * 997805)) + j9;
        long j11 = (j6 + 1048576) >> 21;
        long j12 = ((((((((b6 >> 7) & 2097151) + (b13 * 666643)) + (b12 * 470296)) + (a11 * 654183)) - (b11 * 997805)) + (b10 * 136657)) - (a10 * 683901)) + j11;
        long j13 = (j3 + 1048576) >> 21;
        long j14 = ((((((a7 >> 1) & 2097151) + (b13 * 654183)) - (b12 * 997805)) + (a11 * 136657)) - (b11 * 683901)) + j13;
        long j15 = (j2 + 1048576) >> 21;
        long j16 = (((a8 >> 3) + (b13 * 136657)) - (b12 * 683901)) + j15;
        long j17 = (j + 1048576) >> 21;
        long j18 = ((b9 >> 5) & 2097151) + j17;
        long j19 = (j8 + 1048576) >> 21;
        long j20 = (j10 + 1048576) >> 21;
        long j21 = (j12 + 1048576) >> 21;
        long j22 = (j3 - (j13 << 21)) + j21;
        long j23 = (j14 + 1048576) >> 21;
        long j24 = (j2 - (j15 << 21)) + j23;
        long j25 = j14 - (j23 << 21);
        long j26 = (j16 + 1048576) >> 21;
        long j27 = (j - (j17 << 21)) + j26;
        long j28 = j16 - (j26 << 21);
        long j29 = ((j6 - (j11 << 21)) + j20) - (j18 * 683901);
        long j30 = ((((j5 - (j9 << 21)) + j19) - (j18 * 997805)) + (j27 * 136657)) - (j28 * 683901);
        long j31 = (((((j4 - (j7 << 21)) + (j18 * 470296)) + (j27 * 654183)) - (j28 * 997805)) + (j24 * 136657)) - (j25 * 683901);
        long j32 = (a & 2097151) + (j22 * 666643);
        long j33 = ((a2 >> 2) & 2097151) + (j24 * 666643) + (j25 * 470296) + (j22 * 654183);
        long j34 = ((((((b3 >> 4) & 2097151) + (j27 * 666643)) + (j28 * 470296)) + (j24 * 654183)) - (j25 * 997805)) + (j22 * 136657);
        long j35 = (j32 + 1048576) >> 21;
        long j36 = ((b >> 5) & 2097151) + (j25 * 666643) + (j22 * 470296) + j35;
        long j37 = (j33 + 1048576) >> 21;
        long j38 = ((((((b2 >> 7) & 2097151) + (j28 * 666643)) + (j24 * 470296)) + (j25 * 654183)) - (j22 * 997805)) + j37;
        long j39 = (j34 + 1048576) >> 21;
        long j40 = ((((((((a3 >> 1) & 2097151) + (j18 * 666643)) + (j27 * 470296)) + (j28 * 654183)) - (j24 * 997805)) + (j25 * 136657)) - (j22 * 683901)) + j39;
        long j41 = (j31 + 1048576) >> 21;
        long j42 = (((((j8 - (j19 << 21)) + (j18 * 654183)) - (j27 * 997805)) + (j28 * 136657)) - (j24 * 683901)) + j41;
        long j43 = (j30 + 1048576) >> 21;
        long j44 = (((j10 - (j20 << 21)) + (j18 * 136657)) - (j27 * 683901)) + j43;
        long j45 = (j29 + 1048576) >> 21;
        long j46 = (j12 - (j21 << 21)) + j45;
        long j47 = (j36 + 1048576) >> 21;
        long j48 = (j38 + 1048576) >> 21;
        long j49 = (j40 + 1048576) >> 21;
        long j50 = (j42 + 1048576) >> 21;
        long j51 = (j44 + 1048576) >> 21;
        long j52 = (j46 + 1048576) >> 21;
        long j53 = (j32 - (j35 << 21)) + (j52 * 666643);
        long j54 = j53 >> 21;
        long j55 = (j36 - (j47 << 21)) + (j52 * 470296) + j54;
        long j56 = j55 >> 21;
        long j57 = (j33 - (j37 << 21)) + j47 + (j52 * 654183) + j56;
        long j58 = j57 >> 21;
        long j59 = ((j38 - (j48 << 21)) - (j52 * 997805)) + j58;
        long j60 = j59 >> 21;
        long j61 = (j34 - (j39 << 21)) + j48 + (j52 * 136657) + j60;
        long j62 = j61 >> 21;
        long j63 = ((j40 - (j49 << 21)) - (j52 * 683901)) + j62;
        long j64 = j63 >> 21;
        long j65 = (j31 - (j41 << 21)) + j49 + j64;
        long j66 = j65 >> 21;
        long j67 = (j42 - (j50 << 21)) + j66;
        long j68 = j67 >> 21;
        long j69 = (j30 - (j43 << 21)) + j50 + j68;
        long j70 = j69 >> 21;
        long j71 = (j44 - (j51 << 21)) + j70;
        long j72 = j71 >> 21;
        long j73 = (j29 - (j45 << 21)) + j51 + j72;
        long j74 = j73 >> 21;
        long j75 = (j46 - (j52 << 21)) + j74;
        long j76 = j75 >> 21;
        long j77 = (j53 - (j54 << 21)) + (666643 * j76);
        long j78 = j77 >> 21;
        long j79 = (j55 - (j56 << 21)) + (470296 * j76) + j78;
        long j80 = j77 - (j78 << 21);
        long j81 = j79 >> 21;
        long j82 = (j57 - (j58 << 21)) + (654183 * j76) + j81;
        long j83 = j79 - (j81 << 21);
        long j84 = j82 >> 21;
        long j85 = ((j59 - (j60 << 21)) - (997805 * j76)) + j84;
        long j86 = j82 - (j84 << 21);
        long j87 = j85 >> 21;
        long j88 = (j61 - (j62 << 21)) + (136657 * j76) + j87;
        long j89 = j85 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = ((j63 - (j64 << 21)) - (683901 * j76)) + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = (j65 - (j66 << 21)) + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = (j67 - (j68 << 21)) + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = (j69 - (j70 << 21)) + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = (j71 - (j72 << 21)) + j102;
        long j104 = j100 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = (j73 - (j74 << 21)) + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = (j75 - (j76 << 21)) + j108;
        long j110 = j106 - (j108 << 21);
        bArr[0] = (byte) ((int) j80);
        bArr[1] = (byte) ((int) (j80 >> 8));
        bArr[2] = (byte) ((int) ((j80 >> 16) | (j83 << 5)));
        bArr[3] = (byte) ((int) (j83 >> 3));
        bArr[4] = (byte) ((int) (j83 >> 11));
        bArr[5] = (byte) ((int) ((j83 >> 19) | (j86 << 2)));
        bArr[6] = (byte) ((int) (j86 >> 6));
        bArr[7] = (byte) ((int) ((j86 >> 14) | (j89 << 7)));
        bArr[8] = (byte) ((int) (j89 >> 1));
        bArr[9] = (byte) ((int) (j89 >> 9));
        bArr[10] = (byte) ((int) ((j89 >> 17) | (j92 << 4)));
        bArr[11] = (byte) ((int) (j92 >> 4));
        bArr[12] = (byte) ((int) (j92 >> 12));
        bArr[13] = (byte) ((int) ((j92 >> 20) | (j95 + j95)));
        bArr[14] = (byte) ((int) (j95 >> 7));
        bArr[15] = (byte) ((int) ((j95 >> 15) | (j98 << 6)));
        bArr[16] = (byte) ((int) (j98 >> 2));
        bArr[17] = (byte) ((int) (j98 >> 10));
        bArr[18] = (byte) ((int) ((j98 >> 18) | (j101 << 3)));
        bArr[19] = (byte) ((int) (j101 >> 5));
        bArr[20] = (byte) ((int) (j101 >> 13));
        bArr[21] = (byte) ((int) j104);
        bArr[22] = (byte) ((int) (j104 >> 8));
        bArr[23] = (byte) ((int) ((j104 >> 16) | (j107 << 5)));
        bArr[24] = (byte) ((int) (j107 >> 3));
        bArr[25] = (byte) ((int) (j107 >> 11));
        bArr[26] = (byte) ((int) ((j107 >> 19) | (j110 << 2)));
        bArr[27] = (byte) ((int) (j110 >> 6));
        bArr[28] = (byte) ((int) ((j110 >> 14) | (j109 << 7)));
        bArr[29] = (byte) ((int) (j109 >> 1));
        bArr[30] = (byte) ((int) (j109 >> 9));
        bArr[31] = (byte) ((int) (j109 >> 17));
    }

    /* renamed from: a */
    private static long m113460a(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    /* renamed from: b */
    public static byte[] m113467b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) bqvo.f141692d.mo69341a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) b;
        digest[31] = (byte) (b | 64);
        return digest;
    }

    /* renamed from: a */
    private static void m113461a(bqvc bqvc, int i, byte b) {
        int i2 = (b & 255) >> 7;
        byte b2 = (-i2) & b;
        int i3 = b - (b2 + b2);
        bqvc.mo69339a(bqvi.f141677b[i][0], m113459a(i3, 1));
        bqvc.mo69339a(bqvi.f141677b[i][1], m113459a(i3, 2));
        bqvc.mo69339a(bqvi.f141677b[i][2], m113459a(i3, 3));
        bqvc.mo69339a(bqvi.f141677b[i][3], m113459a(i3, 4));
        bqvc.mo69339a(bqvi.f141677b[i][4], m113459a(i3, 5));
        bqvc.mo69339a(bqvi.f141677b[i][5], m113459a(i3, 6));
        bqvc.mo69339a(bqvi.f141677b[i][6], m113459a(i3, 7));
        bqvc.mo69339a(bqvi.f141677b[i][7], m113459a(i3, 8));
        long[] copyOf = Arrays.copyOf(bqvc.f141662b, 10);
        long[] copyOf2 = Arrays.copyOf(bqvc.f141661a, 10);
        long[] copyOf3 = Arrays.copyOf(bqvc.f141663c, 10);
        for (int i4 = 0; i4 < copyOf3.length; i4++) {
            copyOf3[i4] = -copyOf3[i4];
        }
        bqvc.mo69339a(new bqvc(copyOf, copyOf2, copyOf3), i2);
    }

    /* renamed from: a */
    private static void m113462a(bqvd bqvd, bqve bqve) {
        long[] jArr = new long[10];
        bqvy.m113504b(bqvd.f141664a.f141666a, bqve.f141666a);
        bqvy.m113504b(bqvd.f141664a.f141668c, bqve.f141667b);
        bqvy.m113504b(bqvd.f141665b, bqve.f141668c);
        long[] jArr2 = bqvd.f141665b;
        bqvy.m113501a(jArr2, jArr2, jArr2);
        bqvy.m113501a(bqvd.f141664a.f141667b, bqve.f141666a, bqve.f141667b);
        bqvy.m113504b(jArr, bqvd.f141664a.f141667b);
        bqve bqve2 = bqvd.f141664a;
        bqvy.m113501a(bqve2.f141667b, bqve2.f141668c, bqve2.f141666a);
        bqve bqve3 = bqvd.f141664a;
        long[] jArr3 = bqve3.f141668c;
        bqvy.m113505b(jArr3, jArr3, bqve3.f141666a);
        bqve bqve4 = bqvd.f141664a;
        bqvy.m113505b(bqve4.f141666a, jArr, bqve4.f141667b);
        long[] jArr4 = bqvd.f141665b;
        bqvy.m113505b(jArr4, jArr4, bqvd.f141664a.f141668c);
    }

    /* renamed from: a */
    private static void m113463a(bqvd bqvd, bqvf bqvf, bqvc bqvc) {
        long[] jArr = new long[10];
        long[] jArr2 = bqvd.f141664a.f141666a;
        bqve bqve = bqvf.f141669a;
        bqvy.m113501a(jArr2, bqve.f141667b, bqve.f141666a);
        long[] jArr3 = bqvd.f141664a.f141667b;
        bqve bqve2 = bqvf.f141669a;
        bqvy.m113505b(jArr3, bqve2.f141667b, bqve2.f141666a);
        long[] jArr4 = bqvd.f141664a.f141667b;
        bqvy.m113506c(jArr4, jArr4, bqvc.f141662b);
        bqve bqve3 = bqvd.f141664a;
        bqvy.m113506c(bqve3.f141668c, bqve3.f141666a, bqvc.f141661a);
        bqvy.m113506c(bqvd.f141665b, bqvf.f141670b, bqvc.f141663c);
        System.arraycopy(bqvf.f141669a.f141668c, 0, bqvd.f141664a.f141666a, 0, 10);
        long[] jArr5 = bqvd.f141664a.f141666a;
        bqvy.m113501a(jArr, jArr5, jArr5);
        bqve bqve4 = bqvd.f141664a;
        bqvy.m113505b(bqve4.f141666a, bqve4.f141668c, bqve4.f141667b);
        bqve bqve5 = bqvd.f141664a;
        long[] jArr6 = bqve5.f141667b;
        bqvy.m113501a(jArr6, bqve5.f141668c, jArr6);
        bqvy.m113501a(bqvd.f141664a.f141668c, jArr, bqvd.f141665b);
        long[] jArr7 = bqvd.f141665b;
        bqvy.m113505b(jArr7, jArr, jArr7);
    }

    /* renamed from: a */
    public static byte[] m113464a(byte[] bArr) {
        return m113468c(bArr).mo69340a();
    }

    /* renamed from: a */
    static byte[] m113465a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest messageDigest = (MessageDigest) bqvo.f141692d.mo69341a("SHA-512");
        messageDigest.update(bArr3, 32, 32);
        messageDigest.update(copyOfRange);
        byte[] digest = messageDigest.digest();
        m113469d(digest);
        byte[] copyOfRange2 = Arrays.copyOfRange(m113468c(digest).mo69340a(), 0, 32);
        messageDigest.reset();
        messageDigest.update(copyOfRange2);
        messageDigest.update(bArr2);
        messageDigest.update(copyOfRange);
        byte[] digest2 = messageDigest.digest();
        m113469d(digest2);
        long a = m113460a(digest2, 0) & 2097151;
        long b = (m113466b(digest2, 2) >> 5) & 2097151;
        long a2 = (m113460a(digest2, 5) >> 2) & 2097151;
        long b2 = (m113466b(digest2, 7) >> 7) & 2097151;
        long b3 = (m113466b(digest2, 10) >> 4) & 2097151;
        long a3 = (m113460a(digest2, 13) >> 1) & 2097151;
        long b4 = (m113466b(digest2, 15) >> 6) & 2097151;
        long a4 = m113460a(digest2, 18) >> 3;
        long a5 = m113460a(digest2, 21) & 2097151;
        long b5 = (m113466b(digest2, 23) >> 5) & 2097151;
        long a6 = (m113460a(digest2, 26) >> 2) & 2097151;
        long b6 = m113466b(digest2, 28) >> 7;
        long a7 = m113460a(bArr3, 0) & 2097151;
        long b7 = (m113466b(bArr3, 2) >> 5) & 2097151;
        long a8 = (m113460a(bArr3, 5) >> 2) & 2097151;
        long b8 = (m113466b(bArr3, 7) >> 7) & 2097151;
        long b9 = (m113466b(bArr3, 10) >> 4) & 2097151;
        long a9 = (m113460a(bArr3, 13) >> 1) & 2097151;
        long b10 = (m113466b(bArr3, 15) >> 6) & 2097151;
        long a10 = m113460a(bArr3, 18) >> 3;
        long a11 = m113460a(bArr3, 21) & 2097151;
        long b11 = (m113466b(bArr3, 23) >> 5) & 2097151;
        long a12 = (m113460a(bArr3, 26) >> 2) & 2097151;
        long b12 = m113466b(bArr3, 28) >> 7;
        long a13 = m113460a(digest, 0);
        long b13 = m113466b(digest, 2);
        long a14 = m113460a(digest, 5);
        long b14 = m113466b(digest, 7);
        long b15 = m113466b(digest, 10);
        long a15 = m113460a(digest, 13);
        long b16 = m113466b(digest, 15);
        long a16 = m113460a(digest, 18);
        long a17 = m113460a(digest, 21);
        long b17 = m113466b(digest, 23);
        long j = (a13 & 2097151) + (a * a7);
        long j2 = ((a14 >> 2) & 2097151) + (a * a8) + (b * b7) + (a2 * a7);
        long j3 = ((b15 >> 4) & 2097151) + (a * b9) + (b * b8) + (a2 * a8) + (b2 * b7) + (b3 * a7);
        long j4 = ((b16 >> 6) & 2097151) + (a * b10) + (b * a9) + (a2 * b9) + (b2 * b8) + (b3 * a8) + (a3 * b7) + (b4 * a7);
        long j5 = (a17 & 2097151) + (a * a11) + (b * a10) + (a2 * b10) + (b2 * a9) + (b3 * b9) + (a3 * b8) + (b4 * a8) + (a4 * b7) + (a5 * a7);
        long a18 = ((m113460a(digest, 26) >> 2) & 2097151) + (a * a12) + (b * b11) + (a2 * a11) + (b2 * a10) + (b3 * b10) + (a3 * a9) + (b4 * b9) + (a4 * b8) + (a5 * a8) + (b5 * b7) + (a6 * a7);
        long j6 = (b * b12) + (a2 * a12) + (b2 * b11) + (b3 * a11) + (a3 * a10) + (b4 * b10) + (a4 * a9) + (a5 * b9) + (b5 * b8) + (a6 * a8) + (b6 * b7);
        long j7 = (b2 * b12) + (b3 * a12) + (a3 * b11) + (b4 * a11) + (a4 * a10) + (a5 * b10) + (b5 * a9) + (a6 * b9) + (b6 * b8);
        long j8 = (a3 * b12) + (b4 * a12) + (a4 * b11) + (a5 * a11) + (b5 * a10) + (a6 * b10) + (b6 * a9);
        long j9 = (a4 * b12) + (a5 * a12) + (b5 * b11) + (a6 * a11) + (b6 * a10);
        long j10 = (b5 * b12) + (a6 * a12) + (b6 * b11);
        long j11 = b6 * b12;
        long j12 = (j + 1048576) >> 21;
        long j13 = ((b13 >> 5) & 2097151) + (a * b7) + (b * a7) + j12;
        long j14 = (j2 + 1048576) >> 21;
        long j15 = ((b14 >> 7) & 2097151) + (a * b8) + (b * a8) + (a2 * b7) + (b2 * a7) + j14;
        long j16 = (j3 + 1048576) >> 21;
        long j17 = ((a15 >> 1) & 2097151) + (a * a9) + (b * b9) + (a2 * b8) + (b2 * a8) + (b3 * b7) + (a3 * a7) + j16;
        long j18 = (j4 + 1048576) >> 21;
        long j19 = (a16 >> 3) + (a * a10) + (b * b10) + (a2 * a9) + (b2 * b9) + (b3 * b8) + (a3 * a8) + (b4 * b7) + (a4 * a7) + j18;
        long j20 = (j5 + 1048576) >> 21;
        long j21 = ((b17 >> 5) & 2097151) + (a * b11) + (b * a11) + (a2 * a10) + (b2 * b10) + (b3 * a9) + (a3 * b9) + (b4 * b8) + (a4 * a8) + (a5 * b7) + (b5 * a7) + j20;
        long j22 = (a18 + 1048576) >> 21;
        long b18 = (m113466b(digest, 28) >> 7) + (a * b12) + (b * a12) + (a2 * b11) + (b2 * a11) + (b3 * a10) + (a3 * b10) + (b4 * a9) + (a4 * b9) + (a5 * b8) + (b5 * a8) + (b7 * a6) + (a7 * b6) + j22;
        long j23 = (j6 + 1048576) >> 21;
        long j24 = (a2 * b12) + (b2 * a12) + (b3 * b11) + (a3 * a11) + (b4 * a10) + (a4 * b10) + (a5 * a9) + (b5 * b9) + (b8 * a6) + (a8 * b6) + j23;
        long j25 = (j7 + 1048576) >> 21;
        long j26 = (b3 * b12) + (a3 * a12) + (b4 * b11) + (a4 * a11) + (a5 * a10) + (b5 * b10) + (a9 * a6) + (b9 * b6) + j25;
        long j27 = (j8 + 1048576) >> 21;
        long j28 = (b4 * b12) + (a4 * a12) + (a5 * b11) + (b5 * a11) + (a10 * a6) + (b10 * b6) + j27;
        long j29 = (j9 + 1048576) >> 21;
        long j30 = (a5 * b12) + (b5 * a12) + (b11 * a6) + (a11 * b6) + j29;
        long j31 = (j10 + 1048576) >> 21;
        long j32 = (a6 * b12) + (b6 * a12) + j31;
        long j33 = (j11 + 1048576) >> 21;
        long j34 = (j13 + 1048576) >> 21;
        long j35 = (j15 + 1048576) >> 21;
        long j36 = (j17 + 1048576) >> 21;
        long j37 = (j19 + 1048576) >> 21;
        long j38 = (j21 + 1048576) >> 21;
        long j39 = (b18 + 1048576) >> 21;
        long j40 = (j24 + 1048576) >> 21;
        long j41 = (j26 + 1048576) >> 21;
        long j42 = (j28 + 1048576) >> 21;
        long j43 = (j9 - (j29 << 21)) + j42;
        long j44 = (j30 + 1048576) >> 21;
        long j45 = (j10 - (j31 << 21)) + j44;
        long j46 = j30 - (j44 << 21);
        long j47 = (j32 + 1048576) >> 21;
        long j48 = (j11 - (j33 << 21)) + j47;
        long j49 = j32 - (j47 << 21);
        long j50 = ((j8 - (j27 << 21)) + j41) - (j33 * 683901);
        long j51 = ((((j7 - (j25 << 21)) + j40) - (j33 * 997805)) + (j48 * 136657)) - (j49 * 683901);
        long j52 = ((((((j6 - (j23 << 21)) + j39) + (j33 * 470296)) + (j48 * 654183)) - (j49 * 997805)) + (j45 * 136657)) - (j46 * 683901);
        long j53 = (j4 - (j18 << 21)) + j36 + (j43 * 666643);
        long j54 = (j5 - (j20 << 21)) + j37 + (j45 * 666643) + (j46 * 470296) + (j43 * 654183);
        long j55 = ((((((a18 - (j22 << 21)) + j38) + (j48 * 666643)) + (j49 * 470296)) + (j45 * 654183)) - (j46 * 997805)) + (j43 * 136657);
        long j56 = (j53 + 1048576) >> 21;
        long j57 = (j19 - (j37 << 21)) + (j46 * 666643) + (j43 * 470296) + j56;
        long j58 = (j54 + 1048576) >> 21;
        long j59 = (((((j21 - (j38 << 21)) + (j49 * 666643)) + (j45 * 470296)) + (j46 * 654183)) - (j43 * 997805)) + j58;
        long j60 = (j55 + 1048576) >> 21;
        long j61 = (((((((b18 - (j39 << 21)) + (j33 * 666643)) + (j48 * 470296)) + (j49 * 654183)) - (j45 * 997805)) + (j46 * 136657)) - (j43 * 683901)) + j60;
        long j62 = (j52 + 1048576) >> 21;
        long j63 = (((((j24 - (j40 << 21)) + (j33 * 654183)) - (j48 * 997805)) + (j49 * 136657)) - (j45 * 683901)) + j62;
        long j64 = (j51 + 1048576) >> 21;
        long j65 = (((j26 - (j41 << 21)) + (j33 * 136657)) - (j48 * 683901)) + j64;
        long j66 = (j50 + 1048576) >> 21;
        long j67 = (j28 - (j42 << 21)) + j66;
        long j68 = (j57 + 1048576) >> 21;
        long j69 = (j59 + 1048576) >> 21;
        long j70 = (j61 + 1048576) >> 21;
        long j71 = (j52 - (j62 << 21)) + j70;
        long j72 = (j63 + 1048576) >> 21;
        long j73 = (j51 - (j64 << 21)) + j72;
        long j74 = j63 - (j72 << 21);
        long j75 = (j65 + 1048576) >> 21;
        long j76 = (j50 - (j66 << 21)) + j75;
        long j77 = j65 - (j75 << 21);
        long j78 = ((j55 - (j60 << 21)) + j69) - (j67 * 683901);
        long j79 = ((((j54 - (j58 << 21)) + j68) - (j67 * 997805)) + (j76 * 136657)) - (j77 * 683901);
        long j80 = (((((j53 - (j56 << 21)) + (j67 * 470296)) + (j76 * 654183)) - (j77 * 997805)) + (j73 * 136657)) - (j74 * 683901);
        long j81 = (j - (j12 << 21)) + (j71 * 666643);
        long j82 = (j2 - (j14 << 21)) + j34 + (j73 * 666643) + (j74 * 470296) + (j71 * 654183);
        long j83 = ((((((j3 - (j16 << 21)) + j35) + (j76 * 666643)) + (j77 * 470296)) + (j73 * 654183)) - (j74 * 997805)) + (j71 * 136657);
        long j84 = (j81 + 1048576) >> 21;
        long j85 = (j13 - (j34 << 21)) + (j74 * 666643) + (j71 * 470296) + j84;
        long j86 = (j82 + 1048576) >> 21;
        long j87 = (((((j15 - (j35 << 21)) + (j77 * 666643)) + (j73 * 470296)) + (j74 * 654183)) - (j71 * 997805)) + j86;
        long j88 = (j83 + 1048576) >> 21;
        long j89 = (((((((j17 - (j36 << 21)) + (j67 * 666643)) + (j76 * 470296)) + (j77 * 654183)) - (j73 * 997805)) + (j74 * 136657)) - (j71 * 683901)) + j88;
        long j90 = (j80 + 1048576) >> 21;
        long j91 = (((((j57 - (j68 << 21)) + (j67 * 654183)) - (j76 * 997805)) + (j77 * 136657)) - (j73 * 683901)) + j90;
        long j92 = (j79 + 1048576) >> 21;
        long j93 = (((j59 - (j69 << 21)) + (j67 * 136657)) - (j76 * 683901)) + j92;
        long j94 = (j78 + 1048576) >> 21;
        long j95 = (j61 - (j70 << 21)) + j94;
        long j96 = (j85 + 1048576) >> 21;
        long j97 = (j87 + 1048576) >> 21;
        long j98 = (j89 + 1048576) >> 21;
        long j99 = (j91 + 1048576) >> 21;
        long j100 = (j93 + 1048576) >> 21;
        long j101 = (j95 + 1048576) >> 21;
        long j102 = (j81 - (j84 << 21)) + (j101 * 666643);
        long j103 = j102 >> 21;
        long j104 = (j85 - (j96 << 21)) + (j101 * 470296) + j103;
        long j105 = j104 >> 21;
        long j106 = (j82 - (j86 << 21)) + j96 + (j101 * 654183) + j105;
        long j107 = j106 >> 21;
        long j108 = ((j87 - (j97 << 21)) - (j101 * 997805)) + j107;
        long j109 = j108 >> 21;
        long j110 = (j83 - (j88 << 21)) + j97 + (j101 * 136657) + j109;
        long j111 = j110 >> 21;
        long j112 = ((j89 - (j98 << 21)) - (j101 * 683901)) + j111;
        long j113 = j112 >> 21;
        long j114 = (j80 - (j90 << 21)) + j98 + j113;
        long j115 = j114 >> 21;
        long j116 = (j91 - (j99 << 21)) + j115;
        long j117 = j116 >> 21;
        long j118 = (j79 - (j92 << 21)) + j99 + j117;
        long j119 = j118 >> 21;
        long j120 = (j93 - (j100 << 21)) + j119;
        long j121 = j120 >> 21;
        long j122 = (j78 - (j94 << 21)) + j100 + j121;
        long j123 = j122 >> 21;
        long j124 = (j95 - (j101 << 21)) + j123;
        long j125 = j124 >> 21;
        long j126 = (j102 - (j103 << 21)) + (666643 * j125);
        long j127 = j126 >> 21;
        long j128 = (j104 - (j105 << 21)) + (470296 * j125) + j127;
        long j129 = j126 - (j127 << 21);
        long j130 = j128 >> 21;
        long j131 = (j106 - (j107 << 21)) + (654183 * j125) + j130;
        long j132 = j128 - (j130 << 21);
        long j133 = j131 >> 21;
        long j134 = ((j108 - (j109 << 21)) - (997805 * j125)) + j133;
        long j135 = j131 - (j133 << 21);
        long j136 = j134 >> 21;
        long j137 = (j110 - (j111 << 21)) + (136657 * j125) + j136;
        long j138 = j134 - (j136 << 21);
        long j139 = j137 >> 21;
        long j140 = ((j112 - (j113 << 21)) - (683901 * j125)) + j139;
        long j141 = j137 - (j139 << 21);
        long j142 = j140 >> 21;
        long j143 = (j114 - (j115 << 21)) + j142;
        long j144 = j140 - (j142 << 21);
        long j145 = j143 >> 21;
        long j146 = (j116 - (j117 << 21)) + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = (j118 - (j119 << 21)) + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = (j120 - (j121 << 21)) + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = (j122 - (j123 << 21)) + j154;
        long j156 = j152 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = (j124 - (j125 << 21)) + j157;
        long j159 = j155 - (j157 << 21);
        return bqup.m113434a(copyOfRange2, new byte[]{(byte) ((int) j129), (byte) ((int) (j129 >> 8)), (byte) ((int) ((j129 >> 16) | (j132 << 5))), (byte) ((int) (j132 >> 3)), (byte) ((int) (j132 >> 11)), (byte) ((int) ((j132 >> 19) | (j135 << 2))), (byte) ((int) (j135 >> 6)), (byte) ((int) ((j135 >> 14) | (j138 << 7))), (byte) ((int) (j138 >> 1)), (byte) ((int) (j138 >> 9)), (byte) ((int) ((j138 >> 17) | (j141 << 4))), (byte) ((int) (j141 >> 4)), (byte) ((int) (j141 >> 12)), (byte) ((int) ((j141 >> 20) | (j144 + j144))), (byte) ((int) (j144 >> 7)), (byte) ((int) ((j144 >> 15) | (j147 << 6))), (byte) ((int) (j147 >> 2)), (byte) ((int) (j147 >> 10)), (byte) ((int) ((j147 >> 18) | (j150 << 3))), (byte) ((int) (j150 >> 5)), (byte) ((int) (j150 >> 13)), (byte) ((int) j153), (byte) ((int) (j153 >> 8)), (byte) ((int) ((j153 >> 16) | (j156 << 5))), (byte) ((int) (j156 >> 3)), (byte) ((int) (j156 >> 11)), (byte) ((int) ((j156 >> 19) | (j159 << 2))), (byte) ((int) (j159 >> 6)), (byte) ((int) ((j159 >> 14) | (j158 << 7))), (byte) ((int) (j158 >> 1)), (byte) ((int) (j158 >> 9)), (byte) ((int) (j158 >> 17))});
    }
}
