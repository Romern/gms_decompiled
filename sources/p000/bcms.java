package p000;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/* renamed from: bcms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcms implements bcnl {

    /* renamed from: a */
    private final bcoh f104500a;

    /* renamed from: b */
    private final Context f104501b;

    /* renamed from: c */
    private final Map f104502c;

    public bcms(bcoh bcoh, Context context, Map map) {
        this.f104500a = bcoh;
        this.f104501b = context;
        this.f104502c = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmr((cbko) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbko.f177429b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbko) da.f164949b).f177431a = cbmo;
        return bqga.m112775a((cbko) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbkp cbkp = (cbkp) obj;
        bbyl bbyl = new bbyl();
        bbyl.mo56548a(true);
        bbyl.mo56547a(Collections.emptyList());
        bxwc bxwc = cbkp.f177434a;
        bcoh bcoh = this.f104500a;
        Context context = this.f104501b;
        bbyl.f103756a = bclm.m89260a(bxwc, bcoh, context, this.f104502c, bcfx.m88929a(context));
        bbyl.mo56547a(bclm.m89259a(cbkp.f177434a));
        bbyl.mo56548a(cbkp.f177435b);
        String str = bbyl.f103756a == null ? " tachyonMessages" : "";
        if (bbyl.f103757b == null) {
            str = str.concat(" ackIds");
        }
        if (bbyl.f103758c == null) {
            str = String.valueOf(str).concat(" pulledAll");
        }
        if (str.isEmpty()) {
            return new bbya(bbyl.f103756a, bbyl.f103757b, bbyl.f103758c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104500a.mo57058b().mo57074e());
        q.mo57010a(this.f104500a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(10);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbym bbym = (bbym) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104500a.mo57058b().mo57074e());
        q.mo57010a(this.f104500a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(10);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
