package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cids */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cids extends chsu {

    /* renamed from: c */
    public final chsn f189930c;

    /* renamed from: d */
    private chss f189931d;

    public cids(chsn chsn) {
        bmxy.m108582a(chsn, "helper");
        this.f189930c = chsn;
    }

    /* renamed from: a */
    public final void mo85610a() {
        chss chss = this.f189931d;
        if (chss != null) {
            chss.mo85607a();
        }
    }

    /* renamed from: a */
    public final void mo85611a(chsr chsr) {
        List list = chsr.f189108a;
        chss chss = this.f189931d;
        if (chss == null) {
            chsn chsn = this.f189930c;
            chsk chsk = new chsk();
            bmxy.m108589a(!list.isEmpty(), "addrs is empty");
            chsk.f189094a = Collections.unmodifiableList(new ArrayList(list));
            chsl chsl = new chsl(chsk.f189094a, chsk.f189095b, chsk.f189096c);
            cick cick = (cick) chsn;
            cick.f189771b.f189837l.mo85705b();
            bmxy.m108601b(!cick.f189771b.f189804B, "Channel is terminated");
            cict cict = new cict(cick.f189771b, chsl, cick);
            cido cido = new cido(this, cict);
            cict.f189792i.f189837l.mo85705b();
            bmxy.m108601b(!cict.f189789f, "already started");
            bmxy.m108601b(!cict.f189790g, "already shutdown");
            cict.f189789f = true;
            if (cict.f189792i.f189803A) {
                cict.f189792i.f189837l.execute(new cicp(cido));
            } else {
                List list2 = cict.f189784a.f189097a;
                String a = cict.f189792i.mo70054a();
                cicv cicv = cict.f189792i;
                String str = cicv.f189841p;
                chxx chxx = cicv.f189833h;
                ScheduledExecutorService a2 = chxx.mo85714a();
                chvc chvc = cict.f189792i.f189837l;
                cibb cibb = new cibb(cict, cido);
                cicv cicv2 = cict.f189792i;
                cibi cibi = new cibi(list2, a, str, chxx, a2, chvc, cibb, cicv2.f189808F, cicv2.f189816N.mo85915a(), cict.f189787d, cict.f189785b, cict.f189786c);
                chxh chxh = cict.f189792i.f189806D;
                chrx chrx = new chrx();
                chrx.f189067a = "Child Subchannel started";
                chrx.f189068b = chry.CT_INFO;
                chrx.mo85590a(cict.f189792i.f189836k.mo86026a());
                chrx.f189069c = cibi;
                chxh.mo85789a(chrx.mo85589a());
                cict.f189788e = cibi;
                cict.f189792i.f189837l.execute(new cicr(cict, cibi));
            }
            this.f189931d = cict;
            this.f189930c.mo85599a(chrg.CONNECTING, new cidp(chso.m149489a(cict)));
            cict.mo85608b();
            return;
        }
        cict cict2 = (cict) chss;
        cict2.f189792i.f189837l.mo85705b();
        cibi cibi2 = cict2.f189788e;
        bmxy.m108582a(list, "newAddressGroups");
        cibi.m149956a(list, "newAddressGroups contains null entry");
        bmxy.m108589a(true ^ list.isEmpty(), "newAddressGroups is empty");
        cibi2.f189714e.execute(new ciat(cibi2, list));
    }

    /* renamed from: a */
    public final void mo85612a(chuv chuv) {
        chss chss = this.f189931d;
        if (chss != null) {
            chss.mo85607a();
            this.f189931d = null;
        }
        this.f189930c.mo85599a(chrg.TRANSIENT_FAILURE, new cidp(chso.m149490a(chuv)));
    }
}
