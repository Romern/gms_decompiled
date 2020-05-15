package p000;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: acac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acac extends acpn {

    /* renamed from: a */
    private static final acab f59058a = new acab(2, 0, false, false);

    /* renamed from: b */
    private final Context f59059b;

    /* renamed from: c */
    private final acpl f59060c;

    /* renamed from: d */
    private final abze f59061d;

    /* renamed from: e */
    private final abyx f59062e;

    /* renamed from: f */
    private final abym f59063f;

    /* renamed from: n */
    private final abyh f59064n;

    /* renamed from: o */
    private final acao f59065o;

    /* renamed from: p */
    private final NativeIndex f59066p;

    /* renamed from: q */
    private final abvc f59067q;

    /* renamed from: r */
    private final acak f59068r;

    /* renamed from: s */
    private final String f59069s;

    /* renamed from: t */
    private final long f59070t;

    /* renamed from: u */
    private acaa f59071u;

    /* renamed from: v */
    private final acae f59072v;

    public acac(Context context, acpl acpl, abze abze, abyx abyx, abym abym, abyh abyh, acao acao, NativeIndex nativeIndex, abvc abvc, String str, acak acak, String str2, long j, acae acae, acaa acaa) {
        super(bqbd.CONTENT_FETCH, 2, 3, str, acrz.m49787b(context));
        this.f59059b = context;
        this.f59060c = acpl;
        this.f59061d = abze;
        this.f59062e = abyx;
        this.f59063f = abym;
        this.f59064n = abyh;
        this.f59065o = acao;
        this.f59066p = nativeIndex;
        this.f59067q = abvc;
        this.f59068r = acak;
        this.f59069s = str2;
        this.f59070t = j;
        this.f59072v = acae;
        this.f59071u = acaa;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:53:0x0122 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:56:0x012f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:318:0x0693 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:338:0x06d5 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:460:0x0691 */
    /* JADX INFO: additional move instructions added (4) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v35, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v40, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v47, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: abss} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v51, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v52, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v53, resolved type: acxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v54, resolved type: abss} */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String], assign insn: 0x0006: CONST_STR  (r3v0 ? I:java.lang.String) =  "advance_seqno_error" */
    /* JADX WARN: Type inference failed for: r14v3, assign insn: PHI: (r14v3 ?) = (r14v19 acxg), (r14v42 acxg) binds: [B:330:0x06b4, B:416:0x0840] */
    /* JADX WARN: Type inference failed for: r3v15, assign insn: PHI: (r3v15 ?) = (r3v32 ?), (r3v98 ?) binds: [B:330:0x06b4, B:416:0x0840] */
    /* JADX WARN: Type inference failed for: r14v6, assign insn: PHI: (r14v6 ?) = (r14v19 acxg), (r14v44 acxg) binds: [B:328:0x06b0, B:411:0x0826] */
    /* JADX WARN: Type inference failed for: r3v18, assign insn: PHI: (r3v18 ?) = (r3v32 ?), (r3v100 ?) binds: [B:328:0x06b0, B:411:0x0826] */
    /* JADX WARN: Type inference failed for: r3v23, assign insn: PHI: (r3v23 ?) = (r3v0 ?), (r3v28 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v28 ?), (r3v28 ?), (r3v35 ?), (r3v35 ?) binds: [B:53:0x0122, B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] */
    /* JADX WARN: Type inference failed for: r3v24, assign insn: PHI: (r3v24 ?) = (r3v0 ?), (r3v28 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v28 ?), (r3v28 ?), (r3v35 ?), (r3v35 ?) binds: [B:53:0x0122, B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] */
    /* JADX WARN: Type inference failed for: r14v13, assign insn: PHI: (r14v13 ?) = (r14v1 acxg), (r14v15 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v15 acxg), (r14v15 acxg), (r14v21 acxg), (r14v21 acxg) binds: [B:53:0x0122, B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:321:0x06a3, B:322:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] */
    /* JADX WARN: Type inference failed for: r3v25, assign insn: PHI: (r3v25 ?) = (r3v0 ?), (r3v28 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v28 ?), (r3v28 ?), (r3v35 ?), (r3v35 ?) binds: [B:53:0x0122, B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:321:0x06a3, B:322:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] */
    /* JADX WARN: Type inference failed for: r3v28, assign insn: PHI: (r3v28 ?) = (r3v0 ?), (r3v40 ?) binds: [B:55:0x012d, B:316:0x067e] */
    /* JADX WARN: Type inference failed for: r14v17, assign insn: PHI: (r14v17 ?) = (r14v19 acxg), (r14v19 acxg), (r14v21 acxg), (r14v51 acxg) binds: [B:326:0x06ac, B:325:0x06a9, B:348:0x0713, B:333:0x06c1] */
    /* JADX WARN: Type inference failed for: r3v30, assign insn: PHI: (r3v30 ?) = (r3v32 ?), (r3v32 ?), (r3v35 ?), (r3v107 ?) binds: [B:326:0x06ac, B:325:0x06a9, B:348:0x0713, B:333:0x06c1] */
    /* JADX WARN: Type inference failed for: r14v18, assign insn: PHI: (r14v18 ?) = (r14v19 acxg), (r14v21 acxg) binds: [B:332:?, B:347:0x070a] */
    /* JADX WARN: Type inference failed for: r3v31, assign insn: PHI: (r3v31 ?) = (r3v32 ?), (r3v35 ?) binds: [B:332:?, B:347:0x070a] */
    /* JADX WARN: Type inference failed for: r3v32, types: [acxg], assign insn: 0x0691: MOVE  (r3v32 ? I:?[OBJECT, ARRAY]) = (r42v3 acxg) */
    /* JADX WARN: Type inference failed for: r3v35, types: [acxg], assign insn: PHI: (r3v35 ?) = (r3v34 acxg), (r3v36 ?) binds: [B:88:0x01bd, B:336:0x06c9] */
    /* JADX WARN: Type inference failed for: r3v36, assign insn: 0x06cc: MOVE  (r3v36 ? I:?[OBJECT, ARRAY]) = (r14v15 acxg) */
    /* JADX WARN: Type inference failed for: r3v40, assign insn: 0x0682: MOVE  (r3v40 ? I:?[OBJECT, ARRAY]) = (r35v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r3v75, assign insn: 0x02c2: MOVE  (r3v75 ? I:?[OBJECT, ARRAY]) = (r42v4 acxg) */
    /* JADX WARN: Type inference failed for: r3v77, assign insn: 0x0299: MOVE  (r3v77 ? I:?[OBJECT, ARRAY]) = (r42v4 acxg) */
    /* JADX WARN: Type inference failed for: r3v88, assign insn: 0x0289: MOVE  (r3v88 ? I:?[OBJECT, ARRAY]) = (r42v4 acxg) */
    /* JADX WARN: Type inference failed for: r3v90, assign insn: 0x01a8: MOVE  (r3v90 ? I:?[OBJECT, ARRAY]) = (r14v15 acxg) */
    /* JADX WARN: Type inference failed for: r3v98, assign insn: ?: MOVE  (r3v98 ?) = (r3v16 acxg) */
    /* JADX WARN: Type inference failed for: r3v100, assign insn: ?: MOVE  (r3v100 ?) = (r3v19 acxg) */
    /* JADX WARN: Type inference failed for: r3v107, assign insn: ?: MOVE  (r3v107 ?) = (r3v31 ?) */
    /* JADX WARN: Type inference failed for: r3v108, assign insn: ?: MOVE  (r3v108 ?) = (r3v41 acxg) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long
     arg types: [int, int]
     candidates:
      com.google.android.gms.icing.nativeindex.NativeIndex.a(java.lang.String[], abud):abuh
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, long):bqaw
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: absg.b(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, int]
     candidates:
      absg.b(java.lang.String, java.lang.Object[]):void
      absg.b(java.lang.String, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0691, code lost:
        r3 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r3.f61008a = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06a1, code lost:
        if (r1.f59066p.mo43399a(r39.f58137b, r6) != p000.bqaw.OK) goto L_0x06b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06a7, code lost:
        if (r3.f61008a <= r24) goto L_0x06ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06a9, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06ac, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06af, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06b0, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06b3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06b4, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        p000.absg.m48191b(r36);
        r1.f59063f.mo32447a(r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x075f, code lost:
        r0 = e;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0761, code lost:
        r0 = e;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0764, code lost:
        r0 = e;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x076d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x076e, code lost:
        r24 = r12;
        r3 = r14;
        r14 = r5;
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0773, code lost:
        p000.absg.m48189a(r0, "Out of memory while indexing content provider.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        r0 = r1.f59063f;
        r4 = r14.f58157b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x077c, code lost:
        if (r4 == null) goto L_0x077f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x077f, code lost:
        r4 = p000.absr.f58134s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0781, code lost:
        r4 = r4.f58140e;
        r5 = r14.f58157b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0785, code lost:
        if (r5 == null) goto L_0x0788;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0788, code lost:
        r5 = p000.absr.f58134s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x078a, code lost:
        r5 = p000.acww.m49914a(r5);
        r6 = p000.cema.f182934a.mo6606a().mo79305g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x079c, code lost:
        if (r0.mo32452a(r6) != false) goto L_0x079e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x079e, code lost:
        r8 = p000.bpwu.f139575d.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07a4, code lost:
        if (r4 != null) goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07a8, code lost:
        if (r8.f164950c == false) goto L_0x07aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07ab, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07b1, code lost:
        r9 = (p000.bpwu) r8.f164949b;
        r4.getClass();
        r9.f139577a |= 1;
        r9.f139578b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07c0, code lost:
        if (r5 == null) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07c5, code lost:
        if (r8.f164950c == false) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07c8, code lost:
        r8.mo74035c();
        r8.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07ce, code lost:
        r4 = (p000.bpwu) r8.f164949b;
        r5.getClass();
        r4.f139577a |= 2;
        r4.f139579c = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07dd, code lost:
        r4 = p000.bpxb.f139606R.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07e5, code lost:
        if (r4.f164950c == false) goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07e8, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07ee, code lost:
        r5 = (p000.bpxb) r4.f164949b;
        r8 = (p000.bpwu) r8.mo74062i();
        r8.getClass();
        r5.f139648x = r8;
        r5.f139625a |= 67108864;
        r0.mo32438a(6006, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0809, code lost:
        r7 = 0;
        r27 = 2;
        r31 = false;
        r14 = r14;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0811, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0812, code lost:
        p000.absg.m48189a(r0, "Out of memory while logging.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x081e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x081f, code lost:
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0838, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0839, code lost:
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0853, code lost:
        r1.f59063f.mo32447a("cursor_died_exception");
        r13.mo33187a("cursor-died");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x085f, code lost:
        if (r7 == 0) goto L_0x0861;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0861, code lost:
        p000.absg.m48192b("Indexing content provider failed; will retry %d times", (java.lang.Object) 3);
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x086d, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x086f, code lost:
        if (r7 == 0) goto L_0x0872;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0872, code lost:
        r1.f59063f.mo32447a("cursor_retries_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0879, code lost:
        p000.absg.m48192b("Indexing content provider failed again; %d retries remaining", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0886, code lost:
        if ((r0 instanceof java.lang.SecurityException) != false) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0888, code lost:
        r1.f59063f.mo32447a("cursor_security_exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0890, code lost:
        r1.f59063f.mo32447a("cursor_other_exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0897, code lost:
        r13.mo33187a("cursor-exception");
        r7 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0756 A[Catch:{ acai -> 0x0764, acah -> 0x0761, OutOfMemoryError -> 0x075f }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x075f A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), PHI: r3 r13 r14 r24 10  PHI: (r3v25 ?) = (r3v0 ?), (r3v28 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v32 ?), (r3v28 ?), (r3v28 ?), (r3v35 ?), (r3v35 ?) binds: [B:53:0x0122, B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:321:0x06a3, B:322:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r13v11 acxd) = (r13v24 acxd), (r13v17 acxd), (r13v17 acxd), (r13v17 acxd), (r13v17 acxd), (r13v17 acxd), (r13v17 acxd), (r13v24 acxd), (r13v24 acxd), (r13v22 acxd), (r13v22 acxd) binds: [B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:321:0x06a3, B:322:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r14v13 ?) = (r14v1 acxg), (r14v15 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v19 acxg), (r14v15 acxg), (r14v15 acxg), (r14v21 acxg), (r14v21 acxg) binds: [B:53:0x0122, B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:321:0x06a3, B:322:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r24v11 long) = (r24v19 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v17 long), (r24v19 long), (r24v19 long), (r24v19 long), (r24v19 long) binds: [B:56:0x012f, B:318:0x0693, B:319:?, B:331:0x06b7, B:332:?, B:321:0x06a3, B:322:?, B:65:0x0152, B:68:0x015a, B:338:0x06d5, B:344:0x06fc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:318:0x0693] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x076d A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:44:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x077e A[Catch:{ OutOfMemoryError -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x077f A[Catch:{ OutOfMemoryError -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0787 A[Catch:{ OutOfMemoryError -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0788 A[Catch:{ OutOfMemoryError -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x079e A[Catch:{ OutOfMemoryError -> 0x0811 }] */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0853  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0884  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x08ab  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x08af  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x08df  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0915  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0983  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0986  */
    /* renamed from: a */
    public final acab mo32576a(abss abss, abzz abzz, long j) {
        boolean z;
        boolean z2;
        int i;
        long j2;
        abss abss2;
        acxd acxd;
        int i2;
        acxg acxg;
        boolean z3;
        absy absy;
        bxvd bxvd;
        String str;
        int i3;
        abss abss3;
        acxg acxg2;
        String str2;
        String str3;
        absr absr;
        String str4;
        absr absr2;
        int i4;
        acxg acxg3;
        absr absr3;
        String str5;
        long c;
        long min;
        Object obj;
        Object obj2;
        absr absr4;
        int i5;
        acxd acxd2;
        abss abss4;
        String str6;
        acxg acxg4;
        abss abss5;
        abss abss6;
        absr absr5;
        int i6;
        String str7;
        Iterator it;
        String str8;
        Integer num;
        Integer num2;
        absr absr6;
        acxd acxd3;
        boolean z4;
        boolean z5;
        abss abss7 = abss;
        abzz abzz2 = abzz;
        acxg acxg5 = "advance_seqno_error";
        String str9 = "Error advancing the last sequence number";
        absy absy2 = abss7.f58158c;
        if (absy2 == null) {
            absy2 = absy.f58176h;
        }
        bxvd bxvd2 = (bxvd) absy2.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) absy2);
        abvc abvc = this.f59067q;
        NativeIndex nativeIndex = this.f59066p;
        absr absr7 = abss7.f58157b;
        if (absr7 == null) {
            absr7 = absr.f58134s;
        }
        boolean z6 = absr7.f58142g;
        int a = abvc.mo32350a(nativeIndex.mo43412g());
        if (!z6) {
            if (bpzk.m112432a(a) <= 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                absg.m48197c("Cannot sync untrimmable corpus: %s", abvc.m48307a(a));
            }
        } else {
            if (a == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z) {
                absg.m48197c("Cannot sync trimmable corpus: %s", abvc.m48307a(a));
            }
        }
        if (!z) {
            if (!((absy) bxvd2.f164949b).f58181d) {
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                absy absy3 = (absy) bxvd2.f164949b;
                absy3.f58178a |= 8;
                absy3.f58181d = true;
                this.f59061d.mo32517a().mo32542c(this.f59068r, (absy) bxvd2.mo74062i());
            }
            return f59058a;
        }
        if (((absy) bxvd2.f164949b).f58181d) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            absy absy4 = (absy) bxvd2.f164949b;
            absy4.f58178a |= 8;
            absy4.f58181d = false;
            this.f59061d.mo32517a().mo32542c(this.f59068r, (absy) bxvd2.mo74062i());
        }
        bxvd bxvd3 = (bxvd) abss7.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) abss7);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        abss abss8 = (abss) bxvd3.f164949b;
        absy absy5 = (absy) bxvd2.mo74062i();
        absy5.getClass();
        abss8.f58158c = absy5;
        abss8.f58156a |= 2;
        abss abss9 = (abss) bxvd3.mo74062i();
        int i7 = ((absy) bxvd2.f164949b).f58182e;
        NativeIndex nativeIndex2 = this.f59066p;
        absr absr8 = abss9.f58157b;
        if (absr8 == null) {
            absr8 = absr.f58134s;
        }
        long a2 = nativeIndex2.mo43391a(absr8.f58137b, false);
        if (a2 < 0) {
            a2 = 0;
        }
        acxd acxd4 = new acxd();
        acxg acxg6 = new acxg(a2);
        try {
            absr absr9 = abss9.f58157b;
            absr absr10 = absr9 != null ? absr9 : absr.f58134s;
            i3 = i7;
            long j3 = acxg6.f61008a;
            try {
                abzz2.mo32573a(j3);
                Map b = abzm.m48654b(absr10);
                long uptimeMillis = SystemClock.uptimeMillis();
                int i8 = 0;
                while (true) {
                    try {
                        if (!abzz2.f59046a.mo32567b()) {
                            if (!abzz2.f59047b.mo32567b()) {
                                absr3 = absr10;
                                str5 = acxg5;
                                str2 = str9;
                                j2 = a2;
                                acxg3 = acxg6;
                                acxg6 = abss9;
                                acxd = acxd4;
                                break;
                            }
                        }
                        acxd acxd5 = acxd4;
                        try {
                            c = abzz2.f59046a.mo32569c();
                            j2 = a2;
                            try {
                                min = Math.min(c, abzz2.f59047b.mo32569c());
                                if (min == j3) {
                                    int i9 = i8 + 1;
                                    obj2 = "tags";
                                    obj = "docs";
                                    Object[] objArr = new Object[4];
                                    objArr[0] = c != min ? obj2 : obj;
                                    absr4 = absr10;
                                    str5 = acxg5;
                                    try {
                                        objArr[1] = absr4.f58140e;
                                        objArr[2] = Long.valueOf(min);
                                        objArr[3] = Long.valueOf(j3);
                                        absg.m48194b("Dup seqno for %s pkg %s %d last %d", objArr);
                                        i5 = i9;
                                    } catch (Throwable th) {
                                        th = th;
                                        str2 = str9;
                                        absr = absr4;
                                        acxg5 = acxg6;
                                        str3 = str5;
                                        acxg5.f61008a = j3;
                                        if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    str5 = acxg5;
                                    obj2 = "tags";
                                    obj = "docs";
                                    absr4 = absr10;
                                    i5 = 0;
                                }
                                if (min >= j3) {
                                    if (i5 > 10) {
                                        str2 = str9;
                                        absr = absr4;
                                        acxg5 = acxg6;
                                        acxd2 = acxd5;
                                        abss4 = abss9;
                                        str6 = str5;
                                        break;
                                    }
                                    i8 = i5;
                                    str2 = str9;
                                    acxg3 = acxg6;
                                    Map map = b;
                                    abss abss10 = abss9;
                                    if (c != min) {
                                        if (min > j3) {
                                            try {
                                                abzy abzy = abzz2.f59047b;
                                                int i10 = absr4.f58137b;
                                                String a3 = abzy.mo32565a("action");
                                                String a4 = abzy.mo32565a("uri");
                                                absr3 = absr4;
                                                try {
                                                    String a5 = abzy.mo32565a("tag");
                                                    String d = absd.m48181d("Uri", a4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                                    if (d == null) {
                                                        String d2 = absd.m48181d("Tag", a5, 1000);
                                                        if (d2 == null) {
                                                            if (TextUtils.equals(a3, "add")) {
                                                                acxd3 = acxd5;
                                                                z4 = true;
                                                            } else if (!TextUtils.equals(a3, "del")) {
                                                                acxd3 = acxd5;
                                                                try {
                                                                    acxd3.mo33187a("bad action");
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    str3 = str5;
                                                                    absr = absr3;
                                                                    acxg5 = acxg3;
                                                                    acxg5.f61008a = j3;
                                                                    if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                acxd3 = acxd5;
                                                                z4 = false;
                                                            }
                                                            String valueOf = String.valueOf(NativeIndex.m66680a(NativeIndex.m66679a(NativeIndex.nativeTagDocument(this.f59066p.f79071b, min, i10, NativeIndex.m66681a(a4), NativeIndex.m66681a(a5), 65534, z4))));
                                                            acxd3.mo33187a(valueOf.length() == 0 ? new String("tag ") : "tag ".concat(valueOf));
                                                        } else {
                                                            acxd3 = acxd5;
                                                            absg.m48192b("Invalid tag string: %s", d2);
                                                            acxd3.mo33187a("bad tag");
                                                        }
                                                    } else {
                                                        acxd3 = acxd5;
                                                        absg.m48192b("Invalid tag uri: %s", d);
                                                        acxd3.mo33187a("bad uri");
                                                    }
                                                    j3 = min;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    acxg4 = acxg3;
                                                    str3 = str5;
                                                    absr = absr3;
                                                    acxg5 = acxg4;
                                                    acxg5.f61008a = j3;
                                                    if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                acxg5 = acxg3;
                                                absr = absr4;
                                                str3 = str5;
                                                acxg5.f61008a = j3;
                                                if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            absr3 = absr4;
                                            acxd3 = acxd5;
                                        }
                                        try {
                                            if (!abzz2.f59047b.mo32570d()) {
                                                abzz2.mo32573a(min);
                                            }
                                            acxd = acxd3;
                                            acxg6 = abss10;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            str3 = str5;
                                            absr = absr3;
                                            acxg5 = acxg3;
                                            acxg5.f61008a = j3;
                                            if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        absr3 = absr4;
                                        acxd = acxd5;
                                        if (min > j3) {
                                            try {
                                                abzy abzy2 = abzz2.f59046a;
                                                String a6 = abzy2.mo32565a("action");
                                                String a7 = abzy2.mo32565a("uri");
                                                if (absd.m48181d("Uri", a7, PSKKeyManager.MAX_KEY_LENGTH_BYTES) != null) {
                                                    abss6 = abss10;
                                                    acxd.mo33187a("bad uri");
                                                } else if (TextUtils.equals(a6, "add")) {
                                                    byte[] b2 = abzy2.mo32568b("section_thing_proto");
                                                    String str10 = "index ";
                                                    if (b2 != null) {
                                                        NativeIndex nativeIndex3 = this.f59066p;
                                                        aclb a8 = acal.m48769a(abss10);
                                                        abss abss11 = abss10;
                                                        try {
                                                            absr absr11 = abss11.f58157b;
                                                            if (absr11 != null) {
                                                                absr6 = absr11;
                                                            } else {
                                                                absr6 = absr.f58134s;
                                                            }
                                                            bpxk a9 = nativeIndex3.mo43398a(min, b2, a8, absr6, abzu.m48730a());
                                                            absr absr12 = abss11.f58157b;
                                                            if (absr12 == null) {
                                                                absr12 = absr.f58134s;
                                                            }
                                                            bqaw a10 = mo32577a(absr12, a9);
                                                            String valueOf2 = String.valueOf(NativeIndex.m66680a(a10));
                                                            acxd.mo33187a(valueOf2.length() == 0 ? new String(str10) : str10.concat(valueOf2));
                                                            String valueOf3 = String.valueOf(NativeIndex.m66680a(a10));
                                                            acxd.mo33187a(valueOf3.length() == 0 ? new String("index-thing ") : "index-thing ".concat(valueOf3));
                                                            abss6 = abss11;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            acxg4 = acxg3;
                                                            str3 = str5;
                                                            absr = absr3;
                                                            acxg5 = acxg4;
                                                            acxg5.f61008a = j3;
                                                            if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        abss abss12 = abss10;
                                                        absr absr13 = abss12.f58157b;
                                                        if (absr13 == null) {
                                                            absr13 = absr.f58134s;
                                                        }
                                                        int i11 = absr13.f58137b;
                                                        bxvd da = abqe.f57949g.mo74144da();
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        abqe abqe = (abqe) da.f164949b;
                                                        a7.getClass();
                                                        abqe.f57951a |= 2;
                                                        abqe.f57953c = a7;
                                                        if (abzy2.f59040a == null || (num2 = (Integer) abzy2.f59041b.get("doc_score")) == null) {
                                                            i6 = 0;
                                                        } else {
                                                            i6 = abzy2.f59040a.f59105b.getInt(num2.intValue());
                                                        }
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        abqe abqe2 = (abqe) da.f164949b;
                                                        int i12 = abqe2.f57951a | 4;
                                                        abqe2.f57951a = i12;
                                                        abqe2.f57954d = i6;
                                                        abqe2.f57951a = i12 | 1;
                                                        abqe2.f57952b = i11;
                                                        long a11 = (abzy2.f59040a == null || (num = (Integer) abzy2.f59041b.get("created_timestamp")) == null) ? 0 : abzy2.f59040a.mo32581a(num.intValue());
                                                        if (da.f164950c) {
                                                            da.mo74035c();
                                                            da.f164950c = false;
                                                        }
                                                        abqe abqe3 = (abqe) da.f164949b;
                                                        abqe3.f57951a |= 8;
                                                        abqe3.f57956f = a11;
                                                        Iterator it2 = map.entrySet().iterator();
                                                        while (it2.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it2.next();
                                                            String valueOf4 = String.valueOf((String) entry.getKey());
                                                            String str11 = valueOf4.length() == 0 ? new String("section_") : "section_".concat(valueOf4);
                                                            abzi abzi = (abzi) entry.getValue();
                                                            if (abzy2.f59040a != null) {
                                                                Integer num3 = (Integer) abzy2.f59041b.get(str11);
                                                                if (num3 != null) {
                                                                    if (abzy2.f59040a.f59105b.getType(num3.intValue()) == 4) {
                                                                        abqo abqo = abzi.f58807b;
                                                                        if (!abqo.f57979c) {
                                                                            bxvd da2 = abqd.f57943e.mo74144da();
                                                                            int i13 = abzi.f58806a;
                                                                            Iterator it3 = it2;
                                                                            if (!da2.f164950c) {
                                                                                str8 = str10;
                                                                            } else {
                                                                                da2.mo74035c();
                                                                                str8 = str10;
                                                                                da2.f164950c = false;
                                                                            }
                                                                            abqd abqd = (abqd) da2.f164949b;
                                                                            int i14 = abqd.f57945a | 1;
                                                                            abqd.f57945a = i14;
                                                                            abqd.f57946b = i13;
                                                                            abqo abqo2 = abzi.f58807b;
                                                                            abqo2.getClass();
                                                                            abqd.f57948d = abqo2;
                                                                            abqd.f57945a = i14 | 32;
                                                                            ByteString a12 = ByteString.m123261a(abzy2.mo32568b(str11));
                                                                            if (da2.f164950c) {
                                                                                da2.mo74035c();
                                                                                da2.f164950c = false;
                                                                            }
                                                                            abqd abqd2 = (abqd) da2.f164949b;
                                                                            a12.getClass();
                                                                            abqd2.f57945a |= 4;
                                                                            abqd2.f57947c = a12;
                                                                            da.mo73979a((abqd) da2.mo74062i());
                                                                            it2 = it3;
                                                                            str10 = str8;
                                                                        } else {
                                                                            String str12 = abqo.f57978b;
                                                                            StringBuilder sb = new StringBuilder(String.valueOf(str12).length() + 31);
                                                                            sb.append("Blob section ");
                                                                            sb.append(str12);
                                                                            sb.append(" cannot be indexed");
                                                                            throw new acai(new IllegalStateException(sb.toString()));
                                                                        }
                                                                    } else {
                                                                        it = it2;
                                                                        str7 = str10;
                                                                    }
                                                                } else {
                                                                    it = it2;
                                                                    str7 = str10;
                                                                }
                                                            } else {
                                                                it = it2;
                                                                str7 = str10;
                                                            }
                                                            String a13 = abzy2.mo32565a(str11);
                                                            if (!TextUtils.isEmpty(a13)) {
                                                                bxvd da3 = abqd.f57943e.mo74144da();
                                                                int i15 = abzi.f58806a;
                                                                if (da3.f164950c) {
                                                                    da3.mo74035c();
                                                                    da3.f164950c = false;
                                                                }
                                                                abqd abqd3 = (abqd) da3.f164949b;
                                                                int i16 = abqd3.f57945a | 1;
                                                                abqd3.f57945a = i16;
                                                                abqd3.f57946b = i15;
                                                                abqo abqo3 = abzi.f58807b;
                                                                abqo3.getClass();
                                                                abqd3.f57948d = abqo3;
                                                                abqd3.f57945a = i16 | 32;
                                                                ByteString a14 = ByteString.m123258a(a13);
                                                                if (da3.f164950c) {
                                                                    da3.mo74035c();
                                                                    da3.f164950c = false;
                                                                }
                                                                abqd abqd4 = (abqd) da3.f164949b;
                                                                a14.getClass();
                                                                abqd4.f57945a |= 4;
                                                                abqd4.f57947c = a14;
                                                                da.mo73979a((abqd) da3.mo74062i());
                                                                it2 = it;
                                                                str10 = str7;
                                                            } else {
                                                                it2 = it;
                                                                str10 = str7;
                                                            }
                                                        }
                                                        bpxk a15 = this.f59066p.mo43397a(min, (abqe) da.mo74062i(), abzu.m48730a());
                                                        absr absr14 = abss12.f58157b;
                                                        if (absr14 == null) {
                                                            absr14 = absr.f58134s;
                                                        }
                                                        String valueOf5 = String.valueOf(NativeIndex.m66680a(mo32577a(absr14, a15)));
                                                        acxd.mo33187a(valueOf5.length() == 0 ? new String(str10) : str10.concat(valueOf5));
                                                        abss6 = abss12;
                                                    }
                                                } else {
                                                    abss abss13 = abss10;
                                                    if (TextUtils.equals(a6, "del")) {
                                                        NativeIndex nativeIndex4 = this.f59066p;
                                                        absr absr15 = abss13.f58157b;
                                                        if (absr15 == null) {
                                                            absr15 = absr.f58134s;
                                                        }
                                                        bqaw a16 = nativeIndex4.mo43400a(min, absr15.f58137b, a7);
                                                        String valueOf6 = String.valueOf(NativeIndex.m66680a(a16));
                                                        acxd.mo33187a(valueOf6.length() == 0 ? new String("delete ") : "delete ".concat(valueOf6));
                                                        if (bqaw.OK.equals(a16)) {
                                                            abyh abyh = this.f59064n;
                                                            absr absr16 = abss13.f58157b;
                                                            if (absr16 == null) {
                                                                absr16 = absr.f58134s;
                                                            }
                                                            String str13 = absr16.f58140e;
                                                            absr absr17 = abss13.f58157b;
                                                            if (absr17 == null) {
                                                                absr17 = absr.f58134s;
                                                            }
                                                            abyh.mo32431a(str13, absr17.f58138c, a7);
                                                        }
                                                        abss6 = abss13;
                                                    } else if (!acaw.m48791h() || !TextUtils.equals(a6, "mod")) {
                                                        acxd.mo33187a("bad action");
                                                        abss6 = abss13;
                                                    } else {
                                                        byte[] b3 = abzy2.mo32568b("section_thing_proto");
                                                        if (b3 != null) {
                                                            NativeIndex nativeIndex5 = this.f59066p;
                                                            aclb a17 = acal.m48769a(abss13);
                                                            absr absr18 = abss13.f58157b;
                                                            if (absr18 != null) {
                                                                absr5 = absr18;
                                                            } else {
                                                                absr5 = absr.f58134s;
                                                            }
                                                            bpxk b4 = nativeIndex5.mo43405b(min, b3, a17, absr5, abzu.m48730a());
                                                            absr absr19 = abss13.f58157b;
                                                            if (absr19 == null) {
                                                                absr19 = absr.f58134s;
                                                            }
                                                            String valueOf7 = String.valueOf(NativeIndex.m66680a(mo32577a(absr19, b4)));
                                                            acxd.mo33187a(valueOf7.length() == 0 ? new String("modify ") : "modify ".concat(valueOf7));
                                                            abss6 = abss13;
                                                        } else {
                                                            acxd.mo33187a("bad section_thing_proto");
                                                            abss6 = abss13;
                                                        }
                                                    }
                                                }
                                                j3 = min;
                                                abss5 = abss6;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                acxg4 = acxg3;
                                                str3 = str5;
                                                absr = absr3;
                                                acxg5 = acxg4;
                                                acxg5.f61008a = j3;
                                                if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            abss5 = abss10;
                                        }
                                        try {
                                            acxg6 = abss5;
                                            if (!abzz2.f59046a.mo32570d()) {
                                                abzz2.mo32573a(min);
                                                acxg6 = abss5;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            acxg4 = acxg3;
                                            str3 = str5;
                                            absr = absr3;
                                            acxg5 = acxg4;
                                            acxg5.f61008a = j3;
                                            if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                            }
                                            throw th;
                                        }
                                    }
                                    if (SystemClock.uptimeMillis() - uptimeMillis >= 5000) {
                                        break;
                                    }
                                    acxd4 = acxd;
                                    abss9 = acxg6;
                                    a2 = j2;
                                    acxg5 = str5;
                                    str9 = str2;
                                    b = map;
                                    acxg6 = acxg3;
                                    absr10 = absr3;
                                } else {
                                    str2 = str9;
                                    absr = absr4;
                                    acxg5 = acxg6;
                                    acxd2 = acxd5;
                                    abss4 = abss9;
                                    str6 = str5;
                                    break;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                str4 = str9;
                                absr2 = absr10;
                                str3 = acxg5;
                                acxg5 = acxg6;
                                acxg5.f61008a = j3;
                                if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            str4 = str9;
                            absr2 = absr10;
                            str3 = acxg5;
                            acxg5 = acxg6;
                            acxg5.f61008a = j3;
                            if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                                absg.m48191b(str2);
                                this.f59063f.mo32447a(str3);
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        str4 = str9;
                        absr2 = absr10;
                        str3 = acxg5;
                        acxg5 = acxg6;
                        acxg5.f61008a = j3;
                        if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                        }
                        throw th;
                    }
                }
                try {
                    Object[] objArr2 = new Object[4];
                    if (c == min) {
                        obj2 = obj;
                    }
                    objArr2[0] = obj2;
                    objArr2[1] = absr.f58140e;
                    objArr2[2] = Long.valueOf(min);
                    objArr2[3] = Long.valueOf(j3);
                    absg.m48199c("Out of order seqno for %s pkg %s %d last %d", objArr2);
                    acxd.mo33187a("out of order seqno");
                    acxg5.f61008a = j3;
                    if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                        absg.m48191b(str2);
                        this.f59063f.mo32447a(str3);
                        i4 = 2;
                        acxg6 = acxg6;
                        acxg5 = acxg5;
                        i = i4;
                        i2 = 0;
                        z2 = false;
                        abss2 = acxg6;
                        acxg = acxg5;
                        long j4 = acxg.f61008a;
                        z3 = j4 <= j2;
                        if (!z3) {
                            absg.m48194b("Indexed %s from %d to %d", this.f59068r.mo32584b(), Long.valueOf(j2), Long.valueOf(j4));
                        } else {
                            absg.m48185a("Query from %s found nothing", this.f59068r.mo32584b());
                        }
                        absy = abss2.f58158c;
                        if (absy == null) {
                            absy = absy.f58176h;
                        }
                        bxvd = (bxvd) absy.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) absy);
                        List a18 = acxd.mo33186a(Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b));
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((absy) bxvd.f164949b).f58179b = GeneratedMessageLite.m124030de();
                        bxvd.mo73950M(a18);
                        str = abzz2.f59048c;
                        if (str != null || str.equals(((absy) bxvd.f164949b).f58184g)) {
                            this.f59061d.mo32517a().mo32531a(this.f59068r, Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b), Integer.valueOf(i2), (absv) null);
                        } else {
                            absg.m48186a("Content incarnation changed from %s to %s, saving to prefs now", ((absy) bxvd.f164949b).f58184g, str);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            absy absy6 = (absy) bxvd.f164949b;
                            int i17 = absy6.f58178a | 16;
                            absy6.f58178a = i17;
                            absy6.f58182e = i2;
                            str.getClass();
                            absy6.f58178a = i17 | 64;
                            absy6.f58184g = str;
                            this.f59061d.mo32517a().mo32542c(this.f59068r, (absy) bxvd.mo74062i());
                        }
                        sdo.m34970a(!acxd.mo33188a());
                        return new acab(i, i2 <= 0 ? j : 0, z3, z2);
                    }
                    i4 = 2;
                    i = i4;
                    i2 = 0;
                    z2 = false;
                    abss2 = acxg6;
                    acxg = acxg5;
                    long j42 = acxg.f61008a;
                    if (j42 <= j2) {
                    }
                    if (!z3) {
                    }
                    absy = abss2.f58158c;
                    if (absy == null) {
                    }
                    bxvd = (bxvd) absy.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) absy);
                    List a182 = acxd.mo33186a(Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b));
                    if (bxvd.f164950c) {
                    }
                    ((absy) bxvd.f164949b).f58179b = GeneratedMessageLite.m124030de();
                    bxvd.mo73950M(a182);
                    str = abzz2.f59048c;
                    if (str != null) {
                    }
                    this.f59061d.mo32517a().mo32531a(this.f59068r, Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b), Integer.valueOf(i2), (absv) null);
                    sdo.m34970a(!acxd.mo33188a());
                    return new acab(i, i2 <= 0 ? j : 0, z3, z2);
                } catch (Throwable th12) {
                    th = th12;
                    acxg5.f61008a = j3;
                    if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                    }
                    throw th;
                }
            } catch (Throwable th13) {
                th = th13;
                str2 = str9;
                absr = absr10;
                str3 = acxg5;
                acxg5 = acxg6;
                acxg5.f61008a = j3;
                if (this.f59066p.mo43399a(absr.f58137b, j3) != bqaw.OK) {
                }
                throw th;
            }
        } catch (acai e) {
            e = e;
            j2 = a2;
            acxg acxg7 = acxg6;
            abss abss14 = abss9;
            acxd = acxd4;
            int i18 = i3;
            acxg6 = abss14;
            acxg5 = acxg7;
            Throwable cause = e.getCause();
            absg.m48192b("Cursor call threw an exception: %s", cause.getMessage());
            if (!(cause instanceof DeadObjectException)) {
            }
            i = 2;
            z2 = false;
            abss2 = acxg6;
            acxg = acxg5;
            long j422 = acxg.f61008a;
            if (j422 <= j2) {
            }
            if (!z3) {
            }
            absy = abss2.f58158c;
            if (absy == null) {
            }
            bxvd = (bxvd) absy.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) absy);
            List a1822 = acxd.mo33186a(Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b));
            if (bxvd.f164950c) {
            }
            ((absy) bxvd.f164949b).f58179b = GeneratedMessageLite.m124030de();
            bxvd.mo73950M(a1822);
            str = abzz2.f59048c;
            if (str != null) {
            }
            this.f59061d.mo32517a().mo32531a(this.f59068r, Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b), Integer.valueOf(i2), (absv) null);
            sdo.m34970a(!acxd.mo33188a());
            return new acab(i, i2 <= 0 ? j : 0, z3, z2);
        } catch (acah e2) {
            e = e2;
            j2 = a2;
            acxg acxg8 = acxg6;
            abss abss15 = abss9;
            acxd = acxd4;
            i2 = i3;
            acxg6 = abss15;
            acxg5 = acxg8;
            absg.m48206e("Content incarnation mismatch: %s", e.getMessage());
            i = 2;
            z2 = true;
            abss2 = acxg6;
            acxg = acxg5;
            long j4222 = acxg.f61008a;
            if (j4222 <= j2) {
            }
            if (!z3) {
            }
            absy = abss2.f58158c;
            if (absy == null) {
            }
            bxvd = (bxvd) absy.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) absy);
            List a18222 = acxd.mo33186a(Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b));
            if (bxvd.f164950c) {
            }
            ((absy) bxvd.f164949b).f58179b = GeneratedMessageLite.m124030de();
            bxvd.mo73950M(a18222);
            str = abzz2.f59048c;
            if (str != null) {
            }
            this.f59061d.mo32517a().mo32531a(this.f59068r, Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b), Integer.valueOf(i2), (absv) null);
            sdo.m34970a(!acxd.mo33188a());
            return new acab(i, i2 <= 0 ? j : 0, z3, z2);
        } catch (OutOfMemoryError e3) {
        }
        i2 = 0;
        i = 2;
        z2 = false;
        abss2 = abss3;
        acxg = acxg2;
        long j42222 = acxg.f61008a;
        if (j42222 <= j2) {
        }
        if (!z3) {
        }
        absy = abss2.f58158c;
        if (absy == null) {
        }
        bxvd = (bxvd) absy.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) absy);
        List a182222 = acxd.mo33186a(Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b));
        if (bxvd.f164950c) {
        }
        ((absy) bxvd.f164949b).f58179b = GeneratedMessageLite.m124030de();
        bxvd.mo73950M(a182222);
        str = abzz2.f59048c;
        if (str != null) {
        }
        this.f59061d.mo32517a().mo32531a(this.f59068r, Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b), Integer.valueOf(i2), (absv) null);
        sdo.m34970a(!acxd.mo33188a());
        return new acab(i, i2 <= 0 ? j : 0, z3, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32428b(Object obj) {
        acab acab = (acab) obj;
        if (!acab.mo32575a() && this.f59071u != null) {
            absg.m48197c("Indexing done %s", this.f59068r.mo32584b());
            try {
                this.f59071u.f59053a.mo32572a();
            } catch (acai e) {
                absg.m48192b("Cursor close call threw an exception: %s", e.getMessage());
                this.f59063f.mo32447a("cursor_close_exception");
            }
        }
        acae acae = this.f59072v;
        acae.f59076c |= acab.f59056c;
        if (!acab.mo32575a()) {
            if (acab.f59054a == 2) {
                absg.m48192b("Aborting indexing of corpus %s", acae.f59077d);
                if (acab.f59057d) {
                    acae.f59078e.f59081c.mo32995d(new acad(acae, bqbd.CLEAR_CORPUS_DATA, acae.f59074a, acrz.m49787b(acae.f59078e.f59079a)));
                }
            }
            long j = acab.f59055b;
            if (j > 0) {
                absg.m48197c("Retrying indexing in %dms", Long.valueOf(j));
                Context context = acae.f59078e.f59079a;
                long j2 = acab.f59055b;
                String str = acae.f59074a;
                skc skc = new skc(context);
                long currentTimeMillis = System.currentTimeMillis();
                Intent className = new Intent("com.google.android.gms.icing.INDEX_CONTENT_PROVIDER", new Uri.Builder().scheme("icing").authority("index-corpora").build()).setClassName(context, "com.google.android.gms.icing.service.IndexWorkerService");
                className.putExtra("delay", j2);
                skc.mo25675a("Icing.ServiceAlarmsIndexContentProviders", 0, j2 + currentTimeMillis, PendingIntent.getService(context, 0, className, 134217728), str);
            }
            synchronized (acae.f59078e.f59085g) {
                if (acae.f59076c) {
                    acae.f59078e.f59084f.add(acae.f59075b);
                }
                acae.f59078e.f59083e.remove(acae.f59075b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqaw mo32577a(absr absr, bpxk bpxk) {
        if (bpxk == null) {
            return bqaw.PROTO_PARSE_ERROR;
        }
        bxvd da = bpxj.f139719d.mo74144da();
        String str = absr.f58140e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxj bpxj = (bpxj) da.f164949b;
        str.getClass();
        bpxj.f139721a |= 1;
        bpxj.f139722b = str;
        String a = acww.m49914a(absr);
        if (a != null && !TextUtils.isEmpty(a)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxj bpxj2 = (bpxj) da.f164949b;
            a.getClass();
            bpxj2.f139721a |= 2;
            bpxj2.f139723c = a;
        }
        bxvd bxvd = (bxvd) bpxk.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bpxk);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxk bpxk2 = (bpxk) bxvd.f164949b;
        bpxj bpxj3 = (bpxj) da.mo74062i();
        bpxj3.getClass();
        bpxk2.f139727b = bpxj3;
        bpxk2.f139726a |= 64;
        this.f59063f.mo32442a((bpxk) bxvd.mo74062i());
        bqaw a2 = bqaw.m112488a(bpxk.f139728c);
        return a2 == null ? bqaw.OK : a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abss b = this.f59061d.f58793b.mo32534b(this.f59068r);
        if (b != null) {
            absy absy = b.f58158c;
            if (absy == null) {
                absy = absy.f58176h;
            }
            int a = absx.m48236a(absy.f58180c);
            if ((a == 0 || a == 1) && this.f59061d.f58793b.mo32526a(this.f59068r).equals(this.f59069s)) {
                absr absr = b.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                if (!abzm.m48653a(absr)) {
                    absg.m48206e("Cannot schedule indexing on non-synced corpus %s", this.f59068r.mo32584b());
                    return f59058a;
                }
                String str = absr.f58140e;
                abyv d = this.f59062e.mo32506d(str);
                if (d == null || !d.mo32476e()) {
                    absg.m48197c("Not indexing corpus from package %s as it has never connected", str);
                    return f59058a;
                }
                if (this.f59071u == null) {
                    absg.m48198c("Indexing %s from %s", this.f59068r.mo32584b(), str);
                    ContentResolver contentResolver = this.f59059b.getContentResolver();
                    absr absr2 = b.f58157b;
                    if (absr2 == null) {
                        absr2 = absr.f58134s;
                    }
                    Uri parse = Uri.parse(absr2.f58141f);
                    absy absy2 = b.f58158c;
                    if (absy2 == null) {
                        absy2 = absy.f58176h;
                    }
                    String str2 = absy2.f58184g;
                    int size = absr.f58145j.size();
                    String[] strArr = new String[size];
                    for (int i = 0; i < size; i++) {
                        String valueOf = String.valueOf(((abqo) absr.f58145j.get(i)).f57978b);
                        strArr[i] = valueOf.length() == 0 ? new String("section_") : "section_".concat(valueOf);
                    }
                    this.f59071u = new acaa(new abzz(contentResolver, parse, str2, strArr));
                }
                acab a2 = mo32576a(b, this.f59071u.f59053a, this.f59070t);
                if (!a2.mo32575a()) {
                    return a2;
                }
                acpl acpl = this.f59060c;
                acab acab = a2;
                acpl.mo32995d(new acac(this.f59059b, acpl, this.f59061d, this.f59062e, this.f59063f, this.f59064n, this.f59065o, this.f59066p, this.f59067q, this.f60439j, this.f59068r, this.f59069s, this.f59070t, this.f59072v, this.f59071u));
                return acab;
            }
        }
        absg.m48185a("Corpus no longer exists %s", this.f59068r.mo32584b());
        return f59058a;
    }
}
