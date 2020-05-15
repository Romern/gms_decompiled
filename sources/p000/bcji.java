package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

/* renamed from: bcji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcji implements bceh {

    /* renamed from: a */
    final /* synthetic */ bcej f104312a;

    /* renamed from: b */
    final /* synthetic */ UUID f104313b;

    /* renamed from: c */
    final /* synthetic */ int f104314c;

    /* renamed from: d */
    final /* synthetic */ bcnl f104315d;

    /* renamed from: e */
    final /* synthetic */ boolean f104316e;

    /* renamed from: f */
    final /* synthetic */ bqgg f104317f;

    /* renamed from: g */
    final /* synthetic */ ContactId f104318g;

    /* renamed from: h */
    final /* synthetic */ bcoh f104319h;

    /* renamed from: i */
    final /* synthetic */ bcoz f104320i;

    /* renamed from: j */
    final /* synthetic */ bcjm f104321j;

    public bcji(bcjm bcjm, bcej bcej, UUID uuid, int i, bcnl bcnl, boolean z, bqgg bqgg, ContactId contactId, bcoh bcoh, bcoz bcoz) {
        this.f104321j = bcjm;
        this.f104312a = bcej;
        this.f104313b = uuid;
        this.f104314c = i;
        this.f104315d = bcnl;
        this.f104316e = z;
        this.f104317f = bqgg;
        this.f104318g = contactId;
        this.f104319h = bcoh;
        this.f104320i = bcoz;
    }

    /* renamed from: a */
    public final bcej mo56732a() {
        return this.f104312a;
    }

    /* renamed from: b */
    public final bqgg mo56733b() {
        bcjm bcjm = this.f104321j;
        return bcjm.mo56939a(this.f104313b, this.f104314c, this.f104315d, this.f104316e ? bcjm.mo56937a(this.f104317f, this.f104318g) : this.f104317f, this.f104319h, this.f104320i);
    }
}
