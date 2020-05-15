package p000;

import java.util.UUID;

/* renamed from: bckk */
public final /* synthetic */ class bckk implements bqeh {

    /* renamed from: a */
    private final bcku f104377a;

    /* renamed from: b */
    private final bcoh f104378b;

    /* renamed from: c */
    private final bctr f104379c;

    /* renamed from: d */
    private final cbds f104380d;

    /* renamed from: e */
    private final bcej f104381e;

    public bckk(bcku bcku, bcoh bcoh, bctr bctr, cbds cbds, bcej bcej) {
        this.f104377a = bcku;
        this.f104378b = bcoh;
        this.f104379c = bctr;
        this.f104380d = cbds;
        this.f104381e = bcej;
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
    public final bqgg mo6375a(Object obj) {
        bcku bcku = this.f104377a;
        bcoh bcoh = this.f104378b;
        bctr bctr = this.f104379c;
        cbds cbds = this.f104380d;
        bcej bcej = this.f104381e;
        if (((Boolean) obj).booleanValue()) {
            return bcku.f104417e.mo56955a(new bckp(bcku, bcoh, bctr, cbds, bcej));
        }
        return bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) new bcng(bcoh, bcku.f104414b, bctr, cbds, bcku.f104418f), bcku.f104413a.f104335d.mo56962d(), bcoh, bcej, true);
    }
}
