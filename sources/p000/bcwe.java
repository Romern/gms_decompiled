package p000;

import android.content.Context;
import java.util.UUID;

/* renamed from: bcwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwe {

    /* renamed from: a */
    public final bcjm f105048a;

    /* renamed from: b */
    public final Context f105049b;

    /* renamed from: c */
    public final bcfx f105050c;

    public bcwe(bcjm bcjm, Context context) {
        this.f105048a = bcjm;
        this.f105049b = context;
        this.f105050c = bcfx.m88929a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcwj, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo57615a(bcoh bcoh, bcwp bcwp, bctr bctr, String str, bcej bcej, int i) {
        bcfx bcfx = this.f105050c;
        bcnr q = bcns.m89409q();
        q.mo57011b(31);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bctr.mo57359a());
        q.mo57008a(bctr.mo57361c());
        bcfx.mo56753a(q.mo57002a());
        bcjm bcjm = this.f105048a;
        UUID randomUUID = UUID.randomUUID();
        bcwj bcwj = new bcwj(bcoh, str, bcwp, i);
        Context context = this.f105049b;
        bqgg a = bcjm.mo56941a(randomUUID, (bcnl) bcwj, bqga.m112775a(new bcwa(context, new bcwg(context, null))), bcoh, bcej, true);
        bqga.m112781a(a, new bcwc(this, bcoh, bctr), bqfb.INSTANCE);
        return a;
    }
}
