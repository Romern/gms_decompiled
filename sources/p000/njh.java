package p000;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: njh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class njh extends nvt {

    /* renamed from: a */
    private boolean f35799a = false;

    public njh(njj njj, Looper looper) {
        super(njj, looper);
    }

    /* renamed from: a */
    public final synchronized void mo20875a() {
        if (!this.f35799a) {
            bnsn bnsn = njj.f35801a;
            sendMessage(obtainMessage(1));
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo20879b() {
        return !this.f35799a && hasMessages(2);
    }

    /* renamed from: c */
    public final synchronized void mo20880c() {
        if (!this.f35799a) {
            removeMessages(2);
        }
    }

    /* renamed from: d */
    public final synchronized void mo20881d() {
        if (!this.f35799a) {
            this.f35799a = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: njj.a(biou, boolean, boolean):void
     arg types: [biou, int, int]
     candidates:
      njj.a(int, nxc, nxe):void
      njj.a(biou, boolean, boolean):void */
    public final void handleMessage(Message message) {
        njj njj = (njj) mo21726f();
        if (njj != null) {
            int i = message.what;
            boolean z = false;
            if (i == 0) {
                biou a = biou.m102677a(message.arg1);
                if (a != null) {
                    if (message.arg2 == 1) {
                        z = true;
                    }
                    njj.mo20888a(a, z, ((Boolean) message.obj).booleanValue());
                    return;
                }
                throw new IllegalArgumentException("AudioFocusStateType in msg is invalid.");
            } else if (i == 1) {
                njj.mo20885a(-1);
            } else if (i == 2) {
                int i2 = message.arg1;
                bios a2 = bios.m102673a(i2);
                if (a2 != null) {
                    bnsi c = njj.f35801a.mo68388c();
                    c.mo68432a("njj", "b", 608, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68420a("Car focus response time-out for focus request %s", nxs.m28139a(a2));
                    if (!njj.f35806f.mo21814b()) {
                        njj.f35814n++;
                        njj.f35815o = SystemClock.elapsedRealtime();
                        njj.f35807g = biou.AUDIO_FOCUS_STATE_LOSS;
                        njj.f35808h = null;
                        synchronized (njj.f35811k) {
                            njj.f35816p = 0;
                        }
                        njj.mo20888a(njj.f35807g, true, true);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(53);
                sb.append("requestTypeFromMessage has invalid value: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i == 3) {
                if (njj.f35806f.mo21813a()) {
                    bnsi d = njj.f35801a.mo68390d();
                    d.mo68432a("njj", "c", 630, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("Still in call. Retry audio capture reset.");
                    njj.f35810j.mo20876a(100);
                } else if (njj.f35804d.mo21199l()) {
                    njj.f35803c.mo21043c().mo20918b();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20876a(long j) {
        if (!this.f35799a) {
            sendMessageDelayed(obtainMessage(3), j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20877a(bios bios) {
        if (!this.f35799a) {
            sendMessageDelayed(obtainMessage(2, bios.f121100e, 0), 500);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20878a(biou biou, boolean z, boolean z2) {
        if (!this.f35799a) {
            sendMessage(obtainMessage(0, biou.f121111i, z ? 1 : 0, Boolean.valueOf(z2)));
        }
    }
}
