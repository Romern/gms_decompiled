package p000;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;

/* renamed from: nub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nub extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ nud f36494a;

    /* renamed from: b */
    private final View f36495b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nub(nud nud, Context context, View view) {
        super(context);
        this.f36494a = nud;
        setOrientation(1);
        View view2 = new View(context);
        this.f36495b = view2;
        view2.setBackgroundColor(-16777216);
        addView(this.f36495b, new LinearLayout.LayoutParams(-1, 0));
        addView(view, new LinearLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    private final void m27682a() {
        nud nud = this.f36494a;
        int i = nud.f36496h;
        boolean z = nud.f36501e;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets consumeStableInsets = super.onApplyWindowInsets(windowInsets).consumeStableInsets();
        int i = Build.VERSION.SDK_INT;
        WindowInsets consumeDisplayCutout = consumeStableInsets.consumeDisplayCutout();
        nud nud = this.f36494a;
        int i2 = nud.f36496h;
        int i3 = nud.f36500d.left;
        m27682a();
        return consumeDisplayCutout.replaceSystemWindowInsets(i3, this.f36494a.f36500d.top, this.f36494a.f36500d.right, this.f36494a.f36500d.bottom);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m27682a();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        nud nud = this.f36494a;
        int i5 = nud.f36496h;
        boolean z2 = nud.f36498b;
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m27682a();
    }
}
