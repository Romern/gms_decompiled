package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.io.PrintWriter;

/* renamed from: bftk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bftk implements bugo, bugl, bseb {

    /* renamed from: a */
    private static bftk f115218a = null;

    /* renamed from: a */
    public static bftk m97822a(Context context) {
        bftk bftk;
        if (f115218a == null) {
            if (bfqt.m97589a() != null) {
                bugn a = new bgcb().mo62634a(context);
                adzt adzt = new adzt(bfqt.m97589a());
                spf a2 = spf.m35821a(context);
                bftg bftg = new bftg(context);
                if (a != null) {
                    bugr a3 = a.mo72627a(5147455389092024339L);
                    if (cest.m138205k()) {
                        int i = Build.VERSION.SDK_INT;
                        if (a3 != null && ((!cest.f183409a.mo6606a().flpBluePixelIgnorePreProdVersions() || ((long) a3.mo72647c()) >= cest.f183409a.mo6606a().flpBluePixelEarliestSupportedVersion()) && soz.m35811h(context))) {
                            bftk = new bftm(context, a3, adzt, a2, bftg);
                            a.mo72629a(5147455389092024339L, bftk, adzt);
                            f115218a = bftk;
                        }
                    }
                }
                bftk = new bftj();
                f115218a = bftk;
            } else {
                f115218a = new bftj();
            }
        }
        return f115218a;
    }

    /* renamed from: a */
    public abstract void mo62238a(Location location);

    /* renamed from: a */
    public abstract void mo62239a(bfth bfth);

    /* renamed from: a */
    public abstract void mo62240a(bfti bfti);

    /* renamed from: a */
    public abstract void mo62243a(PrintWriter printWriter);

    /* renamed from: c */
    public abstract bfrx mo62245c();
}
