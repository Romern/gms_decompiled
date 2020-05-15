package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: nuy */
final /* synthetic */ class nuy implements Comparator {

    /* renamed from: a */
    private final int f36576a;

    public nuy(int i) {
        this.f36576a = i;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = this.f36576a;
        C1240of ofVar = (C1240of) obj;
        C1240of ofVar2 = (C1240of) obj2;
        bnsn bnsn = nvk.f36599a;
        if (i2 == 20) {
            i = ((Rect) ofVar.f26798a).top - ((Rect) ofVar2.f26798a).top;
            if (i == 0) {
                return ((oos) ofVar2.f26799b).mo22444i() - ((oos) ofVar.f26799b).mo22444i();
            }
        } else if (i2 == 19) {
            i = ((Rect) ofVar2.f26798a).bottom - ((Rect) ofVar.f26798a).bottom;
            if (i == 0) {
                return ((oos) ofVar2.f26799b).mo22444i() - ((oos) ofVar.f26799b).mo22444i();
            }
        } else if (i2 != 21) {
            i = ((Rect) ofVar.f26798a).left - ((Rect) ofVar2.f26798a).left;
            if (i == 0) {
                return ((oos) ofVar2.f26799b).mo22444i() - ((oos) ofVar.f26799b).mo22444i();
            }
        } else {
            i = ((Rect) ofVar2.f26798a).right - ((Rect) ofVar.f26798a).right;
            if (i == 0) {
                return ((oos) ofVar2.f26799b).mo22444i() - ((oos) ofVar.f26799b).mo22444i();
            }
        }
        return i;
    }
}
