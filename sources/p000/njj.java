package p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: njj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class njj implements ogy {

    /* renamed from: a */
    public static final bnsn f35801a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    public final nhw f35802b;

    /* renamed from: c */
    public final nlm f35803c;

    /* renamed from: d */
    public final olt f35804d;

    /* renamed from: e */
    public final nxk f35805e;

    /* renamed from: f */
    public final nxu f35806f;

    /* renamed from: g */
    biou f35807g = biou.AUDIO_FOCUS_STATE_INVALID;

    /* renamed from: h */
    public volatile bios f35808h = null;

    /* renamed from: i */
    volatile ohb f35809i;

    /* renamed from: j */
    public njh f35810j;

    /* renamed from: k */
    public final Object f35811k = new Object();

    /* renamed from: l */
    public final AudioManager f35812l;

    /* renamed from: m */
    public int f35813m = 0;

    /* renamed from: n */
    public int f35814n = 0;

    /* renamed from: o */
    public long f35815o = -1;

    /* renamed from: p */
    public int f35816p = 0;

    /* renamed from: q */
    final nji f35817q = new nji(this);

    /* renamed from: r */
    private final niw f35818r;

    /* renamed from: s */
    private boolean f35819s = false;

    /* renamed from: t */
    private final HandlerThread f35820t;

    /* renamed from: u */
    private final HandlerThread f35821u;

    /* renamed from: v */
    private long f35822v = 0;

    /* renamed from: w */
    private final Runnable f35823w = new njg(this);

    public njj(niw niw, nlm nlm, olt olt, Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        nxx nxx = new nxx(context);
        HandlerThread handlerThread = new HandlerThread("FOCUS_HANDLER", -16);
        HandlerThread handlerThread2 = new HandlerThread("FOCUS_RELEASE");
        this.f35820t = handlerThread;
        this.f35821u = handlerThread2;
        this.f35818r = niw;
        this.f35803c = nlm;
        this.f35804d = olt;
        bmxy.m108581a(audioManager);
        this.f35812l = audioManager;
        this.f35802b = new nhw(new njc(this));
        this.f35806f = new nxw(this.f35812l, nxx, new njd(this));
        AudioManager audioManager2 = this.f35812l;
        nji nji = this.f35817q;
        int i = Build.VERSION.SDK_INT;
        this.f35805e = new nxp(audioManager2, nji);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhs.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      nhw.a(int, boolean):void
      nhw.a(nxc, nxe):void
      nhs.a(boolean, boolean):void */
    /* renamed from: a */
    private final void m26548a(boolean z) {
        this.f35802b.mo20698a(false, false);
        if (z) {
            this.f35805e.mo21797a(1);
        }
    }

    /* renamed from: c */
    private final bios m26549c(int i) {
        if (i == -1) {
            return bios.AUDIO_FOCUS_RELEASE;
        }
        if (i == 1) {
            return bios.AUDIO_FOCUS_GAIN;
        }
        if (i != 2) {
            if (i == 3) {
                return bios.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK;
            }
            if (i != 4) {
                bnsi c = f35801a.mo68388c();
                c.mo68432a("njj", "c", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Unexpected Android focus state: %d", i);
                return bios.AUDIO_FOCUS_RELEASE;
            }
        }
        return bios.AUDIO_FOCUS_GAIN_TRANSIENT;
    }

    /* renamed from: f */
    private final void m26551f() {
        int streamMaxVolume = this.f35812l.getStreamMaxVolume(3);
        bnsi d = f35801a.mo68390d();
        d.mo68432a("njj", "f", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Setting volume of STREAM_MUSIC to maximum: %d", streamMaxVolume);
        this.f35812l.setStreamVolume(3, streamMaxVolume, 0);
    }

    /* renamed from: h */
    private final synchronized void m26553h() {
        if (!this.f35819s) {
            boolean z = true;
            this.f35819s = true;
            this.f35821u.start();
            this.f35820t.start();
            Looper looper = this.f35820t.getLooper();
            nhw nhw = this.f35802b;
            bmxy.m108581a(looper);
            nhw.f35679d = new nhv(nhw, looper);
            this.f35810j = new njh(this, looper);
            nxk nxk = this.f35805e;
            ((nxp) nxk).f36883b = new adzt(looper);
            ((nxp) nxk).f36883b.post(new nxn((nxp) nxk));
            nxu nxu = this.f35806f;
            ((nxw) nxu).f36901b.mo21817a(((nxw) nxu).f36903d, 32);
            if (((nxw) nxu).f36901b.mo21816a() == 0) {
                z = false;
            }
            ((nxw) nxu).f36902c = z;
            mo20893d();
        }
    }

    /* renamed from: i */
    private final synchronized void m26554i() {
        if (this.f35819s) {
            this.f35819s = false;
            ((nxp) this.f35805e).f36883b = null;
            nhw nhw = this.f35802b;
            nhw.f35679d.mo20706b();
            nhw.mo20714i(3);
            nhw.mo20714i(5);
            nhw.mo20714i(1);
            nhw.mo20711d();
            this.f35810j.mo20881d();
            this.f35820t.quit();
            this.f35821u.quit();
        }
    }

    /* renamed from: a */
    public final synchronized void mo20889a(ohb ohb) {
        this.f35809i = ohb;
    }

    /* renamed from: b */
    public final void mo20890b() {
        Looper looper = this.f35821u.getLooper();
        if (looper != null) {
            nuu.m27791a(looper, this.f35823w);
        }
    }

    /* renamed from: d */
    public final void mo20893d() {
        bnrv.m110182a(new nje(this));
        bnrv.m110182a(new njf(this));
    }

    /* renamed from: e */
    private final void m26550e() {
        int i = Build.VERSION.SDK_INT;
        if (ccsh.f179839a.mo6606a().mo76714d()) {
            bnsi d = f35801a.mo68390d();
            d.mo68432a("njj", "g", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Skip audio capture reset in Q and above");
            int streamMaxVolume = this.f35812l.getStreamMaxVolume(3);
            bnsi d2 = f35801a.mo68390d();
            d2.mo68432a("njj", "f", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68409a("Setting volume of STREAM_MUSIC to maximum: %d", streamMaxVolume);
            this.f35812l.setStreamVolume(3, streamMaxVolume, 0);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        bnsi d3 = f35801a.mo68390d();
        d3.mo68432a("njj", "e", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68405a("Reset audio capture after telephone abandons focus.");
        this.f35810j.mo20876a(0);
    }

    /* renamed from: g */
    private final boolean m26552g() {
        int i = Build.VERSION.SDK_INT;
        boolean d = ccsh.f179839a.mo6606a().mo76714d();
        if (d) {
            bnsi d2 = f35801a.mo68390d();
            d2.mo68432a("njj", "g", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Skip audio capture reset in Q and above");
        }
        return d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhs.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      nhw.a(int, boolean):void
      nhw.a(nxc, nxe):void
      nhs.a(boolean, boolean):void */
    /* renamed from: j */
    private final void m26555j() {
        int i = Build.VERSION.SDK_INT;
        if (!ccpg.f179680a.mo6606a().mo76580b()) {
            bnsi d = f35801a.mo68390d();
            d.mo68432a("njj", "j", 457, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Unsolicited STATE_GAIN_TRANSIENT_GUIDANCE_ONLY not supported.");
            m26548a(true);
            return;
        }
        this.f35805e.mo21797a(1);
        this.f35802b.mo20698a(false, true);
    }

    /* renamed from: a */
    public final synchronized void mo20884a() {
        m26554i();
        nxu nxu = this.f35806f;
        ((nxw) nxu).f36901b.mo21817a(((nxw) nxu).f36903d, 0);
        this.f35809i = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: njj.a(biou, boolean, boolean):void
     arg types: [biou, int, int]
     candidates:
      njj.a(int, nxc, nxe):void
      njj.a(biou, boolean, boolean):void */
    /* renamed from: b */
    public final void mo20891b(int i) {
        bios a = bios.m102673a(i);
        if (a != null) {
            bnsi c = f35801a.mo68388c();
            c.mo68432a("njj", "b", 608, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Car focus response time-out for focus request %s", nxs.m28139a(a));
            if (!this.f35806f.mo21814b()) {
                this.f35814n++;
                this.f35815o = SystemClock.elapsedRealtime();
                this.f35807g = biou.AUDIO_FOCUS_STATE_LOSS;
                this.f35808h = null;
                synchronized (this.f35811k) {
                    this.f35816p = 0;
                }
                mo20888a(this.f35807g, true, true);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("requestTypeFromMessage has invalid value: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo20885a(int i) {
        bios bios;
        if (this.f35810j.mo20879b()) {
            synchronized (this.f35811k) {
                this.f35816p = i;
            }
            bnsi d = f35801a.mo68390d();
            d.mo68432a("njj", "a", 553, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("new focus while waiting for car's response, external app focus: %s", nxs.m28138a(i));
            return;
        }
        if (i == -1) {
            bios = bios.AUDIO_FOCUS_RELEASE;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    bios = bios.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK;
                } else if (i != 4) {
                    bnsi c = f35801a.mo68388c();
                    c.mo68432a("njj", "c", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68409a("Unexpected Android focus state: %d", i);
                    bios = bios.AUDIO_FOCUS_RELEASE;
                }
            }
            bios = bios.AUDIO_FOCUS_GAIN_TRANSIENT;
        } else {
            bios = bios.AUDIO_FOCUS_GAIN;
        }
        biou biou = this.f35807g;
        biou biou2 = biou.AUDIO_FOCUS_STATE_INVALID;
        int ordinal = bios.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                if (biou == biou.AUDIO_FOCUS_STATE_GAIN_TRANSIENT || biou == biou.AUDIO_FOCUS_STATE_GAIN || biou == biou.AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY) {
                    return;
                }
            } else if (ordinal == 3 && (biou == biou.AUDIO_FOCUS_STATE_LOSS || biou == biou.AUDIO_FOCUS_STATE_LOSS_TRANSIENT)) {
                return;
            }
        } else if (biou == biou.AUDIO_FOCUS_STATE_GAIN) {
            return;
        }
        if (!((nxw) this.f35806f).f36902c) {
            bnsi d2 = f35801a.mo68390d();
            d2.mo68432a("njj", "a", 570, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68420a("send audio focus request to car:%s", nxs.m28139a(bios));
            ohb ohb = this.f35809i;
            if (ohb != null) {
                this.f35813m++;
                this.f35822v = SystemClock.elapsedRealtime();
                this.f35808h = bios;
                this.f35810j.mo20877a(bios);
                bnsi d3 = ohc.f37607a.mo68390d();
                d3.mo68432a("ohc", "a", 725, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68420a("sent audio focus request: %s", nxs.m28139a(bios));
                bxvd da = bioq.f121089c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bioq bioq = (bioq) da.f164949b;
                bioq.f121092b = bios.f121100e;
                bioq.f121091a |= 1;
                ((ojh) ohb).mo22206a(18, (bioq) da.mo74062i());
            }
        }
    }

    /* renamed from: c */
    public final void mo20892c() {
        if (this.f35806f.mo21813a()) {
            bnsi d = f35801a.mo68390d();
            d.mo68432a("njj", "c", 630, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Still in call. Retry audio capture reset.");
            this.f35810j.mo20876a(100);
        } else if (this.f35804d.mo21199l()) {
            this.f35803c.mo21043c().mo20918b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo20886a(int i, nxc nxc, nxe nxe) {
        nhw nhw = this.f35802b;
        nhw.f35676a[i] = nxc;
        nhw.f35677b[i] = nxe;
        nhw.mo20713h(1);
        m26553h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = p000.njj.f35801a.mo68390d();
        r0.mo68432a("njj", "a", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68414a("focus change from car: %d, unsolicited: %b", r9.f121111i, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r8.f35822v > 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r10 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r0 = r8.f35818r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0.mo20853a(r8.f35808h, (int) (android.os.SystemClock.elapsedRealtime() - r8.f35822v));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r8.f35822v = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r8.f35810j.mo20880c();
        r8.f35810j.mo20878a(r9, r10, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo20887a(biou biou, boolean z) {
        synchronized (this) {
            if (!this.f35819s) {
                bnsi c = f35801a.mo68388c();
                c.mo68432a("njj", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Focus change from car while focus handling is not started. This will be ignored %d", biou.f121111i);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nhs.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      nhw.a(int, boolean):void
      nhw.a(nxc, nxe):void
      nhs.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo20888a(biou biou, boolean z, boolean z2) {
        int i;
        boolean z3;
        synchronized (this.f35811k) {
            i = this.f35816p;
            this.f35816p = 0;
        }
        biou biou2 = !z2 ? biou : this.f35807g;
        bnsi d = f35801a.mo68390d();
        d.mo68432a("njj", "a", 277, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("audio focus change from car: %s, unsolicited: %b, forced handling: %b", nxs.m28140a(biou2), Boolean.valueOf(z), Boolean.valueOf(z2));
        mo20893d();
        if (z2) {
            z3 = true;
        } else {
            z3 = i == 0;
        }
        bnsi d2 = f35801a.mo68390d();
        d2.mo68432a("njj", "a", 284, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68420a("changeAndroidFocus: %b", Boolean.valueOf(z3));
        bios bios = bios.AUDIO_FOCUS_GAIN;
        biou biou3 = biou.AUDIO_FOCUS_STATE_INVALID;
        switch (biou2.ordinal()) {
            case 0:
                bnsi c = f35801a.mo68388c();
                c.mo68432a("njj", "a", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("AUDIO_FOCUS_STATE_INVALID from car");
                this.f35808h = null;
                return;
            case 1:
                this.f35802b.mo20698a(true, true);
                if (z || this.f35808h == null || this.f35808h == bios.AUDIO_FOCUS_GAIN || this.f35808h == bios.AUDIO_FOCUS_GAIN_TRANSIENT || this.f35808h == bios.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK || this.f35806f.mo21814b()) {
                    if (z3) {
                        this.f35805e.mo21796a();
                        break;
                    }
                } else {
                    nxs.m28139a(this.f35808h);
                    this.f35805e.mo21797a(1);
                    mo20890b();
                    break;
                }
                break;
            case 2:
                this.f35802b.mo20698a(true, true);
                if (!(this.f35808h == null || this.f35808h == bios.AUDIO_FOCUS_GAIN_TRANSIENT || this.f35808h == bios.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK || this.f35806f.mo21814b())) {
                    nxs.m28139a(this.f35808h);
                    this.f35805e.mo21797a(1);
                    mo20890b();
                    break;
                }
            case 3:
                m26548a(z3);
                break;
            case 4:
                this.f35802b.mo20698a(true, false);
                if (z3) {
                    this.f35805e.mo21797a(3);
                    break;
                }
                break;
            case 5:
                if (z && ccpg.f179680a.mo6606a().mo76579a()) {
                    nxr nxr = ((nxp) this.f35805e).f36884c;
                    bnsi d3 = nxr.f36892a.mo68390d();
                    d3.mo68432a("nxr", "b", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d3.mo68405a("Invalidate audio focus stack monitor due to unsolicited transient loss");
                    nxr.f36893b = true;
                }
                this.f35802b.mo20698a(false, false);
                if (z3) {
                    this.f35805e.mo21797a(2);
                    break;
                }
                break;
            case 6:
                this.f35802b.mo20698a(true, false);
                if (z3) {
                    this.f35805e.mo21796a();
                    break;
                }
                break;
            case 7:
                if (!z) {
                    this.f35802b.mo20698a(false, true);
                    if (this.f35808h == bios.AUDIO_FOCUS_GAIN && !this.f35806f.mo21814b()) {
                        this.f35805e.mo21797a(1);
                        mo20890b();
                        break;
                    }
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    if (ccpg.f179680a.mo6606a().mo76580b()) {
                        this.f35805e.mo21797a(1);
                        this.f35802b.mo20698a(false, true);
                        break;
                    } else {
                        bnsi d4 = f35801a.mo68390d();
                        d4.mo68432a("njj", "j", 457, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d4.mo68405a("Unsolicited STATE_GAIN_TRANSIENT_GUIDANCE_ONLY not supported.");
                        m26548a(true);
                        break;
                    }
                }
        }
        this.f35808h = null;
        if (!z2) {
            this.f35807g = biou2;
            if (i != 0) {
                bnsi d5 = f35801a.mo68390d();
                d5.mo68432a("njj", "a", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d5.mo68409a("handling pending focus request:%d", i);
                mo20885a(i);
            }
        }
    }
}
