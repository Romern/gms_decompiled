package p000;

import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: ews */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ews extends ewo {

    /* renamed from: s */
    final /* synthetic */ eww f15943s;

    /* renamed from: t */
    private final TextView f15944t;

    /* renamed from: u */
    private final FadeInImageView f15945u;

    /* renamed from: v */
    private final FadeInImageView f15946v;

    /* renamed from: w */
    private final View f15947w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ews(eww eww, View view) {
        super(view);
        this.f15943s = eww;
        this.f15947w = view;
        this.f15944t = (TextView) view.findViewById(C0126R.C0129id.title);
        this.f15945u = (FadeInImageView) view.findViewById(C0126R.C0129id.image);
        this.f15946v = (FadeInImageView) view.findViewById(C0126R.C0129id.icon);
    }

    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        boolean z;
        if (ewj.mo10503a() == 7) {
            bswf bswf = ((ewt) ewj).f15948a;
            bswe bswe = bswf.f147392c;
            if (bswe == null) {
                bswe = bswe.f147383c;
            }
            if (!stm.m36302d(bswe.f147385a)) {
                bswe bswe2 = bswf.f147392c;
                if (bswe2 == null) {
                    bswe2 = bswe.f147383c;
                }
                String str = bswe2.f147385a;
                bswe bswe3 = bswf.f147392c;
                if (bswe3 == null) {
                    bswe3 = bswe.f147383c;
                }
                evi.m11180a(this.f15944t, str.replace(bswe3.f147386b, this.f15943s.f15957d));
            }
            fgt fgt = this.f15943s.f15938j;
            FadeInImageView fadeInImageView = this.f15945u;
            boolean z2 = true;
            int i = bswf.f147390a & 1;
            bswh bswh = bswf.f147391b;
            if (bswh == null) {
                bswh = bswh.f147430g;
            }
            if (i == 0) {
                z = false;
            } else {
                z = true;
            }
            evi.m11184a(fgt, fadeInImageView, z, bswh);
            fgt fgt2 = this.f15943s.f15938j;
            FadeInImageView fadeInImageView2 = this.f15946v;
            if ((bswf.f147390a & 4) == 0) {
                z2 = false;
            }
            bswh bswh2 = bswf.f147393d;
            if (bswh2 == null) {
                bswh2 = bswh.f147430g;
            }
            evi.m11184a(fgt2, fadeInImageView2, z2, bswh2);
            evi.m11175a(this.f15947w, epr.f15494a, new ewr(this, bswf), adyg.m51399a(this.f15943s.f15937i, (int) C0126R.attr.asRipple, (int) C0126R.C0127drawable.as_ripple_light));
        }
    }
}
