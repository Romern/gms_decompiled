package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pul extends pwe {

    /* renamed from: a */
    final /* synthetic */ pun f40265a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pul(pun pun, CastDevice castDevice, int i, String str, String str2, pwd pwd) {
        super(castDevice, i, str, str2, pwd);
        this.f40265a = pun;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23696a(String str) {
        this.f40173s.mo23670a("onAnswer = %s", str);
        this.f40265a.f40384s.execute(new puk(this, str));
    }
}
