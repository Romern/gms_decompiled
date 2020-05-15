package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.measurement.module.Analytics;

/* renamed from: fvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvr extends sji {

    /* renamed from: a */
    private final ClientContext f17370a;

    /* renamed from: d */
    private final fvd f17371d;

    public fvr(ClientContext clientContext, fvd fvd) {
        super(77, "AppInviteGetInvitation");
        this.f17370a = clientContext;
        this.f17371d = fvd;
    }

    /* renamed from: a */
    private static final void m12486a(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        Intent intent;
        Status status;
        Context context2 = context;
        String str = this.f17370a.f30215e;
        if (fzr.m12816c(context2, str)) {
            rtj a = fzr.m12811a(context2, str);
            String string = a.getString("deepLink", null);
            intent = new Intent("android.intent.action.VIEW").putExtra("com.google.android.gms.appinvite.REFERRAL_BUNDLE", fur.m12411a(a.getString("invitationId", null), string, a.getBoolean("isNewInstall", false))).setPackage(str);
            if (string != null) {
                try {
                    intent.setData(Uri.parse(string));
                } catch (Exception e) {
                }
            }
        } else {
            intent = null;
        }
        if (intent != null && !fzr.m12812a("hasReturnedInvitation", true, context2, str)) {
            status = Status.f30107a;
        } else {
            status = Status.f30111e;
        }
        fvd fvd = this.f17371d;
        if (fvd != null) {
            fvd.mo11390a(status, intent);
        }
        fzr.m12814b("hasReturnedInvitation", context2, str);
        if (!Status.f30111e.equals(status)) {
            if (str != null && fzr.m12816c(context2, str) && !fzr.m12812a("scionInstallEvent", true, context2, str) && fzr.m12820g(context2, str) != null) {
                fzr.m12814b("scionInstallEvent", context2, str);
                Bundle bundle = new Bundle();
                m12486a("source", fzr.m12810a("scionSource", context2, str), bundle);
                m12486a("medium", fzr.m12810a("scionMedium", context2, str), bundle);
                m12486a("campaign", fzr.m12820g(context2, str), bundle);
                Analytics.getInstance(context).mo44018a("fdl", "_cmp", bundle, str);
                m12486a("dynamic_link_link_id", fzr.m12810a("scionLinkId", context2, str), bundle);
                m12486a("dynamic_link_link_name", fzr.m12810a("scionLinkName", context2, str), bundle);
                bundle.putLong("dynamic_link_accept_time", fzr.m12817d(context2, str).longValue());
                if (fzr.m12818e(context2, str)) {
                    Analytics.getInstance(context).mo44018a("fdl", "dynamic_link_first_open", bundle, str);
                } else {
                    Analytics.getInstance(context).mo44018a("fdl", "dynamic_link_app_open", bundle, str);
                    if (fzr.m12819f(context2, str)) {
                        Analytics.getInstance(context).mo44018a("fdl", "dynamic_link_app_update", bundle, str);
                    }
                }
            }
            fuv fuv = new fuv(context.getApplicationContext(), null);
            int m = fzr.m12826m(context2, str);
            boolean e2 = fzr.m12818e(context2, str);
            boolean f = fzr.m12819f(context2, str);
            String h = fzr.m12821h(context2, str);
            int a2 = bzgs.m125778a(fzr.m12822i(context2, str));
            String j = fzr.m12823j(context2, str);
            String k = fzr.m12824k(context2, str);
            String l = fzr.m12825l(context2, str);
            bxvd da = boiu.f133232f.mo74144da();
            if (!TextUtils.isEmpty(str)) {
                bxvd da2 = boje.f133263c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boje boje = (boje) da2.f164949b;
                str.getClass();
                boje.f133265a |= 2;
                boje.f133266b = str;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boiu boiu = (boiu) da.f164949b;
                boje boje2 = (boje) da2.mo74062i();
                boje2.getClass();
                boiu.f133235b = boje2;
                boiu.f133234a |= 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boiu boiu2 = (boiu) da.f164949b;
            int i = m - 1;
            if (m != 0) {
                boiu2.f133236c = i;
                boiu2.f133234a |= 2;
                if (!TextUtils.isEmpty(j) || !TextUtils.isEmpty(k)) {
                    boiz a3 = fuv.m12432a(j, k, h, a2, "");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boiu boiu3 = (boiu) da.f164949b;
                    a3.getClass();
                    boiu3.f133237d = a3;
                    boiu3.f133234a |= 4;
                }
                int a4 = fuv.m12431a(e2, f);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boiu boiu4 = (boiu) da.f164949b;
                boiu4.f133238e = a4 - 1;
                boiu4.f133234a |= 8;
                fuv.mo11372a((boiu) da.mo74062i(), 12, l);
                fzr.m12813b(context2, this.f17370a.f30215e);
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
        fvd fvd = this.f17371d;
        if (fvd != null) {
            fvd.mo11390a(status, new Intent());
        }
    }
}
