package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.toolbox.Volley;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qwa {

    /* renamed from: a */
    public static final imo f42284a = new qvz();

    /* renamed from: b */
    public static final bnhe f42285b;

    /* renamed from: c */
    public static final bngj f42286c;

    /* renamed from: d */
    private static final sek f42287d = qqu.m32672c("SyncManager");

    /* renamed from: e */
    private final Context f42288e;

    /* renamed from: f */
    private final qwd f42289f = new qwd();

    /* renamed from: g */
    private final qvy f42290g;

    /* renamed from: h */
    private final qtr f42291h;

    /* renamed from: i */
    private final qvt f42292i;

    /* renamed from: j */
    private final qta f42293j;

    /* renamed from: k */
    private final Object f42294k;

    /* renamed from: l */
    private final qvb f42295l;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("PASSWORD", 303);
        h.mo67695b("AUTOFILL_WALLET", 304);
        h.mo67695b("NIGORI", Integer.valueOf((int) ErrorInfo.TYPE_FSC_HTTP_ERROR));
        h.mo67695b("PREFERENCE", 302);
        f42285b = h.mo67618b();
        bngh b = bngj.m109310b();
        b.mo67617a("PASSWORD", 2);
        b.mo67617a("AUTOFILL_WALLET", 4);
        b.mo67617a("PREFERENCE", 1);
        f42286c = b.mo67618b();
    }

    public qwa(Context context) {
        this.f42288e = context;
        this.f42290g = new qvy(context);
        this.f42291h = qtr.m32879a();
        this.f42292i = (qvt) qvt.f42265a.mo13145b();
        this.f42293j = (qta) qta.f42084i.mo13145b();
        this.f42295l = (qvb) qvb.f42218a.mo13145b();
        this.f42294k = new Object();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    private final void m32983a(acyr acyr, String str) {
        bqgy bqgy;
        acyr acyr2 = acyr;
        String str2 = str;
        qvy qvy = this.f42290g;
        if (cdcx.m132659b() && f42286c.containsKey(str2) && qvy.mo24301a(acyr2, ((Integer) f42286c.get(str2)).intValue()) && ((String) qvy.f42280e.mo24253a(acyr2, qta.m32826a(str))).isEmpty()) {
            try {
                qvb qvb = this.f42295l;
                String str3 = acyr2.f61088b;
                try {
                    String a = addi.m50206a(qvb.f42219b).mo33343a(cddd.m132675b(), "GCM");
                    String b = cddd.m132675b();
                    String a2 = cddd.f180519a.mo6606a().mo77281a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 29 + String.valueOf(b).length() + String.valueOf(a).length());
                    sb.append(a2);
                    sb.append(b);
                    sb.append("/rel/topics?subscriber_token=");
                    sb.append(a);
                    String sb2 = sb.toString();
                    Account account = new Account(str3, "com.google");
                    try {
                        Context context = qvb.f42219b;
                        String valueOf = String.valueOf(cddd.f180519a.mo6606a().mo77282b());
                        String a3 = gie.m13187a(context, account, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("public_topic_name", str2);
                            bqgy c = bqgy.m112818c();
                            HashMap hashMap = new HashMap();
                            hashMap.put("Content-Type", "application/json");
                            hashMap.put("X-GFE-SSL", "yes");
                            String valueOf2 = String.valueOf(a3);
                            hashMap.put("Authorization", valueOf2.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf2));
                            qva qva = new qva(sb2, hashMap, jSONObject, new qux(c), new quy(c));
                            qva.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 2, 1.0f));
                            Volley.newRequestQueue(qvb.f42219b).add(qva);
                            bqgy = c;
                        } catch (JSONException e) {
                            bqgy = bqga.m112777a((Throwable) e);
                        }
                    } catch (gid e2) {
                        e = e2;
                        bqgy = bqga.m112777a(e);
                        this.f42293j.mo24254a(acyr2, qta.m32826a(str), (String) bqgy.get());
                    } catch (IOException e3) {
                        e = e3;
                        bqgy = bqga.m112777a(e);
                        this.f42293j.mo24254a(acyr2, qta.m32826a(str), (String) bqgy.get());
                    }
                } catch (IOException e4) {
                    bqgy = bqga.m112777a((Throwable) e4);
                }
                this.f42293j.mo24254a(acyr2, qta.m32826a(str), (String) bqgy.get());
            } catch (InterruptedException | ExecutionException e5) {
                throw new qrp(257, "Error in subscribing to topic.", e5);
            }
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:4:0x0031 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:718:0x0e6d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:105:0x01f1 */
    /* JADX INFO: additional move instructions added (6) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:112:0x0218 */
    /* JADX INFO: additional move instructions added (3) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:614:0x0cc8 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:608:0x0cb7 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:591:0x0c8d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:340:0x073e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:543:0x0b92 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:753:0x071a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:763:0x071a */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:532:0x0b3b */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:450:0x0976 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:443:0x096c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:343:0x0746 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:289:0x062b */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r2v0, types: [qwc], assign insn: 0x0002: MOVE  (r2v0 ? I:?[OBJECT, ARRAY]) = (r44v0 qwc) */
    /* JADX WARN: Type inference failed for: r2v4, assign insn: PHI: (r2v4 ?) = (r2v0 ?), (r2v8 ?) binds: [B:4:0x0031, B:718:0x0e6d] */
    /* JADX WARN: Type inference failed for: r2v8, types: [bxvd], assign insn: PHI: (r2v8 ?) = (r2v45 ?), (r2v176 ?), (r2v181 ?) binds: [B:624:0x0cef, B:25:0x005d, B:717:0x0e6c] */
    /* JADX WARN: Type inference failed for: r2v16, types: [qwc], assign insn: PHI: (r2v16 ?) = (r2v0 ?), (r2v35 ?) binds: [B:77:0x014c, B:656:0x0d94] */
    /* JADX WARN: Type inference failed for: r2v35, assign insn: 0x0da1: MOVE  (r2v35 ? I:?[OBJECT, ARRAY]) = (r44v0 qwc) */
    /* JADX WARN: Type inference failed for: r2v45, assign insn: 0x0cf4: MOVE  (r2v45 ? I:?[OBJECT, ARRAY]) = (r28v6 bxvd) */
    /* JADX WARN: Type inference failed for: r28v38, assign insn: PHI: (r28v38 ?) = (r28v37 int), (r28v60 ?) binds: [B:236:0x04e3, B:267:0x059e] */
    /* JADX WARN: Type inference failed for: r28v40, types: [bstj, bxxc], assign insn: 0x0568: SGET  (r28v40 ? I:bstj) =  bstj.c bstj */
    /* JADX WARN: Type inference failed for: r28v41, types: [chtv], assign insn: 0x0436: SGET  (r28v41 ? I:chtv) =  qrr.f chtv */
    /* JADX WARN: Type inference failed for: r28v44, types: [chtv], assign insn: 0x02ff: SGET  (r28v44 ? I:chtv) =  qrr.b chtv */
    /* JADX WARN: Type inference failed for: r2v176, assign insn: 0x005d: MOVE  (r2v176 ? I:?[OBJECT, ARRAY]) = (r5v84 bxvd) */
    /* JADX WARN: Type inference failed for: r2v177, assign insn: PHI: (r2v177 ?) = (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] */
    /* JADX WARN: Type inference failed for: r2v179, assign insn: PHI: (r2v179 ?) = (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] */
    /* JADX WARN: Type inference failed for: r2v181, assign insn: ?: MOVE  (r2v181 ?) = (r2v9 bxvd) */
    /* JADX WARN: Type inference failed for: r28v60, assign insn: ?: MOVE  (r28v60 ?) = (r28v39 bxvd) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.ArrayList, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0213, code lost:
        if (android.database.DatabaseUtils.longForQuery(r7, r8, r9) != 0) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r25 = r3;
        r3 = r0;
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r25 = r3;
        r3 = r0;
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r3 = r0;
        r4 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0ce4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0ce5, code lost:
        r1 = r43;
        r4 = r44;
        r3 = r0;
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0cee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0cef, code lost:
        r1 = r43;
        r4 = r44;
        r3 = r0;
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0cf8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0cf9, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0d27, code lost:
        r15.mo74035c();
        r15.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x0e86, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x0eee, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        if (((java.lang.Boolean) r9.f42280e.mo24253a(r11, p000.qta.m32825a(r14))).booleanValue() == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01cd, code lost:
        r25 = r3;
        r28 = r5;
        r24 = r6;
        r34 = r12;
        r35 = r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A[ExcHandler: all (r0v90 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 r2 r3 r5 10  PHI: (r1v115 qwa) = (r1v9 qwa), (r1v9 qwa), (r1v9 qwa), (r1v9 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r2v179 ?) = (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r3v106 long) = (r3v14 long), (r3v14 long), (r3v14 long), (r3v14 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r5v87 bxvd) = (r5v28 bxvd), (r5v28 bxvd), (r5v28 bxvd), (r5v28 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[ExcHandler: qvc (r0v89 'e' qvc A[CUSTOM_DECLARE]), PHI: r1 r2 r3 r5 10  PHI: (r1v113 qwa) = (r1v9 qwa), (r1v9 qwa), (r1v9 qwa), (r1v9 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa), (r1v0 qwa) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r2v177 ?) = (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v16 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?), (r2v0 ?) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r3v103 long) = (r3v14 long), (r3v14 long), (r3v14 long), (r3v14 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long), (r3v0 long) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r5v85 bxvd) = (r5v28 bxvd), (r5v28 bxvd), (r5v28 bxvd), (r5v28 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd), (r5v1 bxvd) binds: [B:105:0x01f1, B:96:0x01ba, B:89:0x01a0, B:90:?, B:69:0x0120, B:70:?, B:60:0x00ef, B:47:0x00b9, B:48:?, B:38:0x0091, B:39:?, B:31:0x006f, B:8:0x0039, B:18:0x004f, B:19:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0941 A[Catch:{ bxwf -> 0x092e, bxwf -> 0x0966 }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0948 A[Catch:{ bxwf -> 0x092e, bxwf -> 0x0966 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0955 A[Catch:{ bxwf -> 0x092e, bxwf -> 0x0966 }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x095f A[Catch:{ bxwf -> 0x092e, bxwf -> 0x0966 }] */
    /* JADX WARNING: Removed duplicated region for block: B:621:0x0ce4 A[ExcHandler: all (r0v32 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r25 r28 10  PHI: (r25v26 long) = (r25v27 long), (r25v31 long), (r25v31 long) binds: [B:614:0x0cc8, B:608:0x0cb7, B:609:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r28v7 bxvd) = (r28v8 bxvd), (r28v12 bxvd), (r28v12 bxvd) binds: [B:614:0x0cc8, B:608:0x0cb7, B:609:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:608:0x0cb7] */
    /* JADX WARNING: Removed duplicated region for block: B:623:0x0cee A[ExcHandler: qvc (r0v31 'e' qvc A[CUSTOM_DECLARE]), PHI: r25 r28 10  PHI: (r25v25 long) = (r25v27 long), (r25v31 long), (r25v31 long) binds: [B:614:0x0cc8, B:608:0x0cb7, B:609:?] A[DONT_GENERATE, DONT_INLINE]10  PHI: (r28v6 bxvd) = (r28v8 bxvd), (r28v12 bxvd), (r28v12 bxvd) binds: [B:614:0x0cc8, B:608:0x0cb7, B:609:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:608:0x0cb7] */
    /* JADX WARNING: Removed duplicated region for block: B:638:0x0d26 A[Catch:{ qrp -> 0x0db3, qvc -> 0x0daf, all -> 0x0dab }] */
    /* JADX WARNING: Removed duplicated region for block: B:639:0x0d27 A[Catch:{ qrp -> 0x0db3, qvc -> 0x0daf, all -> 0x0dab }] */
    /* JADX WARNING: Removed duplicated region for block: B:643:0x0d52 A[Catch:{ qrp -> 0x0db3, qvc -> 0x0daf, all -> 0x0dab }] */
    /* JADX WARNING: Removed duplicated region for block: B:644:0x0d53 A[Catch:{ qrp -> 0x0db3, qvc -> 0x0daf, all -> 0x0dab }] */
    /* JADX WARNING: Removed duplicated region for block: B:650:0x0d6b A[Catch:{ qrp -> 0x0da9, qvc -> 0x0da7, all -> 0x0da5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0d6c A[Catch:{ qrp -> 0x0da9, qvc -> 0x0da7, all -> 0x0da5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:654:0x0d87 A[Catch:{ qrp -> 0x0da9, qvc -> 0x0da7, all -> 0x0da5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:692:0x0e03 A[Catch:{ qrp -> 0x0e4f, qvc -> 0x0e4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:693:0x0e04 A[Catch:{ qrp -> 0x0e4f, qvc -> 0x0e4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0e16 A[Catch:{ qrp -> 0x0e4f, qvc -> 0x0e4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:697:0x0e18 A[Catch:{ qrp -> 0x0e4f, qvc -> 0x0e4d }] */
    /* JADX WARNING: Removed duplicated region for block: B:701:0x0e27  */
    /* JADX WARNING: Removed duplicated region for block: B:721:0x0e85 A[Catch:{ qrp -> 0x0ea7, qvc -> 0x0e67, all -> 0x0e5f, all -> 0x0ee1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:722:0x0e86 A[Catch:{ qrp -> 0x0ea7, qvc -> 0x0e67, all -> 0x0e5f, all -> 0x0ee1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:730:0x0eb7 A[Catch:{ qrp -> 0x0ea7, qvc -> 0x0e67, all -> 0x0e5f, all -> 0x0ee1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:731:0x0eb8 A[Catch:{ qrp -> 0x0ea7, qvc -> 0x0e67, all -> 0x0e5f, all -> 0x0ee1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:734:0x0ed9 A[Catch:{ qrp -> 0x0ea7, qvc -> 0x0e67, all -> 0x0e5f, all -> 0x0ee1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:739:0x0eee  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: b */
    public final void mo24304b(qwc qwc) {
        long j;
        Throwable th;
        bxvd bxvd;
        qwc qwc2;
        qrp qrp;
        bxvd bxvd2;
        qwc qwc3;
        qvc qvc;
        bxvd bxvd3;
        bxvd bxvd4;
        boolean z;
        bxvd bxvd5;
        bnrd a;
        boolean z2;
        bxvd bxvd6;
        bxvd bxvd7;
        bxvd bxvd8;
        bxvd bxvd9;
        bxvd bxvd10;
        bxvd bxvd11;
        int intValue;
        bxvd da;
        long elapsedRealtime;
        boolean z3;
        bxvd bxvd12;
        bnrd bnrd;
        boolean z4;
        bxvd bxvd13;
        bokg bokg;
        bxvd bxvd14;
        qrp qrp2;
        qrp qrp3;
        Throwable th2;
        bxvd bxvd15;
        boolean z5;
        boolean z6;
        Iterator it;
        bxvd bxvd16;
        bxvd bxvd17;
        IOException iOException;
        RuntimeException runtimeException;
        List<qtq> list;
        Throwable th3;
        qvf qvf;
        int i;
        String str;
        qvd qvd;
        bxvd bxvd18;
        String str2;
        qvd qvd2;
        String str3;
        bmxv bmxv;
        qwa qwa = this;
        ? r2 = qwc;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        bxvd da2 = bokg.f133400g.mo74144da();
        boolean z7 = false;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bokg bokg2 = (bokg) da2.f164949b;
        int i2 = 1;
        bokg2.f133405d = 1;
        int i3 = 2;
        int i4 = bokg2.f133402a | 2;
        bokg2.f133402a = i4;
        int i5 = i4 | 1;
        bokg2.f133402a = i5;
        bokg2.f133403b = false;
        bokg2.f133402a = i5 | 4;
        bokg2.f133406e = false;
        try {
            acyr acyr = r2.f42300a;
            int i6 = r2.f42301b;
            if (i6 == 301) {
                try {
                    qvt qvt = qwa.f42292i;
                    synchronized (qvt.f42268d) {
                        qvt.f42266b.mo24254a(acyr, qta.f42078c, true);
                    }
                } catch (qrp e) {
                    qrp2 = e;
                    j = elapsedRealtime2;
                    bxvd14 = da2;
                    bnrd = a;
                    z3 = z2;
                } catch (qvc e2) {
                } catch (Throwable th4) {
                }
            } else {
                switch (i6) {
                    case 302:
                        bmxv = bmxv.m108566b(1);
                        break;
                    case 303:
                        bmxv = bmxv.m108566b(2);
                        break;
                    case 304:
                        bmxv = bmxv.m108566b(4);
                        break;
                    default:
                        bmxv = bmvz.f131120a;
                        break;
                }
                if (bmxv.mo66813a()) {
                    qwa.f42293j.mo24254a(acyr, qta.m32827b(((Integer) bmxv.mo66814b()).intValue()), true);
                }
            }
            qwd qwd = qwa.f42289f;
            if (!r2.f42302c) {
                acyr acyr2 = r2.f42300a;
                if (r2.f42301b == 101) {
                    qwd.f42304a.mo24255a(acyr2, qta.f42081f, qta.f42083h, qta.f42082g);
                }
                long longValue = ((Long) qwd.f42304a.mo24253a(acyr2, qta.f42081f)).longValue();
                int i7 = r2.f42301b;
                if (!(i7 < 300 || i7 >= 400 || i7 == 301 || i7 == 305 || i7 == 304)) {
                    if (bmxx.m108577a(r2.f42303d)) {
                        qwd.mo24312a(Math.max(longValue, SystemClock.elapsedRealtime() + ((Long) qqv.f41974k.mo58455c()).longValue()), (qwc) r2);
                        j = elapsedRealtime2;
                        z = false;
                        qwc2 = r2;
                        bxvd5 = da2;
                        if (bxvd5.f164950c) {
                            bxvd5.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        bokg bokg3 = (bokg) bxvd5.f164949b;
                        bokg3.f133402a |= 4;
                        bokg3.f133406e = z;
                        int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - j);
                        if (bxvd5.f164950c) {
                            bxvd5.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        bokg bokg4 = (bokg) bxvd5.f164949b;
                        bokg4.f133402a |= 8;
                        bokg4.f133407f = elapsedRealtime3;
                        qsh.m32791a(qwa.f42288e, qwc2.f42300a.f61088b).mo24250a((bokg) bxvd5.mo74062i());
                    }
                }
                if (longValue > SystemClock.elapsedRealtime()) {
                    qwd.mo24312a(longValue, (qwc) r2);
                    j = elapsedRealtime2;
                    z = false;
                    qwc2 = r2;
                    bxvd5 = da2;
                    if (bxvd5.f164950c) {
                    }
                    bokg bokg32 = (bokg) bxvd5.f164949b;
                    bokg32.f133402a |= 4;
                    bokg32.f133406e = z;
                    int elapsedRealtime32 = (int) (SystemClock.elapsedRealtime() - j);
                    if (bxvd5.f164950c) {
                    }
                    bokg bokg42 = (bokg) bxvd5.f164949b;
                    bokg42.f133402a |= 8;
                    bokg42.f133407f = elapsedRealtime32;
                    qsh.m32791a(qwa.f42288e, qwc2.f42300a.f61088b).mo24250a((bokg) bxvd5.mo74062i());
                }
            }
            qwa.m32983a(r2.f42300a, "NIGORI");
            f42287d.mo25409a("Pre-syncing metadata...", new Object[0]);
            qwa.f42292i.mo24299b(r2.f42300a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bokg bokg5 = (bokg) da2.f164949b;
            bokg5.f133402a |= 1;
            bokg5.f133403b = true;
            a = qtq.f42112a.iterator();
            qrp qrp4 = null;
            z2 = false;
            while (a.hasNext()) {
                try {
                    intValue = ((Integer) a.next()).intValue();
                    da = boke.f133392f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z7;
                    }
                    boke boke = (boke) da.f164949b;
                    boke.f133394a |= i2;
                    boke.f133395b = intValue;
                    elapsedRealtime = SystemClock.elapsedRealtime();
                } catch (qrp e3) {
                    e = e3;
                    bxvd9 = da2;
                    qwa = this;
                    bxvd6 = bxvd9;
                    qwc2 = qwc;
                    bxvd2 = bxvd6;
                    qrp = e;
                    int b = qrq.m32744b(qrp.f42002a);
                    if (!bxvd2.f164950c) {
                    }
                    bokg bokg6 = (bokg) bxvd2.f164949b;
                    bokg6.f133405d = b - 1;
                    bokg6.f133402a |= 2;
                    qwa.f42289f.mo24313a(qwc2, qrp.f42002a);
                    if (qrp.f42002a == 1282) {
                    }
                    throw qrp;
                } catch (qvc e4) {
                    e = e4;
                    j = elapsedRealtime2;
                    bxvd10 = da2;
                    qwa = this;
                    bxvd7 = bxvd10;
                    qwc2 = qwc;
                    bxvd3 = bxvd7;
                    qvc = e;
                    r2 = bxvd3;
                    qwa.f42292i.mo24297a(qwc3.f42300a);
                    qwa.f42291h.mo24269a(qwc3.f42300a);
                    int b2 = qrq.m32744b(1025);
                    if (!r2.f164950c) {
                    }
                    bokg bokg7 = (bokg) r2.f164949b;
                    bokg7.f133405d = b2 - 1;
                    bokg7.f133402a |= 2;
                    qwa.f42289f.mo24313a(qwc3, 1025);
                    throw new qrp(1025, "The current user is not a sync user.", qvc);
                } catch (Throwable th5) {
                    th = th5;
                    j = elapsedRealtime2;
                    bxvd11 = da2;
                    qwa = this;
                    bxvd8 = bxvd11;
                    qwc3 = qwc;
                    bxvd4 = bxvd8;
                    th = th;
                    bxvd = bxvd4;
                    int elapsedRealtime4 = (int) (SystemClock.elapsedRealtime() - j);
                    if (bxvd.f164950c) {
                    }
                    bokg bokg8 = (bokg) bxvd.f164949b;
                    bokg8.f133402a |= 8;
                    bokg8.f133407f = elapsedRealtime4;
                    qsh.m32791a(qwa.f42288e, r4.f42300a.f61088b).mo24250a((bokg) bxvd.mo74062i());
                    throw th;
                }
                try {
                    String str4 = (String) ((bnod) f42286c).f131895d.get(Integer.valueOf(intValue));
                    if (str4 != null) {
                        qwa.m32983a(r2.f42300a, str4);
                    }
                    qvy qvy = qwa.f42290g;
                    acyr acyr3 = r2.f42300a;
                    if (r2.f42302c) {
                    }
                    if (qvy.mo24301a(acyr3, intValue)) {
                        if (!((Boolean) qvy.f42280e.mo24253a(acyr3, qta.m32827b(intValue))).booleanValue()) {
                            SQLiteDatabase a2 = qvy.f42281f.f42130g.mo24263a();
                            String str5 = qtv.f42126d;
                            String[] strArr = new String[i3];
                            strArr[0] = acyr3.f61090d;
                            strArr[1] = String.valueOf(intValue);
                        }
                        synchronized (qwa.f42294k) {
                            try {
                                qvy qvy2 = qwa.f42290g;
                                acyr acyr4 = r2.f42300a;
                                bmxv b3 = qvy2.f42278c.mo24299b(acyr4);
                                if (!b3.mo66813a()) {
                                    try {
                                        qvy2.mo24302b(acyr4, intValue);
                                        j = elapsedRealtime2;
                                        bnrd = a;
                                        qrp3 = qrp4;
                                        z3 = z2;
                                        z5 = false;
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                        j = elapsedRealtime2;
                                        bxvd18 = da2;
                                        bnrd = a;
                                        z3 = z2;
                                        bxvd12 = bxvd18;
                                        try {
                                            throw th2;
                                        } catch (qrp e5) {
                                            e = e5;
                                        } catch (qvc e6) {
                                        } catch (Throwable th7) {
                                        }
                                    }
                                } else {
                                    if (intValue == 2) {
                                        try {
                                            qvd qvd3 = qvy2.f42282g;
                                            String str6 = ((bstx) b3.mo66814b()).f147074a;
                                            bnrd = a;
                                            try {
                                                String str7 = r2.f42303d;
                                                sdo.m34959a(acyr4);
                                                sdo.m34977c(str6);
                                                j = elapsedRealtime2;
                                                try {
                                                    ArrayList arrayList = new ArrayList();
                                                    ClientContext a3 = qvd3.mo24283a(acyr4);
                                                    byte[] bArr = null;
                                                    while (true) {
                                                        bxvd da3 = bstt.f147054d.mo74144da();
                                                        qrp3 = qrp4;
                                                        if (da3.f164950c) {
                                                            da3.mo74035c();
                                                            da3.f164950c = false;
                                                        }
                                                        str6.getClass();
                                                        ((bstt) da3.f164949b).f147056a = str6;
                                                        if (!bmxx.m108577a(str7)) {
                                                            if (da3.f164950c) {
                                                                da3.mo74035c();
                                                                da3.f164950c = false;
                                                            }
                                                            bstt bstt = (bstt) da3.f164949b;
                                                            str7.getClass();
                                                            str2 = str6;
                                                            if (!bstt.f147058c.mo73666a()) {
                                                                bstt.f147058c = bxvk.m124021a(bstt.f147058c);
                                                            }
                                                            bstt.f147058c.add(str7);
                                                        } else {
                                                            str2 = str6;
                                                        }
                                                        if (bArr != null) {
                                                            bxtx a4 = bxtx.m123261a(bArr);
                                                            if (da3.f164950c) {
                                                                da3.mo74035c();
                                                                da3.f164950c = false;
                                                            }
                                                            a4.getClass();
                                                            ((bstt) da3.f164949b).f147057b = a4;
                                                        }
                                                        qrr qrr = qvd3.f42220a;
                                                        bstt bstt2 = (bstt) da3.mo74062i();
                                                        if (qrr.f42004b != null) {
                                                            str3 = str7;
                                                            qvd2 = qvd3;
                                                        } else {
                                                            str3 = str7;
                                                            qvd2 = qvd3;
                                                            qrr.f42004b = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/ListPasswords", ciie.m150370a(bstt.f147054d), ciie.m150370a(bstu.f147059c));
                                                        }
                                                        shl shl = qrr.f42015a;
                                                        ? r28 = qrr.f42004b;
                                                        bstu bstu = (bstu) shl.mo25553a(r28, a3, bstt2, 10000, TimeUnit.MILLISECONDS);
                                                        Collections.addAll(arrayList, (bsua[]) bstu.f147061a.toArray(new bsua[0]));
                                                        if (!bstu.f147062b.mo73779j()) {
                                                            bArr = bstu.f147062b.mo73780k();
                                                            qrp4 = qrp3;
                                                            str6 = str2;
                                                            str7 = str3;
                                                            qvd3 = qvd2;
                                                        } else {
                                                            list = bngx.m109355a(bnjd.m109575a((Iterable) arrayList, qvv.f42273a));
                                                            z3 = z2;
                                                            bxvd12 = r28;
                                                        }
                                                    }
                                                } catch (chuw e7) {
                                                    chuw chuw = e7;
                                                    if (qve.m32935a(chuw) != chus.NOT_FOUND) {
                                                        throw new qrp(257, qve.m32936b(chuw), chuw);
                                                    }
                                                    throw new qvc();
                                                } catch (gid e8) {
                                                    throw new qrp(qrq.m32742a(e8), e8);
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    th2 = th;
                                                    bxvd18 = da2;
                                                    z3 = z2;
                                                    bxvd12 = bxvd18;
                                                    throw th2;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                j = elapsedRealtime2;
                                                th2 = th;
                                                bxvd18 = da2;
                                                z3 = z2;
                                                bxvd12 = bxvd18;
                                                throw th2;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            j = elapsedRealtime2;
                                            bnrd = a;
                                            th2 = th;
                                            bxvd18 = da2;
                                            z3 = z2;
                                            bxvd12 = bxvd18;
                                            throw th2;
                                        }
                                    } else {
                                        j = elapsedRealtime2;
                                        bnrd = a;
                                        qrp3 = qrp4;
                                        if (intValue == 1) {
                                            try {
                                                qvd qvd4 = qvy2.f42282g;
                                                String str8 = ((bstx) b3.mo66814b()).f147074a;
                                                String str9 = r2.f42303d;
                                                sdo.m34959a(acyr4);
                                                sdo.m34977c(str8);
                                                ArrayList arrayList2 = new ArrayList();
                                                ClientContext a5 = qvd4.mo24283a(acyr4);
                                                byte[] bArr2 = null;
                                                while (true) {
                                                    bxvd da4 = bstv.f147063d.mo74144da();
                                                    z3 = z2;
                                                    if (da4.f164950c) {
                                                        da4.mo74035c();
                                                        da4.f164950c = false;
                                                    }
                                                    str8.getClass();
                                                    ((bstv) da4.f164949b).f147065a = str8;
                                                    if (!bmxx.m108577a(str9)) {
                                                        if (da4.f164950c) {
                                                            da4.mo74035c();
                                                            da4.f164950c = false;
                                                        }
                                                        bstv bstv = (bstv) da4.f164949b;
                                                        str9.getClass();
                                                        str = str8;
                                                        if (!bstv.f147067c.mo73666a()) {
                                                            bstv.f147067c = bxvk.m124021a(bstv.f147067c);
                                                        }
                                                        bstv.f147067c.add(str9);
                                                    } else {
                                                        str = str8;
                                                    }
                                                    if (bArr2 != null) {
                                                        bxtx a6 = bxtx.m123261a(bArr2);
                                                        if (da4.f164950c) {
                                                            da4.mo74035c();
                                                            da4.f164950c = false;
                                                        }
                                                        a6.getClass();
                                                        ((bstv) da4.f164949b).f147066b = a6;
                                                    }
                                                    try {
                                                        qrr qrr2 = qvd4.f42220a;
                                                        bstv bstv2 = (bstv) da4.mo74062i();
                                                        if (qrr.f42008f != null) {
                                                            qvd = qvd4;
                                                        } else {
                                                            qvd = qvd4;
                                                            qrr.f42008f = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/ListPriorityPreferences", ciie.m150370a(bstv.f147063d), ciie.m150370a(bstw.f147068c));
                                                        }
                                                        shl shl2 = qrr2.f42015a;
                                                        ? r282 = qrr.f42008f;
                                                        bstw bstw = (bstw) shl2.mo25553a(r282, a5, bstv2, 10000, TimeUnit.MILLISECONDS);
                                                        arrayList2.addAll(bstw.f147070a);
                                                        if (!bstw.f147071b.mo73779j()) {
                                                            bArr2 = bstw.f147071b.mo73780k();
                                                            z2 = z3;
                                                            str8 = str;
                                                            qvd4 = qvd;
                                                        } else {
                                                            list = bngx.m109355a(bnjd.m109575a((Iterable) arrayList2, qvw.f42274a));
                                                            bxvd12 = r282;
                                                        }
                                                    } catch (chuw e9) {
                                                        chuw chuw2 = e9;
                                                        if (qve.m32935a(chuw2) != chus.NOT_FOUND) {
                                                            throw new qrp(257, qve.m32936b(chuw2), chuw2);
                                                        }
                                                        throw new qvc();
                                                    } catch (gid e10) {
                                                        throw new qrp(qrq.m32742a(e10), e10);
                                                    } catch (chuw e11) {
                                                        chuw chuw3 = e11;
                                                        if (qve.m32935a(chuw3) != chus.NOT_FOUND) {
                                                            throw new qrp(257, qve.m32936b(chuw3), chuw3);
                                                        }
                                                        throw new qvc();
                                                    } catch (gid e12) {
                                                        throw new qrp(qrq.m32742a(e12), e12);
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                }
                                            } catch (Throwable th12) {
                                                th = th12;
                                                z3 = z2;
                                                th2 = th;
                                                bxvd12 = da2;
                                                throw th2;
                                            }
                                        } else {
                                            z3 = z2;
                                            if (intValue == 4) {
                                                qvf qvf2 = qvy2.f42283h;
                                                String str10 = ((bstx) b3.mo66814b()).f147074a;
                                                String str11 = r2.f42303d;
                                                sdo.m34959a(acyr4);
                                                sdo.m34977c(str10);
                                                ArrayList arrayList3 = new ArrayList();
                                                Account a7 = acyr4.mo33252a();
                                                int i8 = qvf2.f42222a.getApplicationInfo().uid;
                                                String packageName = qvf2.f42222a.getPackageName();
                                                int i9 = i8;
                                                ClientContext clientContext = new ClientContext(i9, a7, a7, packageName, packageName);
                                                clientContext.mo17806d((String) qqv.f41970g.mo58455c());
                                                byte[] bArr3 = null;
                                                while (true) {
                                                    bxvd da5 = bsti.f147013e.mo74144da();
                                                    if (da5.f164950c) {
                                                        da5.mo74035c();
                                                        da5.f164950c = false;
                                                    }
                                                    bsti bsti = (bsti) da5.f164949b;
                                                    str10.getClass();
                                                    bsti.f147015a = str10;
                                                    String str12 = str10;
                                                    bsti.f147018d = 306270;
                                                    if (!bmxx.m108577a(str11)) {
                                                        if (da5.f164950c) {
                                                            da5.mo74035c();
                                                            da5.f164950c = false;
                                                        }
                                                        bsti bsti2 = (bsti) da5.f164949b;
                                                        str11.getClass();
                                                        if (!bsti2.f147017c.mo73666a()) {
                                                            bsti2.f147017c = bxvk.m124021a(bsti2.f147017c);
                                                        }
                                                        bsti2.f147017c.add(str11);
                                                    }
                                                    if (bArr3 != null) {
                                                        bxtx a8 = bxtx.m123261a(bArr3);
                                                        if (da5.f164950c) {
                                                            da5.mo74035c();
                                                            da5.f164950c = false;
                                                        }
                                                        a8.getClass();
                                                        ((bsti) da5.f164949b).f147016b = a8;
                                                    }
                                                    qrs qrs = qvf2.f42223b;
                                                    bsti bsti3 = (bsti) da5.mo74062i();
                                                    if (qrs.f42016b != null) {
                                                        qvf = qvf2;
                                                        i = i9;
                                                    } else {
                                                        chtu chtu = chtu.UNARY;
                                                        chtt a9 = ciie.m150370a(bsti.f147013e);
                                                        ? r283 = bstj.f147019c;
                                                        qvf = qvf2;
                                                        qrs.f42016b = chtv.m149566a(chtu, "google.internal.chrome.sync.entities.v1.SyncEntities/ListEntities", a9, ciie.m150370a(r283));
                                                        i = r283;
                                                    }
                                                    bstj bstj = (bstj) qrs.f42017a.mo25553a(qrs.f42016b, clientContext, bsti3, 10000, TimeUnit.MILLISECONDS);
                                                    Collections.addAll(arrayList3, (bsth[]) bstj.f147021a.toArray(new bsth[0]));
                                                    if (!bstj.f147022b.mo73779j()) {
                                                        bArr3 = bstj.f147022b.mo73780k();
                                                        str10 = str12;
                                                        qvf2 = qvf;
                                                        i9 = i;
                                                    } else {
                                                        list = bngx.m109355a(bnjd.m109575a((Iterable) arrayList3, qvx.f42275a));
                                                        bxvd12 = i;
                                                    }
                                                }
                                            } else {
                                                try {
                                                    list = new ArrayList();
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    bxvd15 = da2;
                                                    th2 = th;
                                                    bxvd12 = bxvd15;
                                                    throw th2;
                                                }
                                            }
                                        }
                                    }
                                    qvy.f42276a.mo25409a("Received %d entries of type %d.", Integer.valueOf(list.size()), Integer.valueOf(intValue));
                                    qtv qtv = qvy2.f42281f;
                                    HashMap hashMap = new HashMap();
                                    for (qtq qtq : qtv.mo24272a(acyr4, intValue)) {
                                        hashMap.put(qtq.f42114c, qtq);
                                    }
                                    SQLiteDatabase a10 = qtv.f42130g.mo24263a();
                                    a10.beginTransaction();
                                    try {
                                        for (qtq qtq2 : list) {
                                            try {
                                                qtq qtq3 = (qtq) hashMap.get(qtq2.f42114c);
                                                if (qtq3 != null) {
                                                    if (qtq3.f42117f) {
                                                        if (!qtq3.f42116e.equals(qtq2.f42116e)) {
                                                            if (qtq3.f42118g) {
                                                                qtp qtp = new qtp(qtq2);
                                                                qtp.f42110e = true;
                                                                qtp.f42109d = true;
                                                                qtq3 = qtp.mo24267a();
                                                            }
                                                        }
                                                        qto.m32871a(a10, "sync_entities", qtv.m32885a(acyr4, qtq3));
                                                    }
                                                    qtq3 = qtq2;
                                                    qto.m32871a(a10, "sync_entities", qtv.m32885a(acyr4, qtq3));
                                                } else {
                                                    qto.m32871a(a10, "sync_entities", qtv.m32885a(acyr4, qtq2));
                                                }
                                                hashMap.remove(qtq2.f42114c);
                                            } catch (Throwable th14) {
                                                th3 = th14;
                                                a10.endTransaction();
                                                throw th3;
                                            }
                                        }
                                        for (qtq qtq4 : hashMap.values()) {
                                            if (!qtq4.f42117f || qtq4.f42118g) {
                                                a10.delete("sync_entities", String.format("%s=? AND %s=? AND %s=?", "account", "id", "type"), new String[]{acyr4.f61090d, qtq4.f42114c, String.valueOf(intValue)});
                                            } else {
                                                qtp qtp2 = new qtp(qtq4);
                                                qtp2.f42109d = true;
                                                qtp2.f42108c = bxtx.f164797b;
                                                qto.m32871a(a10, "sync_entities", qtv.m32885a(acyr4, qtp2.mo24267a()));
                                            }
                                        }
                                        a10.setTransactionSuccessful();
                                        a10.endTransaction();
                                        qvy2.mo24302b(acyr4, intValue);
                                        z5 = true;
                                    } catch (Throwable th15) {
                                        th3 = th15;
                                        a10.endTransaction();
                                        throw th3;
                                    }
                                }
                                acyr acyr5 = r2.f42300a;
                                List a11 = qvy2.f42281f.mo24273a(acyr5, intValue, qtv.f42125c);
                                if (!a11.isEmpty()) {
                                    bstx c = qvy2.f42278c.mo24300c(acyr5);
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it2 = a11.iterator();
                                    bxvd12 = bxvd12;
                                    while (it2.hasNext()) {
                                        qtq qtq5 = (qtq) it2.next();
                                        if (intValue == 2) {
                                            try {
                                                bxtx bxtx = qtq5.f42115d;
                                                bxus c2 = bxus.m123744c();
                                                it = it2;
                                                try {
                                                    bsua bsua = bsua.f147094f;
                                                    try {
                                                        bxuc h = bxtx.mo73764h();
                                                        bxvk bxvk = (bxvk) bsua.mo74142c(4);
                                                        try {
                                                            bxxv a12 = bxxm.f165037a.mo74228a(bxvk);
                                                            bxvd12 = da2;
                                                            try {
                                                                a12.mo74220a(bxvk, bxud.m123454a(h), c2);
                                                                a12.mo74225d(bxvk);
                                                                try {
                                                                    h.mo73787a(0);
                                                                    try {
                                                                        bxvk.m124027b(bxvk);
                                                                        bsua bsua2 = (bsua) bxvk;
                                                                        try {
                                                                            if (qtq5.f42116e.mo73779j()) {
                                                                                qvd qvd5 = qvy2.f42282g;
                                                                                String str13 = c.f147074a;
                                                                                sdo.m34959a(acyr5);
                                                                                sdo.m34977c(str13);
                                                                                sdo.m34959a(bsua2);
                                                                                bxvd da6 = bstn.f147033c.mo74144da();
                                                                                if (da6.f164950c) {
                                                                                    da6.mo74035c();
                                                                                    da6.f164950c = false;
                                                                                }
                                                                                bstn bstn = (bstn) da6.f164949b;
                                                                                str13.getClass();
                                                                                bstn.f147035a = str13;
                                                                                bsua2.getClass();
                                                                                bstn.f147036b = bsua2;
                                                                                qrr qrr3 = qvd5.f42220a;
                                                                                ClientContext a13 = qvd5.mo24283a(acyr5);
                                                                                bstn bstn2 = (bstn) da6.mo74062i();
                                                                                if (qrr.f42005c == null) {
                                                                                    qrr.f42005c = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/CreatePassword", ciie.m150370a(bstn.f147033c), ciie.m150370a(bsua.f147094f));
                                                                                }
                                                                                qvy2.f42281f.mo24276a(acyr5, qvy.m32978a((bsua) qrr3.f42015a.mo25553a(qrr.f42005c, a13, bstn2, 10000, TimeUnit.MILLISECONDS)));
                                                                                it2 = it;
                                                                                da2 = bxvd12;
                                                                            } else if (qtq5.f42118g) {
                                                                                qvd qvd6 = qvy2.f42282g;
                                                                                String str14 = c.f147074a;
                                                                                String str15 = bsua2.f147096a;
                                                                                sdo.m34959a(acyr5);
                                                                                sdo.m34977c(str14);
                                                                                sdo.m34977c(str15);
                                                                                bxvd da7 = bstp.f147041b.mo74144da();
                                                                                if (da7.f164950c) {
                                                                                    da7.mo74035c();
                                                                                    da7.f164950c = false;
                                                                                }
                                                                                str15.getClass();
                                                                                ((bstp) da7.f164949b).f147043a = str15;
                                                                                bstp bstp = (bstp) da7.mo74062i();
                                                                                qrr qrr4 = qvd6.f42220a;
                                                                                ClientContext a14 = qvd6.mo24283a(acyr5);
                                                                                if (qrr.f42007e == null) {
                                                                                    qrr.f42007e = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/DeletePassword", ciie.m150370a(bstp.f147041b), ciie.m150370a(bstq.f147044a));
                                                                                }
                                                                                bstq bstq = (bstq) qrr4.f42015a.mo25553a(qrr.f42007e, a14, bstp, 10000, TimeUnit.MILLISECONDS);
                                                                                it2 = it;
                                                                                da2 = bxvd12;
                                                                            } else if (!cdcu.m132654b()) {
                                                                                qvd qvd7 = qvy2.f42282g;
                                                                                String str16 = c.f147074a;
                                                                                sdo.m34959a(acyr5);
                                                                                sdo.m34977c(str16);
                                                                                sdo.m34959a(bsua2);
                                                                                bxvd da8 = bsue.f147113c.mo74144da();
                                                                                String str17 = bsua2.f147096a;
                                                                                if (da8.f164950c) {
                                                                                    da8.mo74035c();
                                                                                    da8.f164950c = false;
                                                                                }
                                                                                bsue bsue = (bsue) da8.f164949b;
                                                                                str17.getClass();
                                                                                bsue.f147115a = str17;
                                                                                bsua2.getClass();
                                                                                bsue.f147116b = bsua2;
                                                                                qrr qrr5 = qvd7.f42220a;
                                                                                ClientContext a15 = qvd7.mo24283a(acyr5);
                                                                                bsue bsue2 = (bsue) da8.mo74062i();
                                                                                if (qrr.f42006d == null) {
                                                                                    qrr.f42006d = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/UpdatePassword", ciie.m150370a(bsue.f147113c), ciie.m150370a(bsua.f147094f));
                                                                                }
                                                                                qvy2.f42281f.mo24276a(acyr5, qvy.m32978a((bsua) qrr5.f42015a.mo25553a(qrr.f42006d, a15, bsue2, 10000, TimeUnit.MILLISECONDS)));
                                                                                it2 = it;
                                                                                da2 = bxvd12;
                                                                            } else {
                                                                                arrayList4.add(bsua2);
                                                                            }
                                                                        } catch (qrp e13) {
                                                                            qrp qrp5 = e13;
                                                                            if (qrp5.f42002a == 1537) {
                                                                                qvy.f42276a.mo25414c("Passphrase not entered, skip indexing.", new Object[0]);
                                                                            } else {
                                                                                throw qrp5;
                                                                            }
                                                                        } catch (chuw e14) {
                                                                            qve.m32935a(e14);
                                                                            throw new qrp(257, qve.m32936b(e14), e14);
                                                                        } catch (gid e15) {
                                                                            throw new qrp(qrq.m32742a(e15), e15);
                                                                        } catch (chuw e16) {
                                                                            qve.m32935a(e16);
                                                                            throw new qrp(257, qve.m32936b(e16), e16);
                                                                        } catch (gid e17) {
                                                                            throw new qrp(qrq.m32742a(e17), e17);
                                                                        } catch (chuw e18) {
                                                                            qve.m32935a(e18);
                                                                            throw new qrp(257, qve.m32936b(e18), e18);
                                                                        } catch (gid e19) {
                                                                            throw new qrp(qrq.m32742a(e19), e19);
                                                                        } catch (chuw e20) {
                                                                            qve.m32935a(e20);
                                                                            throw new qrp(257, qve.m32936b(e20), e20);
                                                                        } catch (gid e21) {
                                                                            throw new qrp(qrq.m32742a(e21), e21);
                                                                        } catch (chuw e22) {
                                                                            qve.m32935a(e22);
                                                                            throw new qrp(257, qve.m32936b(e22), e22);
                                                                        } catch (gid e23) {
                                                                            gid gid = e23;
                                                                            throw new qrp(qrq.m32742a(gid), gid);
                                                                        } catch (chuw e24) {
                                                                            qve.m32935a(e24);
                                                                            throw new qrp(257, qve.m32936b(e24), e24);
                                                                        } catch (gid e25) {
                                                                            throw new qrp(qrq.m32742a(e25), e25);
                                                                        } catch (Throwable th16) {
                                                                            th = th16;
                                                                            bxvd15 = bxvd12;
                                                                        }
                                                                    } catch (bxwf e26) {
                                                                        bxvd16 = bxvd12;
                                                                    }
                                                                } catch (bxwf e27) {
                                                                    throw e27;
                                                                } catch (bxwf e28) {
                                                                    e = e28;
                                                                    bxvd17 = bxvd12;
                                                                    throw e;
                                                                }
                                                            } catch (IOException e29) {
                                                                e = e29;
                                                                iOException = e;
                                                                if (iOException.getCause() instanceof bxwf) {
                                                                    throw new bxwf(iOException.getMessage());
                                                                }
                                                                throw ((bxwf) iOException.getCause());
                                                            } catch (RuntimeException e30) {
                                                                e = e30;
                                                                runtimeException = e;
                                                                if (!(runtimeException.getCause() instanceof bxwf)) {
                                                                    throw ((bxwf) runtimeException.getCause());
                                                                }
                                                                throw runtimeException;
                                                            }
                                                        } catch (IOException e31) {
                                                            e = e31;
                                                            iOException = e;
                                                            if (iOException.getCause() instanceof bxwf) {
                                                            }
                                                        } catch (RuntimeException e32) {
                                                            e = e32;
                                                            runtimeException = e;
                                                            if (!(runtimeException.getCause() instanceof bxwf)) {
                                                            }
                                                        }
                                                    } catch (bxwf e33) {
                                                        e = e33;
                                                        bxvd17 = da2;
                                                        throw e;
                                                    }
                                                } catch (bxwf e34) {
                                                    bxvd16 = da2;
                                                    qvy.f42276a.mo25416d("Invalid password data.", new Object[0]);
                                                    it2 = it;
                                                    da2 = bxvd12;
                                                }
                                            } catch (bxwf e35) {
                                                it = it2;
                                                bxvd16 = da2;
                                                qvy.f42276a.mo25416d("Invalid password data.", new Object[0]);
                                                it2 = it;
                                                da2 = bxvd12;
                                            }
                                        } else {
                                            it = it2;
                                            bxvd12 = da2;
                                            if (intValue == 1) {
                                                try {
                                                    bxtx bxtx2 = qtq5.f42115d;
                                                    bxus c3 = bxus.m123744c();
                                                    bsud bsud = bsud.f147106f;
                                                    try {
                                                        bxuc h2 = bxtx2.mo73764h();
                                                        bxvk bxvk2 = (bxvk) bsud.mo74142c(4);
                                                        bxxv a16 = bxxm.f165037a.mo74228a(bxvk2);
                                                        a16.mo74220a(bxvk2, bxud.m123454a(h2), c3);
                                                        a16.mo74225d(bxvk2);
                                                        h2.mo73787a(0);
                                                        bxvk.m124027b(bxvk2);
                                                        bsud bsud2 = (bsud) bxvk2;
                                                        if (qtq5.f42116e.mo73779j()) {
                                                            qvd qvd8 = qvy2.f42282g;
                                                            String str18 = c.f147074a;
                                                            sdo.m34959a(acyr5);
                                                            sdo.m34977c(str18);
                                                            sdo.m34959a(bsud2);
                                                            bxvd da9 = bsto.f147037c.mo74144da();
                                                            if (da9.f164950c) {
                                                                da9.mo74035c();
                                                                da9.f164950c = false;
                                                            }
                                                            bsto bsto = (bsto) da9.f164949b;
                                                            str18.getClass();
                                                            bsto.f147039a = str18;
                                                            bsud2.getClass();
                                                            bsto.f147040b = bsud2;
                                                            qrr qrr6 = qvd8.f42220a;
                                                            ClientContext a17 = qvd8.mo24283a(acyr5);
                                                            bsto bsto2 = (bsto) da9.mo74062i();
                                                            if (qrr.f42009g == null) {
                                                                qrr.f42009g = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/CreatePriorityPreference", ciie.m150370a(bsto.f147037c), ciie.m150370a(bsud.f147106f));
                                                            }
                                                            qvy2.f42281f.mo24276a(acyr5, qvy.m32979a((bsud) qrr6.f42015a.mo25553a(qrr.f42009g, a17, bsto2, 10000, TimeUnit.MILLISECONDS)));
                                                            it2 = it;
                                                            da2 = bxvd12;
                                                        } else if (!qtq5.f42118g) {
                                                            qvd qvd9 = qvy2.f42282g;
                                                            String str19 = c.f147074a;
                                                            sdo.m34959a(acyr5);
                                                            sdo.m34977c(str19);
                                                            sdo.m34959a(bsud2);
                                                            bxvd da10 = bsuf.f147117c.mo74144da();
                                                            String str20 = bsud2.f147108a;
                                                            if (da10.f164950c) {
                                                                da10.mo74035c();
                                                                da10.f164950c = false;
                                                            }
                                                            bsuf bsuf = (bsuf) da10.f164949b;
                                                            str20.getClass();
                                                            bsuf.f147119a = str20;
                                                            bsud2.getClass();
                                                            bsuf.f147120b = bsud2;
                                                            qrr qrr7 = qvd9.f42220a;
                                                            ClientContext a18 = qvd9.mo24283a(acyr5);
                                                            bsuf bsuf2 = (bsuf) da10.mo74062i();
                                                            if (qrr.f42010h == null) {
                                                                qrr.f42010h = chtv.m149566a(chtu.UNARY, "google.internal.chrome.sync.passwords.v1.Passwords/UpdatePriorityPreference", ciie.m150370a(bsuf.f147117c), ciie.m150370a(bsud.f147106f));
                                                            }
                                                            qvy2.f42281f.mo24276a(acyr5, qvy.m32979a((bsud) qrr7.f42015a.mo25553a(qrr.f42010h, a18, bsuf2, 10000, TimeUnit.MILLISECONDS)));
                                                            it2 = it;
                                                            da2 = bxvd12;
                                                        } else {
                                                            it2 = it;
                                                            da2 = bxvd12;
                                                        }
                                                    } catch (IOException e36) {
                                                        IOException iOException2 = e36;
                                                        if (!(iOException2.getCause() instanceof bxwf)) {
                                                            throw new bxwf(iOException2.getMessage());
                                                        }
                                                        throw ((bxwf) iOException2.getCause());
                                                    } catch (RuntimeException e37) {
                                                        RuntimeException runtimeException2 = e37;
                                                        if (runtimeException2.getCause() instanceof bxwf) {
                                                            throw ((bxwf) runtimeException2.getCause());
                                                        }
                                                        throw runtimeException2;
                                                    } catch (bxwf e38) {
                                                        throw e38;
                                                    } catch (bxwf e39) {
                                                        throw e39;
                                                    }
                                                } catch (bxwf e40) {
                                                    qvy.f42276a.mo25416d("Invalid priority preference data.", new Object[0]);
                                                    it2 = it;
                                                    da2 = bxvd12;
                                                }
                                            }
                                        }
                                        it2 = it;
                                        da2 = bxvd12;
                                    }
                                    bxvd12 = da2;
                                    if (cdcu.m132654b()) {
                                        Iterator it3 = bnkn.m109667a(arrayList4, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR).iterator();
                                        while (it3.hasNext()) {
                                            List<bsua> list2 = (List) it3.next();
                                            qvd qvd10 = qvy2.f42282g;
                                            String str21 = c.f147074a;
                                            sdo.m34959a(acyr5);
                                            sdo.m34977c(str21);
                                            sdo.m34959a(list2);
                                            bxvd da11 = bstk.f147023b.mo74144da();
                                            for (bsua bsua3 : list2) {
                                                bxvd da12 = bsue.f147113c.mo74144da();
                                                String str22 = bsua3.f147096a;
                                                Iterator it4 = it3;
                                                if (da12.f164950c) {
                                                    da12.mo74035c();
                                                    da12.f164950c = false;
                                                }
                                                bsue bsue3 = (bsue) da12.f164949b;
                                                str22.getClass();
                                                bsue3.f147115a = str22;
                                                bsua3.getClass();
                                                bsue3.f147116b = bsua3;
                                                bsue bsue4 = (bsue) da12.mo74062i();
                                                if (da11.f164950c) {
                                                    da11.mo74035c();
                                                    da11.f164950c = false;
                                                }
                                                bstk bstk = (bstk) da11.f164949b;
                                                bsue4.getClass();
                                                if (!bstk.f147025a.mo73666a()) {
                                                    bstk.f147025a = bxvk.m124021a(bstk.f147025a);
                                                }
                                                bstk.f147025a.add(bsue4);
                                                it3 = it4;
                                            }
                                            bstl a19 = qvd10.f42220a.mo24232a(qvd10.mo24283a(acyr5), (bstk) da11.mo74062i());
                                            if (a19.f147029b.size() > 0) {
                                                qvy.f42276a.mo25416d("Failed to update: %d", Integer.valueOf(a19.f147029b.size()));
                                            }
                                            Iterator it5 = a19.f147028a.iterator();
                                            while (it5.hasNext()) {
                                                qvy2.f42281f.mo24276a(acyr5, qvy.m32978a((bsua) it5.next()));
                                            }
                                        }
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                } else {
                                    bxvd12 = da2;
                                    z6 = false;
                                }
                                z4 = z5 | z6;
                                if (z4) {
                                    qvy2.f42277b.mo24286a(acyr4, intValue);
                                    qvr qvr = qvy2.f42279d;
                                    synchronized (qvr.f42264f) {
                                        qvr.f42260b.mo24255a(acyr4, qta.m32828c(intValue));
                                    }
                                }
                                qvy2.f42279d.mo24295a(acyr4, intValue);
                            } catch (Throwable th17) {
                                th = th17;
                                j = elapsedRealtime2;
                                bxvd15 = da2;
                                bnrd = a;
                                z3 = z2;
                                th2 = th;
                                bxvd12 = bxvd15;
                                throw th2;
                            }
                        }
                    } else {
                        j = elapsedRealtime2;
                        bxvd bxvd19 = da2;
                        bnrd = a;
                        qrp qrp6 = qrp4;
                        z3 = z2;
                        z4 = false;
                        bxvd12 = bxvd19;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boke boke2 = (boke) da.f164949b;
                        boke2.f133396c = 1;
                        boke2.f133394a |= 2;
                        qrp4 = qrp3;
                        boke boke3 = (boke) da.f164949b;
                        boke3.f133394a |= 4;
                        boke3.f133397d = z4;
                        int elapsedRealtime5 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boke boke4 = (boke) da.f164949b;
                        boke4.f133394a |= 8;
                        boke4.f133398e = elapsedRealtime5;
                        bxvd13 = bxvd12;
                        try {
                            if (bxvd13.f164950c) {
                                bxvd13.mo74035c();
                                bxvd13.f164950c = false;
                            }
                            bokg = (bokg) bxvd13.f164949b;
                            boke boke5 = (boke) da.mo74062i();
                            boke5.getClass();
                            if (!bokg.f133404c.mo73666a()) {
                                bokg.f133404c = bxvk.m124021a(bokg.f133404c);
                            }
                            bokg.f133404c.add(boke5);
                            z2 = z3 | z4;
                            qwa = this;
                            da2 = bxvd13;
                            a = bnrd;
                            elapsedRealtime2 = j;
                            z7 = false;
                            i2 = 1;
                            i3 = 2;
                            r2 = qwc;
                        } catch (qrp e41) {
                            e = e41;
                            bxvd9 = bxvd13;
                            qwa = this;
                            bxvd6 = bxvd9;
                            qwc2 = qwc;
                            bxvd2 = bxvd6;
                            qrp = e;
                            int b4 = qrq.m32744b(qrp.f42002a);
                            if (!bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            bokg bokg62 = (bokg) bxvd2.f164949b;
                            bokg62.f133405d = b4 - 1;
                            bokg62.f133402a |= 2;
                            qwa.f42289f.mo24313a(qwc2, qrp.f42002a);
                            if (qrp.f42002a == 1282) {
                                qwa.f42291h.mo24269a(qwc2.f42300a);
                            }
                            throw qrp;
                        } catch (qvc e42) {
                            e = e42;
                            bxvd10 = bxvd13;
                            qwa = this;
                            bxvd7 = bxvd10;
                            qwc2 = qwc;
                            bxvd3 = bxvd7;
                            qvc = e;
                            r2 = bxvd3;
                            qwa.f42292i.mo24297a(qwc3.f42300a);
                            qwa.f42291h.mo24269a(qwc3.f42300a);
                            int b22 = qrq.m32744b(1025);
                            if (!r2.f164950c) {
                            }
                            bokg bokg72 = (bokg) r2.f164949b;
                            bokg72.f133405d = b22 - 1;
                            bokg72.f133402a |= 2;
                            qwa.f42289f.mo24313a(qwc3, 1025);
                            throw new qrp(1025, "The current user is not a sync user.", qvc);
                        } catch (Throwable th18) {
                            th = th18;
                            bxvd11 = bxvd13;
                            qwa = this;
                            bxvd8 = bxvd11;
                            qwc3 = qwc;
                            bxvd4 = bxvd8;
                            th = th;
                            bxvd = bxvd4;
                            int elapsedRealtime42 = (int) (SystemClock.elapsedRealtime() - j);
                            if (bxvd.f164950c) {
                            }
                            bokg bokg82 = (bokg) bxvd.f164949b;
                            bokg82.f133402a |= 8;
                            bokg82.f133407f = elapsedRealtime42;
                            qsh.m32791a(qwa.f42288e, r4.f42300a.f61088b).mo24250a((bokg) bxvd.mo74062i());
                            throw th;
                        }
                    }
                } catch (qrp e43) {
                    e = e43;
                    j = elapsedRealtime2;
                    bxvd12 = da2;
                    bnrd = a;
                    z3 = z2;
                    qrp2 = e;
                    bxvd14 = bxvd12;
                    qrp4 = qrp2;
                    z4 = false;
                    bxvd12 = bxvd14;
                    try {
                        int b5 = qrq.m32744b(qrp4.f42002a);
                        if (da.f164950c) {
                        }
                        boke boke6 = (boke) da.f164949b;
                        boke6.f133396c = b5 - 1;
                        boke6.f133394a |= 2;
                        bxvd12 = bxvd12;
                        boke boke32 = (boke) da.f164949b;
                        boke32.f133394a |= 4;
                        boke32.f133397d = z4;
                        int elapsedRealtime52 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (da.f164950c) {
                        }
                        boke boke42 = (boke) da.f164949b;
                        boke42.f133394a |= 8;
                        boke42.f133398e = elapsedRealtime52;
                        bxvd13 = bxvd12;
                        if (bxvd13.f164950c) {
                        }
                        bokg = (bokg) bxvd13.f164949b;
                        boke boke52 = (boke) da.mo74062i();
                        boke52.getClass();
                        if (!bokg.f133404c.mo73666a()) {
                        }
                        bokg.f133404c.add(boke52);
                        z2 = z3 | z4;
                        qwa = this;
                        da2 = bxvd13;
                        a = bnrd;
                        elapsedRealtime2 = j;
                        z7 = false;
                        i2 = 1;
                        i3 = 2;
                        r2 = qwc;
                    } catch (qrp e44) {
                        e = e44;
                        bxvd9 = bxvd12;
                        qwa = this;
                        bxvd6 = bxvd9;
                        qwc2 = qwc;
                        bxvd2 = bxvd6;
                        qrp = e;
                        int b42 = qrq.m32744b(qrp.f42002a);
                        if (!bxvd2.f164950c) {
                        }
                        bokg bokg622 = (bokg) bxvd2.f164949b;
                        bokg622.f133405d = b42 - 1;
                        bokg622.f133402a |= 2;
                        qwa.f42289f.mo24313a(qwc2, qrp.f42002a);
                        if (qrp.f42002a == 1282) {
                        }
                        throw qrp;
                    } catch (qvc e45) {
                        e = e45;
                        bxvd10 = bxvd12;
                        qwa = this;
                        bxvd7 = bxvd10;
                        qwc2 = qwc;
                        bxvd3 = bxvd7;
                        qvc = e;
                        r2 = bxvd3;
                        qwa.f42292i.mo24297a(qwc3.f42300a);
                        qwa.f42291h.mo24269a(qwc3.f42300a);
                        int b222 = qrq.m32744b(1025);
                        if (!r2.f164950c) {
                        }
                        bokg bokg722 = (bokg) r2.f164949b;
                        bokg722.f133405d = b222 - 1;
                        bokg722.f133402a |= 2;
                        qwa.f42289f.mo24313a(qwc3, 1025);
                        throw new qrp(1025, "The current user is not a sync user.", qvc);
                    } catch (Throwable th19) {
                        th = th19;
                        bxvd11 = bxvd12;
                        qwa = this;
                        bxvd8 = bxvd11;
                        qwc3 = qwc;
                        bxvd4 = bxvd8;
                        th = th;
                        bxvd = bxvd4;
                        int elapsedRealtime422 = (int) (SystemClock.elapsedRealtime() - j);
                        if (bxvd.f164950c) {
                        }
                        bokg bokg822 = (bokg) bxvd.f164949b;
                        bokg822.f133402a |= 8;
                        bokg822.f133407f = elapsedRealtime422;
                        qsh.m32791a(qwa.f42288e, r4.f42300a.f61088b).mo24250a((bokg) bxvd.mo74062i());
                        throw th;
                    }
                } catch (qvc e46) {
                    long j2 = elapsedRealtime2;
                    qwa = this;
                    qwc3 = qwc;
                    qvc = e46;
                    r2 = da2;
                    qwa.f42292i.mo24297a(qwc3.f42300a);
                    qwa.f42291h.mo24269a(qwc3.f42300a);
                    int b2222 = qrq.m32744b(1025);
                    if (!r2.f164950c) {
                    }
                    bokg bokg7222 = (bokg) r2.f164949b;
                    bokg7222.f133405d = b2222 - 1;
                    bokg7222.f133402a |= 2;
                    qwa.f42289f.mo24313a(qwc3, 1025);
                    throw new qrp(1025, "The current user is not a sync user.", qvc);
                } catch (Throwable th20) {
                    long j3 = elapsedRealtime2;
                    qwa = this;
                    qwc qwc4 = qwc;
                    th = th20;
                    bxvd = da2;
                    int elapsedRealtime4222 = (int) (SystemClock.elapsedRealtime() - j);
                    if (bxvd.f164950c) {
                    }
                    bokg bokg8222 = (bokg) bxvd.f164949b;
                    bokg8222.f133402a |= 8;
                    bokg8222.f133407f = elapsedRealtime4222;
                    qsh.m32791a(qwa.f42288e, qwc4.f42300a.f61088b).mo24250a((bokg) bxvd.mo74062i());
                    throw th;
                }
            }
            j = elapsedRealtime2;
            bxvd bxvd20 = da2;
            qrp qrp7 = qrp4;
            boolean z8 = z2;
            if (qrp7 == null) {
                qwa = this;
                try {
                    qwd qwd2 = qwa.f42289f;
                    qwc2 = qwc;
                    try {
                        acyr acyr6 = qwc2.f42300a;
                        if (z8) {
                            qwd2.mo24311a(acyr6, qwd2.mo24310a(acyr6));
                        }
                        qwd2.f42304a.mo24255a(acyr6, qta.f42082g);
                        z = z8;
                        bxvd5 = bxvd20;
                        if (bxvd5.f164950c) {
                        }
                        bokg bokg322 = (bokg) bxvd5.f164949b;
                        bokg322.f133402a |= 4;
                        bokg322.f133406e = z;
                        int elapsedRealtime322 = (int) (SystemClock.elapsedRealtime() - j);
                        if (bxvd5.f164950c) {
                        }
                        bokg bokg422 = (bokg) bxvd5.f164949b;
                        bokg422.f133402a |= 8;
                        bokg422.f133407f = elapsedRealtime322;
                        qsh.m32791a(qwa.f42288e, qwc2.f42300a.f61088b).mo24250a((bokg) bxvd5.mo74062i());
                    } catch (qrp e47) {
                        e = e47;
                        bxvd2 = bxvd20;
                    } catch (qvc e48) {
                        e = e48;
                        bxvd3 = bxvd20;
                        qvc = e;
                        r2 = bxvd3;
                        qwa.f42292i.mo24297a(qwc3.f42300a);
                        qwa.f42291h.mo24269a(qwc3.f42300a);
                        int b22222 = qrq.m32744b(1025);
                        if (!r2.f164950c) {
                        }
                        bokg bokg72222 = (bokg) r2.f164949b;
                        bokg72222.f133405d = b22222 - 1;
                        bokg72222.f133402a |= 2;
                        qwa.f42289f.mo24313a(qwc3, 1025);
                        throw new qrp(1025, "The current user is not a sync user.", qvc);
                    }
                } catch (qrp e49) {
                    e = e49;
                    bxvd6 = bxvd20;
                    qwc2 = qwc;
                    bxvd2 = bxvd6;
                    qrp = e;
                    int b422 = qrq.m32744b(qrp.f42002a);
                    if (!bxvd2.f164950c) {
                    }
                    bokg bokg6222 = (bokg) bxvd2.f164949b;
                    bokg6222.f133405d = b422 - 1;
                    bokg6222.f133402a |= 2;
                    qwa.f42289f.mo24313a(qwc2, qrp.f42002a);
                    if (qrp.f42002a == 1282) {
                    }
                    throw qrp;
                } catch (qvc e50) {
                    e = e50;
                    bxvd7 = bxvd20;
                    qwc2 = qwc;
                    bxvd3 = bxvd7;
                    qvc = e;
                    r2 = bxvd3;
                    qwa.f42292i.mo24297a(qwc3.f42300a);
                    qwa.f42291h.mo24269a(qwc3.f42300a);
                    int b222222 = qrq.m32744b(1025);
                    if (!r2.f164950c) {
                    }
                    bokg bokg722222 = (bokg) r2.f164949b;
                    bokg722222.f133405d = b222222 - 1;
                    bokg722222.f133402a |= 2;
                    qwa.f42289f.mo24313a(qwc3, 1025);
                    throw new qrp(1025, "The current user is not a sync user.", qvc);
                } catch (Throwable th21) {
                    th = th21;
                    bxvd8 = bxvd20;
                    qwc3 = qwc;
                    bxvd4 = bxvd8;
                    th = th;
                    bxvd = bxvd4;
                    int elapsedRealtime42222 = (int) (SystemClock.elapsedRealtime() - j);
                    if (bxvd.f164950c) {
                    }
                    bokg bokg82222 = (bokg) bxvd.f164949b;
                    bokg82222.f133402a |= 8;
                    bokg82222.f133407f = elapsedRealtime42222;
                    qsh.m32791a(qwa.f42288e, qwc4.f42300a.f61088b).mo24250a((bokg) bxvd.mo74062i());
                    throw th;
                }
            } else {
                qwa = this;
                qwc2 = qwc;
                throw qrp7;
            }
        } catch (qrp e51) {
            e = e51;
            qwc2 = r2;
            bxvd2 = da2;
        } catch (qvc e52) {
            e = e52;
            j = elapsedRealtime2;
            qwc2 = r2;
            bxvd3 = da2;
            qvc = e;
            r2 = bxvd3;
            qwa.f42292i.mo24297a(qwc3.f42300a);
            qwa.f42291h.mo24269a(qwc3.f42300a);
            int b2222222 = qrq.m32744b(1025);
            if (!r2.f164950c) {
            }
            bokg bokg7222222 = (bokg) r2.f164949b;
            bokg7222222.f133405d = b2222222 - 1;
            bokg7222222.f133402a |= 2;
            qwa.f42289f.mo24313a(qwc3, 1025);
            throw new qrp(1025, "The current user is not a sync user.", qvc);
        } catch (Throwable th22) {
            th = th22;
            bxvd4 = r2;
            th = th;
            bxvd = bxvd4;
            int elapsedRealtime422222 = (int) (SystemClock.elapsedRealtime() - j);
            if (bxvd.f164950c) {
            }
            bokg bokg822222 = (bokg) bxvd.f164949b;
            bokg822222.f133402a |= 8;
            bokg822222.f133407f = elapsedRealtime422222;
            qsh.m32791a(qwa.f42288e, qwc4.f42300a.f61088b).mo24250a((bokg) bxvd.mo74062i());
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo24303a(qwc qwc) {
        String string = this.f42288e.getString(C0126R.string.chromesync_sync_authority);
        Account a = qwc.f42300a.mo33252a();
        ContentResolver.setIsSyncable(a, string, 1);
        ContentResolver.setSyncAutomatically(a, string, true);
        ContentResolver.requestSync(a, string, qvu.m32974a(qwc));
    }
}
