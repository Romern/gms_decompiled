package com.google.android.gms.cast.service;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastChimeraService extends zzx {

    /* renamed from: a */
    private static final AtomicInteger f29901a = new AtomicInteger(0);

    /* renamed from: b */
    private pes f29902b;

    /* renamed from: k */
    private aaag f29903k;

    public CastChimeraService() {
        super(new int[]{10, 161}, new String[]{"com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE", "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"}, Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        CastDevice castDevice;
        ptr ptr;
        IBinder iBinder;
        aaac aaac2 = aaac;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        int i = getServiceRequest2.f30228b;
        if (i == 10) {
            qav qav = new qav("CastService");
            qav.mo23669a(String.format(Locale.ROOT, "instance-%d", Integer.valueOf(f29901a.incrementAndGet())));
            Bundle bundle = getServiceRequest2.f30233g;
            try {
                castDevice = CastDevice.m22257b(bundle);
            } catch (Exception e) {
                qav.mo23676c(e, "CastDevice was not valid.", new Object[0]);
                castDevice = null;
            }
            if (castDevice != null) {
                boolean z = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED");
                boolean z2 = bundle.getBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED");
                long j = bundle.getLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0);
                String string = bundle.getString("connectionless_client_record_id");
                String str = getServiceRequest2.f30230d;
                qav.mo23670a("getCastService: %s", str);
                if (string == null) {
                    BinderWrapper binderWrapper = (BinderWrapper) bundle.getParcelable("listener");
                    if (binderWrapper == null || (iBinder = binderWrapper.f30210a) == null) {
                        ptr = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
                        ptr = queryLocalInterface instanceof ptt ? (ptt) queryLocalInterface : new ptr(iBinder);
                    }
                    if (ptr != null) {
                        String string2 = bundle.getString("last_application_id");
                        String string3 = bundle.getString("last_session_id");
                        qav.mo23858a("%s, connecting to device with lastApplicationId=%s, lastSessionId=%s", str, string2, string3);
                        new pyx(getApplicationContext(), aaac, castDevice, string2, string3, z, z2, ptr, getServiceRequest2.f30229c, str, j, qav, this.f29903k, this.f29902b.f38987k);
                        return;
                    }
                    qav.mo23677d("ICastDeviceControllerListener can't be null.", new Object[0]);
                    aaac2.mo16650a(10, (Bundle) null);
                } else if (!ccyt.f180279a.mo6606a().mo77084c()) {
                    aaac2.mo16650a(3, (Bundle) null);
                } else {
                    qav.mo23856a("%s, creating cxless service stub", str);
                    int i2 = getServiceRequest2.f30229c;
                    Context applicationContext = getApplicationContext();
                    aaag aaag = this.f29903k;
                    pes pes = this.f29902b;
                    new pyf(applicationContext, aaac, castDevice, z, z2, i2, str, j, qav, aaag, pes.f38984h, pes.f38987k.f39237a);
                }
            } else {
                qav.mo23677d("CastDevice can not be null.", new Object[0]);
                aaac2.mo16650a(10, (Bundle) null);
            }
        } else if (i != 161) {
            aaac2.mo16650a(1, (Bundle) null);
        } else {
            pes pes2 = this.f29902b;
            aaac2.mo16652a(new pxg(pes2.f38989m, this.f29903k, pes2.f38982f));
        }
    }

    public final void onCreate() {
        this.f29902b = pes.m30267a(getApplicationContext(), "CastService");
        this.f29903k = new aaag(this, this.f56354e, pes.m30266a());
    }

    public final void onDestroy() {
        pes pes = this.f29902b;
        if (pes != null) {
            pes.mo22984a("CastService");
            this.f29902b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17600a(Bundle bundle, IBinder iBinder) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        bundle.putParcelable("listener", new BinderWrapper(iBinder));
    }
}
