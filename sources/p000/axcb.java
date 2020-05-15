package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;

/* renamed from: axcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcb extends axca {

    /* renamed from: s */
    final ArrayList f95750s = new ArrayList();

    public axcb(LinearLayout linearLayout) {
        super(linearLayout);
    }

    /* renamed from: a */
    private final void m82279a(bmnr bmnr, LayoutInflater layoutInflater) {
        this.f95750s.add(awgp.m79905a((bjwk) null, bmnr, layoutInflater, (bjxu) null, ((axca) this).f95749t, 0, 0, -1));
    }

    /* renamed from: c */
    private final void m82280c(int i) {
        int i2 = -1;
        int i3 = i - 1;
        if (i3 == 1) {
            i2 = 8388627;
        } else if (i3 == 2) {
            i2 = 8388629;
        }
        int size = this.f95750s.size();
        for (int i4 = 0; i4 < size; i4++) {
            InfoMessageView infoMessageView = (InfoMessageView) this.f95750s.get(i4);
            if (infoMessageView.f152092p != i2) {
                infoMessageView.f152092p = i2;
                if (infoMessageView.f152083g != null) {
                    infoMessageView.mo72005b();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo53004b(bwig bwig, bkgd bkgd) {
        int size = this.f95750s.size();
        int size2 = bwig.f159628b.size();
        int i = 0;
        if (size < size2) {
            LayoutInflater w = mo53006w();
            this.f95750s.ensureCapacity(size2);
            while (i < size) {
                ((InfoMessageView) this.f95750s.get(i)).mo72003a((bmnr) bwig.f159628b.get(i));
                i++;
            }
            while (size < size2) {
                m82279a((bmnr) bwig.f159628b.get(size), w);
                size++;
            }
        } else {
            while (i < size2) {
                ((InfoMessageView) this.f95750s.get(i)).mo72003a((bmnr) bwig.f159628b.get(i));
                i++;
            }
            for (int i2 = size - 1; i2 >= size2; i2--) {
                ((axca) this).f95749t.removeView((View) this.f95750s.get(i2));
                this.f95750s.remove(i2);
            }
        }
        int a = bwif.m121986a(bwig.f159633g);
        if (a == 0) {
            a = 1;
        }
        m82280c(a);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53001a(bkgd bkgd) {
        super.mo53001a(bkgd);
        this.f95750s.clear();
    }

    /* renamed from: a */
    public final void mo53002a(bkgd bkgd, boolean z) {
        int size = this.f95750s.size();
        for (int i = 0; i < size; i++) {
            ((InfoMessageView) this.f95750s.get(i)).setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53003a(bwig bwig, bkgd bkgd) {
        LayoutInflater w = mo53006w();
        this.f95750s.ensureCapacity(bwig.f159628b.size());
        bxwc bxwc = bwig.f159628b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            m82279a((bmnr) bxwc.get(i), w);
        }
        int a = bwif.m121986a(bwig.f159633g);
        if (a == 0) {
            a = 1;
        }
        m82280c(a);
    }
}
