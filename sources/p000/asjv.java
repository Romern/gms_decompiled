package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

/* renamed from: asjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asjv extends AsyncTask {

    /* renamed from: a */
    private final bepr f89099a;

    public asjv(bepr bepr) {
        this.f89099a = bepr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return BitmapFactory.decodeFile(((String[]) objArr)[0]);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bepr.a(android.graphics.Bitmap, boolean):void
     arg types: [android.graphics.Bitmap, int]
     candidates:
      bepr.a(double, double):int
      bepr.a(android.graphics.Rect, android.graphics.Paint):void
      bepr.a(android.graphics.Bitmap, boolean):void */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bepr bepr = this.f89099a;
        if (bepr != null && bitmap != null) {
            bepr.mo60914a(bitmap, false);
        }
    }
}
