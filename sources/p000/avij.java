package p000;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: avij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avij implements avil {

    /* renamed from: a */
    private final WeakReference f93231a;

    public avij(Context context) {
        this.f93231a = new WeakReference(context);
    }

    /* renamed from: a */
    public final boolean mo51272a(Intent intent) {
        Context context = (Context) this.f93231a.get();
        if (context == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
