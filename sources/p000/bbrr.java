package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bbrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbrr implements bbpf {

    /* renamed from: a */
    public static final bdbd f103233a = new bdbd();

    /* renamed from: b */
    public final Context f103234b;

    /* renamed from: c */
    public final bqgj f103235c;

    /* renamed from: d */
    public final bcaw f103236d;

    /* renamed from: e */
    final Set f103237e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: f */
    public final bcki f103238f;

    /* renamed from: g */
    private final bbyw f103239g;

    /* renamed from: h */
    private final bbpv f103240h;

    public bbrr(Context context, bbyw bbyw, bcki bcki, bcaw bcaw, bbpv bbpv) {
        this.f103234b = context;
        this.f103239g = bbyw;
        this.f103238f = bcki;
        this.f103235c = bboz.m88304a().f103024a;
        this.f103236d = bcaw;
        this.f103240h = bbpv;
    }

    /* renamed from: a */
    private final bqgg m88438a(bqgg bqgg, bcoh bcoh, ConversationId conversationId) {
        bqgg a = bqdx.m112673a(bqgg, new bbrj(this, bcoh, conversationId), bqfb.INSTANCE);
        return bqga.m112783b(a).mo69216a(new bbrk(a), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bdal mo56387b(bcoh bcoh) {
        return this.f103239g.mo56561a(bcoh);
    }

    /* renamed from: c */
    public final bqgg mo56303c(bcoh bcoh, ConversationId conversationId) {
        bcei c = bcej.m88869c();
        c.f104034a = "unblock conversation";
        c.mo56735a(bcen.f104044e);
        bqgg a = bqdx.m112673a(bqga.m112771a(new bbrl(this, bcoh, conversationId, c.mo56734a()), this.f103235c), new bbrm(this, bcoh, conversationId), bqfb.INSTANCE);
        return bqga.m112783b(a).mo69216a(new bbrn(a), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bqgg mo56302b(bcoh bcoh, ConversationId conversationId) {
        bcei c = bcej.m88869c();
        c.f104034a = "block conversation and mark spam";
        c.mo56735a(bcen.f104044e);
        bqgg a = bqga.m112771a(new bbri(this, bcoh, conversationId, c.mo56734a()), this.f103235c);
        this.f103240h.mo56347b(conversationId);
        return m88438a(a, bcoh, conversationId);
    }

    /* renamed from: d */
    public final bdar mo56304d(bcoh bcoh, ConversationId conversationId) {
        return mo56385a(bcoh, conversationId, bmyd.ALWAYS_FALSE);
    }

    /* renamed from: a */
    public final bdar mo56385a(bcoh bcoh, ConversationId conversationId, bmxz bmxz) {
        return bdak.m90446a(mo56387b(bcoh).mo56608a(bdbd.m90523a(conversationId)), new bbrq(this, bmxz, bcoh));
    }

    /* renamed from: a */
    public final bqgg mo56300a(bcoh bcoh, ConversationId conversationId) {
        bcei c = bcej.m88869c();
        c.f104034a = "block conversation";
        c.mo56735a(bcen.f104044e);
        bqgg a = bqga.m112771a(new bbra(this, bcoh, conversationId, c.mo56734a()), this.f103235c);
        this.f103240h.mo56347b(conversationId);
        return m88438a(a, bcoh, conversationId);
    }

    /* renamed from: a */
    public final bqgg mo56386a(bcoh bcoh, String str) {
        bcei c = bcej.m88869c();
        c.f104034a = "fetch blocked conversation";
        c.mo56735a(bcen.f104044e);
        return bqdx.m112673a(bqdx.m112674a(bbqt.m88418a(bbqt.m88417a(this.f103234b).f103174p, this.f103235c), new bbrd(this, bcoh, str, c.mo56734a()), this.f103235c), new bbre(this, bcoh), this.f103235c);
    }

    /* renamed from: a */
    public final void mo56301a(bcoh bcoh) {
        if (this.f103237e.add(bcoh)) {
            this.f103235c.mo25812a(new bbrc(this, bqdx.m112673a(mo56386a(bcoh, (String) null), new bbrb(this, bcoh), bqfb.INSTANCE), bcoh));
        }
    }
}
