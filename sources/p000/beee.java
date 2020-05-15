package p000;

import android.os.ParcelUuid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: beee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beee {

    /* renamed from: a */
    public static final String f107013a = beee.class.getSimpleName();

    /* renamed from: b */
    public static final ParcelUuid f107014b = new ParcelUuid(aynd.m84289a(-342));

    /* renamed from: c */
    public static final byte[] f107015c = {80};

    /* renamed from: d */
    public final Object f107016d = new Object();

    /* renamed from: e */
    public final bedo f107017e = new bedo();

    /* renamed from: f */
    public final aysh f107018f;

    /* renamed from: g */
    public final Map f107019g = new HashMap();

    /* renamed from: h */
    public final beed f107020h = new beed(this);

    /* renamed from: i */
    public ausg f107021i = null;

    public beee(aysh aysh) {
        bmxy.m108581a(aysh);
        this.f107018f = aysh;
    }

    /* renamed from: a */
    public final void mo58596a() {
        synchronized (this.f107016d) {
            if (this.f107021i != null) {
                aysh aysh = this.f107018f;
                aysh.f98417e = null;
                aysh.f98416d.f98427a.stopScan(aysh.f98415c.f98429b);
                this.f107021i = null;
                this.f107019g.clear();
            } else {
                throw new bedp("Not scanning!");
            }
        }
    }
}
