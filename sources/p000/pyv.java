package p000;

import android.content.Context;

/* renamed from: pyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyv extends pyw {

    /* renamed from: a */
    final /* synthetic */ String f40679a;

    /* renamed from: b */
    final /* synthetic */ pyx f40680b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyv(pyx pyx, String str, String str2) {
        super(str);
        this.f40680b = pyx;
        this.f40679a = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!this.f40680b.mo23814e(this.f40679a)) {
            pyx pyx = this.f40680b;
            pyx.f40684d.mo23670a("unregisterNamespace: %s %s", pyx.f40683c, this.f40679a);
            this.f40680b.f40686f.mo23210b(this.f40679a);
        }
    }
}
