package p000;

import android.graphics.drawable.Drawable;

/* renamed from: bhle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhle extends Drawable.ConstantState {

    /* renamed from: a */
    final bhlr f118945a;

    /* renamed from: b */
    boolean f118946b;

    public bhle(bhle bhle) {
        this.f118945a = (bhlr) bhle.f118945a.f119007s.newDrawable();
        this.f118946b = bhle.f118946b;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ Drawable newDrawable() {
        return new bhlf(new bhle(this));
    }

    public bhle(bhlr bhlr) {
        this.f118945a = bhlr;
        this.f118946b = false;
    }
}
