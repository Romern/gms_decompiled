package p000;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: betd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betd extends beti {

    /* renamed from: a */
    boolean f112360a;

    /* renamed from: b */
    private long f112361b;

    /* renamed from: c */
    private final berq f112362c;

    /* renamed from: k */
    private final bete f112363k;

    /* renamed from: l */
    private boolean f112364l;

    /* renamed from: m */
    private final long f112365m;

    /* renamed from: n */
    private final long f112366n;

    public betd(berb berb) {
        this(berb, false, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* renamed from: q */
    private final void m95752q() {
        long j;
        long j2;
        long j3;
        berq berq = this.f112362c;
        if (this.f112364l) {
            j = this.f112365m;
        } else {
            j = -1;
        }
        berp a = berq.mo61059a(j);
        long j4 = a.f112227a;
        StringBuilder sb = new StringBuilder(67);
        sb.append("setNextTriggerTime, scheduleInfo.detectorTypes=");
        sb.append(j4);
        sb.toString();
        long j5 = a.f112227a;
        this.f112361b = j5;
        if (this.f112360a || (this.f112363k.f112367a && this.f112402j)) {
            if (j5 == 2) {
                j3 = 450;
            } else {
                j3 = 36000;
            }
            long j6 = j3 + 1500;
            long max = Math.max(0L, a.f112228b.f114394a - j6);
            long e = bgof.m99492e();
            Calendar instance = Calendar.getInstance(Locale.US);
            instance.setTimeInMillis(bhct.m100648a(max, e));
            instance.set(14, 0);
            instance.set(13, 0);
            j2 = instance.getTimeInMillis() - e;
            if (j2 - SystemClock.elapsedRealtime() > 10000) {
                StringBuilder sb2 = new StringBuilder(172);
                sb2.append("Prefer to disable sensor batching: minDurationMillis=");
                sb2.append(j6);
                sb2.append(" timeToReenableBatching=");
                sb2.append(max);
                sb2.append(" timeToReenableBatchingRoundedDown=");
                sb2.append(j2);
                sb2.toString();
                if (j2 == -1) {
                    this.f112360a = true;
                    this.f112396d.mo60964a(new bfmg(j2 - 1000, 2000));
                    this.f112396d.mo60981b(true);
                    return;
                }
                if (this.f112360a) {
                    this.f112396d.mo60981b(false);
                }
                this.f112360a = false;
                this.f112396d.mo60964a(a.f112228b);
                return;
            }
        }
        j2 = -1;
        if (j2 == -1) {
        }
    }

    /* renamed from: A */
    public final void mo61106A() {
        m95752q();
    }

    /* renamed from: B */
    public final void mo61114B() {
        this.f112364l = false;
        m95752q();
    }

    /* renamed from: C */
    public final void mo61115C() {
        m95752q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo61092D() {
        if (!this.f112360a) {
            new Object[1][0] = Long.valueOf(this.f112361b);
            mo61131b(this.f112361b);
            return;
        }
        this.f112396d.mo60981b(false);
        this.f112360a = false;
        m95752q();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo61098a(bfnp bfnp, bfnp bfnp2) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        if (!this.f112396d.f112114B.mo62860d() && bfnp != null && (i = bfnp.f114499b) != 3 && (i2 = bfnp2.f114499b) != 3 && i != i2) {
            ActivityRecognitionResult activityRecognitionResult = this.f112396d.f112194u;
            if (activityRecognitionResult != null) {
                i3 = activityRecognitionResult.mo43491a().mo43513a();
            } else {
                i3 = 4;
            }
            int i4 = bfnp2.f114499b;
            boolean z3 = false;
            if (i3 != 4) {
                if (i3 == 5) {
                    z = true;
                } else if (i3 != 3) {
                    z = false;
                }
                if (i4 != 2 || !z) {
                    z2 = i4 != 1;
                    if (i3 == 3) {
                        z3 = true;
                    }
                    if (z2 == z3) {
                        return;
                    }
                }
                String valueOf = String.valueOf(bfnp);
                String valueOf2 = String.valueOf(bfnp2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 110 + String.valueOf(valueOf2).length());
                sb.append("Travel mode change and inconsistent with last activity detection. Running activity detection early: last=");
                sb.append(valueOf);
                sb.append(" cur=");
                sb.append(valueOf2);
                sb.toString();
                if (SystemClock.elapsedRealtime() - this.f112396d.f112161ak <= 10000) {
                    mo61131b(39);
                    return;
                }
                return;
            }
            z = true;
            if (i4 != 1) {
            }
            if (i3 == 3) {
            }
            if (z2 == z3) {
            }
            String valueOf3 = String.valueOf(bfnp);
            String valueOf22 = String.valueOf(bfnp2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 110 + String.valueOf(valueOf22).length());
            sb2.append("Travel mode change and inconsistent with last activity detection. Running activity detection early: last=");
            sb2.append(valueOf3);
            sb2.append(" cur=");
            sb2.append(valueOf22);
            sb2.toString();
            if (SystemClock.elapsedRealtime() - this.f112396d.f112161ak <= 10000) {
            }
        }
    }

    /* renamed from: g */
    public final void mo61083g() {
        super.mo61083g();
        berb berb = this.f112396d;
        if (berb.f112161ak == -1) {
            berb.f112161ak = SystemClock.elapsedRealtime();
        }
        berb berb2 = this.f112396d;
        if (berb2.f112162al == -1) {
            berb2.f112162al = SystemClock.elapsedRealtime();
        }
        berb berb3 = this.f112396d;
        if (berb3.f112163am == -1) {
            berb3.f112163am = SystemClock.elapsedRealtime();
        }
        berb berb4 = this.f112396d;
        if (berb4.f112164an == -1) {
            berb4.f112164an = SystemClock.elapsedRealtime();
        }
        berb berb5 = this.f112396d;
        if (berb5.f112165ao == -1) {
            berb5.f112165ao = SystemClock.elapsedRealtime();
        }
        berb berb6 = this.f112396d;
        if (Math.min(berb6.f112133U, berb6.f112134V) != Long.MAX_VALUE && !this.f112396d.f112114B.mo62860d() && SystemClock.elapsedRealtime() >= this.f112366n && this.f112396d.f112114B.mo62858b() && this.f112396d.mo61004t()) {
            this.f112396d.mo60981b(false);
        }
        m95752q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo61117k() {
        long j = this.f112361b;
        if (j == 2) {
            this.f112361b = 39;
            j = 39;
        }
        mo61132c(j);
    }

    /* renamed from: p */
    public final String mo61093p() {
        return "ScheduledState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo61118t() {
        m95752q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo61109u() {
        berb berb = this.f112396d;
        if (berb.f112171au == -1) {
            berb.mo60961a(SystemClock.elapsedRealtime());
            berb berb2 = this.f112396d;
            if (berb2.f112155ae && !this.f112402j && (berb2.mo60976a(9) || this.f112396d.mo60976a(10))) {
                besg besg = new besg(this.f112396d);
                if (mo61130a((berx) besg)) {
                    mo61107a((beti) besg);
                    return;
                }
            }
        }
        m95752q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo61119v() {
        if (cese.m138160i() && cese.m138159h()) {
            this.f112362c.f112229a = SystemClock.elapsedRealtime();
            m95752q();
        }
    }

    /* renamed from: y */
    public final void mo61120y() {
        this.f112396d.f112159ai = Long.MAX_VALUE;
        m95752q();
    }

    /* renamed from: z */
    public final void mo61121z() {
        this.f112396d.mo60998n();
        mo61117k();
    }

    public betd(berb berb, boolean z, long j) {
        super(berb);
        this.f112360a = false;
        this.f112361b = 0;
        this.f112363k = berb.f112191r;
        if (this.f112402j) {
            this.f112362c = new beub(berb, this.f112399g);
        } else {
            this.f112362c = new besj(berb, this.f112399g);
        }
        this.f112364l = z;
        this.f112365m = SystemClock.elapsedRealtime();
        this.f112366n = SystemClock.elapsedRealtime() + j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61116a(bgnq bgnq) {
        if (bgnq == bgnq.LOCATOR) {
            m95752q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61094a(boolean z) {
        new Object[1][0] = Boolean.valueOf(z);
        if (!this.f112396d.f112114B.mo62860d()) {
            m95752q();
            if (z) {
                mo61117k();
            }
        } else if (!this.f112396d.mo60976a(9) && !this.f112396d.mo60987c()) {
            this.f112396d.f112114B.mo62863g();
            berb berb = this.f112396d;
            bgnb bgnb = berb.f112172av;
            if (bgnb != null && bgnb.f116833a) {
                berb.mo61007w();
            }
        } else if (!z) {
            mo61107a(new betd(this.f112396d));
        } else {
            mo61117k();
        }
    }
}
