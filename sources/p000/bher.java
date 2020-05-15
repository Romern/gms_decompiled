package p000;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: bher */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bher implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SwipeDismissBehavior f118410a;

    /* renamed from: b */
    private final View f118411b;

    /* renamed from: c */
    private final boolean f118412c;

    public bher(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f118410a = swipeDismissBehavior;
        this.f118411b = view;
        this.f118412c = z;
    }

    public final void run() {
        bhmx bhmx;
        C1338rw rwVar = this.f118410a.f151056a;
        if (rwVar != null && rwVar.mo15834b()) {
            C1280ps.m19891a(this.f118411b, this);
        } else if (this.f118412c && (bhmx = this.f118410a.f151061f) != null) {
            bhmx.mo64004a(this.f118411b);
        }
    }
}
