package p000;

import com.google.android.gms.drive.p039ui.select.path.PathElement;
import com.google.android.gms.drive.p039ui.select.path.PathStack;
import com.google.android.gms.drive.p039ui.select.path.SearchPathElement;
import java.util.List;

/* renamed from: vmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vmx implements adc {

    /* renamed from: a */
    final /* synthetic */ vmy f49538a;

    public vmx(vmy vmy) {
        this.f49538a = vmy;
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
    public final boolean mo417a(String str) {
        PathElement b = this.f49538a.f49552h.mo18351b();
        if ((b instanceof SearchPathElement) && !str.equals(((SearchPathElement) b).f31215a)) {
            PathStack pathStack = this.f49538a.f49552h;
            SearchPathElement searchPathElement = new SearchPathElement(str);
            sdo.m34971a(!pathStack.f31211c.isEmpty(), (Object) "Not initialized yet");
            sdo.m34971a(pathStack.mo18351b() instanceof SearchPathElement, (Object) "A search query can only replace another search query");
            List list = pathStack.f31211c;
            list.set(list.size() - 1, searchPathElement);
            pathStack.mo18346a();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo418b(String str) {
        mo417a(str);
    }
}
