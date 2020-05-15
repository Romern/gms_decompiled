package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import java.io.File;

/* renamed from: nva */
final /* synthetic */ class nva implements opz {

    /* renamed from: a */
    private final nvk f36580a;

    /* renamed from: b */
    private final boolean f36581b;

    public nva(nvk nvk, boolean z) {
        this.f36580a = nvk;
        this.f36581b = z;
    }

    /* renamed from: a */
    public final void mo21217a(Bitmap bitmap) {
        nvk nvk = this.f36580a;
        boolean z = this.f36581b;
        if (bitmap != null) {
            File a = oar.m28301a(nvk.f36657c, bitmap, "screendump");
            if (z) {
                nvk.f36657c.startActivity(new Intent("android.intent.action.SEND").addFlags(268959744).addFlags(1).setType("image/*").putExtra("android.intent.extra.STREAM", C1136kk.m17966a(nvk.f36657c, "com.google.android.gms.fileprovider", a)));
            }
            bitmap.recycle();
        }
    }
}
