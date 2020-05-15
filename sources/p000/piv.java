package p000;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;

/* renamed from: piv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class piv extends pkr {

    /* renamed from: a */
    final /* synthetic */ pjc f39255a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public piv(pjc pjc, Context context, String str, String str2, CastDevice castDevice) {
        super(context, str, str2, castDevice);
        this.f39255a = pjc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23225a(blsw blsw) {
        this.f40173s.mo23670a("Protocol version has been negotiated: %s", blsw);
        pjc pjc = this.f39255a;
        pjc.f39337z = blsw;
        pjc.f39277F.mo23268a(pjc.f39337z);
    }
}
