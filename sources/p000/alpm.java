package p000;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: alpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpm extends alna {

    /* renamed from: c */
    private final String f74020c;

    /* renamed from: d */
    private final String[] f74021d;

    /* renamed from: e */
    private final String f74022e;

    /* renamed from: f */
    private final String f74023f = "";

    /* renamed from: g */
    private final ande f74024g;

    /* renamed from: s */
    private final alms f74025s;

    /* renamed from: t */
    private final almn f74026t;

    /* renamed from: u */
    private alpl f74027u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alpm(alzm alzm, String str, int i, String str2, String str3, String[] strArr) {
        super(str, i, alzm, str2, "RestoreDeviceContactsOperation");
        alms alms = alms.f73790a;
        ande ande = ande.f76660a;
        almn almn = new almn(bmza.m108657a(bmvy.f131119a));
        this.f74022e = str2;
        this.f74020c = str3;
        this.f74021d = strArr;
        this.f74025s = alms;
        this.f74024g = ande;
        this.f74026t = almn;
        this.f74027u = null;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:7:0x0042 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:52:0x0121 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:147:0x034a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:500:0x0aca */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:151:0x0363 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:407:0x0946 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:410:0x0955 */
    /* JADX INFO: additional move instructions added (4) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:341:0x081b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:591:0x085b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:344:0x0820 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:347:0x082a */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r10v1, types: [ampm], assign insn: 0x001a: INVOKE  (r10v1 ? I:ampm) = (r10v0 alms), (r2v0 android.content.Context), (14082 int) type: VIRTUAL call: alms.a(android.content.Context, int):ampm */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String], assign insn: PHI: (r2v1 ?) = (r2v167 ?), (r2v168 ?), (r2v169 ?), (r2v170 ?), (r2v171 ?) binds: [B:579:0x0c9e, B:576:0x0c54, B:573:0x0c2a, B:570:0x0c00, B:567:0x0bdb] */
    /* JADX WARN: Type inference failed for: r6v2, assign insn: PHI: (r6v2 ?) = (r6v3 java.lang.String), (r6v13 ?), (r6v69 java.lang.String), (r6v111 java.lang.String), (r6v119 ?) binds: [B:578:0x0c94, B:562:0x0bcd, B:401:0x0920, B:182:0x03ee, B:76:0x01c9] */
    /* JADX WARN: Type inference failed for: r6v13, assign insn: PHI: (r6v13 ?) = (r6v14 java.lang.String), (r6v21 ?) binds: [B:561:0x0bc5, B:550:0x0b99] */
    /* JADX WARN: Type inference failed for: r6v21, assign insn: PHI: (r6v21 ?) = (r6v22 ?), (r6v37 java.lang.String), (r6v41 java.lang.String) binds: [B:549:0x0b98, B:513:0x0b34, B:495:0x0abf] */
    /* JADX WARN: Type inference failed for: r10v24, assign insn: PHI: (r10v24 ?) = (r10v1 ?), (r10v1 ?), (r10v1 ?), (r10v41 ?), (r10v47 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r9v23, assign insn: PHI: (r9v23 ?) = (r9v1 andd), (r9v1 andd), (r9v1 andd), (r9v49 ?), (r9v57 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r6v22, assign insn: PHI: (r6v22 ?) = (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v39 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r10v26, assign insn: PHI: (r10v26 ?) = (r10v1 ?), (r10v1 ?), (r10v1 ?), (r10v41 ?), (r10v47 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r9v25, assign insn: PHI: (r9v25 ?) = (r9v1 andd), (r9v1 andd), (r9v1 andd), (r9v49 ?), (r9v57 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r10v28, assign insn: PHI: (r10v28 ?) = (r10v1 ?), (r10v1 ?), (r10v1 ?), (r10v41 ?), (r10v47 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r9v27, assign insn: PHI: (r9v27 ?) = (r9v1 andd), (r9v1 andd), (r9v1 andd), (r9v49 ?), (r9v57 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r10v30, assign insn: PHI: (r10v30 ?) = (r10v1 ?), (r10v1 ?), (r10v1 ?), (r10v41 ?), (r10v47 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r9v29, assign insn: PHI: (r9v29 ?) = (r9v1 andd), (r9v1 andd), (r9v1 andd), (r9v49 ?), (r9v57 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r6v28, assign insn: PHI: (r6v28 ?) = (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v0 java.lang.String), (r6v39 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r10v31, assign insn: PHI: (r10v31 ?) = (r10v1 ?), (r10v1 ?), (r10v1 ?), (r10v41 ?), (r10v47 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r9v30, assign insn: PHI: (r9v30 ?) = (r9v1 andd), (r9v1 andd), (r9v1 andd), (r9v49 ?), (r9v57 ?) binds: [B:7:0x0042, B:10:0x0050, B:13:0x0056, B:52:0x0121, B:500:0x0aca] */
    /* JADX WARN: Type inference failed for: r10v41, assign insn: PHI: (r10v41 ?) = (r10v1 ?), (r10v211 ?) binds: [B:49:0x00fe, B:50:0x00ff] */
    /* JADX WARN: Type inference failed for: r9v49, assign insn: PHI: (r9v49 ?) = (r9v152 ?), (r9v177 ?) binds: [B:49:0x00fe, B:50:0x00ff] */
    /* JADX WARN: Type inference failed for: r10v47, assign insn: PHI: (r10v47 ?) = (r10v78 ?), (r10v85 ?), (r10v175 ?), (r10v186 ?), (r10v193 ?) binds: [B:452:0x0a4b, B:440:0x09ee, B:498:0x0ac7, B:475:0x0a94, B:404:0x0932] */
    /* JADX WARN: Type inference failed for: r9v57, assign insn: PHI: (r9v57 ?) = (r9v88 ?), (r9v94 ?), (r9v153 ?), (r9v164 ?), (r9v171 ?) binds: [B:452:0x0a4b, B:440:0x09ee, B:498:0x0ac7, B:475:0x0a94, B:404:0x0932] */
    /* JADX WARN: Type inference failed for: r6v39, assign insn: PHI: (r6v39 ?) = (r6v40 ?), (r6v59 java.lang.String), (r6v65 ?), (r6v124 ?), (r6v126 ?) binds: [B:498:0x0ac7, B:452:0x0a4b, B:440:0x09ee, B:475:0x0a94, B:404:0x0932] */
    /* JADX WARN: Type inference failed for: r6v40, assign insn: 0x0ac7: MOVE  (r6v40 ? I:?[OBJECT, ARRAY]) = ("running") */
    /* JADX WARN: Type inference failed for: r6v45, assign insn: PHI: (r6v45 ?) = (r6v46 ?), (r6v54 ?), (r6v62 java.lang.String), (r6v65 ?) binds: [B:486:0x0aac, B:472:0x0a8e, B:446:0x0a2a, B:417:0x0969] */
    /* JADX WARN: Type inference failed for: r6v46, assign insn: 0x0aac: MOVE  (r6v46 ? I:?[OBJECT, ARRAY]) = ("running") */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.String], assign insn: 0x01ef: CONST_STR  (r2v65 ? I:java.lang.String) =  "com.google" */
    /* JADX WARN: Type inference failed for: r10v65, assign insn: PHI: (r10v65 ?) = (r10v77 ?), (r10v85 ?), (r10v85 ?), (r10v116 ?) binds: [B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r2v66, assign insn: PHI: (r2v66 ?) = (r2v65 ?), (r2v78 ?), (r2v78 ?), (r2v93 ?), (r2v103 ?), (r2v65 ?) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r10v66, assign insn: PHI: (r10v66 ?) = (r10v77 ?), (r10v85 ?), (r10v85 ?), (r10v116 ?) binds: [B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v52, assign insn: PHI: (r6v52 ?) = (r6v0 java.lang.String), (r6v58 ?), (r6v65 ?), (r6v65 ?), (r6v100 ?), (r6v0 java.lang.String) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r2v67, assign insn: PHI: (r2v67 ?) = (r2v65 ?), (r2v78 ?), (r2v78 ?), (r2v93 ?), (r2v103 ?), (r2v65 ?) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r10v67, assign insn: PHI: (r10v67 ?) = (r10v77 ?), (r10v85 ?), (r10v85 ?), (r10v116 ?) binds: [B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r2v68, assign insn: PHI: (r2v68 ?) = (r2v65 ?), (r2v78 ?), (r2v78 ?), (r2v93 ?), (r2v103 ?), (r2v65 ?) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r10v68, assign insn: PHI: (r10v68 ?) = (r10v77 ?), (r10v85 ?), (r10v85 ?), (r10v116 ?) binds: [B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v54, assign insn: PHI: (r6v54 ?) = (r6v0 java.lang.String), (r6v58 ?), (r6v65 ?), (r6v65 ?), (r6v100 ?), (r6v0 java.lang.String) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r2v69, assign insn: PHI: (r2v69 ?) = (r2v65 ?), (r2v78 ?), (r2v78 ?), (r2v93 ?), (r2v103 ?), (r2v65 ?) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r10v69, assign insn: PHI: (r10v69 ?) = (r10v77 ?), (r10v85 ?), (r10v85 ?), (r10v116 ?) binds: [B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r2v70, assign insn: PHI: (r2v70 ?) = (r2v65 ?), (r2v78 ?), (r2v78 ?), (r2v93 ?), (r2v103 ?), (r2v65 ?) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r10v70, assign insn: PHI: (r10v70 ?) = (r10v77 ?), (r10v85 ?), (r10v85 ?), (r10v116 ?) binds: [B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r2v71, assign insn: PHI: (r2v71 ?) = (r2v65 ?), (r2v78 ?), (r2v78 ?), (r2v93 ?), (r2v103 ?), (r2v65 ?) binds: [B:147:0x034a, B:151:0x0363, B:407:0x0946, B:410:0x0955, B:347:0x082a, B:134:0x02f9] */
    /* JADX WARN: Type inference failed for: r6v57, assign insn: 0x0357: CONST  (r6v57 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r10v77, assign insn: PHI: (r10v77 ?) = (r10v103 ?), (r10v174 ?) binds: [B:350:0x085b, B:149:0x034e] */
    /* JADX WARN: Type inference failed for: r6v58, assign insn: PHI: (r6v58 ?) = (r6v57 ?), (r6v80 ?) binds: [B:149:0x034e, B:350:0x085b] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.String], assign insn: PHI: (r2v78 ?) = (r2v65 ?), (r2v102 ?) binds: [B:149:0x034e, B:350:0x085b] */
    /* JADX WARN: Type inference failed for: r10v78, assign insn: 0x0a4f: MOVE  (r10v78 ? I:?[OBJECT, ARRAY]) = (r28v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v88, assign insn: 0x0a51: MOVE  (r9v88 ? I:?[OBJECT, ARRAY]) = (r29v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.lang.String], assign insn: 0x093c: MOVE  (r6v65 ? I:?[OBJECT, ARRAY]) = (r27v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v85, types: [java.lang.String], assign insn: 0x093e: MOVE  (r10v85 ? I:?[OBJECT, ARRAY]) = (r28v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v94, types: [java.lang.String], assign insn: 0x0940: MOVE  (r9v94 ? I:?[OBJECT, ARRAY]) = (r29v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v85, assign insn: PHI: (r2v85 ?) = (r2v86 ?), (r2v93 ?) binds: [B:424:0x0979, B:411:?] */
    /* JADX WARN: Type inference failed for: r2v86, assign insn: 0x0979: MOVE  (r2v86 ? I:?[OBJECT, ARRAY]) = (r25v0 android.content.Context) */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.String], assign insn: 0x0952: MOVE  (r2v93 ? I:?[OBJECT, ARRAY]) = (r25v0 android.content.Context) */
    /* JADX WARN: Type inference failed for: r10v86, assign insn: PHI: (r10v86 ?) = (r10v85 ?), (r10v85 ?), (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:407:0x0946, B:408:?, B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r9v95, assign insn: PHI: (r9v95 ?) = (r9v94 ?), (r9v94 ?), (r9v111 ?), (r9v111 ?), (r9v111 ?) binds: [B:407:0x0946, B:408:?, B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v66, assign insn: PHI: (r6v66 ?) = (r6v65 ?), (r6v65 ?), (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:407:0x0946, B:408:?, B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r9v96, assign insn: PHI: (r9v96 ?) = (r9v97 java.lang.String), (r9v111 ?), (r9v111 ?), (r9v170 ?) binds: [B:403:0x092c, B:384:0x08c3, B:372:0x089f, B:423:0x0978] */
    /* JADX WARN: Type inference failed for: r10v101, assign insn: PHI: (r10v101 ?) = (r10v200 ?), (r10v201 ?), (r10v202 ?), (r10v210 ?) binds: [B:310:0x07b2, B:245:0x0572, B:237:0x055a, B:305:0x06f1] */
    /* JADX WARN: Type inference failed for: r10v102, assign insn: PHI: (r10v102 ?) = (r10v104 ?), (r10v119 java.lang.String) binds: [B:591:0x085b, B:592:0x085b] */
    /* JADX WARN: Type inference failed for: r9v108, assign insn: PHI: (r9v108 ?) = (r9v110 ?), (r9v114 java.lang.String) binds: [B:591:0x085b, B:592:0x085b] */
    /* JADX WARN: Type inference failed for: r6v79, assign insn: PHI: (r6v79 ?) = (r6v82 ?), (r6v103 java.lang.String) binds: [B:591:0x085b, B:592:0x085b] */
    /* JADX WARN: Type inference failed for: r2v101, assign insn: PHI: (r2v101 ?) = (r2v103 ?), (r2v107 ?) binds: [B:591:0x085b, B:592:0x085b] */
    /* JADX WARN: Type inference failed for: r6v80, assign insn: 0x0867: MOVE  (r6v80 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r38v2 int) */
    /* JADX WARN: Type inference failed for: r10v103, assign insn: 0x086b: MOVE  (r10v103 ? I:?[OBJECT, ARRAY]) = (r4v50 alpl) */
    /* JADX WARN: Type inference failed for: r2v102, assign insn: 0x0873: MOVE  (r2v102 ? I:?[OBJECT, ARRAY]) = (r36v2 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r2v103, assign insn: PHI: (r2v103 ?) = (r2v205 ?), (r2v206 ?) binds: [B:327:0x07e7, B:335:0x07f6] */
    /* JADX WARN: Type inference failed for: r6v81, types: [int], assign insn: 0x07fe: ARITH  (r6v81 ? I:int) = (r38v1 int) + (r32v4 int) */
    /* JADX WARN: Type inference failed for: r10v104, assign insn: PHI: (r10v104 ?) = (r10v116 ?), (r10v117 ?) binds: [B:348:?, B:338:0x0804] */
    /* JADX WARN: Type inference failed for: r9v110, assign insn: PHI: (r9v110 ?) = (r9v111 ?), (r9v112 ?) binds: [B:348:?, B:338:0x0804] */
    /* JADX WARN: Type inference failed for: r6v82, assign insn: PHI: (r6v82 ?) = (r6v100 ?), (r6v101 ?) binds: [B:348:?, B:338:0x0804] */
    /* JADX WARN: Type inference failed for: r9v111, types: [java.lang.String], assign insn: 0x0819: MOVE  (r9v111 ? I:?[OBJECT, ARRAY]) = (r29v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v111, assign insn: PHI: (r10v111 ?) = (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v89, assign insn: PHI: (r6v89 ?) = (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r10v112, assign insn: PHI: (r10v112 ?) = (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v90, assign insn: PHI: (r6v90 ?) = (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r10v113, assign insn: PHI: (r10v113 ?) = (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v91, assign insn: PHI: (r6v91 ?) = (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r10v114, assign insn: PHI: (r10v114 ?) = (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v92, assign insn: PHI: (r6v92 ?) = (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r10v115, assign insn: PHI: (r10v115 ?) = (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r6v93, assign insn: PHI: (r6v93 ?) = (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:341:0x081b, B:344:0x0820, B:347:0x082a] */
    /* JADX WARN: Type inference failed for: r10v116, types: [java.lang.String], assign insn: 0x081e: MOVE  (r10v116 ? I:?[OBJECT, ARRAY]) = (r28v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r6v100, types: [java.lang.String], assign insn: 0x0825: MOVE  (r6v100 ? I:?[OBJECT, ARRAY]) = (r27v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v117, assign insn: 0x0804: MOVE  (r10v117 ? I:?[OBJECT, ARRAY]) = (r28v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v112, assign insn: 0x0806: MOVE  (r9v112 ? I:?[OBJECT, ARRAY]) = (r29v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r6v101, assign insn: 0x080e: MOVE  (r6v101 ? I:?[OBJECT, ARRAY]) = (r27v1 java.lang.String) */
    /* JADX WARN: Type inference failed for: r2v107, assign insn: 0x07d5: MOVE  (r2v107 ? I:?[long, double]) = (r40v0 double) */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String[]], assign insn: 0x02a7: NEW_ARRAY  (r14v19 ? I:java.lang.String[]) = (3 int) type: java.lang.String[] */
    /* JADX WARN: Type inference failed for: r6v119, assign insn: 0x01d1: MOVE  (r6v119 ? I:?[OBJECT, ARRAY]) = ("running") */
    /* JADX WARN: Type inference failed for: r2v167, assign insn: ?: MOVE  (r2v167 ?) = (r2v4 android.content.Context) */
    /* JADX WARN: Type inference failed for: r2v168, assign insn: ?: MOVE  (r2v168 ?) = (r2v6 android.content.Context) */
    /* JADX WARN: Type inference failed for: r2v169, assign insn: ?: MOVE  (r2v169 ?) = (r2v8 android.content.Context) */
    /* JADX WARN: Type inference failed for: r2v170, assign insn: ?: MOVE  (r2v170 ?) = (r2v10 android.content.Context) */
    /* JADX WARN: Type inference failed for: r2v171, assign insn: ?: MOVE  (r2v171 ?) = (r2v12 android.content.Context) */
    /* JADX WARN: Type inference failed for: r9v152, assign insn: ?: MOVE  (r9v152 ?) = (r9v48 chtv) */
    /* JADX WARN: Type inference failed for: r10v174, assign insn: ?: MOVE  (r10v174 ?) = (r10v46 alpl) */
    /* JADX WARN: Type inference failed for: r10v175, assign insn: ?: MOVE  (r10v175 ?) = (r10v48 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v153, assign insn: ?: MOVE  (r9v153 ?) = (r9v58 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r10v177, assign insn: ?: MOVE  (r10v177 ?) = (r10v51 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v155, assign insn: ?: MOVE  (r9v155 ?) = (r9v61 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r10v179, assign insn: ?: MOVE  (r10v179 ?) = (r10v54 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v157, assign insn: ?: MOVE  (r9v157 ?) = (r9v64 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r10v181, assign insn: ?: MOVE  (r10v181 ?) = (r10v57 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v159, assign insn: ?: MOVE  (r9v159 ?) = (r9v67 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r10v183, assign insn: ?: MOVE  (r10v183 ?) = (r10v60 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v161, assign insn: ?: MOVE  (r9v161 ?) = (r9v70 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r10v185, assign insn: ?: MOVE  (r10v185 ?) = (r10v63 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v163, assign insn: ?: MOVE  (r9v163 ?) = (r9v73 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r10v186, assign insn: ?: MOVE  (r10v186 ?) = (r10v65 ?) */
    /* JADX WARN: Type inference failed for: r9v164, assign insn: ?: MOVE  (r9v164 ?) = (r9v75 java.lang.String) */
    /* JADX WARN: Type inference failed for: r6v124, assign insn: ?: MOVE  (r6v124 ?) = (r6v51 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v187, assign insn: ?: MOVE  (r10v187 ?) = (r10v66 ?) */
    /* JADX WARN: Type inference failed for: r9v165, assign insn: ?: MOVE  (r9v165 ?) = (r9v76 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v188, assign insn: ?: MOVE  (r10v188 ?) = (r10v67 ?) */
    /* JADX WARN: Type inference failed for: r9v166, assign insn: ?: MOVE  (r9v166 ?) = (r9v77 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v189, assign insn: ?: MOVE  (r10v189 ?) = (r10v68 ?) */
    /* JADX WARN: Type inference failed for: r9v167, assign insn: ?: MOVE  (r9v167 ?) = (r9v78 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v190, assign insn: ?: MOVE  (r10v190 ?) = (r10v69 ?) */
    /* JADX WARN: Type inference failed for: r9v168, assign insn: ?: MOVE  (r9v168 ?) = (r9v79 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v191, assign insn: ?: MOVE  (r10v191 ?) = (r10v70 ?) */
    /* JADX WARN: Type inference failed for: r9v169, assign insn: ?: MOVE  (r9v169 ?) = (r9v80 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v192, assign insn: ?: MOVE  (r10v192 ?) = (r10v86 ?) */
    /* JADX WARN: Type inference failed for: r9v170, assign insn: ?: MOVE  (r9v170 ?) = (r9v95 ?) */
    /* JADX WARN: Type inference failed for: r6v125, assign insn: ?: MOVE  (r6v125 ?) = (r6v66 ?) */
    /* JADX WARN: Type inference failed for: r10v193, assign insn: ?: MOVE  (r10v193 ?) = (r10v87 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v171, assign insn: ?: MOVE  (r9v171 ?) = (r9v96 ?) */
    /* JADX WARN: Type inference failed for: r6v126, assign insn: ?: MOVE  (r6v126 ?) = (r6v67 java.lang.String) */
    /* JADX WARN: Type inference failed for: r10v200, assign insn: ?: MOVE  (r10v200 ?) = (r10v100 btfi) */
    /* JADX WARN: Type inference failed for: r10v201, assign insn: ?: MOVE  (r10v201 ?) = (r10v100 btfi) */
    /* JADX WARN: Type inference failed for: r10v202, assign insn: ?: MOVE  (r10v202 ?) = (r10v100 btfi) */
    /* JADX WARN: Type inference failed for: r10v203, assign insn: ?: MOVE  (r10v203 ?) = (r10v111 ?) */
    /* JADX WARN: Type inference failed for: r10v204, assign insn: ?: MOVE  (r10v204 ?) = (r10v112 ?) */
    /* JADX WARN: Type inference failed for: r10v205, assign insn: ?: MOVE  (r10v205 ?) = (r10v113 ?) */
    /* JADX WARN: Type inference failed for: r10v206, assign insn: ?: MOVE  (r10v206 ?) = (r10v114 ?) */
    /* JADX WARN: Type inference failed for: r10v207, assign insn: ?: MOVE  (r10v207 ?) = (r10v115 ?) */
    /* JADX WARN: Type inference failed for: r2v205, assign insn: ?: MOVE  (r2v205 ?) = (r2v104 double) */
    /* JADX WARN: Type inference failed for: r2v206, assign insn: ?: MOVE  (r2v206 ?) = (r2v105 double) */
    /* JADX WARN: Type inference failed for: r10v210, assign insn: ?: MOVE  (r10v210 ?) = (r10v129 btfi) */
    /* JADX WARN: Type inference failed for: r10v211, assign insn: ?: MOVE  (r10v211 ?) = (r10v152 java.lang.String) */
    /* JADX WARN: Type inference failed for: r9v177, assign insn: ?: MOVE  (r9v177 ?) = (r9v129 chtv) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [?, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03aa, code lost:
        r1 = r47;
        r3 = r0;
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03b8, code lost:
        r1 = r47;
        r3 = r0;
        r5 = r23;
        r7 = r24;
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03dc, code lost:
        r1 = r47;
        r3 = r0;
        r5 = r23;
        r7 = r24;
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ee, code lost:
        r1 = r47;
        r3 = r0;
        r5 = r23;
        r7 = r24;
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0557, code lost:
        if (r36 != false) goto L_0x0578;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07eb, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        r5 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07f0, code lost:
        if ((r4 instanceof android.os.TransactionTooLargeException) == false) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07f6, code lost:
        r11.f74036i = r5 - 1;
        r32 = 0;
        r33 = 0;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0877, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0878, code lost:
        r10 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x087a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x087b, code lost:
        r10 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x087d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x087e, code lost:
        r10 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0880, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0881, code lost:
        r10 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0883, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0884, code lost:
        r10 = r10;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0936, code lost:
        r35 = r1;
        r38 = r6;
        r37 = r7;
        r6 = r27;
        r10 = r28;
        r9 = r29;
        r4 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0944, code lost:
        if (r4 == null) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        r1 = new android.content.Intent((java.lang.String) r9);
        r1.setPackage(r10);
        r1.putExtra((java.lang.String) r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0952, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        r1.putExtra((java.lang.String) r2, true);
        r4.f74019a.sendBroadcast(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0978, code lost:
        r10 = r10;
        r9 = r9;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0979, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x097b, code lost:
        r1 = r35.iterator();
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0985, code lost:
        if (r1.hasNext() == false) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0991, code lost:
        if (p000.alpn.m61478a((p000.btfi) r1.next()) != false) goto L_0x0996;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0993, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0996, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0999, code lost:
        r1 = p000.almk.m61263a();
        r5 = p000.amks.f75077g.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x09a5, code lost:
        if (r5.f164950c != false) goto L_0x09a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x09a8, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x09ae, code lost:
        r7 = (p000.amks) r5.f164949b;
        r8 = r7.f75079a | 1;
        r7.f75079a = r8;
        r7.f75080b = r4;
        r4 = 2 | r8;
        r7.f75079a = r4;
        r7.f75081c = r3;
        r3 = r4 | 4;
        r7.f75079a = r3;
        r7.f75082d = r38;
        r3 = r3 | 8;
        r7.f75079a = r3;
        r7.f75083e = r37;
        r7.f75079a = r3 | 16;
        r7.f75084f = true;
        r3 = (p000.amks) r5.mo74062i();
        r4 = p000.amkv.f75106m.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x09e5, code lost:
        if (r4.f164950c != false) goto L_0x09e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x09e8, code lost:
        r4.mo74035c();
        r4.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x09ee, code lost:
        r5 = (p000.amkv) r4.f164949b;
        r3.getClass();
        r5.f75118k = r3;
        r5.f75108a |= com.google.autofill.detection.p098ml.AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        r1.mo40514a((p000.amkv) r4.mo74062i());
        r20.mo40527a(r11.f74033f, "write_contacts_helper:restore_contacts", false);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a13, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a14, code lost:
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a1e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a1f, code lost:
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a29, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a2a, code lost:
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a34, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a35, code lost:
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a3f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a40, code lost:
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0a4b, code lost:
        r2 = r25;
        r6 = r27;
        r10 = r28;
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a8a, code lost:
        r0 = e;
        r10 = r10;
        r9 = r9;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a8c, code lost:
        r0 = e;
        r10 = r10;
        r9 = r9;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a8e, code lost:
        r0 = e;
        r10 = r10;
        r9 = r9;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a90, code lost:
        r0 = e;
        r10 = r10;
        r9 = r9;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a92, code lost:
        r0 = e;
        r10 = r10;
        r9 = r9;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a94, code lost:
        r10 = r10;
        r9 = r9;
        r6 = r6;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0ac4, code lost:
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0ae5, code lost:
        r7.mo74035c();
        r7.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0b0c, code lost:
        p000.alpi.m61467a(r48).edit().putLong(p000.alpi.m61468a(r3), r7).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0b2c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0b2d, code lost:
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r6 = "running";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b33, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b34, code lost:
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r6 = "running";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b3a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b3b, code lost:
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r6 = "running";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b41, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b42, code lost:
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r6 = "running";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b48, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b49, code lost:
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r6 = "running";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b72, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b74, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0b9d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0b9e, code lost:
        r2 = "succeed";
        r10 = r6;
        r24 = r9;
        r6 = "running";
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r3 = r0;
        r5 = "BasePeopleOperation";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0baa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0bab, code lost:
        r2 = "succeed";
        r10 = r6;
        r24 = r9;
        r6 = "running";
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r3 = r0;
        r5 = "BasePeopleOperation";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0bd1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0bd2, code lost:
        r2 = "succeed";
        r10 = r6;
        r23 = "BasePeopleOperation";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0bf5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0bf6, code lost:
        r2 = "succeed";
        r10 = r6;
        r6 = "running";
        r5 = "BasePeopleOperation";
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r7 = r9;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c1f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0c20, code lost:
        r2 = "succeed";
        r10 = r6;
        r6 = "running";
        r5 = "BasePeopleOperation";
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r7 = r9;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c49, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c4a, code lost:
        r2 = "succeed";
        r10 = r6;
        r6 = "running";
        r5 = "BasePeopleOperation";
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r7 = r9;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0c93, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0c94, code lost:
        r2 = "succeed";
        r10 = r6;
        r6 = "running";
        r5 = "BasePeopleOperation";
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r7 = r9;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ac, code lost:
        r1 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        r1 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b6, code lost:
        r1 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bb, code lost:
        r1 = r47;
        r3 = r0;
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r7 = r24;
        r6 = "running";
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c9, code lost:
        r1 = r47;
        r3 = r0;
        r2 = "succeed";
        r10 = r6;
        r9 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
        r7 = r24;
        r6 = "running";
        r5 = r23;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02fe A[SYNTHETIC, Splitter:B:137:0x02fe] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0304 A[Catch:{ InterruptedException -> 0x0ac3, gid -> 0x01c8, chuw -> 0x01ba, RemoteException -> 0x01b5, OperationApplicationException -> 0x01b0, Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x030c A[Catch:{ InterruptedException -> 0x0ac3, gid -> 0x01c8, chuw -> 0x01ba, RemoteException -> 0x01b5, OperationApplicationException -> 0x01b0, Exception -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0369 A[SYNTHETIC, Splitter:B:154:0x0369] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03a9 A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }, ExcHandler: Exception (r0v112 'e' java.lang.Exception A[CUSTOM_DECLARE, Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }]), Splitter:B:158:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03b7 A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }, ExcHandler: OperationApplicationException (r0v111 'e' android.content.OperationApplicationException A[CUSTOM_DECLARE, Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }]), Splitter:B:158:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03db A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }, ExcHandler: chuw (r0v109 'e' chuw A[CUSTOM_DECLARE, Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }]), Splitter:B:158:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03ed A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }, ExcHandler: gid (r0v108 'e' gid A[CUSTOM_DECLARE, Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }]), Splitter:B:158:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0408 A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0425 A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x042b A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0433 A[Catch:{ InterruptedException -> 0x0a4a, gid -> 0x03ed, chuw -> 0x03db, RemoteException -> 0x03c9, OperationApplicationException -> 0x03b7, Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x07be A[SYNTHETIC, Splitter:B:315:0x07be] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0804 A[Catch:{ InterruptedException -> 0x092b, gid -> 0x0919, chuw -> 0x0907, RemoteException -> 0x08f5, OperationApplicationException -> 0x08e3, Exception -> 0x08d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0815 A[Catch:{ InterruptedException -> 0x092b, gid -> 0x0919, chuw -> 0x0907, RemoteException -> 0x08f5, OperationApplicationException -> 0x08e3, Exception -> 0x08d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0977 A[Catch:{ InterruptedException -> 0x0a94, gid -> 0x0a92, chuw -> 0x0a90, RemoteException -> 0x0a8e, OperationApplicationException -> 0x0a8c, Exception -> 0x0a8a }, ExcHandler: InterruptedException (e java.lang.InterruptedException), PHI: r6 r9 r10 10  PHI: (r6v66 ?) = (r6v65 ?), (r6v65 ?), (r6v81 ?), (r6v81 ?), (r6v100 ?) binds: [B:407:0x0946, B:408:?, B:341:0x081b, B:344:0x0820, B:347:0x082a] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r9v95 ?) = (r9v94 ?), (r9v94 ?), (r9v111 ?), (r9v111 ?), (r9v111 ?) binds: [B:407:0x0946, B:408:?, B:341:0x081b, B:344:0x0820, B:347:0x082a] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r10v86 ?) = (r10v85 ?), (r10v85 ?), (r10v101 ?), (r10v116 ?), (r10v116 ?) binds: [B:407:0x0946, B:408:?, B:341:0x081b, B:344:0x0820, B:347:0x082a] A[DONT_GENERATE, DONT_INLINE], Splitter:B:347:0x082a] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a4a A[Catch:{ InterruptedException -> 0x0a94, gid -> 0x0a92, chuw -> 0x0a90, RemoteException -> 0x0a8e, OperationApplicationException -> 0x0a8c, Exception -> 0x0a8a }, ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:151:0x0363] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0a86 A[Catch:{ InterruptedException -> 0x0a94, gid -> 0x0a92, chuw -> 0x0a90, RemoteException -> 0x0a8e, OperationApplicationException -> 0x0a8c, Exception -> 0x0a8a }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0ac3 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:54:0x0147] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0ae4 A[Catch:{ gid -> 0x0b98, chuw -> 0x0b93, RemoteException -> 0x0b8e, OperationApplicationException -> 0x0b89, Exception -> 0x0b86 }] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x0ae5 A[Catch:{ gid -> 0x0b98, chuw -> 0x0b93, RemoteException -> 0x0b8e, OperationApplicationException -> 0x0b89, Exception -> 0x0b86 }] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0b0c A[Catch:{ gid -> 0x0b98, chuw -> 0x0b93, RemoteException -> 0x0b8e, OperationApplicationException -> 0x0b89, Exception -> 0x0b86 }] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0b3a A[Catch:{ gid -> 0x0b98, chuw -> 0x0b93, RemoteException -> 0x0b8e, OperationApplicationException -> 0x0b89, Exception -> 0x0b86 }, ExcHandler: Exception (e java.lang.Exception), Splitter:B:13:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0b41 A[Catch:{ gid -> 0x0b98, chuw -> 0x0b93, RemoteException -> 0x0b8e, OperationApplicationException -> 0x0b89, Exception -> 0x0b86 }, ExcHandler: OperationApplicationException (e android.content.OperationApplicationException), Splitter:B:13:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0b48 A[Catch:{ gid -> 0x0b98, chuw -> 0x0b93, RemoteException -> 0x0b8e, OperationApplicationException -> 0x0b89, Exception -> 0x0b86 }, ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:13:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0b9d A[ExcHandler: OperationApplicationException (r0v10 'e' android.content.OperationApplicationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:554:0x0baa A[ExcHandler: RemoteException (r0v9 'e' android.os.RemoteException A[CUSTOM_DECLARE]), Splitter:B:5:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0bd1 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:3:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0936 A[EDGE_INSN: B:588:0x0936->B:405:0x0936 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: c */
    public final Pair mo40604c(Context context) {
        String str;
        String str2;
        String str3;
        ? r2;
        andd andd;
        andd andd2;
        String str4;
        gid gid;
        Context context2;
        String str5;
        String str6;
        String str7;
        andd andd3;
        String str8;
        chuw chuw;
        Context context3;
        String str9;
        String str10;
        String str11;
        andd andd4;
        String str12;
        RemoteException remoteException;
        Context context4;
        String str13;
        String str14;
        String str15;
        andd andd5;
        String str16;
        OperationApplicationException operationApplicationException;
        Context context5;
        andd andd6;
        String str17;
        String str18;
        Exception exc;
        Context context6;
        String str19;
        String str20;
        Context context7;
        andd andd7;
        Context context8;
        String str21;
        String str22;
        Context context9;
        String str23;
        andd andd8;
        Context context10;
        String str24;
        String str25;
        Context context11;
        String str26;
        String str27;
        Context context12;
        String str28;
        String str29;
        Context context13;
        Throwable th;
        btem btem;
        String str30;
        alpl alpl;
        bxvd da;
        long currentTimeMillis;
        Context context14;
        String str31;
        Object obj;
        Context context15;
        Context context16;
        String str32;
        Object obj2;
        Context context17;
        Context context18;
        String str33;
        Object obj3;
        Context context19;
        Context context20;
        String str34;
        Object obj4;
        Context context21;
        Context context22;
        String str35;
        Object obj5;
        Context context23;
        Cursor cursor;
        Throwable th2;
        almn almn;
        long j;
        String str36;
        Context context24;
        double doubleValue;
        String str37;
        String str38;
        String str39;
        int i;
        int i2;
        int i3;
        String str40;
        String str41;
        bxwc bxwc;
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        double d;
        int i6;
        String str42;
        Object obj6;
        int i7;
        long j2;
        String str43;
        int i8;
        alpl alpl2;
        ? r10;
        int i9;
        int i10;
        int i11;
        Intent intent;
        double d2;
        double d3;
        RemoteException remoteException2;
        Object obj7;
        byte[] bArr;
        SparseArray sparseArray;
        SQLiteException sQLiteException;
        alpm alpm = this;
        Context context25 = context;
        String str44 = "com.google.android.gms";
        andd a = alpm.f74024g.mo41719a(context25);
        String a2 = alpm.f74025s.mo40538a(context25, 14082);
        alpn alpn = new alpn(context25);
        amig.m62939a();
        if (alpm.f74027u == null) {
            alpm.f74027u = new alpl(context25);
        }
        try {
            alpm.f74026t.mo40526a();
            ClientContext a3 = amqt.m63194a(context25, alpm.f74022e);
            String str45 = alpm.f74020c;
            String[] strArr = alpm.f74021d;
            String str46 = alpm.f74023f;
            btej btej = (btej) btek.f148526d.mo74144da();
            String str47 = "BasePeopleOperation";
            try {
                bxvd da2 = btcs.f148310b.mo74144da();
                andd6 = a;
                try {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    str45.getClass();
                    ((btcs) da2.f164949b).f148312a = str45;
                    if (btej.f164950c) {
                        btej.mo74035c();
                        btej.f164950c = false;
                    }
                    btcs btcs = (btcs) da2.mo74062i();
                    btcs.getClass();
                    ((btek) btej.f164949b).f148528a = btcs;
                    if (strArr != null) {
                        try {
                            btej.mo70753a(Arrays.asList(strArr));
                        } catch (chuw | gid e) {
                            th = e;
                        } catch (RemoteException e2) {
                            e = e2;
                            remoteException = e;
                            context4 = "succeed";
                            str10 = str44;
                            str11 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                            andd4 = andd6;
                            str13 = "running";
                            str12 = str47;
                            andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                            Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                            almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                            str = str10;
                            str2 = str11;
                            r2 = context4;
                            alpl alpl3 = alpm.f74027u;
                            Intent intent2 = new Intent(str2);
                            intent2.setPackage(str);
                            intent2.putExtra(str3, false);
                            intent2.putExtra((String) r2, false);
                            alpl3.f74019a.sendBroadcast(intent2);
                            return new Pair(amqv.f75779e, null);
                        } catch (OperationApplicationException e3) {
                            e = e3;
                            operationApplicationException = e;
                            context5 = "succeed";
                            str14 = str44;
                            str15 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                            andd5 = andd6;
                            str3 = "running";
                            str16 = str47;
                            andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                            Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                            almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                            str = str14;
                            str2 = str15;
                            r2 = context5;
                            alpl alpl32 = alpm.f74027u;
                            Intent intent22 = new Intent(str2);
                            intent22.setPackage(str);
                            intent22.putExtra(str3, false);
                            intent22.putExtra((String) r2, false);
                            alpl32.f74019a.sendBroadcast(intent22);
                            return new Pair(amqv.f75779e, null);
                        } catch (Exception e4) {
                            e = e4;
                            exc = e;
                            context6 = "succeed";
                            str17 = str44;
                            str18 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                            str44 = "running";
                            andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                            Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                            str = str17;
                            str2 = str18;
                            r2 = context6;
                            alpl alpl322 = alpm.f74027u;
                            Intent intent222 = new Intent(str2);
                            intent222.setPackage(str);
                            intent222.putExtra(str3, false);
                            intent222.putExtra((String) r2, false);
                            alpl322.f74019a.sendBroadcast(intent222);
                            return new Pair(amqv.f75779e, null);
                        }
                    }
                    if (btej.f164950c) {
                        btej.mo74035c();
                        btej.f164950c = false;
                    }
                    ((btek) btej.f164949b).f148531e = 0;
                    if (str46 != null) {
                        if (btej.f164950c) {
                            btej.mo74035c();
                            btej.f164950c = false;
                        }
                        str46.getClass();
                        ((btek) btej.f164949b).f148530c = str46;
                    }
                    ampl ampl = a2.f75684b;
                    btek btek = (btek) btej.mo74062i();
                    amig.m62939a();
                    long longValue = ((Long) amfk.f74861a.mo41191a()).longValue();
                    chtv chtv = ampl.f75679n;
                    if (chtv != null) {
                        a = chtv;
                    } else {
                        String str48 = "google.internal.people.v2.InternalPeopleService/RestoreDeviceContacts";
                        chtv a4 = chtv.m149566a(chtu.UNARY, str48, ciie.m150370a(btek.f148526d), ciie.m150370a(btem.f148532c));
                        ampl.f75679n = a4;
                        a2 = str48;
                        a = a4;
                    }
                    btem = (btem) ampl.f75682a.mo25553a(ampl.f75679n, a3, btek, longValue, TimeUnit.MILLISECONDS);
                    alpm.f74026t.mo40527a(context25, "fetch_contacts", true);
                    alpl alpl4 = alpm.f74027u;
                    Intent intent3 = new Intent("com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED");
                    intent3.setPackage(str44);
                    intent3.putExtra("running", true);
                    intent3.putExtra("phase", 1);
                    alpl4.f74019a.sendBroadcast(intent3);
                    alpm.f74026t.mo40526a();
                    str30 = alpm.f74022e;
                    alpl = alpm.f74027u;
                } catch (gid e5) {
                    e = e5;
                    th = e;
                    Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", th);
                    throw th;
                } catch (chuw e6) {
                    e = e6;
                    th = e;
                    Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", th);
                    throw th;
                } catch (RemoteException e7) {
                } catch (OperationApplicationException e8) {
                } catch (Exception e9) {
                }
            } catch (gid e10) {
                e = e10;
                th = e;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", th);
                throw th;
            } catch (chuw e11) {
                e = e11;
                th = e;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", th);
                throw th;
            } catch (RemoteException e12) {
                e = e12;
                context12 = "succeed";
                str26 = str44;
                andd6 = a;
                str44 = "running";
                str27 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                remoteException = e;
                str12 = str47;
                String str49 = str26;
                String str50 = str27;
                Context context26 = context12;
                andd4 = andd6;
                str10 = str49;
                str11 = str50;
                context4 = context26;
                andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                str = str10;
                str2 = str11;
                r2 = context4;
                alpl alpl3222 = alpm.f74027u;
                Intent intent2222 = new Intent(str2);
                intent2222.setPackage(str);
                intent2222.putExtra(str3, false);
                intent2222.putExtra((String) r2, false);
                alpl3222.f74019a.sendBroadcast(intent2222);
                return new Pair(amqv.f75779e, null);
            } catch (OperationApplicationException e13) {
                e = e13;
                context13 = "succeed";
                str28 = str44;
                andd6 = a;
                str44 = "running";
                str29 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                operationApplicationException = e;
                str16 = str47;
                String str51 = str28;
                String str52 = str29;
                Context context27 = context13;
                andd5 = andd6;
                str14 = str51;
                str15 = str52;
                context5 = context27;
                andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                str = str14;
                str2 = str15;
                r2 = context5;
                alpl alpl32222 = alpm.f74027u;
                Intent intent22222 = new Intent(str2);
                intent22222.setPackage(str);
                intent22222.putExtra(str3, false);
                intent22222.putExtra((String) r2, false);
                alpl32222.f74019a.sendBroadcast(intent22222);
                return new Pair(amqv.f75779e, null);
            } catch (Exception e14) {
                e = e14;
                Context context28 = "succeed";
                String str53 = str44;
                andd6 = a;
                str44 = "running";
                str20 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                str19 = str53;
                context7 = context28;
                exc = e;
                str17 = str19;
                str18 = str20;
                context6 = context7;
                andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                str = str17;
                str2 = str18;
                r2 = context6;
                alpl alpl322222 = alpm.f74027u;
                Intent intent222222 = new Intent(str2);
                intent222222.setPackage(str);
                intent222222.putExtra(str3, false);
                intent222222.putExtra((String) r2, false);
                alpl322222.f74019a.sendBroadcast(intent222222);
                return new Pair(amqv.f75779e, null);
            }
            try {
                almn almn2 = new almn(bmza.m108659b(bmvy.f131119a));
                almn2.mo40526a();
                btem a5 = alpn.mo40630a();
                almn2.mo40527a(alpn.f74033f, "write_contacts_helper:read_existing_contacts", false);
                alpj alpj = alpn.f74034g;
                if (a5 != null) {
                    alpj.f74012a = new SparseArray();
                    Iterator it = a5.f148534a.iterator();
                    while (it.hasNext()) {
                        btfi btfi = (btfi) it.next();
                        Iterator it2 = it;
                        int hashCode = Arrays.hashCode(new Object[]{alpj.m61470a(btfi)});
                        Set set = (Set) alpj.f74012a.get(hashCode);
                        if (set == null) {
                            set = new HashSet();
                        }
                        set.add(btfi);
                        alpj.f74012a.put(hashCode, set);
                        it = it2;
                    }
                }
                alpn.f74028e = new andg(alpn.f74033f).mo41730a();
                ? r22 = "com.google";
                if (((Boolean) amgi.f74885a.mo41191a()).booleanValue()) {
                    if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83385cI()).booleanValue()) {
                        HashSet hashSet = new HashSet();
                        Iterator it3 = btem.f148534a.iterator();
                        while (it3.hasNext()) {
                            btfi btfi2 = (btfi) it3.next();
                            if (!btfi2.f148664g.isEmpty()) {
                                if (!r22.equals(btfi2.f148664g)) {
                                    Iterator it4 = it3;
                                    if (!alpn.f74028e.contains(btfi2.f148664g)) {
                                        hashSet.add(btfi2);
                                        it3 = it4;
                                    } else {
                                        it3 = it4;
                                    }
                                }
                            }
                        }
                        btel btel = (btel) btem.f148532c.mo74144da();
                        btel.mo70754a(hashSet);
                        alpn.f74034g.mo40628a((btem) btel.mo74062i());
                    } else {
                        alpn.f74034g.mo40628a(btem);
                    }
                }
                almn2.mo40526a();
                bxwc bxwc2 = btem.f148534a;
                btfb btfb = btem.f148535b;
                if (btfb == null) {
                    btfb = btfb.f148607b;
                }
                String str54 = "";
                if (btfb != null) {
                    if (!btfb.f148609a.isEmpty()) {
                        str54 = btfb.f148609a;
                    }
                }
                String format = String.format(alpn.f74033f.getString(C0126R.string.people_contacts_restore_group_label), str54);
                try {
                    cursor = alpn.f74033f.getContentResolver().query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "account_name=? AND account_type=? AND title=?", new String[]{str30, r22, format}, null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                long j3 = cursor.getLong(0);
                                cursor.close();
                                almn = almn2;
                                j = j3;
                                if (j == -2) {
                                    j = alpn.mo40629a(format, str30);
                                }
                                int size = bxwc2.size();
                                ArrayList arrayList = new ArrayList();
                                SparseArray sparseArray2 = new SparseArray();
                                boolean booleanValue = ((Boolean) amgi.f74885a.mo41191a()).booleanValue();
                                boolean booleanValue2 = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83263T()).booleanValue();
                                str36 = "phase";
                                context24 = "succeed";
                                doubleValue = ((Double) amht.f74922a.mo41191a()).doubleValue();
                                int i12 = -1;
                                str37 = "running";
                                str38 = str44;
                                str39 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                                i = 0;
                                str44 = 0;
                                i2 = 0;
                                i3 = 0;
                                int i13 = 0;
                                int i14 = 0;
                                int i15 = 0;
                                r10 = alpl;
                                while (true) {
                                    alpl alpl5 = a2;
                                    try {
                                        if (i < bxwc2.size()) {
                                            break;
                                        }
                                        try {
                                            btfi btfi3 = (btfi) bxwc2.get(i);
                                            if (btfi3 != null) {
                                                bxwc = bxwc2;
                                                if (!btfi3.f148664g.isEmpty() || !btfi3.f148658a.isEmpty() || !btfi3.f148672o.isEmpty() || btfi3.f148661d.size() != 0 || btfi3.f148662e.size() != 0) {
                                                    z = false;
                                                    z2 = !z;
                                                    if (z2) {
                                                        z3 = z2;
                                                        if (!btfi3.f148664g.isEmpty()) {
                                                            i4 = i2;
                                                            if (alpn.f74028e.contains(btfi3.f148664g)) {
                                                                z3 = false;
                                                            }
                                                        } else {
                                                            i4 = i2;
                                                        }
                                                    } else {
                                                        z3 = z2;
                                                        i4 = i2;
                                                    }
                                                    if (!booleanValue) {
                                                        d = doubleValue;
                                                        i5 = i;
                                                        i6 = str44;
                                                    } else if (!z3) {
                                                        d = doubleValue;
                                                        i5 = i;
                                                        i6 = str44;
                                                    } else if (r22.equals(btfi3.f148664g) || (sparseArray = alpn.f74034g.f74013b) == null) {
                                                        d = doubleValue;
                                                        i5 = i;
                                                        i6 = str44;
                                                    } else {
                                                        i6 = str44;
                                                        Set set2 = (Set) sparseArray.get(Arrays.hashCode(new Object[]{btfi3.f148658a}));
                                                        if (set2 != null) {
                                                            Iterator it5 = set2.iterator();
                                                            while (true) {
                                                                if (!it5.hasNext()) {
                                                                    d = doubleValue;
                                                                    i5 = i;
                                                                    break;
                                                                }
                                                                btfi btfi4 = (btfi) it5.next();
                                                                Iterator it6 = it5;
                                                                if (sdg.m34949a(btfi3.f148658a, btfi4.f148658a)) {
                                                                    d = doubleValue;
                                                                    Set a6 = alpj.m61471a((btfd[]) btfi3.f148661d.toArray(new btfd[0]));
                                                                    Set a7 = alpj.m61471a((btfd[]) btfi4.f148661d.toArray(new btfd[0]));
                                                                    if (a7.containsAll(a6)) {
                                                                        boolean z4 = !a6.containsAll(a7);
                                                                        Set a8 = alpj.m61472a((btff[]) btfi3.f148662e.toArray(new btff[0]));
                                                                        i5 = i;
                                                                        Set a9 = alpj.m61472a((btff[]) btfi4.f148662e.toArray(new btff[0]));
                                                                        if (a9.containsAll(a8)) {
                                                                            if (!z4) {
                                                                                if (!a8.containsAll(a9)) {
                                                                                    z4 = true;
                                                                                }
                                                                            }
                                                                            Set a10 = alpj.m61473a((btfg[]) btfi3.f148663f.toArray(new btfg[0]));
                                                                            Set a11 = alpj.m61473a((btfg[]) btfi4.f148663f.toArray(new btfg[0]));
                                                                            if (!a11.containsAll(a10)) {
                                                                                it5 = it6;
                                                                                doubleValue = d;
                                                                                i = i5;
                                                                            } else if (z4 || !a10.containsAll(a11)) {
                                                                                z3 = false;
                                                                            } else {
                                                                                it5 = it6;
                                                                                doubleValue = d;
                                                                                i = i5;
                                                                            }
                                                                        } else {
                                                                            it5 = it6;
                                                                            doubleValue = d;
                                                                            i = i5;
                                                                        }
                                                                    } else {
                                                                        it5 = it6;
                                                                        doubleValue = d;
                                                                    }
                                                                } else {
                                                                    it5 = it6;
                                                                }
                                                            }
                                                            z3 = false;
                                                        } else {
                                                            d = doubleValue;
                                                            i5 = i;
                                                        }
                                                    }
                                                    Set set3 = (Set) sparseArray2.get(Arrays.hashCode(new Object[]{alpj.m61470a(btfi3)}));
                                                    if (booleanValue2) {
                                                        if (z3) {
                                                            if (!r22.equals(btfi3.f148664g) && set3 != null && alpj.m61474a(btfi3, set3)) {
                                                                obj6 = r22;
                                                                str42 = str30;
                                                                a2 = btfi3;
                                                            }
                                                            alpj alpj2 = alpn.f74034g;
                                                            if (alpj2.f74012a != null) {
                                                                Set a12 = alpj.m61470a(btfi3);
                                                                if (!a12.isEmpty()) {
                                                                    Set set4 = (Set) alpj2.f74012a.get(Arrays.hashCode(new Object[]{a12}));
                                                                    if (set4 != null) {
                                                                        if (alpj.m61474a(btfi3, set4)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            int size2 = arrayList.size();
                                                            if (!TextUtils.isEmpty(str30)) {
                                                                obj7 = r22;
                                                            } else {
                                                                obj7 = null;
                                                            }
                                                            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", obj7).withValue("account_name", str30).withYieldAllowed(true).build());
                                                            if (!btfi3.f148658a.isEmpty()) {
                                                                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", btfi3.f148658a).build());
                                                            }
                                                            if (!cgbe.f186279a.mo6606a().mo83255L()) {
                                                                obj6 = r22;
                                                            } else if (alpn.f74032d) {
                                                                if (!btfi3.f148674q.mo73779j()) {
                                                                    bArr = btfi3.f148674q.getKey();
                                                                    i13++;
                                                                } else {
                                                                    bArr = !btfi3.f148673p.mo73779j() ? btfi3.f148673p.getKey() : null;
                                                                }
                                                                if (bArr != null) {
                                                                    obj6 = r22;
                                                                    arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", bArr).build());
                                                                } else {
                                                                    obj6 = r22;
                                                                }
                                                            } else {
                                                                obj6 = r22;
                                                            }
                                                            Iterator it7 = btfi3.f148662e.iterator();
                                                            btfi btfi5 = btfi3;
                                                            while (true) {
                                                                str42 = str30;
                                                                if (!it7.hasNext()) {
                                                                    break;
                                                                }
                                                                btfi btfi6 = btfi5;
                                                                btff btff = (btff) it7.next();
                                                                int i16 = size2;
                                                                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", btff.f148638a).withValue("data2", Integer.valueOf(btff.f148642e)).withValue("data3", btff.f148639b).build());
                                                                str30 = str42;
                                                                btfi5 = btfi6;
                                                                size2 = i16;
                                                            }
                                                            btfi btfi7 = btfi5;
                                                            for (Iterator it8 = btfi5.f148661d.iterator(); it8.hasNext(); it8 = it8) {
                                                                btfd btfd = (btfd) it8.next();
                                                                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", btfd.f148615a).withValue("data2", Integer.valueOf(btfd.f148619e)).withValue("data3", btfd.f148616b).build());
                                                                btfi7 = btfi7;
                                                            }
                                                            btfi btfi8 = btfi7;
                                                            for (Iterator it9 = btfi7.f148663f.iterator(); it9.hasNext(); it9 = it9) {
                                                                btfg btfg = (btfg) it9.next();
                                                                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data1", btfg.f148647a).withValue("data2", Integer.valueOf(btfg.f148649c)).withValue("data3", btfg.f148648b).build());
                                                                btfi8 = btfi8;
                                                            }
                                                            if (!btfi8.f148672o.isEmpty()) {
                                                                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", btfi8.f148672o).build());
                                                            }
                                                            if (j != -1) {
                                                                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", size2).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Long.valueOf(j)).build());
                                                            }
                                                            i3++;
                                                            if (!alpn.m61478a(btfi8)) {
                                                                i14++;
                                                            } else {
                                                                i15++;
                                                            }
                                                            int hashCode2 = Arrays.hashCode(new Object[]{alpj.m61470a(btfi8)});
                                                            Set set5 = (Set) sparseArray2.get(hashCode2);
                                                            if (set5 == null) {
                                                                set5 = new HashSet();
                                                            }
                                                            set5.add(btfi8);
                                                            sparseArray2.put(hashCode2, set5);
                                                            a2 = btfi8;
                                                        } else {
                                                            obj6 = r22;
                                                            str42 = str30;
                                                            a2 = btfi3;
                                                        }
                                                        i7 = i3;
                                                        int i17 = i13;
                                                        if (i7 < alpn.f74029a) {
                                                            if (i17 < alpn.f74030b) {
                                                                i9 = i5;
                                                                if (i9 < size - 1) {
                                                                    i13 = i17;
                                                                    i8 = i9;
                                                                    str43 = str36;
                                                                    str44 = str37;
                                                                    a2 = str38;
                                                                    str30 = str39;
                                                                    alpl2 = alpl5;
                                                                    r22 = d;
                                                                    j2 = j;
                                                                    i = i8 + 1;
                                                                    str37 = str44;
                                                                    str36 = str43;
                                                                    str38 = a2;
                                                                    j = j2;
                                                                    i2 = i4;
                                                                    str44 = i6;
                                                                    i3 = i7;
                                                                    r10 = alpl2;
                                                                    str39 = str30;
                                                                    bxwc2 = bxwc;
                                                                    str30 = str42;
                                                                    doubleValue = r22;
                                                                    r22 = obj6;
                                                                }
                                                                if (i7 <= 0) {
                                                                    d2 = d;
                                                                } else {
                                                                    d3 = d;
                                                                    alpn.mo40631a(arrayList, d3);
                                                                    d2 = d3;
                                                                }
                                                                i12 = i9;
                                                                r22 = d2;
                                                                str44 = i6 + i14;
                                                                int i18 = i4 + i15;
                                                                if (alpl5 == null) {
                                                                    a2 = str38;
                                                                    str30 = str39;
                                                                    alpl2 = alpl5;
                                                                    i10 = str44;
                                                                    j2 = j;
                                                                    str44 = str37;
                                                                    i11 = i18;
                                                                    str43 = str36;
                                                                } else {
                                                                    int i19 = i12 + 1;
                                                                    str30 = str39;
                                                                    try {
                                                                        intent = new Intent((String) str30);
                                                                        a2 = str38;
                                                                    } catch (InterruptedException e15) {
                                                                        str40 = str37;
                                                                        a2 = str38;
                                                                        context25 = context24;
                                                                        a2 = a2;
                                                                        str30 = str30;
                                                                        str44 = str40;
                                                                        alpm = this;
                                                                        try {
                                                                            alpm.f74026t.mo40527a(context, "write_contacts", false);
                                                                            almk a13 = almk.m61263a();
                                                                            int i20 = alpn.f74035h;
                                                                            da = amkv.f75106m.mo74144da();
                                                                            if (!da.f164950c) {
                                                                            }
                                                                            amkv amkv = (amkv) da.f164949b;
                                                                            amkv.f75108a |= 1024;
                                                                            amkv.f75114g = i20;
                                                                            a13.mo40514a((amkv) da.mo74062i());
                                                                            String str55 = alpm.f74020c;
                                                                            currentTimeMillis = System.currentTimeMillis();
                                                                            if (currentTimeMillis >= 0) {
                                                                            }
                                                                            return new Pair(amqv.f75777c, new Bundle());
                                                                        } catch (gid e16) {
                                                                            e = e16;
                                                                            str23 = a2;
                                                                            andd8 = a;
                                                                            context10 = context25;
                                                                            gid = e;
                                                                            str4 = str47;
                                                                            str = str23;
                                                                            andd7 = andd8;
                                                                            context8 = context10;
                                                                            andd2 = andd6;
                                                                            andd = andd7;
                                                                            context2 = context8;
                                                                            andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                                                                            almk.m61263a().mo40522a("restore_error:authentication_failure");
                                                                            str2 = andd;
                                                                            r2 = context2;
                                                                            alpl alpl3222222 = alpm.f74027u;
                                                                            Intent intent2222222 = new Intent(str2);
                                                                            intent2222222.setPackage(str);
                                                                            intent2222222.putExtra(str3, false);
                                                                            intent2222222.putExtra((String) r2, false);
                                                                            alpl3222222.f74019a.sendBroadcast(intent2222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (chuw e17) {
                                                                            e = e17;
                                                                            str24 = a2;
                                                                            str25 = a;
                                                                            context11 = context25;
                                                                            chuw = e;
                                                                            str8 = str47;
                                                                            str21 = str24;
                                                                            str22 = str25;
                                                                            context9 = context11;
                                                                            andd3 = andd6;
                                                                            str6 = str21;
                                                                            str7 = str22;
                                                                            context3 = context9;
                                                                            andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                                                                            almk a14 = almk.m61263a();
                                                                            String valueOf = String.valueOf(chuw.f189236a.f189233s);
                                                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                                                                            sb.append("restore_error:status_error:");
                                                                            sb.append(valueOf);
                                                                            a14.mo40522a(sb.toString());
                                                                            str = str6;
                                                                            str2 = str7;
                                                                            r2 = context3;
                                                                            alpl alpl32222222 = alpm.f74027u;
                                                                            Intent intent22222222 = new Intent(str2);
                                                                            intent22222222.setPackage(str);
                                                                            intent22222222.putExtra(str3, false);
                                                                            intent22222222.putExtra((String) r2, false);
                                                                            alpl32222222.f74019a.sendBroadcast(intent22222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (RemoteException e18) {
                                                                            e = e18;
                                                                            str26 = a2;
                                                                            str27 = a;
                                                                            context12 = context25;
                                                                            remoteException = e;
                                                                            str12 = str47;
                                                                            String str492 = str26;
                                                                            String str502 = str27;
                                                                            Context context262 = context12;
                                                                            andd4 = andd6;
                                                                            str10 = str492;
                                                                            str11 = str502;
                                                                            context4 = context262;
                                                                            andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                                                                            almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                                                                            str = str10;
                                                                            str2 = str11;
                                                                            r2 = context4;
                                                                            alpl alpl322222222 = alpm.f74027u;
                                                                            Intent intent222222222 = new Intent(str2);
                                                                            intent222222222.setPackage(str);
                                                                            intent222222222.putExtra(str3, false);
                                                                            intent222222222.putExtra((String) r2, false);
                                                                            alpl322222222.f74019a.sendBroadcast(intent222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (OperationApplicationException e19) {
                                                                            e = e19;
                                                                            str28 = a2;
                                                                            str29 = a;
                                                                            context13 = context25;
                                                                            operationApplicationException = e;
                                                                            str16 = str47;
                                                                            String str512 = str28;
                                                                            String str522 = str29;
                                                                            Context context272 = context13;
                                                                            andd5 = andd6;
                                                                            str14 = str512;
                                                                            str15 = str522;
                                                                            context5 = context272;
                                                                            andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                                                                            almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                                                                            str = str14;
                                                                            str2 = str15;
                                                                            r2 = context5;
                                                                            alpl alpl3222222222 = alpm.f74027u;
                                                                            Intent intent2222222222 = new Intent(str2);
                                                                            intent2222222222.setPackage(str);
                                                                            intent2222222222.putExtra(str3, false);
                                                                            intent2222222222.putExtra((String) r2, false);
                                                                            alpl3222222222.f74019a.sendBroadcast(intent2222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (Exception e20) {
                                                                            e = e20;
                                                                            str19 = a2;
                                                                            str20 = a;
                                                                            context7 = context25;
                                                                            exc = e;
                                                                            str17 = str19;
                                                                            str18 = str20;
                                                                            context6 = context7;
                                                                            andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                                                                            str = str17;
                                                                            str2 = str18;
                                                                            r2 = context6;
                                                                            alpl alpl32222222222 = alpm.f74027u;
                                                                            Intent intent22222222222 = new Intent(str2);
                                                                            intent22222222222.setPackage(str);
                                                                            intent22222222222.putExtra(str3, false);
                                                                            intent22222222222.putExtra((String) r2, false);
                                                                            alpl32222222222.f74019a.sendBroadcast(intent22222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        }
                                                                    } catch (gid e21) {
                                                                        e = e21;
                                                                        str5 = str37;
                                                                        a2 = str38;
                                                                        alpm = this;
                                                                        gid = e;
                                                                        str4 = str47;
                                                                        andd2 = andd6;
                                                                        context2 = context24;
                                                                        str = a2;
                                                                        andd = str30;
                                                                        andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                                                                        almk.m61263a().mo40522a("restore_error:authentication_failure");
                                                                        str2 = andd;
                                                                        r2 = context2;
                                                                        alpl alpl322222222222 = alpm.f74027u;
                                                                        Intent intent222222222222 = new Intent(str2);
                                                                        intent222222222222.setPackage(str);
                                                                        intent222222222222.putExtra(str3, false);
                                                                        intent222222222222.putExtra((String) r2, false);
                                                                        alpl322222222222.f74019a.sendBroadcast(intent222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (chuw e22) {
                                                                        e = e22;
                                                                        str9 = str37;
                                                                        a2 = str38;
                                                                        alpm = this;
                                                                        chuw = e;
                                                                        str8 = str47;
                                                                        andd3 = andd6;
                                                                        context3 = context24;
                                                                        str6 = a2;
                                                                        str7 = str30;
                                                                        andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                                                                        almk a142 = almk.m61263a();
                                                                        String valueOf2 = String.valueOf(chuw.f189236a.f189233s);
                                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                                                                        sb2.append("restore_error:status_error:");
                                                                        sb2.append(valueOf2);
                                                                        a142.mo40522a(sb2.toString());
                                                                        str = str6;
                                                                        str2 = str7;
                                                                        r2 = context3;
                                                                        alpl alpl3222222222222 = alpm.f74027u;
                                                                        Intent intent2222222222222 = new Intent(str2);
                                                                        intent2222222222222.setPackage(str);
                                                                        intent2222222222222.putExtra(str3, false);
                                                                        intent2222222222222.putExtra((String) r2, false);
                                                                        alpl3222222222222.f74019a.sendBroadcast(intent2222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (RemoteException e23) {
                                                                        e = e23;
                                                                        str13 = str37;
                                                                        a2 = str38;
                                                                        alpm = this;
                                                                        remoteException = e;
                                                                        str12 = str47;
                                                                        andd4 = andd6;
                                                                        context4 = context24;
                                                                        str10 = a2;
                                                                        str11 = str30;
                                                                        andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                                                                        almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                                                                        str = str10;
                                                                        str2 = str11;
                                                                        r2 = context4;
                                                                        alpl alpl32222222222222 = alpm.f74027u;
                                                                        Intent intent22222222222222 = new Intent(str2);
                                                                        intent22222222222222.setPackage(str);
                                                                        intent22222222222222.putExtra(str3, false);
                                                                        intent22222222222222.putExtra((String) r2, false);
                                                                        alpl32222222222222.f74019a.sendBroadcast(intent22222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (OperationApplicationException e24) {
                                                                        e = e24;
                                                                        str3 = str37;
                                                                        a2 = str38;
                                                                        alpm = this;
                                                                        operationApplicationException = e;
                                                                        str16 = str47;
                                                                        andd5 = andd6;
                                                                        context5 = context24;
                                                                        str14 = a2;
                                                                        str15 = str30;
                                                                        andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                                                                        almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                                                                        str = str14;
                                                                        str2 = str15;
                                                                        r2 = context5;
                                                                        alpl alpl322222222222222 = alpm.f74027u;
                                                                        Intent intent222222222222222 = new Intent(str2);
                                                                        intent222222222222222.setPackage(str);
                                                                        intent222222222222222.putExtra(str3, false);
                                                                        intent222222222222222.putExtra((String) r2, false);
                                                                        alpl322222222222222.f74019a.sendBroadcast(intent222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (Exception e25) {
                                                                        e = e25;
                                                                        str41 = str37;
                                                                        a2 = str38;
                                                                        alpm = this;
                                                                        exc = e;
                                                                        context6 = context24;
                                                                        str17 = a2;
                                                                        str18 = str30;
                                                                        str44 = str41;
                                                                        andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                                                                        str = str17;
                                                                        str2 = str18;
                                                                        r2 = context6;
                                                                        alpl alpl3222222222222222 = alpm.f74027u;
                                                                        Intent intent2222222222222222 = new Intent(str2);
                                                                        intent2222222222222222.setPackage(str);
                                                                        intent2222222222222222.putExtra(str3, false);
                                                                        intent2222222222222222.putExtra((String) r2, false);
                                                                        alpl3222222222222222.f74019a.sendBroadcast(intent2222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    }
                                                                    try {
                                                                        intent.setPackage(a2);
                                                                        i10 = str44;
                                                                        str44 = str37;
                                                                        i11 = i18;
                                                                        try {
                                                                            intent.putExtra((String) str44, true);
                                                                            j2 = j;
                                                                            str43 = str36;
                                                                            intent.putExtra(str43, 2);
                                                                            intent.putExtra("total_contacts", size);
                                                                            intent.putExtra("restored_contacts", i19);
                                                                            alpl2 = alpl5;
                                                                            alpl2.f74019a.sendBroadcast(intent);
                                                                        } catch (InterruptedException e26) {
                                                                        } catch (gid e27) {
                                                                            e = e27;
                                                                            context14 = context24;
                                                                            alpm = this;
                                                                            str23 = a2;
                                                                            andd8 = str30;
                                                                            context10 = context14;
                                                                            gid = e;
                                                                            str4 = str47;
                                                                            str = str23;
                                                                            andd7 = andd8;
                                                                            context8 = context10;
                                                                            andd2 = andd6;
                                                                            andd = andd7;
                                                                            context2 = context8;
                                                                            andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                                                                            almk.m61263a().mo40522a("restore_error:authentication_failure");
                                                                            str2 = andd;
                                                                            r2 = context2;
                                                                            alpl alpl32222222222222222 = alpm.f74027u;
                                                                            Intent intent22222222222222222 = new Intent(str2);
                                                                            intent22222222222222222.setPackage(str);
                                                                            intent22222222222222222.putExtra(str3, false);
                                                                            intent22222222222222222.putExtra((String) r2, false);
                                                                            alpl32222222222222222.f74019a.sendBroadcast(intent22222222222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (chuw e28) {
                                                                            e = e28;
                                                                            context16 = context24;
                                                                            alpm = this;
                                                                            str24 = a2;
                                                                            str25 = str30;
                                                                            context11 = context16;
                                                                            chuw = e;
                                                                            str8 = str47;
                                                                            str21 = str24;
                                                                            str22 = str25;
                                                                            context9 = context11;
                                                                            andd3 = andd6;
                                                                            str6 = str21;
                                                                            str7 = str22;
                                                                            context3 = context9;
                                                                            andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                                                                            almk a1422 = almk.m61263a();
                                                                            String valueOf22 = String.valueOf(chuw.f189236a.f189233s);
                                                                            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 27);
                                                                            sb22.append("restore_error:status_error:");
                                                                            sb22.append(valueOf22);
                                                                            a1422.mo40522a(sb22.toString());
                                                                            str = str6;
                                                                            str2 = str7;
                                                                            r2 = context3;
                                                                            alpl alpl322222222222222222 = alpm.f74027u;
                                                                            Intent intent222222222222222222 = new Intent(str2);
                                                                            intent222222222222222222.setPackage(str);
                                                                            intent222222222222222222.putExtra(str3, false);
                                                                            intent222222222222222222.putExtra((String) r2, false);
                                                                            alpl322222222222222222.f74019a.sendBroadcast(intent222222222222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (RemoteException e29) {
                                                                            e = e29;
                                                                            context18 = context24;
                                                                            alpm = this;
                                                                            str26 = a2;
                                                                            str27 = str30;
                                                                            context12 = context18;
                                                                            remoteException = e;
                                                                            str12 = str47;
                                                                            String str4922 = str26;
                                                                            String str5022 = str27;
                                                                            Context context2622 = context12;
                                                                            andd4 = andd6;
                                                                            str10 = str4922;
                                                                            str11 = str5022;
                                                                            context4 = context2622;
                                                                            andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                                                                            almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                                                                            str = str10;
                                                                            str2 = str11;
                                                                            r2 = context4;
                                                                            alpl alpl3222222222222222222 = alpm.f74027u;
                                                                            Intent intent2222222222222222222 = new Intent(str2);
                                                                            intent2222222222222222222.setPackage(str);
                                                                            intent2222222222222222222.putExtra(str3, false);
                                                                            intent2222222222222222222.putExtra((String) r2, false);
                                                                            alpl3222222222222222222.f74019a.sendBroadcast(intent2222222222222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (OperationApplicationException e30) {
                                                                            e = e30;
                                                                            context20 = context24;
                                                                            alpm = this;
                                                                            str28 = a2;
                                                                            str29 = str30;
                                                                            context13 = context20;
                                                                            operationApplicationException = e;
                                                                            str16 = str47;
                                                                            String str5122 = str28;
                                                                            String str5222 = str29;
                                                                            Context context2722 = context13;
                                                                            andd5 = andd6;
                                                                            str14 = str5122;
                                                                            str15 = str5222;
                                                                            context5 = context2722;
                                                                            andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                                                                            almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                                                                            str = str14;
                                                                            str2 = str15;
                                                                            r2 = context5;
                                                                            alpl alpl32222222222222222222 = alpm.f74027u;
                                                                            Intent intent22222222222222222222 = new Intent(str2);
                                                                            intent22222222222222222222.setPackage(str);
                                                                            intent22222222222222222222.putExtra(str3, false);
                                                                            intent22222222222222222222.putExtra((String) r2, false);
                                                                            alpl32222222222222222222.f74019a.sendBroadcast(intent22222222222222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        } catch (Exception e31) {
                                                                            e = e31;
                                                                            context22 = context24;
                                                                            alpm = this;
                                                                            str19 = a2;
                                                                            str20 = str30;
                                                                            context7 = context22;
                                                                            exc = e;
                                                                            str17 = str19;
                                                                            str18 = str20;
                                                                            context6 = context7;
                                                                            andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                            Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                                                                            str = str17;
                                                                            str2 = str18;
                                                                            r2 = context6;
                                                                            alpl alpl322222222222222222222 = alpm.f74027u;
                                                                            Intent intent222222222222222222222 = new Intent(str2);
                                                                            intent222222222222222222222.setPackage(str);
                                                                            intent222222222222222222222.putExtra(str3, false);
                                                                            intent222222222222222222222.putExtra((String) r2, false);
                                                                            alpl322222222222222222222.f74019a.sendBroadcast(intent222222222222222222222);
                                                                            return new Pair(amqv.f75779e, null);
                                                                        }
                                                                    } catch (InterruptedException e32) {
                                                                        str40 = str37;
                                                                        context25 = context24;
                                                                        a2 = a2;
                                                                        str30 = str30;
                                                                        str44 = str40;
                                                                        alpm = this;
                                                                        alpm.f74026t.mo40527a(context, "write_contacts", false);
                                                                        almk a132 = almk.m61263a();
                                                                        int i202 = alpn.f74035h;
                                                                        da = amkv.f75106m.mo74144da();
                                                                        if (!da.f164950c) {
                                                                        }
                                                                        amkv amkv2 = (amkv) da.f164949b;
                                                                        amkv2.f75108a |= 1024;
                                                                        amkv2.f75114g = i202;
                                                                        a132.mo40514a((amkv) da.mo74062i());
                                                                        String str552 = alpm.f74020c;
                                                                        currentTimeMillis = System.currentTimeMillis();
                                                                        if (currentTimeMillis >= 0) {
                                                                        }
                                                                        return new Pair(amqv.f75777c, new Bundle());
                                                                    } catch (gid e33) {
                                                                        e = e33;
                                                                        str5 = str37;
                                                                        alpm = this;
                                                                        gid = e;
                                                                        str4 = str47;
                                                                        andd2 = andd6;
                                                                        context2 = context24;
                                                                        str = a2;
                                                                        andd = str30;
                                                                        andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                                                                        almk.m61263a().mo40522a("restore_error:authentication_failure");
                                                                        str2 = andd;
                                                                        r2 = context2;
                                                                        alpl alpl3222222222222222222222 = alpm.f74027u;
                                                                        Intent intent2222222222222222222222 = new Intent(str2);
                                                                        intent2222222222222222222222.setPackage(str);
                                                                        intent2222222222222222222222.putExtra(str3, false);
                                                                        intent2222222222222222222222.putExtra((String) r2, false);
                                                                        alpl3222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (chuw e34) {
                                                                        e = e34;
                                                                        str9 = str37;
                                                                        alpm = this;
                                                                        chuw = e;
                                                                        str8 = str47;
                                                                        andd3 = andd6;
                                                                        context3 = context24;
                                                                        str6 = a2;
                                                                        str7 = str30;
                                                                        andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                                                                        almk a14222 = almk.m61263a();
                                                                        String valueOf222 = String.valueOf(chuw.f189236a.f189233s);
                                                                        StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 27);
                                                                        sb222.append("restore_error:status_error:");
                                                                        sb222.append(valueOf222);
                                                                        a14222.mo40522a(sb222.toString());
                                                                        str = str6;
                                                                        str2 = str7;
                                                                        r2 = context3;
                                                                        alpl alpl32222222222222222222222 = alpm.f74027u;
                                                                        Intent intent22222222222222222222222 = new Intent(str2);
                                                                        intent22222222222222222222222.setPackage(str);
                                                                        intent22222222222222222222222.putExtra(str3, false);
                                                                        intent22222222222222222222222.putExtra((String) r2, false);
                                                                        alpl32222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (RemoteException e35) {
                                                                        e = e35;
                                                                        str13 = str37;
                                                                        alpm = this;
                                                                        remoteException = e;
                                                                        str12 = str47;
                                                                        andd4 = andd6;
                                                                        context4 = context24;
                                                                        str10 = a2;
                                                                        str11 = str30;
                                                                        andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                                                                        almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                                                                        str = str10;
                                                                        str2 = str11;
                                                                        r2 = context4;
                                                                        alpl alpl322222222222222222222222 = alpm.f74027u;
                                                                        Intent intent222222222222222222222222 = new Intent(str2);
                                                                        intent222222222222222222222222.setPackage(str);
                                                                        intent222222222222222222222222.putExtra(str3, false);
                                                                        intent222222222222222222222222.putExtra((String) r2, false);
                                                                        alpl322222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (OperationApplicationException e36) {
                                                                        e = e36;
                                                                        str3 = str37;
                                                                        alpm = this;
                                                                        operationApplicationException = e;
                                                                        str16 = str47;
                                                                        andd5 = andd6;
                                                                        context5 = context24;
                                                                        str14 = a2;
                                                                        str15 = str30;
                                                                        andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                                                                        almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                                                                        str = str14;
                                                                        str2 = str15;
                                                                        r2 = context5;
                                                                        alpl alpl3222222222222222222222222 = alpm.f74027u;
                                                                        Intent intent2222222222222222222222222 = new Intent(str2);
                                                                        intent2222222222222222222222222.setPackage(str);
                                                                        intent2222222222222222222222222.putExtra(str3, false);
                                                                        intent2222222222222222222222222.putExtra((String) r2, false);
                                                                        alpl3222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    } catch (Exception e37) {
                                                                        e = e37;
                                                                        str41 = str37;
                                                                        alpm = this;
                                                                        exc = e;
                                                                        context6 = context24;
                                                                        str17 = a2;
                                                                        str18 = str30;
                                                                        str44 = str41;
                                                                        andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                                                        Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                                                                        str = str17;
                                                                        str2 = str18;
                                                                        r2 = context6;
                                                                        alpl alpl32222222222222222222222222 = alpm.f74027u;
                                                                        Intent intent22222222222222222222222222 = new Intent(str2);
                                                                        intent22222222222222222222222222.setPackage(str);
                                                                        intent22222222222222222222222222.putExtra(str3, false);
                                                                        intent22222222222222222222222222.putExtra((String) r2, false);
                                                                        alpl32222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222);
                                                                        return new Pair(amqv.f75779e, null);
                                                                    }
                                                                }
                                                                alpn.f74035h += i7;
                                                                arrayList.clear();
                                                                i8 = i12;
                                                                i4 = i11;
                                                                i6 = i10;
                                                                i7 = 0;
                                                                i13 = 0;
                                                                i14 = 0;
                                                                i15 = 0;
                                                                i = i8 + 1;
                                                                str37 = str44;
                                                                str36 = str43;
                                                                str38 = a2;
                                                                j = j2;
                                                                i2 = i4;
                                                                str44 = i6;
                                                                i3 = i7;
                                                                r10 = alpl2;
                                                                str39 = str30;
                                                                bxwc2 = bxwc;
                                                                str30 = str42;
                                                                doubleValue = r22;
                                                                r22 = obj6;
                                                            }
                                                        }
                                                        i9 = i5;
                                                        if (i7 <= 0) {
                                                        }
                                                        i12 = i9;
                                                        r22 = d2;
                                                        str44 = i6 + i14;
                                                        int i182 = i4 + i15;
                                                        if (alpl5 == null) {
                                                        }
                                                        alpn.f74035h += i7;
                                                        arrayList.clear();
                                                        i8 = i12;
                                                        i4 = i11;
                                                        i6 = i10;
                                                        i7 = 0;
                                                        i13 = 0;
                                                        i14 = 0;
                                                        i15 = 0;
                                                        i = i8 + 1;
                                                        str37 = str44;
                                                        str36 = str43;
                                                        str38 = a2;
                                                        j = j2;
                                                        i2 = i4;
                                                        str44 = i6;
                                                        i3 = i7;
                                                        r10 = alpl2;
                                                        str39 = str30;
                                                        bxwc2 = bxwc;
                                                        str30 = str42;
                                                        doubleValue = r22;
                                                        r22 = obj6;
                                                    }
                                                    obj6 = r22;
                                                    str42 = str30;
                                                    a2 = btfi3;
                                                    i7 = i3;
                                                    int i172 = i13;
                                                    if (i7 < alpn.f74029a) {
                                                    }
                                                    i9 = i5;
                                                    if (i7 <= 0) {
                                                    }
                                                    i12 = i9;
                                                    r22 = d2;
                                                    str44 = i6 + i14;
                                                    int i1822 = i4 + i15;
                                                    if (alpl5 == null) {
                                                    }
                                                    alpn.f74035h += i7;
                                                    arrayList.clear();
                                                    i8 = i12;
                                                    i4 = i11;
                                                    i6 = i10;
                                                    i7 = 0;
                                                    i13 = 0;
                                                    i14 = 0;
                                                    i15 = 0;
                                                    i = i8 + 1;
                                                    str37 = str44;
                                                    str36 = str43;
                                                    str38 = a2;
                                                    j = j2;
                                                    i2 = i4;
                                                    str44 = i6;
                                                    i3 = i7;
                                                    r10 = alpl2;
                                                    str39 = str30;
                                                    bxwc2 = bxwc;
                                                    str30 = str42;
                                                    doubleValue = r22;
                                                    r22 = obj6;
                                                } else if (btfi3.f148663f.size() != 0) {
                                                    z = false;
                                                    z2 = !z;
                                                    if (z2) {
                                                    }
                                                    if (!booleanValue) {
                                                    }
                                                    Set set32 = (Set) sparseArray2.get(Arrays.hashCode(new Object[]{alpj.m61470a(btfi3)}));
                                                    if (booleanValue2) {
                                                    }
                                                    obj6 = r22;
                                                    str42 = str30;
                                                    a2 = btfi3;
                                                    i7 = i3;
                                                    int i1722 = i13;
                                                    if (i7 < alpn.f74029a) {
                                                    }
                                                    i9 = i5;
                                                    if (i7 <= 0) {
                                                    }
                                                    i12 = i9;
                                                    r22 = d2;
                                                    str44 = i6 + i14;
                                                    int i18222 = i4 + i15;
                                                    if (alpl5 == null) {
                                                    }
                                                    alpn.f74035h += i7;
                                                    arrayList.clear();
                                                    i8 = i12;
                                                    i4 = i11;
                                                    i6 = i10;
                                                    i7 = 0;
                                                    i13 = 0;
                                                    i14 = 0;
                                                    i15 = 0;
                                                    i = i8 + 1;
                                                    str37 = str44;
                                                    str36 = str43;
                                                    str38 = a2;
                                                    j = j2;
                                                    i2 = i4;
                                                    str44 = i6;
                                                    i3 = i7;
                                                    r10 = alpl2;
                                                    str39 = str30;
                                                    bxwc2 = bxwc;
                                                    str30 = str42;
                                                    doubleValue = r22;
                                                    r22 = obj6;
                                                }
                                            } else {
                                                bxwc = bxwc2;
                                            }
                                            z = true;
                                            z2 = !z;
                                            if (z2) {
                                            }
                                            if (!booleanValue) {
                                            }
                                            Set set322 = (Set) sparseArray2.get(Arrays.hashCode(new Object[]{alpj.m61470a(btfi3)}));
                                            if (booleanValue2) {
                                            }
                                            obj6 = r22;
                                            str42 = str30;
                                            a2 = btfi3;
                                            i7 = i3;
                                            int i17222 = i13;
                                            if (i7 < alpn.f74029a) {
                                            }
                                            i9 = i5;
                                            if (i7 <= 0) {
                                            }
                                            i12 = i9;
                                            r22 = d2;
                                            str44 = i6 + i14;
                                            int i182222 = i4 + i15;
                                            if (alpl5 == null) {
                                            }
                                            alpn.f74035h += i7;
                                            arrayList.clear();
                                            i8 = i12;
                                            i4 = i11;
                                            i6 = i10;
                                            i7 = 0;
                                            i13 = 0;
                                            i14 = 0;
                                            i15 = 0;
                                            i = i8 + 1;
                                            str37 = str44;
                                            str36 = str43;
                                            str38 = a2;
                                            j = j2;
                                            i2 = i4;
                                            str44 = i6;
                                            i3 = i7;
                                            r10 = alpl2;
                                            str39 = str30;
                                            bxwc2 = bxwc;
                                            str30 = str42;
                                            doubleValue = r22;
                                            r22 = obj6;
                                        } catch (InterruptedException e38) {
                                            str40 = str37;
                                            a2 = str38;
                                            str30 = str39;
                                            context25 = context24;
                                            a2 = a2;
                                            str30 = str30;
                                            str44 = str40;
                                            alpm = this;
                                            alpm.f74026t.mo40527a(context, "write_contacts", false);
                                            almk a1322 = almk.m61263a();
                                            int i2022 = alpn.f74035h;
                                            da = amkv.f75106m.mo74144da();
                                            if (!da.f164950c) {
                                            }
                                            amkv amkv22 = (amkv) da.f164949b;
                                            amkv22.f75108a |= 1024;
                                            amkv22.f75114g = i2022;
                                            a1322.mo40514a((amkv) da.mo74062i());
                                            String str5522 = alpm.f74020c;
                                            currentTimeMillis = System.currentTimeMillis();
                                            if (currentTimeMillis >= 0) {
                                            }
                                            return new Pair(amqv.f75777c, new Bundle());
                                        } catch (gid e39) {
                                            e = e39;
                                            str5 = str37;
                                            a2 = str38;
                                            str30 = str39;
                                            alpm = this;
                                            gid = e;
                                            str4 = str47;
                                            andd2 = andd6;
                                            context2 = context24;
                                            str = a2;
                                            andd = str30;
                                            andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                            Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                                            almk.m61263a().mo40522a("restore_error:authentication_failure");
                                            str2 = andd;
                                            r2 = context2;
                                            alpl alpl322222222222222222222222222 = alpm.f74027u;
                                            Intent intent222222222222222222222222222 = new Intent(str2);
                                            intent222222222222222222222222222.setPackage(str);
                                            intent222222222222222222222222222.putExtra(str3, false);
                                            intent222222222222222222222222222.putExtra((String) r2, false);
                                            alpl322222222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222222);
                                            return new Pair(amqv.f75779e, null);
                                        } catch (chuw e40) {
                                            e = e40;
                                            str9 = str37;
                                            a2 = str38;
                                            str30 = str39;
                                            alpm = this;
                                            chuw = e;
                                            str8 = str47;
                                            andd3 = andd6;
                                            context3 = context24;
                                            str6 = a2;
                                            str7 = str30;
                                            andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                            Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                                            almk a142222 = almk.m61263a();
                                            String valueOf2222 = String.valueOf(chuw.f189236a.f189233s);
                                            StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf2222).length() + 27);
                                            sb2222.append("restore_error:status_error:");
                                            sb2222.append(valueOf2222);
                                            a142222.mo40522a(sb2222.toString());
                                            str = str6;
                                            str2 = str7;
                                            r2 = context3;
                                            alpl alpl3222222222222222222222222222 = alpm.f74027u;
                                            Intent intent2222222222222222222222222222 = new Intent(str2);
                                            intent2222222222222222222222222222.setPackage(str);
                                            intent2222222222222222222222222222.putExtra(str3, false);
                                            intent2222222222222222222222222222.putExtra((String) r2, false);
                                            alpl3222222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222222);
                                            return new Pair(amqv.f75779e, null);
                                        } catch (RemoteException e41) {
                                            e = e41;
                                            str13 = str37;
                                            a2 = str38;
                                            str30 = str39;
                                            alpm = this;
                                            remoteException = e;
                                            str12 = str47;
                                            andd4 = andd6;
                                            context4 = context24;
                                            str10 = a2;
                                            str11 = str30;
                                            andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                            Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                                            almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                                            str = str10;
                                            str2 = str11;
                                            r2 = context4;
                                            alpl alpl32222222222222222222222222222 = alpm.f74027u;
                                            Intent intent22222222222222222222222222222 = new Intent(str2);
                                            intent22222222222222222222222222222.setPackage(str);
                                            intent22222222222222222222222222222.putExtra(str3, false);
                                            intent22222222222222222222222222222.putExtra((String) r2, false);
                                            alpl32222222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222222);
                                            return new Pair(amqv.f75779e, null);
                                        } catch (OperationApplicationException e42) {
                                            e = e42;
                                            str3 = str37;
                                            a2 = str38;
                                            str30 = str39;
                                            alpm = this;
                                            operationApplicationException = e;
                                            str16 = str47;
                                            andd5 = andd6;
                                            context5 = context24;
                                            str14 = a2;
                                            str15 = str30;
                                            andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                            Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                                            almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                                            str = str14;
                                            str2 = str15;
                                            r2 = context5;
                                            alpl alpl322222222222222222222222222222 = alpm.f74027u;
                                            Intent intent222222222222222222222222222222 = new Intent(str2);
                                            intent222222222222222222222222222222.setPackage(str);
                                            intent222222222222222222222222222222.putExtra(str3, false);
                                            intent222222222222222222222222222222.putExtra((String) r2, false);
                                            alpl322222222222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222222222);
                                            return new Pair(amqv.f75779e, null);
                                        } catch (Exception e43) {
                                            e = e43;
                                            str41 = str37;
                                            a2 = str38;
                                            str30 = str39;
                                            alpm = this;
                                            exc = e;
                                            context6 = context24;
                                            str17 = a2;
                                            str18 = str30;
                                            str44 = str41;
                                            andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                            Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                                            str = str17;
                                            str2 = str18;
                                            r2 = context6;
                                            alpl alpl3222222222222222222222222222222 = alpm.f74027u;
                                            Intent intent2222222222222222222222222222222 = new Intent(str2);
                                            intent2222222222222222222222222222222.setPackage(str);
                                            intent2222222222222222222222222222222.putExtra(str3, false);
                                            intent2222222222222222222222222222222.putExtra((String) r2, false);
                                            alpl3222222222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222222222);
                                            return new Pair(amqv.f75779e, null);
                                        }
                                    } catch (InterruptedException e44) {
                                    } catch (gid e45) {
                                    } catch (chuw e46) {
                                    } catch (RemoteException e47) {
                                        alpm = this;
                                        remoteException = e47;
                                        str12 = str47;
                                        andd4 = andd6;
                                        context4 = context24;
                                        str13 = str37;
                                        str10 = str38;
                                        str11 = str39;
                                        andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                                        Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                                        almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                                        str = str10;
                                        str2 = str11;
                                        r2 = context4;
                                        alpl alpl32222222222222222222222222222222 = alpm.f74027u;
                                        Intent intent22222222222222222222222222222222 = new Intent(str2);
                                        intent22222222222222222222222222222222.setPackage(str);
                                        intent22222222222222222222222222222222.putExtra(str3, false);
                                        intent22222222222222222222222222222222.putExtra((String) r2, false);
                                        alpl32222222222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222222222);
                                        return new Pair(amqv.f75779e, null);
                                    } catch (OperationApplicationException e48) {
                                    } catch (Exception e49) {
                                    }
                                }
                                alpn.f74031c.mo41718a(remoteException2, d3);
                                throw remoteException2;
                            }
                        } catch (SQLiteException e50) {
                            sQLiteException = e50;
                            almn = almn2;
                            try {
                                Log.e("WriteContactsHelper", "Failed to query group for contacts to be restored.", sQLiteException);
                                if (cursor == null) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (cursor != null) {
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (cursor != null) {
                            }
                            throw th2;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    almn = almn2;
                } catch (SQLiteException e51) {
                    sQLiteException = e51;
                    cursor = null;
                    almn = almn2;
                    Log.e("WriteContactsHelper", "Failed to query group for contacts to be restored.", sQLiteException);
                    if (cursor == null) {
                        cursor.close();
                        j = -2;
                        if (j == -2) {
                        }
                        int size3 = bxwc2.size();
                        ArrayList arrayList2 = new ArrayList();
                        SparseArray sparseArray22 = new SparseArray();
                        boolean booleanValue3 = ((Boolean) amgi.f74885a.mo41191a()).booleanValue();
                        boolean booleanValue22 = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83263T()).booleanValue();
                        str36 = "phase";
                        context24 = "succeed";
                        doubleValue = ((Double) amht.f74922a.mo41191a()).doubleValue();
                        int i122 = -1;
                        str37 = "running";
                        str38 = str44;
                        str39 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                        i = 0;
                        str44 = 0;
                        i2 = 0;
                        i3 = 0;
                        int i132 = 0;
                        int i142 = 0;
                        int i152 = 0;
                        r10 = alpl;
                        while (true) {
                            alpl alpl52 = a2;
                            if (i < bxwc2.size()) {
                            }
                            i = i8 + 1;
                            str37 = str44;
                            str36 = str43;
                            str38 = a2;
                            j = j2;
                            i2 = i4;
                            str44 = i6;
                            i3 = i7;
                            r10 = alpl2;
                            str39 = str30;
                            bxwc2 = bxwc;
                            str30 = str42;
                            doubleValue = r22;
                            r22 = obj6;
                        }
                        alpn.f74031c.mo41718a(remoteException2, d3);
                        throw remoteException2;
                    }
                    j = -2;
                    if (j == -2) {
                    }
                    int size32 = bxwc2.size();
                    ArrayList arrayList22 = new ArrayList();
                    SparseArray sparseArray222 = new SparseArray();
                    boolean booleanValue32 = ((Boolean) amgi.f74885a.mo41191a()).booleanValue();
                    boolean booleanValue222 = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83263T()).booleanValue();
                    str36 = "phase";
                    context24 = "succeed";
                    doubleValue = ((Double) amht.f74922a.mo41191a()).doubleValue();
                    int i1222 = -1;
                    str37 = "running";
                    str38 = str44;
                    str39 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    i = 0;
                    str44 = 0;
                    i2 = 0;
                    i3 = 0;
                    int i1322 = 0;
                    int i1422 = 0;
                    int i1522 = 0;
                    r10 = alpl;
                    while (true) {
                        alpl alpl522 = a2;
                        if (i < bxwc2.size()) {
                        }
                        i = i8 + 1;
                        str37 = str44;
                        str36 = str43;
                        str38 = a2;
                        j = j2;
                        i2 = i4;
                        str44 = i6;
                        i3 = i7;
                        r10 = alpl2;
                        str39 = str30;
                        bxwc2 = bxwc;
                        str30 = str42;
                        doubleValue = r22;
                        r22 = obj6;
                    }
                    alpn.f74031c.mo41718a(remoteException2, d3);
                    throw remoteException2;
                } catch (Throwable th5) {
                    th2 = th5;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
                j = -2;
                if (j == -2) {
                }
                int size322 = bxwc2.size();
                ArrayList arrayList222 = new ArrayList();
                SparseArray sparseArray2222 = new SparseArray();
                boolean booleanValue322 = ((Boolean) amgi.f74885a.mo41191a()).booleanValue();
                boolean booleanValue2222 = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83263T()).booleanValue();
                str36 = "phase";
                context24 = "succeed";
                try {
                    doubleValue = ((Double) amht.f74922a.mo41191a()).doubleValue();
                    int i12222 = -1;
                    str37 = "running";
                    str38 = str44;
                    str39 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    i = 0;
                    str44 = 0;
                    i2 = 0;
                    i3 = 0;
                    int i13222 = 0;
                    int i14222 = 0;
                    int i15222 = 0;
                    r10 = alpl;
                    while (true) {
                        alpl alpl5222 = a2;
                        if (i < bxwc2.size()) {
                        }
                        i = i8 + 1;
                        str37 = str44;
                        str36 = str43;
                        str38 = a2;
                        j = j2;
                        i2 = i4;
                        str44 = i6;
                        i3 = i7;
                        r10 = alpl2;
                        str39 = str30;
                        bxwc2 = bxwc;
                        str30 = str42;
                        doubleValue = r22;
                        r22 = obj6;
                    }
                    alpn.f74031c.mo41718a(remoteException2, d3);
                    throw remoteException2;
                } catch (InterruptedException e52) {
                    String str56 = str44;
                    Object obj8 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    Context context29 = context24;
                    str44 = "running";
                    a2 = str56;
                    str30 = obj8;
                    context25 = context29;
                    alpm = this;
                    alpm.f74026t.mo40527a(context, "write_contacts", false);
                    almk a13222 = almk.m61263a();
                    int i20222 = alpn.f74035h;
                    da = amkv.f75106m.mo74144da();
                    if (!da.f164950c) {
                    }
                    amkv amkv222 = (amkv) da.f164949b;
                    amkv222.f75108a |= 1024;
                    amkv222.f75114g = i20222;
                    a13222.mo40514a((amkv) da.mo74062i());
                    String str55222 = alpm.f74020c;
                    currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= 0) {
                    }
                    return new Pair(amqv.f75777c, new Bundle());
                } catch (gid e53) {
                    e = e53;
                    str31 = str44;
                    obj = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    context15 = context24;
                    str44 = "running";
                    a2 = str31;
                    str30 = obj;
                    context14 = context15;
                    alpm = this;
                    str23 = a2;
                    andd8 = str30;
                    context10 = context14;
                    gid = e;
                    str4 = str47;
                    str = str23;
                    andd7 = andd8;
                    context8 = context10;
                    andd2 = andd6;
                    andd = andd7;
                    context2 = context8;
                    andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                    almk.m61263a().mo40522a("restore_error:authentication_failure");
                    str2 = andd;
                    r2 = context2;
                    alpl alpl322222222222222222222222222222222 = alpm.f74027u;
                    Intent intent222222222222222222222222222222222 = new Intent(str2);
                    intent222222222222222222222222222222222.setPackage(str);
                    intent222222222222222222222222222222222.putExtra(str3, false);
                    intent222222222222222222222222222222222.putExtra((String) r2, false);
                    alpl322222222222222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222222222222);
                    return new Pair(amqv.f75779e, null);
                } catch (chuw e54) {
                    e = e54;
                    str32 = str44;
                    obj2 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    context17 = context24;
                    str44 = "running";
                    a2 = str32;
                    str30 = obj2;
                    context16 = context17;
                    alpm = this;
                    str24 = a2;
                    str25 = str30;
                    context11 = context16;
                    chuw = e;
                    str8 = str47;
                    str21 = str24;
                    str22 = str25;
                    context9 = context11;
                    andd3 = andd6;
                    str6 = str21;
                    str7 = str22;
                    context3 = context9;
                    andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                    almk a1422222 = almk.m61263a();
                    String valueOf22222 = String.valueOf(chuw.f189236a.f189233s);
                    StringBuilder sb22222 = new StringBuilder(String.valueOf(valueOf22222).length() + 27);
                    sb22222.append("restore_error:status_error:");
                    sb22222.append(valueOf22222);
                    a1422222.mo40522a(sb22222.toString());
                    str = str6;
                    str2 = str7;
                    r2 = context3;
                    alpl alpl3222222222222222222222222222222222 = alpm.f74027u;
                    Intent intent2222222222222222222222222222222222 = new Intent(str2);
                    intent2222222222222222222222222222222222.setPackage(str);
                    intent2222222222222222222222222222222222.putExtra(str3, false);
                    intent2222222222222222222222222222222222.putExtra((String) r2, false);
                    alpl3222222222222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222222222222);
                    return new Pair(amqv.f75779e, null);
                } catch (RemoteException e55) {
                    e = e55;
                    str33 = str44;
                    obj3 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    context19 = context24;
                    str44 = "running";
                    a2 = str33;
                    str30 = obj3;
                    context18 = context19;
                    alpm = this;
                    str26 = a2;
                    str27 = str30;
                    context12 = context18;
                    remoteException = e;
                    str12 = str47;
                    String str49222 = str26;
                    String str50222 = str27;
                    Context context26222 = context12;
                    andd4 = andd6;
                    str10 = str49222;
                    str11 = str50222;
                    context4 = context26222;
                    andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                    almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                    str = str10;
                    str2 = str11;
                    r2 = context4;
                    alpl alpl32222222222222222222222222222222222 = alpm.f74027u;
                    Intent intent22222222222222222222222222222222222 = new Intent(str2);
                    intent22222222222222222222222222222222222.setPackage(str);
                    intent22222222222222222222222222222222222.putExtra(str3, false);
                    intent22222222222222222222222222222222222.putExtra((String) r2, false);
                    alpl32222222222222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222222222222);
                    return new Pair(amqv.f75779e, null);
                } catch (OperationApplicationException e56) {
                    e = e56;
                    str34 = str44;
                    obj4 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    context21 = context24;
                    str44 = "running";
                    a2 = str34;
                    str30 = obj4;
                    context20 = context21;
                    alpm = this;
                    str28 = a2;
                    str29 = str30;
                    context13 = context20;
                    operationApplicationException = e;
                    str16 = str47;
                    String str51222 = str28;
                    String str52222 = str29;
                    Context context27222 = context13;
                    andd5 = andd6;
                    str14 = str51222;
                    str15 = str52222;
                    context5 = context27222;
                    andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                    almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                    str = str14;
                    str2 = str15;
                    r2 = context5;
                    alpl alpl322222222222222222222222222222222222 = alpm.f74027u;
                    Intent intent222222222222222222222222222222222222 = new Intent(str2);
                    intent222222222222222222222222222222222222.setPackage(str);
                    intent222222222222222222222222222222222222.putExtra(str3, false);
                    intent222222222222222222222222222222222222.putExtra((String) r2, false);
                    alpl322222222222222222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222222222222222);
                    return new Pair(amqv.f75779e, null);
                } catch (Exception e57) {
                    e = e57;
                    str35 = str44;
                    obj5 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                    context23 = context24;
                    str44 = "running";
                    a2 = str35;
                    str30 = obj5;
                    context22 = context23;
                    alpm = this;
                    str19 = a2;
                    str20 = str30;
                    context7 = context22;
                    exc = e;
                    str17 = str19;
                    str18 = str20;
                    context6 = context7;
                    andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                    Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                    str = str17;
                    str2 = str18;
                    r2 = context6;
                    alpl alpl3222222222222222222222222222222222222 = alpm.f74027u;
                    Intent intent2222222222222222222222222222222222222 = new Intent(str2);
                    intent2222222222222222222222222222222222222.setPackage(str);
                    intent2222222222222222222222222222222222222.putExtra(str3, false);
                    intent2222222222222222222222222222222222222.putExtra((String) r2, false);
                    alpl3222222222222222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222222222222222);
                    return new Pair(amqv.f75779e, null);
                }
            } catch (InterruptedException e58) {
            } catch (gid e59) {
                e = e59;
                context15 = "succeed";
                str31 = str44;
                obj = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                str44 = "running";
                a2 = str31;
                str30 = obj;
                context14 = context15;
                alpm = this;
                str23 = a2;
                andd8 = str30;
                context10 = context14;
                gid = e;
                str4 = str47;
                str = str23;
                andd7 = andd8;
                context8 = context10;
                andd2 = andd6;
                andd = andd7;
                context2 = context8;
                andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str4, "Auth exception when fetching contact list from server.", gid);
                almk.m61263a().mo40522a("restore_error:authentication_failure");
                str2 = andd;
                r2 = context2;
                alpl alpl32222222222222222222222222222222222222 = alpm.f74027u;
                Intent intent22222222222222222222222222222222222222 = new Intent(str2);
                intent22222222222222222222222222222222222222.setPackage(str);
                intent22222222222222222222222222222222222222.putExtra(str3, false);
                intent22222222222222222222222222222222222222.putExtra((String) r2, false);
                alpl32222222222222222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222222222222222);
                return new Pair(amqv.f75779e, null);
            } catch (chuw e60) {
                e = e60;
                context17 = "succeed";
                str32 = str44;
                obj2 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                str44 = "running";
                a2 = str32;
                str30 = obj2;
                context16 = context17;
                alpm = this;
                str24 = a2;
                str25 = str30;
                context11 = context16;
                chuw = e;
                str8 = str47;
                str21 = str24;
                str22 = str25;
                context9 = context11;
                andd3 = andd6;
                str6 = str21;
                str7 = str22;
                context3 = context9;
                andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str8, "Operation exception when loading contact list from server.", chuw);
                almk a14222222 = almk.m61263a();
                String valueOf222222 = String.valueOf(chuw.f189236a.f189233s);
                StringBuilder sb222222 = new StringBuilder(String.valueOf(valueOf222222).length() + 27);
                sb222222.append("restore_error:status_error:");
                sb222222.append(valueOf222222);
                a14222222.mo40522a(sb222222.toString());
                str = str6;
                str2 = str7;
                r2 = context3;
                alpl alpl322222222222222222222222222222222222222 = alpm.f74027u;
                Intent intent222222222222222222222222222222222222222 = new Intent(str2);
                intent222222222222222222222222222222222222222.setPackage(str);
                intent222222222222222222222222222222222222222.putExtra(str3, false);
                intent222222222222222222222222222222222222222.putExtra((String) r2, false);
                alpl322222222222222222222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222222222222222222);
                return new Pair(amqv.f75779e, null);
            } catch (RemoteException e61) {
                e = e61;
                context19 = "succeed";
                str33 = str44;
                obj3 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                str44 = "running";
                a2 = str33;
                str30 = obj3;
                context18 = context19;
                alpm = this;
                str26 = a2;
                str27 = str30;
                context12 = context18;
                remoteException = e;
                str12 = str47;
                String str492222 = str26;
                String str502222 = str27;
                Context context262222 = context12;
                andd4 = andd6;
                str10 = str492222;
                str11 = str502222;
                context4 = context262222;
                andd4.mo41718a(remoteException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str12, "Contacts write failed during the execution of a remote method.", remoteException);
                almk.m61263a().mo40522a("restore_error:cp2_remote_exception");
                str = str10;
                str2 = str11;
                r2 = context4;
                alpl alpl3222222222222222222222222222222222222222 = alpm.f74027u;
                Intent intent2222222222222222222222222222222222222222 = new Intent(str2);
                intent2222222222222222222222222222222222222222.setPackage(str);
                intent2222222222222222222222222222222222222222.putExtra(str3, false);
                intent2222222222222222222222222222222222222222.putExtra((String) r2, false);
                alpl3222222222222222222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222222222222222222);
                return new Pair(amqv.f75779e, null);
            } catch (OperationApplicationException e62) {
                e = e62;
                context21 = "succeed";
                str34 = str44;
                obj4 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                str44 = "running";
                a2 = str34;
                str30 = obj4;
                context20 = context21;
                alpm = this;
                str28 = a2;
                str29 = str30;
                context13 = context20;
                operationApplicationException = e;
                str16 = str47;
                String str512222 = str28;
                String str522222 = str29;
                Context context272222 = context13;
                andd5 = andd6;
                str14 = str512222;
                str15 = str522222;
                context5 = context272222;
                andd5.mo41718a(operationApplicationException, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str16, "Failed to write contacts to CP2", operationApplicationException);
                almk.m61263a().mo40522a("restore_error:cp2_operation_exception");
                str = str14;
                str2 = str15;
                r2 = context5;
                alpl alpl32222222222222222222222222222222222222222 = alpm.f74027u;
                Intent intent22222222222222222222222222222222222222222 = new Intent(str2);
                intent22222222222222222222222222222222222222222.setPackage(str);
                intent22222222222222222222222222222222222222222.putExtra(str3, false);
                intent22222222222222222222222222222222222222222.putExtra((String) r2, false);
                alpl32222222222222222222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222222222222222222);
                return new Pair(amqv.f75779e, null);
            } catch (Exception e63) {
                e = e63;
                context23 = "succeed";
                str35 = str44;
                obj5 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
                str44 = "running";
                a2 = str35;
                str30 = obj5;
                context22 = context23;
                alpm = this;
                str19 = a2;
                str20 = str30;
                context7 = context22;
                exc = e;
                str17 = str19;
                str18 = str20;
                context6 = context7;
                andd6.mo41718a(exc, ((Double) amht.f74922a.mo41191a()).doubleValue());
                Log.e(str47, "Failed to restore contacts due to unknown exception.", exc);
                str = str17;
                str2 = str18;
                r2 = context6;
                alpl alpl322222222222222222222222222222222222222222 = alpm.f74027u;
                Intent intent222222222222222222222222222222222222222222 = new Intent(str2);
                intent222222222222222222222222222222222222222222.setPackage(str);
                intent222222222222222222222222222222222222222222.putExtra(str3, false);
                intent222222222222222222222222222222222222222222.putExtra((String) r2, false);
                alpl322222222222222222222222222222222222222222.f74019a.sendBroadcast(intent222222222222222222222222222222222222222222);
                return new Pair(amqv.f75779e, null);
            }
        } catch (gid e64) {
            context8 = "succeed";
            str = str44;
            andd6 = a;
            str44 = "running";
            andd7 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
            gid = e64;
            str4 = "BasePeopleOperation";
            andd2 = andd6;
            andd = andd7;
            context2 = context8;
            andd2.mo41718a(gid, ((Double) amht.f74922a.mo41191a()).doubleValue());
            Log.e(str4, "Auth exception when fetching contact list from server.", gid);
            almk.m61263a().mo40522a("restore_error:authentication_failure");
            str2 = andd;
            r2 = context2;
            alpl alpl3222222222222222222222222222222222222222222 = alpm.f74027u;
            Intent intent2222222222222222222222222222222222222222222 = new Intent(str2);
            intent2222222222222222222222222222222222222222222.setPackage(str);
            intent2222222222222222222222222222222222222222222.putExtra(str3, false);
            intent2222222222222222222222222222222222222222222.putExtra((String) r2, false);
            alpl3222222222222222222222222222222222222222222.f74019a.sendBroadcast(intent2222222222222222222222222222222222222222222);
            return new Pair(amqv.f75779e, null);
        } catch (chuw e65) {
            context9 = "succeed";
            str21 = str44;
            andd6 = a;
            str44 = "running";
            str22 = "com.google.android.gms.people.action.CONTACTS_RESTORE_PROGRESS_UPDATED";
            chuw = e65;
            str8 = "BasePeopleOperation";
            andd3 = andd6;
            str6 = str21;
            str7 = str22;
            context3 = context9;
            andd3.mo41718a(chuw, ((Double) amht.f74922a.mo41191a()).doubleValue());
            Log.e(str8, "Operation exception when loading contact list from server.", chuw);
            almk a142222222 = almk.m61263a();
            String valueOf2222222 = String.valueOf(chuw.f189236a.f189233s);
            StringBuilder sb2222222 = new StringBuilder(String.valueOf(valueOf2222222).length() + 27);
            sb2222222.append("restore_error:status_error:");
            sb2222222.append(valueOf2222222);
            a142222222.mo40522a(sb2222222.toString());
            str = str6;
            str2 = str7;
            r2 = context3;
            alpl alpl32222222222222222222222222222222222222222222 = alpm.f74027u;
            Intent intent22222222222222222222222222222222222222222222 = new Intent(str2);
            intent22222222222222222222222222222222222222222222.setPackage(str);
            intent22222222222222222222222222222222222222222222.putExtra(str3, false);
            intent22222222222222222222222222222222222222222222.putExtra((String) r2, false);
            alpl32222222222222222222222222222222222222222222.f74019a.sendBroadcast(intent22222222222222222222222222222222222222222222);
            return new Pair(amqv.f75779e, null);
        } catch (RemoteException e66) {
        } catch (OperationApplicationException e67) {
        } catch (Exception e68) {
        }
    }
}
