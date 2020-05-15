package com.google.android.gms.stats.service;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppUsageApiChimeraService extends zzx {
    public AppUsageApiChimeraService() {
        super(193, "com.google.android.gms.appusage.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (p000.rpr.m34216b().getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", r5) != 0) goto L_0x003c;
     */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        String a = cgtd.f187715a.mo6606a().mo84472a();
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(a);
        Iterator it = simpleStringSplitter.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((String) it.next()).equals(str)) {
            }
        }
        aaac.mo16650a(16, (Bundle) null);
        aaac.mo16652a(new asge(new aaag(this, this.f56354e, this.f56355f)));
    }
}
