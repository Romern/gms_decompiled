package p000;

import android.content.Context;
import com.google.android.gms.cast_mirroring.CastSystemMirroringChimeraService;

/* renamed from: qbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qbq extends qbo {
    public qbq(qbn qbn, qbx qbx) {
        super("EndMirroringOperation", qbn, qbx);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f40899a.mo23877a(this.f40900b);
        CastSystemMirroringChimeraService.m22334a(context);
    }
}
