package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import java.io.IOException;

/* renamed from: anrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anrr extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ anrs f77526a;

    /* renamed from: b */
    private final String f77527b;

    /* renamed from: c */
    private final ImageView f77528c;

    /* renamed from: d */
    private final ParcelFileDescriptor f77529d;

    public anrr(anrs anrs, ParcelFileDescriptor parcelFileDescriptor, String str, ImageView imageView) {
        this.f77526a = anrs;
        this.f77529d = parcelFileDescriptor;
        this.f77527b = str;
        this.f77528c = imageView;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            Bitmap a = alls.m61238a(this.f77529d);
            Bitmap bitmap = null;
            if (a != null) {
                bitmap = ssa.m36185a(a);
                this.f77529d.close();
            }
            return bitmap;
        } finally {
            try {
                this.f77529d.close();
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f77526a.f77531b.mo15547a(this.f77527b, bitmap);
            anrs.m65071a(bitmap, this.f77528c);
        }
    }
}
