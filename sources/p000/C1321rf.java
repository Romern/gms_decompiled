package p000;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.CompoundButton;

/* renamed from: rf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1321rf {
    /* renamed from: a */
    public static ColorStateList m20064a(CompoundButton compoundButton) {
        int i = Build.VERSION.SDK_INT;
        return compoundButton.getButtonTintList();
    }

    /* renamed from: a */
    public static void m20065a(CompoundButton compoundButton, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        compoundButton.setButtonTintList(colorStateList);
    }
}
