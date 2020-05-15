package p000;

import java.util.Locale;

/* renamed from: vbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbn extends vbk {

    /* renamed from: a */
    private String f48932a = null;

    /* renamed from: b */
    private boolean f48933b = false;

    public vbn(vbh vbh) {
        super(vbh);
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
    public final String mo28199a() {
        sdo.m34971a(this.f48933b, (Object) "Must not call this method before finish()");
        return this.f48932a;
    }

    public final String toString() {
        return String.format(Locale.US, "NextFeedMonitorProcessor[%s]", super.toString());
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
    public final void mo28195a(String str) {
        sdo.m34971a(!this.f48933b, (Object) "Already finished. Did you delegate from more than one FeedProcessor to this one?");
        this.f48932a = str;
        this.f48933b = true;
        super.mo28195a(str);
    }
}
