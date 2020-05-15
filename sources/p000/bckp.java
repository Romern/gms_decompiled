package p000;

import java.util.UUID;

/* renamed from: bckp */
final /* synthetic */ class bckp implements bqeg {

    /* renamed from: a */
    private final bcku f104394a;

    /* renamed from: b */
    private final bcoh f104395b;

    /* renamed from: c */
    private final bctr f104396c;

    /* renamed from: d */
    private final cbds f104397d;

    /* renamed from: e */
    private final bcej f104398e;

    public bckp(bcku bcku, bcoh bcoh, bctr bctr, cbds cbds, bcej bcej) {
        this.f104394a = bcku;
        this.f104395b = bcoh;
        this.f104396c = bctr;
        this.f104397d = cbds;
        this.f104398e = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcng, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bcku bcku = this.f104394a;
        bcoh bcoh = this.f104395b;
        bctr bctr = this.f104396c;
        cbds cbds = this.f104397d;
        return bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) new bcng(bcoh, bcku.f104414b, bctr, cbds, bcku.f104418f), bcku.f104413a.f104335d.mo56962d(), bcoh, this.f104398e, true);
    }
}
