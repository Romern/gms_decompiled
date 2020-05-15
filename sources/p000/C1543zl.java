package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import java.lang.reflect.Field;

/* renamed from: zl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1543zl extends ListView {

    /* renamed from: a */
    public boolean f27742a;

    /* renamed from: b */
    C1542zk f27743b;

    /* renamed from: c */
    private final Rect f27744c = new Rect();

    /* renamed from: d */
    private int f27745d = 0;

    /* renamed from: e */
    private int f27746e = 0;

    /* renamed from: f */
    private int f27747f = 0;

    /* renamed from: g */
    private int f27748g = 0;

    /* renamed from: h */
    private int f27749h;

    /* renamed from: i */
    private Field f27750i;

    /* renamed from: j */
    private C1541zj f27751j;

    /* renamed from: k */
    private final boolean f27752k;

    /* renamed from: l */
    private boolean f27753l;

    /* renamed from: m */
    private C1319rd f27754m;

    public C1543zl(Context context, boolean z) {
        super(context, null, C0126R.attr.dropDownListViewStyle);
        this.f27752k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f27750i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            bqye.m113758a(e);
        }
    }

    /* renamed from: a */
    private final void m20972a() {
        Drawable selector = getSelector();
        if (selector != null && this.f27753l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private final void m20973a(boolean z) {
        C1541zj zjVar = this.f27751j;
        if (zjVar != null) {
            zjVar.f27740b = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f27744c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f27744c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (this.f27743b == null) {
            super.drawableStateChanged();
            m20973a(true);
            m20972a();
        }
    }

    public final boolean hasFocus() {
        return this.f27752k || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f27752k || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f27752k || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f27752k && this.f27742a) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f27743b = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f27743b == null) {
            C1542zk zkVar = new C1542zk(this);
            this.f27743b = zkVar;
            zkVar.f27741a.post(zkVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m20972a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f27749h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C1542zk zkVar = this.f27743b;
        if (zkVar != null) {
            C1543zl zlVar = zkVar.f27741a;
            zlVar.f27743b = null;
            zlVar.removeCallbacks(zkVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelector(Drawable drawable) {
        C1541zj zjVar;
        if (drawable != null) {
            zjVar = new C1541zj(drawable);
        } else {
            zjVar = null;
        }
        this.f27751j = zjVar;
        super.setSelector(zjVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f27745d = rect.left;
        this.f27746e = rect.top;
        this.f27747f = rect.right;
        this.f27748g = rect.bottom;
    }

    /* renamed from: a */
    public final int mo16616a(int i, int i2) {
        int i3;
        int i4;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0) {
            dividerHeight = 0;
        } else if (divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                i3 = itemViewType;
            } else {
                i3 = i7;
            }
            if (itemViewType != i7) {
                view = null;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i4);
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i2) {
                return i2;
            }
            i6++;
            i7 = i3;
        }
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015a  */
    /* renamed from: a */
    public final boolean mo16617a(MotionEvent motionEvent, int i) {
        boolean z;
        View childAt;
        boolean z2;
        boolean z3;
        View childAt2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z = false;
        } else if (actionMasked != 2) {
            z = actionMasked != 3;
            if (!z || z4) {
                this.f27753l = false;
                setPressed(false);
                drawableStateChanged();
                childAt = getChildAt(this.f27749h - getFirstVisiblePosition());
                if (childAt != null) {
                    childAt.setPressed(false);
                }
            }
            if (z) {
                C1319rd rdVar = this.f27754m;
                if (rdVar != null) {
                    rdVar.mo15802a(false);
                }
            } else {
                if (this.f27754m == null) {
                    this.f27754m = new C1319rd(this);
                }
                this.f27754m.mo15802a(true);
                this.f27754m.onTouch(this, motionEvent2);
            }
            return z;
        } else {
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent2.getX(findPointerIndex);
            int y = (int) motionEvent2.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = (float) x;
                float f2 = (float) y;
                this.f27753l = true;
                int i2 = Build.VERSION.SDK_INT;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f27749h;
                if (!(i3 == -1 || (childAt2 = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt2 == childAt3 || !childAt2.isPressed())) {
                    childAt2.setPressed(false);
                }
                this.f27749h = pointToPosition;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int i4 = Build.VERSION.SDK_INT;
                childAt3.drawableHotspotChanged(f - ((float) left), f2 - ((float) top));
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector == null) {
                    z2 = false;
                } else {
                    z2 = pointToPosition != -1;
                }
                if (z2) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f27744c;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f27745d;
                rect.top -= this.f27746e;
                rect.right += this.f27747f;
                rect.bottom += this.f27748g;
                try {
                    boolean z5 = this.f27750i.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        this.f27750i.set(this, Boolean.valueOf(!z5));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    bqye.m113758a(e);
                }
                if (z2) {
                    Rect rect2 = this.f27744c;
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    if (getVisibility() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    selector.setVisible(z3, false);
                    C1173lt.m19598a(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (!(selector2 == null || pointToPosition == -1)) {
                    C1173lt.m19598a(selector2, f, f2);
                }
                m20973a(false);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z = false;
            z4 = false;
        }
        this.f27753l = false;
        setPressed(false);
        drawableStateChanged();
        childAt = getChildAt(this.f27749h - getFirstVisiblePosition());
        if (childAt != null) {
        }
        if (z) {
        }
        return z;
    }
}
