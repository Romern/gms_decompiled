package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzq {
    /* renamed from: a */
    public static View m12805a(Context context, String str, boolean z, boolean z2) {
        return m12806a(context, str, z, z2, 5000, null);
    }

    /* renamed from: b */
    public static void m12809b(Context context, View view) {
        if (view.getParent() != null) {
            ((WindowManager) context.getApplicationContext().getSystemService("window")).removeView(view);
        }
    }

    /* renamed from: a */
    public static View m12806a(Context context, String str, boolean z, boolean z2, long j, fwl fwl) {
        int i;
        int i2;
        int i3;
        if (!((AccessibilityManager) context.getSystemService("accessibility")).isEnabled()) {
            int i4 = Build.VERSION.SDK_INT;
            if (Settings.canDrawOverlays(context)) {
                Context applicationContext = context.getApplicationContext();
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                View inflate = LayoutInflater.from(applicationContext).inflate((int) C0126R.C0128layout.appinvite_message, (ViewGroup) null);
                if (j > 0) {
                    inflate.postDelayed(new fzo(inflate, windowManager, fwl), j);
                }
                TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.message);
                textView.setText(str);
                TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.dismiss);
                textView2.setOnClickListener(new fzp(inflate, windowManager, fwl));
                if (z2) {
                    int i5 = Build.VERSION.SDK_INT;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds((int) C0126R.C0127drawable.quantum_ic_warning_white_24, 0, 0, 0);
                    i2 = C0126R.color.appinvite_error_message_background;
                    i = C0126R.color.appinvite_error_message_text;
                    i3 = C0126R.color.appinvite_error_message_dismiss;
                } else {
                    i2 = C0126R.color.appinvite_message_background;
                    i = C0126R.color.appinvite_message_text;
                    i3 = C0126R.color.appinvite_message_dismiss;
                }
                View findViewById = inflate.findViewById(C0126R.C0129id.content);
                Resources resources = applicationContext.getResources();
                if (z) {
                    findViewById.setBackgroundResource(C0126R.C0127drawable.appinvite_contextual_selection_sms_warning_background);
                } else {
                    inflate.setPadding(0, 0, 0, 0);
                    findViewById.setBackgroundColor(resources.getColor(i2));
                }
                textView.setTextColor(resources.getColor(i));
                textView2.setTextColor(resources.getColor(i3));
                m12807a(context, inflate);
                return inflate;
            }
        }
        Toast.makeText(context, str, 1).show();
        return null;
    }

    /* renamed from: a */
    public static void m12807a(Context context, View view) {
        int i;
        if (view.getParent() == null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            int i2 = Build.VERSION.SDK_INT;
            if (!accessibilityManager.isEnabled()) {
                i = 8;
            } else {
                i = 32;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2038, i, -3);
            layoutParams.gravity = 80;
            ((WindowManager) context.getApplicationContext().getSystemService("window")).addView(view, layoutParams);
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(64);
                obtain.setClassName(view.getContext().getClass().getName());
                obtain.setPackageName(view.getContext().getPackageName());
                view.dispatchPopulateAccessibilityEvent(obtain);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    /* renamed from: a */
    public static void m12808a(View view, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        view.announceForAccessibility(charSequence);
    }
}
