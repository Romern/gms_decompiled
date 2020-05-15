package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: txm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class txm extends txk {

    /* renamed from: e */
    public final ukk f46922e;

    protected txm(txr txr, uih uih, AppIdentity appIdentity, ukk ukk, tyq tyq) {
        this(txr, uih, appIdentity, ukk, tyq, uaw.f47070a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26874a(txu txu, uey uey) {
        ujx a = txu.f46958a.mo27402a(uey, this.f46922e);
        if (a != null && !a.mo27523A()) {
            return mo26914a(txu, uey, a);
        }
        throw new uaa(this.f46922e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract txp mo26914a(txu txu, uey uey, ujx ujx);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26915a(txv txv, ClientContext clientContext, String str);

    /* renamed from: b */
    public final DriveId mo26887b(uhn uhn) {
        try {
            return mo26916e(uhn).mo27610g();
        } catch (uaa e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final ujx mo26916e(uhn uhn) {
        return uhn.mo27402a(mo26895d(uhn), this.f46922e);
    }

    /* renamed from: h */
    public JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("entrySqlId", this.f46922e.f47941a);
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo26905n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.mo26905n()), this.f46922e});
    }

    /* renamed from: s */
    public final ukk mo26913s() {
        return this.f46922e;
    }

    protected txm(txr txr, uih uih, AppIdentity appIdentity, ukk ukk, tyq tyq, uaw uaw) {
        super(txr, uih, appIdentity, tyq, uaw);
        sdo.m34966a(ukk, "Entryspec must not be null");
        this.f46922e = ukk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26888b(txv txv) {
        ujx ujx;
        vpu vpu = txv.f46961a;
        uey d = mo26895d(vpu.f49757d);
        ukk ukk = this.f46922e;
        uhn uhn = vpu.f49757d;
        ujp d2 = uhn.mo27432d(ukk.f47941a);
        try {
            ujx = uhn.mo27402a(d, ukk);
        } catch (uaa e) {
            ujx = null;
        }
        if (!(d2 == null || d2.f47810b == null || (ujx != null && ujx.mo27536N()))) {
            String str = d2.f47810b;
            try {
                vpu.f49779z.mo28207a(d, str, new vks(302, 2, false, false));
                ujx = uhn.mo27402a(d, ukk);
            } catch (gid e2) {
                throw new tzu(d.f47396c);
            }
        }
        if (ujx == null || !ujx.mo27536N()) {
            throw new uaa(ukk);
        } else if (ujx.mo27616i() == null) {
            throw new uab(ukk);
        }
    }

    protected txm(txr txr, uih uih, JSONObject jSONObject) {
        super(txr, uih, jSONObject);
        this.f46922e = ukk.m38862a(jSONObject.getLong("entrySqlId"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26880a(txv txv, ClientContext clientContext) {
        vpu vpu = txv.f46961a;
        ujx a = vpu.f49757d.mo27402a(mo26895d(vpu.f49757d), this.f46922e);
        txv.f46964d.mo28287a(a);
        mo26915a(txv, clientContext, a.mo27616i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo26884a(txk txk) {
        return super.mo26884a(txk) && this.f46922e.equals(txk.mo26913s());
    }
}
