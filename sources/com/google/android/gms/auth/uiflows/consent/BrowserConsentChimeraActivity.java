package com.google.android.gms.auth.uiflows.consent;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.login.CustomWebView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserConsentChimeraActivity extends jxx implements jxq {

    /* renamed from: a */
    private static final sek f11490a = ght.m13171a("BrowserConsentActivity");

    /* renamed from: b */
    private static final imr f11491b = imr.m15727a("account");

    /* renamed from: c */
    private static final imr f11492c = imr.m15727a("url");

    /* renamed from: d */
    private static final imr f11493d = imr.m15727a("cookies");

    /* renamed from: e */
    private jxr f11494e;

    /* renamed from: a */
    public static Intent m7045a(Context context, Account account, String str, BrowserResolutionCookie[] browserResolutionCookieArr, rrq rrq) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity");
        ims ims = new ims();
        ims.mo13148b(f11491b, account);
        ims.mo13148b(f11492c, str);
        ims.mo13148b(f11493d, browserResolutionCookieArr);
        ims.mo13148b(jwz.f23428i, rrq.mo25045a());
        return className.putExtras(ims.f21367a);
    }

    /* renamed from: e */
    private final void m7046e() {
        f11490a.mo25412b("Consent declined.", new Object[0]);
        mo7874a(0, new Intent().putExtra(ConsentResult.f10615a, new ConsentResult(izj.PERMISSION_DENIED, null, null, iyb.REJECTED, null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "BrowserConsentActivity";
    }

    /* renamed from: c */
    public final void mo7860c() {
        m7046e();
    }

    public final void onBackPressed() {
        CustomWebView customWebView = this.f11494e.f23425c;
        if (customWebView.canGoBack()) {
            customWebView.goBack();
            return;
        }
        m7046e();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jxr jxr = (jxr) getSupportFragmentManager().findFragmentByTag("browser");
        this.f11494e = jxr;
        if (jxr == null) {
            Parcelable[] parcelableArr = (Parcelable[]) mo14202g().mo13146a(f11493d);
            BrowserResolutionCookie[] browserResolutionCookieArr = new BrowserResolutionCookie[0];
            if (parcelableArr != null) {
                browserResolutionCookieArr = new BrowserResolutionCookie[parcelableArr.length];
                for (int i = 0; i < parcelableArr.length; i++) {
                    browserResolutionCookieArr[i] = (BrowserResolutionCookie) parcelableArr[i];
                }
            }
            jxr jxr2 = new jxr();
            ims ims = new ims();
            ims.mo13148b(jxr.f23470d, (Account) mo14202g().mo13146a(f11491b));
            ims.mo13148b(jxr.f23471e, (String) mo14202g().mo13146a(f11492c));
            ims.mo13148b(jxr.f23472f, browserResolutionCookieArr);
            jxr2.setArguments(ims.f21367a);
            this.f11494e = jxr2;
            getSupportFragmentManager().beginTransaction().add(16908290, this.f11494e, "browser").commit();
        }
    }

    /* renamed from: b */
    public final void mo7897b(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public final void mo7896a(String str) {
        if (str == null) {
            f11490a.mo25416d("ConsentResult was null.", new Object[0]);
            m7046e();
            return;
        }
        Intent intent = new Intent();
        try {
            if (((bsnx) bxvk.m124016a(bsnx.f146342b, sqd.m35971c(str), bxus.m123744c())).f146344a) {
                f11490a.mo25412b("Consent granted.", new Object[0]);
                intent.putExtra(ConsentResult.f10615a, new ConsentResult(izj.SUCCESS, iyb.GRANTED, str));
                mo7874a(-1, intent);
                return;
            }
            f11490a.mo25414c("ConsentResult cookie present, but consent was not granted.", new Object[0]);
            m7046e();
        } catch (bxwf | IllegalArgumentException e) {
            f11490a.mo25416d("ConsentResult cookie string present, but was invalid and could not be parsed.", new Object[0]);
            m7046e();
        }
    }
}
