package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyn extends txm {

    /* renamed from: f */
    private final MetadataBundle f46984f;

    public tyn(uih uih, AppIdentity appIdentity, ukk ukk, MetadataBundle metadataBundle) {
        super(txr.METADATA, uih, appIdentity, ukk, tyq.NORMAL);
        sdo.m34959a(metadataBundle);
        this.f46984f = metadataBundle;
        sdo.m34974b(!metadataBundle.mo18275c(uzm.f48737M));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final txp mo26914a(txu txu, uey uey, ujx ujx) {
        ukt ukt;
        uhn uhn = txu.f46958a;
        if (ujx.mo27571ag()) {
            ukt = uhn.mo27380b(ujx.mo27582b());
        } else {
            ukt = uhn.mo27404a(ujx);
            ujx.mo27620j(true);
        }
        uyj.m39761a(ujx, ukt, txu.f46959b, mo26892c(uhn).f47395b, this.f46984f);
        ujx.mo27608f((Date) null);
        ujx.mo27607f((String) null);
        ujx.mo27627m(true);
        ukt.mo27725t();
        return new tzn(uey.f47394a, uey.f47396c, this.f46922e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            tyn tyn = (tyn) obj;
            return mo26884a(tyn) && this.f46984f.equals(tyn.f46984f);
        }
    }

    /* renamed from: h */
    public final JSONObject mo26899h() {
        JSONObject h = super.mo26899h();
        h.put("metadataDelta", uyj.m39762b(this.f46984f));
        return h;
    }

    public final int hashCode() {
        return (mo26905n() * 31) + this.f46984f.hashCode();
    }

    public final String toString() {
        return String.format(Locale.US, "MetadataAction [%s, metadataChangeSet=%s]", mo26904m(), this.f46984f);
    }

    public tyn(uih uih, JSONObject jSONObject) {
        super(txr.METADATA, uih, jSONObject);
        this.f46984f = uyj.m39759a(jSONObject.getJSONObject("metadataDelta"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26915a(txv txv, ClientContext clientContext, String str) {
        vpu vpu = txv.f46961a;
        uhn uhn = vpu.f49757d;
        String str2 = mo26895d(uhn).f47395b;
        long j = txv.f46962b;
        vkr a = vpu.f49762i.mo28601a(clientContext, str, this.f46984f);
        uhn.mo27435d();
        try {
            ujx e = mo26916e(uhn);
            uhc.m38506a(uhn, a, e, str2);
            e.mo27629n(false);
            vpb.m40991b(uhn, this.f46915b, j, false);
            vpb.m40985a(uhn, this.f46915b, j);
            uhn.mo27442f();
        } finally {
            uhn.mo27439e();
        }
    }
}
