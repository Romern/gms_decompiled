package p000;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzc extends txn {

    /* renamed from: g */
    private static final sbw f46997g = new sbw("SetSubscribedAction", "");

    /* renamed from: h */
    private final boolean f46998h;

    public tzc(uih uih, AppIdentity appIdentity, ukk ukk, boolean z, tyq tyq) {
        super(txr.SET_SUBSCRIBED, uih, appIdentity, ukk, tyq);
        this.f46998h = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vkv.a(java.lang.Class, boolean):java.lang.String
     arg types: [java.lang.Class, int]
     candidates:
      vkv.a(java.lang.String, boolean):com.google.android.gms.drive.internal.model.FileLocalId
      vkv.a(com.google.android.gms.common.internal.ClientContext, com.google.android.gms.drive.internal.model.File):vkr
      vkv.a(com.google.android.gms.common.internal.ClientContext, int):vla
      vkv.a(int, com.google.android.gms.drive.internal.model.Permission):void
      vkv.a(java.lang.Class, boolean):java.lang.String */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uhc.a(uhn, vkr, ujx, java.lang.String):void
     arg types: [uhn, vkt, ujx, java.lang.String]
     candidates:
      uhc.a(uhm, vkr, ujx, java.lang.String):void
      uhc.a(uhn, vkr, ujx, java.lang.String):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        boolean z;
        vpu vpu = txv.f46961a;
        uhn uhn = vpu.f49757d;
        String str2 = mo26895d(uhn).f47395b;
        ClientContext a = uey.m38255a(this.f46915b).mo27262a(vpu.f49755b);
        vks vks = new vks(905, 2, false, false);
        vkv vkv = vpu.f49762i;
        boolean z2 = this.f46998h;
        sdo.m34975b(vkv.m40744a(a), "User subscription state can only be modified from internal");
        vld vld = new vld(vkv.mo28605a(a, 2833));
        try {
            shc shc = new shc();
            shc.mo25530a(vkv.m40740a(File.class, true));
            Boolean bool = vks.f49403e;
            Boolean bool2 = vks.f49402d;
            Boolean bool3 = vks.f49401c;
            String a2 = vks.mo28592a();
            Integer num = vks.f49400b;
            File file = new File();
            file.f30974Q = z2;
            file.f30983a.add(69);
            vkt vkt = new vkt(vld.mo28611a(a, str, false, bool, null, bool2, false, false, bool3, false, a2, false, num, false, false, file, shc), a, null);
            uhn.mo27435d();
            try {
                ujx e = mo26916e(uhn);
                uhc.m38506a(uhn, (vkr) vkt, e, str2);
                e.mo27618i(this.f46998h);
                if (vkt.mo28560V() == null || vkt.mo28560V().booleanValue() == this.f46998h) {
                    z = false;
                } else {
                    z = false;
                    f46997g.mo25375b("Server returned unexpected updated field %s, expected=%s", vkt.mo28560V(), Boolean.valueOf(this.f46998h));
                    e.mo27618i(vkt.mo28560V().booleanValue());
                }
                e.mo27629n(z);
                uhn.mo27442f();
            } finally {
                uhn.mo27439e();
            }
        } catch (gid e2) {
            throw new AuthFailureError("Auth failure", e2);
        } catch (VolleyError e3) {
            vpg.m41006a(e3);
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final txp mo26918b(txu txu, uey uey, ujx ujx) {
        mo26917a(ujx, txu.f46960c, new tza(txu.f46958a, uey.f47394a));
        boolean af = ujx.mo27570af();
        boolean z = this.f46998h;
        if (af == z) {
            return new typ(uey.f47394a, uey.f47396c, tyq.NONE);
        }
        ujx.mo27615h(z);
        ujx.mo27627m(true);
        return new tzc(uey.f47394a, uey.f47396c, this.f46922e, af, tyq.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            tzc tzc = (tzc) obj;
            return mo26884a(tzc) && this.f46998h == tzc.f46998h;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo26898g() {
        return this.f46998h;
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("newSubscribedValue", this.f46998h);
        return h;
    }

    public final int hashCode() {
        return (mo26905n() * 31) + (this.f46998h ? 1 : 0);
    }

    public final String toString() {
        return String.format(Locale.US, "SetSubscribedAction [%s, newSubscribedValue=%s]", mo26904m(), Boolean.valueOf(this.f46998h));
    }

    public tzc(uih uih, JSONObject jSONObject) {
        super(txr.SET_SUBSCRIBED, uih, jSONObject);
        this.f46998h = jSONObject.getBoolean("newSubscribedValue");
    }
}
