package p000;

import android.widget.TextView;
import com.google.android.wallet.p097ui.common.FormEditText;

/* renamed from: bkhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkhe extends bkgj {

    /* renamed from: a */
    private final int f124217a;

    public bkhe(int i) {
        this.f124217a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        int n = ((FormEditText) textView).mo71938n();
        return (!mo65864b() && n == 0) || n >= this.f124217a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo65864b() {
        return true;
    }
}
