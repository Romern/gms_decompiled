package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;
import java.util.concurrent.Future;

/* renamed from: bciz */
final /* synthetic */ class bciz implements bqeg {

    /* renamed from: a */
    private final bcjm f104266a;

    /* renamed from: b */
    private final bqgg f104267b;

    /* renamed from: c */
    private final UUID f104268c;

    /* renamed from: d */
    private final int f104269d;

    /* renamed from: e */
    private final bcnl f104270e;

    /* renamed from: f */
    private final boolean f104271f;

    /* renamed from: g */
    private final bqgg f104272g;

    /* renamed from: h */
    private final ContactId f104273h;

    /* renamed from: i */
    private final bcoh f104274i;

    /* renamed from: j */
    private final bcoz f104275j;

    /* renamed from: k */
    private final bqgg f104276k;

    public bciz(bcjm bcjm, bqgg bqgg, UUID uuid, int i, bcnl bcnl, boolean z, bqgg bqgg2, ContactId contactId, bcoh bcoh, bcoz bcoz, bqgg bqgg3) {
        this.f104266a = bcjm;
        this.f104267b = bqgg;
        this.f104268c = uuid;
        this.f104269d = i;
        this.f104270e = bcnl;
        this.f104271f = z;
        this.f104272g = bqgg2;
        this.f104273h = contactId;
        this.f104274i = bcoh;
        this.f104275j = bcoz;
        this.f104276k = bqgg3;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104266a;
        bqgg bqgg = this.f104267b;
        UUID uuid = this.f104268c;
        int i = this.f104269d;
        bcnl bcnl = this.f104270e;
        boolean z = this.f104271f;
        bqgg bqgg2 = this.f104272g;
        ContactId contactId = this.f104273h;
        bcoh bcoh = this.f104274i;
        bcoz bcoz = this.f104275j;
        bqgg bqgg3 = this.f104276k;
        if (!((Boolean) bqga.m112780a((Future) bqgg)).booleanValue()) {
            return bqgg3;
        }
        if (z) {
            bqgg2 = bcjm.mo56937a(bqgg2, contactId);
        }
        return bcjm.mo56939a(uuid, i, bcnl, bqgg2, bcoh, bcoz);
    }
}
