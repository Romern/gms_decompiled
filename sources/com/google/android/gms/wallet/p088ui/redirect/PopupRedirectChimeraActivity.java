package com.google.android.gms.wallet.p088ui.redirect;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wallet.ui.redirect.PopupRedirectChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PopupRedirectChimeraActivity extends bkja implements awcl, bkcs {

    /* renamed from: c */
    private Account f110592c;

    /* renamed from: d */
    private BuyFlowConfig f110593d;

    /* renamed from: a */
    public static Intent m94289a(Context context, bmki bmki, ArrayList arrayList, String str, int i, LogContext logContext, BuyFlowConfig buyFlowConfig, Account account) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), bkja.class.getName());
        Bundle bundle = new Bundle();
        bjvp.m104736a(bundle, "formProto", bmki);
        bjvp.m104737a(bundle, "successfullyValidatedApps", arrayList);
        bundle.putParcelable("parentLogContext", logContext);
        intent.putExtra("parcelableBundle", bundle);
        intent.putExtra("title", str);
        intent.putExtra("activityThemeResId", i);
        intent.putExtra("formThemeResId", (int) C0126R.style.WalletEmptyStyle);
        intent.putExtra("logToken", (byte[]) null);
        intent.setClassName(context, "com.google.android.gms.wallet.ui.redirect.PopupRedirectProxyActivity");
        Bundle bundleExtra = intent.getBundleExtra("parcelableBundle");
        bundleExtra.putParcelable("buyFlowConfig", buyFlowConfig);
        intent.putExtra("parcelableBundle", bundleExtra);
        intent.putExtra("account", account);
        return intent;
    }

    /* renamed from: cn */
    public final Account mo51878cn() {
        if (this.f110592c == null) {
            this.f110592c = (Account) getIntent().getParcelableExtra("account");
        }
        return this.f110592c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo60133e() {
        return C0126R.C0128layout.wallet_activity_popup_redirect_chimera;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.ui.redirect.PopupRedirectChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo60134g() {
        awia.m79981a((Activity) this, mo51881h(), awia.f94389k, true);
    }

    /* renamed from: h */
    public final BuyFlowConfig mo51881h() {
        if (this.f110593d == null) {
            this.f110593d = (BuyFlowConfig) getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        }
        return this.f110593d;
    }

    /* renamed from: j */
    public final int mo51883j() {
        BuyFlowConfig h = mo51881h();
        if (h != null) {
            return h.f110418b.f110406a;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkjc mo60132a(bmki bmki, ArrayList arrayList, int i, LogContext logContext) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getIntent().getBundleExtra("parcelableBundle").getParcelable("buyFlowConfig");
        bmkw bmkw = (bmkw) bjvp.m104729a(getIntent(), "webViewComponent", (bxxk) bmkw.f129898c.mo74142c(7));
        if (bmkw == null) {
            axcs axcs = new axcs();
            Bundle a = bkjc.m105926a(bmki, arrayList, i, logContext);
            a.putParcelable("buyFlowConfig", buyFlowConfig);
            axcs.setArguments(a);
            return axcs;
        }
        axdf axdf = new axdf();
        bmki bmki2 = bmkw.f129900a;
        if (bmki2 == null) {
            bmki2 = bmki.f129802w;
        }
        axdf.setArguments(bkjc.m105926a(bmki2, null, i, logContext));
        return axdf;
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if (i == 23) {
            Intent intent = new Intent();
            intent.putExtra("webViewComponentCallbackData", bundle);
            setResult(-1, intent);
            finish();
        } else if (i == 24) {
            Intent intent2 = new Intent();
            intent2.putExtra("webViewComponentErrorDetails", bundle);
            setResult(100, intent2);
            finish();
        } else if (i == 1) {
        } else {
            if (i == 10) {
                setResult(2);
                finish();
            } else if (i == 4) {
            } else {
                if (i == 5) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("errorDetails", bundle);
                    setResult(1, intent3);
                    finish();
                } else if (i == 7) {
                } else {
                    if (i != 8) {
                        StringBuilder sb = new StringBuilder(34);
                        sb.append("Unsupported formEvent: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (this.f124357b.mo52775bR()) {
                        Intent intent4 = new Intent();
                        bkjc bkjc = this.f124357b;
                        Bundle bundle2 = Bundle.EMPTY;
                        bxvd da = bmkj.f129827l.mo74144da();
                        bmdn bmdn = ((bmki) bkjc.f124069w).f129805b;
                        if (bmdn == null) {
                            bmdn = bmdn.f128831k;
                        }
                        if ((bmdn.f128833a & 1) != 0) {
                            bmdn bmdn2 = ((bmki) bkjc.f124069w).f129805b;
                            if (bmdn2 == null) {
                                bmdn2 = bmdn.f128831k;
                            }
                            String str = bmdn2.f128834b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj = (bmkj) da.f164949b;
                            str.getClass();
                            bmkj.f129829a |= 1;
                            bmkj.f129832d = str;
                        }
                        bmdn bmdn3 = ((bmki) bkjc.f124069w).f129805b;
                        if (bmdn3 == null) {
                            bmdn3 = bmdn.f128831k;
                        }
                        if ((bmdn3.f128833a & 4) != 0) {
                            bmdn bmdn4 = ((bmki) bkjc.f124069w).f129805b;
                            if (bmdn4 == null) {
                                bmdn4 = bmdn.f128831k;
                            }
                            bxtx bxtx = bmdn4.f128836d;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj2 = (bmkj) da.f164949b;
                            bxtx.getClass();
                            bmkj2.f129829a = 2 | bmkj2.f129829a;
                            bmkj2.f129833e = bxtx;
                        }
                        if (bkjc.mo66076w()) {
                            String str2 = bkjc.f124364f;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj3 = (bmkj) da.f164949b;
                            str2.getClass();
                            bmkj3.f129830b = 3;
                            bmkj3.f129831c = str2;
                        } else if (bkjc.mo66077x()) {
                            String str3 = bkjc.f124363e;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj4 = (bmkj) da.f164949b;
                            str3.getClass();
                            bmkj4.f129830b = 4;
                            bmkj4.f129831c = str3;
                        } else if (bkjc.mo66078z()) {
                            String str4 = bkjc.f124366h;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj5 = (bmkj) da.f164949b;
                            str4.getClass();
                            bmkj5.f129829a |= 128;
                            bmkj5.f129837i = str4;
                        } else if (bkjc.f124367i) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj6 = (bmkj) da.f164949b;
                            bmkj6.f129829a |= 64;
                            bmkj6.f129836h = true;
                        } else {
                            throw new IllegalStateException("Unknown RedirectFormValue state.");
                        }
                        bjym bjym = bkjc.f124365g;
                        if (bjym != null && bjym.mo65640b()) {
                            String a = bkjc.f124365g.mo65639a();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmkj bmkj7 = (bmkj) da.f164949b;
                            a.getClass();
                            bmkj7.f129829a |= 16;
                            bmkj7.f129834f = a;
                        }
                        bjvp.m104735a(intent4, "formValue", (bmkj) da.mo74062i());
                        setResult(-1, intent4);
                        finish();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8626a(Toolbar toolbar) {
        if (!(toolbar == null || toolbar.mo1699i() == null)) {
            TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{C0126R.attr.colorWalletActionBarForeground});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (!(color == 0 || toolbar.mo1699i() == null)) {
                C1173lt.m19599a(toolbar.mo1699i(), color);
            }
        }
        super.mo8626a(toolbar);
    }
}
