package p000;

import android.content.Context;

/* renamed from: pyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyu extends pyw {

    /* renamed from: a */
    final /* synthetic */ String f40677a;

    /* renamed from: b */
    final /* synthetic */ pyx f40678b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyu(pyx pyx, String str, String str2) {
        super(str);
        this.f40678b = pyx;
        this.f40677a = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!this.f40678b.mo23814e(this.f40677a)) {
            pyx pyx = this.f40678b;
            pyx.f40684d.mo23670a("registerNamespace: %s %s", pyx.f40683c, this.f40677a);
            this.f40678b.f40686f.mo23200a(this.f40677a);
        }
    }
}
