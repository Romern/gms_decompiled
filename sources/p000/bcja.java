package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bcja */
public final /* synthetic */ class bcja implements bqeh {

    /* renamed from: a */
    private final bcjm f104277a;

    /* renamed from: b */
    private final UUID f104278b;

    /* renamed from: c */
    private final bqgg f104279c;

    /* renamed from: d */
    private final ContactId f104280d;

    /* renamed from: e */
    private final bcoh f104281e;

    /* renamed from: f */
    private final bcmw f104282f;

    /* renamed from: g */
    private final bbua f104283g;

    public bcja(bcjm bcjm, UUID uuid, bbua bbua, bcmw bcmw, bqgg bqgg, ContactId contactId, bcoh bcoh) {
        this.f104277a = bcjm;
        this.f104278b = uuid;
        this.f104283g = bbua;
        this.f104282f = bcmw;
        this.f104279c = bqgg;
        this.f104280d = contactId;
        this.f104281e = bcoh;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bcjm bcjm = this.f104277a;
        UUID uuid = this.f104278b;
        bbua bbua = this.f104283g;
        bcmw bcmw = this.f104282f;
        bqgg bqgg = this.f104279c;
        ContactId contactId = this.f104280d;
        Void voidR = (Void) obj;
        return bcjm.mo56940a(uuid, bbua, bcmw, bcjm.mo56937a(bqgg, contactId), this.f104281e);
    }
}
