package p000;

import android.content.Intent;

/* renamed from: akvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvm {
    /* renamed from: a */
    public static Intent m60559a(String str, String str2) {
        sdo.m34977c(str);
        sdo.m34977c(str2);
        return new Intent().setAction("com.google.android.gms.octarine.VIEW").setPackage("com.google.android.gms").putExtra("extra.url", str).putExtra("extra.accountName", str2);
    }

    /* renamed from: a */
    public static Intent m60560a(String str, String str2, String str3, int i, int i2) {
        return m60559a(str, str2).putExtra("extra.initialTitleType", i).putExtra("extra.initialAccountDisplay", i2).putExtra("extra.callingPackageName", str3);
    }
}
