package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* renamed from: amav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amav implements allh {

    /* renamed from: a */
    private final Status f74589a;

    /* renamed from: b */
    private final ParcelFileDescriptor f74590b;

    public amav(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.f74589a = status;
        this.f74590b = parcelFileDescriptor;
    }

    /* renamed from: b */
    public final ParcelFileDescriptor mo40486b() {
        return this.f74590b;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f74589a;
    }

    /* renamed from: c */
    public final void mo12460c() {
        ParcelFileDescriptor parcelFileDescriptor = this.f74590b;
        if (parcelFileDescriptor != null) {
            srz.m36170a(parcelFileDescriptor);
        }
    }
}
