package p000;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pkd extends pil {

    /* renamed from: c */
    public static final qav f39423c = new qav("CSC_GAC");

    /* renamed from: d */
    public final pmx f39424d;

    /* renamed from: e */
    public final String f39425e;

    /* renamed from: f */
    public final String f39426f;

    /* renamed from: g */
    final pim f39427g;

    /* renamed from: h */
    Future f39428h;

    /* renamed from: i */
    public pjc f39429i;

    /* renamed from: j */
    public pmw f39430j;

    /* renamed from: k */
    public String f39431k;

    /* renamed from: l */
    public boolean f39432l;

    /* renamed from: m */
    public final Set f39433m = new HashSet();

    /* renamed from: n */
    public final Set f39434n = new HashSet();

    /* renamed from: o */
    private final piy f39435o;

    public pkd(CastDevice castDevice, CastDevice castDevice2, String str, String str2, String str3, pim pim, ScheduledExecutorService scheduledExecutorService, pmx pmx, piy piy) {
        super(castDevice, scheduledExecutorService);
        mo23293a(pim);
        this.f39424d = pmx;
        this.f39435o = piy;
        this.f39425e = str;
        this.f39426f = str2;
        this.f39427g = new pim(pim.f39232a, pim.f39233b, pim.f39234c, pim.f39235d, new pkb(this));
        m30656b(castDevice2, str3);
    }

    /* renamed from: b */
    private final void m30656b(CastDevice castDevice, String str) {
        pjc a = this.f39435o.mo23232a(castDevice, str, this.f39427g);
        this.f39429i = a;
        a.f39276E = new pka(this);
    }

    /* renamed from: a */
    public final void mo23198a() {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23198a();
        }
    }

    /* renamed from: c */
    public final void mo23212c(String str) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23212c(str);
        }
    }

    /* renamed from: d */
    public final boolean mo23214d() {
        if (this.f39428h != null) {
            return true;
        }
        pjc pjc = this.f39429i;
        if (pjc != null) {
            return pjc.mo23214d();
        }
        return false;
    }

    /* renamed from: e */
    public final void mo23215e() {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23215e();
        }
    }

    /* renamed from: f */
    public final void mo23216f() {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23216f();
        }
    }

    /* renamed from: g */
    public final String mo23217g() {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            return pjc.mo23217g();
        }
        return null;
    }

    /* renamed from: h */
    public final void mo23294h() {
        this.f39424d.mo23456a(this.f39426f, this);
        Future future = this.f39428h;
        if (future != null) {
            future.cancel(false);
            this.f39428h = null;
        }
        mo23295i();
    }

    /* renamed from: i */
    public final void mo23295i() {
        if (this.f39434n.isEmpty() && this.f39428h == null) {
            f39423c.mo23856a("Disposing the controller for %s", this.f39230a);
            mo23291a(0);
            pkc.f39419a.remove(this.f39230a.mo17494a());
            this.f39424d.mo23456a(this.f39426f, this);
        }
    }

    /* renamed from: a */
    public final void mo23291a(int i) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23262p();
            pjc pjc2 = this.f39429i;
            pjc2.f39276E = null;
            pjc2.mo23207a(false);
            this.f39429i = null;
        }
        ArrayList arrayList = new ArrayList(this.f39434n);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pim) arrayList.get(i2)).f39236e.mo23195c(i);
        }
    }

    /* renamed from: c */
    public final boolean mo23213c() {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            return pjc.mo23213c();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo23210b(String str) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23210b(str);
        }
    }

    /* renamed from: b */
    public final boolean mo23211b() {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            return pjc.mo23211b();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23292a(CastDevice castDevice, String str) {
        m30656b(castDevice, str);
        this.f39429i.mo23198a();
    }

    /* renamed from: a */
    public final void mo23199a(EqualizerSettings equalizerSettings) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23199a(equalizerSettings);
        }
    }

    /* renamed from: a */
    public final void mo23200a(String str) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23200a(str);
        }
    }

    /* renamed from: a */
    public final void mo23201a(String str, LaunchOptions launchOptions) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23201a(str, launchOptions);
        }
    }

    /* renamed from: a */
    public final void mo23202a(String str, String str2) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23202a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo23203a(String str, String str2, long j) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23203a(str, str2, j);
        }
    }

    /* renamed from: a */
    public final void mo23204a(String str, String str2, long j, String str3) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23204a(str, str2, j, str3);
        }
    }

    /* renamed from: a */
    public final void mo23205a(String str, String str2, JoinOptions joinOptions) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23205a(str, str2, joinOptions);
        }
    }

    /* renamed from: a */
    public final void mo23206a(String str, byte[] bArr, long j) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23206a(str, bArr, j);
        }
    }

    /* renamed from: a */
    public final void mo23293a(pim pim) {
        this.f39434n.add(pim);
    }

    /* renamed from: a */
    public final void mo23207a(boolean z) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            pjc.mo23207a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo23208a(double d, double d2, boolean z) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            return pjc.mo23208a(d, d2, z);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo23209a(boolean z, double d, boolean z2) {
        pjc pjc = this.f39429i;
        if (pjc != null) {
            return pjc.mo23209a(z, d, z2);
        }
        return false;
    }
}
