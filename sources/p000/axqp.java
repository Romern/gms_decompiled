package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

/* renamed from: axqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqp implements axoo {

    /* renamed from: a */
    private final Status f96274a;

    /* renamed from: b */
    private final StorageInfoResponse f96275b;

    public axqp(Status status, StorageInfoResponse storageInfoResponse) {
        this.f96274a = status;
        this.f96275b = storageInfoResponse;
    }

    /* renamed from: b */
    public final StorageInfoResponse mo53314b() {
        return this.f96275b;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f96274a;
    }
}
