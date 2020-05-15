package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: cmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmi implements ccx {
    /* renamed from: a */
    public final int mo3726a(InputStream inputStream, cgr cgr) {
        int a = new aka(inputStream).mo866a("Orientation", 1);
        if (a == 0) {
            return -1;
        }
        return a;
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3727a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3728a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
