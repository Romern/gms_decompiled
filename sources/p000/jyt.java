package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: jyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jyt implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ View f23547a;

    /* renamed from: b */
    final /* synthetic */ MinuteMaidChimeraActivity f23548b;

    public jyt(MinuteMaidChimeraActivity minuteMaidChimeraActivity, View view) {
        this.f23548b = minuteMaidChimeraActivity;
        this.f23547a = view;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ViewGroup viewGroup = this.f23548b.f11562r;
        if (viewGroup != null) {
            viewGroup.dispatchApplyWindowInsets(windowInsets);
        }
        this.f23547a.dispatchApplyWindowInsets(windowInsets);
        return windowInsets.consumeStableInsets().consumeSystemWindowInsets();
    }
}
