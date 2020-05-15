package p000;

import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;

/* renamed from: iun */
final /* synthetic */ class iun implements aubq {

    /* renamed from: a */
    private final bqgy f21809a;

    public iun(bqgy bqgy) {
        this.f21809a = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bqgy bqgy = this.f21809a;
        Logger Logger = iuq.f21814a;
        if (!aucb.mo50384b()) {
            bqgy.mo69136a((Throwable) new iuk("Failed to derive symmetric key."));
            return;
        }
        ExportedSymmetricKey exportedSymmetricKey = (ExportedSymmetricKey) aucb.mo50386d();
        if (exportedSymmetricKey == null) {
            bqgy.mo69136a((Throwable) new iuk("Symmetric key is null."));
        } else {
            bqgy.mo69138b(byrr.m125225a(exportedSymmetricKey.f10531b));
        }
    }
}
