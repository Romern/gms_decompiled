package p000;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: aiav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiav extends buqn {

    /* renamed from: a */
    final /* synthetic */ DiscoveryChimeraService f68582a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiav(DiscoveryChimeraService discoveryChimeraService, String str) {
        super(str);
        this.f68582a = discoveryChimeraService;
    }

    public final void run() {
        for (ahsu ahsu : this.f68582a.f80532c.mo37048c()) {
            ahsu.mo37070a(true);
        }
        aict aict = this.f68582a.f80536g;
        for (ahsu ahsu2 : ((ahst) ahgz.m55754a(aict.f68726a, ahst.class)).mo37048c()) {
            aict.f68730e.mo37430a(ahsu2.mo37084i());
        }
        aict.f68730e.mo37430a("notification_id_beacon_opt_in");
        aict.f68730e.mo37430a("notification_group_beacon");
        aict.f68730e.mo37430a("notification_group_device");
        aict.f68730e.mo37430a("notification_group_heads_up_device");
    }
}
