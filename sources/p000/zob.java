package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: zob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zob extends aeaa {

    /* renamed from: b */
    final /* synthetic */ FitProxyChimeraBroker f55581b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zob(FitProxyChimeraBroker fitProxyChimeraBroker) {
        super("fitness");
        this.f55581b = fitProxyChimeraBroker;
    }

    /* renamed from: a */
    public final void mo31286a() {
        skh.m35531a().mo25689a(this.f55581b, this);
        mo31285a((IBinder) null);
    }

    /* renamed from: a */
    public abstract void mo31285a(IBinder iBinder);

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        bnsl bnsl = (bnsl) FitProxyChimeraBroker.f32398g.mo68388c();
        bnsl.mo68432a("zob", "a", 276, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Locally bound service %s disconnected from ProxyBroker", componentName);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        FitProxyChimeraBroker fitProxyChimeraBroker = this.f55581b;
        srn srn = FitProxyChimeraBroker.f32398g;
        if (fitProxyChimeraBroker.f32408p.getCount() == 0) {
            bnsl bnsl = (bnsl) FitProxyChimeraBroker.f32398g.mo68388c();
            bnsl.mo68432a("zob", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected connection from %s", componentName);
        }
        if (iBinder == null) {
            bnsl bnsl2 = (bnsl) FitProxyChimeraBroker.f32398g.mo68388c();
            bnsl2.mo68432a("zob", "a", 251, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received null service connection");
        }
        mo31285a(iBinder);
        this.f55581b.f32408p.countDown();
    }

    /* renamed from: a */
    public final boolean mo31287a(String str) {
        Intent intent = new Intent();
        intent.setClassName(this.f55581b, str);
        return skh.m35531a().mo25690a(this.f55581b, intent, this, 1);
    }
}
