package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: hv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1062hv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f20463a;

    /* renamed from: b */
    final /* synthetic */ C1078ij f20464b;

    /* renamed from: c */
    final /* synthetic */ View f20465c;

    /* renamed from: d */
    final /* synthetic */ C1018gh f20466d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f20467e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f20468f;

    /* renamed from: g */
    final /* synthetic */ ArrayList f20469g;

    /* renamed from: h */
    final /* synthetic */ Object f20470h;

    public C1062hv(Object obj, C1078ij ijVar, View view, C1018gh ghVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f20463a = obj;
        this.f20464b = ijVar;
        this.f20465c = view;
        this.f20466d = ghVar;
        this.f20467e = arrayList;
        this.f20468f = arrayList2;
        this.f20469g = arrayList3;
        this.f20470h = obj2;
    }

    public final void run() {
        Object obj = this.f20463a;
        if (obj != null) {
            this.f20464b.mo2406c(obj, this.f20465c);
            this.f20468f.addAll(C1066hz.m15058a(this.f20464b, this.f20463a, this.f20466d, this.f20467e, this.f20465c));
        }
        if (this.f20469g != null) {
            if (this.f20470h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f20465c);
                this.f20464b.mo2404b(this.f20470h, this.f20469g, arrayList);
            }
            this.f20469g.clear();
            this.f20469g.add(this.f20465c);
        }
    }
}
