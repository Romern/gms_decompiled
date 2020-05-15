package p000;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Locale;

/* renamed from: axcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcj extends abh implements bjwh, axcc {

    /* renamed from: a */
    public final axci f95769a;

    /* renamed from: d */
    public final bkgd f95770d;

    /* renamed from: e */
    public final C1230nw f95771e = new C1230nw();

    /* renamed from: f */
    final C1230nw f95772f = new C1230nw();

    /* renamed from: g */
    boolean f95773g;

    /* renamed from: h */
    private int f95774h;

    public axcj(axci axci, bkgd bkgd) {
        this.f95769a = axci;
        this.f95770d = bkgd;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f95769a.f95767c;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        int b = this.f95771e.mo15537b();
        for (int i = 0; i < b; i++) {
            bjwl.m104790b((bjwf) this.f95771e.mo15538b(i), this.f95771e.mo15533a(i), this.f95770d.f124186a);
        }
        this.f95771e.mo15542c();
        int b2 = this.f95772f.mo15537b();
        for (int i2 = 0; i2 < b2; i2++) {
            bjwl.m104790b((bkcf) this.f95772f.mo15538b(i2), this.f95772f.mo15533a(i2), this.f95770d.f124186a);
        }
        this.f95772f.mo15542c();
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        boolean z;
        boolean z2;
        bwig a = this.f95769a.mo53007a(i);
        bwij b = this.f95769a.mo53008b(i);
        boolean z3 = false;
        if (a.f159628b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (a.f159630d.size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((a.f159627a & 2) != 0) {
            z3 = true;
        }
        if (awev.m79813a(z) + awev.m79813a(z2) + awev.m79813a(z3) != 1) {
            return axck.m82311a(a, b) + 1000;
        }
        if (z) {
            if (a.f159628b.size() != 1) {
                return 2;
            }
            return 1;
        } else if (z2) {
            return 4;
        } else {
            if (z3) {
                return 3;
            }
            return axck.m82311a(a, b) + 1000;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 1 || i == 2) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            return new axcb(linearLayout);
        } else if (i == 3) {
            int i2 = this.f95774h + 1;
            this.f95774h = i2;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new axcd(frameLayout, String.format(Locale.US, "simple-form-tag-%d", Integer.valueOf(i2)));
        } else if (i != 4) {
            return null;
        } else {
            return axbz.m82266a(context);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        axca axca = (axca) acm;
        bwig a = this.f95769a.mo53007a(i);
        bwij b = this.f95769a.mo53008b(i);
        bkgd bkgd = this.f95770d;
        if (!axca.mo53004b(a, bkgd)) {
            axca.mo53001a(bkgd);
            axca.mo53003a(a, bkgd);
        }
        axca.mo53002a(this.f95770d, this.f95773g);
        int a2 = bwii.m121989a(b.f159641c);
        if (a2 != 0 && a2 == 3 && ((bjwf) this.f95771e.mo15534a(b.f159639a)) == null) {
            bjwf bjwf = new bjwf();
            bjwl.m104784a(bjwf, b.f159639a, this.f95770d.f124186a);
            this.f95771e.mo15540b(b.f159639a, bjwf);
        }
        bxwc bxwc = a.f159631e;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            bmde bmde = (bmde) bxwc.get(i2);
            if (this.f95772f.mo15534a(bmde.f128783b) == null) {
                awzp awzp = new awzp(bmde, this.f95770d);
                awzp.mo65834a(this.f95770d.f124186a);
                this.f95772f.mo15540b(bmde.f128783b, awzp);
            }
        }
    }
}
