package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: txz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txz extends tyu {

    /* renamed from: g */
    final Set f46971g;

    /* renamed from: h */
    final Set f46972h;

    public txz(uih uih, AppIdentity appIdentity, ukk ukk, Set set, Set set2, Set set3) {
        super(txr.CHANGE_RESOURCE_PARENTS, uih, appIdentity, ukk, set3, tyq.NORMAL);
        sdo.m34959a(set);
        this.f46971g = set;
        sdo.m34959a(set2);
        this.f46972h = set2;
    }

    /* renamed from: a */
    private static Set m37701a(JSONObject jSONObject, String str) {
        return vpd.m40997a(jSONObject.getJSONArray(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26888b(txv txv) {
        super.mo26888b(txv);
        uhn uhn = txv.f46961a.f49757d;
        mo26963a(uhn, this.f46971g);
        mo26963a(uhn, this.f46972h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass() && mo26884a((txk) obj)) {
            txz txz = (txz) obj;
            return sdg.m34949a(this.f46971g, txz.f46971g) && sdg.m34949a(this.f46972h, txz.f46972h);
        }
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        Set set = this.f46971g;
        if (set != null) {
            h.put("parentIdsToAdd", vpd.m40998a(set));
        }
        Set set2 = this.f46972h;
        if (set2 != null) {
            h.put("parentIdsToRemove", vpd.m40998a(set2));
        }
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f46971g, this.f46972h});
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Set mo26934p() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.f46971g) {
            hashSet.add(ukk.m38862a(driveId.f30729b));
        }
        for (DriveId driveId2 : this.f46972h) {
            hashSet.add(ukk.m38862a(driveId2.f30729b));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Set mo26935q() {
        return this.f46971g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Set mo26936r() {
        return this.f46972h;
    }

    public final String toString() {
        return String.format(Locale.US, "ChangeResourceParentsAction [%s, mParentIdsToAdd=%s, mParentIdsToRemove=%s, mOldParentIds=%s, mSpaces=%s]", mo26904m(), this.f46971g, this.f46972h, this.f46991i, this.f46992j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vkv vkv = txv.f46961a.f49762i;
        Set d = tyu.m37766d(this.f46971g);
        Set d2 = tyu.m37766d(this.f46972h);
        try {
            new vld(vkv.mo28605a(clientContext, 2836)).mo28612a(clientContext, str, vkv.mo28598a(d), vkv.mo28598a(d2), null, new shc());
        } catch (VolleyError e) {
            vpg.m41006a(e);
            throw e;
        }
    }

    public txz(uih uih, JSONObject jSONObject) {
        super(txr.CHANGE_RESOURCE_PARENTS, uih, jSONObject);
        this.f46971g = m37701a(jSONObject, "parentIdsToAdd");
        this.f46972h = m37701a(jSONObject, "parentIdsToRemove");
    }
}
