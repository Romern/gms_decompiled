package p000;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyh extends txl {
    public tyh(uih uih, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId) {
        super(txr.CREATE_SHORTCUT_FILE, uih, appIdentity, metadataBundle, driveId, uaw.f47070a);
        if (!this.f46919e.mo18275c(uzm.f48738N)) {
            this.f46919e.mo18273b(uzm.f48738N, "application/vnd.google-apps.drive-sdk");
        }
        uyy a = uyy.m39807a((String) this.f46919e.mo18269a(uzm.f48738N));
        boolean z = false;
        if (a != null && a.mo28124a()) {
            z = true;
        }
        sdo.m34974b(z);
        sdo.m34974b(!mo26912r());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26906a(uey uey) {
        String valueOf = String.valueOf(uey.f47395b);
        return uyy.m39807a(valueOf.length() == 0 ? new String("application/vnd.google-apps.drive-sdk.") : "application/vnd.google-apps.drive-sdk.".concat(valueOf)).f48723a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26907a(txu txu, ujx ujx) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo26884a((txk) ((tyh) obj));
    }

    public final int hashCode() {
        return mo26905n();
    }

    public final String toString() {
        return String.format(Locale.US, "CreateFileAction[%s]", mo26904m());
    }

    public tyh(uih uih, JSONObject jSONObject) {
        super(txr.CREATE_SHORTCUT_FILE, uih, jSONObject);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vpb.a(uhn, uih, long, boolean):void
     arg types: [uhn, uih, long, int]
     candidates:
      vpb.a(uhn, uih, long, long):void
      vpb.a(ujx, ukt, ung, long):void
      vpb.a(ujx, ukt, boolean, long):void
      vpb.a(uhn, uih, long, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26880a(txv txv, ClientContext clientContext) {
        mo26910p();
        vpu vpu = txv.f46961a;
        uhn uhn = vpu.f49757d;
        uey d = mo26895d(uhn);
        try {
            vkr a = vpu.f49762i.mo28600a(clientContext, uyj.m39758a(this.f46919e));
            uhn.mo27435d();
            ujx a2 = uhn.mo27402a(d, mo26913s());
            mo26908a(uhn, a2, a.mo28572g());
            uhc.m38506a(uhn, a, a2, d.f47395b);
            a2.mo27535M();
            a2.mo27629n(false);
            long j = txv.f46962b;
            vpb.m40987a(uhn, this.f46915b, j, false);
            vpb.m40985a(uhn, this.f46915b, j);
            uhn.mo27442f();
            uhn.mo27439e();
            try {
                txv.f46964d.mo28287a(uhn.mo27402a(uey.m38255a(this.f46915b), mo26913s()));
            } catch (uaa e) {
            }
        } catch (VolleyError e2) {
            vpg.m41006a(e2);
            throw e2;
        } catch (Throwable th) {
            try {
                txv.f46964d.mo28287a(uhn.mo27402a(uey.m38255a(this.f46915b), mo26913s()));
            } catch (uaa e3) {
            }
            throw th;
        }
    }
}
