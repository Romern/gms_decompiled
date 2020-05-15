package p000;

import android.os.Handler;
import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import java.util.List;

/* renamed from: jiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jiz extends jmg {

    /* renamed from: a */
    final /* synthetic */ BleCentralChimeraService f22593a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jiz(BleCentralChimeraService bleCentralChimeraService, Handler handler) {
        super(handler);
        this.f22593a = bleCentralChimeraService;
    }

    /* renamed from: a */
    public final void mo13765a() {
        BleCentralChimeraService.f11094a.mo25418e("Error fetching  device data; stopping service.", new Object[0]);
        this.f22593a.f11111r = false;
        this.f22593a.mo7774b();
        this.f22593a.stopSelf();
    }

    /* renamed from: a */
    public final void mo13766a(byte[] bArr, List list) {
        jkw a;
        this.f22593a.f11111r = false;
        jla jla = this.f22593a.f11096c;
        jkz a2 = jla.mo13843a(list, cchi.m129674f());
        jky jky = null;
        if (!(a2 == null || (a = jla.mo13841a(list, a2.f22727a, a2.f22728b)) == null)) {
            jky = new jky(a, jla.mo13841a(list, a2.f22729c, a2.f22730d));
        }
        if (jky == null) {
            BleCentralChimeraService.f11094a.mo25416d("EID data could not be generated; Will retry on the next sync.", new Object[0]);
            this.f22593a.mo7770a();
            this.f22593a.mo7774b();
            return;
        }
        this.f22593a.mo7773a(jky, list);
    }
}
