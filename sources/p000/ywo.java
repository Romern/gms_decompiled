package p000;

import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;

/* renamed from: ywo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywo {

    /* renamed from: a */
    public final DataSet f54710a;

    /* renamed from: b */
    public boolean f54711b = false;

    public ywo(DataSource dataSource) {
        sdo.m34966a(dataSource, "DataSource should be specified");
        this.f54710a = new DataSet(dataSource);
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
    public final DataSet mo30800a() {
        sdo.m34971a(!this.f54711b, (Object) "DataSet#build() should only be called once.");
        this.f54711b = true;
        return this.f54710a;
    }

    /* renamed from: a */
    public final void mo30801a(boolean z) {
        this.f54710a.f32001d = z;
    }
}
