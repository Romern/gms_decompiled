package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwu implements bclf {

    /* renamed from: a */
    private final Context f105088a;

    public bcwu(Context context) {
        this.f105088a = context;
    }

    /* renamed from: a */
    public final bcle mo56971a() {
        return new bcxm(this.f105088a);
    }

    /* renamed from: b */
    public final String mo56976b() {
        return "rich_card";
    }

    /* renamed from: a */
    public final bqgg mo56972a(bcoh bcoh, bctr bctr) {
        return bqga.m112775a(bctr);
    }

    /* renamed from: b */
    public final void mo56977b(bcoh bcoh, bctr bctr, bcnt bcnt) {
        bcnr q = bcns.m89409q();
        q.mo57011b(35);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bctr.mo57359a());
        q.mo57008a(bctr.mo57361c());
        bcnt.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final void mo56973a(bcoh bcoh) {
        bqga.m112775a((Object) true);
    }

    /* renamed from: a */
    public final void mo56974a(bcoh bcoh, bctr bctr, bcnt bcnt) {
        bcnr q = bcns.m89409q();
        q.mo57011b(36);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bctr.mo57359a());
        q.mo57008a(bctr.mo57361c());
        bcnt.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final void mo56975a(ConversationId conversationId) {
        bqga.m112775a((Object) true);
    }
}
