package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bckq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bckq implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bcoh f104399a;

    /* renamed from: b */
    final /* synthetic */ bcmq f104400b;

    /* renamed from: c */
    final /* synthetic */ ConversationId f104401c;

    /* renamed from: d */
    final /* synthetic */ bcku f104402d;

    public bckq(bcku bcku, bcoh bcoh, bcmq bcmq, ConversationId conversationId) {
        this.f104402d = bcku;
        this.f104399a = bcoh;
        this.f104400b = bcmq;
        this.f104401c = conversationId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        bcfx bcfx = this.f104402d.f104415c;
        bcnr q = bcns.m89409q();
        q.mo57011b(19);
        q.mo57012b(this.f104399a.mo57058b().mo57074e());
        q.mo57010a(this.f104399a.mo57059c().mo73781l());
        q.mo57013b(this.f104400b.f104493a);
        q.mo57008a(this.f104401c);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bcfx bcfx = this.f104402d.f104415c;
        bcnr q = bcns.m89409q();
        q.mo57011b(20);
        q.mo57012b(this.f104399a.mo57058b().mo57074e());
        q.mo57010a(this.f104399a.mo57059c().mo73781l());
        q.mo57013b(this.f104400b.f104493a);
        q.mo57008a(this.f104401c);
        bcfx.mo56753a(q.mo57002a());
    }
}
