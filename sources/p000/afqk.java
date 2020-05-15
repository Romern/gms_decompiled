package p000;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: afqk */
final /* synthetic */ class afqk implements Callable {

    /* renamed from: a */
    private final afqm f64550a;

    /* renamed from: b */
    private final Uri f64551b;

    public afqk(afqm afqm, Uri uri) {
        this.f64550a = afqm;
        this.f64551b = uri;
    }

    public final Object call() {
        abso abso;
        afqm afqm = this.f64550a;
        absl a = afqn.m53449a(this.f64551b, cenl.m137581b().f58117a);
        if (a == null) {
            return bnon.f131923a;
        }
        absk absk = a.f58112b;
        if (absk == null) {
            absk = absk.f58105c;
        }
        int b = absj.m48219b(absk.f58107a);
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i != 0) {
            if (i == 1) {
                bmza b2 = bmza.m108659b(bmvy.f131119a);
                List<PackageInfo> installedPackages = afqm.f64555a.getPackageManager().getInstalledPackages(0);
                int b3 = bqcn.m112585b(b2.mo66928a(TimeUnit.MICROSECONDS));
                rfz a2 = rfz.m33557a(afqm.f64555a);
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                b2.mo66929c();
                b2.mo66930d();
                for (PackageInfo packageInfo : installedPackages) {
                    String str = packageInfo.packageName;
                    if (a2.mo24610b(str)) {
                        hashSet.add(str);
                    } else if (str.startsWith("com.google")) {
                        hashSet2.add(str);
                    }
                }
                afqm.f64556b.mo60745a(installedPackages.size(), hashSet2, b3, bqcn.m112585b(b2.mo66928a(TimeUnit.MICROSECONDS)));
                return hashSet;
            } else if (i == 2) {
                if (absk.f58107a == 3) {
                    abso = (abso) absk.f58108b;
                } else {
                    abso = abso.f58123b;
                }
                rfz a3 = rfz.m33557a(afqm.f64555a);
                HashSet hashSet3 = new HashSet();
                bxwc bxwc = abso.f58125a;
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = ((absn) bxwc.get(i2)).f58120a;
                    if (a3.mo24610b(str2)) {
                        hashSet3.add(str2);
                    }
                }
                return hashSet3;
            } else if (i == 3) {
                return bnon.f131923a;
            } else {
                String a4 = absj.m48218a(absj.m48219b(absk.f58107a));
                StringBuilder sb = new StringBuilder(a4.length() + 28);
                sb.append("Unrecognized ClientMatcher: ");
                sb.append(a4);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            String a5 = absj.m48218a(absj.m48219b(absk.f58107a));
            StringBuilder sb2 = new StringBuilder(a5.length() + 27);
            sb2.append("Unsupported ClientMatcher: ");
            sb2.append(a5);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
