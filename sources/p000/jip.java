package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import java.util.Locale;

/* renamed from: jip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jip extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ byte[] f22561a;

    /* renamed from: b */
    final /* synthetic */ jiq f22562b;

    public jip(jiq jiq, byte[] bArr) {
        this.f22562b = jiq;
        this.f22561a = bArr;
    }

    public final void onStartFailure(int i) {
        jiu jiu = this.f22562b.f22565c;
        jiu.f22573f = null;
        jiu.f22574g = false;
        this.f22562b.f22563a.mo14042a(i);
        jiq jiq = this.f22562b;
        jiq.f22565c.f22572e = null;
        jiq.f22564b.mo13768a(String.format(Locale.US, "Failed to start advertisement: error_code=%d", Integer.valueOf(i)));
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        jiu.f22568a.mo25412b("Advertising successful.", new Object[0]);
        this.f22562b.f22563a.mo14041a();
        this.f22562b.f22565c.mo13772c();
        jiu jiu = this.f22562b.f22565c;
        String a = srv.m36160a(this.f22561a);
        jiu.f22572e = a.length() == 0 ? new String("0x") : "0x".concat(a);
        jis jis = this.f22562b.f22565c.f22575h;
        if (jis != null) {
            jis.mo7776a(this.f22561a);
        }
        this.f22562b.f22564b.mo13767a();
    }
}
