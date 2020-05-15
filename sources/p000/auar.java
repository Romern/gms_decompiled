package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: auar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auar {

    /* renamed from: a */
    public int f91333a;

    /* renamed from: b */
    public String f91334b;

    /* renamed from: c */
    public String f91335c;

    /* renamed from: d */
    public String f91336d;

    /* renamed from: e */
    public String f91337e;

    /* renamed from: f */
    public int f91338f = 0;

    /* renamed from: g */
    public int f91339g = 0;

    /* renamed from: h */
    public bpan f91340h = bpan.UNKNOWN_PROMPT_TYPE;

    /* renamed from: i */
    public AccountInfo f91341i;

    /* renamed from: a */
    public final auau mo50344a() {
        int i = this.f91333a;
        String str = this.f91334b;
        String str2 = this.f91335c;
        String str3 = this.f91336d;
        String str4 = this.f91337e;
        int i2 = this.f91338f;
        int i3 = this.f91339g;
        bpan bpan = this.f91340h;
        AccountInfo accountInfo = this.f91341i;
        if (!TextUtils.isEmpty(str2)) {
            TextUtils.isEmpty(str3);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("requestCode", i);
        bundle.putString("message", str2);
        bundle.putString("positiveButtonText", str3);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("title", str);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("negativeButtonText", str4);
        }
        if (i2 > 0) {
            bundle.putInt("dialogIconResId", i2);
        }
        if (i3 > 0) {
            bundle.putInt("positiveIconResId", i3);
        }
        bundle.putInt("promptType", bpan.f135522y);
        if (accountInfo != null) {
            bundle.putParcelable("accountInfo", accountInfo);
        }
        auau auau = new auau();
        auau.setArguments(bundle);
        return auau;
    }
}
