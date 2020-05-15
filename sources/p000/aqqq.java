package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: aqqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqqq {

    /* renamed from: a */
    static final bnhe f86611a;

    /* renamed from: b */
    static final bnhe f86612b;

    /* renamed from: c */
    private final Context f86613c;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b(1, 1);
        bnha.mo67695b(2, 3);
        bnha.mo67695b(3, 2);
        bnha.mo67695b(4, 5);
        bnha.mo67695b(5, 4);
        bnha.mo67695b(6, 13);
        bnha.mo67695b(7, 6);
        bnha.mo67695b(8, 10);
        bnha.mo67695b(9, 19);
        bnha.mo67695b(10, 9);
        bnha.mo67695b(11, 14);
        bnha.mo67695b(12, 11);
        bnha.mo67695b(13, 8);
        bnha.mo67695b(14, 15);
        bnha.mo67695b(15, 16);
        bnha.mo67695b(16, 17);
        bnha.mo67695b(17, 18);
        bnha.mo67695b(18, 12);
        f86611a = bnha.mo67618b();
        bnha bnha2 = new bnha();
        bnha2.mo67695b(1, 1);
        bnha2.mo67695b(2, 2);
        f86612b = bnha2.mo67618b();
    }

    public aqqq(Context context) {
        this.f86613c = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.TextUtils.indexOf(java.lang.CharSequence, char):int}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.text.TextUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence):int}
      ClspMth{android.text.TextUtils.indexOf(java.lang.CharSequence, char):int} */
    /* renamed from: a */
    public final String mo48080a(String str, aqqp aqqp) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isDigitsOnly(str) && (str.length() <= 1 || TextUtils.indexOf((CharSequence) str, '-') != 0 || !TextUtils.isDigitsOnly(str.substring(1)))) {
            return str;
        }
        return this.f86613c.getResources().getString(aqqp.mo48079a(Integer.parseInt(str)));
    }
}
