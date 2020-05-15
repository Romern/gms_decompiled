package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: txt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txt extends txn {

    /* renamed from: g */
    private final int f46952g;

    /* renamed from: h */
    private final String f46953h;

    /* renamed from: i */
    private final int f46954i;

    /* renamed from: j */
    private final boolean f46955j;

    /* renamed from: k */
    private final boolean f46956k;

    /* renamed from: l */
    private final String f46957l;

    public txt(uih uih, AppIdentity appIdentity, ukk ukk, Permission permission, boolean z, String str, uaw uaw) {
        super(txr.ADD_PERMISSION, uih, appIdentity, ukk, tyq.NORMAL, uaw);
        this.f46952g = permission.mo18124b();
        this.f46953h = permission.mo18123a();
        this.f46954i = permission.mo18125c();
        this.f46955j = permission.f30743c;
        this.f46956k = z;
        this.f46957l = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        txv txv2 = txv;
        vpu vpu = txv2.f46961a;
        vkv vkv = vpu.f49762i;
        String str2 = this.f46953h;
        int i = this.f46952g;
        int i2 = this.f46954i;
        boolean z = this.f46955j;
        boolean z2 = this.f46956k;
        String str3 = this.f46957l;
        com.google.android.gms.drive.internal.model.Permission permission = new com.google.android.gms.drive.internal.model.Permission();
        switch (i) {
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                permission.mo18251f("user");
                permission.mo18252g(str2);
                break;
            case 257:
                permission.mo18251f("domain");
                permission.mo18252g(str2);
                break;
            case 258:
                permission.mo18251f("anyone");
                break;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Invalid accountType value:");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
        vkv.mo28606a(i2, permission);
        permission.f31046k = z;
        permission.f31036a.add(16);
        vle vle = new vle(vkv.mo28605a(clientContext, 2840));
        shc shc = new shc();
        shc.mo25530a(vkv.m40740a(com.google.android.gms.drive.internal.model.Permission.class, vkv.m40744a(clientContext)));
        try {
            Boolean valueOf = Boolean.valueOf(z2);
            StringBuilder sb2 = new StringBuilder();
            new Formatter(sb2).format("files/%1$s/permissions", shd.m35267a(str));
            shc.mo25531a(sb2);
            if (str3 != null) {
                shd.m35269a(sb2, "emailMessage", shd.m35267a(str3));
            }
            shd.m35269a(sb2, "sendNotificationEmails", String.valueOf(valueOf));
            vph.m41012a(vpu, this.f46915b, this.f46922e, txv2.f46962b, this.f46953h, (com.google.android.gms.drive.internal.model.Permission) vle.f49434a.mo25536a(clientContext, 1, sb2.toString(), permission, com.google.android.gms.drive.internal.model.Permission.class));
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ula.a(java.lang.Object, long):void
     arg types: [boolean, long]
     candidates:
      ula.a(vpj, vpj):ula
      ula.a(java.lang.Object, long):void */
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
        ukt ukt;
        boolean z;
        uhn uhn = txu.f46958a;
        long j = txu.f46959b;
        ukc a = uhn.mo27403a(ujx, this.f46953h);
        if (a == null) {
            ujx.mo27558a(this.f46953h, this.f46952g, this.f46954i, this.f46955j, j);
        } else {
            int i = a.f47847f;
            int i2 = this.f46954i;
            if (i == i2 && a.f47850i == this.f46955j) {
                return new typ(this.f46915b, this.f46916c, tyq.NONE);
            }
            a.mo27644a(i2, j);
            a.mo27647a(this.f46955j, j);
            a.mo27725t();
        }
        if (!ujx.mo27540R()) {
            ukt = vpb.m40984a(uhn, ujx);
            ula l = ukt.mo27672l();
            if (l.mo27683a()) {
                l.mo27680a(j);
            } else {
                l.mo27682a(Boolean.valueOf(ujx.mo27540R()), j);
            }
            ujx.mo27595c(true);
        } else {
            ukt = null;
        }
        if (!ujx.mo27574aj().contains(DriveSpace.f30734a)) {
            if (ukt == null) {
                ukt = vpb.m40984a(uhn, ujx);
            }
            ula j2 = ukt.mo27670j();
            if (j2.mo27683a()) {
                j2.mo27680a(j);
            } else {
                j2.mo27682a((Object) false, j);
            }
            ujx.mo27622k(true);
        }
        if (this.f46954i == 3) {
            sdo.m34971a(ujx.mo27621j(), (Object) "Only owner can add new owner");
            ukc a2 = uhn.mo27403a(ujx, this.f46915b.f47682a);
            a2.mo27644a(2, j);
            a2.mo27725t();
            if (ukt == null) {
                ukt = vpb.m40984a(uhn, ujx);
            }
            vph.m41011a(ujx, ukt, j, this.f46953h);
        } else if (this.f46915b.f47682a.equals(this.f46953h)) {
            sdo.m34971a(ujx.mo27623k(), (Object) "Only writer can change self role");
            int i3 = this.f46954i;
            if (i3 == 0) {
                z = true;
            } else {
                z = i3 == 1;
            }
            sdo.m34971a(z, (Object) "Self role can only be updated from writer to reader/commenter");
            if (ukt == null) {
                ukt = vpb.m40984a(uhn, ujx);
            }
            vph.m41010a(ujx, ukt, j);
        }
        if (ukt != null) {
            ukt.mo27725t();
        }
        ujx.mo27627m(true);
        mo26917a(ujx, txu.f46960c, new txx(uhn, uey.f47394a, false));
        return new tzp(uey.f47394a, uey.f47396c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            txt txt = (txt) obj;
            return mo26884a(txt) && this.f46952g == txt.f46952g && sdg.m34949a(this.f46953h, txt.f46953h) && this.f46954i == txt.f46954i && this.f46955j == txt.f46955j && this.f46956k == txt.f46956k && sdg.m34949a(this.f46957l, txt.f46957l);
        }
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("PermissionAccountType", this.f46952g);
        vpd.m40999a(h, "PermissionAccountIdentifier", this.f46953h);
        h.put("PermissionRole", this.f46954i);
        h.put("PermissionIsLinkRequired", this.f46955j);
        h.put("PermissionSendEmails", this.f46956k);
        vpd.m40999a(h, "PermissionEmailMessage", this.f46957l);
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), Integer.valueOf(this.f46952g), this.f46953h, Integer.valueOf(this.f46954i), Boolean.valueOf(this.f46955j), Boolean.valueOf(this.f46956k), this.f46957l});
    }

    public final String toString() {
        return String.format(Locale.US, "AddPermissionAction [%s, accountType=%d, accountIdentifier=%s, role=%d, isLinkRequired=%s, sendNotificationEmails=%s, EmailMessage=%s]", mo26904m(), Integer.valueOf(this.f46952g), this.f46953h, Integer.valueOf(this.f46954i), Boolean.valueOf(this.f46955j), Boolean.valueOf(this.f46956k), this.f46957l);
    }

    public txt(uih uih, JSONObject jSONObject) {
        super(txr.ADD_PERMISSION, uih, jSONObject);
        this.f46952g = jSONObject.getInt("PermissionAccountType");
        this.f46953h = vpd.m40996a(jSONObject, "PermissionAccountIdentifier");
        this.f46954i = jSONObject.getInt("PermissionRole");
        this.f46955j = jSONObject.getBoolean("PermissionIsLinkRequired");
        this.f46956k = jSONObject.getBoolean("PermissionSendEmails");
        this.f46957l = vpd.m40996a(jSONObject, "PermissionEmailMessage");
    }
}
