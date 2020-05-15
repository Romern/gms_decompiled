package p000;

import java.util.List;
import java.util.UUID;

/* renamed from: bbsz */
final /* synthetic */ class bbsz implements bqeg {

    /* renamed from: a */
    private final bbub f103320a;

    /* renamed from: b */
    private final List f103321b;

    /* renamed from: c */
    private final bcej f103322c;

    public bbsz(bbub bbub, List list, bcej bcej) {
        this.f103320a = bbub;
        this.f103321b = list;
        this.f103322c = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcma, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbub bbub = this.f103320a;
        List list = this.f103321b;
        bcej bcej = this.f103322c;
        bbxw bbxw = bbub.f103383d;
        bcoh bcoh = bbub.f103381b;
        bcku bcku = (bcku) bbxw;
        return bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) new bcma(bcoh, list), bcku.f104413a.f104335d.mo56960b(), bcoh, bcej, true);
    }
}
