package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.ParentReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: tyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyz extends tyu {

    /* renamed from: g */
    final Set f46996g;

    public tyz(uih uih, AppIdentity appIdentity, ukk ukk, Set set, Set set2, tyq tyq) {
        super(txr.SET_RESOURCE_PARENTS, uih, appIdentity, ukk, set2, tyq);
        sdo.m34959a(set);
        this.f46996g = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vkv vkv = txv.f46961a.f49762i;
        Set<String> d = tyu.m37766d(this.f46996g);
        if (d.isEmpty()) {
            Set d2 = tyu.m37766d(this.f46991i);
            vld vld = new vld(vkv.mo28605a(clientContext, 2834));
            try {
                vld.mo28612a(clientContext, str, null, vkv.mo28598a(d2), null, new shc());
            } catch (VolleyError e) {
                vpg.m41006a(e);
                throw e;
            }
        } else {
            vld vld2 = new vld(vkv.mo28605a(clientContext, 2835));
            try {
                File file = new File();
                ArrayList arrayList = new ArrayList();
                for (String str2 : d) {
                    ParentReference parentReference = new ParentReference();
                    parentReference.mo18248e(str2);
                    arrayList.add(parentReference);
                }
                file.mo18241a(arrayList);
                vld2.mo28612a(clientContext, str, null, null, file, new shc());
            } catch (VolleyError e2) {
                vpg.m41006a(e2);
                throw e2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26888b(txv txv) {
        super.mo26888b(txv);
        mo26963a(txv.f46961a.f49757d, this.f46996g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !mo26884a((txk) obj)) {
            return false;
        }
        return sdg.m34949a(this.f46996g, ((tyz) obj).f46996g);
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        Set set = this.f46996g;
        if (set != null) {
            h.put("parentIds", vpd.m40998a(set));
        }
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo26905n()), this.f46996g});
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final Set mo26934p() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.f46996g) {
            hashSet.add(ukk.m38862a(driveId.f30729b));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Set mo26935q() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.f46996g) {
            if (!this.f46991i.contains(driveId)) {
                hashSet.add(driveId);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Set mo26936r() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.f46991i) {
            if (!this.f46996g.contains(driveId)) {
                hashSet.add(driveId);
            }
        }
        return hashSet;
    }

    public final String toString() {
        return String.format(Locale.US, "SetResourceParentsAction [%s, mParentIds=%s, mOldParentIds=%s, mSpaces=%s]", mo26904m(), this.f46996g, this.f46991i, this.f46992j);
    }

    public tyz(uih uih, JSONObject jSONObject) {
        super(txr.SET_RESOURCE_PARENTS, uih, jSONObject);
        this.f46996g = vpd.m40997a(jSONObject.getJSONArray("parentIds"));
        if (((txn) this).f46923f == null) {
            mo26919b(mo26965t());
        }
    }
}
