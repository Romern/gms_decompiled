package p000;

import com.google.android.gms.facs.cache.FacsCacheCallOptions;

/* renamed from: bdvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvj {

    /* renamed from: a */
    public final wez f106504a;

    /* renamed from: b */
    private final String f106505b;

    public bdvj(wez wez, String str) {
        bmxy.m108581a(wez);
        this.f106504a = wez;
        bmxy.m108581a(str);
        this.f106505b = str;
    }

    /* renamed from: a */
    public static bqgg m91492a(aucb aucb) {
        bqgy c = bqgy.m112818c();
        aucb.mo50378a(bqfb.INSTANCE, new bdvi(c));
        return c;
    }

    /* renamed from: a */
    public final FacsCacheCallOptions mo58397a() {
        return new FacsCacheCallOptions(this.f106505b, 1);
    }
}
