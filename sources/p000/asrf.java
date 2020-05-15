package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: asrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrf implements asqs {

    /* renamed from: b */
    private static final srn f89496b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public atci f89497a;

    /* renamed from: c */
    private final asqq f89498c;

    /* renamed from: d */
    private final byte[] f89499d;

    /* renamed from: e */
    private final String f89500e;

    /* renamed from: f */
    private bit f89501f;

    /* renamed from: g */
    private final asqu f89502g;

    /* renamed from: h */
    private int f89503h = 12;

    /* renamed from: i */
    private long f89504i;

    /* renamed from: j */
    private boolean f89505j = false;

    /* renamed from: k */
    private boolean f89506k = false;

    public asrf(atci atci, asqq asqq, byte[] bArr, String str) {
        this.f89497a = atci;
        this.f89498c = asqq;
        this.f89499d = bArr;
        this.f89500e = str;
        asqu asqu = new asqu();
        this.f89502g = asqu;
        asqu.f89416l = bozu.AMEX_MSD;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bji.a(byte[], int, short):short
     arg types: [byte[], int, int]
     candidates:
      bji.a(byte[], int, byte):byte
      bji.a(byte[], int, long):int
      bji.a(byte[], int, short):short */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bji.a(byte[], int, short):short
     arg types: [byte[], byte, short]
     candidates:
      bji.a(byte[], int, byte):byte
      bji.a(byte[], int, long):int
      bji.a(byte[], int, short):short */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x036b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x036c, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03a7, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0494, code lost:
        if (r4.f3345a[17] == -121) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x051c, code lost:
        if (r9 != null) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        r4 = r0;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        r4 = r0;
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0792, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0928, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x092f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0932, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x09ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x09bb, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0a10, code lost:
        if (r8 != 5) goto L_0x0a20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0a18, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0ad3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0b14, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0b49, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0b4d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0b4f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0b50, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0b52, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0b53, code lost:
        r6 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0b58, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0b8c, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x0bb9, code lost:
        if (r2.equals("03") != false) goto L_0x0c03;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:332:0x058d, B:447:0x07a9] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:512:0x087a, B:562:0x093b] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:512:0x087a] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:579:0x0976, B:588:0x0996] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:579:0x0976] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:610:0x0a02] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:163:0x02bc, B:623:0x0a1e] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02ea A[Catch:{ bic -> 0x03a6, Exception -> 0x03a3, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04ab A[Catch:{ bic -> 0x0714, Exception -> 0x0711, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x04c1 A[Catch:{ bic -> 0x0714, Exception -> 0x0711, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04c2 A[Catch:{ bic -> 0x0714, Exception -> 0x0711, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x052e A[Catch:{ bic -> 0x0714, Exception -> 0x0711, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0662 A[Catch:{ bic -> 0x0714, Exception -> 0x0711, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0665 A[Catch:{ bic -> 0x0714, Exception -> 0x0711, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0691 A[Catch:{ bic -> 0x0792, Exception -> 0x092a, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06bf A[Catch:{ bic -> 0x0792, Exception -> 0x092a, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06fd A[Catch:{ bic -> 0x0792, Exception -> 0x092a, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:556:0x092a A[ExcHandler: Exception (e java.lang.Exception), PHI: r23 10  PHI: (r23v24 bij) = (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij) binds: [B:447:0x07a9, B:466:0x07f3, B:503:0x085f, B:491:0x083e, B:492:?, B:484:0x0830, B:475:0x0810, B:463:0x07eb, B:163:0x02bc, B:332:0x058d, B:333:?, B:381:0x0675] A[DONT_GENERATE, DONT_INLINE], Splitter:B:332:0x058d] */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x09f4 A[Catch:{ bic -> 0x0ad3, Exception -> 0x0ad0, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x09f5 A[Catch:{ bic -> 0x0ad3, Exception -> 0x0ad0, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:610:0x0a02 A[SYNTHETIC, Splitter:B:610:0x0a02] */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0a1b  */
    /* JADX WARNING: Removed duplicated region for block: B:627:0x0a2f A[Catch:{ bic -> 0x0b4d, Exception -> 0x0b4b, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:628:0x0a39 A[Catch:{ bic -> 0x0b4d, Exception -> 0x0b4b, all -> 0x0b49 }] */
    /* JADX WARNING: Removed duplicated region for block: B:660:0x0ad0 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:579:0x0976] */
    /* JADX WARNING: Removed duplicated region for block: B:678:0x0b12 A[Catch:{ bic -> 0x0b4d, Exception -> 0x0b4b, all -> 0x0b49 }, ExcHandler: Exception (e java.lang.Exception), PHI: r23 10  PHI: (r23v21 bij) = (r23v22 bij), (r23v25 bij) binds: [B:562:0x093b, B:512:0x087a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:512:0x087a] */
    /* JADX WARNING: Removed duplicated region for block: B:689:0x0b49 A[ExcHandler: all (th java.lang.Throwable), PHI: r23 10  PHI: (r23v20 bij) = (r23v22 bij), (r23v22 bij), (r23v22 bij), (r23v22 bij), (r23v22 bij), (r23v22 bij), (r23v22 bij), (r23v22 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v25 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij), (r23v43 bij) binds: [B:562:0x093b, B:579:0x0976, B:623:0x0a1e, B:610:0x0a02, B:611:?, B:599:0x09cb, B:588:0x0996, B:663:0x0ad7, B:447:0x07a9, B:466:0x07f3, B:503:0x085f, B:512:0x087a, B:491:0x083e, B:492:?, B:484:0x0830, B:475:0x0810, B:463:0x07eb, B:163:0x02bc, B:281:0x04de, B:282:?, B:312:0x0550, B:320:0x056b, B:329:0x0585, B:330:?, B:332:0x058d, B:333:?, B:354:0x05d5, B:355:?, B:361:0x05e9, B:381:0x0675, B:372:0x0642, B:369:0x05ff, B:370:?, B:358:0x05db, B:359:?, B:346:0x05c7, B:347:?, B:351:0x05d1, B:352:?, B:340:0x059d, B:327:0x057e, B:328:?, B:315:0x0556, B:309:0x0546, B:310:?, B:289:0x04f8, B:290:?, B:297:0x050f, B:294:0x0501, B:286:0x04e9, B:275:0x04cd, B:252:0x046e, B:260:0x0496, B:256:0x048e, B:257:?, B:239:0x03ea, B:230:0x03d5, B:231:?, B:228:0x03c7, B:229:?, B:224:0x03b9, B:225:?, B:192:0x0347, B:193:?, B:194:0x0349, B:171:0x02da] A[DONT_GENERATE, DONT_INLINE], Splitter:B:163:0x02bc] */
    /* JADX WARNING: Removed duplicated region for block: B:692:0x0b4f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:40:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0b57 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:23:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:719:0x0b8c  */
    /* JADX WARNING: Removed duplicated region for block: B:723:0x0ba3  */
    /* JADX WARNING: Removed duplicated region for block: B:750:0x0bf8  */
    /* JADX WARNING: Removed duplicated region for block: B:755:0x0c06  */
    /* JADX WARNING: Removed duplicated region for block: B:756:0x0c08  */
    /* JADX WARNING: Removed duplicated region for block: B:757:0x0c0b  */
    /* JADX WARNING: Removed duplicated region for block: B:758:0x0c0e  */
    /* JADX WARNING: Removed duplicated region for block: B:759:0x0c11  */
    /* JADX WARNING: Removed duplicated region for block: B:760:0x0c13  */
    /* JADX WARNING: Removed duplicated region for block: B:761:0x0c16  */
    /* JADX WARNING: Removed duplicated region for block: B:764:0x0c1e  */
    /* JADX WARNING: Removed duplicated region for block: B:771:0x0c63  */
    /* JADX WARNING: Removed duplicated region for block: B:774:0x0c7c  */
    /* JADX WARNING: Removed duplicated region for block: B:783:0x0ca2  */
    /* JADX WARNING: Removed duplicated region for block: B:792:0x0ccb  */
    /* JADX WARNING: Removed duplicated region for block: B:798:0x0ce1  */
    /* JADX WARNING: Removed duplicated region for block: B:799:0x0ce6  */
    /* JADX WARNING: Removed duplicated region for block: B:802:0x0cec  */
    /* JADX WARNING: Removed duplicated region for block: B:803:0x0cf3  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:466:0x07f3=Splitter:B:466:0x07f3, B:579:0x0976=Splitter:B:579:0x0976, B:224:0x03b9=Splitter:B:224:0x03b9, B:512:0x087a=Splitter:B:512:0x087a} */
    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        bij bij;
        Throwable th;
        bic bic;
        bin bin;
        byte b;
        bij bij2;
        int hashCode;
        int i;
        String str;
        byte[] bArr2;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        byte[] bArr3;
        byte[] a;
        byte b2;
        byte[] bArr4;
        boolean z3;
        short s;
        int i4;
        boolean z4;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        int i5;
        byte b8;
        astc b9;
        byte[] bArr10 = bArr;
        if (!this.f89506k && (b9 = astc.m74748b(bArr)) != null) {
            this.f89506k = true;
            boolean a2 = b9.mo49454a(astc.f89640j);
            this.f89502g.f89411g = a2;
            if (a2) {
                if (!this.f89498c.mo49382a()) {
                    this.f89505j = true;
                }
            } else if (!this.f89498c.mo49382a()) {
                this.f89503h = 21;
                return astf.m74756a(new byte[0], 0);
            }
        }
        if (this.f89501f == null) {
            bii bii = !this.f89498c.mo49383b() ? bii.TAP_PAYMENT : bii.PAYMENT;
            try {
                bit a3 = atce.m75534a(this.f89497a);
                this.f89501f = a3;
                a3.mo3166a(bii, "ignored");
                bnsl a4 = f89496b.mo26019b(aske.m74275a());
                a4.mo68432a("asrf", "a", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                a4.mo68405a("Start transaction");
            } catch (atcz e) {
                throw new IllegalStateException("SDK locked for 10 seconds during payment", e);
            }
        }
        bin bin2 = bib.f3271a;
        bij bij3 = new bij();
        short s2 = 5;
        try {
            if (biw.OPERATION.f3341b != null) {
                if (!biw.OPERATION.f3341b.equals(bii.PAYMENT)) {
                    if (!biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT)) {
                    }
                }
                try {
                    if (bArr10.length >= 4) {
                        big big = new big(bArr10);
                        int i6 = big.f3292a;
                        if (i6 != 0) {
                            if (i6 != 128) {
                                throw new bic((short) 28160);
                            }
                        }
                        int a5 = bji.m3195a(bArr10, 0);
                        new bij();
                        bix a6 = biy.m3166a();
                        if (a5 == 164) {
                            bij2 = bij3;
                            a6.f3347c[14] = 35;
                            bix a7 = biy.m3166a();
                            byte[] bArr11 = a7.f3347c;
                            if (bArr11[14] == 35) {
                                bArr11[14] = -91;
                                bij = new bij();
                                int i7 = big.f3294c;
                                if ((i7 & 2) != 2) {
                                    if (big.f3293b == 4) {
                                        if (i7 == 0) {
                                            int i8 = big.f3295d;
                                            if (i8 >= 5) {
                                                if (i8 <= 16) {
                                                    int i9 = big.f3297f;
                                                    s2 = 3;
                                                    if (i9 == 3 || i9 == 4) {
                                                        byte b10 = a7.f3347c[15];
                                                        if (bji.m3193a(big.f3296e, bja.f3359a, 0, big.f3295d) == 92) {
                                                            if (b10 == 51) {
                                                                a = a7.mo3177a(73497);
                                                            } else if (b10 != -54) {
                                                                a = a7.mo3177a(73496);
                                                            } else {
                                                                a = a7.mo3177a(73498);
                                                            }
                                                            byte[] bArr12 = a7.f3347c;
                                                            bArr12[16] = 0;
                                                            bArr12[17] = 86;
                                                        } else if (b10 != 0) {
                                                            if (b10 == 51 || b10 == -54) {
                                                                if (bji.m3193a(big.f3296e, a7.mo3177a(73474), 0, big.f3295d) == 92) {
                                                                    bArr3 = a7.mo3177a(73486);
                                                                    a7.f3347c[16] = 51;
                                                                    if (a7.mo3181c() != 0) {
                                                                        a7.mo3191h(4);
                                                                    }
                                                                    b2 = a7.f3346b[6];
                                                                    if (b2 == 4) {
                                                                        if (a7.f3345a[11] != 4) {
                                                                            if (b2 != 2) {
                                                                            }
                                                                        }
                                                                    }
                                                                    bij.f3317b = 25219;
                                                                    a7.f3347c[17] = -104;
                                                                    if (a7.mo3180b(73473)) {
                                                                        byte[] bArr13 = a7.f3347c;
                                                                        bArr13[38] = (byte) (bArr13[38] | 1);
                                                                    } else {
                                                                        byte[] bArr14 = a7.f3347c;
                                                                        if (bArr14[16] == 51) {
                                                                            bArr14[38] = (byte) (bArr14[38] | 2);
                                                                        } else {
                                                                            bArr14[38] = (byte) (bArr14[38] | 1);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (b10 == 84 || b10 == -54) {
                                                                if (bji.m3193a(big.f3296e, a7.mo3177a(73473), 0, big.f3295d) == 92) {
                                                                    bArr3 = a7.mo3177a(73487);
                                                                    a7.f3347c[16] = 84;
                                                                    if (a7.mo3181c() != 0) {
                                                                    }
                                                                    b2 = a7.f3346b[6];
                                                                    if (b2 == 4) {
                                                                    }
                                                                    bij.f3317b = 25219;
                                                                    a7.f3347c[17] = -104;
                                                                    if (a7.mo3180b(73473)) {
                                                                    }
                                                                }
                                                            }
                                                            if (a7.f3347c[15] != 51) {
                                                                throw new bic((short) 27266);
                                                            }
                                                            throw new bic(27266, bib.f3272b);
                                                        } else {
                                                            throw new bic((short) 27266);
                                                        }
                                                        bij.f3316a = bArr3;
                                                    } else {
                                                        throw new bic((short) 26368);
                                                    }
                                                }
                                            }
                                            throw new bic((short) 26368);
                                        }
                                    }
                                    throw new bic((short) 27270);
                                }
                                throw new bic((short) 27266);
                            }
                            throw new bic(bib.f3276f);
                        } else if (a5 == 178) {
                            bij2 = bij3;
                            a6.f3347c[14] = -33;
                            int i10 = big.f3294c >> 3;
                            byte b11 = (byte) big.f3293b;
                            bix a8 = biy.m3166a();
                            byte[] bArr15 = a8.f3347c;
                            if (bArr15[14] == -33) {
                                bArr15[14] = -91;
                                bij bij4 = new bij();
                                byte b12 = a8.f3346b[6];
                                if (b12 != 4) {
                                    if (b12 != 5) {
                                        if (b12 != 2) {
                                            byte b13 = a8.f3347c[17];
                                            if (b13 == -104 || b13 == -94 || b13 == -59) {
                                                if ((big.f3294c & 7) == 4) {
                                                    if (big.f3293b != 0) {
                                                        if (big.f3297f == 2) {
                                                            bix a9 = biy.m3166a();
                                                            if (!a9.mo3184d(335617)) {
                                                                byte b14 = a9.f3345a[17];
                                                                if (b14 != -94) {
                                                                    if (b14 != 19) {
                                                                        bArr4 = a9.mo3177a(73480);
                                                                    }
                                                                }
                                                                bArr4 = a9.mo3177a(73476);
                                                            } else {
                                                                bArr4 = a9.mo3182c(335617);
                                                            }
                                                            if (bArr4 != null) {
                                                                s2 = 27266;
                                                                int i11 = 0;
                                                                while (true) {
                                                                    if (i11 >= bArr4.length) {
                                                                        break;
                                                                    }
                                                                    int i12 = i11 + 1;
                                                                    byte b15 = bArr4[i11];
                                                                    int i13 = i12 + 1;
                                                                    byte b16 = bArr4[i12];
                                                                    byte b17 = bArr4[i13];
                                                                    if (i10 == (b15 >> 3)) {
                                                                        if (b11 >= b16 && b11 <= b17) {
                                                                            s2 = -28672;
                                                                            break;
                                                                        }
                                                                        s2 = 27267;
                                                                    }
                                                                    i11 = i13 + 2;
                                                                }
                                                                if (s2 == -28672) {
                                                                    int a10 = bji.m3194a((byte) i10, b11);
                                                                    if (a10 != 257) {
                                                                        z3 = false;
                                                                    } else if (a8.f3347c[27] == 19) {
                                                                        a10 = 8449;
                                                                        z3 = false;
                                                                    } else {
                                                                        a10 = 8450;
                                                                        z3 = true;
                                                                    }
                                                                    byte[] a11 = a8.mo3177a(a10);
                                                                    if (a11 != null) {
                                                                        if (z3 && bjf.m3184a(4, 1) == 92) {
                                                                            byte[] bArr16 = a8.f3347c;
                                                                            if (bArr16[23] == 92) {
                                                                                byte b18 = bArr16[24];
                                                                                short s3 = b18 != -73 ? (b18 == 69 || b18 == 105) ? (short) 1831 : 1825 : 1832;
                                                                                byte[] bArr17 = a8.f3345a;
                                                                                byte b19 = bArr17[22];
                                                                                byte b20 = bArr17[23];
                                                                                short a12 = (short) bji.m3195a(a11, b19);
                                                                                if (b20 != 92) {
                                                                                    s = (short) (((short) (a12 & -4096)) | s3);
                                                                                } else {
                                                                                    s = (a12 & 15) | (s3 << 4);
                                                                                }
                                                                                bji.m3202a(a11, (int) b19, (short) s);
                                                                            }
                                                                        }
                                                                        bij4.f3316a = a11;
                                                                        bij = bij4;
                                                                        s2 = 3;
                                                                    } else {
                                                                        throw new bic((short) 27266);
                                                                    }
                                                                } else {
                                                                    throw new bic(s2);
                                                                }
                                                            } else {
                                                                throw new bic((short) 27266);
                                                            }
                                                        } else {
                                                            throw new bic((short) 26368);
                                                        }
                                                    }
                                                }
                                                throw new bic((short) 27270);
                                            }
                                            throw new bic((short) 27013);
                                        }
                                    }
                                    throw new bic((short) 27013);
                                }
                                throw new bic((short) 27014);
                            }
                            throw new bic(bib.f3276f);
                        } else if (a5 == 32936) {
                            a6.f3347c[14] = 86;
                            bix a13 = biy.m3166a();
                            byte[] bArr18 = a13.f3347c;
                            if (bArr18[14] == 86) {
                                bArr18[14] = -91;
                                bij bij5 = new bij();
                                byte b21 = a13.f3346b[6];
                                if (b21 != 4) {
                                    if (b21 != 5) {
                                        if (b21 != 2) {
                                            if (a13.f3347c[17] == -104) {
                                                if (big.f3293b == 0) {
                                                    if (big.f3294c == 0) {
                                                        int i14 = big.f3297f;
                                                        if (i14 != 3) {
                                                            if (i14 != 4) {
                                                                throw new bic((short) 26368);
                                                            }
                                                        }
                                                        byte[] bArr19 = big.f3296e;
                                                        if (bArr19[0] == -125) {
                                                            if (bArr19[1] + 2 == big.f3295d) {
                                                                byte[] a14 = a13.mo3177a(73481);
                                                                if (a13.f3347c[16] == 84) {
                                                                    if (a13.mo3180b(73482)) {
                                                                        a14 = a13.mo3177a(73482);
                                                                    }
                                                                }
                                                                if (a14 != null) {
                                                                    i4 = a14[0] + 2;
                                                                    byte b22 = a14[2];
                                                                    if (b22 != -1) {
                                                                        if (bji.m3195a(big.f3296e, b22 + 2) != 0) {
                                                                            z4 = true;
                                                                        } else if (bji.m3195a(big.f3296e, a14[2] + 4) != 0) {
                                                                            z4 = true;
                                                                        }
                                                                    }
                                                                    z4 = false;
                                                                } else {
                                                                    z4 = false;
                                                                    i4 = 2;
                                                                }
                                                                if (i4 > 2) {
                                                                    if (big.f3295d <= 2) {
                                                                        throw new bic((short) 27013);
                                                                    }
                                                                }
                                                                if (i4 != big.f3295d) {
                                                                    throw new bic((short) 26368);
                                                                } else if (bji.m3195a(a13.f3346b, 0) != 65535) {
                                                                    if (a14 == null) {
                                                                        b6 = -80;
                                                                        b5 = 0;
                                                                        b4 = 0;
                                                                        b3 = -1;
                                                                    } else if (z4) {
                                                                        byte[] bArr20 = big.f3296e;
                                                                        byte b23 = a14[2];
                                                                        byte b24 = bArr20[b23 + 2];
                                                                        b4 = bArr20[b23 + 3];
                                                                        b3 = bArr20[b23 + 4];
                                                                        b5 = bArr20[b23 + 5];
                                                                        b6 = b24;
                                                                    } else {
                                                                        b6 = big.f3296e[a14[1] + 2];
                                                                        b3 = b6;
                                                                        b5 = 0;
                                                                        b4 = 0;
                                                                    }
                                                                    a13.f3347c[18] = -91;
                                                                    bij2 = bij3;
                                                                    try {
                                                                        System.arraycopy(bja.f3360b, 0, a13.f3347c, 19, bja.f3360b.length);
                                                                        if (biw.OPERATION.f3341b.equals(bii.PAYMENT)) {
                                                                            byte[] bArr21 = a13.f3347c;
                                                                            if (bArr21[23] == -91) {
                                                                                bArr21[23] = 92;
                                                                                bArr21[24] = 69;
                                                                                if (!z4) {
                                                                                    byte[] bArr22 = a13.f3347c;
                                                                                    bArr22[38] = (byte) (bArr22[38] | 4);
                                                                                    if ((b3 & Byte.MIN_VALUE) == 0) {
                                                                                        bArr22[18] = 92;
                                                                                    }
                                                                                    if ((b3 & 64) == 64 && (b4 & Byte.MIN_VALUE) == Byte.MIN_VALUE) {
                                                                                        bArr22[25] = 92;
                                                                                        bArr22[38] = (byte) (bArr22[38] | 8);
                                                                                    } else {
                                                                                        bArr22[25] = -91;
                                                                                    }
                                                                                    if ((b6 & 8) != 8) {
                                                                                        bArr22[26] = -67;
                                                                                        bArr22[38] = (byte) (bArr22[38] | 32);
                                                                                    } else {
                                                                                        bArr22[26] = -14;
                                                                                        byte b25 = (byte) (bArr22[38] | 16);
                                                                                        bArr22[38] = b25;
                                                                                        bArr22[38] = (byte) (b25 | 32);
                                                                                    }
                                                                                    if ((b6 & 16) == 16) {
                                                                                        bArr22[27] = 19;
                                                                                        bArr22[38] = (byte) (bArr22[38] | Byte.MIN_VALUE);
                                                                                        if (bjf.m3184a(2, 1) == 92 || a13.f3345a[17] == -121) {
                                                                                            a13.f3347c[27] = -121;
                                                                                        }
                                                                                    } else {
                                                                                        bArr22[27] = -121;
                                                                                    }
                                                                                    if ((b5 & 64) != 64) {
                                                                                        a13.f3347c[36] = -91;
                                                                                    } else {
                                                                                        a13.f3347c[36] = 92;
                                                                                    }
                                                                                    if ((b5 & 32) != 32) {
                                                                                        a13.f3347c[37] = -91;
                                                                                    } else {
                                                                                        a13.f3347c[37] = 92;
                                                                                    }
                                                                                } else {
                                                                                    byte b26 = b6 & 7;
                                                                                    if (b26 == 1 || b26 == 2 || b26 == 4 || b26 == 5) {
                                                                                        a13.f3347c[18] = 92;
                                                                                    }
                                                                                    if ((b6 & 8) == 8) {
                                                                                        byte[] bArr23 = a13.f3347c;
                                                                                        bArr23[25] = 92;
                                                                                        bArr23[38] = (byte) (bArr23[38] | 8);
                                                                                    } else {
                                                                                        a13.f3347c[25] = -91;
                                                                                    }
                                                                                    byte b27 = (byte) (b6 & 192);
                                                                                    if (b27 == Byte.MIN_VALUE) {
                                                                                        byte[] bArr24 = a13.f3347c;
                                                                                        bArr24[27] = 19;
                                                                                        bArr24[26] = -67;
                                                                                        byte b28 = bArr24[38] | Byte.MIN_VALUE;
                                                                                        bArr24[38] = (byte) b28;
                                                                                        bArr24[38] = (byte) (b28 | 32);
                                                                                        if (bjf.m3184a(2, 1) != 92) {
                                                                                        }
                                                                                        a13.f3347c[27] = -121;
                                                                                        a13.f3347c[25] = -91;
                                                                                    } else if (b27 == -64) {
                                                                                        byte[] bArr25 = a13.f3347c;
                                                                                        bArr25[27] = 19;
                                                                                        bArr25[26] = -14;
                                                                                        byte b29 = bArr25[38] | Byte.MIN_VALUE;
                                                                                        bArr25[38] = (byte) b29;
                                                                                        byte b30 = b29 | 16;
                                                                                        bArr25[38] = (byte) b30;
                                                                                        bArr25[38] = (byte) (b30 | 32);
                                                                                        if (bjf.m3184a(2, 1) == 92 || a13.f3345a[17] == -121) {
                                                                                            a13.f3347c[27] = -121;
                                                                                        }
                                                                                    } else if (b27 == 0) {
                                                                                        byte[] bArr26 = a13.f3347c;
                                                                                        bArr26[27] = -121;
                                                                                        bArr26[26] = -56;
                                                                                        bArr26[25] = -91;
                                                                                        bArr26[38] = (byte) (bArr26[38] | 16);
                                                                                    } else if (b27 == 64) {
                                                                                        byte[] bArr27 = a13.f3347c;
                                                                                        bArr27[27] = -121;
                                                                                        if (bArr27[25] != 92) {
                                                                                            bArr27[26] = -67;
                                                                                            bArr27[38] = (byte) (bArr27[38] | 32);
                                                                                        } else {
                                                                                            bArr27[26] = -14;
                                                                                            byte b31 = (byte) (bArr27[38] | 16);
                                                                                            bArr27[38] = b31;
                                                                                            bArr27[38] = (byte) (b31 | 32);
                                                                                        }
                                                                                    } else {
                                                                                        throw new bic((short) 27013);
                                                                                    }
                                                                                }
                                                                                b7 = a13.f3345a[17];
                                                                                if (b7 != -94) {
                                                                                    if (b7 != a13.f3347c[27]) {
                                                                                        throw new bic((short) 27013);
                                                                                    }
                                                                                }
                                                                                bjf.m3185a();
                                                                                if (!biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT)) {
                                                                                    if (bjf.m3184a(4, 8) == 92) {
                                                                                        if (a13.f3347c[27] != 19) {
                                                                                            throw new bic((short) 27013);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                bArr5 = a13.f3347c;
                                                                                if (bArr5[27] != -121) {
                                                                                    bArr7 = a13.mo3177a(73479);
                                                                                    bArr6 = a13.mo3177a(73480);
                                                                                } else {
                                                                                    if (bArr5[16] == 84) {
                                                                                        bArr7 = a13.mo3177a(73477);
                                                                                        bArr6 = a13.mo3177a(73478);
                                                                                    } else {
                                                                                        bArr7 = null;
                                                                                        bArr6 = null;
                                                                                    }
                                                                                    if (a13.f3347c[16] != 51) {
                                                                                        if (bArr7 != null) {
                                                                                        }
                                                                                    }
                                                                                    bArr7 = a13.mo3177a(73475);
                                                                                    bArr6 = a13.mo3177a(73476);
                                                                                }
                                                                                if (bArr6 == null) {
                                                                                    if (bArr7 != null) {
                                                                                        int length = bArr7.length;
                                                                                        byte[] bArr28 = new byte[length];
                                                                                        int length2 = bArr6.length;
                                                                                        byte[] bArr29 = new byte[length2];
                                                                                        System.arraycopy(bArr7, 0, bArr28, 0, length);
                                                                                        System.arraycopy(bArr6, 0, bArr29, 0, length2);
                                                                                        if (bjf.m3184a(4, 4) == -91) {
                                                                                            bArr28[0] = (byte) (bArr28[0] & -2);
                                                                                        }
                                                                                        if (a13.mo3180b(73473)) {
                                                                                            byte[] bArr30 = a13.f3347c;
                                                                                            if (bArr30[16] == 51) {
                                                                                                bArr30[36] = 92;
                                                                                                bArr30[37] = 92;
                                                                                            }
                                                                                        }
                                                                                        byte[] bArr31 = a13.f3347c;
                                                                                        if (!(bArr31[36] == 92 && bArr31[37] == 92)) {
                                                                                            bArr28[0] = (byte) (bArr28[0] & -2);
                                                                                        }
                                                                                        a13.f3350f = bib.f3271a;
                                                                                        byte[] bArr32 = a13.f3347c;
                                                                                        byte b32 = bArr32[26];
                                                                                        if (b32 != -67) {
                                                                                            if (b32 == -56) {
                                                                                                bArr28[0] = (byte) (bArr28[0] & 124);
                                                                                                byte b33 = bArr28[1];
                                                                                                bArr28[1] = 0;
                                                                                                bArr32[31] = 114;
                                                                                            } else if (b32 == -14) {
                                                                                                if (bArr32[25] != 92) {
                                                                                                    bArr32[31] = -112;
                                                                                                } else {
                                                                                                    bArr32[31] = 114;
                                                                                                }
                                                                                            }
                                                                                        } else if (bArr32[27] == -121) {
                                                                                            bArr32[31] = 114;
                                                                                        }
                                                                                        if (bArr32[23] == 92) {
                                                                                            byte[] bArr33 = a13.f3345a;
                                                                                            bArr33[34] = 0;
                                                                                            bArr33[35] = 0;
                                                                                        }
                                                                                        if (bArr32[26] == -14) {
                                                                                            if (bjf.m3184a(4, 1) == 92) {
                                                                                                int i15 = length + length2 + 12;
                                                                                                bArr8 = new byte[i15];
                                                                                                bArr8[0] = 119;
                                                                                                bArr8[1] = (byte) (i15 - 2);
                                                                                                bArr8[2] = -126;
                                                                                                bArr8[3] = (byte) length;
                                                                                                System.arraycopy(bArr28, 0, bArr8, 4, length);
                                                                                                int i16 = length + 4;
                                                                                                int i17 = i16 + 1;
                                                                                                bArr8[i16] = -108;
                                                                                                int i18 = i17 + 1;
                                                                                                bArr8[i17] = (byte) length2;
                                                                                                System.arraycopy(bArr29, 0, bArr8, i18, length2);
                                                                                                short a15 = bji.m3202a(bArr8, i18 + length2, (short) -24719);
                                                                                                bArr8[a15] = 3;
                                                                                                System.arraycopy(a13.f3347c, 28, bArr8, a15 + 1, 3);
                                                                                                bArr9 = a13.f3347c;
                                                                                                if (bArr9[31] != 114) {
                                                                                                    if (bArr9[23] == -91) {
                                                                                                        a13.f3350f = bib.f3272b;
                                                                                                        byte[] bArr34 = a13.f3347c;
                                                                                                        if (bArr34[26] == -14) {
                                                                                                            bArr34[32] = 92;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                bij5.f3316a = bArr8;
                                                                                                a13.f3347c[17] = -94;
                                                                                                i5 = big.f3295d;
                                                                                                if (i5 > 2) {
                                                                                                    int i19 = i5 - 2;
                                                                                                    byte[] bArr35 = new byte[i19];
                                                                                                    System.arraycopy(big.f3296e, 2, bArr35, 0, i19);
                                                                                                    MessageDigest g = a13.mo3188g();
                                                                                                    if (g != null) {
                                                                                                        g.reset();
                                                                                                        g.update(bArr35);
                                                                                                    } else {
                                                                                                        throw new bic((short) 28416);
                                                                                                    }
                                                                                                }
                                                                                                a13.mo3179b(335618, bArr28);
                                                                                                a13.mo3179b(335617, bArr29);
                                                                                                if (a14 != null) {
                                                                                                    byte b34 = a14[3];
                                                                                                    if (!(b34 == -1 || (b8 = a14[5]) == -1)) {
                                                                                                        byte[] bArr36 = new byte[b8];
                                                                                                        System.arraycopy(big.f3296e, b34 + 2, bArr36, 0, b8);
                                                                                                        a13.mo3179b(335631, bArr36);
                                                                                                    }
                                                                                                    byte b35 = a14[4];
                                                                                                    if (b35 != -1) {
                                                                                                        byte[] bArr37 = new byte[2];
                                                                                                        System.arraycopy(big.f3296e, b35 + 2, bArr37, 0, 2);
                                                                                                        a13.mo3179b(335632, bArr37);
                                                                                                    }
                                                                                                }
                                                                                                bij = bij5;
                                                                                                s2 = 3;
                                                                                            }
                                                                                        }
                                                                                        int i20 = length + length2 + 2;
                                                                                        bArr8 = new byte[i20];
                                                                                        bArr8[0] = Byte.MIN_VALUE;
                                                                                        bArr8[1] = (byte) (i20 - 2);
                                                                                        System.arraycopy(bArr28, 0, bArr8, 2, length);
                                                                                        System.arraycopy(bArr29, 0, bArr8, length + 2, length2);
                                                                                        bArr9 = a13.f3347c;
                                                                                        if (bArr9[31] != 114) {
                                                                                        }
                                                                                        bij5.f3316a = bArr8;
                                                                                        a13.f3347c[17] = -94;
                                                                                        i5 = big.f3295d;
                                                                                        if (i5 > 2) {
                                                                                        }
                                                                                        a13.mo3179b(335618, bArr28);
                                                                                        a13.mo3179b(335617, bArr29);
                                                                                        if (a14 != null) {
                                                                                        }
                                                                                        bij = bij5;
                                                                                        s2 = 3;
                                                                                    }
                                                                                }
                                                                                throw new bic((short) 27013);
                                                                            }
                                                                        }
                                                                        if (!z4) {
                                                                        }
                                                                        b7 = a13.f3345a[17];
                                                                        if (b7 != -94) {
                                                                        }
                                                                        bjf.m3185a();
                                                                        if (!biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT)) {
                                                                        }
                                                                        bArr5 = a13.f3347c;
                                                                        if (bArr5[27] != -121) {
                                                                        }
                                                                        if (bArr6 == null) {
                                                                        }
                                                                        throw new bic((short) 27013);
                                                                    } catch (bic e2) {
                                                                        e = e2;
                                                                        bic = e;
                                                                        s2 = 3;
                                                                        bij = bij2;
                                                                        bij.f3317b = bic.f3291b;
                                                                        bin = bic.f3290a;
                                                                        if (bin != null) {
                                                                        }
                                                                        bis.m3128a(bij, bin2, "07");
                                                                        b = bArr10[1];
                                                                        bje.m3182a(b, bij.f3317b);
                                                                        String str5 = bij.f3321c;
                                                                        hashCode = str5.hashCode();
                                                                        if (hashCode == 1568) {
                                                                        }
                                                                        s2 = -1;
                                                                        switch (s2) {
                                                                        }
                                                                        this.f89503h = i;
                                                                        if (i == -1) {
                                                                        }
                                                                        str = bij.f3323e;
                                                                        int indexOf = str.indexOf(44);
                                                                        Map a16 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                                                                        str2 = (String) a16.get("MERCHANT_NAME");
                                                                        if (str2 != null) {
                                                                        }
                                                                        str3 = (String) a16.get("MERCHANT_CODE");
                                                                        if (str3 != null) {
                                                                        }
                                                                        str4 = (String) a16.get("AMOUNT");
                                                                        if (str4 != null) {
                                                                        }
                                                                        if (this.f89505j) {
                                                                        }
                                                                        bArr2 = bij.f3316a;
                                                                        if (bArr2 != null) {
                                                                        }
                                                                        byte[] bArr38 = new byte[i2];
                                                                        if (bArr2 == null) {
                                                                        }
                                                                        return astf.m74755a(bArr38);
                                                                    } catch (Exception e3) {
                                                                        s2 = 3;
                                                                        bij = bij2;
                                                                        try {
                                                                            bij.f3317b = 28416;
                                                                            bis.m3128a(bij, bib.f3275e, "07");
                                                                            b = bArr10[1];
                                                                            bje.m3182a(b, bij.f3317b);
                                                                            String str52 = bij.f3321c;
                                                                            hashCode = str52.hashCode();
                                                                            if (hashCode == 1568) {
                                                                            }
                                                                            s2 = -1;
                                                                            switch (s2) {
                                                                            }
                                                                            this.f89503h = i;
                                                                            if (i == -1) {
                                                                            }
                                                                            str = bij.f3323e;
                                                                            int indexOf2 = str.indexOf(44);
                                                                            Map a162 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                                                                            str2 = (String) a162.get("MERCHANT_NAME");
                                                                            if (str2 != null) {
                                                                            }
                                                                            str3 = (String) a162.get("MERCHANT_CODE");
                                                                            if (str3 != null) {
                                                                            }
                                                                            str4 = (String) a162.get("AMOUNT");
                                                                            if (str4 != null) {
                                                                            }
                                                                            if (this.f89505j) {
                                                                            }
                                                                            bArr2 = bij.f3316a;
                                                                            if (bArr2 != null) {
                                                                            }
                                                                            byte[] bArr382 = new byte[i2];
                                                                            if (bArr2 == null) {
                                                                            }
                                                                            return astf.m74755a(bArr382);
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            bis.m3128a(bij, bin2, "07");
                                                                            bje.m3182a(bArr10[1], bij.f3317b);
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                    }
                                                                } else {
                                                                    throw new bic((short) 27013);
                                                                }
                                                            }
                                                        }
                                                        throw new bic((short) 27013);
                                                    }
                                                }
                                                throw new bic((short) 27270);
                                            }
                                            throw new bic((short) 27013);
                                        }
                                    }
                                    throw new bic((short) 27013);
                                }
                                throw new bic((short) 27014);
                            }
                            throw new bic(bib.f3276f);
                        } else if (a5 == 32942) {
                            biv biv = new biv();
                            a6.f3347c[14] = -68;
                            bij = biv.mo3169a(big);
                            s2 = 3;
                        } else if (a5 == 32970) {
                            a6.f3347c[14] = -103;
                            bix a17 = biy.m3166a();
                            byte[] bArr39 = a17.f3347c;
                            if (bArr39[14] == -103) {
                                bArr39[14] = -91;
                                bij bij6 = new bij();
                                byte b36 = a17.f3346b[6];
                                if (b36 == 4) {
                                    throw new bic((short) 27014);
                                } else if (b36 == 5 || b36 == 2) {
                                    throw new bic((short) 27013);
                                } else {
                                    byte[] bArr40 = a17.f3347c;
                                    byte b37 = bArr40[17];
                                    if (b37 == -104 || b37 == 86) {
                                        throw new bic((short) 27013);
                                    } else if (bArr40[27] != -121) {
                                        throw new bic((short) 27013);
                                    } else if (big.f3293b != 159 || big.f3294c != 54) {
                                        throw new bic((short) 27270);
                                    } else if (big.f3297f == 2) {
                                        byte[] bArr41 = new byte[5];
                                        short a18 = bji.m3202a(bArr41, 0, (short) -24778);
                                        int i21 = a18 + 1;
                                        bArr41[a18] = 2;
                                        bih bih = a17.f3351g;
                                        if (bih != null) {
                                            bji.m3202a(bArr41, i21, (short) bih.f3301d);
                                        } else {
                                            System.arraycopy(a17.f3346b, 0, bArr41, i21, 2);
                                        }
                                        bij6.f3316a = bArr41;
                                        bij = bij6;
                                        s2 = 3;
                                    } else {
                                        throw new bic((short) 26368);
                                    }
                                }
                            } else {
                                throw new bic(bib.f3276f);
                            }
                        } else {
                            throw new bic((short) 27904);
                        }
                        try {
                            if (biy.m3166a().f3350f != null) {
                                bin2 = biy.m3166a().f3350f;
                            }
                            bis.m3128a(bij, bin2, "07");
                            b = bArr10[1];
                        } catch (bic e4) {
                            bic = e4;
                            bij.f3317b = bic.f3291b;
                            bin = bic.f3290a;
                            if (bin != null) {
                            }
                            bis.m3128a(bij, bin2, "07");
                            b = bArr10[1];
                            bje.m3182a(b, bij.f3317b);
                            String str522 = bij.f3321c;
                            hashCode = str522.hashCode();
                            if (hashCode == 1568) {
                            }
                            s2 = -1;
                            switch (s2) {
                            }
                            this.f89503h = i;
                            if (i == -1) {
                            }
                            str = bij.f3323e;
                            int indexOf22 = str.indexOf(44);
                            Map a1622 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                            str2 = (String) a1622.get("MERCHANT_NAME");
                            if (str2 != null) {
                            }
                            str3 = (String) a1622.get("MERCHANT_CODE");
                            if (str3 != null) {
                            }
                            str4 = (String) a1622.get("AMOUNT");
                            if (str4 != null) {
                            }
                            if (this.f89505j) {
                            }
                            bArr2 = bij.f3316a;
                            if (bArr2 != null) {
                            }
                            byte[] bArr3822 = new byte[i2];
                            if (bArr2 == null) {
                            }
                            return astf.m74755a(bArr3822);
                        } catch (Exception e5) {
                            bij.f3317b = 28416;
                            bis.m3128a(bij, bib.f3275e, "07");
                            b = bArr10[1];
                            bje.m3182a(b, bij.f3317b);
                            String str5222 = bij.f3321c;
                            hashCode = str5222.hashCode();
                            if (hashCode == 1568) {
                            }
                            s2 = -1;
                            switch (s2) {
                            }
                            this.f89503h = i;
                            if (i == -1) {
                            }
                            str = bij.f3323e;
                            int indexOf222 = str.indexOf(44);
                            Map a16222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                            str2 = (String) a16222.get("MERCHANT_NAME");
                            if (str2 != null) {
                            }
                            str3 = (String) a16222.get("MERCHANT_CODE");
                            if (str3 != null) {
                            }
                            str4 = (String) a16222.get("AMOUNT");
                            if (str4 != null) {
                            }
                            if (this.f89505j) {
                            }
                            bArr2 = bij.f3316a;
                            if (bArr2 != null) {
                            }
                            byte[] bArr38222 = new byte[i2];
                            if (bArr2 == null) {
                            }
                            return astf.m74755a(bArr38222);
                        } catch (Throwable th4) {
                            th = th4;
                            bis.m3128a(bij, bin2, "07");
                            bje.m3182a(bArr10[1], bij.f3317b);
                            throw th;
                        }
                        bje.m3182a(b, bij.f3317b);
                        String str52222 = bij.f3321c;
                        hashCode = str52222.hashCode();
                        if (hashCode == 1568) {
                            if (hashCode != 1569) {
                                if (hashCode != 1571) {
                                    if (hashCode != 1572) {
                                        switch (hashCode) {
                                            case 1536:
                                                if (str52222.equals("00")) {
                                                    s2 = 0;
                                                    break;
                                                }
                                                break;
                                            case 1537:
                                                if (str52222.equals("01")) {
                                                    s2 = 1;
                                                    break;
                                                }
                                                break;
                                            case 1538:
                                                if (str52222.equals("02")) {
                                                    s2 = 2;
                                                    break;
                                                }
                                                break;
                                        }
                                        switch (s2) {
                                            case 0:
                                                i = 11;
                                                break;
                                            case 1:
                                                i = 19;
                                                break;
                                            case 2:
                                            case 3:
                                                i = -1;
                                                break;
                                            case 4:
                                            case 5:
                                                i = 26;
                                                break;
                                            case 6:
                                                i = 29;
                                                break;
                                            case 7:
                                                i = 15;
                                                break;
                                            default:
                                                i = 0;
                                                break;
                                        }
                                        this.f89503h = i;
                                        if (i == -1) {
                                            this.f89502g.f89409e = str52222.equals(bib.f3274d.f3321c);
                                        }
                                        str = bij.f3323e;
                                        int indexOf2222 = str.indexOf(44);
                                        if (indexOf2222 != -1 && (i3 = indexOf2222 + 1) < str.length()) {
                                            Map a162222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                                            str2 = (String) a162222.get("MERCHANT_NAME");
                                            if (str2 != null) {
                                                new String(asti.m74762a(str2), StandardCharsets.US_ASCII).trim();
                                            }
                                            str3 = (String) a162222.get("MERCHANT_CODE");
                                            if (str3 != null) {
                                                short a19 = (short) ((int) asuv.m74875a(asti.m74762a(str3)));
                                                asqu asqu = this.f89502g;
                                                if (!asqu.f89411g || !asqu.m74486a(a19)) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                asqu.f89411g = z2;
                                            }
                                            str4 = (String) a162222.get("AMOUNT");
                                            if (str4 != null) {
                                                this.f89504i = asuv.m74875a(asti.m74762a(str4));
                                                this.f89502g.f89416l = bozu.AMEX_EMV;
                                                asqu asqu2 = this.f89502g;
                                                if (!asqu2.f89411g || this.f89504i > cgxi.m147450c()) {
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                asqu2.f89411g = z;
                                            }
                                        }
                                        if (this.f89505j || this.f89502g.f89411g) {
                                            bArr2 = bij.f3316a;
                                            if (bArr2 != null) {
                                                i2 = bArr2.length + 2;
                                            } else {
                                                i2 = 2;
                                            }
                                            byte[] bArr382222 = new byte[i2];
                                            if (bArr2 == null) {
                                                bji.m3202a(bArr382222, 0, bij.f3317b);
                                            } else {
                                                System.arraycopy(bArr2, 0, bArr382222, 0, bArr2.length);
                                                bji.m3202a(bArr382222, bij.f3316a.length, bij.f3317b);
                                            }
                                            return astf.m74755a(bArr382222);
                                        }
                                        this.f89503h = 21;
                                        return astf.m74754a(27266);
                                    } else if (str52222.equals("15")) {
                                        s2 = 5;
                                        switch (s2) {
                                        }
                                        this.f89503h = i;
                                        if (i == -1) {
                                        }
                                        str = bij.f3323e;
                                        int indexOf22222 = str.indexOf(44);
                                        Map a1622222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                                        str2 = (String) a1622222.get("MERCHANT_NAME");
                                        if (str2 != null) {
                                        }
                                        str3 = (String) a1622222.get("MERCHANT_CODE");
                                        if (str3 != null) {
                                        }
                                        str4 = (String) a1622222.get("AMOUNT");
                                        if (str4 != null) {
                                        }
                                        if (this.f89505j) {
                                        }
                                        bArr2 = bij.f3316a;
                                        if (bArr2 != null) {
                                        }
                                        byte[] bArr3822222 = new byte[i2];
                                        if (bArr2 == null) {
                                        }
                                        return astf.m74755a(bArr3822222);
                                    }
                                } else if (str52222.equals("14")) {
                                    s2 = 4;
                                    switch (s2) {
                                    }
                                    this.f89503h = i;
                                    if (i == -1) {
                                    }
                                    str = bij.f3323e;
                                    int indexOf222222 = str.indexOf(44);
                                    Map a16222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                                    str2 = (String) a16222222.get("MERCHANT_NAME");
                                    if (str2 != null) {
                                    }
                                    str3 = (String) a16222222.get("MERCHANT_CODE");
                                    if (str3 != null) {
                                    }
                                    str4 = (String) a16222222.get("AMOUNT");
                                    if (str4 != null) {
                                    }
                                    if (this.f89505j) {
                                    }
                                    bArr2 = bij.f3316a;
                                    if (bArr2 != null) {
                                    }
                                    byte[] bArr38222222 = new byte[i2];
                                    if (bArr2 == null) {
                                    }
                                    return astf.m74755a(bArr38222222);
                                }
                            } else if (str52222.equals("12")) {
                                s2 = 6;
                                switch (s2) {
                                }
                                this.f89503h = i;
                                if (i == -1) {
                                }
                                str = bij.f3323e;
                                int indexOf2222222 = str.indexOf(44);
                                Map a162222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                                str2 = (String) a162222222.get("MERCHANT_NAME");
                                if (str2 != null) {
                                }
                                str3 = (String) a162222222.get("MERCHANT_CODE");
                                if (str3 != null) {
                                }
                                str4 = (String) a162222222.get("AMOUNT");
                                if (str4 != null) {
                                }
                                if (this.f89505j) {
                                }
                                bArr2 = bij.f3316a;
                                if (bArr2 != null) {
                                }
                                byte[] bArr382222222 = new byte[i2];
                                if (bArr2 == null) {
                                }
                                return astf.m74755a(bArr382222222);
                            }
                        } else if (str52222.equals("11")) {
                            s2 = 7;
                            switch (s2) {
                            }
                            this.f89503h = i;
                            if (i == -1) {
                            }
                            str = bij.f3323e;
                            int indexOf22222222 = str.indexOf(44);
                            Map a1622222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                            str2 = (String) a1622222222.get("MERCHANT_NAME");
                            if (str2 != null) {
                            }
                            str3 = (String) a1622222222.get("MERCHANT_CODE");
                            if (str3 != null) {
                            }
                            str4 = (String) a1622222222.get("AMOUNT");
                            if (str4 != null) {
                            }
                            if (this.f89505j) {
                            }
                            bArr2 = bij.f3316a;
                            if (bArr2 != null) {
                            }
                            byte[] bArr3822222222 = new byte[i2];
                            if (bArr2 == null) {
                            }
                            return astf.m74755a(bArr3822222222);
                        }
                        s2 = -1;
                        switch (s2) {
                        }
                        this.f89503h = i;
                        if (i == -1) {
                        }
                        str = bij.f3323e;
                        int indexOf222222222 = str.indexOf(44);
                        Map a16222222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                        str2 = (String) a16222222222.get("MERCHANT_NAME");
                        if (str2 != null) {
                        }
                        str3 = (String) a16222222222.get("MERCHANT_CODE");
                        if (str3 != null) {
                        }
                        str4 = (String) a16222222222.get("AMOUNT");
                        if (str4 != null) {
                        }
                        if (this.f89505j) {
                        }
                        bArr2 = bij.f3316a;
                        if (bArr2 != null) {
                        }
                        byte[] bArr38222222222 = new byte[i2];
                        if (bArr2 == null) {
                        }
                        return astf.m74755a(bArr38222222222);
                    }
                    throw new bic(bib.f3278h);
                } catch (bic e6) {
                    e = e6;
                    bij2 = bij3;
                    bic = e;
                    s2 = 3;
                    bij = bij2;
                    bij.f3317b = bic.f3291b;
                    bin = bic.f3290a;
                    if (bin != null) {
                    }
                    bis.m3128a(bij, bin2, "07");
                    b = bArr10[1];
                    bje.m3182a(b, bij.f3317b);
                    String str522222 = bij.f3321c;
                    hashCode = str522222.hashCode();
                    if (hashCode == 1568) {
                    }
                    s2 = -1;
                    switch (s2) {
                    }
                    this.f89503h = i;
                    if (i == -1) {
                    }
                    str = bij.f3323e;
                    int indexOf2222222222 = str.indexOf(44);
                    Map a162222222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                    str2 = (String) a162222222222.get("MERCHANT_NAME");
                    if (str2 != null) {
                    }
                    str3 = (String) a162222222222.get("MERCHANT_CODE");
                    if (str3 != null) {
                    }
                    str4 = (String) a162222222222.get("AMOUNT");
                    if (str4 != null) {
                    }
                    if (this.f89505j) {
                    }
                    bArr2 = bij.f3316a;
                    if (bArr2 != null) {
                    }
                    byte[] bArr382222222222 = new byte[i2];
                    if (bArr2 == null) {
                    }
                    return astf.m74755a(bArr382222222222);
                } catch (Exception e7) {
                    bij2 = bij3;
                    s2 = 3;
                    bij = bij2;
                    bij.f3317b = 28416;
                    bis.m3128a(bij, bib.f3275e, "07");
                    b = bArr10[1];
                    bje.m3182a(b, bij.f3317b);
                    String str5222222 = bij.f3321c;
                    hashCode = str5222222.hashCode();
                    if (hashCode == 1568) {
                    }
                    s2 = -1;
                    switch (s2) {
                    }
                    this.f89503h = i;
                    if (i == -1) {
                    }
                    str = bij.f3323e;
                    int indexOf22222222222 = str.indexOf(44);
                    Map a1622222222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
                    str2 = (String) a1622222222222.get("MERCHANT_NAME");
                    if (str2 != null) {
                    }
                    str3 = (String) a1622222222222.get("MERCHANT_CODE");
                    if (str3 != null) {
                    }
                    str4 = (String) a1622222222222.get("AMOUNT");
                    if (str4 != null) {
                    }
                    if (this.f89505j) {
                    }
                    bArr2 = bij.f3316a;
                    if (bArr2 != null) {
                    }
                    byte[] bArr3822222222222 = new byte[i2];
                    if (bArr2 == null) {
                    }
                    return astf.m74755a(bArr3822222222222);
                } catch (Throwable th5) {
                }
            }
            throw new bic(bib.f3276f);
        } catch (bic e8) {
            e = e8;
            bij2 = bij3;
            s2 = 3;
            bic = e;
            bij = bij2;
            bij.f3317b = bic.f3291b;
            bin = bic.f3290a;
            if (bin != null) {
            }
            bis.m3128a(bij, bin2, "07");
            b = bArr10[1];
            bje.m3182a(b, bij.f3317b);
            String str52222222 = bij.f3321c;
            hashCode = str52222222.hashCode();
            if (hashCode == 1568) {
            }
            s2 = -1;
            switch (s2) {
            }
            this.f89503h = i;
            if (i == -1) {
            }
            str = bij.f3323e;
            int indexOf222222222222 = str.indexOf(44);
            Map a16222222222222 = bmyx.m108640a(',').mo66920b().mo66917a().mo66919b('=').mo66915a(str.substring(i3));
            str2 = (String) a16222222222222.get("MERCHANT_NAME");
            if (str2 != null) {
            }
            str3 = (String) a16222222222222.get("MERCHANT_CODE");
            if (str3 != null) {
            }
            str4 = (String) a16222222222222.get("AMOUNT");
            if (str4 != null) {
            }
            if (this.f89505j) {
            }
            bArr2 = bij.f3316a;
            if (bArr2 != null) {
            }
            byte[] bArr38222222222222 = new byte[i2];
            if (bArr2 == null) {
            }
            return astf.m74755a(bArr38222222222222);
        } catch (Exception e9) {
        } catch (Throwable th52) {
        }
    }

    /* renamed from: b */
    public final asqu mo49387b() {
        return this.f89502g;
    }

    /* renamed from: c */
    public final void mo49388c() {
        asqu asqu = this.f89502g;
        boolean z = false;
        if (asqu.f89411g && asqu.f89416l == bozu.AMEX_EMV) {
            z = true;
        }
        asqu.f89411g = z;
        bit bit = this.f89501f;
        if (bit != null) {
            try {
                bil a = bit.mo3165a();
                atce.m75535a(a);
                this.f89502g.f89414j = a.f3319a;
            } catch (atcd e) {
                bnsl bnsl = (bnsl) f89496b.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("asrf", "c", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error closing amex token");
                asqu asqu2 = this.f89502g;
                String valueOf = String.valueOf(e.f90076a.f3323e);
                asqu2.f89405a = valueOf.length() == 0 ? new String("Status: ") : "Status: ".concat(valueOf);
            } finally {
                atce.m75536a(this.f89501f);
                this.f89501f = null;
            }
        } else {
            this.f89497a = null;
        }
    }

    /* renamed from: d */
    public final List mo49389d() {
        ArrayList arrayList = new ArrayList();
        try {
            for (assu assu : assu.m74713a(this.f89499d).mo49448c().mo49438a(165, 48908).mo49448c().mo49440b()) {
                if (assu.f89619b != 97) {
                    bnsl bnsl = (bnsl) f89496b.mo68388c();
                    bnsl.mo68432a("asrf", "d", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("PPSE response not correct: %s", asti.m74760a(this.f89499d));
                } else {
                    try {
                        arrayList.add(assu.mo49448c());
                    } catch (assx e) {
                        bnsl bnsl2 = (bnsl) f89496b.mo68388c();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("asrf", "d", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("PPSE response not correct TLV: %s", asti.m74760a(this.f89499d));
                    }
                }
            }
        } catch (assv e2) {
            bnsl bnsl3 = (bnsl) f89496b.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("asrf", "d", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("PPSE response not correct TLV: %s", asti.m74760a(this.f89499d));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final int mo49390e() {
        return this.f89503h;
    }

    /* renamed from: f */
    public final asqq mo49391f() {
        return this.f89498c;
    }

    /* renamed from: g */
    public final String mo49392g() {
        return this.f89500e;
    }

    /* renamed from: h */
    public final int mo49393h() {
        return 3;
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        try {
            ArrayList arrayList = new ArrayList(2);
            for (assu assu : assu.m74713a(this.f89499d).mo49448c().mo49438a(165, 48908).mo49448c().mo49440b()) {
                if (assu.f89619b == 97) {
                    arrayList.add(astc.m74747a(assu.mo49448c().mo49438a(79).mo49442h()));
                }
            }
            return (astc[]) arrayList.toArray(new astc[0]);
        } catch (assv e) {
            bnsl bnsl = (bnsl) f89496b.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asrf", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("PPSE FCI malformed: %s", asti.m74760a(this.f89499d));
            return new astc[0];
        }
    }
}
