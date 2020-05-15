package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* renamed from: pyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyn extends pyw {

    /* renamed from: a */
    final /* synthetic */ pin f40657a;

    /* renamed from: b */
    final /* synthetic */ CastDevice f40658b;

    /* renamed from: c */
    final /* synthetic */ String f40659c;

    /* renamed from: d */
    final /* synthetic */ aaac f40660d;

    /* renamed from: e */
    final /* synthetic */ String f40661e;

    /* renamed from: f */
    final /* synthetic */ String f40662f;

    /* renamed from: g */
    final /* synthetic */ pyx f40663g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyn(pyx pyx, String str, pin pin, CastDevice castDevice, String str2, aaac aaac, String str3, String str4) {
        super(str);
        this.f40663g = pyx;
        this.f40657a = pin;
        this.f40658b = castDevice;
        this.f40659c = str2;
        this.f40660d = aaac;
        this.f40661e = str3;
        this.f40662f = str4;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        pkd pkd;
        CastDevice castDevice;
        pyx pyx = this.f40663g;
        pin pin = this.f40657a;
        CastDevice castDevice2 = this.f40658b;
        String str = this.f40659c;
        pim pim = pyx.f40685e;
        if (pin.m30484a(castDevice2, pim, pin.f39239c)) {
            pnu c = pin.f39239c.mo23464c(castDevice2.mo17494a());
            pnt d = pin.f39239c.mo23465d(c.f39887j);
            if (d != null) {
                castDevice = d.f39878a;
            } else {
                castDevice = null;
            }
            pkc pkc = pin.f39238b;
            String str2 = c.f39888k;
            String str3 = c.f39887j;
            pkd pkd2 = (pkd) pkc.f39419a.get(castDevice2.mo17494a());
            if (pkd2 != null) {
                pkd2.mo23293a(pim);
                pkd = pkd2;
            } else if (castDevice != null) {
                pkd pkd3 = new pkd(castDevice2, castDevice, str2, str3, str, pim, pkc.f39422d, pkc.f39420b, pkc.f39421c);
                pkc.f39419a.put(castDevice2.mo17494a(), pkd3);
                pkd = pkd3;
            } else {
                pkd = null;
            }
        } else {
            pkd = pin.f39237a.mo23232a(castDevice2, str, pim);
        }
        pyx.f40686f = pkd;
        pyx pyx2 = this.f40663g;
        pil pil = pyx2.f40686f;
        if (pil == null) {
            this.f40660d.mo16651a(2017, pyx2, null);
            this.f40663g.mo23811b();
        } else if (pil.mo23211b()) {
            pyx pyx3 = this.f40663g;
            if (pyx3.f40687g != null) {
                pyx3.f40684d.mo23856a("Already connected to %s", this.f40658b);
                pyx pyx4 = this.f40663g;
                pyx4.f40687g.mo16652a((aaai) pyx4);
                this.f40663g.mo23811b();
                return;
            }
            pyx3.f40684d.mo23675c("GmsCallbacks called the second time", new Object[0]);
        } else if (this.f40663g.f40686f.mo23213c() || this.f40663g.f40686f.mo23214d()) {
            this.f40663g.f40684d.mo23856a("Already connecting to %s", this.f40658b);
        } else if (!TextUtils.isEmpty(this.f40661e) || !TextUtils.isEmpty(this.f40662f)) {
            this.f40663g.f40684d.mo23858a("Reconnecting to device (%s) with applicationId=%s, sessionId=%s", this.f40658b, this.f40661e, this.f40662f);
            this.f40663g.f40686f.mo23202a(this.f40661e, this.f40662f);
        } else {
            this.f40663g.f40684d.mo23856a("Connecting to device (%s)", this.f40658b);
            this.f40663g.f40686f.mo23198a();
        }
    }
}
