package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import com.google.android.gms.ads.internal.flag.C0390c;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.request.service.r */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0568r implements C0560j {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* renamed from: a */
    public static UsageInfo m5570a(Context context, String str) {
        rkb rkb;
        if (cbth.f178264a.mo6606a().mo75363a()) {
            return m5571b(context, str);
        }
        rkb rkb2 = null;
        try {
            rjy rjy = new rjy(context);
            rjy.mo24779a(fqj.f17127a);
            rkb = rjy.mo24784b();
            try {
                rkb.mo24801e();
                frd frd = new frd();
                frd.mo11189b();
                frd.f17151b = str;
                GetRecentContextCall$Response getRecentContextCall$Response = (GetRecentContextCall$Response) rkb.mo24787a((rle) new frc(frd.mo11188a(), rkb)).mo9456a(((Long) C0390c.f8323a.mo6621a()).longValue(), TimeUnit.MILLISECONDS);
                if (getRecentContextCall$Response.f9554a.mo17710c()) {
                    List list = getRecentContextCall$Response.f9555b;
                    if (list == null || list.isEmpty()) {
                        C0633h.m5664a("Fail to obtain recent context.");
                        rkb.mo24803g();
                        return null;
                    }
                    UsageInfo usageInfo = (UsageInfo) getRecentContextCall$Response.f9555b.get(0);
                    rkb.mo24803g();
                    return usageInfo;
                }
                C0633h.m5664a("Fail to obtain recent context call.");
                rkb.mo24803g();
                return null;
            } catch (SecurityException e) {
            }
        } catch (SecurityException e2) {
            rkb = null;
            try {
                C0633h.m5672d("Fail to get recent context.");
                if (rkb == null) {
                    return null;
                }
                rkb.mo24803g();
                return null;
            } catch (Throwable th) {
                th = th;
                rkb2 = rkb;
                if (rkb2 != null) {
                    rkb2.mo24803g();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (rkb2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static UsageInfo m5571b(Context context, String str) {
        frd frd = new frd();
        frd.mo11189b();
        frd.f17151b = str;
        GetRecentContextCall$Request a = frd.mo11188a();
        rjx a2 = fqj.m12175a(context);
        roz b = rpa.m34196b();
        b.f43472a = new ftn(a);
        try {
            List list = (List) aucu.m76783a(a2.mo24701a(b.mo24977a()), ((Long) C0390c.f8323a.mo6621a()).longValue(), TimeUnit.MILLISECONDS);
            if (!list.isEmpty()) {
                return (UsageInfo) list.get(0);
            }
            return null;
        } catch (ExecutionException e) {
            return null;
        } catch (InterruptedException e2) {
            Thread.interrupted();
            return null;
        } catch (TimeoutException e3) {
            return null;
        }
    }
}
