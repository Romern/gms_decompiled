package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: cml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cml implements cmn {

    /* renamed from: a */
    private final cee f7068a;

    /* renamed from: b */
    private final cgr f7069b;

    /* renamed from: c */
    private final List f7070c;

    public cml(InputStream inputStream, List list, cgr cgr) {
        crb.m7382a(cgr);
        this.f7069b = cgr;
        crb.m7382a((Object) list);
        this.f7070c = list;
        this.f7068a = new cee(inputStream, cgr);
    }

    /* renamed from: a */
    public final Bitmap mo3975a(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(this.f7068a.mo3765a(), null, options);
    }

    /* renamed from: b */
    public final int mo3977b() {
        return cdf.m3990b(this.f7070c, this.f7068a.mo3765a(), this.f7069b);
    }

    /* renamed from: c */
    public final void mo3978c() {
        this.f7068a.f6607a.mo3979a();
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3976a() {
        return cdf.m3989a(this.f7070c, this.f7068a.mo3765a(), this.f7069b);
    }
}
