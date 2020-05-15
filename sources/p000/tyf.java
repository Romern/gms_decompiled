package p000;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: tyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tyf extends txl {

    /* renamed from: h */
    private static final sbw f46981h = new sbw("CreateFolderAction", "");

    public tyf(uih uih, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId) {
        super(txr.CREATE_FOLDER, uih, appIdentity, metadataBundle, driveId, uaw.f47070a);
        if (!this.f46919e.mo18275c(uzm.f48738N)) {
            this.f46919e.mo18273b(uzm.f48738N, "application/vnd.google-apps.folder");
        }
        sdo.m34974b("application/vnd.google-apps.folder".equals(this.f46919e.mo18269a(uzm.f48738N)));
        if (!this.f46919e.mo18275c(uzm.f48748g)) {
            this.f46919e.mo18273b(uzm.f48748g, (String) twy.f46811V.mo58455c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26906a(uey uey) {
        return "application/vnd.google-apps.folder";
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
        return mo26884a((txk) ((tyf) obj));
    }

    public final int hashCode() {
        return mo26905n();
    }

    public final String toString() {
        return String.format(Locale.US, "CreateFolderAction[%s]", mo26904m());
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
        uey d;
        vkv vkv;
        boolean ai;
        vkr vkr;
        uhn uhn;
        NetworkResponse networkResponse;
        mo26910p();
        vpu vpu = txv.f46961a;
        uhn uhn2 = vpu.f49757d;
        try {
            d = mo26895d(uhn2);
            ujx a = uhn2.mo27402a(d, mo26913s());
            vkv = vpu.f49762i;
            ai = a.mo27573ai();
            MetadataBundle metadataBundle = this.f46919e;
            File a2 = uyj.m39758a(metadataBundle);
            if (uvw.m39525a(metadataBundle)) {
                a2.mo18240a(vkv.m40739a((String) metadataBundle.mo18269a(uzm.f48729E), ai));
            }
            vkr = vkv.mo28600a(clientContext, a2);
        } catch (VolleyError e) {
            if (!mo26912r() || (networkResponse = e.networkResponse) == null || networkResponse.statusCode != 409) {
                throw e;
            }
            vkr = vkv.mo28601a(clientContext, vkv.mo28597a(clientContext, (String) this.f46919e.mo18269a(uzm.f48729E), ai), this.f46919e);
        } catch (Throwable th) {
            try {
                txv.f46964d.mo28287a(uhn2.mo27402a(uey.m38255a(this.f46915b), mo26913s()));
            } catch (uaa e2) {
            }
            throw th;
        }
        uhn = vpu.f49757d;
        long j = txv.f46962b;
        String str = d.f47395b;
        String g = vkr.mo28572g();
        uhn.mo27435d();
        try {
            ujx a3 = uhn.mo27401a(uey.m38255a(this.f46915b), g);
            sdo.m34970a(mo26912r());
            if (!a3.mo27551a().equals(mo26913s())) {
                a3.mo27579ao();
            }
        } catch (uaa e3) {
        }
        try {
            ujx a4 = uhn.mo27402a(uey.m38255a(this.f46915b), mo26913s());
            mo26908a(uhn, a4, g);
            if (mo26912r()) {
                String str2 = (String) twy.f46817aA.mo58455c();
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                a4.mo27597d(str2);
            }
            uhc.m38506a(uhn, vkr, a4, str);
            a4.mo27535M();
            a4.mo27629n(false);
            vpb.m40987a(uhn, this.f46915b, j, false);
            vpb.m40985a(uhn, this.f46915b, j);
            uhn.mo27442f();
        } catch (uaa e4) {
            f46981h.mo25378c("CreateFolderAction", "Unable to retrieve entry.", e4);
        }
        uhn.mo27439e();
        try {
            txv.f46964d.mo28287a(uhn2.mo27402a(uey.m38255a(this.f46915b), mo26913s()));
        } catch (uaa e5) {
        }
    }

    public tyf(uih uih, JSONObject jSONObject) {
        super(txr.CREATE_FOLDER, uih, jSONObject);
    }

    /* renamed from: a */
    public final boolean mo26885a(txp txp) {
        if (super.mo26885a(txp)) {
            return true;
        }
        if (!(txp instanceof tyl) || !((tyl) txp).mo26911q().contains(mo26913s())) {
            return false;
        }
        return true;
    }
}
