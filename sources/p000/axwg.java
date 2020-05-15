package p000;

import android.util.Log;
import java.util.List;

/* renamed from: axwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwg implements axxq {

    /* renamed from: a */
    public final List f96562a;

    /* renamed from: b */
    long f96563b;

    /* renamed from: c */
    final /* synthetic */ axwh f96564c;

    public axwg(axwh axwh, List list) {
        this.f96564c = axwh;
        this.f96562a = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axxv.a(axxi, int, boolean, java.lang.String):boolean
     arg types: [axxi, int, int, java.lang.String]
     candidates:
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, axue[]):axxu
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[], java.lang.String):java.util.Map
      axxv.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String):void
      axxv.a(axue, java.lang.String, java.lang.String, boolean):void
      axxv.a(axxi, int, boolean, java.lang.String):boolean */
    /* renamed from: a */
    public final void mo53667a(axxi axxi) {
        axwi axwi = this.f96564c.f96565a;
        int i = axwi.f96566A;
        if (!axwi.f96582g.mo53740a(axxi, 1, false, "cloud")) {
            this.f96562a.add(axxi);
        } else if (Log.isLoggable("CloudNode", 3)) {
            String valueOf = String.valueOf(axxi.f96647b.f96641c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("filtering data item for cloud: ");
            sb.append(valueOf);
            Log.d("CloudNode", sb.toString());
        }
        this.f96563b = axxi.f96651f;
    }
}
