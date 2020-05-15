package p000;

import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CrashInfoParcel;

/* renamed from: npq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npq {

    /* renamed from: a */
    public String f36344a;

    /* renamed from: b */
    public final CarInfo f36345b;

    /* renamed from: c */
    public final CrashInfoParcel f36346c;

    /* renamed from: d */
    public String f36347d = "unknown";

    /* renamed from: e */
    public int f36348e = -1;

    /* renamed from: f */
    public String f36349f = null;

    public npq(CrashInfoParcel crashInfoParcel, CarInfo carInfo) {
        this.f36346c = crashInfoParcel;
        this.f36345b = carInfo;
    }

    /* renamed from: a */
    public final void mo21428a(String str) {
        if (str != null) {
            this.f36347d = str;
        }
    }

    public npq(Throwable th, CarInfo carInfo) {
        this.f36346c = new CrashInfoParcel(th);
        this.f36345b = carInfo;
    }
}
