package p000;

import java.util.UUID;

/* renamed from: bbwy */
final /* synthetic */ class bbwy implements bmxj {

    /* renamed from: a */
    private final bbxm f103643a;

    /* renamed from: b */
    private final bcoh f103644b;

    /* renamed from: c */
    private final bcej f103645c;

    public bbwy(bbxm bbxm, bcoh bcoh, bcej bcej) {
        this.f103643a = bbxm;
        this.f103644b = bcoh;
        this.f103645c = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcnp, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    public final Object apply(Object obj) {
        bbxm bbxm = this.f103643a;
        bcoh bcoh = this.f103644b;
        bcej bcej = this.f103645c;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            bbpq b = bbpr.m88358b();
            b.f103039a = 2;
            return b.mo56337a();
        }
        bcky bcky = bbxm.f103688n;
        bcky.f104427a.mo56941a(UUID.randomUUID(), (bcnl) new bcnp(bcoh), bcky.f104427a.f104335d.mo56959a(), bcoh, bcej, false).mo741a(new bbxf(bbxm, bcoh), bqfb.INSTANCE);
        bbpq b2 = bbpr.m88358b();
        b2.f103039a = 1;
        return b2.mo56337a();
    }
}
