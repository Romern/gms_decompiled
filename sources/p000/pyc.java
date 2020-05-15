package p000;

import android.content.Context;

/* renamed from: pyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyc extends aaab {

    /* renamed from: a */
    final /* synthetic */ String f40611a;

    /* renamed from: b */
    final /* synthetic */ pyf f40612b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyc(pyf pyf, String str, String str2) {
        super(str);
        this.f40612b = pyf;
        this.f40611a = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!this.f40612b.mo23809e(this.f40611a)) {
            pyf pyf = this.f40612b;
            pyf.f40622d.mo23670a("registerNamespace: %s %s", pyf.f40621c, this.f40611a);
            this.f40612b.f40624f.mo23200a(this.f40611a);
        }
    }
}
