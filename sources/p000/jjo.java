package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.lang.ref.WeakReference;

/* renamed from: jjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjo extends AdvertiseCallback {

    /* renamed from: a */
    public final RemoteDevice f22626a;

    /* renamed from: b */
    private final WeakReference f22627b;

    public jjo(RemoteDevice remoteDevice, jju jju) {
        this.f22626a = remoteDevice;
        this.f22627b = new WeakReference(jju);
    }

    public final void onStartFailure(int i) {
        jju.f22638a.mo25418e("Unable to start advertising; error code: %d", Integer.valueOf(i));
        jsz.m17257a().mo14042a(i);
        jju jju = (jju) this.f22627b.get();
        if (jju == null) {
            jju.f22638a.mo25416d("BleForegroundAdvertiser has been killed; cannot handle failure. Central device: %s", this.f22626a);
            return;
        }
        jju.mo13797a(this.f22626a);
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        jsz.m17257a().mo14041a();
        jju jju = (jju) this.f22627b.get();
        if (jju == null) {
            jju.f22638a.mo25416d("BleForegroundAdvertiser has been killed; cannot start server. Central device: %s", this.f22626a);
            return;
        }
        String str = this.f22626a.f11138b;
        jjt jjt = jju.f22651n;
        if (jjt != null) {
            jjt.mo7775a();
        }
        jju.f22645h.put(str, jju.f22649l.mo14040a("peripheral_role_foreground_advertisement_to_initiator_hello_time"));
    }
}
