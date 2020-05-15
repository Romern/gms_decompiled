package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: aaqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqs {

    /* renamed from: a */
    public final Context f28942a;

    /* renamed from: b */
    public final aamk f28943b;

    /* renamed from: c */
    private final aamf f28944c;

    public aaqs(Context context, aamf aamf, aamk aamk) {
        this.f28942a = context;
        this.f28944c = aamf;
        this.f28943b = aamk;
    }

    /* renamed from: a */
    public final void mo17188a(aaqx aaqx) {
        if (!ceck.m135993c() || !aytw.m84813a(this.f28942a)) {
            aaqx.mo17196a(new aaqq(this, aaqx));
        }
    }

    /* renamed from: b */
    public final boolean mo17191b(aamh aamh) {
        List<ResolveInfo> list;
        try {
            if (!aamh.mo17016a(this.f28944c, 8192).enabled) {
                return false;
            }
            Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
            intent.setPackage(aamh.f28457a);
            int i = aamh.f28458b;
            if (i == 0) {
                list = this.f28942a.getPackageManager().queryBroadcastReceivers(intent, 8192);
            } else {
                aajg.m21335a(this.f28942a);
                list = aajg.m21334a(intent, i, 8192);
            }
            if (list == null || list.isEmpty()) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo17189a(aaqx aaqx, aamh aamh) {
        if (ceck.m135993c() && aytw.m84813a(this.f28942a)) {
            return;
        }
        if (mo17191b(aamh)) {
            this.f28943b.mo17025a(aamh, 1);
        } else if (aaqx.mo17197b(aara.m21845a(aamh, 1))) {
            this.f28943b.mo17028c(aamh);
        }
    }

    /* renamed from: a */
    public final boolean mo17190a(aamh aamh) {
        int e = this.f28943b.mo17029e(aamh);
        int i = e - 1;
        if (e == 0) {
            throw null;
        } else if (i == 0) {
            this.f28943b.mo17028c(aamh);
            return false;
        } else if (i != 1) {
            return false;
        } else {
            this.f28943b.mo17025a(aamh, 3);
            return true;
        }
    }
}
