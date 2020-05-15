package p000;

import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;

/* renamed from: ywq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywq {

    /* renamed from: a */
    public DataType f54712a;

    /* renamed from: b */
    public int f54713b = -1;

    /* renamed from: c */
    public Device f54714c;

    /* renamed from: d */
    public Application f54715d;

    /* renamed from: e */
    public String f54716e = "";

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final DataSource mo30804a() {
        boolean z;
        boolean z2 = true;
        if (this.f54712a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "Must set data type");
        if (this.f54713b < 0) {
            z2 = false;
        }
        sdo.m34971a(z2, (Object) "Must set data source type");
        return new DataSource(this);
    }

    /* renamed from: a */
    public final void mo30805a(String str) {
        sdo.m34975b(str != null, "Must specify a valid stream name");
        this.f54716e = str;
    }
}
