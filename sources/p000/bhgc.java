package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: bhgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgc extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ Chip f118532a;

    public bhgc(Chip chip) {
        this.f118532a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        Chip chip = this.f118532a;
        Rect rect = Chip.f151136a;
        bhgf bhgf = chip.f151140b;
        if (bhgf != null) {
            bhgf.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
