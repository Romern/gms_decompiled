package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimera.ContextThemeWrapper;

/* renamed from: qks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qks extends ContextThemeWrapper {

    /* renamed from: a */
    final /* synthetic */ qku f41620a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qks(qku qku, Context context) {
        super(context);
        this.f41620a = qku;
    }

    public final Resources getResources() {
        return this.f41620a.getResources();
    }
}
