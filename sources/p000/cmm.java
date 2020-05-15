package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.List;

/* renamed from: cmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmm implements cmn {

    /* renamed from: a */
    private final cgr f7071a;

    /* renamed from: b */
    private final List f7072b;

    /* renamed from: c */
    private final ceh f7073c;

    public cmm(ParcelFileDescriptor parcelFileDescriptor, List list, cgr cgr) {
        crb.m7382a(cgr);
        this.f7071a = cgr;
        crb.m7382a((Object) list);
        this.f7072b = list;
        this.f7073c = new ceh(parcelFileDescriptor);
    }

    /* renamed from: a */
    public final Bitmap mo3975a(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.f7073c.mo3765a().getFileDescriptor(), null, options);
    }

    /* renamed from: b */
    public final int mo3977b() {
        return cdf.m3987a(this.f7072b, new cdc(this.f7073c, this.f7071a));
    }

    /* renamed from: c */
    public final void mo3978c() {
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3976a() {
        return cdf.m3988a(this.f7072b, new cda(this.f7073c, this.f7071a));
    }
}
