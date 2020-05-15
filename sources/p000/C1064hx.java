package p000;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* renamed from: hx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1064hx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1078ij f20498a;

    /* renamed from: b */
    final /* synthetic */ C1223np f20499b;

    /* renamed from: c */
    final /* synthetic */ Object f20500c;

    /* renamed from: d */
    final /* synthetic */ C1065hy f20501d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f20502e;

    /* renamed from: f */
    final /* synthetic */ View f20503f;

    /* renamed from: g */
    final /* synthetic */ boolean f20504g;

    /* renamed from: h */
    final /* synthetic */ ArrayList f20505h;

    /* renamed from: i */
    final /* synthetic */ Object f20506i;

    /* renamed from: j */
    final /* synthetic */ Rect f20507j;

    public C1064hx(C1078ij ijVar, C1223np npVar, Object obj, C1065hy hyVar, ArrayList arrayList, View view, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f20498a = ijVar;
        this.f20499b = npVar;
        this.f20500c = obj;
        this.f20501d = hyVar;
        this.f20502e = arrayList;
        this.f20503f = view;
        this.f20504g = z;
        this.f20505h = arrayList2;
        this.f20506i = obj2;
        this.f20507j = rect;
    }

    public final void run() {
        C1223np a = C1066hz.m15059a(this.f20498a, this.f20499b, this.f20500c, this.f20501d);
        if (a != null) {
            this.f20502e.addAll(a.values());
            this.f20502e.add(this.f20503f);
        }
        Object obj = this.f20500c;
        if (obj != null) {
            this.f20498a.mo2397a(obj, this.f20505h, this.f20502e);
            View a2 = C1066hz.m15052a(a, this.f20501d, this.f20506i, this.f20504g);
            if (a2 != null) {
                C1078ij.m15503a(a2, this.f20507j);
            }
        }
    }
}
