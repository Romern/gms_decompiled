package p000;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.diagnostics.CriticalError;
import com.google.android.gms.carsetup.CarInfoInternal;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: noy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class noy extends npz {

    /* renamed from: a */
    public static final bnsn f36261a = odk.m28481a("CAR.LITE");

    /* renamed from: b */
    public final ozp f36262b;

    /* renamed from: c */
    public final oha f36263c = new ojd(true);

    /* renamed from: d */
    public final ofl f36264d;

    /* renamed from: e */
    public final Handler f36265e;

    /* renamed from: f */
    public final boolean f36266f;

    /* renamed from: g */
    public final now f36267g = new now();

    /* renamed from: h */
    public final nox f36268h = new nox(this);

    /* renamed from: i */
    public final Context f36269i;

    /* renamed from: j */
    public long f36270j;

    /* renamed from: k */
    public ojq f36271k;

    /* renamed from: l */
    public ohq f36272l;

    /* renamed from: m */
    public boolean f36273m;

    /* renamed from: n */
    public boolean f36274n;

    /* renamed from: o */
    public omi f36275o;

    /* renamed from: q */
    private final bmzi f36276q = bmzn.m108681a(nok.f36240a);

    /* renamed from: r */
    private final bmzi f36277r = bmzn.m108681a(nol.f36241a);

    /* renamed from: s */
    private final int f36278s;

    /* renamed from: t */
    private final boolean f36279t;

    /* renamed from: u */
    private final int f36280u;

    /* renamed from: v */
    private final int f36281v;

    /* renamed from: w */
    private final Closeable f36282w;

    /* renamed from: x */
    private final CarInfoInternal f36283x;

    /* renamed from: y */
    private final sns f36284y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public noy(Context context, int i, boolean z, int i2, int i3, Closeable closeable, CarInfoInternal carInfoInternal, boolean z2, nmw nmw) {
        super(nmw);
        CarInfo carInfo;
        CarInfoInternal carInfoInternal2 = carInfoInternal;
        adzt adzt = new adzt(context.getMainLooper());
        sns sns = new sns("car-lite-background", 9);
        this.f36269i = context;
        this.f36265e = adzt;
        this.f36284y = sns;
        sns.start();
        nov nov = new nov(this);
        snr snr = new snr(this.f36284y);
        bmzi bmzi = nom.f36242a;
        if (carInfoInternal2 != null) {
            carInfo = carInfoInternal2.f29539a;
        } else {
            carInfo = null;
        }
        this.f36262b = new pam(context, snr, bmzi, nov, carInfo);
        this.f36264d = new ofl(new pai());
        this.f36278s = i;
        this.f36279t = z;
        this.f36280u = i2;
        this.f36281v = i3;
        this.f36282w = closeable;
        this.f36283x = carInfoInternal2;
        this.f36266f = z2;
    }

    /* renamed from: a */
    private static List m27107a(List list, bnhe bnhe) {
        bngs bngs = new bngs();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            oer a = oer.m28607a(((ojh) bnhe.get(num)).f37753n);
            if (a == null) {
                bnsi c = f36261a.mo68388c();
                c.mo68432a("noy", "a", 279, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("Unknown service type %d", ((ojh) bnhe.get(num)).f37753n);
                a = oer.UNKNOWN;
            }
            bngs.mo67668c(a);
        }
        return bngs.mo67664a();
    }

    /* renamed from: b */
    public final void mo21370b() {
        this.f36270j = 0;
        this.f36271k = null;
        this.f36272l = null;
        this.f36273m = false;
        this.f36274n = false;
        this.f36275o = null;
        nox nox = this.f36268h;
        npe.m27155a();
        nox.f36258a = false;
        nox.f36259b = false;
    }

    /* renamed from: j */
    public final void mo21197j() {
        if (((Boolean) this.f36276q.mo6606a()).booleanValue()) {
            this.f36284y.quit();
        }
        super.mo21197j();
    }

    /* renamed from: b */
    public final void mo21371b(CriticalError criticalError) {
        this.f36270j = 0;
        try {
            this.f36282w.close();
        } catch (IOException e) {
            bnsi b = f36261a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("noy", "b", 443, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Impossible");
        }
        mo21195h().mo21188a(criticalError);
        if (!((Boolean) this.f36276q.mo6606a()).booleanValue()) {
            this.f36284y.quit();
        }
        mo21370b();
    }

    /* renamed from: a */
    public final nsu mo21266a(String str) {
        npj b = mo21325b(str);
        b.mo21408a(this.f36271k);
        ozp ozp = this.f36262b;
        pam pam = (pam) ozp;
        pam.f38719c.post(new ozt(pam, bngx.m109356a(Integer.valueOf(b.f36312c)), bngx.m109356a(oer.VENDOR_EXTENSION)));
        b.mo21406a();
        return b;
    }

    /* renamed from: a */
    public final void mo21369a() {
        if (this.f36274n) {
            List<Integer> e = bngx.m109376e();
            try {
                HashSet hashSet = new HashSet();
                ojq ojq = this.f36271k;
                ArrayList<byte[]> arrayList = new ArrayList();
                for (ojp ojp : ojq.f37797g) {
                    bivb bivb = ojp.f37787b;
                    if (bivb != null) {
                        arrayList.add(bivb.mo73642k());
                    }
                }
                for (byte[] bArr : arrayList) {
                    bivb bivb2 = (bivb) bxvk.m124016a(bivb.f121921l, bArr, bxus.m123744c());
                    if ((bivb2.f121923a & 2048) != 0) {
                        bnsi d = f36261a.mo68390d();
                        d.mo68432a("noy", "a", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68409a("Skip vendor extension channels for now %d", bivb2.f121924b);
                    } else {
                        hashSet.add(Integer.valueOf(bivb2.f121924b));
                    }
                }
                mo21289a(this.f36266f, this.f36283x, this.f36271k, this.f36278s, this.f36280u, this.f36281v, this.f36279t);
                if (mo21311ap()) {
                    if (ccql.m131269d()) {
                        ofd.m28611a(this.f36269i, "com.google.android.gms.car.CAR_SERVICE_ENDPOINTS", ofa.STARTED);
                    }
                    e = this.f36271k.mo22213a((ojl) new noo(this, hashSet));
                    bnsi d2 = f36261a.mo68390d();
                    d2.mo68432a("noy", "a", 229, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d2.mo68409a("Start required services in lite %d", e.size());
                    ojq ojq2 = this.f36271k;
                    bnha bnha = new bnha();
                    ojp[] ojpArr = ojq2.f37797g;
                    for (ojp ojp2 : ojpArr) {
                        if (ojp2.f37788c != null) {
                            bnha.mo67695b(Integer.valueOf(ojp2.f37786a), ojp2.f37788c);
                        }
                    }
                    bnhe b = bnha.mo67618b();
                    bngs bngs = new bngs();
                    for (Integer num : e) {
                        oer a = oer.m28607a(((ojh) b.get(num)).f37753n);
                        if (a == null) {
                            bnsi c = f36261a.mo68388c();
                            c.mo68432a("noy", "a", 279, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c.mo68409a("Unknown service type %d", ((ojh) b.get(num)).f37753n);
                            a = oer.UNKNOWN;
                        }
                        bngs.mo67668c(a);
                    }
                    bngx a2 = bngs.mo67664a();
                    pam pam = (pam) this.f36262b;
                    pam.f38719c.post(new ozs(pam, e, a2));
                }
            } catch (bxwf e2) {
                bnsi b2 = f36261a.mo68387b();
                b2.mo68437a(e2);
                b2.mo68432a("noy", "a", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68405a("Invalid service proto buf");
            }
        } else if (!this.f36266f) {
            omi omi = this.f36275o;
            if (omi != null) {
                mo21279a(this.f36283x, this.f36271k, this.f36278s, this.f36280u, this.f36281v, this.f36279t, omi);
                try {
                    this.f36275o.mo22290b(this.f36267g);
                } catch (RemoteException e3) {
                }
            } else {
                mo21273a(bpdn.PROTOCOL_WRONG_CONFIGURATION, bpdo.NO_SENSORS, "No sensors");
            }
        }
    }

    /* renamed from: a */
    public final void mo21187a(bipi bipi) {
        if (((Boolean) this.f36277r.mo6606a()).booleanValue()) {
            this.f36262b.mo22810a(bipi);
        } else {
            mo21195h().mo21187a(bipi);
        }
    }

    /* renamed from: a */
    public final void mo21188a(CriticalError criticalError) {
        bnsi d = f36261a.mo68390d();
        d.mo68432a("noy", "a", 290, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Car disconnected");
        this.f36262b.mo22809a();
        mo21371b(criticalError);
    }

    /* renamed from: a */
    public final void mo21189a(PrintWriter printWriter) {
        super.mo21189a(printWriter);
        printWriter.println();
        printWriter.println("CarServiceBinderLite");
        printWriter.print("connectionType: ");
        printWriter.println(this.f36278s);
        printWriter.print("sessionId: ");
        printWriter.println(this.f36270j);
        printWriter.print("analyticsSessionId: ");
        printWriter.println(this.f36280u);
        printWriter.print("userAuthorized: ");
        printWriter.println(this.f36274n);
        printWriter.print("resumeComplete: ");
        printWriter.println(this.f36273m);
        printWriter.print("useGearheadForProjection: ");
        printWriter.println(this.f36266f);
    }
}
