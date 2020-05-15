package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;

/* renamed from: ets */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ets extends ewo {

    /* renamed from: s */
    public final MaterialButton f15687s;

    /* renamed from: t */
    final /* synthetic */ ett f15688t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ets(ett ett, View view) {
        super(view);
        this.f15688t = ett;
        this.f15687s = (MaterialButton) view.findViewById(C0126R.C0129id.action_button);
    }

    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        Drawable drawable;
        if (ewj.mo10503a() == 5) {
            bsui bsui = ((etp) ewj).f15684a;
            this.f15687s.setText(bsui.f147131b);
            if ((bsui.f147130a & 2) != 0) {
                bswh bswh = bsui.f147132c;
                if (bswh == null) {
                    bswh = bswh.f147430g;
                }
                bswg a = bswg.m116252a(bswh.f147433b);
                if (!(a == null || eve.m11166a(this.f15688t.f15937i, a) == 0)) {
                    if (cbro.m128200d()) {
                        drawable = eve.m11168b(this.f15688t.f15937i, a);
                    } else {
                        Context context = this.f15688t.f15937i;
                        drawable = C1133kh.m17836a(context, eve.m11166a(context, a));
                    }
                    this.f15687s.mo71044b(drawable);
                    C1280ps.m19885a(this.f15687s, this.f15688t.f15937i.getResources().getDimensionPixelSize(C0126R.dimen.as_action_chip_icon_left_padding), this.f15687s.getPaddingTop(), this.f15687s.getPaddingRight(), this.f15687s.getPaddingBottom());
                }
                bswh bswh2 = bsui.f147132c;
                if (bswh2 == null) {
                    bswh2 = bswh.f147430g;
                }
                if ((bswh2.f147432a & 2) != 0) {
                    fgt fgt = this.f15688t.f15938j;
                    bswh bswh3 = bsui.f147132c;
                    if (bswh3 == null) {
                        bswh3 = bswh.f147430g;
                    }
                    fgt.mo10805a(bswh3.f147434c, new etq(this));
                }
            }
            MaterialButton materialButton = this.f15687s;
            bsxn bsxn = bsui.f147133d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            evi.m11174a(materialButton, bsxn, this.f15688t.f15935g);
            if ((bsui.f147130a & 4) == 0) {
                this.f15687s.setOnClickListener(new etr(this));
            }
        }
    }
}
