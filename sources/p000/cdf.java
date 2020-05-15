package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: cdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdf {
    /* renamed from: a */
    public static int m3987a(List list, cdd cdd) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = cdd.mo3731a((ccx) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m3990b(List list, InputStream inputStream, cgr cgr) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cmr(inputStream, cgr);
        }
        inputStream.mark(5242880);
        return m3987a(list, new cdb(inputStream, cgr));
    }

    /* renamed from: a */
    public static ImageHeaderParser$ImageType m3988a(List list, cde cde) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType a = cde.mo3729a((ccx) list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public static ImageHeaderParser$ImageType m3989a(List list, InputStream inputStream, cgr cgr) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new cmr(inputStream, cgr);
        }
        inputStream.mark(5242880);
        return m3988a(list, new ccy(inputStream));
    }
}
