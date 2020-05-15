package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: pyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyi extends pyw {

    /* renamed from: a */
    final /* synthetic */ String f40638a;

    /* renamed from: b */
    final /* synthetic */ String f40639b;

    /* renamed from: c */
    final /* synthetic */ long f40640c;

    /* renamed from: d */
    final /* synthetic */ pyx f40641d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyi(pyx pyx, String str, String str2, String str3, long j) {
        super(str);
        this.f40641d = pyx;
        this.f40638a = str2;
        this.f40639b = str3;
        this.f40640c = j;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyx pyx = this.f40641d;
        pyx.f40684d.mo23670a("sendTextMessage: %s %s %s %d", pyx.f40683c, this.f40638a, this.f40639b, Long.valueOf(this.f40640c));
        if (!TextUtils.isEmpty(this.f40638a) && this.f40638a.length() <= 128 && !this.f40641d.mo23814e(this.f40638a)) {
            this.f40641d.f40686f.mo23203a(this.f40638a, this.f40639b, this.f40640c);
        }
    }
}
