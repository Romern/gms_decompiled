package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: bddm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddm extends AsyncTask {

    /* renamed from: a */
    private final ParcelFileDescriptor f105373a;

    /* renamed from: b */
    private final bdep f105374b;

    public bddm(ParcelFileDescriptor parcelFileDescriptor, bdep bdep) {
        this.f105373a = parcelFileDescriptor;
        this.f105374b = bdep;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f105373a);
        try {
            return BitmapFactory.decodeStream(autoCloseInputStream);
        } finally {
            try {
                autoCloseInputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.f105374b.mo57931a((Bitmap) obj);
    }
}
