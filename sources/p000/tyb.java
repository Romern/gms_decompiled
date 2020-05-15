package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyb extends txm {

    /* renamed from: f */
    private static final sbw f46973f = new sbw("ContentAndMetadataActio", "");

    /* renamed from: g */
    private String f46974g;

    /* renamed from: h */
    private final String f46975h;

    /* renamed from: i */
    private final MetadataBundle f46976i;

    /* renamed from: j */
    private Long f46977j;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    public tyb(uih uih, AppIdentity appIdentity, ukk ukk, String str, MetadataBundle metadataBundle, String str2, uaw uaw) {
        super(txr.CONTENT_AND_METADATA, uih, appIdentity, ukk, tyq.NORMAL, uaw);
        sdo.m34959a((Object) str);
        this.f46974g = str;
        metadataBundle = metadataBundle == null ? MetadataBundle.m23056a() : metadataBundle;
        this.f46976i = metadataBundle;
        sdo.m34974b(!metadataBundle.mo18275c(uzm.f48737M));
        if (uaw.mo27025a()) {
            sdo.checkIfNull((Object) str2, (Object) "baseContentHash cannot be null when conflict detection is required");
        }
        this.f46975h = !uaw.f47072c ? null : str2;
    }

    /* renamed from: a */
    private final void m37709a(vpu vpu, ujx ujx, long j, ugt ugt) {
        vpu vpu2 = vpu;
        long j2 = j;
        ugt ugt2 = ugt;
        sdo.m34970a(mo26889b());
        if (ugt2 != null) {
            ugt2.mo27349a(null);
        }
        uey d = mo26895d(vpu2.f49757d);
        String i = ujx.mo27616i();
        ukk a = ujx.mo27551a();
        try {
            vpu2.f49779z.mo28207a(d, i, new vks(302, 2, false, true));
            uhn uhn = vpu2.f49757d;
            ujx e = mo26916e(uhn);
            if (e == null || e.mo27523A()) {
                f46973f.mo25369a("Failed to sync entry (%s) after conflict detection", i);
                throw new uaa(a);
            } else if (!this.f46975h.equals(e.mo27628n()) || !e.mo27630o().equals(e.mo27624l())) {
                if (cdqp.f181574a.mo6606a().mo78192a()) {
                    uhn.mo27435d();
                    try {
                        vpb.m40991b(vpu2.f49757d, this.f46915b, j2, false);
                        vpb.m40988a(uhn, this.f46915b, e.mo27551a(), j, false);
                        vpb.m40985a(uhn, this.f46915b, j2);
                        uhn.mo27442f();
                    } finally {
                        uhn.mo27439e();
                    }
                } else {
                    vpb.m40991b(vpu2.f49757d, this.f46915b, j2, false);
                    vpb.m40988a(uhn, this.f46915b, e.mo27551a(), j, false);
                }
                throw new tzx();
            } else {
                f46973f.mo25369a("Failed to sync entry (%s) after conflict detection since app is not authorized anymore", i);
                throw new tzv("Upload failed. Filtered false positive conflict", true);
            }
        } catch (VolleyError e2) {
            f46973f.mo25369a("Failed to sync entry (%s) after conflict detection", i);
            throw e2;
        } catch (gid e3) {
            f46973f.mo25369a("Failed to sync entry (%s) after conflict detection since app is not authorized anymore", i);
            throw new tzu(d.f47396c);
        }
    }

    /* renamed from: b */
    public final boolean mo26890b(txp txp) {
        return (txp instanceof tyb) && this.f46917d.mo27026a(txp.mo26891c()) && this.f46916c.equals(txp.mo26900i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo26894d() {
        return this.f46975h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo26896e() {
        return this.f46974g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tyb tyb = (tyb) obj;
            return mo26884a(tyb) && sdg.m34949a(this.f46977j, tyb.f46977j) && sdg.m34949a(this.f46974g, tyb.f46974g) && sdg.m34949a(this.f46976i, tyb.f46976i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final MetadataBundle mo26897f() {
        return this.f46976i;
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.putOpt("pendingUploadSqlId", this.f46977j);
        h.put("contentHash", this.f46974g);
        h.putOpt("metadataDelta", uyj.m39762b(this.f46976i));
        h.putOpt("baseContentHash", this.f46975h);
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f46977j, this.f46974g, this.f46976i});
    }

    /* renamed from: j */
    public final boolean mo26901j() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo26903l() {
        return true;
    }

    public final String toString() {
        return String.format(Locale.US, "ContentAndMetadataAction[%s, pendingUploadSqlId=%d, contentHash=%s, metadataChangeSet=%s]", mo26904m(), this.f46977j, this.f46974g, this.f46976i);
    }

    public tyb(uih uih, JSONObject jSONObject) {
        super(txr.CONTENT_AND_METADATA, uih, jSONObject);
        if (jSONObject.has("pendingUploadSqlId")) {
            this.f46977j = Long.valueOf(Long.parseLong(jSONObject.getString("pendingUploadSqlId")));
        }
        this.f46974g = jSONObject.getString("contentHash");
        this.f46975h = vpd.m40996a(jSONObject, "baseContentHash");
        if (jSONObject.has("metadataDelta")) {
            this.f46976i = uyj.m39759a(jSONObject.getJSONObject("metadataDelta"));
        } else {
            this.f46976i = MetadataBundle.m23056a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        boolean z;
        ukt ukt;
        uhn uhn = txu.f46958a;
        if (!mo26889b() || this.f46975h.equals(ujx.mo27633q())) {
            long j = txu.f46959b;
            this.f46977j = Long.valueOf(uhn.mo27406a(this.f46974g, this.f46975h, j, ujx.mo27551a()).f48366m);
            if (!sdg.m34949a(this.f46974g, ujx.mo27633q())) {
                String str = this.f46974g;
                ujx.mo27593c(str, vpc.m40995b(str));
            }
            ujx.mo27581aq();
            ujx.mo27584b(Long.valueOf(j));
            ukp d = uhn.mo27434d(this.f46974g);
            if (d != null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34972a(z, "Content does not exist: %s", this.f46974g);
            if (ujx.mo27636t() == null) {
                ujx.mo27591c(Long.valueOf(ujx.mo27635s()));
            }
            ujx.mo27553a(d.f48038f);
            if (ujx.mo27571ag()) {
                ukt = uhn.mo27380b(ujx.mo27582b());
            } else {
                ukt = uhn.mo27404a(ujx);
                ujx.mo27620j(true);
            }
            uyj.m39761a(ujx, ukt, j, mo26892c(uhn).f47395b, this.f46976i);
            ujx.mo27608f((Date) null);
            ujx.mo27607f((String) null);
            ujx.mo27627m(true);
            ukt.mo27725t();
            return new tzh(uey.f47394a, uey.f47396c, this.f46922e);
        }
        throw new tzx();
    }

    /* renamed from: a */
    public final void mo26878a(txp txp, uhn uhn, long j) {
        sdo.m34975b(mo26890b(txp), "Invalid action to squash under.");
        tyb tyb = (tyb) txp;
        this.f46974g = tyb.f46974g;
        MetadataBundle metadataBundle = this.f46976i;
        MetadataBundle metadataBundle2 = tyb.f46976i;
        for (uvy uvy : metadataBundle2.mo18274c()) {
            uvy.mo28087a(metadataBundle, metadataBundle2);
        }
        uaw uaw = this.f46917d;
        uaw c = txp.mo26891c();
        sdo.m34975b(uaw.mo27026a(c), "Can't squash under the provided context!");
        ArrayList arrayList = new ArrayList(uaw.f47074e);
        arrayList.addAll(c.f47074e);
        this.f46917d = new uaw(uaw.f47071b, uaw.f47072c, uaw.f47073d, Collections.unmodifiableList(arrayList), uaw.f47075f, c.f47076g);
        uhn.mo27438e(this.f46977j.longValue()).mo27726u();
        uhn.mo27438e(tyb.f46977j.longValue()).mo27726u();
        this.f46977j = Long.valueOf(uhn.mo27406a(this.f46974g, this.f46975h, j, this.f46922e).f48366m);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean], assign insn: PHI: (r8v1 ?) = (r8v3 ?), (r8v9 ?) binds: [B:20:0x009a, B:16:0x0088] */
    /* JADX WARN: Type inference failed for: r8v3, assign insn: 0x009b: CONST  (r8v3 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r8v9, assign insn: ?: MOVE  (r8v9 ?) = (r8v5 boolean) */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        ? r8;
        String str2;
        vpu vpu;
        String str3;
        uhn uhn;
        boolean z;
        ClientContext clientContext2 = clientContext;
        String str4 = str;
        vpu vpu2 = txv.f46961a;
        uhn uhn2 = vpu2.f49757d;
        ujx e = mo26916e(uhn2);
        long j = txv.f46962b;
        String str5 = mo26895d(uhn2).f47395b;
        String n = e.mo27628n();
        String o = e.mo27630o();
        if (mo26889b() && !this.f46975h.equals(n)) {
            f46973f.mo25371b("Conflict detected in applyOnServer -- content hash mismatch");
            m37709a(vpu2, e, j, null);
        }
        vkr vkr = null;
        if (mo26889b()) {
            HashSet hashSet = new HashSet();
            hashSet.add(mo26895d(uhn2).f47395b);
            try {
                vkr a = vpu2.f49762i.mo28602a(clientContext2, str4, hashSet, vks.f49399a);
                String K = a.mo28549K();
                String str6 = ((vkt) a).f49405a.f30994l;
                if (o == null || !o.equals(K)) {
                    f46973f.mo25371b("Conflict detected in applyOnServer -- revision ID mismatch");
                    z = true;
                    m37709a(vpu2, e, j, null);
                } else {
                    z = true;
                }
                str2 = str6;
                r8 = z;
            } catch (VolleyError e2) {
                f46973f.mo25375b("Request to get file metadata failed. Cannot proceed with conflict-aware upload of %s", str4);
                throw e2;
            }
        } else {
            r8 = 1;
            str2 = null;
        }
        long j2 = j;
        String str7 = str5;
        uhn uhn3 = uhn2;
        vpu vpu3 = vpu2;
        ugt a2 = ugt.m38373a(mo26916e(uhn2), vpu2, this.f46977j.longValue(), str2, uyj.m39758a(this.f46976i).toString(), false, mo26895d(uhn2), 412, uyy.m39807a(e.mo27530H()));
        txv txv2 = txv;
        vcx f = txv2.f46964d.mo28305f();
        ugu a3 = vpu3.f49774u.mo27351a(a2, vpu3, f);
        f.mo28271a(a2.f47566e);
        try {
            vkr = a3.mo27328a(txv.mo26925a(), txv2.f46963c, clientContext2);
            f.mo28270a(a3.mo27324a());
            f.mo28272a(a3.mo27329e());
            f.mo28273b();
            vpu = vpu3;
            str3 = str7;
            uhn = uhn3;
        } catch (InterruptedException e3) {
            throw new tzv("Upload failed", e3, r8);
        } catch (ugq e4) {
            f46973f.mo25371b("Conflict detected in applyOnServer during upload");
            vpu = vpu3;
            str3 = str7;
            uhn = uhn3;
            m37709a(vpu3, e, j2, a2);
            f.mo28270a(a3.mo27324a());
            f.mo28272a(a3.mo27329e());
            f.mo28273b();
        } catch (ugr e5) {
            if (!(e5.getCause() instanceof tzv)) {
                throw new tzv("Upload failed", e5, r8);
            }
            throw ((tzv) e5.getCause());
        } catch (Throwable th) {
            f.mo28270a(a3.mo27324a());
            f.mo28272a(a3.mo27329e());
            f.mo28273b();
            throw th;
        }
        vkr vkr2 = vkr;
        ufu ufu = txv2.f46961a.f49767n;
        ukk a4 = e.mo27551a();
        ufr ufr = ufu.f47475e;
        synchronized (ufr.f47466a) {
            ugb ugb = (ugb) ufr.f47466a.get(a4);
            if (!(ugb == null || ugb.f47495a.getAndSet(0) == 0)) {
                ugb.mo27310b();
            }
        }
        uhn.mo27435d();
        try {
            String R = vkr2.mo28556R();
            ujx e6 = mo26916e(uhn);
            if (R == null) {
                sbw sbw = f46973f;
                Object[] objArr = new Object[2];
                objArr[0] = a3.mo27329e();
                objArr[r8] = vpu.f49755b;
                sbw.mo25374b("ContentAndMetadataActio", "Server did not return uploaded content revision ID. Upload IDs: %s, context: %s", objArr);
            } else {
                e6.mo27586b(this.f46974g, R);
            }
            uhc.m38506a(uhn, vkr2, e6, str3);
            e6.mo27629n(false);
            vpb.m40991b(uhn, this.f46915b, j2, false);
            vpb.m40988a(uhn, this.f46915b, e6.mo27551a(), j2, false);
            vpb.m40985a(uhn, this.f46915b, j2);
            uhn.mo27442f();
        } finally {
            uhn.mo27439e();
        }
    }
}
