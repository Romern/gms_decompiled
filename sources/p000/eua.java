package p000;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: eua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eua extends ete {
    public eua(bsut bsut, LinearLayout linearLayout, evl evl, fgt fgt) {
        super(bsut, linearLayout, evl, fgt);
    }

    /* renamed from: a */
    public static final void m11133a(TextView textView, boolean z) {
        if (!z) {
            textView.setGravity(8388611);
            textView.setTextAlignment(2);
            return;
        }
        textView.setGravity(17);
        textView.setTextAlignment(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10500a() {
        return C0126R.C0128layout.as_card_carousel_block;
    }

    /* renamed from: a */
    public static final boolean m11134a(bsvj bsvj) {
        return (bsvj.f147279a & 2) == 0 && bsvj.f147282d.size() == 0 && bsvj.f147283e.size() == 0 && (bsvj.f147279a & 4) == 0 && bsvj.f147288j.size() == 0;
    }
}
