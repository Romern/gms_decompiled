package p000;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* renamed from: cng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cng implements cdm {

    /* renamed from: a */
    public static final cdj f7098a = cdj.m3995a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new cmz());

    /* renamed from: b */
    public static final cdj f7099b = cdj.m3995a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new cna());

    /* renamed from: c */
    private final cne f7100c;

    /* renamed from: d */
    private final cgt f7101d;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r7 == 270) goto L_0x0082;
     */
    /* renamed from: a */
    public final cgj mo3743a(Object obj, int i, int i2, cdk cdk) {
        int i3 = i;
        int i4 = i2;
        cdk cdk2 = cdk;
        long longValue = ((Long) cdk2.mo3739a(f7098a)).longValue();
        if (longValue < 0 && longValue != -1) {
            StringBuilder sb = new StringBuilder(83);
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Integer num = (Integer) cdk2.mo3739a(f7099b);
        if (num == null) {
            num = 2;
        }
        cmb cmb = (cmb) cdk2.mo3739a(cmb.f7045f);
        if (cmb == null) {
            cmb = cmb.f7044e;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f7100c.mo3996a(mediaMetadataRetriever, obj);
            int intValue = num.intValue();
            int i5 = Build.VERSION.SDK_INT;
            Bitmap bitmap = null;
            if (i3 != Integer.MIN_VALUE) {
                if (!(i4 == Integer.MIN_VALUE || cmb == cmb.f7043d)) {
                    try {
                        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                        if (parseInt3 == 90) {
                        }
                        parseInt2 = parseInt;
                        parseInt = parseInt2;
                        float a = cmb.mo3966a(parseInt, parseInt2, i3, i4);
                        bitmap = mediaMetadataRetriever.getScaledFrameAtTime(longValue, intValue, Math.round(((float) parseInt) * a), Math.round(a * ((float) parseInt2)));
                    } catch (Throwable th) {
                    }
                }
            }
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            mediaMetadataRetriever.release();
            return clm.m4457a(bitmap, this.f7101d);
        } catch (RuntimeException e) {
            throw new IOException(e);
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* renamed from: a */
    public final boolean mo3744a(Object obj, cdk cdk) {
        return true;
    }

    public cng(cgt cgt, cne cne) {
        this.f7101d = cgt;
        this.f7100c = cne;
    }
}
