package p000;

import android.content.Context;
import android.content.res.TypedArray;
import com.felicanetworks.mfc.C0126R;

/* renamed from: axad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axad extends axah {
    public axad(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52934a(Context context) {
        super.mo52934a(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.drawableWalletAdd});
        this.f95515c.setImageResource(obtainStyledAttributes.getResourceId(0, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final CharSequence mo52926b() {
        return getResources().getString(C0126R.string.wallet_customer_selected, this.f95513a.getText());
    }
}
