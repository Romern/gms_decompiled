package p000;

import android.content.Context;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: eov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eov {

    /* renamed from: a */
    private final Context f15444a;

    public eov(Context context) {
        this.f15444a = context;
    }

    /* renamed from: a */
    public final eox mo10378a(int i, int i2) {
        return mo10380a(i, i2, 0, 0);
    }

    /* renamed from: a */
    public final eox mo10379a(int i, int i2, int i3) {
        return mo10380a(i, i2, i3, 0);
    }

    /* renamed from: a */
    public final eox mo10380a(int i, int i2, int i3, int i4) {
        String str;
        bngs j = bngx.m109377j();
        j.mo67668c(this.f15444a.getString(C0126R.string.common_asm_google_account_title));
        if (i3 != 0) {
            j.mo67668c(this.f15444a.getString(i3));
        }
        String string = this.f15444a.getString(C0126R.string.as_settings_search_breadcrumb_delimeter);
        if (evi.m11187a(this.f15444a)) {
            str = TextUtils.join(string, j.mo67664a().mo67670d());
        } else {
            str = TextUtils.join(string, j.mo67664a());
        }
        eow eow = new eow();
        eow.f15449e = "com.google.android.gms.accountsettings.action.VIEW_SETTINGS_SEARCH_RESULT";
        String packageName = this.f15444a.getPackageName();
        if (packageName != null) {
            eow.f15450f = packageName;
            String str2 = "";
            eow.f15451g = str2;
            String num = Integer.toString(i);
            if (num != null) {
                eow.f15448d = num;
                String string2 = this.f15444a.getString(i2);
                if (string2 != null) {
                    eow.f15445a = string2;
                    eow.f15447c = str;
                    bngs j2 = bngx.m109377j();
                    if (i4 != 0) {
                        j2.mo67668c(this.f15444a.getString(i4));
                    }
                    j2.mo67668c(str);
                    eow.f15446b = j2.mo67664a();
                    if (eow.f15445a == null) {
                        str2 = " title";
                    }
                    if (eow.f15448d == null) {
                        str2 = str2.concat(" key");
                    }
                    if (eow.f15449e == null) {
                        str2 = String.valueOf(str2).concat(" intentAction");
                    }
                    if (eow.f15450f == null) {
                        str2 = String.valueOf(str2).concat(" intentTargetPackageName");
                    }
                    if (eow.f15451g == null) {
                        str2 = String.valueOf(str2).concat(" intentTargetClass");
                    }
                    if (str2.isEmpty()) {
                        return new eou(eow.f15445a, eow.f15446b, eow.f15447c, eow.f15448d, eow.f15449e, eow.f15450f, eow.f15451g);
                    }
                    String valueOf = String.valueOf(str2);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null intentTargetPackageName");
    }
}
