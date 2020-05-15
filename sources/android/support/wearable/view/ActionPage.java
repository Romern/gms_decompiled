package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.cast.JGCastService;
import java.util.Objects;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionPage extends ViewGroup {

    /* renamed from: a */
    private final afs f1408a;

    /* renamed from: b */
    private afx f1409b;

    /* renamed from: c */
    private int f1410c;

    /* renamed from: d */
    private float f1411d;

    /* renamed from: e */
    private final Point f1412e;

    /* renamed from: f */
    private int f1413f;

    /* renamed from: g */
    private int f1414g;

    /* renamed from: h */
    private boolean f1415h;

    /* renamed from: i */
    private int f1416i;

    /* renamed from: j */
    private boolean f1417j;

    public ActionPage(Context context) {
        this(context, null);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f1417j = true;
        if (this.f1415h != windowInsets.isRound()) {
            this.f1415h = windowInsets.isRound();
            requestLayout();
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.f1416i != systemWindowInsetBottom) {
            this.f1416i = systemWindowInsetBottom;
            requestLayout();
        }
        if (this.f1415h) {
            this.f1416i = (int) Math.max((float) this.f1416i, ((float) getMeasuredHeight()) * 0.09375f);
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f1417j) {
            requestApplyInsets();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1409b.layout((int) (((float) this.f1412e.x) - this.f1411d), (int) (((float) this.f1412e.y) - this.f1411d), (int) (((float) this.f1412e.x) + this.f1411d), (int) (((float) this.f1412e.y) + this.f1411d));
        int i5 = (int) (((float) ((i3 - i) - this.f1413f)) / 2.0f);
        this.f1408a.layout(i5, this.f1409b.getBottom(), this.f1413f + i5, this.f1409b.getBottom() + this.f1414g);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        afx afx = this.f1409b;
        if (afx.f488e != 1 || afx.f486c == null) {
            int min = (int) (((float) Math.min(measuredWidth, measuredHeight)) * 0.45f);
            this.f1410c = min;
            this.f1411d = ((float) min) / 2.0f;
            this.f1409b.measure(View.MeasureSpec.makeMeasureSpec(min, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.f1410c, JGCastService.FLAG_PRIVATE_DISPLAY));
        } else {
            afx.measure(0, 0);
            int min2 = Math.min(this.f1409b.getMeasuredWidth(), this.f1409b.getMeasuredHeight());
            this.f1410c = min2;
            this.f1411d = ((float) min2) / 2.0f;
        }
        if (this.f1415h) {
            this.f1412e.set(measuredWidth / 2, measuredHeight / 2);
            this.f1413f = (int) (((float) measuredWidth) * 0.625f);
            this.f1416i = (int) (((float) measuredHeight) * 0.09375f);
        } else {
            this.f1412e.set(measuredWidth / 2, (int) (((float) measuredHeight) * 0.43f));
            this.f1413f = (int) (((float) measuredWidth) * 0.892f);
        }
        this.f1414g = (int) ((((float) measuredHeight) - (((float) this.f1412e.y) + this.f1411d)) - ((float) this.f1416i));
        this.f1408a.measure(View.MeasureSpec.makeMeasureSpec(this.f1413f, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.f1414g, JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        afx afx = this.f1409b;
        if (afx != null) {
            afx.setEnabled(z);
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        afx afx = this.f1409b;
        if (afx != null) {
            afx.setOnClickListener(onClickListener);
        }
    }

    public final void setStateListAnimator(StateListAnimator stateListAnimator) {
        afx afx = this.f1409b;
        if (afx != null) {
            afx.setStateListAnimator(stateListAnimator);
        }
    }

    public ActionPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132019221);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionPage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = context;
        this.f1412e = new Point();
        this.f1409b = new afx(context2);
        afs afs = new afs(context2);
        this.f1408a = afs;
        afs.mo612b(17);
        this.f1408a.mo609a(2);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, aem.f341b, i, i2);
        float f = 1.0f;
        String str = null;
        float f2 = 0.0f;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < obtainStyledAttributes.getIndexCount(); i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == 7) {
                afx afx = this.f1409b;
                afx.f485b = obtainStyledAttributes.getColorStateList(7);
                afx.f484a.getPaint().setColor(afx.f485b.getDefaultColor());
            } else if (index == 4) {
                afx afx2 = this.f1409b;
                Drawable drawable = obtainStyledAttributes.getDrawable(4);
                Drawable drawable2 = afx2.f486c;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                if (afx2.f486c != drawable) {
                    afx2.f486c = drawable;
                    afx2.requestLayout();
                    afx2.invalidate();
                }
                Drawable drawable3 = afx2.f486c;
                if (drawable3 != null) {
                    drawable3.setCallback(afx2);
                }
            } else if (index == 14) {
                afx afx3 = this.f1409b;
                afx3.f488e = obtainStyledAttributes.getInt(14, 0);
                if (afx3.f486c != null) {
                    afx3.invalidate();
                    afx3.requestLayout();
                }
            } else if (index == 13) {
                this.f1409b.mo625a(obtainStyledAttributes.getColor(13, -1));
            } else if (index == 17) {
                this.f1409b.mo624a(obtainStyledAttributes.getDimension(17, 0.0f));
            } else if (index == 5) {
                afs afs2 = this.f1408a;
                CharSequence text = obtainStyledAttributes.getText(5);
                if (text == null) {
                    throw new RuntimeException("Can not set ActionLabel text to null");
                } else if (!Objects.equals(afs2.f457c, text)) {
                    afs2.f455a = null;
                    afs2.f457c = text;
                    afs2.requestLayout();
                    afs2.invalidate();
                }
            } else if (index == 16) {
                afs afs3 = this.f1408a;
                float applyDimension = TypedValue.applyDimension(0, obtainStyledAttributes.getDimension(16, 10.0f), afs3.getContext().getResources().getDisplayMetrics());
                if (applyDimension != afs3.f460f) {
                    afs3.f455a = null;
                    afs3.f460f = applyDimension;
                    afs3.requestLayout();
                    afs3.invalidate();
                }
            } else if (index == 15) {
                afs afs4 = this.f1408a;
                float applyDimension2 = TypedValue.applyDimension(0, obtainStyledAttributes.getDimension(15, 60.0f), afs4.getContext().getResources().getDisplayMetrics());
                if (applyDimension2 != afs4.f461g) {
                    afs4.f455a = null;
                    afs4.f461g = applyDimension2;
                    afs4.requestLayout();
                    afs4.invalidate();
                }
            } else if (index == 2) {
                afs afs5 = this.f1408a;
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
                if (colorStateList != null) {
                    afs5.f456b = colorStateList;
                    afs5.mo608a();
                } else {
                    throw null;
                }
            } else if (index == 6) {
                this.f1408a.mo609a(obtainStyledAttributes.getInt(6, 2));
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(10);
            } else if (index == 0) {
                i3 = obtainStyledAttributes.getInt(0, i3);
            } else if (index == 1) {
                i4 = obtainStyledAttributes.getInt(1, i4);
            } else if (index == 3) {
                this.f1408a.mo612b(obtainStyledAttributes.getInt(3, 17));
            } else if (index == 8) {
                f2 = obtainStyledAttributes.getDimension(8, f2);
            } else if (index == 9) {
                f = obtainStyledAttributes.getDimension(9, f);
            } else if (index == 12) {
                this.f1409b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, obtainStyledAttributes.getResourceId(12, 0)));
            }
        }
        obtainStyledAttributes.recycle();
        afs afs6 = this.f1408a;
        if (!(afs6.f459e == f2 && afs6.f458d == f)) {
            afs6.f459e = f2;
            afs6.f458d = f;
            if (afs6.f455a != null) {
                afs6.f455a = null;
                afs6.requestLayout();
                afs6.invalidate();
            }
        }
        this.f1408a.mo611a(str, i3, i4);
        addView(this.f1408a);
        addView(this.f1409b);
    }
}
