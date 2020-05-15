package p000;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* renamed from: xx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1501xx extends PopupWindow {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rr.a(android.widget.PopupWindow, boolean):void
     arg types: [xx, boolean]
     candidates:
      rr.a(android.widget.PopupWindow, int):void
      rr.a(android.widget.PopupWindow, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    public C1501xx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        adr a = adr.m523a(context, attributeSet, C1390tu.f27211t, i, 0);
        if (a.mo461f(2)) {
            C1333rr.m20101a((PopupWindow) this, a.mo451a(2, false));
        }
        setBackgroundDrawable(a.mo449a(0));
        a.mo450a();
    }
}
