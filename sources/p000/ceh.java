package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* renamed from: ceh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceh implements cdv {

    /* renamed from: a */
    private final ParcelFileDescriptorRewinder$InternalRewinder f6611a;

    public ceh(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6611a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: b */
    public final void mo3766b() {
    }

    /* renamed from: c */
    public final ParcelFileDescriptor mo3765a() {
        return this.f6611a.rewind();
    }
}
