package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.AppCompatImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: xd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1481xd extends AppCompatImageView implements C1486xi {

    /* renamed from: a */
    final /* synthetic */ C1485xh f27561a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1481xd(C1485xh xhVar, Context context) {
        super(context, null, C0126R.attr.actionOverflowButtonStyle);
        this.f27561a = xhVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        aec.m594a(this, getContentDescription());
        setOnTouchListener(new C1480xc(this, this));
    }

    /* renamed from: d */
    public final boolean mo1212d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo1213e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f27561a.mo16470c();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            C1173lt.m19600a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
