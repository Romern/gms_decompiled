package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Arrays;
import java.util.Formatter;
import org.json.JSONObject;

/* renamed from: tyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyx extends txm {

    /* renamed from: f */
    private final String f46994f;

    /* renamed from: g */
    private final ueq f46995g;

    public tyx(uih uih, AppIdentity appIdentity, ukk ukk, String str, ueq ueq, tyq tyq) {
        super(txr.SET_APP_AUTH_STATE, uih, appIdentity, ukk, tyq);
        sdo.m34959a((Object) str);
        this.f46994f = str;
        sdo.m34959a(ueq);
        this.f46995g = ueq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        ueq ueq;
        uig a;
        ueq ueq2;
        uhn uhn = txu.f46958a;
        String str = this.f46994f;
        ueq ueq3 = this.f46995g;
        sdo.m34975b(ujx.mo27641x(), "entry must be saved to database before setting auth state");
        uhj uhj = ((ugx) uhn).f47578a;
        uog b = uka.SDK_APP_ID.f47838c.mo27708b(str);
        uhj.mo27476b();
        try {
            ueq ueq4 = ueq.AUTHORIZED;
            int ordinal = ueq3.ordinal();
            if (ordinal == 0) {
                a = ((ugx) uhn).mo27366a(ujx, b);
                if (a.isEmpty()) {
                    ueq2 = ueq.UNAUTHORIZED;
                } else {
                    ueq2 = ueq.AUTHORIZED;
                }
                a.close();
                if (ueq2 == ueq.UNAUTHORIZED) {
                    new ujy(uhj, ujx.mo27613h(), str).mo27725t();
                }
                ueq = ueq2;
            } else if (ordinal == 1) {
                if (uhj.mo27465a(ukb.f47839a, uoh.m39066a(b, uka.ENTRY_ID.f47838c.mo27717e(ujx.mo27613h()))) == 0) {
                    ueq = ueq.UNAUTHORIZED;
                } else {
                    ueq = ueq.AUTHORIZED;
                }
            } else {
                throw new AssertionError();
            }
            uhj.mo27480f();
            uhj.mo27478d();
            if (ueq.equals(this.f46995g)) {
                return new typ(uey.f47394a, uey.f47396c, tyq.NONE);
            }
            return new tyx(uey.f47394a, uey.f47396c, this.f46922e, this.f46994f, ueq, tyq.NONE);
        } catch (Throwable th) {
            uhj.mo27478d();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            tyx tyx = (tyx) obj;
            return mo26884a(tyx) && this.f46994f.equals(tyx.f46994f) && this.f46995g == tyx.f46995g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo26898g() {
        return this.f46995g == ueq.AUTHORIZED;
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("packagingId", this.f46994f);
        h.put("isAuthorized", this.f46995g.equals(ueq.AUTHORIZED));
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f46994f, this.f46995g});
    }

    public final String toString() {
        return String.format("SetAppAuthStateAction [%s, sdkAppId=%s, authState=%s]", mo26904m(), this.f46994f, this.f46995g);
    }

    public tyx(uih uih, JSONObject jSONObject) {
        super(txr.SET_APP_AUTH_STATE, uih, jSONObject);
        this.f46994f = jSONObject.getString("packagingId");
        this.f46995g = jSONObject.getBoolean("isAuthorized") ? ueq.AUTHORIZED : ueq.UNAUTHORIZED;
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
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vpu vpu = txv.f46961a;
        ueq ueq = ueq.AUTHORIZED;
        int ordinal = this.f46995g.ordinal();
        if (ordinal == 0) {
            vks vks = new vks(118, 2, false, false);
            vkv vkv = vpu.f49762i;
            String str2 = this.f46994f;
            sdo.m34970a(vkv.m40744a(clientContext));
            vld vld = new vld(vkv.mo28605a(clientContext, 2828));
            try {
                shc shc = new shc();
                shc.mo25530a(vkv.m40740a(File.class, true));
                Boolean bool = vks.f49403e;
                Boolean bool2 = vks.f49402d;
                Boolean bool3 = vks.f49401c;
                Boolean bool4 = (Boolean) twy.f46857ao.mo58455c();
                String a = vks.mo28592a();
                Integer num = vks.f49400b;
                StringBuilder sb = new StringBuilder();
                new Formatter(sb).format("files/%1$s/authorize", shd.m35267a(str));
                shc.mo25531a(sb);
                shd.m35269a(sb, "appId", shd.m35267a(str2));
                if (bool != null) {
                    shd.m35269a(sb, "errorRecovery", String.valueOf(bool));
                }
                if (bool2 != null) {
                    shd.m35269a(sb, "mutationPrecondition", String.valueOf(bool2));
                }
                if (bool3 != null) {
                    shd.m35269a(sb, "openDrive", String.valueOf(bool3));
                }
                if (bool4 != null) {
                    shd.m35269a(sb, "propagate", String.valueOf(bool4));
                }
                if (a != null) {
                    shd.m35269a(sb, "reason", shd.m35267a(a));
                }
                if (num != null) {
                    shd.m35269a(sb, "syncType", String.valueOf(num));
                }
                new vkt((File) vld.f49433a.mo25536a(clientContext, 1, sb.toString(), (Object) null, File.class), clientContext, null);
            } catch (VolleyError e) {
                vpg.m41006a(e);
                throw e;
            }
        } else if (ordinal != 1) {
            throw new AssertionError();
        } else {
            throw new UnsupportedOperationException("No server API to deauthorize files.");
        }
    }
}
