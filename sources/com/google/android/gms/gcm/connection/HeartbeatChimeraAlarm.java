package com.google.android.gms.gcm.connection;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.cast.JGCastService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HeartbeatChimeraAlarm extends aacn {

    /* renamed from: a */
    static final long f32810a = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: n */
    private static final long f32811n = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    public aand f32812b;

    /* renamed from: c */
    public final aank f32813c;

    /* renamed from: d */
    public final aamu f32814d;

    /* renamed from: e */
    public aams f32815e;

    /* renamed from: f */
    public long f32816f;

    /* renamed from: g */
    public int f32817g;

    /* renamed from: h */
    public volatile aamv f32818h;

    /* renamed from: i */
    public int f32819i;

    /* renamed from: j */
    public boolean f32820j;

    /* renamed from: k */
    public long f32821k;

    /* renamed from: l */
    public long f32822l = 0;

    /* renamed from: m */
    private long f32823m = 0;

    /* renamed from: o */
    private final Context f32824o;

    /* renamed from: p */
    private long f32825p = 0;

    /* renamed from: q */
    private long f32826q = 0;

    /* renamed from: r */
    private boolean f32827r = false;

    /* renamed from: s */
    private final Intent f32828s;

    /* renamed from: t */
    private boolean f32829t;

    public HeartbeatChimeraAlarm(Context context, aank aank, aamu aamu, aams aams) {
        super("gcm");
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_DID_HEARTBEAT");
        this.f32828s = intent;
        this.f32829t = false;
        this.f32824o = context;
        this.f32813c = aank;
        this.f32814d = aamu;
        this.f32815e = aams;
        intent.setFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        this.f32820j = false;
    }

    /* renamed from: a */
    public static boolean m24317a(int i) {
        return !Arrays.asList(cedc.f182364a.mo6606a().mo78873n().split(";")).contains(Integer.toString(i));
    }

    /* renamed from: h */
    private final void m24318h() {
        aamv aamv = this.f32818h;
        if (aamv != null && mo19569a(aamv)) {
            int a = aamv.mo17066a();
            boolean z = true;
            aamv.mo17067a(1);
            if (a != aamv.mo17066a()) {
                z = false;
            }
            this.f32820j = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return;
     */
    /* renamed from: i */
    private final synchronized void m24319i() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f32823m;
        long e = cedc.m136235e();
        if (e >= 0 && !this.f32812b.mo17099g()) {
            if (elapsedRealtime < e) {
                if (this.f32823m != 0) {
                }
            }
            this.f32823m = SystemClock.elapsedRealtime();
            if (this.f32812b.mo17094b()) {
                mo19568a(false);
                return;
            }
            this.f32813c.mo17123b();
        }
    }

    /* renamed from: b */
    public final long mo19570b() {
        aamv a;
        long k = cedc.f182364a.mo6606a().mo78870k();
        long j = (long) this.f32817g;
        if (j > 0 && k > j) {
            k = j;
        }
        this.f32818h = null;
        int h = this.f32813c.mo17131h();
        if (!m24317a(h) || (a = this.f32814d.mo17064a(h).mo17079a(this.f32824o)) == null) {
            return k;
        }
        this.f32818h = a;
        return (long) a.mo17066a();
    }

    /* renamed from: c */
    public final void mo19571c() {
        this.f32812b.mo17092a(false);
        this.f32815e.mo17059d();
    }

    /* renamed from: d */
    public final void mo19572d() {
        if (this.f32812b.mo17099g()) {
            this.f32821k = SystemClock.elapsedRealtime() - this.f32825p;
            this.f32812b.mo17092a(false);
            if (this.f32827r) {
                m24318h();
            }
        } else if (cedc.f182364a.mo6606a().mo78867h() && this.f32812b.mo17100h() && SystemClock.elapsedRealtime() - Math.max(this.f32822l, this.f32826q) > mo19570b() - f32811n) {
            m24318h();
        }
        this.f32826q = SystemClock.elapsedRealtime();
        this.f32815e.mo17056a(mo19567a());
    }

    /* renamed from: e */
    public final int mo19573e() {
        aamv aamv = this.f32818h;
        int a = (aamv == null || !mo19569a(aamv)) ? -1 : aamv.mo17066a();
        if (a == -1 || a == this.f32819i) {
            return -1;
        }
        return a;
    }

    /* renamed from: f */
    public final void mo19574f() {
        this.f32815e.f28490b.mo49120c();
    }

    /* renamed from: g */
    public final boolean mo19575g() {
        if (cedc.f182364a.mo6606a().mo78871l()) {
            return this.f32812b.mo17100h();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        return r0;
     */
    /* renamed from: a */
    public final synchronized long mo19567a() {
        long e = cedc.m136235e();
        if (!this.f32829t || e <= 0) {
            if (mo19575g()) {
                return mo19570b() + f32810a;
            }
            e = mo19570b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e9, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo6253a(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -2128145023:
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1700544179:
                if (action.equals("com.google.android.intent.action.MCS_HEARTBEAT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -264073239:
                if (action.equals("com.google.android.gms.gcm.HEARTBEAT_ALARM")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 764219535:
                if (action.equals("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 823795052:
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.f32829t = true;
        } else if (!(c == 1 || c == 2)) {
            if (c == 3) {
                this.f32829t = false;
            } else if (c != 4) {
                if (Log.isLoggable("GCM", 4)) {
                    String valueOf = String.valueOf(action);
                    Log.i("GCM", valueOf.length() == 0 ? new String("Unknown intent action in HeartbeatAlarm: ") : "Unknown intent action in HeartbeatAlarm: ".concat(valueOf));
                }
            } else if (this.f32812b.mo17094b()) {
                if (this.f32812b.mo17099g()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f32825p;
                    long d = cedc.m136234d();
                    if (j < d) {
                        this.f32815e.mo17056a(d - j);
                        StringBuilder sb = new StringBuilder(49);
                        sb.append("Heartbeat alarm fired early: ");
                        sb.append(j);
                        Log.w("GCM", sb.toString());
                        return;
                    }
                    long a = this.f32815e.mo17055a();
                    StringBuilder sb2 = new StringBuilder(60);
                    sb2.append("Heartbeat timeout, GCM connection reset ");
                    sb2.append(a - elapsedRealtime);
                    Log.w("GCM", sb2.toString());
                    mo19571c();
                    this.f32812b.mo17088a(6);
                    this.f32816f = SystemClock.elapsedRealtime();
                    return;
                }
                mo19568a(true);
            }
        }
        m24319i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19568a(boolean z) {
        boolean z2;
        this.f32815e.f28490b.mo49111a((long) aanb.m21605a());
        if (SystemClock.elapsedRealtime() >= this.f32822l + mo19570b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f32827r = z2;
        aand aand = this.f32812b;
        blmv blmv = (blmv) blmw.f126907e.mo74144da();
        aanr aanr = (aanr) aand;
        aans aans = aanr.f28608a;
        if (!aans.f28640g) {
            aucu.m76778a((Object) false);
        } else {
            aans.f28642i = true;
            aanr.mo17091a(blmv);
        }
        this.f32825p = SystemClock.elapsedRealtime();
        if (cedc.f182364a.mo6606a().mo78872m() && z) {
            this.f32824o.sendBroadcast(this.f32828s);
        }
        this.f32812b.mo17092a(true);
        this.f32815e.mo17056a(cedc.m136234d());
    }

    /* renamed from: a */
    public final boolean mo19569a(aamv aamv) {
        int h = this.f32813c.mo17131h();
        return m24317a(h) && aamv.f28503a.f28511c == h;
    }
}
