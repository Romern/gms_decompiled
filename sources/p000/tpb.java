package p000;

import android.content.pm.ApplicationInfo;

/* renamed from: tpb */
final /* synthetic */ class tpb implements bmxz {

    /* renamed from: a */
    private final tph f46434a;

    public tpb(tph tph) {
        this.f46434a = tph;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return (applicationInfo.flags & 1) == 0 && !this.f46434a.f46440a.contains(applicationInfo.packageName);
    }
}
