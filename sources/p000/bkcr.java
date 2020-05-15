package p000;

import android.content.Context;
import android.content.res.TypedArray;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bkcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkcr {

    /* renamed from: a */
    final int f124018a;

    /* renamed from: b */
    final int f124019b;

    /* renamed from: c */
    public final int f124020c;

    /* renamed from: d */
    final int f124021d;

    private bkcr(int i, int i2, int i3, int i4) {
        this.f124018a = i;
        this.f124019b = i2;
        this.f124020c = i3;
        this.f124021d = i4;
    }

    /* renamed from: a */
    public static bkcr m105332a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.uicCameraDropDownDrawable});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return new bkcr(resourceId, C0126R.string.wallet_uic_ocr_button, 1, i);
    }

    /* renamed from: b */
    public static bkcr m105333b(Context context, int i) {
        if (i == 2) {
            return new bkcr(C0126R.C0127drawable.wallet_uic_nfc, C0126R.string.wallet_uic_nfc_button, 2, 2);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.uicNfcDrawable});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return new bkcr(resourceId, C0126R.string.wallet_uic_nfc_popup_title, 2, 1);
    }
}
