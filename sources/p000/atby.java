package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: atby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atby implements atcv {

    /* renamed from: a */
    public static final byte[] f90043a = new byte[0];

    /* renamed from: c */
    private static final srn f90044c = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final bxvd f90045b;

    /* renamed from: d */
    private final Context f90046d;

    public atby(Context context, bycu bycu) {
        this.f90046d = context;
        bxvd bxvd = (bxvd) bycu.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bycu);
        this.f90045b = bxvd;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:69:0x01ec */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:158:0x0322 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:230:0x0497 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:148:0x0306 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String], assign insn: PHI: (r14v1 ?) = (r14v2 ?), (r14v9 ?), (r14v30 ?), (r14v38 ?), (r14v54 ?) binds: [B:322:0x0676, B:294:0x05cb, B:169:0x0338, B:185:0x036b, B:290:0x05be] */
    /* JADX WARN: Type inference failed for: r14v2, assign insn: PHI: (r14v2 ?) = (r14v3 ?), (r14v48 ?) binds: [B:321:0x0674, B:82:0x0213] */
    /* JADX WARN: Type inference failed for: r14v3, assign insn: PHI: (r14v3 ?) = (r14v4 ?), (r14v40 ?) binds: [B:320:0x0672, B:151:0x030b] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String], assign insn: PHI: (r14v4 ?) = (r14v5 ?), (r14v29 ?), (r14v37 ?), (r14v39 ?), (r14v46 ?) binds: [B:299:0x05db, B:171:0x0343, B:187:0x0377, B:155:0x0316, B:85:0x021c] */
    /* JADX WARN: Type inference failed for: r14v5, assign insn: PHI: (r14v5 ?) = (r14v6 ?), (r14v31 ?), (r14v33 ?), (r14v53 ?) binds: [B:298:0x05d8, B:260:0x0531, B:256:0x0524, B:291:0x05c5] */
    /* JADX WARN: Type inference failed for: r14v6, assign insn: PHI: (r14v6 ?) = (r14v7 ?), (r14v25 ?) binds: [B:297:0x05d6, B:268:0x054c] */
    /* JADX WARN: Type inference failed for: r14v7, assign insn: PHI: (r14v7 ?) = (r14v8 ?), (r14v18 ?) binds: [B:296:0x05d3, B:285:0x05ab] */
    /* JADX WARN: Type inference failed for: r14v8, assign insn: 0x05d3: MOVE  (r14v8 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v9, assign insn: PHI: (r14v9 ?) = (r14v10 ?), (r14v26 ?) binds: [B:293:0x05c8, B:266:0x0548] */
    /* JADX WARN: Type inference failed for: r14v10, assign insn: 0x05c8: MOVE  (r14v10 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r13v9, types: [byte[]], assign insn: 0x0124: NEW_ARRAY  (r13v9 ? I:byte[]) = (38 int) type: byte[] */
    /* JADX WARN: Type inference failed for: r23v4, assign insn: 0x017c: CONST  (r23v4 ? I:?[int, float, short, byte, char]) = (23 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r23v6, assign insn: PHI: (r23v6 ?) = (r23v4 ?), (r23v19 ?), (r23v19 ?), (r23v19 ?), (r23v29 ? I:?[int, float, short, byte, char]) binds: [B:128:0x02b4, B:158:0x0322, B:179:0x035e, B:230:0x0497, B:69:0x01ec] */
    /* JADX WARN: Type inference failed for: r13v11, assign insn: PHI: (r13v11 ?) = (r13v9 ?), (r13v9 ?), (r13v24 ?), (r13v27 ?), (r13v32 ?) binds: [B:69:0x01ec, B:128:0x02b4, B:158:0x0322, B:179:0x035e, B:230:0x0497] */
    /* JADX WARN: Type inference failed for: r23v7, assign insn: PHI: (r23v7 ?) = (r23v19 ?), (r23v19 ?), (r23v32 ?) binds: [B:258:0x052b, B:254:0x051d, B:289:0x05bd] */
    /* JADX WARN: Type inference failed for: r23v8, assign insn: PHI: (r23v8 ?) = (r23v19 ?), (r23v19 ?), (r23v19 ?), (r23v28 ? I:?[int, float, short, byte, char]), (r23v30 ? I:?[int, float, short, byte, char]) binds: [B:158:0x0322, B:179:0x035e, B:230:0x0497, B:69:0x01ec, B:128:0x02b4] */
    /* JADX WARN: Type inference failed for: r13v13, assign insn: PHI: (r13v13 ?) = (r13v9 ?), (r13v9 ?), (r13v24 ?), (r13v32 ?), (r13v43 ? I:?[boolean, int, float, short, byte, char]) binds: [B:69:0x01ec, B:128:0x02b4, B:158:0x0322, B:230:0x0497, B:179:0x035e] */
    /* JADX WARN: Type inference failed for: r14v18, assign insn: 0x05ab: MOVE  (r14v18 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v25, assign insn: 0x054c: MOVE  (r14v25 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v26, assign insn: 0x0548: MOVE  (r14v26 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r23v17, assign insn: PHI: (r23v17 ?) = (r23v19 ?), (r23v23 ?), (r23v23 ?) binds: [B:161:0x0326, B:148:0x0306, B:149:?] */
    /* JADX WARN: Type inference failed for: r14v29, assign insn: 0x0345: MOVE  (r14v29 ? I:?[OBJECT, ARRAY]) = (r25v0 byte[]) */
    /* JADX WARN: Type inference failed for: r23v18, assign insn: PHI: (r23v18 ?) = (r23v19 ?), (r23v23 ?), (r23v23 ?) binds: [B:161:0x0326, B:148:0x0306, B:149:?] */
    /* JADX WARN: Type inference failed for: r14v30, assign insn: 0x033e: MOVE  (r14v30 ? I:?[OBJECT, ARRAY]) = (r25v1 byte[]) */
    /* JADX WARN: Type inference failed for: r23v19, assign insn: PHI: (r23v19 ?) = (r23v20 ?), (r23v23 ?) binds: [B:156:0x031b, B:149:?] */
    /* JADX WARN: Type inference failed for: r13v24, assign insn: PHI: (r13v24 ?) = (r13v9 ?), (r13v47 ?) binds: [B:156:0x031b, B:149:?] */
    /* JADX WARN: Type inference failed for: r14v31, assign insn: 0x0532: MOVE  (r14v31 ? I:?[OBJECT, ARRAY]) = (r25v2 byte[]) */
    /* JADX WARN: Type inference failed for: r13v27, assign insn: 0x035d: CONST  (r13v27 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r14v33, assign insn: 0x0524: MOVE  (r14v33 ? I:?[OBJECT, ARRAY]) = (r25v2 byte[]) */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.String], assign insn: 0x045c: MOVE  (r2v41 ? I:?[OBJECT, ARRAY]) = (r25v3 byte[]) */
    /* JADX WARN: Type inference failed for: r13v32, assign insn: 0x0473: MOVE  (r13v32 ? I:?[OBJECT, ARRAY]) = (r26v2 bin) */
    /* JADX WARN: Type inference failed for: r14v37, assign insn: 0x0378: MOVE  (r14v37 ? I:?[OBJECT, ARRAY]) = (r25v7 byte[]) */
    /* JADX WARN: Type inference failed for: r14v38, assign insn: 0x0370: MOVE  (r14v38 ? I:?[OBJECT, ARRAY]) = (r25v8 byte[]) */
    /* JADX WARN: Type inference failed for: r23v20, assign insn: 0x031d: MOVE  (r23v20 ? I:?[OBJECT, ARRAY]) = (r12v1 bim) */
    /* JADX WARN: Type inference failed for: r23v21, assign insn: PHI: (r23v21 ?) = (r23v22 bim), (r23v23 ?) binds: [B:154:0x0314, B:152:0x0311] */
    /* JADX WARN: Type inference failed for: r14v39, assign insn: 0x0317: MOVE  (r14v39 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r23v23, assign insn: 0x02fc: MOVE  (r23v23 ? I:?[OBJECT, ARRAY]) = (r12v1 bim) */
    /* JADX WARN: Type inference failed for: r14v40, assign insn: 0x030d: MOVE  (r14v40 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v41, assign insn: 0x02af: MOVE  (r14v41 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v42, assign insn: 0x02aa: MOVE  (r14v42 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v46, assign insn: PHI: (r14v46 ?) = (r14v41 ?), (r14v47 ?) binds: [B:126:0x02ae, B:84:0x0218] */
    /* JADX WARN: Type inference failed for: r23v27, assign insn: 0x021d: MOVE  (r23v27 ? I:?[OBJECT, ARRAY]) = (r12v1 bim) */
    /* JADX WARN: Type inference failed for: r14v47, assign insn: 0x0219: MOVE  (r14v47 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r14v48, assign insn: PHI: (r14v48 ?) = (r14v42 ?), (r14v49 ?) binds: [B:124:0x02a8, B:81:0x020e] */
    /* JADX WARN: Type inference failed for: r14v49, assign insn: 0x0210: MOVE  (r14v49 ? I:?[OBJECT, ARRAY]) = ("09") */
    /* JADX WARN: Type inference failed for: r23v28, assign insn: 0x017c: CONST  (r23v28 ? I:?[int, float, short, byte, char]) = (23 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r23v29, assign insn: 0x017c: CONST  (r23v29 ? I:?[int, float, short, byte, char]) = (23 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r23v30, assign insn: 0x017c: CONST  (r23v30 ? I:?[int, float, short, byte, char]) = (23 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r13v43, assign insn: 0x035d: CONST  (r13v43 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r23v31, assign insn: ?: MOVE  (r23v31 ?) = (r23v6 ?) */
    /* JADX WARN: Type inference failed for: r14v53, assign insn: ?: MOVE  (r14v53 ?) = (r14v15 byte[]) */
    /* JADX WARN: Type inference failed for: r14v54, assign insn: ?: MOVE  (r14v54 ?) = (r14v16 byte[]) */
    /* JADX WARN: Type inference failed for: r23v32, assign insn: ?: MOVE  (r23v32 ?) = (r23v8 ?) */
    /* JADX WARN: Type inference failed for: r23v33, assign insn: ?: MOVE  (r23v33 ?) = (r23v17 ?) */
    /* JADX WARN: Type inference failed for: r23v34, assign insn: ?: MOVE  (r23v34 ?) = (r23v21 ?) */
    /* JADX WARN: Type inference failed for: r13v47, assign insn: ?: MOVE  (r13v47 ?) = (r13v36 bie) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a8, code lost:
        r14 = "09";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0313, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0314, code lost:
        r23 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05c7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05c8, code lost:
        r14 = "09";
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05d2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x05d3, code lost:
        r14 = "09";
        r31 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a7 A[ExcHandler: all (th java.lang.Throwable), PHI: r16 10  PHI: (r16v32 bit) = (r16v29 bit), (r16v29 bit), (r16v29 bit), (r16v33 bit) binds: [B:142:0x02f8, B:131:0x02c7, B:132:?, B:115:0x0280] A[DONT_GENERATE, DONT_INLINE], Splitter:B:115:0x0280] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05ad A[Catch:{ Exception -> 0x05c5, all -> 0x05bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05c7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:60:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0643 A[Catch:{ atcd -> 0x066d, all -> 0x0669 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d4 A[Catch:{ Exception -> 0x05d2, all -> 0x05c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d6 A[Catch:{ Exception -> 0x05d2, all -> 0x05c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e6 A[Catch:{ Exception -> 0x05d2, all -> 0x05c7 }] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    private final atcq m75455a(atcp atcp) {
        bit bit;
        Throwable th;
        atcd atcd;
        Throwable th2;
        bin bin;
        boolean z;
        bin bin2;
        bim bim;
        ? r14;
        bin bin3;
        Throwable th3;
        bim bim2;
        bim bim3;
        atbz atbz;
        bim bim4;
        byte[] copyOfRange;
        byte[] bArr;
        ? r142;
        Exception exc;
        ? r143;
        byte[] bArr2;
        byte[] bArr3;
        bin bin4;
        byte[] bArr4;
        int i;
        bin bin5;
        int i2;
        byte b;
        short s;
        byte[] bArr5;
        byte b2;
        atcp atcp2 = atcp;
        try {
            if (m75456i()) {
                atbz a = mo49811a((byte[]) null);
                bit a2 = atce.m75534a(a);
                try {
                    atce.m75535a(a2.mo3166a(bii.PAYMENT, "token ref id"));
                    String a3 = asti.m74760a(bqcn.m112583a((int) atcp2.f90083a));
                    byte[] bArr6 = f90043a;
                    bin bin6 = bib.f3271a;
                    try {
                        bix a4 = biy.m3166a();
                        if (!biw.OPERATION.f3341b.equals(bii.PAYMENT)) {
                            if (!biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT)) {
                                throw new bic(bib.f3276f);
                            }
                        }
                        if (a4.f3347c[17] != -94) {
                            byte[] bArr7 = new byte[1];
                            bix.m3145f(a4.mo3187f().mo3160e(bArr6, bArr7));
                            byte[] bArr8 = a4.f3347c;
                            bArr8[23] = 92;
                            byte b3 = bArr7[0];
                            if (b3 != 0) {
                                if (b3 == 1) {
                                    bArr8[24] = 69;
                                } else if (b3 == 2) {
                                    bArr8[24] = -33;
                                } else if (b3 == 3) {
                                    bArr8[24] = 105;
                                } else if (b3 != 4) {
                                    if (b3 == 5) {
                                        bArr8[24] = -73;
                                    }
                                }
                                if (bArr8[23] == 92 && biw.OPERATION.f3341b.equals(bii.TAP_PAYMENT)) {
                                    biw.OPERATION.f3341b = bii.PAYMENT;
                                }
                                bin = bib.f3271a;
                                bis.m3128a(bin, bin, "08");
                                bje.m3183a(bin.f3322d, biw.OPERATION.f3341b, 0);
                                atce.m75535a(bin);
                                byte[] a5 = asuv.m74876a(Long.toString(atcp2.f90085c / 10000));
                                z = atcp2.f90089g;
                                bin2 = bib.f3271a;
                                bim = new bim();
                                bim3 = 23;
                                bim3 = 23;
                                bim3 = 23;
                                bim3 = 23;
                                byte[] bArr9 = {29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, Byte.MIN_VALUE, 0, 0};
                                byte[] bArr10 = {3, -96, 1, 1};
                                if (z) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = a5;
                                }
                                bim bim5 = new bim();
                                bix a6 = biy.m3166a();
                                if (biw.OPERATION.f3341b == null) {
                                    atbz = a;
                                    if (biw.OPERATION.f3341b.equals(bii.PAYMENT)) {
                                        if (!z) {
                                            if (a3 != null) {
                                                try {
                                                    if (a3.trim().length() == 8) {
                                                    }
                                                } catch (Exception e) {
                                                    exc = e;
                                                    r142 = "09";
                                                    bit = a2;
                                                    bin3 = bin2;
                                                    bim3 = bim;
                                                    try {
                                                        bim bim6 = bim3;
                                                        bis.m3128a(bim6, bis.m3127a(exc), r142);
                                                        bje.m3183a(bim6.f3322d, biw.OPERATION.f3341b, 0);
                                                        bim4 = bim6;
                                                        atce.m75535a(bim4);
                                                        byte[] a7 = asti.m74762a(bim4.f3320a);
                                                        bil a8 = bit.mo3165a();
                                                        atce.m75535a(a8);
                                                        String str = a8.f3319a;
                                                        String str2 = new String(a7, 0, 15, StandardCharsets.UTF_8);
                                                        int parseInt = Integer.parseInt(new String(a7, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                        int parseInt2 = Integer.parseInt(new String(a7, 17, 2, StandardCharsets.UTF_8));
                                                        byte[] copyOfRange2 = Arrays.copyOfRange(a7, 21, 41);
                                                        copyOfRange = Arrays.copyOfRange(a7, 41, 61);
                                                        if (Arrays.equals(new byte[20], copyOfRange)) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bim2 = bim3;
                                                        th3 = th;
                                                        bis.m3128a(bim2, bin3, r14);
                                                        bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                        throw th3;
                                                    }
                                                    try {
                                                        mo49812a(atbz);
                                                        atcm atcm = new atcm(new atct(bArr, str2, parseInt2, parseInt, null, str));
                                                        atce.m75536a(bit);
                                                        return atcm;
                                                    } catch (atcd e2) {
                                                        e = e2;
                                                        atcd = e;
                                                        try {
                                                            bit.mo3165a();
                                                            throw new atcr(atcd);
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            th = th;
                                                            atce.m75536a(bit);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    r14 = "09";
                                                    bit = a2;
                                                    bin3 = bin2;
                                                    bim2 = bim;
                                                    th3 = th;
                                                    bis.m3128a(bim2, bin3, r14);
                                                    bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                    throw th3;
                                                }
                                            }
                                            throw new bic(bib.f3278h);
                                        }
                                        if (a5 != null) {
                                            if (a5.length == 6) {
                                                if (a3 != null) {
                                                    if (a3.trim().length() != 4) {
                                                        if (a3.trim().length() != 8) {
                                                        }
                                                    }
                                                }
                                                throw new bic(bib.f3278h);
                                            }
                                        }
                                        throw new bic(bib.f3278h);
                                        byte b4 = a6.f3346b[6];
                                        if (b4 != 4) {
                                            if (b4 != 5) {
                                                if (b4 != 2) {
                                                    if (bjf.m3184a(3, 16) == -91 || a6.f3347c[23] == -91) {
                                                        throw new bic(bib.f3276f);
                                                    }
                                                    int a9 = bji.m3195a(a6.f3346b, 0);
                                                    if (a9 != 65535) {
                                                        bjf.m3185a();
                                                        if (z) {
                                                            bit = a2;
                                                            try {
                                                                bji.m3197a(bArr2, 0, bArr9, 1, 6);
                                                                if (a3.length() > 4) {
                                                                    a3 = a3.substring(4);
                                                                }
                                                                String valueOf = String.valueOf(a3);
                                                                a3 = valueOf.length() == 0 ? new String("F0F0") : "F0F0".concat(valueOf);
                                                            } catch (Exception e3) {
                                                                exc = e3;
                                                                r142 = "09";
                                                            } catch (Throwable th7) {
                                                            }
                                                        } else {
                                                            bit = a2;
                                                        }
                                                        try {
                                                            byte[] a10 = bji.m3204a(a3);
                                                            bji.m3197a(a10, 0, bArr9, 26, 4);
                                                            bji.m3202a((byte[]) bArr9, 32, (short) a9);
                                                            if (!z) {
                                                                bji.m3197a(a6.f3347c, 19, bArr9, 34, 4);
                                                            } else {
                                                                bji.m3197a(bArr10, 0, bArr9, 34, 4);
                                                            }
                                                            biq f = a6.mo3187f();
                                                            byte[] bArr11 = new byte[8];
                                                            int c = f.mo3156c(bArr9, bArr11);
                                                            if (c >= a9) {
                                                                if (c <= a6.mo3183d()) {
                                                                    bih e4 = a6.mo3186e(c);
                                                                    String a11 = a6.mo3173a();
                                                                    if (a11 != null) {
                                                                        bie e5 = a6.mo3185e();
                                                                        bim3 = bim;
                                                                        try {
                                                                            bArr4 = "09";
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            exc = e;
                                                                            r142 = "09";
                                                                            bin3 = bin2;
                                                                            bim3 = bim3;
                                                                            bim bim62 = bim3;
                                                                            bis.m3128a(bim62, bis.m3127a(exc), r142);
                                                                            bje.m3183a(bim62.f3322d, biw.OPERATION.f3341b, 0);
                                                                            bim4 = bim62;
                                                                            atce.m75535a(bim4);
                                                                            byte[] a72 = asti.m74762a(bim4.f3320a);
                                                                            bil a82 = bit.mo3165a();
                                                                            atce.m75535a(a82);
                                                                            String str3 = a82.f3319a;
                                                                            String str22 = new String(a72, 0, 15, StandardCharsets.UTF_8);
                                                                            int parseInt3 = Integer.parseInt(new String(a72, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                                            int parseInt22 = Integer.parseInt(new String(a72, 17, 2, StandardCharsets.UTF_8));
                                                                            byte[] copyOfRange22 = Arrays.copyOfRange(a72, 21, 41);
                                                                            copyOfRange = Arrays.copyOfRange(a72, 41, 61);
                                                                            if (Arrays.equals(new byte[20], copyOfRange)) {
                                                                            }
                                                                            mo49812a(atbz);
                                                                            atcm atcm2 = new atcm(new atct(bArr, str22, parseInt22, parseInt3, null, str3));
                                                                            atce.m75536a(bit);
                                                                            return atcm2;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            r142 = "09";
                                                                            bin3 = bin2;
                                                                            bim2 = bim3;
                                                                            th3 = th;
                                                                            bis.m3128a(bim2, bin3, r14);
                                                                            bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                                            throw th3;
                                                                        }
                                                                        try {
                                                                            e5.mo3144a(biw.OPERATION.f3342c, "HCECLIENT_META_DATA", a11);
                                                                            bArr9 = e5;
                                                                        } catch (Exception e7) {
                                                                            exc = e7;
                                                                            bin3 = bin2;
                                                                            r142 = bArr4;
                                                                            bim3 = bim3;
                                                                        } catch (Throwable th9) {
                                                                            th3 = th9;
                                                                            bin3 = bin2;
                                                                            bim2 = bim3;
                                                                            r14 = bArr4;
                                                                            bis.m3128a(bim2, bin3, r14);
                                                                            bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                                            throw th3;
                                                                        }
                                                                    } else {
                                                                        bArr4 = "09";
                                                                        bim3 = bim;
                                                                    }
                                                                    try {
                                                                        byte[] bArr12 = new byte[40];
                                                                        if (z) {
                                                                            if (a6.f3345a[7] == 7) {
                                                                                b2 = 53;
                                                                            } else {
                                                                                b2 = 54;
                                                                            }
                                                                            bArr12[0] = b2;
                                                                            i = 0;
                                                                        } else {
                                                                            i = 0;
                                                                            bArr12[0] = a6.f3345a[7] == 7 ? (byte) 37 : 38;
                                                                        }
                                                                        bin5 = bin2;
                                                                        bArr9 = 1;
                                                                        bArr9 = 1;
                                                                        try {
                                                                            int a12 = bji.m3197a(bArr11, i, bArr12, 1, 8);
                                                                            if (!z) {
                                                                                try {
                                                                                    i2 = bji.m3197a(a10, i, bArr12, a12, a10.length);
                                                                                } catch (Exception e8) {
                                                                                    exc = e8;
                                                                                    r142 = bArr4;
                                                                                    bin3 = bin5;
                                                                                } catch (Throwable th10) {
                                                                                    th3 = th10;
                                                                                    bim2 = bim3;
                                                                                    r14 = bArr4;
                                                                                    bin3 = bin5;
                                                                                    bis.m3128a(bim2, bin3, r14);
                                                                                    bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                                                    throw th3;
                                                                                }
                                                                            } else {
                                                                                int a13 = bji.m3197a(a10, 2, bArr12, a12, 2);
                                                                                i2 = a13 + 1;
                                                                                bArr12[a13] = e4.f3302e;
                                                                                bArr12[i2] = a6.mo3177a(73493)[0];
                                                                            }
                                                                            short a14 = bji.m3202a(bArr12, i2, (short) c);
                                                                            if (!z) {
                                                                                int a15 = bji.m3197a(a6.f3347c, 20, bArr12, a14, 3);
                                                                                bArr12[a15] = e4.f3302e;
                                                                                bArr12[a15 + 1] = a6.mo3177a(73493)[0];
                                                                            } else {
                                                                                byte[] bArr13 = new byte[5];
                                                                                int length = (short) bArr2.length;
                                                                                byte[] bArr14 = new byte[12];
                                                                                short s2 = 0;
                                                                                while (bArr2[s2] == 0 && length > 0) {
                                                                                    s2 = (short) (s2 + 1);
                                                                                    length--;
                                                                                }
                                                                                if (length < 5) {
                                                                                    b = (byte) length;
                                                                                } else {
                                                                                    b = 5;
                                                                                }
                                                                                System.arraycopy(bArr2, s2, bArr14, 0, length);
                                                                                byte b5 = 0;
                                                                                while (b5 < b) {
                                                                                    bArr2 = bArr4;
                                                                                    bArr9 = bin5;
                                                                                    byte[] bArr15 = bArr13;
                                                                                    byte b6 = 0;
                                                                                    while (true) {
                                                                                        s = a14;
                                                                                        if (b6 >= 8) {
                                                                                            break;
                                                                                        }
                                                                                        byte b7 = 0;
                                                                                        int i3 = 0;
                                                                                        while (b7 < length) {
                                                                                            int i4 = length;
                                                                                            byte b8 = b6;
                                                                                            byte[] bArr16 = a10;
                                                                                            byte b9 = bArr14[b7];
                                                                                            int i5 = (b9 & 1) == 0 ? 0 : -128;
                                                                                            bArr14[b7] = (byte) (((b9 & 255) >>> 1) | i3);
                                                                                            b7 = (byte) (b7 + 1);
                                                                                            i3 = i5;
                                                                                            a10 = bArr16;
                                                                                            length = i4;
                                                                                            b6 = b8;
                                                                                        }
                                                                                        byte b10 = (byte) length;
                                                                                        while (true) {
                                                                                            bArr5 = a10;
                                                                                            if (b10 >= length + b) {
                                                                                                break;
                                                                                            }
                                                                                            try {
                                                                                                byte b11 = bArr14[b10];
                                                                                                int i6 = (b11 & 1) == 0 ? 0 : -128;
                                                                                                bArr14[b10] = (byte) (((b11 & 255) >>> 1) | i3);
                                                                                                b10 = (byte) (b10 + 1);
                                                                                                a10 = bArr5;
                                                                                                i3 = i6;
                                                                                            } catch (Exception e9) {
                                                                                                e = e9;
                                                                                                bim3 = bim3;
                                                                                                r143 = bArr2;
                                                                                                bin3 = bArr9;
                                                                                                exc = e;
                                                                                                bim bim622 = bim3;
                                                                                                bis.m3128a(bim622, bis.m3127a(exc), r142);
                                                                                                bje.m3183a(bim622.f3322d, biw.OPERATION.f3341b, 0);
                                                                                                bim4 = bim622;
                                                                                                atce.m75535a(bim4);
                                                                                                byte[] a722 = asti.m74762a(bim4.f3320a);
                                                                                                bil a822 = bit.mo3165a();
                                                                                                atce.m75535a(a822);
                                                                                                String str32 = a822.f3319a;
                                                                                                String str222 = new String(a722, 0, 15, StandardCharsets.UTF_8);
                                                                                                int parseInt32 = Integer.parseInt(new String(a722, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                                                                int parseInt222 = Integer.parseInt(new String(a722, 17, 2, StandardCharsets.UTF_8));
                                                                                                byte[] copyOfRange222 = Arrays.copyOfRange(a722, 21, 41);
                                                                                                copyOfRange = Arrays.copyOfRange(a722, 41, 61);
                                                                                                if (Arrays.equals(new byte[20], copyOfRange)) {
                                                                                                }
                                                                                                mo49812a(atbz);
                                                                                                atcm atcm22 = new atcm(new atct(bArr, str222, parseInt222, parseInt32, null, str32));
                                                                                                atce.m75536a(bit);
                                                                                                return atcm22;
                                                                                            } catch (Throwable th11) {
                                                                                                th = th11;
                                                                                                bim3 = bim3;
                                                                                                bArr3 = bArr2;
                                                                                                bin4 = bArr9;
                                                                                                th3 = th;
                                                                                                bim2 = bim3;
                                                                                                r14 = bArr3;
                                                                                                bin3 = bin4;
                                                                                                bis.m3128a(bim2, bin3, r14);
                                                                                                bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                        byte b12 = 0;
                                                                                        while (b12 < length) {
                                                                                            byte b13 = bArr14[b12];
                                                                                            int i7 = length;
                                                                                            byte b14 = b13 & 240;
                                                                                            byte b15 = b6;
                                                                                            byte b16 = ((byte) (b14 >>> 4)) >= 8 ? (byte) ((((byte) (b13 >>> 4)) - 3) << 4) : b14;
                                                                                            int i8 = b13 & 15;
                                                                                            if (i8 >= 8) {
                                                                                                i8 -= 3;
                                                                                            }
                                                                                            bArr14[b12] = (byte) (b16 | i8);
                                                                                            b12 = (byte) (b12 + 1);
                                                                                            length = i7;
                                                                                            b6 = b15;
                                                                                        }
                                                                                        b6 = (byte) (b6 + 1);
                                                                                        a14 = s;
                                                                                        a10 = bArr5;
                                                                                    }
                                                                                    b5 = (byte) (b5 + 1);
                                                                                    bin5 = bArr9;
                                                                                    bArr13 = bArr15;
                                                                                    a14 = s;
                                                                                    bArr4 = bArr2;
                                                                                }
                                                                                System.arraycopy(bArr14, length, bArr13, 5 - b, b);
                                                                                bji.m3197a(bArr13, 0, bArr12, a14, 5);
                                                                            }
                                                                            bix a16 = biy.m3166a();
                                                                            String a17 = bji.m3201a(a16.mo3177a(73492));
                                                                            String substring = a17.substring(0, a17.length() - 1);
                                                                            String a18 = bji.m3201a(a16.mo3177a(73494));
                                                                            String valueOf2 = String.valueOf(substring);
                                                                            String valueOf3 = String.valueOf(a18);
                                                                            byte[] bytes = (valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3)).getBytes();
                                                                            int length2 = bytes.length;
                                                                            byte[] bArr17 = new byte[(length2 + 40)];
                                                                            bji.m3197a(bytes, 0, bArr17, 0, length2);
                                                                            bji.m3197a(bArr12, 0, bArr17, length2, 40);
                                                                            bix.m3145f(f.mo3158d(bji.m3204a("baaaaaad"), bArr17));
                                                                            bim5.f3320a = bji.m3201a(bArr17);
                                                                            a6.f3347c[14] = -94;
                                                                            a6.mo3179b(335620, bjf.m3187a(a10, bArr11, (byte) 19));
                                                                        } catch (Exception e10) {
                                                                            e = e10;
                                                                            r143 = bArr4;
                                                                            bin3 = bin5;
                                                                            exc = e;
                                                                            bim bim6222 = bim3;
                                                                            bis.m3128a(bim6222, bis.m3127a(exc), r142);
                                                                            bje.m3183a(bim6222.f3322d, biw.OPERATION.f3341b, 0);
                                                                            bim4 = bim6222;
                                                                            atce.m75535a(bim4);
                                                                            byte[] a7222 = asti.m74762a(bim4.f3320a);
                                                                            bil a8222 = bit.mo3165a();
                                                                            atce.m75535a(a8222);
                                                                            String str322 = a8222.f3319a;
                                                                            String str2222 = new String(a7222, 0, 15, StandardCharsets.UTF_8);
                                                                            int parseInt322 = Integer.parseInt(new String(a7222, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                                            int parseInt2222 = Integer.parseInt(new String(a7222, 17, 2, StandardCharsets.UTF_8));
                                                                            byte[] copyOfRange2222 = Arrays.copyOfRange(a7222, 21, 41);
                                                                            copyOfRange = Arrays.copyOfRange(a7222, 41, 61);
                                                                            if (Arrays.equals(new byte[20], copyOfRange)) {
                                                                            }
                                                                            mo49812a(atbz);
                                                                            atcm atcm222 = new atcm(new atct(bArr, str2222, parseInt2222, parseInt322, null, str322));
                                                                            atce.m75536a(bit);
                                                                            return atcm222;
                                                                        } catch (Throwable th12) {
                                                                            th = th12;
                                                                            bArr3 = bArr4;
                                                                            bin4 = bin5;
                                                                            th3 = th;
                                                                            bim2 = bim3;
                                                                            r14 = bArr3;
                                                                            bin3 = bin4;
                                                                            bis.m3128a(bim2, bin3, r14);
                                                                            bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                                            throw th3;
                                                                        }
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        bin3 = bin2;
                                                                        r143 = bArr4;
                                                                        exc = e;
                                                                        bim bim62222 = bim3;
                                                                        bis.m3128a(bim62222, bis.m3127a(exc), r142);
                                                                        bje.m3183a(bim62222.f3322d, biw.OPERATION.f3341b, 0);
                                                                        bim4 = bim62222;
                                                                        atce.m75535a(bim4);
                                                                        byte[] a72222 = asti.m74762a(bim4.f3320a);
                                                                        bil a82222 = bit.mo3165a();
                                                                        atce.m75535a(a82222);
                                                                        String str3222 = a82222.f3319a;
                                                                        String str22222 = new String(a72222, 0, 15, StandardCharsets.UTF_8);
                                                                        int parseInt3222 = Integer.parseInt(new String(a72222, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                                        int parseInt22222 = Integer.parseInt(new String(a72222, 17, 2, StandardCharsets.UTF_8));
                                                                        byte[] copyOfRange22222 = Arrays.copyOfRange(a72222, 21, 41);
                                                                        copyOfRange = Arrays.copyOfRange(a72222, 41, 61);
                                                                        if (Arrays.equals(new byte[20], copyOfRange)) {
                                                                        }
                                                                        mo49812a(atbz);
                                                                        atcm atcm2222 = new atcm(new atct(bArr, str22222, parseInt22222, parseInt3222, null, str3222));
                                                                        atce.m75536a(bit);
                                                                        return atcm2222;
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                        bin4 = bin2;
                                                                        bArr3 = bArr4;
                                                                        th3 = th;
                                                                        bim2 = bim3;
                                                                        r14 = bArr3;
                                                                        bin3 = bin4;
                                                                        bis.m3128a(bim2, bin3, r14);
                                                                        bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                                        throw th3;
                                                                    }
                                                                    try {
                                                                        bis.m3128a(bim5, bin5, bArr4);
                                                                        bje.m3183a(bim5.f3322d, biw.OPERATION.f3341b, 0);
                                                                        bim4 = bim5;
                                                                        atce.m75535a(bim4);
                                                                        byte[] a722222 = asti.m74762a(bim4.f3320a);
                                                                        bil a822222 = bit.mo3165a();
                                                                        atce.m75535a(a822222);
                                                                        String str32222 = a822222.f3319a;
                                                                        String str222222 = new String(a722222, 0, 15, StandardCharsets.UTF_8);
                                                                        int parseInt32222 = Integer.parseInt(new String(a722222, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                                        int parseInt222222 = Integer.parseInt(new String(a722222, 17, 2, StandardCharsets.UTF_8));
                                                                        byte[] copyOfRange222222 = Arrays.copyOfRange(a722222, 21, 41);
                                                                        copyOfRange = Arrays.copyOfRange(a722222, 41, 61);
                                                                        if (Arrays.equals(new byte[20], copyOfRange)) {
                                                                            byte[] copyOf = Arrays.copyOf(copyOfRange222222, 40);
                                                                            System.arraycopy(copyOfRange, 0, copyOf, 20, 20);
                                                                            bArr = copyOf;
                                                                        } else {
                                                                            bArr = copyOfRange222222;
                                                                        }
                                                                        mo49812a(atbz);
                                                                        atcm atcm22222 = new atcm(new atct(bArr, str222222, parseInt222222, parseInt32222, null, str32222));
                                                                        atce.m75536a(bit);
                                                                        return atcm22222;
                                                                    } catch (atcd e12) {
                                                                        e = e12;
                                                                        atcd = e;
                                                                        bit.mo3165a();
                                                                        throw new atcr(atcd);
                                                                    } catch (Throwable th14) {
                                                                        th = th14;
                                                                        th = th;
                                                                        atce.m75536a(bit);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                            throw new bic(bib.f3275e);
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            r143 = "09";
                                                            bin3 = bin2;
                                                            bim3 = bim;
                                                            exc = e;
                                                            bim bim622222 = bim3;
                                                            bis.m3128a(bim622222, bis.m3127a(exc), r142);
                                                            bje.m3183a(bim622222.f3322d, biw.OPERATION.f3341b, 0);
                                                            bim4 = bim622222;
                                                            atce.m75535a(bim4);
                                                            byte[] a7222222 = asti.m74762a(bim4.f3320a);
                                                            bil a8222222 = bit.mo3165a();
                                                            atce.m75535a(a8222222);
                                                            String str322222 = a8222222.f3319a;
                                                            String str2222222 = new String(a7222222, 0, 15, StandardCharsets.UTF_8);
                                                            int parseInt322222 = Integer.parseInt(new String(a7222222, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                                            int parseInt2222222 = Integer.parseInt(new String(a7222222, 17, 2, StandardCharsets.UTF_8));
                                                            byte[] copyOfRange2222222 = Arrays.copyOfRange(a7222222, 21, 41);
                                                            copyOfRange = Arrays.copyOfRange(a7222222, 41, 61);
                                                            if (Arrays.equals(new byte[20], copyOfRange)) {
                                                            }
                                                            mo49812a(atbz);
                                                            atcm atcm222222 = new atcm(new atct(bArr, str2222222, parseInt2222222, parseInt322222, null, str322222));
                                                            atce.m75536a(bit);
                                                            return atcm222222;
                                                        } catch (Throwable th15) {
                                                            th = th15;
                                                            ? r144 = "09";
                                                            bin3 = bin2;
                                                            th3 = th;
                                                            bim2 = bim;
                                                            bis.m3128a(bim2, bin3, r14);
                                                            bje.m3183a(bim2.f3322d, biw.OPERATION.f3341b, 0);
                                                            throw th3;
                                                        }
                                                    } else {
                                                        throw new bic(bib.f3276f);
                                                    }
                                                }
                                            }
                                            throw new bic(bib.f3276f);
                                        }
                                        throw new bic(bib.f3276f);
                                    }
                                }
                                throw new bic(bib.f3276f);
                            }
                            bArr8[23] = -91;
                            biw.OPERATION.f3341b = bii.PAYMENT;
                            bin = bib.f3271a;
                            try {
                                bis.m3128a(bin, bin, "08");
                                bje.m3183a(bin.f3322d, biw.OPERATION.f3341b, 0);
                                atce.m75535a(bin);
                                byte[] a52 = asuv.m74876a(Long.toString(atcp2.f90085c / 10000));
                                z = atcp2.f90089g;
                                bin2 = bib.f3271a;
                                bim = new bim();
                                try {
                                    bim3 = 23;
                                    bim3 = 23;
                                    bim3 = 23;
                                    bim3 = 23;
                                    byte[] bArr92 = {29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, Byte.MIN_VALUE, 0, 0};
                                    byte[] bArr102 = {3, -96, 1, 1};
                                    if (z) {
                                    }
                                    bim bim52 = new bim();
                                    bix a62 = biy.m3166a();
                                    if (biw.OPERATION.f3341b == null) {
                                    }
                                    throw new bic(bib.f3276f);
                                } catch (Exception e14) {
                                    e = e14;
                                    r143 = "09";
                                    bit = a2;
                                    bin3 = bin2;
                                    bim3 = bim;
                                    exc = e;
                                    bim bim6222222 = bim3;
                                    bis.m3128a(bim6222222, bis.m3127a(exc), r142);
                                    bje.m3183a(bim6222222.f3322d, biw.OPERATION.f3341b, 0);
                                    bim4 = bim6222222;
                                    atce.m75535a(bim4);
                                    byte[] a72222222 = asti.m74762a(bim4.f3320a);
                                    bil a82222222 = bit.mo3165a();
                                    atce.m75535a(a82222222);
                                    String str3222222 = a82222222.f3319a;
                                    String str22222222 = new String(a72222222, 0, 15, StandardCharsets.UTF_8);
                                    int parseInt3222222 = Integer.parseInt(new String(a72222222, 15, 2, StandardCharsets.UTF_8)) + 2000;
                                    int parseInt22222222 = Integer.parseInt(new String(a72222222, 17, 2, StandardCharsets.UTF_8));
                                    byte[] copyOfRange22222222 = Arrays.copyOfRange(a72222222, 21, 41);
                                    copyOfRange = Arrays.copyOfRange(a72222222, 41, 61);
                                    if (Arrays.equals(new byte[20], copyOfRange)) {
                                    }
                                    mo49812a(atbz);
                                    atcm atcm2222222 = new atcm(new atct(bArr, str22222222, parseInt22222222, parseInt3222222, null, str3222222));
                                    atce.m75536a(bit);
                                    return atcm2222222;
                                } catch (Throwable th16) {
                                }
                            } catch (atcd e15) {
                                atcd = e15;
                                bit = a2;
                            } catch (Throwable th17) {
                                th = th17;
                                bit = a2;
                                atce.m75536a(bit);
                                throw th;
                            }
                        } else {
                            throw new bic(bib.f3276f);
                        }
                    } catch (Exception e16) {
                        bin = bis.m3127a(e16);
                        bis.m3128a(bin, bin, "08");
                        bje.m3183a(bin.f3322d, biw.OPERATION.f3341b, 0);
                    } catch (Throwable th18) {
                        th2 = th18;
                        bis.m3128a(bin6, bin6, "08");
                        bje.m3183a(bin6.f3322d, biw.OPERATION.f3341b, 0);
                        throw th2;
                    }
                } catch (atcd e17) {
                    e = e17;
                    bit = a2;
                    atcd = e;
                    bit.mo3165a();
                    throw new atcr(atcd);
                } catch (Throwable th19) {
                    th = th19;
                    bit = a2;
                    th = th;
                    atce.m75536a(bit);
                    throw th;
                }
            } else {
                throw new atcr();
            }
        } catch (atcz e18) {
            throw new atcr(e18);
        }
    }

    /* renamed from: i */
    private final boolean m75456i() {
        bip c = mo49813c();
        int i = c.f3325a;
        boolean z = c.f3326b;
        String str = c.f3323e;
        String str2 = c.f3321c;
        String str3 = c.f3322d;
        return i > 0;
    }

    /* renamed from: b */
    public final btjw mo49800b() {
        return btjw.f149188c;
    }

    /* renamed from: c */
    public final bip mo49813c() {
        bit a = atce.m75534a(mo49811a((byte[]) null));
        try {
            return a.mo3167a(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - ((bycu) this.f90045b.f164949b).f165709c), "token ref id");
        } finally {
            atce.m75536a(a);
        }
    }

    /* renamed from: d */
    public final atcs mo49802d() {
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(mo49813c().f3328g);
        long millis = TimeUnit.HOURS.toMillis(6);
        long j = ((bycu) this.f90045b.f164949b).f165709c;
        return new atcs(currentTimeMillis + j, currentTimeMillis + millis + j);
    }

    /* renamed from: e */
    public final boolean mo49803e() {
        return mo49813c().f3326b;
    }

    /* renamed from: f */
    public final boolean mo49804f() {
        return false;
    }

    /* renamed from: g */
    public final int mo49805g() {
        return ((bycu) this.f90045b.f164949b).f165714h;
    }

    /* renamed from: h */
    public final byte[] mo49806h() {
        return ((bycu) this.f90045b.mo74062i()).serializeToBytes();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asqs mo49793a(askf askf, asqq asqq, String str) {
        try {
            if (m75456i()) {
                return new asrf(mo49811a((byte[]) null), asqq, ((bycu) this.f90045b.f164949b).f165713g.getKey(), str);
            }
            return null;
        } catch (atcd | atcz e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final atbz mo49811a(byte[] bArr) {
        bycy bycy;
        bycw bycw;
        bycw bycw2;
        bycu bycu = (bycu) this.f90045b.f164949b;
        String str = bycu.f165715i;
        bycy bycy2 = bycu.f165712f;
        if (bycy2 != null) {
            bycy = bycy2;
        } else {
            bycy = bycy.f165733j;
        }
        bycu bycu2 = (bycu) this.f90045b.f164949b;
        if ((bycu2.f165707a & 512) != 0) {
            bycw bycw3 = bycu2.f165716j;
            if (bycw3 != null) {
                bycw = bycw3;
                return new atbz(str, bycy, bycw, bArr, ((bycu) this.f90045b.f164949b).f165711e);
            }
            bycw2 = bycw.f165723i;
        } else {
            bycw2 = null;
        }
        bycw = bycw2;
        return new atbz(str, bycy, bycw, bArr, ((bycu) this.f90045b.f164949b).f165711e);
    }

    /* renamed from: a */
    public final atcq mo49795a(atcp atcp, askf askf, btiy btiy) {
        return m75455a(atcp);
    }

    /* renamed from: a */
    public final btmd mo49796a() {
        bxvd da = btlw.f149442g.mo74144da();
        bip c = mo49813c();
        if (c.f3329h == null && c.f3328g == -1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btlw) da.f164949b).f149450h = true;
        }
        String str = c.f3321c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btlw btlw = (btlw) da.f164949b;
        str.getClass();
        btlw.f149444a = str;
        String str2 = c.f3322d;
        str2.getClass();
        btlw.f149445b = str2;
        String str3 = c.f3323e;
        str3.getClass();
        btlw.f149446c = str3;
        String num = Integer.toString(c.f3325a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        num.getClass();
        ((btlw) da.f164949b).f149447d = num;
        String num2 = Integer.toString(c.f3327f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        num2.getClass();
        ((btlw) da.f164949b).f149448e = num2;
        btmr a = atvf.m76450a(this.f90046d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btlw) da.f164949b).f149449f = a;
        bxvd da2 = btmd.f149473c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btmd btmd = (btmd) da2.f164949b;
        btlw btlw2 = (btlw) da.mo74062i();
        btlw2.getClass();
        btmd.f149476b = btlw2;
        btmd.f149475a = 3;
        return (btmd) da2.mo74062i();
    }

    /* renamed from: a */
    public final void mo49797a(asqs asqs) {
        try {
            m75455a(new atcp());
        } catch (atcr e) {
        }
    }

    /* renamed from: a */
    public final void mo49798a(asqs asqs, askf askf) {
        if (!(asqs instanceof asrf)) {
            bnsl bnsl = (bnsl) f90044c.mo68388c();
            bnsl.mo68432a("atby", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected applet type: %s. Doing nothing.", asqs.getClass());
            return;
        }
        asrf asrf = (asrf) asqs;
        try {
            asqs.mo49387b().f89415k = mo49813c().f3325a;
        } catch (atcz e) {
            bnsl bnsl2 = (bnsl) f90044c.mo68390d();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("atby", "a", 198, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get number of keys left");
        }
        mo49812a(asrf.f89497a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49812a(atci atci) {
        if (atci != null) {
            bxvd bxvd = this.f90045b;
            String c = atci.mo49815c();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bycu bycu = (bycu) bxvd.f164949b;
            bycu bycu2 = bycu.f165705k;
            c.getClass();
            bycu.f165707a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bycu.f165715i = c;
            String a = stm.m36299a(atci.mo49817e());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bycu bycu3 = (bycu) bxvd.f164949b;
            a.getClass();
            bycu3.f165707a |= 16;
            bycu3.f165711e = a;
            bycy b = atci.mo49814b();
            if (b == null) {
                bxvd bxvd2 = this.f90045b;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bycu bycu4 = (bycu) bxvd2.f164949b;
                bycu4.f165712f = null;
                bycu4.f165707a &= -33;
            } else {
                bxvd bxvd3 = this.f90045b;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bycu bycu5 = (bycu) bxvd3.f164949b;
                b.getClass();
                bycu5.f165712f = b;
                bycu5.f165707a |= 32;
            }
            bycw d = atci.mo49816d();
            if (d == null) {
                bxvd bxvd4 = this.f90045b;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bycu bycu6 = (bycu) bxvd4.f164949b;
                bycu6.f165716j = null;
                bycu6.f165707a &= -513;
                return;
            }
            bxvd bxvd5 = this.f90045b;
            if (bxvd5.f164950c) {
                bxvd5.mo74035c();
                bxvd5.f164950c = false;
            }
            bycu bycu7 = (bycu) bxvd5.f164949b;
            d.getClass();
            bycu7.f165716j = d;
            bycu7.f165707a |= 512;
        }
    }
}
