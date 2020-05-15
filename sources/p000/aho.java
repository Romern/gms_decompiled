package p000;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* renamed from: aho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aho {

    /* renamed from: a */
    public Drawable f550a;

    /* renamed from: b */
    public final /* synthetic */ CardView f551b;

    public aho(CardView cardView) {
        this.f551b = cardView;
    }

    /* renamed from: a */
    public final void mo709a(int i, int i2, int i3, int i4) {
        this.f551b.f1478d.set(i, i2, i3, i4);
        CardView cardView = this.f551b;
        aho.super.setPadding(i + cardView.f1477c.left, i2 + this.f551b.f1477c.top, i3 + this.f551b.f1477c.right, i4 + this.f551b.f1477c.bottom);
    }

    /* renamed from: a */
    public final boolean mo710a() {
        return this.f551b.f1475a;
    }

    /* renamed from: b */
    public final boolean mo711b() {
        return this.f551b.f1476b;
    }
}
