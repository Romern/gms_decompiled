package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.plus.sharebox.AddToCircleChimeraActivity;

/* renamed from: aoks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoks extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ AddToCircleChimeraActivity f78357a;

    /* renamed from: b */
    private final String f78358b;

    /* renamed from: c */
    private final ImageView f78359c;

    /* renamed from: d */
    private final ParcelFileDescriptor f78360d;

    public aoks(AddToCircleChimeraActivity addToCircleChimeraActivity, String str, ImageView imageView, ParcelFileDescriptor parcelFileDescriptor) {
        this.f78357a = addToCircleChimeraActivity;
        this.f78358b = str;
        this.f78359c = imageView;
        this.f78360d = parcelFileDescriptor;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return alls.m61238a(this.f78360d);
        } finally {
            srz.m36170a(this.f78360d);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AddToCircleChimeraActivity addToCircleChimeraActivity = this.f78357a;
            int i = AddToCircleChimeraActivity.f83427d;
            addToCircleChimeraActivity.f83429b.mo15547a(this.f78358b, bitmap);
            if (this.f78358b.equals(this.f78359c.getTag())) {
                this.f78359c.setImageBitmap(bitmap);
            }
        }
    }
}
