package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: aepe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aepe {

    /* renamed from: a */
    public final Intent f63586a;

    public aepe(String str) {
        Intent intent = new Intent(str);
        this.f63586a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo34414a(Activity activity) {
        Resources.Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(16843827, typedValue, true) && !this.f63586a.hasExtra("primary_color")) {
            this.f63586a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(16843828, typedValue2, true) && !this.f63586a.hasExtra("primary_color_dark")) {
            this.f63586a.putExtra("primary_color_dark", typedValue2.data);
        }
        rfi rfi = rfi.f42868a;
        rfy.m33555l(activity);
        return this.f63586a;
    }
}
