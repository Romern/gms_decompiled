package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: adyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyg {

    /* renamed from: a */
    private static final bnhe f62901a;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(0, Integer.valueOf(m51397a(0.0f)));
        h.mo67695b(1, Integer.valueOf(m51397a(0.04f)));
        h.mo67695b(2, Integer.valueOf(m51397a(0.06f)));
        h.mo67695b(3, Integer.valueOf(m51397a(0.08f)));
        h.mo67695b(4, Integer.valueOf(m51397a(0.1f)));
        h.mo67695b(5, Integer.valueOf(m51397a(0.12f)));
        f62901a = h.mo67618b();
    }

    /* renamed from: a */
    private static final int m51397a(float f) {
        return (int) ((f * 255.0f) + 0.5f);
    }

    /* renamed from: b */
    public static int m51404b(int i) {
        return Color.argb(((Integer) f62901a.get(Integer.valueOf(i - 1))).intValue(), 255, 255, 255);
    }

    /* renamed from: a */
    public static int m51398a(int i, bmzi bmzi) {
        return adyf.m51386a(bmzi) ? C1165lm.m19351a(m51404b(3), i) : i;
    }

    /* renamed from: a */
    public static int m51399a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        return (theme == null || !theme.resolveAttribute(i, typedValue, true)) ? i2 : typedValue.resourceId;
    }

    /* renamed from: b */
    public static int m51405b(Context context, int i, int i2) {
        return C1133kh.m17843b(context, m51399a(context, i, i2));
    }

    /* renamed from: a */
    public static ColorStateList m51400a(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    /* renamed from: a */
    public static Drawable m51401a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            throw new Resources.NotFoundException(String.format(Locale.ROOT, "Attribute not defined by theme (attr = %d)", Integer.valueOf(i)));
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            return new ColorDrawable(typedValue.data);
        } else {
            if (typedValue.type == 3) {
                try {
                    return C1163lk.m19268a(context.getResources(), typedValue.resourceId, context.getTheme());
                } catch (Resources.NotFoundException e) {
                    throw new UnsupportedOperationException(String.format(Locale.ROOT, "Type of attribute is not a reference to a drawable (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()), e);
                }
            } else {
                throw new UnsupportedOperationException(String.format(Locale.ROOT, "Type of attribute is not a color or a reference to a drawable (attr = %d, value = %s)", Integer.valueOf(i), typedValue.coerceToString()));
            }
        }
    }

    /* renamed from: a */
    public static void m51402a(View view, int i, bmzi bmzi) {
        if (adyf.m51386a(bmzi)) {
            Drawable background = view.getBackground();
            ColorDrawable colorDrawable = new ColorDrawable(m51404b(i));
            view.setBackground(new LayerDrawable(background != null ? new Drawable[]{background, colorDrawable} : new Drawable[]{colorDrawable}));
        }
    }

    /* renamed from: a */
    public static void m51403a(SwipeRefreshLayout swipeRefreshLayout, bmzi bmzi, int i) {
        int b = m51405b(swipeRefreshLayout.getContext(), i, C0126R.color.google_white);
        if (adyf.m51386a(bmzi)) {
            swipeRefreshLayout.mo2092a(C0126R.color.google_white);
            b = C1165lm.m19351a(Color.argb(((Integer) f62901a.get(3)).intValue(), 255, 255, 255), b);
        } else {
            swipeRefreshLayout.mo2095b(swipeRefreshLayout.getResources().getIntArray(C0126R.array.material_google_colors));
        }
        swipeRefreshLayout.mo2088a(b);
    }
}
