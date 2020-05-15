package p000;

import android.widget.TextView;

/* renamed from: bkgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkgj {

    /* renamed from: b */
    public CharSequence f124209b;

    /* renamed from: c */
    public long f124210c;

    /* renamed from: d */
    public boolean f124211d;

    protected bkgj() {
        this(null);
    }

    /* renamed from: a */
    public CharSequence mo65759a() {
        return this.f124209b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo65760a(TextView textView);

    /* renamed from: b */
    public final boolean mo65994b(TextView textView) {
        return !this.f124211d || mo65760a(textView);
    }

    protected bkgj(CharSequence charSequence) {
        this.f124210c = 0;
        this.f124211d = true;
        this.f124209b = charSequence;
    }
}
