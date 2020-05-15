package p000;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: ub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1398ub implements TransformationMethod {

    /* renamed from: a */
    private final Locale f27239a;

    public C1398ub(Context context) {
        this.f27239a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f27239a);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
