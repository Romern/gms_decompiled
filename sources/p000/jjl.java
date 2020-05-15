package p000;

import android.os.Handler;
import java.util.List;

/* renamed from: jjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjl extends jmg {

    /* renamed from: a */
    final /* synthetic */ jju f22622a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jjl(jju jju, Handler handler) {
        super(handler);
        this.f22622a = jju;
    }

    /* renamed from: a */
    public final void mo13765a() {
        jju.f22638a.mo25418e("Error fetching device data.", new Object[0]);
        this.f22622a.f22659v = false;
        this.f22622a.mo13803d();
    }

    /* renamed from: a */
    public final void mo13766a(byte[] bArr, List list) {
        this.f22622a.f22659v = false;
        if (bArr == null) {
            jju.f22638a.mo25418e("Received a null public key.", new Object[0]);
            this.f22622a.mo13803d();
            return;
        }
        jju jju = this.f22622a;
        jju.f22653p = bArr;
        jju.mo13804e();
    }
}
