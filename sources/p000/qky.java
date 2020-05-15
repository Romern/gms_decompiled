package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimera.ContextThemeWrapper;

/* renamed from: qky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qky extends ContextThemeWrapper {

    /* renamed from: a */
    final /* synthetic */ qla f41629a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qky(qla qla, Context context) {
        super(context);
        this.f41629a = qla;
    }

    public final Resources getResources() {
        return this.f41629a.getResources();
    }
}
