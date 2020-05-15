package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: bbub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbub {

    /* renamed from: a */
    public static final long f103378a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: w */
    private static final Map f103379w = new HashMap();

    /* renamed from: A */
    private final Map f103380A;

    /* renamed from: b */
    public final bcoh f103381b;

    /* renamed from: c */
    public final Context f103382c;

    /* renamed from: d */
    public final bbxw f103383d;

    /* renamed from: e */
    public final bdal f103384e;

    /* renamed from: f */
    public final bbpf f103385f;

    /* renamed from: g */
    public final bbpv f103386g;

    /* renamed from: h */
    public final bqgj f103387h;

    /* renamed from: i */
    public final bbpl f103388i;

    /* renamed from: j */
    public final bbpu f103389j;

    /* renamed from: k */
    public final bcfx f103390k;

    /* renamed from: l */
    public final bbqz f103391l;

    /* renamed from: m */
    public final ConcurrentMap f103392m;

    /* renamed from: n */
    public final Set f103393n;

    /* renamed from: o */
    public boolean f103394o = false;

    /* renamed from: p */
    public boolean f103395p = false;

    /* renamed from: q */
    public boolean f103396q = false;

    /* renamed from: r */
    public bbua f103397r;

    /* renamed from: s */
    public final Handler f103398s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    public final Object f103399t = new Object();

    /* renamed from: u */
    final Map f103400u;

    /* renamed from: v */
    public final Timer f103401v;

    /* renamed from: x */
    private final bbsi f103402x;

    /* renamed from: y */
    private final bbqx f103403y;

    /* renamed from: z */
    private final Map f103404z;

    public bbub(Context context, bcoh bcoh, bbxw bbxw, bbpl bbpl, bbpu bbpu, bdal bdal, bbpf bbpf, bbpv bbpv, bbsi bbsi, bbqx bbqx, bbqz bbqz, Map map) {
        this.f103382c = context;
        this.f103381b = bcoh;
        this.f103383d = bbxw;
        this.f103384e = bdal;
        this.f103385f = bbpf;
        this.f103386g = bbpv;
        this.f103402x = bbsi;
        this.f103403y = bbqx;
        this.f103404z = map;
        this.f103391l = bbqz;
        this.f103387h = bboz.m88304a().f103024a;
        this.f103388i = bbpl;
        this.f103389j = bbpu;
        this.f103390k = bcfx.m88929a(context);
        this.f103392m = new ConcurrentHashMap();
        this.f103401v = new Timer("TypingIndicatorTimer", true);
        this.f103400u = new HashMap();
        this.f103393n = new HashSet();
        this.f103380A = new HashMap();
    }

    /* renamed from: a */
    public static synchronized bbub m88472a(Context context, bcoh bcoh, bbxw bbxw, bbpl bbpl, bbpu bbpu, bdal bdal, bbpf bbpf, bbpv bbpv, bbsi bbsi, bbqx bbqx, Map map) {
        bbub bbub;
        bcoh bcoh2 = bcoh;
        synchronized (bbub.class) {
            if (!f103379w.containsKey(bcoh2)) {
                bcoh2 = bcoh;
                f103379w.put(bcoh2, new bbub(context, bcoh, bbxw, bbpl, bbpu, bdal, bbpf, bbpv, bbsi, bbqx, new bbqz(), map));
            }
            bbub = (bbub) f103379w.get(bcoh2);
        }
        return bbub;
    }

    /* renamed from: c */
    public static synchronized void m88476c() {
        synchronized (bbub.class) {
            f103379w.clear();
        }
    }

    /* renamed from: b */
    public final synchronized void mo56423b() {
        m88473a(bnhe.m109413a(this.f103380A));
        this.f103380A.clear();
    }

    /* renamed from: d */
    public final synchronized bqgg mo56426d() {
        if (!this.f103394o) {
            if (((Boolean) bbqt.m88417a(this.f103382c).f103163e.mo58455c()).booleanValue()) {
                bbqi.m88404a(((Long) bbqt.m88417a(this.f103382c).f103165g.mo58455c()).longValue(), new bbti(this), this.f103387h);
            }
            return mo56427e();
        } else if (!((Boolean) bbqt.m88417a(this.f103382c).f103162d.mo58455c()).booleanValue()) {
            return bqga.m112775a((Object) null);
        } else {
            return bbqi.m88404a(((Long) bbqt.m88417a(this.f103382c).f103166h.mo58455c()).longValue(), new bbsx(this), this.f103387h);
        }
    }

    /* renamed from: e */
    public final bqgg mo56427e() {
        bcei c = bcej.m88869c();
        c.f104034a = "pull once";
        c.mo56735a(bcen.f104044e);
        bqgg a = bqga.m112771a(new bbtq(this, c.mo56734a()), this.f103387h);
        return bqga.m112783b(bqdf.m112619a(bqdx.m112674a(a, new bbtr(this), this.f103387h), Exception.class, bbts.f103362a, bqfb.INSTANCE), bqdf.m112619a(bqdx.m112673a(a, new bbtt(this), this.f103387h), Exception.class, bbtu.f103364a, bqfb.INSTANCE)).mo69214a(new bbtv(this, a), bqfb.INSTANCE);
    }

    /* renamed from: f */
    public final synchronized bqgg mo56428f() {
        if (!this.f103396q) {
            if (!this.f103394o) {
                this.f103396q = true;
                this.f103395p = false;
                this.f103389j.mo56343a(1);
                bbua bbua = new bbua(this);
                bcei c = bcej.m88869c();
                c.f104034a = "stream open";
                c.mo56735a(bcen.f104044e);
                return bqga.m112783b(bqga.m112786c(bqga.m112771a(new bbtw(this, bbua, c.mo56734a()), this.f103387h)).mo69216a(new bbtx(this, bbua), bqfb.INSTANCE)).mo69216a(new bbsy(this), bqfb.INSTANCE);
            }
        }
        return bqga.m112775a((Object) null);
    }

    /* renamed from: g */
    public final synchronized void mo56429g() {
        bcjk bcjk;
        ciik ciik;
        if (this.f103394o) {
            bbua bbua = this.f103397r;
            if (!(bbua == null || (bcjk = bbua.f103377b) == null || (ciik = bcjk.f104325a.f104329d) == null)) {
                ciik.f190404a.mo70031a("", chuv.f189216c.mo85693c());
            }
            mo56431i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo56430h() {
        if (chqc.f188988a.mo6606a().mo85529d() || (((Boolean) bbqt.m88417a(this.f103382c).f103138ag.mo58455c()).booleanValue() && chqc.f188988a.mo6606a().mo85527b())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final synchronized void mo56431i() {
        this.f103397r = null;
        this.f103394o = false;
        this.f103395p = true;
        String valueOf = String.valueOf(this.f103381b.mo57058b().mo57074e().mo60492a());
        bbos.m88289a("MsgReceiver", valueOf.length() == 0 ? new String("BindV2 stream closed for ") : "BindV2 stream closed for ".concat(valueOf));
    }

    /* renamed from: j */
    public final synchronized void mo56432j() {
        this.f103391l.mo56380a();
        mo56428f();
    }

    /* renamed from: b */
    public final void mo56424b(List list) {
        if (((Boolean) bbqt.m88417a(this.f103382c).f103085G.mo58455c()).booleanValue() && ((Boolean) bbqt.m88417a(this.f103382c).f103087I.mo58455c()).booleanValue()) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bcia bcia = (bcia) it.next();
                int l = bcia.mo56918l();
                int i = l - 1;
                if (l == 0) {
                    throw null;
                } else if (i == 0) {
                    if (!hashMap.containsKey(bcia.mo56912e().mo57361c())) {
                        hashMap.put(bcia.mo56912e().mo57361c(), new HashSet());
                    }
                    ((Set) hashMap.get(bcia.mo56912e().mo57361c())).add(bcia.mo56912e().mo57359a());
                }
            }
            if (((Long) bbqt.m88417a(this.f103382c).f103184z.mo58455c()).longValue() > 0) {
                synchronized (this) {
                    if (this.f103380A.isEmpty() && !hashMap.isEmpty()) {
                        this.f103398s.postDelayed(new bbtb(this), ((Long) bbqt.m88417a(this.f103382c).f103184z.mo58455c()).longValue());
                    }
                    for (ConversationId conversationId : hashMap.keySet()) {
                        if (this.f103380A.containsKey(conversationId)) {
                            ((Set) this.f103380A.get(conversationId)).addAll((Collection) hashMap.get(conversationId));
                        } else {
                            this.f103380A.put(conversationId, (Set) hashMap.get(conversationId));
                        }
                    }
                }
                return;
            }
            m88473a(hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo56425c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo56418a((bcia) it.next());
        }
        mo56424b(list);
    }

    /* renamed from: a */
    private final void m88473a(Map map) {
        bcei c = bcej.m88869c();
        c.f104034a = "delivery receipt";
        c.mo56735a(bcen.f104044e);
        bcej a = c.mo56734a();
        for (ConversationId conversationId : map.keySet()) {
            this.f103384e.mo56608a(bdbd.m90523a(conversationId)).mo57830c(new bbta(this, conversationId, map, a));
        }
    }

    /* renamed from: a */
    private final boolean m88474a(bchw bchw) {
        bmxv bmxv;
        bqgy c = bqgy.m112818c();
        this.f103384e.mo56610a(bchw.mo56864e()).mo57830c(new bbtg(c));
        try {
            bmxv bmxv2 = (bmxv) c.get();
            if (bmxv2.mo66813a()) {
                bcsp bcsp = (bcsp) bmxv2.mo66814b();
                if (!bcsp.mo57317a().mo60556c().equals(ConversationId.IdType.ONE_TO_ONE)) {
                    byte[] bArr = (byte[]) bcsp.mo57325i().get("Lighter");
                    if (bArr != null) {
                        try {
                            cbdp cbdp = (cbdp) bxvk.m124007a(cbdp.f176766e, ((bxte) bxvk.m124014a(bxte.f164763c, bArr)).f164766b);
                            HashSet hashSet = new HashSet();
                            for (cbds cbds : cbdp.f176771d) {
                                hashSet.add(bclk.m89246a(cbds));
                            }
                            bchn bchn = new bchn();
                            String str = cbdp.f176768a;
                            if (str != null) {
                                bchn.f104166a = str;
                                bchn.f104168c = Boolean.valueOf(cbdp.f176770c);
                                bchn.f104167b = Boolean.valueOf(cbdp.f176769b);
                                bchn.f104169d = hashSet;
                                String str2 = "";
                                if (bchn.f104166a == null) {
                                    str2 = " handlerId";
                                }
                                if (bchn.f104167b == null) {
                                    str2 = str2.concat(" supportsBlocking");
                                }
                                if (bchn.f104168c == null) {
                                    str2 = String.valueOf(str2).concat(" isBlocked");
                                }
                                if (bchn.f104169d == null) {
                                    str2 = String.valueOf(str2).concat(" importantParticipants");
                                }
                                if (str2.isEmpty()) {
                                    bmxv = bmxv.m108566b(new bcgv(bchn.f104166a, bchn.f104167b.booleanValue(), bchn.f104168c.booleanValue(), bchn.f104169d));
                                } else {
                                    String valueOf = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                }
                            } else {
                                throw new NullPointerException("Null handlerId");
                            }
                        } catch (bxwf e) {
                            bbos.m88292b("GroupMetadataProtos", "Conversation had invalid lighter app data", e);
                            bmxv = bmvz.f131120a;
                        }
                    } else {
                        bmxv = bmvz.f131120a;
                    }
                    if (!bmxv.mo66813a() || ((bcho) bmxv.mo66814b()).mo56837d().contains(bchw.mo56863d())) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            String valueOf2 = String.valueOf(bchw.mo56864e());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb.append("Received receipt for unknown conversation ");
            sb.append(valueOf2);
            bbos.m88293c("MsgReceiver", sb.toString());
            return false;
        } catch (Exception e2) {
            bbos.m88292b("MsgReceiver", "Unexpected exception", e2);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m88475a(ConversationId conversationId, long j) {
        bqgy c = bqgy.m112818c();
        this.f103384e.mo56610a(conversationId).mo57830c(new bbtc(j, c));
        try {
            return ((Boolean) c.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88292b("MsgReceiver", "Error determining if message should be dropped, won't drop", e);
            return false;
        }
    }

    /* renamed from: a */
    public final bqgg mo56416a(List list) {
        if (list.isEmpty()) {
            return bqga.m112775a((Object) null);
        }
        bcei c = bcej.m88869c();
        c.f104034a = "ack messages";
        c.mo56735a(bcen.f104044e);
        return bqga.m112771a(new bbsz(this, list, c.mo56734a()), this.f103387h);
    }

    /* renamed from: a */
    public final synchronized void mo56417a() {
        mo56416a(bngx.m109368a((Collection) this.f103393n));
        this.f103393n.clear();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbub.a(bcia, boolean):void
     arg types: [bcia, int]
     candidates:
      bbub.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):boolean
      bbub.a(com.google.android.libraries.messaging.lighter.model.ConversationId, com.google.android.libraries.messaging.lighter.model.ContactId):void
      bbub.a(bcia, boolean):void */
    /* renamed from: a */
    public final void mo56418a(bcia bcia) {
        boolean z;
        if (bbqe.m88387a(this.f103382c).mo56358b()) {
            int l = bcia.mo56918l();
            int i = l - 1;
            if (l != 0) {
                if (i == 0) {
                    z = m88475a(bcia.mo56912e().mo57361c(), bcia.mo56912e().mo57362d().longValue());
                } else if (i == 4 && bcia.mo56916i().mo56886c() == 1) {
                    z = m88475a(bcia.mo56916i().mo56885b().mo56825a(), bcia.mo56916i().mo56885b().mo56826b());
                }
                if (z) {
                    int l2 = bcia.mo56918l();
                    String a = bchy.m89084a(l2);
                    if (l2 != 0) {
                        bbos.m88289a("MsgReceiver", a.length() == 0 ? new String("dropping message of type ") : "dropping message of type ".concat(a));
                        bcnr q = bcns.m89409q();
                        q.mo57011b(15);
                        q.mo57012b(this.f103381b.mo57058b().mo57074e());
                        q.mo57010a(this.f103381b.mo57059c().mo73781l());
                        q.mo57003a(58);
                        if (bcia.mo56917j() != null) {
                            q.mo57008a(bcia.mo56917j());
                        }
                        this.f103390k.mo56753a(q.mo57002a());
                        return;
                    }
                    throw null;
                }
            } else {
                throw null;
            }
        }
        int l3 = bcia.mo56918l();
        int i2 = l3 - 1;
        if (l3 == 0) {
            throw null;
        } else if (i2 == 0) {
            mo56419a(bcia, true);
        } else if (i2 == 1) {
            bchu f = bcia.mo56913f();
            int b = f.mo56856b().mo56762b();
            int i3 = b - 1;
            if (b == 0) {
                throw null;
            } else if (i3 == 0) {
                if (f.mo56899c().mo56811b()) {
                    this.f103385f.mo56301a(this.f103381b);
                }
                if (f.mo56899c().mo56810a().mo66813a() && f.mo56899c().mo56812c().mo66813a()) {
                    bbqx bbqx = this.f103403y;
                    bcoh bcoh = this.f103381b;
                    ConversationId conversationId = (ConversationId) f.mo56899c().mo56810a().mo66814b();
                    bbwq bbwq = (bbwq) bbqx;
                    bbwq.mo56473c(bcoh).mo56610a(conversationId).mo57830c(new bbwg(bbwq, conversationId, (bchq) f.mo56899c().mo56812c().mo66814b(), bcoh));
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    this.f103384e.mo56630a(f.mo56900d().mo56754a(), f.mo56900d().mo56755b().mo56830a());
                } else if (i3 == 3) {
                    this.f103384e.mo56647b(f.mo56901e().mo56754a(), f.mo56901e().mo56755b().mo56830a());
                } else if (i3 == 4) {
                    this.f103384e.mo56642b(f.mo56902f().mo56820a());
                    if (f.mo56902f().mo56821b().mo66813a()) {
                        this.f103384e.mo56630a(f.mo56902f().mo56820a().mo57317a(), ((bchm) f.mo56902f().mo56821b().mo66814b()).mo56830a());
                    }
                    this.f103385f.mo56301a(this.f103381b);
                }
            } else if (f.mo56856b().mo56766c().mo56806a()) {
                this.f103385f.mo56301a(this.f103381b);
            }
        } else if (i2 == 2) {
            bchw g = bcia.mo56914g();
            if (g.mo56860a() == 0 && ((Boolean) bbqt.m88417a(this.f103382c).f103085G.mo58455c()).booleanValue()) {
                if (m88474a(g)) {
                    this.f103384e.mo56631a(g.mo56864e(), g.mo56862c(), Arrays.asList(bctk.f104865h, bctk.f104863f), bctk.f104866i);
                    for (String str : g.mo56862c()) {
                        bcfx bcfx = this.f103390k;
                        bcnr q2 = bcns.m89409q();
                        q2.mo57011b(22);
                        q2.mo57012b(this.f103381b.mo57058b().mo57074e());
                        q2.mo57010a(this.f103381b.mo57059c().mo73781l());
                        q2.mo57013b(str);
                        q2.mo57008a(g.mo56864e());
                        bcfx.mo56753a(q2.mo57002a());
                    }
                }
                bcfx bcfx2 = this.f103390k;
                bcnr q3 = bcns.m89409q();
                q3.mo57011b(16);
                q3.mo57012b(this.f103381b.mo57058b().mo57074e());
                q3.mo57010a(this.f103381b.mo57059c().mo73781l());
                q3.mo57013b(g.mo56861b());
                q3.mo57008a(g.mo56864e());
                bcfx2.mo56753a(q3.mo57002a());
            } else if (g.mo56860a() == 1 && ((Boolean) bbqt.m88417a(this.f103382c).f103088J.mo58455c()).booleanValue()) {
                if (m88474a(g)) {
                    this.f103384e.mo56631a(g.mo56864e(), g.mo56862c(), Arrays.asList(bctk.f104866i, bctk.f104865h, bctk.f104863f), bctk.f104867j);
                    this.f103384e.mo56631a(g.mo56864e(), g.mo56862c(), Arrays.asList(bctk.f104860c, bctk.f104859b), bctk.f104861d);
                    for (String str2 : g.mo56862c()) {
                        bcfx bcfx3 = this.f103390k;
                        bcnr q4 = bcns.m89409q();
                        q4.mo57011b(44);
                        q4.mo57012b(this.f103381b.mo57058b().mo57074e());
                        q4.mo57010a(this.f103381b.mo57059c().mo73781l());
                        q4.mo57013b(str2);
                        q4.mo57008a(g.mo56864e());
                        bcfx3.mo56753a(q4.mo57002a());
                    }
                }
                bcfx bcfx4 = this.f103390k;
                bcnr q5 = bcns.m89409q();
                q5.mo57011b(17);
                q5.mo57012b(this.f103381b.mo57058b().mo57074e());
                q5.mo57010a(this.f103381b.mo57059c().mo73781l());
                q5.mo57013b(g.mo56861b());
                q5.mo57008a(g.mo56864e());
                bcfx4.mo56753a(q5.mo57002a());
            } else if (g.mo56860a() == 2 && ((Boolean) bbqt.m88417a(this.f103382c).f103086H.mo58455c()).booleanValue()) {
                this.f103384e.mo56631a(g.mo56864e(), g.mo56862c(), Arrays.asList(bctk.f104866i, bctk.f104865h, bctk.f104863f), bctk.f104868k);
                for (String str3 : g.mo56862c()) {
                    bcfx bcfx5 = this.f103390k;
                    bcnr q6 = bcns.m89409q();
                    q6.mo57011b(45);
                    q6.mo57012b(this.f103381b.mo57058b().mo57074e());
                    q6.mo57010a(this.f103381b.mo57059c().mo73781l());
                    q6.mo57013b(str3);
                    q6.mo57008a(g.mo56864e());
                    bcfx5.mo56753a(q6.mo57002a());
                }
                bcfx bcfx6 = this.f103390k;
                bcnr q7 = bcns.m89409q();
                q7.mo57011b(21);
                q7.mo57012b(this.f103381b.mo57058b().mo57074e());
                q7.mo57010a(this.f103381b.mo57059c().mo73781l());
                q7.mo57013b(g.mo56861b());
                q7.mo57008a(g.mo56864e());
                bcfx6.mo56753a(q7.mo57002a());
            }
            this.f103398s.post(new bbth(this, g));
        } else if (i2 == 3) {
            bcic h = bcia.mo56915h();
            if (mo56430h()) {
                bdak.m90446a(this.f103384e.mo56608a(bdbd.m90523a(h.mo56876b())), bbtj.f103343a).mo57830c(new bbtk(this, h));
            }
        } else if (i2 == 4) {
            bchh i4 = bcia.mo56916i();
            if (i4.mo56886c() == 1) {
                bbsi bbsi = this.f103402x;
                bcoh bcoh2 = this.f103381b;
                bchk b2 = i4.mo56885b();
                bbsi.f103295a.mo56561a(bcoh2).mo56627a(b2.mo56825a(), b2.mo56826b());
                return;
            }
            int c = i4.mo56886c();
            String str4 = c != 1 ? "null" : "DELETE_CONVERSATION";
            if (c != 0) {
                bbos.m88293c("MsgReceiver", str4.length() == 0 ? new String("Unsupported cloudUpdate type : ") : "Unsupported cloudUpdate type : ".concat(str4));
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo56419a(bcia bcia, boolean z) {
        bctr e = bcia.mo56912e();
        bcfx bcfx = this.f103390k;
        bcnr q = bcns.m89409q();
        q.mo57011b(3);
        q.mo57012b(this.f103381b.mo57058b().mo57074e());
        q.mo57010a(this.f103381b.mo57059c().mo73781l());
        q.mo57013b(e.mo57359a());
        q.mo57008a(e.mo57361c());
        bcnz bcnz = new bcnz(null);
        bcnz.f104600a = bmxv.m108566b(Integer.valueOf(e.mo57372l()));
        bcnz.f104601b = bmxv.m108566b(Integer.valueOf(e.mo57371k().mo57200a().f104888h));
        q.f104572a = bmxv.m108566b(new bcny(bcnz.f104600a, bcnz.f104601b));
        bcfx.mo56753a(q.mo57002a());
        int a = e.mo57365f().mo57180a();
        if (a != 0) {
            if (a == 3 && this.f103404z.containsKey(e.mo57365f().mo57184b().mo57379a())) {
                ((bclf) this.f103404z.get(e.mo57365f().mo57184b().mo57379a())).mo56974a(this.f103381b, e, this.f103390k);
            }
            if (this.f103384e.mo56636a(e.mo57359a())) {
                bbos.m88289a("MsgReceiver", "Already handled message.");
            } else {
                new bdah(bbqt.m88418a(bbqt.m88417a(this.f103382c).f103083E, this.f103387h), new bbtd(this, z, e), this.f103387h).mo57830c(new bbte(this, bcia, e));
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo56420a(bctr bctr) {
        if (bctr.mo57371k().mo57200a() == bctq.f104881b) {
            this.f103384e.mo56623a(bctr);
        } else {
            this.f103384e.mo56643b(bctr);
        }
    }

    /* renamed from: a */
    public final void mo56421a(bcuu bcuu) {
        if (((Boolean) this.f103384e.mo56605a(bcuu).second).booleanValue()) {
            this.f103392m.remove(bcuu.mo57417b());
            bcfx bcfx = this.f103390k;
            bcnr q = bcns.m89409q();
            q.mo57011b(10021);
            q.mo57012b(this.f103381b.mo57058b().mo57074e());
            q.mo57010a(this.f103381b.mo57059c().mo73781l());
            q.mo57013b(bcuu.mo57417b());
            bcfx.mo56753a(q.mo57002a());
        }
    }

    /* renamed from: a */
    public final void mo56422a(ConversationId conversationId, ContactId contactId) {
        if (this.f103400u.containsKey(conversationId)) {
            ((Map) this.f103400u.get(conversationId)).remove(contactId);
            if (((Map) this.f103400u.get(conversationId)).isEmpty()) {
                this.f103400u.remove(conversationId);
            }
        }
    }
}
