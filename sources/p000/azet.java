package p000;

import android.content.Context;
import android.content.Intent;
import android.util.LruCache;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: azet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azet {

    /* renamed from: A */
    private final AtomicInteger f99181A = new AtomicInteger(1);

    /* renamed from: B */
    private ClientContext f99182B;

    /* renamed from: C */
    private ScheduledFuture f99183C;

    /* renamed from: D */
    private final Runnable f99184D = new azej(this);

    /* renamed from: a */
    public final Object f99185a = new Object();

    /* renamed from: b */
    public final azdl f99186b;

    /* renamed from: c */
    public final Context f99187c;

    /* renamed from: d */
    public final azcl f99188d;

    /* renamed from: e */
    public final azfo f99189e;

    /* renamed from: f */
    public final azcd f99190f;

    /* renamed from: g */
    public final azph f99191g;

    /* renamed from: h */
    public final azan f99192h;

    /* renamed from: i */
    public final MessagingService f99193i;

    /* renamed from: j */
    public final boolean f99194j;

    /* renamed from: k */
    public final azfx f99195k;

    /* renamed from: l */
    public final azdj f99196l;

    /* renamed from: m */
    public final azbx f99197m;

    /* renamed from: n */
    public final ConcurrentHashMap f99198n = new ConcurrentHashMap();

    /* renamed from: o */
    public final LruCache f99199o = new LruCache((int) cfeo.f183719a.mo6606a().mo81021bb());

    /* renamed from: p */
    public afjc f99200p;

    /* renamed from: q */
    public ciiv f99201q;

    /* renamed from: r */
    public boolean f99202r;

    /* renamed from: s */
    azgc f99203s;

    /* renamed from: t */
    List f99204t;

    /* renamed from: u */
    public civt f99205u = null;

    /* renamed from: v */
    public bmxv f99206v = bmvz.f131120a;

    /* renamed from: w */
    public final LocalEntityId f99207w;

    /* renamed from: x */
    private final azga f99208x;

    /* renamed from: y */
    private final Intent f99209y = new Intent("Bind connection wakelock");

    /* renamed from: z */
    private final long f99210z;

    public azet(Context context, azcl azcl, azfo azfo, azcd azcd, azdj azdj, azga azga, MessagingService messagingService, azfx azfx, azdl azdl, azan azan, LocalEntityId localEntityId) {
        this.f99193i = messagingService;
        this.f99187c = context;
        this.f99186b = azdl;
        this.f99188d = azcl;
        this.f99196l = azdj;
        this.f99189e = azfo;
        this.f99192h = azan;
        this.f99190f = azcd;
        this.f99208x = azga;
        this.f99191g = azph.m85998a(context);
        this.f99210z = cfeo.f183719a.mo6606a().mo80979am();
        this.f99194j = azos.m85957a(context);
        this.f99195k = azfx;
        this.f99197m = azbx.m85232a(this.f99187c);
        this.f99207w = localEntityId;
    }

    /* renamed from: a */
    private final void m85524a(Intent intent) {
        this.f99202r = false;
        azgc a = this.f99195k.mo54883a("end of pull timeout", this.f99210z, new azeh(this, intent));
        this.f99203s = a;
        new Object[1][0] = a;
        m85525h();
    }

    /* renamed from: h */
    private final void m85525h() {
        ScheduledFuture scheduledFuture = this.f99183C;
        if (scheduledFuture != null) {
            new Object[1][0] = Boolean.valueOf(scheduledFuture.cancel(false));
            this.f99183C = null;
        }
    }

    /* renamed from: b */
    public final void mo54845b() {
        synchronized (this.f99185a) {
            List list = this.f99204t;
            if (list != null && !list.isEmpty()) {
                mo54843a(this.f99204t);
                this.f99204t = null;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo54847c() {
        return this.f99203s != null;
    }

    /* renamed from: d */
    public final void mo54848d() {
        azgc azgc = this.f99203s;
        if (azgc != null) {
            new Object[1][0] = Boolean.valueOf(azgc.cancel(false));
            this.f99203s = null;
        }
    }

    /* renamed from: e */
    public final boolean mo54849e() {
        azct c;
        if (!this.f99186b.mo54770e() || !cfeo.m138893x() || (c = azcv.m85357a(this.f99187c).mo54699c(this.f99207w)) == null || c.f99006c >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo54850f() {
        if (this.f99186b.mo54770e()) {
            return cfeo.m138893x() && this.f99186b.mo54793o();
        }
        this.f99186b.mo54802x();
        return false;
    }

    /* renamed from: g */
    public final cbjp mo54851g() {
        bxvd da = cbjp.f177352b.mo74144da();
        int incrementAndGet = this.f99181A.incrementAndGet();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbjp) da.f164949b).f177354a = incrementAndGet;
        return (cbjp) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo54840a() {
        this.f99183C = this.f99195k.mo54884a(cfeo.f183719a.mo6606a().mo81054cf(), this.f99184D);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciiq.a(chqs, ciiv):ciiv
     arg types: [chqs, shk]
     candidates:
      ciiq.a(chqs, java.lang.Object):bqgg
      ciiq.a(chqs, java.lang.Throwable):java.lang.RuntimeException
      ciiq.a(chqs, ciiv):ciiv */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01be  */
    /* renamed from: b */
    public final void mo54846b(Intent intent, azcs azcs) {
        bxvd da;
        bxvd da2;
        azcs azcs2 = azcs;
        this.f99200p = new afjc(azfn.m85578a(cfgp.m139376b(), (int) cfeo.m138880k(), this.f99187c, cfeo.m138872c()));
        ClientContext clientContext = new ClientContext();
        this.f99182B = clientContext;
        clientContext.f30216f = "com.google.android.gms";
        if (cfec.m138765b()) {
            azoe.m85908a(this.f99187c).mo55115a(this.f99182B, this.f99207w);
        }
        this.f99191g.mo55141a(130, this.f99207w);
        try {
            afjc afjc = this.f99200p;
            ClientContext clientContext2 = this.f99182B;
            try {
                azes azes = new azes(this, azcs2, intent, afjc);
                if (afjc.f64287d == null) {
                    afjc.f64287d = chtv.m149566a(chtu.BIDI_STREAMING, "google.internal.communications.instantmessaging.v1.Messaging/Bind", ciie.m150370a(cbjt.f177365c), ciie.m150370a(cbka.f177382c));
                }
                shl shl = afjc.f64288a;
                chtv a = shl.mo25552a(afjc.f64287d);
                shk shk = new shk(shl, azes, a);
                sdo.checkIfNull(shl.f44480b, "grpc channel is null, cannot make grpc request");
                String d = shl.mo25529d(clientContext2);
                this.f99201q = ciiq.m150393a(shv.m35322a(shl.f44453i, shl.f44480b, d, shl.mo25528c(clientContext2), shl.mo25560e(clientContext2), shl.f44482d).mo70053a(a, shl.mo25551a(-1, (TimeUnit) null)), (ciiv) shk);
            } catch (VolleyError e) {
                throw new chuw(chuv.f189229p.mo85687a("IOException when getting auth token").mo85692c(e));
            } catch (RuntimeException e2) {
                throw chuv.m149608a(e2).mo85693c();
            } catch (chuw | gid e3) {
                e = e3;
                azoj.m85931a("GrpcManager", e, "Failed to open bind", new Object[0]);
                this.f99208x.mo54891a(this.f99209y);
                byte[] bArr = azcs2.f99002a;
                da = cbjt.f177365c.mo74144da();
                da2 = cbjq.f177355c.mo74144da();
                cbmo a2 = azfn.m85575a(bArr);
                if (da2.f164950c) {
                }
                a2.getClass();
                ((cbjq) da2.f164949b).f177357a = a2;
                if (cfec.m138765b()) {
                }
                if (da.f164950c) {
                }
                cbjt cbjt = (cbjt) da.f164949b;
                cbjq cbjq = (cbjq) da2.mo74062i();
                cbjq.getClass();
                cbjt.f177368b = cbjq;
                cbjt.f177367a = 4;
                this.f99191g.mo55141a(452, this.f99207w);
                this.f99201q.mo25549a((cbjt) da.mo74062i());
                m85524a(intent);
            }
        } catch (chuw | gid e4) {
            e = e4;
            azoj.m85931a("GrpcManager", e, "Failed to open bind", new Object[0]);
            this.f99208x.mo54891a(this.f99209y);
            byte[] bArr2 = azcs2.f99002a;
            da = cbjt.f177365c.mo74144da();
            da2 = cbjq.f177355c.mo74144da();
            cbmo a22 = azfn.m85575a(bArr2);
            if (da2.f164950c) {
            }
            a22.getClass();
            ((cbjq) da2.f164949b).f177357a = a22;
            if (cfec.m138765b()) {
            }
            if (da.f164950c) {
            }
            cbjt cbjt2 = (cbjt) da.f164949b;
            cbjq cbjq2 = (cbjq) da2.mo74062i();
            cbjq2.getClass();
            cbjt2.f177368b = cbjq2;
            cbjt2.f177367a = 4;
            this.f99191g.mo55141a(452, this.f99207w);
            this.f99201q.mo25549a((cbjt) da.mo74062i());
            m85524a(intent);
        }
        this.f99208x.mo54891a(this.f99209y);
        byte[] bArr22 = azcs2.f99002a;
        da = cbjt.f177365c.mo74144da();
        da2 = cbjq.f177355c.mo74144da();
        cbmo a222 = azfn.m85575a(bArr22);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a222.getClass();
        ((cbjq) da2.f164949b).f177357a = a222;
        if (cfec.m138765b()) {
            if (mo54849e()) {
                this.f99191g.mo55141a(805, this.f99207w);
                bmxv a3 = azhl.m85713a(this.f99187c).mo54927a(this.f99187c, this.f99207w, System.currentTimeMillis() * 1000);
                this.f99206v = a3;
                if (!a3.mo66813a()) {
                    this.f99191g.mo55170c(807, 39);
                } else {
                    cblf cblf = (cblf) this.f99206v.mo66814b();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cblf.getClass();
                    ((cbjq) da2.f164949b).f177358b = cblf;
                }
            }
        } else if (mo54850f()) {
            this.f99191g.mo55141a(805, this.f99207w);
            this.f99205u = null;
            if (this.f99186b.mo54733G()) {
                this.f99205u = azbw.m85223a();
            }
            bmxv a4 = azhl.m85713a(this.f99187c).mo54926a(this.f99187c, System.currentTimeMillis() * 1000, this.f99205u);
            this.f99206v = a4;
            if (!a4.mo66813a()) {
                this.f99191g.mo55170c(807, 39);
            } else {
                cblf cblf2 = (cblf) this.f99206v.mo66814b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cblf2.getClass();
                ((cbjq) da2.f164949b).f177358b = cblf2;
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbjt cbjt22 = (cbjt) da.f164949b;
        cbjq cbjq22 = (cbjq) da2.mo74062i();
        cbjq22.getClass();
        cbjt22.f177368b = cbjq22;
        cbjt22.f177367a = 4;
        this.f99191g.mo55141a(452, this.f99207w);
        this.f99201q.mo25549a((cbjt) da.mo74062i());
        m85524a(intent);
    }

    /* renamed from: a */
    public final void mo54841a(Intent intent, azcs azcs) {
        azox.m85982b();
        synchronized (this.f99185a) {
            if (this.f99201q == null) {
                mo54846b(intent, azcs);
            } else if (!mo54847c()) {
                bxvd da = cbjt.f177365c.mo74144da();
                bxvd da2 = cbjs.f177362b.mo74144da();
                cbjp g = mo54851g();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                g.getClass();
                ((cbjs) da2.f164949b).f177364a = g;
                cbjs cbjs = (cbjs) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbjt cbjt = (cbjt) da.f164949b;
                cbjs.getClass();
                cbjt.f177368b = cbjs;
                cbjt.f177367a = 6;
                this.f99191g.mo55141a(453, this.f99207w);
                this.f99201q.mo25549a((cbjt) da.mo74062i());
                m85524a(intent);
            } else {
                this.f99191g.mo55141a(457, this.f99207w);
            }
        }
    }

    /* renamed from: a */
    public final void mo54842a(String str) {
        synchronized (this.f99185a) {
            if (this.f99204t == null) {
                this.f99204t = new ArrayList();
            }
            this.f99204t.add(str);
        }
    }

    /* renamed from: a */
    public final void mo54843a(List list) {
        azox.m85982b();
        bmxy.m108581a(list);
        if (!list.isEmpty()) {
            this.f99195k.mo54885a("ack msg", new azek(this, list));
        }
    }

    /* renamed from: a */
    public final void mo54844a(boolean z) {
        azox.m85982b();
        synchronized (this.f99185a) {
            if (mo54847c()) {
                mo54848d();
            }
            m85525h();
            if (this.f99201q != null) {
                if (!z) {
                    this.f99191g.mo55141a(454, this.f99207w);
                    mo54845b();
                    ciiv ciiv = this.f99201q;
                    bxvd da = cbjt.f177365c.mo74144da();
                    bxvd da2 = cbjo.f177349b.mo74144da();
                    cbjp g = mo54851g();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    g.getClass();
                    ((cbjo) da2.f164949b).f177351a = g;
                    cbjo cbjo = (cbjo) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cbjt cbjt = (cbjt) da.f164949b;
                    cbjo.getClass();
                    cbjt.f177368b = cbjo;
                    cbjt.f177367a = 7;
                    ciiv.mo25549a((cbjt) da.mo74062i());
                }
                this.f99200p = null;
                this.f99182B = null;
                this.f99208x.mo54892b(this.f99209y);
                this.f99201q = null;
                this.f99191g.mo55141a(461, this.f99207w);
            }
        }
    }
}
