package p000;

import android.os.Handler;
import java.util.Map;

/* renamed from: jjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjm extends jnb {

    /* renamed from: a */
    final /* synthetic */ jju f22623a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jjm(jju jju, Handler handler) {
        super(handler);
        this.f22623a = jju;
    }

    /* renamed from: a */
    public final void mo13785a() {
        jju.f22638a.mo25418e("Error fetching device data.", new Object[0]);
        this.f22623a.f22660w = false;
        this.f22623a.mo13803d();
    }

    /* renamed from: a */
    public final void mo13786a(Map map) {
        this.f22623a.f22660w = false;
        jju jju = this.f22623a;
        jju.f22654q = map;
        jju.mo13804e();
    }
}
