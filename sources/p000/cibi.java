package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cibi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibi implements chsd, ciff {

    /* renamed from: a */
    public final cibb f189710a;

    /* renamed from: b */
    public final ScheduledExecutorService f189711b;

    /* renamed from: c */
    public final chsc f189712c;

    /* renamed from: d */
    public final chqq f189713d;

    /* renamed from: e */
    public final chvc f189714e;

    /* renamed from: f */
    public final cibc f189715f;

    /* renamed from: g */
    public volatile List f189716g;

    /* renamed from: h */
    public final bmza f189717h;

    /* renamed from: i */
    public chvb f189718i;

    /* renamed from: j */
    public final Collection f189719j = new ArrayList();

    /* renamed from: k */
    public final cian f189720k = new ciap(this);

    /* renamed from: l */
    public chyc f189721l;

    /* renamed from: m */
    public volatile cidb f189722m;

    /* renamed from: n */
    public volatile chrh f189723n = chrh.m149449a(chrg.IDLE);

    /* renamed from: o */
    public chuv f189724o;

    /* renamed from: p */
    public chzq f189725p;

    /* renamed from: q */
    private final chse f189726q;

    /* renamed from: r */
    private final String f189727r;

    /* renamed from: s */
    private final String f189728s;

    /* renamed from: t */
    private final chxx f189729t;

    /* renamed from: u */
    private final chxf f189730u;

    public cibi(List list, String str, String str2, chxx chxx, ScheduledExecutorService scheduledExecutorService, chvc chvc, cibb cibb, chsc chsc, chxf chxf, chxh chxh, chse chse, chqq chqq) {
        bmxy.m108582a(list, "addressGroups");
        bmxy.m108589a(!list.isEmpty(), "addressGroups is empty");
        m149956a(list, "addressGroups contains null entry");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f189716g = unmodifiableList;
        this.f189715f = new cibc(unmodifiableList);
        this.f189727r = str;
        this.f189728s = str2;
        this.f189729t = chxx;
        this.f189711b = scheduledExecutorService;
        this.f189717h = bmza.m108656a();
        this.f189714e = chvc;
        this.f189710a = cibb;
        this.f189712c = chsc;
        this.f189730u = chxf;
        bmxy.m108582a(chxh, "channelTracer");
        bmxy.m108582a(chse, "logId");
        this.f189726q = chse;
        bmxy.m108582a(chqq, "channelLogger");
        this.f189713d = chqq;
    }

    /* renamed from: b */
    public static final String m149957b(chuv chuv) {
        StringBuilder sb = new StringBuilder();
        sb.append(chuv.f189233s);
        if (chuv.f189234t != null) {
            sb.append("(");
            sb.append(chuv.f189234t);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final chse mo85595b() {
        return this.f189726q;
    }

    /* renamed from: c */
    public final void mo85900c() {
        boolean z;
        chrw chrw;
        this.f189714e.mo85705b();
        if (this.f189718i == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Should have no reconnectTask scheduled");
        cibc cibc = this.f189715f;
        if (cibc.f189700b == 0 && cibc.f189701c == 0) {
            bmza bmza = this.f189717h;
            bmza.mo66929c();
            bmza.mo66930d();
        }
        SocketAddress b = this.f189715f.mo85887b();
        if (b instanceof chrw) {
            chrw chrw2 = (chrw) b;
            chrw = chrw2;
            b = chrw2.f189064b;
        } else {
            chrw = null;
        }
        cibc cibc2 = this.f189715f;
        chqh chqh = ((chrq) cibc2.f189699a.get(cibc2.f189700b)).f189053c;
        String str = (String) chqh.mo85534a(chrq.f189051a);
        chxw chxw = new chxw();
        if (str == null) {
            str = this.f189727r;
        }
        bmxy.m108582a(str, "authority");
        chxw.f189498a = str;
        bmxy.m108582a(chqh, "eagAttributes");
        chxw.f189499b = chqh;
        chxw.f189500c = this.f189728s;
        chxw.f189501d = chrw;
        cibh cibh = new cibh();
        cibh.f189709a = this.f189726q;
        ciba ciba = new ciba(this.f189729t.mo85713a(b, chxw, cibh), this.f189730u);
        cibh.f189709a = ciba.mo85595b();
        chsc.m149477a(this.f189712c.f189085e, ciba);
        this.f189721l = ciba;
        this.f189719j.add(ciba);
        Runnable a = ciba.mo85745a(new cibg(this, ciba));
        if (a != null) {
            this.f189714e.mo85704a(a);
        }
        this.f189713d.mo85553a(2, "Started transport {0}", cibh.f189709a);
    }

    /* renamed from: d */
    public final void mo85901d() {
        this.f189714e.execute(new ciav(this));
    }

    /* renamed from: e */
    public final void mo85902e() {
        this.f189714e.mo85705b();
        chvb chvb = this.f189718i;
        if (chvb != null) {
            chvb.mo85700a();
            this.f189718i = null;
            this.f189725p = null;
        }
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66884a("logId", this.f189726q.f189087a);
        a.mo66885a("addressGroups", this.f189716g);
        return a.toString();
    }

    /* renamed from: a */
    public static void m149956a(List list, String str) {
        for (Object obj : list) {
            bmxy.m108582a(obj, str);
        }
    }

    /* renamed from: a */
    public final chxv mo85895a() {
        cidb cidb = this.f189722m;
        if (cidb != null) {
            return cidb;
        }
        this.f189714e.execute(new ciar(this));
        return null;
    }

    /* renamed from: a */
    public final void mo85896a(chrg chrg) {
        this.f189714e.mo85705b();
        mo85897a(chrh.m149449a(chrg));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo85897a(chrh chrh) {
        boolean z;
        this.f189714e.mo85705b();
        if (this.f189723n.f189033a != chrh.f189033a) {
            if (this.f189723n.f189033a != chrg.SHUTDOWN) {
                z = true;
            } else {
                z = false;
            }
            String valueOf = String.valueOf(chrh);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Cannot transition out of SHUTDOWN to ");
            sb.append(valueOf);
            bmxy.m108601b(z, sb.toString());
            this.f189723n = chrh;
            cibb cibb = this.f189710a;
            cicv cicv = cibb.f189697a.f189792i;
            if (chrh.f189033a == chrg.TRANSIENT_FAILURE || chrh.f189033a == chrg.IDLE) {
                cicv.mo85961l();
            }
            bmxy.m108601b(true, (Object) "listener is null");
            cibb.f189698b.mo85992a(chrh);
        }
    }

    /* renamed from: a */
    public final void mo85898a(chuv chuv) {
        this.f189714e.execute(new ciau(this, chuv));
    }

    /* renamed from: a */
    public final void mo85899a(chyc chyc, boolean z) {
        this.f189714e.execute(new ciaw(this, chyc, z));
    }
}
