package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: uzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uzn implements uyt {
    /* renamed from: a */
    public final String mo28120a() {
        return "customPropertiesExtraHolder";
    }

    /* renamed from: a */
    public final void mo28121a(DataHolder dataHolder) {
        Bundle bundle = dataHolder.f30166f;
        if (bundle != null) {
            synchronized (dataHolder) {
                DataHolder dataHolder2 = (DataHolder) bundle.getParcelable("customPropertiesExtraHolder");
                if (dataHolder2 != null) {
                    dataHolder2.close();
                    bundle.remove("customPropertiesExtraHolder");
                }
            }
        }
    }
}
