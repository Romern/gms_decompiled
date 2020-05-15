package p000;

import android.content.Context;
import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ijw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ijw implements rjz, rka {

    /* renamed from: e */
    private static final sek f21152e = new sek("ProfilePictureFetcher");

    /* renamed from: a */
    public int f21153a = 1;

    /* renamed from: b */
    private final String f21154b;

    /* renamed from: c */
    private final rkb f21155c;

    /* renamed from: d */
    private rkl f21156d;

    public ijw(Context context, String str, FragmentActivity fragmentActivity) {
        this.f21154b = str;
        allp allp = new allp();
        allp.f73626a = MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
        allq a = allp.mo40491a();
        rjy rjy = new rjy(context);
        rjy.mo24780a(allr.f73629a, a);
        if (fragmentActivity != null) {
            rjy.mo24775a(fragmentActivity, MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, this);
        }
        rkb b = rjy.mo24784b();
        this.f21155c = b;
        b.mo24790a((rjz) this);
        this.f21155c.mo24791a((rka) this);
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f21155c.mo24801e();
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        rjo rjo = allr.f73629a;
        amcy.m62631b(this.f21155c, this.f21154b, this.f21153a, 0).mo9458a(this.f21156d);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        sek sek = f21152e;
        int i = connectionResult.f30065c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("Failed to load Image due to connection failure : ");
        sb.append(i);
        sek.mo25416d(sb.toString(), new Object[0]);
    }

    /* renamed from: a */
    public final void mo13075a(rkl rkl) {
        bmxy.m108581a(rkl);
        this.f21156d = rkl;
        this.f21155c.mo24801e();
    }
}
