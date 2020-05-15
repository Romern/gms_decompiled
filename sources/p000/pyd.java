package p000;

import android.content.Context;

/* renamed from: pyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyd extends aaab {

    /* renamed from: a */
    final /* synthetic */ String f40613a;

    /* renamed from: b */
    final /* synthetic */ pyf f40614b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyd(pyf pyf, String str, String str2) {
        super(str);
        this.f40614b = pyf;
        this.f40613a = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!this.f40614b.mo23809e(this.f40613a)) {
            pyf pyf = this.f40614b;
            pyf.f40622d.mo23670a("unregisterNamespace: %s %s", pyf.f40621c, this.f40613a);
            this.f40614b.f40624f.mo23210b(this.f40613a);
        }
    }
}
