package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: akcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akcu extends adzx {

    /* renamed from: a */
    final /* synthetic */ akcv f71615a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akcu(akcv akcv, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.f71615a = akcv;
    }

    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcu", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("The contact book (uri: %s) has been modified.", uri);
        if (!cfov.f185185a.mo6606a().mo82388l()) {
            this.f71615a.mo39229a(true);
        } else if (this.f71615a.f71622g.getAndSet(true)) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akcu", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Ignoring the contact book change, as we're already batching the request.");
        } else {
            this.f71615a.f71621f.postDelayed(new akct(this), cfov.f185185a.mo6606a().mo82402z());
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl3.mo68432a("akcu", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Batching the contact book change. We will sync shortly.");
        }
    }
}
