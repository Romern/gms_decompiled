package p000;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: aoox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoox extends aeaa {

    /* renamed from: a */
    final /* synthetic */ aooy f78625a;

    /* renamed from: b */
    private final String f78626b;

    /* renamed from: c */
    private final String f78627c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoox(aooy aooy, String str, String str2) {
        super("rcs");
        this.f78625a = aooy;
        this.f78626b = str;
        this.f78627c = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aooy.a(boolean, java.lang.String, java.lang.String):void
     arg types: [int, java.lang.String, java.lang.String]
     candidates:
      aooy.a(java.lang.String, java.lang.String, java.lang.String):boolean
      aoot.a(java.lang.String, java.lang.String, java.lang.String):boolean
      aooy.a(boolean, java.lang.String, java.lang.String):void */
    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f78625a.mo43142a(false, componentName == null ? this.f78626b : componentName.getPackageName(), this.f78627c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aooy.a(boolean, java.lang.String, java.lang.String):void
     arg types: [int, java.lang.String, java.lang.String]
     candidates:
      aooy.a(java.lang.String, java.lang.String, java.lang.String):boolean
      aoot.a(java.lang.String, java.lang.String, java.lang.String):boolean
      aooy.a(boolean, java.lang.String, java.lang.String):void */
    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        this.f78625a.mo43142a(true, componentName == null ? this.f78626b : componentName.getPackageName(), this.f78627c);
    }
}
