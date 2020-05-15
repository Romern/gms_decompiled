package p000;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pjx extends pil {

    /* renamed from: c */
    public static final qav f39400c = new qav("CSC");

    /* renamed from: d */
    public final pmx f39401d;

    /* renamed from: e */
    final pim f39402e;

    /* renamed from: f */
    Future f39403f;

    /* renamed from: g */
    pjc f39404g;

    /* renamed from: h */
    public pmw f39405h;

    /* renamed from: i */
    public String f39406i;

    /* renamed from: j */
    public boolean f39407j;

    /* renamed from: k */
    public final Set f39408k = new HashSet();

    /* renamed from: l */
    public final pim f39409l;

    /* renamed from: m */
    public final boolean f39410m;

    /* renamed from: n */
    String f39411n;

    /* renamed from: o */
    String f39412o;

    /* renamed from: p */
    int f39413p;

    /* renamed from: q */
    private final piy f39414q;

    public pjx(CastDevice castDevice, pim pim, ScheduledExecutorService scheduledExecutorService, pmx pmx, piy piy) {
        super(castDevice, scheduledExecutorService);
        this.f39401d = pmx;
        this.f39414q = piy;
        this.f39409l = pim;
        this.f39402e = new pim(pim.f39232a, pim.f39233b, pim.f39234c, pim.f39235d, new pjw(this));
        this.f39413p = 1;
        this.f39410m = pin.m30484a(this.f39230a, this.f39409l, pmx);
    }

    /* renamed from: b */
    private final void m30610b(CastDevice castDevice, String str) {
        pjc a = this.f39414q.mo23232a(castDevice, str, this.f39402e);
        this.f39404g = a;
        a.f39276E = new pjv(this);
    }

    /* renamed from: a */
    public final void mo23198a() {
        pnt d;
        f39400c.mo23861b("connect to device");
        mo23286h();
        mo23287i();
        CastDevice castDevice = null;
        if (this.f39410m) {
            pnu c = this.f39401d.mo23464c(this.f39230a.mo17494a());
            if (!(c == null || (d = this.f39401d.mo23465d(c.f39887j)) == null)) {
                castDevice = d.f39878a;
            }
        } else {
            castDevice = this.f39230a;
        }
        if (castDevice == null) {
            this.f39413p = 1;
            this.f39409l.f39236e.mo23181a(2017);
            return;
        }
        m30610b(castDevice, castDevice.f29723k);
        this.f39404g.mo23198a();
        this.f39413p = 2;
    }

    /* renamed from: b */
    public final boolean mo23211b() {
        return this.f39413p == 3;
    }

    /* renamed from: c */
    public final void mo23212c(String str) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23212c(str);
        }
    }

    /* renamed from: c */
    public final boolean mo23213c() {
        return this.f39413p == 2;
    }

    /* renamed from: d */
    public final boolean mo23214d() {
        return this.f39413p == 4;
    }

    /* renamed from: e */
    public final void mo23215e() {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23215e();
        }
    }

    /* renamed from: f */
    public final void mo23216f() {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23216f();
        }
    }

    /* renamed from: g */
    public final String mo23217g() {
        pjc pjc = this.f39404g;
        if (pjc == null) {
            return "CSC";
        }
        String valueOf = String.valueOf(pjc.mo23217g());
        return valueOf.length() == 0 ? new String("CSC|") : "CSC|".concat(valueOf);
    }

    /* renamed from: h */
    public final void mo23286h() {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23262p();
            pjc pjc2 = this.f39404g;
            pjc2.f39276E = null;
            pjc2.mo23207a(false);
            this.f39404g = null;
        }
    }

    /* renamed from: i */
    public final void mo23287i() {
        Future future = this.f39403f;
        if (future != null) {
            future.cancel(false);
            this.f39403f = null;
        }
    }

    /* renamed from: j */
    public final void mo23288j() {
        f39400c.mo23856a("Disposing the controller for %s", this.f39230a);
        mo23286h();
        mo23287i();
        mo23289k();
        this.f39413p = 1;
    }

    /* renamed from: k */
    public final void mo23289k() {
        String str = this.f39412o;
        if (str != null) {
            this.f39401d.mo23456a(str, this);
        }
        this.f39412o = null;
        this.f39411n = null;
    }

    /* renamed from: b */
    public final void mo23210b(String str) {
        this.f39408k.remove(str);
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23210b(str);
        }
    }

    /* renamed from: a */
    public final void mo23284a(int i) {
        mo23289k();
        this.f39413p = 1;
        this.f39409l.f39236e.mo23195c(i);
        mo23288j();
    }

    /* renamed from: a */
    public final void mo23285a(CastDevice castDevice, String str) {
        m30610b(castDevice, str);
        this.f39404g.mo23198a();
    }

    /* renamed from: a */
    public final void mo23199a(EqualizerSettings equalizerSettings) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23199a(equalizerSettings);
        }
    }

    /* renamed from: a */
    public final void mo23200a(String str) {
        this.f39408k.add(str);
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23200a(str);
        }
    }

    /* renamed from: a */
    public final void mo23201a(String str, LaunchOptions launchOptions) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23201a(str, launchOptions);
        }
    }

    /* renamed from: a */
    public final void mo23202a(String str, String str2) {
        f39400c.mo23861b("reconnect to device");
        throw new UnsupportedOperationException("CastSessionController.reconnectToDevice() should never be called.");
    }

    /* renamed from: a */
    public final void mo23203a(String str, String str2, long j) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23203a(str, str2, j);
        }
    }

    /* renamed from: a */
    public final void mo23204a(String str, String str2, long j, String str3) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23204a(str, str2, j, str3);
        }
    }

    /* renamed from: a */
    public final void mo23205a(String str, String str2, JoinOptions joinOptions) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23205a(str, str2, joinOptions);
        }
    }

    /* renamed from: a */
    public final void mo23206a(String str, byte[] bArr, long j) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23206a(str, bArr, j);
        }
    }

    /* renamed from: a */
    public final void mo23207a(boolean z) {
        f39400c.mo23861b("disconnect from device");
        pjc pjc = this.f39404g;
        if (pjc != null) {
            pjc.mo23207a(z);
        }
        this.f39413p = 1;
    }

    /* renamed from: a */
    public final boolean mo23208a(double d, double d2, boolean z) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            return pjc.mo23208a(d, d2, z);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo23209a(boolean z, double d, boolean z2) {
        pjc pjc = this.f39404g;
        if (pjc != null) {
            return pjc.mo23209a(z, d, z2);
        }
        return false;
    }
}
