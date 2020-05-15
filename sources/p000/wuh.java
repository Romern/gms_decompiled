package p000;

import android.net.Uri;

/* renamed from: wuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wuh extends buqn {

    /* renamed from: a */
    final /* synthetic */ Uri f51360a;

    /* renamed from: b */
    final /* synthetic */ wuj f51361b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wuh(wuj wuj, String str, Uri uri) {
        super(str);
        this.f51361b = wuj;
        this.f51360a = uri;
    }

    public final void run() {
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wuh", "run", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("ServiceBindHelper: auto unpin triggered, uri = %s", this.f51360a.toString());
        this.f51361b.mo29419b(this.f51360a);
    }
}
