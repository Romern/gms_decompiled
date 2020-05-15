package p000;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.RequestFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahws {
    /* renamed from: a */
    public static final Bitmap m56804a(String str, int i, int i2) {
        String str2;
        RequestFuture newFuture = RequestFuture.newFuture();
        if (!cfoj.m141566p()) {
            srn srn = ahsd.f67925a;
        } else if (str.contains("=")) {
            srn srn2 = ahsd.f67925a;
        } else if (i == 0 || i2 == 0) {
            srn srn3 = ahsd.f67925a;
        } else {
            str2 = String.format(String.valueOf(str).concat("=w%s-h%s"), Integer.valueOf(i), Integer.valueOf(i2));
            rpr.m34216b().getRequestQueue().add(new ImageRequest(str2, newFuture, i, i2, ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.ARGB_8888, newFuture));
            srn srn4 = ahsd.f67925a;
            return (Bitmap) newFuture.get(5, TimeUnit.SECONDS);
        }
        str2 = str;
        rpr.m34216b().getRequestQueue().add(new ImageRequest(str2, newFuture, i, i2, ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.ARGB_8888, newFuture));
        try {
            srn srn42 = ahsd.f67925a;
            return (Bitmap) newFuture.get(5, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("FastPair: Unable to download image: %s", str);
            return null;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68420a("FastPair: Unable to download image: %s", str);
            return null;
        }
    }
}
