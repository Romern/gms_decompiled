package p000;

import android.accounts.Account;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.BuildConfig;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiBatch;
import com.google.android.ulr.ApiClientInfo;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiSensorData;
import com.google.android.ulr.ApiSettings;
import com.google.android.ulr.LocationHistorianBatchData;
import com.google.android.ulr.ReportApiBatchReply;
import com.google.android.ulr.ReportApiBatchRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: bgxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgxv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bgxw f117944a;

    public bgxv(bgxw bgxw) {
        this.f117944a = bgxw;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:118:0x0329 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:408:0x07e7 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:343:0x06c5 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:890:0x014b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:889:0x0172 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:888:0x0172 */
    /* JADX WARN: Type inference failed for: r12v24, assign insn: PHI: (r12v24 ?) = (r12v19 int), (r12v121 ?) binds: [B:88:?, B:75:0x017a] */
    /* JADX WARN: Type inference failed for: r9v23, assign insn: 0x0314: CONST  (r9v23 ? I:?[int, float, short, byte, char]) = (10 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r4v104, types: [android.accounts.Account], assign insn: 0x0325: IGET  (r4v104 ? I:android.accounts.Account) = (r14v5 com.google.android.location.reporting.state.update.AccountConfig) com.google.android.location.reporting.state.update.AccountConfig.a android.accounts.Account */
    /* JADX WARN: Type inference failed for: r3v34, types: [android.accounts.Account], assign insn: PHI: (r3v34 ?) = (r3v37 ?), (r3v106 ?) binds: [B:504:0x091d, B:341:0x06bc] */
    /* JADX WARN: Type inference failed for: r3v37, assign insn: PHI: (r3v37 ?) = (r3v38 ?), (r3v42 ?) binds: [B:503:0x090e, B:496:0x08f5] */
    /* JADX WARN: Type inference failed for: r3v38, assign insn: 0x0912: MOVE  (r3v38 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v39, types: [android.accounts.Account], assign insn: PHI: (r3v39 ?) = (r3v40 ?), (r3v106 ?) binds: [B:499:0x0906, B:339:0x06b6] */
    /* JADX WARN: Type inference failed for: r3v40, assign insn: PHI: (r3v40 ?) = (r3v41 ?), (r3v42 ?) binds: [B:498:0x08f8, B:495:0x08f3] */
    /* JADX WARN: Type inference failed for: r3v41, assign insn: 0x08fb: MOVE  (r3v41 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v42, assign insn: PHI: (r3v42 ?) = (r3v43 ?), (r3v47 ?) binds: [B:489:0x08e5, B:479:0x08cb] */
    /* JADX WARN: Type inference failed for: r3v43, assign insn: PHI: (r3v43 ?) = (r3v53 ?), (r3v106 ?), (r3v106 ?) binds: [B:469:0x08b7, B:360:0x0700, B:308:0x0650] */
    /* JADX WARN: Type inference failed for: r3v44, types: [android.accounts.Account], assign insn: PHI: (r3v44 ?) = (r3v106 ?), (r3v106 ?), (r3v137 ?), (r3v143 ?) binds: [B:365:0x0716, B:313:0x0669, B:134:0x0362, B:482:0x08db] */
    /* JADX WARN: Type inference failed for: r3v47, assign insn: PHI: (r3v47 ?) = (r3v44 ?), (r3v44 ?), (r3v48 ?), (r3v48 ?) binds: [B:486:0x08e2, B:487:?, B:476:0x08c9, B:477:?] */
    /* JADX WARN: Type inference failed for: r3v48, assign insn: PHI: (r3v48 ?) = (r3v49 ?), (r3v106 ?), (r3v106 ?) binds: [B:474:0x08c6, B:362:0x070a, B:310:0x065a] */
    /* JADX WARN: Type inference failed for: r3v49, assign insn: PHI: (r3v49 ?) = (r3v50 ?), (r3v68 ?), (r3v71 ?), (r3v146 ?) binds: [B:473:0x08c5, B:437:0x0844, B:431:0x0829, B:426:0x0819] */
    /* JADX WARN: Type inference failed for: r3v50, assign insn: PHI: (r3v50 ?) = (r3v51 ?), (r3v62 ?), (r3v65 ?) binds: [B:472:0x08c1, B:455:0x087c, B:448:0x0865] */
    /* JADX WARN: Type inference failed for: r3v51, assign insn: PHI: (r3v51 ?) = (r3v52 ?), (r3v59 ?) binds: [B:471:0x08ba, B:461:0x0897] */
    /* JADX WARN: Type inference failed for: r3v52, assign insn: 0x08be: MOVE  (r3v52 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v53, assign insn: PHI: (r3v53 ?) = (r3v44 ?), (r3v54 ?), (r3v69 ?), (r3v72 ?) binds: [B:488:0x08e3, B:468:0x08b6, B:435:0x083c, B:429:0x0820] */
    /* JADX WARN: Type inference failed for: r3v54, assign insn: PHI: (r3v54 ?) = (r3v55 ?), (r3v63 ?), (r3v66 ?) binds: [B:467:0x08b2, B:453:0x0873, B:445:0x085d] */
    /* JADX WARN: Type inference failed for: r3v55, assign insn: PHI: (r3v55 ?) = (r3v56 ?), (r3v60 ?) binds: [B:466:0x08ab, B:459:0x0890] */
    /* JADX WARN: Type inference failed for: r3v56, assign insn: 0x08af: MOVE  (r3v56 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v59, assign insn: 0x089b: MOVE  (r3v59 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v60, assign insn: 0x0894: MOVE  (r3v60 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v62, assign insn: 0x0880: MOVE  (r3v62 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v63, assign insn: 0x0877: MOVE  (r3v63 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v65, assign insn: 0x0867: MOVE  (r3v65 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v66, assign insn: 0x085f: MOVE  (r3v66 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v68, assign insn: 0x0845: MOVE  (r3v68 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v69, assign insn: 0x083d: MOVE  (r3v69 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v71, assign insn: 0x082a: MOVE  (r3v71 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v72, assign insn: 0x0821: MOVE  (r3v72 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r12v69, assign insn: PHI: (r12v69 ?) = (r12v36 java.lang.String), (r12v71 ?) binds: [B:157:0x03ff, B:408:0x07e7] */
    /* JADX WARN: Type inference failed for: r9v43, assign insn: PHI: (r9v43 ?) = (r9v23 ?), (r9v45 ?) binds: [B:157:0x03ff, B:408:0x07e7] */
    /* JADX WARN: Type inference failed for: r7v44, assign insn: PHI: (r7v44 ?) = (r7v39 java.util.ArrayList), (r7v46 ?) binds: [B:157:0x03ff, B:408:0x07e7] */
    /* JADX WARN: Type inference failed for: r1v124, assign insn: PHI: (r1v124 ?) = (r1v122 bgwr), (r1v126 ?) binds: [B:157:0x03ff, B:408:0x07e7] */
    /* JADX WARN: Type inference failed for: r12v71, assign insn: PHI: (r12v71 ?) = (r12v104 ?), (r12v110 ?), (r12v137 ?), (r12v140 ?) binds: [B:232:0x050f, B:175:0x044f, B:407:0x07e6, B:385:0x075f] */
    /* JADX WARN: Type inference failed for: r9v45, assign insn: PHI: (r9v45 ?) = (r9v72 ?), (r9v75 ?), (r9v88 ?), (r9v91 ?) binds: [B:232:0x050f, B:175:0x044f, B:407:0x07e6, B:385:0x075f] */
    /* JADX WARN: Type inference failed for: r7v46, assign insn: PHI: (r7v46 ?) = (r7v79 ?), (r7v92 ?), (r7v95 ?), (r7v99 ?) binds: [B:232:0x050f, B:407:0x07e6, B:385:0x075f, B:175:0x044f] */
    /* JADX WARN: Type inference failed for: r1v126, assign insn: PHI: (r1v126 ?) = (r1v139 ?), (r1v188 ?), (r1v220 ?), (r1v223 ?) binds: [B:385:0x075f, B:232:0x050f, B:407:0x07e6, B:175:0x044f] */
    /* JADX WARN: Type inference failed for: r4v117, assign insn: PHI: (r4v117 ?) = (r4v104 ?), (r4v121 ?) binds: [B:158:?, B:399:0x07bb] */
    /* JADX WARN: Type inference failed for: r4v121, assign insn: 0x07bc: MOVE  (r4v121 ? I:?[OBJECT, ARRAY]) = (r3v82 bguk) */
    /* JADX WARN: Type inference failed for: r1v139, assign insn: 0x0760: MOVE  (r1v139 ? I:?[OBJECT, ARRAY]) = (r44v1 bguk) */
    /* JADX WARN: Type inference failed for: r3v106, types: [android.accounts.Account], assign insn: PHI: (r3v106 ?) = (r3v108 ?), (r3v109 ?) binds: [B:298:0x063b, B:291:?] */
    /* JADX WARN: Type inference failed for: r3v108, assign insn: 0x063b: MOVE  (r3v108 ? I:?[OBJECT, ARRAY]) = (r56v1 bguk) */
    /* JADX WARN: Type inference failed for: r3v109, types: [android.accounts.Account], assign insn: 0x0628: MOVE  (r3v109 ? I:?[OBJECT, ARRAY]) = (r56v1 bguk) */
    /* JADX WARN: Type inference failed for: r1v188, assign insn: 0x0510: MOVE  (r1v188 ? I:?[OBJECT, ARRAY]) = (r44v1 bguk) */
    /* JADX WARN: Type inference failed for: r7v79, assign insn: 0x0512: MOVE  (r7v79 ? I:?[OBJECT, ARRAY]) = (r45v1 bgwx) */
    /* JADX WARN: Type inference failed for: r12v104, assign insn: 0x0514: MOVE  (r12v104 ? I:?[OBJECT, ARRAY]) = (r49v1 bgwm) */
    /* JADX WARN: Type inference failed for: r9v72, assign insn: 0x0516: MOVE  (r9v72 ? I:?[OBJECT, ARRAY]) = (r50v1 qxn) */
    /* JADX WARN: Type inference failed for: r3v127, assign insn: PHI: (r3v127 ?) = (r3v109 ?), (r3v130 ?) binds: [B:295:0x0634, B:197:0x048d] */
    /* JADX WARN: Type inference failed for: r3v128, assign insn: PHI: (r3v128 ?) = (r3v109 ?), (r3v131 ?) binds: [B:293:0x0630, B:194:0x0485] */
    /* JADX WARN: Type inference failed for: r3v130, assign insn: 0x048e: MOVE  (r3v130 ? I:?[OBJECT, ARRAY]) = (r4v117 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v131, assign insn: 0x0486: MOVE  (r3v131 ? I:?[OBJECT, ARRAY]) = (r4v117 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r12v108, types: [java.lang.Integer], assign insn: 0x047f: INVOKE  (r12v108 ? I:java.lang.Integer) = (r12v107 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer */
    /* JADX WARN: Type inference failed for: r12v110, assign insn: 0x044f: MOVE  (r12v110 ? I:?[OBJECT, ARRAY]) = (r49v1 bgwm) */
    /* JADX WARN: Type inference failed for: r9v75, assign insn: 0x0451: MOVE  (r9v75 ? I:?[OBJECT, ARRAY]) = (r50v1 qxn) */
    /* JADX WARN: Type inference failed for: r3v137, assign insn: 0x0366: MOVE  (r3v137 ? I:?[OBJECT, ARRAY]) = (r4v104 ? I:?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r30v41, assign insn: PHI: (r30v41 ?) = (r30v45 boolean), (r30v46 boolean) binds: [B:60:0x0147, B:883:0x014b] */
    /* JADX WARN: Type inference failed for: r12v120, assign insn: PHI: (r12v120 ?) = (r12v119 int), (r12v127 int) binds: [B:60:0x0147, B:883:0x014b] */
    /* JADX WARN: Type inference failed for: r30v42, assign insn: PHI: (r30v42 ?) = (r30v41 ?), (r30v47 ?) binds: [B:890:0x014b, B:71:0x0172] */
    /* JADX WARN: Type inference failed for: r12v121, assign insn: PHI: (r12v121 ?) = (r12v120 ?), (r12v143 int) binds: [B:890:0x014b, B:71:0x0172] */
    /* JADX WARN: Type inference failed for: r30v43, assign insn: PHI: (r30v43 ?) = (r30v42 ?), (r30v44 ?), (r30v42 ?) binds: [B:889:0x0172, B:887:0x0172, B:888:0x0172] */
    /* JADX WARN: Type inference failed for: r30v44, assign insn: 0x0170: CONST  (r30v44 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v143, assign insn: ?: MOVE  (r3v143 ?) = (r3v45 bguk) */
    /* JADX WARN: Type inference failed for: r3v146, assign insn: ?: MOVE  (r3v146 ?) = (r3v73 bguk) */
    /* JADX WARN: Type inference failed for: r12v137, assign insn: ?: MOVE  (r12v137 ?) = (r12v72 bgwm) */
    /* JADX WARN: Type inference failed for: r9v88, assign insn: ?: MOVE  (r9v88 ?) = (r9v46 qxn) */
    /* JADX WARN: Type inference failed for: r7v92, assign insn: ?: MOVE  (r7v92 ?) = (r7v47 bgwx) */
    /* JADX WARN: Type inference failed for: r1v220, assign insn: ?: MOVE  (r1v220 ?) = (r1v127 bguk) */
    /* JADX WARN: Type inference failed for: r12v140, assign insn: ?: MOVE  (r12v140 ?) = (r12v83 bgwm) */
    /* JADX WARN: Type inference failed for: r9v91, assign insn: ?: MOVE  (r9v91 ?) = (r9v55 qxn) */
    /* JADX WARN: Type inference failed for: r7v95, assign insn: ?: MOVE  (r7v95 ?) = (r7v58 bgwx) */
    /* JADX WARN: Type inference failed for: r7v99, assign insn: ?: MOVE  (r7v99 ?) = (r7v84 bgwx) */
    /* JADX WARN: Type inference failed for: r1v223, assign insn: ?: MOVE  (r1v223 ?) = (r1v194 bguk) */
    /* JADX WARN: Type inference failed for: r30v47, assign insn: ?: MOVE  (r30v47 ?) = (r30v43 ?) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [?, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgwx.a(android.accounts.Account, boolean):void
     arg types: [android.accounts.Account, int]
     candidates:
      bgwx.a(bgwb, long):boolean
      bgwx.a(android.accounts.Account, java.lang.String):void
      bgwx.a(android.accounts.Account, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0361, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0362, code lost:
        r48 = r1;
        r12 = r2;
        r1 = r3;
        r3 = r4;
        r35 = r6;
        r47 = r10;
        r37 = r14;
        r9 = r15;
        r2 = r0;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x064f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0650, code lost:
        r2 = r0;
        r1 = r44;
        r12 = r49;
        r9 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0659, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x065a, code lost:
        r2 = r0;
        r1 = r44;
        r12 = r49;
        r9 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x068b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x068c, code lost:
        r2 = r0;
        r1 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0700, code lost:
        r12 = r49;
        r9 = r50;
        r2 = r0;
        r1 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0709, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x070a, code lost:
        r12 = r49;
        r9 = r50;
        r2 = r0;
        r1 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x08aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x08ab, code lost:
        r48 = r1;
        r12 = r2;
        r1 = r3;
        r3 = r4;
        r35 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x08b9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x08ba, code lost:
        r48 = r1;
        r12 = r2;
        r1 = r3;
        r3 = r4;
        r35 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0a10, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0241 A[Catch:{ RuntimeException -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x064f A[ExcHandler: all (r0v128 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:303:0x0647] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0659 A[ExcHandler: Exception (r0v127 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:303:0x0647] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0687 A[Catch:{ gid -> 0x068b, Exception -> 0x0659, all -> 0x064f }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x06a5 A[SYNTHETIC, Splitter:B:334:0x06a5] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06c5 A[SYNTHETIC, Splitter:B:343:0x06c5] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x06f5 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x06ff A[ExcHandler: all (r0v120 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:300:0x0641] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0709 A[ExcHandler: Exception (r0v119 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:300:0x0641] */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x07f0 A[Catch:{ gid -> 0x07fe, VolleyError -> 0x07de, all -> 0x07d4, all -> 0x0816 }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x07f5 A[Catch:{ gid -> 0x07fe, VolleyError -> 0x07de, all -> 0x07d4, all -> 0x0816 }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x080d A[Catch:{ gid -> 0x07fe, VolleyError -> 0x07de, all -> 0x07d4, all -> 0x0816 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0812 A[Catch:{ gid -> 0x07fe, VolleyError -> 0x07de, all -> 0x07d4, all -> 0x0816 }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x08aa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:126:0x034c] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x08b9 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:126:0x034c] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0927 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0932 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x0935 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:511:0x0936 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0947 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x0948 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x0950 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x0953 A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:661:0x0bce A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x0bd5  */
    /* JADX WARNING: Removed duplicated region for block: B:702:0x0d2c A[Catch:{ gid -> 0x0d87, Exception -> 0x0d85 }] */
    /* JADX WARNING: Removed duplicated region for block: B:705:0x0d36 A[Catch:{ gid -> 0x0d87, Exception -> 0x0d85 }] */
    /* JADX WARNING: Removed duplicated region for block: B:706:0x0d37 A[Catch:{ gid -> 0x0d87, Exception -> 0x0d85 }] */
    /* JADX WARNING: Removed duplicated region for block: B:708:0x0d3b A[Catch:{ gid -> 0x0d87, Exception -> 0x0d85 }] */
    /* JADX WARNING: Removed duplicated region for block: B:709:0x0d3e A[Catch:{ gid -> 0x0d87, Exception -> 0x0d85 }] */
    /* JADX WARNING: Removed duplicated region for block: B:711:0x0d42 A[SYNTHETIC, Splitter:B:711:0x0d42] */
    /* JADX WARNING: Removed duplicated region for block: B:718:0x0d56 A[SYNTHETIC, Splitter:B:718:0x0d56] */
    /* JADX WARNING: Removed duplicated region for block: B:724:0x0d7e A[Catch:{ RuntimeException -> 0x09c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:776:0x0dee A[SYNTHETIC, Splitter:B:776:0x0dee] */
    /* JADX WARNING: Removed duplicated region for block: B:778:0x0df9 A[Catch:{ RuntimeException -> 0x0ddc }] */
    /* JADX WARNING: Removed duplicated region for block: B:780:0x0dfc A[Catch:{ RuntimeException -> 0x0ddc }] */
    /* JADX WARNING: Removed duplicated region for block: B:781:0x0dfd A[Catch:{ RuntimeException -> 0x0ddc }] */
    /* JADX WARNING: Removed duplicated region for block: B:789:0x0e0e  */
    /* JADX WARNING: Removed duplicated region for block: B:790:0x0e10  */
    /* JADX WARNING: Removed duplicated region for block: B:795:0x0e18  */
    /* JADX WARNING: Removed duplicated region for block: B:796:0x0e1d  */
    /* JADX WARNING: Removed duplicated region for block: B:837:0x0ec4  */
    /* JADX WARNING: Removed duplicated region for block: B:838:0x0eca  */
    /* JADX WARNING: Unknown variable types count: 6 */
    public final void run() {
        int i;
        boolean z;
        long j;
        ReportingConfig reportingConfig;
        Account account;
        List list;
        int i2;
        bgwm bgwm;
        RuntimeException runtimeException;
        boolean z2;
        boolean z3;
        AccountConfig accountConfig;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        Throwable th;
        boolean z7;
        int i3;
        boolean z8;
        int i4;
        boolean z9;
        boolean z10;
        AccountConfig accountConfig2;
        boolean z11;
        IOException iOException;
        Exception exc;
        qxn qxn;
        String str;
        Throwable th2;
        gid gid;
        AccountConfig accountConfig3;
        boolean z12;
        Exception exc2;
        boolean z13;
        bvwq bvwq;
        LevelDb.Iterator it;
        long j3;
        ReportingConfig reportingConfig2;
        long j4;
        Account account2;
        bgwm bgwm2;
        boolean z14;
        Throwable th3;
        bguk bguk;
        int i5;
        AccountConfig accountConfig4;
        long j5;
        boolean z15;
        int i6;
        boolean z16;
        bguk bguk2;
        boolean z17;
        ? r3;
        IOException iOException2;
        bguk bguk3;
        bgwm bgwm3;
        gid gid2;
        qxn qxn2;
        qxn qxn3;
        String str2;
        Throwable th4;
        bgwx bgwx;
        gid gid3;
        qxn qxn4;
        bguk bguk4;
        bguk bguk5;
        bgwx bgwx2;
        bgwm bgwm4;
        qxn qxn5;
        bguk bguk6;
        ? r32;
        bgwm bgwm5;
        ? r33;
        bguk bguk7;
        ApiClientInfo apiClientInfo;
        bguk bguk8;
        bguk bguk9;
        bgwm bgwm6;
        qxn qxn6;
        bgwx bgwx3;
        bguk bguk10;
        Throwable th5;
        bguk bguk11;
        gid gid4;
        VolleyError volleyError;
        bgwm bgwm7;
        qxn qxn7;
        bgwx bgwx4;
        bguk bguk12;
        bguk bguk13;
        bgwm bgwm8;
        qxn qxn8;
        bgwx bgwx5;
        bguk bguk14;
        bguk bguk15;
        String str3;
        bgwm bgwm9;
        qxn qxn9;
        bgwx bgwx6;
        bguk bguk16;
        bgwx bgwx7;
        bguk bguk17;
        bgwm bgwm10;
        qxn qxn10;
        bgwx bgwx8;
        bguk bguk18;
        bgwx bgwx9;
        bguk bguk19;
        Integer valueOf;
        bgwx bgwx10;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        int i7;
        Integer valueOf2;
        Integer valueOf3;
        String str7;
        String str8;
        String str9;
        long j6;
        StringBuilder sb;
        bguk bguk20;
        ArrayList arrayList;
        bgwb bgwb;
        long j7;
        boolean z18;
        String str10;
        String str11;
        bgwm bgwm11;
        bguk bguk21;
        bgwx bgwx11;
        bguk bguk22;
        bgwx bgwx12;
        bguk bguk23;
        bguk bguk24;
        Account account3;
        ApiMetadata apiMetadata;
        bguv.m100042a("UlrUploadTaskStarted");
        bgwm bgwm12 = this.f117944a.f117945b;
        ReportingConfig a = bgwm12.f117834b.mo63354a();
        bgwm12.f117837e.mo63174a(a);
        int size = a.mo70928b().size();
        bguv.m100044a("UlrUploadStatus", 0, size);
        if (!bgzo.m100478d(bgwm12.f117833a)) {
            bgur.m100011a("GCoreUlr", "Batch Location Update aborted because not connected");
            bguv.m100044a("UlrUploadStatus", 3, size);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            List c = a.mo70929c();
            sdo.m34974b(!c.isEmpty());
            Account account4 = ((AccountConfig) c.get(0)).f150890a;
            int size2 = c.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Account account5 = ((AccountConfig) c.get(i8)).f150890a;
                if (account5.name.compareTo(account4.name) <= 0) {
                    account4 = account5;
                }
            }
            Collections.shuffle(c, bgwm12.f117840h);
            int size3 = c.size();
            int i9 = 0;
            boolean z19 = false;
            loop1:
            while (i9 < size3) {
                AccountConfig accountConfig5 = (AccountConfig) c.get(i9);
                Account account6 = accountConfig5.f150890a;
                boolean equals = account6.equals(account4);
                try {
                    if (!accountConfig5.f150901l) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (chcp.m148197f()) {
                            i2 = size3;
                            try {
                                int u = (int) chcs.m148249u();
                                int i10 = 0;
                                z4 = false;
                                boolean z20 = true;
                                while (i10 < u && z20) {
                                    if (i10 != 0) {
                                        z14 = false;
                                    } else {
                                        z14 = equals;
                                    }
                                    list = c;
                                    account = account4;
                                    try {
                                        long t = chcs.m148248t();
                                        bgug bgug = bgwm12.f117838f;
                                        int i11 = u;
                                        Account account7 = accountConfig5.f150890a;
                                        int i12 = (int) t;
                                        synchronized (bgug.f117559c) {
                                            reportingConfig = a;
                                            try {
                                                bguk = new bguk();
                                                j = elapsedRealtime;
                                                try {
                                                    if (bgug.f117560d != null) {
                                                        try {
                                                            bgug.mo63190a(account7);
                                                            LevelDb.Iterator it2 = bgug.f117560d.iterator();
                                                            try {
                                                                it2.seek(bgul.m99987a(account7, currentTimeMillis));
                                                                boolean z21 = false;
                                                                while (true) {
                                                                    if (!bgug.m99967a(it2, account7)) {
                                                                        z = z21;
                                                                        i = i9;
                                                                        break;
                                                                    }
                                                                    z = z21;
                                                                    i = i9;
                                                                    try {
                                                                        int size4 = bguk.f117572a.size() + bguk.f117573b.size();
                                                                        i9 = bguk.f117574c.size();
                                                                        if (size4 + i9 >= i12) {
                                                                            break;
                                                                        }
                                                                        bgvm b = bgug.m99968b(bgug.mo63198a(it2.value()));
                                                                        if (b != null) {
                                                                            bguk.mo63208a(it2.key(), b);
                                                                            if ((b.f117688a & 1) != 0) {
                                                                                z21 = true;
                                                                                it2.next();
                                                                                i9 = i;
                                                                            }
                                                                        }
                                                                        z21 = z;
                                                                        it2.next();
                                                                        i9 = i;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        th3 = th;
                                                                        bgwm = bgwm12;
                                                                        z = account6;
                                                                        try {
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            th3 = th;
                                                                            throw th3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                }
                                                                while (true) {
                                                                    if (!bgug.m99967a(it2, account7)) {
                                                                        break;
                                                                    } else if (z == 0) {
                                                                        bgvm b2 = bgug.m99968b(bgug.mo63198a(it2.value()));
                                                                        if (b2 != null) {
                                                                            i9 = 1;
                                                                            i9 = 1;
                                                                            if ((b2.f117688a & 1) != 0) {
                                                                                bguk.mo63208a(it2.key(), b2);
                                                                                z = 1;
                                                                            }
                                                                        }
                                                                        it2.next();
                                                                        z = z;
                                                                        i9 = i9;
                                                                    }
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                Throwable th9 = th;
                                                                it2.close();
                                                                throw th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            i = i9;
                                                            th3 = th;
                                                            bgwm = bgwm12;
                                                            z = account6;
                                                            throw th3;
                                                        }
                                                    } else {
                                                        i = i9;
                                                        try {
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            bgwm = bgwm12;
                                                            z = account6;
                                                            th3 = th;
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    i = i9;
                                                    z = account6;
                                                    bgwm = bgwm12;
                                                    th3 = th;
                                                    throw th3;
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                j = elapsedRealtime;
                                                i = i9;
                                                z = account6;
                                                bgwm = bgwm12;
                                                th3 = th;
                                                throw th3;
                                            }
                                            try {
                                                if (bguk.f117572a.isEmpty()) {
                                                    try {
                                                        String a2 = aeqm.m52397a(accountConfig5.f150890a);
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 58);
                                                        sb2.append("Skipping batch upload #");
                                                        sb2.append(i10);
                                                        sb2.append(" with no locations for: ");
                                                        sb2.append(a2);
                                                        sb2.toString();
                                                        if (i10 == 0) {
                                                            bgwm = bgwm12;
                                                            j5 = currentTimeMillis;
                                                            i5 = i10;
                                                            z15 = z19;
                                                            accountConfig4 = accountConfig5;
                                                            z = account6;
                                                            i6 = 4;
                                                        } else {
                                                            bgwm = bgwm12;
                                                            j5 = currentTimeMillis;
                                                            i5 = i10;
                                                            z15 = z19;
                                                            accountConfig4 = accountConfig5;
                                                            z = account6;
                                                            i6 = 2;
                                                        }
                                                    } catch (RuntimeException e) {
                                                        runtimeException = e;
                                                        bgwm = bgwm12;
                                                        z = account6;
                                                        bguv.m100043a("UlrUploadStatus", 9);
                                                        String valueOf4 = String.valueOf(aeqm.m52397a(z));
                                                        bgur.m100021b("GCoreUlr", valueOf4.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf4), runtimeException);
                                                        z19 = true;
                                                        bgwm12 = bgwm;
                                                        size3 = i2;
                                                        c = list;
                                                        account4 = account;
                                                        a = reportingConfig;
                                                        elapsedRealtime = j;
                                                        i9 = i + 1;
                                                    }
                                                } else {
                                                    if (i10 == 0) {
                                                        bgwm12.mo63283a(bguk);
                                                    }
                                                    if (z14) {
                                                        bgts bgts = bgwm12.f117841i;
                                                        if (bgts.mo63160a()) {
                                                            bgtp b3 = bgts.mo63161b();
                                                            if (b3 != null) {
                                                                apiMetadata = new ApiMetadata(null, null, null, new LocationHistorianBatchData(sqd.m35972d(b3.f117512d), TimeZone.getDefault().getID(), Integer.valueOf(b3.f117509a)), null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null);
                                                                if (apiMetadata == null) {
                                                                    bguk.f117574c.add(apiMetadata);
                                                                    z16 = true;
                                                                } else {
                                                                    z16 = false;
                                                                }
                                                            } else {
                                                                bgts.mo63162c();
                                                            }
                                                        }
                                                        apiMetadata = null;
                                                        if (apiMetadata == null) {
                                                        }
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    bgur.m100011a("GCoreUlr", String.format(Locale.US, "LocationReporter sending %s for account %s request #%d; requests: %s", bguk, aeqm.m52397a(accountConfig5.f150890a), Integer.valueOf(i10), bgwm12.f117836d.mo63404c()));
                                                    ArrayList arrayList2 = bguk.f117572a;
                                                    ArrayList arrayList3 = new ArrayList();
                                                    int size5 = arrayList2.size();
                                                    int i13 = 0;
                                                    bgwm = i9;
                                                    while (i13 < size5) {
                                                        boolean z22 = z16;
                                                        bgwm = bgwm12;
                                                        bguk bguk25 = bguk2;
                                                        long j8 = currentTimeMillis;
                                                        int i14 = i10;
                                                        boolean z23 = z19;
                                                        AccountConfig accountConfig6 = accountConfig5;
                                                        z = account6;
                                                        arrayList3.add(new bgzj((bgvr) arrayList2.get(i13)));
                                                        i13++;
                                                        bguk = bguk25;
                                                        bgwm12 = bgwm;
                                                        account6 = z;
                                                        z19 = z23;
                                                        currentTimeMillis = j8;
                                                        accountConfig5 = accountConfig6;
                                                        i10 = i14;
                                                        z16 = z22;
                                                    }
                                                    String valueOf5 = String.valueOf(arrayList3);
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 11);
                                                    sb3.append("Locations: ");
                                                    sb3.append(valueOf5);
                                                    sb3.toString();
                                                    String valueOf6 = String.valueOf(bguk2.f117573b);
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 12);
                                                    sb4.append("Activities: ");
                                                    sb4.append(valueOf6);
                                                    sb4.toString();
                                                    String valueOf7 = String.valueOf(bguk2.f117574c);
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf7).length() + 10);
                                                    sb5.append("Metadata: ");
                                                    sb5.append(valueOf7);
                                                    sb5.toString();
                                                    String valueOf8 = String.valueOf(bguk2.f117575d);
                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf8).length() + 12);
                                                    sb6.append("SensorData: ");
                                                    sb6.append(valueOf8);
                                                    sb6.toString();
                                                    String valueOf9 = String.valueOf(bguk2.f117576e);
                                                    ? r9 = 10;
                                                    StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf9).length() + 10);
                                                    sb7.append("UserData: ");
                                                    sb7.append(valueOf9);
                                                    sb7.toString();
                                                    ? r4 = accountConfig5.f150890a;
                                                    long j9 = accountConfig5.f150898i;
                                                    try {
                                                        bgwx bgwx13 = bgwm12.f117835c;
                                                        int b4 = bgwx13.f117871a.mo63359b((Account) r4);
                                                        String a3 = bgwx13.mo63298a((Account) r4);
                                                        if (chcs.m148239k()) {
                                                            account3 = account6;
                                                            qxn2 = bguv.m100039a();
                                                        } else {
                                                            account3 = account6;
                                                            qxn2 = null;
                                                        }
                                                        z15 = z19;
                                                        try {
                                                            bgwl bgwl = bgwx13.f117872b;
                                                            boolean b5 = chcj.m148164b();
                                                            boolean z24 = !b5;
                                                            if (z24) {
                                                                apiClientInfo = bgwl.mo63280a();
                                                                j5 = currentTimeMillis;
                                                            } else {
                                                                j5 = currentTimeMillis;
                                                                apiClientInfo = null;
                                                            }
                                                            try {
                                                                accountConfig4 = accountConfig5;
                                                            } catch (gid e2) {
                                                                e = e2;
                                                                z17 = z16;
                                                                bgwm3 = bgwm12;
                                                                bguk9 = bguk2;
                                                                bguk8 = r4;
                                                                bgwx2 = bgwx13;
                                                                i5 = i10;
                                                                accountConfig4 = accountConfig5;
                                                                qxn4 = qxn2;
                                                                bguk4 = bguk8;
                                                                bguk5 = bguk9;
                                                                gid3 = e;
                                                                qxn3 = qxn4;
                                                                r3 = bguk4;
                                                                bguk3 = bguk5;
                                                                try {
                                                                    bgwx.mo63300a((Account) r3, false);
                                                                    throw gid3;
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                    th4 = th;
                                                                    str2 = null;
                                                                    try {
                                                                        qxn3.mo24369a(bguv.m100050b(str2));
                                                                        throw th4;
                                                                    } catch (IOException e3) {
                                                                        e = e3;
                                                                        iOException2 = e;
                                                                        bgwm.m100167a(r3, iOException2);
                                                                        if (!bgwm.m100168a(iOException2)) {
                                                                            bgwm.f117838f.mo63193a(bguk3);
                                                                            bguz.m100120a(iOException2);
                                                                            i6 = 10;
                                                                        } else {
                                                                            i6 = 7;
                                                                        }
                                                                        if (!z14) {
                                                                        }
                                                                        if (i6 == 4) {
                                                                        }
                                                                        if (i6 != 1) {
                                                                        }
                                                                        bguv.m100043a("UlrUploadStatus", i6);
                                                                        i10 = i5 + 1;
                                                                        bgwm12 = bgwm;
                                                                        c = list;
                                                                        account4 = account;
                                                                        u = i11;
                                                                        a = reportingConfig;
                                                                        elapsedRealtime = j;
                                                                        account6 = z;
                                                                        i9 = i;
                                                                        z19 = z15;
                                                                        currentTimeMillis = j5;
                                                                        accountConfig5 = accountConfig4;
                                                                    } catch (gid e4) {
                                                                        e = e4;
                                                                        gid2 = e;
                                                                        bgwm.m100167a(r3, gid2);
                                                                        i6 = 8;
                                                                        if (!z14) {
                                                                        }
                                                                        if (i6 == 4) {
                                                                        }
                                                                        if (i6 != 1) {
                                                                        }
                                                                        bguv.m100043a("UlrUploadStatus", i6);
                                                                        i10 = i5 + 1;
                                                                        bgwm12 = bgwm;
                                                                        c = list;
                                                                        account4 = account;
                                                                        u = i11;
                                                                        a = reportingConfig;
                                                                        elapsedRealtime = j;
                                                                        account6 = z;
                                                                        i9 = i;
                                                                        z19 = z15;
                                                                        currentTimeMillis = j5;
                                                                        accountConfig5 = accountConfig4;
                                                                    }
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                boolean z25 = z16;
                                                                bgwm4 = bgwm12;
                                                                bguk6 = bguk2;
                                                                r32 = r4;
                                                                i5 = i10;
                                                                accountConfig4 = accountConfig5;
                                                                qxn5 = qxn2;
                                                                Exception exc3 = e;
                                                                str2 = "UlrProfUploadException";
                                                                try {
                                                                    throw exc3;
                                                                } catch (Throwable th15) {
                                                                    th4 = th15;
                                                                }
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                                z17 = z16;
                                                                bgwm5 = bgwm12;
                                                                bguk7 = bguk2;
                                                                r33 = r4;
                                                                i5 = i10;
                                                                accountConfig4 = accountConfig5;
                                                                qxn3 = qxn2;
                                                                th4 = th;
                                                                str2 = null;
                                                                qxn3.mo24369a(bguv.m100050b(str2));
                                                                throw th4;
                                                            }
                                                            try {
                                                                sdo.m34975b(!bguk2.f117572a.isEmpty(), "Must have at least 1 location to upload");
                                                                ArrayList b6 = bgzt.m100500b(bguk2.f117573b);
                                                                ArrayList a4 = bgzt.m100495a(bguk2.f117572a);
                                                                ArrayList arrayList4 = bguk2.f117575d;
                                                                i5 = i10;
                                                                try {
                                                                    ArrayList arrayList5 = new ArrayList();
                                                                    for (Iterator it3 = arrayList4.iterator(); it3.hasNext(); it3 = it3) {
                                                                        arrayList5.addAll(((ApiSensorData) it3.next()).getBarometerDatas());
                                                                    }
                                                                    z17 = z16;
                                                                    try {
                                                                        bgwm bgwm13 = bgwm12;
                                                                        try {
                                                                            qxn qxn11 = qxn2;
                                                                            try {
                                                                                ApiBatch apiBatch = new ApiBatch(b6, bguk2.f117574c, a4, bgzt.m100502d(bgwl.f117827i), bgzt.m100501c(bgwl.f117827i), bgzt.m100499b(bgwl.f117827i), new ApiSensorData(arrayList5), bguk2.f117576e);
                                                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                                                ReportApiBatchRequest reportApiBatchRequest = new ReportApiBatchRequest(apiBatch, apiClientInfo, Long.valueOf(currentTimeMillis2), Long.valueOf(j9));
                                                                                bgwr a5 = bgwk.m100163a(bgwl.f117827i);
                                                                                try {
                                                                                    bjcv bjcv = new bjcv(a5);
                                                                                    ClientContext a6 = bgwl.m100164a(bgwl.f117827i, r4);
                                                                                    Iterator it4 = bguk2.f117572a.iterator();
                                                                                    long j10 = Long.MAX_VALUE;
                                                                                    long j11 = Long.MIN_VALUE;
                                                                                    while (it4.hasNext()) {
                                                                                        bgwr bgwr = a5;
                                                                                        bguk bguk26 = bguk2;
                                                                                        bguk bguk27 = r4;
                                                                                        ArrayList arrayList6 = a4;
                                                                                        bgwx bgwx14 = bgwx13;
                                                                                        long j12 = j9;
                                                                                        String str12 = a3;
                                                                                        bgwm bgwm14 = bgwm13;
                                                                                        qxn qxn12 = qxn11;
                                                                                        try {
                                                                                            ReportApiBatchRequest reportApiBatchRequest2 = reportApiBatchRequest;
                                                                                            bgvr bgvr = (bgvr) it4.next();
                                                                                            long j13 = j12;
                                                                                            j10 = Math.min(j10, bgvr.f117718d);
                                                                                            long j14 = bgvr.f117718d;
                                                                                            Iterator it5 = it4;
                                                                                            int i15 = b4;
                                                                                            j11 = Math.max(j11, j14);
                                                                                            it4 = it5;
                                                                                            r4 = bguk27;
                                                                                            bgwx13 = bgwx14;
                                                                                            qxn11 = qxn12;
                                                                                            bgwm13 = bgwm14;
                                                                                            b4 = i15;
                                                                                            reportApiBatchRequest = reportApiBatchRequest2;
                                                                                            a4 = arrayList6;
                                                                                            bguk2 = bguk26;
                                                                                            a3 = str12;
                                                                                            a5 = bgwr;
                                                                                            j9 = j13;
                                                                                        } catch (gid e6) {
                                                                                            e = e6;
                                                                                            gid4 = e;
                                                                                            if (!chcy.m148488d()) {
                                                                                                bgux.m100095a(false);
                                                                                            } else {
                                                                                                bgux.m100110d(gid4);
                                                                                            }
                                                                                            throw gid4;
                                                                                        } catch (VolleyError e7) {
                                                                                            e = e7;
                                                                                            bguk13 = bguk26;
                                                                                            bguk12 = bguk27;
                                                                                            bgwx4 = bgwx14;
                                                                                            bgwm7 = bgwm14;
                                                                                            qxn7 = qxn12;
                                                                                            volleyError = e;
                                                                                            a3 = bgwm7;
                                                                                            r9 = qxn7;
                                                                                            a4 = bgwx4;
                                                                                            bguk2 = bguk12;
                                                                                            a5 = bguk13;
                                                                                            bgwl.m100165a(volleyError);
                                                                                            if (chcy.m148488d()) {
                                                                                                bgux.m100095a(false);
                                                                                            } else {
                                                                                                bgux.m100110d(volleyError);
                                                                                            }
                                                                                            throw new IOException(volleyError);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        a5.f117860m = new bgwi(currentTimeMillis2, j10, j11);
                                                                                        Integer valueOf10 = Integer.valueOf(b4);
                                                                                        String str13 = !b5 ? a3 : null;
                                                                                        String str14 = bgwl.f117831m;
                                                                                        String str15 = bgwl.f117809f;
                                                                                        String str16 = bgwl.f117807d;
                                                                                        if (z24) {
                                                                                            try {
                                                                                                str3 = bgwl.f117806c;
                                                                                            } catch (gid e8) {
                                                                                                gid4 = e8;
                                                                                                if (!chcy.m148488d()) {
                                                                                                }
                                                                                                throw gid4;
                                                                                            } catch (VolleyError e9) {
                                                                                                volleyError = e9;
                                                                                                bguk21 = bguk2;
                                                                                                bguk23 = r4;
                                                                                                bgwx11 = bgwx13;
                                                                                                a3 = bgwm13;
                                                                                                r9 = qxn11;
                                                                                                a4 = bgwx11;
                                                                                                bguk2 = bguk23;
                                                                                                a5 = bguk21;
                                                                                                bgwl.m100165a(volleyError);
                                                                                                if (chcy.m148488d()) {
                                                                                                }
                                                                                                throw new IOException(volleyError);
                                                                                            } catch (Throwable th17) {
                                                                                                th5 = th17;
                                                                                                bguk22 = bguk2;
                                                                                                bguk24 = r4;
                                                                                                bgwx12 = bgwx13;
                                                                                                bgwm6 = bgwm13;
                                                                                                qxn6 = qxn11;
                                                                                                bgwx3 = bgwx12;
                                                                                                bguk10 = bguk24;
                                                                                                bguk11 = bguk22;
                                                                                                try {
                                                                                                    throw th5;
                                                                                                } catch (gid e10) {
                                                                                                    e = e10;
                                                                                                    bgwm3 = bgwm6;
                                                                                                    qxn4 = qxn6;
                                                                                                    bgwx2 = bgwx3;
                                                                                                    bguk4 = bguk10;
                                                                                                    bguk5 = bguk11;
                                                                                                } catch (Exception e11) {
                                                                                                    e = e11;
                                                                                                    bgwm4 = bgwm6;
                                                                                                    qxn5 = qxn6;
                                                                                                    r32 = bguk10;
                                                                                                    bguk6 = bguk11;
                                                                                                    Exception exc32 = e;
                                                                                                    str2 = "UlrProfUploadException";
                                                                                                    throw exc32;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            str3 = null;
                                                                                        }
                                                                                        String str17 = z24 ? "noRestriction" : null;
                                                                                        bguk bguk28 = bguk2;
                                                                                        try {
                                                                                            valueOf = Integer.valueOf(bgwl.f117828j);
                                                                                            bgwx10 = bgwx13;
                                                                                            try {
                                                                                                bool = bgwl.f117832n;
                                                                                                str4 = bgwl.f117811h;
                                                                                                str5 = bgwl.f117810g;
                                                                                                if (z24) {
                                                                                                    str6 = a3;
                                                                                                    try {
                                                                                                        bgwm11 = Integer.valueOf(bgwl.f117830l);
                                                                                                    } catch (gid e12) {
                                                                                                        gid4 = e12;
                                                                                                        if (!chcy.m148488d()) {
                                                                                                        }
                                                                                                        throw gid4;
                                                                                                    } catch (VolleyError e13) {
                                                                                                        volleyError = e13;
                                                                                                        r3 = r4;
                                                                                                        bguk21 = bguk28;
                                                                                                        bgwx11 = bgwx10;
                                                                                                        bguk23 = r3;
                                                                                                        a3 = bgwm13;
                                                                                                        r9 = qxn11;
                                                                                                        a4 = bgwx11;
                                                                                                        bguk2 = bguk23;
                                                                                                        a5 = bguk21;
                                                                                                        bgwl.m100165a(volleyError);
                                                                                                        if (chcy.m148488d()) {
                                                                                                        }
                                                                                                        throw new IOException(volleyError);
                                                                                                    } catch (Throwable th18) {
                                                                                                        th5 = th18;
                                                                                                        r3 = r4;
                                                                                                        bguk22 = bguk28;
                                                                                                        bgwx12 = bgwx10;
                                                                                                        bguk24 = r3;
                                                                                                        bgwm6 = bgwm13;
                                                                                                        qxn6 = qxn11;
                                                                                                        bgwx3 = bgwx12;
                                                                                                        bguk10 = bguk24;
                                                                                                        bguk11 = bguk22;
                                                                                                        throw th5;
                                                                                                    }
                                                                                                } else {
                                                                                                    str6 = a3;
                                                                                                    bgwm11 = null;
                                                                                                }
                                                                                                i7 = z24 ? 2023 : null;
                                                                                                valueOf2 = z24 ? Integer.valueOf(bgwl.f117804a) : null;
                                                                                                valueOf3 = z24 ? Integer.valueOf(bgwl.f117829k) : null;
                                                                                                str7 = z24 ? bgwl.f117805b : null;
                                                                                                str8 = chcj.m148167e() ? "android" : null;
                                                                                                str9 = bgwl.f117808e;
                                                                                                j6 = j9;
                                                                                                sb = new StringBuilder();
                                                                                                bguk20 = r4;
                                                                                                arrayList = a4;
                                                                                            } catch (gid e14) {
                                                                                                e = e14;
                                                                                                gid4 = e;
                                                                                                if (!chcy.m148488d()) {
                                                                                                }
                                                                                                throw gid4;
                                                                                            } catch (VolleyError e15) {
                                                                                                e = e15;
                                                                                                bguk17 = r4;
                                                                                                bgwx7 = bgwx10;
                                                                                                bgwm9 = bgwm13;
                                                                                                qxn9 = qxn11;
                                                                                                bgwx6 = bgwx7;
                                                                                                bguk16 = bguk17;
                                                                                                volleyError = e;
                                                                                                a5 = bguk28;
                                                                                                a3 = bgwm9;
                                                                                                r9 = qxn9;
                                                                                                a4 = bgwx6;
                                                                                                bguk2 = bguk16;
                                                                                                bgwl.m100165a(volleyError);
                                                                                                if (chcy.m148488d()) {
                                                                                                }
                                                                                                throw new IOException(volleyError);
                                                                                            } catch (Throwable th19) {
                                                                                                th = th19;
                                                                                                bguk19 = r4;
                                                                                                bgwx9 = bgwx10;
                                                                                                bgwm10 = bgwm13;
                                                                                                qxn10 = qxn11;
                                                                                                bgwx8 = bgwx9;
                                                                                                bguk18 = bguk19;
                                                                                                th5 = th;
                                                                                                bguk11 = bguk28;
                                                                                                bgwm6 = bgwm10;
                                                                                                qxn6 = qxn10;
                                                                                                bgwx3 = bgwx8;
                                                                                                bguk10 = bguk18;
                                                                                                throw th5;
                                                                                            }
                                                                                        } catch (gid e16) {
                                                                                            e = e16;
                                                                                            gid4 = e;
                                                                                            if (!chcy.m148488d()) {
                                                                                            }
                                                                                            throw gid4;
                                                                                        } catch (VolleyError e17) {
                                                                                            e = e17;
                                                                                            bguk17 = r4;
                                                                                            bgwx7 = bgwx13;
                                                                                            bgwm9 = bgwm13;
                                                                                            qxn9 = qxn11;
                                                                                            bgwx6 = bgwx7;
                                                                                            bguk16 = bguk17;
                                                                                            volleyError = e;
                                                                                            a5 = bguk28;
                                                                                            a3 = bgwm9;
                                                                                            r9 = qxn9;
                                                                                            a4 = bgwx6;
                                                                                            bguk2 = bguk16;
                                                                                            bgwl.m100165a(volleyError);
                                                                                            if (chcy.m148488d()) {
                                                                                            }
                                                                                            throw new IOException(volleyError);
                                                                                        } catch (Throwable th20) {
                                                                                            th = th20;
                                                                                            bguk19 = r4;
                                                                                            bgwx9 = bgwx13;
                                                                                            bgwm10 = bgwm13;
                                                                                            qxn10 = qxn11;
                                                                                            bgwx8 = bgwx9;
                                                                                            bguk18 = bguk19;
                                                                                            th5 = th;
                                                                                            bguk11 = bguk28;
                                                                                            bgwm6 = bgwm10;
                                                                                            qxn6 = qxn10;
                                                                                            bgwx3 = bgwx8;
                                                                                            bguk10 = bguk18;
                                                                                            throw th5;
                                                                                        }
                                                                                        try {
                                                                                            new Formatter(sb).format("reports/%1$s", String.valueOf(valueOf10));
                                                                                            if (str13 != null) {
                                                                                                try {
                                                                                                    shd.m35269a(sb, "androidGcmRegistrationId", shd.m35267a(str13));
                                                                                                } catch (gid e18) {
                                                                                                    gid4 = e18;
                                                                                                } catch (VolleyError e19) {
                                                                                                    volleyError = e19;
                                                                                                    a5 = bguk28;
                                                                                                    a4 = bgwx10;
                                                                                                    a3 = bgwm13;
                                                                                                    r9 = qxn11;
                                                                                                    bguk2 = bguk20;
                                                                                                    bgwl.m100165a(volleyError);
                                                                                                    if (chcy.m148488d()) {
                                                                                                    }
                                                                                                    throw new IOException(volleyError);
                                                                                                } catch (Throwable th21) {
                                                                                                    th5 = th21;
                                                                                                    bguk11 = bguk28;
                                                                                                    bgwx3 = bgwx10;
                                                                                                    bgwm6 = bgwm13;
                                                                                                    qxn6 = qxn11;
                                                                                                    bguk10 = bguk20;
                                                                                                    throw th5;
                                                                                                }
                                                                                            }
                                                                                            if (str14 != null) {
                                                                                                shd.m35269a(sb, "barometerSensorName", shd.m35267a(str14));
                                                                                            }
                                                                                            if (str15 != null) {
                                                                                                shd.m35269a(sb, "brand", shd.m35267a(str15));
                                                                                            }
                                                                                            if (str16 != null) {
                                                                                                shd.m35269a(sb, "device", shd.m35267a(str16));
                                                                                            }
                                                                                            if (str3 != null) {
                                                                                                shd.m35269a(sb, "devicePrettyName", shd.m35267a(str3));
                                                                                            }
                                                                                            if (str17 != null) {
                                                                                                shd.m35269a(sb, "deviceRestriction", shd.m35267a(str17));
                                                                                            }
                                                                                            shd.m35269a(sb, "gmsVersion", String.valueOf(valueOf));
                                                                                            if (bool != null) {
                                                                                                shd.m35269a(sb, "isLowRam", String.valueOf(bool));
                                                                                            }
                                                                                            if (str4 != null) {
                                                                                                shd.m35269a(sb, "manufacturer", shd.m35267a(str4));
                                                                                            }
                                                                                            if (str5 != null) {
                                                                                                shd.m35269a(sb, "model", shd.m35267a(str5));
                                                                                            }
                                                                                            if (bgwm != null) {
                                                                                                shd.m35269a(sb, "moduleVersion", String.valueOf(bgwm));
                                                                                            }
                                                                                            if (i7 != null) {
                                                                                                shd.m35269a(sb, "nlpVersion", String.valueOf(i7));
                                                                                            }
                                                                                            if (valueOf2 != null) {
                                                                                                shd.m35269a(sb, "osLevel", String.valueOf(valueOf2));
                                                                                            }
                                                                                            if (valueOf3 != null) {
                                                                                                shd.m35269a(sb, "packageVersion", String.valueOf(valueOf3));
                                                                                            }
                                                                                            if (str7 != null) {
                                                                                                shd.m35269a(sb, "platform", shd.m35267a(str7));
                                                                                            }
                                                                                            if (str8 != null) {
                                                                                                shd.m35269a(sb, "platformType", shd.m35267a(str8));
                                                                                            }
                                                                                            if (str9 != null) {
                                                                                                shd.m35269a(sb, BuildConfig.FLAVOR_mode, shd.m35267a(str9));
                                                                                            }
                                                                                            ReportApiBatchReply reportApiBatchReply = (ReportApiBatchReply) bjcv.f122526a.mo25536a(a6, 1, sb.toString(), reportApiBatchRequest, ReportApiBatchReply.class);
                                                                                            int size6 = arrayList.size();
                                                                                            Integer num = (Integer) reportApiBatchReply.f44540b.get("historicalLocationsStored");
                                                                                            if (num == null) {
                                                                                                bgur.m100008a("GCoreUlr", 15, "bad response from server");
                                                                                            } else {
                                                                                                int intValue = size6 - num.intValue();
                                                                                                if (intValue > 0) {
                                                                                                    bguv.m100052b("UlrServerLocationsMissing", (long) intValue);
                                                                                                } else if (intValue < 0) {
                                                                                                    bguv.m100052b("UlrServerLocationsExtra", (long) (-intValue));
                                                                                                }
                                                                                            }
                                                                                            ApiSettings settings = reportApiBatchReply.getSettings();
                                                                                            bgux.m100095a(true);
                                                                                            if (settings != null) {
                                                                                                r3 = bguk20;
                                                                                                try {
                                                                                                    bgwb = bgwb.m100151a((Account) r3, settings);
                                                                                                } catch (gid e20) {
                                                                                                    gid4 = e20;
                                                                                                    if (!chcy.m148488d()) {
                                                                                                    }
                                                                                                    throw gid4;
                                                                                                } catch (VolleyError e21) {
                                                                                                    volleyError = e21;
                                                                                                    bguk21 = bguk28;
                                                                                                    bgwx11 = bgwx10;
                                                                                                    bguk23 = r3;
                                                                                                    a3 = bgwm13;
                                                                                                    r9 = qxn11;
                                                                                                    a4 = bgwx11;
                                                                                                    bguk2 = bguk23;
                                                                                                    a5 = bguk21;
                                                                                                    bgwl.m100165a(volleyError);
                                                                                                    if (chcy.m148488d()) {
                                                                                                    }
                                                                                                    throw new IOException(volleyError);
                                                                                                } catch (Throwable th22) {
                                                                                                    th5 = th22;
                                                                                                    bguk22 = bguk28;
                                                                                                    bgwx12 = bgwx10;
                                                                                                    bguk24 = r3;
                                                                                                    bgwm6 = bgwm13;
                                                                                                    qxn6 = qxn11;
                                                                                                    bgwx3 = bgwx12;
                                                                                                    bguk10 = bguk24;
                                                                                                    bguk11 = bguk22;
                                                                                                    throw th5;
                                                                                                }
                                                                                            } else {
                                                                                                r3 = bguk20;
                                                                                                bgwb = null;
                                                                                            }
                                                                                            j7 = j6;
                                                                                        } catch (gid e22) {
                                                                                            e = e22;
                                                                                            gid4 = e;
                                                                                            if (!chcy.m148488d()) {
                                                                                            }
                                                                                            throw gid4;
                                                                                        } catch (VolleyError e23) {
                                                                                            e = e23;
                                                                                            bgwx6 = bgwx10;
                                                                                            bgwm9 = bgwm13;
                                                                                            qxn9 = qxn11;
                                                                                            bguk16 = bguk20;
                                                                                            volleyError = e;
                                                                                            a5 = bguk28;
                                                                                            a3 = bgwm9;
                                                                                            r9 = qxn9;
                                                                                            a4 = bgwx6;
                                                                                            bguk2 = bguk16;
                                                                                            bgwl.m100165a(volleyError);
                                                                                            if (chcy.m148488d()) {
                                                                                            }
                                                                                            throw new IOException(volleyError);
                                                                                        } catch (Throwable th23) {
                                                                                            th = th23;
                                                                                            bgwx8 = bgwx10;
                                                                                            bgwm10 = bgwm13;
                                                                                            qxn10 = qxn11;
                                                                                            bguk18 = bguk20;
                                                                                            th5 = th;
                                                                                            bguk11 = bguk28;
                                                                                            bgwm6 = bgwm10;
                                                                                            qxn6 = qxn10;
                                                                                            bgwx3 = bgwx8;
                                                                                            bguk10 = bguk18;
                                                                                            throw th5;
                                                                                        }
                                                                                        try {
                                                                                            boolean a7 = bgwx.m100190a(bgwb, j7);
                                                                                            if (!a7) {
                                                                                                try {
                                                                                                    if (!bgwx.m100191b(bgwb)) {
                                                                                                        z18 = false;
                                                                                                        if (bgwb != null && !z18) {
                                                                                                            bgwx = bgwx10;
                                                                                                        } else {
                                                                                                            bgwx = bgwx10;
                                                                                                            bgwx.mo63299a((Account) r3, str6);
                                                                                                            bgwx.f117871a.mo63355a((Account) r3, System.currentTimeMillis());
                                                                                                            if (z18) {
                                                                                                                bgwx.mo63301a(bgwb);
                                                                                                            }
                                                                                                        }
                                                                                                        bgwx.mo63300a((Account) r3, true);
                                                                                                        if (a7) {
                                                                                                            bgwb = null;
                                                                                                        }
                                                                                                        if (bgwb != null) {
                                                                                                            str10 = "UlrProfUploadSettings";
                                                                                                        } else {
                                                                                                            str10 = "UlrProfUploadSuccess";
                                                                                                        }
                                                                                                        if (qxn11 != null) {
                                                                                                            try {
                                                                                                                qxn11.mo24369a(bguv.m100050b(str10));
                                                                                                            } catch (IOException e24) {
                                                                                                                iOException2 = e24;
                                                                                                                bguk3 = bguk28;
                                                                                                                bgwm3 = bgwm13;
                                                                                                            } catch (gid e25) {
                                                                                                                gid2 = e25;
                                                                                                                bgwm3 = bgwm13;
                                                                                                                bgwm.m100167a(r3, gid2);
                                                                                                                i6 = 8;
                                                                                                                if (!z14) {
                                                                                                                }
                                                                                                                if (i6 == 4) {
                                                                                                                }
                                                                                                                if (i6 != 1) {
                                                                                                                }
                                                                                                                bguv.m100043a("UlrUploadStatus", i6);
                                                                                                                i10 = i5 + 1;
                                                                                                                bgwm12 = bgwm;
                                                                                                                c = list;
                                                                                                                account4 = account;
                                                                                                                u = i11;
                                                                                                                a = reportingConfig;
                                                                                                                elapsedRealtime = j;
                                                                                                                account6 = z;
                                                                                                                i9 = i;
                                                                                                                z19 = z15;
                                                                                                                currentTimeMillis = j5;
                                                                                                                accountConfig5 = accountConfig4;
                                                                                                            }
                                                                                                        }
                                                                                                        if (bgwb == null) {
                                                                                                            try {
                                                                                                                String valueOf11 = String.valueOf(aeqm.m52397a((Account) r3));
                                                                                                                if (valueOf11.length() == 0) {
                                                                                                                    try {
                                                                                                                        str11 = new String("Batch Location Update succeeded for account ");
                                                                                                                    } catch (RuntimeException e26) {
                                                                                                                        runtimeException = e26;
                                                                                                                        bgwm = bgwm13;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    str11 = "Batch Location Update succeeded for account ".concat(valueOf11);
                                                                                                                }
                                                                                                                bgur.m100011a("GCoreUlr", str11);
                                                                                                                bgwm = bgwm13;
                                                                                                                try {
                                                                                                                    bgwm.f117838f.mo63193a(bguk28);
                                                                                                                    i6 = 1;
                                                                                                                } catch (RuntimeException e27) {
                                                                                                                    e = e27;
                                                                                                                }
                                                                                                            } catch (RuntimeException e28) {
                                                                                                                e = e28;
                                                                                                                bgwm = bgwm13;
                                                                                                                runtimeException = e;
                                                                                                                bguv.m100043a("UlrUploadStatus", 9);
                                                                                                                String valueOf42 = String.valueOf(aeqm.m52397a(z));
                                                                                                                bgur.m100021b("GCoreUlr", valueOf42.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf42), runtimeException);
                                                                                                                z19 = true;
                                                                                                                bgwm12 = bgwm;
                                                                                                                size3 = i2;
                                                                                                                c = list;
                                                                                                                account4 = account;
                                                                                                                a = reportingConfig;
                                                                                                                elapsedRealtime = j;
                                                                                                                i9 = i + 1;
                                                                                                            }
                                                                                                        } else {
                                                                                                            bgwm = bgwm13;
                                                                                                            bgwm.mo63281a(r3, bgwb, j7);
                                                                                                            i6 = 6;
                                                                                                        }
                                                                                                        if (!z14) {
                                                                                                            if (z17) {
                                                                                                                bgwm.f117841i.mo63159a(i6 == 1);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } catch (gid e29) {
                                                                                                    gid3 = e29;
                                                                                                    bguk3 = bguk28;
                                                                                                    bgwx = bgwx10;
                                                                                                    bgwm3 = bgwm13;
                                                                                                    qxn3 = qxn11;
                                                                                                    bgwx.mo63300a((Account) r3, false);
                                                                                                    throw gid3;
                                                                                                } catch (Exception e30) {
                                                                                                } catch (Throwable th24) {
                                                                                                }
                                                                                            }
                                                                                            z18 = true;
                                                                                            if (bgwb != null) {
                                                                                                bgwx = bgwx10;
                                                                                                bgwx.mo63300a((Account) r3, true);
                                                                                                if (a7) {
                                                                                                }
                                                                                                if (bgwb != null) {
                                                                                                }
                                                                                                if (qxn11 != null) {
                                                                                                }
                                                                                                if (bgwb == null) {
                                                                                                }
                                                                                                if (!z14) {
                                                                                                }
                                                                                            }
                                                                                            bgwx = bgwx10;
                                                                                            bgwx.mo63299a((Account) r3, str6);
                                                                                            bgwx.f117871a.mo63355a((Account) r3, System.currentTimeMillis());
                                                                                            if (z18) {
                                                                                            }
                                                                                            bgwx.mo63300a((Account) r3, true);
                                                                                            if (a7) {
                                                                                            }
                                                                                            if (bgwb != null) {
                                                                                            }
                                                                                            if (qxn11 != null) {
                                                                                            }
                                                                                            if (bgwb == null) {
                                                                                            }
                                                                                            if (!z14) {
                                                                                            }
                                                                                        } catch (gid e31) {
                                                                                            e = e31;
                                                                                            bgwx = bgwx10;
                                                                                            bgwm3 = bgwm13;
                                                                                            qxn3 = qxn11;
                                                                                            gid3 = e;
                                                                                            bguk3 = bguk28;
                                                                                            bgwx.mo63300a((Account) r3, false);
                                                                                            throw gid3;
                                                                                        } catch (Exception e32) {
                                                                                        } catch (Throwable th25) {
                                                                                        }
                                                                                    } catch (gid e33) {
                                                                                        e = e33;
                                                                                        gid4 = e;
                                                                                        if (!chcy.m148488d()) {
                                                                                        }
                                                                                        throw gid4;
                                                                                    } catch (VolleyError e34) {
                                                                                        e = e34;
                                                                                        bguk12 = r4;
                                                                                        bgwx4 = bgwx13;
                                                                                        bgwm7 = bgwm13;
                                                                                        qxn7 = qxn11;
                                                                                        bguk13 = bguk2;
                                                                                        volleyError = e;
                                                                                        a3 = bgwm7;
                                                                                        r9 = qxn7;
                                                                                        a4 = bgwx4;
                                                                                        bguk2 = bguk12;
                                                                                        a5 = bguk13;
                                                                                        bgwl.m100165a(volleyError);
                                                                                        if (chcy.m148488d()) {
                                                                                        }
                                                                                        throw new IOException(volleyError);
                                                                                    } catch (Throwable th26) {
                                                                                        th = th26;
                                                                                        bguk14 = r4;
                                                                                        bgwx5 = bgwx13;
                                                                                        bgwm8 = bgwm13;
                                                                                        qxn8 = qxn11;
                                                                                        bguk15 = bguk2;
                                                                                        th5 = th;
                                                                                        bgwm6 = bgwm8;
                                                                                        qxn6 = qxn8;
                                                                                        bgwx3 = bgwx5;
                                                                                        bguk10 = bguk14;
                                                                                        bguk11 = bguk15;
                                                                                        throw th5;
                                                                                    }
                                                                                } catch (gid e35) {
                                                                                    e = e35;
                                                                                    gid4 = e;
                                                                                    if (!chcy.m148488d()) {
                                                                                    }
                                                                                    throw gid4;
                                                                                } catch (VolleyError e36) {
                                                                                    e = e36;
                                                                                    bguk13 = bguk2;
                                                                                    bguk12 = r4;
                                                                                    bgwx4 = bgwx13;
                                                                                    bgwm7 = bgwm13;
                                                                                    qxn7 = qxn11;
                                                                                    volleyError = e;
                                                                                    a3 = bgwm7;
                                                                                    r9 = qxn7;
                                                                                    a4 = bgwx4;
                                                                                    bguk2 = bguk12;
                                                                                    a5 = bguk13;
                                                                                    bgwl.m100165a(volleyError);
                                                                                    if (chcy.m148488d()) {
                                                                                    }
                                                                                    throw new IOException(volleyError);
                                                                                } catch (Throwable th27) {
                                                                                    th = th27;
                                                                                    bgwm8 = a3;
                                                                                    qxn8 = r9;
                                                                                    bgwx5 = a4;
                                                                                    bguk14 = bguk2;
                                                                                    bguk15 = a5;
                                                                                    th5 = th;
                                                                                    bgwm6 = bgwm8;
                                                                                    qxn6 = qxn8;
                                                                                    bgwx3 = bgwx5;
                                                                                    bguk10 = bguk14;
                                                                                    bguk11 = bguk15;
                                                                                    throw th5;
                                                                                }
                                                                            } catch (gid e37) {
                                                                                e = e37;
                                                                                bguk5 = bguk2;
                                                                                bguk4 = r4;
                                                                                bgwx2 = bgwx13;
                                                                                bgwm3 = bgwm13;
                                                                                qxn4 = qxn11;
                                                                                gid3 = e;
                                                                                qxn3 = qxn4;
                                                                                r3 = bguk4;
                                                                                bguk3 = bguk5;
                                                                                bgwx.mo63300a((Account) r3, false);
                                                                                throw gid3;
                                                                            } catch (Exception e38) {
                                                                                e = e38;
                                                                                bguk6 = bguk2;
                                                                                r32 = r4;
                                                                                bgwm4 = bgwm13;
                                                                                qxn5 = qxn11;
                                                                                Exception exc322 = e;
                                                                                str2 = "UlrProfUploadException";
                                                                                throw exc322;
                                                                            } catch (Throwable th28) {
                                                                                th = th28;
                                                                                bguk3 = bguk2;
                                                                                r3 = r4;
                                                                                bgwm3 = bgwm13;
                                                                                qxn3 = qxn11;
                                                                                th4 = th;
                                                                                str2 = null;
                                                                                qxn3.mo24369a(bguv.m100050b(str2));
                                                                                throw th4;
                                                                            }
                                                                        } catch (gid e39) {
                                                                            e = e39;
                                                                            bguk5 = bguk2;
                                                                            bguk4 = r4;
                                                                            bgwx2 = bgwx13;
                                                                            qxn4 = qxn2;
                                                                            bgwm3 = bgwm13;
                                                                            gid3 = e;
                                                                            qxn3 = qxn4;
                                                                            r3 = bguk4;
                                                                            bguk3 = bguk5;
                                                                            bgwx.mo63300a((Account) r3, false);
                                                                            throw gid3;
                                                                        } catch (Exception e40) {
                                                                            e = e40;
                                                                            bguk6 = bguk2;
                                                                            r32 = r4;
                                                                            qxn5 = qxn2;
                                                                            bgwm4 = bgwm13;
                                                                            Exception exc3222 = e;
                                                                            str2 = "UlrProfUploadException";
                                                                            throw exc3222;
                                                                        } catch (Throwable th29) {
                                                                            th = th29;
                                                                            bguk3 = bguk2;
                                                                            r3 = r4;
                                                                            qxn3 = qxn2;
                                                                            bgwm3 = bgwm13;
                                                                            th4 = th;
                                                                            str2 = null;
                                                                            qxn3.mo24369a(bguv.m100050b(str2));
                                                                            throw th4;
                                                                        }
                                                                    } catch (gid e41) {
                                                                        e = e41;
                                                                        bgwm3 = bgwm12;
                                                                        bguk9 = bguk2;
                                                                        bguk8 = r4;
                                                                        bgwx2 = bgwx13;
                                                                        qxn4 = qxn2;
                                                                        bguk4 = bguk8;
                                                                        bguk5 = bguk9;
                                                                        gid3 = e;
                                                                        qxn3 = qxn4;
                                                                        r3 = bguk4;
                                                                        bguk3 = bguk5;
                                                                        bgwx.mo63300a((Account) r3, false);
                                                                        throw gid3;
                                                                    } catch (Exception e42) {
                                                                        e = e42;
                                                                        bgwm4 = bgwm12;
                                                                        bguk6 = bguk2;
                                                                        r32 = r4;
                                                                        qxn5 = qxn2;
                                                                        Exception exc32222 = e;
                                                                        str2 = "UlrProfUploadException";
                                                                        throw exc32222;
                                                                    } catch (Throwable th30) {
                                                                        th = th30;
                                                                        bgwm5 = bgwm12;
                                                                        bguk7 = bguk2;
                                                                        r33 = r4;
                                                                        qxn3 = qxn2;
                                                                        th4 = th;
                                                                        str2 = null;
                                                                        qxn3.mo24369a(bguv.m100050b(str2));
                                                                        throw th4;
                                                                    }
                                                                } catch (gid e43) {
                                                                    e = e43;
                                                                    z17 = z16;
                                                                    bgwm3 = bgwm12;
                                                                    bguk9 = bguk2;
                                                                    bguk8 = r4;
                                                                    bgwx2 = bgwx13;
                                                                    qxn4 = qxn2;
                                                                    bguk4 = bguk8;
                                                                    bguk5 = bguk9;
                                                                    gid3 = e;
                                                                    qxn3 = qxn4;
                                                                    r3 = bguk4;
                                                                    bguk3 = bguk5;
                                                                    bgwx.mo63300a((Account) r3, false);
                                                                    throw gid3;
                                                                } catch (Exception e44) {
                                                                    e = e44;
                                                                    z17 = z16;
                                                                    bgwm4 = bgwm12;
                                                                    bguk6 = bguk2;
                                                                    r32 = r4;
                                                                    qxn5 = qxn2;
                                                                    Exception exc322222 = e;
                                                                    str2 = "UlrProfUploadException";
                                                                    throw exc322222;
                                                                } catch (Throwable th31) {
                                                                    th = th31;
                                                                    z17 = z16;
                                                                    bgwm5 = bgwm12;
                                                                    bguk7 = bguk2;
                                                                    r33 = r4;
                                                                    qxn3 = qxn2;
                                                                    th4 = th;
                                                                    str2 = null;
                                                                    qxn3.mo24369a(bguv.m100050b(str2));
                                                                    throw th4;
                                                                }
                                                            } catch (gid e45) {
                                                                e = e45;
                                                                z17 = z16;
                                                                bgwm3 = bgwm12;
                                                                bguk9 = bguk2;
                                                                bguk8 = r4;
                                                                bgwx2 = bgwx13;
                                                                i5 = i10;
                                                                qxn4 = qxn2;
                                                                bguk4 = bguk8;
                                                                bguk5 = bguk9;
                                                                gid3 = e;
                                                                qxn3 = qxn4;
                                                                r3 = bguk4;
                                                                bguk3 = bguk5;
                                                                bgwx.mo63300a((Account) r3, false);
                                                                throw gid3;
                                                            } catch (Exception e46) {
                                                                e = e46;
                                                                z17 = z16;
                                                                bgwm4 = bgwm12;
                                                                bguk6 = bguk2;
                                                                r32 = r4;
                                                                i5 = i10;
                                                                qxn5 = qxn2;
                                                                Exception exc3222222 = e;
                                                                str2 = "UlrProfUploadException";
                                                                throw exc3222222;
                                                            } catch (Throwable th32) {
                                                                th = th32;
                                                                z17 = z16;
                                                                bgwm5 = bgwm12;
                                                                bguk7 = bguk2;
                                                                r33 = r4;
                                                                i5 = i10;
                                                                qxn3 = qxn2;
                                                                th4 = th;
                                                                str2 = null;
                                                                qxn3.mo24369a(bguv.m100050b(str2));
                                                                throw th4;
                                                            }
                                                        } catch (gid e47) {
                                                            e = e47;
                                                            z17 = z16;
                                                            bgwm3 = bgwm12;
                                                            bguk5 = bguk2;
                                                            bguk4 = r4;
                                                            j5 = currentTimeMillis;
                                                            i5 = i10;
                                                            accountConfig4 = accountConfig5;
                                                            qxn4 = qxn2;
                                                            bgwx2 = bgwx13;
                                                            gid3 = e;
                                                            qxn3 = qxn4;
                                                            r3 = bguk4;
                                                            bguk3 = bguk5;
                                                            bgwx.mo63300a((Account) r3, false);
                                                            throw gid3;
                                                        } catch (Exception e48) {
                                                        } catch (Throwable th33) {
                                                        }
                                                    } catch (IOException e49) {
                                                        e = e49;
                                                        z17 = z16;
                                                        bgwm3 = bgwm12;
                                                        bguk3 = bguk2;
                                                        r3 = r4;
                                                        j5 = currentTimeMillis;
                                                        i5 = i10;
                                                        z15 = z19;
                                                        accountConfig4 = accountConfig5;
                                                        z = account6;
                                                        iOException2 = e;
                                                        bgwm.m100167a(r3, iOException2);
                                                        if (!bgwm.m100168a(iOException2)) {
                                                        }
                                                        if (!z14) {
                                                        }
                                                        if (i6 == 4) {
                                                        }
                                                        if (i6 != 1) {
                                                        }
                                                        bguv.m100043a("UlrUploadStatus", i6);
                                                        i10 = i5 + 1;
                                                        bgwm12 = bgwm;
                                                        c = list;
                                                        account4 = account;
                                                        u = i11;
                                                        a = reportingConfig;
                                                        elapsedRealtime = j;
                                                        account6 = z;
                                                        i9 = i;
                                                        z19 = z15;
                                                        currentTimeMillis = j5;
                                                        accountConfig5 = accountConfig4;
                                                    } catch (gid e50) {
                                                        e = e50;
                                                        z17 = z16;
                                                        bgwm3 = bgwm12;
                                                        r3 = r4;
                                                        j5 = currentTimeMillis;
                                                        i5 = i10;
                                                        z15 = z19;
                                                        accountConfig4 = accountConfig5;
                                                        z = account6;
                                                        gid2 = e;
                                                        bgwm.m100167a(r3, gid2);
                                                        i6 = 8;
                                                        if (!z14) {
                                                        }
                                                        if (i6 == 4) {
                                                        }
                                                        if (i6 != 1) {
                                                        }
                                                        bguv.m100043a("UlrUploadStatus", i6);
                                                        i10 = i5 + 1;
                                                        bgwm12 = bgwm;
                                                        c = list;
                                                        account4 = account;
                                                        u = i11;
                                                        a = reportingConfig;
                                                        elapsedRealtime = j;
                                                        account6 = z;
                                                        i9 = i;
                                                        z19 = z15;
                                                        currentTimeMillis = j5;
                                                        accountConfig5 = accountConfig4;
                                                    }
                                                }
                                                if (i6 == 4) {
                                                    if (i6 != 2) {
                                                        z4 = true;
                                                    }
                                                }
                                                if (i6 != 1) {
                                                    z20 = true;
                                                } else {
                                                    z20 = i6 == 7 || i6 == 10;
                                                }
                                                bguv.m100043a("UlrUploadStatus", i6);
                                                i10 = i5 + 1;
                                                bgwm12 = bgwm;
                                                c = list;
                                                account4 = account;
                                                u = i11;
                                                a = reportingConfig;
                                                elapsedRealtime = j;
                                                account6 = z;
                                                i9 = i;
                                                z19 = z15;
                                                currentTimeMillis = j5;
                                                accountConfig5 = accountConfig4;
                                            } catch (RuntimeException e51) {
                                                e = e51;
                                                bgwm = bgwm12;
                                                z = account6;
                                                runtimeException = e;
                                                bguv.m100043a("UlrUploadStatus", 9);
                                                String valueOf422 = String.valueOf(aeqm.m52397a(z));
                                                bgur.m100021b("GCoreUlr", valueOf422.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf422), runtimeException);
                                                z19 = true;
                                                bgwm12 = bgwm;
                                                size3 = i2;
                                                c = list;
                                                account4 = account;
                                                a = reportingConfig;
                                                elapsedRealtime = j;
                                                i9 = i + 1;
                                            }
                                        }
                                    } catch (RuntimeException e52) {
                                        e = e52;
                                        reportingConfig = a;
                                        j = elapsedRealtime;
                                        i = i9;
                                        z = account6;
                                        bgwm = bgwm12;
                                        runtimeException = e;
                                        bguv.m100043a("UlrUploadStatus", 9);
                                        String valueOf4222 = String.valueOf(aeqm.m52397a(z));
                                        bgur.m100021b("GCoreUlr", valueOf4222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf4222), runtimeException);
                                        z19 = true;
                                        bgwm12 = bgwm;
                                        size3 = i2;
                                        c = list;
                                        account4 = account;
                                        a = reportingConfig;
                                        elapsedRealtime = j;
                                        i9 = i + 1;
                                    }
                                }
                                reportingConfig2 = a;
                                j4 = elapsedRealtime;
                                j2 = currentTimeMillis;
                                list = c;
                                account = account4;
                                i = i9;
                                z2 = z19;
                                accountConfig = accountConfig5;
                                account2 = account6;
                                bgwm2 = bgwm12;
                            } catch (RuntimeException e53) {
                                e = e53;
                                reportingConfig = a;
                                j = elapsedRealtime;
                                list = c;
                                account = account4;
                                i = i9;
                                z = account6;
                                bgwm = bgwm12;
                                runtimeException = e;
                                bguv.m100043a("UlrUploadStatus", 9);
                                String valueOf42222 = String.valueOf(aeqm.m52397a(z));
                                bgur.m100021b("GCoreUlr", valueOf42222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf42222), runtimeException);
                                z19 = true;
                                bgwm12 = bgwm;
                                size3 = i2;
                                c = list;
                                account4 = account;
                                a = reportingConfig;
                                elapsedRealtime = j;
                                i9 = i + 1;
                            }
                        } else {
                            reportingConfig2 = a;
                            j4 = elapsedRealtime;
                            j2 = currentTimeMillis;
                            list = c;
                            account = account4;
                            i2 = size3;
                            i = i9;
                            z2 = z19;
                            accountConfig = accountConfig5;
                            account2 = account6;
                            bgwm2 = bgwm12;
                            z4 = false;
                        }
                        if (!chcp.m148195d() || bgwm.f117839g == null) {
                            z5 = false;
                        } else {
                            int u2 = (int) chcs.m148249u();
                            boolean z26 = false;
                            boolean z27 = true;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= u2) {
                                    break;
                                } else if (!z27) {
                                    break;
                                } else {
                                    if (i16 != 0) {
                                        z6 = false;
                                    } else {
                                        z6 = equals;
                                    }
                                    int t2 = (int) chcs.m148248t();
                                    sdo.m34970a(bgwm.f117839g != null);
                                    bgue bgue = bgwm.f117839g;
                                    AccountConfig accountConfig7 = accountConfig;
                                    Account account8 = accountConfig7.f150890a;
                                    synchronized (bgue.f117553c) {
                                        try {
                                            bguj bguj = new bguj();
                                            if (bgue.f117554d != null) {
                                                try {
                                                    bgue.mo63177a(account8);
                                                    it = bgue.f117554d.iterator();
                                                    z7 = z26;
                                                    i3 = u2;
                                                    long j15 = j2;
                                                    it.seek(bgul.m99987a(account8, j15));
                                                    boolean z28 = false;
                                                    while (true) {
                                                        if (!bgue.m99951a(it, account8)) {
                                                            j3 = j15;
                                                            break;
                                                        }
                                                        j3 = j15;
                                                        if (bguj.f117566a.size() + bguj.f117567b.size() + bguj.f117568c.size() >= t2) {
                                                            break;
                                                        }
                                                        bgvl b7 = bgue.m99952b(bgue.mo63185a(it.value()));
                                                        if (b7 != null) {
                                                            bguj.mo63206a(it.key(), b7);
                                                            if ((b7.f117679a & 1) != 0) {
                                                                z28 = true;
                                                            }
                                                        }
                                                        it.next();
                                                        j15 = j3;
                                                    }
                                                    while (true) {
                                                        if (!bgue.m99951a(it, account8)) {
                                                            break;
                                                        } else if (!z28) {
                                                            bgvl b8 = bgue.m99952b(bgue.mo63185a(it.value()));
                                                            if (b8 != null) {
                                                                if ((b8.f117679a & 1) != 0) {
                                                                    bguj.mo63206a(it.key(), b8);
                                                                    z28 = true;
                                                                }
                                                            }
                                                            it.next();
                                                        }
                                                    }
                                                } catch (Throwable th34) {
                                                    th = th34;
                                                    try {
                                                    } catch (Throwable th35) {
                                                        th = th35;
                                                        th = th;
                                                        throw th;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                z7 = z26;
                                                i3 = u2;
                                            }
                                            try {
                                                if (bguj.f117566a.isEmpty()) {
                                                    String a8 = aeqm.m52397a(accountConfig7.f150890a);
                                                    StringBuilder sb8 = new StringBuilder(String.valueOf(a8).length() + 58);
                                                    sb8.append("Skipping batch upload #");
                                                    sb8.append(i16);
                                                    sb8.append(" with no locations for: ");
                                                    sb8.append(a8);
                                                    sb8.toString();
                                                    if (i16 != 0) {
                                                        z8 = z7;
                                                        accountConfig2 = accountConfig7;
                                                        i4 = 2;
                                                    } else {
                                                        z8 = z7;
                                                        accountConfig2 = accountConfig7;
                                                        i4 = 4;
                                                    }
                                                } else {
                                                    if (i16 == 0) {
                                                        bgwm.mo63282a(bguj);
                                                    }
                                                    if (z6) {
                                                        bgts bgts2 = bgwm.f117841i;
                                                        if (bgts2.mo63160a()) {
                                                            bgtp b9 = bgts2.mo63161b();
                                                            if (b9 != null) {
                                                                long currentTimeMillis3 = System.currentTimeMillis();
                                                                bxvd da = bvva.f157773e.mo74144da();
                                                                String id = TimeZone.getDefault().getID();
                                                                if (id != null) {
                                                                    if (da.f164950c) {
                                                                        da.mo74035c();
                                                                        da.f164950c = false;
                                                                    }
                                                                    bvva bvva = (bvva) da.f164949b;
                                                                    id.getClass();
                                                                    bvva.f157775a |= 2;
                                                                    bvva.f157777c = id;
                                                                }
                                                                int i17 = b9.f117509a;
                                                                if (da.f164950c) {
                                                                    da.mo74035c();
                                                                    da.f164950c = false;
                                                                }
                                                                bvva bvva2 = (bvva) da.f164949b;
                                                                bvva2.f157775a |= 1;
                                                                bvva2.f157776b = i17;
                                                                ByteString a9 = ByteString.m123261a(b9.f117512d);
                                                                if (da.f164950c) {
                                                                    da.mo74035c();
                                                                    da.f164950c = false;
                                                                }
                                                                bvva bvva3 = (bvva) da.f164949b;
                                                                a9.getClass();
                                                                bvva3.f157775a |= 4;
                                                                bvva3.f157778d = a9;
                                                                bxvd da2 = bvwq.f157983r.mo74144da();
                                                                bvva bvva4 = (bvva) da.mo74062i();
                                                                if (da2.f164950c) {
                                                                    da2.mo74035c();
                                                                    da2.f164950c = false;
                                                                }
                                                                bvwq bvwq2 = (bvwq) da2.f164949b;
                                                                bvva4.getClass();
                                                                bvwq2.f157994j = bvva4;
                                                                int i18 = bvwq2.f157985a | 128;
                                                                bvwq2.f157985a = i18;
                                                                bvwq2.f157985a = i18 | 1;
                                                                bvwq2.f157986b = currentTimeMillis3;
                                                                bvwq = (bvwq) da2.mo74062i();
                                                                if (bvwq == null) {
                                                                    bguj.f117568c.add(bvwq);
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                            } else {
                                                                bgts2.mo63162c();
                                                            }
                                                        }
                                                        bvwq = null;
                                                        if (bvwq == null) {
                                                        }
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    bgur.m100011a("GCoreUlr", String.format(Locale.US, "LocationReporter sending %s for account %s request #%d; requests: %s", bguj, aeqm.m52397a(accountConfig7.f150890a), Integer.valueOf(i16), bgwm.f117836d.mo63404c()));
                                                    String valueOf12 = String.valueOf(bguj.f117566a);
                                                    StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf12).length() + 11);
                                                    sb9.append("Locations: ");
                                                    sb9.append(valueOf12);
                                                    sb9.toString();
                                                    String valueOf13 = String.valueOf(bguj.f117567b);
                                                    StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf13).length() + 12);
                                                    sb10.append("Activities: ");
                                                    sb10.append(valueOf13);
                                                    sb10.toString();
                                                    String valueOf14 = String.valueOf(bguj.f117568c);
                                                    StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf14).length() + 10);
                                                    sb11.append("Metadata: ");
                                                    sb11.append(valueOf14);
                                                    sb11.toString();
                                                    String valueOf15 = String.valueOf(bguj.f117569d);
                                                    StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf15).length() + 12);
                                                    sb12.append("SensorData: ");
                                                    sb12.append(valueOf15);
                                                    sb12.toString();
                                                    String valueOf16 = String.valueOf(bguj.f117570e);
                                                    StringBuilder sb13 = new StringBuilder(String.valueOf(valueOf16).length() + 10);
                                                    sb13.append("UserData: ");
                                                    sb13.append(valueOf16);
                                                    sb13.toString();
                                                    Account account9 = accountConfig7.f150890a;
                                                    long j16 = accountConfig7.f150898i;
                                                    try {
                                                        bgwx bgwx15 = bgwm.f117835c;
                                                        int b10 = bgwx15.f117871a.mo63359b(account9);
                                                        String a10 = bgwx15.mo63298a(account9);
                                                        if (chcs.m148239k()) {
                                                            try {
                                                                qxn = bguv.m100039a();
                                                            } catch (IOException e54) {
                                                                iOException = e54;
                                                                z8 = z7;
                                                                accountConfig2 = accountConfig7;
                                                                try {
                                                                    bgwm.m100167a(account9, iOException);
                                                                    if (bgwm.m100168a(iOException)) {
                                                                        bgwm.f117839g.mo63180a(bguj);
                                                                        bguz.m100120a(iOException);
                                                                        i4 = 10;
                                                                    } else {
                                                                        i4 = 7;
                                                                    }
                                                                    if (!z6) {
                                                                    }
                                                                    if (i4 == 4) {
                                                                    }
                                                                    if (i4 != 1) {
                                                                    }
                                                                    bguv.m100043a("UlrUploadStatus", i4);
                                                                    i16++;
                                                                    z27 = z9;
                                                                    u2 = i3;
                                                                    z26 = z8;
                                                                } catch (RuntimeException e55) {
                                                                    e = e55;
                                                                    runtimeException = e;
                                                                    bguv.m100043a("UlrUploadStatus", 9);
                                                                    String valueOf422222 = String.valueOf(aeqm.m52397a(z));
                                                                    bgur.m100021b("GCoreUlr", valueOf422222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf422222), runtimeException);
                                                                    z19 = true;
                                                                    bgwm12 = bgwm;
                                                                    size3 = i2;
                                                                    c = list;
                                                                    account4 = account;
                                                                    a = reportingConfig;
                                                                    elapsedRealtime = j;
                                                                    i9 = i + 1;
                                                                }
                                                            } catch (chuw | gid e56) {
                                                                exc = e56;
                                                                z8 = z7;
                                                                accountConfig2 = accountConfig7;
                                                                try {
                                                                    bgwm.m100167a(account9, exc);
                                                                    i4 = 8;
                                                                    if (!z6) {
                                                                    }
                                                                    if (i4 == 4) {
                                                                    }
                                                                    if (i4 != 1) {
                                                                    }
                                                                    bguv.m100043a("UlrUploadStatus", i4);
                                                                    i16++;
                                                                    z27 = z9;
                                                                    u2 = i3;
                                                                    z26 = z8;
                                                                } catch (RuntimeException e57) {
                                                                    e = e57;
                                                                    runtimeException = e;
                                                                    bguv.m100043a("UlrUploadStatus", 9);
                                                                    String valueOf4222222 = String.valueOf(aeqm.m52397a(z));
                                                                    bgur.m100021b("GCoreUlr", valueOf4222222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf4222222), runtimeException);
                                                                    z19 = true;
                                                                    bgwm12 = bgwm;
                                                                    size3 = i2;
                                                                    c = list;
                                                                    account4 = account;
                                                                    a = reportingConfig;
                                                                    elapsedRealtime = j;
                                                                    i9 = i + 1;
                                                                }
                                                            }
                                                        } else {
                                                            qxn = null;
                                                        }
                                                        try {
                                                            bgwb a11 = bgwx15.f117873c.mo63277a(account9, b10, a10, bguj, j16);
                                                            boolean a12 = bgwx.m100190a(a11, j16);
                                                            if (!a12) {
                                                                try {
                                                                    if (!bgwx.m100191b(a11)) {
                                                                        z13 = false;
                                                                        if (a11 != null && !z13) {
                                                                            z12 = z7;
                                                                            accountConfig3 = accountConfig7;
                                                                        } else {
                                                                            bgwx15.mo63299a(account9, a10);
                                                                            z12 = z7;
                                                                            accountConfig3 = accountConfig7;
                                                                            bgwx15.f117871a.mo63355a(account9, System.currentTimeMillis());
                                                                        }
                                                                        if (z13) {
                                                                            bgwx15.mo63301a(a11);
                                                                        }
                                                                        bgwx15.mo63300a(account9, true);
                                                                        if (a12) {
                                                                            a11 = null;
                                                                        }
                                                                        String str18 = a11 != null ? "UlrProfUploadSettings" : "UlrProfUploadSuccess";
                                                                        if (qxn != null) {
                                                                            try {
                                                                                qxn.mo24369a(bguv.m100050b(str18));
                                                                            } catch (IOException e58) {
                                                                                iOException = e58;
                                                                            } catch (chuw | gid e59) {
                                                                                exc = e59;
                                                                                bgwm.m100167a(account9, exc);
                                                                                i4 = 8;
                                                                                if (!z6) {
                                                                                }
                                                                                if (i4 == 4) {
                                                                                }
                                                                                if (i4 != 1) {
                                                                                }
                                                                                bguv.m100043a("UlrUploadStatus", i4);
                                                                                i16++;
                                                                                z27 = z9;
                                                                                u2 = i3;
                                                                                z26 = z8;
                                                                            }
                                                                        }
                                                                        if (a11 == null) {
                                                                            String valueOf17 = String.valueOf(aeqm.m52397a(account9));
                                                                            bgur.m100011a("GCoreUlr", valueOf17.length() == 0 ? new String("Batch Location Update succeeded for account ") : "Batch Location Update succeeded for account ".concat(valueOf17));
                                                                            bgwm.f117839g.mo63180a(bguj);
                                                                            i4 = 1;
                                                                        } else {
                                                                            bgwm.mo63281a(account9, a11, j16);
                                                                            i4 = 6;
                                                                        }
                                                                        if (!z6) {
                                                                            if (z10) {
                                                                                bgts bgts3 = bgwm.f117841i;
                                                                                if (i4 == 1) {
                                                                                    z11 = true;
                                                                                } else {
                                                                                    z11 = false;
                                                                                }
                                                                                bgts3.mo63159a(z11);
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (gid e60) {
                                                                    gid = e60;
                                                                    z12 = z7;
                                                                    accountConfig3 = accountConfig7;
                                                                    try {
                                                                        bgwx15.mo63300a(account9, false);
                                                                        try {
                                                                            throw gid;
                                                                        } catch (Throwable th36) {
                                                                            str = "UlrProfUploadException";
                                                                            th2 = th36;
                                                                        }
                                                                    } catch (Throwable th37) {
                                                                        th2 = th37;
                                                                        str = null;
                                                                        if (qxn == null || str == null) {
                                                                            break loop1;
                                                                        }
                                                                        try {
                                                                            qxn.mo24369a(bguv.m100050b(str));
                                                                            break loop1;
                                                                        } catch (IOException e61) {
                                                                            e = e61;
                                                                            iOException = e;
                                                                            bgwm.m100167a(account9, iOException);
                                                                            if (bgwm.m100168a(iOException)) {
                                                                            }
                                                                            if (!z6) {
                                                                            }
                                                                            if (i4 == 4) {
                                                                            }
                                                                            if (i4 != 1) {
                                                                            }
                                                                            bguv.m100043a("UlrUploadStatus", i4);
                                                                            i16++;
                                                                            z27 = z9;
                                                                            u2 = i3;
                                                                            z26 = z8;
                                                                        } catch (chuw | gid e62) {
                                                                            e = e62;
                                                                            exc = e;
                                                                            bgwm.m100167a(account9, exc);
                                                                            i4 = 8;
                                                                            if (!z6) {
                                                                            }
                                                                            if (i4 == 4) {
                                                                            }
                                                                            if (i4 != 1) {
                                                                            }
                                                                            bguv.m100043a("UlrUploadStatus", i4);
                                                                            i16++;
                                                                            z27 = z9;
                                                                            u2 = i3;
                                                                            z26 = z8;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (Exception e63) {
                                                                    exc2 = e63;
                                                                    z12 = z7;
                                                                    accountConfig3 = accountConfig7;
                                                                    str = "UlrProfUploadException";
                                                                    try {
                                                                        throw exc2;
                                                                    } catch (Throwable th38) {
                                                                        th2 = th38;
                                                                    }
                                                                } catch (Throwable th39) {
                                                                    th2 = th39;
                                                                    z8 = z7;
                                                                    accountConfig2 = accountConfig7;
                                                                    str = null;
                                                                    qxn.mo24369a(bguv.m100050b(str));
                                                                    throw th2;
                                                                }
                                                            }
                                                            z13 = true;
                                                            if (a11 != null) {
                                                                z12 = z7;
                                                                accountConfig3 = accountConfig7;
                                                                if (z13) {
                                                                }
                                                                bgwx15.mo63300a(account9, true);
                                                                if (a12) {
                                                                }
                                                                if (a11 != null) {
                                                                }
                                                                if (qxn != null) {
                                                                }
                                                                if (a11 == null) {
                                                                }
                                                                if (!z6) {
                                                                }
                                                            }
                                                            bgwx15.mo63299a(account9, a10);
                                                            z12 = z7;
                                                            accountConfig3 = accountConfig7;
                                                            try {
                                                                bgwx15.f117871a.mo63355a(account9, System.currentTimeMillis());
                                                                if (z13) {
                                                                }
                                                                bgwx15.mo63300a(account9, true);
                                                                if (a12) {
                                                                }
                                                                if (a11 != null) {
                                                                }
                                                                if (qxn != null) {
                                                                }
                                                                if (a11 == null) {
                                                                }
                                                                if (!z6) {
                                                                }
                                                            } catch (gid e64) {
                                                                e = e64;
                                                                gid = e;
                                                                bgwx15.mo63300a(account9, false);
                                                                throw gid;
                                                            } catch (Exception e65) {
                                                                e = e65;
                                                                exc2 = e;
                                                                str = "UlrProfUploadException";
                                                                throw exc2;
                                                            }
                                                        } catch (gid e66) {
                                                            e = e66;
                                                            z12 = z7;
                                                            accountConfig3 = accountConfig7;
                                                            gid = e;
                                                            bgwx15.mo63300a(account9, false);
                                                            throw gid;
                                                        } catch (Exception e67) {
                                                            e = e67;
                                                            z12 = z7;
                                                            accountConfig3 = accountConfig7;
                                                            exc2 = e;
                                                            str = "UlrProfUploadException";
                                                            throw exc2;
                                                        } catch (Throwable th40) {
                                                            z8 = z7;
                                                            accountConfig2 = accountConfig7;
                                                            th2 = th40;
                                                            str = null;
                                                            qxn.mo24369a(bguv.m100050b(str));
                                                            throw th2;
                                                        }
                                                    } catch (IOException e68) {
                                                        e = e68;
                                                        z8 = z7;
                                                        accountConfig2 = accountConfig7;
                                                        iOException = e;
                                                        bgwm.m100167a(account9, iOException);
                                                        if (bgwm.m100168a(iOException)) {
                                                        }
                                                        if (!z6) {
                                                        }
                                                        if (i4 == 4) {
                                                        }
                                                        if (i4 != 1) {
                                                        }
                                                        bguv.m100043a("UlrUploadStatus", i4);
                                                        i16++;
                                                        z27 = z9;
                                                        u2 = i3;
                                                        z26 = z8;
                                                    } catch (chuw | gid e69) {
                                                        e = e69;
                                                        z8 = z7;
                                                        accountConfig2 = accountConfig7;
                                                        exc = e;
                                                        bgwm.m100167a(account9, exc);
                                                        i4 = 8;
                                                        if (!z6) {
                                                        }
                                                        if (i4 == 4) {
                                                        }
                                                        if (i4 != 1) {
                                                        }
                                                        bguv.m100043a("UlrUploadStatus", i4);
                                                        i16++;
                                                        z27 = z9;
                                                        u2 = i3;
                                                        z26 = z8;
                                                    } catch (RuntimeException e70) {
                                                        e = e70;
                                                        runtimeException = e;
                                                        bguv.m100043a("UlrUploadStatus", 9);
                                                        String valueOf42222222 = String.valueOf(aeqm.m52397a(z));
                                                        bgur.m100021b("GCoreUlr", valueOf42222222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf42222222), runtimeException);
                                                        z19 = true;
                                                        bgwm12 = bgwm;
                                                        size3 = i2;
                                                        c = list;
                                                        account4 = account;
                                                        a = reportingConfig;
                                                        elapsedRealtime = j;
                                                        i9 = i + 1;
                                                    }
                                                }
                                                if (i4 == 4) {
                                                    if (i4 != 2) {
                                                        z8 = true;
                                                    }
                                                }
                                                if (i4 != 1) {
                                                    z9 = true;
                                                } else {
                                                    z9 = i4 == 7 || i4 == 10;
                                                }
                                            } catch (RuntimeException e71) {
                                                e = e71;
                                                runtimeException = e;
                                                bguv.m100043a("UlrUploadStatus", 9);
                                                String valueOf422222222 = String.valueOf(aeqm.m52397a(z));
                                                bgur.m100021b("GCoreUlr", valueOf422222222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf422222222), runtimeException);
                                                z19 = true;
                                                bgwm12 = bgwm;
                                                size3 = i2;
                                                c = list;
                                                account4 = account;
                                                a = reportingConfig;
                                                elapsedRealtime = j;
                                                i9 = i + 1;
                                            }
                                        } catch (Throwable th41) {
                                            th = th41;
                                            th = th;
                                            throw th;
                                        }
                                        try {
                                            bguv.m100043a("UlrUploadStatus", i4);
                                            i16++;
                                            z27 = z9;
                                            u2 = i3;
                                            z26 = z8;
                                        } catch (RuntimeException e72) {
                                            e = e72;
                                            runtimeException = e;
                                            bguv.m100043a("UlrUploadStatus", 9);
                                            String valueOf4222222222 = String.valueOf(aeqm.m52397a(z));
                                            bgur.m100021b("GCoreUlr", valueOf4222222222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf4222222222), runtimeException);
                                            z19 = true;
                                            bgwm12 = bgwm;
                                            size3 = i2;
                                            c = list;
                                            account4 = account;
                                            a = reportingConfig;
                                            elapsedRealtime = j;
                                            i9 = i + 1;
                                        }
                                    }
                                }
                            }
                            throw th2;
                        }
                        if (!z4) {
                            if (!z5) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    } else {
                        reportingConfig = a;
                        j = elapsedRealtime;
                        list = c;
                        account = account4;
                        i2 = size3;
                        i = i9;
                        z2 = z19;
                        z = account6;
                        bgwm = bgwm12;
                        Account account10 = accountConfig5.f150890a;
                        String valueOf18 = String.valueOf(aeqm.m52397a(account10));
                        bgur.m100011a("GCoreUlr", valueOf18.length() == 0 ? new String("Settings dirty, skipping upload for ") : "Settings dirty, skipping upload for ".concat(valueOf18));
                        ReportingSyncChimeraService.m117310a(account10, "LocationReporter", bgwm.f117833a);
                        bguv.m100043a("UlrUploadStatus", 5);
                        z3 = false;
                    }
                    z19 = z2 | z3;
                } catch (RuntimeException e73) {
                    e = e73;
                    reportingConfig = a;
                    j = elapsedRealtime;
                    list = c;
                    account = account4;
                    i2 = size3;
                    i = i9;
                    z = account6;
                    bgwm = bgwm12;
                    runtimeException = e;
                    bguv.m100043a("UlrUploadStatus", 9);
                    String valueOf42222222222 = String.valueOf(aeqm.m52397a(z));
                    bgur.m100021b("GCoreUlr", valueOf42222222222.length() == 0 ? new String("Batch Location Update failed for account ") : "Batch Location Update failed for account ".concat(valueOf42222222222), runtimeException);
                    z19 = true;
                    bgwm12 = bgwm;
                    size3 = i2;
                    c = list;
                    account4 = account;
                    a = reportingConfig;
                    elapsedRealtime = j;
                    i9 = i + 1;
                }
                bgwm12 = bgwm;
                size3 = i2;
                c = list;
                account4 = account;
                a = reportingConfig;
                elapsedRealtime = j;
                i9 = i + 1;
            }
            bgwm bgwm15 = bgwm12;
            ReportingConfig reportingConfig3 = a;
            long j17 = elapsedRealtime;
            if (z19) {
                bgyg bgyg = bgwm15.f117836d;
                synchronized (bgyg.f118028a) {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        for (bgyt bgyt : bgyg.mo63404c()) {
                            if (bgyt.f118131b <= j17) {
                                arrayList7.add(bgyt);
                            }
                        }
                        if (bgyg.mo63401a(arrayList7)) {
                            bgxx.m100278b(bgyg.f118029b, "LocationReportingPreferences.removeExpiredRequests");
                        }
                    } catch (Throwable th42) {
                        throw th42;
                    }
                }
            }
            if (bguv.m100053c()) {
                bguv.f117607a.mo63233b();
            }
            bguv.m100049a(reportingConfig3.mo70930d());
        }
        bguv.m100042a("UlrUploadTaskDone");
        return;
        qxn3.mo24369a(bguv.m100050b(str2));
        throw th4;
    }
}
