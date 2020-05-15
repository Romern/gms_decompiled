package p000;

import android.graphics.Bitmap;
import com.android.volley.NetworkError;
import com.android.volley.Response;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: bhqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqj implements Response.Listener, Response.ErrorListener {

    /* renamed from: a */
    final /* synthetic */ bhql f119328a;

    /* renamed from: b */
    final bhrl f119329b;

    public bhqj(bhql bhql, bhrl bhrl) {
        this.f119328a = bhql;
        this.f119329b = bhrl;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        PlacePhotoResult placePhotoResult;
        if ((volleyError instanceof NetworkError) || (volleyError instanceof TimeoutError) || (volleyError instanceof ServerError)) {
            placePhotoResult = new PlacePhotoResult(aemj.m52157b(7), null);
        } else {
            placePhotoResult = new PlacePhotoResult(aemj.m52157b(8), null);
        }
        this.f119329b.mo64187a(placePhotoResult);
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap.getConfig() == null && (bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null) {
            this.f119329b.mo64187a(new PlacePhotoResult(aemj.m52157b(8), null));
            return;
        }
        BitmapTeleporter bitmapTeleporter = new BitmapTeleporter(bitmap);
        bitmapTeleporter.mo17760a(this.f119328a.f119330a);
        this.f119329b.mo64187a(new PlacePhotoResult(Status.f30107a, bitmapTeleporter));
    }
}
