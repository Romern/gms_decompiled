package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;

/* renamed from: ccy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ccy implements cde {

    /* renamed from: a */
    final /* synthetic */ InputStream f6560a;

    public ccy(InputStream inputStream) {
        this.f6560a = inputStream;
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3729a(ccx ccx) {
        try {
            return ccx.mo3727a(this.f6560a);
        } finally {
            this.f6560a.reset();
        }
    }
}
