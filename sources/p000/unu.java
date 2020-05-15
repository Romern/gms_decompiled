package p000;

import java.util.Arrays;
import java.util.Set;

/* renamed from: unu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class unu {

    /* renamed from: a */
    public final String f48344a;

    /* renamed from: b */
    public unp f48345b = null;

    /* renamed from: c */
    public boolean f48346c = false;

    /* renamed from: d */
    public boolean f48347d = false;

    /* renamed from: e */
    public Set f48348e = null;

    /* renamed from: f */
    public boolean f48349f = false;

    /* renamed from: g */
    public Object f48350g = null;

    /* renamed from: h */
    public unv f48351h = unv.CASCADE;

    /* renamed from: i */
    public final int f48352i;

    public unu(String str, int i) {
        this.f48344a = str;
        this.f48352i = i;
    }

    /* renamed from: a */
    public final void mo27737a() {
        this.f48347d = true;
    }

    /* renamed from: b */
    public final void mo27741b() {
        this.f48349f = true;
    }

    /* renamed from: c */
    public final void mo27742c() {
        this.f48346c = true;
    }

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
    public final void mo27738a(Object obj) {
        boolean z;
        if (this.f48350g == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "defaultValue already set");
        sdo.checkIfNull(obj, "null defaultValue");
        int i = this.f48352i - 1;
        if (i == 0) {
            sdo.m34975b(obj instanceof Number, "defaultValue for an INTEGER field has to be of type Number");
        } else if (i != 1) {
            sdo.m34975b(obj instanceof byte[], "defaultValue for a BLOB field has to be a byte array");
        } else {
            sdo.m34975b(obj instanceof String, "defaultValue for a TEXT field has to be of type String");
        }
        this.f48350g = obj;
    }

    /* renamed from: a */
    public final void mo27739a(unp unp, unv unv) {
        sdo.m34959a(unp);
        this.f48345b = unp;
        sdo.m34959a(unv);
        this.f48351h = unv;
    }

    /* renamed from: a */
    public final void mo27740a(unp... unpArr) {
        sdo.m34970a(this.f48348e == null);
        this.f48348e = new C1225nr(Arrays.asList(unpArr));
    }
}
