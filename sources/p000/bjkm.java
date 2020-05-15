package p000;

import android.content.res.ColorStateList;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bjkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkm {
    /* renamed from: a */
    public static void m103781a(bjkk bjkk, TextInputLayout textInputLayout) {
        bjkp.m103790a(bjkk, textInputLayout);
        bjjz bjjz = bjkk.f122859d;
        EditText editText = textInputLayout.f151297a;
        if (editText != null) {
            bjkn.m103784a(bjkk, bjjz.mo65320b(), editText);
            bjka a = bjjz.mo65318a().mo65323a(8);
            if (a != null) {
                bjkn.m103788c(bjkk, a, editText);
            }
        }
        bjka a2 = bjjz.mo65318a();
        bjka a3 = a2.mo65323a(9);
        if (a3 != null) {
            if (bjkk.mo65338a(a3, 3) && a3.mo65327a(3, bjkk.f122860e)) {
                textInputLayout.mo71263b(ColorStateList.valueOf(a3.mo65330c(3, bjkk.f122860e)));
            }
        }
        if (bjkk.mo65338a(a2, 12) && a2.mo65327a(12, bjkk.f122860e)) {
            int c = a2.mo65330c(12, bjkk.f122860e);
            if (textInputLayout.f151343q != c) {
                textInputLayout.f151343q = c;
                textInputLayout.mo71291h();
            }
            textInputLayout.mo71252a(ColorStateList.valueOf(c));
        }
        bjka a4 = a2.mo65323a(10);
        if (a4 != null && a4.mo65327a(3, bjkk.f122860e)) {
            if (bjkk.mo65338a(a4, 3)) {
                ColorStateList colorStateList = textInputLayout.f151342p;
                ColorStateList valueOf = ColorStateList.valueOf(a4.mo65330c(3, bjkk.f122860e));
                textInputLayout.f151341o = valueOf;
                textInputLayout.f151342p = valueOf;
                if (textInputLayout.f151297a != null) {
                    textInputLayout.mo71260a(false);
                }
                textInputLayout.mo71252a(colorStateList);
            }
        }
        if (bjkk.mo65338a(a2, 2) && a2.mo65327a(2, bjkk.f122860e)) {
            float a5 = (float) bjkl.m103778a(a2, 2, bjkk.f122860e);
            int i = textInputLayout.f151337k;
            if (i == 1) {
                textInputLayout.mo71250a(a5, a5, 0.0f, 0.0f);
            } else if (i == 2) {
                textInputLayout.mo71250a(a5, a5, a5, a5);
            }
        }
    }
}
