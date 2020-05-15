package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: zls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zls extends zck {

    /* renamed from: a */
    final /* synthetic */ zgg f55404a;

    /* renamed from: b */
    final /* synthetic */ zlu f55405b;

    public zls(zlu zlu, zgg zgg) {
        this.f55405b = zlu;
        this.f55404a = zgg;
    }

    /* renamed from: a */
    public final void mo30933a(Status status) {
        zlu zlu = this.f55405b;
        srn srn = zlu.f55408a;
        if (zlu.f55410c.remove(this.f55404a) == null) {
            bnsl bnsl = (bnsl) zlu.f55408a.mo68387b();
            bnsl.mo68432a("zls", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't find listener to remove");
        }
    }
}
