package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderResponse;
import java.util.Locale;

/* renamed from: bjuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjuh implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final Context f123345a;

    /* renamed from: b */
    public final int f123346b;

    /* renamed from: c */
    public final LoaderManager f123347c;

    /* renamed from: d */
    public ModuleApiCallTaskLoaderResponse f123348d;

    /* renamed from: e */
    public ModuleApiCallTaskLoaderRequest f123349e;

    /* renamed from: f */
    public bjug f123350f;

    public bjuh(Context context, int i, LoaderManager loaderManager, bjug bjug) {
        this.f123345a = context;
        this.f123346b = i;
        this.f123347c = loaderManager;
        this.f123350f = bjug;
    }

    /* renamed from: a */
    public final int mo65536a() {
        return this.f123346b != 0 ? 2 : 1;
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        throw new IllegalStateException(String.format(Locale.US, "Unsupported request type: %d.", Integer.valueOf(this.f123346b)));
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f123348d = (ModuleApiCallTaskLoaderResponse) obj;
        bjug bjug = this.f123350f;
        if (bjug != null) {
            bjug.mo52982m();
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
