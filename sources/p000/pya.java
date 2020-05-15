package p000;

import android.content.Context;

/* renamed from: pya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pya extends aaab {

    /* renamed from: a */
    final /* synthetic */ String f40608a;

    /* renamed from: b */
    final /* synthetic */ pyf f40609b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pya(pyf pyf, String str, String str2) {
        super(str);
        this.f40609b = pyf;
        this.f40608a = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyf pyf = this.f40609b;
        pyf.f40622d.mo23673b("stopApplication: %s %s", pyf.f40621c, this.f40608a);
        this.f40609b.f40624f.mo23212c(this.f40608a);
    }
}
