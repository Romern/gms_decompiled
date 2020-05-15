package p000;

import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: djr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djr {
    /* renamed from: a */
    public static boolean m8670a() {
        int i = Build.VERSION.SDK_INT;
        return Process.is64Bit();
    }

    /* renamed from: b */
    public static List m8671b() {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (m8670a()) {
            Collections.addAll(arrayList, Build.SUPPORTED_64_BIT_ABIS);
        } else {
            Collections.addAll(arrayList, Build.SUPPORTED_32_BIT_ABIS);
        }
        return arrayList;
    }
}
