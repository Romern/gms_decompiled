package p000;

import android.content.Context;

/* renamed from: pys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pys extends pyw {

    /* renamed from: a */
    final /* synthetic */ String f40674a;

    /* renamed from: b */
    final /* synthetic */ pyx f40675b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pys(pyx pyx, String str, String str2) {
        super(str);
        this.f40675b = pyx;
        this.f40674a = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyx pyx = this.f40675b;
        pyx.f40684d.mo23673b("stopApplication: %s %s", pyx.f40683c, this.f40674a);
        this.f40675b.f40686f.mo23212c(this.f40674a);
    }
}
