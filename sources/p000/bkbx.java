package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: bkbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkbx implements bkfa {

    /* renamed from: a */
    public final String f123967a;

    /* renamed from: b */
    public final String f123968b;

    /* renamed from: c */
    public final String f123969c;

    /* renamed from: d */
    public final String f123970d;

    /* renamed from: e */
    public final String f123971e;

    public bkbx(String str, String str2) {
        String str3;
        this.f123967a = str;
        this.f123968b = str2;
        String c = bjtl.m104578c(str2);
        if (TextUtils.isEmpty(c)) {
            Log.w("CountryCodeSelItem", String.format(Locale.US, "Unknown region code: %s", this.f123968b));
            c = this.f123968b;
        }
        this.f123969c = c;
        this.f123970d = String.format(Locale.US, "+%s", this.f123967a);
        if (!TextUtils.isEmpty(this.f123969c)) {
            str3 = String.format(Locale.US, "%s +%s", this.f123969c, this.f123967a);
        } else {
            str3 = this.f123967a;
        }
        this.f123971e = str3;
    }

    /* renamed from: a */
    public final String mo65687a() {
        return this.f123967a;
    }

    public final String toString() {
        return this.f123968b;
    }
}
