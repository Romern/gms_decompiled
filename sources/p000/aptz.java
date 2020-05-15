package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;

/* renamed from: aptz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptz extends bjdp {

    /* renamed from: a */
    public final long f84895a;

    /* renamed from: b */
    public boolean f84896b = false;

    /* renamed from: c */
    public final apty f84897c = new apty(this);

    /* renamed from: d */
    private final Context f84898d;

    /* renamed from: e */
    private final apga f84899e;

    static {
        aptz.class.getSimpleName();
    }

    public aptz(Context context, apga apga, long j) {
        this.f84898d = context;
        this.f84899e = apga;
        this.f84895a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47612a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        apga apga = this.f84899e;
        if (apga != null && !this.f84896b) {
            try {
                apga.mo47169a(status, harmfulAppsInfo);
                SafetyNetClientChimeraService.m92417a(harmfulAppsInfo);
            } catch (RemoteException e) {
            } finally {
                this.f84896b = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo47613a(boolean z, Bundle bundle) {
        if (!z) {
            try {
                mo47612a(new Status(12004), (HarmfulAppsInfo) null);
            } finally {
                skh.m35531a().mo25689a(this.f84898d, this.f84897c);
            }
        } else if (bundle != null) {
            long j = bundle.getLong("last_scan_time_ms", -1);
            int i = bundle.getInt("harmful_apps_count", 0);
            Parcelable[] parcelableArray = bundle.getParcelableArray("harmful_apps");
            if (i >= 0) {
                HarmfulAppsData[] harmfulAppsDataArr = new HarmfulAppsData[i];
                for (int i2 = 0; i2 < i; i2++) {
                    Bundle bundle2 = (Bundle) parcelableArray[i2];
                    harmfulAppsDataArr[i2] = new HarmfulAppsData(bundle2.getString("package_name"), bundle2.getByteArray("sha256"), aptw.m70995a(bundle2.getString("phas_exist_in_other_profiles")));
                }
                mo47612a(new Status(0), new HarmfulAppsInfo(j, harmfulAppsDataArr, bundle.getInt("hours_since_last_autoscan_with_pha"), bundle.getBoolean("phas_exist_in_other_profiles")));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            mo47612a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }
}
