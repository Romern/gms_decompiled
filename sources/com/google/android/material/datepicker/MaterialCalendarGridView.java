package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.felicanetworks.mfc.C0126R;
import java.util.Calendar;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f151171a;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m117560a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        bhhm a = getAdapter();
        DateSelector dateSelector = a.f118675c;
        bhgo bhgo = a.f118676d;
        Long a2 = a.getItem(a.mo63763a());
        Long a3 = a.getItem(a.mo63765b());
        for (C1240of ofVar : dateSelector.mo71134d()) {
            Object obj = ofVar.f26798a;
            if (obj == null || ofVar.f26799b == null) {
                materialCalendarGridView = this;
            } else {
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) ofVar.f26799b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (a2 != null && a3 != null && valueOf.longValue() <= a3.longValue() && valueOf2.longValue() >= a2.longValue()) {
                    if (longValue < a2.longValue()) {
                        i2 = a.mo63763a();
                        if (i2 % a.f118674b.f151176e != 0) {
                            i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            i = 0;
                        }
                    } else {
                        materialCalendarGridView.f151171a.setTimeInMillis(longValue);
                        i2 = a.mo63766b(materialCalendarGridView.f151171a.get(5));
                        i = m117560a(materialCalendarGridView.getChildAt(i2));
                    }
                    if (longValue2 > a3.longValue()) {
                        i4 = a.mo63765b();
                        if ((i4 + 1) % a.f118674b.f151176e != 0) {
                            i3 = materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            i3 = getWidth();
                        }
                    } else {
                        materialCalendarGridView.f151171a.setTimeInMillis(longValue2);
                        i4 = a.mo63766b(materialCalendarGridView.f151171a.get(5));
                        i3 = m117560a(materialCalendarGridView.getChildAt(i4));
                    }
                    int itemId = (int) a.getItemId(i2);
                    int itemId2 = (int) a.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        int top = childAt.getTop() + bhgo.f118611a.mo63738a();
                        int bottom = childAt.getBottom() - bhgo.f118611a.mo63740b();
                        if (numColumns > i2) {
                            i5 = 0;
                        } else {
                            i5 = i;
                        }
                        canvas.drawRect((float) i5, (float) top, (float) (i4 > numColumns2 ? getWidth() : i3), (float) bottom, bhgo.f118618h);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                    materialCalendarGridView = this;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().mo63765b());
        } else if (i == 130) {
            setSelection(getAdapter().mo63763a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo63763a()) {
            return true;
        }
        if (i != 19) {
            return false;
        }
        setSelection(getAdapter().mo63763a());
        return true;
    }

    public final void setSelection(int i) {
        if (i < getAdapter().mo63763a()) {
            super.setSelection(getAdapter().mo63763a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final bhhm getAdapter() {
        return (bhhm) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof bhhm) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), bhhm.class.getCanonicalName()));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f151171a = bhhv.m100907c();
        if (bhhh.m100880a(getContext())) {
            setNextFocusLeftId(C0126R.C0129id.cancel_button);
            setNextFocusRightId(C0126R.C0129id.confirm_button);
        }
        C1280ps.m19894a(this, new bhhc());
    }
}
