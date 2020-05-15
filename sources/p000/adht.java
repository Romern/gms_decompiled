package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: adht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adht extends adfj {
    public adht() {
        this("getApplicationIcon");
    }

    public adht(String str) {
        super(str);
    }

    /* renamed from: a */
    public final Bundle mo33418a(adfi adfi, String str, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        return new Bundle();
    }

    public adht(byte[] bArr) {
        this("getWHApplicationInfo");
    }

    public adht(char[] cArr) {
        this("getApplicationLabel");
    }

    public adht(short[] sArr) {
        this("getWHPackageInfo");
    }
}
