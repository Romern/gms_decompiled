package p000;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.gms.car.InCallServiceImpl;

/* renamed from: nkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nkt extends aeaa {

    /* renamed from: a */
    final /* synthetic */ nkw f35918a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nkt(nkw nkw) {
        super("car");
        this.f35918a = nkw;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        bnsi d = nkw.f35922a.mo68390d();
        d.mo68432a("nkt", "a", 543, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("onServiceDisconnected from InCallService");
        nkw nkw = this.f35918a;
        nkw.f35925d = null;
        nkw.mo21001a((ntv) null);
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        ntv ntv;
        bnsi d = nkw.f35922a.mo68390d();
        d.mo68432a("nkt", "a", 524, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("onServiceConnected: %s, service: %s", componentName, iBinder);
        if (!(iBinder instanceof nti)) {
            bnsi c = nkw.f35922a.mo68388c();
            c.mo68432a("nkt", "a", 526, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68424a("onServiceConnected called for an unknown service: %s, service: %s", componentName, iBinder);
            return;
        }
        this.f35918a.f35925d = ((nti) iBinder).mo21559a();
        nkw nkw = this.f35918a;
        InCallServiceImpl inCallServiceImpl = nkw.f35925d;
        inCallServiceImpl.f29408a.add(nkw.f35926e);
        InCallServiceImpl inCallServiceImpl2 = this.f35918a.f35925d;
        if (inCallServiceImpl2.getPhone() != null) {
            ntv = new ntv(inCallServiceImpl2.getPhone());
        } else {
            ntv = null;
        }
        if (ntv != null) {
            this.f35918a.mo21001a(ntv);
        }
    }
}
