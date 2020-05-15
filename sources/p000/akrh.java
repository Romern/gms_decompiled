package p000;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: akrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akrh implements Camera.PreviewCallback {

    /* renamed from: a */
    final /* synthetic */ akrj f72480a;

    /* renamed from: b */
    private final akpo f72481b;

    /* renamed from: c */
    private final int f72482c;

    /* renamed from: d */
    private final OcrImage f72483d;

    protected akrh(akrj akrj) {
        this.f72480a = akrj;
        this.f72481b = akrj.f72500p.mo39668b().mo39670a();
        int previewFormat = akrj.f72497m.getParameters().getPreviewFormat();
        this.f72482c = previewFormat;
        akpo akpo = this.f72481b;
        int i = akpo.f72392a * akpo.f72393b;
        int i2 = this.f72482c;
        akpo akpo2 = this.f72481b;
        this.f72483d = new OcrImage(new byte[(((i * ImageFormat.getBitsPerPixel(previewFormat)) / 8) + 16)], i2, akpo2.f72392a, akpo2.f72393b, this.f72480a.f72500p.mo39667a());
        akrj.f72497m.addCallbackBuffer(this.f72483d.getData());
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (bArr != null) {
            akrj akrj = this.f72480a;
            int i = akrj.f72485t;
            if (!akrj.f72499o.isEmpty()) {
                OcrImage ocrImage = this.f72483d;
                for (int i2 = 0; i2 < this.f72480a.f72499o.size(); i2++) {
                    ((akri) this.f72480a.f72499o.get(i2)).mo39680a(ocrImage);
                }
                Camera camera2 = this.f72480a.f72497m;
                if (camera2 != null) {
                    camera2.addCallbackBuffer(this.f72483d.getData());
                }
            }
        }
    }
}
