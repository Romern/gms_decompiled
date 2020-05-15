package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* renamed from: ansq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ansq extends ViewGroup implements View.OnClickListener {

    /* renamed from: a */
    private static boolean f77615a;

    /* renamed from: b */
    private static Drawable f77616b;

    /* renamed from: c */
    private static Drawable f77617c;

    /* renamed from: d */
    private static Drawable f77618d;

    /* renamed from: e */
    private static Drawable f77619e;

    /* renamed from: f */
    private static int f77620f;

    /* renamed from: g */
    private static int f77621g;

    /* renamed from: h */
    private static int f77622h;

    /* renamed from: i */
    private static int f77623i;

    /* renamed from: j */
    private static int f77624j;

    /* renamed from: k */
    private static FrameLayout.LayoutParams f77625k;

    /* renamed from: l */
    private int f77626l;

    /* renamed from: m */
    private Drawable f77627m;

    /* renamed from: n */
    private final TextView f77628n;

    /* renamed from: o */
    private int f77629o;

    /* renamed from: p */
    private String f77630p;

    /* renamed from: q */
    private final Rect f77631q = new Rect();

    /* renamed from: r */
    public final Resources f77632r;

    /* renamed from: s */
    public int f77633s;

    /* renamed from: t */
    public ProgressBar f77634t;

    /* renamed from: u */
    public boolean f77635u;

    /* renamed from: v */
    public antg f77636v;

    /* renamed from: w */
    private int f77637w;

    /* renamed from: x */
    private boolean f77638x = true;

    /* renamed from: y */
    private final Rect f77639y = new Rect();

    /* renamed from: a */
    private final void m65120a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        setBackground(drawable);
    }

    /* renamed from: b */
    private final void m65121b(int i, boolean z) {
        if (i == 0) {
            m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.plus_red_button_nugget));
            getContext();
            answ.m65135a(this.f77632r, this.f77628n, 1);
            this.f77638x = true;
            this.f77627m = f77618d;
            int i2 = this.f77633s;
            if (i2 == 1 || i2 == 2) {
                m65122b(this.f77632r.getString(C0126R.string.circle_button_follow), z);
            } else if (this.f77629o == 2) {
                m65122b(this.f77632r.getString(C0126R.string.common_add), z);
            } else {
                m65122b(this.f77632r.getString(C0126R.string.circle_button_add_to_circles), z);
            }
        } else if (i != 1) {
            m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.btn_32_white));
            getContext();
            answ.m65135a(this.f77632r, this.f77628n, 5);
            this.f77638x = false;
            m65122b(this.f77632r.getString(C0126R.string.circle_button_profile_blocked), z);
        } else {
            m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.plus_white_button_nugget));
            getContext();
            answ.m65135a(this.f77632r, this.f77628n, 3);
            this.f77638x = true;
            this.f77627m = f77616b;
            m65122b(this.f77630p, z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ansq.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      ansq.a(int, boolean):void
      ansq.a(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ansq.b(int, boolean):void
     arg types: [int, int]
     candidates:
      ansq.b(java.lang.String, boolean):void
      ansq.b(int, boolean):void */
    /* renamed from: c */
    public final void mo42198c(int i) {
        this.f77633s = i;
        if (i != 3) {
            mo42195a(this.f77630p, false);
        } else {
            m65121b(2, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f77638x) {
            this.f77627m.setBounds(this.f77639y);
            this.f77627m.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void onClick(View view) {
        antg antg = this.f77636v;
        if (antg != null) {
            try {
                antg.mo42224a((Intent) getTag());
            } catch (RemoteException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        int i8 = (i6 - this.f77631q.left) - this.f77631q.right;
        int i9 = (i7 - this.f77631q.top) - this.f77631q.bottom;
        int i10 = i6 - this.f77631q.right;
        int i11 = i7 - this.f77631q.bottom;
        int measuredHeight = this.f77628n.getMeasuredHeight();
        if (this.f77635u) {
            int measuredWidth = this.f77634t.getMeasuredWidth();
            int i12 = (i6 - measuredWidth) / 2;
            int measuredHeight2 = (i7 - this.f77634t.getMeasuredHeight()) / 2;
            this.f77634t.layout(i12, measuredHeight2, i12 + measuredWidth, measuredWidth + measuredHeight2);
        }
        if (this.f77638x) {
            i5 = this.f77627m.getIntrinsicWidth();
            if (this.f77628n.getVisibility() == 0) {
                i5 += this.f77626l;
            }
        } else {
            i5 = 0;
        }
        int measuredWidth2 = i5 + this.f77628n.getMeasuredWidth();
        int i13 = this.f77631q.left + ((i8 - measuredWidth2) / 2);
        if (i13 < this.f77631q.left) {
            i13 = this.f77631q.left;
        }
        int i14 = this.f77631q.top + ((i9 - measuredHeight) / 2);
        if (i14 < this.f77631q.top) {
            i14 = this.f77631q.top;
        }
        int i15 = measuredWidth2 + i13;
        if (i15 <= i10) {
            i10 = i15;
        }
        int min = Math.min(i7, measuredHeight) + i14;
        if (min <= i11) {
            i11 = min;
        }
        if (this.f77638x) {
            int intrinsicHeight = this.f77627m.getIntrinsicHeight();
            int intrinsicWidth = this.f77627m.getIntrinsicWidth();
            int i16 = this.f77631q.top + ((i9 - intrinsicHeight) / 2);
            this.f77639y.set(i13, i16, i13 + intrinsicWidth, intrinsicHeight + i16);
            i13 += intrinsicWidth + this.f77626l;
        }
        if (this.f77628n.getVisibility() == 0) {
            this.f77628n.layout(i13, i14, i10, i11);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Drawable background = getBackground();
        int minimumWidth = background.getMinimumWidth();
        int minimumHeight = background.getMinimumHeight();
        int visibility = this.f77628n.getVisibility();
        if (background != null) {
            background.getPadding(this.f77631q);
        }
        Rect rect = this.f77631q;
        int i8 = this.f77637w;
        rect.right = i8;
        rect.left = i8;
        int mode = View.MeasureSpec.getMode(i);
        int i9 = Integer.MAX_VALUE;
        if (mode != 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i9 = View.MeasureSpec.getSize(i2);
        }
        int i10 = 0;
        if (this.f77638x) {
            i5 = this.f77627m.getIntrinsicWidth();
            if (visibility != 8) {
                i5 += this.f77626l;
            }
            i4 = this.f77627m.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        if (visibility != 8) {
            i6 = ((i3 - i5) - this.f77631q.left) - this.f77631q.right;
        } else {
            i6 = 0;
        }
        if (visibility != 8) {
            this.f77628n.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), makeMeasureSpec);
        }
        if (mode != 1073741824) {
            if (visibility != 8) {
                i10 = this.f77628n.getMeasuredWidth();
            }
            i3 = Math.max(minimumWidth, i10 + i5) + this.f77631q.left + this.f77631q.right;
        }
        if (mode2 != 1073741824) {
            i9 = Math.max(minimumHeight, Math.max(i4, this.f77628n.getMeasuredHeight())) + 6;
            if (this.f77629o == 3 && i9 < (i7 = f77622h)) {
                i9 = i7;
            }
        }
        int resolveSize = resolveSize(i3, i);
        int resolveSize2 = resolveSize(i9, i2);
        if (this.f77635u) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((resolveSize2 - this.f77631q.top) - this.f77631q.bottom, JGCastService.FLAG_PRIVATE_DISPLAY);
            this.f77634t.measure(makeMeasureSpec2, makeMeasureSpec2);
        }
        setMeasuredDimension(resolveSize, resolveSize2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ansq.a(int, boolean):void
     arg types: [int, int]
     candidates:
      ansq.a(java.lang.String, boolean):void
      ansq.a(int, boolean):void */
    public ansq(Context context, Context context2, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        String a = seb.m34988a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, "BaseCirclesButtonView");
        int i2 = 3;
        if (!"SMALL".equalsIgnoreCase(a)) {
            i = !"MEDIUM".equalsIgnoreCase(a) ? "LARGE".equalsIgnoreCase(a) ? 3 : 0 : 2;
        } else {
            i = 1;
        }
        String a2 = seb.m34988a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "type", context, attributeSet, "BaseCirclesButtonView");
        if ("FOLLOW".equalsIgnoreCase(a2)) {
            i2 = 1;
        } else if ("ONE_CLICK_FOLLOW".equalsIgnoreCase(a2)) {
            i2 = 2;
        } else if (!"BLOCKED".equalsIgnoreCase(a2)) {
            i2 = 0;
        }
        Resources resources = context2.getResources();
        this.f77632r = resources;
        if (!f77615a) {
            f77615a = true;
            f77620f = resources.getDimensionPixelSize(C0126R.dimen.circle_button_32_icon_spacing);
            f77621g = this.f77632r.getDimensionPixelSize(C0126R.dimen.circle_button_48_icon_spacing);
            this.f77632r.getDimensionPixelSize(C0126R.dimen.circle_button_32_height);
            f77622h = this.f77632r.getDimensionPixelSize(C0126R.dimen.circle_button_48_height);
            f77623i = this.f77632r.getDimensionPixelSize(C0126R.dimen.circle_button_32_side_padding);
            f77624j = this.f77632r.getDimensionPixelSize(C0126R.dimen.circle_button_48_side_padding);
            f77616b = this.f77632r.getDrawable(C0126R.C0127drawable.plus_iconic_ic_circles_red_20);
            f77617c = this.f77632r.getDrawable(C0126R.C0127drawable.ic_add_person_red_20);
            f77618d = this.f77632r.getDrawable(C0126R.C0127drawable.ic_add_person_white_20);
            f77619e = this.f77632r.getDrawable(C0126R.C0127drawable.ic_add_person_darkgrey_20);
            f77625k = new FrameLayout.LayoutParams(-2, -2);
            f77616b.setFilterBitmap(true);
            f77617c.setFilterBitmap(true);
            f77618d.setFilterBitmap(true);
            f77619e.setFilterBitmap(true);
        }
        Resources resources2 = this.f77632r;
        TextView textView = new TextView(context);
        answ.m65135a(resources2, textView, 1);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        this.f77628n = textView;
        addView(textView);
        mo42194a(i, false);
        mo42198c(i2);
    }

    /* renamed from: a */
    public final void mo42194a(int i, boolean z) {
        this.f77629o = i;
        if (i == 1) {
            this.f77637w = f77623i;
            this.f77626l = f77620f;
            this.f77628n.setVisibility(8);
            setLayoutParams(f77625k);
        } else if (i == 2) {
            this.f77637w = f77623i;
            this.f77626l = f77620f;
            this.f77628n.setVisibility(0);
            setLayoutParams(f77625k);
        } else if (i != 3) {
            this.f77637w = f77623i;
            this.f77626l = f77620f;
            this.f77628n.setVisibility(0);
        } else {
            this.f77637w = f77624j;
            this.f77626l = f77621g;
            this.f77628n.setVisibility(0);
            setLayoutParams(f77625k);
        }
        if (z) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo42195a(String str, boolean z) {
        this.f77630p = str;
        if (this.f77633s == 3) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            m65121b(1, z);
        } else {
            m65121b(0, z);
        }
    }

    /* renamed from: b */
    private final void m65122b(String str, boolean z) {
        if (!TextUtils.equals(this.f77628n.getText(), str)) {
            this.f77628n.setText(str);
            if (z) {
                requestLayout();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42196b(int i) {
        if (this.f77629o == 1 && this.f77633s == 3) {
            setVisibility(8);
        } else {
            setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42197b(boolean z) {
        if (z && this.f77633s != 3) {
            if (TextUtils.isEmpty(this.f77630p)) {
                m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.plus_red_button_nugget));
            } else {
                m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.plus_white_button_nugget));
            }
            setOnClickListener(this);
            return;
        }
        if (TextUtils.isEmpty(this.f77630p) && this.f77633s != 3) {
            m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.btn_32_red));
        } else {
            m65120a(this.f77632r.getDrawable(C0126R.C0127drawable.btn_32_white));
        }
        setOnClickListener(null);
    }
}
