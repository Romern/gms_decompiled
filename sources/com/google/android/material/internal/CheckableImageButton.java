package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.support.p002v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: d */
    private static final int[] f151199d = {16842912};

    /* renamed from: a */
    public boolean f151200a;

    /* renamed from: b */
    public boolean f151201b;

    /* renamed from: c */
    public boolean f151202c;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo71194a(boolean z) {
        if (this.f151201b != z) {
            this.f151201b = z;
            sendAccessibilityEvent(0);
        }
    }

    public final boolean isChecked() {
        return this.f151200a;
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.f151200a) {
            return mergeDrawableStates(super.onCreateDrawableState(i + f151199d.length), f151199d);
        }
        return super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        setChecked(savedState.f151203c);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f151203c = this.f151200a;
        return savedState;
    }

    public final void setChecked(boolean z) {
        if (this.f151201b && this.f151200a != z) {
            this.f151200a = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public final void setPressed(boolean z) {
        if (this.f151202c) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.f151200a);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new bhjb();

        /* renamed from: c */
        boolean f151203c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f151203c = parcel.readInt() != 1 ? false : true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f151203c ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f151201b = true;
        this.f151202c = true;
        C1280ps.m19894a(this, new bhja(this));
    }
}
