package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bcjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcjh implements bceh {

    /* renamed from: a */
    final /* synthetic */ bcej f104304a;

    /* renamed from: b */
    final /* synthetic */ UUID f104305b;

    /* renamed from: c */
    final /* synthetic */ bqgg f104306c;

    /* renamed from: d */
    final /* synthetic */ ContactId f104307d;

    /* renamed from: e */
    final /* synthetic */ bcoh f104308e;

    /* renamed from: f */
    final /* synthetic */ bcjm f104309f;

    /* renamed from: g */
    final /* synthetic */ bcmw f104310g;

    /* renamed from: h */
    final /* synthetic */ bbua f104311h;

    public bcjh(bcjm bcjm, bcej bcej, UUID uuid, bbua bbua, bcmw bcmw, bqgg bqgg, ContactId contactId, bcoh bcoh) {
        this.f104309f = bcjm;
        this.f104304a = bcej;
        this.f104305b = uuid;
        this.f104311h = bbua;
        this.f104310g = bcmw;
        this.f104306c = bqgg;
        this.f104307d = contactId;
        this.f104308e = bcoh;
    }

    /* renamed from: a */
    public final bcej mo56732a() {
        return this.f104304a;
    }

    /* renamed from: b */
    public final bqgg mo56733b() {
        bcjm bcjm = this.f104309f;
        return bcjm.mo56940a(this.f104305b, this.f104311h, this.f104310g, bcjm.mo56937a(this.f104306c, this.f104307d), this.f104308e);
    }
}
