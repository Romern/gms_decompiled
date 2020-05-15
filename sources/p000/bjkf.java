package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkf {
    /* renamed from: a */
    public static ColorStateList m103765a(bjkk bjkk, bjka bjka) {
        if (bjka.mo65327a(12, bjkk.f122860e)) {
            return ColorStateList.valueOf(bjka.mo65330c(12, bjkk.f122860e));
        }
        Context context = bjkk.f122857b;
        int i = Build.VERSION.SDK_INT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{16843820});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        if (color == 0) {
            color = C1133kh.m17843b(context, C0126R.color.wallet_selectable_item_highlight_light);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: a */
    protected static bhlr m103766a(Drawable drawable, int i) {
        if (drawable instanceof bhlr) {
            return (bhlr) drawable;
        }
        int i2 = Build.VERSION.SDK_INT;
        return (bhlr) ((RippleDrawable) drawable).getDrawable(i);
    }
}
