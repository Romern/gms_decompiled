package p000;

import android.os.Build;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import java.util.Set;

/* renamed from: eum */
final /* synthetic */ class eum implements eti {

    /* renamed from: a */
    private final euq f15760a;

    /* renamed from: b */
    private final Set f15761b;

    /* renamed from: c */
    private final bsxh f15762c;

    public eum(euq euq, Set set, bsxh bsxh) {
        this.f15760a = euq;
        this.f15761b = set;
        this.f15762c = bsxh;
    }

    public void onClick(View view) {
        bsxf bsxf;
        bsxf bsxf2;
        euq euq = this.f15760a;
        Set set = this.f15761b;
        bsxh bsxh = this.f15762c;
        set.remove(view);
        int d = euq.mo323d();
        if (((ewj) euq.f15779v.f15934f.get(d)).mo10503a() == 4) {
            bsvd bsvd = ((eul) euq.f15779v.f15934f.get(d)).f15759a;
            bxvd bxvd = (bxvd) bsvd.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bsvd);
            bsvd bsvd2 = (bsvd) bxvd.mo74062i();
            if (bsvd2.f147232a == 2) {
                bsxf = (bsxf) bsvd2.f147233b;
            } else {
                bsxf = bsxf.f147542b;
            }
            bxvd bxvd2 = (bxvd) bsxf.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bsxf);
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bsxf bsxf3 = bsxf.f147542b;
            ((bsxf) bxvd2.f164949b).f147544a = GeneratedMessageLite.m124030de();
            if (bsvd2.f147232a == 2) {
                bsxf2 = (bsxf) bsvd2.f147233b;
            } else {
                bsxf2 = bsxf.f147542b;
            }
            bxwc bxwc = bsxf2.f147544a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bsxh bsxh2 = (bsxh) bxwc.get(i);
                if (!bsxh2.equals(bsxh)) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bsxf bsxf4 = (bsxf) bxvd2.f164949b;
                    bsxh2.getClass();
                    bsxf4.mo70718a();
                    bsxf4.f147544a.add(bsxh2);
                }
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsvd bsvd3 = (bsvd) bxvd.f164949b;
            bsxf bsxf5 = (bsxf) bxvd2.mo74062i();
            bsvd bsvd4 = bsvd.f147230c;
            bsxf5.getClass();
            bsvd3.f147233b = bsxf5;
            bsvd3.f147232a = 2;
        }
        int dimensionPixelSize = euq.f15778u.getDimensionPixelSize(C0126R.dimen.as_card_deck_vertical_padding);
        int height = view.getHeight();
        C1285px m = C1280ps.m19931m(view);
        float f = (float) (-(height + dimensionPixelSize));
        View view2 = (View) m.f26845a.get();
        if (view2 != null) {
            view2.animate().translationYBy(f);
        }
        m.mo15708a(0.0f);
        eun eun = new eun(euq, view, set, bsxh);
        View view3 = (View) m.f26845a.get();
        if (view3 != null) {
            int i2 = Build.VERSION.SDK_INT;
            view3.animate().withEndAction(eun);
        }
    }
}
