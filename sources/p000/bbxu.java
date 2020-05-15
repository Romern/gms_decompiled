package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bbxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbxu implements bbpv {

    /* renamed from: a */
    public final Context f103723a;

    /* renamed from: b */
    public final bbxw f103724b;

    /* renamed from: c */
    public final bqgj f103725c;

    /* renamed from: d */
    public final Map f103726d = new HashMap();

    /* renamed from: e */
    public final Map f103727e = new HashMap();

    /* renamed from: f */
    public final Handler f103728f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final Map f103729g = new HashMap();

    /* renamed from: h */
    private final bbyw f103730h;

    /* renamed from: i */
    private final Map f103731i = new HashMap();

    public bbxu(Context context, bbxw bbxw, bbyw bbyw) {
        this.f103723a = context;
        this.f103724b = bbxw;
        this.f103730h = bbyw;
        this.f103725c = bboz.m88304a().f103024a;
    }

    /* renamed from: c */
    private final synchronized bngx m88574c(ConversationId conversationId) {
        if (!this.f103731i.containsKey(conversationId)) {
            return bngx.m109376e();
        }
        bngs j = bngx.m109377j();
        for (Map.Entry entry : ((Map) this.f103731i.get(conversationId)).entrySet()) {
            if (((Boolean) ((Pair) entry.getValue()).first).booleanValue()) {
                j.mo67668c((ContactId) entry.getKey());
            }
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final synchronized bdar mo56344a(ConversationId conversationId) {
        if (!this.f103729g.containsKey(conversationId)) {
            bdax bdax = new bdax(m88574c(conversationId));
            this.f103729g.put(conversationId, bdax);
            return bdax;
        }
        return (bdar) this.f103729g.get(conversationId);
    }

    /* renamed from: b */
    public final synchronized void mo56347b(ConversationId conversationId) {
        this.f103731i.put(conversationId, new LinkedHashMap());
        if (this.f103729g.containsKey(conversationId)) {
            ((bdax) this.f103729g.get(conversationId)).mo56705a(m88574c(conversationId));
        }
    }

    /* renamed from: b */
    public final synchronized void mo56348b(ConversationId conversationId, ContactId contactId, long j) {
        if (!this.f103731i.containsKey(conversationId)) {
            this.f103731i.put(conversationId, new LinkedHashMap());
        }
        if (!((Map) this.f103731i.get(conversationId)).containsKey(contactId) || ((Long) ((Pair) ((Map) this.f103731i.get(conversationId)).get(contactId)).second).longValue() <= j) {
            ((Map) this.f103731i.get(conversationId)).put(contactId, Pair.create(false, Long.valueOf(j)));
            if (this.f103729g.containsKey(conversationId)) {
                ((bdax) this.f103729g.get(conversationId)).mo56705a(m88574c(conversationId));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo56345a(bcoh bcoh, ConversationId conversationId, int i) {
        this.f103725c.mo25812a(new bbxp(this, i, conversationId, bcoh));
    }

    /* renamed from: a */
    public final void mo56497a(bcoh bcoh, ConversationId conversationId, long j, long j2) {
        boolean z;
        long j3;
        ConversationId conversationId2 = conversationId;
        synchronized (this) {
            z = false;
            if (this.f103726d.containsKey(conversationId2)) {
                long longValue = ((Long) this.f103726d.get(conversationId2)).longValue();
                bbon.m88284a();
                if (longValue <= System.currentTimeMillis() - j) {
                    this.f103726d.remove(conversationId2);
                    z = true;
                }
                bbon.m88284a();
                j3 = (longValue + j) - System.currentTimeMillis();
            } else {
                j3 = -1;
            }
        }
        if (z) {
            mo56498a(bcoh, conversationId, false, j2, 344);
        } else if (j3 > 0) {
            this.f103728f.postDelayed(new bbxq(this, bcoh, conversationId, j, j2), j3);
        }
    }

    /* renamed from: a */
    public final void mo56498a(bcoh bcoh, ConversationId conversationId, boolean z, long j, int i) {
        this.f103730h.mo56561a(bcoh).mo56610a(conversationId).mo57830c(new bbxr(this, bcoh, conversationId, z, j, i));
    }

    /* renamed from: a */
    public final synchronized void mo56346a(ConversationId conversationId, ContactId contactId, long j) {
        if (!this.f103731i.containsKey(conversationId)) {
            this.f103731i.put(conversationId, new LinkedHashMap());
        }
        if (!((Map) this.f103731i.get(conversationId)).containsKey(contactId) || ((Long) ((Pair) ((Map) this.f103731i.get(conversationId)).get(contactId)).second).longValue() <= j) {
            ((Map) this.f103731i.get(conversationId)).put(contactId, Pair.create(true, Long.valueOf(j)));
            if (this.f103729g.containsKey(conversationId)) {
                ((bdax) this.f103729g.get(conversationId)).mo56705a(m88574c(conversationId));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56499a() {
        if (chqc.f188988a.mo6606a().mo85530e() || (((Boolean) bbqt.m88417a(this.f103723a).f103138ag.mo58455c()).booleanValue() && chqc.f188988a.mo6606a().mo85528c())) {
            return true;
        }
        return false;
    }
}
