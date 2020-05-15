package p000;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: boe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boe {

    /* renamed from: a */
    public Bitmap f5231a;

    /* renamed from: b */
    public VolleyError f5232b;

    /* renamed from: c */
    public final List f5233c;

    /* renamed from: d */
    private final Request f5234d;

    public boe(Request request, ImageLoader.ImageContainer imageContainer) {
        ArrayList arrayList = new ArrayList();
        this.f5233c = arrayList;
        this.f5234d = request;
        arrayList.add(imageContainer);
    }

    /* renamed from: a */
    public final boolean mo3322a(ImageLoader.ImageContainer imageContainer) {
        this.f5233c.remove(imageContainer);
        if (this.f5233c.size() != 0) {
            return false;
        }
        this.f5234d.cancel();
        return true;
    }
}
