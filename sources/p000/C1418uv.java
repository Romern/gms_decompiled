package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: uv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1418uv implements C1413uq {

    /* renamed from: a */
    public final ActionMode.Callback f27285a;

    /* renamed from: b */
    public final Context f27286b;

    /* renamed from: c */
    final ArrayList f27287c = new ArrayList();

    /* renamed from: d */
    final C1245ok f27288d = new C1245ok();

    public C1418uv(Context context, ActionMode.Callback callback) {
        this.f27286b = context;
        this.f27285a = callback;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.Menu, java.lang.Object, lz], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final Menu mo16098a(Menu r3) {
        Menu menu = (Menu) this.f27288d.get(r3);
        if (menu != null) {
            return menu;
        }
        C1461wk wkVar = new C1461wk(this.f27286b, r3);
        this.f27288d.put(r3, wkVar);
        return wkVar;
    }

    /* renamed from: a */
    public final void mo15960a(C1414ur urVar) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo15961a(C1414ur urVar, Menu menu) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo15962a(C1414ur urVar, MenuItem menuItem) {
        throw null;
    }

    /* renamed from: b */
    public final ActionMode mo16099b(C1414ur urVar) {
        int size = this.f27287c.size();
        for (int i = 0; i < size; i++) {
            C1419uw uwVar = (C1419uw) this.f27287c.get(i);
            if (uwVar != null && uwVar.f27290b == urVar) {
                return uwVar;
            }
        }
        C1419uw uwVar2 = new C1419uw(this.f27286b, urVar);
        this.f27287c.add(uwVar2);
        return uwVar2;
    }

    /* renamed from: b */
    public final void mo15963b(C1414ur urVar, Menu menu) {
        throw null;
    }
}
