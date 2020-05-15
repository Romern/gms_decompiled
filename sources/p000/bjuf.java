package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;

/* renamed from: bjuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuf implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public final Handler f123338a = new adzt();

    /* renamed from: b */
    public bmnj f123339b;

    /* renamed from: c */
    public String f123340c;

    /* renamed from: d */
    public final LoaderManager f123341d;

    /* renamed from: e */
    public bkdb f123342e;

    /* renamed from: f */
    public bjue f123343f = null;

    /* renamed from: g */
    private final Context f123344g;

    public bjuf(Context context, LoaderManager loaderManager, bkdb bkdb) {
        this.f123344g = context;
        this.f123341d = loaderManager;
        this.f123342e = bkdb;
    }

    /* renamed from: a */
    public final boolean mo65534a() {
        return this.f123340c == null && this.f123341d.getLoader(1) != null && this.f123341d.getLoader(1).isStarted();
    }

    /* renamed from: b */
    public final void mo65535b() {
        if (this.f123341d.getLoader(1) != null) {
            this.f123341d.destroyLoader(1);
        }
        this.f123338a.removeCallbacksAndMessages(null);
        this.f123343f = null;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new bjud(this.f123344g, this.f123339b);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f123340c = (String) obj;
        bjue bjue = this.f123343f;
        if (bjue != null) {
            bjue.run();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
