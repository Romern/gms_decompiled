package p000;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pvq extends aky implements pvw {

    /* renamed from: a */
    private static final int f40373a = ((int) cdaa.f180362a.mo6606a().mo77158g());

    /* renamed from: b */
    private static final AtomicInteger f40374b = new AtomicInteger(0);

    /* renamed from: A */
    public boolean f40375A;

    /* renamed from: B */
    public boolean f40376B;

    /* renamed from: C */
    public pwb f40377C;

    /* renamed from: D */
    public ScheduledFuture f40378D;

    /* renamed from: n */
    protected final qav f40379n = new qav("CastRouteController");

    /* renamed from: o */
    public final Context f40380o;

    /* renamed from: p */
    public final CastDevice f40381p;

    /* renamed from: q */
    public final pvv f40382q;

    /* renamed from: r */
    public final pmx f40383r;

    /* renamed from: s */
    public final ScheduledExecutorService f40384s;

    /* renamed from: t */
    public final String f40385t;

    /* renamed from: u */
    public double f40386u;

    /* renamed from: v */
    public final boolean f40387v;

    /* renamed from: w */
    public pjc f40388w;

    /* renamed from: x */
    public double f40389x;

    /* renamed from: y */
    public String f40390y;

    /* renamed from: z */
    public String f40391z;

    public pvq(Context context, CastDevice castDevice, ScheduledExecutorService scheduledExecutorService, pvv pvv, pmx pmx, boolean z, boolean z2) {
        this.f40380o = context;
        this.f40381p = castDevice;
        this.f40384s = scheduledExecutorService;
        this.f40382q = pvv;
        this.f40383r = pmx;
        this.f40375A = z;
        this.f40387v = z2;
        String format = String.format(Locale.ROOT, "instance-%d%s", Integer.valueOf(f40374b.incrementAndGet()), "");
        this.f40385t = format;
        this.f40379n.mo23669a(format);
        this.f40386u = qaf.m31749b(this.f40381p);
        this.f40389x = 0.0d;
    }

    /* renamed from: a */
    public abstract void mo23697a();

    /* renamed from: a */
    public final void mo938a(int i) {
        this.f40384s.execute(new pvl(this, i));
    }

    /* renamed from: b */
    public void mo23702b() {
        this.f40389x = 0.0d;
        this.f40382q.mo23750a(this, false);
    }

    /* renamed from: c */
    public final void mo941c() {
        this.f40384s.execute(new pvo(this));
    }

    /* renamed from: d */
    public final void mo943d() {
        this.f40384s.execute(new pvk(this));
    }

    /* renamed from: e */
    public final void mo944e() {
        mo938a(3);
    }

    /* renamed from: h */
    public final String mo23745h() {
        pwb pwb = this.f40377C;
        if (pwb != null) {
            return pwb.mo23754a();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo23738a(int i, String str) {
        this.f40379n.mo23670a("onApplicationDisconnected: castStatusCode=%s, sessionId=%s", pew.m30274a(i), str);
        pwb pwb = this.f40377C;
        if (pwb == null) {
            return;
        }
        if (str == null || str.equals(pwb.mo23754a())) {
            this.f40377C.mo23760b(i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: pjc.a(double, double, boolean):boolean
     arg types: [double, double, int]
     candidates:
      pjc.a(int, java.lang.String, java.lang.String):void
      pjc.a(int, boolean, bpes):void
      pjc.a(bpfk, blsw, int):void
      pjc.a(java.lang.String, java.lang.String, long):void
      pjc.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pjc.a(java.lang.String, byte[], long):void
      pjc.a(pig, boolean, long):void
      pjc.a(boolean, double, boolean):boolean
      pil.a(java.lang.String, java.lang.String, long):void
      pil.a(java.lang.String, java.lang.String, com.google.android.gms.cast.JoinOptions):void
      pil.a(java.lang.String, byte[], long):void
      pil.a(boolean, double, boolean):boolean
      pjc.a(double, double, boolean):boolean */
    /* renamed from: b */
    public final void mo23742b(double d) {
        try {
            this.f40388w.mo23208a(d, this.f40389x, false);
            this.f40389x = d;
            ScheduledFuture scheduledFuture = this.f40378D;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f40378D = this.f40384s.schedule(new pvp(this), (long) f40373a, TimeUnit.MILLISECONDS);
        } catch (IllegalStateException e) {
            this.f40379n.mo23670a("Unable to change volume from %f to %f: %s", Double.valueOf(this.f40389x), Double.valueOf(d), e.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo942c(int i) {
        this.f40384s.execute(new pvn(this, i));
    }

    /* renamed from: d */
    public void mo23705d(int i) {
        pwb pwb = this.f40377C;
        if (pwb != null) {
            pwb.mo23755a(i);
        }
    }

    /* renamed from: c */
    public final void mo23744c(boolean z) {
        boolean z2 = false;
        this.f40379n.mo23670a("endSession()", new Object[0]);
        if (this.f40388w == null) {
            this.f40379n.mo23675c("endSession() called when device controller is null!", new Object[0]);
        } else if (this.f40377C != null) {
            this.f40379n.mo23670a("mStopApplicationWhenSessionEnds: %b", Boolean.valueOf(this.f40375A));
            pwb pwb = this.f40377C;
            if (z || this.f40375A) {
                z2 = true;
            }
            pwb.mo23759a(z2);
        }
    }

    /* renamed from: a */
    public final void mo23739a(LaunchOptions launchOptions) {
        this.f40379n.mo23670a("startSession()", new Object[0]);
        pjc pjc = this.f40388w;
        if (pjc == null) {
            this.f40379n.mo23675c("startSession() called when device controller is null!", new Object[0]);
            return;
        }
        if (this.f40377C == null) {
            this.f40377C = new pwb(pjc, this, this.f40384s, this.f40379n.mo23672a(), this.f40385t);
        }
        this.f40377C.mo23757a(this.f40391z, launchOptions);
    }

    /* renamed from: b */
    public final void mo940b(int i) {
        this.f40384s.execute(new pvm(this, i));
    }

    /* renamed from: b */
    public final void mo23743b(String str) {
        if (this.f40388w != null && !ptk.m31236a(str, this.f40390y)) {
            this.f40390y = str;
        }
    }

    /* renamed from: a */
    public final void mo23740a(String str) {
        this.f40379n.mo23670a("resumeSession()", new Object[0]);
        pjc pjc = this.f40388w;
        if (pjc == null) {
            this.f40379n.mo23675c("resumeSession() called when device controller is null!", new Object[0]);
        } else if (this.f40387v) {
            if (this.f40377C == null) {
                this.f40377C = new pwb(pjc, this, this.f40384s, this.f40379n.mo23672a(), this.f40385t);
            }
            this.f40377C.mo23758a(this.f40391z, str);
        } else {
            throw new IllegalArgumentException("reconnection is not supported");
        }
    }

    /* renamed from: a */
    public final boolean mo23741a(double d) {
        if (this.f40378D != null || this.f40388w == null) {
            return false;
        }
        this.f40379n.mo23670a("onVolumeChanged to %f, was %f", Double.valueOf(d), Double.valueOf(this.f40389x));
        this.f40389x = d;
        return true;
    }
}
