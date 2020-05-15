package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.util.SparseArray;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: dwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwq extends dwm {

    /* renamed from: J */
    private static dwq f14276J;

    /* renamed from: a */
    protected static aaag f14277a;

    /* renamed from: A */
    protected dpe f14278A;

    /* renamed from: B */
    protected egr f14279B;

    /* renamed from: C */
    protected doy f14280C;

    /* renamed from: D */
    protected dtl f14281D;

    /* renamed from: E */
    protected dpk f14282E;

    /* renamed from: F */
    protected doq f14283F;

    /* renamed from: G */
    protected dpf f14284G;

    /* renamed from: H */
    protected dxy f14285H;

    /* renamed from: I */
    protected dwm f14286I;

    /* renamed from: b */
    protected final Context f14287b;

    /* renamed from: c */
    protected Context f14288c;

    /* renamed from: d */
    protected String f14289d = null;

    /* renamed from: e */
    protected int f14290e = -1;

    /* renamed from: f */
    protected Integer f14291f;

    /* renamed from: g */
    protected final sqv f14292g;

    /* renamed from: h */
    protected dxm f14293h;

    /* renamed from: i */
    protected drv f14294i;

    /* renamed from: j */
    protected dsz f14295j;

    /* renamed from: k */
    protected dro f14296k;

    /* renamed from: l */
    protected eed f14297l;

    /* renamed from: m */
    protected eel f14298m;

    /* renamed from: n */
    protected eew f14299n;

    /* renamed from: o */
    protected dvx f14300o;

    /* renamed from: p */
    protected dwi f14301p;

    /* renamed from: q */
    protected dwb f14302q;

    /* renamed from: r */
    protected dxo f14303r;

    /* renamed from: s */
    protected dsw f14304s;

    /* renamed from: t */
    protected ecv f14305t;

    /* renamed from: u */
    protected dwt f14306u;

    /* renamed from: v */
    protected doo f14307v;

    /* renamed from: w */
    protected dom f14308w;

    /* renamed from: x */
    protected dof f14309x;

    /* renamed from: y */
    protected efh f14310y;

    /* renamed from: z */
    protected efz f14311z;

    protected dwq(Context context, sqv sqv) {
        this.f14287b = context;
        this.f14292g = sqv;
    }

    /* renamed from: A */
    public static synchronized efz m9644A() {
        efz Z;
        synchronized (dwq.class) {
            Z = m9653a().mo9804Z();
        }
        return Z;
    }

    /* renamed from: B */
    public static synchronized dpe m9645B() {
        dpe aa;
        synchronized (dwq.class) {
            aa = m9653a().mo9805aa();
        }
        return aa;
    }

    /* renamed from: C */
    public static synchronized egr m9646C() {
        egr ab;
        synchronized (dwq.class) {
            ab = m9653a().mo9806ab();
        }
        return ab;
    }

    /* renamed from: D */
    public static synchronized egr m9647D() {
        egr ab;
        synchronized (dwq.class) {
            ab = f14276J != null ? m9653a().mo9806ab() : null;
        }
        return ab;
    }

    /* renamed from: E */
    public static synchronized dtl m9648E() {
        dtl ac;
        synchronized (dwq.class) {
            ac = m9653a().mo9807ac();
        }
        return ac;
    }

    /* renamed from: F */
    public static synchronized dpk m9649F() {
        dpk ad;
        synchronized (dwq.class) {
            ad = m9653a().mo9808ad();
        }
        return ad;
    }

    /* renamed from: G */
    public static synchronized dpf m9650G() {
        dpf ae;
        synchronized (dwq.class) {
            ae = m9653a().mo9809ae();
        }
        return ae;
    }

    /* renamed from: H */
    public static synchronized dxy m9651H() {
        dxy dxy;
        synchronized (dwq.class) {
            dwq a = m9653a();
            if (a.f14285H == null) {
                a.f14285H = new dxy();
            }
            dxy = a.f14285H;
        }
        return dxy;
    }

    /* renamed from: a */
    public static ContextManagerClientInfo m9652a(doh doh, String str) {
        return new ContextManagerClientInfo(doh.f13690b, "com.google.android.gms", spn.f44932a, str, m9664h(), 0, Process.myPid());
    }

    /* renamed from: af */
    public static synchronized void m9656af() {
        synchronized (dwq.class) {
            m9653a().mo9810ah();
        }
    }

    /* renamed from: ag */
    public static synchronized void m9657ag() {
        synchronized (dwq.class) {
            dwq a = m9653a();
            if (a.f14302q == null) {
                a.f14302q = new dwb();
                a.mo9795Q().mo9723a(a.f14302q, a.mo9787I());
            }
        }
    }

    /* renamed from: b */
    public static synchronized aaag m9658b() {
        aaag aaag;
        synchronized (dwq.class) {
            aaag = f14277a;
        }
        return aaag;
    }

    /* renamed from: c */
    public static synchronized String m9659c() {
        String str;
        synchronized (dwq.class) {
            str = m9653a().f14289d;
        }
        return str;
    }

    /* renamed from: d */
    public static synchronized int m9660d() {
        int i;
        synchronized (dwq.class) {
            i = m9653a().f14290e;
        }
        return i;
    }

    /* renamed from: e */
    public static synchronized void m9661e() {
        synchronized (dwq.class) {
            f14276J = null;
        }
    }

    /* renamed from: f */
    public static synchronized Context m9662f() {
        Context context;
        synchronized (dwq.class) {
            context = m9653a().f14287b;
        }
        return context;
    }

    /* renamed from: g */
    public static synchronized Context m9663g() {
        Context context;
        synchronized (dwq.class) {
            context = m9653a().f14288c;
        }
        return context;
    }

    /* renamed from: h */
    public static synchronized int m9664h() {
        int intValue;
        synchronized (dwq.class) {
            dwq a = m9653a();
            if (a.f14291f == null) {
                rfi rfi = rfi.f42868a;
                a.f14291f = Integer.valueOf(rfy.m33553j(a.f14287b));
            }
            intValue = a.f14291f.intValue();
        }
        return intValue;
    }

    /* renamed from: i */
    public static sqv m9665i() {
        return m9653a().f14292g;
    }

    /* renamed from: j */
    public static synchronized dxm m9666j() {
        dxm N;
        synchronized (dwq.class) {
            N = m9653a().mo9792N();
        }
        return N;
    }

    /* renamed from: k */
    public static synchronized drv m9667k() {
        drv I;
        synchronized (dwq.class) {
            I = m9653a().mo9787I();
        }
        return I;
    }

    /* renamed from: l */
    public static synchronized doq m9668l() {
        doq J;
        synchronized (dwq.class) {
            J = m9653a().mo9788J();
        }
        return J;
    }

    /* renamed from: m */
    public static synchronized dsz m9669m() {
        dsz K;
        synchronized (dwq.class) {
            K = m9653a().mo9789K();
        }
        return K;
    }

    /* renamed from: n */
    public static synchronized dro m9670n() {
        dro L;
        synchronized (dwq.class) {
            L = m9653a().mo9790L();
        }
        return L;
    }

    /* renamed from: o */
    public static synchronized eed m9671o() {
        eed M;
        synchronized (dwq.class) {
            M = m9653a().mo9791M();
        }
        return M;
    }

    /* renamed from: p */
    public static synchronized eel m9672p() {
        eel O;
        synchronized (dwq.class) {
            O = m9653a().mo9793O();
        }
        return O;
    }

    /* renamed from: q */
    public static synchronized eew m9673q() {
        eew P;
        synchronized (dwq.class) {
            P = m9653a().mo9794P();
        }
        return P;
    }

    /* renamed from: r */
    public static synchronized dvx m9674r() {
        dvx Q;
        synchronized (dwq.class) {
            Q = m9653a().mo9795Q();
        }
        return Q;
    }

    /* renamed from: s */
    public static synchronized dwi m9675s() {
        dwi R;
        synchronized (dwq.class) {
            R = m9653a().mo9796R();
        }
        return R;
    }

    /* renamed from: t */
    public static synchronized dxo m9676t() {
        dxo S;
        synchronized (dwq.class) {
            S = m9653a().mo9797S();
        }
        return S;
    }

    /* renamed from: u */
    public static synchronized dsw m9677u() {
        dsw T;
        synchronized (dwq.class) {
            T = m9653a().mo9798T();
        }
        return T;
    }

    /* renamed from: v */
    public static synchronized ecv m9678v() {
        ecv U;
        synchronized (dwq.class) {
            U = m9653a().mo9799U();
        }
        return U;
    }

    /* renamed from: w */
    public static synchronized dwt m9679w() {
        dwt V;
        synchronized (dwq.class) {
            V = m9653a().mo9800V();
        }
        return V;
    }

    /* renamed from: x */
    public static synchronized dom m9680x() {
        dom W;
        synchronized (dwq.class) {
            W = m9653a().mo9801W();
        }
        return W;
    }

    /* renamed from: y */
    public static synchronized dof m9681y() {
        dof X;
        synchronized (dwq.class) {
            X = m9653a().mo9802X();
        }
        return X;
    }

    /* renamed from: z */
    public static synchronized efh m9682z() {
        efh Y;
        synchronized (dwq.class) {
            Y = m9653a().mo9803Y();
        }
        return Y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final drv mo9787I() {
        if (this.f14294i == null) {
            this.f14294i = new drv(this.f14287b, false);
        }
        return this.f14294i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final doq mo9788J() {
        if (this.f14283F == null) {
            this.f14283F = new doq(this.f14287b);
        }
        return this.f14283F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final dsz mo9789K() {
        if (this.f14295j == null) {
            this.f14295j = new dsz();
        }
        return this.f14295j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final dro mo9790L() {
        if (this.f14296k == null) {
            this.f14296k = new dro(this.f14287b);
        }
        return this.f14296k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final eed mo9791M() {
        if (this.f14297l == null) {
            this.f14297l = new eed(this.f14287b);
        }
        return this.f14297l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final dxm mo9792N() {
        if (this.f14293h == null) {
            this.f14293h = new dxm(this.f14287b);
        }
        return this.f14293h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final eel mo9793O() {
        tiu tiu;
        if (this.f14298m == null) {
            this.f14298m = new eel();
            for (doh doh : mo9802X().mo9331a()) {
                eel eel = this.f14298m;
                ContextManagerClientInfo a = m9652a(doh, "Modules");
                for (int i : tiq.f46143a) {
                    bxco b = tiq.m37051b(i);
                    if (edt.m10183a(b) == 0) {
                        tit tit = new tit();
                        int i2 = b.f162973bD;
                        tkb tkb = new tkb();
                        tkb.mo26623a(2);
                        tit.mo26580a(i2, tkb.mo26620a());
                        tiu = tit.mo26578a();
                    } else {
                        tit tit2 = new tit();
                        tit2.mo26579a(b.f162973bD);
                        tit2.mo26582b(1);
                        tiu = tit2.mo26578a();
                    }
                    ArrayList b2 = eel.f14778a.mo10063b((ContextDataFilterImpl) tiu, a.mo18066a());
                    ArrayList arrayList = new ArrayList(b2.size());
                    int size = b2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList.add(new edr((ContextData) b2.get(i3), false));
                    }
                    eel.f14779b.mo10018a(a.mo18066a(), arrayList);
                }
            }
            mo9795Q().mo9723a(this.f14298m, mo9787I());
        }
        return this.f14298m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final eew mo9794P() {
        if (this.f14299n == null) {
            eew eew = new eew(mo9791M());
            this.f14299n = eew;
            eew.mo10055a(8, 0, (doh) null);
        }
        return this.f14299n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final dvx mo9795Q() {
        if (this.f14300o == null) {
            this.f14300o = new dvx();
            if (cdgp.m133206o()) {
                dvx dvx = this.f14300o;
                long a = m9665i().mo20505a();
                for (doh doh : m9681y().mo9331a()) {
                    tjq a2 = m9673q().mo10053a(doh, 14);
                    if (a2 != null) {
                        try {
                            tnn tnn = (tnn) GeneratedMessageLite.m124014a(tnn.f46304b, a2.mo26593c());
                            if (tnn != null && !sqw.m36041a((Collection) tnn.f46306a)) {
                                bxwc bxwc = tnn.f46306a;
                                int size = bxwc.size();
                                for (int i = 0; i < size; i++) {
                                    bxcx bxcx = (bxcx) bxwc.get(i);
                                    bxcw bxcw = bxcx.f163009h;
                                    if (bxcw == null) {
                                        bxcw = bxcw.f162994e;
                                    }
                                    dwa dwa = new dwa(bxcx, new dvz(bxcw, spn.f44932a, doh));
                                    if (!dwa.m9590a(dwa, a)) {
                                        dvx.f14224b.mo9716a(dwa);
                                    }
                                }
                            }
                        } catch (bxwf e) {
                            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                            bnsl.mo68437a(e);
                            bnsl.mo68432a("dvx", "b", 573, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("[InterestManager] Could not deserialize proto.");
                        }
                    }
                }
            }
        }
        return this.f14300o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final dwi mo9796R() {
        int i;
        if (this.f14301p == null) {
            dwi dwi = new dwi();
            this.f14301p = dwi;
            dwh dwh = dwi.f14272a;
            HashSet hashSet = new HashSet();
            bxwc bxwc = cdgf.f180769a.mo6606a().mo77504c().f163671a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                bxco a = bxco.m122577a(((bxhq) bxwc.get(i2)).f163454a);
                if (a == null) {
                    a = bxco.UNKNOWN_CONTEXT_NAME;
                }
                hashSet.add(Integer.valueOf(a.f162973bD));
            }
            Set set = dwh.f14270b;
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            if (!ega.m10344a(hashSet) || !ega.m10344a(set)) {
                if (ega.m10344a(hashSet)) {
                    hashSet3.addAll(set);
                } else if (ega.m10344a(set)) {
                    hashSet2.addAll(hashSet);
                } else {
                    for (Object obj : hashSet) {
                        if (set.contains(obj)) {
                            hashSet4.add(obj);
                        } else {
                            hashSet2.add(obj);
                        }
                    }
                    for (Object obj2 : set) {
                        if (!hashSet.contains(obj2)) {
                            hashSet3.add(obj2);
                        }
                    }
                }
            }
            ega ega = new ega(hashSet2, hashSet3);
            for (SparseArray sparseArray : dwh.f14271c.values()) {
                for (Integer num : ega.f14853b) {
                    dwg dwg = (dwg) sparseArray.get(num.intValue());
                    if (dwg != null) {
                        dwg.f14264c = false;
                        if (dwg.f14265d != 3) {
                            dwg.mo9771b(3);
                        }
                    }
                }
            }
            dwh.f14270b.removeAll(ega.f14853b);
            dwh.f14270b.addAll(hashSet);
            dvx r = m9674r();
            for (doh doh : r.mo9720a()) {
                for (Integer num2 : ega.f14852a) {
                    int intValue = num2.intValue();
                    if (!((dwf) r.f14223a.get(doh)).mo9768a(intValue)) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    dwh.mo9773a(doh, intValue, i);
                }
            }
            mo9795Q().mo9723a(this.f14301p, mo9787I());
            mo9794P().f14802a.add(11);
        }
        return this.f14301p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final dxo mo9797S() {
        if (this.f14303r == null) {
            dxo dxo = new dxo(this.f14287b);
            this.f14303r = dxo;
            dxo.mo9835a(dyu.f14440b);
            this.f14303r.mo9835a(eab.f14531b);
            this.f14303r.mo9835a(eay.f14581b);
            this.f14303r.mo9835a(ead.f14535b);
            this.f14303r.mo9835a(dzy.f14506b);
            this.f14303r.mo9835a(ebi.f14592b);
            this.f14303r.mo9835a(dzv.f14493b);
            this.f14303r.mo9835a(dyb.f14381b);
            this.f14303r.mo9835a(dzr.f14488b);
            this.f14303r.mo9835a(dzc.f14465b);
            this.f14303r.mo9835a(dzn.f14483b);
            this.f14303r.mo9835a(ebd.f14585b);
            this.f14303r.mo9835a(eau.f14574b);
            this.f14303r.mo9835a(dzl.f14482b);
            this.f14303r.mo9835a(dzj.f14480b);
            this.f14303r.mo9835a(dzp.f14486b);
            this.f14303r.mo9835a(ear.f14565b);
            this.f14303r.mo9835a(eah.f14541b);
            this.f14303r.mo9835a(eaw.f14579b);
            this.f14303r.mo9835a(ebb.f14583b);
            this.f14303r.mo9835a(dzh.f14477k);
            this.f14303r.mo9835a(dyo.f14407L);
            this.f14303r.mo9835a(ebf.f14586b);
            if (!cdgp.f180782a.mo6606a().mo77602v()) {
                this.f14303r.mo9835a(ebk.f14596l);
                this.f14303r.mo9835a(eaf.f14538b);
            }
            mo9795Q().mo9723a(this.f14303r, mo9787I());
        }
        return this.f14303r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final dsw mo9798T() {
        if (this.f14304s == null) {
            this.f14304s = new dsw();
            mo9793O().mo10039a(this.f14304s, mo9787I());
            mo9795Q().mo9723a(this.f14304s, mo9787I());
            dsw dsw = this.f14304s;
            dvx r = m9674r();
            for (doh doh : r.mo9720a()) {
                Collection<dwa> a = r.mo9719a(doh);
                if (a != null && !a.isEmpty()) {
                    dsu dsu = (dsu) dsw.f13968a.get(doh);
                    if (dsu == null) {
                        dsu = new dsu();
                        dsw.f13968a.put(doh, dsu);
                    }
                    for (dwa dwa : a) {
                        dsu.mo9533a(dwa);
                    }
                }
            }
        }
        return this.f14304s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final ecv mo9799U() {
        if (this.f14305t == null) {
            this.f14305t = new ecv(this.f14287b);
            eew P = mo9794P();
            P.f14803b.mo10088a(this.f14305t, mo9787I());
        }
        return this.f14305t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final dwt mo9800V() {
        if (this.f14306u == null) {
            this.f14306u = new dwt(this.f14287b);
        }
        return this.f14306u;
    }

    /* JADX WARN: Type inference failed for: r9v0, assign insn: 0x006b: CONST  (r9v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean], assign insn: PHI: (r9v1 ?) = (r9v0 ?), (r9v2 ?) binds: [B:33:0x006d, B:34:0x006d] */
    /* JADX WARN: Type inference failed for: r9v2, assign insn: 0x00ef: CONST  (r9v2 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final dom mo9801W() {
        Set set;
        if (this.f14308w == null) {
            if (this.f14307v == null) {
                doo doo = new doo();
                this.f14307v = doo;
                doo.f13718a = m9680x();
                Set<doh> a = m9681y().mo9331a();
                if (a != null && !a.isEmpty()) {
                    for (doh doh : a) {
                        dvx r = m9674r();
                        ContextManagerClientInfo a2 = m9652a(doh, "AclUpdateManager");
                        dwf dwf = (dwf) r.f14223a.get(doh);
                        if (dwf != null) {
                            if (dwf.f14261d.mo67271d("AclUpdateManager")) {
                                set = dwf.f14261d.mo67361a("AclUpdateManager");
                            } else {
                                set = null;
                            }
                            if (set != null) {
                                r.mo9733b(new ArrayList(set));
                            }
                        }
                        int[] iArr = tiq.f46143a;
                        int length = iArr.length;
                        ? r9 = 0;
                        int i = 0;
                        while (i < length) {
                            int i2 = iArr[i];
                            if (doo.f13718a.mo9352a(a2, tiq.m37051b(i2))) {
                                new Object[1][r9] = Integer.toString(i2);
                                dvy dvy = new dvy(Integer.toString(i2), tiq.m37051b(i2), dwj.m9632c(), a2);
                                bdyx bdyx = cdgr.f180886t;
                                dvy dvy2 = dvy;
                                long longValue = ((Long) bdyx.mo58455c()).longValue();
                                bxvd da = bxcv.f162989d.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = r9;
                                }
                                bxcv bxcv = (bxcv) da.f164949b;
                                bxcv.f162992b = 2;
                                int i3 = bxcv.f162991a | 1;
                                bxcv.f162991a = i3;
                                bxcv.f162991a = i3 | 2;
                                bxcv.f162993c = longValue;
                                dvy2.mo9736a(new dvq((bxcv) da.mo74062i(), bdyx));
                                dvy2.mo9735a(dre.m9137c(), null);
                                r.mo9724a(dvy2.mo9734a());
                            }
                            i++;
                            r9 = 0;
                        }
                    }
                }
            }
            this.f14308w = new dom(this.f14307v);
        }
        return this.f14308w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final dof mo9802X() {
        if (this.f14309x == null) {
            this.f14309x = new dof(this.f14287b);
        }
        return this.f14309x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final efh mo9803Y() {
        if (this.f14310y == null) {
            Random random = new Random();
            this.f14310y = new efh();
            mo9793O().mo10039a(this.f14310y, mo9787I());
            mo9795Q().mo9723a(this.f14310y, mo9787I());
            efj efj = this.f14310y.f14824b;
            dvx r = m9674r();
            for (doh doh : r.mo9720a()) {
                Collection<dwa> a = r.mo9719a(doh);
                if (a != null && !a.isEmpty()) {
                    efk efk = (efk) efj.f14830a.get(doh);
                    if (efk == null) {
                        efk = new efk();
                        efj.f14830a.put(doh, efk);
                    }
                    for (dwa dwa : a) {
                        efk.mo10075a(dwa);
                    }
                }
            }
            dqs dqs = this.f14310y.f14823a;
            if (dqs != null) {
                dqs.f13833b.mo9438b();
            }
            efh efh = this.f14310y;
            double r2 = (double) cdgp.m133209r();
            double nextDouble = random.nextDouble();
            Double.isNaN(r2);
            efh.mo10069a((long) (r2 * nextDouble));
            this.f14310y.mo10071b(cdgp.m133209r());
            efh efh2 = this.f14310y;
            double s = (double) cdgp.m133210s();
            double nextDouble2 = random.nextDouble();
            Double.isNaN(s);
            efh2.mo10072c((long) (s * nextDouble2));
            this.f14310y.mo10073d((long) new Random().nextInt((int) cdgp.m133195d()));
        }
        return this.f14310y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final efz mo9804Z() {
        if (this.f14311z == null) {
            this.f14311z = new efz();
        }
        return this.f14311z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final dpe mo9805aa() {
        if (this.f14278A == null) {
            dpe dpe = new dpe(this.f14287b);
            this.f14278A = dpe;
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
            intentFilter.addAction("com.google.android.gms.udc.action.SETTING_CHANGED");
            dpe.f13732a.registerReceiver(dpe.f13733b, intentFilter);
            for (doh doh : m9681y().mo9331a()) {
                m9667k().mo9435a(new dpb(dpe, doh), dqy.m9123a("ulrUdcConsentChangeIntent"));
            }
        }
        return this.f14278A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public final egr mo9806ab() {
        if (this.f14279B == null) {
            egr egr = new egr();
            this.f14279B = egr;
            egr.mo10103a();
        }
        return this.f14279B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final dtl mo9807ac() {
        if (this.f14281D == null) {
            this.f14281D = new dtl(this.f14287b);
        }
        return this.f14281D;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final dpk mo9808ad() {
        if (this.f14282E == null) {
            this.f14282E = new dpk();
            mo9795Q().mo9723a(this.f14282E, mo9787I());
            mo9793O().mo10039a(this.f14282E, mo9787I());
        }
        return this.f14282E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final dpf mo9809ae() {
        if (this.f14284G == null) {
            this.f14284G = new dpf();
        }
        return this.f14284G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public final void mo9810ah() {
        if (this.f14280C == null) {
            this.f14280C = new doy();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9811b(Context context) {
        this.f14288c = context;
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
            this.f14289d = currentModule.moduleId;
            this.f14290e = currentModule.moduleVersion;
        } catch (IllegalStateException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("dwq", "b", 427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Modules] Chimera context was not passed in.");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, doh, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    protected static dwq m9653a() {
        if (f14276J == null) {
            dwq dwq = new dwq(rpr.m34216b(), srb.f45012a);
            f14276J = dwq;
            dss.m9251b("Modules", "Modules.init() called.", new Object[0]);
            dwq.mo9787I();
            dwq.mo9789K();
            dwq.mo9790L();
            dwq.mo9792N();
            dwq.mo9791M();
            dwq.mo9793O();
            dwq.mo9794P();
            dwq.mo9795Q();
            dwq.mo9796R();
            m9657ag();
            dwq.mo9797S();
            dwq.mo9798T();
            dwq.mo9799U();
            dwq.mo9800V();
            dwq.mo9801W();
            if (dwq.f14286I == null) {
                dwq.f14286I = new dwm();
                new ecx().mo9516a(dqy.m9123a("Prune"));
            }
            dwq.mo9802X();
            dwq.mo9803Y();
            dwq.mo9804Z();
            dwq.mo9805aa();
            dwq.mo9806ab();
            dwq.mo9810ah();
            dwq.mo9807ac();
            dwq.mo9808ad();
            dwq.mo9788J();
            drv k = m9667k();
            m9644A().mo10082a(k.f13906c, k);
            tmd.f46256a = new dwn();
            for (doh doh : m9681y().mo9331a()) {
                if (!doh.mo9338b()) {
                    dvx r = m9674r();
                    dvy dvy = new dvy("user_location", bxco.USER_LOCATION, dwj.m9632c(), m9652a(doh, "com.google.android.contextmanager.interest.InterestManager"));
                    long aR = cdgp.f180782a.mo6606a().mo77553aR();
                    bxvd da = bxdi.f163030e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxdi bxdi = (bxdi) da.f164949b;
                    bxdi.f163033b = 1;
                    int i = bxdi.f163032a | 1;
                    bxdi.f163032a = i;
                    bxdi.f163032a = 2 | i;
                    bxdi.f163034c = aR;
                    dwl dwl = new dwl((bxdi) da.mo74062i());
                    sdo.m34959a(dwl);
                    dvy.f14230b = dwl;
                    dvy.f14229a = true;
                    r.mo9724a(dvy.mo9734a());
                }
            }
            tit tit = new tit();
            tit.mo26579a(10002);
            tiu a = tit.mo26578a();
            for (doh doh2 : m9681y().mo9331a()) {
                if (!doh2.mo9338b()) {
                    WriteBatchImpl b = tjj.m37080b();
                    eej a2 = m9672p().mo10037a((ContextDataFilterImpl) a, m9652a(doh2, "ContextManagerInitializer"));
                    if (a2.f14775a != 0) {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dwp", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68422a("[ContextManagerInitializer] Unable to read from store for account %s, status code is %s", (Object) doh2, a2.f14775a);
                    } else {
                        ArrayList arrayList = a2.f14776b;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList arrayList2 = a2.f14776b;
                            int size = arrayList2.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ContextData contextData = (ContextData) arrayList2.get(i2);
                                tka a3 = dqt.m9102a(contextData.mo18022j());
                                if (a3 != null) {
                                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                                    bnsl2.mo68432a("dwp", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68405a("[ContextManagerInitializer] Fixing UDC Model timestamps");
                                    tip tip = new tip(contextData);
                                    tip.mo26574a(a3);
                                    b.mo18101a(tip.mo26570a());
                                }
                            }
                        }
                        m9672p().mo10036a(b, m9652a(doh2, "ContextManagerInitializer"));
                    }
                }
            }
            ContextData.f30619c = new dwo();
            egr ab = f14276J.mo9806ab();
            sdo.m34977c("ContextManagerStarted");
            ab.mo10109c(new dqx("ContextManagerStarted", null, 0, 0, 0, "com.google.android.gms"));
            f14276J.mo9809ae().mo9373a(2);
        }
        return f14276J;
    }

    /* renamed from: a */
    public static synchronized void m9654a(aaag aaag) {
        synchronized (dwq.class) {
            f14277a = aaag;
            dof y = m9681y();
            for (doh doh : y.mo9331a()) {
                if (!doh.mo9338b() && !y.mo9334b(doh)) {
                    String valueOf = String.valueOf(doh.f13690b);
                    if (valueOf.length() == 0) {
                        new String("Removing account: ");
                    } else {
                        "Removing account: ".concat(valueOf);
                    }
                    new dry(doh).mo9516a(dqy.m9123a("ContextManagerInitializer_remove_deleted_accounts"));
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m9655a(Context context) {
        synchronized (dwq.class) {
            dwq a = m9653a();
            a.f14288c = context;
            try {
                ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
                a.f14289d = currentModule.moduleId;
                a.f14290e = currentModule.moduleVersion;
            } catch (IllegalStateException e) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("dwq", "b", 427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[Modules] Chimera context was not passed in.");
            }
        }
    }
}
