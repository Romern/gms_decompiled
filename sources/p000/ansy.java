package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.plus.data.internal.PlusImageView;
import java.io.IOException;

/* renamed from: ansy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ansy extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ PlusImageView f77705a;

    /* renamed from: b */
    private final int f77706b;

    public ansy(PlusImageView plusImageView, int i) {
        this.f77705a = plusImageView;
        this.f77706b = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        double d;
        ParcelFileDescriptor parcelFileDescriptor = ((ParcelFileDescriptor[]) objArr)[0];
        try {
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            int i = this.f77706b;
            if (i > 0) {
                double width = (double) decodeFileDescriptor.getWidth();
                double height = (double) decodeFileDescriptor.getHeight();
                if (width <= height) {
                    double d2 = (double) i;
                    Double.isNaN(d2);
                    Double.isNaN(height);
                    d = d2 / height;
                } else {
                    double d3 = (double) i;
                    Double.isNaN(d3);
                    Double.isNaN(width);
                    d = d3 / width;
                }
                Double.isNaN(width);
                int i2 = (int) ((width * d) + 0.5d);
                Double.isNaN(height);
                decodeFileDescriptor = Bitmap.createScaledBitmap(decodeFileDescriptor, i2, (int) ((height * d) + 0.5d), true);
            } else {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException e) {
                    e = e;
                }
            }
            return decodeFileDescriptor;
            return decodeFileDescriptor;
        } finally {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e2) {
                Log.e("PlusImageView", "closed failed", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        PlusImageView plusImageView = this.f77705a;
        plusImageView.f82344d = (Bitmap) obj;
        if (plusImageView.f82342b) {
            plusImageView.setImageBitmap(plusImageView.f82344d);
        }
    }
}
