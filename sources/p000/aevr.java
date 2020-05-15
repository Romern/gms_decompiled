package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.people.data.AudienceMember;
import java.lang.ref.WeakReference;

/* renamed from: aevr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aevr implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ aevs f63916a;

    public aevr(aevs aevs) {
        this.f63916a = aevs;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        aevs aevs = this.f63916a;
        return new aevo(aevs.f63917a, ((AudienceMember) aevs.f63929d).f30297g);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        ImageView imageView;
        Bitmap bitmap = (Bitmap) obj;
        aevs aevs = this.f63916a;
        aevs.f63919c = bitmap;
        WeakReference weakReference = aevs.f63918b;
        if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
