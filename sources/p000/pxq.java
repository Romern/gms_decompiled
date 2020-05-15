package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: pxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxq extends aaab {

    /* renamed from: a */
    final /* synthetic */ String f40579a;

    /* renamed from: b */
    final /* synthetic */ String f40580b;

    /* renamed from: c */
    final /* synthetic */ long f40581c;

    /* renamed from: d */
    final /* synthetic */ pyf f40582d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxq(pyf pyf, String str, String str2, String str3, long j) {
        super(str);
        this.f40582d = pyf;
        this.f40579a = str2;
        this.f40580b = str3;
        this.f40581c = j;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyf pyf = this.f40582d;
        pyf.f40622d.mo23670a("sendTextMessage: %s %s %s %d", pyf.f40621c, this.f40579a, this.f40580b, Long.valueOf(this.f40581c));
        if (!TextUtils.isEmpty(this.f40579a) && this.f40579a.length() <= 128 && !this.f40582d.mo23809e(this.f40579a)) {
            this.f40582d.f40624f.mo23203a(this.f40579a, this.f40580b, this.f40581c);
        }
    }
}
