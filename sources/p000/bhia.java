package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhia extends C1349sg {

    /* renamed from: a */
    public Drawable f118696a;

    /* renamed from: b */
    private final Rect f118697b;

    public bhia(Context context) {
        this(context, 0);
    }

    /* renamed from: a */
    private static int m100912a(Context context) {
        TypedValue a = bhkx.m101074a(context, (int) C0126R.attr.materialAlertDialogTheme);
        if (a != null) {
            return a.data;
        }
        return 0;
    }

    /* renamed from: b */
    public final C1350sh mo15904b() {
        C1350sh b = super.mo15904b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f118696a;
        if (drawable instanceof bhlr) {
            ((bhlr) drawable).mo63949d(C1280ps.m19933o(decorView));
        }
        Drawable drawable2 = this.f118696a;
        Rect rect = this.f118697b;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new bhhz(b, this.f118697b));
        return b;
    }

    /* renamed from: c */
    public final void mo63781c(int i, DialogInterface.OnClickListener onClickListener) {
        super.mo15892a(i, onClickListener);
    }

    /* renamed from: d */
    public final void mo63785d() {
        super.mo15911c((int) C0126R.C0128layout.pwm_save_edits_info_dialog);
    }

    /* renamed from: e */
    public final void mo63790e(int i) {
        super.mo15912d(i);
    }

    /* renamed from: f */
    public final void mo63791f(int i) {
        super.mo15905b(i);
    }

    /* renamed from: c */
    public final void mo63782c(View view) {
        super.mo15897a(view);
    }

    /* renamed from: d */
    public final void mo63786d(int i, DialogInterface.OnClickListener onClickListener) {
        super.mo15906b(i, onClickListener);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bhia(Context context, int i) {
        super(r0 != 0 ? new C1416ut(r4, r0) : r4, i == 0 ? m100912a(context) : i);
        int i2;
        int a = m100912a(context);
        Context a2 = bhpq.m101285a(context, null, C0126R.attr.alertDialogStyle, 2132017858);
        Context a3 = mo15890a();
        Resources.Theme theme = a3.getTheme();
        TypedArray a4 = bhki.m101052a(a3, null, bhib.f118698a, C0126R.attr.alertDialogStyle, 2132017858, new int[0]);
        int dimensionPixelSize = a4.getDimensionPixelSize(2, a3.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = a4.getDimensionPixelSize(3, a3.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = a4.getDimensionPixelSize(1, a3.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = a4.getDimensionPixelSize(0, a3.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_alert_dialog_background_inset_bottom));
        a4.recycle();
        int i3 = Build.VERSION.SDK_INT;
        int layoutDirection = a3.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection != 1) {
            i2 = dimensionPixelSize3;
        } else {
            i2 = dimensionPixelSize;
        }
        this.f118697b = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, i2, dimensionPixelSize4);
        int a5 = bhgk.m100861a(a3, getClass().getCanonicalName());
        bhlr bhlr = new bhlr(a3, null, C0126R.attr.alertDialogStyle, 2132017858);
        bhlr.mo63942a(a3);
        bhlr.mo63948c(ColorStateList.valueOf(a5));
        int i4 = Build.VERSION.SDK_INT;
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(16844145, typedValue, true);
        float dimension = typedValue.getDimension(mo15890a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            bhlr.mo63945b(dimension);
        }
        this.f118696a = bhlr;
    }

    /* renamed from: c */
    public final void mo63783c(CharSequence charSequence) {
        super.mo15900a(charSequence);
    }

    /* renamed from: d */
    public final void mo63787d(View view) {
        super.mo15907b(view);
    }

    /* renamed from: c */
    public final void mo63784c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.mo15901a(charSequence, onClickListener);
    }

    /* renamed from: d */
    public final void mo63788d(CharSequence charSequence) {
        super.mo15908b(charSequence);
    }

    /* renamed from: b */
    public final void mo63778b(DialogInterface.OnCancelListener onCancelListener) {
        super.mo15893a(onCancelListener);
    }

    /* renamed from: d */
    public final void mo63789d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.mo15909b(charSequence, onClickListener);
    }

    /* renamed from: b */
    public final void mo63779b(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        super.mo15899a(listAdapter, onClickListener);
    }

    /* renamed from: b */
    public final void mo63780b(boolean z) {
        super.mo15902a(z);
    }
}
