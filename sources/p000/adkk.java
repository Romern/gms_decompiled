package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkk extends sji {

    /* renamed from: a */
    private static final adfs f62039a = new adfs("GetLaunchDataOperation");

    /* renamed from: d */
    private final adgc f62040d;

    /* renamed from: e */
    private final adik f62041e;

    /* renamed from: f */
    private final List f62042f;

    /* renamed from: g */
    private final boolean f62043g;

    public adkk(adgc adgc, adik adik, List list, boolean z) {
        super(121, "GetVisitedInstantAppsOperation");
        this.f62040d = adgc;
        this.f62041e = adik;
        this.f62042f = list;
        this.f62043g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        adhv adhv;
        adgy a;
        String str;
        adhv adhv2;
        try {
            adik adik = this.f62041e;
            List<String> list = this.f62042f;
            boolean z = this.f62043g;
            adik.mo33534b();
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                adgz b = adik.f61808c.mo33515b();
                try {
                    a = adik.f61808c.mo33509a(b);
                    a.mo33504c();
                    while (a.mo33507e()) {
                        String str2 = new String(a.mo33502a(), adfh.f61554b);
                        if (str2.endsWith("-as")) {
                            str = str2.substring(0, str2.length() - 3);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            adhz adhz = (adhz) bxvk.m124016a(adhz.f61753e, a.mo33503b(), bxus.m123743b());
                            if (z) {
                                adhv2 = adik.mo33538f(str);
                            } else {
                                adhv2 = null;
                            }
                            arrayList.add(adik.mo33528a(str, adhz, adhv2));
                        }
                        a.mo33506d();
                    }
                    a.close();
                    b.close();
                } catch (Throwable th) {
                    b.close();
                    throw th;
                }
            } else {
                for (String str3 : list) {
                    adhz c = adik.mo33535c(str3);
                    if (c != null) {
                        if (z) {
                            adhv = adik.mo33538f(str3);
                        } else {
                            adhv = null;
                        }
                        arrayList.add(adik.mo33528a(str3, c, adhv));
                    }
                }
            }
            this.f62040d.mo33449a(Status.f30107a, arrayList);
            return;
            throw th;
        } catch (IOException e) {
            f62039a.mo33425a(e, "Error while reading levelDb", new Object[0]);
            this.f62040d.mo33449a(Status.f30109c, (List) null);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f62040d.mo33449a(Status.f30109c, (List) null);
    }
}
