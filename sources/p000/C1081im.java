package p000;

import android.widget.ListView;

/* renamed from: im */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1081im implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1084io f21331a;

    public C1081im(C1084io ioVar) {
        this.f21331a = ioVar;
    }

    public final void run() {
        ListView listView = this.f21331a.f21435b;
        listView.focusableViewAvailable(listView);
    }
}
