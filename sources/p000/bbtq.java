package p000;

import java.util.UUID;

/* renamed from: bbtq */
final /* synthetic */ class bbtq implements bqeg {

    /* renamed from: a */
    private final bbub f103359a;

    /* renamed from: b */
    private final bcej f103360b;

    public bbtq(bbub bbub, bcej bcej) {
        this.f103359a = bbub;
        this.f103360b = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcms, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbub bbub = this.f103359a;
        bcej bcej = this.f103360b;
        bbxw bbxw = bbub.f103383d;
        bcoh bcoh = bbub.f103381b;
        bcku bcku = (bcku) bbxw;
        return bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) new bcms(bcoh, bcku.f104414b, bcku.f104418f), bcku.f104413a.f104335d.mo56960b(), bcoh, bcej, true);
    }
}
