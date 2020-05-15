package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: bhko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhko extends ImageButton {

    /* renamed from: d */
    public int f118917d;

    public bhko(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo63901a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f118917d = i;
        }
    }

    public final void setVisibility(int i) {
        mo63901a(i, true);
    }

    public bhko(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bhko(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118917d = getVisibility();
    }
}
