package p000;

import android.content.Context;

/* renamed from: ahux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahux extends buqn {

    /* renamed from: a */
    final /* synthetic */ boolean f68130a;

    /* renamed from: b */
    final /* synthetic */ Context f68131b;

    /* renamed from: c */
    final /* synthetic */ ahyz f68132c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahux(String str, boolean z, Context context, ahyz ahyz) {
        super(str);
        this.f68130a = z;
        this.f68131b = context;
        this.f68132c = ahyz;
    }

    public final void run() {
        if (!this.f68130a) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: fail to update name, enable update name status.");
            ahyz ahyz = this.f68132c;
            ((ahst) ahgz.m55754a(this.f68131b, ahst.class)).mo37038a(ahyz, true, ahyz.f68431e);
            return;
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: success to update name, clear retry times.");
        ((ahst) ahgz.m55754a(this.f68131b, ahst.class)).mo37038a(this.f68132c, false, 0);
    }
}
