package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyt extends txn {

    /* renamed from: g */
    private final String f46989g;

    public tyt(uih uih, AppIdentity appIdentity, ukk ukk, String str, uaw uaw) {
        super(txr.REMOVE_PERMISSION, uih, appIdentity, ukk, tyq.NORMAL, uaw);
        this.f46989g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vpu vpu = txv.f46961a;
        vkv vkv = vpu.f49762i;
        uhn uhn = vpu.f49757d;
        ujx e = mo26916e(uhn);
        sdo.m34959a(e);
        ukc a = uhn.mo27403a(e, this.f46989g);
        sdo.m34959a(a);
        sdo.m34959a((Object) a.f47842a);
        String str2 = a.f47842a;
        vle vle = new vle(vkv.mo28605a(clientContext, 2842));
        shc shc = new shc();
        try {
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("files/%1$s/permissions/%2$s", shd.m35267a(str), shd.m35267a(str2));
            shc.mo25531a(sb);
            vle.f49434a.mo25539a(clientContext, 3, sb.toString(), null);
            vph.m41012a(vpu, this.f46915b, this.f46922e, txv.f46962b, this.f46989g, (Permission) null);
            if (this.f46915b.f47682a.equals(this.f46989g)) {
                vpu.f49769p.mo27275a();
            }
        } catch (VolleyError e2) {
            vpg.m41006a(e2);
            throw e2;
        }
    }

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
        long j = txu.f46959b;
        ukc a = uhn.mo27403a(ujx, this.f46989g);
        if (a != null) {
            a.mo27644a(-100, j);
            a.mo27725t();
            if (this.f46915b.f47682a.equals(this.f46989g)) {
                sdo.m34971a(ujx.mo27623k(), (Object) "Only writer can remove self role");
                ujx.mo27563a(true, j);
            } else if (ujx.mo27540R()) {
                int i = 0;
                for (ukc ukc : ujx.mo27575ak()) {
                    if (!ukc.mo27648b()) {
                        i++;
                    }
                }
                if (i == 1) {
                    ukt a2 = vpb.m40984a(uhn, ujx);
                    ula l = a2.mo27672l();
                    if (l.mo27683a()) {
                        l.mo27680a(j);
                    } else {
                        l.mo27682a(Boolean.valueOf(ujx.mo27540R()), j);
                    }
                    a2.mo27725t();
                    ujx.mo27595c(false);
                }
            }
            ujx.mo27627m(true);
            mo26917a(ujx, txu.f46960c, new txx(uhn, uey.f47394a, false));
            return new tzp(uey.f47394a, uey.f47396c);
        }
        throw new uad(ujx);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            tyt tyt = (tyt) obj;
            return mo26884a(tyt) && sdg.m34949a(this.f46989g, tyt.f46989g);
        }
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        vpd.m40999a(h, "PermissionAccountIdentifier", this.f46989g);
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f46989g});
    }

    public final String toString() {
        return String.format(Locale.US, "RemovePermissionAction [%s, accountIdentifier=%s]", mo26904m(), this.f46989g);
    }

    public tyt(uih uih, JSONObject jSONObject) {
        super(txr.REMOVE_PERMISSION, uih, jSONObject);
        this.f46989g = vpd.m40996a(jSONObject, "PermissionAccountIdentifier");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26888b(txv txv) {
        super.mo26888b(txv);
        uhn uhn = txv.f46961a.f49757d;
        ujx e = mo26916e(uhn);
        ukc a = uhn.mo27403a(e, this.f46989g);
        if (a == null) {
            throw new uad(e);
        } else if (a.f47842a == null) {
            throw new uae(e, this.f46989g);
        }
    }
}
