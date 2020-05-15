package p000;

import android.app.admin.DevicePolicyManager;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: iwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwb implements ivy {

    /* renamed from: a */
    private final wdt f21901a;

    /* renamed from: b */
    private final qws f21902b;

    /* renamed from: c */
    private iwc f21903c;

    /* renamed from: d */
    private volatile ScheduledFuture f21904d;

    /* renamed from: e */
    private volatile ScheduledFuture f21905e;

    /* renamed from: f */
    private final ivv f21906f;

    public iwb(wdt wdt, ivv ivv, qws qws) {
        this.f21901a = wdt;
        this.f21906f = ivv;
        this.f21902b = qws;
    }

    /* renamed from: a */
    private final void m16234a() {
        ScheduledFuture scheduledFuture = this.f21904d;
        this.f21904d = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture scheduledFuture2 = this.f21905e;
        this.f21905e = null;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo13379a(ivx ivx) {
        Log.i("AuthZeroTouch", "Launching ZT flow.");
        if (!cdsb.m134797c()) {
            ivx.mo7875a(null);
        } else if (!cdsb.m134801g()) {
            Log.i("AuthZeroTouch", "ZT config not present.");
            ivx.mo7875a(null);
        } else {
            if (!cdsb.m134796b()) {
                wdx wdx = (wdx) this.f21901a;
                svq svq = new svq(wdx.f50567a);
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) wdx.f50567a.getSystemService("device_policy");
                int i = Build.VERSION.SDK_INT;
                if (svq.mo26180d("com.google.android.feature.ZERO_TOUCH") || devicePolicyManager.isDeviceProvisioned()) {
                    Log.i("AuthZeroTouch", "Device conditions not met.");
                    ivx.mo7875a(null);
                    return;
                }
            }
            if (this.f21902b != null) {
                bxvd da = cimg.f190708g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimg cimg = (cimg) da.f164949b;
                cimg.f190711b = 1;
                int i2 = cimg.f190710a | 1;
                cimg.f190710a = i2;
                cimg.f190712c = 1;
                int i3 = i2 | 2;
                cimg.f190710a = i3;
                cimg.f190713d = 1;
                cimg.f190710a = i3 | 4;
                bxvd da2 = cimh.f190716c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cimh cimh = (cimh) da2.f164949b;
                cimh.f190719b = 2;
                cimh.f190718a |= 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimg cimg2 = (cimg) da.f164949b;
                cimh cimh2 = (cimh) da2.mo74062i();
                cimh2.getClass();
                cimg2.f190714e = cimh2;
                cimg2.f190710a |= 16;
                this.f21902b.mo24335a(((cimg) da.mo74062i()).mo73642k()).mo24327b();
            }
            iwc iwc = new iwc(this.f21901a, ivx, this.f21906f, this.f21902b);
            this.f21903c = iwc;
            ivv ivv = this.f21906f;
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.requestFeatureAtAnyVersion(wdp.f50561a.f30068a);
            featureRequest.setUrgent(iwc);
            if (ivv.f21896a.requestFeatures(featureRequest)) {
                Log.i("AuthZeroTouch", "Module request succeeded.");
                snf a = snp.m35703a(1, 9);
                try {
                    this.f21904d = a.mo25814a(new ivz(this), cdsb.m134799e(), TimeUnit.SECONDS);
                    this.f21905e = a.mo25769a(new iwa(this), cdsb.m134798d(), cdsb.m134798d(), TimeUnit.SECONDS);
                } catch (RejectedExecutionException e) {
                    this.f21903c.onRequestComplete(-2);
                }
            } else {
                Log.i("AuthZeroTouch", "Module request failed.");
                ivx.mo7875a(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo13385a(boolean z) {
        if (this.f21903c == null) {
            return;
        }
        if (this.f21906f.mo13378a()) {
            this.f21903c.onRequestComplete(0);
            m16234a();
        } else if (z) {
            Log.e("AuthZeroTouch", "Module request timed out but module still not available.");
            this.f21903c.onRequestComplete(-1);
            m16234a();
        }
    }
}
