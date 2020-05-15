package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: apup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apup {

    /* renamed from: a */
    public final long f84938a;

    /* renamed from: b */
    public final int f84939b;

    /* renamed from: c */
    public final int f84940c;

    /* renamed from: d */
    public final apuo[] f84941d;

    /* renamed from: e */
    public final apuo[] f84942e;

    public apup(Bundle bundle) {
        this.f84938a = bundle.getLong("last_scan_time_ms", -1);
        this.f84939b = bundle.getInt("harmful_apps_count", 0);
        this.f84940c = bundle.getInt("recently_removed_apps_count", 0);
        Parcelable[] parcelableArray = bundle.getParcelableArray("harmful_apps");
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("recently_removed_apps");
        int i = this.f84939b;
        if (i < 0 || this.f84940c < 0) {
            throw new IllegalArgumentException();
        }
        if (i != 0) {
            this.f84941d = new apuo[i];
            for (int i2 = 0; i2 < this.f84939b; i2++) {
                this.f84941d[i2] = new apuo(false, (Bundle) parcelableArray[i2]);
            }
        } else {
            this.f84941d = null;
        }
        int i3 = this.f84940c;
        if (i3 != 0) {
            this.f84942e = new apuo[i3];
            for (int i4 = 0; i4 < this.f84940c; i4++) {
                this.f84942e[i4] = new apuo(true, (Bundle) parcelableArray2[i4]);
            }
            return;
        }
        this.f84942e = null;
    }

    /* renamed from: a */
    public final String mo47631a(Context context) {
        int i = this.f84939b;
        if (i == 1) {
            return context.getString(C0126R.string.security_status_harmful_app_detected);
        }
        if (i > 1) {
            return context.getString(C0126R.string.security_status_harmful_apps_detected);
        }
        long j = this.f84938a;
        if (j > 0) {
            return apus.m71060a(context, j);
        }
        return null;
    }

    public apup(HarmfulAppsInfo harmfulAppsInfo) {
        this.f84938a = harmfulAppsInfo.f107318a;
        HarmfulAppsData[] harmfulAppsDataArr = harmfulAppsInfo.f107319b;
        this.f84939b = harmfulAppsDataArr != null ? harmfulAppsDataArr.length : 0;
        this.f84941d = null;
        this.f84940c = 0;
        this.f84942e = null;
    }
}
