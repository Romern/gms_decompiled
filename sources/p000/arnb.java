package p000;

import android.os.Handler;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: arnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arnb implements ahcp {

    /* renamed from: a */
    private final Handler f87945a;

    /* renamed from: e */
    public final ahcp f87946e;

    public arnb(ahcp ahcp) {
        this.f87946e = ahcp;
        this.f87945a = null;
    }

    /* renamed from: a */
    public final void mo36303a() {
        Handler handler = this.f87945a;
        if (handler != null) {
            handler.post(new armw(this));
        } else {
            this.f87946e.mo36303a();
        }
    }

    /* renamed from: b */
    public void mo36307b() {
        Handler handler = this.f87945a;
        if (handler != null) {
            handler.post(new armz(this));
        } else {
            this.f87946e.mo36307b();
        }
    }

    public arnb(ahcp ahcp, Handler handler) {
        this.f87946e = ahcp;
        this.f87945a = handler;
    }

    /* renamed from: a */
    public void mo36304a(int i) {
        Handler handler = this.f87945a;
        if (handler != null) {
            handler.post(new armx(this, i));
        } else {
            this.f87946e.mo36304a(i);
        }
    }

    /* renamed from: b */
    public void mo36308b(String str) {
        Handler handler = this.f87945a;
        if (handler != null) {
            handler.post(new arna(this, str));
        } else {
            this.f87946e.mo36308b(str);
        }
    }

    /* renamed from: a */
    public void mo36305a(Device device, byte[] bArr) {
        Handler handler = this.f87945a;
        if (handler != null) {
            handler.post(new armv(this, device, bArr));
        } else {
            this.f87946e.mo36305a(device, bArr);
        }
    }

    /* renamed from: a */
    public final void mo36306a(String str) {
        Handler handler = this.f87945a;
        if (handler != null) {
            handler.post(new army(this, str));
        } else {
            this.f87946e.mo36306a(str);
        }
    }
}
