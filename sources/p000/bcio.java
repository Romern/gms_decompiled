package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bcio */
public final /* synthetic */ class bcio implements bqeg {

    /* renamed from: a */
    private final bcjm f104235a;

    /* renamed from: b */
    private final bqgg f104236b;

    /* renamed from: c */
    private final UUID f104237c;

    /* renamed from: d */
    private final bqgg f104238d;

    /* renamed from: e */
    private final ContactId f104239e;

    /* renamed from: f */
    private final bcoh f104240f;

    /* renamed from: g */
    private final bqgg f104241g;

    /* renamed from: h */
    private final bcmw f104242h;

    /* renamed from: i */
    private final bbua f104243i;

    public bcio(bcjm bcjm, bqgg bqgg, UUID uuid, bbua bbua, bcmw bcmw, bqgg bqgg2, ContactId contactId, bcoh bcoh, bqgg bqgg3) {
        this.f104235a = bcjm;
        this.f104236b = bqgg;
        this.f104237c = uuid;
        this.f104243i = bbua;
        this.f104242h = bcmw;
        this.f104238d = bqgg2;
        this.f104239e = contactId;
        this.f104240f = bcoh;
        this.f104241g = bqgg3;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104235a;
        bqgg bqgg = this.f104236b;
        UUID uuid = this.f104237c;
        bbua bbua = this.f104243i;
        bcmw bcmw = this.f104242h;
        bqgg bqgg2 = this.f104238d;
        ContactId contactId = this.f104239e;
        return ((Boolean) bqga.m112780a(bqgg)).booleanValue() ? bcjm.mo56940a(uuid, bbua, bcmw, bcjm.mo56937a(bqgg2, contactId), this.f104240f) : this.f104241g;
    }
}
