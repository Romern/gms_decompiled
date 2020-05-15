package p000;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: tyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyk extends txn {
    @Deprecated

    /* renamed from: g */
    private final Boolean f46983g;

    static {
        new sbw("DeleteFileAction", "");
    }

    public tyk(uih uih, AppIdentity appIdentity, ukk ukk) {
        super(txr.DELETE_FILE, uih, appIdentity, ukk, tyq.NORMAL);
        this.f46983g = null;
    }

    /* renamed from: a */
    public static int m37742a(uhn uhn, uih uih, long j, boolean z) {
        uig a;
        uey a2 = uey.m38255a(uih);
        uhn.mo27435d();
        try {
            a = uhn.mo27396a(uih, j);
            Iterator it = a.iterator();
            int i = 0;
            while (it.hasNext()) {
                ujx ujx = (ujx) it.next();
                if (ujx.mo27532J()) {
                    sdo.m34970a(ujx.mo27532J());
                    if (ujx.f47825a.f47916h.longValue() == j) {
                        m37743a(uhn, ujx, a2, j, z);
                        i++;
                    }
                }
            }
            uhn.mo27442f();
            a.close();
            uhn.mo27439e();
            return i;
        } catch (Throwable th) {
            uhn.mo27439e();
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ujx.a(boolean, long):void
     arg types: [int, long]
     candidates:
      ujx.a(boolean, boolean):void
      ujx.a(java.lang.String, boolean):java.util.List
      ujx.a(java.lang.String, java.lang.String):uot
      ujx.a(boolean, long):void */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final txp mo26918b(txu txu, uey uey, ujx ujx) {
        uhn uhn = txu.f46958a;
        uih uih = uey.f47394a;
        AppIdentity appIdentity = uey.f47396c;
        long j = txu.f46959b;
        if (!Boolean.FALSE.equals(this.f46983g)) {
            tyi tyi = new tyi(uhn, this.f46915b, uey);
            mo26917a(ujx, txu.f46960c, tyi);
            Set<ujx> a = tyi.mo28728a();
            if (a.size() == 0) {
                return new typ(uih, appIdentity, tyq.NONE);
            }
            for (ujx ujx2 : a) {
                ujx2.mo27563a(true, j);
                ujx2.mo27627m(true);
            }
            return new tzl(uey.f47394a, uey.f47396c);
        }
        if ((ujx.mo27531I() == null || !m37744a(uhn, uey, ujx)) && ujx.mo27523A()) {
            ujx.f47825a.f47876E = false;
            ujx.mo27631o(false);
            ujx.mo27627m(true);
        }
        mo26919b(Collections.singleton(ujx.mo27551a()));
        return new typ(uih, appIdentity, tyq.NONE);
    }

    /* renamed from: c */
    public final void mo26893c(txv txv) {
        if (mo26920o().size() > 1) {
            SystemClock.sleep(((Long) twy.f46818aB.mo58455c()).longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tyk tyk = (tyk) obj;
            return mo26884a(tyk) && sdg.m34949a(this.f46983g, tyk.f46983g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo26898g() {
        return false;
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        Boolean bool = this.f46983g;
        if (bool != null) {
            h.put("deleted", bool);
        }
        return h;
    }

    public final int hashCode() {
        return (mo26905n() * 31) + Arrays.hashCode(new Object[]{this.f46983g});
    }

    public final String toString() {
        return String.format(Locale.US, "DeleteFileAction [%s, mLegacyDeleted=%s]", mo26904m(), this.f46983g);
    }

    public tyk(uih uih, JSONObject jSONObject) {
        super(txr.DELETE_FILE, uih, jSONObject);
        this.f46983g = jSONObject.has("deleted") ? Boolean.valueOf(jSONObject.getBoolean("deleted")) : null;
    }

    /* renamed from: a */
    private static void m37743a(uhn uhn, ujx ujx, uey uey, long j, boolean z) {
        sdo.m34974b(uhn.mo27382b());
        if (ujx.mo27531I() != null) {
            m37744a(uhn, uey, ujx);
        }
        if (ujx.mo27589b(j)) {
            ujx.mo27627m(z);
        }
    }

    /* renamed from: a */
    static boolean m37744a(uhn uhn, uey uey, ujx ujx) {
        ujx c = uhn.mo27430c(uey, ujx.mo27531I(), ujx.mo27546X(), ujx.mo27573ai());
        if (c == null || ujx.mo27551a().equals(c.mo27551a())) {
            return false;
        }
        ujx.mo27534L();
        return true;
    }

    /* JADX INFO: finally extract failed */
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
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vpu vpu = txv.f46961a;
        sdo.m34971a(!Boolean.FALSE.equals(this.f46983g), (Object) "Cannot undelete an entry on the server.");
        vld vld = new vld(vpu.f49762i.mo28605a(clientContext, 2832));
        try {
            shc shc = new shc();
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("files/%1$s", shd.m35267a(str));
            shc.mo25531a(sb);
            vld.f49433a.mo25539a(clientContext, 3, sb.toString(), null);
        } catch (VolleyError e) {
            if (vkv.m40743a(e)) {
                vkv.f49412a.mo25373b("ApiaryRemoteResourceAcc", "Not found, assuming already deleted", e);
            } else {
                vpg.m41006a(e);
                throw e;
            }
        }
        uhn uhn = vpu.f49757d;
        uhn.mo27435d();
        try {
            ujx a = uhn.mo27401a(mo26895d(uhn), str);
            if (!a.mo27537O()) {
                boolean w = a.mo27640w();
                a.mo27533K();
                a.mo27627m(false);
                if (!w) {
                    m37742a(uhn, this.f46915b, txv.f46962b, false);
                    uhn.mo27442f();
                    uhn.mo27439e();
                    vpu.f49769p.mo27275a();
                }
            }
            m37743a(uhn, a, uey.m38255a(this.f46915b), txv.f46962b, false);
            uih uih = this.f46915b;
            txr txr = this.f46914a;
            long j = txv.f46962b;
            sqv sqv = vpu.f49747F;
            uhn.mo27413a(uih, txr, j, System.currentTimeMillis());
            vpu.f49759f.mo27003d();
            uhn.mo27442f();
            uhn.mo27439e();
            vpu.f49769p.mo27275a();
        } catch (Throwable th) {
            uhn.mo27439e();
            throw th;
        }
    }
}
