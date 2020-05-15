package p000;

import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ayji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayji {
    /* renamed from: a */
    public static void m84106a(DataHolder dataHolder, IInterface iInterface) {
        if (m84107a(iInterface)) {
            dataHolder.close();
        }
    }

    /* renamed from: a */
    public static boolean m84107a(IInterface iInterface) {
        return iInterface.asBinder() != iInterface;
    }
}
