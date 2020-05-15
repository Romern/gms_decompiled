package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: atnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atnb extends ViewOutlineProvider {

    /* renamed from: a */
    public static final atnb f90522a = new atnb();

    private atnb() {
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((float) view.getWidth()) * 0.035714287f);
    }
}
