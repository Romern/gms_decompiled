package com.android.setupwizardlib.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RichTextView extends AppCompatTextView implements bmn {

    /* renamed from: b */
    private bmz f7247b;

    public RichTextView(Context context) {
        super(context);
        m4749b();
    }

    /* renamed from: b */
    private final void m4749b() {
        int i = Build.VERSION.SDK_INT;
        bmz bmz = new bmz(new C1251oq());
        this.f7247b = bmz;
        C1280ps.m19894a(this, bmz);
    }

    /* renamed from: a */
    public final boolean mo3283a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = Build.VERSION.SDK_INT;
        int[] drawableState = getDrawableState();
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof bni) {
            bni bni = (bni) movementMethod;
            if (bni.f5191b == motionEvent) {
                return bni.f5190a;
            }
        }
        return onTouchEvent;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Context context = getContext();
        boolean z = true;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            Annotation[] annotationArr = (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class);
            for (Annotation annotation : annotationArr) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Cannot find resource: 0");
                        Log.w("RichTextView", sb.toString());
                    }
                    bmp.m3358a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    bmp.m3358a(spannableString, annotation, new bmo(), new TypefaceSpan("sans-serif-medium"));
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned)) {
            z = false;
        } else if (((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            z = false;
        }
        if (z) {
            setMovementMethod(new bni());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        int i = Build.VERSION.SDK_INT;
        setRevealOnFocusHint(false);
        setFocusableInTouchMode(z);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4749b();
    }
}
