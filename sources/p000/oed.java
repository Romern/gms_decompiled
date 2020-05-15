package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: oed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oed {
    /* renamed from: a */
    public static void m28558a(C1102je jeVar, String str) {
        if (ccqi.m131262b()) {
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", str);
            jeVar.mo13623a(bundle);
        }
    }
}
