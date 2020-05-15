package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tzt extends txn {

    /* renamed from: g */
    private final String f47007g;

    /* renamed from: h */
    private final int f47008h;

    public tzt(uih uih, AppIdentity appIdentity, ukk ukk, String str, int i, uaw uaw) {
        super(txr.UPDATE_PERMISSION, uih, appIdentity, ukk, tyq.NORMAL, uaw);
        this.f47007g = str;
        this.f47008h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vpu vpu = txv.f46961a;
        vkv vkv = vpu.f49762i;
        uhn uhn = vpu.f49757d;
        ujx e = mo26916e(uhn);
        sdo.m34959a(e);
        ukc a = uhn.mo27403a(e, this.f47007g);
        sdo.m34959a(a);
        sdo.m34959a((Object) a.f47842a);
        String str2 = a.f47842a;
        int i = this.f47008h;
        Permission permission = new Permission();
        vkv.mo28606a(i, permission);
        vle vle = new vle(vkv.mo28605a(clientContext, 2841));
        shc shc = new shc();
        shc.mo25530a(vkv.m40740a(Permission.class, vkv.m40744a(clientContext)));
        try {
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("files/%1$s/permissions/%2$s", shd.m35267a(str), shd.m35267a(str2));
            shc.mo25531a(sb);
            shd.m35269a(sb, "transferOwnership", String.valueOf((Object) true));
            vph.m41012a(vpu, this.f46915b, this.f46922e, txv.f46962b, this.f47007g, (Permission) vle.f49434a.mo25536a(clientContext, 2, sb.toString(), permission, Permission.class));
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
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final txp mo26918b(txu txu, uey uey, ujx ujx) {
        boolean z;
        uhn uhn = txu.f46958a;
        long j = txu.f46959b;
        ukc a = uhn.mo27403a(ujx, this.f47007g);
        if (a != null) {
            int i = a.f47847f;
            int i2 = this.f47008h;
            if (i == i2) {
                return new typ(this.f46915b, this.f46916c, tyq.NONE);
            }
            a.mo27644a(i2, j);
            a.mo27725t();
            if (this.f47008h == 3) {
                sdo.m34971a(ujx.mo27621j(), (Object) "Only owner can add new owner");
                ukc a2 = uhn.mo27403a(ujx, this.f46915b.f47682a);
                a2.mo27644a(2, j);
                a2.mo27725t();
                ukt a3 = vpb.m40984a(uhn, ujx);
                vph.m41011a(ujx, a3, j, this.f47007g);
                a3.mo27725t();
            } else if (this.f46915b.f47682a.equals(this.f47007g)) {
                sdo.m34971a(ujx.mo27623k(), (Object) "Only writer can change self role");
                int i3 = this.f47008h;
                if (i3 == 0) {
                    z = true;
                } else {
                    z = i3 == 1;
                }
                sdo.m34971a(z, (Object) "Self role can only be updated from writer to reader/commenter");
                ukt a4 = vpb.m40984a(uhn, ujx);
                vph.m41010a(ujx, a4, j);
                a4.mo27725t();
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
            tzt tzt = (tzt) obj;
            return mo26884a(tzt) && sdg.m34949a(this.f47007g, tzt.f47007g) && this.f47008h == tzt.f47008h;
        }
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        vpd.m40999a(h, "PermissionAccountIdentifier", this.f47007g);
        h.put("PermissionRole", this.f47008h);
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f47007g, Integer.valueOf(this.f47008h)});
    }

    public final String toString() {
        return String.format(Locale.US, "UpdatePermissionAction [%s, accountIdentifier=%s, newRole=%d]", mo26904m(), this.f47007g, Integer.valueOf(this.f47008h));
    }

    public tzt(uih uih, JSONObject jSONObject) {
        super(txr.UPDATE_PERMISSION, uih, jSONObject);
        this.f47007g = vpd.m40996a(jSONObject, "PermissionAccountIdentifier");
        this.f47008h = jSONObject.getInt("PermissionRole");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26888b(txv txv) {
        super.mo26888b(txv);
        uhn uhn = txv.f46961a.f49757d;
        ujx e = mo26916e(uhn);
        ukc a = uhn.mo27403a(e, this.f47007g);
        if (a == null) {
            throw new uad(e);
        } else if (a.f47842a == null) {
            throw new uae(e, this.f47007g);
        }
    }
}
