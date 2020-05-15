package p000;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: afku */
public final /* synthetic */ class afku implements alcq {

    /* renamed from: a */
    private final int f64315a;

    public afku(int i) {
        this.f64315a = i;
    }

    /* renamed from: a */
    public final void mo34935a(SafeParcelable safeParcelable, Parcel parcel) {
        int i = this.f64315a;
        MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) safeParcelable;
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, mdhFootprintsReadResult.f79990a, false);
        see.m35040a(parcel, 2, mdhFootprintsReadResult.f79991b, i, false);
        see.m35062b(parcel, a);
    }
}
