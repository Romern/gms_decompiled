package p000;

import com.google.android.chimera.Activity;

/* renamed from: oby */
final /* synthetic */ class oby implements Runnable {

    /* renamed from: a */
    private final oze f37143a;

    public oby(oze oze) {
        this.f37143a = oze;
    }

    public final void run() {
        Activity activity = this.f37143a.f38650a.getActivity();
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
            return;
        }
        bnsi c = ozg.f38651d.mo68388c();
        c.mo68432a("oze", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("BottomSheet fragment dismiss called without being attached to activity");
    }
}
