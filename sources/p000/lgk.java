package p000;

import android.content.Context;
import android.widget.inline.InlinePresentationSpec;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lgk */
final /* synthetic */ class lgk implements bmxj {

    /* renamed from: a */
    private final lgm f26042a;

    public lgk(lgm lgm) {
        this.f26042a = lgm;
    }

    public final Object apply(Object obj) {
        InlinePresentationSpec inlinePresentationSpec = (InlinePresentationSpec) obj;
        Context context = this.f26042a.f26044a;
        CharSequence b = lbi.m18883a(context).mo15386b(C0126R.string.autofill_scan_card);
        return lbi.m18881a(context, b, null, kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.quantum_ic_photo_camera_grey600_36, b), 2, inlinePresentationSpec);
    }
}
