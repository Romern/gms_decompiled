package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* renamed from: bjpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpw {

    /* renamed from: a */
    public final String f123115a;

    /* renamed from: b */
    public final String f123116b;

    /* renamed from: c */
    public final String f123117c;

    /* renamed from: d */
    public final String f123118d;

    /* renamed from: e */
    private final String f123119e;

    public bjpw(String str, String str2) {
        String str3;
        this.f123116b = str;
        this.f123115a = str2;
        Locale locale = Locale.getDefault();
        String displayCountry = new Locale(locale.getLanguage(), str2, locale.getVariant()).getDisplayCountry();
        if (TextUtils.isEmpty(displayCountry)) {
            Log.w("CallingCodeSelectableItem", String.format(Locale.US, "Unknown region code: %s", this.f123115a));
            displayCountry = this.f123115a;
        }
        this.f123117c = displayCountry;
        this.f123119e = String.format(Locale.US, "+%s", this.f123116b);
        if (!TextUtils.isEmpty(this.f123117c)) {
            str3 = String.format(Locale.US, "%s +%s", this.f123117c, this.f123116b);
        } else {
            str3 = this.f123119e;
        }
        this.f123118d = str3;
    }

    public final String toString() {
        return this.f123115a;
    }
}
