package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: bhgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgb extends bhld {

    /* renamed from: a */
    final /* synthetic */ Chip f118531a;

    public bhgb(Chip chip) {
        this.f118531a = chip;
    }

    /* renamed from: a */
    public final void mo63692a(int i) {
    }

    /* renamed from: a */
    public final void mo63693a(Typeface typeface, boolean z) {
        CharSequence charSequence;
        Chip chip = this.f118531a;
        bhgf bhgf = chip.f151140b;
        if (!bhgf.f118592q) {
            charSequence = chip.getText();
        } else {
            charSequence = bhgf.f118578c;
        }
        chip.setText(charSequence);
        this.f118531a.requestLayout();
        this.f118531a.invalidate();
    }
}
