package android.support.p002v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;

/* renamed from: android.support.v7.widget.ContentFrameLayout */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f1201b;

    /* renamed from: c */
    public TypedValue f1202c;

    /* renamed from: d */
    public TypedValue f1203d;

    /* renamed from: e */
    public TypedValue f1204e;

    /* renamed from: f */
    public TypedValue f1205f;

    /* renamed from: g */
    public TypedValue f1206g;

    /* renamed from: h */
    public final Rect f1207h;

    /* renamed from: i */
    public C1356sn f1208i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1356sn snVar = this.f1208i;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        C1443vt vtVar;
        super.onDetachedFromWindow();
        C1356sn snVar = this.f1208i;
        if (snVar != null) {
            C1372tc tcVar = snVar.f27031a;
            C1525yu yuVar = tcVar.f27105j;
            if (yuVar != null) {
                yuVar.mo1277j();
            }
            if (tcVar.f27108m != null) {
                tcVar.f27101f.getDecorView().removeCallbacks(tcVar.f27109n);
                if (tcVar.f27108m.isShowing()) {
                    try {
                        tcVar.f27108m.dismiss();
                    } catch (IllegalArgumentException e) {
                    }
                }
                tcVar.f27108m = null;
            }
            tcVar.mo16002u();
            C1370ta f = tcVar.mo15995f(0);
            if (f != null && (vtVar = f.f27058j) != null) {
                vtVar.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        TypedValue typedValue;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z2 = true;
        if (mode != Integer.MIN_VALUE) {
            i3 = i;
            z = false;
        } else {
            TypedValue typedValue2 = i5 >= i6 ? this.f1203d : this.f1204e;
            if (typedValue2 == null) {
                i3 = i;
                z = false;
            } else if (typedValue2.type == 0) {
                i3 = i;
                z = false;
            } else {
                int dimension = typedValue2.type == 5 ? (int) typedValue2.getDimension(displayMetrics) : typedValue2.type == 6 ? (int) typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                if (dimension > 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(Math.min(dimension - (this.f1207h.left + this.f1207h.right), View.MeasureSpec.getSize(i)), JGCastService.FLAG_PRIVATE_DISPLAY);
                    z = true;
                } else {
                    i3 = i;
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue3 = i5 >= i6 ? this.f1206g : this.f1205f;
            if (!(typedValue3 == null || typedValue3.type == 0)) {
                int dimension2 = typedValue3.type == 5 ? (int) typedValue3.getDimension(displayMetrics) : typedValue3.type == 6 ? (int) typedValue3.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels) : 0;
                if (dimension2 > 0) {
                    i4 = View.MeasureSpec.makeMeasureSpec(Math.min(dimension2 - (this.f1207h.top + this.f1207h.bottom), View.MeasureSpec.getSize(i2)), JGCastService.FLAG_PRIVATE_DISPLAY);
                    super.onMeasure(i3, i4);
                    int measuredWidth = getMeasuredWidth();
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_PRIVATE_DISPLAY);
                    if (!z) {
                        z2 = false;
                    } else {
                        if (mode == Integer.MIN_VALUE) {
                            if (i5 >= i6) {
                                typedValue = this.f1201b;
                            } else {
                                typedValue = this.f1202c;
                            }
                            if (typedValue != null) {
                                if (typedValue.type == 0) {
                                    z2 = false;
                                } else {
                                    int dimension3 = typedValue.type == 5 ? (int) typedValue.getDimension(displayMetrics) : typedValue.type == 6 ? (int) typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels) : 0;
                                    if (dimension3 > 0) {
                                        dimension3 -= this.f1207h.left + this.f1207h.right;
                                    }
                                    if (measuredWidth < dimension3) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dimension3, JGCastService.FLAG_PRIVATE_DISPLAY);
                                    } else {
                                        z2 = false;
                                    }
                                }
                            }
                        }
                        z2 = false;
                    }
                    if (!z2) {
                        super.onMeasure(makeMeasureSpec, i4);
                        return;
                    }
                    return;
                }
            }
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        int measuredWidth2 = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, JGCastService.FLAG_PRIVATE_DISPLAY);
        if (!z) {
        }
        if (!z2) {
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1207h = new Rect();
    }
}
