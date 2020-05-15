package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhon implements bhpm {

    /* renamed from: a */
    final /* synthetic */ bhou f119200a;

    public bhon(bhou bhou) {
        this.f119200a = bhou;
    }

    /* renamed from: a */
    public final void mo64076a(TextInputLayout textInputLayout) {
        AutoCompleteTextView a = this.f119200a.mo64096a(textInputLayout.f151297a);
        bhou bhou = this.f119200a;
        int i = bhou.f119220k.f151337k;
        if (i == 2) {
            a.setDropDownBackgroundDrawable(bhou.f119215g);
        } else if (i == 1) {
            a.setDropDownBackgroundDrawable(bhou.f119214f);
        }
        bhou bhou2 = this.f119200a;
        if (a.getKeyListener() == null) {
            TextInputLayout textInputLayout2 = bhou2.f119220k;
            int i2 = textInputLayout2.f151337k;
            if (i2 == 1 || i2 == 2) {
                bhlr bhlr = textInputLayout2.f151336j;
                int a2 = bhkx.m101073a(a, (int) C0126R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{16842919}, new int[0]};
                if (i2 != 2) {
                    int i3 = bhou2.f119220k.f151338l;
                    C1280ps.m19890a(a, new RippleDrawable(new ColorStateList(iArr, new int[]{bhgk.m100859a(a2, i3, 0.1f), i3}), bhlr, bhlr));
                } else {
                    int a3 = bhkx.m101073a(a, (int) C0126R.attr.colorSurface);
                    bhlr bhlr2 = new bhlr(bhlr.mo63954h());
                    int a4 = bhgk.m100859a(a2, a3, 0.1f);
                    bhlr2.mo63948c(new ColorStateList(iArr, new int[]{a4, 0}));
                    bhlr2.setTint(a3);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a4, a3});
                    bhlr bhlr3 = new bhlr(bhlr.mo63954h());
                    bhlr3.setTint(-1);
                    C1280ps.m19890a(a, new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, bhlr2, bhlr3), bhlr}));
                }
            } else {
                throw new IllegalStateException();
            }
        }
        bhou bhou3 = this.f119200a;
        a.setOnTouchListener(new bhop(bhou3, a));
        a.setOnFocusChangeListener(new bhoq(bhou3));
        a.setOnDismissListener(new bhor(bhou3));
        a.setThreshold(0);
        a.removeTextChangedListener(this.f119200a.f119209a);
        a.addTextChangedListener(this.f119200a.f119209a);
        textInputLayout.mo71254a((Drawable) null);
        textInputLayout.mo71257a(this.f119200a.f119210b);
        textInputLayout.mo71285e(true);
    }
}
