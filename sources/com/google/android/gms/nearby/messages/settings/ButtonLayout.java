package com.google.android.gms.nearby.messages.settings;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonLayout extends ViewGroup {

    /* renamed from: a */
    private final ajgh f80819a;

    /* renamed from: b */
    private final ajgh f80820b;

    /* renamed from: c */
    private Button f80821c;

    /* renamed from: d */
    private Button f80822d;

    /* renamed from: e */
    private boolean f80823e;

    public ButtonLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static boolean m67428a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 2) {
            this.f80821c = (Button) getChildAt(0);
            this.f80822d = (Button) getChildAt(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        if (this.f80823e) {
            Button button = this.f80822d;
            button.layout(paddingLeft, paddingBottom - button.getMeasuredHeight(), this.f80822d.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.f80821c.layout(paddingLeft, this.f80822d.getTop() - this.f80821c.getMeasuredHeight(), this.f80821c.getMeasuredWidth() + paddingLeft, this.f80822d.getTop());
        } else if (!m67428a(getContext())) {
            Button button2 = this.f80821c;
            button2.layout(paddingRight - button2.getMeasuredWidth(), paddingBottom - this.f80821c.getMeasuredHeight(), paddingRight, paddingBottom);
            this.f80822d.layout(this.f80821c.getLeft() - this.f80822d.getMeasuredWidth(), paddingBottom - this.f80822d.getMeasuredHeight(), this.f80821c.getLeft(), paddingBottom);
        } else {
            Button button3 = this.f80821c;
            button3.layout(paddingLeft, paddingBottom - button3.getMeasuredHeight(), this.f80821c.getMeasuredWidth() + paddingLeft, paddingBottom);
            this.f80822d.layout(this.f80821c.getRight(), paddingBottom - this.f80822d.getMeasuredHeight(), this.f80821c.getRight() + this.f80822d.getMeasuredWidth(), paddingBottom);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setPadding(this.f80820b.mo38604d(), this.f80820b.mo38602b(), this.f80820b.mo38605e(), this.f80820b.mo38603c());
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        this.f80821c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f80820b.mo38601a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        this.f80822d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f80820b.mo38601a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        boolean z = this.f80821c.getMeasuredWidth() + this.f80822d.getMeasuredWidth() > paddingLeft;
        this.f80823e = z;
        ajgh ajgh = !z ? this.f80820b : this.f80819a;
        setPadding(ajgh.mo38604d(), ajgh.mo38602b(), ajgh.mo38605e(), ajgh.mo38603c());
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        this.f80821c.setGravity(ajgh.f70573a);
        this.f80822d.setGravity(ajgh.f70573a);
        int i3 = Build.VERSION.SDK_INT;
        this.f80821c.setTextAlignment(ajgh.f70574b);
        this.f80822d.setTextAlignment(ajgh.f70574b);
        if (this.f80823e) {
            this.f80821c.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(ajgh.mo38601a(), JGCastService.FLAG_PRIVATE_DISPLAY));
            this.f80822d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(ajgh.mo38601a(), JGCastService.FLAG_PRIVATE_DISPLAY));
        }
        if (this.f80823e) {
            setMeasuredDimension(size, this.f80821c.getMeasuredHeight() + this.f80822d.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        } else {
            setMeasuredDimension(size, this.f80821c.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        }
    }

    public ButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f80823e = false;
        ajgg ajgg = new ajgg(context);
        ajgg.f70565a = 48;
        ajgg.f70566b = 21;
        ajgg.f70567c = 6;
        ajgg.f70568d = 24;
        ajgg.f70569e = 8;
        this.f80819a = ajgg.mo38600a();
        ajgg ajgg2 = new ajgg(context);
        ajgg2.f70565a = 52;
        ajgg2.f70566b = 17;
        ajgg2.f70567c = 0;
        ajgg2.f70570f = 16;
        ajgg2.f70571g = 16;
        this.f80820b = ajgg2.mo38600a();
    }
}
