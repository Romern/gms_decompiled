package p000;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* renamed from: afvt */
public final /* synthetic */ class afvt implements alcq {

    /* renamed from: a */
    private final int f64850a;

    public afvt(int i) {
        this.f64850a = i;
    }

    /* renamed from: a */
    public final void mo34935a(SafeParcelable safeParcelable, Parcel parcel) {
        int i = this.f64850a;
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, ((TeleportingSyncRequest) safeParcelable).f80033a, i, false);
        see.m35062b(parcel, a);
    }
}
