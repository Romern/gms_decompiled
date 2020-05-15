package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: fuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuu {

    /* renamed from: a */
    private final fip f17306a;

    public fuu(Context context) {
        this.f17306a = fip.m11765a(context);
    }

    /* renamed from: a */
    public static final void m12428a(fjk fjk, bzft bzft) {
        Long l;
        int i;
        if (bzft != null && (bzft.f169869a & 1) != 0) {
            bzfm bzfm = bzft.f169870b;
            if (bzfm == null) {
                bzfm = bzfm.f169831c;
            }
            bzfo bzfo = bzfm.f169833a;
            if (bzfo == null) {
                bzfo = bzfo.f169844c;
            }
            if (!bzfo.f169847b.isEmpty()) {
                bzfm bzfm2 = bzft.f169870b;
                if (bzfm2 == null) {
                    bzfm2 = bzfm.f169831c;
                }
                bzfo bzfo2 = bzfm2.f169833a;
                if (bzfo2 == null) {
                    bzfo2 = bzfo.f169844c;
                }
                m12429a(fjk, bzfo2.f169847b);
                bzfm bzfm3 = bzft.f169870b;
                if (bzfm3 == null) {
                    bzfm3 = bzfm.f169831c;
                }
                bxwc bxwc = bzfm3.f169834b;
                for (int i2 = 0; i2 < bxwc.size(); i2++) {
                    String str = ((bzfn) bxwc.get(i2)).f169839b;
                    String str2 = ((bzfn) bxwc.get(i2)).f169840c;
                    String str3 = ((bzfn) bxwc.get(i2)).f169841d;
                    if ((((bzfn) bxwc.get(i2)).f169838a & 8) != 0) {
                        l = Long.valueOf(((bzfn) bxwc.get(i2)).f169842e);
                    } else {
                        l = null;
                    }
                    bxwc bxwc2 = ((bzfn) bxwc.get(i2)).f169843f;
                    if (!TextUtils.isEmpty(fjk.mo10891a("&tid"))) {
                        fir fir = new fir((char[]) null);
                        if (!TextUtils.isEmpty(str)) {
                            fir.mo10866d(str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            fir.mo10865c(str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            fir.mo10867e(str3);
                        }
                        if (l != null) {
                            fir.mo10862a(l.longValue());
                        }
                        if (bxwc2 != null) {
                            i = bxwc2.size();
                        } else {
                            i = 0;
                        }
                        for (int i3 = 0; i3 < i; i3++) {
                            fir.mo10858a(((bzfl) bxwc2.get(i3)).f169828a, ((bzfl) bxwc2.get(i3)).f169829b);
                        }
                        fjk.mo10893a(fir.mo10861a());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m12429a(fjk fjk, String str) {
        if (!TextUtils.isEmpty(str)) {
            fjk.mo10892a("&tid", str);
        }
    }

    /* renamed from: a */
    public final fjk mo11370a() {
        fjk a = this.f17306a.mo10855a((String) null);
        a.mo10892a("&sf", Double.toString(cbvz.f178436a.mo6606a().mo75518a()));
        return a;
    }
}
