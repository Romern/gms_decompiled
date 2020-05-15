package p000;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: nkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nkq extends nrd implements ofi, nyd, ojn {

    /* renamed from: a */
    public static final bnsn f35898a = odk.m28481a("CAR.BT");

    /* renamed from: p */
    private static final bipc[] f35899p = {bipc.BLUETOOTH_PAIRING_NUMERIC_COMPARISON, bipc.BLUETOOTH_PAIRING_PIN};

    /* renamed from: b */
    int f35900b;

    /* renamed from: c */
    bipc f35901c;

    /* renamed from: d */
    public nyr f35902d;

    /* renamed from: e */
    public nyh f35903e;

    /* renamed from: f */
    final List f35904f = new LinkedList();

    /* renamed from: g */
    ofj f35905g;

    /* renamed from: h */
    nyj f35906h;

    /* renamed from: i */
    boolean f35907i = false;

    /* renamed from: j */
    public String f35908j;

    /* renamed from: k */
    public final nkf f35909k;

    /* renamed from: l */
    public final niw f35910l;

    /* renamed from: m */
    public final olo f35911m;

    /* renamed from: n */
    public final olt f35912n;

    /* renamed from: o */
    public final oln f35913o;

    /* renamed from: q */
    private bipc[] f35914q;

    /* renamed from: r */
    private final Context f35915r;

    public nkq(Context context, niw niw, olo olo, olt olt, oln oln) {
        this.f35915r = context;
        this.f35910l = niw;
        this.f35911m = olo;
        this.f35912n = olt;
        this.f35913o = oln;
        this.f35909k = new nkf(context);
    }

    /* renamed from: a */
    private final void m26635a(Runnable runnable) {
        nuu.m27792a(new nka(this, runnable));
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: b */
    public final void mo20965b() {
        String str;
        this.f35902d.mo21862d();
        nyr nyr = this.f35902d;
        if (nyr.f36977n == 0) {
            bmxy.m108581a(nyr.f36966c);
            str = nyr.f36966c.mo21818a();
        } else {
            str = null;
        }
        if (str != null) {
            ofj ofj = this.f35905g;
            bipc bipc = this.f35901c;
            if (!ofj.f37504c) {
                bnsi d = ofj.f37502a.mo68390d();
                d.mo68432a("ofj", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("sendPairingRequest on closed channel");
                return;
            }
            bxvd da = bipd.f121143d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bipd bipd = (bipd) da.f164949b;
            str.getClass();
            int i = bipd.f121145a | 1;
            bipd.f121145a = i;
            bipd.f121146b = str;
            if (bipc != null) {
                bipd.f121147c = bipc.f121142f;
                bipd.f121145a = i | 2;
            }
            ofj.f37503b = true;
            ofj.mo22206a(32769, da.mo74062i());
            return;
        }
        this.f35903e.mo21836c(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: d */
    public final void mo20966d() {
        mo20963a(njr.f35866a);
    }

    /* renamed from: e */
    public final int mo20967e() {
        return ((Integer) nuu.m27789a(new nkc(this))).intValue();
    }

    /* renamed from: f */
    public final boolean mo20968f() {
        nyr nyr = this.f35902d;
        nyr.getClass();
        return m26636a(new njs(nyr));
    }

    /* renamed from: g */
    public final boolean mo20969g() {
        nyr nyr = this.f35902d;
        nyr.getClass();
        return m26636a(new njt(nyr));
    }

    /* renamed from: h */
    public final boolean mo20970h() {
        nyr nyr = this.f35902d;
        nyr.getClass();
        return m26636a(new nju(nyr));
    }

    /* renamed from: i */
    public final boolean mo20971i() {
        return m26636a(new njv(this));
    }

    /* renamed from: j */
    public final boolean mo20972j() {
        return m26636a(new njw(this));
    }

    /* renamed from: k */
    public final String mo20973k() {
        return this.f35908j;
    }

    /* renamed from: l */
    public final int[] mo20974l() {
        return bxzo.m124572a(this.f35914q);
    }

    /* renamed from: m */
    public final void mo20975m() {
        if (this.f35900b != 0) {
            throw new IllegalStateException("Service not initialized");
        }
    }

    /* renamed from: a */
    private final boolean m26636a(Callable callable) {
        return ((Boolean) nuu.m27789a(new nke(this, callable))).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final nyh mo20959a(Looper looper, nyr nyr, nyd nyd) {
        return new nyh(looper, nyr, nyd, this.f35912n);
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & 32) == 0) {
            return null;
        }
        bipg bipg = bivb.f121929g;
        if (bipg == null) {
            bipg = bipg.f121156d;
        }
        String str = bipg.f121158a;
        bipg bipg2 = bivb.f121929g;
        if (bipg2 == null) {
            bipg2 = bipg.f121156d;
        }
        bipc[] bipcArr = (bipc[]) new bxvv(bipg2.f121159b, bipg.f121155c).toArray(new bipc[0]);
        if (TextUtils.isEmpty(str) || "SKIP_THIS_BLUETOOTH".equals(str)) {
            this.f35900b = -1;
            this.f35901c = bipc.BLUETOOTH_PAIRING_UNAVAILABLE;
            this.f35902d = null;
            nyh a = mo20959a(Looper.getMainLooper(), (nyr) null, this);
            this.f35903e = a;
            a.mo21836c(1);
            return this;
        }
        bipc bipc = bipc.BLUETOOTH_PAIRING_UNAVAILABLE;
        bipc[] bipcArr2 = f35899p;
        for (bipc bipc2 : bipcArr2) {
            int length = bipcArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                bipc bipc3 = bipcArr[i];
                if (bipc3 == bipc2) {
                    bipc = bipc3;
                    break;
                }
                i++;
            }
        }
        this.f35901c = bipc;
        if (bipc != bipc.BLUETOOTH_PAIRING_UNAVAILABLE) {
            nyr nyr = new nyr(this.f35915r, str, new nkm(this));
            this.f35902d = nyr;
            int i2 = nyr.f36977n;
            if (i2 == -3) {
                this.f35900b = -5;
            } else if (i2 == -2) {
                this.f35900b = -3;
            } else if (i2 != 0) {
                this.f35900b = -2;
            } else {
                this.f35900b = 0;
                nyh a2 = mo20959a(Looper.getMainLooper(), this.f35902d, this);
                this.f35903e = a2;
                a2.mo21836c(101);
                this.f35908j = str;
                this.f35914q = bipcArr;
                this.f35909k.mo20943a();
                return this;
            }
            nyh a3 = mo20959a(Looper.getMainLooper(), (nyr) null, this);
            this.f35903e = a3;
            a3.mo21836c(100);
            return this;
        }
        this.f35900b = -4;
        this.f35902d = null;
        nyh a4 = mo20959a(Looper.getMainLooper(), (nyr) null, this);
        this.f35903e = a4;
        a4.mo21836c(100);
        return this;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new ofj(this, ojm);
    }

    /* renamed from: a */
    public final void mo20960a() {
        nyj nyj = this.f35906h;
        if (nyj == null) {
            nyr nyr = this.f35902d;
            nkb nkb = new nkb(this);
            if (nyr.f36977n == 0) {
                nyl nyl = nyr.f36978o;
                if (nyl == null) {
                    bmxy.m108581a(nyr.f36966c);
                    bmxy.m108581a(nyr.f36968e);
                    nyr.f36978o = new nyl(nyr.f36966c, nyr.f36968e.f36910a, new nyn(nyr, nkb));
                    nyl nyl2 = nyr.f36978o;
                    nyl2.f36954c.f36908a.getProfileProxy(nyr.f36965b, new nyk(nyl2), 1);
                } else if (nyl.f36957f != null) {
                    nkb.mo20938a(nyl);
                }
            } else {
                nkb.mo20938a(null);
            }
        } else {
            nyh nyh = this.f35903e;
            nyh.f36937m = nyj;
            nyh.mo21836c(ErrorInfo.TYPE_SDU_MEMORY_FULL);
        }
    }

    /* renamed from: a */
    public final void mo20961a(bisf bisf, boolean z) {
        m26635a(new njz(this, bisf, z));
    }

    /* renamed from: a */
    public final void mo20962a(String str) {
        m26635a(new njq(this, str));
    }

    /* renamed from: a */
    public final void mo20963a(nkn nkn) {
        if (this.f35900b != 0) {
            bnsi b = f35898a.mo68387b();
            b.mo68432a("nkq", "a", 542, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("deliverEventToClients: Service not initialized");
        } else if (this.f35905g == null) {
            bnsi b2 = f35898a.mo68387b();
            b2.mo68432a("nkq", "a", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b2.mo68405a("deliverEventToClients: Channel not established yet");
        } else if (!this.f35907i) {
            Iterator it = this.f35904f.iterator();
            while (it.hasNext()) {
                nkp nkp = (nkp) it.next();
                try {
                    nkn.mo20929a(nkp.f35897b);
                } catch (RemoteException e) {
                    bnsi b3 = f35898a.mo68387b();
                    b3.mo68437a(e);
                    b3.mo68432a("nkq", "a", 560, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b3.mo68420a("Exception in deliverEventToClients. clientCallbackInvoker=%s", nkn);
                    nkp.mo20957a();
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        nuu.m27792a(new njx(this, ojh));
    }

    /* renamed from: a */
    public final boolean mo20964a(nrf nrf) {
        return ((Boolean) nuu.m27789a(new nkd(this, nrf))).booleanValue();
    }
}
