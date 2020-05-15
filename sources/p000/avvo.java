package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: avvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvo extends rzu {
    public avvo(Context context) {
        super(context, 41, new int[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        if (!aytw.m84813a(this.f43904d) || chdn.f188491a.mo6606a().mo85144c()) {
            sbj.mo16678a(0, new avuu(getServiceRequest.f30230d, this.f43904d), (Bundle) null);
        } else {
            sbj.mo16678a(16, (IBinder) null, (Bundle) null);
        }
    }
}
