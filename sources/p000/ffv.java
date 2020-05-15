package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ffv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffv {

    /* renamed from: a */
    public static final bngx f16478a = bngx.m109357a(Integer.valueOf((int) cbri.f178135a.mo6606a().mo75262l()), Integer.valueOf((int) cbri.f178135a.mo6606a().mo75261k()));

    /* renamed from: b */
    public final adzt f16479b = new adzt();

    /* renamed from: c */
    public final List f16480c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d */
    private final qws f16481d;

    /* renamed from: e */
    private final fgh f16482e;

    private ffv(Context context, fgh fgh) {
        this.f16481d = qws.m33019a(context, "IDENTITY_FRONTEND");
        this.f16482e = fgh;
    }

    /* renamed from: a */
    public static ffv m11622a(Context context, ffk ffk) {
        fgh fgh = new fgh(ModuleManager.get(context));
        if (ffr.m11620a(ffk)) {
            return new ffv(context, ffk.f16458a, fgh);
        }
        return m11623a(context, fgh);
    }

    /* renamed from: b */
    public final void mo10789b() {
        if (!this.f16480c.isEmpty()) {
            for (Runnable runnable : this.f16480c) {
                this.f16479b.removeCallbacks(runnable);
            }
            this.f16480c.clear();
        }
    }

    /* renamed from: c */
    public final int mo10790c() {
        return adyf.m51386a(eot.f15436a) ? 3 : 2;
    }

    public ffv(Context context, String str, fgh fgh) {
        this.f16481d = new qws(context, "IDENTITY_FRONTEND", str);
        this.f16482e = fgh;
    }

    /* renamed from: a */
    public static ffv m11623a(Context context, fgh fgh) {
        return new ffv(context, fgh);
    }

    /* renamed from: a */
    public final bsof mo10784a() {
        bsvm b = this.f16482e.mo10800b();
        bsvn a = this.f16482e.mo10799a();
        bxvd da = bsoh.f146378c.mo74144da();
        bxwc bxwc = b.f147296c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bxvd da2 = bspd.f146469c.mo74144da();
            int i2 = ((bsyh) bxwc.get(i)).f147678b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bspd bspd = (bspd) da2.f164949b;
            bspd.f146471a |= 1;
            bspd.f146472b = i2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsoh bsoh = (bsoh) da.f164949b;
            bspd bspd2 = (bspd) da2.mo74062i();
            bspd2.getClass();
            if (!bsoh.f146381b.mo73666a()) {
                bsoh.f146381b = bxvk.m124021a(bsoh.f146381b);
            }
            bsoh.f146381b.add(bspd2);
        }
        bxwc bxwc2 = b.f147295b;
        int size2 = bxwc2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bxvd da3 = bspe.f146473c.mo74144da();
            int i4 = ((bsyi) bxwc2.get(i3)).f147682b;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bspe bspe = (bspe) da3.f164949b;
            bspe.f146475a |= 1;
            bspe.f146476b = i4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsoh bsoh2 = (bsoh) da.f164949b;
            bspe bspe2 = (bspe) da3.mo74062i();
            bspe2.getClass();
            if (!bsoh2.f146380a.mo73666a()) {
                bsoh2.f146380a = bxvk.m124021a(bsoh2.f146380a);
            }
            bsoh2.f146380a.add(bspe2);
        }
        bxvd da4 = bsoi.f146382f.mo74144da();
        String str = a.f147307b;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bsoi bsoi = (bsoi) da4.f164949b;
        str.getClass();
        int i5 = bsoi.f146384a | 1;
        bsoi.f146384a = i5;
        bsoi.f146385b = str;
        if ((a.f147306a & 32) != 0) {
            String str2 = a.f147312g;
            str2.getClass();
            i5 |= 4;
            bsoi.f146384a = i5;
            bsoi.f146387d = str2;
        }
        if ((a.f147306a & 16) != 0) {
            String str3 = a.f147311f;
            str3.getClass();
            i5 |= 2;
            bsoi.f146384a = i5;
            bsoi.f146386c = str3;
        }
        if ((a.f147306a & 4) != 0) {
            String str4 = a.f147309d;
            str4.getClass();
            bsoi.f146384a = i5 | 64;
            bsoi.f146388e = str4;
        }
        bxvd da5 = bsof.f146365e.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsof bsof = (bsof) da5.f164949b;
        bsoh bsoh3 = (bsoh) da.mo74062i();
        bsoh3.getClass();
        bsof.f146368b = bsoh3;
        bsof.f146367a |= 1;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsof bsof2 = (bsof) da5.f164949b;
        bsoi bsoi2 = (bsoi) da4.mo74062i();
        bsoi2.getClass();
        bsof2.f146369c = bsoi2;
        bsof2.f146367a |= 2;
        this.f16482e.mo10801c();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bsof bsof3 = (bsof) da5.f164949b;
        bsof3.f146367a |= 4;
        bsof3.f146370d = false;
        return (bsof) da5.mo74062i();
    }

    /* renamed from: a */
    public final bsow mo10785a(String str, long j, String str2) {
        bxvd da = bsow.f146438g.mo74144da();
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = split[length - 1];
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsow bsow = (bsow) da.f164949b;
        str3.getClass();
        int i = bsow.f146440a | 1;
        bsow.f146440a = i;
        bsow.f146441b = str3;
        String str4 = split[length - 2];
        str4.getClass();
        bsow.f146440a = i | 2;
        bsow.f146442c = str4;
        String g = cbri.m128137g();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsow bsow2 = (bsow) da.f164949b;
        g.getClass();
        int i2 = bsow2.f146440a | 4;
        bsow2.f146440a = i2;
        bsow2.f146443d = g;
        int i3 = i2 | 8;
        bsow2.f146440a = i3;
        bsow2.f146444e = (int) j;
        if (str2 != null) {
            str2.getClass();
            bsow2.f146440a = i3 | 16;
            bsow2.f146445f = str2;
        }
        return (bsow) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo10786a(int i, int i2, int i3) {
        bxvd da = bspq.f146567d.mo74144da();
        bxvd da2 = bspm.f146525d.mo74144da();
        bxvd da3 = bspk.f146511f.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspk bspk = (bspk) da3.f164949b;
        bspk.f146514b = 3;
        bspk.f146513a |= 1;
        bxvd da4 = bspl.f146518f.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bspl bspl = (bspl) da4.f164949b;
        int i4 = bspl.f146520a | 4;
        bspl.f146520a = i4;
        bspl.f146524e = i;
        int i5 = i4 | 1;
        bspl.f146520a = i5;
        bspl.f146521b = i2;
        bspl.f146520a = i5 | 2;
        bspl.f146522c = i3;
        bngx bngx = f16478a;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bspl bspl2 = (bspl) da4.f164949b;
        if (!bspl2.f146523d.mo73666a()) {
            bspl2.f146523d = bxvk.m124019a(bspl2.f146523d);
        }
        bxsy.m123078a(bngx, bspl2.f146523d);
        bspl bspl3 = (bspl) da4.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bspk bspk2 = (bspk) da3.f164949b;
        bspl3.getClass();
        bspk2.f146517e = bspl3;
        bspk2.f146513a |= 16;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bspm bspm = (bspm) da2.f164949b;
        bspk bspk3 = (bspk) da3.mo74062i();
        bspk3.getClass();
        bspm.f146528b = bspk3;
        bspm.f146527a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspm bspm2 = (bspm) da2.mo74062i();
        bspm2.getClass();
        bspq.f146571c = bspm2;
        bspq.f146569a |= 8;
        mo10788a((bspq) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo10787a(int i, int i2, String str) {
        bxvf bxvf = (bxvf) bspp.f146553l.mo74144da();
        bsmt bsmt = bsmt.ACCOUNT_SETTINGS_MOBILE_MENU;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp = (bspp) bxvf.f164949b;
        bspp.f146556b = bsmt.f145305dO;
        int i3 = bspp.f146555a | 1;
        bspp.f146555a = i3;
        bspp.f146557c = i2 - 1;
        int i4 = i3 | 2;
        bspp.f146555a = i4;
        int i5 = i4 | 8;
        bspp.f146555a = i5;
        bspp.f146559e = i;
        bspp.f146555a = i5 | 16;
        bspp.f146560f = true;
        bsof a = mo10784a();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bspp bspp2 = (bspp) bxvf.f164949b;
        a.getClass();
        bspp2.f146562h = a;
        int i6 = bspp2.f146555a | 64;
        bspp2.f146555a = i6;
        if (str != null) {
            str.getClass();
            bspp2.f146555a = i6 | 4;
            bspp2.f146558d = str;
        }
        bxvd da = bspq.f146567d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bspq bspq = (bspq) da.f164949b;
        bspp bspp3 = (bspp) bxvf.mo74062i();
        bspp3.getClass();
        bspq.f146570b = bspp3;
        bspq.f146569a |= 1;
        mo10788a((bspq) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo10788a(bspq bspq) {
        this.f16481d.mo24335a(bspq.mo73642k()).mo24327b();
    }
}
