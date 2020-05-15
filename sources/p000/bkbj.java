package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;

/* renamed from: bkbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkbj {

    /* renamed from: a */
    public final Context f123944a;

    /* renamed from: b */
    private final C1349sg f123945b;

    /* renamed from: c */
    private final AlertDialog.Builder f123946c;

    /* renamed from: d */
    private final boolean f123947d;

    public bkbj(Context context) {
        this(context, 0);
    }

    /* renamed from: b */
    private final void m105231b(CharSequence charSequence) {
        TextView j = bkfr.m105624j(this.f123944a);
        j.setText(charSequence);
        mo65779a(j);
    }

    /* renamed from: a */
    public final Dialog mo65776a() {
        Dialog dialog;
        AlertDialog.Builder builder = this.f123946c;
        if (builder == null) {
            dialog = this.f123945b.mo15904b();
        } else {
            dialog = builder.create();
        }
        if (this.f123947d) {
            TypedArray obtainStyledAttributes = this.f123944a.obtainStyledAttributes(new int[]{C0126R.attr.colorSurface});
            int color = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
            Drawable a = C1133kh.m17836a(this.f123944a, (int) C0126R.C0127drawable.wallet_uic_dialog_background_gm2);
            int i = Build.VERSION.SDK_INT;
            C1173lt.m19599a(a, color);
            dialog.getWindow().setBackgroundDrawable(a);
        }
        return dialog;
    }

    public bkbj(Context context, int i) {
        AlertDialog.Builder builder;
        int[] iArr = {C0126R.attr.uicDelegateToSupportLibAlertDialog, C0126R.attr.internalUicAlertDialogThemeOverlay, C0126R.attr.internalUicEnableAlertTooltipDialogGm2StyleOverrideGservices};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = true;
        boolean z2 = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.uicDelegateToSupportLibAlertDialog), true);
        int resourceId = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicAlertDialogThemeOverlay), -1);
        boolean z3 = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicEnableAlertTooltipDialogGm2StyleOverrideGservices), false);
        obtainStyledAttributes.recycle();
        z = ((!z3 && !((Boolean) bjwe.f123467B.mo54082a()).booleanValue()) || !bkfr.m105621h(context)) ? false : z;
        this.f123947d = z;
        if (z && resourceId != -1) {
            context = new C1416ut(context, resourceId);
        }
        if (!z2) {
            this.f123945b = null;
            if (i != 0) {
                builder = new AlertDialog.Builder(context, i);
            } else {
                builder = new AlertDialog.Builder(context);
            }
            this.f123946c = builder;
        } else {
            this.f123945b = i == 0 ? new C1349sg(context) : new C1349sg(context, i);
            this.f123946c = null;
        }
        this.f123944a = context;
    }

    /* renamed from: b */
    public final void mo65782b(int i, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setPositiveButton(i, onClickListener);
        } else {
            this.f123945b.mo15906b(i, onClickListener);
        }
    }

    /* renamed from: b */
    public final void mo65783b(View view) {
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setView(view);
        } else {
            this.f123945b.mo15907b(view);
        }
    }

    /* renamed from: b */
    public final void mo65784b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setPositiveButton(charSequence, onClickListener);
        } else {
            this.f123945b.mo15909b(charSequence, onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo65777a(int i) {
        if (this.f123947d) {
            m105231b(this.f123944a.getResources().getText(i));
            return;
        }
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setTitle(i);
        } else {
            this.f123945b.mo15905b(i);
        }
    }

    /* renamed from: a */
    public final void mo65778a(int i, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setNegativeButton(i, onClickListener);
        } else {
            this.f123945b.mo15892a(i, onClickListener);
        }
    }

    /* renamed from: a */
    public final void mo65779a(View view) {
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setCustomTitle(view);
        } else {
            this.f123945b.mo15897a(view);
        }
    }

    /* renamed from: a */
    public final void mo65780a(CharSequence charSequence) {
        if (!this.f123947d) {
            AlertDialog.Builder builder = this.f123946c;
            if (builder != null) {
                builder.setTitle(charSequence);
            } else {
                this.f123945b.mo15908b(charSequence);
            }
        } else {
            m105231b(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo65781a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.f123946c;
        if (builder != null) {
            builder.setNegativeButton(charSequence, onClickListener);
        } else {
            this.f123945b.mo15901a(charSequence, onClickListener);
        }
    }
}
