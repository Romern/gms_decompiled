package p000;

import java.nio.charset.Charset;
import java.util.Set;

/* renamed from: ahrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahrf implements ahll, ahop {

    /* renamed from: a */
    public static final /* synthetic */ int f67863a = 0;

    /* renamed from: b */
    private static final Charset f67864b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final ahov f67865c;

    /* renamed from: d */
    private final ahlk f67866d;

    /* renamed from: e */
    private final Set f67867e = new C1225nr();

    public ahrf(ahov ahov, ahlk ahlk) {
        this.f67865c = ahov;
        this.f67866d = ahlk;
    }

    /* renamed from: a */
    public final ahna mo36792a(ahkv ahkv, String str, butx butx) {
        aivw aivw;
        butt butt = butx.f154900f;
        if (butt == null) {
            butt = butt.f154868e;
        }
        ahfk q = ahkv.mo36739q(str);
        bqgy c = bqgy.m112818c();
        if (!this.f67865c.mo36918a(butt.f154871b, new ahre(butt, c))) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68420a("Failed to start scanning for Wifi Aware device %s", ahkm.m55981a(butt.f154872c.mo73780k()));
            aivw = null;
        } else {
            Exception exc = new Exception("Future cancelled.");
            q.mo36399a(new ahrd(c, exc));
            if (q.mo36401b()) {
                c.mo69136a((Throwable) exc);
            }
            try {
                aivw = (aivw) ahhf.m55778c("WifiAwareBandwidthUpgradeMedium.discover", c, cfnv.f184625a.mo6606a().mo81824bp() * 1000);
            } finally {
                this.f67865c.mo36937i(butt.f154871b);
            }
        }
        if (aivw != null) {
            srn srn = ahkm.f67363a;
            aivx a = this.f67865c.mo36914a(aivw, butt.f154873d, ahkv.mo36739q(str));
            this.f67865c.mo36938j(butt.f154871b);
            if (a != null) {
                ahrg a2 = ahrg.m56414a(a);
                if (a2 != null) {
                    return a2;
                }
                srz.m36171a(a);
                throw new ahli(bvhu.WIFI_AWARE_MEDIUM_ERROR, 32, String.format("WifiAwareBandwidthUpgradeMedium failed to create new EndpointChannel for outgoing socket to endpoint %s, aborting upgrade.", str));
            }
            throw new ahli(bvhu.WIFI_AWARE_MEDIUM_ERROR, 24, String.format("WifiAwareBandwidthUpgradeMedium couldn't initiate WIFI_AWARE upgrade for endpoint %s because we failed to connect.", str));
        }
        this.f67865c.mo36938j(butt.f154871b);
        throw new ahli(bvhu.WIFI_AWARE_MEDIUM_ERROR, 23, String.format("WifiAwareBandwidthUpgradeMedium couldn't initiate WIFI_AWARE upgrade for endpoint %s because we failed to discover the remote device.", str));
    }

    /* renamed from: a */
    public final void mo36793a() {
        for (String str : this.f67867e) {
            this.f67865c.mo36936h(str);
            this.f67865c.mo36934g(str);
            this.f67865c.mo36938j(str);
        }
        this.f67867e.clear();
        srn srn = ahkm.f67363a;
    }

    /* renamed from: a */
    public final void mo36909a(aivx aivx) {
        this.f67866d.mo36783a(new ahlj(ahrg.m56414a(aivx), aivx));
    }

    /* renamed from: a */
    public final byte[] mo36794a(ahkv ahkv, String str) {
        String a = ails.m57437a(28);
        byte[] bytes = ails.m57437a(28).getBytes(f67864b);
        String a2 = ails.m57437a(12);
        if (this.f67865c.mo36921a(a, a2, this)) {
            srn srn = ahkm.f67363a;
            if (this.f67865c.mo36922a(a, bytes)) {
                this.f67867e.add(a);
                bxvd da = butt.f154868e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                butt butt = (butt) da.f164949b;
                a.getClass();
                butt.f154870a |= 1;
                butt.f154871b = a;
                bxtx a3 = bxtx.m123261a(bytes);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                butt butt2 = (butt) da.f164949b;
                a3.getClass();
                int i = butt2.f154870a | 2;
                butt2.f154870a = i;
                butt2.f154872c = a3;
                if (a2 != null) {
                    a2.getClass();
                    butt2.f154870a = i | 4;
                    butt2.f154873d = a2;
                }
                bxvd da2 = butx.f154893h.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                butx butx = (butx) da2.f164949b;
                butx.f154896b = 6;
                butx.f154895a |= 1;
                butt butt3 = (butt) da.mo74062i();
                butt3.getClass();
                butx.f154900f = butt3;
                butx.f154895a |= 16;
                return ahoy.m56310a((butx) da2.mo74062i());
            }
            this.f67865c.mo36934g(a);
            throw new ahli(bvhu.WIFI_AWARE_MEDIUM_ERROR, 22, String.format("WifiAwareBandwidthUpgradeMedium couldn't complete the Wifi Aware upgrade for endpoint %s because it failed to publish a Wifi Aware advertisement.", str));
        }
        throw new ahli(bvhu.WIFI_AWARE_MEDIUM_ERROR, 21, String.format("WifiAwareBandwidthUpgradeMedium couldn't complete the Wifi Aware upgrade for endpoint %s because it failed to listen for incoming Wifi Aware connections.", str));
    }
}
