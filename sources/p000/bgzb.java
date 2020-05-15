package p000;

import android.util.Log;

/* renamed from: bgzb */
public final /* synthetic */ class bgzb implements aubq {

    /* renamed from: a */
    public static final aubq f118146a = new bgzb();

    private bgzb() {
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b() && Log.isLoggable("GCoreUlr", 6)) {
            Log.e("GCoreUlr", "Exception writing audit record", aucb.mo50387e());
        }
    }
}
