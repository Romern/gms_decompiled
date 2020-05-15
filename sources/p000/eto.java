package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.chip.Chip;

/* renamed from: eto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eto extends ewo {

    /* renamed from: s */
    public final Chip f15681s;

    /* renamed from: t */
    final /* synthetic */ etu f15682t;

    /* renamed from: u */
    private final fgt f15683u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eto(etu etu, View view, fgt fgt) {
        super(view);
        this.f15682t = etu;
        this.f15681s = (Chip) view.findViewById(C0126R.C0129id.action_chip);
        this.f15683u = fgt;
    }

    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        Drawable drawable;
        if (ewj.mo10503a() == 5) {
            bsui bsui = ((etl) ewj).f15676a;
            this.f15681s.setText(bsui.f147131b);
            int b = adyg.m51405b(this.f15682t.f15937i, C0126R.attr.colorPrimaryGoogle, C0126R.color.google_blue600);
            if ((bsui.f147130a & 2) != 0) {
                bswh bswh = bsui.f147132c;
                if (bswh == null) {
                    bswh = bswh.f147430g;
                }
                bswg a = bswg.m116252a(bswh.f147433b);
                if (!(a == null || eve.m11166a(this.f15682t.f15937i, a) == 0)) {
                    if (cbro.m128200d()) {
                        drawable = eve.m11168b(this.f15682t.f15937i, a).mutate();
                    } else {
                        Context context = this.f15682t.f15937i;
                        drawable = C1133kh.m17836a(context, eve.m11166a(context, a)).mutate();
                    }
                    this.f15681s.mo71076a(drawable);
                    Chip chip = this.f15681s;
                    ColorStateList a2 = adyg.m51400a(b);
                    bhgf bhgf = chip.f151140b;
                    if (bhgf != null) {
                        bhgf.mo63704b(a2);
                    }
                }
                bswh bswh2 = bsui.f147132c;
                if (bswh2 == null) {
                    bswh2 = bswh.f147430g;
                }
                if ((bswh2.f147432a & 2) != 0) {
                    fgt fgt = this.f15683u;
                    bswh bswh3 = bsui.f147132c;
                    if (bswh3 == null) {
                        bswh3 = bswh.f147430g;
                    }
                    fgt.mo10805a(bswh3.f147434c, new etm(this, b));
                }
            }
            this.f15681s.setOnClickListener(new etn(this, bsui));
        }
    }
}
