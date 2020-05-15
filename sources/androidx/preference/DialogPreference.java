package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class DialogPreference extends Preference {

    /* renamed from: a */
    public CharSequence f1551a;

    /* renamed from: b */
    public CharSequence f1552b;

    /* renamed from: c */
    public Drawable f1553c;

    /* renamed from: d */
    public CharSequence f1554d;

    /* renamed from: e */
    public CharSequence f1555e;

    /* renamed from: f */
    public int f1556f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1164ll.m19309a(context, (int) C0126R.attr.dialogPreferenceStyle, 16842897));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1957a() {
        aok aok = this.f1596l.f1886e;
        if (aok != null) {
            aok.mo2231b(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aor.f1903c, i, 0);
        String a = C1164ll.m19314a(obtainStyledAttributes, 9, 0);
        this.f1551a = a;
        if (a == null) {
            this.f1551a = this.f1602r;
        }
        this.f1552b = C1164ll.m19314a(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f1553c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.f1554d = C1164ll.m19314a(obtainStyledAttributes, 11, 3);
        this.f1555e = C1164ll.m19314a(obtainStyledAttributes, 10, 4);
        this.f1556f = C1164ll.m19310a(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
}
