package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cod implements cdm {

    /* renamed from: a */
    private final List f7153a;

    /* renamed from: b */
    private final cdm f7154b;

    /* renamed from: c */
    private final cgr f7155c;

    public cod(List list, cdm cdm, cgr cgr) {
        this.f7153a = list;
        this.f7154b = cdm;
        this.f7155c = cgr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cgj mo3743a(Object obj, int i, int i2, cdk cdk) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
        try {
            byte[] bArr2 = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f7154b.mo3743a(ByteBuffer.wrap(bArr), i, i2, cdk);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3744a(Object obj, cdk cdk) {
        return !((Boolean) cdk.mo3739a(coc.f7152b)).booleanValue() && cdf.m3989a(this.f7153a, (InputStream) obj, this.f7155c) == ImageHeaderParser$ImageType.GIF;
    }
}
