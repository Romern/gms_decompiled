package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IndexChimeraService extends sjh {

    /* renamed from: a */
    private acri f79085a;

    public IndexChimeraService() {
        super(new int[]{21, 30, 33, 32, 36, 66, 78}, new String[]{"com.google.android.gms.icing.INDEX_SERVICE"}, Collections.emptySet(), 1, 9);
    }

    /* renamed from: a */
    public final abrv mo43416a() {
        sdo.m34959a(this.f79085a);
        return this.f79085a.mo33016b();
    }

    /* renamed from: b */
    public final acpl mo43419b() {
        sdo.m34959a(this.f79085a);
        return this.f79085a.f60610c;
    }

    public final void onCreate() {
        absg.m48185a("%s: IndexService onCreate", "main");
        if (cemq.m137369f()) {
            this.f79085a = acri.m49734a("main", getApplicationContext());
            mo43416a();
            acni.m49503b(this);
        }
        super.onCreate();
    }

    public final void onDestroy() {
        absg.m48185a("%s: IndexService onDestroy", "main");
        acri acri = this.f79085a;
        if (acri != null) {
            acri.mo33015a();
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        absg.m48186a("%s: IndexService: onStartCommand with %s", "main", intent);
        if (intent == null || !"com.google.android.gms.icing.INDEX_SERVICE".equals(intent.getAction())) {
            return 2;
        }
        intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
        startService(intent);
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        absg.m48185a("%s: Unbind", "main");
        return false;
    }

    /* renamed from: a */
    public final void mo43417a(abyv abyv, sjj sjj, sjr sjr) {
        boolean z;
        boolean z2;
        try {
            abym abym = mo43416a().f58083s;
            synchronized (abyv.f58764e) {
                boolean equals = abyv.f58761b.equals("com.google.android.gms");
                String str = abyv.f58766g;
                if (str != null) {
                    z = str.contains(" getStringResource threw a NPE");
                } else {
                    z = false;
                }
                if (equals) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                String str2 = abyv.f58766g;
                if (str2 != null) {
                    if (!z2) {
                        throw new acaq(str2);
                    }
                }
            }
            if (z2 && abym != null) {
                abym.mo32447a("b28339005");
            }
            mo43418a(sjj, 0, sjr);
        } catch (acaq e) {
            absg.m48193b("Failed to check resources for package %s, %s", abyv.f58761b, e);
            mo43418a(sjj, 10, sjr);
        }
    }

    /* renamed from: a */
    public final void mo43418a(sjj sjj, int i, sjr sjr) {
        if (i != 0) {
            try {
                sjj.mo25644a(i, new Bundle());
            } catch (Throwable th) {
                absg.m48189a(th, "Service broker callback failed");
                mo43416a().f58083s.mo32447a("postinit_failed");
            }
        } else {
            sdo.m34959a(sjr);
            sjj.mo25645a(sjr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        String str;
        if (this.f79085a != null) {
            String str2 = getServiceRequest.f30230d;
            sgj sgj = (sgj) bmxu.m108565a(sgj.m35206a(getServiceRequest.f30228b), sgj.UNKNOWN);
            int callingUid = Binder.getCallingUid();
            int i = getServiceRequest.f30229c;
            Bundle bundle = getServiceRequest.f30233g;
            if (bundle != null) {
                str = bundle.getString("ComponentName");
            } else {
                str = null;
            }
            mo43419b().mo32995d(new acqx(this, bqbd.GET_CLIENT_SERVICE_INTERFACE, str2, sjj, str2, sgj, i, callingUid, str));
            return;
        }
        absg.m48184a("IndexService is unavailable on this device");
        sjj.mo25644a(16, new Bundle());
    }
}
