package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: atbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atbq {

    /* renamed from: a */
    public static final srn f90017a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    private static final long f90018b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    private static final long f90019c = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: d */
    private static final atxy f90020d = new atxy(f90019c);

    /* renamed from: e */
    private static final bnic f90021e = bnic.m109493a("felica_bundle", "felica_id_bundle", "felica_quicpay_bundle", "felica_quicpay_aptest_bundle", "felica_id_aptest_bundle");

    /* renamed from: f */
    private static final ReentrantLock f90022f = new ReentrantLock();

    /* renamed from: g */
    private static final atbj f90023g = new atbj(TimeUnit.SECONDS.toMillis(30), TimeUnit.HOURS.toMillis(1));

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8 A[RETURN] */
    /* renamed from: a */
    public static int m75399a(atda atda, long j) {
        char c;
        String str = atda.f90103d;
        int hashCode = str.hashCode();
        if (hashCode != -1422950650) {
            if (hashCode != 407754553) {
                if (hashCode == 881487833 && str.equals("type_switch")) {
                    c = 1;
                    if (c != 0) {
                        return 3;
                    }
                    if (c == 1) {
                        return 4;
                    }
                    if (c != 2) {
                        bnsl bnsl = (bnsl) f90017a.mo68387b();
                        bnsl.mo68432a("atbq", "a", 1002, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Unexpected token state for replenishment");
                        return 7;
                    }
                    atcv atcv = atda.f90108i;
                    if (atcv == null) {
                        bnsl bnsl2 = (bnsl) f90017a.mo68387b();
                        bnsl2.mo68432a("atbq", "b", 1009, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Bundle adapter null while checking replenish reason");
                        return 8;
                    }
                    try {
                        if (atcv.mo49803e()) {
                            return 5;
                        }
                        if (j >= atda.f90108i.mo49802d().f90092a) {
                            return 6;
                        }
                        bnsl bnsl3 = (bnsl) f90017a.mo68387b();
                        bnsl3.mo68432a("atbq", "b", 1026, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Active token is being replenished for unexpected reason");
                        return 10;
                    } catch (atcz e) {
                        bnsl bnsl4 = (bnsl) f90017a.mo68387b();
                        bnsl4.mo68437a(e);
                        bnsl4.mo68432a("atbq", "b", 1022, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Error while checking active token replenish reason");
                        return 9;
                    }
                }
            } else if (str.equals("needs_refresh")) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (str.equals("active")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: b */
    private static int m75409b(atda atda, long j) {
        atcv atcv = atda.f90108i;
        if (atcv != null) {
            try {
                if (atcv.mo49803e()) {
                    return 5;
                }
                if (j >= atda.f90108i.mo49802d().f90092a) {
                    return 6;
                }
                bnsl bnsl = (bnsl) f90017a.mo68387b();
                bnsl.mo68432a("atbq", "b", 1026, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Active token is being replenished for unexpected reason");
                return 10;
            } catch (atcz e) {
                bnsl bnsl2 = (bnsl) f90017a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("atbq", "b", 1022, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Error while checking active token replenish reason");
                return 9;
            }
        } else {
            bnsl bnsl3 = (bnsl) f90017a.mo68387b();
            bnsl3.mo68432a("atbq", "b", 1009, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Bundle adapter null while checking replenish reason");
            return 8;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atbm.a(askf, java.lang.String, long, boolean):byda
     arg types: [askf, java.lang.String, long, int]
     candidates:
      atbm.a(android.database.sqlite.SQLiteDatabase, askf, java.lang.String, com.google.android.gms.tapandpay.security.StorageKey):atda
      atbm.a(askf, java.lang.String, java.lang.String[], java.lang.String):boolean
      atbm.a(askf, java.lang.String, long, boolean):byda */
    /* renamed from: c */
    private final atcs m75412c(askf askf, String str) {
        try {
            mo49781a();
            return m75402a(atbm.m75387a(askf, str, System.currentTimeMillis(), false));
        } catch (atdb e) {
            bnsl bnsl = (bnsl) f90017a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbq", "c", 295, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Bundle gone while recording error");
            long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(100);
            return new atcs(currentTimeMillis, currentTimeMillis);
        }
    }

    /* renamed from: b */
    private static asqs m75410b(askf askf, atda atda) {
        atcv atcv;
        if (atda != null && (atcv = atda.f90108i) != null) {
            return atcv.mo49793a(askf, new aszu(askf.f89126d, aszu.m75260a(atcv.mo49805g()), new asqw()), atda.f90102c);
        }
        bnsl bnsl = (bnsl) f90017a.mo68387b();
        bnsl.mo68432a("atbq", "b", 1063, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Bundle adapter not set");
        return null;
    }

    /* renamed from: c */
    private static bnic m75413c(askf askf, atda atda) {
        asqs asqs;
        atcv atcv;
        if (atda == null || (atcv = atda.f90108i) == null) {
            bnsl bnsl = (bnsl) f90017a.mo68387b();
            bnsl.mo68432a("atbq", "b", 1063, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Bundle adapter not set");
            asqs = null;
        } else {
            asqs = atcv.mo49793a(askf, new aszu(askf.f89126d, aszu.m75260a(atcv.mo49805g()), new asqw()), atda.f90102c);
        }
        if (asqs == null) {
            bnsl bnsl2 = (bnsl) f90017a.mo68387b();
            bnsl2.mo68432a("atbq", "c", 1079, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Payment applet is null");
            return bnon.f131923a;
        }
        bnia bnia = new bnia();
        for (astc astc : asqs.mo49386a()) {
            bnia.mo67629b(astc.toString());
        }
        return bnia.mo67751a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static final atcs m75400a(long j, atda atda) {
        char c;
        long millis = TimeUnit.DAYS.toMillis(100) + j;
        atcs atcs = new atcs(millis, millis);
        if (atda == null) {
            return atcs;
        }
        atcs atcs2 = new atcs(j, j);
        atcs a = m75402a(atda.f90109j);
        if (a != null) {
            return a;
        }
        atds a2 = atds.m75666a(atda.f90100a);
        String str = atda.f90103d;
        switch (str.hashCode()) {
            case -1422950650:
                if (str.equals("active")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -766681394:
                if (str.equals("ready_for_pickup")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 108960:
                if (str.equals("new")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 407754553:
                if (str.equals("needs_refresh")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 693933934:
                if (str.equals("requested")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 881487833:
                if (str.equals("type_switch")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1550463001:
                if (str.equals("deleted")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1698062945:
                if (str.equals("unacknowledged")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return atcs;
            case 1:
                long j2 = atda.f90107h;
                return new atcs(j2, f90018b + j2);
            case 2:
                return atda.f90104e != null ? atcs2 : atcs;
            case 3:
            case 4:
                return atcs2;
            case 5:
                if (!a2.mo49858c(atda.f90102c)) {
                    return atcs;
                }
                if (atda.f90108i.mo49803e()) {
                    return atcs2;
                }
                return atda.f90108i.mo49802d();
            case 6:
            case 7:
                return a2.mo49858c(atda.f90102c) ? atcs2 : atcs;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:90:0x01d8 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:144:0x0292 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:640:0x0a01 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:152:0x02ad */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:197:0x035d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:541:0x0994 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:494:0x08ba */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:645:0x0a01 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:644:0x0a01 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:449:0x07ea */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:218:0x03bf */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:221:0x03ca */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:399:0x06fc */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:374:0x067c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:168:0x02ed */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:61:0x0152 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:79:0x01c4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:66:0x0184 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:72:0x01a7 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String], assign insn: 0x0008: CONST_STR  (r15v0 ? I:java.lang.String) =  "Bundle gone while recording error" */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String], assign insn: PHI: (r13v1 ?) = (r13v17 ?), (r13v45 ?), (r13v46 ?), (r13v49 ?), (r13v51 ?), (r13v52 ?), (r13v53 ?) binds: [B:477:0x0868, B:208:0x037f, B:162:0x02cc, B:103:0x0202, B:588:0x0a94, B:482:0x087d, B:439:0x078d] */
    /* JADX WARN: Type inference failed for: r12v2, assign insn: PHI: (r12v2 ?) = (r12v7 ?), (r12v7 ?), (r12v12 ?), (r12v13 ?), (r12v14 ?), (r12v14 ?), (r12v20 ?), (r12v10 ?), (r12v76 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r12v77 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r12v78 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:144:0x0292, B:147:0x0298, B:198:?, B:555:0x09f8, B:494:0x08ba, B:514:0x0918, B:517:0x0929, B:152:0x02ad, B:602:0x0ace, B:197:0x035d, B:541:0x0994] */
    /* JADX WARN: Type inference failed for: r15v18, assign insn: PHI: (r15v18 ?) = (r15v0 ?), (r15v0 ?), (r15v0 ?), (r15v100 ?), (r15v0 ?), (r15v118 ?), (r15v123 ?) binds: [B:112:0x022e, B:101:0x01fc, B:82:0x01c8, B:67:?, B:10:0x004a, B:100:?, B:74:0x01aa] */
    /* JADX WARN: Type inference failed for: r28v8, assign insn: PHI: (r28v8 ?) = (r28v21 ?), (r28v11 ?) binds: [B:134:0x0280, B:557:0x0a01] */
    /* JADX WARN: Type inference failed for: r16v1, assign insn: PHI: (r16v1 ?) = (r16v0 long), (r16v27 ?) binds: [B:134:0x0280, B:557:0x0a01] */
    /* JADX WARN: Type inference failed for: r12v7, assign insn: 0x0291: MOVE  (r12v7 ? I:?[OBJECT, ARRAY]) = (r2v28 atds) */
    /* JADX WARN: Type inference failed for: r12v10, types: [int], assign insn: 0x02a0: INVOKE  (r12v10 ? I:int) = (r12v9 java.util.concurrent.atomic.AtomicInteger) type: VIRTUAL call: java.util.concurrent.atomic.AtomicInteger.get():int */
    /* JADX WARN: Type inference failed for: r28v10, assign insn: PHI: (r28v10 ?) = (r28v12 ?), (r28v15 ?), (r28v15 ?) binds: [B:168:0x02ed, B:152:0x02ad, B:153:?] */
    /* JADX WARN: Type inference failed for: r28v11, assign insn: PHI: (r28v11 ?) = (r28v12 ?), (r28v15 ?) binds: [B:169:?, B:159:0x02bb] */
    /* JADX WARN: Type inference failed for: r12v12, assign insn: 0x035c: CONST  (r12v12 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r16v2, assign insn: PHI: (r16v2 ?) = (r16v1 ?), (r16v1 ?), (r16v3 java.lang.String), (r16v4 java.lang.String), (r16v4 java.lang.String), (r16v18 java.lang.String), (r16v23 java.lang.String) binds: [B:640:0x0a01, B:646:0x0a01, B:645:0x0a01, B:644:0x0a01, B:643:0x0a01, B:642:0x0a01, B:641:0x0a01] */
    /* JADX WARN: Type inference failed for: r13v12, assign insn: PHI: (r13v12 ?) = (r13v14 ?), (r13v15 ?), (r13v15 ?), (r13v17 ?), (r13v17 ?), (r13v32 ?), (r13v41 ?) binds: [B:640:0x0a01, B:646:0x0a01, B:645:0x0a01, B:644:0x0a01, B:643:0x0a01, B:642:0x0a01, B:641:0x0a01] */
    /* JADX WARN: Type inference failed for: r13v14, assign insn: 0x098c: MOVE  (r13v14 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v13, assign insn: 0x0991: CONST  (r12v13 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r13v15, assign insn: 0x08a4: MOVE  (r13v15 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v14, assign insn: 0x08a7: MOVE  (r12v14 ? I:?[OBJECT, ARRAY]) = (r23v7 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v20, assign insn: 0x0922: CONST  (r12v20 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r13v16, assign insn: PHI: (r13v16 ?) = (r13v17 ?), (r13v55 ?) binds: [B:481:0x087a, B:425:0x075d] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.String], assign insn: 0x07ac: MOVE  (r13v17 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v6, assign insn: PHI: (r10v6 ?) = (r10v2 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String) binds: [B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] */
    /* JADX WARN: Type inference failed for: r10v7, assign insn: PHI: (r10v7 ?) = (r10v2 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String) binds: [B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.String], assign insn: 0x03b9: IGET  (r13v24 ? I:java.lang.String) = (r3v22 atda) atda.c java.lang.String */
    /* JADX WARN: Type inference failed for: r16v6, assign insn: PHI: (r16v6 ?) = (r16v1 ?), (r16v1 ?), (r16v18 java.lang.String), (r16v23 java.lang.String) binds: [B:218:0x03bf, B:221:0x03ca, B:403:0x0704, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r12v28, assign insn: PHI: (r12v28 ?) = (r12v26 com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters), (r12v26 com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters), (r12v34 ?), (r12v44 ?) binds: [B:218:0x03bf, B:221:0x03ca, B:403:0x0704, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r16v8, assign insn: PHI: (r16v8 ?) = (r16v1 ?), (r16v1 ?), (r16v18 java.lang.String), (r16v23 java.lang.String) binds: [B:218:0x03bf, B:221:0x03ca, B:403:0x0704, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r16v10, assign insn: PHI: (r16v10 ?) = (r16v1 ?), (r16v1 ?), (r16v18 java.lang.String), (r16v23 java.lang.String) binds: [B:218:0x03bf, B:221:0x03ca, B:403:0x0704, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r13v26, assign insn: PHI: (r13v26 ?) = (r13v24 ?), (r13v29 ?), (r13v32 ?), (r13v41 ?) binds: [B:218:0x03bf, B:221:0x03ca, B:403:0x0704, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r13v29, types: [java.lang.Object, btiw], assign insn: 0x03c4: INVOKE  (r13v29 ? I:btiw) = (r13v28 athh), (r15v51 askf) type: VIRTUAL call: athh.a(askf):btiw */
    /* JADX WARN: Type inference failed for: r12v32, assign insn: PHI: (r12v32 ?) = (r12v34 ?), (r12v44 ?) binds: [B:399:0x06fc, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r12v33, assign insn: PHI: (r12v33 ?) = (r12v34 ?), (r12v44 ?) binds: [B:399:0x06fc, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r13v31, assign insn: PHI: (r13v31 ?) = (r13v32 ?), (r13v41 ?) binds: [B:399:0x06fc, B:374:0x067c] */
    /* JADX WARN: Type inference failed for: r13v32, assign insn: PHI: (r13v32 ?) = (r13v37 ?), (r13v42 ?), (r13v44 ?), (r13v58 ?) binds: [B:378:0x068e, B:380:0x06a1, B:230:0x03da, B:398:0x06fb] */
    /* JADX WARN: Type inference failed for: r12v34, assign insn: PHI: (r12v34 ?) = (r12v42 ?), (r12v46 ?), (r12v59 ?), (r12v86 ?) binds: [B:378:0x068e, B:380:0x06a1, B:230:0x03da, B:398:0x06fb] */
    /* JADX WARN: Type inference failed for: r13v37, assign insn: 0x0696: MOVE  (r13v37 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v42, assign insn: 0x0697: MOVE  (r12v42 ? I:?[OBJECT, ARRAY]) = (r23v7 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v41, assign insn: 0x0676: MOVE  (r13v41 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v44, assign insn: 0x0678: MOVE  (r12v44 ? I:?[OBJECT, ARRAY]) = (r23v7 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v42, assign insn: 0x06a9: MOVE  (r13v42 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v46, assign insn: 0x06aa: MOVE  (r12v46 ? I:?[OBJECT, ARRAY]) = (r23v7 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v44, assign insn: 0x03e3: MOVE  (r13v44 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r12v59, assign insn: 0x03e4: MOVE  (r12v59 ? I:?[OBJECT, ARRAY]) = (r23v7 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v45, assign insn: 0x0384: MOVE  (r13v45 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r28v12, assign insn: PHI: (r28v12 ?) = (r28v15 ?), (r28v16 ?) binds: [B:155:0x02b1, B:150:0x02a6] */
    /* JADX WARN: Type inference failed for: r28v13, assign insn: PHI: (r28v13 ?) = (r28v11 ?), (r28v24 ?) binds: [B:433:0x077d, B:164:0x02da] */
    /* JADX WARN: Type inference failed for: r28v14, assign insn: PHI: (r28v14 ?) = (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v15 ?) binds: [B:199:0x0361, B:200:?, B:216:0x03af, B:367:0x063d, B:334:0x05c1, B:262:0x045d, B:268:0x046f, B:256:0x0430, B:227:0x03d2, B:156:0x02b3] */
    /* JADX WARN: Type inference failed for: r13v46, assign insn: 0x02d4: MOVE  (r13v46 ? I:?[OBJECT, ARRAY]) = (r10v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r28v15, assign insn: 0x02ab: MOVE  (r28v15 ? I:?[long, double]) = (r14v13 long) */
    /* JADX WARN: Type inference failed for: r28v16, assign insn: 0x02a6: MOVE  (r28v16 ? I:?[long, double]) = (r14v13 long) */
    /* JADX WARN: Type inference failed for: r13v49, assign insn: 0x020c: MOVE  (r13v49 ? I:?[OBJECT, ARRAY]) = (r10v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v93, assign insn: PHI: (r15v93 ?) = (r15v0 ?), (r15v119 ?) binds: [B:37:0x00b7, B:98:0x01e5] */
    /* JADX WARN: Type inference failed for: r15v94, assign insn: PHI: (r15v94 ?) = (r15v0 ?), (r15v120 ?) binds: [B:97:0x01e3, B:93:0x01dc] */
    /* JADX WARN: Type inference failed for: r28v21, assign insn: 0x007c: CONST  (r28v21 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r15v95, assign insn: PHI: (r15v95 ?) = (r15v0 ?), (r15v99 ?), (r15v100 ?), (r15v100 ?), (r15v102 ?), (r15v0 ?) binds: [B:90:0x01d8, B:79:0x01c4, B:66:0x0184, B:67:?, B:72:0x01a7, B:49:0x00e8] */
    /* JADX WARN: Type inference failed for: r15v96, assign insn: PHI: (r15v96 ?) = (r15v0 ?), (r15v126 ?) binds: [B:45:0x00da, B:50:?] */
    /* JADX WARN: Type inference failed for: r15v97, assign insn: PHI: (r15v97 ?) = (r15v122 ?), (r15v124 ?) binds: [B:52:0x00fc, B:56:0x012a] */
    /* JADX WARN: Type inference failed for: r15v98, assign insn: PHI: (r15v98 ?) = (r15v102 ?), (r15v97 ?) binds: [B:73:?, B:59:0x0136] */
    /* JADX WARN: Type inference failed for: r15v99, assign insn: PHI: (r15v99 ?) = (r15v97 ?), (r15v100 ?), (r15v102 ?), (r15v102 ?) binds: [B:61:0x0152, B:68:0x0189, B:75:0x01be, B:76:?] */
    /* JADX WARN: Type inference failed for: r15v100, types: [boolean], assign insn: 0x015e: INVOKE  (r15v100 ? I:boolean) = (r5v64 java.util.Iterator) type: INTERFACE call: java.util.Iterator.hasNext():boolean */
    /* JADX WARN: Type inference failed for: r15v102, types: [java.lang.String], assign insn: 0x018d: CHECK_CAST  (r15v102 ? I:java.lang.String) = (java.lang.String) (r15v101 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r12v76, assign insn: 0x0ac8: CONST  (r12v76 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r12v77, assign insn: 0x035c: CONST  (r12v77 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r12v78, assign insn: 0x0991: CONST  (r12v78 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r13v50, assign insn: ?: MOVE  (r13v50 ?) = (r13v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v51, assign insn: ?: MOVE  (r13v51 ?) = (r13v4 java.lang.String) */
    /* JADX WARN: Type inference failed for: r16v27, assign insn: ?: MOVE  (r16v27 ?) = (r16v2 ?) */
    /* JADX WARN: Type inference failed for: r13v52, assign insn: ?: MOVE  (r13v52 ?) = (r13v16 ?) */
    /* JADX WARN: Type inference failed for: r13v53, assign insn: ?: MOVE  (r13v53 ?) = (r13v18 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r13v55, assign insn: ?: MOVE  (r13v55 ?) = (r13v25 boolean) */
    /* JADX WARN: Type inference failed for: r13v58, assign insn: ?: MOVE  (r13v58 ?) = (r13v33 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r12v86, assign insn: ?: MOVE  (r12v86 ?) = (r12v36 java.lang.String) */
    /* JADX WARN: Type inference failed for: r28v24, assign insn: ?: MOVE  (r28v24 ?) = (r28v14 ?) */
    /* JADX WARN: Type inference failed for: r15v118, assign insn: ?: MOVE  (r15v118 ?) = (r15v93 ?) */
    /* JADX WARN: Type inference failed for: r15v119, assign insn: ?: MOVE  (r15v119 ?) = (r15v94 ?) */
    /* JADX WARN: Type inference failed for: r15v120, assign insn: ?: MOVE  (r15v120 ?) = (r15v95 ?) */
    /* JADX WARN: Type inference failed for: r15v122, assign insn: ?: MOVE  (r15v122 ?) = (r15v96 ?) */
    /* JADX WARN: Type inference failed for: r15v123, assign insn: ?: MOVE  (r15v123 ?) = (r15v98 ?) */
    /* JADX WARN: Type inference failed for: r15v124, assign insn: ?: MOVE  (r15v124 ?) = (r15v103 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v126, assign insn: ?: MOVE  (r15v126 ?) = (r15v106 asqw) */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atbm.a(askf, java.lang.String, long, boolean):byda
     arg types: [askf, java.lang.String, long, int]
     candidates:
      atbm.a(android.database.sqlite.SQLiteDatabase, askf, java.lang.String, com.google.android.gms.tapandpay.security.StorageKey):atda
      atbm.a(askf, java.lang.String, java.lang.String[], java.lang.String):boolean
      atbm.a(askf, java.lang.String, long, boolean):byda */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0201, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0202, code lost:
        r1 = r0;
        r39 = r2;
        r15 = r7;
        r43 = r8;
        r42 = r9;
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0219, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021c, code lost:
        r5 = r46;
        r2 = r0;
        r15 = r7;
        r3 = r8;
        r4 = r9;
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0226, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0271, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0272, code lost:
        r1 = r0;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02cc, code lost:
        r1 = r0;
        r15 = r7;
        r43 = r8;
        r42 = r9;
        r13 = r10;
        r39 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02d9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02da, code lost:
        r28 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02e3, code lost:
        r5 = r46;
        r2 = r0;
        r15 = r7;
        r3 = r8;
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03da, code lost:
        r1 = r0;
        r40 = r5;
        r16 = r7;
        r17 = r8;
        r42 = r9;
        r13 = r10;
        r12 = r23;
        r39 = r25;
        r14 = r35;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r3 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0488, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0489, code lost:
        r12 = (p000.bnsl) p000.atbq.f90017a.mo68387b();
        r12.mo68437a(r0);
        r12.mo68432a(r8, r9, 1022, r7);
        r12.mo68405a("Error while checking active token replenish reason");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x049f, code lost:
        r2 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r3 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        if (r3 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x068d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x068e, code lost:
        r40 = r5;
        r16 = r7;
        r17 = r8;
        r42 = r9;
        r13 = r10;
        r12 = r23;
        r39 = r25;
        r1 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x06e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x06ea, code lost:
        r40 = r5;
        r16 = r7;
        r17 = r8;
        r42 = r9;
        r13 = r10;
        r12 = r23;
        r39 = r25;
        r14 = r35;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0785, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0786, code lost:
        r42 = r9;
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0793, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0832, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0839, code lost:
        throw new p000.atcz(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x083a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0841, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0867, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0868, code lost:
        r1 = r0;
        r43 = r10;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x086d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0870, code lost:
        r6 = r45;
        r5 = r46;
        r2 = r0;
        r3 = r10;
        r23 = r12;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0968, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0969, code lost:
        r1 = r0;
        r3 = r10;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0a29, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0a2a, code lost:
        r15 = r7;
        r43 = r8;
        r42 = r9;
        r13 = r10;
        r39 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0a36, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0a37, code lost:
        r15 = r7;
        r43 = r8;
        r42 = r9;
        r13 = r10;
        r39 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0a5a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0a5b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0a5e, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0a63, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0a64, code lost:
        r28 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0a6a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0a6b, code lost:
        r39 = r2;
        r15 = r7;
        r43 = r8;
        r42 = r9;
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0a76, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0a77, code lost:
        r15 = r7;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0a7b, code lost:
        r3 = r8;
        r4 = r9;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0a81, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0a84, code lost:
        r15 = r7;
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0aeb, code lost:
        r0 = e;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0b27, code lost:
        r39.mo49855b(r5, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0b5e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0b5f, code lost:
        r5 = r28;
        r4 = r42;
        r3 = r43;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0b81, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0b84, code lost:
        r6 = r45;
        r5 = r46;
        r1 = r18;
        r4 = r42;
        r3 = r43;
        r7 = 100;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:?, code lost:
        return m75402a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        r5 = new android.content.ContentValues();
        r5.put("supported_aids", ((p000.bydc) r14.mo74062i()).mo73642k());
        r12.update("PaymentBundles", r5, "bundle_id = ? AND account_id = ? AND environment = ?", p000.atdg.m75598a(r3, r13));
        r12.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r12.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0195, code lost:
        r1 = (p000.bnsl) p000.atdg.f90116a.mo68387b();
        r1.mo68432a("atdg", r10, 115, r7);
        r1.mo68405a("Received empty AID value.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r12.endTransaction();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:197:0x035d, B:599:0x0aca] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0201 A[ExcHandler: RuntimeException (r0v92 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:6:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0219 A[ExcHandler: atcz | aths (r0v90 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:6:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023c A[SYNTHETIC, Splitter:B:116:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x028a A[ADDED_TO_REGION, Catch:{ aths -> 0x0a5d, atcz | aths -> 0x0a5b, atdb -> 0x0a63, RuntimeException -> 0x0a6a }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02cb A[ExcHandler: RuntimeException (r0v88 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:156:0x02b3] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02d9 A[ExcHandler: atdb (e atdb), PHI: r28 10  PHI: (r28v14 ?) = (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v11 ?), (r28v15 ?) binds: [B:199:0x0361, B:200:?, B:216:0x03af, B:367:0x063d, B:334:0x05c1, B:262:0x045d, B:268:0x046f, B:256:0x0430, B:227:0x03d2, B:156:0x02b3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:156:0x02b3] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0361 A[SYNTHETIC, Splitter:B:199:0x0361] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03d9 A[ExcHandler: atfh (r0v82 'e' atfh A[CUSTOM_DECLARE]), Splitter:B:227:0x03d2] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04b3 A[Catch:{ IOException -> 0x06ce, atfh -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04b4 A[Catch:{ IOException -> 0x06ce, atfh -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x05c1 A[SYNTHETIC, Splitter:B:334:0x05c1] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05c4 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x05c7 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x05ca A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05cd A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05d0 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05d3 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05d6 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05d9 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x05dc A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05df A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05e2 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x05e5 A[Catch:{ IOException -> 0x072b, atfh -> 0x03d9, aths -> 0x0795, atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x02cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x05e8 A[SYNTHETIC, Splitter:B:348:0x05e8] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x05ee A[Catch:{ IOException -> 0x06ce, atfh -> 0x06a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x05ef A[Catch:{ IOException -> 0x06ce, atfh -> 0x06a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x060b A[Catch:{ IOException -> 0x06ce, atfh -> 0x06a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x060c A[Catch:{ IOException -> 0x06ce, atfh -> 0x06a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0618 A[Catch:{ IOException -> 0x06ce, atfh -> 0x06a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x061a A[Catch:{ IOException -> 0x06ce, atfh -> 0x06a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0643 A[Catch:{ atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x06df }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0646 A[Catch:{ atcz | aths -> 0x0793, atdb -> 0x02d9, RuntimeException -> 0x06df }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06ce A[ExcHandler: IOException (e java.io.IOException), Splitter:B:224:0x03ce] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06e9 A[ExcHandler: atfh (e atfh), Splitter:B:221:0x03ca] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0702  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x072b A[Catch:{ atcz | aths -> 0x0768, atdb -> 0x0762, RuntimeException -> 0x075c }, ExcHandler: IOException (e java.io.IOException), Splitter:B:221:0x03ca] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0793 A[ExcHandler: atcz | aths (e java.lang.Throwable), Splitter:B:199:0x0361] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0867 A[ExcHandler: RuntimeException (r0v41 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), PHI: r10 r15 10  PHI: (r10v7 ?) = (r10v2 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String) binds: [B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v43 java.lang.String) = (r15v23 java.lang.String), (r15v47 java.lang.String), (r15v47 java.lang.String), (r15v47 java.lang.String) binds: [B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE], Splitter:B:451:0x07f4] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x086d A[ExcHandler: atcz | aths (r0v40 'e' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r10 r15 10  PHI: (r10v6 ?) = (r10v2 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String) binds: [B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v42 java.lang.String) = (r15v23 java.lang.String), (r15v47 java.lang.String), (r15v47 java.lang.String), (r15v47 java.lang.String) binds: [B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE], Splitter:B:451:0x07f4] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x089d  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0968 A[ExcHandler: atdb (r0v26 'e' atdb A[CUSTOM_DECLARE]), PHI: r10 r15 r42 10  PHI: (r10v4 java.lang.String) = (r10v5 java.lang.String), (r10v5 java.lang.String), (r10v2 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String), (r10v11 java.lang.String) binds: [B:492:0x08ae, B:496:0x08c2, B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v32 java.lang.String) = (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v23 java.lang.String), (r15v47 java.lang.String), (r15v47 java.lang.String), (r15v47 java.lang.String) binds: [B:492:0x08ae, B:496:0x08c2, B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r42v16 java.lang.String) = (r42v17 java.lang.String), (r42v17 java.lang.String), (r42v23 java.lang.String), (r42v23 java.lang.String), (r42v23 java.lang.String), (r42v23 java.lang.String) binds: [B:492:0x08ae, B:496:0x08c2, B:446:0x07c1, B:449:0x07ea, B:451:0x07f4, B:459:0x0834] A[DONT_GENERATE, DONT_INLINE], Splitter:B:451:0x07f4] */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0983  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0a29 A[Catch:{ atfh | IOException -> 0x0ab8, IOException -> 0x0a1b, atfh -> 0x09f7, IOException -> 0x0954, atfh -> 0x0945, atcz | aths -> 0x0adc, atdb -> 0x0ad2, RuntimeException -> 0x0aeb }, ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:147:0x0298] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0a5b A[ExcHandler: atcz | aths (e java.lang.Throwable), Splitter:B:136:0x0284] */
    /* JADX WARNING: Removed duplicated region for block: B:576:0x0a63 A[ExcHandler: atdb (e atdb), PHI: r7 r8 r9 r14 10  PHI: (r7v7 java.lang.String) = (r7v0 java.lang.String), (r7v8 java.lang.String), (r7v8 java.lang.String), (r7v8 java.lang.String) binds: [B:132:0x027c, B:136:0x0284, B:144:0x0292, B:147:0x0298] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r8v7 java.lang.String) = (r8v0 java.lang.String), (r8v8 java.lang.String), (r8v8 java.lang.String), (r8v8 java.lang.String) binds: [B:132:0x027c, B:136:0x0284, B:144:0x0292, B:147:0x0298] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r9v10 java.lang.String) = (r9v0 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String) binds: [B:132:0x027c, B:136:0x0284, B:144:0x0292, B:147:0x0298] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v12 long) = (r14v10 long), (r14v13 long), (r14v13 long), (r14v13 long) binds: [B:132:0x027c, B:136:0x0284, B:144:0x0292, B:147:0x0298] A[DONT_GENERATE, DONT_INLINE], Splitter:B:132:0x027c] */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0a6a A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r2 r7 r8 r9 r10 10  PHI: (r2v27 atds) = (r2v1 atds), (r2v1 atds), (r2v28 atds) binds: [B:113:0x0232, B:132:0x027c, B:136:0x0284] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r7v5 java.lang.String) = (r7v0 java.lang.String), (r7v0 java.lang.String), (r7v8 java.lang.String) binds: [B:113:0x0232, B:132:0x027c, B:136:0x0284] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r8v5 java.lang.String) = (r8v0 java.lang.String), (r8v0 java.lang.String), (r8v8 java.lang.String) binds: [B:113:0x0232, B:132:0x027c, B:136:0x0284] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r9v8 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v11 java.lang.String) binds: [B:113:0x0232, B:132:0x027c, B:136:0x0284] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v2 java.lang.String) binds: [B:113:0x0232, B:132:0x027c, B:136:0x0284] A[DONT_GENERATE, DONT_INLINE], Splitter:B:113:0x0232] */
    /* JADX WARNING: Removed duplicated region for block: B:584:0x0a81 A[ExcHandler: atcz | aths (e java.lang.Throwable), Splitter:B:113:0x0232] */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0aeb A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r13 r15 r39 r42 r43 10  PHI: (r13v2 java.lang.String) = (r13v3 java.lang.String), (r13v3 java.lang.String), (r13v3 java.lang.String), (r13v7 askf), (r13v7 askf), (r13v11 askf), (r13v11 askf), (r13v14 ?), (r13v14 ?), (r13v15 ?), (r13v15 ?), (r13v15 ?), (r13v7 askf) binds: [B:599:0x0aca, B:600:?, B:602:0x0ace, B:144:0x0292, B:147:0x0298, B:197:0x035d, B:198:?, B:541:0x0994, B:555:0x09f8, B:494:0x08ba, B:514:0x0918, B:517:0x0929, B:152:0x02ad] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v4 java.lang.String) = (r15v7 java.lang.String), (r15v7 java.lang.String), (r15v7 java.lang.String), (r15v23 java.lang.String), (r15v23 java.lang.String), (r15v28 java.lang.String), (r15v28 java.lang.String), (r15v30 java.lang.String), (r15v30 java.lang.String), (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v23 java.lang.String) binds: [B:599:0x0aca, B:600:?, B:602:0x0ace, B:144:0x0292, B:147:0x0298, B:197:0x035d, B:198:?, B:541:0x0994, B:555:0x09f8, B:494:0x08ba, B:514:0x0918, B:517:0x0929, B:152:0x02ad] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r39v1 atds) = (r39v2 atds), (r39v2 atds), (r39v2 atds), (r39v11 atds), (r39v11 atds), (r39v10 atds), (r39v10 atds), (r39v12 atds), (r39v12 atds), (r39v13 atds), (r39v13 atds), (r39v13 atds), (r39v11 atds) binds: [B:599:0x0aca, B:600:?, B:602:0x0ace, B:144:0x0292, B:147:0x0298, B:197:0x035d, B:198:?, B:541:0x0994, B:555:0x09f8, B:494:0x08ba, B:514:0x0918, B:517:0x0929, B:152:0x02ad] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r42v1 java.lang.String) = (r42v4 java.lang.String), (r42v4 java.lang.String), (r42v4 java.lang.String), (r42v13 java.lang.String), (r42v13 java.lang.String), (r42v12 java.lang.String), (r42v12 java.lang.String), (r42v14 java.lang.String), (r42v14 java.lang.String), (r42v17 java.lang.String), (r42v17 java.lang.String), (r42v17 java.lang.String), (r42v13 java.lang.String) binds: [B:599:0x0aca, B:600:?, B:602:0x0ace, B:144:0x0292, B:147:0x0298, B:197:0x035d, B:198:?, B:541:0x0994, B:555:0x09f8, B:494:0x08ba, B:514:0x0918, B:517:0x0929, B:152:0x02ad] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r43v1 java.lang.String) = (r43v4 java.lang.String), (r43v4 java.lang.String), (r43v4 java.lang.String), (r43v13 java.lang.String), (r43v13 java.lang.String), (r43v12 java.lang.String), (r43v12 java.lang.String), (r43v14 java.lang.String), (r43v14 java.lang.String), (r43v13 java.lang.String), (r43v13 java.lang.String), (r43v19 java.lang.String), (r43v13 java.lang.String) binds: [B:599:0x0aca, B:600:?, B:602:0x0ace, B:144:0x0292, B:147:0x0298, B:197:0x035d, B:198:?, B:541:0x0994, B:555:0x09f8, B:494:0x08ba, B:514:0x0918, B:517:0x0929, B:152:0x02ad] A[DONT_GENERATE, DONT_INLINE], Splitter:B:197:0x035d] */
    /* JADX WARNING: Removed duplicated region for block: B:614:0x0b27 A[Catch:{ atdb -> 0x0b33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0b2e A[Catch:{ atdb -> 0x0b33 }] */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x0a58 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x0713 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:639:0x0352 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d2 A[SYNTHETIC, Splitter:B:86:0x01d2] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    private final atcs m75411b(askf askf, String str) {
        CryptoParameters cryptoParameters;
        String str2;
        boolean z;
        long j;
        String str3;
        String str4;
        String str5;
        long j2;
        String str6;
        String str7;
        atdb atdb;
        String str8;
        String str9;
        atds atds;
        RuntimeException runtimeException;
        byda a;
        ? r12;
        askf askf2;
        String str10;
        Throwable th;
        String str11;
        String str12;
        String str13;
        long j3;
        boolean z2;
        long j4;
        String str14;
        atdb atdb2;
        long j5;
        long j6;
        String str15;
        long j7;
        long j8;
        atcs a2;
        atda atda;
        int i;
        String str16;
        String str17;
        char c;
        long j9;
        int i2;
        String str18;
        String str19;
        atdb atdb3;
        boolean z3;
        String str20;
        boolean z4;
        String str21;
        askf askf3;
        String str22;
        Throwable th2;
        String str23;
        String str24;
        Object obj;
        String str25;
        atds atds2;
        atcv atcv;
        String str26;
        CryptoParameters cryptoParameters2;
        String str27;
        String str28;
        boolean z5;
        String str29;
        CryptoParameters cryptoParameters3;
        askf askf4;
        String str30;
        atfh atfh;
        btmd btmd;
        char c2;
        int i3;
        btlj btlj;
        String str31;
        char c3;
        btoa btoa;
        btlr btlr;
        btlr btlr2;
        asks asks;
        Throwable th3;
        bngm bngm;
        asqs asqs;
        Set set;
        SQLiteDatabase a3;
        String str32 = askf;
        ? r15 = "Bundle gone while recording error";
        String str33 = "c";
        String str34 = "b";
        String str35 = "a";
        String str36 = "atbq";
        String str37 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(100);
        String str38 = r15;
        long j10 = currentTimeMillis + millis;
        atds a4 = atds.m75666a(askf);
        mo49781a();
        try {
            mo49787b().mo50002b(str32);
            try {
                atda a5 = atbm.m75384a(askf, str);
                if (cgwd.m147195c()) {
                    try {
                        if (cgwd.m147194b().equals("REGISTRATION_MODE_DISABLED")) {
                            j6 = currentTimeMillis;
                            j5 = j10;
                        } else if (a5 == null) {
                            bnsl bnsl = (bnsl) f90017a.mo68388c();
                            bnsl.mo68432a(str36, str35, 1092, str37);
                            bnsl.mo68405a("Token is null");
                            j6 = currentTimeMillis;
                            j5 = j10;
                        } else {
                            srn srn = atdg.f90116a;
                            try {
                                j6 = currentTimeMillis;
                                try {
                                    j3 = 0;
                                    Cursor query = atdg.m75596a(str32.f89126d).query("PaymentBundles", new String[]{"supported_aids"}, "bundle_id = ? AND account_id = ? AND environment = ?", atdg.m75598a(a5.f90102c, str32), null, null, null);
                                    try {
                                        if (query.moveToNext()) {
                                            try {
                                                byte[] blob = query.getBlob(0);
                                                if (blob != null) {
                                                    bngm = bnic.m109495a((Collection) atdg.m75597a(blob).f165758a);
                                                } else {
                                                    bngm = bnon.f131923a;
                                                }
                                            } catch (Throwable th4) {
                                                th3 = th4;
                                                j5 = j10;
                                                if (query != null) {
                                                    try {
                                                        query.close();
                                                    } catch (Throwable th5) {
                                                        bqye.m113761a(th3, th5);
                                                    }
                                                }
                                                throw th3;
                                            }
                                        } else {
                                            bngm = bnon.f131923a;
                                        }
                                        try {
                                            query.close();
                                            if (bngm.isEmpty()) {
                                                String str39 = a5.f90102c;
                                                atcv atcv2 = a5.f90108i;
                                                if (atcv2 == null) {
                                                    bnsl bnsl2 = (bnsl) f90017a.mo68387b();
                                                    bnsl2.mo68432a(str36, str34, 1063, str37);
                                                    bnsl2.mo68405a("Bundle adapter not set");
                                                    j5 = j10;
                                                    asqs = null;
                                                } else {
                                                    Context context = str32.f89126d;
                                                    j5 = j10;
                                                    try {
                                                        InStoreCvmConfig a6 = aszu.m75260a(atcv2.mo49805g());
                                                        asqw asqw = new asqw();
                                                        asqs = atcv2.mo49793a(str32, new aszu(context, a6, asqw), a5.f90102c);
                                                        r15 = asqw;
                                                    } catch (asks e) {
                                                        e = e;
                                                        r15 = r15;
                                                    } catch (Throwable th6) {
                                                        Throwable th7 = th6;
                                                        a3.endTransaction();
                                                        throw th7;
                                                    }
                                                }
                                                if (asqs == null) {
                                                    bnsl bnsl3 = (bnsl) f90017a.mo68387b();
                                                    bnsl3.mo68432a(str36, str33, 1079, str37);
                                                    bnsl3.mo68405a("Payment applet is null");
                                                    set = bnon.f131923a;
                                                    r15 = r15;
                                                } else {
                                                    bnia bnia = new bnia();
                                                    astc[] a7 = asqs.mo49386a();
                                                    int length = a7.length;
                                                    int i4 = 0;
                                                    String str40 = r15;
                                                    while (i4 < length) {
                                                        String astc = a7[i4].toString();
                                                        bnia.mo67629b(astc);
                                                        i4++;
                                                        str40 = astc;
                                                    }
                                                    set = bnia.mo67751a();
                                                    r15 = str40;
                                                }
                                                if (set.isEmpty()) {
                                                    bnsl bnsl4 = (bnsl) atdg.f90116a.mo68387b();
                                                    bnsl4.mo68432a("atdg", str35, (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, str37);
                                                    bnsl4.mo68405a("Received empty set of AIDs.");
                                                } else {
                                                    a3 = atdg.m75596a(str32.f89126d);
                                                    a3.beginTransaction();
                                                    bydb bydb = (bydb) bydc.f165756b.mo74144da();
                                                    Iterator it = set.iterator();
                                                    while (true) {
                                                        r15 = it.hasNext();
                                                        if (r15 == 0) {
                                                            break;
                                                        }
                                                        r15 = (String) it.next();
                                                        if (r15.isEmpty()) {
                                                            break;
                                                        }
                                                        bydb.mo74346a((String) r15);
                                                    }
                                                }
                                                bnsl bnsl5 = (bnsl) f90017a.mo68388c();
                                                bnsl5.mo68432a(str36, str35, 1104, str37);
                                                bnsl5.mo68405a("Error setting supported AIDs");
                                                r15 = r15;
                                            } else {
                                                j5 = j10;
                                            }
                                        } catch (asks e2) {
                                            asks = e2;
                                            j5 = j10;
                                        }
                                    } catch (Throwable th8) {
                                        j5 = j10;
                                        th3 = th8;
                                        if (query != null) {
                                        }
                                        throw th3;
                                    }
                                } catch (asks e3) {
                                    e = e3;
                                    j5 = j10;
                                    asks = e;
                                    r15 = r15;
                                    bnsl bnsl6 = (bnsl) f90017a.mo68387b();
                                    bnsl6.mo68437a(asks);
                                    bnsl6.mo68432a(str36, str35, 1108, str37);
                                    bnsl6.mo68405a("Database exception when setting AIDs");
                                    r15 = r15;
                                    str15 = a5.f90102c;
                                    if (a4.f90151a.mo49884c(str15)) {
                                    }
                                    j8 = j6;
                                    try {
                                        a2 = m75400a(j8, a5);
                                        atda = a5;
                                        i = 0;
                                        str2 = r15;
                                        while (true) {
                                            cryptoParameters = str33;
                                            try {
                                                if (j8 >= a2.f90092a) {
                                                }
                                                j8 = j9;
                                                a2 = m75400a(j9, atda);
                                                str35 = str32;
                                                str37 = str2;
                                                str33 = cryptoParameters;
                                                j7 = j3;
                                                i = i2;
                                                a4 = atds;
                                                str34 = str9;
                                                str36 = str8;
                                                str32 = askf;
                                                millis = str16;
                                                str2 = str2;
                                            } catch (atcz | aths e4) {
                                            } catch (atdb e5) {
                                                e = e5;
                                                j4 = j3;
                                                str14 = str37;
                                                atdb2 = e;
                                                str7 = str36;
                                                str6 = str34;
                                                j2 = j4;
                                                bnsl bnsl7 = (bnsl) f90017a.mo68388c();
                                                bnsl7.mo68437a(atdb);
                                                bnsl7.mo68432a(str7, str6, 257, str2);
                                                bnsl7.mo68405a("Bundle gone while processing it");
                                                return new atcs(j2, j2);
                                            } catch (RuntimeException e6) {
                                            }
                                        }
                                        throw new atcz("Max amount of steps exceeded");
                                    } catch (atcz | aths e42) {
                                    } catch (atdb e7) {
                                    } catch (RuntimeException e62) {
                                    }
                                }
                            } catch (asks e8) {
                                e = e8;
                                j6 = currentTimeMillis;
                                j5 = j10;
                                asks = e;
                                r15 = r15;
                                bnsl bnsl62 = (bnsl) f90017a.mo68387b();
                                bnsl62.mo68437a(asks);
                                bnsl62.mo68432a(str36, str35, 1108, str37);
                                bnsl62.mo68405a("Database exception when setting AIDs");
                                r15 = r15;
                                str15 = a5.f90102c;
                                if (a4.f90151a.mo49884c(str15)) {
                                }
                                j8 = j6;
                                a2 = m75400a(j8, a5);
                                atda = a5;
                                i = 0;
                                str2 = r15;
                                while (true) {
                                    cryptoParameters = str33;
                                    if (j8 >= a2.f90092a) {
                                    }
                                    j8 = j9;
                                    a2 = m75400a(j9, atda);
                                    str35 = str32;
                                    str37 = str2;
                                    str33 = cryptoParameters;
                                    j7 = j3;
                                    i = i2;
                                    a4 = atds;
                                    str34 = str9;
                                    str36 = str8;
                                    str32 = askf;
                                    millis = str16;
                                    str2 = str2;
                                }
                                throw new atcz("Max amount of steps exceeded");
                            }
                        }
                    } catch (atcz | aths e9) {
                    } catch (atdb e10) {
                        atdb = e10;
                        str7 = str36;
                        str6 = str34;
                        j2 = j10;
                        str2 = str37;
                        bnsl bnsl72 = (bnsl) f90017a.mo68388c();
                        bnsl72.mo68437a(atdb);
                        bnsl72.mo68432a(str7, str6, 257, str2);
                        bnsl72.mo68405a("Bundle gone while processing it");
                        return new atcs(j2, j2);
                    } catch (RuntimeException e11) {
                    }
                } else {
                    j6 = currentTimeMillis;
                    j5 = j10;
                }
                try {
                    str15 = a5.f90102c;
                    if (a4.f90151a.mo49884c(str15)) {
                        j7 = j5;
                    } else if (a4.f90153c.mo49940a() && a4.f90152b.mo49952a(str15)) {
                        j7 = j5;
                    } else {
                        bnsl bnsl8 = (bnsl) f90017a.mo68390d();
                        bnsl8.mo68432a(str36, str34, 229, str37);
                        bnsl8.mo68405a("Payment bundle deleted");
                        atcx.m75567a(a5.f90100a, a5.f90102c);
                        j10 = j5;
                        return new atcs(j10, j10);
                    }
                    j8 = j6;
                    a2 = m75400a(j8, a5);
                    atda = a5;
                    i = 0;
                    str2 = r15;
                    while (true) {
                        cryptoParameters = str33;
                        if (j8 >= a2.f90092a && atda != null) {
                            if (i < 5) {
                                atxy atxy = f90020d;
                                r12 = a4;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                atds atds3 = r12;
                                long j11 = atxy.f91100b.get();
                                r12 = atxy.f91101c.get();
                                if (r12 == 0) {
                                    j3 = j7;
                                } else {
                                    j3 = j7;
                                    if (elapsedRealtime - j11 < atxy.f91099a) {
                                        try {
                                            if (atxy.f91101c.incrementAndGet() > 40) {
                                            }
                                            int i5 = i + 1;
                                            str17 = atda.f90103d;
                                            int i6 = 3;
                                            switch (str17.hashCode()) {
                                                case -1422950650:
                                                    if (str17.equals("active")) {
                                                        c = 4;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case -766681394:
                                                    if (str17.equals("ready_for_pickup")) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 407754553:
                                                    if (str17.equals("needs_refresh")) {
                                                        c = 5;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 693933934:
                                                    if (str17.equals("requested")) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 881487833:
                                                    if (str17.equals("type_switch")) {
                                                        c = 6;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 1550463001:
                                                    if (str17.equals("deleted")) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case 1698062945:
                                                    if (str17.equals("unacknowledged")) {
                                                        c = 3;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                default:
                                                    c = 65535;
                                                    break;
                                            }
                                            switch (c) {
                                                case 0:
                                                    j9 = j8;
                                                    str2 = str37;
                                                    str8 = str36;
                                                    str9 = str34;
                                                    str32 = str35;
                                                    i2 = i5;
                                                    atds = atds3;
                                                    r12 = 0;
                                                    r12 = 0;
                                                    str19 = null;
                                                    atdz atdz = new atdz(atda.f90100a);
                                                    atdt b = atdz.mo49878b(atdz.mo49886d(), atda.f90102c);
                                                    if (b == null) {
                                                        bnsl bnsl9 = (bnsl) atdz.f90166a.mo68387b();
                                                        bnsl9.mo68432a("atdz", "d", 769, str2);
                                                        bnsl9.mo68405a("tryDeleteTokenRpc error: card not found");
                                                    } else {
                                                        bxvd da = btkj.f149261d.mo74144da();
                                                        btiy btiy = b.f90155a.f149123a;
                                                        if (btiy == null) {
                                                            btiy = btiy.f149054c;
                                                        }
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        btkj btkj = (btkj) da.f164949b;
                                                        btiy.getClass();
                                                        btkj.f149263a = btiy;
                                                        btkj.f149264b = btnw.m116966a(2);
                                                        atff.m75759a(atdz.f90167b, "t/cardtokenization/deletetoken", (btkj) da.mo74062i(), btkk.f149266b);
                                                    }
                                                    atcx.m75567a(atda.f90100a, atda.f90102c);
                                                    atda = null;
                                                    break;
                                                case 1:
                                                case 2:
                                                    j9 = j8;
                                                    str2 = str37;
                                                    str9 = str34;
                                                    str32 = str35;
                                                    i2 = i5;
                                                    r12 = cryptoParameters;
                                                    atds = atds3;
                                                    str35 = str36;
                                                    askf askf5 = atda.f90100a;
                                                    btlc a8 = atdm.m75640a(askf5, atds.m75666a(askf5).mo49843a(atda.f90102c), atda.f90104e, atda.f90106g, null);
                                                    bxvd da2 = btlr.f149408e.mo74144da();
                                                    if (!a8.f149346a.isEmpty()) {
                                                        i6 = 4;
                                                    }
                                                    if (!da2.f164950c) {
                                                        z4 = false;
                                                    } else {
                                                        da2.mo74035c();
                                                        z4 = false;
                                                        da2.f164950c = false;
                                                    }
                                                    ((btlr) da2.f164949b).f149412c = btny.m116968a(i6);
                                                    bxun bxun = a8.f149347b;
                                                    if (bxun == null) {
                                                        bxun = bxun.f164861c;
                                                    }
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = z4;
                                                    }
                                                    btlr btlr3 = (btlr) da2.f164949b;
                                                    bxun.getClass();
                                                    btlr3.f149411b = bxun;
                                                    btlr3.f149410a = 2;
                                                    btlr btlr4 = (btlr) da2.mo74062i();
                                                    String str41 = atda.f90104e;
                                                    byte[] bArr = atda.f90105f;
                                                    byte[] bArr2 = atda.f90106g;
                                                    String str42 = a8.f149346a;
                                                    str18 = str35;
                                                    try {
                                                        long j12 = a8.f149348c;
                                                        str16 = a8.f149349d;
                                                        cryptoParameters = r12;
                                                        r12 = 0;
                                                        str8 = str18;
                                                        str19 = null;
                                                        atda = mo49782a(askf5, atda, str41, bArr, btlr4, bArr2, str42, j12, str16);
                                                        break;
                                                    } catch (aths e12) {
                                                        e = e12;
                                                        str20 = r12;
                                                        z3 = false;
                                                        askf2 = askf;
                                                        str10 = str;
                                                        th = e;
                                                        str13 = str18;
                                                        str11 = str38;
                                                        str12 = str9;
                                                        z2 = z3;
                                                        j = 100;
                                                        str2 = str2;
                                                        z = z2;
                                                        bnsl bnsl10 = (bnsl) f90017a.mo68388c();
                                                        bnsl10.mo68437a(r2);
                                                        bnsl10.mo68432a(str4, str3, 254, str2);
                                                        bnsl10.mo68405a("Backing off");
                                                        try {
                                                            mo49781a();
                                                            return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                        } catch (atdb e13) {
                                                            bnsl bnsl11 = (bnsl) f90017a.mo68388c();
                                                            bnsl11.mo68437a(e13);
                                                            bnsl11.mo68432a(str4, cryptoParameters, 295, str2);
                                                            bnsl11.mo68405a(str5);
                                                            long currentTimeMillis2 = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(j);
                                                            return new atcs(currentTimeMillis2, currentTimeMillis2);
                                                        }
                                                    } catch (atcz e14) {
                                                        e = e14;
                                                        str20 = r12;
                                                        z3 = false;
                                                        askf2 = askf;
                                                        str10 = str;
                                                        th = e;
                                                        str13 = str18;
                                                        str11 = str38;
                                                        str12 = str9;
                                                        z2 = z3;
                                                        j = 100;
                                                        str2 = str2;
                                                        z = z2;
                                                        bnsl bnsl102 = (bnsl) f90017a.mo68388c();
                                                        bnsl102.mo68437a(r2);
                                                        bnsl102.mo68432a(str4, str3, 254, str2);
                                                        bnsl102.mo68405a("Backing off");
                                                        mo49781a();
                                                        return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                    } catch (atdb e15) {
                                                        e = e15;
                                                        atdb3 = e;
                                                        str23 = str2;
                                                        String str43 = str18;
                                                        String str44 = str23;
                                                        j2 = j3;
                                                        str6 = str9;
                                                        str2 = str44;
                                                        bnsl bnsl722 = (bnsl) f90017a.mo68388c();
                                                        bnsl722.mo68437a(atdb);
                                                        bnsl722.mo68432a(str7, str6, 257, str2);
                                                        bnsl722.mo68405a("Bundle gone while processing it");
                                                        return new atcs(j2, j2);
                                                    } catch (RuntimeException e16) {
                                                        e = e16;
                                                        str8 = str18;
                                                        runtimeException = e;
                                                        str32 = str32;
                                                        bnsl bnsl12 = (bnsl) f90017a.mo68388c();
                                                        bnsl12.mo68437a(runtimeException);
                                                        String str45 = str8;
                                                        bnsl12.mo68432a(str45, str9, 260, str2);
                                                        String str46 = str;
                                                        bnsl12.mo68420a("Unexpected error updating bundle %s, detokenizing card", str46);
                                                        try {
                                                            mo49781a();
                                                            a = atbm.m75387a(askf, str46, System.currentTimeMillis(), true);
                                                            if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                            }
                                                        } catch (atdb e17) {
                                                            bnsl bnsl13 = (bnsl) f90017a.mo68388c();
                                                            bnsl13.mo68437a(e17);
                                                            bnsl13.mo68432a(str45, (String) str32, 279, str2);
                                                            bnsl13.mo68405a(str38);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    j9 = j8;
                                                    str16 = str37;
                                                    str18 = str36;
                                                    str9 = str34;
                                                    str32 = str35;
                                                    i2 = i5;
                                                    String str47 = cryptoParameters;
                                                    atds = atds3;
                                                    try {
                                                        askf askf6 = atda.f90100a;
                                                        btiy a9 = atds.m75666a(askf6).mo49843a(atda.f90102c);
                                                        try {
                                                            atdm.m75641a(askf6, a9, atda.f90104e, atda.f90106g, atda.f90108i.mo49800b(), atda.f90108i.mo49805g());
                                                            bnsl bnsl14 = (bnsl) f90017a.mo68390d();
                                                            str2 = str16;
                                                            str35 = str18;
                                                            try {
                                                                bnsl14.mo68432a(str35, (String) str32, 823, str2);
                                                                bnsl14.mo68420a("Payment bundle %s acknowledged", atda.f90101b);
                                                                try {
                                                                    mo49781a();
                                                                    atda atda2 = (atda) atbm.m75388a(askf6, atda.f90102c, atbo.f90015a);
                                                                    CardInfo b2 = atds.m75666a(askf6).mo49853b(a9.f149056a);
                                                                    if (b2 != null) {
                                                                        atam atam = new atam(askf6);
                                                                        atam.mo49742a(atam.mo49735a(19, b2), atda.f90104e);
                                                                        atkl.f90415a.mo50008a();
                                                                        atda = atda2;
                                                                        str19 = null;
                                                                        str8 = str35;
                                                                        cryptoParameters = str47;
                                                                    } else {
                                                                        throw new RuntimeException();
                                                                    }
                                                                } catch (atcz | aths e18) {
                                                                    str20 = r12;
                                                                    z3 = false;
                                                                    askf2 = askf;
                                                                    str10 = str;
                                                                    th = e18;
                                                                    str13 = str35;
                                                                    str11 = str38;
                                                                    str12 = str9;
                                                                    z2 = z3;
                                                                    j = 100;
                                                                    str2 = str2;
                                                                    z = z2;
                                                                    bnsl bnsl1022 = (bnsl) f90017a.mo68388c();
                                                                    bnsl1022.mo68437a(r2);
                                                                    bnsl1022.mo68432a(str4, str3, 254, str2);
                                                                    bnsl1022.mo68405a("Backing off");
                                                                    mo49781a();
                                                                    return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                                } catch (atdb e19) {
                                                                } catch (RuntimeException e20) {
                                                                    e = e20;
                                                                    str8 = str35;
                                                                    runtimeException = e;
                                                                    str32 = str32;
                                                                    bnsl bnsl122 = (bnsl) f90017a.mo68388c();
                                                                    bnsl122.mo68437a(runtimeException);
                                                                    String str452 = str8;
                                                                    bnsl122.mo68432a(str452, str9, 260, str2);
                                                                    String str462 = str;
                                                                    bnsl122.mo68420a("Unexpected error updating bundle %s, detokenizing card", str462);
                                                                    mo49781a();
                                                                    a = atbm.m75387a(askf, str462, System.currentTimeMillis(), true);
                                                                    if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                                    }
                                                                }
                                                            } catch (IOException e21) {
                                                                e = e21;
                                                                throw new atcz("Error calling AcknowledgePaymentBundle", e);
                                                            } catch (atfh e22) {
                                                                e = e22;
                                                                atda = m75405a(e, atda);
                                                                str19 = null;
                                                                str8 = str35;
                                                                cryptoParameters = str47;
                                                                j8 = j9;
                                                                a2 = m75400a(j9, atda);
                                                                str35 = str32;
                                                                str37 = str2;
                                                                str33 = cryptoParameters;
                                                                j7 = j3;
                                                                i = i2;
                                                                a4 = atds;
                                                                str34 = str9;
                                                                str36 = str8;
                                                                str32 = askf;
                                                                millis = str16;
                                                                str2 = str2;
                                                            }
                                                        } catch (IOException e23) {
                                                            e = e23;
                                                            throw new atcz("Error calling AcknowledgePaymentBundle", e);
                                                        } catch (atfh e24) {
                                                            e = e24;
                                                            str2 = str16;
                                                            str35 = str18;
                                                            atda = m75405a(e, atda);
                                                            str19 = null;
                                                            str8 = str35;
                                                            cryptoParameters = str47;
                                                            j8 = j9;
                                                            a2 = m75400a(j9, atda);
                                                            str35 = str32;
                                                            str37 = str2;
                                                            str33 = cryptoParameters;
                                                            j7 = j3;
                                                            i = i2;
                                                            a4 = atds;
                                                            str34 = str9;
                                                            str36 = str8;
                                                            str32 = askf;
                                                            millis = str16;
                                                            str2 = str2;
                                                        }
                                                    } catch (atcz | aths e25) {
                                                        str21 = str16;
                                                        askf3 = askf;
                                                        str22 = str;
                                                        th2 = e25;
                                                        cryptoParameters = str47;
                                                        String str48 = str18;
                                                        str5 = str38;
                                                        str3 = str9;
                                                        j = 100;
                                                        z = false;
                                                        bnsl bnsl10222 = (bnsl) f90017a.mo68388c();
                                                        bnsl10222.mo68437a(r2);
                                                        bnsl10222.mo68432a(str4, str3, 254, str2);
                                                        bnsl10222.mo68405a("Backing off");
                                                        mo49781a();
                                                        return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                    } catch (atdb e26) {
                                                        e = e26;
                                                        str2 = str16;
                                                        atdb3 = e;
                                                        str23 = str2;
                                                        String str432 = str18;
                                                        String str442 = str23;
                                                        j2 = j3;
                                                        str6 = str9;
                                                        str2 = str442;
                                                        bnsl bnsl7222 = (bnsl) f90017a.mo68388c();
                                                        bnsl7222.mo68437a(atdb);
                                                        bnsl7222.mo68432a(str7, str6, 257, str2);
                                                        bnsl7222.mo68405a("Bundle gone while processing it");
                                                        return new atcs(j2, j2);
                                                    } catch (RuntimeException e27) {
                                                        str24 = str16;
                                                        runtimeException = e27;
                                                        str8 = str18;
                                                        str32 = str32;
                                                        bnsl bnsl1222 = (bnsl) f90017a.mo68388c();
                                                        bnsl1222.mo68437a(runtimeException);
                                                        String str4522 = str8;
                                                        bnsl1222.mo68432a(str4522, str9, 260, str2);
                                                        String str4622 = str;
                                                        bnsl1222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str4622);
                                                        mo49781a();
                                                        a = atbm.m75387a(askf, str4622, System.currentTimeMillis(), true);
                                                        if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                case 5:
                                                case 6:
                                                    String str49 = (String) bmxu.m108565a(atda.f90110k, atda.f90101b);
                                                    try {
                                                        atcy b3 = mo49786b(atda.f90100a.f89126d, str49);
                                                        i2 = i5;
                                                        if (atda.f90110k == null) {
                                                            try {
                                                                atcv = atda.f90108i;
                                                            } catch (atcz | aths e28) {
                                                                str10 = str;
                                                                th = e28;
                                                                str13 = str36;
                                                                str12 = str34;
                                                                askf2 = str32;
                                                                str11 = str38;
                                                                z2 = false;
                                                                str2 = str37;
                                                                break;
                                                            } catch (atdb e29) {
                                                                atdb = e29;
                                                                str7 = str36;
                                                                str6 = str34;
                                                                j2 = j3;
                                                                str2 = str37;
                                                                bnsl bnsl72222 = (bnsl) f90017a.mo68388c();
                                                                bnsl72222.mo68437a(atdb);
                                                                bnsl72222.mo68432a(str7, str6, 257, str2);
                                                                bnsl72222.mo68405a("Bundle gone while processing it");
                                                                return new atcs(j2, j2);
                                                            } catch (RuntimeException e30) {
                                                                runtimeException = e30;
                                                                str8 = str36;
                                                                str9 = str34;
                                                                str32 = str35;
                                                                atds = atds3;
                                                                str2 = str37;
                                                                bnsl bnsl12222 = (bnsl) f90017a.mo68388c();
                                                                bnsl12222.mo68437a(runtimeException);
                                                                String str45222 = str8;
                                                                bnsl12222.mo68432a(str45222, str9, 260, str2);
                                                                String str46222 = str;
                                                                bnsl12222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str46222);
                                                                mo49781a();
                                                                a = atbm.m75387a(askf, str46222, System.currentTimeMillis(), true);
                                                                if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                                }
                                                            }
                                                        } else {
                                                            atcv = null;
                                                        }
                                                        askf askf7 = atda.f90100a;
                                                        CryptoParameters a10 = b3.mo49810a(atcv);
                                                        String a11 = atxw.m76526a();
                                                        askf askf8 = atda.f90100a;
                                                        String str50 = str49;
                                                        atds a12 = atds.m75666a(askf8);
                                                        String str51 = a11;
                                                        str32 = atda.f90102c;
                                                        btiy a13 = a12.mo49843a((String) str32);
                                                        try {
                                                            str32 = new athh().mo49987a(askf8);
                                                            askf askf9 = askf8;
                                                            try {
                                                                btli btli = a10.f108621a;
                                                                CryptoParameters cryptoParameters4 = a10;
                                                                try {
                                                                    if (atda.f90110k == null) {
                                                                        btmd = atda.f90108i.mo49796a();
                                                                    } else {
                                                                        btmd = b3.mo49809a();
                                                                    }
                                                                    String str52 = atda.f90103d;
                                                                    btmd btmd2 = btmd;
                                                                    int hashCode = str52.hashCode();
                                                                    btli btli2 = btli;
                                                                    if (hashCode != -1422950650) {
                                                                        if (hashCode != 407754553) {
                                                                            if (hashCode == 881487833 && str52.equals("type_switch")) {
                                                                                c2 = 1;
                                                                                if (c2 != 0) {
                                                                                    i3 = 3;
                                                                                } else if (c2 == 1) {
                                                                                    i3 = 4;
                                                                                } else if (c2 != 2) {
                                                                                    bnsl bnsl15 = (bnsl) f90017a.mo68387b();
                                                                                    bnsl15.mo68432a(str36, str35, 1002, str37);
                                                                                    bnsl15.mo68405a("Unexpected token state for replenishment");
                                                                                    i3 = 7;
                                                                                } else {
                                                                                    atcv atcv3 = atda.f90108i;
                                                                                    if (atcv3 == null) {
                                                                                        bnsl bnsl16 = (bnsl) f90017a.mo68387b();
                                                                                        bnsl16.mo68432a(str36, str34, 1009, str37);
                                                                                        bnsl16.mo68405a("Bundle adapter null while checking replenish reason");
                                                                                        i3 = 8;
                                                                                    } else if (atcv3.mo49803e()) {
                                                                                        i3 = 5;
                                                                                    } else if (j8 < atda.f90108i.mo49802d().f90092a) {
                                                                                        bnsl bnsl17 = (bnsl) f90017a.mo68387b();
                                                                                        bnsl17.mo68432a(str36, str34, 1026, str37);
                                                                                        bnsl17.mo68405a("Active token is being replenished for unexpected reason");
                                                                                        i3 = 10;
                                                                                    } else {
                                                                                        i3 = 6;
                                                                                    }
                                                                                }
                                                                                btlj = (btlj) btll.f149376k.mo74144da();
                                                                                if (!btlj.f164950c) {
                                                                                    btlj.mo74035c();
                                                                                    btlj.f164950c = false;
                                                                                }
                                                                                btll btll = (btll) btlj.f164949b;
                                                                                a13.getClass();
                                                                                btll.f149378a = a13;
                                                                                String str53 = str32.f149047b;
                                                                                str53.getClass();
                                                                                btll.f149379b = str53;
                                                                                str32.getClass();
                                                                                btll.f149380c = str32;
                                                                                btli2.getClass();
                                                                                btll.f149381d = btli2;
                                                                                btmd2.getClass();
                                                                                btll.f149382e = btmd2;
                                                                                str51.getClass();
                                                                                String str54 = str51;
                                                                                btll.f149383f = str54;
                                                                                btlj.mo70825b(atrp.f90732a);
                                                                                switch (str50.hashCode()) {
                                                                                    case -1688490866:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("canonical_interac_bundle")) {
                                                                                            c3 = 4;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case -1426184971:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("canonical_eftpos_bundle")) {
                                                                                            c3 = 5;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case -1245210692:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("felica_quicpay_bundle")) {
                                                                                            c3 = 9;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case -905486322:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("amex2_bundle")) {
                                                                                            c3 = 0;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case -377015583:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("felica_id_aptest_bundle")) {
                                                                                            c3 = 12;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case -152778304:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("canonical_mc_bundle")) {
                                                                                            c3 = 7;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 309674061:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("canonical_discover_bundle")) {
                                                                                            c3 = 6;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 366259608:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("discover_bundle")) {
                                                                                            c3 = 1;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 368951431:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("felica_bundle")) {
                                                                                            c3 = 8;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 434689600:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("visa_bundle")) {
                                                                                            c3 = 3;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 804254209:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("felica_id_bundle")) {
                                                                                            c3 = 10;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 959178788:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("canonical_elo_bundle")) {
                                                                                            c3 = 13;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 1640769725:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("mcbp_bundle")) {
                                                                                            c3 = 2;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    case 2000139462:
                                                                                        str31 = str50;
                                                                                        if (str31.equals("felica_quicpay_aptest_bundle")) {
                                                                                            c3 = 11;
                                                                                            break;
                                                                                        }
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                    default:
                                                                                        str31 = str50;
                                                                                        c3 = 65535;
                                                                                        break;
                                                                                }
                                                                                switch (c3) {
                                                                                    case 0:
                                                                                        btoa = btoa.AMEX_V2_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                            btlj.mo74035c();
                                                                                            btlj.f164950c = false;
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                            arrayList.add(btob.CAPABILITY_VISA_ODA_REPERSO);
                                                                                        }
                                                                                        btlj.mo70824a(arrayList);
                                                                                        if (!btlj.f164950c) {
                                                                                            btlj.mo74035c();
                                                                                            btlj.f164950c = false;
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll2 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll2, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr3 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm.f149390a;
                                                                                        if (btlr == null) {
                                                                                            btlr2 = btlr;
                                                                                        } else {
                                                                                            btlr2 = btlr.f149408e;
                                                                                        }
                                                                                        byte[] bArr4 = bArr3;
                                                                                        atds = atds3;
                                                                                        String str55 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        try {
                                                                                            atda = mo49782a(askf4, atda, str55, bArr4, btlr2, btlm.f149391b.mo73780k(), btlm.f149392c, btlm.f149393d, btlm.f149394e);
                                                                                            cryptoParameters = a10;
                                                                                            str8 = str18;
                                                                                            str19 = null;
                                                                                            str2 = str16;
                                                                                            break;
                                                                                        } catch (aths e31) {
                                                                                            e = e31;
                                                                                            str29 = str16;
                                                                                            cryptoParameters3 = a10;
                                                                                            str26 = str29;
                                                                                            cryptoParameters2 = cryptoParameters3;
                                                                                            askf3 = askf;
                                                                                            str22 = str;
                                                                                            th2 = e;
                                                                                            cryptoParameters = cryptoParameters2;
                                                                                            str21 = str26;
                                                                                            String str482 = str18;
                                                                                            str5 = str38;
                                                                                            str3 = str9;
                                                                                            j = 100;
                                                                                            z = false;
                                                                                            bnsl bnsl102222 = (bnsl) f90017a.mo68388c();
                                                                                            bnsl102222.mo68437a(r2);
                                                                                            bnsl102222.mo68432a(str4, str3, 254, str2);
                                                                                            bnsl102222.mo68405a("Backing off");
                                                                                            mo49781a();
                                                                                            return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                                                        } catch (atcz e32) {
                                                                                            e = e32;
                                                                                            str29 = str16;
                                                                                            cryptoParameters3 = a10;
                                                                                            str26 = str29;
                                                                                            cryptoParameters2 = cryptoParameters3;
                                                                                            askf3 = askf;
                                                                                            str22 = str;
                                                                                            th2 = e;
                                                                                            cryptoParameters = cryptoParameters2;
                                                                                            str21 = str26;
                                                                                            String str4822 = str18;
                                                                                            str5 = str38;
                                                                                            str3 = str9;
                                                                                            j = 100;
                                                                                            z = false;
                                                                                            bnsl bnsl1022222 = (bnsl) f90017a.mo68388c();
                                                                                            bnsl1022222.mo68437a(r2);
                                                                                            bnsl1022222.mo68432a(str4, str3, 254, str2);
                                                                                            bnsl1022222.mo68405a("Backing off");
                                                                                            mo49781a();
                                                                                            return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                                                        } catch (atdb e33) {
                                                                                            e = e33;
                                                                                            str27 = str16;
                                                                                            atdb3 = e;
                                                                                            str23 = str27;
                                                                                            String str4322 = str18;
                                                                                            String str4422 = str23;
                                                                                            j2 = j3;
                                                                                            str6 = str9;
                                                                                            str2 = str4422;
                                                                                            bnsl bnsl722222 = (bnsl) f90017a.mo68388c();
                                                                                            bnsl722222.mo68437a(atdb);
                                                                                            bnsl722222.mo68432a(str7, str6, 257, str2);
                                                                                            bnsl722222.mo68405a("Bundle gone while processing it");
                                                                                            return new atcs(j2, j2);
                                                                                        } catch (RuntimeException e34) {
                                                                                            e = e34;
                                                                                            str28 = str16;
                                                                                            z5 = str32;
                                                                                            runtimeException = e;
                                                                                            str24 = str28;
                                                                                            str32 = z5;
                                                                                            str8 = str18;
                                                                                            str32 = str32;
                                                                                            bnsl bnsl122222 = (bnsl) f90017a.mo68388c();
                                                                                            bnsl122222.mo68437a(runtimeException);
                                                                                            String str452222 = str8;
                                                                                            bnsl122222.mo68432a(str452222, str9, 260, str2);
                                                                                            String str462222 = str;
                                                                                            bnsl122222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str462222);
                                                                                            mo49781a();
                                                                                            a = atbm.m75387a(askf, str462222, System.currentTimeMillis(), true);
                                                                                            if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        btoa = btoa.DISCOVER_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList2 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList2);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll22 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm2 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll22, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr32 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm2.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr42 = bArr32;
                                                                                        atds = atds3;
                                                                                        String str552 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str552, bArr42, btlr2, btlm2.f149391b.mo73780k(), btlm2.f149392c, btlm2.f149393d, btlm2.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 2:
                                                                                        btoa = btoa.MASTERCARD_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList22 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList22);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm22 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr322 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm22.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr422 = bArr322;
                                                                                        atds = atds3;
                                                                                        String str5522 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str5522, bArr422, btlr2, btlm22.f149391b.mo73780k(), btlm22.f149392c, btlm22.f149393d, btlm22.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 3:
                                                                                        btoa = btoa.VISA_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll2222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll2222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr3222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr4222 = bArr3222;
                                                                                        atds = atds3;
                                                                                        String str55222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str55222, bArr4222, btlr2, btlm222.f149391b.mo73780k(), btlm222.f149392c, btlm222.f149393d, btlm222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 4:
                                                                                        btoa = btoa.CANONICAL_INTERAC_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList2222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList2222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll22222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm2222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll22222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr32222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm2222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr42222 = bArr32222;
                                                                                        atds = atds3;
                                                                                        String str552222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str552222, bArr42222, btlr2, btlm2222.f149391b.mo73780k(), btlm2222.f149392c, btlm2222.f149393d, btlm2222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 5:
                                                                                        btoa = btoa.CANONICAL_EFTPOS_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList22222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList22222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm22222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr322222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm22222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr422222 = bArr322222;
                                                                                        atds = atds3;
                                                                                        String str5522222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str5522222, bArr422222, btlr2, btlm22222.f149391b.mo73780k(), btlm22222.f149392c, btlm22222.f149393d, btlm22222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 6:
                                                                                        btoa = btoa.CANONICAL_DISCOVER_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll2222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll2222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr3222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr4222222 = bArr3222222;
                                                                                        atds = atds3;
                                                                                        String str55222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str55222222, bArr4222222, btlr2, btlm222222.f149391b.mo73780k(), btlm222222.f149392c, btlm222222.f149393d, btlm222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 7:
                                                                                        btoa = btoa.CANONICAL_MASTERCARD_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList2222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList2222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll22222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm2222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll22222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr32222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm2222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr42222222 = bArr32222222;
                                                                                        atds = atds3;
                                                                                        String str552222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str552222222, bArr42222222, btlr2, btlm2222222.f149391b.mo73780k(), btlm2222222.f149392c, btlm2222222.f149393d, btlm2222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 8:
                                                                                        btoa = btoa.FELICA_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList22222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList22222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll222222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm22222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll222222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr322222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm22222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr422222222 = bArr322222222;
                                                                                        atds = atds3;
                                                                                        String str5522222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str5522222222, bArr422222222, btlr2, btlm22222222.f149391b.mo73780k(), btlm22222222.f149392c, btlm22222222.f149393d, btlm22222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 9:
                                                                                        btoa = btoa.CANONICAL_FELICA_QUICPAY_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList222222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList222222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll2222222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm222222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll2222222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr3222222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm222222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr4222222222 = bArr3222222222;
                                                                                        atds = atds3;
                                                                                        String str55222222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str55222222222, bArr4222222222, btlr2, btlm222222222.f149391b.mo73780k(), btlm222222222.f149392c, btlm222222222.f149393d, btlm222222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 10:
                                                                                        btoa = btoa.CANONICAL_FELICA_ID_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList2222222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList2222222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll22222222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm2222222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll22222222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr32222222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm2222222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr42222222222 = bArr32222222222;
                                                                                        atds = atds3;
                                                                                        String str552222222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str552222222222, bArr42222222222, btlr2, btlm2222222222.f149391b.mo73780k(), btlm2222222222.f149392c, btlm2222222222.f149393d, btlm2222222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 11:
                                                                                        btoa = btoa.CANONICAL_FELICA_QUICPAY_APTEST_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList22222222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList22222222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll222222222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm22222222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll222222222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr322222222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm22222222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr422222222222 = bArr322222222222;
                                                                                        atds = atds3;
                                                                                        String str5522222222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str5522222222222, bArr422222222222, btlr2, btlm22222222222.f149391b.mo73780k(), btlm22222222222.f149392c, btlm22222222222.f149393d, btlm22222222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 12:
                                                                                        btoa = btoa.CANONICAL_FELICA_ID_APTEST_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList222222222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList222222222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll2222222222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm222222222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll2222222222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr3222222222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm222222222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr4222222222222 = bArr3222222222222;
                                                                                        atds = atds3;
                                                                                        String str55222222222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str55222222222222, bArr4222222222222, btlr2, btlm222222222222.f149391b.mo73780k(), btlm222222222222.f149392c, btlm222222222222.f149393d, btlm222222222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    case 13:
                                                                                        btoa = btoa.CANONICAL_ELO_BUNDLE;
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                        ArrayList arrayList2222222222222 = new ArrayList(1);
                                                                                        if (!cgwn.m147262l()) {
                                                                                        }
                                                                                        btlj.mo70824a(arrayList2222222222222);
                                                                                        if (!btlj.f164950c) {
                                                                                        }
                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                        btll btll22222222222222 = (btll) btlj.mo74062i();
                                                                                        askf4 = askf9;
                                                                                        btlm btlm2222222222222 = (btlm) atff.m75760a(askf4, "e/cardtokenization/initiatereplenish", btll22222222222222, btlm.f149388f, (Map) null);
                                                                                        byte[] bArr32222222222222 = cryptoParameters4.f108622b;
                                                                                        btlr = btlm2222222222222.f149390a;
                                                                                        if (btlr == null) {
                                                                                        }
                                                                                        byte[] bArr42222222222222 = bArr32222222222222;
                                                                                        atds = atds3;
                                                                                        String str552222222222222 = str54;
                                                                                        j9 = j8;
                                                                                        str16 = str37;
                                                                                        str9 = str34;
                                                                                        str18 = str36;
                                                                                        str32 = str35;
                                                                                        a10 = cryptoParameters;
                                                                                        atda = mo49782a(askf4, atda, str552222222222222, bArr42222222222222, btlr2, btlm2222222222222.f149391b.mo73780k(), btlm2222222222222.f149392c, btlm2222222222222.f149393d, btlm2222222222222.f149394e);
                                                                                        cryptoParameters = a10;
                                                                                        str8 = str18;
                                                                                        str19 = null;
                                                                                        str2 = str16;
                                                                                        break;
                                                                                    default:
                                                                                        j9 = j8;
                                                                                        String str56 = str37;
                                                                                        str18 = str36;
                                                                                        str9 = str34;
                                                                                        Object obj2 = str35;
                                                                                        String str57 = cryptoParameters;
                                                                                        atds = atds3;
                                                                                        askf4 = askf9;
                                                                                        str30 = null;
                                                                                        try {
                                                                                            throw new IllegalArgumentException(str31.length() == 0 ? new String("Unknown bundle type ") : "Unknown bundle type ".concat(str31));
                                                                                        } catch (IOException e35) {
                                                                                            break;
                                                                                        } catch (atfh e36) {
                                                                                            e = e36;
                                                                                            atfh = e;
                                                                                            str16 = str56;
                                                                                            str32 = obj2;
                                                                                            a10 = str57;
                                                                                            if (!athh.m75883a(askf4, atfh)) {
                                                                                                try {
                                                                                                    atda = m75405a(atfh, atda);
                                                                                                    cryptoParameters = a10;
                                                                                                    str2 = str16;
                                                                                                    str8 = str18;
                                                                                                    str19 = str30;
                                                                                                    j8 = j9;
                                                                                                    a2 = m75400a(j9, atda);
                                                                                                    str35 = str32;
                                                                                                    str37 = str2;
                                                                                                    str33 = cryptoParameters;
                                                                                                    j7 = j3;
                                                                                                    i = i2;
                                                                                                    a4 = atds;
                                                                                                    str34 = str9;
                                                                                                    str36 = str8;
                                                                                                    str32 = askf;
                                                                                                    millis = str16;
                                                                                                    str2 = str2;
                                                                                                } catch (atcz | aths e37) {
                                                                                                    e = e37;
                                                                                                    str26 = str16;
                                                                                                    cryptoParameters2 = a10;
                                                                                                    askf3 = askf;
                                                                                                    str22 = str;
                                                                                                    th2 = e;
                                                                                                    cryptoParameters = cryptoParameters2;
                                                                                                    str21 = str26;
                                                                                                    String str48222 = str18;
                                                                                                    str5 = str38;
                                                                                                    str3 = str9;
                                                                                                    j = 100;
                                                                                                    z = false;
                                                                                                    bnsl bnsl10222222 = (bnsl) f90017a.mo68388c();
                                                                                                    bnsl10222222.mo68437a(r2);
                                                                                                    bnsl10222222.mo68432a(str4, str3, 254, str2);
                                                                                                    bnsl10222222.mo68405a("Backing off");
                                                                                                    mo49781a();
                                                                                                    return m75402a(atbm.m75387a(r6, r5, System.currentTimeMillis(), z));
                                                                                                } catch (atdb e38) {
                                                                                                    e = e38;
                                                                                                    str27 = str16;
                                                                                                    atdb3 = e;
                                                                                                    str23 = str27;
                                                                                                    String str43222 = str18;
                                                                                                    String str44222 = str23;
                                                                                                    j2 = j3;
                                                                                                    str6 = str9;
                                                                                                    str2 = str44222;
                                                                                                    bnsl bnsl7222222 = (bnsl) f90017a.mo68388c();
                                                                                                    bnsl7222222.mo68437a(atdb);
                                                                                                    bnsl7222222.mo68432a(str7, str6, 257, str2);
                                                                                                    bnsl7222222.mo68405a("Bundle gone while processing it");
                                                                                                    return new atcs(j2, j2);
                                                                                                } catch (RuntimeException e39) {
                                                                                                    e = e39;
                                                                                                    str28 = str16;
                                                                                                    z5 = str32;
                                                                                                    runtimeException = e;
                                                                                                    str24 = str28;
                                                                                                    str32 = z5;
                                                                                                    str8 = str18;
                                                                                                    str32 = str32;
                                                                                                    bnsl bnsl1222222 = (bnsl) f90017a.mo68388c();
                                                                                                    bnsl1222222.mo68437a(runtimeException);
                                                                                                    String str4522222 = str8;
                                                                                                    bnsl1222222.mo68432a(str4522222, str9, 260, str2);
                                                                                                    String str4622222 = str;
                                                                                                    bnsl1222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str4622222);
                                                                                                    mo49781a();
                                                                                                    a = atbm.m75387a(askf, str4622222, System.currentTimeMillis(), true);
                                                                                                    if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                throw new atcz("Device fails attestation");
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                        } else if (str52.equals("needs_refresh")) {
                                                                            c2 = 0;
                                                                            if (c2 != 0) {
                                                                            }
                                                                            btlj = (btlj) btll.f149376k.mo74144da();
                                                                            if (!btlj.f164950c) {
                                                                            }
                                                                            btll btll3 = (btll) btlj.f164949b;
                                                                            a13.getClass();
                                                                            btll3.f149378a = a13;
                                                                            String str532 = str32.f149047b;
                                                                            str532.getClass();
                                                                            btll3.f149379b = str532;
                                                                            str32.getClass();
                                                                            btll3.f149380c = str32;
                                                                            btli2.getClass();
                                                                            btll3.f149381d = btli2;
                                                                            btmd2.getClass();
                                                                            btll3.f149382e = btmd2;
                                                                            str51.getClass();
                                                                            String str542 = str51;
                                                                            btll3.f149383f = str542;
                                                                            btlj.mo70825b(atrp.f90732a);
                                                                            switch (str50.hashCode()) {
                                                                                case -1688490866:
                                                                                    break;
                                                                                case -1426184971:
                                                                                    break;
                                                                                case -1245210692:
                                                                                    break;
                                                                                case -905486322:
                                                                                    break;
                                                                                case -377015583:
                                                                                    break;
                                                                                case -152778304:
                                                                                    break;
                                                                                case 309674061:
                                                                                    break;
                                                                                case 366259608:
                                                                                    break;
                                                                                case 368951431:
                                                                                    break;
                                                                                case 434689600:
                                                                                    break;
                                                                                case 804254209:
                                                                                    break;
                                                                                case 959178788:
                                                                                    break;
                                                                                case 1640769725:
                                                                                    break;
                                                                                case 2000139462:
                                                                                    break;
                                                                            }
                                                                            switch (c3) {
                                                                            }
                                                                        }
                                                                    } else if (str52.equals("active")) {
                                                                        c2 = 2;
                                                                        if (c2 != 0) {
                                                                        }
                                                                        btlj = (btlj) btll.f149376k.mo74144da();
                                                                        if (!btlj.f164950c) {
                                                                        }
                                                                        btll btll32 = (btll) btlj.f164949b;
                                                                        a13.getClass();
                                                                        btll32.f149378a = a13;
                                                                        String str5322 = str32.f149047b;
                                                                        str5322.getClass();
                                                                        btll32.f149379b = str5322;
                                                                        str32.getClass();
                                                                        btll32.f149380c = str32;
                                                                        btli2.getClass();
                                                                        btll32.f149381d = btli2;
                                                                        btmd2.getClass();
                                                                        btll32.f149382e = btmd2;
                                                                        str51.getClass();
                                                                        String str5422 = str51;
                                                                        btll32.f149383f = str5422;
                                                                        btlj.mo70825b(atrp.f90732a);
                                                                        switch (str50.hashCode()) {
                                                                            case -1688490866:
                                                                                break;
                                                                            case -1426184971:
                                                                                break;
                                                                            case -1245210692:
                                                                                break;
                                                                            case -905486322:
                                                                                break;
                                                                            case -377015583:
                                                                                break;
                                                                            case -152778304:
                                                                                break;
                                                                            case 309674061:
                                                                                break;
                                                                            case 366259608:
                                                                                break;
                                                                            case 368951431:
                                                                                break;
                                                                            case 434689600:
                                                                                break;
                                                                            case 804254209:
                                                                                break;
                                                                            case 959178788:
                                                                                break;
                                                                            case 1640769725:
                                                                                break;
                                                                            case 2000139462:
                                                                                break;
                                                                        }
                                                                        switch (c3) {
                                                                        }
                                                                    }
                                                                    c2 = 65535;
                                                                    if (c2 != 0) {
                                                                    }
                                                                    btlj = (btlj) btll.f149376k.mo74144da();
                                                                    if (!btlj.f164950c) {
                                                                    }
                                                                    btll btll322 = (btll) btlj.f164949b;
                                                                    a13.getClass();
                                                                    btll322.f149378a = a13;
                                                                    String str53222 = str32.f149047b;
                                                                    str53222.getClass();
                                                                    btll322.f149379b = str53222;
                                                                    str32.getClass();
                                                                    btll322.f149380c = str32;
                                                                    btli2.getClass();
                                                                    btll322.f149381d = btli2;
                                                                    btmd2.getClass();
                                                                    btll322.f149382e = btmd2;
                                                                    str51.getClass();
                                                                    String str54222 = str51;
                                                                    btll322.f149383f = str54222;
                                                                    btlj.mo70825b(atrp.f90732a);
                                                                    switch (str50.hashCode()) {
                                                                        case -1688490866:
                                                                            break;
                                                                        case -1426184971:
                                                                            break;
                                                                        case -1245210692:
                                                                            break;
                                                                        case -905486322:
                                                                            break;
                                                                        case -377015583:
                                                                            break;
                                                                        case -152778304:
                                                                            break;
                                                                        case 309674061:
                                                                            break;
                                                                        case 366259608:
                                                                            break;
                                                                        case 368951431:
                                                                            break;
                                                                        case 434689600:
                                                                            break;
                                                                        case 804254209:
                                                                            break;
                                                                        case 959178788:
                                                                            break;
                                                                        case 1640769725:
                                                                            break;
                                                                        case 2000139462:
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                    }
                                                                } catch (IOException e40) {
                                                                } catch (atfh e41) {
                                                                    j9 = j8;
                                                                    str16 = str37;
                                                                    str18 = str36;
                                                                    str9 = str34;
                                                                    str32 = str35;
                                                                    a10 = cryptoParameters;
                                                                    atds = atds3;
                                                                    askf4 = askf9;
                                                                    atfh = e41;
                                                                    str30 = null;
                                                                    if (!athh.m75883a(askf4, atfh)) {
                                                                    }
                                                                }
                                                            } catch (IOException e402) {
                                                            } catch (atfh e43) {
                                                            }
                                                        } catch (IOException e44) {
                                                            e = e44;
                                                            throw new atcz("Error getting attestation verdict", e);
                                                        } catch (atfh e45) {
                                                            e = e45;
                                                            throw new atcz("Error getting attestation verdict", e);
                                                        }
                                                    } catch (atcz | aths e46) {
                                                        e = e46;
                                                        askf askf10 = askf;
                                                        String str58 = str;
                                                        Throwable th9 = e;
                                                        String str59 = str37;
                                                        str4 = str36;
                                                        str3 = str34;
                                                        str5 = str38;
                                                        j = 100;
                                                        z = false;
                                                        bnsl bnsl102222222 = (bnsl) f90017a.mo68388c();
                                                        bnsl102222222.mo68437a(th9);
                                                        bnsl102222222.mo68432a(str4, str3, 254, str2);
                                                        bnsl102222222.mo68405a("Backing off");
                                                        mo49781a();
                                                        return m75402a(atbm.m75387a(askf10, str58, System.currentTimeMillis(), z));
                                                    } catch (atdb e47) {
                                                        e = e47;
                                                        atdb2 = e;
                                                        str14 = str37;
                                                        j4 = j3;
                                                        str7 = str36;
                                                        str6 = str34;
                                                        j2 = j4;
                                                        bnsl bnsl72222222 = (bnsl) f90017a.mo68388c();
                                                        bnsl72222222.mo68437a(atdb);
                                                        bnsl72222222.mo68432a(str7, str6, 257, str2);
                                                        bnsl72222222.mo68405a("Bundle gone while processing it");
                                                        return new atcs(j2, j2);
                                                    } catch (RuntimeException e48) {
                                                        e = e48;
                                                        str25 = str34;
                                                        Object obj3 = str35;
                                                        atds2 = atds3;
                                                        obj = obj3;
                                                        runtimeException = e;
                                                        str2 = str37;
                                                        str8 = str36;
                                                        str32 = obj;
                                                        bnsl bnsl12222222 = (bnsl) f90017a.mo68388c();
                                                        bnsl12222222.mo68437a(runtimeException);
                                                        String str45222222 = str8;
                                                        bnsl12222222.mo68432a(str45222222, str9, 260, str2);
                                                        String str46222222 = str;
                                                        bnsl12222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str46222222);
                                                        mo49781a();
                                                        a = atbm.m75387a(askf, str46222222, System.currentTimeMillis(), true);
                                                        if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    str2 = str37;
                                                    str8 = str36;
                                                    str9 = str34;
                                                    str32 = str35;
                                                    atds = atds3;
                                                    r12 = 0;
                                                    r12 = 0;
                                                    throw new IllegalArgumentException();
                                            }
                                            j8 = j9;
                                            a2 = m75400a(j9, atda);
                                            str35 = str32;
                                            str37 = str2;
                                            str33 = cryptoParameters;
                                            j7 = j3;
                                            i = i2;
                                            a4 = atds;
                                            str34 = str9;
                                            str36 = str8;
                                            str32 = askf;
                                            millis = str16;
                                            str2 = str2;
                                        } catch (atcz | aths e49) {
                                        } catch (atdb e50) {
                                        } catch (RuntimeException e51) {
                                            e = e51;
                                            str25 = str34;
                                            obj = str35;
                                            atds2 = atds3;
                                            runtimeException = e;
                                            str2 = str37;
                                            str8 = str36;
                                            str32 = obj;
                                            bnsl bnsl122222222 = (bnsl) f90017a.mo68388c();
                                            bnsl122222222.mo68437a(runtimeException);
                                            String str452222222 = str8;
                                            bnsl122222222.mo68432a(str452222222, str9, 260, str2);
                                            String str462222222 = str;
                                            bnsl122222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str462222222);
                                            mo49781a();
                                            a = atbm.m75387a(askf, str462222222, System.currentTimeMillis(), true);
                                            if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                                            }
                                        }
                                    }
                                }
                                atxy.f91100b.set(elapsedRealtime);
                                atxy.f91101c.set(1);
                                int i52 = i + 1;
                                str17 = atda.f90103d;
                                int i62 = 3;
                                switch (str17.hashCode()) {
                                    case -1422950650:
                                        break;
                                    case -766681394:
                                        break;
                                    case 407754553:
                                        break;
                                    case 693933934:
                                        break;
                                    case 881487833:
                                        break;
                                    case 1550463001:
                                        break;
                                    case 1698062945:
                                        break;
                                }
                                switch (c) {
                                }
                                j8 = j9;
                                a2 = m75400a(j9, atda);
                                str35 = str32;
                                str37 = str2;
                                str33 = cryptoParameters;
                                j7 = j3;
                                i = i2;
                                a4 = atds;
                                str34 = str9;
                                str36 = str8;
                                str32 = askf;
                                millis = str16;
                                str2 = str2;
                            }
                        }
                    }
                    throw new atcz("Max amount of steps exceeded");
                } catch (atcz | aths e422) {
                } catch (atdb e72) {
                } catch (RuntimeException e52) {
                }
            } catch (atcz | aths e53) {
                e = e53;
                String str60 = str37;
                cryptoParameters = str33;
                z2 = false;
                askf2 = askf;
                str10 = str;
                th = e;
                str13 = str36;
                str12 = str34;
                str11 = str38;
                str2 = str60;
                j = 100;
                str2 = str2;
                z = z2;
                bnsl bnsl1022222222 = (bnsl) f90017a.mo68388c();
                bnsl1022222222.mo68437a(th9);
                bnsl1022222222.mo68432a(str4, str3, 254, str2);
                bnsl1022222222.mo68405a("Backing off");
                mo49781a();
                return m75402a(atbm.m75387a(askf10, str58, System.currentTimeMillis(), z));
            } catch (atdb e54) {
                e = e54;
                j4 = j10;
                str14 = str37;
                atdb2 = e;
                str7 = str36;
                str6 = str34;
                j2 = j4;
                bnsl bnsl722222222 = (bnsl) f90017a.mo68388c();
                bnsl722222222.mo68437a(atdb);
                bnsl722222222.mo68432a(str7, str6, 257, str2);
                bnsl722222222.mo68405a("Bundle gone while processing it");
                return new atcs(j2, j2);
            } catch (RuntimeException e55) {
                e = e55;
                atds = a4;
                str2 = str37;
                str8 = str36;
                str9 = str34;
                str32 = str35;
                runtimeException = e;
                str32 = str32;
                bnsl bnsl1222222222 = (bnsl) f90017a.mo68388c();
                bnsl1222222222.mo68437a(runtimeException);
                String str4522222222 = str8;
                bnsl1222222222.mo68432a(str4522222222, str9, 260, str2);
                String str4622222222 = str;
                bnsl1222222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str4622222222);
                mo49781a();
                a = atbm.m75387a(askf, str4622222222, System.currentTimeMillis(), true);
                if (((long) a.f165755d) >= cgxi.f187963a.mo6606a().mo84675f()) {
                }
            }
            long currentTimeMillis3 = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(100);
            return new atcs(currentTimeMillis3, currentTimeMillis3);
            throw new atcz("Error calling InitiateReplenish");
        } catch (atfh | IOException e56) {
            atds = a4;
            str8 = str36;
            str9 = str34;
            str32 = str35;
            cryptoParameters = str33;
            j3 = j10;
            str2 = str37;
            z = false;
            r12 = 0;
            throw new atcz("Getting storage key failed", e56);
        } catch (IOException e57) {
            throw new atcz(e57);
        } catch (atfh e58) {
        } catch (IOException e59) {
            throw new atcz("Error calling GetPaymentBundle", e59);
        } catch (atfh e60) {
            str19 = null;
            str8 = str35;
            cryptoParameters = r12;
            atda = m75405a(e60, atda);
        } catch (atcz | aths e61) {
            askf2 = askf;
            str10 = str;
            th = e61;
            str11 = str38;
            str12 = str9;
            str13 = str8;
            str2 = str2;
            z2 = r12;
        } catch (atdb e63) {
            atdb = e63;
            j2 = j3;
            str6 = str9;
            str7 = str8;
            bnsl bnsl7222222222 = (bnsl) f90017a.mo68388c();
            bnsl7222222222.mo68437a(atdb);
            bnsl7222222222.mo68432a(str7, str6, 257, str2);
            bnsl7222222222.mo68405a("Bundle gone while processing it");
            return new atcs(j2, j2);
        } catch (RuntimeException e64) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atbm.a(askf, java.lang.String, long, boolean):byda
     arg types: [askf, java.lang.String, long, int]
     candidates:
      atbm.a(android.database.sqlite.SQLiteDatabase, askf, java.lang.String, com.google.android.gms.tapandpay.security.StorageKey):atda
      atbm.a(askf, java.lang.String, java.lang.String[], java.lang.String):boolean
      atbm.a(askf, java.lang.String, long, boolean):byda */
    /* renamed from: a */
    private final atcs m75401a(askf askf, String str, atds atds) {
        try {
            mo49781a();
            byda a = atbm.m75387a(askf, str, System.currentTimeMillis(), true);
            if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                return m75402a(a);
            }
            atds.mo49855b(str, 6);
            long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(100);
            return new atcs(currentTimeMillis, currentTimeMillis);
        } catch (atdb e) {
            bnsl bnsl = (bnsl) f90017a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbq", "a", 279, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Bundle gone while recording error");
        }
    }

    /* renamed from: a */
    private static final atcs m75402a(byda byda) {
        if (byda == null || byda.f165754c <= 0) {
            return null;
        }
        atbj atbj = f90023g;
        long j = byda.f165753b;
        long j2 = byda.f165754c;
        double d = (double) atbj.f90002a;
        double pow = Math.pow(2.0d, (double) (j2 - 1));
        Double.isNaN(d);
        long min = Math.min((long) (d * pow), atbj.f90003b);
        long j3 = j + min;
        double d2 = (double) min;
        Double.isNaN(d2);
        atcs atcs = new atcs(j3, j + ((long) (d2 * 1.5d)));
        if (atcs.f90092a > System.currentTimeMillis()) {
            return atcs;
        }
        return null;
    }

    /* renamed from: a */
    private final atda m75403a(atda atda) {
        askf askf = atda.f90100a;
        btiy a = atds.m75666a(askf).mo49843a(atda.f90102c);
        try {
            atdm.m75641a(askf, a, atda.f90104e, atda.f90106g, atda.f90108i.mo49800b(), atda.f90108i.mo49805g());
            bnsl bnsl = (bnsl) f90017a.mo68390d();
            bnsl.mo68432a("atbq", "a", 823, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Payment bundle %s acknowledged", atda.f90101b);
            try {
                mo49781a();
                atda atda2 = (atda) atbm.m75388a(askf, atda.f90102c, atbo.f90015a);
                CardInfo b = atds.m75666a(askf).mo49853b(a.f149056a);
                if (b != null) {
                    atam atam = new atam(askf);
                    atam.mo49742a(atam.mo49735a(19, b), atda.f90104e);
                    atkl.f90415a.mo50008a();
                    return atda2;
                }
                throw new RuntimeException();
            } catch (atbk e) {
                throw new RuntimeException(e);
            } catch (aths e2) {
                throw new atcz(e2);
            }
        } catch (IOException e3) {
            throw new atcz("Error calling AcknowledgePaymentBundle", e3);
        } catch (atfh e4) {
            return m75405a(e4, atda);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0203  */
    /* renamed from: a */
    private final atda m75404a(atda atda, String str, btlr btlr, String str2, askf askf, byte[] bArr, long j, String str3, byte[] bArr2, String str4) {
        byda byda;
        long j2;
        bxvd bxvd;
        bmtc bmtc;
        atcv atcv;
        bmts bmts;
        bmts bmts2;
        bmts bmts3;
        bmts bmts4;
        atda atda2 = atda;
        btlr btlr2 = btlr;
        String str5 = str3;
        byte[] bArr3 = bArr2;
        String str6 = str4;
        String str7 = (String) bmxu.m108565a(atda2.f90110k, atda2.f90101b);
        if (str7.equals(str)) {
            atcy b = mo49786b(askf.f89126d, str7);
            int b2 = btny.m116969b(btlr2.f149412c);
            if (b2 == 0) {
                b2 = 1;
            }
            int i = b2 - 2;
            if (i != 1) {
                if (i == 2) {
                    bnsl bnsl = (bnsl) f90017a.mo68390d();
                    bnsl.mo68432a("atbq", "a", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Payment bundle %s included", str7);
                    try {
                        bmtc bmtc2 = (bmtc) bxvk.m124016a(bmtc.f130813c, boan.f132470d.mo68796b(str2), bxus.m123744c());
                        if (cgwn.m147258h()) {
                            if (bmtc2.f130815a == 3) {
                                if (str6 != null) {
                                    bmtp bmtp = ((bmts) bmtc2.f130816b).f130910a;
                                    if (bmtp == null) {
                                        bmtp = bmtp.f130893f;
                                    }
                                    bmti bmti = bmtp.f130898d;
                                    if (bmti == null) {
                                        bmti = bmti.f130844c;
                                    }
                                    bmto bmto = bmti.f130847b;
                                    if (bmto == null) {
                                        bmto = bmto.f130881k;
                                    }
                                    if (bmto.f130892j.isEmpty()) {
                                        bxvd bxvd2 = (bxvd) bmtc2.mo74142c(5);
                                        bxvd2.mo73625a((bxvk) bmtc2);
                                        if (bmtc2.f130815a == 3) {
                                            bmts = (bmts) bmtc2.f130816b;
                                        } else {
                                            bmts = bmts.f130908c;
                                        }
                                        bxvd bxvd3 = (bxvd) bmts.mo74142c(5);
                                        bxvd3.mo73625a((bxvk) bmts);
                                        if (bmtc2.f130815a == 3) {
                                            bmts2 = (bmts) bmtc2.f130816b;
                                        } else {
                                            bmts2 = bmts.f130908c;
                                        }
                                        bmtp bmtp2 = bmts2.f130910a;
                                        if (bmtp2 == null) {
                                            bmtp2 = bmtp.f130893f;
                                        }
                                        bxvd bxvd4 = (bxvd) bmtp2.mo74142c(5);
                                        bxvd4.mo73625a((bxvk) bmtp2);
                                        if (bmtc2.f130815a == 3) {
                                            bmts3 = (bmts) bmtc2.f130816b;
                                        } else {
                                            bmts3 = bmts.f130908c;
                                        }
                                        bmtp bmtp3 = bmts3.f130910a;
                                        if (bmtp3 == null) {
                                            bmtp3 = bmtp.f130893f;
                                        }
                                        bmti bmti2 = bmtp3.f130898d;
                                        if (bmti2 == null) {
                                            bmti2 = bmti.f130844c;
                                        }
                                        bxvd bxvd5 = (bxvd) bmti2.mo74142c(5);
                                        bxvd5.mo73625a((bxvk) bmti2);
                                        if (bmtc2.f130815a == 3) {
                                            bmts4 = (bmts) bmtc2.f130816b;
                                        } else {
                                            bmts4 = bmts.f130908c;
                                        }
                                        bmtp bmtp4 = bmts4.f130910a;
                                        if (bmtp4 == null) {
                                            bmtp4 = bmtp.f130893f;
                                        }
                                        bmti bmti3 = bmtp4.f130898d;
                                        if (bmti3 == null) {
                                            bmti3 = bmti.f130844c;
                                        }
                                        bmto bmto2 = bmti3.f130847b;
                                        if (bmto2 == null) {
                                            bmto2 = bmto.f130881k;
                                        }
                                        bxvd bxvd6 = (bxvd) bmto2.mo74142c(5);
                                        bxvd6.mo73625a((bxvk) bmto2);
                                        if (bxvd6.f164950c) {
                                            bxvd6.mo74035c();
                                            bxvd6.f164950c = false;
                                        }
                                        str4.getClass();
                                        ((bmto) bxvd6.f164949b).f130892j = str6;
                                        if (bxvd5.f164950c) {
                                            bxvd5.mo74035c();
                                            bxvd5.f164950c = false;
                                        }
                                        bmto bmto3 = (bmto) bxvd6.mo74062i();
                                        bmto3.getClass();
                                        ((bmti) bxvd5.f164949b).f130847b = bmto3;
                                        if (bxvd4.f164950c) {
                                            bxvd4.mo74035c();
                                            bxvd4.f164950c = false;
                                        }
                                        bmti bmti4 = (bmti) bxvd5.mo74062i();
                                        bmti4.getClass();
                                        ((bmtp) bxvd4.f164949b).f130898d = bmti4;
                                        if (bxvd3.f164950c) {
                                            bxvd3.mo74035c();
                                            bxvd3.f164950c = false;
                                        }
                                        bmtp bmtp5 = (bmtp) bxvd4.mo74062i();
                                        bmts bmts5 = bmts.f130908c;
                                        bmtp5.getClass();
                                        ((bmts) bxvd3.f164949b).f130910a = bmtp5;
                                        if (bxvd2.f164950c) {
                                            bxvd2.mo74035c();
                                            bxvd2.f164950c = false;
                                        }
                                        bmtc bmtc3 = (bmtc) bxvd2.f164949b;
                                        bmts bmts6 = (bmts) bxvd3.mo74062i();
                                        bmts6.getClass();
                                        bmtc3.f130816b = bmts6;
                                        bmtc3.f130815a = 3;
                                        bmtc = (bmtc) bxvd2.mo74062i();
                                        if (bmtc != null) {
                                            if (atda2.f90110k == null) {
                                                atcv = atda2.f90108i;
                                            } else {
                                                atcv = null;
                                            }
                                            byda = null;
                                            atcv a = b.mo49808a(askf, atcv, bmtc, bArr, j);
                                            atda2.f90103d = "unacknowledged";
                                            atda2.f90104e = str5;
                                            atda2.f90105f = null;
                                            atda2.f90108i = a;
                                            atda2.f90106g = bArr3;
                                            atda2.f90110k = null;
                                            atda2.f90101b = str7;
                                        }
                                    }
                                }
                            }
                        }
                        bmtc = bmtc2;
                    } catch (bxwf e) {
                        bnsl bnsl2 = (bnsl) f90017a.mo68388c();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("atbq", "a", 730, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Failed to parse payment bundle");
                        bmtc = null;
                    }
                    if (bmtc != null) {
                    }
                } else if (i == 3) {
                    btoa a2 = btoa.m116971a(btlr2.f149413d);
                    if (a2 == null) {
                        a2 = btoa.UNRECOGNIZED;
                    }
                    String a3 = atcw.m75565a(a2);
                    bnsl bnsl3 = (bnsl) f90017a.mo68390d();
                    bnsl3.mo68432a("atbq", "a", 653, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68424a("Payment bundle %s converted to %s", str7, a3);
                    atda2.f90103d = "type_switch";
                    atda2.f90104e = str5;
                    atda2.f90106g = bArr3;
                    atda2.f90105f = null;
                    atda2.f90110k = a3;
                    byda = null;
                }
                byda byda2 = atda2.f90109j;
                if (byda2 == null) {
                    bxvd = byda.f165750e.mo74144da();
                } else {
                    bxvd bxvd7 = (bxvd) byda2.mo74142c(5);
                    bxvd7.mo73625a((bxvk) byda2);
                    bxvd = bxvd7;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byda byda3 = (byda) bxvd.f164949b;
                int i2 = byda3.f165752a | 1;
                byda3.f165752a = i2;
                byda3.f165753b = currentTimeMillis;
                long j3 = byda3.f165754c;
                byda3.f165752a = i2 | 2;
                byda3.f165754c = j3 + 1;
                atda2.f90109j = (byda) bxvd.mo74062i();
                return atda2;
            }
            byda = null;
            bnsl bnsl4 = (bnsl) f90017a.mo68390d();
            bnsl4.mo68432a("atbq", "a", 641, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68420a("Payment bundle %s deferred", str7);
            atda2.f90103d = "requested";
            atda2.f90104e = str5;
            atda2.f90106g = bArr3;
            long currentTimeMillis2 = System.currentTimeMillis();
            int i3 = btlr2.f149410a;
            if (i3 == 2) {
                bxun bxun = (bxun) btlr2.f149411b;
                j2 = TimeUnit.SECONDS.toMillis(bxun.f164863a) + TimeUnit.NANOSECONDS.toMillis((long) bxun.f164864b);
            } else if (i3 == 3 && ((Boolean) btlr2.f149411b).booleanValue()) {
                j2 = TimeUnit.DAYS.toMillis(100);
            } else {
                j2 = TimeUnit.MINUTES.toMillis(1);
            }
            atda2.f90107h = currentTimeMillis2 + j2;
            atda2.f90105f = bArr;
            atda2.f90109j = byda;
            return atda2;
        }
        throw new atbk("Bundle type changed");
    }

    /* renamed from: a */
    private final atda m75405a(atfh atfh, atda atda) {
        bnsl bnsl = (bnsl) f90017a.mo68388c();
        bnsl.mo68432a("atbq", "a", 866, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Error from bundle RPC");
        btmu btmu = (btmu) atff.m75762a(atfh.f90231a, btmu.f149546d, 1);
        askf askf = atda.f90100a;
        String str = atda.f90102c;
        if (btmu != null) {
            atds a = atds.m75666a(askf);
            int b = btmt.m116934b(btmu.f149548a);
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            if (i != 1) {
                switch (i) {
                    case 8:
                        a.mo49855b(str, 4);
                        throw new atdb();
                    case 9:
                        throw new atcz("Account locked");
                    case 10:
                        throw new atcz("Replenish limit exceeded");
                    case 11:
                        try {
                            mo49781a();
                            return (atda) atbm.m75388a(atda.f90100a, atda.f90102c, new atbp("needs_refresh"));
                        } catch (atbk e) {
                            throw ((atcz) e.getCause());
                        } catch (aths e2) {
                            throw new atcz(e2);
                        }
                    case 12:
                        break;
                    default:
                        throw new atcz("unknown error code");
                }
            }
            try {
                a.mo49859d();
            } catch (atfh | IOException e3) {
            }
            throw new atdb();
        }
        throw new atcz("No error detail", atfh);
    }

    /* renamed from: a */
    private static bmtc m75406a(String str, String str2) {
        bmts bmts;
        bmts bmts2;
        bmts bmts3;
        bmts bmts4;
        try {
            bmtc bmtc = (bmtc) bxvk.m124016a(bmtc.f130813c, boan.f132470d.mo68796b(str), bxus.m123744c());
            if (cgwn.m147258h() && bmtc.f130815a == 3 && str2 != null) {
                bmtp bmtp = ((bmts) bmtc.f130816b).f130910a;
                if (bmtp == null) {
                    bmtp = bmtp.f130893f;
                }
                bmti bmti = bmtp.f130898d;
                if (bmti == null) {
                    bmti = bmti.f130844c;
                }
                bmto bmto = bmti.f130847b;
                if (bmto == null) {
                    bmto = bmto.f130881k;
                }
                if (bmto.f130892j.isEmpty()) {
                    bxvd bxvd = (bxvd) bmtc.mo74142c(5);
                    bxvd.mo73625a((bxvk) bmtc);
                    if (bmtc.f130815a == 3) {
                        bmts = (bmts) bmtc.f130816b;
                    } else {
                        bmts = bmts.f130908c;
                    }
                    bxvd bxvd2 = (bxvd) bmts.mo74142c(5);
                    bxvd2.mo73625a((bxvk) bmts);
                    if (bmtc.f130815a == 3) {
                        bmts2 = (bmts) bmtc.f130816b;
                    } else {
                        bmts2 = bmts.f130908c;
                    }
                    bmtp bmtp2 = bmts2.f130910a;
                    if (bmtp2 == null) {
                        bmtp2 = bmtp.f130893f;
                    }
                    bxvd bxvd3 = (bxvd) bmtp2.mo74142c(5);
                    bxvd3.mo73625a((bxvk) bmtp2);
                    if (bmtc.f130815a == 3) {
                        bmts3 = (bmts) bmtc.f130816b;
                    } else {
                        bmts3 = bmts.f130908c;
                    }
                    bmtp bmtp3 = bmts3.f130910a;
                    if (bmtp3 == null) {
                        bmtp3 = bmtp.f130893f;
                    }
                    bmti bmti2 = bmtp3.f130898d;
                    if (bmti2 == null) {
                        bmti2 = bmti.f130844c;
                    }
                    bxvd bxvd4 = (bxvd) bmti2.mo74142c(5);
                    bxvd4.mo73625a((bxvk) bmti2);
                    if (bmtc.f130815a == 3) {
                        bmts4 = (bmts) bmtc.f130816b;
                    } else {
                        bmts4 = bmts.f130908c;
                    }
                    bmtp bmtp4 = bmts4.f130910a;
                    if (bmtp4 == null) {
                        bmtp4 = bmtp.f130893f;
                    }
                    bmti bmti3 = bmtp4.f130898d;
                    if (bmti3 == null) {
                        bmti3 = bmti.f130844c;
                    }
                    bmto bmto2 = bmti3.f130847b;
                    if (bmto2 == null) {
                        bmto2 = bmto.f130881k;
                    }
                    bxvd bxvd5 = (bxvd) bmto2.mo74142c(5);
                    bxvd5.mo73625a((bxvk) bmto2);
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    str2.getClass();
                    ((bmto) bxvd5.f164949b).f130892j = str2;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bmto bmto3 = (bmto) bxvd5.mo74062i();
                    bmto3.getClass();
                    ((bmti) bxvd4.f164949b).f130847b = bmto3;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bmti bmti4 = (bmti) bxvd4.mo74062i();
                    bmti4.getClass();
                    ((bmtp) bxvd3.f164949b).f130898d = bmti4;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bmtp bmtp5 = (bmtp) bxvd3.mo74062i();
                    bmts bmts5 = bmts.f130908c;
                    bmtp5.getClass();
                    ((bmts) bxvd2.f164949b).f130910a = bmtp5;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmtc bmtc2 = (bmtc) bxvd.f164949b;
                    bmts bmts6 = (bmts) bxvd2.mo74062i();
                    bmts6.getClass();
                    bmtc2.f130816b = bmts6;
                    bmtc2.f130815a = 3;
                    return (bmtc) bxvd.mo74062i();
                }
            }
            return bmtc;
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f90017a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atbq", "a", 730, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse payment bundle");
            return null;
        }
    }

    /* renamed from: a */
    public static void m75407a(Context context) {
        atcj.m75548a(context);
    }

    /* renamed from: a */
    public static boolean m75408a(String str) {
        return f90021e.contains(str);
    }

    /* renamed from: a */
    public final atbm mo49781a() {
        return new atbm();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, int, int, int]
     candidates:
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, java.lang.String, boolean, boolean):void
      atam.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean, int, long):void */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0190 A[Catch:{ aths -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0199 A[Catch:{ aths -> 0x0184 }] */
    /* renamed from: a */
    public final atda mo49782a(askf askf, atda atda, String str, byte[] bArr, btlr btlr, byte[] bArr2, String str2, long j, String str3) {
        atda atda2;
        atbn atbn;
        atec atec;
        SQLiteDatabase d;
        askf askf2 = askf;
        atda atda3 = atda;
        String str4 = (String) bmxu.m108565a(atda3.f90110k, atda3.f90101b);
        mo49781a();
        try {
            askf askf3 = atda3.f90100a;
            String str5 = atda3.f90102c;
            atbn atbn2 = atbn;
            try {
                atbn = new atbn(this, str4, btlr, str2, askf, bArr, j, str, bArr2, str3);
                atda atda4 = (atda) atbm.m75388a(askf3, str5, atbn2);
                atds a = atds.m75666a(askf);
                String str6 = atda4.f90102c;
                CardInfo b = a.mo49853b(str6);
                if (b != null) {
                    atam atam = new atam(askf2);
                    atam.mo49742a(atam.mo49735a(18, b), str);
                    if (a.f90151a.mo49884c(str6)) {
                        atdz atdz = a.f90151a;
                        d = atdz.mo49886d();
                        d.beginTransaction();
                        String c = atdz.mo49883c(d);
                        if (c != null) {
                            atec = new atec(c, false);
                        } else if (atdz.mo49875a(d, str6)) {
                            d.execSQL("UPDATE PaymentCards SET is_selected=(billing_id=?) WHERE account_id=? AND environment=?", atdz.mo49889e(str6));
                            d.setTransactionSuccessful();
                            d.endTransaction();
                            asuc.getInstance().mo49500a(atdz.mo49888e(), "setDefaultCardIfNull");
                            atam atam2 = new atam(atdz.f90167b);
                            CardInfo b2 = atdz.mo49880b(str6);
                            atam2.mo49747a(b2, true, 0, 0L);
                            atam2.mo49743a(b2);
                            atkl.f90415a.mo50008a();
                            atec = new atec(str6, true);
                        } else {
                            atec = new atec(null, false);
                        }
                        d.endTransaction();
                    } else {
                        atgn atgn = a.f90152b;
                        atgu b3 = atgn.mo49954b(str6);
                        if (b3 != null) {
                            try {
                                atgu atgu = (atgu) atgn.mo49947a(atgn.mo49946a(), atgn.mo49957d()).get(b3.f90326c);
                                if (atgu != null) {
                                    btiy btiy = atgu.f90324a.f149123a;
                                    if (btiy == null) {
                                        btiy = btiy.f149054c;
                                    }
                                    atec = new atec(btiy.f149056a, false);
                                } else {
                                    try {
                                        if (atgn.mo49951a(b3.f90324a)) {
                                            atec = new atec(str6, true);
                                        }
                                    } catch (bres e) {
                                        bnsl bnsl = (bnsl) atgn.f90301a.mo68387b();
                                        bnsl.mo68437a(e);
                                        bnsl.mo68405a("Error when enabling card");
                                    }
                                    atec = new atec(null, false);
                                }
                            } catch (bres e2) {
                                bnsl bnsl2 = (bnsl) atgn.f90301a.mo68387b();
                                bnsl2.mo68437a(e2);
                                bnsl2.mo68405a("Error reading default cards");
                                atec = new atec(null, false);
                            }
                        } else {
                            atec = new atec(null, false);
                        }
                    }
                    if (str6.equals(atec.f90170a) && !atec.f90171b) {
                        atda2 = atda;
                        try {
                            atcv atcv = atda2.f90108i;
                            if (!(atcv == null && atda4.f90108i == null) && (atcv == null || atda4.f90108i == null || !Arrays.equals(atcv.mo49806h(), atda4.f90108i.mo49806h()))) {
                                asuc.getInstance().mo49500a(askf2.f89126d, "replenishment");
                            }
                        } catch (atbk e3) {
                            e = e3;
                            try {
                                if (e.getCause() instanceof atcz) {
                                }
                            } catch (aths e4) {
                                throw new atcz(e4);
                            }
                        }
                    }
                    return atda4;
                }
                throw new RuntimeException();
            } catch (atbk e5) {
                e = e5;
                atda2 = atda;
            } catch (Throwable th) {
                d.endTransaction();
                throw th;
            }
        } catch (atbk e6) {
            e = e6;
            atda2 = atda3;
            if (e.getCause() instanceof atcz) {
                return atbm.m75384a(atda2.f90100a, atda2.f90102c);
            }
            throw ((atcz) e.getCause());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public final atcy mo49786b(Context context, String str) {
        char c;
        String str2;
        switch (str.hashCode()) {
            case -1688490866:
                if (str.equals("canonical_interac_bundle")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1426184971:
                if (str.equals("canonical_eftpos_bundle")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1245210692:
                if (str.equals("felica_quicpay_bundle")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -905486322:
                if (str.equals("amex2_bundle")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -377015583:
                if (str.equals("felica_id_aptest_bundle")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -152778304:
                if (str.equals("canonical_mc_bundle")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 309674061:
                if (str.equals("canonical_discover_bundle")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 366259608:
                if (str.equals("discover_bundle")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 434689600:
                if (str.equals("visa_bundle")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 804254209:
                if (str.equals("felica_id_bundle")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 959178788:
                if (str.equals("canonical_elo_bundle")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 1640769725:
                if (str.equals("mcbp_bundle")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2000139462:
                if (str.equals("felica_quicpay_aptest_bundle")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (cgwn.m147273w()) {
                    return new atcb(context);
                }
                return new atbx(context);
            case 1:
                return new atdi();
            case 2:
                return new atdl();
            case 3:
                return new atdq(new atdm());
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return new atdf(str);
            default:
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    str2 = new String("Unknown bundle type: ");
                } else {
                    str2 = "Unknown bundle type: ".concat(valueOf);
                }
                throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public final athq mo49787b() {
        return new athq();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:144:0x031a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:174:0x03cf */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:239:0x04ff */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:237:0x04fb */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:635:0x0cd6 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:595:0x0c0d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:618:0x0c7b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:564:0x0b36 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:242:0x050f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:257:0x054c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:260:0x0558 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:264:0x0566 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:267:0x0571 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:497:0x0a1d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:796:0x0d44 */
    /* JADX WARN: Type inference failed for: r32v1, assign insn: PHI: (r32v1 ?) = (r32v2 ?), (r32v2 ?), (r32v3 ?), (r32v4 ?), (r32v4 ?), (r32v58 ?), (r32v60 ?) binds: [B:782:0x0fe2, B:788:0x0fe2, B:787:0x0fe2, B:786:0x0fe2, B:785:0x0fe2, B:784:0x0fe2, B:783:0x0fe2] */
    /* JADX WARN: Type inference failed for: r32v2, assign insn: PHI: (r32v2 ?) = (r32v11 ?), (r32v12 ?), (r32v50 ?), (r32v50 ?), (r32v52 ?) binds: [B:739:0x0f87, B:705:0x0ea1, B:591:0x0bdb, B:451:0x08d0, B:207:0x046f] */
    /* JADX WARN: Type inference failed for: r32v3, assign insn: PHI: (r32v3 ?) = (r32v8 ?), (r32v11 ?), (r32v16 ?), (r32v27 ?), (r32v50 ?), (r32v50 ?), (r32v53 ?), (r32v65 ?) binds: [B:716:0x0ecc, B:734:0x0f60, B:701:0x0e82, B:165:0x03a8, B:588:0x0bd1, B:449:0x08c4, B:204:0x045e, B:138:0x02f7] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String], assign insn: PHI: (r13v6 ?) = (r13v11 ?), (r13v14 java.lang.String), (r13v19 ?), (r13v26 ?), (r13v91 ?), (r13v128 ?), (r13v135 ?), (r13v137 ?) binds: [B:716:0x0ecc, B:734:0x0f60, B:701:0x0e82, B:165:0x03a8, B:449:0x08c4, B:588:0x0bd1, B:204:0x045e, B:138:0x02f7] */
    /* JADX WARN: Type inference failed for: r32v4, assign insn: PHI: (r32v4 ?) = (r32v13 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v62 ?) binds: [B:694:0x0e6b, B:586:0x0bca, B:552:0x0ae2, B:476:0x096e, B:453:0x08e0, B:447:0x08bb, B:277:0x058e, B:135:0x02e1] */
    /* JADX WARN: Type inference failed for: r32v5, assign insn: PHI: (r32v5 ?) = (r32v11 ?), (r32v11 ?), (r32v11 ?), (r32v40 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v56 ?) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r13v8, assign insn: PHI: (r13v8 ?) = (r13v14 java.lang.String), (r13v14 java.lang.String), (r13v14 java.lang.String), (r13v36 ?), (r13v40 ?), (r13v40 ?), (r13v43 ?), (r13v43 ?), (r13v44 ?), (r13v44 ?), (r13v44 ?), (r13v36 ?) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r32v6, assign insn: PHI: (r32v6 ?) = (r32v7 ?), (r32v50 ?) binds: [B:717:0x0ed2, B:633:0x0cb4] */
    /* JADX WARN: Type inference failed for: r13v9, assign insn: PHI: (r13v9 ?) = (r13v44 ?), (r13v120 ?) binds: [B:633:0x0cb4, B:717:0x0ed2] */
    /* JADX WARN: Type inference failed for: r32v7, assign insn: PHI: (r32v7 ?) = (r32v11 ?), (r32v40 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v56 ?) binds: [B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r13v10, assign insn: PHI: (r13v10 ?) = (r13v14 java.lang.String), (r13v36 ?), (r13v40 ?), (r13v40 ?), (r13v43 ?), (r13v43 ?), (r13v44 ?), (r13v44 ?), (r13v44 ?), (r13v36 ?) binds: [B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r32v8, assign insn: PHI: (r32v8 ?) = (r32v9 ?), (r32v50 ?) binds: [B:715:0x0ecb, B:455:0x08f2] */
    /* JADX WARN: Type inference failed for: r13v11, assign insn: PHI: (r13v11 ?) = (r13v88 java.lang.String), (r13v121 ?) binds: [B:455:0x08f2, B:715:0x0ecb] */
    /* JADX WARN: Type inference failed for: r32v9, assign insn: PHI: (r32v9 ?) = (r32v10 ?), (r32v50 ?) binds: [B:714:0x0eca, B:631:0x0cac] */
    /* JADX WARN: Type inference failed for: r13v12, assign insn: PHI: (r13v12 ?) = (r13v44 ?), (r13v122 ?) binds: [B:631:0x0cac, B:714:0x0eca] */
    /* JADX WARN: Type inference failed for: r52v10, assign insn: PHI: (r52v10 ?) = (r52v11 java.lang.String), (r52v39 java.lang.String), (r52v47 java.lang.String), (r52v47 java.lang.String), (r52v49 java.lang.String), (r52v49 java.lang.String), (r52v50 java.lang.String), (r52v50 java.lang.String), (r52v50 java.lang.String), (r52v39 java.lang.String) binds: [B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r32v10, assign insn: PHI: (r32v10 ?) = (r32v11 ?), (r32v40 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v56 ?) binds: [B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r13v13, assign insn: PHI: (r13v13 ?) = (r13v14 java.lang.String), (r13v36 ?), (r13v40 ?), (r13v40 ?), (r13v43 ?), (r13v43 ?), (r13v44 ?), (r13v44 ?), (r13v44 ?), (r13v36 ?) binds: [B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] */
    /* JADX WARN: Type inference failed for: r32v11, assign insn: 0x0eb4: MOVE  (r32v11 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v12, assign insn: PHI: (r32v12 ?) = (r32v6 ?), (r32v14 ?), (r32v61 ?) binds: [B:718:0x0ed5, B:704:0x0e9f, B:142:0x030f] */
    /* JADX WARN: Type inference failed for: r32v13, assign insn: PHI: (r32v13 ?) = (r32v5 ?), (r32v22 ?), (r32v50 ?) binds: [B:719:0x0edf, B:693:0x0e6a, B:629:0x0ca6] */
    /* JADX WARN: Type inference failed for: r13v16, assign insn: PHI: (r13v16 ?) = (r13v8 ?), (r13v25 java.lang.String), (r13v44 ?) binds: [B:719:0x0edf, B:693:0x0e6a, B:629:0x0ca6] */
    /* JADX WARN: Type inference failed for: r32v14, assign insn: PHI: (r32v14 ?) = (r32v15 ?), (r32v31 ?) binds: [B:703:0x0e89, B:688:0x0e4f] */
    /* JADX WARN: Type inference failed for: r32v15, assign insn: 0x0e8f: MOVE  (r32v15 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v16, assign insn: PHI: (r52v16 ?) = (r52v17 ?), (r52v61 ?) binds: [B:700:0x0e81, B:556:0x0af6] */
    /* JADX WARN: Type inference failed for: r32v16, assign insn: PHI: (r32v16 ?) = (r32v17 ?), (r32v50 ?) binds: [B:700:0x0e81, B:556:0x0af6] */
    /* JADX WARN: Type inference failed for: r13v19, assign insn: PHI: (r13v19 ?) = (r13v20 ?), (r13v55 ?) binds: [B:700:0x0e81, B:556:0x0af6] */
    /* JADX WARN: Type inference failed for: r52v17, assign insn: PHI: (r52v17 ?) = (r52v18 ?), (r52v84 java.lang.String) binds: [B:699:0x0e80, B:478:0x0981] */
    /* JADX WARN: Type inference failed for: r32v17, assign insn: PHI: (r32v17 ?) = (r32v18 ?), (r32v50 ?) binds: [B:699:0x0e80, B:478:0x0981] */
    /* JADX WARN: Type inference failed for: r13v20, assign insn: PHI: (r13v20 ?) = (r13v21 ?), (r13v85 java.lang.String) binds: [B:699:0x0e80, B:478:0x0981] */
    /* JADX WARN: Type inference failed for: r52v18, assign insn: PHI: (r52v18 ?) = (r52v19 ?), (r52v45 ?) binds: [B:698:0x0e7f, B:660:0x0d8b] */
    /* JADX WARN: Type inference failed for: r32v18, assign insn: PHI: (r32v18 ?) = (r32v19 ?), (r32v48 ?) binds: [B:698:0x0e7f, B:660:0x0d8b] */
    /* JADX WARN: Type inference failed for: r13v21, assign insn: PHI: (r13v21 ?) = (r13v22 ?), (r13v39 java.lang.String) binds: [B:698:0x0e7f, B:660:0x0d8b] */
    /* JADX WARN: Type inference failed for: r52v19, assign insn: PHI: (r52v19 ?) = (r52v20 ?), (r52v42 java.lang.String) binds: [B:697:0x0e7e, B:668:0x0dc5] */
    /* JADX WARN: Type inference failed for: r32v19, assign insn: PHI: (r32v19 ?) = (r32v20 ?), (r32v43 ?) binds: [B:697:0x0e7e, B:668:0x0dc5] */
    /* JADX WARN: Type inference failed for: r13v22, assign insn: PHI: (r13v22 ?) = (r13v23 ?), (r13v38 java.lang.String) binds: [B:697:0x0e7e, B:668:0x0dc5] */
    /* JADX WARN: Type inference failed for: r52v20, assign insn: PHI: (r52v20 ?) = (r52v21 java.lang.String), (r52v36 java.lang.String), (r52v38 ?) binds: [B:696:0x0e6f, B:681:0x0e2b, B:677:0x0e09] */
    /* JADX WARN: Type inference failed for: r32v20, assign insn: PHI: (r32v20 ?) = (r32v21 ?), (r32v37 ?), (r32v39 ?) binds: [B:696:0x0e6f, B:681:0x0e2b, B:677:0x0e09] */
    /* JADX WARN: Type inference failed for: r13v23, assign insn: PHI: (r13v23 ?) = (r13v24 java.lang.String), (r13v33 java.lang.String), (r13v35 java.lang.String) binds: [B:696:0x0e6f, B:681:0x0e2b, B:677:0x0e09] */
    /* JADX WARN: Type inference failed for: r32v21, assign insn: 0x0e76: MOVE  (r32v21 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v22, assign insn: PHI: (r52v22 ?) = (r52v46 java.lang.String), (r52v120 java.lang.String) binds: [B:658:0x0d75, B:692:0x0e69] */
    /* JADX WARN: Type inference failed for: r32v22, assign insn: PHI: (r32v22 ?) = (r32v23 ?), (r32v49 ?) binds: [B:692:0x0e69, B:658:0x0d75] */
    /* JADX WARN: Type inference failed for: r32v23, assign insn: PHI: (r32v23 ?) = (r32v24 ?), (r32v44 ?) binds: [B:691:0x0e66, B:666:0x0dae] */
    /* JADX WARN: Type inference failed for: r32v24, assign insn: PHI: (r32v24 ?) = (r32v25 ?), (r32v38 ?) binds: [B:690:0x0e54, B:679:0x0e19] */
    /* JADX WARN: Type inference failed for: r32v25, assign insn: 0x0e5e: MOVE  (r32v25 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v27, assign insn: PHI: (r32v27 ?) = (r32v28 ?), (r32v59 ?) binds: [B:164:0x0397, B:160:0x036c] */
    /* JADX WARN: Type inference failed for: r13v26, assign insn: PHI: (r13v26 ?) = (r13v27 java.lang.String), (r13v112 java.lang.String) binds: [B:164:0x0397, B:160:0x036c] */
    /* JADX WARN: Type inference failed for: r32v28, assign insn: 0x039e: MOVE  (r32v28 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v30, assign insn: PHI: (r32v30 ?) = (r32v1 ?), (r32v1 ?), (r32v69 ?), (r32v76 ?), (r32v76 ?), (r32v76 ?), (r32v1 ?) binds: [B:143:0x0312, B:131:0x02c1, B:130:?, B:107:0x0252, B:94:0x0217, B:87:?, B:24:0x00a3] */
    /* JADX WARN: Type inference failed for: r32v31, assign insn: PHI: (r32v31 ?) = (r32v32 ?), (r32v50 ?), (r32v50 ?) binds: [B:687:0x0e4d, B:457:0x0906, B:280:0x05a3] */
    /* JADX WARN: Type inference failed for: r32v32, assign insn: PHI: (r32v32 ?) = (r32v33 ?), (r32v50 ?) binds: [B:686:0x0e4c, B:562:0x0b0b] */
    /* JADX WARN: Type inference failed for: r13v29, assign insn: PHI: (r13v29 ?) = (r13v30 ?), (r13v53 ?) binds: [B:686:0x0e4c, B:562:0x0b0b] */
    /* JADX WARN: Type inference failed for: r32v33, assign insn: PHI: (r32v33 ?) = (r32v34 ?), (r32v50 ?) binds: [B:685:0x0e4a, B:480:0x0994] */
    /* JADX WARN: Type inference failed for: r13v30, assign insn: PHI: (r13v30 ?) = (r13v31 java.lang.String), (r13v84 java.lang.String) binds: [B:685:0x0e4a, B:480:0x0994] */
    /* JADX WARN: Type inference failed for: r52v33, assign insn: PHI: (r52v33 ?) = (r52v34 ?), (r52v44 java.lang.String) binds: [B:684:0x0e49, B:664:0x0d9e] */
    /* JADX WARN: Type inference failed for: r32v34, assign insn: PHI: (r32v34 ?) = (r32v35 ?), (r32v45 ?) binds: [B:684:0x0e49, B:664:0x0d9e] */
    /* JADX WARN: Type inference failed for: r52v34, assign insn: PHI: (r52v34 ?) = (r52v35 java.lang.String), (r52v41 java.lang.String) binds: [B:683:0x0e3c, B:672:0x0dd9] */
    /* JADX WARN: Type inference failed for: r32v35, assign insn: PHI: (r32v35 ?) = (r32v36 ?), (r32v42 ?) binds: [B:683:0x0e3c, B:672:0x0dd9] */
    /* JADX WARN: Type inference failed for: r32v36, assign insn: 0x0e42: MOVE  (r32v36 ? I:?[OBJECT, ARRAY]) = (r15v35 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v37, assign insn: PHI: (r15v37 ?) = (r15v1 java.lang.String), (r15v39 ?) binds: [B:144:0x031a, B:174:0x03cf] */
    /* JADX WARN: Type inference failed for: r32v37, assign insn: 0x0e30: MOVE  (r32v37 ? I:?[OBJECT, ARRAY]) = (r15v37 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v38, assign insn: 0x0e21: MOVE  (r32v38 ? I:?[OBJECT, ARRAY]) = (r15v38 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v38, assign insn: 0x0e0e: MOVE  (r52v38 ? I:?[OBJECT, ARRAY]) = (r14v31 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v39, assign insn: 0x0e10: MOVE  (r32v39 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v40, assign insn: PHI: (r32v40 ?) = (r32v30 ?), (r32v50 ?) binds: [B:172:0x03cc, B:651:0x0d44] */
    /* JADX WARN: Type inference failed for: r15v39, assign insn: PHI: (r15v39 ?) = (r15v1 java.lang.String), (r15v49 ?) binds: [B:172:0x03cc, B:651:0x0d44] */
    /* JADX WARN: Type inference failed for: r13v36, assign insn: PHI: (r13v36 ?) = (r13v2 askf), (r13v42 ?) binds: [B:172:0x03cc, B:651:0x0d44] */
    /* JADX WARN: Type inference failed for: r32v42, assign insn: 0x0ddf: MOVE  (r32v42 ? I:?[OBJECT, ARRAY]) = (r15v39 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v43, assign insn: 0x0dca: MOVE  (r32v43 ? I:?[OBJECT, ARRAY]) = (r15v39 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v44, assign insn: 0x0db6: MOVE  (r32v44 ? I:?[OBJECT, ARRAY]) = (r15v39 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v45, assign insn: PHI: (r32v45 ?) = (r32v46 ?), (r32v47 ?) binds: [B:663:0x0d9d, B:662:0x0d9c] */
    /* JADX WARN: Type inference failed for: r32v46, assign insn: PHI: (r32v46 ?) = (r32v51 ?), (r32v56 ?), (r32v56 ?) binds: [B:208:0x0480, B:190:0x0410, B:191:?] */
    /* JADX WARN: Type inference failed for: r33v2, assign insn: PHI: (r33v2 ?) = (r33v6 java.lang.String), (r33v11 java.lang.String), (r33v11 java.lang.String) binds: [B:208:0x0480, B:190:0x0410, B:191:?] */
    /* JADX WARN: Type inference failed for: r32v47, assign insn: PHI: (r32v47 ?) = (r32v51 ?), (r32v56 ?), (r32v56 ?) binds: [B:208:0x0480, B:190:0x0410, B:191:?] */
    /* JADX WARN: Type inference failed for: r33v3, assign insn: PHI: (r33v3 ?) = (r33v6 java.lang.String), (r33v11 java.lang.String), (r33v11 java.lang.String) binds: [B:208:0x0480, B:190:0x0410, B:191:?] */
    /* JADX WARN: Type inference failed for: r32v48, assign insn: PHI: (r32v48 ?) = (r32v51 ?), (r32v56 ?), (r32v56 ?) binds: [B:208:0x0480, B:190:0x0410, B:191:?] */
    /* JADX WARN: Type inference failed for: r52v45, assign insn: 0x0d97: MOVE  (r52v45 ? I:?[OBJECT, ARRAY]) = (r33v3 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v49, assign insn: PHI: (r32v49 ?) = (r32v51 ?), (r32v56 ?), (r32v56 ?) binds: [B:208:0x0480, B:190:0x0410, B:191:?] */
    /* JADX WARN: Type inference failed for: r32v50, assign insn: PHI: (r32v50 ?) = (r32v51 ?), (r32v56 ?) binds: [B:209:?, B:197:0x041e] */
    /* JADX WARN: Type inference failed for: r14v45, types: [int], assign insn: 0x048b: ARITH  (r14v45 ? I:int) = (r2v76 int) + (1 int) */
    /* JADX WARN: Type inference failed for: r15v47, assign insn: 0x04f0: MOVE  (r15v47 ? I:?[OBJECT, ARRAY]) = (r23v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v40, assign insn: 0x04fa: MOVE  (r13v40 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v48, assign insn: PHI: (r15v48 ?) = (r15v50 ?), (r15v56 ?), (r15v57 ?), (r15v69 ?), (r15v70 ?), (r15v81 ?), (r15v101 ?) binds: [B:795:0x0d44, B:801:0x0d44, B:800:0x0d44, B:799:0x0d44, B:798:0x0d44, B:797:0x0d44, B:796:0x0d44] */
    /* JADX WARN: Type inference failed for: r13v41, assign insn: PHI: (r13v41 ?) = (r13v43 ?), (r13v44 ?), (r13v44 ?), (r13v52 ?), (r13v52 ?), (r13v70 ?), (r13v91 ?) binds: [B:795:0x0d44, B:801:0x0d44, B:800:0x0d44, B:799:0x0d44, B:798:0x0d44, B:797:0x0d44, B:796:0x0d44] */
    /* JADX WARN: Type inference failed for: r15v49, assign insn: 0x0d4f: MOVE  (r15v49 ? I:?[OBJECT, ARRAY]) = (r32v50 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r13v42, assign insn: 0x0d53: MOVE  (r13v42 ? I:?[OBJECT, ARRAY]) = (r37v41 askf) */
    /* JADX WARN: Type inference failed for: r15v50, types: [java.lang.String], assign insn: 0x0cc8: MOVE  (r15v50 ? I:?[OBJECT, ARRAY]) = (r23v2 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v43, assign insn: 0x0cd5: MOVE  (r13v43 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v51, assign insn: 0x0bea: MOVE  (r15v51 ? I:?[OBJECT, ARRAY]) = (r10v15 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v44, assign insn: 0x0bfe: MOVE  (r13v44 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v52, assign insn: 0x0cb6: MOVE  (r15v52 ? I:?[OBJECT, ARRAY]) = (r9v13 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v56, assign insn: 0x0c8f: MOVE  (r15v56 ? I:?[OBJECT, ARRAY]) = (r9v13 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v57, assign insn: 0x0c77: MOVE  (r15v57 ? I:?[OBJECT, ARRAY]) = (r9v13 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v51, assign insn: PHI: (r52v51 ?) = (r52v53 ?), (r52v71 ?), (r52v122 ?) binds: [B:589:0x0bd8, B:512:0x0a48, B:590:0x0bda] */
    /* JADX WARN: Type inference failed for: r15v58, assign insn: PHI: (r15v58 ?) = (r15v80 ?), (r15v129 ?), (r15v130 ?) binds: [B:512:0x0a48, B:590:0x0bda, B:589:0x0bd8] */
    /* JADX WARN: Type inference failed for: r14v51, assign insn: PHI: (r14v51 ?) = (r14v84 ?), (r14v171 ?), (r14v172 ?) binds: [B:512:0x0a48, B:590:0x0bda, B:589:0x0bd8] */
    /* JADX WARN: Type inference failed for: r13v45, assign insn: PHI: (r13v45 ?) = (r13v70 ?), (r13v126 ?), (r13v127 ?) binds: [B:512:0x0a48, B:590:0x0bda, B:589:0x0bd8] */
    /* JADX WARN: Type inference failed for: r52v52, assign insn: PHI: (r52v52 ?) = (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v71 ?), (r52v71 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r15v60, assign insn: PHI: (r15v60 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r14v52, assign insn: PHI: (r14v52 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r13v46, assign insn: PHI: (r13v46 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r52v53, assign insn: PHI: (r52v53 ?) = (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v71 ?), (r52v71 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r15v61, assign insn: PHI: (r15v61 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r14v53, assign insn: PHI: (r14v53 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r13v47, assign insn: PHI: (r13v47 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r52v54, assign insn: PHI: (r52v54 ?) = (r52v55 ?), (r52v71 ?) binds: [B:587:0x0bd0, B:508:0x0a41] */
    /* JADX WARN: Type inference failed for: r15v62, assign insn: PHI: (r15v62 ?) = (r15v80 ?), (r15v131 ?) binds: [B:508:0x0a41, B:587:0x0bd0] */
    /* JADX WARN: Type inference failed for: r14v54, assign insn: PHI: (r14v54 ?) = (r14v84 ?), (r14v174 ?) binds: [B:508:0x0a41, B:587:0x0bd0] */
    /* JADX WARN: Type inference failed for: r13v48, assign insn: PHI: (r13v48 ?) = (r13v70 ?), (r13v129 ?) binds: [B:508:0x0a41, B:587:0x0bd0] */
    /* JADX WARN: Type inference failed for: r52v55, assign insn: PHI: (r52v55 ?) = (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v71 ?), (r52v71 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r15v64, assign insn: PHI: (r15v64 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r14v55, assign insn: PHI: (r14v55 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r13v49, assign insn: PHI: (r13v49 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r15v65, assign insn: PHI: (r15v65 ?) = (r15v80 ?), (r15v132 ?) binds: [B:506:0x0a3c, B:585:0x0bc9] */
    /* JADX WARN: Type inference failed for: r14v56, assign insn: PHI: (r14v56 ?) = (r14v84 ?), (r14v176 ?) binds: [B:506:0x0a3c, B:585:0x0bc9] */
    /* JADX WARN: Type inference failed for: r13v50, assign insn: PHI: (r13v50 ?) = (r13v70 ?), (r13v131 ?) binds: [B:506:0x0a3c, B:585:0x0bc9] */
    /* JADX WARN: Type inference failed for: r15v67, assign insn: PHI: (r15v67 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r14v57, assign insn: PHI: (r14v57 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r13v51, assign insn: PHI: (r13v51 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] */
    /* JADX WARN: Type inference failed for: r15v68, types: [java.lang.String], assign insn: 0x0b13: MOVE  (r15v68 ? I:?[OBJECT, ARRAY]) = (r10v15 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v58, types: [java.lang.String], assign insn: 0x0b26: MOVE  (r14v58 ? I:?[OBJECT, ARRAY]) = (r8v24 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v52, assign insn: 0x0b27: MOVE  (r13v52 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v69, assign insn: 0x0bbc: MOVE  (r15v69 ? I:?[OBJECT, ARRAY]) = (r9v22 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v70, assign insn: 0x0b98: MOVE  (r15v70 ? I:?[OBJECT, ARRAY]) = (r9v22 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v53, assign insn: PHI: (r13v53 ?) = (r13v54 java.lang.String), (r13v61 ?), (r13v73 java.lang.String) binds: [B:561:0x0b04, B:535:0x0aa5, B:493:0x09fc] */
    /* JADX WARN: Type inference failed for: r52v61, assign insn: PHI: (r52v61 ?) = (r52v62 java.lang.String), (r52v75 java.lang.String) binds: [B:555:0x0aee, B:491:0x09eb] */
    /* JADX WARN: Type inference failed for: r13v55, assign insn: PHI: (r13v55 ?) = (r13v56 ?), (r13v74 java.lang.String) binds: [B:555:0x0aee, B:491:0x09eb] */
    /* JADX WARN: Type inference failed for: r13v56, assign insn: PHI: (r13v56 ?) = (r13v57 java.lang.String), (r13v60 java.lang.String) binds: [B:554:0x0aea, B:544:0x0ac5] */
    /* JADX WARN: Type inference failed for: r52v64, assign insn: PHI: (r52v64 ?) = (r52v65 java.lang.String), (r52v66 ?) binds: [B:550:0x0ad2, B:542:0x0ab8] */
    /* JADX WARN: Type inference failed for: r15v74, types: [atbq], assign insn: 0x050d: MOVE  (r15v74 ? I:?[OBJECT, ARRAY]) = (r61v0 'this' atbq A[THIS]) */
    /* JADX WARN: Type inference failed for: r52v66, assign insn: 0x0abf: MOVE  (r52v66 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v73, types: [atcv], assign insn: PHI: (r14v73 ?) = (r14v118 ?), (r14v181 ?) binds: [B:255:0x0549, B:246:?] */
    /* JADX WARN: Type inference failed for: r14v75, types: [java.lang.String], assign insn: 0x0552: INVOKE  (r14v75 ? I:java.lang.String) =  type: STATIC call: atxw.a():java.lang.String */
    /* JADX WARN: Type inference failed for: r13v61, assign insn: PHI: (r13v61 ?) = (r13v62 java.lang.String), (r13v66 java.lang.String) binds: [B:534:0x0aa2, B:527:0x0a8c] */
    /* JADX WARN: Type inference failed for: r15v75, types: [atds], assign insn: 0x055a: INVOKE  (r15v75 ? I:atds) = (r13v65 askf) type: STATIC call: atds.a(askf):atds */
    /* JADX WARN: Type inference failed for: r15v78, types: [java.lang.Object, btiw], assign insn: 0x056b: INVOKE  (r15v78 ? I:btiw) = (r15v77 athh), (r13v65 askf) type: VIRTUAL call: athh.a(askf):btiw */
    /* JADX WARN: Type inference failed for: r52v71, assign insn: PHI: (r52v71 ?) = (r52v72 ?), (r52v93 ?), (r52v95 ?) binds: [B:496:0x0a1c, B:337:0x06bc, B:282:0x05aa] */
    /* JADX WARN: Type inference failed for: r15v80, assign insn: PHI: (r15v80 ?) = (r15v110 ?), (r15v133 ?), (r15v135 ?) binds: [B:282:0x05aa, B:496:0x0a1c, B:337:0x06bc] */
    /* JADX WARN: Type inference failed for: r14v84, assign insn: PHI: (r14v84 ?) = (r14v113 ?), (r14v177 ?), (r14v179 ?) binds: [B:282:0x05aa, B:496:0x0a1c, B:337:0x06bc] */
    /* JADX WARN: Type inference failed for: r13v70, assign insn: PHI: (r13v70 ?) = (r13v100 ?), (r13v132 ?), (r13v133 ?) binds: [B:282:0x05aa, B:496:0x0a1c, B:337:0x06bc] */
    /* JADX WARN: Type inference failed for: r15v81, assign insn: 0x0a2e: MOVE  (r15v81 ? I:?[OBJECT, ARRAY]) = (r9v25 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v72, assign insn: PHI: (r52v72 ?) = (r52v73 java.lang.String), (r52v79 ?), (r52v91 ?) binds: [B:495:0x0a09, B:482:0x09a3, B:473:0x0967] */
    /* JADX WARN: Type inference failed for: r13v71, assign insn: PHI: (r13v71 ?) = (r13v72 java.lang.String), (r13v79 java.lang.String), (r13v93 ?) binds: [B:495:0x0a09, B:482:0x09a3, B:473:0x0967] */
    /* JADX WARN: Type inference failed for: r52v79, assign insn: 0x09ae: MOVE  (r52v79 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v82, assign insn: PHI: (r13v82 ?) = (r13v83 java.lang.String), (r13v92 ?) binds: [B:459:0x091a, B:461:0x092b] */
    /* JADX WARN: Type inference failed for: r52v86, assign insn: 0x090d: MOVE  (r52v86 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v87, assign insn: 0x08fb: MOVE  (r52v87 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v88, assign insn: 0x08e7: MOVE  (r52v88 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v104, assign insn: 0x08a1: MOVE  (r14v104 ? I:?[OBJECT, ARRAY]) = (r8v24 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v91, assign insn: 0x08a7: MOVE  (r13v91 ? I:?[OBJECT, ARRAY]) = (r23v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v89, assign insn: 0x08a8: MOVE  (r52v89 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v101, assign insn: 0x08b5: MOVE  (r15v101 ? I:?[OBJECT, ARRAY]) = (r12v71 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v92, assign insn: 0x092e: MOVE  (r13v92 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v93, assign insn: 0x07e1: MOVE  (r13v93 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v91, assign insn: 0x07e9: MOVE  (r52v91 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v93, assign insn: PHI: (r52v93 ?) = (r52v94 java.lang.Object), (r52v125 java.lang.Object) binds: [B:336:0x06aa, B:462:0x093c] */
    /* JADX WARN: Type inference failed for: r13v95, assign insn: PHI: (r13v95 ?) = (r13v82 ?), (r13v96 java.lang.String) binds: [B:462:0x093c, B:336:0x06aa] */
    /* JADX WARN: Type inference failed for: r13v97, assign insn: 0x06a1: MOVE  (r13v97 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v113, assign insn: 0x05ad: MOVE  (r14v113 ? I:?[OBJECT, ARRAY]) = (r8v24 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v100, assign insn: 0x05ae: MOVE  (r13v100 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r15v110, assign insn: 0x05af: MOVE  (r15v110 ? I:?[OBJECT, ARRAY]) = (r10v15 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v95, assign insn: 0x05b8: MOVE  (r52v95 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v96, assign insn: 0x05a5: MOVE  (r52v96 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v102, assign insn: 0x059b: MOVE  (r13v102 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v97, assign insn: 0x058e: MOVE  (r52v97 ? I:?[OBJECT, ARRAY]) = (r33v5 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v118, assign insn: 0x0549: CONST  (r14v118 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v51, assign insn: PHI: (r32v51 ?) = (r32v56 ?), (r32v57 ?) binds: [B:193:0x0414, B:188:0x0404] */
    /* JADX WARN: Type inference failed for: r33v7, assign insn: PHI: (r33v7 ?) = (r33v5 java.lang.String), (r33v11 java.lang.String) binds: [B:254:0x0542, B:206:0x0469] */
    /* JADX WARN: Type inference failed for: r32v52, assign insn: PHI: (r32v52 ?) = (r32v50 ?), (r32v56 ?) binds: [B:254:0x0542, B:206:0x0469] */
    /* JADX WARN: Type inference failed for: r52v99, assign insn: 0x0477: MOVE  (r52v99 ? I:?[OBJECT, ARRAY]) = (r33v7 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r13v106, assign insn: 0x047d: MOVE  (r13v106 ? I:?[OBJECT, ARRAY]) = (r9v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r33v8, assign insn: PHI: (r33v8 ?) = (r33v5 java.lang.String), (r33v9 ?) binds: [B:332:0x068c, B:203:0x0458] */
    /* JADX WARN: Type inference failed for: r32v53, assign insn: PHI: (r32v53 ?) = (r32v50 ?), (r32v54 ?) binds: [B:332:0x068c, B:203:0x0458] */
    /* JADX WARN: Type inference failed for: r52v100, assign insn: 0x0462: MOVE  (r52v100 ? I:?[OBJECT, ARRAY]) = (r33v8 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r33v9, assign insn: PHI: (r33v9 ?) = (r33v5 java.lang.String), (r33v10 ?) binds: [B:252:0x0538, B:202:0x0452] */
    /* JADX WARN: Type inference failed for: r32v54, assign insn: PHI: (r32v54 ?) = (r32v50 ?), (r32v55 ?) binds: [B:252:0x0538, B:202:0x0452] */
    /* JADX WARN: Type inference failed for: r33v10, assign insn: PHI: (r33v10 ?) = (r33v5 java.lang.String), (r33v5 java.lang.String), (r33v5 java.lang.String), (r33v11 java.lang.String) binds: [B:307:0x0600, B:308:?, B:273:0x0579, B:194:0x0416] */
    /* JADX WARN: Type inference failed for: r32v55, assign insn: PHI: (r32v55 ?) = (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v56 ?) binds: [B:307:0x0600, B:308:?, B:273:0x0579, B:194:0x0416] */
    /* JADX WARN: Type inference failed for: r32v56, assign insn: 0x040e: MOVE  (r32v56 ? I:?[OBJECT, ARRAY]) = (r15v39 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r33v12, assign insn: 0x0404: MOVE  (r33v12 ? I:?[OBJECT, ARRAY]) = (r14v40 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v57, assign insn: 0x0406: MOVE  (r32v57 ? I:?[OBJECT, ARRAY]) = (r15v39 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v58, assign insn: 0x03df: MOVE  (r32v58 ? I:?[OBJECT, ARRAY]) = (r15v39 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r32v59, assign insn: 0x0375: MOVE  (r32v59 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v60, assign insn: 0x035f: MOVE  (r32v60 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v61, assign insn: PHI: (r32v61 ?) = (r32v26 java.lang.String), (r32v63 ?) binds: [B:167:0x03af, B:141:0x030e] */
    /* JADX WARN: Type inference failed for: r32v62, assign insn: PHI: (r32v62 ?) = (r32v29 java.lang.String), (r32v50 ?), (r32v56 ?), (r32v67 ?) binds: [B:162:0x037f, B:250:0x0522, B:200:0x043b, B:134:0x02e0] */
    /* JADX WARN: Type inference failed for: r13v115, assign insn: 0x02e1: MOVE  (r13v115 ? I:?[OBJECT, ARRAY]) = (r9v36 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v63, assign insn: PHI: (r32v63 ?) = (r32v64 ?), (r32v74 ?) binds: [B:140:0x02fd, B:122:0x028a] */
    /* JADX WARN: Type inference failed for: r32v64, assign insn: 0x0304: MOVE  (r32v64 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v108, assign insn: PHI: (r52v108 ?) = (r52v109 java.lang.String), (r52v114 ?) binds: [B:137:0x02e5, B:103:0x0236] */
    /* JADX WARN: Type inference failed for: r32v65, assign insn: PHI: (r32v65 ?) = (r32v66 ?), (r32v77 ?) binds: [B:137:0x02e5, B:103:0x0236] */
    /* JADX WARN: Type inference failed for: r13v116, assign insn: PHI: (r13v116 ?) = (r13v117 java.lang.String), (r13v118 ?) binds: [B:137:0x02e5, B:103:0x0236] */
    /* JADX WARN: Type inference failed for: r32v66, assign insn: 0x02ed: MOVE  (r32v66 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v67, assign insn: PHI: (r32v67 ?) = (r32v68 ?), (r32v75 ?) binds: [B:133:0x02cc, B:120:0x0271] */
    /* JADX WARN: Type inference failed for: r32v68, assign insn: 0x02d5: MOVE  (r32v68 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v143, assign insn: 0x02c7: MOVE  (r14v143 ? I:?[OBJECT, ARRAY]) = (r23v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v69, assign insn: PHI: (r32v69 ?) = (r32v70 ?), (r32v76 ?) binds: [B:128:0x02a9, B:51:0x0118] */
    /* JADX WARN: Type inference failed for: r32v70, assign insn: PHI: (r32v70 ?) = (r32v71 ?), (r32v76 ?) binds: [B:127:0x02a7, B:118:0x026e] */
    /* JADX WARN: Type inference failed for: r32v71, assign insn: PHI: (r32v71 ?) = (r32v72 ?), (r32v76 ?), (r32v76 ?) binds: [B:126:0x02a3, B:106:0x024e, B:104:0x024a] */
    /* JADX WARN: Type inference failed for: r32v72, assign insn: PHI: (r32v72 ?) = (r32v1 ?), (r32v73 ?) binds: [B:125:0x02a1, B:123:0x029e] */
    /* JADX WARN: Type inference failed for: r32v73, assign insn: PHI: (r32v73 ?) = (r32v1 ?), (r32v76 ?), (r32v76 ?), (r32v76 ?) binds: [B:29:0x00cc, B:52:0x0121, B:60:0x0145, B:61:?] */
    /* JADX WARN: Type inference failed for: r32v74, assign insn: 0x0290: MOVE  (r32v74 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v75, assign insn: 0x0279: MOVE  (r32v75 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v76, types: [java.lang.String[]], assign insn: 0x00d5: INVOKE  (r32v76 ? I:java.lang.String[]) = (r2v207 java.lang.String), (r13v2 askf) type: STATIC call: atdg.a(java.lang.String, askf):java.lang.String[] */
    /* JADX WARN: Type inference failed for: r14v155, assign insn: 0x0256: MOVE  (r14v155 ? I:?[OBJECT, ARRAY]) = (r23v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v118, assign insn: 0x023a: MOVE  (r13v118 ? I:?[OBJECT, ARRAY]) = (r9v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r32v77, assign insn: 0x023c: MOVE  (r32v77 ? I:?[OBJECT, ARRAY]) = (r15v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v114, assign insn: 0x0242: MOVE  (r52v114 ? I:?[OBJECT, ARRAY]) = (r23v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v120, assign insn: ?: MOVE  (r13v120 ?) = (r13v10 ?) */
    /* JADX WARN: Type inference failed for: r13v121, assign insn: ?: MOVE  (r13v121 ?) = (r13v12 ?) */
    /* JADX WARN: Type inference failed for: r13v122, assign insn: ?: MOVE  (r13v122 ?) = (r13v13 ?) */
    /* JADX WARN: Type inference failed for: r13v123, assign insn: ?: MOVE  (r13v123 ?) = (r13v15 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v119, assign insn: ?: MOVE  (r52v119 ?) = (r52v22 ?) */
    /* JADX WARN: Type inference failed for: r14v170, assign insn: ?: MOVE  (r14v170 ?) = (r14v51 ?) */
    /* JADX WARN: Type inference failed for: r13v125, assign insn: ?: MOVE  (r13v125 ?) = (r13v45 ?) */
    /* JADX WARN: Type inference failed for: r52v122, assign insn: ?: MOVE  (r52v122 ?) = (r52v52 ?) */
    /* JADX WARN: Type inference failed for: r15v129, assign insn: ?: MOVE  (r15v129 ?) = (r15v60 ?) */
    /* JADX WARN: Type inference failed for: r14v171, assign insn: ?: MOVE  (r14v171 ?) = (r14v52 ?) */
    /* JADX WARN: Type inference failed for: r13v126, assign insn: ?: MOVE  (r13v126 ?) = (r13v46 ?) */
    /* JADX WARN: Type inference failed for: r15v130, assign insn: ?: MOVE  (r15v130 ?) = (r15v61 ?) */
    /* JADX WARN: Type inference failed for: r14v172, assign insn: ?: MOVE  (r14v172 ?) = (r14v53 ?) */
    /* JADX WARN: Type inference failed for: r13v127, assign insn: ?: MOVE  (r13v127 ?) = (r13v47 ?) */
    /* JADX WARN: Type inference failed for: r14v173, assign insn: ?: MOVE  (r14v173 ?) = (r14v54 ?) */
    /* JADX WARN: Type inference failed for: r13v128, assign insn: ?: MOVE  (r13v128 ?) = (r13v48 ?) */
    /* JADX WARN: Type inference failed for: r15v131, assign insn: ?: MOVE  (r15v131 ?) = (r15v64 ?) */
    /* JADX WARN: Type inference failed for: r14v174, assign insn: ?: MOVE  (r14v174 ?) = (r14v55 ?) */
    /* JADX WARN: Type inference failed for: r13v129, assign insn: ?: MOVE  (r13v129 ?) = (r13v49 ?) */
    /* JADX WARN: Type inference failed for: r14v175, assign insn: ?: MOVE  (r14v175 ?) = (r14v56 ?) */
    /* JADX WARN: Type inference failed for: r13v130, assign insn: ?: MOVE  (r13v130 ?) = (r13v50 ?) */
    /* JADX WARN: Type inference failed for: r15v132, assign insn: ?: MOVE  (r15v132 ?) = (r15v67 ?) */
    /* JADX WARN: Type inference failed for: r14v176, assign insn: ?: MOVE  (r14v176 ?) = (r14v57 ?) */
    /* JADX WARN: Type inference failed for: r13v131, assign insn: ?: MOVE  (r13v131 ?) = (r13v51 ?) */
    /* JADX WARN: Type inference failed for: r15v133, assign insn: ?: MOVE  (r15v133 ?) = (r15v82 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v177, assign insn: ?: MOVE  (r14v177 ?) = (r14v85 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v132, assign insn: ?: MOVE  (r13v132 ?) = (r13v71 ?) */
    /* JADX WARN: Type inference failed for: r15v135, assign insn: ?: MOVE  (r15v135 ?) = (r15v105 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v179, assign insn: ?: MOVE  (r14v179 ?) = (r14v108 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v133, assign insn: ?: MOVE  (r13v133 ?) = (r13v95 ?) */
    /* JADX WARN: Type inference failed for: r14v180, assign insn: ?: MOVE  (r14v180 ?) = (r14v116 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v134, assign insn: ?: MOVE  (r13v134 ?) = (r13v103 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r14v181, assign insn: ?: MOVE  (r14v181 ?) = (r14v122 atcv) */
    /* JADX WARN: Type inference failed for: r14v182, assign insn: ?: MOVE  (r14v182 ?) = (r14v123 java.lang.String) */
    /* JADX WARN: Type inference failed for: r14v183, assign insn: ?: MOVE  (r14v183 ?) = (r14v124 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v135, assign insn: ?: MOVE  (r13v135 ?) = (r13v107 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r14v185, assign insn: ?: MOVE  (r14v185 ?) = (r14v135 java.lang.String) */
    /* JADX WARN: Type inference failed for: r52v126, assign insn: ?: MOVE  (r52v126 ?) = (r52v108 ?) */
    /* JADX WARN: Type inference failed for: r14v186, assign insn: ?: MOVE  (r14v186 ?) = (r14v138 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v137, assign insn: ?: MOVE  (r13v137 ?) = (r13v116 ?) */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atbm.a(askf, java.lang.String, long, boolean):byda
     arg types: [askf, java.lang.String, long, int]
     candidates:
      atbm.a(android.database.sqlite.SQLiteDatabase, askf, java.lang.String, com.google.android.gms.tapandpay.security.StorageKey):atda
      atbm.a(askf, java.lang.String, java.lang.String[], java.lang.String):boolean
      atbm.a(askf, java.lang.String, long, boolean):byda */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0270, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0271, code lost:
        r1 = r0;
        r14 = r8;
        r34 = r10;
        r25 = r12;
        r37 = r13;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r52 = r23;
        r43 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0287, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x028a, code lost:
        r2 = r0;
        r14 = r8;
        r5 = r10;
        r4 = r13;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r52 = r23;
        r1 = r27;
        r3 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02cc, code lost:
        r43 = r1;
        r14 = r8;
        r34 = r10;
        r25 = r12;
        r37 = r13;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r52 = r23;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e0, code lost:
        r15 = r7;
        r52 = r52;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e5, code lost:
        r2 = r0;
        r46 = r3;
        r14 = r8;
        r13 = r9;
        r5 = r10;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r52 = r23;
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02fd, code lost:
        r2 = r0;
        r3 = r1;
        r14 = r8;
        r5 = r10;
        r4 = r13;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r52 = r23;
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x030e, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030f, code lost:
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x036c, code lost:
        r2 = r0;
        r46 = r5;
        r13 = r9;
        r5 = r10;
        r52 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x037e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037f, code lost:
        r1 = r0;
        r34 = r10;
        r25 = r12;
        r37 = r13;
        r52 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r43 = r36;
        r15 = r7;
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03af, code lost:
        r2 = r0;
        r5 = r10;
        r4 = r13;
        r52 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r1 = r27;
        r3 = r36;
        r15 = r7;
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03d9, code lost:
        r2 = r1;
        r13 = r9;
        r5 = r10;
        r4 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r1 = r27;
        r15 = r7;
        r14 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x043a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x043b, code lost:
        r1 = r0;
        r14 = r8;
        r34 = r10;
        r25 = r12;
        r37 = r13;
        r48 = r19;
        r44 = r21;
        r15 = r23;
        r52 = r33;
        r43 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0451, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0452, code lost:
        r2 = r0;
        r14 = r8;
        r13 = r9;
        r5 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0466, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0469, code lost:
        r2 = r0;
        r14 = r8;
        r5 = r10;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x046f, code lost:
        r48 = r19;
        r44 = r21;
        r15 = r23;
        r1 = r27;
        r52 = r33;
        r3 = r36;
        r6 = 100;
        r13 = r9;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x067c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x067d, code lost:
        r1 = r0;
        r15 = r7;
        r14 = r8;
        r13 = r9;
        r34 = r10;
        r48 = r19;
        r44 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x068b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x068c, code lost:
        r2 = r0;
        r15 = r7;
        r14 = r8;
        r13 = r9;
        r5 = r10;
        r48 = r19;
        r44 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0699, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x069c, code lost:
        r2 = r0;
        r15 = r7;
        r14 = r8;
        r13 = r9;
        r5 = r10;
        r48 = r19;
        r44 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06aa, code lost:
        r1 = r0;
        r50 = r3;
        r14 = r8;
        r13 = r9;
        r15 = r10;
        r48 = r19;
        r44 = r21;
        r46 = r30;
        r52 = r33;
        r43 = r36;
        r6 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        if (r1 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        if (r1 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0919, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x091a, code lost:
        r50 = r3;
        r14 = r8;
        r13 = r9;
        r15 = r10;
        r48 = r19;
        r44 = r21;
        r46 = r30;
        r52 = r33;
        r43 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x09db, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x09dc, code lost:
        r14 = r8;
        r13 = r9;
        r48 = r19;
        r44 = r21;
        r52 = r33;
        r43 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x09ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x09eb, code lost:
        r14 = r8;
        r13 = r9;
        r48 = r19;
        r44 = r21;
        r46 = r30;
        r52 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x09f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x09fc, code lost:
        r14 = r8;
        r13 = r9;
        r48 = r19;
        r44 = r21;
        r52 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a08, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a09, code lost:
        r50 = r3;
        r14 = r8;
        r13 = r9;
        r15 = r10;
        r48 = r19;
        r44 = r21;
        r9 = r23;
        r46 = r30;
        r52 = r33;
        r43 = r36;
        r6 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0114, code lost:
        if (r1 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:?, code lost:
        r11 = m75405a(r1, r11);
        r34 = r15;
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0a3a, code lost:
        throw new p000.atcz("Device fails attestation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        r1 = r0;
        r30 = r3;
        r28 = r5;
        r14 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0a83, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0a84, code lost:
        r14 = r8;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0a89, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0a8b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0a8c, code lost:
        r14 = r8;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0a91, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0a92, code lost:
        r14 = r8;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0a95, code lost:
        r48 = r19;
        r44 = r21;
        r52 = r33;
        r43 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0a9f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0aa1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0aa2, code lost:
        r14 = r8;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0aa5, code lost:
        r48 = r19;
        r44 = r21;
        r52 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0ab0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0ab4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0ab5, code lost:
        r14 = r8;
        r25 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0ac4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0ac5, code lost:
        r14 = r8;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0ac9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0acb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0acc, code lost:
        r14 = r8;
        r37 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0ae9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0aea, code lost:
        r14 = r8;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0aee, code lost:
        r48 = r19;
        r44 = r21;
        r46 = r30;
        r52 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0af6, code lost:
        r2 = r0;
        r5 = r10;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0ba1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0ba8, code lost:
        throw new p000.atcz(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0ba9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0bb0, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0bb1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0bb2, code lost:
        r11 = m75405a(r0, r11);
        r34 = r15;
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0bbf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0bc8, code lost:
        throw new p000.atcz("Error calling AcknowledgePaymentBundle", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0bc9, code lost:
        r0 = e;
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0bd0, code lost:
        r0 = e;
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0bd8, code lost:
        r0 = e;
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0bda, code lost:
        r0 = e;
        r52 = r52;
        r15 = r15;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0c98, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0ca4, code lost:
        throw new p000.atcz("Error calling GetPaymentBundle", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0e18, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0e19, code lost:
        r34 = r10;
        r25 = r12;
        r37 = r13;
        r52 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r43 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0e2a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0e2b, code lost:
        r13 = r9;
        r52 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r46 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0e39, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0e3c, code lost:
        r37 = r13;
        r52 = r14;
        r32 = r15;
        r48 = r19;
        r44 = r21;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0edf, code lost:
        r0 = e;
        r52 = r52;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x0f17, code lost:
        r25.mo49855b(r3, 6);
        r1 = r27;
        r5 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0f26, code lost:
        r2 = m75402a(r1);
        r1 = r27;
        r5 = r34;
        r4 = r52;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0264 A[SYNTHETIC, Splitter:B:111:0x0264] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0270 A[ExcHandler: RuntimeException (r0v151 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:52:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0287 A[ExcHandler: atcz | aths (r0v150 'e' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r34 10  PHI: (r34v79 java.lang.String) = (r34v1 java.lang.String), (r34v83 java.lang.String), (r34v89 java.lang.String), (r34v92 java.lang.String), (r34v94 java.lang.String), (r34v97 java.lang.String), (r34v100 java.lang.String), (r34v102 java.lang.String), (r34v105 java.lang.String), (r34v107 java.lang.String) binds: [B:29:0x00cc, B:52:0x0121, B:60:0x0145, B:61:?, B:63:0x0149, B:66:0x0155, B:57:0x012d, B:58:?, B:40:0x00fe, B:41:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:29:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02e4 A[ExcHandler: atdb (r0v143 'e' atdb A[CUSTOM_DECLARE]), PHI: r34 10  PHI: (r34v71 java.lang.String) = (r34v1 java.lang.String), (r34v1 java.lang.String), (r34v84 java.lang.String), (r34v90 java.lang.String), (r34v93 java.lang.String), (r34v95 java.lang.String), (r34v101 java.lang.String), (r34v103 java.lang.String), (r34v106 java.lang.String), (r34v108 java.lang.String) binds: [B:20:0x0097, B:29:0x00cc, B:52:0x0121, B:60:0x0145, B:61:?, B:63:0x0149, B:57:0x012d, B:58:?, B:40:0x00fe, B:41:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:20:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0324 A[SYNTHETIC, Splitter:B:147:0x0324] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x037e A[ExcHandler: RuntimeException (r0v27 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), PHI: r14 r36 10  PHI: (r14v29 java.lang.String) = (r14v31 java.lang.String), (r14v31 java.lang.String), (r14v31 java.lang.String), (r14v144 java.lang.String), (r14v144 java.lang.String) binds: [B:147:0x0324, B:156:0x0356, B:157:?, B:129:0x02aa, B:130:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r36v1 java.lang.String) = (r36v2 java.lang.String), (r36v2 java.lang.String), (r36v2 java.lang.String), (r36v14 java.lang.String), (r36v14 java.lang.String) binds: [B:147:0x0324, B:156:0x0356, B:157:?, B:129:0x02aa, B:130:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:129:0x02aa] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03ac A[ExcHandler: atcz | aths (r0v25 'e' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r14 r34 r36 10  PHI: (r14v25 java.lang.String) = (r14v31 java.lang.String), (r14v31 java.lang.String), (r14v31 java.lang.String), (r14v144 java.lang.String), (r14v144 java.lang.String) binds: [B:147:0x0324, B:156:0x0356, B:157:?, B:129:0x02aa, B:130:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r34v24 java.lang.String) = (r34v28 java.lang.String), (r34v28 java.lang.String), (r34v28 java.lang.String), (r34v74 java.lang.String), (r34v74 java.lang.String) binds: [B:147:0x0324, B:156:0x0356, B:157:?, B:129:0x02aa, B:130:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r36v0 java.lang.String) = (r36v2 java.lang.String), (r36v2 java.lang.String), (r36v2 java.lang.String), (r36v14 java.lang.String), (r36v14 java.lang.String) binds: [B:147:0x0324, B:156:0x0356, B:157:?, B:129:0x02aa, B:130:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:129:0x02aa] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03d6 A[Catch:{ aths -> 0x0e3b, atcz | aths -> 0x0e39, atdb -> 0x0e2a, RuntimeException -> 0x0e18 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0451 A[ExcHandler: atdb (r0v138 'e' atdb A[CUSTOM_DECLARE]), PHI: r25 r32 r33 r37 10  PHI: (r25v67 atds) = (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v33 atds) binds: [B:307:0x0600, B:308:?, B:273:0x0579, B:194:0x0416] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r32v55 ?) = (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v56 ?) binds: [B:307:0x0600, B:308:?, B:273:0x0579, B:194:0x0416] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r33v10 ?) = (r33v5 java.lang.String), (r33v5 java.lang.String), (r33v5 java.lang.String), (r33v11 java.lang.String) binds: [B:307:0x0600, B:308:?, B:273:0x0579, B:194:0x0416] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v68 askf) = (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v34 askf) binds: [B:307:0x0600, B:308:?, B:273:0x0579, B:194:0x0416] A[DONT_GENERATE, DONT_INLINE], Splitter:B:194:0x0416] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04ff A[SYNTHETIC, Splitter:B:239:0x04ff] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05fa  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x067c A[ExcHandler: RuntimeException (r0v129 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), PHI: r7 10  PHI: (r7v21 java.lang.String) = (r7v12 java.lang.String), (r7v23 java.lang.String), (r7v23 java.lang.String), (r7v24 java.lang.String) binds: [B:400:0x07f4, B:316:0x0633, B:322:0x0645, B:310:0x060c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:310:0x060c] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x068b A[ExcHandler: atdb (r0v128 'e' atdb A[CUSTOM_DECLARE]), PHI: r7 10  PHI: (r7v20 java.lang.String) = (r7v12 java.lang.String), (r7v23 java.lang.String), (r7v23 java.lang.String), (r7v24 java.lang.String) binds: [B:400:0x07f4, B:316:0x0633, B:322:0x0645, B:310:0x060c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:310:0x060c] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x06a9 A[ExcHandler: atfh (r0v126 'e' atfh A[CUSTOM_DECLARE]), PHI: r7 10  PHI: (r7v18 java.lang.String) = (r7v12 java.lang.String), (r7v23 java.lang.String), (r7v23 java.lang.String), (r7v24 java.lang.String) binds: [B:400:0x07f4, B:316:0x0633, B:322:0x0645, B:310:0x060c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:310:0x060c] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x06bf A[ExcHandler: IOException (e java.io.IOException), PHI: r7 10  PHI: (r7v16 java.lang.String) = (r7v12 java.lang.String), (r7v23 java.lang.String), (r7v23 java.lang.String), (r7v24 java.lang.String) binds: [B:400:0x07f4, B:316:0x0633, B:322:0x0645, B:310:0x060c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:310:0x060c] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06d6  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06e7 A[Catch:{ IOException -> 0x09b7, atfh -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x06e8 A[Catch:{ IOException -> 0x09b7, atfh -> 0x09a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0726  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x076a  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0778  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0784  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x07a9  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x07b5  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07ce  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07de  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x07f4 A[SYNTHETIC, Splitter:B:400:0x07f4] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x07f7 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x07fa A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x07fd A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0800 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0803 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0806 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0809 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x080c A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x080f A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0812 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0815 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0818 A[Catch:{ IOException -> 0x06bf, atfh -> 0x06a9, atcz | aths -> 0x0699, atdb -> 0x068b, RuntimeException -> 0x067c }] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x081b A[SYNTHETIC, Splitter:B:414:0x081b] */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0821 A[Catch:{ IOException -> 0x093f, atfh -> 0x092a }] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0822 A[Catch:{ IOException -> 0x093f, atfh -> 0x092a }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x083e A[Catch:{ IOException -> 0x093f, atfh -> 0x092a }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x083f A[Catch:{ IOException -> 0x093f, atfh -> 0x092a }] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x084b A[Catch:{ IOException -> 0x093f, atfh -> 0x092a }] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x084c A[Catch:{ IOException -> 0x093f, atfh -> 0x092a }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0875 A[Catch:{ atcz | aths -> 0x0991, atdb -> 0x0980, RuntimeException -> 0x096d }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0877 A[Catch:{ atcz | aths -> 0x0991, atdb -> 0x0980, RuntimeException -> 0x096d }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x093f A[ExcHandler: IOException (e java.io.IOException), Splitter:B:414:0x081b] */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x09db A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:267:0x0571] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x09ea A[ExcHandler: atdb (e atdb), Splitter:B:267:0x0571] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x09f9 A[ExcHandler: atcz | aths (e java.lang.Throwable), Splitter:B:267:0x0571] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0a08 A[ExcHandler: atfh (e atfh), Splitter:B:267:0x0571] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0a23  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0a4c A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }, ExcHandler: IOException (e java.io.IOException), Splitter:B:267:0x0571] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0ab0 A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:242:0x050f] */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x0ac4 A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }, ExcHandler: atdb (e atdb), PHI: r25 r37 10  PHI: (r25v60 atds) = (r25v33 atds), (r25v33 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds) binds: [B:242:0x050f, B:243:?, B:257:0x054c, B:260:0x0558, B:261:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v62 askf) = (r37v34 askf), (r37v34 askf), (r37v34 askf), (r37v64 askf), (r37v64 askf) binds: [B:242:0x050f, B:243:?, B:257:0x054c, B:260:0x0558, B:261:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:242:0x050f] */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0ac9 A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }, ExcHandler: atcz (e atcz), PHI: r25 10  PHI: (r25v59 atds) = (r25v33 atds), (r25v33 atds), (r25v63 atds) binds: [B:242:0x050f, B:243:?, B:257:0x054c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:242:0x050f] */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0acb A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }, ExcHandler: aths (e aths), PHI: r25 10  PHI: (r25v58 atds) = (r25v33 atds), (r25v33 atds), (r25v63 atds) binds: [B:242:0x050f, B:243:?, B:257:0x054c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:242:0x050f] */
    /* JADX WARNING: Removed duplicated region for block: B:553:0x0ae9 A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }, ExcHandler: atdb (e atdb), PHI: r25 r37 10  PHI: (r25v53 atds) = (r25v33 atds), (r25v33 atds), (r25v63 atds) binds: [B:239:0x04ff, B:240:?, B:262:0x055a] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v57 askf) = (r37v34 askf), (r37v34 askf), (r37v64 askf) binds: [B:239:0x04ff, B:240:?, B:262:0x055a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:239:0x04ff] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0b11 A[Catch:{ IOException -> 0x0bbf, atfh -> 0x0bb1, atbk -> 0x0ba9, aths -> 0x0ba1, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9, aths -> 0x0bda, atcz -> 0x0bd8, atdb -> 0x0bd0, RuntimeException -> 0x0bc9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x0bc9 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r9 r13 r14 r15 r25 r37 r43 r44 r46 r48 r52 10  PHI: (r9v21 java.lang.String) = (r9v22 java.lang.String), (r9v22 java.lang.String), (r9v22 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v25 java.lang.String), (r9v25 java.lang.String) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r13v51 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v57 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v67 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r25v47 atds) = (r25v48 atds), (r25v48 atds), (r25v48 atds), (r25v33 atds), (r25v33 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v50 askf) = (r37v51 askf), (r37v51 askf), (r37v51 askf), (r37v34 askf), (r37v34 askf), (r37v34 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r43v47 java.lang.String) = (r43v48 java.lang.String), (r43v48 java.lang.String), (r43v48 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v56 java.lang.String), (r43v56 java.lang.String) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r44v57 long) = (r44v58 long), (r44v58 long), (r44v58 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v71 long), (r44v71 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r46v49 long) = (r46v50 long), (r46v50 long), (r46v50 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v55 long), (r46v55 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r48v57 long) = (r48v58 long), (r48v58 long), (r48v58 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v71 long), (r48v71 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r52v57 java.lang.String) = (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v71 ?), (r52v71 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE], Splitter:B:501:0x0a25] */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0bd0 A[ExcHandler: atdb (e atdb), PHI: r9 r13 r14 r15 r25 r37 r43 r44 r46 r48 r52 10  PHI: (r9v19 java.lang.String) = (r9v22 java.lang.String), (r9v22 java.lang.String), (r9v22 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v25 java.lang.String), (r9v25 java.lang.String) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r13v49 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v55 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v64 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r25v45 atds) = (r25v48 atds), (r25v48 atds), (r25v48 atds), (r25v33 atds), (r25v33 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v48 askf) = (r37v51 askf), (r37v51 askf), (r37v51 askf), (r37v34 askf), (r37v34 askf), (r37v34 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r43v45 java.lang.String) = (r43v48 java.lang.String), (r43v48 java.lang.String), (r43v48 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v56 java.lang.String), (r43v56 java.lang.String) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r44v55 long) = (r44v58 long), (r44v58 long), (r44v58 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v71 long), (r44v71 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r46v47 long) = (r46v50 long), (r46v50 long), (r46v50 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v55 long), (r46v55 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r48v55 long) = (r48v58 long), (r48v58 long), (r48v58 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v71 long), (r48v71 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r52v55 ?) = (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v71 ?), (r52v71 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE], Splitter:B:501:0x0a25] */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0bd8 A[ExcHandler: atcz (e atcz), PHI: r9 r13 r14 r15 r25 r37 r43 r44 r46 r48 r52 10  PHI: (r9v17 java.lang.String) = (r9v22 java.lang.String), (r9v22 java.lang.String), (r9v22 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v11 java.lang.String), (r9v25 java.lang.String), (r9v25 java.lang.String) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r13v47 ?) = (r13v52 ?), (r13v52 ?), (r13v52 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v36 ?), (r13v70 ?), (r13v70 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v53 ?) = (r14v58 ?), (r14v58 ?), (r14v58 ?), (r14v45 ?), (r14v45 ?), (r14v73 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v75 ?), (r14v84 ?), (r14v84 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v61 ?) = (r15v68 ?), (r15v68 ?), (r15v68 ?), (r15v39 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v74 ?), (r15v75 ?), (r15v78 ?), (r15v80 ?), (r15v80 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r25v43 atds) = (r25v48 atds), (r25v48 atds), (r25v48 atds), (r25v33 atds), (r25v33 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds), (r25v63 atds) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v46 askf) = (r37v51 askf), (r37v51 askf), (r37v51 askf), (r37v34 askf), (r37v34 askf), (r37v34 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf), (r37v64 askf) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r43v43 java.lang.String) = (r43v48 java.lang.String), (r43v48 java.lang.String), (r43v48 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v33 java.lang.String), (r43v56 java.lang.String), (r43v56 java.lang.String) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r44v53 long) = (r44v58 long), (r44v58 long), (r44v58 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v39 long), (r44v71 long), (r44v71 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r46v45 long) = (r46v50 long), (r46v50 long), (r46v50 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v35 long), (r46v55 long), (r46v55 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r48v53 long) = (r48v58 long), (r48v58 long), (r48v58 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v39 long), (r48v71 long), (r48v71 long) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r52v53 ?) = (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v58 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v39 java.lang.String), (r52v71 ?), (r52v71 ?) binds: [B:564:0x0b36, B:566:0x0b65, B:574:0x0ba3, B:239:0x04ff, B:242:0x050f, B:257:0x054c, B:260:0x0558, B:262:0x055a, B:264:0x0566, B:267:0x0571, B:497:0x0a1d, B:501:0x0a25] A[DONT_GENERATE, DONT_INLINE], Splitter:B:501:0x0a25] */
    /* JADX WARNING: Removed duplicated region for block: B:592:0x0be8  */
    /* JADX WARNING: Removed duplicated region for block: B:625:0x0c98 A[Catch:{ atfh | IOException -> 0x0ea5, IOException -> 0x0d68, atfh -> 0x0d3a, IOException -> 0x0c98, atfh -> 0x0c82, atcz | aths -> 0x0ed2, atdb -> 0x0eca, RuntimeException -> 0x0edf }, ExcHandler: IOException (r0v49 'e' java.io.IOException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:595:0x0c0d] */
    /* JADX WARNING: Removed duplicated region for block: B:634:0x0cb9  */
    /* JADX WARNING: Removed duplicated region for block: B:678:0x0e18 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r7 r8 r9 r10 r12 r13 r14 r15 r19 r21 r36 r46 10  PHI: (r7v7 java.lang.String) = (r7v1 java.lang.String), (r7v1 java.lang.String), (r7v8 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r8v23 java.lang.String) = (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v24 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r9v10 java.lang.String) = (r9v1 java.lang.String), (r9v1 java.lang.String), (r9v11 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r10v14 java.lang.String) = (r10v1 java.lang.String), (r10v1 java.lang.String), (r10v15 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r12v12 atds) = (r12v2 atds), (r12v2 atds), (r12v14 atds) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r13v34 askf) = (r13v2 askf), (r13v2 askf), (r13v36 ?) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v39 java.lang.String) = (r14v31 java.lang.String), (r14v31 java.lang.String), (r14v40 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v38 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v39 ?) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r19v3 long) = (r19v0 long), (r19v0 long), (r19v4 long) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r21v3 long) = (r21v0 long), (r21v0 long), (r21v4 long) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r36v9 java.lang.String) = (r36v2 java.lang.String), (r36v2 java.lang.String), (r36v10 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r46v33 long) = (r46v1 long), (r46v1 long), (r46v35 long) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE], Splitter:B:144:0x031a] */
    /* JADX WARNING: Removed duplicated region for block: B:682:0x0e39 A[ExcHandler: atcz | aths (e java.lang.Throwable), PHI: r7 r8 r9 r10 r13 r14 r15 r19 r21 r25 r34 r36 r43 r46 10  PHI: (r7v5 java.lang.String) = (r7v1 java.lang.String), (r7v1 java.lang.String), (r7v8 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r8v21 java.lang.String) = (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v24 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r9v8 java.lang.String) = (r9v1 java.lang.String), (r9v1 java.lang.String), (r9v11 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r10v12 java.lang.String) = (r10v1 java.lang.String), (r10v1 java.lang.String), (r10v15 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r13v32 askf) = (r13v2 askf), (r13v2 askf), (r13v36 ?) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v37 java.lang.String) = (r14v31 java.lang.String), (r14v31 java.lang.String), (r14v40 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v35 java.lang.String) = (r15v1 java.lang.String), (r15v1 java.lang.String), (r15v39 ?) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r19v1 long) = (r19v0 long), (r19v0 long), (r19v4 long) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r21v1 long) = (r21v0 long), (r21v0 long), (r21v4 long) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r25v30 atds) = (r25v1 atds), (r25v1 atds), (r25v33 atds) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r34v34 java.lang.String) = (r34v28 java.lang.String), (r34v28 java.lang.String), (r34v37 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r36v8 java.lang.String) = (r36v2 java.lang.String), (r36v2 java.lang.String), (r36v10 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r43v30 java.lang.String) = (r43v1 java.lang.String), (r43v1 java.lang.String), (r43v33 java.lang.String) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r46v31 long) = (r46v1 long), (r46v1 long), (r46v35 long) binds: [B:144:0x031a, B:170:0x03c8, B:174:0x03cf] A[DONT_GENERATE, DONT_INLINE], Splitter:B:144:0x031a] */
    /* JADX WARNING: Removed duplicated region for block: B:719:0x0edf A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r13 r14 r15 r25 r27 r32 r34 r37 r43 r44 r46 r48 r52 10  PHI: (r13v8 ?) = (r13v14 java.lang.String), (r13v14 java.lang.String), (r13v14 java.lang.String), (r13v36 ?), (r13v40 ?), (r13v40 ?), (r13v43 ?), (r13v43 ?), (r13v44 ?), (r13v44 ?), (r13v44 ?), (r13v36 ?) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v8 java.lang.String) = (r14v14 java.lang.String), (r14v14 java.lang.String), (r14v14 java.lang.String), (r14v40 java.lang.String), (r14v46 java.lang.String), (r14v46 java.lang.String), (r14v49 java.lang.String), (r14v49 java.lang.String), (r14v50 java.lang.String), (r14v50 java.lang.String), (r14v50 java.lang.String), (r14v40 java.lang.String) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r15v8 java.lang.String) = (r15v14 java.lang.String), (r15v14 java.lang.String), (r15v14 java.lang.String), (r15v39 ?), (r15v47 ?), (r15v47 ?), (r15v50 ?), (r15v50 ?), (r15v51 ?), (r15v51 ?), (r15v57 ?), (r15v39 ?) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r25v5 atds) = (r25v11 atds), (r25v11 atds), (r25v11 atds), (r25v33 atds), (r25v37 atds), (r25v37 atds), (r25v39 atds), (r25v39 atds), (r25v40 atds), (r25v40 atds), (r25v40 atds), (r25v33 atds) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r27v1 java.lang.String) = (r27v7 java.lang.String), (r27v7 java.lang.String), (r27v7 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String), (r27v20 java.lang.String) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r32v5 ?) = (r32v11 ?), (r32v11 ?), (r32v11 ?), (r32v40 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v50 ?), (r32v56 ?) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r34v5 java.lang.String) = (r34v11 java.lang.String), (r34v11 java.lang.String), (r34v11 java.lang.String), (r34v37 java.lang.String), (r34v41 java.lang.String), (r34v41 java.lang.String), (r34v43 java.lang.String), (r34v43 java.lang.String), (r34v37 java.lang.String), (r34v37 java.lang.String), (r34v51 java.lang.String), (r34v37 java.lang.String) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r37v5 askf) = (r37v11 askf), (r37v11 askf), (r37v11 askf), (r37v34 askf), (r37v40 askf), (r37v40 askf), (r37v42 askf), (r37v42 askf), (r37v43 askf), (r37v43 askf), (r37v43 askf), (r37v34 askf) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r43v5 java.lang.String) = (r43v11 java.lang.String), (r43v11 java.lang.String), (r43v11 java.lang.String), (r43v33 java.lang.String), (r43v37 java.lang.String), (r43v37 java.lang.String), (r43v39 java.lang.String), (r43v39 java.lang.String), (r43v40 java.lang.String), (r43v40 java.lang.String), (r43v40 java.lang.String), (r43v33 java.lang.String) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r44v5 long) = (r44v11 long), (r44v11 long), (r44v11 long), (r44v39 long), (r44v47 long), (r44v47 long), (r44v49 long), (r44v49 long), (r44v50 long), (r44v50 long), (r44v50 long), (r44v39 long) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r46v5 long) = (r46v11 long), (r46v11 long), (r46v11 long), (r46v35 long), (r46v39 long), (r46v39 long), (r46v41 long), (r46v41 long), (r46v42 long), (r46v42 long), (r46v42 long), (r46v35 long) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r48v5 long) = (r48v11 long), (r48v11 long), (r48v11 long), (r48v39 long), (r48v47 long), (r48v47 long), (r48v49 long), (r48v49 long), (r48v50 long), (r48v50 long), (r48v50 long), (r48v39 long) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r52v5 java.lang.String) = (r52v11 java.lang.String), (r52v11 java.lang.String), (r52v11 java.lang.String), (r52v39 java.lang.String), (r52v47 java.lang.String), (r52v47 java.lang.String), (r52v49 java.lang.String), (r52v49 java.lang.String), (r52v50 java.lang.String), (r52v50 java.lang.String), (r52v50 java.lang.String), (r52v39 java.lang.String) binds: [B:708:0x0ec2, B:709:?, B:711:0x0ec6, B:185:0x03f2, B:237:0x04fb, B:238:?, B:635:0x0cd6, B:649:0x0d3b, B:595:0x0c0d, B:598:0x0c12, B:618:0x0c7b, B:190:0x0410] A[DONT_GENERATE, DONT_INLINE], Splitter:B:237:0x04fb] */
    /* JADX WARNING: Removed duplicated region for block: B:725:0x0f17 A[Catch:{ atdb -> 0x0f2f, all -> 0x1096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:726:0x0f22 A[Catch:{ atdb -> 0x0f2f, all -> 0x1096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:778:0x0a31 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:779:0x026d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:792:0x04e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:793:0x03d5 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    public final void mo49783a(Context context, String str) {
        Throwable th;
        ReentrantLock reentrantLock;
        long j;
        long j2;
        String str2;
        String str3;
        String str4;
        Object obj;
        long j3;
        long j4;
        long j5;
        String str5;
        askf askf;
        String str6;
        String str7;
        atds atds;
        String str8;
        String str9;
        String str10;
        atcs atcs;
        String str11;
        String str12;
        long j6;
        askf askf2;
        String str13;
        Throwable th2;
        atdb atdb;
        String str14;
        RuntimeException runtimeException;
        byda a;
        String str15;
        String str16;
        atdb atdb2;
        String str17;
        String str18;
        long j7;
        long j8;
        String str19;
        String str20;
        String str21;
        Throwable th3;
        String str22;
        String str23;
        String str24;
        String str25;
        atdb atdb3;
        String str26;
        long j9;
        long j10;
        long j11;
        String str27;
        String str28;
        ? r32;
        String str29;
        String str30;
        long j12;
        long j13;
        String str31;
        askf askf3;
        String str32;
        atds atds2;
        String str33;
        String str34;
        ? r322;
        atda a2;
        String str35;
        long j14;
        long j15;
        String str36;
        Throwable th4;
        String str37;
        String str38;
        long j16;
        long j17;
        String str39;
        String str40;
        askf askf4;
        String str41;
        long j18;
        long j19;
        atcs a3;
        int i;
        String str42;
        String str43;
        char c;
        long j20;
        int i2;
        String str44;
        atda atda;
        String str45;
        String str46;
        long j21;
        long j22;
        String str47;
        String str48;
        askf askf5;
        String str49;
        askf askf6;
        askf askf7;
        atfh atfh;
        Object obj2;
        long j23;
        long j24;
        long j25;
        String str50;
        String str51;
        String str52;
        String str53;
        long j26;
        long j27;
        long j28;
        long j29;
        String str54;
        String str55;
        askf askf8;
        btmd btmd;
        char c2;
        String str56;
        int i3;
        btlj btlj;
        String str57;
        char c3;
        btoa btoa;
        btlr btlr;
        btlr btlr2;
        String str58;
        String str59;
        String str60;
        String str61;
        ? r14;
        ? r142;
        long j30;
        long j31;
        Throwable th5;
        bngm bngm;
        asqs asqs;
        Set<String> set;
        SQLiteDatabase a4;
        Context context2 = context;
        String str62 = str;
        String str63 = "Bundle gone while recording error";
        String str64 = "supported_aids";
        String str65 = "c";
        String str66 = "b";
        String str67 = "a";
        String str68 = "atbq";
        String str69 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        if (f90022f.tryLock()) {
            try {
                bnsl bnsl = (bnsl) f90017a.mo68390d();
                bnsl.mo68432a(str68, str67, 173, str69);
                bnsl.mo68405a("Maintaining payment bundles");
                if (asit.m74179a(asjm.m74238a(context), context2, str62, asko.m74292a(context).mo49214a())) {
                    j = Long.MAX_VALUE;
                    j2 = Long.MAX_VALUE;
                    str12 = str64;
                    for (Pair pair : mo49781a().mo49780b(context2, str62)) {
                        str4 = (askf) pair.first;
                        String str70 = (String) pair.second;
                        long j32 = j2;
                        long currentTimeMillis = System.currentTimeMillis();
                        long j33 = j;
                        String str71 = str65;
                        try {
                            long millis = TimeUnit.DAYS.toMillis(100) + currentTimeMillis;
                            atds a5 = atds.m75666a(str4);
                            mo49781a();
                            try {
                                mo49787b().mo50002b(str4);
                                try {
                                    a2 = atbm.m75384a(str4, str70);
                                    str14 = str63;
                                    if (cgwd.m147195c()) {
                                        try {
                                            if (cgwd.m147194b().equals("REGISTRATION_MODE_DISABLED")) {
                                                str35 = str70;
                                                j14 = millis;
                                                j15 = currentTimeMillis;
                                                str8 = str71;
                                            } else if (a2 == null) {
                                                bnsl bnsl2 = (bnsl) f90017a.mo68388c();
                                                bnsl2.mo68432a(str68, str67, 1092, str69);
                                                bnsl2.mo68405a("Token is null");
                                                str35 = str70;
                                                j14 = millis;
                                                j15 = currentTimeMillis;
                                                str8 = str71;
                                            } else {
                                                srn srn = atdg.f90116a;
                                                try {
                                                    String str72 = a2.f90102c;
                                                    SQLiteDatabase a6 = atdg.m75596a(str4.f89126d);
                                                    str35 = str70;
                                                    try {
                                                        str7 = atdg.m75598a(str72, str4);
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        str6 = null;
                                                        Cursor query = a6.query("PaymentBundles", new String[]{str2}, "bundle_id = ? AND account_id = ? AND environment = ?", str7, null, null, null);
                                                        try {
                                                            if (query.moveToNext()) {
                                                                try {
                                                                    byte[] blob = query.getBlob(0);
                                                                    if (blob != null) {
                                                                        bngm = bnic.m109495a((Collection) atdg.m75597a(blob).f165758a);
                                                                    } else {
                                                                        bngm = bnon.f131923a;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th5 = th6;
                                                                    j14 = millis;
                                                                    j15 = currentTimeMillis;
                                                                    str8 = str71;
                                                                    if (query == null) {
                                                                        try {
                                                                            query.close();
                                                                        } catch (Throwable th7) {
                                                                            bqye.m113761a(th5, th7);
                                                                        }
                                                                    }
                                                                    throw th5;
                                                                }
                                                            } else {
                                                                bngm = bnon.f131923a;
                                                            }
                                                            query.close();
                                                            if (bngm.isEmpty()) {
                                                                String str73 = a2.f90102c;
                                                                atcv atcv = a2.f90108i;
                                                                if (atcv == null) {
                                                                    bnsl bnsl3 = (bnsl) f90017a.mo68387b();
                                                                    bnsl3.mo68432a(str68, str3, 1063, str69);
                                                                    bnsl3.mo68405a("Bundle adapter not set");
                                                                    j30 = millis;
                                                                    j31 = currentTimeMillis;
                                                                    asqs = null;
                                                                } else {
                                                                    j31 = currentTimeMillis;
                                                                    j30 = millis;
                                                                    asqs = atcv.mo49793a(str4, new aszu(str4.f89126d, aszu.m75260a(atcv.mo49805g()), new asqw()), a2.f90102c);
                                                                }
                                                                if (asqs == null) {
                                                                    bnsl bnsl4 = (bnsl) f90017a.mo68387b();
                                                                    str8 = str71;
                                                                    try {
                                                                        bnsl4.mo68432a(str68, str8, 1079, str69);
                                                                        bnsl4.mo68405a("Payment applet is null");
                                                                        set = bnon.f131923a;
                                                                    } catch (asks e) {
                                                                        e = e;
                                                                    } catch (Throwable th8) {
                                                                        Throwable th9 = th8;
                                                                        a4.endTransaction();
                                                                        throw th9;
                                                                    }
                                                                } else {
                                                                    str8 = str71;
                                                                    bnia bnia = new bnia();
                                                                    for (astc astc : asqs.mo49386a()) {
                                                                        bnia.mo67629b(astc.toString());
                                                                    }
                                                                    set = bnia.mo67751a();
                                                                }
                                                                if (set.isEmpty()) {
                                                                    bnsl bnsl5 = (bnsl) atdg.f90116a.mo68387b();
                                                                    bnsl5.mo68432a("atdg", str67, (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, str69);
                                                                    bnsl5.mo68405a("Received empty set of AIDs.");
                                                                } else {
                                                                    a4 = atdg.m75596a(str4.f89126d);
                                                                    a4.beginTransaction();
                                                                    bydb bydb = (bydb) bydc.f165756b.mo74144da();
                                                                    for (String str74 : set) {
                                                                        if (str74.isEmpty()) {
                                                                            bnsl bnsl6 = (bnsl) atdg.f90116a.mo68387b();
                                                                            bnsl6.mo68432a("atdg", str67, 115, str69);
                                                                            bnsl6.mo68405a("Received empty AID value.");
                                                                            a4.endTransaction();
                                                                        } else {
                                                                            bydb.mo74346a(str74);
                                                                        }
                                                                    }
                                                                    ContentValues contentValues = new ContentValues();
                                                                    contentValues.put(str2, ((bydc) bydb.mo74062i()).mo73642k());
                                                                    a4.update("PaymentBundles", contentValues, "bundle_id = ? AND account_id = ? AND environment = ?", atdg.m75598a(str73, str4));
                                                                    a4.setTransactionSuccessful();
                                                                    a4.endTransaction();
                                                                }
                                                                bnsl bnsl7 = (bnsl) f90017a.mo68388c();
                                                                bnsl7.mo68432a(str68, str67, 1104, str69);
                                                                bnsl7.mo68405a("Error setting supported AIDs");
                                                            } else {
                                                                j14 = millis;
                                                                j15 = currentTimeMillis;
                                                                str8 = str71;
                                                            }
                                                        } catch (Throwable th10) {
                                                            j14 = millis;
                                                            j15 = currentTimeMillis;
                                                            str8 = str71;
                                                            th5 = th10;
                                                            if (query == null) {
                                                            }
                                                            throw th5;
                                                        }
                                                    } catch (asks e2) {
                                                        e = e2;
                                                        str8 = str71;
                                                        asks asks = e;
                                                        try {
                                                            bnsl bnsl8 = (bnsl) f90017a.mo68387b();
                                                            bnsl8.mo68437a(asks);
                                                            bnsl8.mo68432a(str68, str67, 1108, str69);
                                                            bnsl8.mo68405a("Database exception when setting AIDs");
                                                            str41 = a2.f90102c;
                                                            if (a5.f90151a.mo49884c(str41)) {
                                                            }
                                                            j19 = j15;
                                                            a3 = m75400a(j19, a2);
                                                            i = 0;
                                                            while (true) {
                                                                j14 = j18;
                                                                if (j19 >= a3.f90092a) {
                                                                }
                                                                str3 = str4;
                                                                str68 = str8;
                                                                str69 = str2;
                                                                a5 = atds;
                                                                str2 = str7;
                                                                str67 = str6;
                                                                str4 = askf;
                                                                str35 = str5;
                                                                j33 = j5;
                                                                j18 = j4;
                                                                j32 = j3;
                                                                str8 = obj;
                                                                a3 = m75400a(j20, a2);
                                                                j19 = j20;
                                                                i = i2;
                                                            }
                                                            throw new atcz("Max amount of steps exceeded");
                                                        } catch (atcz | aths e3) {
                                                        } catch (atdb e4) {
                                                            atdb atdb4 = e4;
                                                            String str75 = str3;
                                                            String str76 = str67;
                                                            String str77 = str8;
                                                            ? r323 = str2;
                                                            long j34 = j32;
                                                            long j35 = j33;
                                                            String str78 = str14;
                                                            long j36 = j14;
                                                            str2 = str69;
                                                            str8 = str68;
                                                            bnsl bnsl9 = (bnsl) f90017a.mo68388c();
                                                            bnsl9.mo68437a(atdb);
                                                            bnsl9.mo68432a(str8, (String) str4, 257, str2);
                                                            bnsl9.mo68405a("Bundle gone while processing it");
                                                            atcs = new atcs(j4, j4);
                                                            str10 = obj;
                                                            str65 = str10;
                                                            str67 = str9;
                                                            j2 = Math.min(j3, atcs.f90092a);
                                                            str66 = str4;
                                                            str68 = str8;
                                                            str69 = str2;
                                                            str12 = str7;
                                                            str63 = str11;
                                                            j = Math.min(j5, atcs.f90093b);
                                                        } catch (RuntimeException e5) {
                                                        }
                                                    } catch (atcz | aths e6) {
                                                    } catch (atdb e7) {
                                                        atdb = e7;
                                                        String str79 = str68;
                                                        String str80 = str3;
                                                        str9 = str67;
                                                        ? r324 = str2;
                                                        long j37 = j32;
                                                        long j38 = j33;
                                                        String str81 = str71;
                                                        str11 = str14;
                                                        j4 = j30;
                                                        str2 = str69;
                                                        obj = str81;
                                                        str8 = str79;
                                                        str4 = str80;
                                                        bnsl bnsl92 = (bnsl) f90017a.mo68388c();
                                                        bnsl92.mo68437a(atdb);
                                                        bnsl92.mo68432a(str8, (String) str4, 257, str2);
                                                        bnsl92.mo68405a("Bundle gone while processing it");
                                                        atcs = new atcs(j4, j4);
                                                        str10 = obj;
                                                        str65 = str10;
                                                        str67 = str9;
                                                        j2 = Math.min(j3, atcs.f90092a);
                                                        str66 = str4;
                                                        str68 = str8;
                                                        str69 = str2;
                                                        str12 = str7;
                                                        str63 = str11;
                                                        j = Math.min(j5, atcs.f90093b);
                                                    } catch (RuntimeException e8) {
                                                    }
                                                } catch (asks e9) {
                                                    e = e9;
                                                    str35 = str70;
                                                    j30 = millis;
                                                    j31 = currentTimeMillis;
                                                    str8 = str71;
                                                    asks asks2 = e;
                                                    bnsl bnsl82 = (bnsl) f90017a.mo68387b();
                                                    bnsl82.mo68437a(asks2);
                                                    bnsl82.mo68432a(str68, str67, 1108, str69);
                                                    bnsl82.mo68405a("Database exception when setting AIDs");
                                                    str41 = a2.f90102c;
                                                    if (a5.f90151a.mo49884c(str41)) {
                                                    }
                                                    j19 = j15;
                                                    a3 = m75400a(j19, a2);
                                                    i = 0;
                                                    while (true) {
                                                        j14 = j18;
                                                        if (j19 >= a3.f90092a) {
                                                        }
                                                        str3 = str4;
                                                        str68 = str8;
                                                        str69 = str2;
                                                        a5 = atds;
                                                        str2 = str7;
                                                        str67 = str6;
                                                        str4 = askf;
                                                        str35 = str5;
                                                        j33 = j5;
                                                        j18 = j4;
                                                        j32 = j3;
                                                        str8 = obj;
                                                        a3 = m75400a(j20, a2);
                                                        j19 = j20;
                                                        i = i2;
                                                    }
                                                    throw new atcz("Max amount of steps exceeded");
                                                }
                                            }
                                        } catch (asks e10) {
                                            e = e10;
                                            j30 = millis;
                                            str8 = str71;
                                            asks asks22 = e;
                                            bnsl bnsl822 = (bnsl) f90017a.mo68387b();
                                            bnsl822.mo68437a(asks22);
                                            bnsl822.mo68432a(str68, str67, 1108, str69);
                                            bnsl822.mo68405a("Database exception when setting AIDs");
                                            str41 = a2.f90102c;
                                            if (a5.f90151a.mo49884c(str41)) {
                                            }
                                            j19 = j15;
                                            a3 = m75400a(j19, a2);
                                            i = 0;
                                            while (true) {
                                                j14 = j18;
                                                if (j19 >= a3.f90092a) {
                                                }
                                                str3 = str4;
                                                str68 = str8;
                                                str69 = str2;
                                                a5 = atds;
                                                str2 = str7;
                                                str67 = str6;
                                                str4 = askf;
                                                str35 = str5;
                                                j33 = j5;
                                                j18 = j4;
                                                j32 = j3;
                                                str8 = obj;
                                                a3 = m75400a(j20, a2);
                                                j19 = j20;
                                                i = i2;
                                            }
                                            throw new atcz("Max amount of steps exceeded");
                                        } catch (atcz | aths e62) {
                                        } catch (atdb e11) {
                                        } catch (RuntimeException e82) {
                                        }
                                    } else {
                                        str35 = str70;
                                        j14 = millis;
                                        j15 = currentTimeMillis;
                                        str8 = str71;
                                    }
                                    try {
                                        str41 = a2.f90102c;
                                        if (a5.f90151a.mo49884c(str41)) {
                                            j18 = j14;
                                        } else if (a5.f90153c.mo49940a() && a5.f90152b.mo49952a(str41)) {
                                            j18 = j14;
                                        } else {
                                            bnsl bnsl10 = (bnsl) f90017a.mo68390d();
                                            bnsl10.mo68432a(str68, str3, 229, str69);
                                            bnsl10.mo68405a("Payment bundle deleted");
                                            atcx.m75567a(a2.f90100a, a2.f90102c);
                                            long j39 = j14;
                                            atcs = new atcs(j39, j39);
                                            str4 = str3;
                                            str9 = str67;
                                            str10 = str8;
                                            str7 = str2;
                                            j3 = j32;
                                            j5 = j33;
                                            str11 = str14;
                                            str2 = str69;
                                            str8 = str68;
                                            str65 = str10;
                                            str67 = str9;
                                            j2 = Math.min(j3, atcs.f90092a);
                                            str66 = str4;
                                            str68 = str8;
                                            str69 = str2;
                                            str12 = str7;
                                            str63 = str11;
                                            j = Math.min(j5, atcs.f90093b);
                                        }
                                        j19 = j15;
                                        a3 = m75400a(j19, a2);
                                        i = 0;
                                        while (true) {
                                            j14 = j18;
                                            if (j19 >= a3.f90092a) {
                                                if (a2 != null) {
                                                    if (i < 5) {
                                                        atxy atxy = f90020d;
                                                        String str82 = str69;
                                                        try {
                                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                                            long j40 = atxy.f91100b.get();
                                                            if (atxy.f91101c.get() == 0) {
                                                                str42 = str8;
                                                                str7 = str2;
                                                            } else {
                                                                str42 = str8;
                                                                str7 = str2;
                                                                try {
                                                                    if (elapsedRealtime - j40 < atxy.f91099a) {
                                                                        try {
                                                                            if (atxy.f91101c.incrementAndGet() > 40) {
                                                                            }
                                                                            str8 = i + 1;
                                                                            str43 = a2.f90103d;
                                                                            int i4 = 3;
                                                                            switch (str43.hashCode()) {
                                                                                case -1422950650:
                                                                                    if (str43.equals("active")) {
                                                                                        c = 4;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case -766681394:
                                                                                    if (str43.equals("ready_for_pickup")) {
                                                                                        c = 2;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 407754553:
                                                                                    if (str43.equals("needs_refresh")) {
                                                                                        c = 5;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 693933934:
                                                                                    if (str43.equals("requested")) {
                                                                                        c = 1;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 881487833:
                                                                                    if (str43.equals("type_switch")) {
                                                                                        c = 6;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 1550463001:
                                                                                    if (str43.equals("deleted")) {
                                                                                        c = 0;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 1698062945:
                                                                                    if (str43.equals("unacknowledged")) {
                                                                                        c = 3;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                default:
                                                                                    c = 65535;
                                                                                    break;
                                                                            }
                                                                            switch (c) {
                                                                                case 0:
                                                                                    j20 = j19;
                                                                                    str6 = str67;
                                                                                    atda atda2 = a2;
                                                                                    atds = a5;
                                                                                    askf = str4;
                                                                                    i2 = str8;
                                                                                    j3 = j32;
                                                                                    j5 = j33;
                                                                                    str2 = str82;
                                                                                    j4 = j14;
                                                                                    obj = str42;
                                                                                    str5 = str35;
                                                                                    str8 = str68;
                                                                                    str4 = str3;
                                                                                    atdz atdz = new atdz(atda2.f90100a);
                                                                                    atdt b = atdz.mo49878b(atdz.mo49886d(), atda2.f90102c);
                                                                                    if (b == null) {
                                                                                        bnsl bnsl11 = (bnsl) atdz.f90166a.mo68387b();
                                                                                        bnsl11.mo68432a("atdz", "d", 769, (String) str2);
                                                                                        bnsl11.mo68405a("tryDeleteTokenRpc error: card not found");
                                                                                    } else {
                                                                                        bxvd da = btkj.f149261d.mo74144da();
                                                                                        btiy btiy = b.f90155a.f149123a;
                                                                                        if (btiy == null) {
                                                                                            btiy = btiy.f149054c;
                                                                                        }
                                                                                        if (da.f164950c) {
                                                                                            da.mo74035c();
                                                                                            da.f164950c = false;
                                                                                        }
                                                                                        btkj btkj = (btkj) da.f164949b;
                                                                                        btiy.getClass();
                                                                                        btkj.f149263a = btiy;
                                                                                        btkj.f149264b = btnw.m116966a(2);
                                                                                        atff.m75759a(atdz.f90167b, "t/cardtokenization/deletetoken", (btkj) da.mo74062i(), btkk.f149266b);
                                                                                    }
                                                                                    atcx.m75567a(atda2.f90100a, atda2.f90102c);
                                                                                    a2 = null;
                                                                                    str3 = str4;
                                                                                    str68 = str8;
                                                                                    str69 = str2;
                                                                                    a5 = atds;
                                                                                    str2 = str7;
                                                                                    str67 = str6;
                                                                                    str4 = askf;
                                                                                    str35 = str5;
                                                                                    j33 = j5;
                                                                                    j18 = j4;
                                                                                    j32 = j3;
                                                                                    str8 = obj;
                                                                                    a3 = m75400a(j20, a2);
                                                                                    j19 = j20;
                                                                                    i = i2;
                                                                                case 1:
                                                                                case 2:
                                                                                    j20 = j19;
                                                                                    str2 = str67;
                                                                                    atds = a5;
                                                                                    askf = str4;
                                                                                    i2 = str8;
                                                                                    j3 = j32;
                                                                                    j5 = j33;
                                                                                    j4 = j14;
                                                                                    obj = str42;
                                                                                    str5 = str35;
                                                                                    str8 = str68;
                                                                                    str4 = str3;
                                                                                    str44 = str82;
                                                                                    try {
                                                                                        askf askf9 = a2.f90100a;
                                                                                        try {
                                                                                            btlc a7 = atdm.m75640a(askf9, atds.m75666a(askf9).mo49843a(a2.f90102c), a2.f90104e, a2.f90106g, null);
                                                                                            bxvd da2 = btlr.f149408e.mo74144da();
                                                                                            if (!a7.f149346a.isEmpty()) {
                                                                                                i4 = 4;
                                                                                            }
                                                                                            if (da2.f164950c) {
                                                                                                da2.mo74035c();
                                                                                                da2.f164950c = false;
                                                                                            }
                                                                                            ((btlr) da2.f164949b).f149412c = btny.m116968a(i4);
                                                                                            bxun bxun = a7.f149347b;
                                                                                            if (bxun == null) {
                                                                                                bxun = bxun.f164861c;
                                                                                            }
                                                                                            if (da2.f164950c) {
                                                                                                da2.mo74035c();
                                                                                                da2.f164950c = false;
                                                                                            }
                                                                                            btlr btlr3 = (btlr) da2.f164949b;
                                                                                            bxun.getClass();
                                                                                            btlr3.f149411b = bxun;
                                                                                            btlr3.f149410a = 2;
                                                                                            str6 = str2;
                                                                                            str2 = str44;
                                                                                            a2 = mo49782a(askf9, a2, a2.f90104e, a2.f90105f, (btlr) da2.mo74062i(), a2.f90106g, a7.f149346a, a7.f149348c, a7.f149349d);
                                                                                        } catch (IOException e12) {
                                                                                        } catch (atfh e13) {
                                                                                            e = e13;
                                                                                            atda = a2;
                                                                                            str45 = str2;
                                                                                            str2 = str44;
                                                                                            a2 = m75405a(e, atda);
                                                                                            str3 = str4;
                                                                                            str68 = str8;
                                                                                            str69 = str2;
                                                                                            a5 = atds;
                                                                                            str2 = str7;
                                                                                            str67 = str6;
                                                                                            str4 = askf;
                                                                                            str35 = str5;
                                                                                            j33 = j5;
                                                                                            j18 = j4;
                                                                                            j32 = j3;
                                                                                            str8 = obj;
                                                                                            a3 = m75400a(j20, a2);
                                                                                            j19 = j20;
                                                                                            i = i2;
                                                                                        }
                                                                                        str3 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        a5 = atds;
                                                                                        str2 = str7;
                                                                                        str67 = str6;
                                                                                        str4 = askf;
                                                                                        str35 = str5;
                                                                                        j33 = j5;
                                                                                        j18 = j4;
                                                                                        j32 = j3;
                                                                                        str8 = obj;
                                                                                        a3 = m75400a(j20, a2);
                                                                                        j19 = j20;
                                                                                        i = i2;
                                                                                    } catch (atcz | aths e14) {
                                                                                        e = e14;
                                                                                        str6 = str2;
                                                                                        str2 = str44;
                                                                                        th2 = e;
                                                                                        str15 = str14;
                                                                                        str16 = str6;
                                                                                        askf2 = askf;
                                                                                        str13 = str5;
                                                                                        obj = obj;
                                                                                        str17 = str4;
                                                                                        j6 = 100;
                                                                                        str4 = str17;
                                                                                        bnsl bnsl12 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl12.mo68437a(th2);
                                                                                        bnsl12.mo68432a(str8, str4, 254, str2);
                                                                                        bnsl12.mo68405a("Backing off");
                                                                                        try {
                                                                                            mo49781a();
                                                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                            str10 = obj;
                                                                                        } catch (atdb e15) {
                                                                                            atdb atdb5 = e15;
                                                                                            bnsl bnsl13 = (bnsl) f90017a.mo68388c();
                                                                                            bnsl13.mo68437a(atdb5);
                                                                                            str10 = obj;
                                                                                            bnsl13.mo68432a(str8, str10, 295, str2);
                                                                                            bnsl13.mo68405a(str11);
                                                                                            long currentTimeMillis2 = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(j6);
                                                                                            atcs = new atcs(currentTimeMillis2, currentTimeMillis2);
                                                                                        }
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (atdb e16) {
                                                                                        e = e16;
                                                                                        str6 = str2;
                                                                                        str2 = str44;
                                                                                        atdb2 = e;
                                                                                        str59 = str4;
                                                                                        str11 = str14;
                                                                                        str9 = str6;
                                                                                        bnsl bnsl922 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl922.mo68437a(atdb);
                                                                                        bnsl922.mo68432a(str8, (String) str4, 257, str2);
                                                                                        bnsl922.mo68405a("Bundle gone while processing it");
                                                                                        atcs = new atcs(j4, j4);
                                                                                        str10 = obj;
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (RuntimeException e17) {
                                                                                        e = e17;
                                                                                        str6 = str2;
                                                                                        str2 = str44;
                                                                                        runtimeException = e;
                                                                                        obj = obj;
                                                                                        bnsl bnsl14 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl14.mo68437a(runtimeException);
                                                                                        bnsl14.mo68432a(str8, str4, 260, str2);
                                                                                        String str83 = str5;
                                                                                        bnsl14.mo68420a("Unexpected error updating bundle %s, detokenizing card", str83);
                                                                                        mo49781a();
                                                                                        a = atbm.m75387a(askf, str83, System.currentTimeMillis(), true);
                                                                                        if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 3:
                                                                                    j20 = j19;
                                                                                    str2 = str67;
                                                                                    atds = a5;
                                                                                    askf = str4;
                                                                                    i2 = str8;
                                                                                    j3 = j32;
                                                                                    j5 = j33;
                                                                                    j4 = j14;
                                                                                    obj = str42;
                                                                                    str5 = str35;
                                                                                    str8 = str68;
                                                                                    str4 = str3;
                                                                                    str3 = str82;
                                                                                    askf askf10 = a2.f90100a;
                                                                                    btiy a8 = atds.m75666a(askf10).mo49843a(a2.f90102c);
                                                                                    atdm.m75641a(askf10, a8, a2.f90104e, a2.f90106g, a2.f90108i.mo49800b(), a2.f90108i.mo49805g());
                                                                                    bnsl bnsl15 = (bnsl) f90017a.mo68390d();
                                                                                    bnsl15.mo68432a((String) str8, (String) str2, 823, str3);
                                                                                    bnsl15.mo68420a("Payment bundle %s acknowledged", a2.f90101b);
                                                                                    mo49781a();
                                                                                    atda atda3 = (atda) atbm.m75388a(askf10, a2.f90102c, atbo.f90015a);
                                                                                    CardInfo b2 = atds.m75666a(askf10).mo49853b(a8.f149056a);
                                                                                    if (b2 != null) {
                                                                                        atam atam = new atam(askf10);
                                                                                        atam.mo49742a(atam.mo49735a(19, b2), a2.f90104e);
                                                                                        atkl.f90415a.mo50008a();
                                                                                        a2 = atda3;
                                                                                        str6 = str2;
                                                                                        str2 = str3;
                                                                                        str3 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        a5 = atds;
                                                                                        str2 = str7;
                                                                                        str67 = str6;
                                                                                        str4 = askf;
                                                                                        str35 = str5;
                                                                                        j33 = j5;
                                                                                        j18 = j4;
                                                                                        j32 = j3;
                                                                                        str8 = obj;
                                                                                        a3 = m75400a(j20, a2);
                                                                                        j19 = j20;
                                                                                        i = i2;
                                                                                    } else {
                                                                                        throw new RuntimeException();
                                                                                    }
                                                                                case 4:
                                                                                case 5:
                                                                                case 6:
                                                                                    try {
                                                                                        str49 = (String) bmxu.m108565a(a2.f90110k, a2.f90101b);
                                                                                        str2 = this;
                                                                                    } catch (aths e18) {
                                                                                        e = e18;
                                                                                        String str84 = str68;
                                                                                        askf askf11 = str4;
                                                                                        long j41 = j32;
                                                                                        long j42 = j33;
                                                                                        str19 = str42;
                                                                                        String str85 = str3;
                                                                                        th4 = e;
                                                                                        str37 = str67;
                                                                                        str36 = str82;
                                                                                        str24 = str14;
                                                                                        str22 = str35;
                                                                                        askf2 = askf;
                                                                                        str17 = str18;
                                                                                        j6 = 100;
                                                                                        str4 = str17;
                                                                                        bnsl bnsl122 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl122.mo68437a(th2);
                                                                                        bnsl122.mo68432a(str8, str4, 254, str2);
                                                                                        bnsl122.mo68405a("Backing off");
                                                                                        mo49781a();
                                                                                        atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                        str10 = obj;
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (atcz e19) {
                                                                                        e = e19;
                                                                                        String str842 = str68;
                                                                                        askf askf112 = str4;
                                                                                        long j412 = j32;
                                                                                        long j422 = j33;
                                                                                        str19 = str42;
                                                                                        String str852 = str3;
                                                                                        th4 = e;
                                                                                        str37 = str67;
                                                                                        str36 = str82;
                                                                                        str24 = str14;
                                                                                        str22 = str35;
                                                                                        askf2 = askf;
                                                                                        str17 = str18;
                                                                                        j6 = 100;
                                                                                        str4 = str17;
                                                                                        bnsl bnsl1222 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl1222.mo68437a(th2);
                                                                                        bnsl1222.mo68432a(str8, str4, 254, str2);
                                                                                        bnsl1222.mo68405a("Backing off");
                                                                                        mo49781a();
                                                                                        atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                        str10 = obj;
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (atdb e20) {
                                                                                    } catch (RuntimeException e21) {
                                                                                        e = e21;
                                                                                        str48 = str68;
                                                                                        atds = a5;
                                                                                        askf5 = str4;
                                                                                        j21 = j32;
                                                                                        j22 = j33;
                                                                                        str46 = str42;
                                                                                        str47 = str35;
                                                                                        String str86 = str3;
                                                                                        Object obj3 = str46;
                                                                                        runtimeException = e;
                                                                                        str6 = str67;
                                                                                        str2 = str82;
                                                                                        obj = obj3;
                                                                                        bnsl bnsl142 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl142.mo68437a(runtimeException);
                                                                                        bnsl142.mo68432a(str8, str4, 260, str2);
                                                                                        String str832 = str5;
                                                                                        bnsl142.mo68420a("Unexpected error updating bundle %s, detokenizing card", str832);
                                                                                        mo49781a();
                                                                                        a = atbm.m75387a(askf, str832, System.currentTimeMillis(), true);
                                                                                        if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        atcy b3 = str2.mo49786b(a2.f90100a.f89126d, str49);
                                                                                        i2 = str8;
                                                                                        if (a2.f90110k == null) {
                                                                                            try {
                                                                                                r142 = a2.f90108i;
                                                                                            } catch (atcz | aths e22) {
                                                                                                Throwable th11 = e22;
                                                                                                String str87 = str68;
                                                                                                String str88 = str67;
                                                                                                askf askf12 = str4;
                                                                                                break;
                                                                                            } catch (atdb e23) {
                                                                                                atdb atdb6 = e23;
                                                                                                String str89 = str68;
                                                                                                Object obj4 = str3;
                                                                                                String str90 = str67;
                                                                                                long j43 = j32;
                                                                                                long j44 = j33;
                                                                                                String str91 = str82;
                                                                                                String str92 = str89;
                                                                                                Object obj5 = obj4;
                                                                                                str11 = str14;
                                                                                                j4 = j14;
                                                                                                obj = str42;
                                                                                                str8 = str92;
                                                                                                str4 = obj5;
                                                                                                bnsl bnsl9222 = (bnsl) f90017a.mo68388c();
                                                                                                bnsl9222.mo68437a(atdb);
                                                                                                bnsl9222.mo68432a(str8, (String) str4, 257, str2);
                                                                                                bnsl9222.mo68405a("Bundle gone while processing it");
                                                                                                atcs = new atcs(j4, j4);
                                                                                                str10 = obj;
                                                                                                str65 = str10;
                                                                                                str67 = str9;
                                                                                                j2 = Math.min(j3, atcs.f90092a);
                                                                                                str66 = str4;
                                                                                                str68 = str8;
                                                                                                str69 = str2;
                                                                                                str12 = str7;
                                                                                                str63 = str11;
                                                                                                j = Math.min(j5, atcs.f90093b);
                                                                                            } catch (RuntimeException e24) {
                                                                                                runtimeException = e24;
                                                                                                String str93 = str68;
                                                                                                str6 = str67;
                                                                                                atds = a5;
                                                                                                askf = str4;
                                                                                                j3 = j32;
                                                                                                j5 = j33;
                                                                                                String str94 = str82;
                                                                                                String str95 = str42;
                                                                                                str5 = str35;
                                                                                                str4 = str3;
                                                                                                str8 = str93;
                                                                                                bnsl bnsl1422 = (bnsl) f90017a.mo68388c();
                                                                                                bnsl1422.mo68437a(runtimeException);
                                                                                                bnsl1422.mo68432a(str8, str4, 260, str2);
                                                                                                String str8322 = str5;
                                                                                                bnsl1422.mo68420a("Unexpected error updating bundle %s, detokenizing card", str8322);
                                                                                                mo49781a();
                                                                                                a = atbm.m75387a(askf, str8322, System.currentTimeMillis(), true);
                                                                                                if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                                }
                                                                                            } catch (Throwable th12) {
                                                                                                th = th12;
                                                                                                f90022f.unlock();
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            r142 = 0;
                                                                                        }
                                                                                        atds = a5;
                                                                                        askf askf13 = a2.f90100a;
                                                                                        CryptoParameters a9 = b3.mo49810a(str8);
                                                                                        str8 = atxw.m76526a();
                                                                                        askf = str4;
                                                                                        askf askf14 = a2.f90100a;
                                                                                        str2 = atds.m75666a(askf14);
                                                                                        String str96 = str49;
                                                                                        btiy a10 = str2.mo49843a(a2.f90102c);
                                                                                        try {
                                                                                            str2 = new athh().mo49987a(askf14);
                                                                                            askf6 = askf14;
                                                                                            try {
                                                                                                btli btli = a9.f108621a;
                                                                                                CryptoParameters cryptoParameters = a9;
                                                                                                if (a2.f90110k == null) {
                                                                                                    btmd = a2.f90108i.mo49796a();
                                                                                                } else {
                                                                                                    btmd = b3.mo49809a();
                                                                                                }
                                                                                                String str97 = a2.f90103d;
                                                                                                String str98 = str8;
                                                                                                int hashCode = str97.hashCode();
                                                                                                btmd btmd2 = btmd;
                                                                                                if (hashCode != -1422950650) {
                                                                                                    if (hashCode != 407754553) {
                                                                                                        if (hashCode == 881487833 && str97.equals("type_switch")) {
                                                                                                            c2 = 1;
                                                                                                            if (c2 != 0) {
                                                                                                                str56 = str82;
                                                                                                                i3 = 3;
                                                                                                            } else if (c2 == 1) {
                                                                                                                str56 = str82;
                                                                                                                i3 = 4;
                                                                                                            } else if (c2 != 2) {
                                                                                                                bnsl bnsl16 = (bnsl) f90017a.mo68387b();
                                                                                                                str56 = str82;
                                                                                                                try {
                                                                                                                    bnsl16.mo68432a(str68, str67, 1002, str56);
                                                                                                                    bnsl16.mo68405a("Unexpected token state for replenishment");
                                                                                                                    i3 = 7;
                                                                                                                } catch (atcz e25) {
                                                                                                                    bnsl bnsl17 = (bnsl) f90017a.mo68387b();
                                                                                                                    bnsl17.mo68437a(e25);
                                                                                                                    bnsl17.mo68432a(str68, str3, 1022, str56);
                                                                                                                    bnsl17.mo68405a("Error while checking active token replenish reason");
                                                                                                                    i3 = 9;
                                                                                                                } catch (IOException e26) {
                                                                                                                } catch (atfh e27) {
                                                                                                                } catch (atdb e28) {
                                                                                                                } catch (RuntimeException e29) {
                                                                                                                }
                                                                                                            } else {
                                                                                                                str56 = str82;
                                                                                                                atcv atcv2 = a2.f90108i;
                                                                                                                if (atcv2 == null) {
                                                                                                                    bnsl bnsl18 = (bnsl) f90017a.mo68387b();
                                                                                                                    bnsl18.mo68432a(str68, str3, 1009, str56);
                                                                                                                    bnsl18.mo68405a("Bundle adapter null while checking replenish reason");
                                                                                                                    i3 = 8;
                                                                                                                } else if (atcv2.mo49803e()) {
                                                                                                                    i3 = 5;
                                                                                                                } else if (j19 < a2.f90108i.mo49802d().f90092a) {
                                                                                                                    bnsl bnsl19 = (bnsl) f90017a.mo68387b();
                                                                                                                    bnsl19.mo68432a(str68, str3, 1026, str56);
                                                                                                                    bnsl19.mo68405a("Active token is being replenished for unexpected reason");
                                                                                                                    i3 = 10;
                                                                                                                } else {
                                                                                                                    i3 = 6;
                                                                                                                }
                                                                                                            }
                                                                                                            btlj = (btlj) btll.f149376k.mo74144da();
                                                                                                            if (!btlj.f164950c) {
                                                                                                                btlj.mo74035c();
                                                                                                                btlj.f164950c = false;
                                                                                                            }
                                                                                                            btll btll = (btll) btlj.f164949b;
                                                                                                            a10.getClass();
                                                                                                            btll.f149378a = a10;
                                                                                                            String str99 = str2.f149047b;
                                                                                                            str99.getClass();
                                                                                                            btll.f149379b = str99;
                                                                                                            str2.getClass();
                                                                                                            btll.f149380c = str2;
                                                                                                            btli.getClass();
                                                                                                            btll.f149381d = btli;
                                                                                                            btmd2.getClass();
                                                                                                            btll.f149382e = btmd2;
                                                                                                            str98.getClass();
                                                                                                            String str100 = str98;
                                                                                                            btll.f149383f = str100;
                                                                                                            btlj.mo70825b(atrp.f90732a);
                                                                                                            switch (str96.hashCode()) {
                                                                                                                case -1688490866:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("canonical_interac_bundle")) {
                                                                                                                        c3 = 4;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case -1426184971:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("canonical_eftpos_bundle")) {
                                                                                                                        c3 = 5;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case -1245210692:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("felica_quicpay_bundle")) {
                                                                                                                        c3 = 9;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case -905486322:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("amex2_bundle")) {
                                                                                                                        c3 = 0;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case -377015583:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("felica_id_aptest_bundle")) {
                                                                                                                        c3 = 12;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case -152778304:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("canonical_mc_bundle")) {
                                                                                                                        c3 = 7;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 309674061:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("canonical_discover_bundle")) {
                                                                                                                        c3 = 6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 366259608:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("discover_bundle")) {
                                                                                                                        c3 = 1;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 368951431:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("felica_bundle")) {
                                                                                                                        c3 = 8;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 434689600:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("visa_bundle")) {
                                                                                                                        c3 = 3;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 804254209:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("felica_id_bundle")) {
                                                                                                                        c3 = 10;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 959178788:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("canonical_elo_bundle")) {
                                                                                                                        c3 = 13;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 1640769725:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("mcbp_bundle")) {
                                                                                                                        c3 = 2;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                case 2000139462:
                                                                                                                    str57 = str96;
                                                                                                                    if (str57.equals("felica_quicpay_aptest_bundle")) {
                                                                                                                        c3 = 11;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    str57 = str96;
                                                                                                                    c3 = 65535;
                                                                                                                    break;
                                                                                                            }
                                                                                                            switch (c3) {
                                                                                                                case 0:
                                                                                                                    try {
                                                                                                                        btoa = btoa.AMEX_V2_BUNDLE;
                                                                                                                        if (!btlj.f164950c) {
                                                                                                                            btlj.mo74035c();
                                                                                                                            btlj.f164950c = false;
                                                                                                                        }
                                                                                                                        ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                        ArrayList arrayList = new ArrayList(1);
                                                                                                                        if (!cgwn.m147262l()) {
                                                                                                                            arrayList.add(btob.CAPABILITY_VISA_ODA_REPERSO);
                                                                                                                        }
                                                                                                                        btlj.mo70824a(arrayList);
                                                                                                                        if (!btlj.f164950c) {
                                                                                                                            btlj.mo74035c();
                                                                                                                            btlj.f164950c = false;
                                                                                                                        }
                                                                                                                        ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                        btll btll2 = (btll) btlj.mo74062i();
                                                                                                                        askf7 = askf6;
                                                                                                                        btlm btlm = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll2, btlm.f149388f, (Map) null);
                                                                                                                        try {
                                                                                                                            byte[] bArr = cryptoParameters.f108622b;
                                                                                                                            btlr = btlm.f149390a;
                                                                                                                            if (btlr == null) {
                                                                                                                                btlr2 = btlr;
                                                                                                                            } else {
                                                                                                                                btlr2 = btlr.f149408e;
                                                                                                                            }
                                                                                                                            str58 = str3;
                                                                                                                            str6 = str67;
                                                                                                                        } catch (atcz | aths e30) {
                                                                                                                            str39 = str68;
                                                                                                                            str40 = str3;
                                                                                                                            j16 = j32;
                                                                                                                            j17 = j33;
                                                                                                                            str38 = str42;
                                                                                                                            th4 = e30;
                                                                                                                            str36 = str56;
                                                                                                                            str37 = str67;
                                                                                                                            str24 = str14;
                                                                                                                            str22 = str35;
                                                                                                                            askf2 = askf;
                                                                                                                            str17 = str18;
                                                                                                                            j6 = 100;
                                                                                                                            str4 = str17;
                                                                                                                            bnsl bnsl12222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl12222.mo68437a(th2);
                                                                                                                            bnsl12222.mo68432a(str8, str4, 254, str2);
                                                                                                                            bnsl12222.mo68405a("Backing off");
                                                                                                                            mo49781a();
                                                                                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (atdb e31) {
                                                                                                                            str27 = str68;
                                                                                                                            str28 = str3;
                                                                                                                            j9 = j32;
                                                                                                                            j11 = j33;
                                                                                                                            j10 = j14;
                                                                                                                            str26 = str42;
                                                                                                                            atdb3 = e31;
                                                                                                                            str25 = str56;
                                                                                                                            String str101 = str67;
                                                                                                                            str11 = str14;
                                                                                                                            bnsl bnsl92222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl92222.mo68437a(atdb);
                                                                                                                            bnsl92222.mo68432a(str8, (String) str4, 257, str2);
                                                                                                                            bnsl92222.mo68405a("Bundle gone while processing it");
                                                                                                                            atcs = new atcs(j4, j4);
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (RuntimeException e32) {
                                                                                                                            str8 = str68;
                                                                                                                            str4 = str3;
                                                                                                                            j3 = j32;
                                                                                                                            j5 = j33;
                                                                                                                            obj = str42;
                                                                                                                            str5 = str35;
                                                                                                                            runtimeException = e32;
                                                                                                                            str2 = str56;
                                                                                                                            str6 = str67;
                                                                                                                            bnsl bnsl14222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl14222.mo68437a(runtimeException);
                                                                                                                            bnsl14222.mo68432a(str8, str4, 260, str2);
                                                                                                                            String str83222 = str5;
                                                                                                                            bnsl14222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str83222);
                                                                                                                            mo49781a();
                                                                                                                            a = atbm.m75387a(askf, str83222, System.currentTimeMillis(), true);
                                                                                                                            if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (IOException e33) {
                                                                                                                    } catch (atfh e34) {
                                                                                                                        e = e34;
                                                                                                                        j20 = j19;
                                                                                                                        String str102 = str68;
                                                                                                                        String str103 = str3;
                                                                                                                        String str104 = str67;
                                                                                                                        j23 = j32;
                                                                                                                        j25 = j33;
                                                                                                                        j24 = j14;
                                                                                                                        Object obj6 = str42;
                                                                                                                        str50 = str35;
                                                                                                                        askf7 = askf6;
                                                                                                                        atfh = e;
                                                                                                                        obj2 = obj6;
                                                                                                                        String str105 = str104;
                                                                                                                        String str106 = str102;
                                                                                                                        str3 = str56;
                                                                                                                        str2 = str105;
                                                                                                                        r14 = str106;
                                                                                                                        str4 = str103;
                                                                                                                        try {
                                                                                                                            if (!athh.m75883a(askf7, atfh)) {
                                                                                                                            }
                                                                                                                        } catch (aths e35) {
                                                                                                                            e = e35;
                                                                                                                            th2 = e;
                                                                                                                            str16 = str2;
                                                                                                                            str15 = str14;
                                                                                                                            askf2 = askf;
                                                                                                                            str13 = str5;
                                                                                                                            j6 = 100;
                                                                                                                            str2 = str3;
                                                                                                                            str8 = str8;
                                                                                                                            str4 = str4;
                                                                                                                            bnsl bnsl122222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl122222.mo68437a(th2);
                                                                                                                            bnsl122222.mo68432a(str8, str4, 254, str2);
                                                                                                                            bnsl122222.mo68405a("Backing off");
                                                                                                                            mo49781a();
                                                                                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (atcz e36) {
                                                                                                                            e = e36;
                                                                                                                            th2 = e;
                                                                                                                            str16 = str2;
                                                                                                                            str15 = str14;
                                                                                                                            askf2 = askf;
                                                                                                                            str13 = str5;
                                                                                                                            j6 = 100;
                                                                                                                            str2 = str3;
                                                                                                                            str8 = str8;
                                                                                                                            str4 = str4;
                                                                                                                            bnsl bnsl1222222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl1222222.mo68437a(th2);
                                                                                                                            bnsl1222222.mo68432a(str8, str4, 254, str2);
                                                                                                                            bnsl1222222.mo68405a("Backing off");
                                                                                                                            mo49781a();
                                                                                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (atdb e37) {
                                                                                                                            e = e37;
                                                                                                                            atdb = e;
                                                                                                                            str9 = str2;
                                                                                                                            str11 = str14;
                                                                                                                            str2 = str3;
                                                                                                                            str8 = str8;
                                                                                                                            str4 = str4;
                                                                                                                            bnsl bnsl922222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl922222.mo68437a(atdb);
                                                                                                                            bnsl922222.mo68432a(str8, (String) str4, 257, str2);
                                                                                                                            bnsl922222.mo68405a("Bundle gone while processing it");
                                                                                                                            atcs = new atcs(j4, j4);
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (RuntimeException e38) {
                                                                                                                            e = e38;
                                                                                                                            runtimeException = e;
                                                                                                                            str6 = str2;
                                                                                                                            str2 = str3;
                                                                                                                            str8 = str8;
                                                                                                                            str4 = str4;
                                                                                                                            bnsl bnsl142222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl142222.mo68437a(runtimeException);
                                                                                                                            bnsl142222.mo68432a(str8, str4, 260, str2);
                                                                                                                            String str832222 = str5;
                                                                                                                            bnsl142222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str832222);
                                                                                                                            mo49781a();
                                                                                                                            a = atbm.m75387a(askf, str832222, System.currentTimeMillis(), true);
                                                                                                                            if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        str5 = str35;
                                                                                                                        askf askf15 = askf7;
                                                                                                                        j5 = j33;
                                                                                                                        j4 = j14;
                                                                                                                        String str107 = str100;
                                                                                                                        j3 = j32;
                                                                                                                        j20 = j19;
                                                                                                                        btlr btlr4 = btlr2;
                                                                                                                        str60 = str56;
                                                                                                                        str8 = str68;
                                                                                                                        str61 = str6;
                                                                                                                        str4 = str58;
                                                                                                                        obj = str42;
                                                                                                                        try {
                                                                                                                            a2 = mo49782a(askf15, a2, str107, bArr, btlr4, btlm.f149391b.mo73780k(), btlm.f149392c, btlm.f149393d, btlm.f149394e);
                                                                                                                            str6 = str61;
                                                                                                                            str2 = str60;
                                                                                                                            str3 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            a5 = atds;
                                                                                                                            str2 = str7;
                                                                                                                            str67 = str6;
                                                                                                                            str4 = askf;
                                                                                                                            str35 = str5;
                                                                                                                            j33 = j5;
                                                                                                                            j18 = j4;
                                                                                                                            j32 = j3;
                                                                                                                            str8 = obj;
                                                                                                                            a3 = m75400a(j20, a2);
                                                                                                                            j19 = j20;
                                                                                                                            i = i2;
                                                                                                                        } catch (atcz | aths e39) {
                                                                                                                            th2 = e39;
                                                                                                                            str16 = str61;
                                                                                                                            str15 = str14;
                                                                                                                            askf2 = askf;
                                                                                                                            str13 = str5;
                                                                                                                            j6 = 100;
                                                                                                                            str2 = str60;
                                                                                                                            bnsl bnsl12222222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl12222222.mo68437a(th2);
                                                                                                                            bnsl12222222.mo68432a(str8, str4, 254, str2);
                                                                                                                            bnsl12222222.mo68405a("Backing off");
                                                                                                                            mo49781a();
                                                                                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (atdb e40) {
                                                                                                                            atdb = e40;
                                                                                                                            str9 = str61;
                                                                                                                            str11 = str14;
                                                                                                                            str2 = str60;
                                                                                                                            bnsl bnsl9222222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl9222222.mo68437a(atdb);
                                                                                                                            bnsl9222222.mo68432a(str8, (String) str4, 257, str2);
                                                                                                                            bnsl9222222.mo68405a("Bundle gone while processing it");
                                                                                                                            atcs = new atcs(j4, j4);
                                                                                                                            str10 = obj;
                                                                                                                            str65 = str10;
                                                                                                                            str67 = str9;
                                                                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                                                                            str66 = str4;
                                                                                                                            str68 = str8;
                                                                                                                            str69 = str2;
                                                                                                                            str12 = str7;
                                                                                                                            str63 = str11;
                                                                                                                            j = Math.min(j5, atcs.f90093b);
                                                                                                                        } catch (RuntimeException e41) {
                                                                                                                            runtimeException = e41;
                                                                                                                            str6 = str61;
                                                                                                                            str2 = str60;
                                                                                                                            bnsl bnsl1422222 = (bnsl) f90017a.mo68388c();
                                                                                                                            bnsl1422222.mo68437a(runtimeException);
                                                                                                                            bnsl1422222.mo68432a(str8, str4, 260, str2);
                                                                                                                            String str8322222 = str5;
                                                                                                                            bnsl1422222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str8322222);
                                                                                                                            mo49781a();
                                                                                                                            a = atbm.m75387a(askf, str8322222, System.currentTimeMillis(), true);
                                                                                                                            if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (atcz | aths e42) {
                                                                                                                        str21 = str68;
                                                                                                                        j7 = j32;
                                                                                                                        j8 = j33;
                                                                                                                        str18 = str58;
                                                                                                                        str19 = str42;
                                                                                                                        th3 = e42;
                                                                                                                        str20 = str56;
                                                                                                                        str24 = str14;
                                                                                                                        str23 = str6;
                                                                                                                        str22 = str35;
                                                                                                                        askf2 = askf;
                                                                                                                        str17 = str18;
                                                                                                                        j6 = 100;
                                                                                                                        str4 = str17;
                                                                                                                        bnsl bnsl122222222 = (bnsl) f90017a.mo68388c();
                                                                                                                        bnsl122222222.mo68437a(th2);
                                                                                                                        bnsl122222222.mo68432a(str8, str4, 254, str2);
                                                                                                                        bnsl122222222.mo68405a("Backing off");
                                                                                                                        mo49781a();
                                                                                                                        atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                                                        str10 = obj;
                                                                                                                        str65 = str10;
                                                                                                                        str67 = str9;
                                                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                                                        str66 = str4;
                                                                                                                        str68 = str8;
                                                                                                                        str69 = str2;
                                                                                                                        str12 = str7;
                                                                                                                        str63 = str11;
                                                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                                                    } catch (atdb e43) {
                                                                                                                        str8 = str68;
                                                                                                                        j3 = j32;
                                                                                                                        j5 = j33;
                                                                                                                        str59 = str58;
                                                                                                                        j4 = j14;
                                                                                                                        obj = str42;
                                                                                                                        atdb2 = e43;
                                                                                                                        str2 = str56;
                                                                                                                        str11 = str14;
                                                                                                                        str9 = str6;
                                                                                                                        bnsl bnsl92222222 = (bnsl) f90017a.mo68388c();
                                                                                                                        bnsl92222222.mo68437a(atdb);
                                                                                                                        bnsl92222222.mo68432a(str8, (String) str4, 257, str2);
                                                                                                                        bnsl92222222.mo68405a("Bundle gone while processing it");
                                                                                                                        atcs = new atcs(j4, j4);
                                                                                                                        str10 = obj;
                                                                                                                        str65 = str10;
                                                                                                                        str67 = str9;
                                                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                                                        str66 = str4;
                                                                                                                        str68 = str8;
                                                                                                                        str69 = str2;
                                                                                                                        str12 = str7;
                                                                                                                        str63 = str11;
                                                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                                                    } catch (RuntimeException e44) {
                                                                                                                        str8 = str68;
                                                                                                                        j3 = j32;
                                                                                                                        j5 = j33;
                                                                                                                        str4 = str58;
                                                                                                                        obj = str42;
                                                                                                                        str5 = str35;
                                                                                                                        runtimeException = e44;
                                                                                                                        str2 = str56;
                                                                                                                        bnsl bnsl14222222 = (bnsl) f90017a.mo68388c();
                                                                                                                        bnsl14222222.mo68437a(runtimeException);
                                                                                                                        bnsl14222222.mo68432a(str8, str4, 260, str2);
                                                                                                                        String str83222222 = str5;
                                                                                                                        bnsl14222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str83222222);
                                                                                                                        mo49781a();
                                                                                                                        a = atbm.m75387a(askf, str83222222, System.currentTimeMillis(), true);
                                                                                                                        if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1:
                                                                                                                    btoa = btoa.DISCOVER_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList2 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList2);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll22 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm2 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll22, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr2 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm2.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf152 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str1072 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr42 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf152, a2, str1072, bArr2, btlr42, btlm2.f149391b.mo73780k(), btlm2.f149392c, btlm2.f149393d, btlm2.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 2:
                                                                                                                    btoa = btoa.MASTERCARD_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList22 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList22);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm22 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr22 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm22.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf1522 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str10722 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr422 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf1522, a2, str10722, bArr22, btlr422, btlm22.f149391b.mo73780k(), btlm22.f149392c, btlm22.f149393d, btlm22.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 3:
                                                                                                                    btoa = btoa.VISA_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll2222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll2222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf15222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str107222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr4222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf15222, a2, str107222, bArr222, btlr4222, btlm222.f149391b.mo73780k(), btlm222.f149392c, btlm222.f149393d, btlm222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 4:
                                                                                                                    btoa = btoa.CANONICAL_INTERAC_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList2222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList2222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll22222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm2222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll22222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr2222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm2222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf152222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str1072222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr42222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf152222, a2, str1072222, bArr2222, btlr42222, btlm2222.f149391b.mo73780k(), btlm2222.f149392c, btlm2222.f149393d, btlm2222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 5:
                                                                                                                    btoa = btoa.CANONICAL_EFTPOS_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList22222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList22222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm22222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr22222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm22222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf1522222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str10722222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr422222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf1522222, a2, str10722222, bArr22222, btlr422222, btlm22222.f149391b.mo73780k(), btlm22222.f149392c, btlm22222.f149393d, btlm22222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 6:
                                                                                                                    btoa = btoa.CANONICAL_DISCOVER_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll2222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll2222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf15222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str107222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr4222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf15222222, a2, str107222222, bArr222222, btlr4222222, btlm222222.f149391b.mo73780k(), btlm222222.f149392c, btlm222222.f149393d, btlm222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 7:
                                                                                                                    btoa = btoa.CANONICAL_MASTERCARD_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList2222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList2222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll22222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm2222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll22222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr2222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm2222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf152222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str1072222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr42222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf152222222, a2, str1072222222, bArr2222222, btlr42222222, btlm2222222.f149391b.mo73780k(), btlm2222222.f149392c, btlm2222222.f149393d, btlm2222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 8:
                                                                                                                    btoa = btoa.FELICA_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList22222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList22222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll222222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm22222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll222222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr22222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm22222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf1522222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str10722222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr422222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf1522222222, a2, str10722222222, bArr22222222, btlr422222222, btlm22222222.f149391b.mo73780k(), btlm22222222.f149392c, btlm22222222.f149393d, btlm22222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 9:
                                                                                                                    btoa = btoa.CANONICAL_FELICA_QUICPAY_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList222222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList222222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll2222222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm222222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll2222222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr222222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm222222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf15222222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str107222222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr4222222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf15222222222, a2, str107222222222, bArr222222222, btlr4222222222, btlm222222222.f149391b.mo73780k(), btlm222222222.f149392c, btlm222222222.f149393d, btlm222222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 10:
                                                                                                                    btoa = btoa.CANONICAL_FELICA_ID_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList2222222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList2222222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll22222222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm2222222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll22222222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr2222222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm2222222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf152222222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str1072222222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr42222222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf152222222222, a2, str1072222222222, bArr2222222222, btlr42222222222, btlm2222222222.f149391b.mo73780k(), btlm2222222222.f149392c, btlm2222222222.f149393d, btlm2222222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 11:
                                                                                                                    btoa = btoa.CANONICAL_FELICA_QUICPAY_APTEST_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList22222222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList22222222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll222222222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm22222222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll222222222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr22222222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm22222222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf1522222222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str10722222222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr422222222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf1522222222222, a2, str10722222222222, bArr22222222222, btlr422222222222, btlm22222222222.f149391b.mo73780k(), btlm22222222222.f149392c, btlm22222222222.f149393d, btlm22222222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 12:
                                                                                                                    btoa = btoa.CANONICAL_FELICA_ID_APTEST_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList222222222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList222222222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll2222222222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm222222222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll2222222222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr222222222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm222222222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf15222222222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str107222222222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr4222222222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf15222222222222, a2, str107222222222222, bArr222222222222, btlr4222222222222, btlm222222222222.f149391b.mo73780k(), btlm222222222222.f149392c, btlm222222222222.f149393d, btlm222222222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                case 13:
                                                                                                                    btoa = btoa.CANONICAL_ELO_BUNDLE;
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149384g = btoa.mo3214a();
                                                                                                                    ArrayList arrayList2222222222222 = new ArrayList(1);
                                                                                                                    if (!cgwn.m147262l()) {
                                                                                                                    }
                                                                                                                    btlj.mo70824a(arrayList2222222222222);
                                                                                                                    if (!btlj.f164950c) {
                                                                                                                    }
                                                                                                                    ((btll) btlj.f164949b).f149387j = btlk.m116895a(i3);
                                                                                                                    btll btll22222222222222 = (btll) btlj.mo74062i();
                                                                                                                    askf7 = askf6;
                                                                                                                    btlm btlm2222222222222 = (btlm) atff.m75760a(askf7, "e/cardtokenization/initiatereplenish", btll22222222222222, btlm.f149388f, (Map) null);
                                                                                                                    byte[] bArr2222222222222 = cryptoParameters.f108622b;
                                                                                                                    btlr = btlm2222222222222.f149390a;
                                                                                                                    if (btlr == null) {
                                                                                                                    }
                                                                                                                    str58 = str3;
                                                                                                                    str6 = str67;
                                                                                                                    str5 = str35;
                                                                                                                    askf askf152222222222222 = askf7;
                                                                                                                    j5 = j33;
                                                                                                                    j4 = j14;
                                                                                                                    String str1072222222222222 = str100;
                                                                                                                    j3 = j32;
                                                                                                                    j20 = j19;
                                                                                                                    btlr btlr42222222222222 = btlr2;
                                                                                                                    str60 = str56;
                                                                                                                    str8 = str68;
                                                                                                                    str61 = str6;
                                                                                                                    str4 = str58;
                                                                                                                    obj = str42;
                                                                                                                    a2 = mo49782a(askf152222222222222, a2, str1072222222222222, bArr2222222222222, btlr42222222222222, btlm2222222222222.f149391b.mo73780k(), btlm2222222222222.f149392c, btlm2222222222222.f149393d, btlm2222222222222.f149394e);
                                                                                                                    str6 = str61;
                                                                                                                    str2 = str60;
                                                                                                                    str3 = str4;
                                                                                                                    str68 = str8;
                                                                                                                    str69 = str2;
                                                                                                                    a5 = atds;
                                                                                                                    str2 = str7;
                                                                                                                    str67 = str6;
                                                                                                                    str4 = askf;
                                                                                                                    str35 = str5;
                                                                                                                    j33 = j5;
                                                                                                                    j18 = j4;
                                                                                                                    j32 = j3;
                                                                                                                    str8 = obj;
                                                                                                                    a3 = m75400a(j20, a2);
                                                                                                                    j19 = j20;
                                                                                                                    i = i2;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    j26 = j19;
                                                                                                                    str52 = str68;
                                                                                                                    str53 = str3;
                                                                                                                    str51 = str67;
                                                                                                                    j27 = j32;
                                                                                                                    j28 = j33;
                                                                                                                    j29 = j14;
                                                                                                                    str54 = str42;
                                                                                                                    str55 = str35;
                                                                                                                    askf8 = askf6;
                                                                                                                    str3 = str56;
                                                                                                                    try {
                                                                                                                        throw new IllegalArgumentException(str57.length() == 0 ? new String("Unknown bundle type ") : "Unknown bundle type ".concat(str57));
                                                                                                                    } catch (IOException e45) {
                                                                                                                        break;
                                                                                                                    } catch (atfh e46) {
                                                                                                                        e = e46;
                                                                                                                        atfh = e;
                                                                                                                        str2 = str51;
                                                                                                                        r14 = str52;
                                                                                                                        str4 = str53;
                                                                                                                        if (!athh.m75883a(askf7, atfh)) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    } else if (str97.equals("needs_refresh")) {
                                                                                                        c2 = 0;
                                                                                                        if (c2 != 0) {
                                                                                                        }
                                                                                                        btlj = (btlj) btll.f149376k.mo74144da();
                                                                                                        if (!btlj.f164950c) {
                                                                                                        }
                                                                                                        btll btll3 = (btll) btlj.f164949b;
                                                                                                        a10.getClass();
                                                                                                        btll3.f149378a = a10;
                                                                                                        String str992 = str2.f149047b;
                                                                                                        str992.getClass();
                                                                                                        btll3.f149379b = str992;
                                                                                                        str2.getClass();
                                                                                                        btll3.f149380c = str2;
                                                                                                        btli.getClass();
                                                                                                        btll3.f149381d = btli;
                                                                                                        btmd2.getClass();
                                                                                                        btll3.f149382e = btmd2;
                                                                                                        str98.getClass();
                                                                                                        String str1002 = str98;
                                                                                                        btll3.f149383f = str1002;
                                                                                                        btlj.mo70825b(atrp.f90732a);
                                                                                                        switch (str96.hashCode()) {
                                                                                                            case -1688490866:
                                                                                                                break;
                                                                                                            case -1426184971:
                                                                                                                break;
                                                                                                            case -1245210692:
                                                                                                                break;
                                                                                                            case -905486322:
                                                                                                                break;
                                                                                                            case -377015583:
                                                                                                                break;
                                                                                                            case -152778304:
                                                                                                                break;
                                                                                                            case 309674061:
                                                                                                                break;
                                                                                                            case 366259608:
                                                                                                                break;
                                                                                                            case 368951431:
                                                                                                                break;
                                                                                                            case 434689600:
                                                                                                                break;
                                                                                                            case 804254209:
                                                                                                                break;
                                                                                                            case 959178788:
                                                                                                                break;
                                                                                                            case 1640769725:
                                                                                                                break;
                                                                                                            case 2000139462:
                                                                                                                break;
                                                                                                        }
                                                                                                        switch (c3) {
                                                                                                        }
                                                                                                    }
                                                                                                } else if (str97.equals("active")) {
                                                                                                    c2 = 2;
                                                                                                    if (c2 != 0) {
                                                                                                    }
                                                                                                    btlj = (btlj) btll.f149376k.mo74144da();
                                                                                                    if (!btlj.f164950c) {
                                                                                                    }
                                                                                                    btll btll32 = (btll) btlj.f164949b;
                                                                                                    a10.getClass();
                                                                                                    btll32.f149378a = a10;
                                                                                                    String str9922 = str2.f149047b;
                                                                                                    str9922.getClass();
                                                                                                    btll32.f149379b = str9922;
                                                                                                    str2.getClass();
                                                                                                    btll32.f149380c = str2;
                                                                                                    btli.getClass();
                                                                                                    btll32.f149381d = btli;
                                                                                                    btmd2.getClass();
                                                                                                    btll32.f149382e = btmd2;
                                                                                                    str98.getClass();
                                                                                                    String str10022 = str98;
                                                                                                    btll32.f149383f = str10022;
                                                                                                    btlj.mo70825b(atrp.f90732a);
                                                                                                    switch (str96.hashCode()) {
                                                                                                        case -1688490866:
                                                                                                            break;
                                                                                                        case -1426184971:
                                                                                                            break;
                                                                                                        case -1245210692:
                                                                                                            break;
                                                                                                        case -905486322:
                                                                                                            break;
                                                                                                        case -377015583:
                                                                                                            break;
                                                                                                        case -152778304:
                                                                                                            break;
                                                                                                        case 309674061:
                                                                                                            break;
                                                                                                        case 366259608:
                                                                                                            break;
                                                                                                        case 368951431:
                                                                                                            break;
                                                                                                        case 434689600:
                                                                                                            break;
                                                                                                        case 804254209:
                                                                                                            break;
                                                                                                        case 959178788:
                                                                                                            break;
                                                                                                        case 1640769725:
                                                                                                            break;
                                                                                                        case 2000139462:
                                                                                                            break;
                                                                                                    }
                                                                                                    switch (c3) {
                                                                                                    }
                                                                                                }
                                                                                                c2 = 65535;
                                                                                                if (c2 != 0) {
                                                                                                }
                                                                                                try {
                                                                                                    btlj = (btlj) btll.f149376k.mo74144da();
                                                                                                    if (!btlj.f164950c) {
                                                                                                    }
                                                                                                    btll btll322 = (btll) btlj.f164949b;
                                                                                                    a10.getClass();
                                                                                                    btll322.f149378a = a10;
                                                                                                    String str99222 = str2.f149047b;
                                                                                                    str99222.getClass();
                                                                                                    btll322.f149379b = str99222;
                                                                                                    str2.getClass();
                                                                                                    btll322.f149380c = str2;
                                                                                                    btli.getClass();
                                                                                                    btll322.f149381d = btli;
                                                                                                    btmd2.getClass();
                                                                                                    btll322.f149382e = btmd2;
                                                                                                    str98.getClass();
                                                                                                    String str100222 = str98;
                                                                                                    btll322.f149383f = str100222;
                                                                                                    btlj.mo70825b(atrp.f90732a);
                                                                                                    switch (str96.hashCode()) {
                                                                                                        case -1688490866:
                                                                                                            break;
                                                                                                        case -1426184971:
                                                                                                            break;
                                                                                                        case -1245210692:
                                                                                                            break;
                                                                                                        case -905486322:
                                                                                                            break;
                                                                                                        case -377015583:
                                                                                                            break;
                                                                                                        case -152778304:
                                                                                                            break;
                                                                                                        case 309674061:
                                                                                                            break;
                                                                                                        case 366259608:
                                                                                                            break;
                                                                                                        case 368951431:
                                                                                                            break;
                                                                                                        case 434689600:
                                                                                                            break;
                                                                                                        case 804254209:
                                                                                                            break;
                                                                                                        case 959178788:
                                                                                                            break;
                                                                                                        case 1640769725:
                                                                                                            break;
                                                                                                        case 2000139462:
                                                                                                            break;
                                                                                                    }
                                                                                                    switch (c3) {
                                                                                                    }
                                                                                                } catch (IOException e47) {
                                                                                                    throw new atcz("Error calling InitiateReplenish");
                                                                                                } catch (atfh e48) {
                                                                                                    e = e48;
                                                                                                    j26 = j19;
                                                                                                    str52 = str68;
                                                                                                    str53 = str3;
                                                                                                    str51 = str67;
                                                                                                    j27 = j32;
                                                                                                    j28 = j33;
                                                                                                    j29 = j14;
                                                                                                    str54 = str42;
                                                                                                    str55 = str35;
                                                                                                    askf8 = askf6;
                                                                                                    str3 = str56;
                                                                                                    atfh = e;
                                                                                                    str2 = str51;
                                                                                                    r14 = str52;
                                                                                                    str4 = str53;
                                                                                                    if (!athh.m75883a(askf7, atfh)) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (IOException e49) {
                                                                                                throw new atcz("Error calling InitiateReplenish");
                                                                                            } catch (atfh e50) {
                                                                                            } catch (atcz | aths e51) {
                                                                                            } catch (atdb e52) {
                                                                                            } catch (RuntimeException e53) {
                                                                                            }
                                                                                        } catch (IOException e54) {
                                                                                            e = e54;
                                                                                            throw new atcz("Error getting attestation verdict", e);
                                                                                        } catch (atfh e55) {
                                                                                            e = e55;
                                                                                            throw new atcz("Error getting attestation verdict", e);
                                                                                        }
                                                                                    } catch (aths e56) {
                                                                                    } catch (atcz e57) {
                                                                                    } catch (atdb e58) {
                                                                                    } catch (RuntimeException e59) {
                                                                                        e = e59;
                                                                                        str48 = str68;
                                                                                        askf5 = str4;
                                                                                        j21 = j32;
                                                                                        j22 = j33;
                                                                                        str46 = str42;
                                                                                        str47 = str35;
                                                                                        String str862 = str3;
                                                                                        Object obj32 = str46;
                                                                                        runtimeException = e;
                                                                                        str6 = str67;
                                                                                        str2 = str82;
                                                                                        obj = obj32;
                                                                                        bnsl bnsl142222222 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl142222222.mo68437a(runtimeException);
                                                                                        bnsl142222222.mo68432a(str8, str4, 260, str2);
                                                                                        String str832222222 = str5;
                                                                                        bnsl142222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str832222222);
                                                                                        mo49781a();
                                                                                        a = atbm.m75387a(askf, str832222222, System.currentTimeMillis(), true);
                                                                                        if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                                        }
                                                                                    } catch (Throwable th13) {
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    str8 = str68;
                                                                                    str6 = str67;
                                                                                    atds = a5;
                                                                                    askf = str4;
                                                                                    j3 = j32;
                                                                                    j5 = j33;
                                                                                    str2 = str82;
                                                                                    j4 = j14;
                                                                                    obj = str42;
                                                                                    str5 = str35;
                                                                                    str4 = str3;
                                                                                    try {
                                                                                        throw new IllegalArgumentException();
                                                                                    } catch (aths e60) {
                                                                                        e = e60;
                                                                                        str15 = str14;
                                                                                        str16 = str6;
                                                                                        askf2 = askf;
                                                                                        str13 = str5;
                                                                                        j6 = 100;
                                                                                        th2 = e;
                                                                                        bnsl bnsl1222222222 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl1222222222.mo68437a(th2);
                                                                                        bnsl1222222222.mo68432a(str8, str4, 254, str2);
                                                                                        bnsl1222222222.mo68405a("Backing off");
                                                                                        mo49781a();
                                                                                        atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                        str10 = obj;
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (atcz e61) {
                                                                                        e = e61;
                                                                                        str15 = str14;
                                                                                        str16 = str6;
                                                                                        askf2 = askf;
                                                                                        str13 = str5;
                                                                                        j6 = 100;
                                                                                        th2 = e;
                                                                                        bnsl bnsl12222222222 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl12222222222.mo68437a(th2);
                                                                                        bnsl12222222222.mo68432a(str8, str4, 254, str2);
                                                                                        bnsl12222222222.mo68405a("Backing off");
                                                                                        mo49781a();
                                                                                        atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                                        str10 = obj;
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (atdb e63) {
                                                                                        str11 = str14;
                                                                                        str9 = str6;
                                                                                        atdb = e63;
                                                                                        bnsl bnsl922222222 = (bnsl) f90017a.mo68388c();
                                                                                        bnsl922222222.mo68437a(atdb);
                                                                                        bnsl922222222.mo68432a(str8, (String) str4, 257, str2);
                                                                                        bnsl922222222.mo68405a("Bundle gone while processing it");
                                                                                        atcs = new atcs(j4, j4);
                                                                                        str10 = obj;
                                                                                        str65 = str10;
                                                                                        str67 = str9;
                                                                                        j2 = Math.min(j3, atcs.f90092a);
                                                                                        str66 = str4;
                                                                                        str68 = str8;
                                                                                        str69 = str2;
                                                                                        str12 = str7;
                                                                                        str63 = str11;
                                                                                        j = Math.min(j5, atcs.f90093b);
                                                                                    } catch (RuntimeException e64) {
                                                                                    }
                                                                            }
                                                                        } catch (IOException e65) {
                                                                        } catch (atfh e66) {
                                                                            atfh = e66;
                                                                            j20 = j19;
                                                                            r14 = str68;
                                                                            str4 = str3;
                                                                            str2 = str67;
                                                                            j23 = j32;
                                                                            j25 = j33;
                                                                            str3 = str82;
                                                                            j24 = j14;
                                                                            obj2 = str42;
                                                                            str50 = str35;
                                                                            askf7 = askf6;
                                                                            if (!athh.m75883a(askf7, atfh)) {
                                                                            }
                                                                        } catch (atcz | aths e67) {
                                                                            th3 = e67;
                                                                            str21 = str68;
                                                                            str18 = str3;
                                                                            str23 = str67;
                                                                            j7 = j32;
                                                                            j8 = j33;
                                                                            str20 = str82;
                                                                            str24 = str14;
                                                                            str19 = str42;
                                                                            str22 = str35;
                                                                            askf2 = askf;
                                                                            str17 = str18;
                                                                            j6 = 100;
                                                                            str4 = str17;
                                                                            bnsl bnsl122222222222 = (bnsl) f90017a.mo68388c();
                                                                            bnsl122222222222.mo68437a(th2);
                                                                            bnsl122222222222.mo68432a(str8, str4, 254, str2);
                                                                            bnsl122222222222.mo68405a("Backing off");
                                                                            mo49781a();
                                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                            str10 = obj;
                                                                            str65 = str10;
                                                                            str67 = str9;
                                                                            j2 = Math.min(j3, atcs.f90092a);
                                                                            str66 = str4;
                                                                            str68 = str8;
                                                                            str69 = str2;
                                                                            str12 = str7;
                                                                            str63 = str11;
                                                                            j = Math.min(j5, atcs.f90093b);
                                                                        } catch (atdb e68) {
                                                                        } catch (RuntimeException e69) {
                                                                            RuntimeException runtimeException2 = e69;
                                                                            String str108 = str68;
                                                                            Object obj7 = str3;
                                                                            String str109 = str67;
                                                                            long j45 = j32;
                                                                            long j46 = j33;
                                                                            String str110 = str82;
                                                                            obj = str42;
                                                                            str5 = str35;
                                                                            str8 = str108;
                                                                            str4 = obj7;
                                                                            bnsl bnsl1422222222 = (bnsl) f90017a.mo68388c();
                                                                            bnsl1422222222.mo68437a(runtimeException);
                                                                            bnsl1422222222.mo68432a(str8, str4, 260, str2);
                                                                            String str8322222222 = str5;
                                                                            bnsl1422222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str8322222222);
                                                                            mo49781a();
                                                                            a = atbm.m75387a(askf, str8322222222, System.currentTimeMillis(), true);
                                                                            if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (aths e70) {
                                                                    e = e70;
                                                                    str39 = str68;
                                                                    askf4 = str4;
                                                                    j16 = j32;
                                                                    j17 = j33;
                                                                    str36 = str82;
                                                                    str38 = str42;
                                                                    str40 = str3;
                                                                    th4 = e;
                                                                    str37 = str67;
                                                                    str24 = str14;
                                                                    str22 = str35;
                                                                    askf2 = askf;
                                                                    str17 = str18;
                                                                    j6 = 100;
                                                                    str4 = str17;
                                                                    bnsl bnsl1222222222222 = (bnsl) f90017a.mo68388c();
                                                                    bnsl1222222222222.mo68437a(th2);
                                                                    bnsl1222222222222.mo68432a(str8, str4, 254, str2);
                                                                    bnsl1222222222222.mo68405a("Backing off");
                                                                    mo49781a();
                                                                    atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                    str10 = obj;
                                                                    str65 = str10;
                                                                    str67 = str9;
                                                                    j2 = Math.min(j3, atcs.f90092a);
                                                                    str66 = str4;
                                                                    str68 = str8;
                                                                    str69 = str2;
                                                                    str12 = str7;
                                                                    str63 = str11;
                                                                    j = Math.min(j5, atcs.f90093b);
                                                                } catch (atcz e71) {
                                                                    e = e71;
                                                                    str39 = str68;
                                                                    askf4 = str4;
                                                                    j16 = j32;
                                                                    j17 = j33;
                                                                    str36 = str82;
                                                                    str38 = str42;
                                                                    str40 = str3;
                                                                    th4 = e;
                                                                    str37 = str67;
                                                                    str24 = str14;
                                                                    str22 = str35;
                                                                    askf2 = askf;
                                                                    str17 = str18;
                                                                    j6 = 100;
                                                                    str4 = str17;
                                                                    bnsl bnsl12222222222222 = (bnsl) f90017a.mo68388c();
                                                                    bnsl12222222222222.mo68437a(th2);
                                                                    bnsl12222222222222.mo68432a(str8, str4, 254, str2);
                                                                    bnsl12222222222222.mo68405a("Backing off");
                                                                    mo49781a();
                                                                    atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                                    str10 = obj;
                                                                    str65 = str10;
                                                                    str67 = str9;
                                                                    j2 = Math.min(j3, atcs.f90092a);
                                                                    str66 = str4;
                                                                    str68 = str8;
                                                                    str69 = str2;
                                                                    str12 = str7;
                                                                    str63 = str11;
                                                                    j = Math.min(j5, atcs.f90093b);
                                                                } catch (atdb e72) {
                                                                    e = e72;
                                                                    str27 = str68;
                                                                    str28 = str3;
                                                                    j9 = j32;
                                                                    j11 = j33;
                                                                    str25 = str82;
                                                                    j10 = j14;
                                                                    str26 = str42;
                                                                    atdb3 = e;
                                                                    String str1012 = str67;
                                                                    str11 = str14;
                                                                    bnsl bnsl9222222222 = (bnsl) f90017a.mo68388c();
                                                                    bnsl9222222222.mo68437a(atdb);
                                                                    bnsl9222222222.mo68432a(str8, (String) str4, 257, str2);
                                                                    bnsl9222222222.mo68405a("Bundle gone while processing it");
                                                                    atcs = new atcs(j4, j4);
                                                                    str10 = obj;
                                                                    str65 = str10;
                                                                    str67 = str9;
                                                                    j2 = Math.min(j3, atcs.f90092a);
                                                                    str66 = str4;
                                                                    str68 = str8;
                                                                    str69 = str2;
                                                                    str12 = str7;
                                                                    str63 = str11;
                                                                    j = Math.min(j5, atcs.f90093b);
                                                                } catch (RuntimeException e73) {
                                                                    e = e73;
                                                                    str34 = str68;
                                                                    str32 = str67;
                                                                    atds2 = a5;
                                                                    askf3 = str4;
                                                                    j12 = j32;
                                                                    j13 = j33;
                                                                    str33 = str82;
                                                                    str29 = str42;
                                                                    str31 = str35;
                                                                    str4 = str3;
                                                                    obj = str29;
                                                                    runtimeException = e;
                                                                    obj = obj;
                                                                    bnsl bnsl14222222222 = (bnsl) f90017a.mo68388c();
                                                                    bnsl14222222222.mo68437a(runtimeException);
                                                                    bnsl14222222222.mo68432a(str8, str4, 260, str2);
                                                                    String str83222222222 = str5;
                                                                    bnsl14222222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str83222222222);
                                                                    mo49781a();
                                                                    a = atbm.m75387a(askf, str83222222222, System.currentTimeMillis(), true);
                                                                    if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                                    }
                                                                }
                                                            }
                                                            atxy.f91100b.set(elapsedRealtime);
                                                            atxy.f91101c.set(1);
                                                            str8 = i + 1;
                                                            str43 = a2.f90103d;
                                                            int i42 = 3;
                                                            switch (str43.hashCode()) {
                                                                case -1422950650:
                                                                    break;
                                                                case -766681394:
                                                                    break;
                                                                case 407754553:
                                                                    break;
                                                                case 693933934:
                                                                    break;
                                                                case 881487833:
                                                                    break;
                                                                case 1550463001:
                                                                    break;
                                                                case 1698062945:
                                                                    break;
                                                            }
                                                            switch (c) {
                                                            }
                                                        } catch (aths e74) {
                                                            e = e74;
                                                            askf4 = str4;
                                                            str38 = str8;
                                                            ? r325 = str2;
                                                            j16 = j32;
                                                            j17 = j33;
                                                            str36 = str82;
                                                            str39 = str68;
                                                            str40 = str3;
                                                            th4 = e;
                                                            str37 = str67;
                                                            str24 = str14;
                                                            str22 = str35;
                                                            askf2 = askf;
                                                            str17 = str18;
                                                            j6 = 100;
                                                            str4 = str17;
                                                            bnsl bnsl122222222222222 = (bnsl) f90017a.mo68388c();
                                                            bnsl122222222222222.mo68437a(th2);
                                                            bnsl122222222222222.mo68432a(str8, str4, 254, str2);
                                                            bnsl122222222222222.mo68405a("Backing off");
                                                            mo49781a();
                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                            str10 = obj;
                                                            str65 = str10;
                                                            str67 = str9;
                                                            j2 = Math.min(j3, atcs.f90092a);
                                                            str66 = str4;
                                                            str68 = str8;
                                                            str69 = str2;
                                                            str12 = str7;
                                                            str63 = str11;
                                                            j = Math.min(j5, atcs.f90093b);
                                                        } catch (atcz e75) {
                                                            e = e75;
                                                            askf4 = str4;
                                                            str38 = str8;
                                                            ? r3252 = str2;
                                                            j16 = j32;
                                                            j17 = j33;
                                                            str36 = str82;
                                                            str39 = str68;
                                                            str40 = str3;
                                                            th4 = e;
                                                            str37 = str67;
                                                            str24 = str14;
                                                            str22 = str35;
                                                            askf2 = askf;
                                                            str17 = str18;
                                                            j6 = 100;
                                                            str4 = str17;
                                                            bnsl bnsl1222222222222222 = (bnsl) f90017a.mo68388c();
                                                            bnsl1222222222222222.mo68437a(th2);
                                                            bnsl1222222222222222.mo68432a(str8, str4, 254, str2);
                                                            bnsl1222222222222222.mo68405a("Backing off");
                                                            mo49781a();
                                                            atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                                            str10 = obj;
                                                            str65 = str10;
                                                            str67 = str9;
                                                            j2 = Math.min(j3, atcs.f90092a);
                                                            str66 = str4;
                                                            str68 = str8;
                                                            str69 = str2;
                                                            str12 = str7;
                                                            str63 = str11;
                                                            j = Math.min(j5, atcs.f90093b);
                                                        } catch (atdb e76) {
                                                            e = e76;
                                                            str28 = str3;
                                                            str26 = str8;
                                                            r32 = str2;
                                                            j9 = j32;
                                                            j11 = j33;
                                                            str25 = str82;
                                                            j10 = j14;
                                                            str27 = str68;
                                                            atdb3 = e;
                                                            String str10122 = str67;
                                                            str11 = str14;
                                                            bnsl bnsl92222222222 = (bnsl) f90017a.mo68388c();
                                                            bnsl92222222222.mo68437a(atdb);
                                                            bnsl92222222222.mo68432a(str8, (String) str4, 257, str2);
                                                            bnsl92222222222.mo68405a("Bundle gone while processing it");
                                                            atcs = new atcs(j4, j4);
                                                            str10 = obj;
                                                            str65 = str10;
                                                            str67 = str9;
                                                            j2 = Math.min(j3, atcs.f90092a);
                                                            str66 = str4;
                                                            str68 = str8;
                                                            str69 = str2;
                                                            str12 = str7;
                                                            str63 = str11;
                                                            j = Math.min(j5, atcs.f90093b);
                                                        } catch (RuntimeException e77) {
                                                            e = e77;
                                                            str32 = str67;
                                                            atds2 = a5;
                                                            askf3 = str4;
                                                            str30 = str8;
                                                            r322 = str2;
                                                            j12 = j32;
                                                            j13 = j33;
                                                            str33 = str82;
                                                            str31 = str35;
                                                            str34 = str68;
                                                            str29 = str30;
                                                            str4 = str3;
                                                            obj = str29;
                                                            runtimeException = e;
                                                            obj = obj;
                                                            bnsl bnsl142222222222 = (bnsl) f90017a.mo68388c();
                                                            bnsl142222222222.mo68437a(runtimeException);
                                                            bnsl142222222222.mo68432a(str8, str4, 260, str2);
                                                            String str832222222222 = str5;
                                                            bnsl142222222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str832222222222);
                                                            mo49781a();
                                                            a = atbm.m75387a(askf, str832222222222, System.currentTimeMillis(), true);
                                                            if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw new atcz("Max amount of steps exceeded");
                                    } catch (atcz | aths e78) {
                                    } catch (atdb e79) {
                                        e = e79;
                                        j10 = j18;
                                        str28 = str3;
                                        str26 = str8;
                                        r32 = str2;
                                        j9 = j32;
                                        j11 = j33;
                                        str25 = str69;
                                        str27 = str68;
                                        atdb3 = e;
                                        String str101222 = str67;
                                        str11 = str14;
                                        bnsl bnsl922222222222 = (bnsl) f90017a.mo68388c();
                                        bnsl922222222222.mo68437a(atdb);
                                        bnsl922222222222.mo68432a(str8, (String) str4, 257, str2);
                                        bnsl922222222222.mo68405a("Bundle gone while processing it");
                                        atcs = new atcs(j4, j4);
                                        str10 = obj;
                                        str65 = str10;
                                        str67 = str9;
                                        j2 = Math.min(j3, atcs.f90092a);
                                        str66 = str4;
                                        str68 = str8;
                                        str69 = str2;
                                        str12 = str7;
                                        str63 = str11;
                                        j = Math.min(j5, atcs.f90093b);
                                    } catch (RuntimeException e80) {
                                    }
                                } catch (atcz | aths e81) {
                                    askf = str4;
                                    str7 = str2;
                                    j7 = j32;
                                    j8 = j33;
                                    str19 = str71;
                                    str20 = str69;
                                    str21 = str68;
                                    str18 = str3;
                                    th3 = e81;
                                    str22 = str70;
                                    str23 = str67;
                                    str24 = str63;
                                    askf2 = askf;
                                    str17 = str18;
                                    j6 = 100;
                                    str4 = str17;
                                    bnsl bnsl12222222222222222 = (bnsl) f90017a.mo68388c();
                                    bnsl12222222222222222.mo68437a(th2);
                                    bnsl12222222222222222.mo68432a(str8, str4, 254, str2);
                                    bnsl12222222222222222.mo68405a("Backing off");
                                    mo49781a();
                                    atcs = m75402a(atbm.m75387a(askf2, str13, System.currentTimeMillis(), false));
                                    str10 = obj;
                                    str65 = str10;
                                    str67 = str9;
                                    j2 = Math.min(j3, atcs.f90092a);
                                    str66 = str4;
                                    str68 = str8;
                                    str69 = str2;
                                    str12 = str7;
                                    str63 = str11;
                                    j = Math.min(j5, atcs.f90093b);
                                } catch (atdb e83) {
                                    e = e83;
                                    j10 = millis;
                                    str28 = str3;
                                    str14 = str63;
                                    r32 = str2;
                                    j9 = j32;
                                    j11 = j33;
                                    str26 = str71;
                                    str25 = str69;
                                    str27 = str68;
                                    atdb3 = e;
                                    String str1012222 = str67;
                                    str11 = str14;
                                    bnsl bnsl9222222222222 = (bnsl) f90017a.mo68388c();
                                    bnsl9222222222222.mo68437a(atdb);
                                    bnsl9222222222222.mo68432a(str8, (String) str4, 257, str2);
                                    bnsl9222222222222.mo68405a("Bundle gone while processing it");
                                    atcs = new atcs(j4, j4);
                                    str10 = obj;
                                    str65 = str10;
                                    str67 = str9;
                                    j2 = Math.min(j3, atcs.f90092a);
                                    str66 = str4;
                                    str68 = str8;
                                    str69 = str2;
                                    str12 = str7;
                                    str63 = str11;
                                    j = Math.min(j5, atcs.f90093b);
                                } catch (RuntimeException e84) {
                                    e = e84;
                                    str31 = str70;
                                    str32 = str67;
                                    atds2 = a5;
                                    askf3 = str4;
                                    str14 = str63;
                                    r322 = str2;
                                    j12 = j32;
                                    j13 = j33;
                                    String str111 = str71;
                                    str33 = str69;
                                    str30 = str111;
                                    str34 = str68;
                                    str29 = str30;
                                    str4 = str3;
                                    obj = str29;
                                    runtimeException = e;
                                    obj = obj;
                                    bnsl bnsl1422222222222 = (bnsl) f90017a.mo68388c();
                                    bnsl1422222222222.mo68437a(runtimeException);
                                    bnsl1422222222222.mo68432a(str8, str4, 260, str2);
                                    String str8322222222222 = str5;
                                    bnsl1422222222222.mo68420a("Unexpected error updating bundle %s, detokenizing card", str8322222222222);
                                    mo49781a();
                                    a = atbm.m75387a(askf, str8322222222222, System.currentTimeMillis(), true);
                                    if (((long) a.f165755d) < cgxi.f187963a.mo6606a().mo84675f()) {
                                    }
                                }
                            } catch (atfh | IOException e85) {
                                str5 = str70;
                                j4 = millis;
                                str6 = str67;
                                atds = a5;
                                askf = str4;
                                str14 = str63;
                                str7 = str2;
                                j3 = j32;
                                j5 = j33;
                                obj = str71;
                                str2 = str69;
                                str8 = str68;
                                str4 = str3;
                                throw new atcz("Getting storage key failed", e85);
                            } catch (IOException e86) {
                                throw new atcz(e86);
                            } catch (atfh e87) {
                            } catch (IOException e122) {
                            } catch (atfh e88) {
                                e = e88;
                                atda = a2;
                                str45 = str2;
                                str2 = str44;
                                a2 = m75405a(e, atda);
                                str3 = str4;
                                str68 = str8;
                                str69 = str2;
                                a5 = atds;
                                str2 = str7;
                                str67 = str6;
                                str4 = askf;
                                str35 = str5;
                                j33 = j5;
                                j18 = j4;
                                j32 = j3;
                                str8 = obj;
                                a3 = m75400a(j20, a2);
                                j19 = j20;
                                i = i2;
                            } catch (atcz | aths e89) {
                                e = e89;
                                obj = obj;
                                str4 = str4;
                            } catch (atdb e90) {
                                e = e90;
                                str4 = str4;
                                atdb2 = e;
                                str59 = str4;
                                str11 = str14;
                                str9 = str6;
                                bnsl bnsl92222222222222 = (bnsl) f90017a.mo68388c();
                                bnsl92222222222222.mo68437a(atdb);
                                bnsl92222222222222.mo68432a(str8, (String) str4, 257, str2);
                                bnsl92222222222222.mo68405a("Bundle gone while processing it");
                                atcs = new atcs(j4, j4);
                                str10 = obj;
                                str65 = str10;
                                str67 = str9;
                                j2 = Math.min(j3, atcs.f90092a);
                                str66 = str4;
                                str68 = str8;
                                str69 = str2;
                                str12 = str7;
                                str63 = str11;
                                j = Math.min(j5, atcs.f90093b);
                            } catch (RuntimeException e642) {
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            th = th;
                            f90022f.unlock();
                            throw th;
                        }
                    }
                    String str112 = str69;
                    String str113 = str68;
                    long j47 = j2;
                    String str114 = str67;
                    long j48 = j;
                    if (cgwd.m147195c()) {
                        if (!cgwd.m147194b().equals("REGISTRATION_MODE_DISABLED") || !asqo.m74468a(context).isEmpty()) {
                            asuu.m74874a(context, 5, true);
                        }
                    }
                    if (j47 != Long.MAX_VALUE) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(j47 - currentTimeMillis3);
                        long seconds2 = TimeUnit.MILLISECONDS.toSeconds(j48 - currentTimeMillis3);
                        long max = Math.max(0L, seconds);
                        long max2 = Math.max(1 + max, seconds2);
                        aebi aebi = new aebi();
                        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                        aebi.f63099k = "Oneoff";
                        aebi.mo34023a(0);
                        aebi.mo34004a(max, max2);
                        aebi.mo34027b(1);
                        aeat.m51532a(context).mo33984a(aebi.mo33974b());
                    }
                    bnsl bnsl20 = (bnsl) f90017a.mo68390d();
                    bnsl20.mo68432a(str113, str114, 193, str112);
                    bnsl20.mo68405a("Finished maintaining payment bundles");
                    reentrantLock = f90022f;
                } else {
                    reentrantLock = f90022f;
                }
                reentrantLock.unlock();
                return;
            } catch (atdb e91) {
                atdb atdb7 = e91;
                bnsl bnsl21 = (bnsl) f90017a.mo68388c();
                bnsl21.mo68437a(atdb7);
                String str115 = str6;
                bnsl21.mo68432a(str8, str115, 279, str2);
                String str116 = str14;
                bnsl21.mo68405a(str116);
            } catch (Throwable th15) {
                th = th15;
                th = th;
                f90022f.unlock();
                throw th;
            }
        } else {
            return;
        }
        long currentTimeMillis4 = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(100);
        atcs = new atcs(currentTimeMillis4, currentTimeMillis4);
        str10 = obj;
        str65 = str10;
        str67 = str9;
        j2 = Math.min(j3, atcs.f90092a);
        str66 = str4;
        str68 = str8;
        str69 = str2;
        str12 = str7;
        str63 = str11;
        j = Math.min(j5, atcs.f90093b);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r6 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r6 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[Catch:{ all -> 0x0170, all -> 0x0178, all -> 0x016a, asks -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016f A[RETURN] */
    /* renamed from: a */
    public final void mo49784a(askf askf, atda atda) {
        Throwable th;
        bngm bngm;
        asqs asqs;
        Set<String> set;
        SQLiteDatabase a;
        askf askf2 = askf;
        atda atda2 = atda;
        if (atda2 == null) {
            bnsl bnsl = (bnsl) f90017a.mo68388c();
            bnsl.mo68432a("atbq", "a", 1092, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Token is null");
            return;
        }
        srn srn = atdg.f90116a;
        Cursor query = atdg.m75596a(askf2.f89126d).query("PaymentBundles", new String[]{"supported_aids"}, "bundle_id = ? AND account_id = ? AND environment = ?", atdg.m75598a(atda2.f90102c, askf2), null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                if (blob != null) {
                    bngm = bnic.m109495a((Collection) atdg.m75597a(blob).f165758a);
                } else {
                    bngm = bnon.f131923a;
                    if (query != null) {
                    }
                    if (!bngm.isEmpty()) {
                        String str = atda2.f90102c;
                        atcv atcv = atda2.f90108i;
                        if (atcv == null) {
                            bnsl bnsl2 = (bnsl) f90017a.mo68387b();
                            bnsl2.mo68432a("atbq", "b", 1063, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Bundle adapter not set");
                            asqs = null;
                        } else {
                            asqs = atcv.mo49793a(askf2, new aszu(askf2.f89126d, aszu.m75260a(atcv.mo49805g()), new asqw()), atda2.f90102c);
                        }
                        if (asqs == null) {
                            bnsl bnsl3 = (bnsl) f90017a.mo68387b();
                            bnsl3.mo68432a("atbq", "c", 1079, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("Payment applet is null");
                            set = bnon.f131923a;
                        } else {
                            bnia bnia = new bnia();
                            for (astc astc : asqs.mo49386a()) {
                                bnia.mo67629b(astc.toString());
                            }
                            set = bnia.mo67751a();
                        }
                        if (set.isEmpty()) {
                            bnsl bnsl4 = (bnsl) atdg.f90116a.mo68387b();
                            bnsl4.mo68432a("atdg", "a", (int) ErrorInfo.TYPE_SDU_MEMORY_FULL, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Received empty set of AIDs.");
                        } else {
                            a = atdg.m75596a(askf2.f89126d);
                            a.beginTransaction();
                            bydb bydb = (bydb) bydc.f165756b.mo74144da();
                            for (String str2 : set) {
                                if (str2.isEmpty()) {
                                    bnsl bnsl5 = (bnsl) atdg.f90116a.mo68387b();
                                    bnsl5.mo68432a("atdg", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl5.mo68405a("Received empty AID value.");
                                    a.endTransaction();
                                } else {
                                    bydb.mo74346a(str2);
                                }
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("supported_aids", ((bydc) bydb.mo74062i()).mo73642k());
                            a.update("PaymentBundles", contentValues, "bundle_id = ? AND account_id = ? AND environment = ?", atdg.m75598a(str, askf2));
                            a.setTransactionSuccessful();
                            a.endTransaction();
                            return;
                        }
                        bnsl bnsl6 = (bnsl) f90017a.mo68388c();
                        bnsl6.mo68432a("atbq", "a", 1104, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Error setting supported AIDs");
                        return;
                    }
                    return;
                }
            } else {
                bngm = bnon.f131923a;
            }
            query.close();
            if (!bngm.isEmpty()) {
            }
        } catch (asks e) {
            bnsl bnsl7 = (bnsl) f90017a.mo68387b();
            bnsl7.mo68437a(e);
            bnsl7.mo68432a("atbq", "a", 1108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl7.mo68405a("Database exception when setting AIDs");
            return;
        } catch (Throwable th2) {
            a.endTransaction();
            throw th2;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo49785a(askf askf, String str) {
        mo49781a();
        if (atbm.m75391a(askf, str, new String[]{"active", "unacknowledged"}, "needs_refresh")) {
            atcj.m75548a(askf.f89126d);
            return;
        }
        bnsl bnsl = (bnsl) f90017a.mo68388c();
        bnsl.mo68432a("atbq", "a", 954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Received DEVICE_TOKEN_REPLENISH notification while bundle in unexpected state");
    }
}
