package com.google.android.gms.ads.signalsdk;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.signalsdk.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0899h extends C0893b implements aaai {

    /* renamed from: a */
    public static final Set f9452a;

    /* renamed from: b */
    public final VersionInfoParcel f9453b;

    /* renamed from: c */
    public final String f9454c;

    /* renamed from: d */
    private final Context f9455d;

    /* renamed from: e */
    private final Executor f9456e;

    /* renamed from: f */
    private final ScheduledExecutorService f9457f;

    /* renamed from: g */
    private final C0592a f9458g;

    static {
        HashSet hashSet = new HashSet();
        f9452a = hashSet;
        hashSet.add("afma_version");
    }

    public C0899h(Context context, VersionInfoParcel versionInfoParcel, String str, Executor executor, ScheduledExecutorService scheduledExecutorService, C0592a aVar) {
        this.f9455d = context;
        this.f9453b = versionInfoParcel;
        this.f9454c = str;
        this.f9456e = executor;
        this.f9457f = scheduledExecutorService;
        this.f9458g = aVar;
    }

    /* renamed from: a */
    public final void mo7122a(Bundle bundle, C0892a aVar) {
        if (!cbvg.f178334a.mo6606a().mo75416a() || cbvg.f178334a.mo6606a().mo75419d()) {
            aVar.mo7121a(2);
            return;
        }
        String nameForUid = this.f9455d.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (cbvg.f178334a.mo6606a().mo75418c()) {
            String b = cbvg.f178334a.mo6606a().mo75417b();
            StringBuilder sb = new StringBuilder(String.valueOf(nameForUid).length() + 2);
            sb.append(":");
            sb.append(nameForUid);
            sb.append(":");
            if (!b.contains(sb.toString())) {
                aVar.mo7121a(3);
                String valueOf = String.valueOf(nameForUid);
                C0633h.m5664a(valueOf.length() == 0 ? new String("Package is not allowed to access signal sdk: ") : "Package is not allowed to access signal sdk: ".concat(valueOf));
                return;
            }
        }
        bqgg doritosCookieAsynchronously = this.f9458g.getDoritosCookieAsynchronously(nameForUid);
        bqgg doritosCookiesAsynchronously = this.f9458g.getDoritosCookiesAsynchronously(nameForUid);
        bqgg a = bqdx.m112674a(bqga.m112779a(doritosCookieAsynchronously, doritosCookiesAsynchronously), new C0897f(this, bundle, doritosCookieAsynchronously, doritosCookiesAsynchronously, nameForUid), this.f9456e);
        if (cbvg.m128488b() > 0) {
            a = bqga.m112773a(a, cbvg.m128488b(), TimeUnit.MILLISECONDS, this.f9457f);
        }
        bqga.m112781a(bqdx.m112673a(bqdx.m112674a(bqfl.m112747c(a), C0895d.f9444a, this.f9456e), C0896e.f9445a, this.f9456e), new C0898g(aVar), this.f9456e);
    }
}
