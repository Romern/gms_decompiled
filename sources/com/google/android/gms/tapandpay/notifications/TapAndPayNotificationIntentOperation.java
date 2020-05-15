package com.google.android.gms.tapandpay.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TapAndPayNotificationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f108615a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    static final askt m93078a() {
        return new askt();
    }

    /* renamed from: b */
    static final atbq m93082b() {
        return new atbq();
    }

    /* renamed from: c */
    static final atwb m93083c() {
        return new atwb();
    }

    /* renamed from: d */
    static final void m93084d() {
        int i = asiv.f89057a;
    }

    /* renamed from: e */
    private final atam m93085e() {
        return atam.m75295a(getApplicationContext(), (String) null);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:51:0x0132 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:214:0x05ca */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:485:0x0a98 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:523:0x0ab8 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:522:0x0ab8 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:282:0x06dc */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:379:0x08cf */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:368:0x0891 */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARN: Type inference failed for: r7v3, assign insn: 0x0014: CONST  (r7v3 ? I:?[int, float, short, byte, char]) = (4 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v5, assign insn: PHI: (r7v5 ?) = (r7v6 ?), (r7v3 ?), (r7v19 ?), (r7v119 ? I:?[int, float, short, byte, char]) binds: [B:495:0x0b1b, B:17:0x005c, B:485:0x0a98, B:15:0x0058] */
    /* JADX WARN: Type inference failed for: r7v6, assign insn: 0x0b17: MOVE  (r7v6 ? I:?[OBJECT, ARRAY]) = (r3v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.String], assign insn: PHI: (r2v16 ?) = (r2v0 java.lang.String), (r2v18 ?) binds: [B:42:?, B:487:0x0ab8] */
    /* JADX WARN: Type inference failed for: r7v10, assign insn: PHI: (r7v10 ?) = (r7v19 ?), (r7v22 ?), (r7v26 ?), (r7v86 ?), (r7v88 ?), (r7v92 ?), (r7v96 ?), (r7v98 ?), (r7v99 ?), (r7v103 ?), (r7v105 ?), (r7v109 ?), (r7v114 ?), (r7v115 ?), (r7v116 ?) binds: [B:509:0x0ab8, B:523:0x0ab8, B:522:0x0ab8, B:521:0x0ab8, B:520:0x0ab8, B:519:0x0ab8, B:518:0x0ab8, B:517:0x0ab8, B:516:0x0ab8, B:515:0x0ab8, B:514:0x0ab8, B:513:0x0ab8, B:512:0x0ab8, B:511:0x0ab8, B:510:0x0ab8] */
    /* JADX WARN: Type inference failed for: r2v18, assign insn: 0x0abf: MOVE  (r2v18 ? I:?[OBJECT, ARRAY]) = (r4v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v18, types: [int], assign insn: PHI: (r7v18 ?) = (r7v110 ?), (r7v122 ?) binds: [B:86:0x01d0, B:85:0x01cd] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.String], assign insn: PHI: (r7v19 ?) = (r7v75 ?), (r7v81 ?), (r7v123 ?), (r7v127 ?) binds: [B:240:0x0655, B:163:0x040b, B:484:0x0a97, B:424:0x09d9] */
    /* JADX WARN: Type inference failed for: r7v20, assign insn: PHI: (r7v20 ?) = (r7v21 java.lang.String), (r7v26 ?), (r7v26 ?) binds: [B:483:0x0a8b, B:478:0x0a80, B:468:0x0a6e] */
    /* JADX WARN: Type inference failed for: r7v22, assign insn: PHI: (r7v22 ?) = (r7v26 ?), (r7v26 ?), (r7v34 ?), (r7v35 ?), (r7v38 ?), (r7v39 ?), (r7v51 ?), (r7v77 ?), (r7v78 ?), (r7v79 ?), (r7v80 ?), (r7v82 ?), (r7v83 ?), (r7v84 ?), (r7v85 ?), (r7v87 ?), (r7v89 ?), (r7v90 ?), (r7v91 ?), (r7v93 ?), (r7v94 ?), (r7v95 ?), (r7v97 ?), (r7v131 ?) binds: [B:466:0x0a5f, B:465:0x0a4c, B:414:0x09ad, B:413:0x099a, B:390:0x0939, B:389:0x092a, B:380:?, B:235:0x063c, B:203:0x05a1, B:202:0x0591, B:197:0x0566, B:186:0x053f, B:184:0x051c, B:183:0x04e1, B:182:0x04aa, B:174:0x046c, B:161:0x03f3, B:160:0x03e3, B:159:0x03cc, B:145:0x035a, B:144:?, B:142:0x031e, B:139:0x02fb, B:412:0x0993] */
    /* JADX WARN: Type inference failed for: r2v22, types: [askf], assign insn: PHI: (r2v22 ?) = (r2v24 ?), (r2v24 ?), (r2v30 ?), (r2v31 ?), (r2v32 ?), (r2v33 ?), (r2v34 ?), (r2v54 ?), (r2v96 ?), (r2v97 ?), (r2v98 ?), (r2v99 ?), (r2v101 ?), (r2v102 ?), (r2v103 ?), (r2v104 ?), (r2v106 ?), (r2v108 ?), (r2v109 ?), (r2v110 ?), (r2v112 ?), (r2v113 ?), (r2v114 ?), (r2v116 ?) binds: [B:466:0x0a5f, B:465:0x0a4c, B:414:0x09ad, B:413:0x099a, B:412:0x0993, B:390:0x0939, B:389:0x092a, B:380:?, B:235:0x063c, B:203:0x05a1, B:202:0x0591, B:197:0x0566, B:186:0x053f, B:184:0x051c, B:183:0x04e1, B:182:0x04aa, B:174:0x046c, B:161:0x03f3, B:160:0x03e3, B:159:0x03cc, B:145:0x035a, B:144:?, B:142:0x031e, B:139:0x02fb] */
    /* JADX WARN: Type inference failed for: r7v23, assign insn: PHI: (r7v23 ?) = (r7v26 ?), (r7v26 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v42 ?), (r7v51 ?) binds: [B:430:0x09ed, B:431:?, B:214:0x05ca, B:217:0x05d8, B:220:0x05de, B:226:0x0608, B:244:0x066a, B:276:0x06c7, B:282:0x06dc, B:379:0x08cf] */
    /* JADX WARN: Type inference failed for: r2v23, assign insn: PHI: (r2v23 ?) = (r2v24 ?), (r2v24 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v36 ?), (r2v54 ?) binds: [B:430:0x09ed, B:431:?, B:214:0x05ca, B:217:0x05d8, B:220:0x05de, B:226:0x0608, B:244:0x066a, B:276:0x06c7, B:282:0x06dc, B:379:0x08cf] */
    /* JADX WARN: Type inference failed for: r7v25, assign insn: PHI: (r7v25 ?) = (r7v26 ?), (r7v26 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v42 ?), (r7v51 ?), (r7v60 ?), (r7v60 ?) binds: [B:430:0x09ed, B:431:?, B:214:0x05ca, B:217:0x05d8, B:220:0x05de, B:226:0x0608, B:244:0x066a, B:276:0x06c7, B:282:0x06dc, B:379:0x08cf, B:368:0x0891, B:369:?] */
    /* JADX WARN: Type inference failed for: r2v24, types: [askf], assign insn: 0x09e6: MOVE  (r2v24 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.String], assign insn: 0x09e7: MOVE  (r7v26 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v28, assign insn: PHI: (r7v28 ?) = (r7v26 ?), (r7v71 ?), (r7v129 ?) binds: [B:448:0x0a1e, B:294:0x0738, B:422:0x09d5] */
    /* JADX WARN: Type inference failed for: r2v26, assign insn: PHI: (r2v26 ?) = (r2v24 ?), (r2v91 ?), (r2v130 ?) binds: [B:448:0x0a1e, B:294:0x0738, B:422:0x09d5] */
    /* JADX WARN: Type inference failed for: r2v30, assign insn: 0x09b7: MOVE  (r2v30 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v34, assign insn: 0x09b8: MOVE  (r7v34 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v31, assign insn: 0x09a4: MOVE  (r2v31 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v35, assign insn: 0x09a5: MOVE  (r7v35 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v32, assign insn: 0x097f: MOVE  (r2v32 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r2v33, assign insn: 0x093f: MOVE  (r2v33 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v38, assign insn: 0x0940: MOVE  (r7v38 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v34, assign insn: 0x0930: MOVE  (r2v34 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v39, assign insn: 0x0931: MOVE  (r7v39 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v42, assign insn: PHI: (r7v42 ?) = (r7v132 ?), (r7v140 ?) binds: [B:279:0x06cf, B:280:0x06d0] */
    /* JADX WARN: Type inference failed for: r2v36, assign insn: 0x06db: CONST  (r2v36 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object[]], assign insn: 0x06dc: NEW_ARRAY  (r3v21 ? I:java.lang.Object[]) = (2 int) type: java.lang.Object[] */
    /* JADX WARN: Type inference failed for: r7v51, assign insn: PHI: (r7v51 ?) = (r7v52 ?), (r7v134 ?) binds: [B:377:0x08bf, B:370:0x08a7] */
    /* JADX WARN: Type inference failed for: r2v54, types: [askf], assign insn: 0x08c7: MOVE  (r2v54 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v52, assign insn: 0x08c1: MOVE  (r7v52 ? I:?[OBJECT, ARRAY]) = (r27v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.String], assign insn: PHI: (r7v60 ?) = (r7v66 ?), (r7v135 ?) binds: [B:353:0x086a, B:367:0x0890] */
    /* JADX WARN: Type inference failed for: r7v63, assign insn: PHI: (r7v63 ?) = (r7v60 ?), (r7v64 ?), (r7v138 ?) binds: [B:369:?, B:363:0x0889, B:360:0x0884] */
    /* JADX WARN: Type inference failed for: r7v64, assign insn: 0x0889: MOVE  (r7v64 ? I:?[OBJECT, ARRAY]) = (r27v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v66, assign insn: 0x086b: MOVE  (r7v66 ? I:?[OBJECT, ARRAY]) = (r27v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v91, assign insn: 0x0739: MOVE  (r2v91 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v71, assign insn: 0x073c: MOVE  (r7v71 ? I:?[OBJECT, ARRAY]) = (r27v0 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v75, assign insn: 0x0659: MOVE  (r7v75 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v96, assign insn: 0x0641: MOVE  (r2v96 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v77, assign insn: 0x0645: MOVE  (r7v77 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v78, assign insn: 0x05ad: MOVE  (r7v78 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v97, assign insn: 0x05ae: MOVE  (r2v97 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v79, assign insn: 0x059d: MOVE  (r7v79 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v98, assign insn: 0x059e: MOVE  (r2v98 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v80, assign insn: 0x0572: MOVE  (r7v80 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v99, assign insn: 0x0573: MOVE  (r2v99 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v81, assign insn: 0x0418: MOVE  (r7v81 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v82, assign insn: 0x054b: MOVE  (r7v82 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v101, assign insn: 0x054c: MOVE  (r2v101 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v83, assign insn: 0x0530: MOVE  (r7v83 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v102, assign insn: 0x0531: MOVE  (r2v102 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v84, assign insn: 0x0518: MOVE  (r7v84 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v103, assign insn: 0x0519: MOVE  (r2v103 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v85, assign insn: 0x04dd: MOVE  (r7v85 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v104, assign insn: 0x04de: MOVE  (r2v104 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v86, assign insn: 0x0495: MOVE  (r7v86 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v105, assign insn: 0x04a0: MOVE  (r2v105 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v87, assign insn: 0x047b: MOVE  (r7v87 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v106, assign insn: 0x047c: MOVE  (r2v106 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v88, assign insn: 0x0432: MOVE  (r7v88 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v107, assign insn: 0x043d: MOVE  (r2v107 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v89, assign insn: 0x0406: MOVE  (r7v89 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v108, assign insn: 0x0407: MOVE  (r2v108 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v90, assign insn: 0x03ef: MOVE  (r7v90 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v109, assign insn: 0x03f0: MOVE  (r2v109 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v91, assign insn: 0x03df: MOVE  (r7v91 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v110, assign insn: 0x03e0: MOVE  (r2v110 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v92, assign insn: 0x039c: MOVE  (r7v92 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v111, assign insn: 0x03a7: MOVE  (r2v111 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v93, assign insn: 0x0376: MOVE  (r7v93 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v112, assign insn: 0x0377: MOVE  (r2v112 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v94, assign insn: 0x0356: MOVE  (r7v94 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v113, assign insn: 0x0357: MOVE  (r2v113 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v95, assign insn: 0x032a: MOVE  (r7v95 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v114, assign insn: 0x032b: MOVE  (r2v114 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v96, assign insn: 0x0310: MOVE  (r7v96 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v115, assign insn: 0x031b: MOVE  (r2v115 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v97, assign insn: 0x0307: MOVE  (r7v97 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v116, assign insn: 0x0308: MOVE  (r2v116 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v98, assign insn: 0x02d6: MOVE  (r7v98 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v117, assign insn: 0x02e1: MOVE  (r2v117 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v99, assign insn: 0x02b2: MOVE  (r7v99 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v118, assign insn: 0x02bd: MOVE  (r2v118 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v103, assign insn: 0x0249: MOVE  (r7v103 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v119, assign insn: 0x0256: MOVE  (r2v119 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v105, assign insn: 0x0212: MOVE  (r7v105 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v120, assign insn: 0x021f: MOVE  (r2v120 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v109, assign insn: 0x01ef: MOVE  (r7v109 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v121, assign insn: 0x01fc: MOVE  (r2v121 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v110, assign insn: 0x01d0: CONST  (r7v110 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v114, assign insn: 0x01a0: MOVE  (r7v114 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v122, assign insn: 0x01ad: MOVE  (r2v122 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v115, assign insn: 0x015a: MOVE  (r7v115 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v123, assign insn: 0x0166: MOVE  (r2v123 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r7v116, assign insn: 0x0123: MOVE  (r7v116 ? I:?[OBJECT, ARRAY]) = (r3v3 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v124, assign insn: 0x012f: MOVE  (r2v124 ? I:?[OBJECT, ARRAY]) = (r15v5 askf) */
    /* JADX WARN: Type inference failed for: r2v125, assign insn: PHI: (r2v125 ?) = (r2v16 ?), (r2v132 ?) binds: [B:417:0x09c4, B:12:0x0050] */
    /* JADX WARN: Type inference failed for: r2v126, assign insn: PHI: (r2v126 ?) = (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v0 java.lang.String) binds: [B:89:0x01d4, B:80:0x01bf, B:81:?, B:74:0x0185, B:75:?, B:69:0x0174, B:70:?, B:59:0x013f, B:60:?, B:48:0x0108, B:49:?, B:39:0x00ce, B:40:?, B:34:0x00a0, B:35:?, B:29:0x0079, B:30:?, B:23:0x006f, B:24:?, B:9:0x0034, B:10:?] */
    /* JADX WARN: Type inference failed for: r7v119, assign insn: 0x0014: CONST  (r7v119 ? I:?[int, float, short, byte, char]) = (4 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v121, assign insn: ?: MOVE  (r7v121 ?) = (r7v5 ?) */
    /* JADX WARN: Type inference failed for: r7v122, assign insn: ?: MOVE  (r7v122 ?) = (r7v17 int) */
    /* JADX WARN: Type inference failed for: r7v123, assign insn: ?: MOVE  (r7v123 ?) = (r7v20 ?) */
    /* JADX WARN: Type inference failed for: r7v127, assign insn: ?: MOVE  (r7v127 ?) = (r7v27 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v129, assign insn: ?: MOVE  (r7v129 ?) = (r7v29 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v130, assign insn: ?: MOVE  (r2v130 ?) = (r2v27 askf) */
    /* JADX WARN: Type inference failed for: r7v131, assign insn: ?: MOVE  (r7v131 ?) = (r7v36 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v132, assign insn: ?: MOVE  (r7v132 ?) = (r7v41 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v134, assign insn: ?: MOVE  (r7v134 ?) = (r7v59 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v135, assign insn: ?: MOVE  (r7v135 ?) = (r7v61 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v138, assign insn: ?: MOVE  (r7v138 ?) = (r7v65 java.lang.String) */
    /* JADX WARN: Type inference failed for: r7v140, assign insn: ?: MOVE  (r7v140 ?) = (r7v74 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v132, assign insn: ?: MOVE  (r2v132 ?) = (r2v126 ?) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0648, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0649, code lost:
        r1 = r0;
        r4 = r2;
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x064e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x064f, code lost:
        r1 = r0;
        r4 = r2;
        r25 = r7;
        r24 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0869, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x086a, code lost:
        r2 = r0;
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0889, code lost:
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08af, code lost:
        r7 = r27;
        r1 = r0;
        r2 = r15;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0911, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0912, code lost:
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0923, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0924, code lost:
        r26 = r2;
        r25 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x094d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x094e, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0951, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0952, code lost:
        r26 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x095b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x095c, code lost:
        r26 = r2;
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0960, code lost:
        r25 = r7;
        r24 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0969, code lost:
        r26 = r2;
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x09c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x09c1, code lost:
        r7 = r3;
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x09c4, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x09f2, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x09f3, code lost:
        r1 = r0;
        r4 = r26;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a76, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a77, code lost:
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a7b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a7c, code lost:
        r4 = r26;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0648 A[ExcHandler: RuntimeException (r0v57 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:233:0x062a] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x06b4 A[SYNTHETIC, Splitter:B:269:0x06b4] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x06cf A[Catch:{ asks -> 0x091c, RuntimeException -> 0x094d }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06d0 A[Catch:{ asks -> 0x091c, RuntimeException -> 0x094d }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0721 A[SYNTHETIC, Splitter:B:286:0x0721] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0760 A[SYNTHETIC, Splitter:B:299:0x0760] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x077b A[SYNTHETIC, Splitter:B:307:0x077b] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0888 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:342:0x0845] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0911 A[Catch:{ asks -> 0x09f8, RuntimeException -> 0x09f2 }, ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:296:0x0743] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x094d A[Catch:{ asks -> 0x09f8, RuntimeException -> 0x09f2 }, ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:226:0x0608] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x09c0 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:188:0x0550] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x09f2 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r7 r23 r26 10  PHI: (r7v25 ?) = (r7v26 ?), (r7v26 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v18 ?), (r7v42 ?), (r7v51 ?), (r7v60 ?), (r7v60 ?) binds: [B:430:0x09ed, B:431:?, B:214:0x05ca, B:217:0x05d8, B:220:0x05de, B:226:0x0608, B:244:0x066a, B:276:0x06c7, B:282:0x06dc, B:379:0x08cf, B:368:0x0891, B:369:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r23v18 java.lang.String) = (r23v19 java.lang.String), (r23v19 java.lang.String), (r23v9 java.lang.String), (r23v9 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String), (r23v36 java.lang.String) binds: [B:430:0x09ed, B:431:?, B:214:0x05ca, B:217:0x05d8, B:220:0x05de, B:226:0x0608, B:244:0x066a, B:276:0x06c7, B:282:0x06dc, B:379:0x08cf, B:368:0x0891, B:369:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r26v7 java.lang.String) = (r26v8 java.lang.String), (r26v8 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v1 java.lang.String), (r26v29 java.lang.String), (r26v29 java.lang.String), (r26v29 java.lang.String), (r26v29 java.lang.String) binds: [B:430:0x09ed, B:431:?, B:214:0x05ca, B:217:0x05d8, B:220:0x05de, B:226:0x0608, B:244:0x066a, B:276:0x06c7, B:282:0x06dc, B:379:0x08cf, B:368:0x0891, B:369:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:368:0x0891] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0a76 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:426:0x09e8] */
    /* JADX WARNING: Unknown variable types count: 5 */
    public final void onHandleIntent(Intent intent) {
        String str;
        RuntimeException runtimeException;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        bldf bldf;
        asks asks;
        String str5;
        String str6;
        String str7;
        String[] strArr;
        asks asks2;
        String str8;
        askf askf;
        String str9;
        askf askf2;
        String str10;
        int i3;
        btqy btqy;
        String str11;
        int i4;
        String str12;
        boolean f;
        int i5;
        Context context;
        Transaction transaction;
        String str13;
        ? r7;
        Transaction transaction2;
        String str14;
        String str15;
        ? r72;
        String str16;
        TapAndPayNotificationIntentOperation tapAndPayNotificationIntentOperation = this;
        askf askf3 = "com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation";
        String str17 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        String str18 = "onHandleIntent";
        m93085e().mo49764e(3);
        String str19 = 4;
        int i6 = 4;
        str19 = 4;
        if (!asjw.m74258c(this)) {
            m93085e().mo49764e(4);
        } else if ("com.google.android.gms.tapandpay.notifications.NOTIFICATION_ACTION".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("ht");
            if (TextUtils.isEmpty(stringExtra)) {
                try {
                    bnsl bnsl = (bnsl) f108615a.mo68388c();
                    bnsl.mo68432a(askf3, "a", 79, str17);
                    bnsl.mo68405a("Missing heavy-tickle payload, dropping message");
                    m93085e().mo49764e(6);
                } catch (RuntimeException e) {
                    runtimeException = e;
                    String str20 = str17;
                    str = str18;
                    askf3 = askf3;
                }
            } else {
                try {
                    try {
                        bldf bldf2 = (bldf) bxvk.m124016a(bldf.f126055d, Base64.decode(stringExtra, 1), bxus.m123744c());
                        String str21 = "";
                        if ((bldf2.f126057a & 1) != 0) {
                            str2 = bldf2.f126058b;
                        } else {
                            str2 = str21;
                        }
                        try {
                            if (str2.isEmpty()) {
                                bnsl bnsl2 = (bnsl) f108615a.mo68388c();
                                bnsl2.mo68432a(askf3, "a", (int) ErrorInfo.TYPE_SDU_FAILED, str17);
                                bnsl2.mo68405a("Recipient account id missing, dropping message");
                                m93085e().mo49764e(10);
                            } else {
                                String a = asjg.m74211a(tapAndPayNotificationIntentOperation, str2);
                                if (TextUtils.isEmpty(a)) {
                                    bnsl bnsl3 = (bnsl) f108615a.mo68388c();
                                    bnsl3.mo68432a(askf3, "a", 110, str17);
                                    bnsl3.mo68405a("Recipient account not on device, dropping message");
                                    m93085e().mo49764e(11);
                                } else {
                                    AccountInfo accountInfo = new AccountInfo(str2, a);
                                    String b = askc.m74272b();
                                    if (bldf2.f126059c.size() == 0) {
                                        bnsl bnsl4 = (bnsl) f108615a.mo68388c();
                                        bnsl4.mo68432a(askf3, "a", 117, str17);
                                        bnsl4.mo68405a("Empty payload, dropping message");
                                        m93085e().mo49764e(12);
                                    } else {
                                        askf askf4 = new askf(accountInfo, b, tapAndPayNotificationIntentOperation);
                                        int i7 = 0;
                                        while (i7 < bldf2.f126059c.size()) {
                                            blci blci = (blci) bldf2.f126059c.get(i7);
                                            String str22 = askf4.f89124b;
                                            if ((blci.f125925a & i6) == 0) {
                                                bnsl bnsl5 = (bnsl) f108615a.mo68388c();
                                                bnsl5.mo68432a((String) askf3, "a", 131, str17);
                                                bnsl5.mo68405a("RenderInfo missing, dropping notification");
                                                m93079a(askf4).mo49764e(13);
                                                str19 = str17;
                                                str = str18;
                                                bldf = bldf2;
                                                i2 = i7;
                                                str4 = str21;
                                                str18 = askf3;
                                                askf3 = askf4;
                                            } else {
                                                blde blde = blci.f125928d;
                                                if (blde == null) {
                                                    blde = blde.f126049d;
                                                }
                                                if ((blde.f126051a & 32) == 0) {
                                                    bnsl bnsl6 = (bnsl) f108615a.mo68388c();
                                                    bnsl6.mo68432a((String) askf3, "a", 137, str17);
                                                    bnsl6.mo68405a("AppPayload missing, dropping notification");
                                                    m93079a(askf4).mo49764e(14);
                                                    str19 = str17;
                                                    str = str18;
                                                    bldf = bldf2;
                                                    i2 = i7;
                                                    str4 = str21;
                                                    str18 = askf3;
                                                    askf3 = askf4;
                                                } else {
                                                    blde blde2 = blci.f125928d;
                                                    if (blde2 == null) {
                                                        blde2 = blde.f126049d;
                                                    }
                                                    bldd bldd = blde2.f126053c;
                                                    if (bldd == null) {
                                                        bldd = bldd.f126046a;
                                                    }
                                                    bxvj bxvj = bmux.f130990j;
                                                    bldd.mo74135a(bxvj);
                                                    if (!bldd.f164952m.mo73911a(bxvj.f164958d)) {
                                                        bnsl bnsl7 = (bnsl) f108615a.mo68388c();
                                                        bnsl7.mo68432a((String) askf3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, str17);
                                                        bnsl7.mo68405a("TapAndPayNotificationAppPayload extension missing, dropping notification");
                                                        m93079a(askf4).mo49764e(15);
                                                        str19 = str17;
                                                        str = str18;
                                                        bldf = bldf2;
                                                        i2 = i7;
                                                        str4 = str21;
                                                        str18 = askf3;
                                                        askf3 = askf4;
                                                    } else {
                                                        bxvj bxvj2 = bmux.f130990j;
                                                        bldd.mo74135a(bxvj2);
                                                        Object b2 = bldd.f164952m.mo73913b(bxvj2.f164958d);
                                                        if (b2 == null) {
                                                            b2 = bxvj2.f164956b;
                                                        } else {
                                                            bxvj2.mo74139a(b2);
                                                        }
                                                        bmux bmux = (bmux) b2;
                                                        int a2 = bmup.m108398a(bmux.f130995d);
                                                        ? r73 = a2;
                                                        if (a2 == 0) {
                                                            r73 = 1;
                                                        }
                                                        if (str19 == 1) {
                                                            bnsl bnsl8 = (bnsl) f108615a.mo68388c();
                                                            bnsl8.mo68432a((String) askf3, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, str17);
                                                            bnsl8.mo68405a("Notification type UNKNOWN, dropping notification");
                                                            m93079a(askf4).mo49764e(16);
                                                            str19 = str17;
                                                            str = str18;
                                                            bldf = bldf2;
                                                            i2 = i7;
                                                            str4 = str21;
                                                            str18 = askf3;
                                                            askf3 = askf4;
                                                        } else if (str19 != 31 && !asjw.m74259d(this)) {
                                                            m93079a(askf4).mo49764e(17);
                                                            str19 = str17;
                                                            str = str18;
                                                            bldf = bldf2;
                                                            i2 = i7;
                                                            str4 = str21;
                                                            str18 = askf3;
                                                            askf3 = askf4;
                                                        } else if (str19 == 38 || asjg.m74214a(tapAndPayNotificationIntentOperation, str22, askf4.f89125c)) {
                                                            try {
                                                                bnsl a3 = f108615a.mo26019b(aske.m74275a());
                                                                a3.mo68432a((String) askf3, "a", 195, str17);
                                                                bldf = bldf2;
                                                                int i8 = str19 - 1;
                                                                try {
                                                                    a3.mo68409a("Dispatching notification with type: %d", i8);
                                                                    if (i8 == 1) {
                                                                        str3 = askf3;
                                                                        str = str18;
                                                                        i = str19;
                                                                        i2 = i7;
                                                                        str4 = str21;
                                                                        askf3 = askf4;
                                                                        str19 = str17;
                                                                        try {
                                                                            if (bmux.f130993b == 3) {
                                                                                str6 = (String) bmux.f130994c;
                                                                            } else {
                                                                                str6 = str4;
                                                                            }
                                                                            if (str6.isEmpty()) {
                                                                                bnsl bnsl9 = (bnsl) f108615a.mo68388c();
                                                                                str18 = str3;
                                                                                try {
                                                                                    bnsl9.mo68432a(str18, "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, (String) str19);
                                                                                    bnsl9.mo68405a("Instrument id missing, dropping notification");
                                                                                } catch (asks e2) {
                                                                                    e = e2;
                                                                                    asks2 = e;
                                                                                    String str23 = str19;
                                                                                    askf askf5 = askf3;
                                                                                    r72 = str23;
                                                                                    askf3 = askf5;
                                                                                    bnsl bnsl10 = (bnsl) f108615a.mo68388c();
                                                                                    bnsl10.mo68437a(asks);
                                                                                    bnsl10.mo68432a(str18, "a", 179, (String) str19);
                                                                                    bnsl10.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                    m93079a(askf3).mo49764e(21);
                                                                                    i7 = i2 + 1;
                                                                                    tapAndPayNotificationIntentOperation = this;
                                                                                    askf4 = askf3;
                                                                                    askf3 = str18;
                                                                                    str17 = str19;
                                                                                    bldf2 = bldf;
                                                                                    str21 = str4;
                                                                                    str18 = str;
                                                                                    i6 = 4;
                                                                                }
                                                                            } else {
                                                                                str5 = str3;
                                                                                try {
                                                                                    atbq b3 = m93082b();
                                                                                    if (bmux.f130993b != 3) {
                                                                                        str7 = str4;
                                                                                    } else {
                                                                                        try {
                                                                                            str7 = (String) bmux.f130994c;
                                                                                        } catch (asks e3) {
                                                                                            e = e3;
                                                                                            asks = e;
                                                                                            r72 = str19;
                                                                                            bnsl bnsl102 = (bnsl) f108615a.mo68388c();
                                                                                            bnsl102.mo68437a(asks);
                                                                                            bnsl102.mo68432a(str18, "a", 179, (String) str19);
                                                                                            bnsl102.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                            m93079a(askf3).mo49764e(21);
                                                                                            i7 = i2 + 1;
                                                                                            tapAndPayNotificationIntentOperation = this;
                                                                                            askf4 = askf3;
                                                                                            askf3 = str18;
                                                                                            str17 = str19;
                                                                                            bldf2 = bldf;
                                                                                            str21 = str4;
                                                                                            str18 = str;
                                                                                            i6 = 4;
                                                                                        }
                                                                                    }
                                                                                    b3.mo49781a();
                                                                                    strArr = new String[2];
                                                                                    try {
                                                                                        strArr[0] = "active";
                                                                                    } catch (asks e4) {
                                                                                        e = e4;
                                                                                        asks = e;
                                                                                        r72 = str19;
                                                                                        bnsl bnsl1022 = (bnsl) f108615a.mo68388c();
                                                                                        bnsl1022.mo68437a(asks);
                                                                                        bnsl1022.mo68432a(str18, "a", 179, (String) str19);
                                                                                        bnsl1022.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                        m93079a(askf3).mo49764e(21);
                                                                                        i7 = i2 + 1;
                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                        askf4 = askf3;
                                                                                        askf3 = str18;
                                                                                        str17 = str19;
                                                                                        bldf2 = bldf;
                                                                                        str21 = str4;
                                                                                        str18 = str;
                                                                                        i6 = 4;
                                                                                    }
                                                                                } catch (asks e5) {
                                                                                    e = e5;
                                                                                    asks = e;
                                                                                    r72 = str19;
                                                                                    bnsl bnsl10222 = (bnsl) f108615a.mo68388c();
                                                                                    bnsl10222.mo68437a(asks);
                                                                                    bnsl10222.mo68432a(str18, "a", 179, (String) str19);
                                                                                    bnsl10222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                    m93079a(askf3).mo49764e(21);
                                                                                    i7 = i2 + 1;
                                                                                    tapAndPayNotificationIntentOperation = this;
                                                                                    askf4 = askf3;
                                                                                    askf3 = str18;
                                                                                    str17 = str19;
                                                                                    bldf2 = bldf;
                                                                                    str21 = str4;
                                                                                    str18 = str;
                                                                                    i6 = 4;
                                                                                }
                                                                                try {
                                                                                    strArr[1] = "unacknowledged";
                                                                                    if (!atbm.m75391a((askf) askf3, str7, strArr, "needs_refresh")) {
                                                                                        bnsl bnsl11 = (bnsl) atbq.f90017a.mo68388c();
                                                                                        bnsl11.mo68432a("atbq", "a", 954, (String) str19);
                                                                                        bnsl11.mo68405a("Received DEVICE_TOKEN_REPLENISH notification while bundle in unexpected state");
                                                                                    } else {
                                                                                        atcj.m75548a(askf3.f89126d);
                                                                                    }
                                                                                } catch (asks e6) {
                                                                                    e = e6;
                                                                                    asks = e;
                                                                                    r72 = str19;
                                                                                    bnsl bnsl102222 = (bnsl) f108615a.mo68388c();
                                                                                    bnsl102222.mo68437a(asks);
                                                                                    bnsl102222.mo68432a(str18, "a", 179, (String) str19);
                                                                                    bnsl102222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                    m93079a(askf3).mo49764e(21);
                                                                                    i7 = i2 + 1;
                                                                                    tapAndPayNotificationIntentOperation = this;
                                                                                    askf4 = askf3;
                                                                                    askf3 = str18;
                                                                                    str17 = str19;
                                                                                    bldf2 = bldf;
                                                                                    str21 = str4;
                                                                                    str18 = str;
                                                                                    i6 = 4;
                                                                                }
                                                                            }
                                                                        } catch (asks e7) {
                                                                            e = e7;
                                                                            str18 = str3;
                                                                            asks2 = e;
                                                                            String str232 = str19;
                                                                            askf askf52 = askf3;
                                                                            r72 = str232;
                                                                            askf3 = askf52;
                                                                            bnsl bnsl1022222 = (bnsl) f108615a.mo68388c();
                                                                            bnsl1022222.mo68437a(asks);
                                                                            bnsl1022222.mo68432a(str18, "a", 179, (String) str19);
                                                                            bnsl1022222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                            m93079a(askf3).mo49764e(21);
                                                                            i7 = i2 + 1;
                                                                            tapAndPayNotificationIntentOperation = this;
                                                                            askf4 = askf3;
                                                                            askf3 = str18;
                                                                            str17 = str19;
                                                                            bldf2 = bldf;
                                                                            str21 = str4;
                                                                            str18 = str;
                                                                            i6 = 4;
                                                                        } catch (RuntimeException e8) {
                                                                        }
                                                                    } else if (i8 == 5) {
                                                                        try {
                                                                            atwb atwb = new atwb();
                                                                            if (!asiv.m74193c(askf4)) {
                                                                                if (cgwn.m147261k()) {
                                                                                    try {
                                                                                        atbd.m75359b(askf4);
                                                                                        str = str18;
                                                                                        i = str19;
                                                                                        i2 = i7;
                                                                                        str4 = str21;
                                                                                        str5 = askf3;
                                                                                        str19 = str17;
                                                                                        askf3 = askf4;
                                                                                    } catch (atfh | IOException | IllegalStateException e9) {
                                                                                        Throwable th = e9;
                                                                                        bnsl bnsl12 = (bnsl) atwb.f91035a.mo68388c();
                                                                                        bnsl12.mo68437a(th);
                                                                                        bnsl12.mo68432a("atwb", "a", 342, str17);
                                                                                        bnsl12.mo68405a("Update chime setting failed");
                                                                                        str = str18;
                                                                                        i = str19;
                                                                                        i2 = i7;
                                                                                        str4 = str21;
                                                                                        str5 = askf3;
                                                                                        str19 = str17;
                                                                                        askf3 = askf4;
                                                                                    }
                                                                                } else {
                                                                                    str = str18;
                                                                                    i = str19;
                                                                                    i2 = i7;
                                                                                    str4 = str21;
                                                                                    str5 = askf3;
                                                                                    str19 = str17;
                                                                                    askf3 = askf4;
                                                                                }
                                                                            } else if ((bmux.f130992a & 2) != 0) {
                                                                                bmuq bmuq = bmux.f130996e;
                                                                                if (bmuq == null) {
                                                                                    bmuq = bmuq.f130966d;
                                                                                }
                                                                                String str24 = bmuq.f130969b;
                                                                                if (!str24.isEmpty()) {
                                                                                    try {
                                                                                        btqu btqu = (btqu) btqw.f150046c.mo74144da();
                                                                                        str4 = str21;
                                                                                        bxvd da = btqv.f150043b.mo74144da();
                                                                                        str = str18;
                                                                                        try {
                                                                                            if (da.f164950c) {
                                                                                                da.mo74035c();
                                                                                                da.f164950c = false;
                                                                                            }
                                                                                            str24.getClass();
                                                                                            ((btqv) da.f164949b).f150045a = str24;
                                                                                            btqu.mo70834a(da);
                                                                                            btqu.mo70833a(btrh.SUPPORTS_INFERRED_RICH_DATA);
                                                                                            btqy = (btqy) atff.m75759a(askf4, "t/transaction/get", (btqw) btqu.mo74062i(), btqy.f150053b);
                                                                                        } catch (IOException e10) {
                                                                                            str10 = askf3;
                                                                                            i3 = str19;
                                                                                            i2 = i7;
                                                                                            askf3 = askf4;
                                                                                            String str25 = str17;
                                                                                            bnsl bnsl13 = (bnsl) atwb.f91035a.mo68388c();
                                                                                            bnsl13.mo68432a("atwb", "a", 116, str25);
                                                                                            bnsl13.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                                            str5 = str3;
                                                                                            str19 = str25;
                                                                                            m93079a((askf) askf3).mo49764e(19);
                                                                                            i7 = i2 + 1;
                                                                                            tapAndPayNotificationIntentOperation = this;
                                                                                            askf4 = askf3;
                                                                                            askf3 = str18;
                                                                                            str17 = str19;
                                                                                            bldf2 = bldf;
                                                                                            str21 = str4;
                                                                                            str18 = str;
                                                                                            i6 = 4;
                                                                                        } catch (atfh e11) {
                                                                                            str10 = askf3;
                                                                                            i3 = str19;
                                                                                            i2 = i7;
                                                                                            askf3 = askf4;
                                                                                            String str252 = str17;
                                                                                            bnsl bnsl132 = (bnsl) atwb.f91035a.mo68388c();
                                                                                            bnsl132.mo68432a("atwb", "a", 116, str252);
                                                                                            bnsl132.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                                            str5 = str3;
                                                                                            str19 = str252;
                                                                                            m93079a((askf) askf3).mo49764e(19);
                                                                                            i7 = i2 + 1;
                                                                                            tapAndPayNotificationIntentOperation = this;
                                                                                            askf4 = askf3;
                                                                                            askf3 = str18;
                                                                                            str17 = str19;
                                                                                            bldf2 = bldf;
                                                                                            str21 = str4;
                                                                                            str18 = str;
                                                                                            i6 = 4;
                                                                                        }
                                                                                    } catch (IOException e12) {
                                                                                        str10 = askf3;
                                                                                        str = str18;
                                                                                        i3 = str19;
                                                                                        i2 = i7;
                                                                                        str4 = str21;
                                                                                        askf3 = askf4;
                                                                                        String str2522 = str17;
                                                                                        bnsl bnsl1322 = (bnsl) atwb.f91035a.mo68388c();
                                                                                        bnsl1322.mo68432a("atwb", "a", 116, str2522);
                                                                                        bnsl1322.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                                        str5 = str3;
                                                                                        str19 = str2522;
                                                                                        m93079a((askf) askf3).mo49764e(19);
                                                                                        i7 = i2 + 1;
                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                        askf4 = askf3;
                                                                                        askf3 = str18;
                                                                                        str17 = str19;
                                                                                        bldf2 = bldf;
                                                                                        str21 = str4;
                                                                                        str18 = str;
                                                                                        i6 = 4;
                                                                                    } catch (atfh e13) {
                                                                                        str10 = askf3;
                                                                                        str = str18;
                                                                                        i3 = str19;
                                                                                        i2 = i7;
                                                                                        str4 = str21;
                                                                                        askf3 = askf4;
                                                                                        String str25222 = str17;
                                                                                        bnsl bnsl13222 = (bnsl) atwb.f91035a.mo68388c();
                                                                                        bnsl13222.mo68432a("atwb", "a", 116, str25222);
                                                                                        bnsl13222.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                                        str5 = str3;
                                                                                        str19 = str25222;
                                                                                        m93079a((askf) askf3).mo49764e(19);
                                                                                        i7 = i2 + 1;
                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                        askf4 = askf3;
                                                                                        askf3 = str18;
                                                                                        str17 = str19;
                                                                                        bldf2 = bldf;
                                                                                        str21 = str4;
                                                                                        str18 = str;
                                                                                        i6 = 4;
                                                                                    }
                                                                                    try {
                                                                                        if (btqy.f150055a.size() == 1) {
                                                                                            btrg btrg = ((btqx) btqy.f150055a.get(0)).f150052a;
                                                                                            if (btrg != null) {
                                                                                                CardInfo b4 = atds.m75666a(askf4).mo49853b(btrg.f150097g);
                                                                                                if (b4 == null) {
                                                                                                    try {
                                                                                                        bnsl bnsl14 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                        bnsl14.mo68432a("atwb", "a", 142, str17);
                                                                                                        bnsl14.mo68405a("Could not find payment card for transaction, dropping notification");
                                                                                                        str5 = askf3;
                                                                                                        i = str19;
                                                                                                        i2 = i7;
                                                                                                        askf3 = askf4;
                                                                                                        str19 = str17;
                                                                                                    } catch (asks e14) {
                                                                                                        asks = e14;
                                                                                                        str18 = askf3;
                                                                                                        i = str19;
                                                                                                        askf3 = askf4;
                                                                                                        r72 = str17;
                                                                                                        bnsl bnsl10222222 = (bnsl) f108615a.mo68388c();
                                                                                                        bnsl10222222.mo68437a(asks);
                                                                                                        bnsl10222222.mo68432a(str18, "a", 179, (String) str19);
                                                                                                        bnsl10222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                        m93079a(askf3).mo49764e(21);
                                                                                                        i7 = i2 + 1;
                                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                                        askf4 = askf3;
                                                                                                        askf3 = str18;
                                                                                                        str17 = str19;
                                                                                                        bldf2 = bldf;
                                                                                                        str21 = str4;
                                                                                                        str18 = str;
                                                                                                        i6 = 4;
                                                                                                    } catch (RuntimeException e15) {
                                                                                                    }
                                                                                                } else {
                                                                                                    atvv atvv = new atvv(btrg);
                                                                                                    Context context2 = askf4.f89126d;
                                                                                                    sre.m36089i(context2);
                                                                                                    Context context3 = askf4.f89126d;
                                                                                                    i2 = i7;
                                                                                                    btrb btrb = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                                                                    if (btrb != null) {
                                                                                                        btrd btrd = btrb.f150063f;
                                                                                                        if (btrd != null) {
                                                                                                            if (!btrd.f150072a.isEmpty()) {
                                                                                                                btrb btrb2 = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                                                                                if (btrb2 == null) {
                                                                                                                    btrb2 = btrb.f150056k;
                                                                                                                }
                                                                                                                btrd btrd2 = btrb2.f150063f;
                                                                                                                if (btrd2 == null) {
                                                                                                                    btrd2 = btrd.f150070b;
                                                                                                                }
                                                                                                                str11 = btrd2.f150072a;
                                                                                                                C1102je a4 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                                                                                atbg.m75376b(a4, str11);
                                                                                                                if (atvv.mo50255f()) {
                                                                                                                    i4 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_text_full : C0126R.string.tp_transaction_declined_notification_text_full;
                                                                                                                } else {
                                                                                                                    i4 = C0126R.string.tp_transaction_refund_notification_text_full;
                                                                                                                }
                                                                                                                i = str19;
                                                                                                                str19 = atyj.m76564a(b4) ? b4.f108343d : context2.getString(C0126R.string.tp_paypal);
                                                                                                                str3 = askf3;
                                                                                                                str12 = str17;
                                                                                                                askf3 = 2;
                                                                                                                atbg.m75377c(a4, context2.getString(i4, new Object[]{atvv.mo50252c(), str19}));
                                                                                                                a4.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                                                                                                a4.mo13631b(PendingIntent.getService(context2, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf4, blci.mo73642k(), 6, b4), 134217728));
                                                                                                                f = atvv.mo50255f();
                                                                                                                int i9 = C0126R.string.tp_transaction_decline_notification_ticker;
                                                                                                                if (f) {
                                                                                                                    try {
                                                                                                                        i5 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_title_sensitive : C0126R.string.tp_transaction_decline_notification_ticker;
                                                                                                                    } catch (asks e16) {
                                                                                                                        asks2 = e16;
                                                                                                                        askf3 = askf4;
                                                                                                                        str18 = str3;
                                                                                                                        str19 = str12;
                                                                                                                        String str2322 = str19;
                                                                                                                        askf askf522 = askf3;
                                                                                                                        r72 = str2322;
                                                                                                                        askf3 = askf522;
                                                                                                                        bnsl bnsl102222222 = (bnsl) f108615a.mo68388c();
                                                                                                                        bnsl102222222.mo68437a(asks);
                                                                                                                        bnsl102222222.mo68432a(str18, "a", 179, (String) str19);
                                                                                                                        bnsl102222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                                        m93079a(askf3).mo49764e(21);
                                                                                                                        i7 = i2 + 1;
                                                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                                                        askf4 = askf3;
                                                                                                                        askf3 = str18;
                                                                                                                        str17 = str19;
                                                                                                                        bldf2 = bldf;
                                                                                                                        str21 = str4;
                                                                                                                        str18 = str;
                                                                                                                        i6 = 4;
                                                                                                                    } catch (RuntimeException e17) {
                                                                                                                        runtimeException = e17;
                                                                                                                        str18 = str3;
                                                                                                                        str19 = str12;
                                                                                                                        bnsl bnsl15 = (bnsl) f108615a.mo68388c();
                                                                                                                        bnsl15.mo68437a(runtimeException);
                                                                                                                        bnsl15.mo68432a(str18, str, 69, str19);
                                                                                                                        bnsl15.mo68405a("Error handling intent");
                                                                                                                        m93085e().mo49764e(20);
                                                                                                                        asfd.m73946a(this, intent);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i5 = C0126R.string.tp_transaction_refund_notification_title_sensitive;
                                                                                                                }
                                                                                                                C1102je a5 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                                                                                a5.mo13640e(context2.getString(i5));
                                                                                                                a5.mo13632b(context2.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                                                                                                if (!atvv.mo50255f()) {
                                                                                                                    i9 = C0126R.string.tp_transaction_refund_notification_ticker;
                                                                                                                } else if (!atvv.mo50256g()) {
                                                                                                                    i9 = C0126R.string.tp_transaction_notification_ticker;
                                                                                                                }
                                                                                                                a4.mo13639d(context2.getString(i9));
                                                                                                                if (cgwn.m147260j()) {
                                                                                                                    if ((bmuq.f130968a & 2) != 0) {
                                                                                                                        bmxv bmxv = atwb.f91036b;
                                                                                                                        Boolean valueOf = Boolean.valueOf(alfj.m60866b(askf4.f89126d));
                                                                                                                        bmxv.mo66812a(valueOf);
                                                                                                                        if (valueOf.booleanValue()) {
                                                                                                                            bztn bztn = bmuq.f130970c;
                                                                                                                            if (bztn == null) {
                                                                                                                                bztn = bztn.f171350b;
                                                                                                                            }
                                                                                                                            String str26 = bztn.f171352a;
                                                                                                                            bztn bztn2 = bmuq.f130970c;
                                                                                                                            if (bztn2 == null) {
                                                                                                                                bztn2 = bztn.f171350b;
                                                                                                                            }
                                                                                                                            DisplayMetrics displayMetrics = askf4.f89126d.getResources().getDisplayMetrics();
                                                                                                                            int round = Math.round(((float) displayMetrics.widthPixels) - (displayMetrics.density * 32.0f));
                                                                                                                            int round2 = Math.round(((float) round) * 0.48f);
                                                                                                                            bxvd da2 = bzur.f171456c.mo74144da();
                                                                                                                            String str27 = str26;
                                                                                                                            if (da2.f164950c) {
                                                                                                                                da2.mo74035c();
                                                                                                                                da2.f164950c = false;
                                                                                                                            }
                                                                                                                            bztn2.getClass();
                                                                                                                            ((bzur) da2.f164949b).f171458a = bztn2;
                                                                                                                            bxvd da3 = bztm.f171347b.mo74144da();
                                                                                                                            bxvd da4 = bztl.f171342d.mo74144da();
                                                                                                                            float f2 = displayMetrics.density;
                                                                                                                            context = context2;
                                                                                                                            if (da4.f164950c) {
                                                                                                                                da4.mo74035c();
                                                                                                                                da4.f164950c = false;
                                                                                                                            }
                                                                                                                            bztl bztl = (bztl) da4.f164949b;
                                                                                                                            bztl.f171346c = f2;
                                                                                                                            bztl.f171344a = round;
                                                                                                                            bztl.f171345b = round2;
                                                                                                                            if (da3.f164950c) {
                                                                                                                                da3.mo74035c();
                                                                                                                                da3.f164950c = false;
                                                                                                                            }
                                                                                                                            bztl bztl2 = (bztl) da4.mo74062i();
                                                                                                                            bztl2.getClass();
                                                                                                                            ((bztm) da3.f164949b).f171349a = bztl2;
                                                                                                                            if (da2.f164950c) {
                                                                                                                                da2.mo74035c();
                                                                                                                                da2.f164950c = false;
                                                                                                                            }
                                                                                                                            bztm bztm = (bztm) da3.mo74062i();
                                                                                                                            bztm.getClass();
                                                                                                                            ((bzur) da2.f164949b).f171459b = bztm;
                                                                                                                            try {
                                                                                                                                bzus bzus = (bzus) atff.m75769b(askf4, "g/transaction/getcoretransaction", (bzur) da2.mo74062i(), bzus.f171460b);
                                                                                                                                if (bzus.f171462a != null) {
                                                                                                                                    algt algt = new algt();
                                                                                                                                    bzuq bzuq = bzus.f171462a;
                                                                                                                                    if (bzuq == null) {
                                                                                                                                        bzuq = bzuq.f171454a;
                                                                                                                                    }
                                                                                                                                    byte[] k = bzuq.mo73642k();
                                                                                                                                    Transaction transaction3 = algt.f73511a;
                                                                                                                                    transaction3.f81615a = k;
                                                                                                                                    transaction2 = transaction3;
                                                                                                                                    str14 = str12;
                                                                                                                                    transaction = transaction2;
                                                                                                                                    str13 = str27;
                                                                                                                                    r7 = str14;
                                                                                                                                    askf3 = askf4;
                                                                                                                                    a4.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                                                    a4.mo13627a(true);
                                                                                                                                    a4.f22273y = a5.mo13629b();
                                                                                                                                    atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a4);
                                                                                                                                    askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                                                    str5 = str3;
                                                                                                                                } else {
                                                                                                                                    bnsl bnsl16 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                                                    String str28 = str12;
                                                                                                                                    try {
                                                                                                                                        bnsl16.mo68432a("atwb", "a", 286, str28);
                                                                                                                                        bnsl16.mo68405a("tryGetTransaction: no transaction returned");
                                                                                                                                        transaction2 = null;
                                                                                                                                        str14 = str28;
                                                                                                                                    } catch (atfh e18) {
                                                                                                                                        e = e18;
                                                                                                                                        str15 = str28;
                                                                                                                                        atfh atfh = e;
                                                                                                                                        ? r74 = str15;
                                                                                                                                        try {
                                                                                                                                            bnsl bnsl17 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                                                            bnsl17.mo68437a(atfh);
                                                                                                                                            bnsl17.mo68432a("atwb", "a", 288, (String) str19);
                                                                                                                                            bnsl17.mo68405a("tryGetTransaction: RPC failed");
                                                                                                                                            transaction2 = null;
                                                                                                                                            str14 = str19;
                                                                                                                                            transaction = transaction2;
                                                                                                                                            str13 = str27;
                                                                                                                                            r7 = str14;
                                                                                                                                            askf3 = askf4;
                                                                                                                                            a4.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                                                            a4.mo13627a(true);
                                                                                                                                            a4.f22273y = a5.mo13629b();
                                                                                                                                            atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a4);
                                                                                                                                            askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                                                            str5 = str3;
                                                                                                                                            m93079a((askf) askf3).mo49764e(19);
                                                                                                                                        } catch (asks e19) {
                                                                                                                                            e = e19;
                                                                                                                                            str9 = str19;
                                                                                                                                            askf2 = askf3;
                                                                                                                                        } catch (RuntimeException e20) {
                                                                                                                                        }
                                                                                                                                        i7 = i2 + 1;
                                                                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                                                                        askf4 = askf3;
                                                                                                                                        askf3 = str18;
                                                                                                                                        str17 = str19;
                                                                                                                                        bldf2 = bldf;
                                                                                                                                        str21 = str4;
                                                                                                                                        str18 = str;
                                                                                                                                        i6 = 4;
                                                                                                                                    } catch (IOException e21) {
                                                                                                                                        str19 = str28;
                                                                                                                                        transaction2 = null;
                                                                                                                                        str14 = str19;
                                                                                                                                        transaction = transaction2;
                                                                                                                                        str13 = str27;
                                                                                                                                        r7 = str14;
                                                                                                                                        askf3 = askf4;
                                                                                                                                        a4.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                                                        a4.mo13627a(true);
                                                                                                                                        a4.f22273y = a5.mo13629b();
                                                                                                                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a4);
                                                                                                                                        askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                                                        str5 = str3;
                                                                                                                                        m93079a((askf) askf3).mo49764e(19);
                                                                                                                                        i7 = i2 + 1;
                                                                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                                                                        askf4 = askf3;
                                                                                                                                        askf3 = str18;
                                                                                                                                        str17 = str19;
                                                                                                                                        bldf2 = bldf;
                                                                                                                                        str21 = str4;
                                                                                                                                        str18 = str;
                                                                                                                                        i6 = 4;
                                                                                                                                    }
                                                                                                                                    transaction = transaction2;
                                                                                                                                    str13 = str27;
                                                                                                                                    r7 = str14;
                                                                                                                                    askf3 = askf4;
                                                                                                                                    a4.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                                                    a4.mo13627a(true);
                                                                                                                                    a4.f22273y = a5.mo13629b();
                                                                                                                                    atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a4);
                                                                                                                                    askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                                                    str5 = str3;
                                                                                                                                }
                                                                                                                            } catch (atfh e22) {
                                                                                                                                e = e22;
                                                                                                                                str15 = str12;
                                                                                                                                atfh atfh2 = e;
                                                                                                                                ? r742 = str15;
                                                                                                                                bnsl bnsl172 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                                                bnsl172.mo68437a(atfh2);
                                                                                                                                bnsl172.mo68432a("atwb", "a", 288, (String) str19);
                                                                                                                                bnsl172.mo68405a("tryGetTransaction: RPC failed");
                                                                                                                                transaction2 = null;
                                                                                                                                str14 = str19;
                                                                                                                                transaction = transaction2;
                                                                                                                                str13 = str27;
                                                                                                                                r7 = str14;
                                                                                                                                askf3 = askf4;
                                                                                                                                a4.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                                                a4.mo13627a(true);
                                                                                                                                a4.f22273y = a5.mo13629b();
                                                                                                                                atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a4);
                                                                                                                                askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                                                str5 = str3;
                                                                                                                                m93079a((askf) askf3).mo49764e(19);
                                                                                                                                i7 = i2 + 1;
                                                                                                                                tapAndPayNotificationIntentOperation = this;
                                                                                                                                askf4 = askf3;
                                                                                                                                askf3 = str18;
                                                                                                                                str17 = str19;
                                                                                                                                bldf2 = bldf;
                                                                                                                                str21 = str4;
                                                                                                                                str18 = str;
                                                                                                                                i6 = 4;
                                                                                                                            } catch (IOException e23) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                context = context2;
                                                                                                                r7 = str12;
                                                                                                                str13 = null;
                                                                                                                transaction = null;
                                                                                                                askf3 = askf4;
                                                                                                                a4.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                                a4.mo13627a(true);
                                                                                                                a4.f22273y = a5.mo13629b();
                                                                                                                atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a4);
                                                                                                                askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                                str5 = str3;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    str11 = context3.getString(C0126R.string.tp_default_store_name);
                                                                                                    C1102je a42 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                                                                    atbg.m75376b(a42, str11);
                                                                                                    if (atvv.mo50255f()) {
                                                                                                    }
                                                                                                    i = str19;
                                                                                                    if (atyj.m76564a(b4)) {
                                                                                                    }
                                                                                                    str3 = askf3;
                                                                                                    str12 = str17;
                                                                                                    askf3 = 2;
                                                                                                    try {
                                                                                                        atbg.m75377c(a42, context2.getString(i4, new Object[]{atvv.mo50252c(), str19}));
                                                                                                        a42.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                                                                                        a42.mo13631b(PendingIntent.getService(context2, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf4, blci.mo73642k(), 6, b4), 134217728));
                                                                                                        f = atvv.mo50255f();
                                                                                                        int i92 = C0126R.string.tp_transaction_decline_notification_ticker;
                                                                                                        if (f) {
                                                                                                        }
                                                                                                    } catch (asks e24) {
                                                                                                        e = e24;
                                                                                                        askf2 = askf4;
                                                                                                        str9 = str12;
                                                                                                        asks2 = e;
                                                                                                        str8 = str9;
                                                                                                        askf = askf2;
                                                                                                        str18 = str3;
                                                                                                        str19 = str8;
                                                                                                        askf3 = askf;
                                                                                                        String str23222 = str19;
                                                                                                        askf askf5222 = askf3;
                                                                                                        r72 = str23222;
                                                                                                        askf3 = askf5222;
                                                                                                        bnsl bnsl1022222222 = (bnsl) f108615a.mo68388c();
                                                                                                        bnsl1022222222.mo68437a(asks);
                                                                                                        bnsl1022222222.mo68432a(str18, "a", 179, (String) str19);
                                                                                                        bnsl1022222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                        m93079a(askf3).mo49764e(21);
                                                                                                        i7 = i2 + 1;
                                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                                        askf4 = askf3;
                                                                                                        askf3 = str18;
                                                                                                        str17 = str19;
                                                                                                        bldf2 = bldf;
                                                                                                        str21 = str4;
                                                                                                        str18 = str;
                                                                                                        i6 = 4;
                                                                                                    } catch (RuntimeException e25) {
                                                                                                    }
                                                                                                    try {
                                                                                                        C1102je a52 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                                                                        a52.mo13640e(context2.getString(i5));
                                                                                                        a52.mo13632b(context2.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                                                                                        if (!atvv.mo50255f()) {
                                                                                                        }
                                                                                                        a42.mo13639d(context2.getString(i92));
                                                                                                        if (cgwn.m147260j()) {
                                                                                                        }
                                                                                                        context = context2;
                                                                                                        r7 = str12;
                                                                                                        str13 = null;
                                                                                                        transaction = null;
                                                                                                        askf3 = askf4;
                                                                                                        a42.f22254f = PendingIntent.getActivity(askf3.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf3, b4, blci, str13, transaction), 134217728);
                                                                                                        a42.mo13627a(true);
                                                                                                        a42.f22273y = a52.mo13629b();
                                                                                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a42);
                                                                                                        askf3.f89126d.startService(atbe.m75364a(askf3, blci.mo73642k(), 5, b4));
                                                                                                        str5 = str3;
                                                                                                    } catch (asks e26) {
                                                                                                        e = e26;
                                                                                                        str19 = str12;
                                                                                                        asks2 = e;
                                                                                                        askf = askf4;
                                                                                                        str8 = str19;
                                                                                                        str18 = str3;
                                                                                                        str19 = str8;
                                                                                                        askf3 = askf;
                                                                                                        String str232222 = str19;
                                                                                                        askf askf52222 = askf3;
                                                                                                        r72 = str232222;
                                                                                                        askf3 = askf52222;
                                                                                                        bnsl bnsl10222222222 = (bnsl) f108615a.mo68388c();
                                                                                                        bnsl10222222222.mo68437a(asks);
                                                                                                        bnsl10222222222.mo68432a(str18, "a", 179, (String) str19);
                                                                                                        bnsl10222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                        m93079a(askf3).mo49764e(21);
                                                                                                        i7 = i2 + 1;
                                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                                        askf4 = askf3;
                                                                                                        askf3 = str18;
                                                                                                        str17 = str19;
                                                                                                        bldf2 = bldf;
                                                                                                        str21 = str4;
                                                                                                        str18 = str;
                                                                                                        i6 = 4;
                                                                                                    } catch (RuntimeException e252) {
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                str3 = askf3;
                                                                                                i = str19;
                                                                                                i2 = i7;
                                                                                                askf3 = askf4;
                                                                                                str19 = str17;
                                                                                                str5 = str3;
                                                                                            }
                                                                                        } else {
                                                                                            str3 = askf3;
                                                                                            i = str19;
                                                                                            i2 = i7;
                                                                                            askf3 = askf4;
                                                                                            str19 = str17;
                                                                                            btqy.f150055a.size();
                                                                                            str5 = str3;
                                                                                        }
                                                                                    } catch (asks e27) {
                                                                                        e = e27;
                                                                                        str3 = askf3;
                                                                                        str9 = str17;
                                                                                        askf2 = askf4;
                                                                                        asks2 = e;
                                                                                        str8 = str9;
                                                                                        askf = askf2;
                                                                                        str18 = str3;
                                                                                        str19 = str8;
                                                                                        askf3 = askf;
                                                                                        String str2322222 = str19;
                                                                                        askf askf522222 = askf3;
                                                                                        r72 = str2322222;
                                                                                        askf3 = askf522222;
                                                                                        bnsl bnsl102222222222 = (bnsl) f108615a.mo68388c();
                                                                                        bnsl102222222222.mo68437a(asks);
                                                                                        bnsl102222222222.mo68432a(str18, "a", 179, (String) str19);
                                                                                        bnsl102222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                        m93079a(askf3).mo49764e(21);
                                                                                        i7 = i2 + 1;
                                                                                        tapAndPayNotificationIntentOperation = this;
                                                                                        askf4 = askf3;
                                                                                        askf3 = str18;
                                                                                        str17 = str19;
                                                                                        bldf2 = bldf;
                                                                                        str21 = str4;
                                                                                        str18 = str;
                                                                                        i6 = 4;
                                                                                    } catch (RuntimeException e28) {
                                                                                    }
                                                                                } else {
                                                                                    str3 = askf3;
                                                                                    str = str18;
                                                                                    i = str19;
                                                                                    i2 = i7;
                                                                                    str4 = str21;
                                                                                    askf3 = askf4;
                                                                                    str19 = str17;
                                                                                    str5 = str3;
                                                                                }
                                                                            } else {
                                                                                str3 = askf3;
                                                                                str = str18;
                                                                                i = str19;
                                                                                i2 = i7;
                                                                                str4 = str21;
                                                                                askf3 = askf4;
                                                                                str19 = str17;
                                                                                str5 = str3;
                                                                            }
                                                                        } catch (asks e29) {
                                                                            e = e29;
                                                                            str3 = askf3;
                                                                            str = str18;
                                                                            int i10 = str19;
                                                                            i2 = i7;
                                                                            str4 = str21;
                                                                            askf2 = askf4;
                                                                            str9 = str17;
                                                                            asks2 = e;
                                                                            str8 = str9;
                                                                            askf = askf2;
                                                                            str18 = str3;
                                                                            str19 = str8;
                                                                            askf3 = askf;
                                                                            String str23222222 = str19;
                                                                            askf askf5222222 = askf3;
                                                                            r72 = str23222222;
                                                                            askf3 = askf5222222;
                                                                            bnsl bnsl1022222222222 = (bnsl) f108615a.mo68388c();
                                                                            bnsl1022222222222.mo68437a(asks);
                                                                            bnsl1022222222222.mo68432a(str18, "a", 179, (String) str19);
                                                                            bnsl1022222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                            m93079a(askf3).mo49764e(21);
                                                                            i7 = i2 + 1;
                                                                            tapAndPayNotificationIntentOperation = this;
                                                                            askf4 = askf3;
                                                                            askf3 = str18;
                                                                            str17 = str19;
                                                                            bldf2 = bldf;
                                                                            str21 = str4;
                                                                            str18 = str;
                                                                            i6 = 4;
                                                                        } catch (RuntimeException e30) {
                                                                        }
                                                                    } else if (i8 == 22) {
                                                                        tapAndPayNotificationIntentOperation.startService(IntentOperation.getStartIntent(tapAndPayNotificationIntentOperation, "com.google.android.gms.tapandpay.keyguard.RemoteLockIntentOperation", "com.google.android.gms.tapandpay.keyguard.REMOTE_LOCK"));
                                                                        str = str18;
                                                                        i = str19;
                                                                        i2 = i7;
                                                                        str4 = str21;
                                                                        str5 = askf3;
                                                                        str19 = str17;
                                                                        askf3 = askf4;
                                                                    } else if (i8 == 30) {
                                                                        new atat().mo49770a(bmux, askf4);
                                                                        str = str18;
                                                                        i = str19;
                                                                        i2 = i7;
                                                                        str4 = str21;
                                                                        str5 = askf3;
                                                                        str19 = str17;
                                                                        askf3 = askf4;
                                                                    } else if (i8 == 34) {
                                                                        Context context4 = askf4.f89126d;
                                                                        aebi aebi = new aebi();
                                                                        aebi.mo34004a(0L, 1L);
                                                                        aebi.f63099k = "clientconfig.oneoffsync";
                                                                        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                                                                        aebi.mo34023a(0);
                                                                        aebi.mo34024a(0, 0);
                                                                        aebi.mo34027b(0);
                                                                        aeat.m51532a(context4).mo33984a(aebi.mo33974b());
                                                                        str = str18;
                                                                        i = str19;
                                                                        i2 = i7;
                                                                        str4 = str21;
                                                                        str5 = askf3;
                                                                        str19 = str17;
                                                                        askf3 = askf4;
                                                                    } else if (i8 != 43) {
                                                                        if (i8 != 44) {
                                                                            switch (i8) {
                                                                                case 9:
                                                                                    atds.m75666a(askf4).mo49857c();
                                                                                    str = str18;
                                                                                    i = str19;
                                                                                    i2 = i7;
                                                                                    str4 = str21;
                                                                                    str5 = askf3;
                                                                                    str19 = str17;
                                                                                    askf3 = askf4;
                                                                                    break;
                                                                                case 10:
                                                                                    if (!(bmux.f130993b == 3 ? (String) bmux.f130994c : str21).isEmpty()) {
                                                                                        atbq b5 = m93082b();
                                                                                        if (bmux.f130993b != 3) {
                                                                                            str16 = str21;
                                                                                        } else {
                                                                                            str16 = (String) bmux.f130994c;
                                                                                        }
                                                                                        b5.mo49781a();
                                                                                        if (!atbm.m75391a(askf4, str16, new String[]{"requested"}, "ready_for_pickup")) {
                                                                                            str = str18;
                                                                                            i = str19;
                                                                                            i2 = i7;
                                                                                            str4 = str21;
                                                                                            str5 = askf3;
                                                                                            str19 = str17;
                                                                                            askf3 = askf4;
                                                                                            break;
                                                                                        } else {
                                                                                            b5.mo49783a(askf4.f89126d, askf4.f89125c);
                                                                                            str = str18;
                                                                                            i = str19;
                                                                                            i2 = i7;
                                                                                            str4 = str21;
                                                                                            str5 = askf3;
                                                                                            str19 = str17;
                                                                                            askf3 = askf4;
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        bnsl bnsl18 = (bnsl) f108615a.mo68388c();
                                                                                        bnsl18.mo68432a((String) askf3, "a", 202, str17);
                                                                                        bnsl18.mo68405a("Instrument id missing, dropping notification");
                                                                                        str19 = str17;
                                                                                        str = str18;
                                                                                        i2 = i7;
                                                                                        str4 = str21;
                                                                                        str18 = askf3;
                                                                                        askf3 = askf4;
                                                                                        break;
                                                                                    }
                                                                                case 11:
                                                                                    tapAndPayNotificationIntentOperation.startService(asju.m74251a(askf4, bmux.f130997f));
                                                                                    atds.m75666a(askf4).mo49857c();
                                                                                    str = str18;
                                                                                    i = str19;
                                                                                    i2 = i7;
                                                                                    str4 = str21;
                                                                                    str5 = askf3;
                                                                                    str19 = str17;
                                                                                    askf3 = askf4;
                                                                                    break;
                                                                                default:
                                                                                    switch (i8) {
                                                                                        case FelicaException.TYPE_NOT_CLOSED:
                                                                                            askt askt = new askt();
                                                                                            bnsl bnsl19 = (bnsl) askt.f89131a.mo68388c();
                                                                                            bnsl19.mo68432a("askt", "a", 27, str17);
                                                                                            bnsl19.mo68405a("Deleting account data due to SERVICE_DELETION");
                                                                                            askt.mo49219b(askf4);
                                                                                            str = str18;
                                                                                            i = str19;
                                                                                            i2 = i7;
                                                                                            str4 = str21;
                                                                                            str5 = askf3;
                                                                                            str19 = str17;
                                                                                            askf3 = askf4;
                                                                                            break;
                                                                                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                                                                            str = str18;
                                                                                            i = str19;
                                                                                            i2 = i7;
                                                                                            str4 = str21;
                                                                                            str5 = askf3;
                                                                                            str19 = str17;
                                                                                            askf3 = askf4;
                                                                                            break;
                                                                                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                                                                                            if ((bmux.f130992a & 16777216) != 0) {
                                                                                                try {
                                                                                                    int i11 = asiv.f89057a;
                                                                                                    bmuw bmuw = bmux.f130999h;
                                                                                                    if (bmuw == null) {
                                                                                                        bmuw = bmuw.f130975l;
                                                                                                    }
                                                                                                    String str29 = bmuw.f130978b;
                                                                                                    bmuw bmuw2 = bmux.f130999h;
                                                                                                    if (bmuw2 == null) {
                                                                                                        bmuw2 = bmuw.f130975l;
                                                                                                    }
                                                                                                    asiv.m74183a(askf4, str29, bmuw2.f130977a);
                                                                                                    str = str18;
                                                                                                    i = str19;
                                                                                                    i2 = i7;
                                                                                                    str4 = str21;
                                                                                                    str5 = askf3;
                                                                                                    str19 = str17;
                                                                                                    askf3 = askf4;
                                                                                                    break;
                                                                                                } catch (SQLiteException | atfh | IOException e31) {
                                                                                                    str19 = str17;
                                                                                                    str = str18;
                                                                                                    i2 = i7;
                                                                                                    str4 = str21;
                                                                                                    str18 = askf3;
                                                                                                    askf3 = askf4;
                                                                                                    break;
                                                                                                }
                                                                                            } else {
                                                                                                bnsl bnsl20 = (bnsl) f108615a.mo68388c();
                                                                                                bnsl20.mo68432a((String) askf3, "a", 248, str17);
                                                                                                bnsl20.mo68405a("Missing token provisioning data. Dropping notification");
                                                                                                str19 = str17;
                                                                                                str = str18;
                                                                                                i2 = i7;
                                                                                                str4 = str21;
                                                                                                str18 = askf3;
                                                                                                askf3 = askf4;
                                                                                                break;
                                                                                            }
                                                                                        default:
                                                                                            try {
                                                                                                bnsl bnsl21 = (bnsl) f108615a.mo68388c();
                                                                                                bnsl21.mo68432a((String) askf3, "a", 283, str17);
                                                                                                bnsl21.mo68409a("Unknown tap-and-pay notification type: %d", i8);
                                                                                                m93079a(askf4).mo49764e(22);
                                                                                                str19 = str17;
                                                                                                str = str18;
                                                                                                i2 = i7;
                                                                                                str4 = str21;
                                                                                                str18 = askf3;
                                                                                                askf3 = askf4;
                                                                                            } catch (asks e32) {
                                                                                                asks = e32;
                                                                                                str = str18;
                                                                                                i = str19;
                                                                                                i2 = i7;
                                                                                                str4 = str21;
                                                                                                str18 = askf3;
                                                                                                r72 = str17;
                                                                                                askf3 = askf4;
                                                                                                try {
                                                                                                    bnsl bnsl10222222222222 = (bnsl) f108615a.mo68388c();
                                                                                                    bnsl10222222222222.mo68437a(asks);
                                                                                                    bnsl10222222222222.mo68432a(str18, "a", 179, (String) str19);
                                                                                                    bnsl10222222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                    m93079a(askf3).mo49764e(21);
                                                                                                    i7 = i2 + 1;
                                                                                                    tapAndPayNotificationIntentOperation = this;
                                                                                                    askf4 = askf3;
                                                                                                    askf3 = str18;
                                                                                                    str17 = str19;
                                                                                                    bldf2 = bldf;
                                                                                                    str21 = str4;
                                                                                                    str18 = str;
                                                                                                    i6 = 4;
                                                                                                } catch (RuntimeException e33) {
                                                                                                    e = e33;
                                                                                                    str19 = str19;
                                                                                                    runtimeException = e;
                                                                                                    try {
                                                                                                        bnsl bnsl152 = (bnsl) f108615a.mo68388c();
                                                                                                        bnsl152.mo68437a(runtimeException);
                                                                                                        bnsl152.mo68432a(str18, str, 69, str19);
                                                                                                        bnsl152.mo68405a("Error handling intent");
                                                                                                        m93085e().mo49764e(20);
                                                                                                        asfd.m73946a(this, intent);
                                                                                                    } catch (Throwable th2) {
                                                                                                        Throwable th3 = th2;
                                                                                                        asfd.m73946a(this, intent);
                                                                                                        throw th3;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                    }
                                                                            }
                                                                        } else if ((bmux.f130992a & 16777216) == 0) {
                                                                            bnsl bnsl22 = (bnsl) f108615a.mo68388c();
                                                                            bnsl22.mo68432a((String) askf3, "a", 273, str17);
                                                                            bnsl22.mo68405a("Missing token provisioning data. Dropping notification");
                                                                            str19 = str17;
                                                                            str = str18;
                                                                            i2 = i7;
                                                                            str4 = str21;
                                                                            str18 = askf3;
                                                                            askf3 = askf4;
                                                                        } else {
                                                                            bmuw bmuw3 = bmux.f130999h;
                                                                            if (bmuw3 == null) {
                                                                                bmuw3 = bmuw.f130975l;
                                                                            }
                                                                            Intent a6 = atrq.m76259a(askf4.f89126d.getPackageName(), askf4.mo49209a(), null);
                                                                            a6.putExtra("session_id", bmuw3.f130978b);
                                                                            a6.putExtra("token_provisioning_data", bmuw3.mo73642k());
                                                                            bmuw bmuw4 = bmux.f130999h;
                                                                            if (bmuw4 == null) {
                                                                                bmuw4 = bmuw.f130975l;
                                                                            }
                                                                            aszq.m75253a(askf4, bmuw4, a6);
                                                                            str = str18;
                                                                            i = str19;
                                                                            i2 = i7;
                                                                            str4 = str21;
                                                                            str5 = askf3;
                                                                            str19 = str17;
                                                                            askf3 = askf4;
                                                                        }
                                                                    } else if ((bmux.f130992a & 16777216) == 0) {
                                                                        bnsl bnsl23 = (bnsl) f108615a.mo68388c();
                                                                        bnsl23.mo68432a((String) askf3, "a", 264, str17);
                                                                        bnsl23.mo68405a("Missing token provisioning data. Dropping notification");
                                                                        str19 = str17;
                                                                        str = str18;
                                                                        i2 = i7;
                                                                        str4 = str21;
                                                                        str18 = askf3;
                                                                        askf3 = askf4;
                                                                    } else {
                                                                        bmuw bmuw5 = bmux.f130999h;
                                                                        if (bmuw5 == null) {
                                                                            bmuw5 = bmuw.f130975l;
                                                                        }
                                                                        tapAndPayNotificationIntentOperation.startService(IntentOperation.getStartIntent(askf4.f89126d, "com.google.android.gms.tapandpay.issuer.CheckEligibilityIntentOperation", "com.google.android.gms.tapandpay.issuer.ACTION_CHECK_ELIGIBILITY").putExtra("extra_account_info", askf4.mo49209a()).putExtra("extra_server_provisioning_session_id", bmuw5.f130977a).putExtra("extra_client_provisioning_session_id", bmuw5.f130978b));
                                                                        str = str18;
                                                                        i = str19;
                                                                        i2 = i7;
                                                                        str4 = str21;
                                                                        str5 = askf3;
                                                                        str19 = str17;
                                                                        askf3 = askf4;
                                                                    }
                                                                    m93079a((askf) askf3).mo49764e(19);
                                                                } catch (asks e34) {
                                                                    e = e34;
                                                                    str = str18;
                                                                    i = str19;
                                                                    i2 = i7;
                                                                    str4 = str21;
                                                                    str5 = askf3;
                                                                    str19 = str17;
                                                                    askf3 = askf4;
                                                                    asks = e;
                                                                    r72 = str19;
                                                                    bnsl bnsl102222222222222 = (bnsl) f108615a.mo68388c();
                                                                    bnsl102222222222222.mo68437a(asks);
                                                                    bnsl102222222222222.mo68432a(str18, "a", 179, (String) str19);
                                                                    bnsl102222222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                    m93079a(askf3).mo49764e(21);
                                                                    i7 = i2 + 1;
                                                                    tapAndPayNotificationIntentOperation = this;
                                                                    askf4 = askf3;
                                                                    askf3 = str18;
                                                                    str17 = str19;
                                                                    bldf2 = bldf;
                                                                    str21 = str4;
                                                                    str18 = str;
                                                                    i6 = 4;
                                                                }
                                                            } catch (asks e35) {
                                                                e = e35;
                                                                str = str18;
                                                                bldf = bldf2;
                                                                i = str19;
                                                                i2 = i7;
                                                                str4 = str21;
                                                                str5 = askf3;
                                                                str19 = str17;
                                                                askf3 = askf4;
                                                                asks = e;
                                                                r72 = str19;
                                                                bnsl bnsl1022222222222222 = (bnsl) f108615a.mo68388c();
                                                                bnsl1022222222222222.mo68437a(asks);
                                                                bnsl1022222222222222.mo68432a(str18, "a", 179, (String) str19);
                                                                bnsl1022222222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                m93079a(askf3).mo49764e(21);
                                                                i7 = i2 + 1;
                                                                tapAndPayNotificationIntentOperation = this;
                                                                askf4 = askf3;
                                                                askf3 = str18;
                                                                str17 = str19;
                                                                bldf2 = bldf;
                                                                str21 = str4;
                                                                str18 = str;
                                                                i6 = 4;
                                                            }
                                                        } else {
                                                            bnsl bnsl24 = (bnsl) f108615a.mo68388c();
                                                            bnsl24.mo68432a((String) askf3, "a", 170, str17);
                                                            bnsl24.mo68405a("Can't get auth token, dropping message");
                                                            m93079a(askf4).mo49764e(18);
                                                            str19 = str17;
                                                            str = str18;
                                                            bldf = bldf2;
                                                            i2 = i7;
                                                            str4 = str21;
                                                            str18 = askf3;
                                                            askf3 = askf4;
                                                        }
                                                    }
                                                }
                                            }
                                            i7 = i2 + 1;
                                            tapAndPayNotificationIntentOperation = this;
                                            askf4 = askf3;
                                            askf3 = str18;
                                            str17 = str19;
                                            bldf2 = bldf;
                                            str21 = str4;
                                            str18 = str;
                                            i6 = 4;
                                        }
                                    }
                                }
                            }
                        } catch (RuntimeException e36) {
                            e = e36;
                            str19 = str17;
                            str = str18;
                            str18 = askf3;
                            runtimeException = e;
                            bnsl bnsl1522 = (bnsl) f108615a.mo68388c();
                            bnsl1522.mo68437a(runtimeException);
                            bnsl1522.mo68432a(str18, str, 69, str19);
                            bnsl1522.mo68405a("Error handling intent");
                            m93085e().mo49764e(20);
                            asfd.m73946a(this, intent);
                        }
                    } catch (bxwf e37) {
                        bnsl bnsl25 = (bnsl) f108615a.mo68388c();
                        bnsl25.mo68437a(e37);
                        bnsl25.mo68432a(askf3, "a", 97, str17);
                        bnsl25.mo68405a("Failed to parse payload into protobuf, dropping message");
                        m93085e().mo49764e(8);
                    }
                } catch (IllegalArgumentException e38) {
                    bnsl bnsl26 = (bnsl) f108615a.mo68388c();
                    bnsl26.mo68437a(e38);
                    bnsl26.mo68432a(askf3, "a", 87, str17);
                    bnsl26.mo68405a("Failed to parse payload string into bytes, dropping message");
                    m93085e().mo49764e(7);
                }
            }
        } else {
            str19 = str17;
            str = str18;
            str18 = askf3;
            m93085e().mo49764e(5);
            intent.getAction();
        }
        asfd.m73946a(this, intent);
        str18 = askf3;
        bnsl bnsl15222 = (bnsl) f108615a.mo68388c();
        bnsl15222.mo68437a(runtimeException);
        bnsl15222.mo68432a(str18, str, 69, str19);
        bnsl15222.mo68405a("Error handling intent");
        m93085e().mo49764e(20);
        asfd.m73946a(this, intent);
    }

    /* renamed from: a */
    private static atam m93079a(askf askf) {
        return new atam(askf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:224:0x0525 A[SYNTHETIC, Splitter:B:224:0x0525] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0540 A[Catch:{ asks -> 0x074f }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0541 A[Catch:{ asks -> 0x074f }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0592 A[Catch:{ asks -> 0x074a }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05a0 A[Catch:{ asks -> 0x074a }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x05c0 A[Catch:{ asks -> 0x074a }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x05cb A[Catch:{ asks -> 0x074a }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05f6 A[Catch:{ asks -> 0x074a }] */
    /* renamed from: a */
    private final void m93080a(Intent intent) {
        String str;
        int i;
        String str2;
        bldf bldf;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i3;
        int i4;
        C1102je jeVar;
        Transaction transaction;
        String str8;
        Boolean valueOf;
        Transaction transaction2;
        String str9;
        TapAndPayNotificationIntentOperation tapAndPayNotificationIntentOperation = this;
        String stringExtra = intent.getStringExtra("ht");
        String str10 = "com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation";
        if (!TextUtils.isEmpty(stringExtra)) {
            int i5 = 1;
            try {
                try {
                    bldf bldf2 = (bldf) bxvk.m124016a(bldf.f126055d, Base64.decode(stringExtra, 1), bxus.m123744c());
                    String str11 = "";
                    String str12 = (bldf2.f126057a & 1) != 0 ? bldf2.f126058b : str11;
                    if (str12.isEmpty()) {
                        bnsl bnsl = (bnsl) f108615a.mo68388c();
                        bnsl.mo68432a(str10, "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Recipient account id missing, dropping message");
                        m93085e().mo49764e(10);
                        return;
                    }
                    String a = asjg.m74211a(tapAndPayNotificationIntentOperation, str12);
                    if (TextUtils.isEmpty(a)) {
                        bnsl bnsl2 = (bnsl) f108615a.mo68388c();
                        bnsl2.mo68432a(str10, "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Recipient account not on device, dropping message");
                        m93085e().mo49764e(11);
                        return;
                    }
                    AccountInfo accountInfo = new AccountInfo(str12, a);
                    String b = askc.m74272b();
                    if (bldf2.f126059c.size() != 0) {
                        askf askf = new askf(accountInfo, b, tapAndPayNotificationIntentOperation);
                        int i6 = 0;
                        while (i6 < bldf2.f126059c.size()) {
                            blci blci = (blci) bldf2.f126059c.get(i6);
                            String str13 = askf.f89124b;
                            if ((blci.f125925a & 4) != 0) {
                                blde blde = blci.f125928d;
                                if (blde == null) {
                                    blde = blde.f126049d;
                                }
                                if ((blde.f126051a & 32) == 0) {
                                    bnsl bnsl3 = (bnsl) f108615a.mo68388c();
                                    bnsl3.mo68432a(str10, "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68405a("AppPayload missing, dropping notification");
                                    m93079a(askf).mo49764e(14);
                                    str3 = str10;
                                    bldf = bldf2;
                                    str2 = str11;
                                    i2 = i6;
                                } else {
                                    blde blde2 = blci.f125928d;
                                    if (blde2 == null) {
                                        blde2 = blde.f126049d;
                                    }
                                    bldd bldd = blde2.f126053c;
                                    if (bldd == null) {
                                        bldd = bldd.f126046a;
                                    }
                                    bxvj bxvj = bmux.f130990j;
                                    bldd.mo74135a(bxvj);
                                    if (bldd.f164952m.mo73911a(bxvj.f164958d)) {
                                        bxvj bxvj2 = bmux.f130990j;
                                        bldd.mo74135a(bxvj2);
                                        Object b2 = bldd.f164952m.mo73913b(bxvj2.f164958d);
                                        if (b2 == null) {
                                            b2 = bxvj2.f164956b;
                                        } else {
                                            bxvj2.mo74139a(b2);
                                        }
                                        bmux bmux = (bmux) b2;
                                        int a2 = bmup.m108398a(bmux.f130995d);
                                        int i7 = a2 != 0 ? a2 : 1;
                                        if (i7 == i5) {
                                            bnsl bnsl4 = (bnsl) f108615a.mo68388c();
                                            bnsl4.mo68432a(str10, "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68405a("Notification type UNKNOWN, dropping notification");
                                            m93079a(askf).mo49764e(16);
                                            str3 = str10;
                                            bldf = bldf2;
                                            str2 = str11;
                                            i2 = i6;
                                        } else if (i7 != 31 && !asjw.m74259d(this)) {
                                            m93079a(askf).mo49764e(17);
                                            str3 = str10;
                                            bldf = bldf2;
                                            str2 = str11;
                                            i2 = i6;
                                        } else if (i7 == 38 || asjg.m74214a(tapAndPayNotificationIntentOperation, str13, askf.f89125c)) {
                                            try {
                                                bnsl a3 = f108615a.mo26019b(aske.m74275a());
                                                a3.mo68432a(str10, "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                int i8 = i7 - 1;
                                                a3.mo68409a("Dispatching notification with type: %d", i8);
                                                if (i8 == i5) {
                                                    str = str10;
                                                    bldf = bldf2;
                                                    str2 = str11;
                                                    i = i7;
                                                    i2 = i6;
                                                    if (bmux.f130993b == 3) {
                                                        str5 = (String) bmux.f130994c;
                                                    } else {
                                                        str5 = str2;
                                                    }
                                                    if (str5.isEmpty()) {
                                                        bnsl bnsl5 = (bnsl) f108615a.mo68388c();
                                                        str3 = str;
                                                        try {
                                                            bnsl5.mo68432a(str3, "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl5.mo68405a("Instrument id missing, dropping notification");
                                                        } catch (asks e) {
                                                            e = e;
                                                            bnsl bnsl6 = (bnsl) f108615a.mo68388c();
                                                            bnsl6.mo68437a(e);
                                                            bnsl6.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl6.mo68409a("Error dispatching notification type: %d", i - 1);
                                                            m93079a(askf).mo49764e(21);
                                                            i6 = i2 + 1;
                                                            tapAndPayNotificationIntentOperation = this;
                                                            str10 = str3;
                                                            bldf2 = bldf;
                                                            str11 = str2;
                                                            i5 = 1;
                                                        }
                                                    } else {
                                                        str3 = str;
                                                        atbq b3 = m93082b();
                                                        if (bmux.f130993b != 3) {
                                                            str6 = str2;
                                                        } else {
                                                            str6 = (String) bmux.f130994c;
                                                        }
                                                        b3.mo49781a();
                                                        String[] strArr = new String[2];
                                                        try {
                                                            strArr[0] = "active";
                                                            try {
                                                                strArr[1] = "unacknowledged";
                                                                if (!atbm.m75391a(askf, str6, strArr, "needs_refresh")) {
                                                                    bnsl bnsl7 = (bnsl) atbq.f90017a.mo68388c();
                                                                    bnsl7.mo68432a("atbq", "a", 954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl7.mo68405a("Received DEVICE_TOKEN_REPLENISH notification while bundle in unexpected state");
                                                                } else {
                                                                    atcj.m75548a(askf.f89126d);
                                                                }
                                                            } catch (asks e2) {
                                                                e = e2;
                                                                bnsl bnsl62 = (bnsl) f108615a.mo68388c();
                                                                bnsl62.mo68437a(e);
                                                                bnsl62.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                bnsl62.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                m93079a(askf).mo49764e(21);
                                                                i6 = i2 + 1;
                                                                tapAndPayNotificationIntentOperation = this;
                                                                str10 = str3;
                                                                bldf2 = bldf;
                                                                str11 = str2;
                                                                i5 = 1;
                                                            }
                                                        } catch (asks e3) {
                                                            e = e3;
                                                            bnsl bnsl622 = (bnsl) f108615a.mo68388c();
                                                            bnsl622.mo68437a(e);
                                                            bnsl622.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl622.mo68409a("Error dispatching notification type: %d", i - 1);
                                                            m93079a(askf).mo49764e(21);
                                                            i6 = i2 + 1;
                                                            tapAndPayNotificationIntentOperation = this;
                                                            str10 = str3;
                                                            bldf2 = bldf;
                                                            str11 = str2;
                                                            i5 = 1;
                                                        }
                                                    }
                                                } else if (i8 == 5) {
                                                    try {
                                                        atwb c = m93083c();
                                                        if (!asiv.m74193c(askf)) {
                                                            if (cgwn.m147261k()) {
                                                                try {
                                                                    atbd.m75359b(askf);
                                                                    str3 = str10;
                                                                    bldf = bldf2;
                                                                    str2 = str11;
                                                                    i = i7;
                                                                    i2 = i6;
                                                                } catch (atfh | IOException | IllegalStateException e4) {
                                                                    bnsl bnsl8 = (bnsl) atwb.f91035a.mo68388c();
                                                                    bnsl8.mo68437a(e4);
                                                                    bnsl8.mo68432a("atwb", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl8.mo68405a("Update chime setting failed");
                                                                    str3 = str10;
                                                                    bldf = bldf2;
                                                                    str2 = str11;
                                                                    i = i7;
                                                                    i2 = i6;
                                                                }
                                                            } else {
                                                                str3 = str10;
                                                                bldf = bldf2;
                                                                str2 = str11;
                                                                i = i7;
                                                                i2 = i6;
                                                            }
                                                        } else if ((bmux.f130992a & 2) != 0) {
                                                            bmuq bmuq = bmux.f130996e;
                                                            if (bmuq == null) {
                                                                bmuq = bmuq.f130966d;
                                                            }
                                                            String str14 = bmuq.f130969b;
                                                            i2 = str14.isEmpty();
                                                            if (i2 == 0) {
                                                                try {
                                                                    btqu btqu = (btqu) btqw.f150046c.mo74144da();
                                                                    bxvd da = btqv.f150043b.mo74144da();
                                                                    bldf = bldf2;
                                                                    try {
                                                                        if (da.f164950c) {
                                                                            da.mo74035c();
                                                                            da.f164950c = false;
                                                                        }
                                                                        str14.getClass();
                                                                        ((btqv) da.f164949b).f150045a = str14;
                                                                        btqu.mo70834a(da);
                                                                        btqu.mo70833a(btrh.SUPPORTS_INFERRED_RICH_DATA);
                                                                        btqy btqy = (btqy) atff.m75759a(askf, "t/transaction/get", (btqw) btqu.mo74062i(), btqy.f150053b);
                                                                        try {
                                                                            if (btqy.f150055a.size() == 1) {
                                                                                try {
                                                                                    btrg btrg = ((btqx) btqy.f150055a.get(0)).f150052a;
                                                                                    if (btrg != null) {
                                                                                        CardInfo b4 = atds.m75666a(askf).mo49853b(btrg.f150097g);
                                                                                        if (b4 == null) {
                                                                                            try {
                                                                                                bnsl bnsl9 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                bnsl9.mo68432a("atwb", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                bnsl9.mo68405a("Could not find payment card for transaction, dropping notification");
                                                                                                str3 = str10;
                                                                                                str2 = str11;
                                                                                                i = i7;
                                                                                                i2 = i6;
                                                                                            } catch (asks e5) {
                                                                                                e = e5;
                                                                                                str4 = str10;
                                                                                                str2 = str11;
                                                                                                i = i7;
                                                                                                i2 = i6;
                                                                                                bnsl bnsl6222 = (bnsl) f108615a.mo68388c();
                                                                                                bnsl6222.mo68437a(e);
                                                                                                bnsl6222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                bnsl6222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                m93079a(askf).mo49764e(21);
                                                                                                i6 = i2 + 1;
                                                                                                tapAndPayNotificationIntentOperation = this;
                                                                                                str10 = str3;
                                                                                                bldf2 = bldf;
                                                                                                str11 = str2;
                                                                                                i5 = 1;
                                                                                            }
                                                                                        } else {
                                                                                            atvv atvv = new atvv(btrg);
                                                                                            Context context = askf.f89126d;
                                                                                            sre.m36089i(context);
                                                                                            Context context2 = askf.f89126d;
                                                                                            str2 = str11;
                                                                                            try {
                                                                                                btrb btrb = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                                                                if (btrb != null) {
                                                                                                    btrd btrd = btrb.f150063f;
                                                                                                    if (btrd != null) {
                                                                                                        try {
                                                                                                            if (!btrd.f150072a.isEmpty()) {
                                                                                                                btrb btrb2 = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                                                                                if (btrb2 == null) {
                                                                                                                    btrb2 = btrb.f150056k;
                                                                                                                }
                                                                                                                btrd btrd2 = btrb2.f150063f;
                                                                                                                if (btrd2 == null) {
                                                                                                                    btrd2 = btrd.f150070b;
                                                                                                                }
                                                                                                                str7 = btrd2.f150072a;
                                                                                                                C1102je a4 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                                                                                                                atbg.m75376b(a4, str7);
                                                                                                                if (atvv.mo50255f()) {
                                                                                                                    i3 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_text_full : C0126R.string.tp_transaction_declined_notification_text_full;
                                                                                                                } else {
                                                                                                                    i3 = C0126R.string.tp_transaction_refund_notification_text_full;
                                                                                                                }
                                                                                                                i = i7;
                                                                                                                String str15 = b4.f108343d;
                                                                                                                if (!atyj.m76564a(b4)) {
                                                                                                                    str15 = context.getString(C0126R.string.tp_paypal);
                                                                                                                }
                                                                                                                str = str10;
                                                                                                                i4 = i6;
                                                                                                                atbg.m75377c(a4, context.getString(i3, atvv.mo50252c(), str15));
                                                                                                                a4.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                                                                                                a4.mo13631b(PendingIntent.getService(context, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf, blci.mo73642k(), 6, b4), 134217728));
                                                                                                                boolean f = atvv.mo50255f();
                                                                                                                int i9 = C0126R.string.tp_transaction_decline_notification_ticker;
                                                                                                                int i10 = f ? !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_title_sensitive : C0126R.string.tp_transaction_decline_notification_ticker : C0126R.string.tp_transaction_refund_notification_title_sensitive;
                                                                                                                C1102je a5 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                                                                                                                a5.mo13640e(context.getString(i10));
                                                                                                                a5.mo13632b(context.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                                                                                                if (!atvv.mo50255f()) {
                                                                                                                    i9 = C0126R.string.tp_transaction_refund_notification_ticker;
                                                                                                                } else if (!atvv.mo50256g()) {
                                                                                                                    i9 = C0126R.string.tp_transaction_notification_ticker;
                                                                                                                }
                                                                                                                a4.mo13639d(context.getString(i9));
                                                                                                                if (cgwn.m147260j() && (bmuq.f130968a & 2) != 0) {
                                                                                                                    bmxv bmxv = c.f91036b;
                                                                                                                    valueOf = Boolean.valueOf(alfj.m60866b(askf.f89126d));
                                                                                                                    bmxv.mo66812a(valueOf);
                                                                                                                    if (valueOf.booleanValue()) {
                                                                                                                        bztn bztn = bmuq.f130970c;
                                                                                                                        if (bztn == null) {
                                                                                                                            bztn = bztn.f171350b;
                                                                                                                        }
                                                                                                                        String str16 = bztn.f171352a;
                                                                                                                        bztn bztn2 = bmuq.f130970c;
                                                                                                                        if (bztn2 == null) {
                                                                                                                            bztn2 = bztn.f171350b;
                                                                                                                        }
                                                                                                                        DisplayMetrics displayMetrics = askf.f89126d.getResources().getDisplayMetrics();
                                                                                                                        int round = Math.round(((float) displayMetrics.widthPixels) - (displayMetrics.density * 32.0f));
                                                                                                                        int round2 = Math.round(((float) round) * 0.48f);
                                                                                                                        bxvd da2 = bzur.f171456c.mo74144da();
                                                                                                                        String str17 = str16;
                                                                                                                        if (da2.f164950c) {
                                                                                                                            da2.mo74035c();
                                                                                                                            da2.f164950c = false;
                                                                                                                        }
                                                                                                                        bztn2.getClass();
                                                                                                                        ((bzur) da2.f164949b).f171458a = bztn2;
                                                                                                                        bxvd da3 = bztm.f171347b.mo74144da();
                                                                                                                        bxvd da4 = bztl.f171342d.mo74144da();
                                                                                                                        float f2 = displayMetrics.density;
                                                                                                                        jeVar = a4;
                                                                                                                        if (da4.f164950c) {
                                                                                                                            da4.mo74035c();
                                                                                                                            da4.f164950c = false;
                                                                                                                        }
                                                                                                                        bztl bztl = (bztl) da4.f164949b;
                                                                                                                        bztl.f171346c = f2;
                                                                                                                        bztl.f171344a = round;
                                                                                                                        bztl.f171345b = round2;
                                                                                                                        if (da3.f164950c) {
                                                                                                                            da3.mo74035c();
                                                                                                                            da3.f164950c = false;
                                                                                                                        }
                                                                                                                        bztl bztl2 = (bztl) da4.mo74062i();
                                                                                                                        bztl2.getClass();
                                                                                                                        ((bztm) da3.f164949b).f171349a = bztl2;
                                                                                                                        if (da2.f164950c) {
                                                                                                                            da2.mo74035c();
                                                                                                                            da2.f164950c = false;
                                                                                                                        }
                                                                                                                        bztm bztm = (bztm) da3.mo74062i();
                                                                                                                        bztm.getClass();
                                                                                                                        ((bzur) da2.f164949b).f171459b = bztm;
                                                                                                                        try {
                                                                                                                            bzus bzus = (bzus) atff.m75769b(askf, "g/transaction/getcoretransaction", (bzur) da2.mo74062i(), bzus.f171460b);
                                                                                                                            if (bzus.f171462a != null) {
                                                                                                                                algt algt = new algt();
                                                                                                                                bzuq bzuq = bzus.f171462a;
                                                                                                                                if (bzuq == null) {
                                                                                                                                    bzuq = bzuq.f171454a;
                                                                                                                                }
                                                                                                                                algt.mo40310a(bzuq.mo73642k());
                                                                                                                                transaction2 = algt.f73511a;
                                                                                                                            } else {
                                                                                                                                bnsl bnsl10 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                                                bnsl10.mo68432a("atwb", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                                                bnsl10.mo68405a("tryGetTransaction: no transaction returned");
                                                                                                                                transaction2 = null;
                                                                                                                            }
                                                                                                                        } catch (atfh e6) {
                                                                                                                            bnsl bnsl11 = (bnsl) atwb.f91035a.mo68388c();
                                                                                                                            bnsl11.mo68437a(e6);
                                                                                                                            bnsl11.mo68432a("atwb", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                                            bnsl11.mo68405a("tryGetTransaction: RPC failed");
                                                                                                                            transaction2 = null;
                                                                                                                            str8 = str17;
                                                                                                                            transaction = transaction2;
                                                                                                                            C1102je jeVar2 = jeVar;
                                                                                                                            Context context3 = context;
                                                                                                                            C1102je jeVar3 = a5;
                                                                                                                            blci blci2 = blci;
                                                                                                                            i2 = i4;
                                                                                                                            jeVar2.f22254f = PendingIntent.getActivity(askf.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b4, blci, str8, transaction), 134217728);
                                                                                                                            jeVar2.mo13627a(true);
                                                                                                                            jeVar2.f22273y = jeVar3.mo13629b();
                                                                                                                            atbg.m75371a(context3, Integer.toString(btrg.f150091a.hashCode()), jeVar2);
                                                                                                                            askf.f89126d.startService(atbe.m75364a(askf, blci2.mo73642k(), 5, b4));
                                                                                                                            str3 = str;
                                                                                                                            m93079a(askf).mo49764e(19);
                                                                                                                            i6 = i2 + 1;
                                                                                                                            tapAndPayNotificationIntentOperation = this;
                                                                                                                            str10 = str3;
                                                                                                                            bldf2 = bldf;
                                                                                                                            str11 = str2;
                                                                                                                            i5 = 1;
                                                                                                                        } catch (IOException e7) {
                                                                                                                            transaction2 = null;
                                                                                                                            str8 = str17;
                                                                                                                            transaction = transaction2;
                                                                                                                            C1102je jeVar22 = jeVar;
                                                                                                                            Context context32 = context;
                                                                                                                            C1102je jeVar32 = a5;
                                                                                                                            blci blci22 = blci;
                                                                                                                            i2 = i4;
                                                                                                                            jeVar22.f22254f = PendingIntent.getActivity(askf.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b4, blci, str8, transaction), 134217728);
                                                                                                                            jeVar22.mo13627a(true);
                                                                                                                            jeVar22.f22273y = jeVar32.mo13629b();
                                                                                                                            atbg.m75371a(context32, Integer.toString(btrg.f150091a.hashCode()), jeVar22);
                                                                                                                            askf.f89126d.startService(atbe.m75364a(askf, blci22.mo73642k(), 5, b4));
                                                                                                                            str3 = str;
                                                                                                                            m93079a(askf).mo49764e(19);
                                                                                                                            i6 = i2 + 1;
                                                                                                                            tapAndPayNotificationIntentOperation = this;
                                                                                                                            str10 = str3;
                                                                                                                            bldf2 = bldf;
                                                                                                                            str11 = str2;
                                                                                                                            i5 = 1;
                                                                                                                        }
                                                                                                                        str8 = str17;
                                                                                                                        transaction = transaction2;
                                                                                                                        C1102je jeVar222 = jeVar;
                                                                                                                        Context context322 = context;
                                                                                                                        C1102je jeVar322 = a5;
                                                                                                                        blci blci222 = blci;
                                                                                                                        i2 = i4;
                                                                                                                        jeVar222.f22254f = PendingIntent.getActivity(askf.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b4, blci, str8, transaction), 134217728);
                                                                                                                        jeVar222.mo13627a(true);
                                                                                                                        jeVar222.f22273y = jeVar322.mo13629b();
                                                                                                                        atbg.m75371a(context322, Integer.toString(btrg.f150091a.hashCode()), jeVar222);
                                                                                                                        askf.f89126d.startService(atbe.m75364a(askf, blci222.mo73642k(), 5, b4));
                                                                                                                        str3 = str;
                                                                                                                    }
                                                                                                                }
                                                                                                                jeVar = a4;
                                                                                                                str8 = null;
                                                                                                                transaction = null;
                                                                                                                C1102je jeVar2222 = jeVar;
                                                                                                                Context context3222 = context;
                                                                                                                C1102je jeVar3222 = a5;
                                                                                                                blci blci2222 = blci;
                                                                                                                i2 = i4;
                                                                                                                jeVar2222.f22254f = PendingIntent.getActivity(askf.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b4, blci, str8, transaction), 134217728);
                                                                                                                jeVar2222.mo13627a(true);
                                                                                                                jeVar2222.f22273y = jeVar3222.mo13629b();
                                                                                                                atbg.m75371a(context3222, Integer.toString(btrg.f150091a.hashCode()), jeVar2222);
                                                                                                                askf.f89126d.startService(atbe.m75364a(askf, blci2222.mo73642k(), 5, b4));
                                                                                                                str3 = str;
                                                                                                            }
                                                                                                        } catch (asks e8) {
                                                                                                            e = e8;
                                                                                                            str4 = str10;
                                                                                                            i = i7;
                                                                                                            i2 = i6;
                                                                                                            bnsl bnsl62222 = (bnsl) f108615a.mo68388c();
                                                                                                            bnsl62222.mo68437a(e);
                                                                                                            bnsl62222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                            bnsl62222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                            m93079a(askf).mo49764e(21);
                                                                                                            i6 = i2 + 1;
                                                                                                            tapAndPayNotificationIntentOperation = this;
                                                                                                            str10 = str3;
                                                                                                            bldf2 = bldf;
                                                                                                            str11 = str2;
                                                                                                            i5 = 1;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                str7 = context2.getString(C0126R.string.tp_default_store_name);
                                                                                                C1102je a42 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                                                                                                atbg.m75376b(a42, str7);
                                                                                                if (atvv.mo50255f()) {
                                                                                                }
                                                                                                i = i7;
                                                                                            } catch (asks e9) {
                                                                                                e = e9;
                                                                                                i = i7;
                                                                                                i2 = i6;
                                                                                                str3 = str10;
                                                                                                bnsl bnsl622222 = (bnsl) f108615a.mo68388c();
                                                                                                bnsl622222.mo68437a(e);
                                                                                                bnsl622222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                bnsl622222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                m93079a(askf).mo49764e(21);
                                                                                                i6 = i2 + 1;
                                                                                                tapAndPayNotificationIntentOperation = this;
                                                                                                str10 = str3;
                                                                                                bldf2 = bldf;
                                                                                                str11 = str2;
                                                                                                i5 = 1;
                                                                                            }
                                                                                            try {
                                                                                                String str152 = b4.f108343d;
                                                                                                if (!atyj.m76564a(b4)) {
                                                                                                }
                                                                                                str = str10;
                                                                                                i4 = i6;
                                                                                                try {
                                                                                                    atbg.m75377c(a42, context.getString(i3, atvv.mo50252c(), str152));
                                                                                                    a42.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                                                                                    a42.mo13631b(PendingIntent.getService(context, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf, blci.mo73642k(), 6, b4), 134217728));
                                                                                                    boolean f3 = atvv.mo50255f();
                                                                                                    int i92 = C0126R.string.tp_transaction_decline_notification_ticker;
                                                                                                    if (f3) {
                                                                                                    }
                                                                                                    C1102je a52 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                                                                                                    a52.mo13640e(context.getString(i10));
                                                                                                    a52.mo13632b(context.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                                                                                    if (!atvv.mo50255f()) {
                                                                                                    }
                                                                                                    a42.mo13639d(context.getString(i92));
                                                                                                    bmxv bmxv2 = c.f91036b;
                                                                                                    valueOf = Boolean.valueOf(alfj.m60866b(askf.f89126d));
                                                                                                    bmxv2.mo66812a(valueOf);
                                                                                                    if (valueOf.booleanValue()) {
                                                                                                    }
                                                                                                    jeVar = a42;
                                                                                                    str8 = null;
                                                                                                    transaction = null;
                                                                                                    C1102je jeVar22222 = jeVar;
                                                                                                    Context context32222 = context;
                                                                                                    C1102je jeVar32222 = a52;
                                                                                                    blci blci22222 = blci;
                                                                                                    i2 = i4;
                                                                                                } catch (asks e10) {
                                                                                                    e = e10;
                                                                                                    i2 = i4;
                                                                                                }
                                                                                            } catch (asks e11) {
                                                                                                e = e11;
                                                                                                i2 = i6;
                                                                                                str3 = str10;
                                                                                                bnsl bnsl6222222 = (bnsl) f108615a.mo68388c();
                                                                                                bnsl6222222.mo68437a(e);
                                                                                                bnsl6222222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                bnsl6222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                m93079a(askf).mo49764e(21);
                                                                                                i6 = i2 + 1;
                                                                                                tapAndPayNotificationIntentOperation = this;
                                                                                                str10 = str3;
                                                                                                bldf2 = bldf;
                                                                                                str11 = str2;
                                                                                                i5 = 1;
                                                                                            }
                                                                                            try {
                                                                                                jeVar22222.f22254f = PendingIntent.getActivity(askf.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b4, blci, str8, transaction), 134217728);
                                                                                                jeVar22222.mo13627a(true);
                                                                                                jeVar22222.f22273y = jeVar32222.mo13629b();
                                                                                                atbg.m75371a(context32222, Integer.toString(btrg.f150091a.hashCode()), jeVar22222);
                                                                                                askf.f89126d.startService(atbe.m75364a(askf, blci22222.mo73642k(), 5, b4));
                                                                                                str3 = str;
                                                                                            } catch (asks e12) {
                                                                                                e = e12;
                                                                                                str3 = str;
                                                                                                bnsl bnsl62222222 = (bnsl) f108615a.mo68388c();
                                                                                                bnsl62222222.mo68437a(e);
                                                                                                bnsl62222222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                bnsl62222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                                m93079a(askf).mo49764e(21);
                                                                                                i6 = i2 + 1;
                                                                                                tapAndPayNotificationIntentOperation = this;
                                                                                                str10 = str3;
                                                                                                bldf2 = bldf;
                                                                                                str11 = str2;
                                                                                                i5 = 1;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        str = str10;
                                                                                        str2 = str11;
                                                                                        i = i7;
                                                                                        i2 = i6;
                                                                                        str3 = str;
                                                                                    }
                                                                                } catch (asks e13) {
                                                                                    e = e13;
                                                                                    str2 = str11;
                                                                                    i = i7;
                                                                                    i2 = i6;
                                                                                    str3 = str10;
                                                                                    bnsl bnsl622222222 = (bnsl) f108615a.mo68388c();
                                                                                    bnsl622222222.mo68437a(e);
                                                                                    bnsl622222222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                    bnsl622222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                                    m93079a(askf).mo49764e(21);
                                                                                    i6 = i2 + 1;
                                                                                    tapAndPayNotificationIntentOperation = this;
                                                                                    str10 = str3;
                                                                                    bldf2 = bldf;
                                                                                    str11 = str2;
                                                                                    i5 = 1;
                                                                                }
                                                                            } else {
                                                                                str = str10;
                                                                                str2 = str11;
                                                                                i = i7;
                                                                                i2 = i6;
                                                                                btqy.f150055a.size();
                                                                                str3 = str;
                                                                            }
                                                                        } catch (asks e14) {
                                                                            e = e14;
                                                                            str2 = str11;
                                                                            i = i7;
                                                                            i2 = i6;
                                                                            str3 = str10;
                                                                            bnsl bnsl6222222222 = (bnsl) f108615a.mo68388c();
                                                                            bnsl6222222222.mo68437a(e);
                                                                            bnsl6222222222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                            bnsl6222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                                            m93079a(askf).mo49764e(21);
                                                                            i6 = i2 + 1;
                                                                            tapAndPayNotificationIntentOperation = this;
                                                                            str10 = str3;
                                                                            bldf2 = bldf;
                                                                            str11 = str2;
                                                                            i5 = 1;
                                                                        }
                                                                    } catch (IOException e15) {
                                                                        str = str10;
                                                                        str2 = str11;
                                                                        i = i7;
                                                                        i2 = i6;
                                                                        bnsl bnsl12 = (bnsl) atwb.f91035a.mo68388c();
                                                                        bnsl12.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl12.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                        str3 = str;
                                                                        m93079a(askf).mo49764e(19);
                                                                        i6 = i2 + 1;
                                                                        tapAndPayNotificationIntentOperation = this;
                                                                        str10 = str3;
                                                                        bldf2 = bldf;
                                                                        str11 = str2;
                                                                        i5 = 1;
                                                                    } catch (atfh e16) {
                                                                        str = str10;
                                                                        str2 = str11;
                                                                        i = i7;
                                                                        i2 = i6;
                                                                        bnsl bnsl122 = (bnsl) atwb.f91035a.mo68388c();
                                                                        bnsl122.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl122.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                        str3 = str;
                                                                        m93079a(askf).mo49764e(19);
                                                                        i6 = i2 + 1;
                                                                        tapAndPayNotificationIntentOperation = this;
                                                                        str10 = str3;
                                                                        bldf2 = bldf;
                                                                        str11 = str2;
                                                                        i5 = 1;
                                                                    }
                                                                } catch (IOException e17) {
                                                                    str = str10;
                                                                    bldf = bldf2;
                                                                    str2 = str11;
                                                                    i = i7;
                                                                    i2 = i6;
                                                                    bnsl bnsl1222 = (bnsl) atwb.f91035a.mo68388c();
                                                                    bnsl1222.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl1222.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                    str3 = str;
                                                                    m93079a(askf).mo49764e(19);
                                                                    i6 = i2 + 1;
                                                                    tapAndPayNotificationIntentOperation = this;
                                                                    str10 = str3;
                                                                    bldf2 = bldf;
                                                                    str11 = str2;
                                                                    i5 = 1;
                                                                } catch (atfh e18) {
                                                                    str = str10;
                                                                    bldf = bldf2;
                                                                    str2 = str11;
                                                                    i = i7;
                                                                    i2 = i6;
                                                                    bnsl bnsl12222 = (bnsl) atwb.f91035a.mo68388c();
                                                                    bnsl12222.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl12222.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                                                    str3 = str;
                                                                    m93079a(askf).mo49764e(19);
                                                                    i6 = i2 + 1;
                                                                    tapAndPayNotificationIntentOperation = this;
                                                                    str10 = str3;
                                                                    bldf2 = bldf;
                                                                    str11 = str2;
                                                                    i5 = 1;
                                                                }
                                                            } else {
                                                                str = str10;
                                                                bldf = bldf2;
                                                                str2 = str11;
                                                                i = i7;
                                                                i2 = i6;
                                                                str3 = str;
                                                            }
                                                        } else {
                                                            str = str10;
                                                            bldf = bldf2;
                                                            str2 = str11;
                                                            i = i7;
                                                            i2 = i6;
                                                            str3 = str;
                                                        }
                                                    } catch (asks e19) {
                                                        e = e19;
                                                        bldf = bldf2;
                                                        str2 = str11;
                                                        i = i7;
                                                        i2 = i6;
                                                        str3 = str10;
                                                        bnsl bnsl62222222222 = (bnsl) f108615a.mo68388c();
                                                        bnsl62222222222.mo68437a(e);
                                                        bnsl62222222222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl62222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                        m93079a(askf).mo49764e(21);
                                                        i6 = i2 + 1;
                                                        tapAndPayNotificationIntentOperation = this;
                                                        str10 = str3;
                                                        bldf2 = bldf;
                                                        str11 = str2;
                                                        i5 = 1;
                                                    }
                                                } else if (i8 == 22) {
                                                    tapAndPayNotificationIntentOperation.startService(IntentOperation.getStartIntent(tapAndPayNotificationIntentOperation, "com.google.android.gms.tapandpay.keyguard.RemoteLockIntentOperation", "com.google.android.gms.tapandpay.keyguard.REMOTE_LOCK"));
                                                    str3 = str10;
                                                    bldf = bldf2;
                                                    str2 = str11;
                                                    i = i7;
                                                    i2 = i6;
                                                } else if (i8 == 30) {
                                                    new atat().mo49770a(bmux, askf);
                                                    str3 = str10;
                                                    bldf = bldf2;
                                                    str2 = str11;
                                                    i = i7;
                                                    i2 = i6;
                                                } else if (i8 == 34) {
                                                    askb.m74268a(askf.f89126d);
                                                    str3 = str10;
                                                    bldf = bldf2;
                                                    str2 = str11;
                                                    i = i7;
                                                    i2 = i6;
                                                } else if (i8 != 43) {
                                                    if (i8 != 44) {
                                                        switch (i8) {
                                                            case 9:
                                                                atds.m75666a(askf).mo49857c();
                                                                str3 = str10;
                                                                bldf = bldf2;
                                                                str2 = str11;
                                                                i = i7;
                                                                i2 = i6;
                                                                break;
                                                            case 10:
                                                                if (!(bmux.f130993b == 3 ? (String) bmux.f130994c : str11).isEmpty()) {
                                                                    atbq b5 = m93082b();
                                                                    if (bmux.f130993b != 3) {
                                                                        str9 = str11;
                                                                    } else {
                                                                        str9 = (String) bmux.f130994c;
                                                                    }
                                                                    b5.mo49781a();
                                                                    if (!atbm.m75391a(askf, str9, new String[]{"requested"}, "ready_for_pickup")) {
                                                                        str3 = str10;
                                                                        bldf = bldf2;
                                                                        str2 = str11;
                                                                        i = i7;
                                                                        i2 = i6;
                                                                        break;
                                                                    } else {
                                                                        b5.mo49783a(askf.f89126d, askf.f89125c);
                                                                        str3 = str10;
                                                                        bldf = bldf2;
                                                                        str2 = str11;
                                                                        i = i7;
                                                                        i2 = i6;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    bnsl bnsl13 = (bnsl) f108615a.mo68388c();
                                                                    bnsl13.mo68432a(str10, "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                    bnsl13.mo68405a("Instrument id missing, dropping notification");
                                                                    str3 = str10;
                                                                    bldf = bldf2;
                                                                    str2 = str11;
                                                                    i2 = i6;
                                                                    break;
                                                                }
                                                            case 11:
                                                                tapAndPayNotificationIntentOperation.startService(asju.m74251a(askf, bmux.f130997f));
                                                                atds.m75666a(askf).mo49857c();
                                                                str3 = str10;
                                                                bldf = bldf2;
                                                                str2 = str11;
                                                                i = i7;
                                                                i2 = i6;
                                                                break;
                                                            default:
                                                                switch (i8) {
                                                                    case FelicaException.TYPE_NOT_CLOSED:
                                                                        m93078a().mo49217a(askf);
                                                                        str3 = str10;
                                                                        bldf = bldf2;
                                                                        str2 = str11;
                                                                        i = i7;
                                                                        i2 = i6;
                                                                        break;
                                                                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                                                        str3 = str10;
                                                                        bldf = bldf2;
                                                                        str2 = str11;
                                                                        i = i7;
                                                                        i2 = i6;
                                                                        break;
                                                                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                                                                        if ((bmux.f130992a & 16777216) != 0) {
                                                                            try {
                                                                                m93084d();
                                                                                bmuw bmuw = bmux.f130999h;
                                                                                if (bmuw == null) {
                                                                                    bmuw = bmuw.f130975l;
                                                                                }
                                                                                String str18 = bmuw.f130978b;
                                                                                bmuw bmuw2 = bmux.f130999h;
                                                                                if (bmuw2 == null) {
                                                                                    bmuw2 = bmuw.f130975l;
                                                                                }
                                                                                asiv.m74183a(askf, str18, bmuw2.f130977a);
                                                                                str3 = str10;
                                                                                bldf = bldf2;
                                                                                str2 = str11;
                                                                                i = i7;
                                                                                i2 = i6;
                                                                                break;
                                                                            } catch (SQLiteException | atfh | IOException e20) {
                                                                                str3 = str10;
                                                                                bldf = bldf2;
                                                                                str2 = str11;
                                                                                i2 = i6;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            bnsl bnsl14 = (bnsl) f108615a.mo68388c();
                                                                            bnsl14.mo68432a(str10, "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                            bnsl14.mo68405a("Missing token provisioning data. Dropping notification");
                                                                            str3 = str10;
                                                                            bldf = bldf2;
                                                                            str2 = str11;
                                                                            i2 = i6;
                                                                            break;
                                                                        }
                                                                    default:
                                                                        bnsl bnsl15 = (bnsl) f108615a.mo68388c();
                                                                        bnsl15.mo68432a(str10, "a", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl15.mo68409a("Unknown tap-and-pay notification type: %d", i8);
                                                                        m93079a(askf).mo49764e(22);
                                                                        str3 = str10;
                                                                        bldf = bldf2;
                                                                        str2 = str11;
                                                                        i2 = i6;
                                                                        break;
                                                                }
                                                        }
                                                    } else if ((bmux.f130992a & 16777216) == 0) {
                                                        bnsl bnsl16 = (bnsl) f108615a.mo68388c();
                                                        bnsl16.mo68432a(str10, "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl16.mo68405a("Missing token provisioning data. Dropping notification");
                                                        str3 = str10;
                                                        bldf = bldf2;
                                                        str2 = str11;
                                                        i2 = i6;
                                                    } else {
                                                        bmuw bmuw3 = bmux.f130999h;
                                                        if (bmuw3 == null) {
                                                            bmuw3 = bmuw.f130975l;
                                                        }
                                                        Intent a6 = atrq.m76259a(askf.f89126d.getPackageName(), askf.mo49209a(), null);
                                                        a6.putExtra("session_id", bmuw3.f130978b);
                                                        a6.putExtra("token_provisioning_data", bmuw3.mo73642k());
                                                        bmuw bmuw4 = bmux.f130999h;
                                                        if (bmuw4 == null) {
                                                            bmuw4 = bmuw.f130975l;
                                                        }
                                                        aszq.m75253a(askf, bmuw4, a6);
                                                        str3 = str10;
                                                        bldf = bldf2;
                                                        str2 = str11;
                                                        i = i7;
                                                        i2 = i6;
                                                    }
                                                } else if ((bmux.f130992a & 16777216) == 0) {
                                                    bnsl bnsl17 = (bnsl) f108615a.mo68388c();
                                                    bnsl17.mo68432a(str10, "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl17.mo68405a("Missing token provisioning data. Dropping notification");
                                                    str3 = str10;
                                                    bldf = bldf2;
                                                    str2 = str11;
                                                    i2 = i6;
                                                } else {
                                                    bmuw bmuw5 = bmux.f130999h;
                                                    if (bmuw5 == null) {
                                                        bmuw5 = bmuw.f130975l;
                                                    }
                                                    tapAndPayNotificationIntentOperation.startService(aszs.m75256a(askf, bmuw5));
                                                    str3 = str10;
                                                    bldf = bldf2;
                                                    str2 = str11;
                                                    i = i7;
                                                    i2 = i6;
                                                }
                                                m93079a(askf).mo49764e(19);
                                            } catch (asks e21) {
                                                e = e21;
                                                str4 = str10;
                                                bldf = bldf2;
                                                str2 = str11;
                                                i = i7;
                                                i2 = i6;
                                                bnsl bnsl622222222222 = (bnsl) f108615a.mo68388c();
                                                bnsl622222222222.mo68437a(e);
                                                bnsl622222222222.mo68432a(str3, "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl622222222222.mo68409a("Error dispatching notification type: %d", i - 1);
                                                m93079a(askf).mo49764e(21);
                                                i6 = i2 + 1;
                                                tapAndPayNotificationIntentOperation = this;
                                                str10 = str3;
                                                bldf2 = bldf;
                                                str11 = str2;
                                                i5 = 1;
                                            }
                                        } else {
                                            bnsl bnsl18 = (bnsl) f108615a.mo68388c();
                                            bnsl18.mo68432a(str10, "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl18.mo68405a("Can't get auth token, dropping message");
                                            m93079a(askf).mo49764e(18);
                                            str3 = str10;
                                            bldf = bldf2;
                                            str2 = str11;
                                            i2 = i6;
                                        }
                                    } else {
                                        str3 = str10;
                                        bldf = bldf2;
                                        str2 = str11;
                                        i2 = i6;
                                        bnsl bnsl19 = (bnsl) f108615a.mo68388c();
                                        bnsl19.mo68432a(str3, "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl19.mo68405a("TapAndPayNotificationAppPayload extension missing, dropping notification");
                                        m93079a(askf).mo49764e(15);
                                    }
                                }
                            } else {
                                str3 = str10;
                                bldf = bldf2;
                                str2 = str11;
                                i2 = i6;
                                bnsl bnsl20 = (bnsl) f108615a.mo68388c();
                                bnsl20.mo68432a(str3, "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl20.mo68405a("RenderInfo missing, dropping notification");
                                m93079a(askf).mo49764e(13);
                            }
                            i6 = i2 + 1;
                            tapAndPayNotificationIntentOperation = this;
                            str10 = str3;
                            bldf2 = bldf;
                            str11 = str2;
                            i5 = 1;
                        }
                        return;
                    }
                    bnsl bnsl21 = (bnsl) f108615a.mo68388c();
                    bnsl21.mo68432a(str10, "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl21.mo68405a("Empty payload, dropping message");
                    m93085e().mo49764e(12);
                } catch (bxwf e22) {
                    bnsl bnsl22 = (bnsl) f108615a.mo68388c();
                    bnsl22.mo68437a(e22);
                    bnsl22.mo68432a(str10, "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl22.mo68405a("Failed to parse payload into protobuf, dropping message");
                    m93085e().mo49764e(8);
                }
            } catch (IllegalArgumentException e23) {
                bnsl bnsl23 = (bnsl) f108615a.mo68388c();
                bnsl23.mo68437a(e23);
                bnsl23.mo68432a(str10, "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl23.mo68405a("Failed to parse payload string into bytes, dropping message");
                m93085e().mo49764e(7);
            }
        } else {
            bnsl bnsl24 = (bnsl) f108615a.mo68388c();
            bnsl24.mo68432a(str10, "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl24.mo68405a("Missing heavy-tickle payload, dropping message");
            m93085e().mo49764e(6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x0377 A[Catch:{ asks -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0385 A[Catch:{ asks -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0390 A[Catch:{ asks -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0391 A[Catch:{ asks -> 0x062d }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03e0 A[Catch:{ asks -> 0x061a }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03ee A[Catch:{ asks -> 0x061a }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040e A[Catch:{ asks -> 0x061a }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0419 A[Catch:{ asks -> 0x061a }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0444 A[Catch:{ asks -> 0x061a }] */
    /* renamed from: a */
    private final void m93081a(askf askf, blci blci) {
        int i;
        String str;
        String str2;
        int i2;
        Context context;
        Transaction transaction;
        String str3;
        Boolean valueOf;
        Transaction transaction2;
        askf askf2 = askf;
        blci blci2 = blci;
        String str4 = askf2.f89124b;
        if ((blci2.f125925a & 4) != 0) {
            blde blde = blci2.f125928d;
            if (blde == null) {
                blde = blde.f126049d;
            }
            if ((blde.f126051a & 32) != 0) {
                blde blde2 = blci2.f125928d;
                if (blde2 == null) {
                    blde2 = blde.f126049d;
                }
                bldd bldd = blde2.f126053c;
                if (bldd == null) {
                    bldd = bldd.f126046a;
                }
                bxvj bxvj = bmux.f130990j;
                bldd.mo74135a(bxvj);
                if (bldd.f164952m.mo73911a(bxvj.f164958d)) {
                    bxvj bxvj2 = bmux.f130990j;
                    bldd.mo74135a(bxvj2);
                    Object b = bldd.f164952m.mo73913b(bxvj2.f164958d);
                    if (b == null) {
                        b = bxvj2.f164956b;
                    } else {
                        bxvj2.mo74139a(b);
                    }
                    bmux bmux = (bmux) b;
                    int a = bmup.m108398a(bmux.f130995d);
                    int i3 = a != 0 ? a : 1;
                    if (i3 == 1) {
                        bnsl bnsl = (bnsl) f108615a.mo68388c();
                        bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Notification type UNKNOWN, dropping notification");
                        m93079a(askf).mo49764e(16);
                    } else if (i3 != 31 && !asjw.m74259d(this)) {
                        m93079a(askf).mo49764e(17);
                    } else if (i3 == 38 || asjg.m74214a(this, str4, askf2.f89125c)) {
                        try {
                            bnsl a2 = f108615a.mo26019b(aske.m74275a());
                            a2.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            int i4 = i3 - 1;
                            a2.mo68409a("Dispatching notification with type: %d", i4);
                            String str5 = "";
                            if (i4 == 1) {
                                if (bmux.f130993b == 3) {
                                    str = (String) bmux.f130994c;
                                } else {
                                    str = str5;
                                }
                                if (!str.isEmpty()) {
                                    atbq b2 = m93082b();
                                    if (bmux.f130993b == 3) {
                                        str5 = (String) bmux.f130994c;
                                    }
                                    b2.mo49781a();
                                    if (!atbm.m75391a(askf2, str5, new String[]{"active", "unacknowledged"}, "needs_refresh")) {
                                        bnsl bnsl2 = (bnsl) atbq.f90017a.mo68388c();
                                        bnsl2.mo68432a("atbq", "a", 954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("Received DEVICE_TOKEN_REPLENISH notification while bundle in unexpected state");
                                    } else {
                                        atcj.m75548a(askf2.f89126d);
                                    }
                                } else {
                                    bnsl bnsl3 = (bnsl) f108615a.mo68388c();
                                    bnsl3.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl3.mo68405a("Instrument id missing, dropping notification");
                                    return;
                                }
                            } else if (i4 == 5) {
                                atwb c = m93083c();
                                if (!asiv.m74193c(askf)) {
                                    if (cgwn.m147261k()) {
                                        try {
                                            atbd.m75359b(askf);
                                        } catch (atfh | IOException | IllegalStateException e) {
                                            bnsl bnsl4 = (bnsl) atwb.f91035a.mo68388c();
                                            bnsl4.mo68437a(e);
                                            bnsl4.mo68432a("atwb", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl4.mo68405a("Update chime setting failed");
                                        }
                                    }
                                } else if ((bmux.f130992a & 2) != 0) {
                                    bmuq bmuq = bmux.f130996e;
                                    if (bmuq == null) {
                                        bmuq = bmuq.f130966d;
                                    }
                                    String str6 = bmuq.f130969b;
                                    if (!str6.isEmpty()) {
                                        try {
                                            btqu btqu = (btqu) btqw.f150046c.mo74144da();
                                            bxvd da = btqv.f150043b.mo74144da();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            str6.getClass();
                                            ((btqv) da.f164949b).f150045a = str6;
                                            btqu.mo70834a(da);
                                            btqu.mo70833a(btrh.SUPPORTS_INFERRED_RICH_DATA);
                                            btqy btqy = (btqy) atff.m75759a(askf2, "t/transaction/get", (btqw) btqu.mo74062i(), btqy.f150053b);
                                            if (btqy.f150055a.size() == 1) {
                                                btrg btrg = ((btqx) btqy.f150055a.get(0)).f150052a;
                                                if (btrg != null) {
                                                    CardInfo b3 = atds.m75666a(askf).mo49853b(btrg.f150097g);
                                                    if (b3 == null) {
                                                        bnsl bnsl5 = (bnsl) atwb.f91035a.mo68388c();
                                                        bnsl5.mo68432a("atwb", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl5.mo68405a("Could not find payment card for transaction, dropping notification");
                                                    } else {
                                                        atvv atvv = new atvv(btrg);
                                                        Context context2 = askf2.f89126d;
                                                        sre.m36089i(context2);
                                                        Context context3 = askf2.f89126d;
                                                        btrb btrb = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                        if (btrb != null) {
                                                            btrd btrd = btrb.f150063f;
                                                            if (btrd != null && !btrd.f150072a.isEmpty()) {
                                                                btrb btrb2 = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                                if (btrb2 == null) {
                                                                    btrb2 = btrb.f150056k;
                                                                }
                                                                btrd btrd2 = btrb2.f150063f;
                                                                if (btrd2 == null) {
                                                                    btrd2 = btrd.f150070b;
                                                                }
                                                                str2 = btrd2.f150072a;
                                                                C1102je a3 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                                atbg.m75376b(a3, str2);
                                                                if (atvv.mo50255f()) {
                                                                    i2 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_text_full : C0126R.string.tp_transaction_declined_notification_text_full;
                                                                } else {
                                                                    i2 = C0126R.string.tp_transaction_refund_notification_text_full;
                                                                }
                                                                String str7 = b3.f108343d;
                                                                if (!atyj.m76564a(b3)) {
                                                                    str7 = context2.getString(C0126R.string.tp_paypal);
                                                                }
                                                                i = i3;
                                                                atbg.m75377c(a3, context2.getString(i2, atvv.mo50252c(), str7));
                                                                a3.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                                                a3.mo13631b(PendingIntent.getService(context2, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf2, blci.mo73642k(), 6, b3), 134217728));
                                                                boolean f = atvv.mo50255f();
                                                                int i5 = C0126R.string.tp_transaction_decline_notification_ticker;
                                                                int i6 = f ? !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_title_sensitive : C0126R.string.tp_transaction_decline_notification_ticker : C0126R.string.tp_transaction_refund_notification_title_sensitive;
                                                                C1102je a4 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                                a4.mo13640e(context2.getString(i6));
                                                                a4.mo13632b(context2.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                                                if (!atvv.mo50255f()) {
                                                                    i5 = C0126R.string.tp_transaction_refund_notification_ticker;
                                                                } else if (!atvv.mo50256g()) {
                                                                    i5 = C0126R.string.tp_transaction_notification_ticker;
                                                                }
                                                                a3.mo13639d(context2.getString(i5));
                                                                if (cgwn.m147260j() && (bmuq.f130968a & 2) != 0) {
                                                                    bmxv bmxv = c.f91036b;
                                                                    valueOf = Boolean.valueOf(alfj.m60866b(askf2.f89126d));
                                                                    bmxv.mo66812a(valueOf);
                                                                    if (valueOf.booleanValue()) {
                                                                        bztn bztn = bmuq.f130970c;
                                                                        if (bztn == null) {
                                                                            bztn = bztn.f171350b;
                                                                        }
                                                                        String str8 = bztn.f171352a;
                                                                        bztn bztn2 = bmuq.f130970c;
                                                                        if (bztn2 == null) {
                                                                            bztn2 = bztn.f171350b;
                                                                        }
                                                                        DisplayMetrics displayMetrics = askf2.f89126d.getResources().getDisplayMetrics();
                                                                        int round = Math.round(((float) displayMetrics.widthPixels) - (displayMetrics.density * 32.0f));
                                                                        int round2 = Math.round(((float) round) * 0.48f);
                                                                        bxvd da2 = bzur.f171456c.mo74144da();
                                                                        String str9 = str8;
                                                                        if (da2.f164950c) {
                                                                            da2.mo74035c();
                                                                            da2.f164950c = false;
                                                                        }
                                                                        bztn2.getClass();
                                                                        ((bzur) da2.f164949b).f171458a = bztn2;
                                                                        bxvd da3 = bztm.f171347b.mo74144da();
                                                                        bxvd da4 = bztl.f171342d.mo74144da();
                                                                        float f2 = displayMetrics.density;
                                                                        context = context2;
                                                                        if (da4.f164950c) {
                                                                            da4.mo74035c();
                                                                            da4.f164950c = false;
                                                                        }
                                                                        bztl bztl = (bztl) da4.f164949b;
                                                                        bztl.f171346c = f2;
                                                                        bztl.f171344a = round;
                                                                        bztl.f171345b = round2;
                                                                        if (da3.f164950c) {
                                                                            da3.mo74035c();
                                                                            da3.f164950c = false;
                                                                        }
                                                                        bztl bztl2 = (bztl) da4.mo74062i();
                                                                        bztl2.getClass();
                                                                        ((bztm) da3.f164949b).f171349a = bztl2;
                                                                        if (da2.f164950c) {
                                                                            da2.mo74035c();
                                                                            da2.f164950c = false;
                                                                        }
                                                                        bztm bztm = (bztm) da3.mo74062i();
                                                                        bztm.getClass();
                                                                        ((bzur) da2.f164949b).f171459b = bztm;
                                                                        try {
                                                                            bzus bzus = (bzus) atff.m75769b(askf2, "g/transaction/getcoretransaction", (bzur) da2.mo74062i(), bzus.f171460b);
                                                                            if (bzus.f171462a != null) {
                                                                                algt algt = new algt();
                                                                                bzuq bzuq = bzus.f171462a;
                                                                                if (bzuq == null) {
                                                                                    bzuq = bzuq.f171454a;
                                                                                }
                                                                                algt.mo40310a(bzuq.mo73642k());
                                                                                transaction2 = algt.f73511a;
                                                                            } else {
                                                                                bnsl bnsl6 = (bnsl) atwb.f91035a.mo68388c();
                                                                                bnsl6.mo68432a("atwb", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                bnsl6.mo68405a("tryGetTransaction: no transaction returned");
                                                                                transaction2 = null;
                                                                            }
                                                                        } catch (atfh e2) {
                                                                            bnsl bnsl7 = (bnsl) atwb.f91035a.mo68388c();
                                                                            bnsl7.mo68437a(e2);
                                                                            bnsl7.mo68432a("atwb", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                            bnsl7.mo68405a("tryGetTransaction: RPC failed");
                                                                            transaction2 = null;
                                                                            transaction = transaction2;
                                                                            str3 = str9;
                                                                            a3.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b3, blci, str3, transaction), 134217728);
                                                                            a3.mo13627a(true);
                                                                            a3.f22273y = a4.mo13629b();
                                                                            atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a3);
                                                                            askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b3));
                                                                            m93079a(askf).mo49764e(19);
                                                                        } catch (IOException e3) {
                                                                            transaction2 = null;
                                                                            transaction = transaction2;
                                                                            str3 = str9;
                                                                            a3.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b3, blci, str3, transaction), 134217728);
                                                                            a3.mo13627a(true);
                                                                            a3.f22273y = a4.mo13629b();
                                                                            atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a3);
                                                                            askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b3));
                                                                            m93079a(askf).mo49764e(19);
                                                                        }
                                                                        transaction = transaction2;
                                                                        str3 = str9;
                                                                        a3.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b3, blci, str3, transaction), 134217728);
                                                                        a3.mo13627a(true);
                                                                        a3.f22273y = a4.mo13629b();
                                                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a3);
                                                                        askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b3));
                                                                    }
                                                                }
                                                                context = context2;
                                                                str3 = null;
                                                                transaction = null;
                                                                a3.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b3, blci, str3, transaction), 134217728);
                                                                a3.mo13627a(true);
                                                                a3.f22273y = a4.mo13629b();
                                                                atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a3);
                                                                askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b3));
                                                            }
                                                        }
                                                        str2 = context3.getString(C0126R.string.tp_default_store_name);
                                                        C1102je a32 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                        atbg.m75376b(a32, str2);
                                                        if (atvv.mo50255f()) {
                                                        }
                                                        String str72 = b3.f108343d;
                                                        if (!atyj.m76564a(b3)) {
                                                        }
                                                        i = i3;
                                                        try {
                                                            atbg.m75377c(a32, context2.getString(i2, atvv.mo50252c(), str72));
                                                            a32.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                                            a32.mo13631b(PendingIntent.getService(context2, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf2, blci.mo73642k(), 6, b3), 134217728));
                                                            boolean f3 = atvv.mo50255f();
                                                            int i52 = C0126R.string.tp_transaction_decline_notification_ticker;
                                                            if (f3) {
                                                            }
                                                            C1102je a42 = atbg.m75368a(context2, atbf.TRANSACTION_RECEIPTS);
                                                            a42.mo13640e(context2.getString(i6));
                                                            a42.mo13632b(context2.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                                            if (!atvv.mo50255f()) {
                                                            }
                                                            a32.mo13639d(context2.getString(i52));
                                                            bmxv bmxv2 = c.f91036b;
                                                            valueOf = Boolean.valueOf(alfj.m60866b(askf2.f89126d));
                                                            bmxv2.mo66812a(valueOf);
                                                            if (valueOf.booleanValue()) {
                                                            }
                                                            context = context2;
                                                            str3 = null;
                                                            transaction = null;
                                                            a32.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b3, blci, str3, transaction), 134217728);
                                                            a32.mo13627a(true);
                                                            a32.f22273y = a42.mo13629b();
                                                            atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a32);
                                                            askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b3));
                                                        } catch (asks e4) {
                                                            e = e4;
                                                            bnsl bnsl8 = (bnsl) f108615a.mo68388c();
                                                            bnsl8.mo68437a(e);
                                                            bnsl8.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl8.mo68409a("Error dispatching notification type: %d", i - 1);
                                                            m93079a(askf).mo49764e(21);
                                                        }
                                                    }
                                                }
                                            } else {
                                                btqy.f150055a.size();
                                            }
                                        } catch (IOException e5) {
                                            bnsl bnsl9 = (bnsl) atwb.f91035a.mo68388c();
                                            bnsl9.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl9.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                            m93079a(askf).mo49764e(19);
                                        } catch (atfh e6) {
                                            bnsl bnsl92 = (bnsl) atwb.f91035a.mo68388c();
                                            bnsl92.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl92.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                                            m93079a(askf).mo49764e(19);
                                        }
                                    }
                                }
                            } else if (i4 == 22) {
                                startService(IntentOperation.getStartIntent(this, "com.google.android.gms.tapandpay.keyguard.RemoteLockIntentOperation", "com.google.android.gms.tapandpay.keyguard.REMOTE_LOCK"));
                            } else if (i4 == 30) {
                                new atat().mo49770a(bmux, askf2);
                            } else if (i4 == 34) {
                                askb.m74268a(askf2.f89126d);
                            } else if (i4 != 43) {
                                if (i4 != 44) {
                                    switch (i4) {
                                        case 9:
                                            atds.m75666a(askf).mo49857c();
                                            break;
                                        case 10:
                                            if (!(bmux.f130993b == 3 ? (String) bmux.f130994c : str5).isEmpty()) {
                                                atbq b4 = m93082b();
                                                if (bmux.f130993b == 3) {
                                                    str5 = (String) bmux.f130994c;
                                                }
                                                b4.mo49781a();
                                                if (!atbm.m75391a(askf2, str5, new String[]{"requested"}, "ready_for_pickup")) {
                                                    break;
                                                } else {
                                                    b4.mo49783a(askf2.f89126d, askf2.f89125c);
                                                    break;
                                                }
                                            } else {
                                                bnsl bnsl10 = (bnsl) f108615a.mo68388c();
                                                bnsl10.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl10.mo68405a("Instrument id missing, dropping notification");
                                                return;
                                            }
                                        case 11:
                                            startService(asju.m74251a(askf2, bmux.f130997f));
                                            atds.m75666a(askf).mo49857c();
                                            break;
                                        default:
                                            switch (i4) {
                                                case FelicaException.TYPE_NOT_CLOSED:
                                                    m93078a().mo49217a(askf2);
                                                    break;
                                                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                                    break;
                                                case FelicaException.TYPE_USED_BY_OTHER_APP:
                                                    if ((bmux.f130992a & 16777216) == 0) {
                                                        bnsl bnsl11 = (bnsl) f108615a.mo68388c();
                                                        bnsl11.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl11.mo68405a("Missing token provisioning data. Dropping notification");
                                                        return;
                                                    }
                                                    try {
                                                        m93084d();
                                                        bmuw bmuw = bmux.f130999h;
                                                        if (bmuw == null) {
                                                            bmuw = bmuw.f130975l;
                                                        }
                                                        String str10 = bmuw.f130978b;
                                                        bmuw bmuw2 = bmux.f130999h;
                                                        if (bmuw2 == null) {
                                                            bmuw2 = bmuw.f130975l;
                                                        }
                                                        asiv.m74183a(askf2, str10, bmuw2.f130977a);
                                                        break;
                                                    } catch (SQLiteException | atfh | IOException e7) {
                                                        return;
                                                    }
                                                default:
                                                    bnsl bnsl12 = (bnsl) f108615a.mo68388c();
                                                    bnsl12.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                    bnsl12.mo68409a("Unknown tap-and-pay notification type: %d", i4);
                                                    m93079a(askf).mo49764e(22);
                                                    return;
                                            }
                                    }
                                } else if ((bmux.f130992a & 16777216) == 0) {
                                    bnsl bnsl13 = (bnsl) f108615a.mo68388c();
                                    bnsl13.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl13.mo68405a("Missing token provisioning data. Dropping notification");
                                    return;
                                } else {
                                    bmuw bmuw3 = bmux.f130999h;
                                    if (bmuw3 == null) {
                                        bmuw3 = bmuw.f130975l;
                                    }
                                    Intent a5 = atrq.m76259a(askf2.f89126d.getPackageName(), askf.mo49209a(), null);
                                    a5.putExtra("session_id", bmuw3.f130978b);
                                    a5.putExtra("token_provisioning_data", bmuw3.mo73642k());
                                    bmuw bmuw4 = bmux.f130999h;
                                    if (bmuw4 == null) {
                                        bmuw4 = bmuw.f130975l;
                                    }
                                    aszq.m75253a(askf2, bmuw4, a5);
                                }
                            } else if ((bmux.f130992a & 16777216) == 0) {
                                bnsl bnsl14 = (bnsl) f108615a.mo68388c();
                                bnsl14.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl14.mo68405a("Missing token provisioning data. Dropping notification");
                                return;
                            } else {
                                bmuw bmuw5 = bmux.f130999h;
                                if (bmuw5 == null) {
                                    bmuw5 = bmuw.f130975l;
                                }
                                startService(aszs.m75256a(askf2, bmuw5));
                            }
                            m93079a(askf).mo49764e(19);
                        } catch (asks e8) {
                            e = e8;
                            i = i3;
                            bnsl bnsl82 = (bnsl) f108615a.mo68388c();
                            bnsl82.mo68437a(e);
                            bnsl82.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl82.mo68409a("Error dispatching notification type: %d", i - 1);
                            m93079a(askf).mo49764e(21);
                        }
                    } else {
                        bnsl bnsl15 = (bnsl) f108615a.mo68388c();
                        bnsl15.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl15.mo68405a("Can't get auth token, dropping message");
                        m93079a(askf).mo49764e(18);
                    }
                } else {
                    bnsl bnsl16 = (bnsl) f108615a.mo68388c();
                    bnsl16.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl16.mo68405a("TapAndPayNotificationAppPayload extension missing, dropping notification");
                    m93079a(askf).mo49764e(15);
                }
            } else {
                bnsl bnsl17 = (bnsl) f108615a.mo68388c();
                bnsl17.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl17.mo68405a("AppPayload missing, dropping notification");
                m93079a(askf).mo49764e(14);
            }
        } else {
            bnsl bnsl18 = (bnsl) f108615a.mo68388c();
            bnsl18.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl18.mo68405a("RenderInfo missing, dropping notification");
            m93079a(askf).mo49764e(13);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59375a(askf askf, int i, bmux bmux, blci blci) {
        String str;
        int i2;
        int i3;
        Transaction transaction;
        String str2;
        btrd btrd;
        String str3;
        askf askf2 = askf;
        bmux bmux2 = bmux;
        bnsl a = f108615a.mo26019b(aske.m74275a());
        a.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        int i4 = i - 1;
        if (i != 0) {
            a.mo68409a("Dispatching notification with type: %d", i4);
            if (i != 0) {
                String str4 = "";
                if (i4 == 1) {
                    if ((bmux2.f130993b == 3 ? (String) bmux2.f130994c : str4).isEmpty()) {
                        bnsl bnsl = (bnsl) f108615a.mo68388c();
                        bnsl.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Instrument id missing, dropping notification");
                        return;
                    }
                    atbq b = m93082b();
                    if (bmux2.f130993b == 3) {
                        str4 = (String) bmux2.f130994c;
                    }
                    b.mo49781a();
                    if (atbm.m75391a(askf2, str4, new String[]{"active", "unacknowledged"}, "needs_refresh")) {
                        atcj.m75548a(askf2.f89126d);
                    } else {
                        bnsl bnsl2 = (bnsl) atbq.f90017a.mo68388c();
                        bnsl2.mo68432a("atbq", "a", 954, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Received DEVICE_TOKEN_REPLENISH notification while bundle in unexpected state");
                    }
                } else if (i4 == 5) {
                    atwb c = m93083c();
                    if (!asiv.m74193c(askf)) {
                        if (cgwn.m147261k()) {
                            try {
                                atbd.m75359b(askf);
                            } catch (atfh | IOException | IllegalStateException e) {
                                bnsl bnsl3 = (bnsl) atwb.f91035a.mo68388c();
                                bnsl3.mo68437a(e);
                                bnsl3.mo68432a("atwb", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Update chime setting failed");
                            }
                        }
                    } else if ((bmux2.f130992a & 2) != 0) {
                        bmuq bmuq = bmux2.f130996e;
                        if (bmuq == null) {
                            bmuq = bmuq.f130966d;
                        }
                        String str5 = bmuq.f130969b;
                        if (!str5.isEmpty()) {
                            try {
                                btqu btqu = (btqu) btqw.f150046c.mo74144da();
                                bxvd da = btqv.f150043b.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                str5.getClass();
                                ((btqv) da.f164949b).f150045a = str5;
                                btqu.mo70834a(da);
                                btqu.mo70833a(btrh.SUPPORTS_INFERRED_RICH_DATA);
                                btqy btqy = (btqy) atff.m75759a(askf2, "t/transaction/get", (btqw) btqu.mo74062i(), btqy.f150053b);
                                if (btqy.f150055a.size() == 1) {
                                    btrg btrg = ((btqx) btqy.f150055a.get(0)).f150052a;
                                    if (btrg != null) {
                                        CardInfo b2 = atds.m75666a(askf).mo49853b(btrg.f150097g);
                                        if (b2 != null) {
                                            atvv atvv = new atvv(btrg);
                                            Context context = askf2.f89126d;
                                            sre.m36089i(context);
                                            Context context2 = askf2.f89126d;
                                            btrb btrb = ((btrg) atvv.f91029a.f164949b).f150095e;
                                            if (btrb == null || (btrd = btrb.f150063f) == null || btrd.f150072a.isEmpty()) {
                                                str = context2.getString(C0126R.string.tp_default_store_name);
                                            } else {
                                                btrb btrb2 = ((btrg) atvv.f91029a.f164949b).f150095e;
                                                if (btrb2 == null) {
                                                    btrb2 = btrb.f150056k;
                                                }
                                                btrd btrd2 = btrb2.f150063f;
                                                if (btrd2 == null) {
                                                    btrd2 = btrd.f150070b;
                                                }
                                                str = btrd2.f150072a;
                                            }
                                            C1102je a2 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                                            atbg.m75376b(a2, str);
                                            if (!atvv.mo50255f()) {
                                                i2 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_text_full : C0126R.string.tp_transaction_declined_notification_text_full;
                                            } else {
                                                i2 = C0126R.string.tp_transaction_refund_notification_text_full;
                                            }
                                            String str6 = b2.f108343d;
                                            if (atyj.m76564a(b2)) {
                                                str6 = context.getString(C0126R.string.tp_paypal);
                                            }
                                            atbg.m75377c(a2, context.getString(i2, atvv.mo50252c(), str6));
                                            a2.f22266r = atbf.TRANSACTION_RECEIPTS.f89994e;
                                            a2.mo13631b(PendingIntent.getService(context, String.valueOf(btrg.f150091a).concat("_dismissed").hashCode(), atbe.m75364a(askf2, blci.mo73642k(), 6, b2), 134217728));
                                            int i5 = !atvv.mo50255f() ? !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_title_sensitive : C0126R.string.tp_transaction_decline_notification_ticker : C0126R.string.tp_transaction_refund_notification_title_sensitive;
                                            C1102je a3 = atbg.m75368a(context, atbf.TRANSACTION_RECEIPTS);
                                            a3.mo13640e(context.getString(i5));
                                            a3.mo13632b(context.getString(C0126R.string.tp_transaction_notification_text_sensitive));
                                            if (!atvv.mo50255f()) {
                                                i3 = !atvv.mo50256g() ? C0126R.string.tp_transaction_notification_ticker : C0126R.string.tp_transaction_decline_notification_ticker;
                                            } else {
                                                i3 = C0126R.string.tp_transaction_refund_notification_ticker;
                                            }
                                            a2.mo13639d(context.getString(i3));
                                            if (cgwn.m147260j() && (bmuq.f130968a & 2) != 0) {
                                                bmxv bmxv = c.f91036b;
                                                Boolean valueOf = Boolean.valueOf(alfj.m60866b(askf2.f89126d));
                                                bmxv.mo66812a(valueOf);
                                                if (valueOf.booleanValue()) {
                                                    bztn bztn = bmuq.f130970c;
                                                    if (bztn == null) {
                                                        bztn = bztn.f171350b;
                                                    }
                                                    String str7 = bztn.f171352a;
                                                    bztn bztn2 = bmuq.f130970c;
                                                    if (bztn2 == null) {
                                                        bztn2 = bztn.f171350b;
                                                    }
                                                    DisplayMetrics displayMetrics = askf2.f89126d.getResources().getDisplayMetrics();
                                                    int round = Math.round(((float) displayMetrics.widthPixels) - (displayMetrics.density * 32.0f));
                                                    int round2 = Math.round(((float) round) * 0.48f);
                                                    bxvd da2 = bzur.f171456c.mo74144da();
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    bztn2.getClass();
                                                    ((bzur) da2.f164949b).f171458a = bztn2;
                                                    bxvd da3 = bztm.f171347b.mo74144da();
                                                    bxvd da4 = bztl.f171342d.mo74144da();
                                                    float f = displayMetrics.density;
                                                    String str8 = str7;
                                                    if (da4.f164950c) {
                                                        da4.mo74035c();
                                                        da4.f164950c = false;
                                                    }
                                                    bztl bztl = (bztl) da4.f164949b;
                                                    bztl.f171346c = f;
                                                    bztl.f171344a = round;
                                                    bztl.f171345b = round2;
                                                    if (da3.f164950c) {
                                                        da3.mo74035c();
                                                        da3.f164950c = false;
                                                    }
                                                    bztl bztl2 = (bztl) da4.mo74062i();
                                                    bztl2.getClass();
                                                    ((bztm) da3.f164949b).f171349a = bztl2;
                                                    if (da2.f164950c) {
                                                        da2.mo74035c();
                                                        da2.f164950c = false;
                                                    }
                                                    bztm bztm = (bztm) da3.mo74062i();
                                                    bztm.getClass();
                                                    ((bzur) da2.f164949b).f171459b = bztm;
                                                    try {
                                                        bzus bzus = (bzus) atff.m75769b(askf2, "g/transaction/getcoretransaction", (bzur) da2.mo74062i(), bzus.f171460b);
                                                        if (bzus.f171462a != null) {
                                                            algt algt = new algt();
                                                            bzuq bzuq = bzus.f171462a;
                                                            if (bzuq == null) {
                                                                bzuq = bzuq.f171454a;
                                                            }
                                                            algt.mo40310a(bzuq.mo73642k());
                                                            transaction = algt.f73511a;
                                                        } else {
                                                            bnsl bnsl4 = (bnsl) atwb.f91035a.mo68388c();
                                                            bnsl4.mo68432a("atwb", "a", 286, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                            bnsl4.mo68405a("tryGetTransaction: no transaction returned");
                                                            transaction = null;
                                                        }
                                                    } catch (atfh e2) {
                                                        bnsl bnsl5 = (bnsl) atwb.f91035a.mo68388c();
                                                        bnsl5.mo68437a(e2);
                                                        bnsl5.mo68432a("atwb", "a", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl5.mo68405a("tryGetTransaction: RPC failed");
                                                        transaction = null;
                                                        str2 = str8;
                                                        a2.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b2, blci, str2, transaction), 134217728);
                                                        a2.mo13627a(true);
                                                        a2.f22273y = a3.mo13629b();
                                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a2);
                                                        askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b2));
                                                        m93079a(askf).mo49764e(19);
                                                        return;
                                                    } catch (IOException e3) {
                                                        transaction = null;
                                                        str2 = str8;
                                                        a2.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b2, blci, str2, transaction), 134217728);
                                                        a2.mo13627a(true);
                                                        a2.f22273y = a3.mo13629b();
                                                        atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a2);
                                                        askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b2));
                                                        m93079a(askf).mo49764e(19);
                                                        return;
                                                    }
                                                    str2 = str8;
                                                    a2.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b2, blci, str2, transaction), 134217728);
                                                    a2.mo13627a(true);
                                                    a2.f22273y = a3.mo13629b();
                                                    atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a2);
                                                    askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b2));
                                                }
                                            }
                                            str2 = null;
                                            transaction = null;
                                            a2.f22254f = PendingIntent.getActivity(askf2.f89126d, btrg.f150091a.hashCode(), WalletTransactionDetailsChimeraActivity.m93298a(btrg, askf, b2, blci, str2, transaction), 134217728);
                                            a2.mo13627a(true);
                                            a2.f22273y = a3.mo13629b();
                                            atbg.m75371a(context, Integer.toString(btrg.f150091a.hashCode()), a2);
                                            askf2.f89126d.startService(atbe.m75364a(askf2, blci.mo73642k(), 5, b2));
                                        } else {
                                            bnsl bnsl6 = (bnsl) atwb.f91035a.mo68388c();
                                            bnsl6.mo68432a("atwb", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl6.mo68405a("Could not find payment card for transaction, dropping notification");
                                        }
                                    }
                                } else {
                                    btqy.f150055a.size();
                                }
                            } catch (atfh | IOException e4) {
                                bnsl bnsl7 = (bnsl) atwb.f91035a.mo68388c();
                                bnsl7.mo68432a("atwb", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl7.mo68405a("Error calling LEGACY_GET_TRANSACTIONS_RPC, dropping transaction notification");
                            }
                        }
                    }
                } else if (i4 == 22) {
                    startService(IntentOperation.getStartIntent(this, "com.google.android.gms.tapandpay.keyguard.RemoteLockIntentOperation", "com.google.android.gms.tapandpay.keyguard.REMOTE_LOCK"));
                } else if (i4 == 30) {
                    new atat().mo49770a(bmux2, askf2);
                } else if (i4 == 34) {
                    askb.m74268a(askf2.f89126d);
                } else if (i4 != 43) {
                    if (i4 != 44) {
                        switch (i4) {
                            case 9:
                                atds.m75666a(askf).mo49857c();
                                break;
                            case 10:
                                if (bmux2.f130993b == 3) {
                                    str3 = (String) bmux2.f130994c;
                                } else {
                                    str3 = str4;
                                }
                                if (!str3.isEmpty()) {
                                    atbq b3 = m93082b();
                                    if (bmux2.f130993b == 3) {
                                        str4 = (String) bmux2.f130994c;
                                    }
                                    b3.mo49781a();
                                    if (atbm.m75391a(askf2, str4, new String[]{"requested"}, "ready_for_pickup")) {
                                        b3.mo49783a(askf2.f89126d, askf2.f89125c);
                                        break;
                                    }
                                } else {
                                    bnsl bnsl8 = (bnsl) f108615a.mo68388c();
                                    bnsl8.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl8.mo68405a("Instrument id missing, dropping notification");
                                    return;
                                }
                                break;
                            case 11:
                                startService(asju.m74251a(askf2, bmux2.f130997f));
                                atds.m75666a(askf).mo49857c();
                                break;
                            default:
                                switch (i4) {
                                    case FelicaException.TYPE_NOT_CLOSED:
                                        m93078a().mo49217a(askf2);
                                        break;
                                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                        break;
                                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                                        if ((bmux2.f130992a & 16777216) != 0) {
                                            try {
                                                m93084d();
                                                bmuw bmuw = bmux2.f130999h;
                                                if (bmuw == null) {
                                                    bmuw = bmuw.f130975l;
                                                }
                                                String str9 = bmuw.f130978b;
                                                bmuw bmuw2 = bmux2.f130999h;
                                                if (bmuw2 == null) {
                                                    bmuw2 = bmuw.f130975l;
                                                }
                                                asiv.m74183a(askf2, str9, bmuw2.f130977a);
                                                break;
                                            } catch (SQLiteException | atfh | IOException e5) {
                                                return;
                                            }
                                        } else {
                                            bnsl bnsl9 = (bnsl) f108615a.mo68388c();
                                            bnsl9.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                            bnsl9.mo68405a("Missing token provisioning data. Dropping notification");
                                            return;
                                        }
                                    default:
                                        bnsl bnsl10 = (bnsl) f108615a.mo68388c();
                                        bnsl10.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        if (i != 0) {
                                            bnsl10.mo68409a("Unknown tap-and-pay notification type: %d", i4);
                                            m93079a(askf).mo49764e(22);
                                            return;
                                        }
                                        throw null;
                                }
                        }
                    } else if ((bmux2.f130992a & 16777216) != 0) {
                        bmuw bmuw3 = bmux2.f130999h;
                        if (bmuw3 == null) {
                            bmuw3 = bmuw.f130975l;
                        }
                        Intent a4 = atrq.m76259a(askf2.f89126d.getPackageName(), askf.mo49209a(), null);
                        a4.putExtra("session_id", bmuw3.f130978b);
                        a4.putExtra("token_provisioning_data", bmuw3.mo73642k());
                        bmuw bmuw4 = bmux2.f130999h;
                        if (bmuw4 == null) {
                            bmuw4 = bmuw.f130975l;
                        }
                        aszq.m75253a(askf2, bmuw4, a4);
                    } else {
                        bnsl bnsl11 = (bnsl) f108615a.mo68388c();
                        bnsl11.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl11.mo68405a("Missing token provisioning data. Dropping notification");
                        return;
                    }
                } else if ((bmux2.f130992a & 16777216) != 0) {
                    bmuw bmuw5 = bmux2.f130999h;
                    if (bmuw5 == null) {
                        bmuw5 = bmuw.f130975l;
                    }
                    startService(aszs.m75256a(askf2, bmuw5));
                } else {
                    bnsl bnsl12 = (bnsl) f108615a.mo68388c();
                    bnsl12.mo68432a("com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl12.mo68405a("Missing token provisioning data. Dropping notification");
                    return;
                }
                m93079a(askf).mo49764e(19);
                return;
            }
            throw null;
        }
        throw null;
    }
}
