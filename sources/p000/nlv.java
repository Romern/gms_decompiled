package p000;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplayId;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Queue;

/* renamed from: nlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nlv implements oif, ojn, ofr {

    /* renamed from: d */
    static final long f35973d = ((long) ViewConfiguration.getLongPressTimeout());

    /* renamed from: i */
    private static final bnsn f35974i = odk.m28481a("CAR.INPUT");

    /* renamed from: k */
    private static final MotionEvent.PointerProperties[] f35975k;

    /* renamed from: w */
    private static final SparseIntArray f35976w;

    /* renamed from: a */
    public int[] f35977a;

    /* renamed from: b */
    public bire f35978b;

    /* renamed from: c */
    public final EnumSet f35979c = EnumSet.noneOf(biqh.class);

    /* renamed from: e */
    public final nlt f35980e;

    /* renamed from: f */
    public final npd f35981f;

    /* renamed from: g */
    public final SharedPreferences.OnSharedPreferenceChangeListener f35982g = new nls(this);

    /* renamed from: h */
    public volatile CarUiInfo f35983h;

    /* renamed from: j */
    private oig f35984j;

    /* renamed from: l */
    private final SparseArray f35985l = new SparseArray();

    /* renamed from: m */
    private final Handler f35986m = new adzt(Looper.getMainLooper());

    /* renamed from: n */
    private long f35987n;

    /* renamed from: o */
    private int f35988o;

    /* renamed from: p */
    private int f35989p;

    /* renamed from: q */
    private final CarDisplayId f35990q;

    /* renamed from: r */
    private final olo f35991r;

    /* renamed from: s */
    private final List f35992s;

    /* renamed from: t */
    private final Queue f35993t = new ArrayDeque();

    /* renamed from: u */
    private boolean f35994u;

    /* renamed from: v */
    private boolean f35995v;

    /* renamed from: x */
    private final nne f35996x;

    static {
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[1];
        f35975k = pointerPropertiesArr;
        pointerPropertiesArr[0] = new MotionEvent.PointerProperties();
        f35975k[0].id = 31;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35976w = sparseIntArray;
        sparseIntArray.put(0, 0);
        f35976w.put(1, 1);
        f35976w.put(2, 2);
        f35976w.put(5, 5);
        f35976w.put(6, 6);
    }

    public nlv(nlt nlt, CarDisplayId carDisplayId, olo olo, npd npd, nne nne) {
        this.f35980e = nlt;
        this.f35990q = carDisplayId;
        this.f35991r = olo;
        this.f35981f = npd;
        this.f35996x = nne;
        this.f35992s = npe.m27162b(ccvu.f180046a.mo6606a().mo76893g());
    }

    /* renamed from: a */
    public static KeyEvent m26757a(biro biro, int i, int i2) {
        return new KeyEvent(0, 0, !biro.f121437c ? 1 : 0, biro.f121436b, (i & 128) != 0 ? 1 : i2, biro.f121438d, 0, 0, i | 4);
    }

    /* renamed from: c */
    public static oeq m26758c(bivr bivr) {
        int i;
        oeq oeq;
        oep oep;
        SparseIntArray sparseIntArray = f35976w;
        if ((bivr.f122038a & 2) != 0) {
            int a = bits.m102827a(bivr.f122041d);
            if (a == 0) {
                a = 1;
            }
            i = a - 1;
        } else {
            i = 0;
        }
        int i2 = sparseIntArray.get(i);
        int i3 = bivr.f122040c;
        int size = bivr.f122039b.size();
        synchronized (oeq.f37397a) {
            oeq = oeq.f37399c;
            if (oeq != null) {
                oeq.f37399c = oeq.f37403d;
                oeq.f37398b--;
                oeq.f37403d = null;
            } else {
                oeq = new oeq();
            }
        }
        oeq.f37404e = i2;
        oeq.f37405f = i3;
        if (oeq.f37406g.length != size) {
            oeq.f37406g = new oep[size];
        }
        for (int i4 = 0; i4 < bivr.f122039b.size(); i4++) {
            bivq bivq = (bivq) bivr.f122039b.get(i4);
            oep[] oepArr = oeq.f37406g;
            int i5 = bivq.f122031a;
            int i6 = bivq.f122032b;
            int i7 = bivq.f122033c;
            synchronized (oep.f37390a) {
                oep = oep.f37392c;
                if (oep != null) {
                    oep.f37392c = oep.f37393d;
                    oep.f37391b--;
                    oep.f37393d = null;
                } else {
                    oep = new oep();
                }
            }
            oep.f37394e = i5;
            oep.f37395f = i6;
            oep.f37396g = i7;
            oepArr[i4] = oep;
        }
        return oeq;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final void mo21075b(int i, int i2) {
        if (i == 65536) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.setAxisValue(9, (float) i2);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f35980e.mo21064a(MotionEvent.obtain(uptimeMillis, uptimeMillis, 8, 1, f35975k, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0, 1.0f, 1.0f, 0, 0, FragmentTransaction.TRANSIT_FRAGMENT_CLOSE, 0));
        }
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: d */
    public final boolean mo21079d() {
        bire bire = this.f35978b;
        return bire != null && bire.f121397g && ccvr.f180043a.mo76884b().mo76885a();
    }

    /* renamed from: e */
    public final int mo21080e() {
        int i;
        int i2;
        int i3;
        int i4 = this.f35988o;
        if (i4 != 0) {
            return i4;
        }
        bire bire = this.f35978b;
        if (bire != null) {
            int i5 = bire.f121392b;
            int i6 = bire.f121393c;
            int i7 = bire.f121395e;
            int i8 = bire.f121396f;
            if (i5 == 0 || i6 == 0) {
                bnsi c = f35974i.mo68388c();
                c.mo68432a("nlv", "e", 408, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("No virtual touchpad dimens. Using default threshold.");
                return 48;
            }
            if (i7 == 0 || i8 == 0) {
                bnsi c2 = f35974i.mo68388c();
                c2.mo68432a("nlv", "e", 413, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("No physical touchpad dimens. Assuming physical dimens = virtual dimens.");
                i7 = i5;
                i8 = i6;
            }
            float f = (float) i7;
            float f2 = (float) i8;
            if (!this.f35981f.mo21392c()) {
                i = (int) ccvu.m131812b();
            } else {
                i = this.f35981f.f36296c.getInt("touchpad_base_fraction", 6);
            }
            if (!this.f35981f.mo21392c()) {
                i2 = (int) ccvu.m131813c();
            } else {
                i2 = this.f35981f.f36296c.getInt("touchpad_min_size_mm", 4);
            }
            float h = mo21083h();
            int i9 = i5 / i;
            int i10 = i6 / i;
            if (i9 > i10) {
                i3 = (int) (((float) Math.max(i9, (int) (((float) i2) * (((float) i5) / f)))) * h);
            } else {
                i3 = (int) (((float) Math.max(i10, (int) (((float) i2) * (((float) i6) / f2)))) * h);
            }
            this.f35988o = i3;
            return i3;
        }
        bnsi c3 = f35974i.mo68388c();
        c3.mo68432a("nlv", "e", 398, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c3.mo68405a("No touchpad found. Using default threshold.");
        return 48;
    }

    /* renamed from: f */
    public final int mo21081f() {
        int i;
        int i2 = this.f35989p;
        if (i2 != 0) {
            return i2;
        }
        bire bire = this.f35978b;
        if (bire != null) {
            int i3 = bire.f121392b;
            int i4 = bire.f121393c;
            int i5 = bire.f121395e;
            int i6 = bire.f121396f;
            if (i3 == 0 || i4 == 0) {
                bnsi c = f35974i.mo68388c();
                c.mo68432a("nlv", "f", 457, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("No virtual touchpad dimens. Using default threshold.");
                return 64;
            }
            if (i5 == 0 || i6 == 0) {
                bnsi c2 = f35974i.mo68388c();
                c2.mo68432a("nlv", "f", 462, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("No physical touchpad dimens. Assuming physical dimens = virtual dimens.");
                i5 = i3;
                i6 = i4;
            }
            float f = (float) i5;
            float f2 = (float) i6;
            if (!this.f35981f.mo21392c()) {
                i = (int) ccvu.m131814d();
            } else {
                i = this.f35981f.f36296c.getInt("touchpad_multimove_penalty_mm", 4);
            }
            int e = mo21080e() + ((int) (((float) (i3 <= i4 ? (int) (((float) i) * (((float) i4) / f2)) : (int) (((float) i) * (((float) i3) / f)))) * mo21083h()));
            this.f35989p = e;
            return e;
        }
        bnsi c3 = f35974i.mo68388c();
        c3.mo68432a("nlv", "f", 447, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c3.mo68405a("No touchpad found. Using default threshold.");
        return 64;
    }

    /* renamed from: g */
    public final void mo21082g() {
        Point point;
        if (this.f35978b != null) {
            this.f35988o = 0;
            this.f35989p = 0;
        }
        CarUiInfo carUiInfo = this.f35983h;
        int[] iArr = carUiInfo.f29373e;
        if (iArr != null) {
            point = new Point(iArr[0], iArr[1]);
        } else {
            point = null;
        }
        this.f35983h = new CarUiInfo(carUiInfo.f29369a, carUiInfo.f29375g, carUiInfo.f29371c, carUiInfo.f29372d, point, carUiInfo.f29374f, carUiInfo.f29376h, mo21080e(), mo21081f());
        nne nne = this.f35996x;
        if (nne != null) {
            nne.mo21204a(this.f35983h);
        }
    }

    /* renamed from: h */
    public final float mo21083h() {
        bire bire;
        int a = (int) npe.m27152a(this.f35992s, this.f35991r.mo21346p(), 0);
        if (a == 0 && ((bire = this.f35978b) == null || (bire.f121391a & 128) == 0 || (a = bire.f121399i) == 0)) {
            return 1.0f;
        }
        return (((((float) a) - 0.875f) * -0.5f) / 5.0f) + 1.0f;
    }

    /* renamed from: a */
    public final Point mo21070a() {
        bire bire = this.f35978b;
        if (bire != null) {
            return new Point(bire.f121392b, bire.f121393c);
        }
        return null;
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        bire bire;
        int i;
        boolean z;
        bivb bivb2 = bivb;
        if ((bivb2.f121923a & 8) == 0) {
            return null;
        }
        birg birg = bivb2.f121927e;
        if (birg == null) {
            birg = birg.f121409g;
        }
        if (birg.f121415f != this.f35990q.f29493b) {
            return null;
        }
        this.f35977a = bqcn.m112584a(birg.f121411a);
        if (birg.f121413c.size() > 0) {
            bire = (bire) birg.f121413c.get(0);
        } else {
            bire = null;
        }
        this.f35978b = bire;
        this.f35979c.addAll(new bxvv(birg.f121414d, birg.f121408e));
        int[] iArr = this.f35977a;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 : iArr) {
            if (i2 == 19) {
                z3 = true;
            } else if (i2 == 84) {
                z2 = true;
            } else if (i2 == 65536) {
                z4 = true;
            }
            if (z2 && z4 && z3) {
                break;
            }
        }
        boolean z5 = z2;
        boolean z6 = z3;
        birf birf = birg.f121412b.size() > 0 ? (birf) birg.f121412b.get(0) : null;
        if (birf == null) {
            i = 0;
        } else if ((birf.f121403a & 4) != 0) {
            int a = bivt.m102884a(birf.f121406d);
            if (a == 0) {
                a = 1;
            }
            i = a != 1 ? a != 2 ? 4 : 3 : 2;
        } else {
            i = 1;
        }
        boolean b = mo21078b();
        boolean d = mo21079d();
        int e = mo21080e();
        int f = mo21081f();
        if (!ccsz.f179882a.mo6606a().mo76748a() || i != 0 || z4 || b || d) {
            if (b && z4) {
                bnsi c = f35974i.mo68388c();
                c.mo68432a("nlv", "a", 278, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Rotary controller not supported when touchpad for UI navigation is present. Reporting rotary controller as not present.");
                z = false;
            } else {
                z = z4;
            }
            this.f35983h = new CarUiInfo(z, i, z5, b, mo21070a(), z6, d, e, f);
            nne nne = this.f35996x;
            if (nne != null) {
                nne.mo21204a(this.f35983h);
            }
            this.f35981f.mo21382a(this.f35982g);
            return this;
        }
        bnsi c2 = f35974i.mo68388c();
        c2.mo68432a("nlv", "a", 273, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c2.mo68405a("No input devices present.");
        return null;
    }

    /* renamed from: b */
    public final void mo21076b(bivb bivb) {
        if (this.f35978b != null) {
            birg birg = bivb.f121927e;
            if (birg == null) {
                birg = birg.f121409g;
            }
            if ((((bire) birg.f121413c.get(0)).f121391a & 128) != 0) {
                bxvd a = bire.f121389j.mo74141a(this.f35978b);
                birg birg2 = bivb.f121927e;
                if (birg2 == null) {
                    birg2 = birg.f121409g;
                }
                int i = ((bire) birg2.f121413c.get(0)).f121399i;
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bire bire = (bire) a.f164949b;
                bire.f121391a |= 128;
                bire.f121399i = i;
                this.f35978b = (bire) a.mo74062i();
            }
        }
        mo21082g();
    }

    /* renamed from: b */
    public final void mo21077b(bivr bivr) {
        int i = bivr.f122040c;
        oeq c = m26758c(bivr);
        c.f37404e = (i << 8) | c.f37404e;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = c.f37404e;
        if (i2 == 0) {
            this.f35987n = uptimeMillis;
        }
        this.f35980e.mo21068b(oeq.m28606a(this.f35987n, uptimeMillis, i2, Arrays.asList(c.f37406g), 0, 0, 1048584, 3));
    }

    /* renamed from: b */
    public final boolean mo21078b() {
        bire bire = this.f35978b;
        if (bire == null || (!bire.f121394d && !ccvu.f180046a.mo6606a().mo76887a())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new oig(this, ojm);
    }

    /* renamed from: a */
    public final void mo21071a(int i) {
        biqh a = biqh.m102724a(i);
        if (a != null && this.f35979c.contains(a)) {
            oig oig = this.f35984j;
            bxvd da = birb.f121375c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            birb birb = (birb) da.f164949b;
            birb.f121378b = a.f121281f;
            birb.f121377a |= 1;
            oig.mo22206a(32772, (birb) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo21072a(int i, int i2) {
        boolean z;
        if (i == 65541) {
            bxvd da = biro.f121433f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            biro biro = (biro) da.f164949b;
            int i3 = biro.f121435a | 1;
            biro.f121435a = i3;
            biro.f121436b = 23;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            int i4 = i3 | 2;
            biro.f121435a = i4;
            biro.f121437c = z;
            biro.f121435a = i4 | 4;
            biro.f121438d = 0;
            biro biro2 = (biro) da.mo74062i();
            bire bire = this.f35978b;
            if (bire == null || bire.f121398h) {
                this.f35980e.mo21066a(biro2, 0, 0);
            } else if (!biro2.f121437c) {
                this.f35980e.mo21066a(biro2, 0, 0);
                if (this.f35994u) {
                    this.f35994u = false;
                    this.f35995v = false;
                }
            } else {
                if (!this.f35995v) {
                    this.f35995v = true;
                    this.f35994u = this.f35993t.isEmpty();
                    while (!this.f35993t.isEmpty()) {
                        this.f35980e.mo21068b((MotionEvent) this.f35993t.poll());
                    }
                }
                this.f35980e.mo21066a(biro2, 0, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo21073a(biro biro) {
        int i;
        if (!biro.f121437c) {
            this.f35985l.remove(biro.f121436b);
            this.f35986m.removeCallbacks((nlu) this.f35985l.get(biro.f121436b));
            i = 0;
        } else if (!biro.f121439e) {
            nlu nlu = (nlu) this.f35985l.get(biro.f121436b);
            if (nlu == null) {
                nlu nlu2 = new nlu(this, biro);
                this.f35985l.put(biro.f121436b, nlu2);
                this.f35986m.postDelayed(nlu2, f35973d);
                i = 0;
            } else {
                i = nlu.f35970a + 1;
                nlu.f35970a = i;
            }
        } else {
            bxvd bxvd = (bxvd) biro.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) biro);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            biro biro2 = (biro) bxvd.f164949b;
            biro biro3 = biro.f121433f;
            int i2 = biro2.f121435a | 8;
            biro2.f121435a = i2;
            biro2.f121439e = false;
            nlt nlt = this.f35980e;
            biro2.f121435a = i2 | 2;
            biro2.f121437c = true;
            nlt.mo21065a((biro) bxvd.mo74062i());
            nlt nlt2 = this.f35980e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            biro biro4 = (biro) bxvd.f164949b;
            biro4.f121435a |= 2;
            biro4.f121437c = false;
            nlt2.mo21065a((biro) bxvd.mo74062i());
            return;
        }
        this.f35980e.mo21066a(biro, 0, i);
    }

    /* renamed from: a */
    public final void mo21074a(bivr bivr) {
        this.f35980e.mo21067a(m26758c(bivr));
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        oig oig = (oig) ojh;
        this.f35984j = oig;
        int[] iArr = this.f35977a;
        bxvd da = birm.f121425b.mo74144da();
        List b = bqcn.m112586b(iArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        birm birm = (birm) da.f164949b;
        if (!birm.f121427a.mo73666a()) {
            birm.f121427a = GeneratedMessageLite.m124019a(birm.f121427a);
        }
        bxsy.m123078a(b, birm.f121427a);
        oig.mo22206a(32770, (birm) da.mo74062i());
    }
}
