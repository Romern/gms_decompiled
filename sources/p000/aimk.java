package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;

/* renamed from: aimk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aimk {

    /* renamed from: a */
    public aisn f69175a;

    /* renamed from: b */
    public aiss f69176b;

    /* renamed from: c */
    public aimj f69177c = aimj.NONE;

    /* renamed from: d */
    private final bqgj f69178d = ahhr.m55806b();

    /* renamed from: e */
    private final bqgj f69179e = ahhr.m55802a(6);

    /* renamed from: f */
    private final Context f69180f;

    /* renamed from: g */
    private aith f69181g;

    /* renamed from: h */
    private ahfi f69182h;

    /* renamed from: i */
    private final ScheduledExecutorService f69183i = ahhr.m55804a();

    /* renamed from: j */
    private aiss f69184j;

    /* renamed from: k */
    private aisv f69185k;

    /* renamed from: l */
    private SessionDescription f69186l;

    /* renamed from: m */
    private final List f69187m = new ArrayList();

    /* renamed from: n */
    private final ailt f69188n = new ailt(this);

    /* renamed from: o */
    private final ailu f69189o = new ailu(this);

    /* renamed from: p */
    private final aimf f69190p = new aimf(this);

    public aimk(Context context) {
        this.f69180f = context;
    }

    /* renamed from: a */
    private static aith m57456a(Context context, aiss aiss, String str) {
        if (!cfnv.f184625a.mo6606a().mo81809ba()) {
            return new aitg(new aitc(context), aiss, str);
        }
        return new aitb(new aitc(context), aiss, str);
    }

    /* renamed from: b */
    private final void m57460b(String str) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aimk", "b", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Stopping WebRTC signaling: %s", str);
        m57462k();
    }

    /* renamed from: j */
    private final boolean m57461j() {
        return (this.f69177c == aimj.NONE || this.f69184j == null || this.f69176b == null) ? false : true;
    }

    /* renamed from: k */
    private final synchronized void m57462k() {
        this.f69177c = aimj.NONE;
        this.f69186l = null;
        this.f69187m.clear();
        this.f69184j = null;
        this.f69176b = null;
        ahfi ahfi = this.f69182h;
        if (ahfi != null) {
            ahfi.mo36396b();
            this.f69182h = null;
        }
        aith aith = this.f69181g;
        if (aith != null) {
            aith.mo37988a(this.f69178d);
            this.f69181g = null;
        }
        if (this.f69185k == null) {
            m57464m();
        }
    }

    /* renamed from: l */
    private final void m57463l() {
        aisv aisv = this.f69185k;
        if (aisv != null) {
            srz.m36171a(aisv);
            this.f69185k = null;
        }
    }

    /* renamed from: m */
    private final void m57464m() {
        aisn aisn = this.f69175a;
        if (aisn != null) {
            aisn.mo37957c();
            this.f69175a = null;
        }
    }

    /* renamed from: c */
    public final void mo37680c() {
        m57462k();
        m57463l();
        m57464m();
    }

    /* renamed from: d */
    public final synchronized boolean mo37681d() {
        return this.f69177c == aimj.OFFERER;
    }

    /* renamed from: e */
    public final synchronized void mo37682e() {
        if (!mo37681d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aimk", "e", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping stop accepting connections: we are not currently accepting WebRTC connections.");
            return;
        }
        m57462k();
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aimk", "e", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped accepting WebRTC connections.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        return;
     */
    /* renamed from: f */
    public final synchronized void mo37683f() {
        if (!mo37681d()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aimk", "f", 491, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Skipping restart listening for tachyon inbox messages since we are not accepting connections.");
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aimk", "f", 497, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Restarting listening for tachyon inbox messages.");
        this.f69181g.mo37990b();
        String a = aisx.m57878a(this.f69180f, this.f69184j.f69653a);
        if (a == null) {
            m57457a("Unable to get droid guard result");
            return;
        }
        aith a2 = m57456a(this.f69180f, this.f69184j, a);
        this.f69181g = a2;
        if (!a2.mo37985a() || !this.f69181g.mo37986a(this.f69188n)) {
            mo37680c();
        }
    }

    /* renamed from: g */
    public final synchronized void mo37684g() {
        m57462k();
        m57463l();
        m57464m();
    }

    /* renamed from: h */
    public final synchronized void mo37685h() {
        m57457a("The WebRTC data channel was closed.");
    }

    /* renamed from: i */
    public final synchronized void mo37686i() {
        aisv aisv = this.f69185k;
        if (aisv == null) {
            m57457a("Data channel buffer changed without a WebRtcSocket.");
        } else {
            aisv.mo37979d();
        }
    }

    /* renamed from: b */
    public final synchronized void mo37678b() {
        ahhr.m55805a(this.f69178d, "WebRtc.singleThreadedSignalingOffloader");
        ahhr.m55805a(this.f69179e, "WebRtc.multiThreadedSignalingOffloader");
        ahhr.m55805a(this.f69183i, "WebRtc.restartTachyonReceiveMessagesExecutor");
        mo37680c();
    }

    /* renamed from: a */
    private final void m57457a(String str) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aimk", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Disconnecting WebRTC: %s", str);
        mo37680c();
    }

    /* renamed from: a */
    private final void m57458a(String str, Throwable th) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("aimk", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Disconnecting WebRTC: %s", str);
        mo37680c();
    }

    /* renamed from: b */
    public final synchronized void mo37679b(byte[] bArr) {
        aisv aisv = this.f69185k;
        if (aisv != null) {
            try {
                aisv.f69658f.write(bArr);
                aisv.f69658f.flush();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aisv", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unable to write to WebRtcSocket pipe.");
                aisv.mo37639c();
            }
        } else {
            m57457a("Received a data channel message without a WebRTC socket.");
        }
    }

    /* renamed from: a */
    private final boolean m57459a(SessionDescription sessionDescription) {
        if (sessionDescription == null) {
            m57457a("Unable to get local session description.");
            return false;
        } else if (this.f69175a.mo37949a(sessionDescription) != null) {
            return true;
        } else {
            m57457a("Unable to set local session description.");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r0 = (p000.bnsl) p000.ailf.f69111a.mo68390d();
        r0.mo68432a("aimk", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r0.mo68420a("Attempting to make a WebRTC connection to %s.", r7);
        r7 = (p000.aisv) p000.ahhf.m55778c("WebRtc.connect", mo37670a(r6.f69175a.f69647b, p000.ailw.f69154a), p000.cfnv.f184625a.mo6606a().mo81761aT());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r7 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        mo37680c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        return r7;
     */
    /* renamed from: a */
    public final aisv mo37669a(aiss aiss) {
        synchronized (this) {
            if (!mo37675a()) {
                mo37680c();
                return null;
            } else if (this.f69177c != aimj.NONE) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68432a("aimk", "a", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Cannot connect with WebRTC because we are already acting as a %s.", this.f69177c);
                return null;
            } else {
                this.f69176b = aiss;
                if (!mo37676a(aimj.ANSWERER, aiss.m57869a(ails.m57448b(64)))) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public final bqgg mo37670a(bqgg bqgg, aimi aimi) {
        bqgg a = bqdx.m112673a(bqgg, new ailx(this), bqfb.INSTANCE);
        bqga.m112781a(a, new aimh(this, aimi), bqfb.INSTANCE);
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37671a(aisv aisv) {
        if (aisv == null) {
            m57457a("Unable to get WebRtcSocket.");
        } else if (this.f69185k != null) {
            m57457a("Tried to create a new WebRTC socket without closing the existing one.");
        } else {
            this.f69185k = aisv;
        }
    }

    /* renamed from: a */
    public final void mo37672a(Runnable runnable) {
        this.f69178d.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo37673a(IceCandidate iceCandidate) {
        if (m57461j()) {
            this.f69181g.mo37989a(this.f69179e, this.f69176b, aist.m57871a(this.f69184j, Arrays.asList(iceCandidate)).mo73642k());
            return;
        }
        this.f69187m.add(iceCandidate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0254, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37674a(byte[] bArr) {
        IceCandidate iceCandidate;
        if (this.f69175a != null) {
            try {
                bvgv bvgv = (bvgv) bxvk.m124016a(bvgv.f156046f, bArr, bxus.m123744c());
                if ((bvgv.f156048a & 1) != 0) {
                    if (bvgv.f156049b == 6 && this.f69176b == null) {
                        bvgr bvgr = bvgv.f156051d;
                        if (bvgr == null) {
                            bvgr = bvgr.f156035c;
                        }
                        this.f69176b = new aiss(bvgr.f156038b);
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                        bnsl.mo68432a("aimk", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Peer %s is ready for WebRTC signaling.", this.f69176b);
                    }
                    if (m57461j()) {
                        bvgr bvgr2 = bvgv.f156051d;
                        if (bvgr2 == null) {
                            bvgr2 = bvgr.f156035c;
                        }
                        if (bvgr2.f156038b.equals(this.f69176b.f69653a)) {
                            int i = bvgv.f156049b;
                            SessionDescription sessionDescription = null;
                            if (i == 6) {
                                SessionDescription sessionDescription2 = this.f69186l;
                                if (sessionDescription2 != null) {
                                    aith aith = this.f69181g;
                                    aiss aiss = this.f69176b;
                                    aiss aiss2 = this.f69184j;
                                    bxvd da = bvgv.f156046f.mo74144da();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvgv bvgv2 = (bvgv) da.f164949b;
                                    bvgv2.f156052e = 1;
                                    bvgv2.f156048a = 2 | bvgv2.f156048a;
                                    bvgr a = aist.m57870a(aiss2);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvgv bvgv3 = (bvgv) da.f164949b;
                                    a.getClass();
                                    bvgv3.f156051d = a;
                                    bvgv3.f156048a |= 1;
                                    bxvd da2 = bvgq.f156031c.mo74144da();
                                    bxvd da3 = bvgt.f156041c.mo74144da();
                                    String str = sessionDescription2.f192049b;
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bvgt bvgt = (bvgt) da3.f164949b;
                                    str.getClass();
                                    bvgt.f156043a |= 1;
                                    bvgt.f156044b = str;
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bvgq bvgq = (bvgq) da2.f164949b;
                                    bvgt bvgt2 = (bvgt) da3.mo74062i();
                                    bvgt2.getClass();
                                    bvgq.f156034b = bvgt2;
                                    bvgq.f156033a = 1 | bvgq.f156033a;
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bvgv bvgv4 = (bvgv) da.f164949b;
                                    bvgq bvgq2 = (bvgq) da2.mo74062i();
                                    bvgq2.getClass();
                                    bvgv4.f156050c = bvgq2;
                                    bvgv4.f156049b = 3;
                                    if (!aith.mo37987a(aiss, ((bvgv) da.mo74062i()).mo73642k())) {
                                        String valueOf = String.valueOf(this.f69176b);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                                        sb.append("Unable to send offer to ");
                                        sb.append(valueOf);
                                        sb.append(".");
                                        m57457a(sb.toString());
                                        return;
                                    }
                                    this.f69186l = null;
                                    if (!this.f69187m.isEmpty()) {
                                        this.f69181g.mo37989a(this.f69179e, this.f69176b, aist.m57871a(this.f69184j, this.f69187m).mo73642k());
                                        this.f69187m.clear();
                                    }
                                } else {
                                    m57457a("Unable to send pending offer to remote peer: we never created an offer.");
                                }
                            } else if (i == 3) {
                                bvgt bvgt3 = ((bvgq) bvgv.f156050c).f156034b;
                                if (bvgt3 == null) {
                                    bvgt3 = bvgt.f156041c;
                                }
                                if ((bvgt3.f156043a & 1) != 0) {
                                    sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, bvgt3.f156044b);
                                }
                                this.f69175a.mo37956c(sessionDescription);
                                SessionDescription b = this.f69175a.mo37954b();
                                if (m57459a(b)) {
                                    aith aith2 = this.f69181g;
                                    aiss aiss3 = this.f69176b;
                                    aiss aiss4 = this.f69184j;
                                    bxvd da4 = bvgv.f156046f.mo74144da();
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bvgv bvgv5 = (bvgv) da4.f164949b;
                                    bvgv5.f156052e = 2;
                                    bvgv5.f156048a = 2 | bvgv5.f156048a;
                                    bvgr a2 = aist.m57870a(aiss4);
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bvgv bvgv6 = (bvgv) da4.f164949b;
                                    a2.getClass();
                                    bvgv6.f156051d = a2;
                                    bvgv6.f156048a |= 1;
                                    bxvd da5 = bvgn.f156018c.mo74144da();
                                    bxvd da6 = bvgt.f156041c.mo74144da();
                                    String str2 = b.f192049b;
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bvgt bvgt4 = (bvgt) da6.f164949b;
                                    str2.getClass();
                                    bvgt4.f156043a |= 1;
                                    bvgt4.f156044b = str2;
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvgn bvgn = (bvgn) da5.f164949b;
                                    bvgt bvgt5 = (bvgt) da6.mo74062i();
                                    bvgt5.getClass();
                                    bvgn.f156021b = bvgt5;
                                    bvgn.f156020a = 1 | bvgn.f156020a;
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bvgv bvgv7 = (bvgv) da4.f164949b;
                                    bvgn bvgn2 = (bvgn) da5.mo74062i();
                                    bvgn2.getClass();
                                    bvgv7.f156050c = bvgn2;
                                    bvgv7.f156049b = 4;
                                    if (!aith2.mo37987a(aiss3, ((bvgv) da4.mo74062i()).mo73642k())) {
                                        m57457a("Failed to send answer to peer.");
                                    }
                                }
                            } else if (i == 4) {
                                bvgt bvgt6 = ((bvgn) bvgv.f156050c).f156021b;
                                if (bvgt6 == null) {
                                    bvgt6 = bvgt.f156041c;
                                }
                                if ((bvgt6.f156043a & 1) != 0) {
                                    sessionDescription = new SessionDescription(SessionDescription.Type.ANSWER, bvgt6.f156044b);
                                }
                                this.f69175a.mo37955b(sessionDescription);
                            } else if (i == 5) {
                                ArrayList arrayList = new ArrayList();
                                if (bvgv.f156049b == 5) {
                                    bxwc bxwc = ((bvgp) bvgv.f156050c).f156030a;
                                    int size = bxwc.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        bvgo bvgo = (bvgo) bxwc.get(i2);
                                        int i3 = bvgo.f156024a;
                                        if ((i3 & 1) == 0 || (i3 & 2) == 0 || (i3 & 4) == 0) {
                                            iceCandidate = null;
                                        } else {
                                            iceCandidate = new IceCandidate(bvgo.f156026c, bvgo.f156027d, bvgo.f156025b);
                                        }
                                        if (iceCandidate != null) {
                                            arrayList.add(iceCandidate);
                                        }
                                    }
                                }
                                if (!this.f69175a.mo37953a(arrayList)) {
                                    m57457a("Could not add remote ice candidates.");
                                }
                            }
                        } else {
                            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                            bnsl2.mo68432a("aimk", "a", 349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Ignoring WebRTC frame: we are only listening for another peer.");
                        }
                    } else {
                        bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl3.mo68432a("aimk", "a", 343, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68405a("Ignoring WebRTC frame: we are not currently listening for signaling messages.");
                    }
                } else {
                    m57457a("Invalid WebRTC frame: sender id is missing.");
                }
            } catch (bxwf e) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                bnsl4.mo68437a(e);
                bnsl4.mo68432a("aimk", "a", 170, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Disconnecting WebRTC: %s", "Failed to parse tachyon signaling frame.");
                mo37680c();
            }
        } else {
            m57457a("We received a WebRTC frame before we started signaling.");
        }
    }

    /* renamed from: a */
    public final boolean mo37675a() {
        NetworkInfo activeNetworkInfo;
        return cfnv.f184625a.mo6606a().mo81749aH() && (activeNetworkInfo = ((ConnectivityManager) this.f69180f.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: a */
    public final boolean mo37676a(aimj aimj, aiss aiss) {
        this.f69177c = aimj;
        this.f69184j = aiss;
        if (this.f69175a == null) {
            String a = aisx.m57878a(this.f69180f, aiss.f69653a);
            if (a == null) {
                m57457a("Unable to get droid guard result.");
                return false;
            } else if (this.f69181g == null) {
                aith a2 = m57456a(this.f69180f, aiss, a);
                this.f69181g = a2;
                if (!a2.mo37985a() || !this.f69181g.mo37986a(this.f69188n)) {
                    mo37680c();
                    return false;
                }
                if (aimj == aimj.ANSWERER) {
                    aith aith = this.f69181g;
                    aiss aiss2 = this.f69176b;
                    bxvd da = bvgv.f156046f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvgv bvgv = (bvgv) da.f164949b;
                    bvgv.f156052e = 4;
                    bvgv.f156048a |= 2;
                    bvgr a3 = aist.m57870a(aiss);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvgv bvgv2 = (bvgv) da.f164949b;
                    a3.getClass();
                    bvgv2.f156051d = a3;
                    bvgv2.f156048a |= 1;
                    bvgs bvgs = bvgs.f156039a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvgv bvgv3 = (bvgv) da.f164949b;
                    bvgs.getClass();
                    bvgv3.f156050c = bvgs;
                    bvgv3.f156049b = 6;
                    if (!aith.mo37987a(aiss2, ((bvgv) da.mo74062i()).mo73642k())) {
                        String valueOf = String.valueOf(this.f69176b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Could not send signaling poke to peer ");
                        sb.append(valueOf);
                        sb.append(".");
                        m57457a(sb.toString());
                        return false;
                    }
                }
                List c = this.f69181g.mo37991c();
                if (c.isEmpty()) {
                    m57457a("Failed to retrieve any ice servers from tachyon.");
                    return false;
                }
                this.f69175a = new aisn(this.f69180f, this.f69189o, this.f69190p, c, this.f69178d);
                return true;
            } else {
                m57460b("Tried to initialize WebRTC without shutting down signaling first.");
                return false;
            }
        } else {
            m57460b("Tried to initialize WebRTC without shutting down the previous connection.");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo37677a(aiss aiss, aimi aimi) {
        if (!mo37675a()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aimk", "a", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cannot start accepting WebRTC connections because WebRTC is not available.");
            mo37680c();
            return false;
        } else if (mo37681d()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aimk", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("We are already accepting WebRTC connections for %s", aiss);
            return false;
        } else if (this.f69177c != aimj.NONE) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
            bnsl3.mo68432a("aimk", "a", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Cannot start accepting WebRTC connections because we are already acting as a %s.", this.f69177c);
            return false;
        } else if (mo37676a(aimj.OFFERER, aiss)) {
            srn srn = ailf.f69111a;
            this.f69182h = ahfi.m55634a(new ailv(this), cfnv.m140745G(), this.f69183i);
            SessionDescription a = this.f69175a.mo37948a();
            if (m57459a(a)) {
                this.f69186l = a;
                mo37670a(this.f69175a.f69647b, aimi);
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68432a("aimk", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Started listening for WebRTC connections as %s.", aiss);
                return true;
            }
        }
    }
}
