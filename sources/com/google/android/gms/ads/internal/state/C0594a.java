package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.reward.C0573a;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.state.a */
final /* synthetic */ class C0594a implements Callable {

    /* renamed from: a */
    private final C0597d f8891a;

    public C0594a(C0597d dVar) {
        this.f8891a = dVar;
    }

    public final Object call() {
        Context a = C0573a.m5575a(this.f8891a.f8896b);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo b = svr.m36484b(a).mo26176b(a.getApplicationInfo().packageName, 4096);
            if (!(b.requestedPermissions == null || b.requestedPermissionsFlags == null)) {
                for (int i = 0; i < b.requestedPermissions.length; i++) {
                    if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(b.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return arrayList;
    }
}
