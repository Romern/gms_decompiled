package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: euu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class euu extends ewo {

    /* renamed from: s */
    public final View f15784s;

    /* renamed from: t */
    public final int f15785t;

    /* renamed from: u */
    final /* synthetic */ euz f15786u;

    /* renamed from: v */
    private final FadeInImageView f15787v;

    /* renamed from: w */
    private final TextView f15788w;

    /* renamed from: x */
    private final TextView f15789x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public euu(euz euz, View view) {
        super(view);
        this.f15786u = euz;
        this.f15784s = view;
        this.f15787v = (FadeInImageView) view.findViewById(C0126R.C0129id.intro_image);
        this.f15788w = (TextView) view.findViewById(C0126R.C0129id.intro_title);
        this.f15789x = (TextView) view.findViewById(C0126R.C0129id.intro_description);
        this.f15785t = euz.f15937i.getResources().getDimensionPixelSize(C0126R.dimen.as_screen_intro_max_width);
        euz.m11156a(this.f15784s, 1);
    }

    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        if (ewj.mo10503a() == 2) {
            if (mo323d() == this.f15786u.mo161a() - 1) {
                euz.m11156a(this.f15784s, 2);
            }
            bsxp bsxp = ((eur) ewj).f15780a;
            fgt fgt = this.f15786u.f15938j;
            FadeInImageView fadeInImageView = this.f15787v;
            boolean z = true;
            int i = bsxp.f147597a & 1;
            bswh bswh = bsxp.f147598b;
            if (bswh == null) {
                bswh = bswh.f147430g;
            }
            int width = this.f15784s.getWidth();
            if (i == 0) {
                z = false;
            }
            evi.m11185a(fgt, fadeInImageView, z, bswh, width);
            evi.m11180a(this.f15788w, bsxp.f147599c);
            evi.m11180a(this.f15789x, bsxp.f147600d);
            TextView textView = this.f15789x;
            String str = bsxp.f147601e;
            bsxn bsxn = bsxp.f147602f;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            evi.m11181a(textView, str, bsxn, this.f15786u.f15935g);
            this.f15784s.addOnLayoutChangeListener(new eut(this));
        }
    }
}
