package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.android.volley.VolleyError;

/* renamed from: tif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tif extends tih {

    /* renamed from: c */
    private final String f46064c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public tif(Context context, String str) {
        super(context);
        sdo.m34969a(str, (Object) "URL must not be empty.");
        this.f46064c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            shj a = shj.m35270a(getContext());
            a.f44447g = 6400;
            byte[] a2 = a.mo25543a(getContext(), this.f46064c);
            return bmxv.m108567c(BitmapFactory.decodeByteArray(a2, 0, a2.length));
        } catch (VolleyError e) {
            return bmvz.f131120a;
        }
    }
}
