package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: bcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcl extends bcg {

    /* renamed from: g */
    private final azh f2985g;

    public bcl(ayo ayo, bcj bcj) {
        super(ayo, bcj);
        azh azh = new azh(ayo, this, new bbz("__container", bcj.f2963a, false));
        this.f2985g = azh;
        azh.mo2927a(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        super.mo2924a(rectF, matrix, z);
        this.f2985g.mo2924a(rectF, this.f2934a, z);
    }

    /* renamed from: b */
    public final void mo2991b(Canvas canvas, Matrix matrix, int i) {
        this.f2985g.mo2923a(canvas, matrix, i);
    }

    /* renamed from: b */
    public final void mo2992b(bau bau, int i, List list, bau bau2) {
        this.f2985g.mo2925a(bau, i, list, bau2);
    }
}
