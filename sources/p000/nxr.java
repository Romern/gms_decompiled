package p000;

import android.media.AudioFocusInfo;
import android.os.Handler;
import android.os.Process;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxr implements nxt {

    /* renamed from: a */
    public static final bnsn f36892a = odk.m28481a("CAR.AUDIO");

    /* renamed from: b */
    public volatile boolean f36893b = false;

    /* renamed from: c */
    public volatile Handler f36894c;

    /* renamed from: d */
    public final HashMap f36895d = new HashMap();

    /* renamed from: e */
    public final Object f36896e = new Object();

    /* renamed from: f */
    public final AtomicInteger f36897f = new AtomicInteger(0);

    /* renamed from: g */
    public final nxl f36898g;

    public nxr(nxl nxl) {
        this.f36898g = nxl;
    }

    /* renamed from: a */
    private final void m28129a(int i, boolean z) {
        if (this.f36894c == null) {
            bnsi c = f36892a.mo68388c();
            c.mo68432a("nxr", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("maybeNotifyFocusStackChangeAfterDelay: handler is null, so returning.");
            return;
        }
        this.f36894c.postDelayed(new nxq(this, z), (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo21812b() {
        bnsi d = f36892a.mo68390d();
        d.mo68432a("nxr", "b", 288, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Invalidate audio focus stack monitor due to unsolicited transient loss");
        this.f36893b = true;
    }

    /* renamed from: a */
    static final boolean m28130a(int i) {
        return i != Process.myUid();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r6 != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r7 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r8 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        return 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return 2;
     */
    /* renamed from: a */
    public final int mo21806a() {
        synchronized (this.f36896e) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (Integer num : this.f36895d.values()) {
                int intValue = num.intValue();
                if (intValue == 1) {
                    return 1;
                }
                if (intValue == 2) {
                    z = true;
                } else if (intValue == 3) {
                    z2 = true;
                } else if (intValue != 4) {
                    bnsi b = f36892a.mo68387b();
                    b.mo68432a("nxr", "a", 266, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68409a("Unrecognized focus grant in map: %d", intValue);
                } else {
                    z3 = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21807a(AudioFocusInfo audioFocusInfo, int i) {
        boolean z;
        String clientId = audioFocusInfo.getClientId();
        int clientUid = audioFocusInfo.getClientUid();
        int gainRequest = audioFocusInfo.getGainRequest();
        bnsi d = f36892a.mo68390d();
        d.mo68432a("nxr", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Received onAudioFocusGrant. gainRequest: %d, requestResult: %d, clientId %s", Integer.valueOf(gainRequest), Integer.valueOf(i), clientId);
        if (gainRequest == 0) {
            bnsi b = f36892a.mo68387b();
            b.mo68432a("nxr", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Unexpected AudioManager.AUDIOFOCUS_NONE");
        } else if (!m28130a(clientUid)) {
            bnsi d2 = f36892a.mo68390d();
            d2.mo68432a("nxr", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("shouldHandleAudioFocusEvent returned false; not handling focus event.");
        } else if (i != 2) {
            if (i != 1) {
                bnsi b2 = f36892a.mo68387b();
                b2.mo68432a("nxr", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68409a("Expected AudioManager.AUDIOFOCUS_REQUEST_GRANTED, but got %d", i);
            }
            if (gainRequest == 1) {
                z = this.f36893b;
                this.f36893b = false;
            } else {
                z = false;
            }
            synchronized (this.f36896e) {
                this.f36895d.put(clientId, Integer.valueOf(gainRequest));
            }
            m28129a(0, z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nxr.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nxr.a(android.media.AudioFocusInfo, int):void
      nxr.a(android.media.AudioFocusInfo, boolean):void
      nxt.a(android.media.AudioFocusInfo, int):void
      nxt.a(android.media.AudioFocusInfo, boolean):void
      nxr.a(int, boolean):void */
    /* renamed from: a */
    public final void mo21808a(AudioFocusInfo audioFocusInfo, boolean z) {
        Integer num;
        String clientId = audioFocusInfo.getClientId();
        int clientUid = audioFocusInfo.getClientUid();
        int lossReceived = audioFocusInfo.getLossReceived();
        bnsi d = f36892a.mo68390d();
        d.mo68432a("nxr", "a", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        Integer valueOf = Integer.valueOf(lossReceived);
        Boolean valueOf2 = Boolean.valueOf(z);
        d.mo68425a("Received onAudioFocusLoss. lossReceived: %d, wasNotified: %b, clientId: %s.", valueOf, valueOf2, clientId);
        if (!m28130a(clientUid)) {
            bnsi d2 = f36892a.mo68390d();
            d2.mo68432a("nxr", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("shouldHandleAudioFocusEvent returned false; not handling focus event.");
            return;
        }
        synchronized (this.f36896e) {
            num = (Integer) this.f36895d.get(clientId);
        }
        if (num != null) {
            bnsi d3 = f36892a.mo68390d();
            d3.mo68432a("nxr", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68414a("currentGrant: %d, invalidateByTransientLoss: %b", num.intValue(), this.f36893b);
            if (lossReceived == -3 || lossReceived == -2) {
                if (num.intValue() == 1) {
                    return;
                }
            } else if (!(lossReceived == -1 || lossReceived == 0)) {
                bnsi b = f36892a.mo68387b();
                b.mo68432a("nxr", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68409a("Received unexpected loss: %d", lossReceived);
            }
            synchronized (this.f36896e) {
                this.f36895d.remove(clientId);
            }
            m28129a(20, false);
            return;
        }
        bnsi c = f36892a.mo68388c();
        c.mo68432a("nxr", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68425a("Unrecognized client receiving loss. lossReceived: %d, wasNotified: %b, clientId: %s", valueOf, valueOf2, clientId);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21809a(String str, int i, int i2, int i3) {
        boolean z;
        bnsi d = f36892a.mo68390d();
        d.mo68432a("nxr", "a", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("Received onAudioFocusGrant. gainRequest: %d, requestResult: %d, clientId %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0) {
            bnsi b = f36892a.mo68387b();
            b.mo68432a("nxr", "a", 84, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Unexpected AudioManager.AUDIOFOCUS_NONE");
        } else if (!m28130a(i)) {
            bnsi d2 = f36892a.mo68390d();
            d2.mo68432a("nxr", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("shouldHandleAudioFocusEvent returned false; not handling focus event.");
        } else if (i3 != 2) {
            if (i3 != 1) {
                bnsi b2 = f36892a.mo68387b();
                b2.mo68432a("nxr", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68409a("Expected AudioManager.AUDIOFOCUS_REQUEST_GRANTED, but got %d", i3);
            }
            if (i2 == 1) {
                z = this.f36893b;
                this.f36893b = false;
            } else {
                z = false;
            }
            synchronized (this.f36896e) {
                this.f36895d.put(str, Integer.valueOf(i2));
            }
            m28129a(0, z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nxr.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nxr.a(android.media.AudioFocusInfo, int):void
      nxr.a(android.media.AudioFocusInfo, boolean):void
      nxt.a(android.media.AudioFocusInfo, int):void
      nxt.a(android.media.AudioFocusInfo, boolean):void
      nxr.a(int, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21810a(String str, int i, int i2, boolean z) {
        Integer num;
        bnsi d = f36892a.mo68390d();
        d.mo68432a("nxr", "a", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        Integer valueOf = Integer.valueOf(i2);
        Boolean valueOf2 = Boolean.valueOf(z);
        d.mo68425a("Received onAudioFocusLoss. lossReceived: %d, wasNotified: %b, clientId: %s.", valueOf, valueOf2, str);
        if (!m28130a(i)) {
            bnsi d2 = f36892a.mo68390d();
            d2.mo68432a("nxr", "a", 134, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("shouldHandleAudioFocusEvent returned false; not handling focus event.");
            return;
        }
        synchronized (this.f36896e) {
            num = (Integer) this.f36895d.get(str);
        }
        if (num != null) {
            bnsi d3 = f36892a.mo68390d();
            d3.mo68432a("nxr", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d3.mo68414a("currentGrant: %d, invalidateByTransientLoss: %b", num.intValue(), this.f36893b);
            if (i2 == -3 || i2 == -2) {
                if (num.intValue() == 1) {
                    return;
                }
            } else if (!(i2 == -1 || i2 == 0)) {
                bnsi b = f36892a.mo68387b();
                b.mo68432a("nxr", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68409a("Received unexpected loss: %d", i2);
            }
            synchronized (this.f36896e) {
                this.f36895d.remove(str);
            }
            m28129a(20, false);
            return;
        }
        bnsi c = f36892a.mo68388c();
        c.mo68432a("nxr", "a", 145, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68425a("Unrecognized client receiving loss. lossReceived: %d, wasNotified: %b, clientId: %s", valueOf, valueOf2, str);
    }

    /* renamed from: a */
    public final void mo21811a(boolean z) {
        nxp nxp;
        Handler handler;
        int a = mo21806a();
        int andSet = this.f36897f.getAndSet(a);
        bnsi d = f36892a.mo68390d();
        d.mo68432a("nxr", "a", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68425a("maybeNotifyFocusStackChange: currentFocusGrant %d, oldFocusGrant %d, forceNotify: %b", Integer.valueOf(a), Integer.valueOf(andSet), Boolean.valueOf(z));
        if ((z || a != andSet) && (handler = (nxp = this.f36898g.f36878a).f36883b) != null) {
            handler.post(new nxo(nxp));
        }
    }
}
