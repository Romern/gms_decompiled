package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import android.util.Log;
import com.android.location.provider.LocationProviderBase;
import com.android.location.provider.LocationRequestUnbundled;
import com.android.location.provider.ProviderPropertiesUnbundled;
import com.android.location.provider.ProviderRequestUnbundled;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bfpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfpq extends LocationProviderBase {

    /* renamed from: f */
    public static final /* synthetic */ int f114802f = 0;

    /* renamed from: g */
    private static final ProviderPropertiesUnbundled f114803g = ProviderPropertiesUnbundled.create(false, false, false, false, true, true, true, 1, 1);

    /* renamed from: a */
    public final aesh f114804a;

    /* renamed from: b */
    public final aesj f114805b;

    /* renamed from: c */
    public final Handler f114806c;

    /* renamed from: d */
    public final bhbx f114807d;

    /* renamed from: e */
    public long f114808e;

    @Deprecated
    public bfpq(aesh aesh) {
        super("FusedLocationProvider", f114803g);
        this.f114807d = new bhbx();
        this.f114808e = Long.MAX_VALUE;
        this.f114804a = aesh;
        this.f114806c = new bfpp(this, Looper.getMainLooper());
        this.f114805b = new aesj(aesh, new bfpo(this), Looper.getMainLooper());
    }

    /* renamed from: a */
    private static final int m97510a(int i) {
        if (i != 100) {
            if (i != 104) {
                if (i != 203) {
                    if (i == 200) {
                        return ErrorInfo.TYPE_SDU_MEMORY_FULL;
                    }
                    if (i != 201) {
                        return 102;
                    }
                }
            }
            return ErrorInfo.TYPE_SDU_FAILED;
        }
        return 100;
    }

    public final void onDisable() {
    }

    public final void onEnable() {
    }

    public final int onGetStatus(Bundle bundle) {
        return 2;
    }

    public final long onGetStatusUpdateTime() {
        return 0;
    }

    public final void onSetRequest(ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        List a = m97511a(providerRequestUnbundled, workSource);
        Handler handler = this.f114806c;
        handler.sendMessage(handler.obtainMessage(1, 0, 0, a));
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:44:0x00cf */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List], assign insn: PHI: (r7v2 ?) = (r7v4 ?), (r7v7 ?) binds: [B:44:0x00cf, B:30:0x00cb] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList], assign insn: 0x008f: CONSTRUCTOR  (r7v4 ? I:java.util.ArrayList) = (r4v2 int) call: java.util.ArrayList.<init>(int):void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r7v7, assign insn: ?: MOVE  (r7v7 ?) = (r7v3 java.util.List) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private static final List m97511a(ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        WorkSource workSource2;
        ? r7;
        int i;
        if (!providerRequestUnbundled.getReportLocation()) {
            return bngx.m109376e();
        }
        ArrayList arrayList = new ArrayList(providerRequestUnbundled.getLocationRequests().size());
        List<LocationRequestUnbundled> locationRequests = providerRequestUnbundled.getLocationRequests();
        int i2 = ErrorInfo.TYPE_SDU_MEMORY_FULL;
        long j = Long.MAX_VALUE;
        LocationRequestUnbundled locationRequestUnbundled = null;
        for (LocationRequestUnbundled locationRequestUnbundled2 : locationRequests) {
            int a = m97510a(locationRequestUnbundled2.getQuality());
            long interval = locationRequestUnbundled2.getInterval();
            if (interval < j || a < i2) {
                locationRequestUnbundled = locationRequestUnbundled2;
                i2 = a;
                j = interval;
            }
        }
        for (LocationRequestUnbundled locationRequestUnbundled3 : locationRequests) {
            int a2 = m97510a(locationRequestUnbundled3.getQuality());
            if (locationRequestUnbundled3 == locationRequestUnbundled) {
                int i3 = Build.VERSION.SDK_INT;
                workSource2 = workSource;
            } else {
                workSource2 = null;
            }
            LocationRequest a3 = LocationRequest.m66854a();
            a3.mo43554c(locationRequestUnbundled3.getInterval());
            a3.mo43553c(a2);
            LocationRequestInternal a4 = LocationRequestInternal.m66889a("overlay", a3);
            a4.f79426h = "com.google.android.gms.location";
            a4.mo43611a();
            if (workSource2 != null) {
                int a5 = stx.m36333a(workSource2);
                r7 = new ArrayList(a5);
                for (int i4 = 0; i4 < a5; i4++) {
                    if (stx.f45148a != null) {
                        try {
                            i = ((Integer) stx.f45148a.invoke(workSource2, Integer.valueOf(i4))).intValue();
                        } catch (Exception e) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    r7.add(new ClientIdentity(i, stx.m36337a(workSource2, i4)));
                }
            } else {
                r7 = Collections.emptyList();
            }
            a4.mo43613a((List) r7);
            int i5 = Build.VERSION.SDK_INT;
            try {
                a4.f79427i = locationRequestUnbundled3.isLocationSettingsIgnored();
            } catch (NoSuchMethodError e2) {
            }
            arrayList.add(a4);
        }
        return arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfpq(Context context) {
        super("FusedLocationProvider", f114803g);
        rjx c = aeie.m51878c(context);
        this.f114807d = new bhbx();
        this.f114808e = Long.MAX_VALUE;
        this.f114804a = null;
        this.f114806c = new bfpp(this, Looper.getMainLooper());
        this.f114805b = new aesj(c, new bfpn(this), Looper.getMainLooper());
    }
}
