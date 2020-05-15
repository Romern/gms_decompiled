package p000;

import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: txn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class txn extends txm implements tyr {

    /* renamed from: f */
    public Set f46923f;

    protected txn(txr txr, uih uih, AppIdentity appIdentity, ukk ukk, tyq tyq) {
        super(txr, uih, appIdentity, ukk, tyq);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        boolean z;
        if (this.f46923f == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        txp b = mo26918b(txu, uey, ujx);
        if (b.mo26902k().equals(txr.NULL) || this.f46923f != null) {
            return b;
        }
        throw new IllegalStateException("Locally affected entry specs not populated");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract txp mo26918b(txu txu, uey uey, ujx ujx);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26919b(Set set) {
        sdo.m34970a(this.f46923f == null);
        this.f46923f = Collections.unmodifiableSet(set);
    }

    /* renamed from: h */
    public JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        if (this.f46923f != null) {
            JSONArray jSONArray = new JSONArray();
            for (ukk ukk : this.f46923f) {
                jSONArray.put(ukk.f47941a);
            }
            h.put("locallyAffectedEntrySpecs", jSONArray);
        }
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo26905n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.mo26905n()), this.f46923f});
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
    /* renamed from: o */
    public final Set mo26920o() {
        sdo.m34971a(this.f46923f != null, (Object) "Should only be called once the action is applied locally");
        return this.f46923f;
    }

    protected txn(txr txr, uih uih, AppIdentity appIdentity, ukk ukk, tyq tyq, uaw uaw) {
        super(txr, uih, appIdentity, ukk, tyq, uaw);
    }

    protected txn(txr txr, uih uih, JSONObject jSONObject) {
        super(txr, uih, jSONObject);
        JSONArray optJSONArray = jSONObject.optJSONArray("locallyAffectedEntrySpecs");
        if (optJSONArray != null) {
            this.f46923f = new HashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f46923f.add(ukk.m38862a(optJSONArray.getLong(i)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26917a(ujx ujx, vcy vcy, txx txx) {
        try {
            txx.mo28730d(ujx);
            Set b = txx.mo28729b();
            int i = txx.f46970c + 1;
            if (vcy != null) {
                vcy.mo28296b(b.size(), i);
            }
            mo26919b(b);
        } catch (vpr e) {
            if (e.getCause() instanceof tzy) {
                throw ((tzy) e.getCause());
            }
            throw new RuntimeException("Unexpected TraversalException!", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo26884a(txk txk) {
        return super.mo26884a(txk) && sdg.m34949a(this.f46923f, ((txn) txk).f46923f);
    }

    /* renamed from: a */
    public final boolean mo26885a(txp txp) {
        if (super.mo26885a(txp)) {
            return true;
        }
        if ((txp instanceof tyr) && txq.m37689a(mo26920o(), ((tyr) txp).mo26920o())) {
            return true;
        }
        if (!(txp instanceof tyl) || !txq.m37690a(this, (tyl) txp)) {
            return false;
        }
        return true;
    }
}
