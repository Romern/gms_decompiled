package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.google.android.gms.locationsharing.settings.LocationShareView;
import java.lang.ref.WeakReference;

/* renamed from: aeuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeuw extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ LocationShareView f63873a;

    /* renamed from: b */
    private final Context f63874b;

    public aeuw(LocationShareView locationShareView, Context context) {
        this.f63873a = locationShareView;
        this.f63874b = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return aexn.m52651a(this.f63874b, ((String[]) objArr)[0]);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        ImageView imageView;
        Bitmap bitmap = (Bitmap) obj;
        WeakReference weakReference = new WeakReference(this.f63873a.f79703d);
        if (bitmap != null && (imageView = (ImageView) weakReference.get()) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
