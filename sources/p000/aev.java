package p000;

import android.support.wearable.complications.rendering.ComplicationDrawable;

/* renamed from: aev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aev implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComplicationDrawable f352a;

    public aev(ComplicationDrawable complicationDrawable) {
        this.f352a = complicationDrawable;
    }

    public final void run() {
        this.f352a.setIsHighlighted(false);
        this.f352a.invalidateSelf();
    }
}
