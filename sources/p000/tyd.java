package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: tyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyd extends txl {

    /* renamed from: i */
    private static final sbw f46978i = new sbw("CreateFileAction", "");

    /* renamed from: h */
    public Long f46979h;

    /* renamed from: j */
    private final String f46980j;

    public tyd(uih uih, AppIdentity appIdentity, String str, MetadataBundle metadataBundle, DriveId driveId, uaw uaw) {
        super(txr.CREATE_FILE, uih, appIdentity, metadataBundle, driveId, uaw);
        this.f46980j = str;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:5:0x0071 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:93:0x01ee */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:79:0x0196 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:60:0x0173 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:53:0x0155 */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: uey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX WARN: Type inference failed for: r13v1, types: [long], assign insn: 0x006c: IGET  (r13v1 ? I:long) = (r0v6 ugt) ugt.e long */
    /* JADX WARN: Type inference failed for: r13v3, assign insn: PHI: (r13v3 ?) = (r13v1 ?), (r13v7 ?), (r13v8 ?), (r13v8 ?), (r13v9 ?) binds: [B:5:0x0071, B:98:0x01ff, B:93:0x01ee, B:94:?, B:79:0x0196] */
    /* JADX WARN: Type inference failed for: r13v7, assign insn: 0x01fe: MOVE  (r13v7 ? I:?[OBJECT, ARRAY]) = (r3v2 java.util.concurrent.atomic.AtomicBoolean) */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.concurrent.atomic.AtomicBoolean], assign insn: 0x01e3: MOVE  (r13v8 ? I:?[OBJECT, ARRAY]) = (r3v2 java.util.concurrent.atomic.AtomicBoolean) */
    /* JADX WARN: Type inference failed for: r13v9, assign insn: PHI: (r13v9 ?) = (r13v1 ?), (r13v23 ?), (r13v24 ?) binds: [B:78:0x0194, B:69:0x0181, B:63:0x0177] */
    /* JADX WARN: Type inference failed for: r3v16, assign insn: PHI: (r3v16 ?) = (r3v19 java.util.concurrent.atomic.AtomicBoolean), (r3v20 java.util.concurrent.atomic.AtomicBoolean), (r3v20 java.util.concurrent.atomic.AtomicBoolean) binds: [B:60:0x0173, B:53:0x0155, B:54:?] */
    /* JADX WARN: Type inference failed for: r3v18, assign insn: PHI: (r3v18 ?) = (r3v19 java.util.concurrent.atomic.AtomicBoolean), (r3v20 java.util.concurrent.atomic.AtomicBoolean), (r3v20 java.util.concurrent.atomic.AtomicBoolean) binds: [B:60:0x0173, B:53:0x0155, B:54:?] */
    /* JADX WARN: Type inference failed for: r13v23, assign insn: ?: MOVE  (r13v23 ?) = (r13v11 java.lang.String) */
    /* JADX WARN: Type inference failed for: r13v24, assign insn: ?: MOVE  (r13v24 ?) = (r13v13 uhn) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vpb.a(uhn, uih, long, boolean):void
     arg types: [uhn, uih, long, int]
     candidates:
      vpb.a(uhn, uih, long, long):void
      vpb.a(ujx, ukt, ung, long):void
      vpb.a(ujx, ukt, boolean, long):void
      vpb.a(uhn, uih, long, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023e, code lost:
        throw new p000.tzx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0242, code lost:
        p000.tyd.f46978i.mo25378c(r15, "Unexpected UploadConflictException", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0250, code lost:
        throw new p000.tzv(r14, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0264, code lost:
        r11.mo28270a(r12.mo27324a());
        r11.mo28272a(r12.mo27329e());
        r11.mo28273b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        r3 = r29;
        r15 = "CreateFileAction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        r14 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d5, code lost:
        r19 = "CreateFileAction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0180, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0181, code lost:
        r14 = r18;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0184, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0185, code lost:
        r15 = "CreateFileAction";
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0187, code lost:
        r14 = r18;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        r14 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a4, code lost:
        throw new p000.tzv(r14, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ab, code lost:
        throw ((p000.tzv) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b2, code lost:
        p000.sdo.m34971a(mo26912r(), (java.lang.Object) "Conflict should only happen while creating a singleton file");
        r0 = r1.f46961a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c1, code lost:
        if (mo26889b() == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c3, code lost:
        mo26908a(r0.f49757d, r26, r0.f49762i.mo28597a(r2, (java.lang.String) r10.f46919e.mo18269a(p000.uzm.f48729E), r26.mo27573ai()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01de, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        m37721a(r22, r23, r24, r26, false, r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f7, code lost:
        if (r13.compareAndSet(true, false) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r0.f49779z.mo28208a(r23, (java.lang.String) r10.f46919e.mo18269a(p000.uzm.f48729E), r26.mo27573ai(), new p000.vks(302, 2, false, true));
        r0 = r0.f49757d;
        r7 = r10.f46915b;
        p000.vpb.m40991b(r0, r7, r24, false);
        p000.vpb.m40988a(r0, r7, r26.mo27551a(), r24, false);
        p000.tyk.m37742a(r0, r7, r24, false);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0242 A[Catch:{ InterruptedException -> 0x0251, ugq -> 0x01ac, ugr -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2 A[ExcHandler: ugr (e ugr), Splitter:B:10:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:10:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e A[Catch:{ InterruptedException -> 0x0251, ugq -> 0x01ac, ugr -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a5 A[Catch:{ InterruptedException -> 0x0251, ugq -> 0x01ac, ugr -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b2 A[Catch:{ InterruptedException -> 0x0251, ugq -> 0x01ac, ugr -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x0173=Splitter:B:60:0x0173, B:53:0x0155=Splitter:B:53:0x0155} */
    /* renamed from: a */
    private final void m37721a(ClientContext clientContext, uey uey, long j, ujx ujx, boolean z, txv txv, AtomicBoolean atomicBoolean) {
        AtomicBoolean atomicBoolean2;
        String str;
        String str2;
        AtomicBoolean atomicBoolean3;
        String str3;
        AtomicBoolean atomicBoolean4;
        uhn uhn;
        uhn uhn2;
        AtomicBoolean atomicBoolean5;
        AtomicBoolean atomicBoolean6;
        uhn uhn3;
        ClientContext clientContext2 = clientContext;
        uey uey2 = uey;
        long j2 = j;
        txv txv2 = txv;
        AtomicBoolean atomicBoolean7 = atomicBoolean;
        File a = uyj.m39758a(this.f46919e);
        if (mo26912r() && z) {
            a.mo18240a(vkv.m40739a((String) this.f46919e.mo18269a(uzm.f48729E), ujx.mo27573ai()));
        }
        vpu vpu = txv2.f46961a;
        ugt a2 = ugt.m38373a(ujx, vpu, this.f46979h.longValue(), null, a.toString(), z, uey, 409, uyy.m39807a((String) this.f46919e.mo18269a(uzm.f48738N)));
        vcx f = txv2.f46964d.mo28305f();
        ugu a3 = vpu.f49774u.mo27351a(a2, vpu, f);
        ? r13 = a2.f47566e;
        f.mo28271a((long) r13);
        try {
            vkr a4 = a3.mo27328a(txv.mo26925a(), txv2.f46963c, clientContext2);
            uhn uhn4 = vpu.f49757d;
            String str4 = uey2.f47395b;
            String g = a4.mo28572g();
            String str5 = "Upload failed";
            String K = a4.mo28549K();
            uhn4.mo27435d();
            try {
                ujx a5 = uhn4.mo27401a(uey.m38255a(this.f46915b), g);
                sdo.m34970a(mo26912r());
                str3 = "CreateFileAction";
                if (!a5.mo27551a().equals(mo26913s())) {
                    a5.mo27579ao();
                }
            } catch (uaa e) {
            } catch (InterruptedException e2) {
            } catch (ugq e3) {
                e = e3;
                atomicBoolean3 = atomicBoolean;
                str = str5;
                str2 = str3;
                if (z) {
                }
            } catch (ugr e4) {
            } catch (Throwable th) {
            }
            try {
                ujx a6 = uhn4.mo27402a(uey.m38255a(this.f46915b), mo26913s());
                mo26908a(uhn4, a6, g);
                if (mo26912r()) {
                    String str6 = (String) twy.f46817aA.mo58455c();
                    if (TextUtils.isEmpty(str6)) {
                        str6 = null;
                    }
                    a6.mo27597d(str6);
                }
                if (K != null) {
                    a6.mo27586b(this.f46980j, K);
                    a6.mo27612g(true);
                } else {
                    a6.mo27626m();
                }
                uhc.m38506a(uhn4, a4, a6, str4);
                a6.mo27535M();
                a6.mo27629n(false);
                vpb.m40987a(uhn4, this.f46915b, j2, false);
                vpb.m40985a(uhn4, this.f46915b, j2);
                uhn uhn5 = uhn4;
                str = str5;
                str2 = str3;
                AtomicBoolean atomicBoolean8 = atomicBoolean;
                try {
                    vpb.m40988a(uhn4, this.f46915b, a6.mo27551a(), j, false);
                    uhn5.mo27442f();
                    uhn = uhn5;
                    atomicBoolean4 = atomicBoolean8;
                } catch (uaa e5) {
                    e = e5;
                    uhn2 = uhn5;
                    atomicBoolean5 = atomicBoolean8;
                }
            } catch (uaa e6) {
                e = e6;
                atomicBoolean5 = atomicBoolean;
                uhn2 = uhn4;
                str = str5;
                str2 = str3;
                try {
                    f46978i.mo25378c(str2, "Unable to retrieve entry.", e);
                    uhn = uhn2;
                    atomicBoolean4 = atomicBoolean5;
                    uhn.mo27439e();
                    if (!atomicBoolean4.compareAndSet(true, false)) {
                    }
                    f.mo28270a(a3.mo27324a());
                    f.mo28272a(a3.mo27329e());
                    f.mo28273b();
                } catch (Throwable th2) {
                    th = th2;
                    uhn3 = uhn2;
                    atomicBoolean6 = atomicBoolean5;
                    uhn.mo27439e();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                atomicBoolean6 = atomicBoolean;
                uhn3 = uhn4;
                str = str5;
                str2 = str3;
                uhn.mo27439e();
                throw th;
            }
            try {
                uhn.mo27439e();
                if (!atomicBoolean4.compareAndSet(true, false)) {
                    return;
                }
            } catch (InterruptedException e7) {
                e = e7;
                throw new tzv(str, e, true);
            } catch (ugq e8) {
                e = e8;
                atomicBoolean3 = atomicBoolean4;
                if (z) {
                }
            } catch (ugr e9) {
                e = e9;
                r13 = uhn;
                uey2 = atomicBoolean4;
                if (e.getCause() instanceof tzv) {
                }
            }
        } catch (InterruptedException e10) {
            e = e10;
            String str7 = "Upload failed";
            throw new tzv(str, e, true);
        } catch (ugq e11) {
            e = e11;
            str = "Upload failed";
            str2 = "CreateFileAction";
            atomicBoolean3 = atomicBoolean7;
            if (z) {
            }
        } catch (ugr e12) {
            e = e12;
            str = "Upload failed";
            uey2 = atomicBoolean7;
            if (e.getCause() instanceof tzv) {
            }
        } catch (Throwable th4) {
            th = th4;
            atomicBoolean2 = r13;
            if (atomicBoolean2.compareAndSet(true, false)) {
            }
            throw th;
        }
        f.mo28270a(a3.mo27324a());
        f.mo28272a(a3.mo27329e());
        f.mo28273b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo26896e() {
        return this.f46980j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tyd tyd = (tyd) obj;
            return mo26884a(tyd) && sdg.m34949a(this.f46980j, tyd.f46980j) && sdg.m34949a(this.f46979h, tyd.f46979h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final MetadataBundle mo26897f() {
        return this.f46919e;
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("contentId", this.f46980j);
        h.putOpt("pendingUploadSqlId", this.f46979h);
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f46980j, this.f46979h});
    }

    /* renamed from: j */
    public final boolean mo26901j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo26909o() {
        return true;
    }

    public final String toString() {
        return String.format(Locale.US, "CreateFileAction[%s, pendingUploadSqlId=%d, contentHash=%s]", mo26904m(), this.f46979h, this.f46980j);
    }

    public tyd(uih uih, JSONObject jSONObject) {
        super(txr.CREATE_FILE, uih, jSONObject);
        this.f46980j = jSONObject.getString("contentId");
        if (jSONObject.has("pendingUploadSqlId")) {
            this.f46979h = Long.valueOf(Long.parseLong(jSONObject.getString("pendingUploadSqlId")));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26906a(uey uey) {
        return (String) this.f46919e.mo18269a(uzm.f48738N);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26907a(txu txu, ujx ujx) {
        boolean z;
        uhn uhn = txu.f46958a;
        ukp d = uhn.mo27434d(this.f46980j);
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34972a(z, "Content does not exist: %s", this.f46980j);
        ujx.mo27553a(d.f48038f);
        ulz a = uhn.mo27406a(this.f46980j, (String) null, txu.f46959b, ujx.mo27551a());
        String str = this.f46980j;
        ujx.mo27593c(str, vpc.m40995b(str));
        ujx.mo27584b(Long.valueOf(txu.f46959b));
        this.f46979h = Long.valueOf(a.f48366m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26880a(txv txv, ClientContext clientContext) {
        mo26910p();
        uhn uhn = txv.f46961a.f49757d;
        uey d = mo26895d(uhn);
        ujx a = uhn.mo27402a(d, mo26913s());
        try {
            m37721a(clientContext, d, txv.f46962b, a, true, txv, new AtomicBoolean(true));
            ujx a2 = uhn.mo27402a(uey.m38255a(this.f46915b), mo26913s());
            if (a2 != null) {
                txv.f46964d.mo28287a(a2);
            }
        } catch (Throwable th) {
            ujx a3 = uhn.mo27402a(uey.m38255a(this.f46915b), mo26913s());
            if (a3 != null) {
                txv.f46964d.mo28287a(a3);
            }
            throw th;
        }
    }
}
