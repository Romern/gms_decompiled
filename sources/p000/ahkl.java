package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.List;

/* renamed from: ahkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahkl {

    /* renamed from: a */
    public final String f67349a;

    /* renamed from: b */
    private final ahfx f67350b;

    /* renamed from: c */
    private final C1245ok f67351c = new C1245ok();

    /* renamed from: d */
    private final C1245ok f67352d = new C1245ok();

    /* renamed from: e */
    private final C1245ok f67353e = new C1245ok();

    /* renamed from: f */
    private final C1245ok f67354f = new C1245ok();

    /* renamed from: g */
    private bvep f67355g;

    /* renamed from: h */
    private long f67356h = 0;

    /* renamed from: i */
    private long f67357i = 0;

    /* renamed from: j */
    private Strategy f67358j;

    /* renamed from: k */
    private boolean f67359k = false;

    /* renamed from: l */
    private final bxvd f67360l;

    /* renamed from: m */
    private bxvd f67361m;

    /* renamed from: n */
    private bxvd f67362n;

    public ahkl(ahfx ahfx, String str, String str2) {
        this.f67350b = ahfx;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + str2.length());
            sb.append("0p:");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            str = sb.toString();
        }
        this.f67349a = str;
        srn srn = ahkm.f67363a;
        bxvd da = bveh.f155721d.mo74144da();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bveh bveh = (bveh) da.f164949b;
        bveh.f155723a |= 1;
        bveh.f155724b = elapsedRealtime;
        this.f67360l = da;
        if (m55955h("constructor")) {
            m55946c(this.f67349a, 3);
        }
    }

    /* renamed from: a */
    private static int m55939a(int i) {
        int i2 = i - 1;
        bvik bvik = bvik.UNKNOWN_SESSION_ROLE;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return 2;
        } else {
            if (i2 != 2) {
                return i2 != 3 ? 1 : 4;
            }
            return 3;
        }
    }

    /* renamed from: b */
    private final void m55944b(String str, int i) {
        if (this.f67352d.containsKey(str)) {
            bxvd bxvd = (bxvd) this.f67352d.get(str);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvej bvej = (bvej) bxvd.f164949b;
            bvej bvej2 = bvej.f155734f;
            bvej.f155740e = i - 1;
            bvej.f155736a |= 8;
            if (m55945b(bxvd)) {
                this.f67352d.remove(str);
            }
        } else if (this.f67351c.containsKey(str)) {
            bxvd bxvd2 = (bxvd) this.f67351c.get(str);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bvej bvej3 = (bvej) bxvd2.f164949b;
            bvej bvej4 = bvej.f155734f;
            bvej3.f155740e = i - 1;
            bvej3.f155736a |= 8;
            if (m55943a(bxvd2)) {
                this.f67351c.remove(str);
            }
        }
    }

    /* renamed from: c */
    private final void m55946c(String str, int i) {
        ahfx ahfx = this.f67350b;
        bxvd da = bver.f155782d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bver bver = (bver) da.f164949b;
        bver.f155785b = i - 1;
        bver.f155784a |= 1;
        ahfx.mo36413a(str, (bver) da.mo74062i());
    }

    /* renamed from: d */
    private final void m55948d() {
        bxvd bxvd = this.f67361m;
        if (bxvd == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkl", "d", 198, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to record advertising phase duration due to null currentAdvertisingPhase");
        } else if ((((bvef) bxvd.f164949b).f155708a & 1) == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f67356h;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvef bvef = (bvef) bxvd.f164949b;
            bvef bvef2 = bvef.f155706e;
            bvef.f155708a |= 1;
            bvef.f155709b = elapsedRealtime;
        }
    }

    /* renamed from: e */
    private final void m55950e() {
        bxvd bxvd = this.f67362n;
        if (bxvd == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkl", "e", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to record discovery phase duration due to null currentDiscoveryPhase");
        } else if ((((bvel) bxvd.f164949b).f155748a & 1) == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f67357i;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvel bvel = (bvel) bxvd.f164949b;
            bvel bvel2 = bvel.f155746f;
            bvel.f155748a |= 1;
            bvel.f155749b = elapsedRealtime;
        }
    }

    /* renamed from: f */
    private final void m55952f() {
        if (this.f67361m != null) {
            int i = 0;
            while (true) {
                C1245ok okVar = this.f67351c;
                if (i >= okVar.f26809h) {
                    break;
                }
                bxvd bxvd = (bxvd) okVar.mo15621c(i);
                m55949d(bxvd);
                m55943a(bxvd);
                i++;
            }
            m55948d();
            bvep bvep = this.f67355g;
            bxvd bxvd2 = this.f67361m;
            if (bvep.f164950c) {
                bvep.mo74035c();
                bvep.f164950c = false;
            }
            bveq bveq = (bveq) bvep.f164949b;
            bvef bvef = (bvef) bxvd2.mo74062i();
            bxvu bxvu = bveq.f155770e;
            bvef.getClass();
            if (!bveq.f155778g.mo73666a()) {
                bveq.f155778g = GeneratedMessageLite.m124021a(bveq.f155778g);
            }
            bveq.f155778g.add(bvef);
            this.f67361m = null;
        }
        this.f67351c.clear();
    }

    /* renamed from: g */
    private final void m55953g() {
        if (this.f67362n != null) {
            int i = 0;
            while (true) {
                C1245ok okVar = this.f67352d;
                if (i >= okVar.f26809h) {
                    break;
                }
                bxvd bxvd = (bxvd) okVar.mo15621c(i);
                m55949d(bxvd);
                m55945b(bxvd);
                i++;
            }
            m55950e();
            bvep bvep = this.f67355g;
            bxvd bxvd2 = this.f67362n;
            if (bvep.f164950c) {
                bvep.mo74035c();
                bvep.f164950c = false;
            }
            bveq bveq = (bveq) bvep.f164949b;
            bvel bvel = (bvel) bxvd2.mo74062i();
            bxvu bxvu = bveq.f155770e;
            bvel.getClass();
            if (!bveq.f155777f.mo73666a()) {
                bveq.f155777f = GeneratedMessageLite.m124021a(bveq.f155777f);
            }
            bveq.f155777f.add(bvel);
            this.f67362n = null;
        }
        this.f67352d.clear();
    }

    /* renamed from: h */
    private final void m55954h() {
        C1245ok okVar;
        C1245ok okVar2;
        if (this.f67355g != null) {
            m55952f();
            m55953g();
            int i = 0;
            while (true) {
                okVar = this.f67353e;
                if (i >= okVar.f26809h) {
                    break;
                }
                ahkj ahkj = (ahkj) okVar.mo15621c(i);
                int i2 = 0;
                while (true) {
                    C1245ok okVar3 = ahkj.f67340a;
                    if (i2 >= okVar3.f26809h) {
                        break;
                    }
                    bxvd bxvd = (bxvd) okVar3.mo15621c(i2);
                    if ((((bvem) bxvd.f164949b).f155755a & 4) == 0) {
                        ahkj.mo36647a(bxvd, 7);
                    }
                    i2++;
                }
                ahkj.f67343d = null;
                this.f67355g.mo73364a(ahkj.mo36643a());
                i++;
            }
            okVar.clear();
            int i3 = 0;
            while (true) {
                okVar2 = this.f67354f;
                if (i3 >= okVar2.f26809h) {
                    break;
                }
                m55940a((bxvd) okVar2.mo15621c(i3), bvhu.UNFINISHED_ERROR, 8);
                i3++;
            }
            okVar2.clear();
            bvep bvep = this.f67355g;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((bveq) this.f67355g.f164949b).f155774b;
            if (bvep.f164950c) {
                bvep.mo74035c();
                bvep.f164950c = false;
            }
            bveq bveq = (bveq) bvep.f164949b;
            bxvu bxvu = bveq.f155770e;
            bveq.f155773a |= 1;
            bveq.f155774b = elapsedRealtime;
            bxvd bxvd2 = this.f67360l;
            bvep bvep2 = this.f67355g;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bveh bveh = (bveh) bxvd2.f164949b;
            bveq bveq2 = (bveq) bvep2.mo74062i();
            bveh bveh2 = bveh.f155721d;
            bveq2.getClass();
            if (!bveh.f155725c.mo73666a()) {
                bveh.f155725c = GeneratedMessageLite.m124021a(bveh.f155725c);
            }
            bveh.f155725c.add(bveq2);
            this.f67355g = null;
            this.f67358j = null;
            m55946c(this.f67349a, 6);
        }
    }

    /* renamed from: a */
    private final void m55940a(bxvd bxvd, bvhu bvhu, int i) {
        if (this.f67355g == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkl", "a", 688, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to record upgrade attempt due to null strategySession");
            return;
        }
        if (i != 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bveg bveg = (bveg) bxvd.f164949b;
            bveg bveg2 = bveg.f155712h;
            bveg.f155720g = i - 1;
            bveg.f155714a |= 32;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((bveg) bxvd.f164949b).f155716c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bveg bveg3 = (bveg) bxvd.f164949b;
        bveg bveg4 = bveg.f155712h;
        int i2 = bveg3.f155714a | 2;
        bveg3.f155714a = i2;
        bveg3.f155716c = elapsedRealtime;
        bveg3.f155719f = bvhu.f156121o;
        bveg3.f155714a = i2 | 16;
        bvep bvep = this.f67355g;
        if (bvep.f164950c) {
            bvep.mo74035c();
            bvep.f164950c = false;
        }
        bveq bveq = (bveq) bvep.f164949b;
        bveg bveg5 = (bveg) bxvd.mo74062i();
        bxvu bxvu = bveq.f155770e;
        bveg5.getClass();
        if (!bveq.f155781j.mo73666a()) {
            bveq.f155781j = GeneratedMessageLite.m124021a(bveq.f155781j);
        }
        bveq.f155781j.add(bveg5);
    }

    /* renamed from: c */
    private static final boolean m55947c(bxvd bxvd) {
        int i = ((bvej) bxvd.f164949b).f155736a;
        return ((i & 4) == 0 || (i & 8) == 0) ? false : true;
    }

    /* renamed from: d */
    private static void m55949d(bxvd bxvd) {
        if ((((bvej) bxvd.f164949b).f155736a & 4) == 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvej bvej = (bvej) bxvd.f164949b;
            bvej bvej2 = bvej.f155734f;
            bvej.f155739d = 3;
            bvej.f155736a |= 4;
        }
        if ((((bvej) bxvd.f164949b).f155736a & 8) == 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvej bvej3 = (bvej) bxvd.f164949b;
            bvej bvej4 = bvej.f155734f;
            bvej3.f155740e = 3;
            bvej3.f155736a |= 8;
        }
    }

    /* renamed from: e */
    private static void m55951e(bxvd bxvd) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((bvej) bxvd.f164949b).f155737b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvej bvej = (bvej) bxvd.f164949b;
        bvej bvej2 = bvej.f155734f;
        bvej.f155736a |= 1;
        bvej.f155737b = elapsedRealtime;
    }

    /* renamed from: c */
    public final synchronized void mo36670c() {
        if (m55955h("logSession")) {
            m55954h();
            bxvd bxvd = this.f67360l;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((bveh) this.f67360l.f164949b).f155724b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bveh bveh = (bveh) bxvd.f164949b;
            bveh bveh2 = bveh.f155721d;
            bveh.f155723a |= 1;
            bveh.f155724b = elapsedRealtime;
            String str = this.f67349a;
            bveh bveh3 = (bveh) this.f67360l.mo74062i();
            ahfx ahfx = this.f67350b;
            bxvd da = bver.f155782d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bver bver = (bver) da.f164949b;
            bver.f155785b = 1;
            int i = bver.f155784a | 1;
            bver.f155784a = i;
            bveh3.getClass();
            bver.f155786c = bveh3;
            bver.f155784a = i | 2;
            bver bver2 = (bver) da.mo74062i();
            if (bveh3.f155724b <= 5356800000L) {
                ahfx.mo36413a(str, bver2);
            } else {
                srn srn = ahfp.f67119a;
            }
            m55946c(this.f67349a, 4);
            this.f67359k = true;
        }
    }

    /* renamed from: e */
    public final synchronized void mo36673e(String str) {
        if (m55955h("onRemoteEndpointRejected")) {
            m55944b(str, 3);
        }
    }

    /* renamed from: b */
    private final boolean m55945b(bxvd bxvd) {
        int a;
        if (this.f67362n == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkl", "b", 430, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to record discoverer connection request due to null currentDiscoveryPhase");
            return false;
        } else if (!m55947c(bxvd) && ((a = bvhz.m121130a(((bvej) bxvd.f164949b).f155739d)) == 0 || a != 5)) {
            return false;
        } else {
            bxvd bxvd2 = this.f67362n;
            m55951e(bxvd);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bvel bvel = (bvel) bxvd2.f164949b;
            bvej bvej = (bvej) bxvd.mo74062i();
            bvel bvel2 = bvel.f155746f;
            bvej.getClass();
            if (!bvel.f155752e.mo73666a()) {
                bvel.f155752e = GeneratedMessageLite.m124021a(bvel.f155752e);
            }
            bvel.f155752e.add(bvej);
            return true;
        }
    }

    /* renamed from: f */
    public final synchronized void mo36674f(String str) {
        if (m55955h("onLocalEndpointRejected")) {
            m55942a(str, 3);
        }
    }

    /* renamed from: g */
    public final synchronized void mo36675g(String str) {
        if (m55955h("onBandwidthUpgradeSuccess") && this.f67354f.containsKey(str)) {
            m55940a((bxvd) this.f67354f.remove(str), bvhu.UPGRADE_RESULT_SUCCESS, 9);
        }
    }

    /* renamed from: a */
    private final void m55941a(Strategy strategy, bvik bvik) {
        int i = 1;
        if (!strategy.equals(this.f67358j)) {
            this.f67358j = strategy;
            m55954h();
            m55946c(this.f67349a, 5);
            bvep bvep = (bvep) bveq.f155771k.mo74144da();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bvep.f164950c) {
                bvep.mo74035c();
                bvep.f164950c = false;
            }
            bveq bveq = (bveq) bvep.f164949b;
            bveq.f155773a |= 1;
            bveq.f155774b = elapsedRealtime;
            if (Strategy.f80480a.equals(strategy)) {
                i = 4;
            } else if (Strategy.f80481b.equals(strategy)) {
                i = 5;
            } else if (Strategy.f80482c.equals(strategy)) {
                i = 6;
            }
            if (bvep.f164950c) {
                bvep.mo74035c();
                bvep.f164950c = false;
            }
            bveq bveq2 = (bveq) bvep.f164949b;
            bveq2.f155775c = i - 1;
            bveq2.f155773a = 2 | bveq2.f155773a;
            bvep.mo73362a(bvik);
            this.f67355g = bvep;
        } else if (new bxvv(((bveq) this.f67355g.f164949b).f155776d, bveq.f155770e).contains(bvik)) {
            bvik bvik2 = bvik.UNKNOWN_SESSION_ROLE;
            int ordinal = bvik.ordinal();
            if (ordinal == 1) {
                m55952f();
            } else if (ordinal == 2) {
                m55953g();
            }
        } else {
            this.f67355g.mo73362a(bvik);
        }
    }

    /* renamed from: d */
    public final synchronized void mo36672d(String str) {
        if (m55955h("onLocalEndpointAccepted")) {
            m55942a(str, 2);
        }
    }

    /* renamed from: h */
    private final boolean m55955h(String str) {
        if (!this.f67359k) {
            return true;
        }
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahkl", "h", 741, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Unexpected call to %s after session has already been logged", str);
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo36664b() {
        if (m55955h("onStopDiscovery")) {
            m55950e();
        }
    }

    /* renamed from: c */
    public final synchronized void mo36671c(String str) {
        if (m55955h("onRemoteEndpointAccepted")) {
            m55944b(str, 2);
        }
    }

    /* renamed from: b */
    public final synchronized void mo36665b(Strategy strategy, List list) {
        if (m55955h("onStartDiscovery")) {
            m55941a(strategy, bvik.DISCOVERER);
            this.f67357i = SystemClock.elapsedRealtime();
            bxvd da = bvel.f155746f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvel bvel = (bvel) da.f164949b;
            if (!bvel.f155750c.mo73666a()) {
                bvel.f155750c = GeneratedMessageLite.m124019a(bvel.f155750c);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bvel.f155750c.mo74153d(((bvif) list.get(i)).f156141k);
            }
            this.f67362n = da;
        }
    }

    /* renamed from: b */
    public final synchronized void mo36666b(String str) {
        if (m55955h("onConnectionRequestReceived")) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1245ok okVar = this.f67351c;
            bxvd da = bvej.f155734f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvej bvej = (bvej) da.f164949b;
            int i = bvej.f155736a | 1;
            bvej.f155736a = i;
            bvej.f155737b = elapsedRealtime;
            long j = this.f67356h;
            bvej.f155736a = i | 2;
            bvej.f155738c = elapsedRealtime - j;
            okVar.put(str, da);
        }
    }

    /* renamed from: a */
    private final void m55942a(String str, int i) {
        if (this.f67352d.containsKey(str)) {
            bxvd bxvd = (bxvd) this.f67352d.get(str);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvej bvej = (bvej) bxvd.f164949b;
            bvej bvej2 = bvej.f155734f;
            bvej.f155739d = i - 1;
            bvej.f155736a |= 4;
            if (m55945b(bxvd)) {
                this.f67352d.remove(str);
            }
        } else if (this.f67351c.containsKey(str)) {
            bxvd bxvd2 = (bxvd) this.f67351c.get(str);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bvej bvej3 = (bvej) bxvd2.f164949b;
            bvej bvej4 = bvej.f155734f;
            bvej3.f155739d = i - 1;
            bvej3.f155736a |= 4;
            if (m55943a(bxvd2)) {
                this.f67351c.remove(str);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo36667b(String str, long j, long j2) {
        if (m55955h("onPayloadChunkReceived") && this.f67353e.containsKey(str)) {
            ahkj ahkj = (ahkj) this.f67353e.get(str);
            C1245ok okVar = ahkj.f67342c;
            Long valueOf = Long.valueOf(j);
            if (okVar.containsKey(valueOf)) {
                ((ahkk) ahkj.f67342c.get(valueOf)).mo36650a(j2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo36668b(String str, long j, bvih bvih) {
        if (m55955h("onIncomingPayloadDone") && this.f67353e.containsKey(str)) {
            ahkj ahkj = (ahkj) this.f67353e.get(str);
            C1245ok okVar = ahkj.f67342c;
            Long valueOf = Long.valueOf(j);
            if (okVar.containsKey(valueOf)) {
                bvif bvif = ahkj.f67343d;
                if (bvif != null) {
                    bxvd bxvd = (bxvd) ahkj.f67340a.get(bvif);
                    bxvd a = ((ahkk) ahkj.f67342c.remove(valueOf)).mo36649a();
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    bven bven = (bven) a.f164949b;
                    bven bven2 = bven.f155761h;
                    bven.f155769g = bvih.f156153j;
                    bven.f155763a |= 32;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvem bvem = (bvem) bxvd.f164949b;
                    bven bven3 = (bven) a.mo74062i();
                    bvem bvem2 = bvem.f155753g;
                    bven3.getClass();
                    bvem.mo73361b();
                    bvem.f155759e.add(bven3);
                    return;
                }
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                bnsl.mo68432a("ahkj", "b", 927, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unexpected call to incomingPayloadDone() while NearbyRecorder has no active current medium.");
            }
        }
    }

    /* renamed from: a */
    private final boolean m55943a(bxvd bxvd) {
        if (this.f67361m == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68432a("ahkl", "a", 416, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to record advertiser connection request due to null currentAdvertisingPhase");
            return false;
        } else if (!m55947c(bxvd)) {
            return false;
        } else {
            bxvd bxvd2 = this.f67361m;
            m55951e(bxvd);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bvef bvef = (bvef) bxvd2.f164949b;
            bvej bvej = (bvej) bxvd.mo74062i();
            bvef bvef2 = bvef.f155706e;
            bvej.getClass();
            if (!bvef.f155711d.mo73666a()) {
                bvef.f155711d = GeneratedMessageLite.m124021a(bvef.f155711d);
            }
            bvef.f155711d.add(bvej);
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36651a() {
        if (m55955h("onStopAdvertising")) {
            m55948d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo36669b(String str, bvif bvif) {
        if (m55955h("onConnectionEstablished")) {
            if (this.f67353e.containsKey(str)) {
                ((ahkj) this.f67353e.get(str)).mo36645a(bvif);
                return;
            }
            this.f67353e.put(str, new ahkj(bvif));
        }
    }

    /* renamed from: a */
    public final synchronized void mo36652a(int i, bvif bvif, int i2, long j) {
        if (m55955h("onIncomingConnectionAttempt")) {
            bvep bvep = this.f67355g;
            if (bvep == null) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkl", "a", 458, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unable to record incoming connection attempt due to null strategySession");
                return;
            }
            bxvd da = bvei.f155726g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvei bvei = (bvei) da.f164949b;
            int i3 = bvei.f155728a | 1;
            bvei.f155728a = i3;
            bvei.f155729b = j;
            int i4 = i - 1;
            if (i != 0) {
                bvei.f155730c = i4;
                int i5 = i3 | 2;
                bvei.f155728a = i5;
                bvei.f155731d = 1;
                int i6 = i5 | 4;
                bvei.f155728a = i6;
                bvei.f155732e = bvif.f156141k;
                int i7 = i6 | 8;
                bvei.f155728a = i7;
                int i8 = i2 - 1;
                if (i2 != 0) {
                    bvei.f155733f = i8;
                    bvei.f155728a = i7 | 16;
                    bvep.mo73363a(da);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36653a(Strategy strategy, List list) {
        if (m55955h("onStartAdvertising")) {
            m55941a(strategy, bvik.ADVERTISER);
            this.f67356h = SystemClock.elapsedRealtime();
            bxvd da = bvef.f155706e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvef bvef = (bvef) da.f164949b;
            if (!bvef.f155710c.mo73666a()) {
                bvef.f155710c = GeneratedMessageLite.m124019a(bvef.f155710c);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bvef.f155710c.mo74153d(((bvif) list.get(i)).f156141k);
            }
            this.f67361m = da;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36654a(String str) {
        if (m55955h("onConnectionRequestSent")) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1245ok okVar = this.f67352d;
            bxvd da = bvej.f155734f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvej bvej = (bvej) da.f164949b;
            int i = bvej.f155736a | 1;
            bvej.f155736a = i;
            bvej.f155737b = elapsedRealtime;
            long j = this.f67357i;
            bvej.f155736a = i | 2;
            bvej.f155738c = elapsedRealtime - j;
            okVar.put(str, da);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36655a(String str, int i, bvif bvif, int i2, long j) {
        if (m55955h("onOutgoingConnectionAttempt")) {
            bvep bvep = this.f67355g;
            if (bvep == null) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkl", "a", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unable to record outgoing connection attempt due to null strategySession");
                return;
            }
            bxvd da = bvei.f155726g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvei bvei = (bvei) da.f164949b;
            int i3 = bvei.f155728a | 1;
            bvei.f155728a = i3;
            bvei.f155729b = j;
            int i4 = i - 1;
            if (i != 0) {
                bvei.f155730c = i4;
                int i5 = i3 | 2;
                bvei.f155728a = i5;
                bvei.f155731d = 2;
                int i6 = i5 | 4;
                bvei.f155728a = i6;
                bvei.f155732e = bvif.f156141k;
                int i7 = i6 | 8;
                bvei.f155728a = i7;
                int i8 = i2 - 1;
                if (i2 != 0) {
                    bvei.f155733f = i8;
                    bvei.f155728a = i7 | 16;
                    bvep.mo73363a(da);
                    if (i == 2 && i2 != 2 && this.f67352d.containsKey(str)) {
                        bxvd bxvd = (bxvd) this.f67352d.remove(str);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bvej bvej = (bvej) bxvd.f164949b;
                        bvej bvej2 = bvej.f155734f;
                        bvej.f155739d = 4;
                        int i9 = bvej.f155736a | 4;
                        bvej.f155736a = i9;
                        bvej.f155740e = 4;
                        bvej.f155736a = i9 | 8;
                        m55945b(bxvd);
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36656a(String str, long j, int i, long j2) {
        if (m55955h("onIncomingPayloadStarted") && this.f67353e.containsKey(str)) {
            ((ahkj) this.f67353e.get(str)).f67342c.put(Long.valueOf(j), new ahkk(m55939a(i), j2));
        }
    }

    /* renamed from: a */
    public final synchronized void mo36657a(String str, long j, long j2) {
        if (m55955h("onPayloadChunkSent") && this.f67353e.containsKey(str)) {
            ahkj ahkj = (ahkj) this.f67353e.get(str);
            C1245ok okVar = ahkj.f67341b;
            Long valueOf = Long.valueOf(j);
            if (okVar.containsKey(valueOf)) {
                ((ahkk) ahkj.f67341b.get(valueOf)).mo36650a(j2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36658a(String str, long j, bvih bvih) {
        if (m55955h("onOutgoingPayloadDone") && this.f67353e.containsKey(str)) {
            ahkj ahkj = (ahkj) this.f67353e.get(str);
            C1245ok okVar = ahkj.f67341b;
            Long valueOf = Long.valueOf(j);
            if (okVar.containsKey(valueOf)) {
                bvif bvif = ahkj.f67343d;
                if (bvif != null) {
                    bxvd bxvd = (bxvd) ahkj.f67340a.get(bvif);
                    bxvd a = ((ahkk) ahkj.f67341b.remove(valueOf)).mo36649a();
                    if (a.f164950c) {
                        a.mo74035c();
                        a.f164950c = false;
                    }
                    bven bven = (bven) a.f164949b;
                    bven bven2 = bven.f155761h;
                    bven.f155769g = bvih.f156153j;
                    bven.f155763a |= 32;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvem bvem = (bvem) bxvd.f164949b;
                    bven bven3 = (bven) a.mo74062i();
                    bvem bvem2 = bvem.f155753g;
                    bven3.getClass();
                    bvem.mo73360a();
                    bvem.f155758d.add(bven3);
                    return;
                }
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                bnsl.mo68432a("ahkj", "a", 900, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unexpected call to outgoingPayloadDone() while NearbyRecorder has no active current medium.");
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36659a(String str, bvhu bvhu, int i) {
        if (m55955h("onBandwidthUpgradeError") && this.f67354f.containsKey(str)) {
            m55940a((bxvd) this.f67354f.remove(str), bvhu, i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36660a(String str, bvif bvif) {
        if (m55955h("onEndpointFound")) {
            bxvd bxvd = this.f67362n;
            if (bxvd == null) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68432a("ahkl", "a", 316, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Unable to record discovered endpoint due to null currentDiscoveryPhase");
                return;
            }
            bxvd da = bvek.f155741d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvek bvek = (bvek) da.f164949b;
            bvek.f155744b = bvif.f156141k;
            bvek.f155743a |= 1;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f67357i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvek bvek2 = (bvek) da.f164949b;
            bvek2.f155743a |= 2;
            bvek2.f155745c = elapsedRealtime;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvel bvel = (bvel) bxvd.f164949b;
            bvek bvek3 = (bvek) da.mo74062i();
            bvel bvel2 = bvel.f155746f;
            bvek3.getClass();
            if (!bvel.f155751d.mo73666a()) {
                bvel.f155751d = GeneratedMessageLite.m124021a(bvel.f155751d);
            }
            bvel.f155751d.add(bvek3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo36661a(String str, bvif bvif, int i) {
        String str2;
        if (m55955h("onConnectionClosed") && this.f67353e.containsKey(str)) {
            ahkj ahkj = (ahkj) this.f67353e.get(str);
            bvif bvif2 = ahkj.f67343d;
            if (bvif2 == null) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                bnsl.mo68432a("ahkj", "a", 813, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has no active current medium", bvif.name());
            } else if (bvif2 != bvif) {
                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                bnsl2.mo68432a("ahkj", "a", 818, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has active medium %s", bvif.name(), ahkj.f67343d.name());
            }
            bxvd bxvd = (bxvd) ahkj.f67340a.get(bvif);
            if (bxvd == null) {
                bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68388c();
                bnsl3.mo68432a("ahkj", "a", 826, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Unexpected call to physicalConnectionClosed() for medium %s with no corresponding EstablishedConnection that was previously opened.", bvif.name());
            } else if ((((bvem) bxvd.f164949b).f155755a & 4) == 0) {
                ahkj.mo36647a(bxvd, i);
                if (bvif == ahkj.f67343d) {
                    ahkj.f67343d = null;
                }
            } else {
                bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
                bnsl4.mo68432a("ahkj", "a", 833, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String name = bvif.name();
                int a = bvic.m121133a(((bvem) bxvd.f164949b).f155760f);
                if (a == 0) {
                    a = 1;
                }
                switch (a) {
                    case 1:
                        str2 = "UNKNOWN_DISCONNECTION_REASON";
                        break;
                    case 2:
                        str2 = "LOCAL_DISCONNECTION";
                        break;
                    case 3:
                        str2 = "REMOTE_DISCONNECTION";
                        break;
                    case 4:
                        str2 = "IO_ERROR";
                        break;
                    case 5:
                        str2 = "UPGRADED";
                        break;
                    case 6:
                        str2 = "SHUTDOWN";
                        break;
                    default:
                        str2 = "UNFINISHED";
                        break;
                }
                bnsl4.mo68424a("Unexpected call to physicalConnectionClosed() for medium %s which already has disconnection reason %s", name, str2);
            }
            if (i != 5) {
                this.f67355g.mo73364a(((ahkj) this.f67353e.remove(str)).mo36643a());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo36662a(String str, bvif bvif, bvif bvif2, int i) {
        if (m55955h("onBandwidthUpgradeStarted")) {
            C1245ok okVar = this.f67354f;
            bxvd da = bveg.f155712h.mo74144da();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bveg bveg = (bveg) da.f164949b;
            int i2 = bveg.f155714a | 2;
            bveg.f155714a = i2;
            bveg.f155716c = elapsedRealtime;
            bveg.f155717d = bvif.f156141k;
            int i3 = i2 | 4;
            bveg.f155714a = i3;
            bveg.f155718e = bvif2.f156141k;
            int i4 = i3 | 8;
            bveg.f155714a = i4;
            bveg.f155715b = i - 1;
            bveg.f155714a = i4 | 1;
            okVar.put(str, da);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36663a(String[] strArr, long j, int i, long j2) {
        if (m55955h("onOutgoingPayloadStarted")) {
            for (String str : strArr) {
                if (this.f67353e.containsKey(str)) {
                    ((ahkj) this.f67353e.get(str)).f67341b.put(Long.valueOf(j), new ahkk(m55939a(i), j2));
                }
            }
        }
    }
}
