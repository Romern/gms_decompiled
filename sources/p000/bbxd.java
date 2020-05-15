package p000;

import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: bbxd */
final /* synthetic */ class bbxd implements Callable {

    /* renamed from: a */
    private final bbxm f103652a;

    /* renamed from: b */
    private final bmxv f103653b;

    public bbxd(bbxm bbxm, bmxv bmxv) {
        this.f103652a = bbxm;
        this.f103653b = bmxv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmy, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    public final Object call() {
        bbxm bbxm = this.f103652a;
        bmxv bmxv = this.f103653b;
        bcky bcky = bbxm.f103688n;
        bcoh bcoh = (bcoh) bmxv.mo66814b();
        bcei c = bcej.m88869c();
        c.f104034a = "register capabilities";
        c.mo56735a(bcen.f104044e);
        return (Void) bcky.f104427a.mo56941a(UUID.randomUUID(), (bcnl) new bcmy(bcoh, bcky.f104428b), bcky.f104427a.f104335d.mo56963e(), bcoh, c.mo56734a(), true).get();
    }
}
