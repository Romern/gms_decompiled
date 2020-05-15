package p000;

import android.hardware.Camera;
import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: akrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akrg implements Camera.PictureCallback {

    /* renamed from: a */
    final /* synthetic */ akrj f72479a;

    public akrg(akrj akrj) {
        this.f72479a = akrj;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        if (bArr != null) {
            akrj akrj = this.f72479a;
            int i = akrj.f72485t;
            akpo a = akrj.f72500p.mo39668b().mo39670a();
            OcrImage ocrImage = new OcrImage(bArr, camera.getParameters().getPictureFormat(), a.f72392a, a.f72393b, this.f72479a.f72500p.mo39667a());
            akrq akrq = this.f72479a.f72503s;
            akrq.f72512a.mo39739a((Runnable) new akrp(akrq, ocrImage));
        }
    }
}
