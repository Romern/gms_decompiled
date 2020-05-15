package p000;

import java.util.UUID;

/* renamed from: bbru */
final /* synthetic */ class bbru implements bqeg {

    /* renamed from: a */
    private final bbsc f103246a;

    /* renamed from: b */
    private final bcoh f103247b;

    /* renamed from: c */
    private final bcsj f103248c;

    /* renamed from: d */
    private final bcej f103249d;

    public bbru(bbsc bbsc, bcoh bcoh, bcsj bcsj, bcej bcej) {
        this.f103246a = bbsc;
        this.f103247b = bcoh;
        this.f103248c = bcsj;
        this.f103249d = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmo, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbsc bbsc = this.f103246a;
        bcoh bcoh = this.f103247b;
        bcsj bcsj = this.f103248c;
        bcej bcej = this.f103249d;
        bckj bckj = bbsc.f103281i;
        return bckj.f104375a.mo56941a(UUID.randomUUID(), (bcnl) new bcmo(bcoh, bcsj.mo57302a(), bckj.f104376b), bckj.f104375a.f104335d.mo56962d(), bcoh, bcej, true);
    }
}
