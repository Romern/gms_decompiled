package p000;

import com.google.android.chimera.Activity;

/* renamed from: oze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oze {

    /* renamed from: a */
    public final /* synthetic */ ozg f38650a;

    public oze(ozg ozg) {
        this.f38650a = ozg;
    }

    /* renamed from: a */
    public final void mo22800a() {
        Activity activity = this.f38650a.getActivity();
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
