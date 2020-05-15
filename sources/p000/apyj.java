package p000;

import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* renamed from: apyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apyj extends zzx {

    /* renamed from: a */
    protected static final String f85142a = apyj.class.getCanonicalName();

    public apyj() {
        super(45, "com.google.android.gms.safetynet.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (Log.isLoggable(f85142a, 6)) {
            Log.e(f85142a, "Must implement onGetService");
        }
    }
}
