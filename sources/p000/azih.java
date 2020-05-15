package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: azih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azih implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f99471a;

    /* renamed from: b */
    final /* synthetic */ azii f99472b;

    public azih(azii azii, String str) {
        this.f99472b = azii;
        this.f99471a = str;
    }

    public final void run() {
        azii azii = this.f99472b;
        String str = this.f99471a;
        if (TextUtils.isEmpty(str)) {
            str = azii.f99474b.getContext().getResources().getString(C0126R.string.default_id_selector_category_title);
        }
        ((TextView) azii.f99473a.findViewById(C0126R.C0129id.category_text)).setText(str);
    }
}
