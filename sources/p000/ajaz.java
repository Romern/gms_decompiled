package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;
import com.google.location.nearby.messages.debug.internal.DebugPokeResponse;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: ajaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajaz implements aiwq {

    /* renamed from: a */
    public RemoteCallbackList f70289a;

    /* renamed from: b */
    public RemoteCallbackList f70290b;

    /* renamed from: c */
    private final aiyt f70291c;

    /* renamed from: d */
    private final aiyw f70292d;

    /* renamed from: e */
    private final ajeb f70293e;

    /* renamed from: f */
    private final ajat f70294f;

    /* renamed from: g */
    private final Context f70295g;

    /* renamed from: h */
    private final ajbd f70296h;

    /* renamed from: i */
    private byyg f70297i;

    /* renamed from: j */
    private ajgp f70298j;

    /* renamed from: k */
    private RemoteCallbackList f70299k;

    /* renamed from: l */
    private RemoteCallbackList f70300l;

    /* renamed from: m */
    private RemoteCallbackList f70301m;

    /* renamed from: n */
    private ajaw f70302n;

    public ajaz(Context context) {
        this.f70295g = context;
        ajbd ajbd = (ajbd) ahgz.m55754a(context, ajbd.class);
        this.f70296h = ajbd;
        this.f70291c = ajbd.f70307d;
        this.f70292d = ajbd.f70308e;
        this.f70293e = (ajeb) ahgz.m55754a(context, ajeb.class);
        this.f70294f = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70294f.f70279g.add(new ajay(this));
    }

    /* renamed from: a */
    private static final int m58406a(RemoteCallbackList remoteCallbackList) {
        if (remoteCallbackList == null) {
            return 0;
        }
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    /* renamed from: b */
    private final DebugPokeResponse m58412b(DebugPokeRequest debugPokeRequest) {
        bvhf bvhf = debugPokeRequest.f191784c;
        if (bvhf == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajaz", "b", 467, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DebugPoke: UNREGISTER_TOKEN_OBSERVER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        RemoteCallbackList remoteCallbackList = this.f70289a;
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(bvhf);
        }
        srn srn = ahfq.f67120a;
        return new DebugPokeResponse(0);
    }

    /* renamed from: c */
    private final DebugPokeResponse m58413c(DebugPokeRequest debugPokeRequest) {
        if (debugPokeRequest.f191784c == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajaz", "c", 481, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DebugPoke: REGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        if (this.f70290b == null) {
            this.f70290b = new RemoteCallbackList();
        }
        this.f70290b.register(debugPokeRequest.f191784c);
        if (this.f70302n == null) {
            ajaw ajaw = new ajaw(this);
            this.f70302n = ajaw;
            this.f70291c.f70103a = ajaw;
        }
        srn srn = ahfq.f67120a;
        return new DebugPokeResponse(0);
    }

    /* renamed from: d */
    private final DebugPokeResponse m58414d(DebugPokeRequest debugPokeRequest) {
        bvhf bvhf = debugPokeRequest.f191784c;
        if (bvhf == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajaz", "d", 503, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DebugPoke: UNREGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        RemoteCallbackList remoteCallbackList = this.f70290b;
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(bvhf);
        }
        srn srn = ahfq.f67120a;
        return new DebugPokeResponse(0);
    }

    /* renamed from: e */
    private final boolean m58415e() {
        return m58406a(this.f70301m) > 0;
    }

    /* renamed from: f */
    private final DebugPokeResponse m58416f() {
        bxvf bxvf = (bxvf) byuu.f168372b.mo74144da();
        bxvd da = byuw.f168380j.mo74144da();
        byyg byyg = this.f70294f.f70278f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byuw byuw = (byuw) da.f164949b;
        byyg.getClass();
        byuw.f168383b = byyg;
        int i = byuw.f168382a | 1;
        byuw.f168382a = i;
        ajat ajat = this.f70294f;
        byyg byyg2 = ajat.f70274b;
        byyg2.getClass();
        byuw.f168384c = byyg2;
        int i2 = i | 2;
        byuw.f168382a = i2;
        byyg byyg3 = ajat.f70275c;
        byyg3.getClass();
        byuw.f168385d = byyg3;
        int i3 = i2 | 4;
        byuw.f168382a = i3;
        byyg byyg4 = ajat.f70277e;
        byyg4.getClass();
        byuw.f168386e = byyg4;
        int i4 = i3 | 8;
        byuw.f168382a = i4;
        byyg byyg5 = ajat.f70276d;
        byyg5.getClass();
        byuw.f168387f = byyg5;
        byuw.f168382a = i4 | 16;
        bxvd da2 = byux.f168392e.mo74144da();
        String m = cfop.m141883m();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byux byux = (byux) da2.f164949b;
        m.getClass();
        byux.f168394a |= 1;
        byux.f168395b = m;
        String l = cfop.m141882l();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byux byux2 = (byux) da2.f164949b;
        l.getClass();
        byux2.f168394a |= 2;
        byux2.f168396c = l;
        String b = cfop.m141872b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byux byux3 = (byux) da2.f164949b;
        b.getClass();
        byux3.f168394a |= 4;
        byux3.f168397d = b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byuw byuw2 = (byuw) da.f164949b;
        byux byux4 = (byux) da2.mo74062i();
        byux4.getClass();
        byuw2.f168388g = byux4;
        byuw2.f168382a |= 32;
        bxvd da3 = byux.f168392e.mo74144da();
        String m2 = cfop.m141883m();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byux byux5 = (byux) da3.f164949b;
        m2.getClass();
        byux5.f168394a |= 1;
        byux5.f168395b = m2;
        String l2 = cfop.m141882l();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byux byux6 = (byux) da3.f164949b;
        l2.getClass();
        byux6.f168394a |= 2;
        byux6.f168396c = l2;
        String b2 = cfop.m141872b();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        byux byux7 = (byux) da3.f164949b;
        b2.getClass();
        byux7.f168394a |= 4;
        byux7.f168397d = b2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byuw byuw3 = (byuw) da.f164949b;
        byux byux8 = (byux) da3.mo74062i();
        byux8.getClass();
        byuw3.f168389h = byux8;
        byuw3.f168382a |= 64;
        bxvd da4 = byux.f168392e.mo74144da();
        String m3 = cfop.m141883m();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        byux byux9 = (byux) da4.f164949b;
        m3.getClass();
        byux9.f168394a |= 1;
        byux9.f168395b = m3;
        String l3 = cfop.m141882l();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        byux byux10 = (byux) da4.f164949b;
        l3.getClass();
        byux10.f168394a |= 2;
        byux10.f168396c = l3;
        String b3 = cfop.m141872b();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        byux byux11 = (byux) da4.f164949b;
        b3.getClass();
        byux11.f168394a |= 4;
        byux11.f168397d = b3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byuw byuw4 = (byuw) da.f164949b;
        byux byux12 = (byux) da4.mo74062i();
        byux12.getClass();
        byuw4.f168390i = byux12;
        byuw4.f168382a |= 128;
        byuw byuw5 = (byuw) da.mo74062i();
        bxvd da5 = byus.f168362d.mo74144da();
        byuq byuq = byuq.GET_CONFIGURATION;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        byus byus = (byus) da5.f164949b;
        byus.f168365b = byuq.f168350B;
        int i5 = byus.f168364a | 1;
        byus.f168364a = i5;
        byuw5.getClass();
        byus.f168366c = byuw5;
        byus.f168364a = i5 | 2;
        byus byus2 = (byus) da5.mo74062i();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byuu byuu = (byuu) bxvf.f164949b;
        byus2.getClass();
        if (!byuu.f168374a.mo73666a()) {
            byuu.f168374a = bxvk.m124021a(byuu.f168374a);
        }
        byuu.f168374a.add(byus2);
        return new DebugPokeResponse(1, 0, ((byuu) bxvf.mo74062i()).mo73642k());
    }

    /* renamed from: a */
    private static byyo m58407a(String str, int i) {
        byyn byyn = (byyn) byyo.f168979d.mo74144da();
        if (byyn.f164950c) {
            byyn.mo74035c();
            byyn.f164950c = false;
        }
        byyo byyo = (byyo) byyn.f164949b;
        str.getClass();
        int i2 = byyo.f168981a | 2;
        byyo.f168981a = i2;
        byyo.f168983c = str;
        byyo.f168981a = i2 | 1;
        byyo.f168982b = i;
        return (byyo) byyn.mo74062i();
    }

    /* renamed from: b */
    public final boolean mo38176b() {
        return m58406a(this.f70299k) > 0;
    }

    /* renamed from: d */
    public final void mo38429d() {
        if (m58415e()) {
            bxvd da = bvhh.f156066c.mo74144da();
            ajat ajat = this.f70294f;
            boolean z = !ajat.f70276d.equals(ajat.f70273a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhh bvhh = (bvhh) da.f164949b;
            bvhh.f156068a |= 1;
            bvhh.f156069b = z;
            m58410a(da.mo74062i(), this.f70301m);
        }
    }

    /* renamed from: c */
    public final boolean mo38177c() {
        return m58406a(this.f70300l) > 0;
    }

    /* renamed from: a */
    private final DebugPokeResponse m58408a(byvl byvl) {
        if (byvl == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajaz", "a", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DebugPoke: No updateConfiguration for UPDATE_CONFIGURATION");
            return new DebugPokeResponse(13);
        }
        byux byux = byvl.f168449c;
        if (byux == null) {
            byux = byux.f168392e;
        }
        if ((byux.f168394a & 1) != 0) {
            bdyx bdyx = C1712cfor.f185138V;
            byux byux2 = byvl.f168449c;
            if (byux2 == null) {
                byux2 = byux.f168392e;
            }
            bdyx.mo58454b(byux2.f168395b);
        }
        byux byux3 = byvl.f168449c;
        if (byux3 == null) {
            byux3 = byux.f168392e;
        }
        if ((byux3.f168394a & 2) != 0) {
            bdyx bdyx2 = C1712cfor.f185136T;
            byux byux4 = byvl.f168449c;
            if (byux4 == null) {
                byux4 = byux.f168392e;
            }
            bdyx2.mo58454b(byux4.f168396c);
        }
        byux byux5 = byvl.f168449c;
        if (byux5 == null) {
            byux5 = byux.f168392e;
        }
        if ((byux5.f168394a & 4) != 0) {
            bdyx bdyx3 = C1712cfor.f185145d;
            byux byux6 = byvl.f168449c;
            if (byux6 == null) {
                byux6 = byux.f168392e;
            }
            bdyx3.mo58454b(byux6.f168397d);
        }
        if ((byvl.f168447a & 1) != 0) {
            ajat ajat = this.f70294f;
            byyg byyg = byvl.f168448b;
            if (byyg == null) {
                byyg = byyg.f168916p;
            }
            ajat.mo38414a(byyg);
        }
        return m58416f();
    }

    /* renamed from: a */
    private final DebugPokeResponse m58409a(DebugPokeRequest debugPokeRequest) {
        if (debugPokeRequest.f191784c == null) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
            bnsl.mo68432a("ajaz", "a", 445, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DebugPoke: REGISTER_TOKEN_OBSERVER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        if (this.f70289a == null) {
            this.f70289a = new RemoteCallbackList();
        }
        this.f70289a.register(debugPokeRequest.f191784c);
        if (this.f70298j == null) {
            ajax ajax = new ajax(this);
            this.f70298j = ajax;
            aiyw aiyw = this.f70292d;
            aiyw.f70111d.mo72984b();
            aiyw.f70110c = ajax;
        }
        srn srn = ahfq.f67120a;
        return new DebugPokeResponse(0);
    }

    /* renamed from: a */
    private static void m58410a(bxxc bxxc, RemoteCallbackList remoteCallbackList) {
        byte[] bArr;
        if (remoteCallbackList != null) {
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            if (beginBroadcast > 0) {
                bArr = bxxc.mo73642k();
            } else {
                bArr = null;
            }
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    bvhg bvhg = (bvhg) remoteCallbackList.getBroadcastItem(i);
                    Parcel bj = bvhg.mo8529bj();
                    bj.writeByteArray(bArr);
                    bvhg.mo8530c(2, bj);
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("ajaz", "a", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("DebugPoke: lost client with registered callback");
                } catch (Throwable th) {
                    remoteCallbackList.finishBroadcast();
                    throw th;
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    /* renamed from: a */
    private final void m58411a(byuz byuz) {
        byyg b = buqf.m120233b();
        bxvd bxvd = (bxvd) b.mo74142c(5);
        bxvd.mo73625a((bxvk) b);
        bxvf bxvf = (bxvf) bxvd;
        byyl byyl = ((byyg) bxvf.f164949b).f168921d;
        if (byyl == null) {
            byyl = byyl.f168949v;
        }
        bxvd bxvd2 = (bxvd) byyl.mo74142c(5);
        bxvd2.mo73625a((bxvk) byyl);
        bxvf bxvf2 = (bxvf) bxvd2;
        byuq byuq = byuq.COMMAND_UNKNOWN;
        bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
        bzbu a = bzbu.m125627a(byuz.f168403a);
        if (a == null) {
            a = bzbu.TOKEN_MEDIUM_UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 8) {
                        bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                        bnsl.mo68432a("ajaz", "a", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bzbu a2 = bzbu.m125627a(byuz.f168403a);
                        if (a2 == null) {
                            a2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                        }
                        bnsl.mo68420a("DebugPoke: Unknown medium requested: %s", a2);
                    } else if (byuz.f168405c) {
                        srn srn = ahfq.f67120a;
                        boolean z = byuz.f168404b;
                        if (bxvf2.f164950c) {
                            bxvf2.mo74035c();
                            bxvf2.f164950c = false;
                        }
                        byyl byyl2 = (byyl) bxvf2.f164949b;
                        int i = byyl2.f168951a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                        byyl2.f168951a = i;
                        byyl2.f168966q = z;
                        boolean z2 = byuz.f168404b;
                        byyl2.f168951a = i | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                        byyl2.f168965p = z2;
                    }
                } else if (byuz.f168405c) {
                    srn srn2 = ahfq.f67120a;
                    boolean z3 = byuz.f168404b;
                    if (bxvf2.f164950c) {
                        bxvf2.mo74035c();
                        bxvf2.f164950c = false;
                    }
                    byyl byyl3 = (byyl) bxvf2.f164949b;
                    int i2 = byyl3.f168951a | 64;
                    byyl3.f168951a = i2;
                    byyl3.f168958h = z3;
                    boolean z4 = byuz.f168404b;
                    byyl3.f168951a = i2 | 32;
                    byyl3.f168957g = z4;
                }
            } else if (byuz.f168405c) {
                srn srn3 = ahfq.f67120a;
                boolean z5 = byuz.f168404b;
                if (bxvf2.f164950c) {
                    bxvf2.mo74035c();
                    bxvf2.f164950c = false;
                }
                byyl byyl4 = (byyl) bxvf2.f164949b;
                int i3 = byyl4.f168951a | 16;
                byyl4.f168951a = i3;
                byyl4.f168956f = z5;
                boolean z6 = byuz.f168404b;
                byyl4.f168951a = i3 | 8;
                byyl4.f168955e = z6;
            }
        } else if (byuz.f168405c) {
            srn srn4 = ahfq.f67120a;
            boolean z7 = byuz.f168404b;
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            byyl byyl5 = (byyl) bxvf2.f164949b;
            int i4 = byyl5.f168951a | 4;
            byyl5.f168951a = i4;
            byyl5.f168954d = z7;
            boolean z8 = byuz.f168404b;
            byyl5.f168951a = i4 | 2;
            byyl5.f168953c = z8;
        }
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byyg byyg = (byyg) bxvf.f164949b;
        byyl byyl6 = (byyl) bxvf2.mo74062i();
        byyg byyg2 = byyg.f168916p;
        byyl6.getClass();
        byyg.f168921d = byyl6;
        byyg.f168918a |= 4;
        this.f70294f.mo38414a((byyg) bxvf.mo74062i());
    }

    /* renamed from: a */
    public final void mo38172a(bvhi bvhi) {
        m58410a(bvhi, this.f70300l);
    }

    /* renamed from: a */
    public final void mo38173a(bvhk bvhk) {
        m58410a(bvhk, this.f70299k);
    }

    /* renamed from: a */
    public final void mo38174a(DebugPokeRequest debugPokeRequest, bvhc bvhc) {
        bxwc bxwc;
        DebugPokeResponse debugPokeResponse;
        byuq byuq;
        bxwc bxwc2;
        DebugPokeResponse debugPokeResponse2;
        DebugPokeResponse debugPokeResponse3;
        DebugPokeRequest debugPokeRequest2 = debugPokeRequest;
        DebugPokeResponse debugPokeResponse4 = new DebugPokeResponse(0);
        int i = 2;
        if (debugPokeRequest2.f191783b != null) {
            byut byut = byut.f168368b;
            try {
                byut = (byut) bxvk.m124016a(byut.f168368b, debugPokeRequest2.f191783b, bxus.m123744c());
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ajaz", "a", 279, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DebugPoke: Unable to parse nano proto");
            }
            bxwc bxwc3 = byut.f168370a;
            int size = bxwc3.size();
            int i2 = 0;
            while (i2 < size) {
                byur byur = (byur) bxwc3.get(i2);
                srn srn = ahfq.f67120a;
                byuq a = byuq.m125364a(byur.f168354b);
                if (a == null) {
                    a = byuq.COMMAND_UNKNOWN;
                }
                bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
                switch (a.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        a.name();
                        break;
                    default:
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb.append("COMMAND_UNKNOWN(");
                        sb.append(valueOf);
                        sb.append(")");
                        sb.toString();
                        break;
                }
                byuq a2 = byuq.m125364a(byur.f168354b);
                if (a2 == null) {
                    a2 = byuq.COMMAND_UNKNOWN;
                }
                if (a2 != byuq.CLEAR_OVERRIDES) {
                    byuq a3 = byuq.m125364a(byur.f168354b);
                    if (a3 == null) {
                        a3 = byuq.COMMAND_UNKNOWN;
                    }
                    int i3 = 5;
                    if (a3 == byuq.SAVE_CLIENT_OVERRIDES) {
                        byyg b = buqf.m120233b();
                        bxvd bxvd = (bxvd) b.mo74142c(5);
                        bxvd.mo73625a((bxvk) b);
                        bxvf bxvf = (bxvf) bxvd;
                        bxvf.mo73625a((bxvk) this.f70294f.f70276d);
                        this.f70297i = (byyg) bxvf.mo74062i();
                        bxwc = bxwc3;
                        debugPokeResponse = debugPokeResponse4;
                    } else {
                        byuq a4 = byuq.m125364a(byur.f168354b);
                        if (a4 == null) {
                            a4 = byuq.COMMAND_UNKNOWN;
                        }
                        if (a4 == byuq.RESTORE_CLIENT_OVERRIDES && this.f70297i != null) {
                            this.f70294f.mo38413a();
                            this.f70294f.mo38414a(this.f70297i);
                            this.f70297i = null;
                            bxwc = bxwc3;
                            debugPokeResponse = debugPokeResponse4;
                        } else {
                            byuq a5 = byuq.m125364a(byur.f168354b);
                            if (a5 == null) {
                                a5 = byuq.COMMAND_UNKNOWN;
                            }
                            if (a5 != byuq.MEDIUM_OVERRIDE) {
                                bxwc2 = bxwc3;
                                debugPokeResponse2 = debugPokeResponse4;
                            } else if ((byur.f168353a & i) != 0) {
                                byuy byuy = byur.f168355c;
                                if (byuy == null) {
                                    byuy = byuy.f168398b;
                                }
                                if (byuy.f168400a.size() == 0) {
                                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                                    bnsl2.mo68432a("ajaz", "a", 304, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68405a("DebugPoke: No Params provided for medium override Command.");
                                    bxwc = bxwc3;
                                    debugPokeResponse = debugPokeResponse4;
                                } else {
                                    byuy byuy2 = byur.f168355c;
                                    if (byuy2 == null) {
                                        byuy2 = byuy.f168398b;
                                    }
                                    bxwc bxwc4 = byuy2.f168400a;
                                    int size2 = bxwc4.size();
                                    int i4 = 0;
                                    while (i4 < size2) {
                                        byuz byuz = (byuz) bxwc4.get(i4);
                                        byyg b2 = buqf.m120233b();
                                        bxvd bxvd2 = (bxvd) b2.mo74142c(i3);
                                        bxvd2.mo73625a((bxvk) b2);
                                        bxvf bxvf2 = (bxvf) bxvd2;
                                        byyl byyl = ((byyg) bxvf2.f164949b).f168921d;
                                        if (byyl == null) {
                                            byyl = byyl.f168949v;
                                        }
                                        bxvd bxvd3 = (bxvd) byyl.mo74142c(i3);
                                        bxvd3.mo73625a((bxvk) byyl);
                                        bxvf bxvf3 = (bxvf) bxvd3;
                                        bzbu a6 = bzbu.m125627a(byuz.f168403a);
                                        if (a6 == null) {
                                            a6 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                                        }
                                        int ordinal = a6.ordinal();
                                        bxwc bxwc5 = bxwc3;
                                        if (ordinal != 1) {
                                            debugPokeResponse3 = debugPokeResponse4;
                                            if (ordinal != 2) {
                                                if (ordinal != 3) {
                                                    if (ordinal != 8) {
                                                        bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                                                        bnsl3.mo68432a("ajaz", "a", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bzbu a7 = bzbu.m125627a(byuz.f168403a);
                                                        if (a7 == null) {
                                                            a7 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                                                        }
                                                        bnsl3.mo68420a("DebugPoke: Unknown medium requested: %s", a7);
                                                    } else if (byuz.f168405c) {
                                                        boolean z = byuz.f168404b;
                                                        if (bxvf3.f164950c) {
                                                            bxvf3.mo74035c();
                                                            bxvf3.f164950c = false;
                                                        }
                                                        byyl byyl2 = (byyl) bxvf3.f164949b;
                                                        int i5 = byyl2.f168951a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                                                        byyl2.f168951a = i5;
                                                        byyl2.f168966q = z;
                                                        boolean z2 = byuz.f168404b;
                                                        byyl2.f168951a = i5 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                                                        byyl2.f168965p = z2;
                                                    }
                                                } else if (byuz.f168405c) {
                                                    boolean z3 = byuz.f168404b;
                                                    if (bxvf3.f164950c) {
                                                        bxvf3.mo74035c();
                                                        bxvf3.f164950c = false;
                                                    }
                                                    byyl byyl3 = (byyl) bxvf3.f164949b;
                                                    int i6 = byyl3.f168951a | 64;
                                                    byyl3.f168951a = i6;
                                                    byyl3.f168958h = z3;
                                                    boolean z4 = byuz.f168404b;
                                                    byyl3.f168951a = i6 | 32;
                                                    byyl3.f168957g = z4;
                                                }
                                            } else if (byuz.f168405c) {
                                                boolean z5 = byuz.f168404b;
                                                if (bxvf3.f164950c) {
                                                    bxvf3.mo74035c();
                                                    bxvf3.f164950c = false;
                                                }
                                                byyl byyl4 = (byyl) bxvf3.f164949b;
                                                int i7 = byyl4.f168951a | 16;
                                                byyl4.f168951a = i7;
                                                byyl4.f168956f = z5;
                                                boolean z6 = byuz.f168404b;
                                                byyl4.f168951a = i7 | 8;
                                                byyl4.f168955e = z6;
                                            }
                                        } else {
                                            debugPokeResponse3 = debugPokeResponse4;
                                            if (byuz.f168405c) {
                                                boolean z7 = byuz.f168404b;
                                                if (bxvf3.f164950c) {
                                                    bxvf3.mo74035c();
                                                    bxvf3.f164950c = false;
                                                }
                                                byyl byyl5 = (byyl) bxvf3.f164949b;
                                                int i8 = byyl5.f168951a | 4;
                                                byyl5.f168951a = i8;
                                                byyl5.f168954d = z7;
                                                boolean z8 = byuz.f168404b;
                                                byyl5.f168951a = i8 | 2;
                                                byyl5.f168953c = z8;
                                            }
                                        }
                                        if (bxvf2.f164950c) {
                                            bxvf2.mo74035c();
                                            bxvf2.f164950c = false;
                                        }
                                        byyg byyg = (byyg) bxvf2.f164949b;
                                        byyl byyl6 = (byyl) bxvf3.mo74062i();
                                        byyg byyg2 = byyg.f168916p;
                                        byyl6.getClass();
                                        byyg.f168921d = byyl6;
                                        byyg.f168918a |= 4;
                                        this.f70294f.mo38414a((byyg) bxvf2.mo74062i());
                                        i4++;
                                        bxwc3 = bxwc5;
                                        debugPokeResponse4 = debugPokeResponse3;
                                        i3 = 5;
                                    }
                                    bxwc = bxwc3;
                                    debugPokeResponse = debugPokeResponse4;
                                }
                            } else {
                                bxwc2 = bxwc3;
                                debugPokeResponse2 = debugPokeResponse4;
                            }
                            byuq a8 = byuq.m125364a(byur.f168354b);
                            if (a8 == null) {
                                a8 = byuq.COMMAND_UNKNOWN;
                            }
                            if (a8 == byuq.STOP_BEACON && (byur.f168353a & 8) != 0) {
                                byvg byvg = byur.f168357e;
                                if (byvg == null) {
                                    byvg = byvg.f168431b;
                                }
                                if (byvg.f168433a.size() == 0) {
                                    bnsl bnsl4 = (bnsl) ahfq.f67120a.mo68387b();
                                    bnsl4.mo68432a("ajaz", "a", 312, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl4.mo68405a("DebugPoke: No Params provided for StopBeacon command.");
                                } else {
                                    byvg byvg2 = byur.f168357e;
                                    if (byvg2 == null) {
                                        byvg2 = byvg.f168431b;
                                    }
                                    bxwc bxwc6 = byvg2.f168433a;
                                    int size3 = bxwc6.size();
                                    int i9 = 0;
                                    while (i9 < size3) {
                                        Iterator it = new bxvv(((byvi) bxwc6.get(i9)).f168437a, byvi.f168434b).iterator();
                                        while (true) {
                                            int i10 = i9 + 1;
                                            if (it.hasNext()) {
                                                this.f70291c.mo38307a((bzbu) it.next());
                                            } else {
                                                i9 = i10;
                                            }
                                        }
                                    }
                                }
                            } else {
                                byuq a9 = byuq.m125364a(byur.f168354b);
                                if (a9 == null) {
                                    a9 = byuq.COMMAND_UNKNOWN;
                                }
                                if (a9 == byuq.START_BEACON && (byur.f168353a & 4) != 0) {
                                    byvb byvb = byur.f168356d;
                                    if (byvb == null) {
                                        byvb = byvb.f168410b;
                                    }
                                    if (byvb.f168412a.size() == 0) {
                                        bnsl bnsl5 = (bnsl) ahfq.f67120a.mo68387b();
                                        bnsl5.mo68432a("ajaz", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl5.mo68405a("DebugPoke: No Params provided for StartBeacon command.");
                                    } else {
                                        byvb byvb2 = byur.f168356d;
                                        if (byvb2 == null) {
                                            byvb2 = byvb.f168410b;
                                        }
                                        bxwc bxwc7 = byvb2.f168412a;
                                        int size4 = bxwc7.size();
                                        int i11 = 0;
                                        while (i11 < size4) {
                                            byvd byvd = (byvd) bxwc7.get(i11);
                                            bzbu[] bzbuArr = (bzbu[]) new bxvv(byvd.f168416a, byvd.f168413b).toArray(new bzbu[0]);
                                            byuv byuv = byvd.f168417c;
                                            if (byuv == null) {
                                                byuv = byuv.f168376b;
                                            }
                                            String str = byuv.f168378a;
                                            String str2 = byvd.f168418d;
                                            byuv byuv2 = byvd.f168417c;
                                            if (byuv2 == null) {
                                                byuv2 = byuv.f168376b;
                                            }
                                            ajgm ajgm = new ajgm(ahfv.m55670a(str), m58407a(str2, byuv2.f168378a.length()));
                                            int length = bzbuArr.length;
                                            int i12 = 0;
                                            while (true) {
                                                int i13 = i11 + 1;
                                                if (i12 < length) {
                                                    this.f70291c.mo38308a(bzbuArr[i12], ajgm);
                                                    i12++;
                                                } else {
                                                    i11 = i13;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    byuq a10 = byuq.m125364a(byur.f168354b);
                                    if (a10 == null) {
                                        a10 = byuq.COMMAND_UNKNOWN;
                                    }
                                    if (a10 == byuq.START_LISTEN && (byur.f168353a & 16) != 0) {
                                        byve byve = byur.f168358f;
                                        if (byve == null) {
                                            byve = byve.f168420b;
                                        }
                                        if (byve.f168422a.size() != 0) {
                                            if (debugPokeRequest2.f191784c != null) {
                                                m58409a(debugPokeRequest);
                                                byve byve2 = byur.f168358f;
                                                if (byve2 == null) {
                                                    byve2 = byve.f168420b;
                                                }
                                                bxwc bxwc8 = byve2.f168422a;
                                                int size5 = bxwc8.size();
                                                for (int i14 = 0; i14 < size5; i14++) {
                                                    byvf byvf = (byvf) bxwc8.get(i14);
                                                    if ((byvf.f168426a & 4) != 0) {
                                                        byyo a11 = m58407a(byvf.f168428c, byvf.f168429d);
                                                        ajbd ajbd = this.f70296h;
                                                        bzbu a12 = bzbu.m125627a(byvf.f168427b);
                                                        if (a12 == null) {
                                                            a12 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                                                        }
                                                        ajbd.mo38437a(a12, a11, null);
                                                    }
                                                }
                                            } else {
                                                bnsl bnsl6 = (bnsl) ahfq.f67120a.mo68387b();
                                                bnsl6.mo68432a("ajaz", "a", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl6.mo68405a("DebugPoke: Listen command requested, but no listener provided.");
                                            }
                                        }
                                    } else {
                                        byuq a13 = byuq.m125364a(byur.f168354b);
                                        if (a13 == null) {
                                            a13 = byuq.COMMAND_UNKNOWN;
                                        }
                                        if (a13 == byuq.STOP_LISTEN && (byur.f168353a & 32) != 0) {
                                            byvj byvj = byur.f168359g;
                                            if (byvj == null) {
                                                byvj = byvj.f168438b;
                                            }
                                            bxwc bxwc9 = byvj.f168440a;
                                            int size6 = bxwc9.size();
                                            for (int i15 = 0; i15 < size6; i15++) {
                                                ajbd ajbd2 = this.f70296h;
                                                bzbu a14 = bzbu.m125627a(((byvk) bxwc9.get(i15)).f168443a);
                                                if (a14 == null) {
                                                    a14 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                                                }
                                                ajbd2.mo38436a(a14);
                                            }
                                        } else {
                                            byuq a15 = byuq.m125364a(byur.f168354b);
                                            if (a15 == null) {
                                                a15 = byuq.COMMAND_UNKNOWN;
                                            }
                                            if (a15 != byuq.REGISTER_TOKEN_OBSERVER_CALLBACK) {
                                                byuq a16 = byuq.m125364a(byur.f168354b);
                                                if (a16 == null) {
                                                    a16 = byuq.COMMAND_UNKNOWN;
                                                }
                                                if (a16 != byuq.UNREGISTER_TOKEN_OBSERVER_CALLBACK) {
                                                    byuq a17 = byuq.m125364a(byur.f168354b);
                                                    if (a17 == null) {
                                                        a17 = byuq.COMMAND_UNKNOWN;
                                                    }
                                                    if (a17 != byuq.REGISTER_TOKEN_ADVERTISER_CALLBACK) {
                                                        byuq a18 = byuq.m125364a(byur.f168354b);
                                                        if (a18 == null) {
                                                            a18 = byuq.COMMAND_UNKNOWN;
                                                        }
                                                        if (a18 != byuq.UNREGISTER_TOKEN_ADVERTISER_CALLBACK) {
                                                            byuq a19 = byuq.m125364a(byur.f168354b);
                                                            if (a19 == null) {
                                                                a19 = byuq.COMMAND_UNKNOWN;
                                                            }
                                                            if (a19 != byuq.GET_CONFIGURATION) {
                                                                byuq a20 = byuq.m125364a(byur.f168354b);
                                                                if (a20 == null) {
                                                                    a20 = byuq.COMMAND_UNKNOWN;
                                                                }
                                                                if (a20 != byuq.UPDATE_CONFIGURATION) {
                                                                    byuq a21 = byuq.m125364a(byur.f168354b);
                                                                    if (a21 == null) {
                                                                        a21 = byuq.COMMAND_UNKNOWN;
                                                                    }
                                                                    if (a21 == byuq.SCHEDULE_PRESEEDED_TOKENS_ROTATION) {
                                                                        ajeb ajeb = this.f70293e;
                                                                        ajeb.f70411b.mo72984b();
                                                                        ajeb.f70410a.clear();
                                                                    } else {
                                                                        byuq a22 = byuq.m125364a(byur.f168354b);
                                                                        if (a22 == null) {
                                                                            a22 = byuq.COMMAND_UNKNOWN;
                                                                        }
                                                                        if (a22 == byuq.CLEAR_CACHE) {
                                                                            ajgu ajgu = (ajgu) ahgz.m55754a(this.f70295g, ajgu.class);
                                                                            ajgu.f70594c.mo72984b();
                                                                            ajgu.f70592a.size();
                                                                            ajgu.f70592a.clear();
                                                                        } else {
                                                                            byuq a23 = byuq.m125364a(byur.f168354b);
                                                                            if (a23 == null) {
                                                                                a23 = byuq.COMMAND_UNKNOWN;
                                                                            }
                                                                            if (a23 == byuq.CLEAR_DIRECTIVES) {
                                                                                ajbd ajbd3 = this.f70296h;
                                                                                ajbd3.mo38435a(Collections.emptySet());
                                                                                ajbd3.mo38438a(Collections.emptySet(), null);
                                                                                aiyx aiyx = ajbd3.f70309f;
                                                                                Context context = ajbd3.f70304a;
                                                                                aiyx.f70119e.mo72984b();
                                                                                aiyx.mo38315a(context, (String) null, 5);
                                                                            } else {
                                                                                byuq a24 = byuq.m125364a(byur.f168354b);
                                                                                if (a24 == null) {
                                                                                    a24 = byuq.COMMAND_UNKNOWN;
                                                                                }
                                                                                if (a24 != byuq.REGISTER_NETWORK_CALLBACK) {
                                                                                    byuq a25 = byuq.m125364a(byur.f168354b);
                                                                                    if (a25 == null) {
                                                                                        a25 = byuq.COMMAND_UNKNOWN;
                                                                                    }
                                                                                    if (a25 != byuq.UNREGISTER_NETWORK_CALLBACK) {
                                                                                        byuq a26 = byuq.m125364a(byur.f168354b);
                                                                                        if (a26 == null) {
                                                                                            a26 = byuq.COMMAND_UNKNOWN;
                                                                                        }
                                                                                        if (a26 != byuq.REGISTER_CONFIGURATION_CALLBACK) {
                                                                                            byuq a27 = byuq.m125364a(byur.f168354b);
                                                                                            if (a27 == null) {
                                                                                                a27 = byuq.COMMAND_UNKNOWN;
                                                                                            }
                                                                                            if (a27 != byuq.UNREGISTER_CONFIGURATION_CALLBACK) {
                                                                                                byuq a28 = byuq.m125364a(byur.f168354b);
                                                                                                if (a28 == null) {
                                                                                                    a28 = byuq.COMMAND_UNKNOWN;
                                                                                                }
                                                                                                if (a28 != byuq.REGISTER_GCM_CALLBACK) {
                                                                                                    byuq a29 = byuq.m125364a(byur.f168354b);
                                                                                                    if (a29 == null) {
                                                                                                        a29 = byuq.COMMAND_UNKNOWN;
                                                                                                    }
                                                                                                    if (a29 != byuq.UNREGISTER_GCM_CALLBACK) {
                                                                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                        bnsl bnsl7 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                                        bnsl7.mo68432a("ajaz", "a", 429, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                        if ((byur.f168353a & 1) != 0) {
                                                                                                            byuq = byuq.m125364a(byur.f168354b);
                                                                                                            if (byuq == null) {
                                                                                                                byuq = byuq.COMMAND_UNKNOWN;
                                                                                                            }
                                                                                                        } else {
                                                                                                            byuq = null;
                                                                                                        }
                                                                                                        bnsl7.mo68420a("DebugPoke: UNKNOWN Command %s", byuq);
                                                                                                    } else {
                                                                                                        bvhg bvhg = debugPokeRequest2.f191787f;
                                                                                                        if (bvhg == null) {
                                                                                                            bnsl bnsl8 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                                            bnsl8.mo68432a("ajaz", "a", 420, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                            bnsl8.mo68405a("DebugPoke: No callback provided for UNREGISTER_GCM_CALLBACK");
                                                                                                            debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                        } else {
                                                                                                            RemoteCallbackList remoteCallbackList = this.f70300l;
                                                                                                            if (remoteCallbackList != null) {
                                                                                                                remoteCallbackList.unregister(bvhg);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else if (debugPokeRequest2.f191787f == null) {
                                                                                                    bnsl bnsl9 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                                    bnsl9.mo68432a("ajaz", "a", 410, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                    bnsl9.mo68405a("DebugPoke: No callback provided for REGISTER_GCM_CALLBACK");
                                                                                                    debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                } else {
                                                                                                    if (this.f70300l == null) {
                                                                                                        this.f70300l = new RemoteCallbackList();
                                                                                                    }
                                                                                                    this.f70300l.register(debugPokeRequest2.f191787f);
                                                                                                }
                                                                                            } else {
                                                                                                bvhg bvhg2 = debugPokeRequest2.f191786e;
                                                                                                if (bvhg2 == null) {
                                                                                                    bnsl bnsl10 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                                    bnsl10.mo68432a("ajaz", "a", 400, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                                    bnsl10.mo68405a("DebugPoke: No callback provided for UNREGISTER_CONFIGURATION_CALLBACK");
                                                                                                    debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                } else {
                                                                                                    RemoteCallbackList remoteCallbackList2 = this.f70301m;
                                                                                                    if (remoteCallbackList2 != null) {
                                                                                                        remoteCallbackList2.unregister(bvhg2);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (debugPokeRequest2.f191786e == null) {
                                                                                            bnsl bnsl11 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                            bnsl11.mo68432a("ajaz", "a", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                            bnsl11.mo68405a("DebugPoke: No callback provided for REGISTER_CONFIGURATION_CALLBACK");
                                                                                            debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                        } else {
                                                                                            if (this.f70301m == null) {
                                                                                                this.f70301m = new RemoteCallbackList();
                                                                                            }
                                                                                            this.f70301m.register(debugPokeRequest2.f191786e);
                                                                                            mo38429d();
                                                                                        }
                                                                                    } else {
                                                                                        bvhg bvhg3 = debugPokeRequest2.f191785d;
                                                                                        if (bvhg3 == null) {
                                                                                            bnsl bnsl12 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                            bnsl12.mo68432a("ajaz", "a", 379, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                            bnsl12.mo68405a("DebugPoke: No callback provided for UNREGISTER_NETWORK_CALLBACK");
                                                                                            debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                        } else {
                                                                                            RemoteCallbackList remoteCallbackList3 = this.f70299k;
                                                                                            if (remoteCallbackList3 != null) {
                                                                                                remoteCallbackList3.unregister(bvhg3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (debugPokeRequest2.f191785d == null) {
                                                                                    bnsl bnsl13 = (bnsl) ahfq.f67120a.mo68387b();
                                                                                    bnsl13.mo68432a("ajaz", "a", 369, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                                    bnsl13.mo68405a("DebugPoke: No callback provided for REGISTER_NETWORK_CALLBACK");
                                                                                    debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                } else {
                                                                                    if (this.f70299k == null) {
                                                                                        this.f70299k = new RemoteCallbackList();
                                                                                    }
                                                                                    this.f70299k.register(debugPokeRequest2.f191785d);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    byvl byvl = byur.f168360h;
                                                                    if (byvl == null) {
                                                                        byvl = byvl.f168445d;
                                                                    }
                                                                    if (byvl == null) {
                                                                        bnsl bnsl14 = (bnsl) ahfq.f67120a.mo68387b();
                                                                        bnsl14.mo68432a("ajaz", "a", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                        bnsl14.mo68405a("DebugPoke: No updateConfiguration for UPDATE_CONFIGURATION");
                                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                                    } else {
                                                                        byux byux = byvl.f168449c;
                                                                        if (byux == null) {
                                                                            byux = byux.f168392e;
                                                                        }
                                                                        if ((byux.f168394a & 1) != 0) {
                                                                            bdyx bdyx = C1712cfor.f185138V;
                                                                            byux byux2 = byvl.f168449c;
                                                                            if (byux2 == null) {
                                                                                byux2 = byux.f168392e;
                                                                            }
                                                                            bdyx.mo58454b(byux2.f168395b);
                                                                        }
                                                                        byux byux3 = byvl.f168449c;
                                                                        if (byux3 == null) {
                                                                            byux3 = byux.f168392e;
                                                                        }
                                                                        if ((byux3.f168394a & 2) != 0) {
                                                                            bdyx bdyx2 = C1712cfor.f185136T;
                                                                            byux byux4 = byvl.f168449c;
                                                                            if (byux4 == null) {
                                                                                byux4 = byux.f168392e;
                                                                            }
                                                                            bdyx2.mo58454b(byux4.f168396c);
                                                                        }
                                                                        byux byux5 = byvl.f168449c;
                                                                        if (byux5 == null) {
                                                                            byux5 = byux.f168392e;
                                                                        }
                                                                        if ((byux5.f168394a & 4) != 0) {
                                                                            bdyx bdyx3 = C1712cfor.f185145d;
                                                                            byux byux6 = byvl.f168449c;
                                                                            if (byux6 == null) {
                                                                                byux6 = byux.f168392e;
                                                                            }
                                                                            bdyx3.mo58454b(byux6.f168397d);
                                                                        }
                                                                        if ((byvl.f168447a & 1) != 0) {
                                                                            ajat ajat = this.f70294f;
                                                                            byyg byyg3 = byvl.f168448b;
                                                                            if (byyg3 == null) {
                                                                                byyg3 = byyg.f168916p;
                                                                            }
                                                                            ajat.mo38414a(byyg3);
                                                                        }
                                                                        debugPokeResponse4 = m58416f();
                                                                    }
                                                                }
                                                            } else {
                                                                debugPokeResponse4 = m58416f();
                                                            }
                                                        } else {
                                                            bvhf bvhf = debugPokeRequest2.f191784c;
                                                            if (bvhf == null) {
                                                                bnsl bnsl15 = (bnsl) ahfq.f67120a.mo68387b();
                                                                bnsl15.mo68432a("ajaz", "d", 503, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                                bnsl15.mo68405a("DebugPoke: UNREGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
                                                                debugPokeResponse4 = new DebugPokeResponse(13);
                                                            } else {
                                                                RemoteCallbackList remoteCallbackList4 = this.f70290b;
                                                                if (remoteCallbackList4 != null) {
                                                                    remoteCallbackList4.unregister(bvhf);
                                                                }
                                                                debugPokeResponse4 = new DebugPokeResponse(0);
                                                            }
                                                        }
                                                    } else if (debugPokeRequest2.f191784c == null) {
                                                        bnsl bnsl16 = (bnsl) ahfq.f67120a.mo68387b();
                                                        bnsl16.mo68432a("ajaz", "c", 481, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl16.mo68405a("DebugPoke: REGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                    } else {
                                                        if (this.f70290b == null) {
                                                            this.f70290b = new RemoteCallbackList();
                                                        }
                                                        this.f70290b.register(debugPokeRequest2.f191784c);
                                                        if (this.f70302n == null) {
                                                            ajaw ajaw = new ajaw(this);
                                                            this.f70302n = ajaw;
                                                            this.f70291c.f70103a = ajaw;
                                                        }
                                                        debugPokeResponse4 = new DebugPokeResponse(0);
                                                    }
                                                } else {
                                                    bvhf bvhf2 = debugPokeRequest2.f191784c;
                                                    if (bvhf2 == null) {
                                                        bnsl bnsl17 = (bnsl) ahfq.f67120a.mo68387b();
                                                        bnsl17.mo68432a("ajaz", "b", 467, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                        bnsl17.mo68405a("DebugPoke: UNREGISTER_TOKEN_OBSERVER_CALLBACK with no tokenCallback");
                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                    } else {
                                                        RemoteCallbackList remoteCallbackList5 = this.f70289a;
                                                        if (remoteCallbackList5 != null) {
                                                            remoteCallbackList5.unregister(bvhf2);
                                                        }
                                                        debugPokeResponse4 = new DebugPokeResponse(0);
                                                    }
                                                }
                                            } else {
                                                debugPokeResponse4 = m58409a(debugPokeRequest);
                                            }
                                            i2++;
                                            bxwc3 = bxwc;
                                            i = 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    bxwc = bxwc3;
                    debugPokeResponse = debugPokeResponse4;
                    this.f70294f.mo38413a();
                }
                debugPokeResponse4 = debugPokeResponse;
                i2++;
                bxwc3 = bxwc;
                i = 2;
            }
        }
        try {
            Parcel bj = bvhc.mo8529bj();
            dcl.m8165a(bj, debugPokeResponse4);
            bvhc.mo8530c(2, bj);
        } catch (RemoteException e2) {
            bnsl bnsl18 = (bnsl) ahfq.f67120a.mo68387b();
            bnsl18.mo68437a(e2);
            bnsl18.mo68432a("ajaz", "a", 438, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl18.mo68405a("DebugPoke: Unable to propagate CopresenceDebugPokeResponse back to client app");
        }
    }

    /* renamed from: a */
    public final boolean mo38175a() {
        return this.f70297i != null || mo38176b() || m58415e() || mo38177c() || m58406a(this.f70289a) > 0 || m58406a(this.f70290b) > 0;
    }
}
