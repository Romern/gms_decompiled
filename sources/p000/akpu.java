package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.base.OcrImage;

/* renamed from: akpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akpu implements akri {

    /* renamed from: a */
    public boolean f72400a = false;

    /* renamed from: b */
    final /* synthetic */ akpv f72401b;

    public akpu(akpv akpv) {
        this.f72401b = akpv;
    }

    /* renamed from: a */
    public final void mo39680a(OcrImage ocrImage) {
        Activity activity;
        if (!this.f72400a && (activity = this.f72401b.getActivity()) != null) {
            activity.runOnUiThread(new akpt(this));
            this.f72400a = true;
        }
    }
}
