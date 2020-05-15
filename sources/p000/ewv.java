package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: ewv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ewv extends ewo {

    /* renamed from: s */
    final /* synthetic */ eww f15950s;

    /* renamed from: t */
    private final TextView f15951t;

    /* renamed from: u */
    private final TextView f15952u;

    /* renamed from: v */
    private final FadeInImageView f15953v;

    /* renamed from: w */
    private final FadeInImageView f15954w;

    /* renamed from: x */
    private final View f15955x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ewv(eww eww, View view) {
        super(view);
        this.f15950s = eww;
        this.f15955x = view;
        this.f15951t = (TextView) view.findViewById(C0126R.C0129id.title);
        this.f15952u = (TextView) view.findViewById(C0126R.C0129id.description);
        this.f15953v = (FadeInImageView) view.findViewById(C0126R.C0129id.image);
        this.f15954w = (FadeInImageView) view.findViewById(C0126R.C0129id.icon);
    }

    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        int i;
        boolean z;
        if (ewj.mo10503a() == 6) {
            bsxv bsxv = ((ewu) ewj).f15949a;
            evi.m11180a(this.f15951t, bsxv.f147627c);
            evi.m11180a(this.f15952u, bsxv.f147628d);
            ViewGroup.LayoutParams layoutParams = this.f15953v.getLayoutParams();
            fgt fgt = this.f15950s.f15938j;
            FadeInImageView fadeInImageView = this.f15953v;
            boolean z2 = true;
            int i2 = bsxv.f147625a & 1;
            bswh bswh = bsxv.f147626b;
            if (bswh == null) {
                bswh = bswh.f147430g;
            }
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            if (i2 == 0) {
                z = false;
            } else {
                z = true;
            }
            evi.m11185a(fgt, fadeInImageView, z, bswh, i);
            fgt fgt2 = this.f15950s.f15938j;
            FadeInImageView fadeInImageView2 = this.f15954w;
            if ((bsxv.f147625a & 8) == 0) {
                z2 = false;
            }
            bswh bswh2 = bsxv.f147629e;
            if (bswh2 == null) {
                bswh2 = bswh.f147430g;
            }
            evi.m11184a(fgt2, fadeInImageView2, z2, bswh2);
            View view = this.f15955x;
            bsxn bsxn = bsxv.f147631g;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            eww eww = this.f15950s;
            evi.m11175a(view, bsxn, eww.f15935g, adyg.m51399a(eww.f15937i, (int) C0126R.attr.asRipple, (int) C0126R.C0127drawable.as_ripple_light));
        }
    }
}
