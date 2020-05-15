package p000;

import android.app.slice.SliceManager;
import android.content.Context;
import android.os.Build;

/* renamed from: apl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apl {

    /* renamed from: a */
    public final SliceManager f1930a;

    apl() {
    }

    public apl(SliceManager sliceManager) {
        this.f1930a = sliceManager;
    }

    /* renamed from: a */
    public static apl m1813a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return new apl((SliceManager) context.getSystemService(SliceManager.class));
    }
}
