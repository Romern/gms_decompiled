package p000;

import android.content.Context;
import android.widget.Checkable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: svm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svm extends svk implements Checkable {

    /* renamed from: a */
    public boolean f45239a;

    /* renamed from: b */
    public final boolean f45240b;

    public svm(Context context) {
        this(context, true);
    }

    /* renamed from: a */
    public int mo23821a() {
        return C0126R.C0128layout.common_settings_toggle_widget;
    }

    /* renamed from: b */
    public svb mo23822b() {
        return suz.m36396a();
    }

    public final boolean isChecked() {
        return this.f45239a;
    }

    public final void setChecked(boolean z) {
        this.f45239a = z;
        mo26164i();
    }

    public final void toggle() {
        setChecked(!this.f45239a);
    }

    public svm(Context context, boolean z) {
        super(context);
        this.f45240b = z;
    }
}
