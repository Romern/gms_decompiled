package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcvs implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bcwr f105018a;

    /* renamed from: b */
    final /* synthetic */ bctr f105019b;

    /* renamed from: c */
    final /* synthetic */ bcoh f105020c;

    /* renamed from: d */
    final /* synthetic */ bcvt f105021d;

    public bcvs(bcvt bcvt, bcwr bcwr, bctr bctr, bcoh bcoh) {
        this.f105021d = bcvt;
        this.f105018a = bcwr;
        this.f105019b = bctr;
        this.f105020c = bcoh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bcvx bcvx = (bcvx) obj;
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        chus chus = chus.OK;
        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
        int ordinal = chuv.m149608a(th).f189233s.ordinal();
        if (ordinal == 3 || ordinal == 5) {
            bcwq h = this.f105018a.mo57630h();
            h.mo57638a(2);
            bcwr a = h.mo57637a();
            bcte n = this.f105019b.mo57374n();
            bctg c = bcth.m89920c();
            c.mo57523a("photos");
            c.mo57524a((byte[]) bcva.m90100a(a).mo66814b());
            n.mo57504a(c.mo57522a());
            this.f105021d.f105027f.mo56561a(this.f105020c).mo56643b(n.mo57502a());
        }
    }
}
