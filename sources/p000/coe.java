package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: coe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class coe implements coi {

    /* renamed from: a */
    private final Bitmap.CompressFormat f7156a = Bitmap.CompressFormat.JPEG;

    /* renamed from: a */
    public final cgj mo4032a(cgj cgj, cdk cdk) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) cgj.mo3842b()).compress(this.f7156a, 100, byteArrayOutputStream);
        cgj.mo3844d();
        return new cnj(byteArrayOutputStream.toByteArray());
    }
}
