package p000;

import android.util.Log;
import com.google.android.gms.trustagent.trustlet.device.connectionlessble.internal.ConnectionlessBleTrustletChimeraService;

/* renamed from: aush */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aush extends ausr {

    /* renamed from: a */
    final /* synthetic */ ausi f92416a;

    /* renamed from: b */
    final /* synthetic */ autv f92417b;

    public aush(ausi ausi, autv autv) {
        this.f92416a = ausi;
        this.f92417b = autv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo50871a() {
        return "EidDataScanner";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50872b() {
        try {
            this.f92416a.f92419b.mo58596a();
            autv autv = this.f92417b;
            String str = ausf.f92405b;
            ConnectionlessBleTrustletChimeraService.f109190h.mo50711a(str, new Object[0]).mo50706a();
            autv.f92525a.mo50762a("eid_scan_failure", aumv.m77339a("failure_reason_key", str));
            autv.f92525a.mo50747b();
        } catch (bedp e) {
            Log.w("Eid-EidDataScanner", e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo50873c() {
        return false;
    }
}
