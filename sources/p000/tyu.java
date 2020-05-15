package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: tyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tyu extends txn {

    /* renamed from: g */
    private boolean f46990g;

    /* renamed from: i */
    public Set f46991i;

    /* renamed from: j */
    final Set f46992j;

    public tyu(txr txr, uih uih, AppIdentity appIdentity, ukk ukk, Set set, tyq tyq) {
        super(txr, uih, appIdentity, ukk, tyq);
        this.f46991i = Collections.emptySet();
        this.f46990g = false;
        sdo.m34959a(set);
        this.f46992j = set;
    }

    /* renamed from: d */
    protected static final Set m37766d(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((DriveId) it.next()).f30728a);
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26963a(uhn uhn, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DriveId driveId = (DriveId) it.next();
            if (driveId.f30728a == null) {
                String a = uhn.mo27389a(this.f46915b, driveId);
                if (a != null) {
                    hashSet.add(new DriveId(a, driveId.f30729b, driveId.f30730c, 1));
                } else {
                    throw new uac(driveId);
                }
            } else {
                hashSet.add(driveId);
            }
        }
        set.clear();
        set.addAll(hashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final txp mo26918b(txu txu, uey uey, ujx ujx) {
        uhn uhn = txu.f46958a;
        uih uih = uey.f47394a;
        AppIdentity appIdentity = uey.f47396c;
        Set aj = ujx.mo27574aj();
        mo26964c(new HashSet(uhn.mo27361a(uey, ujx)));
        this.f46991i.addAll(uhn.mo27416b(uey, ujx));
        HashSet hashSet = new HashSet(this.f46991i);
        boolean z = false;
        for (DriveId driveId : mo26935q()) {
            if (hashSet.add(driveId)) {
                uhn.mo27374a(ujx, driveId.f30729b);
                z = true;
            }
        }
        ukk a = ujx.mo27551a();
        for (DriveId driveId2 : mo26936r()) {
            if (hashSet.remove(driveId2)) {
                uhn.mo27377a(a, driveId2.f30729b);
                z = true;
            }
        }
        vcy vcy = txu.f46960c;
        txx txx = new txx(uhn, this.f46915b, false);
        try {
            txx.mo28730d(ujx);
            Set t = mo26965t();
            t.addAll(txx.mo28729b());
            int i = txx.f46970c + 1;
            if (vcy != null) {
                vcy.mo28296b(t.size(), i);
            }
            mo26919b(t);
            if (!z) {
                return new typ(uih, appIdentity, tyq.NONE);
            }
            ujx.mo27622k(this.f46992j.contains(DriveSpace.f30734a));
            ujx.mo27627m(true);
            tyz tyz = new tyz(uih, appIdentity, a, this.f46991i, aj, tyq.NONE);
            tyz.mo26964c(hashSet);
            return tyz;
        } catch (vpr e) {
            throw new RuntimeException("Unexpected TraversalException!", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo26964c(Set set) {
        this.f46991i = set;
        this.f46990g = true;
    }

    /* renamed from: h */
    public JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        if (this.f46990g) {
            h.put("oldParentIds", vpd.m40998a(this.f46991i));
        }
        JSONArray jSONArray = new JSONArray();
        for (DriveSpace driveSpace : this.f46992j) {
            jSONArray.put(driveSpace.f30740f);
        }
        h.put("spaces", jSONArray);
        return h;
    }

    /* renamed from: n */
    public final int mo26905n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.mo26905n()), this.f46992j});
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract Set mo26934p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Set mo26935q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract Set mo26936r();

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
    /* renamed from: t */
    public final Set mo26965t() {
        sdo.m34971a(this.f46990g, (Object) "Affected entry specs can only be resolved once old parent drive Ids are known");
        Set p = mo26934p();
        for (DriveId driveId : this.f46991i) {
            p.add(ukk.m38862a(driveId.f30729b));
        }
        p.add(this.f46922e);
        return p;
    }

    public tyu(txr txr, uih uih, JSONObject jSONObject) {
        super(txr, uih, jSONObject);
        this.f46991i = Collections.emptySet();
        this.f46990g = false;
        mo26964c(vpd.m40997a(jSONObject.getJSONArray("oldParentIds")));
        this.f46992j = new C1225nr();
        JSONArray jSONArray = jSONObject.getJSONArray("spaces");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f46992j.add(DriveSpace.m22929a(jSONArray.getString(i)));
        }
    }

    /* renamed from: a */
    public final boolean mo26884a(txk txk) {
        return super.mo26884a(txk) && sdg.m34949a(this.f46992j, ((tyu) txk).f46992j);
    }
}
