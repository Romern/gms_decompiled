package p000;

import com.google.android.gms.location.ActivityTransition;

/* renamed from: aegc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aegc {

    /* renamed from: a */
    public int f63352a = -1;

    /* renamed from: b */
    private int f63353b = -1;

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
    public final ActivityTransition mo34121a() {
        boolean z = true;
        sdo.m34971a(this.f63352a != -1, (Object) "Activity type not set.");
        if (this.f63353b == -1) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Activity transition type not set.");
        return new ActivityTransition(this.f63352a, this.f63353b);
    }

    /* renamed from: a */
    public final void mo34122a(int i) {
        ActivityTransition.m66828a(i);
        this.f63353b = i;
    }
}
