package p000;

import android.content.pm.PackageManager;

/* renamed from: aghx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghx extends agii {
    public aghx(agmn agmn) {
        super(agmn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35428a(String str) {
        int i;
        try {
            i = svr.m36484b(mo35542z()).mo26172a(str, 0).uid;
        } catch (PackageManager.NameNotFoundException e) {
            i = -1;
        }
        if (i != -1) {
            shr.m35313a(13056, i);
        } else {
            shr.m35316b(13056);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35429b() {
        shr.m35312a();
    }
}
