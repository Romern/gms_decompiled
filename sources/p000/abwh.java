package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: abwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abwh extends rzu {

    /* renamed from: b */
    public static final Map f58628b = new HashMap();

    /* renamed from: a */
    public final acri f58629a;

    public abwh(Context context, acri acri) {
        super(context, 113, new int[0]);
        this.f58629a = acri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        if (this.f58629a != null) {
            String str = getServiceRequest.f30230d;
            this.f58629a.f60610c.mo32995d(new abwg(this, bqbd.GET_APP_INDEXING_SERVICE, str, sbj, str, getServiceRequest.f30229c, Binder.getCallingUid()));
            return;
        }
        absg.m48184a("AppIndexingService is unavailable on this device");
        sbj.mo16678a(16, (IBinder) null, new Bundle());
    }
}
