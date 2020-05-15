package p000;

import android.database.CursorWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkb {

    /* renamed from: a */
    public final List f49386a = new ArrayList();

    /* renamed from: b */
    public int f49387b = 0;

    /* renamed from: c */
    public final /* synthetic */ vkc f49388c;

    public vkb(vkc vkc) {
        this.f49388c = vkc;
    }

    /* renamed from: a */
    public final void mo28513a(Object obj) {
        try {
            vkc vkc = this.f49388c;
            List list = this.f49386a;
            int i = this.f49387b;
            this.f49387b = i + 1;
            vkc.mo28516a(list, obj, i);
        } catch (RuntimeException e) {
            List list2 = this.f49386a;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((CursorWindow) list2.get(i2)).close();
            }
            this.f49386a.clear();
            throw e;
        }
    }
}
