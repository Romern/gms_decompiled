package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: pxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pxr extends aaab {

    /* renamed from: a */
    final /* synthetic */ String f40583a;

    /* renamed from: b */
    final /* synthetic */ String f40584b;

    /* renamed from: c */
    final /* synthetic */ long f40585c;

    /* renamed from: d */
    final /* synthetic */ String f40586d;

    /* renamed from: e */
    final /* synthetic */ pyf f40587e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxr(pyf pyf, String str, String str2, String str3, long j, String str4) {
        super(str);
        this.f40587e = pyf;
        this.f40583a = str2;
        this.f40584b = str3;
        this.f40585c = j;
        this.f40586d = str4;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyf pyf = this.f40587e;
        pyf.f40622d.mo23670a("sendTextMessageWithDestinationId: %s %s %s %d %s", pyf.f40621c, this.f40583a, this.f40584b, Long.valueOf(this.f40585c), this.f40586d);
        if (!TextUtils.isEmpty(this.f40583a) && this.f40583a.length() <= 128 && !this.f40587e.mo23809e(this.f40583a) && !TextUtils.isEmpty(this.f40586d)) {
            pyf pyf2 = this.f40587e;
            if (!qay.m31782a(pyf2.f40620b, pyf2.f40621c)) {
                this.f40587e.f40622d.mo23673b("Ignoring call to sendTextMessageWithDestinationId. Calling package is not a Google app.", new Object[0]);
            } else {
                this.f40587e.f40624f.mo23204a(this.f40583a, this.f40584b, this.f40585c, this.f40586d);
            }
        }
    }
}
