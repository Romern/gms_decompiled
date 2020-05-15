package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatSpinner extends Spinner {

    /* renamed from: e */
    private static final int[] f1187e = {16843505};

    /* renamed from: a */
    public final Context f1188a;

    /* renamed from: b */
    public C1517ym f1189b;

    /* renamed from: c */
    public int f1190c;

    /* renamed from: d */
    public final Rect f1191d;

    /* renamed from: f */
    private final C1493xp f1192f;

    /* renamed from: g */
    private C1551zt f1193g;

    /* renamed from: h */
    private SpinnerAdapter f1194h;

    /* renamed from: i */
    private final boolean f1195i;

    /* renamed from: android.support.v7.widget.AppCompatSpinner$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C1516yl();

        /* renamed from: a */
        boolean f1196a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1196a = parcel.readByte() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1196a ? (byte) 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final int mo1354a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i;
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i3 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                i = itemViewType;
            } else {
                i = i2;
            }
            if (itemViewType != i2) {
                view = null;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            max2++;
            i2 = i;
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f1191d);
        return i3 + this.f1191d.left + this.f1191d.right;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1493xp xpVar = this.f1192f;
        if (xpVar != null) {
            xpVar.mo16498a();
        }
    }

    public final int getDropDownHorizontalOffset() {
        C1517ym ymVar = this.f1189b;
        if (ymVar != null) {
            return ymVar.mo16547f();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    public final int getDropDownVerticalOffset() {
        C1517ym ymVar = this.f1189b;
        if (ymVar != null) {
            return ymVar.mo16543c();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    public final int getDropDownWidth() {
        if (this.f1189b != null) {
            return this.f1190c;
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    public final Drawable getPopupBackground() {
        C1517ym ymVar = this.f1189b;
        if (ymVar != null) {
            return ymVar.mo16541b();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    public final Context getPopupContext() {
        return this.f1188a;
    }

    public final CharSequence getPrompt() {
        C1517ym ymVar = this.f1189b;
        return ymVar != null ? ymVar.mo16535a() : super.getPrompt();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1517ym ymVar = this.f1189b;
        if (ymVar != null && ymVar.mo16546e()) {
            this.f1189b.mo16545d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1189b != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1354a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1196a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C1509ye(this));
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C1517ym ymVar = this.f1189b;
        boolean z = false;
        if (ymVar != null && ymVar.mo16546e()) {
            z = true;
        }
        savedState.f1196a = z;
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1551zt ztVar = this.f1193g;
        if (ztVar == null || !ztVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C1517ym ymVar = this.f1189b;
        if (ymVar == null) {
            return super.performClick();
        }
        if (ymVar.mo16546e()) {
            return true;
        }
        mo1355a();
        return true;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1493xp xpVar = this.f1192f;
        if (xpVar != null) {
            xpVar.mo16502b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1493xp xpVar = this.f1192f;
        if (xpVar != null) {
            xpVar.mo16499a(i);
        }
    }

    public final void setDropDownHorizontalOffset(int i) {
        C1517ym ymVar = this.f1189b;
        if (ymVar != null) {
            ymVar.mo16544c(i);
            this.f1189b.mo16542b(i);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(i);
    }

    public final void setDropDownVerticalOffset(int i) {
        C1517ym ymVar = this.f1189b;
        if (ymVar == null) {
            int i2 = Build.VERSION.SDK_INT;
            super.setDropDownVerticalOffset(i);
            return;
        }
        ymVar.mo16536a(i);
    }

    public final void setDropDownWidth(int i) {
        if (this.f1189b == null) {
            int i2 = Build.VERSION.SDK_INT;
            super.setDropDownWidth(i);
            return;
        }
        this.f1190c = i;
    }

    public final void setPopupBackgroundDrawable(Drawable drawable) {
        C1517ym ymVar = this.f1189b;
        if (ymVar == null) {
            int i = Build.VERSION.SDK_INT;
            super.setPopupBackgroundDrawable(drawable);
            return;
        }
        ymVar.mo16538a(drawable);
    }

    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1391tv.m20459b(this.f1188a, i));
    }

    public final void setPrompt(CharSequence charSequence) {
        C1517ym ymVar = this.f1189b;
        if (ymVar != null) {
            ymVar.mo16540a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C0126R.attr.spinnerStyle, i);
    }

    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (this.f1195i) {
            super.setAdapter(spinnerAdapter);
            if (this.f1189b != null) {
                Context context = this.f1188a;
                if (context == null) {
                    context = getContext();
                }
                this.f1189b.mo16539a(new C1511yg(spinnerAdapter, context.getTheme()));
                return;
            }
            return;
        }
        this.f1194h = spinnerAdapter;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r12 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r12 != null) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        Exception e;
        this.f1191d = new Rect();
        adm.m515a(this, getContext());
        adr a = adr.m523a(context, attributeSet, C1390tu.f27214w, i, 0);
        this.f1192f = new C1493xp(this);
        if (theme != null) {
            this.f1188a = new C1416ut(context, theme);
        } else {
            int f = a.mo460f(4, 0);
            if (f != 0) {
                this.f1188a = new C1416ut(context, f);
            } else {
                this.f1188a = context;
            }
        }
        TypedArray typedArray2 = null;
        if (i2 == -1) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, f1187e, i, 0);
                try {
                    i2 = typedArray.hasValue(0) ? typedArray.getInt(0, 0) : i2;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    } catch (Throwable th) {
                        th = th;
                        typedArray2 = typedArray;
                        if (typedArray2 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                typedArray = null;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
            } catch (Throwable th2) {
                th = th2;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        }
        if (i2 == 0) {
            C1510yf yfVar = new C1510yf(this);
            this.f1189b = yfVar;
            yfVar.mo16540a(a.mo457d(2));
        } else if (i2 == 1) {
            C1515yk ykVar = new C1515yk(this, this.f1188a, attributeSet, i);
            adr a2 = adr.m523a(this.f1188a, attributeSet, C1390tu.f27214w, i, 0);
            this.f1190c = a2.mo458e(3, -2);
            ykVar.mo98a(a2.mo449a(1));
            ykVar.f27650a = a.mo457d(2);
            a2.mo450a();
            this.f1189b = ykVar;
            this.f1193g = new C1508yd(this, this, ykVar);
        }
        CharSequence[] textArray = a.f290b.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(C0126R.C0128layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        a.mo450a();
        this.f1195i = true;
        SpinnerAdapter spinnerAdapter = this.f1194h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1194h = null;
        }
        this.f1192f.mo16501a(attributeSet, i);
    }

    /* renamed from: a */
    public final void mo1355a() {
        int i = Build.VERSION.SDK_INT;
        this.f1189b.mo16537a(getTextDirection(), getTextAlignment());
    }
}
