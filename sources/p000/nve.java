package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowSpec;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nve extends nta {

    /* renamed from: a */
    public final Object f36587a = new Object();

    /* renamed from: b */
    public volatile nvc f36588b;

    /* renamed from: c */
    public final List f36589c = new ArrayList();

    /* renamed from: d */
    private final WeakReference f36590d;

    public nve(nvk nvk) {
        this.f36590d = new WeakReference(nvk);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094 A[SYNTHETIC, Splitter:B:14:0x0094] */
    /* renamed from: a */
    public final nsy mo21547a(CarWindowSpec carWindowSpec, nsz nsz) {
        String str;
        nvk nvk;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        CarWindowLayoutParams carWindowLayoutParams;
        nvk nvk2;
        oop oop;
        CarWindowSpec carWindowSpec2 = carWindowSpec;
        try {
            nvk nvk3 = (nvk) this.f36590d.get();
            if (nvk3 == null) {
                return null;
            }
            String str6 = carWindowSpec2.f29397a;
            String str7 = carWindowSpec2.f29398b;
            CarWindowLayoutParams carWindowLayoutParams2 = carWindowSpec2.f29399c;
            int i2 = carWindowSpec2.f29400d;
            if (ccpp.m131164b()) {
                if (carWindowLayoutParams2.f29379a > 0) {
                    nvk = nvk3;
                    str2 = str6;
                    str3 = str7;
                    i = i2;
                    str = "nvk";
                    str5 = "a";
                    str4 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                    carWindowLayoutParams = carWindowLayoutParams2;
                    nvk2 = nvk;
                    synchronized (nvk2.f36631aa) {
                        try {
                            oop = new oop(str2, str3, carWindowLayoutParams, nvk2, nsz, i, nvk2.f36658d);
                            CarWindowLayoutParams carWindowLayoutParams3 = oop.f38080g;
                            if (!(carWindowLayoutParams3.f29388j == -1 && carWindowLayoutParams3.f29389k == -1)) {
                                try {
                                    Context createPackageContext = oop.f38077d.mo21648a().createPackageContext(oop.f38076c, 0);
                                    if (oop.f38080g.f29388j != -1) {
                                        oop.f38082i = oop.f38077d.mo21671b().mo22480a(createPackageContext, oop.f38080g.f29388j);
                                    }
                                    if (oop.f38080g.f29389k != -1) {
                                        oop.f38083j = oop.f38077d.mo21671b().mo22480a(createPackageContext, oop.f38080g.f29389k);
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    bnsi b = oop.f38074a.mo68387b();
                                    b.mo68437a(e);
                                    b.mo68432a("oop", "d", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    b.mo68420a("%s Failed to find package", oop.f38075b);
                                    throw new IllegalArgumentException("Failed to init window");
                                }
                            }
                            nvk2.f36631aa.add(oop);
                            nvk2.f36632ab = true;
                            ooq ooq = nvk2.f36668n;
                            nvg nvg = nvk2.f36665k;
                            if (nvg != null) {
                                if (ooq != null) {
                                    oop.mo22385a(ooq);
                                    nvg.mo21632a(oop.f38081h);
                                }
                            }
                        } catch (RemoteException e2) {
                            bnsi b2 = nvk.f36599a.mo68387b();
                            b2.mo68437a(e2);
                            b2.mo68432a(str, str5, 1265, str4);
                            b2.mo68405a("Error creating CarWindow: RemoteException");
                            return null;
                        }
                    }
                    return oop.f38084k;
                }
            }
            str = "nvk";
            str5 = "a";
            str4 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            i = i2;
            str3 = str7;
            str2 = str6;
            nvk = nvk3;
            carWindowLayoutParams = new CarWindowLayoutParams(carWindowLayoutParams2.f29379a, carWindowLayoutParams2.f29380b, carWindowLayoutParams2.f29381c, carWindowLayoutParams2.f29382d, carWindowLayoutParams2.f29383e, carWindowLayoutParams2.f29384f, carWindowLayoutParams2.f29385g, carWindowLayoutParams2.f29386h, carWindowLayoutParams2.f29387i, carWindowLayoutParams2.f29388j, carWindowLayoutParams2.f29389k, carWindowLayoutParams2.f29390l, carWindowLayoutParams2.f29391m, carWindowLayoutParams2.f29392n, carWindowLayoutParams2.f29393o, -1, carWindowLayoutParams2.f29395q);
            nvk2 = nvk;
            synchronized (nvk2.f36631aa) {
            }
        } catch (Exception e3) {
            bnsi b3 = nvk.f36599a.mo68387b();
            b3.mo68437a(e3);
            b3.mo68432a("nve", "a", 4394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b3.mo68405a("createCarWindow exception");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo21553b() {
        oqa oqa;
        if (!mo21552a() && (oqa = (oqa) this.f36590d.get()) != null) {
            oqa.mo21686f();
        }
    }

    /* renamed from: c */
    public final Point mo21556c() {
        oqa oqa = (oqa) this.f36590d.get();
        if (oqa != null) {
            return oqa.mo21706s();
        }
        return null;
    }

    /* renamed from: d */
    public final int mo21557d() {
        oqa oqa = (oqa) this.f36590d.get();
        if (oqa != null) {
            return oqa.mo21705r();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo21554b(nrq nrq) {
        synchronized (this.f36587a) {
            if (this.f36588b != null && this.f36588b.f36583a.f12819a.equals(nrq.f12819a)) {
                nrq.f12819a.unlinkToDeath(this.f36588b, 0);
                this.f36588b = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo21555b(nsw nsw) {
        nvd nvd;
        synchronized (this.f36587a) {
            Iterator it = this.f36589c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    nvd = null;
                    break;
                }
                nvd = (nvd) it.next();
                if (nvd.f36585a.f12819a.equals(nsw.f12819a)) {
                    break;
                }
            }
            if (nvd != null) {
                nsw.f12819a.unlinkToDeath(nvd, 0);
                this.f36589c.remove(nvd);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public final nsy mo21548a(String str, String str2, CarWindowLayoutParams carWindowLayoutParams, nsz nsz) {
        return mo21547a(new CarWindowSpec(str, str2, carWindowLayoutParams, 0), nsz);
    }

    /* renamed from: a */
    public final void mo21549a(int i) {
        nvk nvk = (nvk) this.f36590d.get();
        if (nvk != null) {
            nvk.f36674t = i;
            nvk.mo21694j();
        }
    }

    /* renamed from: a */
    public final void mo21550a(nrq nrq) {
        synchronized (this.f36587a) {
            if (this.f36588b == null) {
                try {
                    this.f36588b = new nvc(nrq, this);
                } catch (RemoteException e) {
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    public final void mo21551a(nsw nsw) {
        synchronized (this.f36587a) {
            for (nvd nvd : this.f36589c) {
                if (nvd.f36585a.f12819a.equals(nsw.f12819a)) {
                    return;
                }
            }
            try {
                this.f36589c.add(new nvd(nsw, this));
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo21552a() {
        oqa oqa = (oqa) this.f36590d.get();
        return oqa != null && oqa.mo21693i();
    }
}
