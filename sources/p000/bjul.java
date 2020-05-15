package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.wallet.common.moduleapicalltasks.PaySeFetchCardAsyncTaskLoaderRequest;
import com.google.android.wallet.common.moduleapicalltasks.PaySePerformSdkOperationAsyncTaskLoaderRequest;

/* renamed from: bjul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjul extends bjuh {

    /* renamed from: g */
    private final bjyg f123355g;

    public bjul(Context context, int i, LoaderManager loaderManager, bjug bjug, bjyg bjyg) {
        super(context, i, loaderManager, bjug);
        this.f123355g = bjyg;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (this.f123346b != 0) {
            return new bjum(this.f123345a, (PaySePerformSdkOperationAsyncTaskLoaderRequest) this.f123349e, this.f123355g);
        }
        return new bjui(this.f123345a, (PaySeFetchCardAsyncTaskLoaderRequest) this.f123349e, this.f123355g);
    }
}
