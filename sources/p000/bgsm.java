package p000;

import android.content.Context;
import android.location.Location;
import android.os.Message;
import java.util.Random;

/* renamed from: bgsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgsm extends bgtf {

    /* renamed from: a */
    private final Context f117434a;

    /* renamed from: b */
    private final Random f117435b;

    /* renamed from: c */
    private final bgsp f117436c;

    /* renamed from: d */
    private bgpo f117437d;

    /* renamed from: e */
    private long f117438e;

    static {
        srn.m36125a("EAlert");
    }

    public bgsm(Context context, Random random, bgsp bgsp) {
        super("EANotification");
        this.f117434a = context;
        this.f117435b = random;
        this.f117436c = bgsp;
    }

    /* renamed from: a */
    private final void m99859a(long j) {
        if (!this.f117482h.f117486b.hasMessages(7)) {
            this.f117482h.f117486b.mo63149a(7, null, j);
        }
    }

    /* renamed from: c */
    private final long m99860c() {
        Location d = this.f117436c.mo63133d();
        if (d != null) {
            return ayvd.m84899a(ayvd.m84895a(d.getLatitude(), d.getLongitude()), (int) cevi.m138297l());
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo63113b() {
        bgpo bgpo = this.f117437d;
        if (bgpo != null) {
            bgpo.mo63076b();
            this.f117437d = null;
        }
    }

    /* renamed from: a */
    public final void mo63111a() {
        bgpo bgpo = new bgpo(this.f117434a);
        this.f117437d = bgpo;
        bgpo.mo63074a();
        this.f117438e = cevi.f183455a.mo6606a().notificationLogBaseOffsetMillis() + ((long) this.f117435b.nextInt((int) cevi.f183455a.mo6606a().notificationLogWindowMillis()));
        if (cevi.f183455a.mo6606a().enableAlertExperimentCheckin()) {
            m99859a(0);
        }
        mo63145e();
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        int i = message.what;
        if (i == 4) {
            if (cevi.m138289d()) {
                this.f117482h.f117486b.mo63149a(5, message.getData(), this.f117438e);
            }
            return true;
        } else if (i == 5) {
            long j = message.getData().getLong("t");
            int a = bgsf.m99841a(this.f117434a);
            String b = bgsf.m99842b(this.f117434a);
            bgpo bgpo = this.f117437d;
            long c = m99860c();
            long j2 = this.f117438e;
            int i2 = bgpo.f117206d;
            bsax bsax = new bsax(bgox.f117137r);
            bsax.mo70106a(1, j);
            bsax.mo70105a(3, a);
            if (!bmxx.m108577a(b)) {
                bsax.mo70107a(4, b);
            }
            bsax.mo70105a(5, 0);
            bsax.mo70106a(6, c);
            bsax.mo70106a(8, j2);
            bsax bsax2 = new bsax(bgox.f117133n);
            bsax2.mo70118b(3, bsax);
            bgpo.mo63075a(bgpo.m99709a(bsax2, null));
            return true;
        } else if (i != 7) {
            return false;
        } else {
            int a2 = bgsf.m99841a(this.f117434a);
            String b2 = bgsf.m99842b(this.f117434a);
            bgpo bgpo2 = this.f117437d;
            long c2 = m99860c();
            int i3 = bgpo.f117206d;
            bsax bsax3 = new bsax(bgox.f117138s);
            bsax3.mo70106a(1, c2);
            bsax3.mo70105a(2, a2);
            if (!bmxx.m108577a(b2)) {
                bsax3.mo70107a(3, b2);
            }
            bsax bsax4 = new bsax(bgox.f117133n);
            bsax4.mo70118b(5, bsax3);
            bgpo2.mo63075a(bgpo.m99709a(bsax4, null));
            m99859a(cevi.f183455a.mo6606a().alertExperimentCheckinIntervalMillis());
            return true;
        }
    }
}
