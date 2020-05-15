package p000;

import android.view.View;
import java.util.ArrayList;

/* renamed from: ig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1074ig implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f20897a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f20898b;

    /* renamed from: c */
    final /* synthetic */ ArrayList f20899c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f20900d;

    /* renamed from: e */
    final /* synthetic */ ArrayList f20901e;

    public C1074ig(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f20897a = i;
        this.f20898b = arrayList;
        this.f20899c = arrayList2;
        this.f20900d = arrayList3;
        this.f20901e = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.f20897a; i++) {
            C1280ps.m19893a((View) this.f20898b.get(i), (String) this.f20899c.get(i));
            C1280ps.m19893a((View) this.f20900d.get(i), (String) this.f20901e.get(i));
        }
    }
}
