package p000;

import android.content.Context;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aqwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwv {

    /* renamed from: a */
    public final LoaderManager f87005a;

    /* renamed from: b */
    public final Context f87006b;

    /* renamed from: c */
    public final ClientContext f87007c;

    public aqwv(LoaderManager loaderManager, ClientContext clientContext, Context context) {
        this.f87005a = loaderManager;
        this.f87006b = context;
        this.f87007c = clientContext;
    }

    /* renamed from: a */
    public final void mo48201a(int i, bzid bzid, aqwu aqwu) {
        this.f87005a.restartLoader(i, null, new aqwt(this, bzid, aqwu));
    }
}
