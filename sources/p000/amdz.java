package p000;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: amdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amdz extends smx {

    /* renamed from: h */
    private static final Random f74775h = new Random();

    /* renamed from: a */
    private final amry f74776a = new amry();

    /* renamed from: b */
    private final amea f74777b;

    /* renamed from: c */
    private final ancd f74778c = new ance();

    /* renamed from: d */
    private final ancw f74779d = anbx.INSTANCE;

    /* renamed from: e */
    private final boolean f74780e;

    /* renamed from: f */
    private bmza f74781f;

    /* renamed from: g */
    private final adyd f74782g;

    /* renamed from: a */
    private final List m62716a(Account account) {
        ArrayList a = sqc.m35954a();
        altq a2 = altq.m61806a(getContext());
        almm almm = new almm();
        almm.f73739O = a2.mo40761a(account.name);
        a.add(almm);
        return a;
    }

    /* renamed from: b */
    private final long m62719b() {
        return this.f74780e ? this.f74781f.mo66928a(TimeUnit.MILLISECONDS) : SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11595a() {
        return 5377;
    }

    public final void onSyncCanceled() {
        this.f74776a.f75827a = true;
        super.onSyncCanceled();
    }

    public amdz(Context context) {
        super(context.getApplicationContext(), "people");
        this.f74777b = amea.m62724a(context);
        this.f74782g = adyd.m51363a(context);
        amig.m62939a();
        boolean booleanValue = ((Boolean) amhd.f74906a.mo41191a()).booleanValue();
        this.f74780e = booleanValue;
        if (booleanValue) {
            this.f74781f = bmza.m108659b(bmvy.f131119a);
        }
    }

    /* renamed from: a */
    private final void m62717a(Account account, boolean z) {
        List b = this.f74777b.mo41145b(account.name);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            almx.m61368a(getContext()).mo40598a(account.name, (String) b.get(i), !z ? 64 : 128);
        }
        almx.m61368a(getContext()).mo40599b();
    }

    /* renamed from: b */
    private final void m62720b(String str) {
        altq a = altq.m61806a(getContext());
        long a2 = ancm.m64005a(getContext().getApplicationContext()).mo20505a();
        String b = a.f74250f.mo40739b(str, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_finish_time", Long.valueOf(a2));
        a.mo40768c().mo40740a("owners", contentValues, "_id = ?", new String[]{b});
    }

    /* renamed from: a */
    private final boolean m62718a(String str) {
        try {
            for (Account account : (Account[]) this.f74782g.mo33907a("com.google", new String[]{"service_HOSTED"}).getResult()) {
                if (account.name.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:223:0x04df */
    /* JADX INFO: additional move instructions added (8) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:385:0x080e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:316:0x0711 */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX INFO: additional move instructions added (7) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:228:0x050b */
    /* JADX WARN: Type inference failed for: r15v9, assign insn: PHI: (r15v9 ?) = (r15v78 ?), (r15v96 ?) binds: [B:135:0x0377, B:134:?] */
    /* JADX WARN: Type inference failed for: r7v60, assign insn: PHI: (r7v60 ?) = (r7v106 ?), (r7v147 ?), (r7v182 ?) binds: [B:213:0x04c0, B:376:0x0800, B:173:0x0429] */
    /* JADX WARN: Type inference failed for: r7v61, assign insn: PHI: (r7v61 ?) = (r7v94 ?), (r7v148 ?), (r7v160 ?) binds: [B:244:0x0588, B:375:0x07fe, B:321:0x071d] */
    /* JADX WARN: Type inference failed for: r7v62, assign insn: PHI: (r7v62 ?) = (r7v70 ?), (r7v136 ?) binds: [B:312:0x0708, B:374:0x07fb] */
    /* JADX WARN: Type inference failed for: r15v31, assign insn: PHI: (r15v31 ?) = (r15v32 java.util.List), (r15v39 java.util.List), (r15v50 java.util.List), (r15v50 java.util.List) binds: [B:368:0x07f1, B:356:0x07d5, B:304:0x06f8, B:297:0x06e1] */
    /* JADX WARN: Type inference failed for: r7v64, assign insn: PHI: (r7v64 ?) = (r7v123 ? I:?[boolean, int, float, short, byte, char]), (r7v151 ?), (r7v183 ?) binds: [B:211:0x04b8, B:367:0x07f0, B:170:0x0420] */
    /* JADX WARN: Type inference failed for: r15v33, assign insn: PHI: (r15v33 ?) = (r15v34 java.util.List), (r15v53 java.util.List), (r15v93 java.util.List) binds: [B:366:0x07ee, B:242:0x0581, B:320:0x071a] */
    /* JADX WARN: Type inference failed for: r7v65, assign insn: PHI: (r7v65 ?) = (r7v94 ?), (r7v152 ?), (r7v161 ?) binds: [B:242:0x0581, B:366:0x07ee, B:320:0x071a] */
    /* JADX WARN: Type inference failed for: r7v66, assign insn: PHI: (r7v66 ?) = (r7v70 ?), (r7v137 ?) binds: [B:310:0x0704, B:365:0x07eb] */
    /* JADX WARN: Type inference failed for: r7v67, assign insn: PHI: (r7v67 ?) = (r7v124 ? I:?[boolean, int, float, short, byte, char]), (r7v154 ?), (r7v184 ?) binds: [B:209:0x04b0, B:362:0x07e4, B:167:0x0417] */
    /* JADX WARN: Type inference failed for: r7v68, assign insn: PHI: (r7v68 ?) = (r7v94 ?), (r7v155 ?), (r7v162 ?) binds: [B:240:0x057a, B:361:0x07e2, B:319:0x0717] */
    /* JADX WARN: Type inference failed for: r7v69, assign insn: PHI: (r7v69 ?) = (r7v70 ?), (r7v138 ?) binds: [B:308:0x0700, B:360:0x07df] */
    /* JADX WARN: Type inference failed for: r7v70, assign insn: PHI: (r7v70 ?) = (r7v113 ?), (r7v130 ? I:?[int, float, short, byte, char]), (r7v131 ? I:?[int, float, short, byte, char]), (r7v139 ?), (r7v140 ?) binds: [B:163:?, B:160:0x0408, B:164:0x0410, B:151:0x03e2, B:153:0x03e6] */
    /* JADX WARN: Type inference failed for: r7v72, assign insn: PHI: (r7v72 ?) = (r7v70 ?), (r7v167 ?) binds: [B:322:0x0720, B:300:0x06ec] */
    /* JADX WARN: Type inference failed for: r15v42, assign insn: PHI: (r15v42 ?) = (r15v45 ?), (r15v9 ?), (r15v9 ?), (r15v59 ?), (r15v59 ?) binds: [B:316:0x0711, B:223:0x04df, B:225:0x04e4, B:228:0x050b, B:231:0x0510] */
    /* JADX WARN: Type inference failed for: r7v80, assign insn: PHI: (r7v80 ?) = (r7v70 ?), (r7v94 ?), (r7v94 ?), (r7v99 ?), (r7v99 ?) binds: [B:316:0x0711, B:223:0x04df, B:225:0x04e4, B:228:0x050b, B:231:0x0510] */
    /* JADX WARN: Type inference failed for: r15v43, assign insn: PHI: (r15v43 ?) = (r15v45 ?), (r15v9 ?), (r15v9 ?), (r15v59 ?), (r15v59 ?) binds: [B:316:0x0711, B:223:0x04df, B:225:0x04e4, B:228:0x050b, B:231:0x0510] */
    /* JADX WARN: Type inference failed for: r7v81, assign insn: PHI: (r7v81 ?) = (r7v70 ?), (r7v94 ?), (r7v94 ?), (r7v99 ?), (r7v99 ?) binds: [B:316:0x0711, B:223:0x04df, B:225:0x04e4, B:228:0x050b, B:231:0x0510] */
    /* JADX WARN: Type inference failed for: r15v44, assign insn: PHI: (r15v44 ?) = (r15v45 ?), (r15v9 ?), (r15v9 ?), (r15v59 ?), (r15v59 ?) binds: [B:316:0x0711, B:223:0x04df, B:225:0x04e4, B:228:0x050b, B:231:0x0510] */
    /* JADX WARN: Type inference failed for: r7v82, assign insn: PHI: (r7v82 ?) = (r7v70 ?), (r7v94 ?), (r7v94 ?), (r7v99 ?), (r7v99 ?) binds: [B:316:0x0711, B:223:0x04df, B:225:0x04e4, B:228:0x050b, B:231:0x0510] */
    /* JADX WARN: Type inference failed for: r15v45, assign insn: PHI: (r15v45 ?) = (r15v46 ?), (r15v67 ?) binds: [B:314:0x070c, B:192:0x0468] */
    /* JADX WARN: Type inference failed for: r15v46, assign insn: 0x070c: MOVE  (r15v46 ? I:?[OBJECT, ARRAY]) = (r13v2 java.util.List) */
    /* JADX WARN: Type inference failed for: r7v83, assign insn: PHI: (r7v83 ?) = (r7v94 ?), (r7v126 ? I:?[boolean, int, float, short, byte, char]), (r7v178 ?) binds: [B:245:0x058e, B:207:0x04a4, B:232:?] */
    /* JADX WARN: Type inference failed for: r7v92, types: [amry], assign insn: 0x063c: IGET  (r7v92 ? I:amry) = (r1v0 'this' amdz A[THIS]) amdz.a amry */
    /* JADX WARN: Type inference failed for: r7v93, types: [java.lang.StringBuilder], assign insn: 0x0677: CONSTRUCTOR  (r7v93 ? I:java.lang.StringBuilder) = (r6v33 int) call: java.lang.StringBuilder.<init>(int):void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r7v94, assign insn: PHI: (r7v94 ?) = (r7v101 ?), (r7v105 ?), (r7v125 ? I:?[boolean, int, float, short, byte, char]) binds: [B:221:0x04d7, B:214:0x04c7, B:206:0x04a2] */
    /* JADX WARN: Type inference failed for: r15v55, types: [java.util.List], assign insn: PHI: (r15v55 ?) = (r15v56 java.util.List), (r15v59 ?) binds: [B:236:0x0544, B:234:0x0540] */
    /* JADX WARN: Type inference failed for: r7v99, types: [amry], assign insn: 0x04f5: MOVE  (r7v99 ? I:?[OBJECT, ARRAY]) = (r5v53 amry) */
    /* JADX WARN: Type inference failed for: r15v59, types: [java.util.List], assign insn: 0x0507: MOVE  (r15v59 ? I:?[OBJECT, ARRAY]) = (r28v11 java.util.List) */
    /* JADX WARN: Type inference failed for: r7v101, assign insn: 0x04da: CONST  (r7v101 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v102, assign insn: 0x04d5: CONST  (r7v102 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v103, assign insn: 0x04d2: CONST  (r7v103 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v104, assign insn: 0x04cf: CONST  (r7v104 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v105, assign insn: 0x04ca: CONST  (r7v105 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v106, assign insn: 0x048d: CONST  (r7v106 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r15v63, assign insn: 0x04aa: MOVE  (r15v63 ? I:?[OBJECT, ARRAY]) = (r28v14 java.util.List) */
    /* JADX WARN: Type inference failed for: r7v107, assign insn: PHI: (r7v107 ?) = (r7v102 ?), (r7v127 ? I:?[boolean, int, float, short, byte, char]) binds: [B:220:0x04d5, B:189:0x0463] */
    /* JADX WARN: Type inference failed for: r7v108, assign insn: PHI: (r7v108 ?) = (r7v103 ?), (r7v128 ? I:?[boolean, int, float, short, byte, char]) binds: [B:218:0x04d2, B:187:0x045f] */
    /* JADX WARN: Type inference failed for: r7v109, assign insn: PHI: (r7v109 ?) = (r7v104 ?), (r7v129 ? I:?[boolean, int, float, short, byte, char]) binds: [B:216:0x04cf, B:185:0x045b] */
    /* JADX WARN: Type inference failed for: r15v67, assign insn: 0x0468: MOVE  (r15v67 ? I:?[OBJECT, ARRAY]) = (r13v2 java.util.List) */
    /* JADX WARN: Type inference failed for: r7v113, assign insn: 0x03f6: CONST  (r7v113 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r15v78, assign insn: 0x0377: CONST  (r15v78 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r7v115, types: [boolean], assign insn: 0x02c9: INVOKE  (r7v115 ? I:boolean) = (r2v201 amea), (r3v85 java.lang.String), (null java.lang.String), (r12v43 long) type: VIRTUAL call: amea.a(java.lang.String, java.lang.String, long):boolean */
    /* JADX WARN: Type inference failed for: r7v123, assign insn: 0x048d: CONST  (r7v123 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v124, assign insn: 0x048d: CONST  (r7v124 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v125, assign insn: 0x048d: CONST  (r7v125 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v126, assign insn: 0x048d: CONST  (r7v126 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v127, assign insn: 0x048d: CONST  (r7v127 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v128, assign insn: 0x048d: CONST  (r7v128 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v129, assign insn: 0x048d: CONST  (r7v129 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v130, assign insn: 0x03f6: CONST  (r7v130 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v131, assign insn: 0x03f6: CONST  (r7v131 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r7v136, assign insn: ?: MOVE  (r7v136 ?) = (r7v16 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v137, assign insn: ?: MOVE  (r7v137 ?) = (r7v16 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v138, assign insn: ?: MOVE  (r7v138 ?) = (r7v16 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v139, assign insn: ?: MOVE  (r7v139 ?) = (r7v16 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v140, assign insn: ?: MOVE  (r7v140 ?) = (r7v16 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v147, assign insn: ?: MOVE  (r7v147 ?) = (r7v61 ?) */
    /* JADX WARN: Type inference failed for: r7v148, assign insn: ?: MOVE  (r7v148 ?) = (r7v62 ?) */
    /* JADX WARN: Type inference failed for: r7v151, assign insn: ?: MOVE  (r7v151 ?) = (r7v65 ?) */
    /* JADX WARN: Type inference failed for: r7v152, assign insn: ?: MOVE  (r7v152 ?) = (r7v66 ?) */
    /* JADX WARN: Type inference failed for: r7v154, assign insn: ?: MOVE  (r7v154 ?) = (r7v68 ?) */
    /* JADX WARN: Type inference failed for: r7v155, assign insn: ?: MOVE  (r7v155 ?) = (r7v69 ?) */
    /* JADX WARN: Type inference failed for: r7v160, assign insn: ?: MOVE  (r7v160 ?) = (r7v80 ?) */
    /* JADX WARN: Type inference failed for: r7v161, assign insn: ?: MOVE  (r7v161 ?) = (r7v81 ?) */
    /* JADX WARN: Type inference failed for: r7v162, assign insn: ?: MOVE  (r7v162 ?) = (r7v82 ?) */
    /* JADX WARN: Type inference failed for: r7v167, assign insn: ?: MOVE  (r7v167 ?) = (r7v84 android.content.SyncResult) */
    /* JADX WARN: Type inference failed for: r7v178, assign insn: ?: MOVE  (r7v178 ?) = (r7v100 java.lang.StringBuilder) */
    /* JADX WARN: Type inference failed for: r7v182, assign insn: ?: MOVE  (r7v182 ?) = (r7v110 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v183, assign insn: ?: MOVE  (r7v183 ?) = (r7v111 android.content.Context) */
    /* JADX WARN: Type inference failed for: r7v184, assign insn: ?: MOVE  (r7v184 ?) = (r7v112 android.content.Context) */
    /* JADX WARN: Type inference failed for: r15v96, assign insn: ?: MOVE  (r15v96 ?) = (r15v79 boolean) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(android.accounts.Account, java.lang.String, boolean):void
     arg types: [android.accounts.Account, java.lang.String, int]
     candidates:
      amea.a(boolean, boolean, boolean):android.os.Bundle
      amea.a(android.accounts.Account, java.lang.String, int):void
      amea.a(android.accounts.Account, java.lang.String, android.os.Bundle):void
      amea.a(java.lang.String, java.lang.String, long):boolean
      amea.a(android.accounts.Account, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amea.a(android.accounts.Account, int, android.os.Bundle, int, java.lang.Exception, java.util.List, long, boolean, boolean, bmxv):void
     arg types: [android.accounts.Account, int, android.os.Bundle, int, ?[OBJECT, ARRAY], java.util.List, long, int, int, bmvz]
     candidates:
      amea.a(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean):boolean
      amea.a(android.accounts.Account, int, android.os.Bundle, int, java.lang.Exception, java.util.List, long, boolean, boolean, bmxv):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03e6, code lost:
        if (r8 == 9) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x045b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x045c, code lost:
        r2 = r0;
        r15 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x045f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0460, code lost:
        r2 = r0;
        r15 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0463, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0464, code lost:
        r2 = r0;
        r15 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r1.f74776a.mo41294b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0470, code lost:
        if (r5 == false) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r2 = r1.f74777b;
        r3 = p000.altn.m61774a(r2.f74784a).mo40738a(r14.name, null);
        r2 = p000.altq.m61806a(r2.f74784a).mo40763b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x048b, code lost:
        if (r2 == null) goto L_0x04c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x048d, code lost:
        r7 = 1;
        r7 = 1;
        r7 = 1;
        r7 = 1;
        r7 = 1;
        r7 = 1;
        r7 = 1;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r5 = new java.lang.String[1];
        r5[r15] = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0498, code lost:
        r28 = r13;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04a2, code lost:
        if (((int) r2.mo40743a("SELECT last_sync_status FROM owners WHERE _id=?", r5, -1)) != 2) goto L_0x04dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04a4, code lost:
        r20 = r8;
        r35 = r11;
        r36 = -1;
        r15 = r28;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04b0, code lost:
        r2 = r0;
        r36 = -1;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04b8, code lost:
        r2 = r0;
        r36 = -1;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04c0, code lost:
        r2 = r0;
        r36 = -1;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04c7, code lost:
        r28 = r13;
        r7 = 1;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04ce, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04cf, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04d2, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04d5, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04d7, code lost:
        r28 = r13;
        r7 = 1;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04dd, code lost:
        if (r9 != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        r9 = new p000.almm();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        r2 = getContext();
        r3 = r14.name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ec, code lost:
        r5 = r8;
        r6 = r42;
        r7 = r1.f74776a;
        r34 = r9;
        r35 = r11;
        r36 = r12;
        r20 = r8;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        p000.amee.m62769a(r2, r3, null, r5, r6, r7, r9, r41, r10, r11, r23, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050e, code lost:
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r15.add(r2);
        r3 = getContext();
        r5 = r14.name;
        r2 = java.lang.String.valueOf(r2);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 6);
        r7.append("Stats=");
        r7.append(r2);
        r13 = null;
        p000.aluj.m61900a(r3, "PeopleSync", r5, (java.lang.String) null, r7.toString());
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x053f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0540, code lost:
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0543, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0544, code lost:
        r2 = r9;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0549, code lost:
        r3 = r0;
        r15.add(r2);
        r4 = getContext();
        r6 = r14.name;
        r2 = java.lang.String.valueOf(r2);
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 6);
        r8.append("Stats=");
        r8.append(r2);
        p000.aluj.m61900a(r4, "PeopleSync", r6, (java.lang.String) null, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0578, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0579, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x057a, code lost:
        r36 = r12;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0580, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0581, code lost:
        r36 = r12;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0587, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0588, code lost:
        r36 = r12;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x058e, code lost:
        r20 = r8;
        r35 = r11;
        r36 = r12;
        r15 = r28;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0597, code lost:
        r1.f74776a.mo41294b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x059c, code lost:
        if (r35 == false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x059e, code lost:
        r2 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05ac, code lost:
        if (p000.altq.m61806a(r2).mo40765b(r14.name) == false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05ae, code lost:
        p000.aluj.m61900a(getContext(), "PeopleSync", r14.name, r13, "Account opted out from G+.");
        r3 = com.google.android.chimera.IntentOperation.getStartIntent(r2, com.google.android.gms.people.api.operations.DatabaseUpdateOperation.class, "com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05c3, code lost:
        if (r3 != null) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05c6, code lost:
        p000.amig.m62939a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05d5, code lost:
        if (((java.lang.Boolean) p000.amhi.f74911a.mo41191a()).booleanValue() == false) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05d7, code lost:
        r3.putExtra("account_name", r14.name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05de, code lost:
        r2.startService(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05e1, code lost:
        r1.f74776a.mo41294b();
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05e9, code lost:
        if (r12 != 1) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05f3, code lost:
        if (r1.f74777b.mo41141a(r14.name) == false) goto L_0x0602;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05f5, code lost:
        r2 = r1.f74777b.mo41134a(r14.name, p000.cgbe.m144184m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0602, code lost:
        r2 = r1.f74777b.mo41145b(r14.name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x060a, code lost:
        r20 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x060e, code lost:
        r9 = 0;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0613, code lost:
        if (r20.hasNext() == false) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0615, code lost:
        r11 = (java.lang.String) r20.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0620, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0622, code lost:
        p000.aluj.m61900a(getContext(), "PeopleSync", r14.name, r11, "***Sync start***");
        r10 = new p000.almm();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0634, code lost:
        r28 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        r2 = getContext();
        r3 = r14.name;
        r7 = r1.f74776a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x063e, code lost:
        r14 = r10;
        r38 = r11;
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        p000.amee.m62769a(r2, r3, r11, r12, r42, r7, r10, r41, false, false, r23, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        r15.add(r14);
        r2 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0662, code lost:
        r4 = r14;
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:?, code lost:
        r5 = r14.name;
        r4 = java.lang.String.valueOf(r4);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 6);
        r7.append("Stats=");
        r7.append(r4);
        p000.aluj.m61900a(r2, "PeopleSync", r5, r38, r7.toString());
        r1.f74776a.mo41294b();
        r9 = r28;
        r12 = r30;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0697, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0698, code lost:
        r14 = r40;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x069b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x069c, code lost:
        r14 = r40;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x069f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06a0, code lost:
        r14 = r40;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06a3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06a4, code lost:
        r4 = r14;
        r6 = r38;
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06ab, code lost:
        r4 = r10;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06ad, code lost:
        r2 = r0;
        r15.add(r4);
        r3 = getContext();
        r7 = r14.name;
        r4 = java.lang.String.valueOf(r4);
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 6);
        r9.append("Stats=");
        r9.append(r4);
        p000.aluj.m61900a(r3, "PeopleSync", r7, r6, r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06db, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06dc, code lost:
        r0 = th;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06dd, code lost:
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06e0, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06e1, code lost:
        r2 = r0;
        r9 = r28;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06e6, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06e7, code lost:
        r2 = r0;
        r9 = r28;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06ec, code lost:
        r20 = r9;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06f0, code lost:
        r2 = r0;
        r28 = r9;
        r3 = true;
        r9 = false;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06f8, code lost:
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06fc, code lost:
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0717, code lost:
        r0 = th;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x071a, code lost:
        r0 = e;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x071d, code lost:
        r0 = e;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0899, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x089c, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x089f, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08a6, code lost:
        r2 = r0;
        r7 = 51;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x08ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08ad, code lost:
        r18 = r0;
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08d0, code lost:
        r1.f74777b.mo41137a(r40, r28, r41, 100, r18, r15, r9, r23, r24, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x08f8, code lost:
        r2 = r14.name;
        r18.getMessage();
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0901, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0902, code lost:
        r18 = r0;
        r9 = r21;
        r4 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x091d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x091e, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0920, code lost:
        r11 = r0;
        r4 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x094b, code lost:
        r1.f74777b.mo41137a(r40, r4, r41, 6, r11, r15, r21, r23, r24, r25);
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0962, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0965, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0966, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0968, code lost:
        r6 = r0;
        r4 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x097e, code lost:
        r9 = java.lang.String.valueOf(r9.statusCode);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0985, code lost:
        r9 = "none";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x09b1, code lost:
        r13 = java.lang.String.valueOf(r13.statusCode);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x09b8, code lost:
        r13 = "none";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x09cc, code lost:
        r12 = new java.lang.String("***VolleyError***: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x09d3, code lost:
        r12 = "***VolleyError***: ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09f7, code lost:
        if (r9 != 404) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x09f9, code lost:
        if (r9 != 500) goto L_0x09fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x09fb, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09fd, code lost:
        r13 = (int) p000.cgbw.f186541a.mo83476b().mo83484h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a09, code lost:
        r13 = (int) p000.cgbw.f186541a.mo83476b().mo83483g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0a15, code lost:
        r13 = (int) p000.cgbw.f186541a.mo83476b().mo83482f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0a22, code lost:
        r13 = (int) p000.cgbw.f186541a.mo83476b().mo83481e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0a2f, code lost:
        if (r9 != 404) goto L_0x0a31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0a31, code lost:
        if (r9 != 500) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a33, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a35, code lost:
        r11 = (int) p000.cgbw.f186541a.mo83476b().mo83480d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a41, code lost:
        r11 = (int) p000.cgbw.f186541a.mo83476b().mo83479c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a4d, code lost:
        r11 = (int) p000.cgbw.f186541a.mo83476b().mo83478b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0a5a, code lost:
        r11 = (int) p000.cgbw.f186541a.mo83476b().mo83477a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a67, code lost:
        if (r9 == 302) goto L_0x0a69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0a6a, code lost:
        if (r11 != 1) goto L_0x0a6c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a6c, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a6e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a70, code lost:
        if (r11 == 2) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a74, code lost:
        if (r11 != 1) goto L_0x0a76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a78, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a7c, code lost:
        r13 = java.lang.Math.max(r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a80, code lost:
        if (r9 == false) goto L_0x0a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a83, code lost:
        r13 = r13 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0ab5, code lost:
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0abd, code lost:
        r11 = (double) r8;
        java.lang.Double.isNaN(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:?, code lost:
        p000.amdk.m62656a("PeopleSync", "Delaying %f hours", java.lang.Double.valueOf(r11 / 3600.0d));
        r7.delayUntil = java.lang.Math.max(r7.delayUntil, (r2 / 1000) + ((long) r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0afa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0afb, code lost:
        r7 = r42;
        r12 = null;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0bbb, code lost:
        r7 = 51;
        r15 = 2;
        r36 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0202, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0203, code lost:
        r2 = r0;
        r15 = 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x042f A[SYNTHETIC, Splitter:B:175:0x042f] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0720  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x080e A[SYNTHETIC, Splitter:B:385:0x080e] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0863 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x08ac A[ExcHandler: RuntimeException (r0v22 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:382:0x0809] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x08d0 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x08ea A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0901 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }, ExcHandler: amrx (r0v21 'e' amrx A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:382:0x0809] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x091d A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }, ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:382:0x0809] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x094b A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0962 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0965 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }, ExcHandler: VolleyError (e com.android.volley.VolleyError), Splitter:B:382:0x0809] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x097e A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0985 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x09b1 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x09b8 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x09cc A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x09d3 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x09f7 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0a15 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0a22 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0a2f A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0a4d A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0a5a A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0a73 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0a7b A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0a7c A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0ab5 A[Catch:{ gid -> 0x089f, VolleyError -> 0x089c, SQLiteException -> 0x0899, amrx -> 0x0901, RuntimeException -> 0x08ac, all -> 0x08a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0b73  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0b82 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0bba A[ExcHandler: amrx (e amrx), Splitter:B:52:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0c00  */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x0c28  */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0ccc  */
    /* JADX WARNING: Removed duplicated region for block: B:602:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:603:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:605:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* renamed from: a */
    public final boolean mo41132a(Account account, Bundle bundle, SyncResult syncResult) {
        int i;
        int i2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        List list;
        boolean z4;
        Context context;
        Throwable th;
        int i3;
        bmvz bmvz;
        String str;
        long j3;
        gid gid;
        SyncResult syncResult2;
        int i4;
        long j4;
        VolleyError volleyError;
        int i5;
        NetworkResponse networkResponse;
        String str2;
        NetworkResponse networkResponse2;
        String str3;
        String valueOf;
        String str4;
        int e;
        int a;
        int i6;
        int i7;
        int min;
        SQLiteException sQLiteException;
        int i8;
        amrx amrx;
        long j5;
        int i9;
        int i10;
        RuntimeException runtimeException;
        long j6;
        boolean z5;
        boolean z6;
        Throwable th2;
        int i11;
        SyncResult syncResult3;
        gid gid2;
        List list2;
        ? r7;
        long j7;
        List list3;
        ? r72;
        long j8;
        SyncResult syncResult4;
        amrx amrx2;
        ? r73;
        long j9;
        List list4;
        ? r74;
        List list5;
        int i12;
        long b;
        long j10;
        long j11;
        ? r15;
        long j12;
        long j13;
        boolean z7;
        boolean z8;
        List list6;
        Account account2 = account;
        Bundle bundle2 = bundle;
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83341bR()).booleanValue()) {
            synchronized (this) {
                try {
                    String str5 = account2.name;
                    SharedPreferences sharedPreferences = alsj.m61651a(getContext()).f74200a;
                    String valueOf2 = String.valueOf(str5);
                    long currentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong(valueOf2.length() == 0 ? new String("menagerie_last_sync_trigerred_timestamp_") : "menagerie_last_sync_trigerred_timestamp_".concat(valueOf2), 0);
                    amig.m62939a();
                    long longValue = Long.valueOf(cgbe.f186279a.mo6606a().mo83342bS()).longValue();
                    if (currentTimeMillis > 0) {
                        if (currentTimeMillis < longValue) {
                            if (cgay.m144134g()) {
                                list6 = m62716a(account);
                            } else {
                                list6 = null;
                            }
                            this.f74777b.mo41137a(account, 0, bundle, 10, (Exception) null, list6, 0, cgbe.m144185n(), amea.m62731a(bundle), bmvz.f131120a);
                            if (cgav.m144112e()) {
                                m62720b(account2.name);
                            }
                        }
                    }
                    String str6 = account2.name;
                    alsj a2 = alsj.m61651a(getContext());
                    long currentTimeMillis2 = System.currentTimeMillis();
                    sdo.m34973b((String) null);
                    SharedPreferences.Editor edit = a2.f74200a.edit();
                    String valueOf3 = String.valueOf(str6);
                    edit.putLong(valueOf3.length() == 0 ? new String("menagerie_last_sync_trigerred_timestamp_") : "menagerie_last_sync_trigerred_timestamp_".concat(valueOf3), currentTimeMillis2).commit();
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
        }
        if (altq.m61812a()) {
            return false;
        }
        if (soz.m35807f(getContext())) {
            this.f74777b.mo41138a(account2, "Disabling sync for restricted user.");
            amea.m62727a(account2, "com.google.android.gms.people", 0);
            return false;
        }
        String a3 = anbj.m63920a(bundle);
        int b2 = amea.m62733b(bundle);
        if (!cgav.m144109b() && b2 == 4) {
            return false;
        }
        if (!cgav.f186252a.mo6606a().mo83199c() && b2 == 4 && !m62718a(account2.name)) {
            return false;
        }
        int b3 = anbj.m63921b(bundle);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f74776a.mo41293a();
        try {
            CountDownLatch countDownLatch = altq.m61806a(getContext()).f74251g;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (InterruptedException e2) {
            i2 = 51;
            i = 2;
            j2 = -1;
            throw new amrx();
        } catch (amrx e3) {
            j = j2;
            try {
                Context context2 = getContext();
                String str7 = account2.name;
                StringBuilder sb = new StringBuilder(i2);
                sb.append("***Sync canceled***, duration: ");
                sb.append(j);
                aluj.m61899a(context2, "PeopleSync", str7, sb.toString());
                if (cgay.m144136i() && f74775h.nextDouble() < cgay.m144137j()) {
                    if (altq.m61806a(getContext()).mo40763b() == null) {
                        return false;
                    }
                    almk.m61263a().mo40523a(account2.name, alto.f74230c, alto.f74231d, 3);
                    alto.m61778h();
                }
                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83282aL()).booleanValue()) {
                }
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                if (cgay.m144136i() && f74775h.nextDouble() < cgay.m144137j()) {
                    if (altq.m61806a(getContext()).mo40763b() == null) {
                        return false;
                    }
                    almk.m61263a().mo40523a(account2.name, alto.f74230c, alto.f74231d, i);
                    alto.m61778h();
                }
                throw th5;
            }
        }
        try {
            this.f74777b.mo41140a(false);
            if (bundle2 != null) {
                if (bundle2.getBoolean("initialize", false)) {
                    altq.m61806a(getContext()).mo40774g();
                    amea amea = this.f74777b;
                    aluj.m61900a(amea.f74784a, "PeopleSync", account2.name, (String) null, "initializeSyncState");
                    amdl.m62660a();
                    int isSyncable = ContentResolver.getIsSyncable(account2, "com.google.android.gms.people");
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("initializeSyncState: syncable=");
                    sb2.append(isSyncable);
                    amea.mo41138a(account2, sb2.toString());
                    if (isSyncable < 0) {
                        amea.m62727a(account2, "com.google.android.gms.people", 1);
                        amea.m62729a(account2, "com.google.android.gms.people", true);
                        amea.mo41136a(account2);
                        if (cgbe.f186279a.mo6606a().mo83264U()) {
                            aluj.m61897a(amea.f74784a, "PeopleSync", account2, "requestSyncNow");
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("force", true);
                            bundle3.putBoolean("expedited", true);
                            amea.m62728a(account2, "com.google.android.gms.people", bundle3);
                        }
                    }
                    if (!cgbe.f186279a.mo6606a().mo83379cC()) {
                        if (cgay.m144136i() && f74775h.nextDouble() < cgay.m144137j() && altq.m61806a(getContext()).mo40763b() != null) {
                            almk.m61263a().mo40523a(account2.name, alto.f74230c, alto.f74231d, 2);
                            alto.m61778h();
                        }
                        return false;
                    }
                }
            }
            boolean z9 = !this.f74778c.mo41688a(getContext(), account2.name);
            if (bundle2 != null) {
                z = bundle2.getBoolean("gms.people.contacts_sync", false);
            } else {
                z = false;
            }
            if (bundle2 != null) {
                z2 = bundle2.getBoolean("page_only", false);
            } else {
                z2 = false;
            }
            if (bundle2 != null) {
                z3 = bundle2.getBoolean("gms.people.skip_main_sync", false);
            } else {
                z3 = false;
            }
            Context context3 = getContext();
            String str8 = account2.name;
            String valueOf4 = String.valueOf(Integer.toString(b3 - 1));
            StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 100 + String.valueOf(valueOf4).length());
            sb3.append("***Sync start***: feed=");
            sb3.append(a3);
            sb3.append(" cannotHavePeople=");
            sb3.append(z9);
            sb3.append(" mode=");
            sb3.append(valueOf4);
            sb3.append(" contactOnly=");
            sb3.append(z);
            sb3.append(" pageOnly=");
            sb3.append(z2);
            sb3.append(" skipMain=");
            sb3.append(z3);
            aluj.m61900a(context3, "PeopleSync", str8, (String) null, sb3.toString());
            if (this.f74777b.mo41151d(account2.name)) {
                this.f74777b.mo41136a(account2);
            }
            this.f74776a.mo41294b();
            if (amea.m62730a(b3)) {
                amea amea2 = this.f74777b;
                String str9 = account2.name;
                long m = cgbe.m144184m();
                ? a4 = amea2.mo41142a(str9, (String) null, m);
                if (a4 == 0) {
                    z7 = false;
                } else if (amea2.mo41134a(str9, m).size() == 0) {
                    aluj.m61900a(getContext(), "PeopleSync", account2.name, (String) null, "Data still fresh; skip periodic sync.");
                    if (cgay.f186261a.mo6606a().mo83214j()) {
                        z8 = false;
                        this.f74777b.mo41137a(account, 0, bundle, 12, (Exception) null, cgay.m144134g() ? m62716a(account) : null, this.f74781f.mo66928a(TimeUnit.MILLISECONDS), false, false, (bmxv) bmvz.f131120a);
                    } else {
                        z8 = false;
                    }
                    if (cgav.m144112e()) {
                        m62720b(account2.name);
                    }
                    if (cgay.m144136i() && f74775h.nextDouble() < cgay.m144137j() && altq.m61806a(getContext()).mo40763b() != null) {
                        almk.m61263a().mo40523a(account2.name, alto.f74230c, alto.f74231d, 2);
                        alto.m61778h();
                    }
                    return z8;
                } else {
                    z7 = false;
                }
                z4 = this.f74777b.mo41142a(account2.name, (String) null, cgbe.m144184m());
                context = a4;
                list = z7;
            } else {
                list = 0;
                z4 = false;
                context = context3;
            }
            try {
                List a5 = sqc.m35954a();
                long b4 = m62719b();
                boolean n = cgbe.m144185n();
                boolean a6 = amea.m62731a(bundle);
                amig.m62939a();
                if (((Boolean) amhp.f74918a.mo41191a()).booleanValue()) {
                    try {
                        bmvz = bmxv.m108566b("PeopleSyncAdapter" + ':' + System.currentTimeMillis() + ':' + ancm.f76635f.nextInt());
                    } catch (Throwable th6) {
                        th = th6;
                        i2 = 51;
                        i3 = 2;
                        j2 = -1;
                        j = SystemClock.elapsedRealtime() - elapsedRealtime;
                        try {
                            throw th;
                        } catch (amrx e4) {
                        }
                    }
                } else {
                    bmvz = bmvz.f131120a;
                }
                if (b3 != 2) {
                    try {
                        r72 = context;
                        if (cfxy.m143780b()) {
                            r72 = context;
                        }
                        if (z3) {
                            try {
                                amea amea3 = this.f74777b;
                                amig.m62939a();
                                int intValue = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83317au()).intValue();
                                while (true) {
                                    long c = amea3.mo41147c();
                                    j8 = 0;
                                    j11 = 0;
                                    j13 = 0;
                                    j12 = 0;
                                    j7 = 0;
                                    j4 = 0;
                                    j9 = 0;
                                    j7 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j4 = 0;
                                    j9 = 0;
                                    j8 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j11 = 0;
                                    j4 = 0;
                                    j4 = 0;
                                    j4 = 0;
                                    j10 = 0;
                                    j4 = 0;
                                    j4 = 0;
                                    j4 = 0;
                                    j4 = 0;
                                    j9 = 0;
                                    if (c > 0) {
                                        int i13 = intValue - 1;
                                        if (intValue > 0) {
                                            try {
                                                Thread.sleep(c);
                                                intValue = i13;
                                            } catch (InterruptedException e5) {
                                                r15 = a5;
                                                j2 = -1;
                                                j2 = -1;
                                                j2 = -1;
                                                throw new amrx();
                                            }
                                        }
                                    }
                                    try {
                                        break;
                                    } catch (gid e6) {
                                        e = e6;
                                        list3 = a5;
                                        j2 = -1;
                                        r72 = r72;
                                        gid2 = e;
                                        list2 = list3;
                                        r7 = r72;
                                        i11 = 0;
                                        list = list2;
                                        syncResult3 = r7;
                                        try {
                                            throw gid2;
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                            i10 = i11;
                                            z6 = false;
                                            z5 = false;
                                            list = list;
                                            syncResult2 = syncResult3;
                                        }
                                    } catch (amrx e7) {
                                        e = e7;
                                        list4 = a5;
                                        j2 = -1;
                                        r72 = r72;
                                        amrx2 = e;
                                        r73 = r72;
                                        i11 = 0;
                                        syncResult4 = r73;
                                        try {
                                            throw amrx2;
                                        } catch (Throwable th8) {
                                            th2 = th8;
                                            i10 = i11;
                                            z6 = false;
                                            z5 = true;
                                            syncResult2 = syncResult4;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        list5 = a5;
                                        j2 = -1;
                                        r72 = r72;
                                        th2 = th;
                                        r74 = r72;
                                        z6 = true;
                                        z5 = false;
                                        i10 = 0;
                                        syncResult2 = r74;
                                        try {
                                            m62717a(account2, z5);
                                            if (!z6) {
                                                amea amea4 = this.f74777b;
                                                String str10 = account2.name;
                                                int f = amea4.f74785b.mo40702f(str10) + 1;
                                                amea4.f74785b.mo40691b(str10, f);
                                                long j14 = (long) f;
                                                if (j14 < cgbe.f186279a.mo6606a().mo83389cM()) {
                                                    syncResult2 = syncResult;
                                                } else {
                                                    amea4.mo41139a(str10, "Too many failures.");
                                                    syncResult2 = syncResult;
                                                    syncResult2.tooManyRetries = true;
                                                }
                                                if (j14 >= cgbe.f186279a.mo6606a().mo83388cL()) {
                                                    amea4.mo41139a(str10, "Too many failures.  Disabling sync.");
                                                    Account a7 = amea4.f74786c.mo41676a(amea4.f74784a, str10);
                                                    if (a7 != null) {
                                                        amea.m62729a(a7, "com.google.android.gms.people", false);
                                                    }
                                                }
                                            } else {
                                                syncResult2 = syncResult;
                                                this.f74777b.mo41148c(account2.name);
                                            }
                                            long b5 = m62719b() - b4;
                                            try {
                                                throw th2;
                                            } catch (gid e8) {
                                                gid = e8;
                                                j3 = b5;
                                                i4 = i10;
                                                str = null;
                                            } catch (VolleyError e9) {
                                                volleyError = e9;
                                                j4 = b5;
                                                i5 = i10;
                                                Object[] objArr = new Object[2];
                                                objArr[0] = volleyError.getMessage();
                                                networkResponse = volleyError.networkResponse;
                                                if (networkResponse != null) {
                                                }
                                                objArr[1] = str2;
                                                amdk.m62659b("PeopleSync", "Network request failed: %s [%s]", objArr);
                                                syncResult2.stats.numIoExceptions++;
                                                Context context4 = getContext();
                                                String str11 = account2.name;
                                                Locale locale = Locale.US;
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = volleyError.getMessage();
                                                networkResponse2 = volleyError.networkResponse;
                                                if (networkResponse2 != null) {
                                                }
                                                objArr2[1] = str3;
                                                valueOf = String.valueOf(String.format(locale, "%s [%s]", objArr2));
                                                if (valueOf.length() == 0) {
                                                }
                                                aluj.m61901a(context4, "PeopleSync", str11, null, str4, volleyError);
                                                amea amea5 = this.f74777b;
                                                String str12 = account2.name;
                                                sdo.m34959a((Object) str12);
                                                sdo.m34959a(volleyError);
                                                e = amea5.f74785b.mo40700e(str12);
                                                a = anbi.m63919a(volleyError);
                                                if (a != 0) {
                                                }
                                                if (i6 <= 0) {
                                                }
                                                if (a != 0) {
                                                }
                                                if (i7 == 0) {
                                                }
                                                boolean z10 = false;
                                                if (e <= 0) {
                                                }
                                                min = Math.min((int) cgbe.f186279a.mo6606a().mo83390cN(), i6);
                                                Context context5 = amea5.f74784a;
                                                StringBuilder sb4 = new StringBuilder(19);
                                                sb4.append("backoff=");
                                                sb4.append(min);
                                                aluj.m61900a(context5, "PeopleSync", str12, (String) null, sb4.toString());
                                                amea5.f74785b.mo40680a(str12, min);
                                                if (min > 0) {
                                                }
                                                List list7 = list;
                                                i3 = 2;
                                                i = 2;
                                                try {
                                                    this.f74777b.mo41137a(account, i5, bundle, 4, volleyError, list7, j4, n, a6, bmvz);
                                                    j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    try {
                                                        Context context6 = getContext();
                                                        String str13 = account2.name;
                                                        i2 = 51;
                                                        try {
                                                            StringBuilder sb5 = new StringBuilder(51);
                                                            sb5.append("***Sync finished***, duration: ");
                                                            sb5.append(j);
                                                            aluj.m61899a(context6, "PeopleSync", str13, sb5.toString());
                                                            if (altq.m61806a(getContext()).mo40763b() != null) {
                                                            }
                                                        } catch (amrx e10) {
                                                            Context context22 = getContext();
                                                            String str72 = account2.name;
                                                            StringBuilder sb6 = new StringBuilder(i2);
                                                            sb6.append("***Sync canceled***, duration: ");
                                                            sb6.append(j);
                                                            aluj.m61899a(context22, "PeopleSync", str72, sb6.toString());
                                                            if (altq.m61806a(getContext()).mo40763b() == null) {
                                                            }
                                                        }
                                                    } catch (amrx e11) {
                                                        i2 = 51;
                                                        Context context222 = getContext();
                                                        String str722 = account2.name;
                                                        StringBuilder sb62 = new StringBuilder(i2);
                                                        sb62.append("***Sync canceled***, duration: ");
                                                        sb62.append(j);
                                                        aluj.m61899a(context222, "PeopleSync", str722, sb62.toString());
                                                        if (altq.m61806a(getContext()).mo40763b() == null) {
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    i2 = 51;
                                                }
                                            } catch (SQLiteException e12) {
                                                sQLiteException = e12;
                                                j4 = b5;
                                                i8 = i10;
                                                Log.e("PeopleSync", "Database operation failed", sQLiteException);
                                                syncResult2.databaseError = true;
                                                aluj.m61901a(getContext(), "PeopleSync", account2.name, null, "***DB error***", sQLiteException);
                                                if (this.f74779d.mo41676a(getContext(), account2.name) != null) {
                                                }
                                                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                Context context62 = getContext();
                                                String str132 = account2.name;
                                                i2 = 51;
                                                StringBuilder sb52 = new StringBuilder(51);
                                                sb52.append("***Sync finished***, duration: ");
                                                sb52.append(j);
                                                aluj.m61899a(context62, "PeopleSync", str132, sb52.toString());
                                                if (altq.m61806a(getContext()).mo40763b() != null) {
                                                }
                                            } catch (amrx e13) {
                                                amrx = e13;
                                                j5 = b5;
                                                i9 = i10;
                                                this.f74777b.mo41137a(account, i9, bundle, 2, amrx, list, j5, n, a6, bmvz);
                                                throw amrx;
                                            } catch (RuntimeException e14) {
                                                runtimeException = e14;
                                                j6 = b5;
                                                aluj.m61901a(getContext(), "PeopleSync", account2.name, null, "***Unknown error***", runtimeException);
                                                if (this.f74779d.mo41676a(getContext(), account2.name) != null) {
                                                }
                                                if (account2.name != null) {
                                                }
                                                throw runtimeException;
                                            }
                                        } catch (gid e15) {
                                            e = e15;
                                            SyncResult syncResult5 = syncResult;
                                            gid gid3 = e;
                                            str = null;
                                            SyncResult syncResult6 = syncResult5;
                                            gid = gid3;
                                            j3 = j4;
                                            i4 = i10;
                                            try {
                                                syncResult2.stats.numAuthExceptions++;
                                                aluj.m61900a(getContext(), "PeopleSync", account2.name, str, "***Auth error***");
                                                gid gid4 = gid;
                                                List list8 = list;
                                                i3 = 2;
                                                i = 2;
                                                try {
                                                    this.f74777b.mo41137a(account, i4, bundle, 3, gid4, list8, j3, n, a6, bmvz);
                                                    j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    Context context622 = getContext();
                                                    String str1322 = account2.name;
                                                    i2 = 51;
                                                    StringBuilder sb522 = new StringBuilder(51);
                                                    sb522.append("***Sync finished***, duration: ");
                                                    sb522.append(j);
                                                    aluj.m61899a(context622, "PeopleSync", str1322, sb522.toString());
                                                    if (altq.m61806a(getContext()).mo40763b() != null) {
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    i2 = 51;
                                                    th = th;
                                                    j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    throw th;
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                i2 = 51;
                                                i3 = 2;
                                                th = th;
                                                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                throw th;
                                            }
                                        } catch (VolleyError e16) {
                                        } catch (SQLiteException e17) {
                                        } catch (amrx e18) {
                                        } catch (RuntimeException e19) {
                                        }
                                    }
                                }
                            } catch (InterruptedException e20) {
                                r15 = a5;
                                j11 = 0;
                                j2 = -1;
                                j2 = -1;
                                j2 = -1;
                                throw new amrx();
                            }
                        } else {
                            list = a5;
                            j10 = 0;
                            j2 = -1;
                            i12 = 0;
                        }
                        this.f74776a.mo41294b();
                        try {
                            m62717a(account2, false);
                            this.f74777b.mo41148c(account2.name);
                            b = m62719b() - b4;
                            try {
                                amea amea6 = this.f74777b;
                                String str14 = account2.name;
                                sdo.m34959a((Object) str14);
                                amea6.f74785b.mo40680a(str14, 0);
                                this.f74777b.mo41137a(account, i12, bundle, 1, (Exception) null, list, b, n, a6, bmvz);
                                i = 2;
                            } catch (gid e21) {
                                syncResult2 = syncResult;
                                gid = e21;
                                j3 = b;
                                i4 = i12;
                                str = null;
                                syncResult2.stats.numAuthExceptions++;
                                aluj.m61900a(getContext(), "PeopleSync", account2.name, str, "***Auth error***");
                                gid gid42 = gid;
                                List list82 = list;
                                i3 = 2;
                                i = 2;
                                this.f74777b.mo41137a(account, i4, bundle, 3, gid42, list82, j3, n, a6, bmvz);
                                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                Context context6222 = getContext();
                                String str13222 = account2.name;
                                i2 = 51;
                                StringBuilder sb5222 = new StringBuilder(51);
                                sb5222.append("***Sync finished***, duration: ");
                                sb5222.append(j);
                                aluj.m61899a(context6222, "PeopleSync", str13222, sb5222.toString());
                                if (altq.m61806a(getContext()).mo40763b() != null) {
                                }
                            } catch (VolleyError e22) {
                                syncResult2 = syncResult;
                                volleyError = e22;
                                j4 = b;
                                i5 = i12;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = volleyError.getMessage();
                                networkResponse = volleyError.networkResponse;
                                if (networkResponse != null) {
                                }
                                objArr3[1] = str2;
                                amdk.m62659b("PeopleSync", "Network request failed: %s [%s]", objArr3);
                                syncResult2.stats.numIoExceptions++;
                                Context context42 = getContext();
                                String str112 = account2.name;
                                Locale locale2 = Locale.US;
                                Object[] objArr22 = new Object[2];
                                objArr22[0] = volleyError.getMessage();
                                networkResponse2 = volleyError.networkResponse;
                                if (networkResponse2 != null) {
                                }
                                objArr22[1] = str3;
                                valueOf = String.valueOf(String.format(locale2, "%s [%s]", objArr22));
                                if (valueOf.length() == 0) {
                                }
                                aluj.m61901a(context42, "PeopleSync", str112, null, str4, volleyError);
                                amea amea52 = this.f74777b;
                                String str122 = account2.name;
                                sdo.m34959a((Object) str122);
                                sdo.m34959a(volleyError);
                                e = amea52.f74785b.mo40700e(str122);
                                a = anbi.m63919a(volleyError);
                                if (a != 0) {
                                }
                                if (i6 <= 0) {
                                }
                                if (a != 0) {
                                }
                                if (i7 == 0) {
                                }
                                boolean z102 = false;
                                if (e <= 0) {
                                }
                                min = Math.min((int) cgbe.f186279a.mo6606a().mo83390cN(), i6);
                                Context context52 = amea52.f74784a;
                                StringBuilder sb42 = new StringBuilder(19);
                                sb42.append("backoff=");
                                sb42.append(min);
                                aluj.m61900a(context52, "PeopleSync", str122, (String) null, sb42.toString());
                                amea52.f74785b.mo40680a(str122, min);
                                if (min > 0) {
                                }
                                List list72 = list;
                                i3 = 2;
                                i = 2;
                                this.f74777b.mo41137a(account, i5, bundle, 4, volleyError, list72, j4, n, a6, bmvz);
                                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                Context context62222 = getContext();
                                String str132222 = account2.name;
                                i2 = 51;
                                StringBuilder sb52222 = new StringBuilder(51);
                                sb52222.append("***Sync finished***, duration: ");
                                sb52222.append(j);
                                aluj.m61899a(context62222, "PeopleSync", str132222, sb52222.toString());
                                if (altq.m61806a(getContext()).mo40763b() != null) {
                                }
                            } catch (SQLiteException e23) {
                                syncResult2 = syncResult;
                                sQLiteException = e23;
                                j4 = b;
                                i8 = i12;
                                Log.e("PeopleSync", "Database operation failed", sQLiteException);
                                syncResult2.databaseError = true;
                                aluj.m61901a(getContext(), "PeopleSync", account2.name, null, "***DB error***", sQLiteException);
                                if (this.f74779d.mo41676a(getContext(), account2.name) != null) {
                                }
                                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                                Context context622222 = getContext();
                                String str1322222 = account2.name;
                                i2 = 51;
                                StringBuilder sb522222 = new StringBuilder(51);
                                sb522222.append("***Sync finished***, duration: ");
                                sb522222.append(j);
                                aluj.m61899a(context622222, "PeopleSync", str1322222, sb522222.toString());
                                if (altq.m61806a(getContext()).mo40763b() != null) {
                                }
                            } catch (amrx e24) {
                                j5 = b;
                                i9 = i12;
                                amrx = e24;
                                this.f74777b.mo41137a(account, i9, bundle, 2, amrx, list, j5, n, a6, bmvz);
                                throw amrx;
                            } catch (RuntimeException e25) {
                                j6 = b;
                                i10 = i12;
                                runtimeException = e25;
                                aluj.m61901a(getContext(), "PeopleSync", account2.name, null, "***Unknown error***", runtimeException);
                                if (this.f74779d.mo41676a(getContext(), account2.name) != null) {
                                }
                                if (account2.name != null) {
                                }
                                throw runtimeException;
                            }
                        } catch (gid e26) {
                            syncResult2 = syncResult;
                            gid = e26;
                            i4 = i12;
                            j3 = j4;
                            str = null;
                            syncResult2.stats.numAuthExceptions++;
                            aluj.m61900a(getContext(), "PeopleSync", account2.name, str, "***Auth error***");
                            gid gid422 = gid;
                            List list822 = list;
                            i3 = 2;
                            i = 2;
                            this.f74777b.mo41137a(account, i4, bundle, 3, gid422, list822, j3, n, a6, bmvz);
                            j = SystemClock.elapsedRealtime() - elapsedRealtime;
                            Context context6222222 = getContext();
                            String str13222222 = account2.name;
                            i2 = 51;
                            StringBuilder sb5222222 = new StringBuilder(51);
                            sb5222222.append("***Sync finished***, duration: ");
                            sb5222222.append(j);
                            aluj.m61899a(context6222222, "PeopleSync", str13222222, sb5222222.toString());
                            if (altq.m61806a(getContext()).mo40763b() != null) {
                            }
                        } catch (VolleyError e27) {
                            syncResult2 = syncResult;
                            volleyError = e27;
                            i5 = i12;
                            Object[] objArr32 = new Object[2];
                            objArr32[0] = volleyError.getMessage();
                            networkResponse = volleyError.networkResponse;
                            if (networkResponse != null) {
                            }
                            objArr32[1] = str2;
                            amdk.m62659b("PeopleSync", "Network request failed: %s [%s]", objArr32);
                            syncResult2.stats.numIoExceptions++;
                            Context context422 = getContext();
                            String str1122 = account2.name;
                            Locale locale22 = Locale.US;
                            Object[] objArr222 = new Object[2];
                            objArr222[0] = volleyError.getMessage();
                            networkResponse2 = volleyError.networkResponse;
                            if (networkResponse2 != null) {
                            }
                            objArr222[1] = str3;
                            valueOf = String.valueOf(String.format(locale22, "%s [%s]", objArr222));
                            if (valueOf.length() == 0) {
                            }
                            aluj.m61901a(context422, "PeopleSync", str1122, null, str4, volleyError);
                            amea amea522 = this.f74777b;
                            String str1222 = account2.name;
                            sdo.m34959a((Object) str1222);
                            sdo.m34959a(volleyError);
                            e = amea522.f74785b.mo40700e(str1222);
                            a = anbi.m63919a(volleyError);
                            if (a != 0) {
                            }
                            if (i6 <= 0) {
                            }
                            if (a != 0) {
                            }
                            if (i7 == 0) {
                            }
                            boolean z1022 = false;
                            if (e <= 0) {
                            }
                            min = Math.min((int) cgbe.f186279a.mo6606a().mo83390cN(), i6);
                            Context context522 = amea522.f74784a;
                            StringBuilder sb422 = new StringBuilder(19);
                            sb422.append("backoff=");
                            sb422.append(min);
                            aluj.m61900a(context522, "PeopleSync", str1222, (String) null, sb422.toString());
                            amea522.f74785b.mo40680a(str1222, min);
                            if (min > 0) {
                            }
                            List list722 = list;
                            i3 = 2;
                            i = 2;
                            this.f74777b.mo41137a(account, i5, bundle, 4, volleyError, list722, j4, n, a6, bmvz);
                            j = SystemClock.elapsedRealtime() - elapsedRealtime;
                            Context context62222222 = getContext();
                            String str132222222 = account2.name;
                            i2 = 51;
                            StringBuilder sb52222222 = new StringBuilder(51);
                            sb52222222.append("***Sync finished***, duration: ");
                            sb52222222.append(j);
                            aluj.m61899a(context62222222, "PeopleSync", str132222222, sb52222222.toString());
                            if (altq.m61806a(getContext()).mo40763b() != null) {
                            }
                        } catch (SQLiteException e28) {
                            syncResult2 = syncResult;
                            sQLiteException = e28;
                            i8 = i12;
                            Log.e("PeopleSync", "Database operation failed", sQLiteException);
                            syncResult2.databaseError = true;
                            aluj.m61901a(getContext(), "PeopleSync", account2.name, null, "***DB error***", sQLiteException);
                            if (this.f74779d.mo41676a(getContext(), account2.name) != null) {
                            }
                            j = SystemClock.elapsedRealtime() - elapsedRealtime;
                            Context context622222222 = getContext();
                            String str1322222222 = account2.name;
                            i2 = 51;
                            StringBuilder sb522222222 = new StringBuilder(51);
                            sb522222222.append("***Sync finished***, duration: ");
                            sb522222222.append(j);
                            aluj.m61899a(context622222222, "PeopleSync", str1322222222, sb522222222.toString());
                            if (altq.m61806a(getContext()).mo40763b() != null) {
                            }
                        } catch (amrx e29) {
                            amrx = e29;
                            i9 = i12;
                            j5 = j4;
                            this.f74777b.mo41137a(account, i9, bundle, 2, amrx, list, j5, n, a6, bmvz);
                            throw amrx;
                        } catch (RuntimeException e30) {
                            runtimeException = e30;
                            i10 = i12;
                            j6 = j4;
                            aluj.m61901a(getContext(), "PeopleSync", account2.name, null, "***Unknown error***", runtimeException);
                            if (this.f74779d.mo41676a(getContext(), account2.name) != null) {
                            }
                            if (account2.name != null) {
                            }
                            throw runtimeException;
                        }
                        try {
                            j = SystemClock.elapsedRealtime() - elapsedRealtime;
                            Context context6222222222 = getContext();
                            String str13222222222 = account2.name;
                            i2 = 51;
                            StringBuilder sb5222222222 = new StringBuilder(51);
                            sb5222222222.append("***Sync finished***, duration: ");
                            sb5222222222.append(j);
                            aluj.m61899a(context6222222222, "PeopleSync", str13222222222, sb5222222222.toString());
                            if (cgay.m144136i() && f74775h.nextDouble() < cgay.m144137j()) {
                                if (altq.m61806a(getContext()).mo40763b() != null) {
                                    return false;
                                }
                                almk.m61263a().mo40523a(account2.name, alto.f74230c, alto.f74231d, i);
                                alto.m61778h();
                            }
                        } catch (amrx e31) {
                            i2 = 51;
                            j = j2;
                            Context context2222 = getContext();
                            String str7222 = account2.name;
                            StringBuilder sb622 = new StringBuilder(i2);
                            sb622.append("***Sync canceled***, duration: ");
                            sb622.append(j);
                            aluj.m61899a(context2222, "PeopleSync", str7222, sb622.toString());
                            if (altq.m61806a(getContext()).mo40763b() == null) {
                            }
                        }
                        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83282aL()).booleanValue()) {
                            return true;
                        }
                        Context context7 = getContext();
                        altq.m61806a(getContext());
                        long a8 = sra.m36059a(context7, "pluscontacts.db");
                        almk.m61263a();
                        String str15 = account2.name;
                        amig.m62939a();
                        if (almk.f73722a.nextDouble() >= Double.valueOf(cgbe.f186279a.mo6606a().mo83281aK()).doubleValue()) {
                            return true;
                        }
                        bxvd da = ammb.f75247o.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ammb ammb = (ammb) da.f164949b;
                        ammb.f75249a |= 1;
                        ammb.f75250b = a8;
                        ammb ammb2 = (ammb) da.mo74062i();
                        bxvd da2 = amoh.f75593x.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        amoh amoh = (amoh) da2.f164949b;
                        ammb2.getClass();
                        amoh.f75607m = ammb2;
                        amoh.f75595a |= 1024;
                        alml.m61288a(str15, da2);
                        return true;
                    } catch (gid e32) {
                        e = e32;
                        list3 = a5;
                        j8 = 0;
                        r72 = context;
                        j2 = -1;
                        r72 = r72;
                        gid2 = e;
                        list2 = list3;
                        r7 = r72;
                        i11 = 0;
                        list = list2;
                        syncResult3 = r7;
                        throw gid2;
                    } catch (amrx e33) {
                        e = e33;
                        list4 = a5;
                        j9 = 0;
                        r72 = context;
                        j2 = -1;
                        r72 = r72;
                        amrx2 = e;
                        r73 = r72;
                        i11 = 0;
                        syncResult4 = r73;
                        throw amrx2;
                    } catch (Throwable th13) {
                        th = th13;
                        list5 = a5;
                        j4 = 0;
                        r72 = context;
                        j2 = -1;
                        r72 = r72;
                        th2 = th;
                        r74 = r72;
                        z6 = true;
                        z5 = false;
                        i10 = 0;
                        syncResult2 = r74;
                        m62717a(account2, z5);
                        if (!z6) {
                        }
                        long b52 = m62719b() - b4;
                        throw th2;
                    }
                }
                try {
                    long cZ = cgbe.f186279a.mo6606a().mo83402cZ();
                    r72 = 2;
                    r72 = 2;
                    r72 = 2;
                    if (amea.m62733b(bundle) == 2) {
                        cZ = cgbe.f186279a.mo6606a().mo83430da();
                    }
                    if (cZ > 0) {
                        try {
                            Thread.sleep(cZ * 1000);
                        } catch (InterruptedException e34) {
                        }
                    }
                    if (z3) {
                    }
                } catch (gid e35) {
                    gid2 = e35;
                    List list9 = a5;
                    j7 = 0;
                    Context context8 = context;
                    j2 = -1;
                    list2 = list9;
                    r7 = context8;
                    i11 = 0;
                    list = list2;
                    syncResult3 = r7;
                    throw gid2;
                } catch (amrx e36) {
                    amrx2 = e36;
                    List list10 = a5;
                    j12 = 0;
                    Context context9 = context;
                    j2 = -1;
                    r73 = context9;
                    i11 = 0;
                    syncResult4 = r73;
                    throw amrx2;
                } catch (Throwable th14) {
                    th2 = th14;
                    List list11 = a5;
                    j13 = 0;
                    Context context10 = context;
                    j2 = -1;
                    r74 = context10;
                    z6 = true;
                    z5 = false;
                    i10 = 0;
                    syncResult2 = r74;
                    m62717a(account2, z5);
                    if (!z6) {
                    }
                    long b522 = m62719b() - b4;
                    throw th2;
                }
                try {
                    this.f74776a.mo41294b();
                    m62717a(account2, false);
                    this.f74777b.mo41148c(account2.name);
                    b = m62719b() - b4;
                    amea amea62 = this.f74777b;
                    String str142 = account2.name;
                    sdo.m34959a((Object) str142);
                    amea62.f74785b.mo40680a(str142, 0);
                    this.f74777b.mo41137a(account, i12, bundle, 1, (Exception) null, list, b, n, a6, bmvz);
                    i = 2;
                    j = SystemClock.elapsedRealtime() - elapsedRealtime;
                    Context context62222222222 = getContext();
                    String str132222222222 = account2.name;
                    i2 = 51;
                    StringBuilder sb52222222222 = new StringBuilder(51);
                    sb52222222222.append("***Sync finished***, duration: ");
                    sb52222222222.append(j);
                    aluj.m61899a(context62222222222, "PeopleSync", str132222222222, sb52222222222.toString());
                    if (altq.m61806a(getContext()).mo40763b() != null) {
                    }
                } catch (gid e37) {
                    gid2 = e37;
                    i11 = i12;
                    syncResult3 = r72;
                    throw gid2;
                } catch (amrx e38) {
                    amrx2 = e38;
                    i11 = i12;
                    syncResult4 = r72;
                    throw amrx2;
                } catch (Throwable th15) {
                    Throwable th16 = th15;
                    i10 = i12;
                    SyncResult syncResult7 = r72;
                    z6 = true;
                    z5 = false;
                    syncResult2 = syncResult7;
                    m62717a(account2, z5);
                    if (!z6) {
                    }
                    long b5222 = m62719b() - b4;
                    throw th2;
                }
            } catch (Throwable th17) {
                th = th17;
                i2 = 51;
                i3 = 2;
                j2 = -1;
                th = th;
                j = SystemClock.elapsedRealtime() - elapsedRealtime;
                throw th;
            }
        } catch (amrx e39) {
        } catch (Throwable th18) {
            th = th18;
            i = 2;
            Throwable th52 = th;
            if (altq.m61806a(getContext()).mo40763b() == null) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11596a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (cgbe.f186279a.mo6606a().mo83429d() && bundle != null && !bundle.getBoolean("user_or_self_requested", false)) {
            Log.w("PeopleSync", "Only user requested syncs are run during API tests");
            return false;
        }
        amig.m62939a();
        if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83338bO()).booleanValue()) {
            return mo41132a(account, bundle, syncResult);
        }
        try {
            return mo41132a(account, bundle, syncResult);
        } catch (Exception e) {
            amdk.m62659b("PeopleSync", "Unable to perform sync due to general exception: %s", e);
            ande.f76660a.mo41719a(getContext()).mo41718a(e, ((Double) amgz.f74902a.mo41191a()).doubleValue());
            return false;
        }
    }
}
