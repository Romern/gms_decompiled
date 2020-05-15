package p000;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gdf implements gce {

    /* renamed from: a */
    public final Context f17940a;

    /* renamed from: b */
    public final ggg f17941b = new ggg(gcd.class);

    /* renamed from: c */
    public final geu f17942c;

    /* renamed from: d */
    public final AtomicBoolean f17943d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicBoolean f17944e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile ged f17945f;

    /* renamed from: g */
    public volatile long f17946g = 0;

    public gdf(Context context) {
        ged a = ged.m13012a(context);
        this.f17940a = context;
        this.f17945f = a;
        this.f17942c = (geu) ahgz.m55754a(context, geu.class);
    }

    /* renamed from: g */
    private final void m12973g() {
        this.f17944e.set(true);
    }

    /* renamed from: a */
    public final int mo11641a() {
        return this.f17945f.f18024e;
    }

    /* renamed from: b */
    public final int mo11643b() {
        return !this.f17945f.f18023d ? 1 : 2;
    }

    /* renamed from: c */
    public final boolean mo11645c() {
        return this.f17943d.get();
    }

    /* renamed from: d */
    public final void mo11646d() {
        if (mo11645c()) {
            m12973g();
        }
    }

    /* renamed from: e */
    public final boolean mo11647e() {
        if (mo11645c()) {
            return false;
        }
        srn srn = gdv.f17985a;
        try {
            this.f17945f = ged.m13012a(this.f17940a);
            return true;
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("gdf", "e", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to create RecordingConfiguration with new settings");
            return true;
        }
    }

    /* renamed from: f */
    public final void mo11678f() {
        gds.m12998a(this.f17940a);
        for (gcd gcd : (gcd[]) this.f17941b.f18130a) {
            gcd.mo11640b();
        }
    }

    /* renamed from: a */
    public final void mo11642a(gcd gcd) {
        this.f17941b.mo11790a(gcd);
        if (!mo11645c()) {
            Context context = this.f17940a;
            Intent intent = new Intent("com.google.android.googlequicksearchbox.action.PAUSE_HOTWORD");
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", context.getPackageName());
            context.sendBroadcast(intent);
            if (!this.f17943d.compareAndSet(false, true)) {
                srn srn = gdv.f17985a;
                return;
            }
            this.f17944e.set(false);
            int i = this.f17945f.f18025f;
            double n = cfnp.f184595a.mo6606a().mo81700n();
            int b = mo11643b();
            int i2 = b + b;
            double d = (double) i;
            Double.isNaN(d);
            long l = cfnp.f184595a.mo6606a().mo81698l();
            int i3 = this.f17945f.f18024e;
            int i4 = ((((int) (d * n)) + (i2 - 1)) / i2) * i2;
            double b2 = (double) ((i3 + i3) * mo11643b());
            double d2 = (double) ((long) ((int) l));
            Double.isNaN(d2);
            Double.isNaN(b2);
            new Thread(new gde(this, Math.max(i4, (int) (b2 * (d2 / 1000.0d)))), "AudioModemRecorder").start();
            return;
        }
        srn srn2 = gdv.f17985a;
    }

    /* renamed from: b */
    public final void mo11644b(gcd gcd) {
        boolean z;
        synchronized (this.f17941b) {
            z = false;
            if (this.f17941b.mo11791b(gcd) && this.f17941b.mo11789a()) {
                z = true;
            }
        }
        if (z) {
            m12973g();
        }
    }
}
