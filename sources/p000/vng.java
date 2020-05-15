package p000;

import android.view.View;
import com.google.android.gms.drive.p039ui.select.path.PathStack;
import com.google.android.gms.drive.p039ui.select.path.ViewPathElement;

/* renamed from: vng */
final /* synthetic */ class vng implements View.OnClickListener {

    /* renamed from: a */
    private final ViewPathElement f49576a;

    /* renamed from: b */
    private final vmq f49577b;

    public vng(vmq vmq, ViewPathElement viewPathElement) {
        this.f49577b = vmq;
        this.f49576a = viewPathElement;
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
    public void onClick(View view) {
        vmq vmq = this.f49577b;
        ViewPathElement viewPathElement = this.f49576a;
        int i = vnh.f49578t;
        if (vmq.f49531a.f49552h.mo18351b() == PathStack.f31210b) {
            PathStack pathStack = vmq.f49531a.f49552h;
            boolean z = true;
            sdo.m34971a(!pathStack.f31211c.isEmpty(), (Object) "Not initialized yet");
            if (pathStack.mo18351b() != PathStack.f31210b) {
                z = false;
            }
            sdo.m34971a(z, (Object) "Can only push a view on top of the root path element");
            pathStack.f31211c.add(viewPathElement);
            pathStack.mo18346a();
        }
    }
}
