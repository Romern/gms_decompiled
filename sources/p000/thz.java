package p000;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: thz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thz extends tih {

    /* renamed from: c */
    private final String f46056c;

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
    public thz(Context context, String str) {
        super(context);
        sdo.m34969a(str, (Object) "URI must not be empty.");
        this.f46056c = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        try {
            return bmxv.m108567c(MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), Uri.parse(this.f46056c)));
        } catch (Exception e) {
            return bmvz.f131120a;
        }
    }
}
