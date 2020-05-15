package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: cnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cnl implements cgj, cge {

    /* renamed from: a */
    protected final Drawable f7105a;

    public cnl(Drawable drawable) {
        crb.m7382a(drawable);
        this.f7105a = drawable;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3842b() {
        Drawable.ConstantState constantState = this.f7105a.getConstantState();
        if (constantState == null) {
            return this.f7105a;
        }
        return constantState.newDrawable();
    }

    /* renamed from: e */
    public void mo3858e() {
        Drawable drawable = this.f7105a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof cnu) {
            ((cnu) drawable).mo4009b().prepareToDraw();
        }
    }
}
