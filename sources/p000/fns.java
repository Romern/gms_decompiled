package p000;

import android.content.pm.PackageManager;

/* renamed from: fns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fns extends fnw {
    public fns(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11025a(String str) {
        int i;
        try {
            i = svr.m36484b(mo10939f()).mo26172a(str, 0).uid;
        } catch (PackageManager.NameNotFoundException e) {
            mo10941g().mo11029b(5, "Couldn't find appInfo for package", e, null, null);
            i = -1;
        }
        shr.m35313a(512, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11026b() {
        shr.m35312a();
    }
}
