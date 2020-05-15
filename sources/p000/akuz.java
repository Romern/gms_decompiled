package p000;

import android.util.Log;
import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: akuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akuz extends akup {

    /* renamed from: a */
    private final akur f72939a;

    public akuz(akur akur) {
        this.f72939a = akur;
    }

    /* renamed from: a */
    public final akus mo39747a(OcrImage ocrImage) {
        akus d = this.f72939a.mo39879d();
        try {
            OcrImage ocrImage2 = (OcrImage) d.mo39880a();
            byte[] bArr = ocrImage2.f81266a;
            if (bArr == null) {
                ocrImage2.f81266a = new byte[ocrImage.f81266a.length];
                ocrImage2.f81267b = ocrImage.f81267b;
                ocrImage2.f81268c = ocrImage.f81268c;
                ocrImage2.f81269d = ocrImage.f81269d;
                ocrImage2.f81270e = ocrImage.f81270e;
            } else if (!(bArr.length == ocrImage.f81266a.length && ocrImage2.f81267b == ocrImage.f81267b && ocrImage2.f81268c == ocrImage.f81268c && ocrImage2.f81269d == ocrImage.f81269d && ocrImage2.f81270e == ocrImage.f81270e)) {
                String valueOf = String.valueOf(ocrImage);
                String valueOf2 = String.valueOf(ocrImage2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
                sb.append("can't copy from ");
                sb.append(valueOf);
                sb.append(" to ");
                sb.append(valueOf2);
                throw new IllegalStateException(sb.toString());
            }
            byte[] bArr2 = ocrImage.f81266a;
            System.arraycopy(bArr2, 0, ocrImage2.f81266a, 0, bArr2.length);
            return d;
        } catch (OutOfMemoryError e) {
            Log.w("CopyForBackgroundProcessor", "Ran out of memory for a frame, skipping");
            d.mo39881b();
            return null;
        }
    }

    /* renamed from: d */
    public final void mo39873d() {
        this.f72939a.mo39876b();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo39837d(Object obj) {
        OcrImage ocrImage = (OcrImage) obj;
        return true;
    }
}
