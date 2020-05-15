package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: pyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyj extends pyw {

    /* renamed from: a */
    final /* synthetic */ String f40642a;

    /* renamed from: b */
    final /* synthetic */ String f40643b;

    /* renamed from: c */
    final /* synthetic */ long f40644c;

    /* renamed from: d */
    final /* synthetic */ String f40645d;

    /* renamed from: e */
    final /* synthetic */ pyx f40646e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyj(pyx pyx, String str, String str2, String str3, long j, String str4) {
        super(str);
        this.f40646e = pyx;
        this.f40642a = str2;
        this.f40643b = str3;
        this.f40644c = j;
        this.f40645d = str4;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyx pyx = this.f40646e;
        pyx.f40684d.mo23670a("sendTextMessageWithDestinationId: %s %s %s %d %s", pyx.f40683c, this.f40642a, this.f40643b, Long.valueOf(this.f40644c), this.f40645d);
        if (!TextUtils.isEmpty(this.f40642a) && this.f40642a.length() <= 128 && !this.f40646e.mo23814e(this.f40642a) && !TextUtils.isEmpty(this.f40645d)) {
            pyx pyx2 = this.f40646e;
            if (!qay.m31782a(pyx2.f40682b, pyx2.f40683c)) {
                this.f40646e.f40684d.mo23673b("Ignoring call to sendTextMessageWithDestinationId. Calling package is not a Google app.", new Object[0]);
            } else {
                this.f40646e.f40686f.mo23204a(this.f40642a, this.f40643b, this.f40644c, this.f40645d);
            }
        }
    }
}
