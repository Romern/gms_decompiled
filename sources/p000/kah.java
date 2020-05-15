package p000;

import android.os.Build;
import android.os.Bundle;

/* renamed from: kah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kah implements C1103jf {
    /* renamed from: a */
    public final void mo13690a(C1102je jeVar) {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        bundle.putInt("flags", 1);
        jeVar.mo13615a().putBundle("android.tv.EXTENSIONS", bundle);
    }
}
