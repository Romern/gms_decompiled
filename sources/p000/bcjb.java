package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bcjb */
final /* synthetic */ class bcjb implements bqeh {

    /* renamed from: a */
    private final bcjm f104284a;

    /* renamed from: b */
    private final UUID f104285b;

    /* renamed from: c */
    private final int f104286c;

    /* renamed from: d */
    private final bcnl f104287d;

    /* renamed from: e */
    private final boolean f104288e;

    /* renamed from: f */
    private final bqgg f104289f;

    /* renamed from: g */
    private final ContactId f104290g;

    /* renamed from: h */
    private final bcoh f104291h;

    /* renamed from: i */
    private final bcoz f104292i;

    public bcjb(bcjm bcjm, UUID uuid, int i, bcnl bcnl, boolean z, bqgg bqgg, ContactId contactId, bcoh bcoh, bcoz bcoz) {
        this.f104284a = bcjm;
        this.f104285b = uuid;
        this.f104286c = i;
        this.f104287d = bcnl;
        this.f104288e = z;
        this.f104289f = bqgg;
        this.f104290g = contactId;
        this.f104291h = bcoh;
        this.f104292i = bcoz;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bcjm bcjm = this.f104284a;
        UUID uuid = this.f104285b;
        int i = this.f104286c;
        bcnl bcnl = this.f104287d;
        boolean z = this.f104288e;
        bqgg bqgg2 = this.f104289f;
        ContactId contactId = this.f104290g;
        bcoh bcoh = this.f104291h;
        bcoz bcoz = this.f104292i;
        Void voidR = (Void) obj;
        if (z) {
            bqgg = bcjm.mo56937a(bqgg2, contactId);
        } else {
            bqgg = bqgg2;
        }
        return bcjm.mo56939a(uuid, i, bcnl, bqgg, bcoh, bcoz);
    }
}
