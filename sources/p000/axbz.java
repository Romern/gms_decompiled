package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;

/* renamed from: axbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axbz extends axca {

    /* renamed from: u */
    private static final int[] f95746u = {C0126R.attr.internalUicNonFormFieldTextTopBottomMargin};

    /* renamed from: s */
    final ArrayList f95747s = new ArrayList();

    /* renamed from: v */
    private final int f95748v;

    protected axbz(ViewGroup viewGroup) {
        super(viewGroup);
        TypedArray obtainStyledAttributes = mo53005v().obtainStyledAttributes(f95746u);
        this.f95748v = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static axbz m82266a(Context context) {
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new axbz(flexboxLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo53004b(bwig bwig, bkgd bkgd) {
        int size = this.f95747s.size();
        int size2 = bwig.f159630d.size();
        int i = 0;
        if (size < size2) {
            this.f95747s.ensureCapacity(size2);
            while (i < size) {
                m82267a((bkbn) this.f95747s.get(i), (bmdb) bwig.f159630d.get(i), bkgd);
                i++;
            }
            while (size < size2) {
                m82268a((bmdb) bwig.f159630d.get(size), bkgd);
                size++;
            }
            return true;
        }
        while (i < size2) {
            m82267a((bkbn) this.f95747s.get(i), (bmdb) bwig.f159630d.get(i), bkgd);
            i++;
        }
        for (int i2 = size - 1; i2 >= size2; i2--) {
            bkbn bkbn = (bkbn) this.f95747s.get(i2);
            bjwl.m104790b(bkbn.mo52710b(), bkbn.mo65788c().f128770b, bkgd.f124186a);
            ((axca) this).f95749t.removeView(bkbn.mo52710b());
            this.f95747s.remove(i2);
        }
        return true;
    }

    /* renamed from: a */
    private static void m82267a(bkbn bkbn, bmdb bmdb, bkgd bkgd) {
        bjwl.m104790b(bkbn.mo52710b(), bkbn.mo65788c().f128770b, bkgd.f124186a);
        bkbn.mo52707a(bmdb);
        bjwl.m104784a(bkbn.mo52710b(), bmdb.f128770b, bkgd.f124186a);
    }

    /* renamed from: a */
    private final void m82268a(bmdb bmdb, bkgd bkgd) {
        Context v = mo53005v();
        bjwk bjwk = bkgd.f124186a;
        LogContext logContext = bkgd.f124190e;
        LayoutInflater w = mo53006w();
        ViewGroup viewGroup = ((axca) this).f95749t;
        int i = this.f95748v;
        this.f95747s.add(bkbs.m105282a(bmdb, 8, v, bjwk, logContext, w, viewGroup, i, i, -1, false, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53001a(bkgd bkgd) {
        super.mo53001a(bkgd);
        this.f95747s.clear();
    }

    /* renamed from: a */
    public final void mo53002a(bkgd bkgd, boolean z) {
        int size = this.f95747s.size();
        for (int i = 0; i < size; i++) {
            ((bkbn) this.f95747s.get(i)).mo52710b().setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53003a(bwig bwig, bkgd bkgd) {
        this.f95747s.ensureCapacity(bwig.f159630d.size());
        bxwc bxwc = bwig.f159630d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            m82268a((bmdb) bxwc.get(i), bkgd);
        }
    }
}
