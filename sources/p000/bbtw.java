package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bbtw */
final /* synthetic */ class bbtw implements bqeg {

    /* renamed from: a */
    private final bbub f103367a;

    /* renamed from: b */
    private final bbua f103368b;

    /* renamed from: c */
    private final bcej f103369c;

    public bbtw(bbub bbub, bbua bbua, bcej bcej) {
        this.f103367a = bbub;
        this.f103368b = bbua;
        this.f103369c = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(bqgg, bcoh, boolean):bqgg
     arg types: [bqgg, bcoh, int]
     candidates:
      bcjm.a(bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, boolean):bqgg
      bcjm.a(java.util.UUID, bmxj, bcoh):bqgg
      bcjm.a(bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, int):bqgg
      bcjm.a(bqgg, bcoh, boolean):bqgg */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
     arg types: [bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bcja, int, bcej, int]
     candidates:
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbub bbub = this.f103367a;
        bbua bbua = this.f103368b;
        bcej bcej = this.f103369c;
        bbxw bbxw = bbub.f103383d;
        bcoh bcoh = bbub.f103381b;
        bcku bcku = (bcku) bbxw;
        bcjm bcjm = bcku.f104413a;
        UUID randomUUID = UUID.randomUUID();
        bcmw bcmw = new bcmw(bcoh, bcku.f104414b, bcku.f104418f);
        bqgg a = bqga.m112775a(new bcjn(new ciif(bcku.f104413a.f104335d.f104373c, chqo.f189006a.mo85545a(ciiq.f190419a, ciin.ASYNC))));
        if (((Boolean) bbqt.m88417a(bcjm.f104332a).f103116aK.mo58455c()).booleanValue()) {
            ContactId e = bcoh.mo57058b().mo57074e();
            return bcjm.mo56934a(bcoh, e, (bqeh) new bcja(bcjm, randomUUID, bbua, bcmw, a, e, bcoh), 0, bcej, true);
        } else if (bcjm.f104336e == null) {
            return bqga.m112777a((Throwable) new RuntimeException("tachyonRegistrationHandler is null"));
        } else {
            if (bcjm.f104338g == null) {
                return bqga.m112777a((Throwable) new RuntimeException("oAuthTokenProvider is null"));
            }
            ContactId e2 = bcoh.mo57058b().mo57074e();
            bqgg a2 = bcjm.mo56938a(bcjm.mo56940a(randomUUID, bbua, bcmw, bcjm.mo56937a(a, e2), bcoh), e2, 6);
            bqgg a3 = bcjm.mo56936a(a2, bcoh, true);
            bbua bbua2 = bbua;
            ContactId contactId = e2;
            bqgg bqgg = a;
            bcmw bcmw2 = bcmw;
            bqgg a4 = bqga.m112783b(a3).mo69214a(new bcio(bcjm, a3, randomUUID, bbua, bcmw, a, e2, bcoh, a2), bqfb.INSTANCE);
            if (((bcef) bcej).f104027a.mo56724a() == 0) {
                return a4;
            }
            return bcjm.mo56935a(a4, new bcjh(bcjm, bcej, randomUUID, bbua2, bcmw2, bqgg, contactId, bcoh));
        }
    }
}
