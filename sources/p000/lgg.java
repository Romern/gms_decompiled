package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;

/* renamed from: lgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lgg implements lgd {

    /* renamed from: a */
    public final Context f26034a;

    /* renamed from: b */
    private final Account f26035b;

    public lgg(Context context, Account account) {
        this.f26034a = context;
        this.f26035b = account;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0198  */
    /* renamed from: a */
    public final bngx mo15054a(lgc lgc) {
        Intent intent;
        bmxv bmxv;
        bnrd a = lgc.f26028d.mo14791b().keySet().iterator();
        while (a.hasNext()) {
            if (((kct) a.next()).mo14368a() instanceof Credential) {
                FillForm fillForm = lgc.f26027c;
                CharSequence text = this.f26034a.getText(C0126R.string.autofill_manage_passwords);
                kcz a2 = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_googleg_color_24, lrc.m19570a(new ContextThemeWrapper(this.f26034a, 2132019641)).mo15386b(C0126R.string.autofill_google_logo));
                RemoteViews a3 = lbj.m18888a(this.f26034a, text, null, a2, true, 1);
                bngs j = bngx.m109377j();
                bngs b = bngx.m109371b(fillForm.f11641a.size());
                bnre i = fillForm.f11641a.listIterator();
                while (i.hasNext()) {
                    FillField fillField = (FillField) i.next();
                    if (fillField.mo7943a(kpb.USERNAME) || fillField.mo7943a(kpb.PASSWORD)) {
                        b.mo67668c(fillField);
                    }
                }
                bngx a4 = b.mo67664a();
                bmxv a5 = lgc.mo15061a().mo66810a((bmxj) new lge(this, text, a2));
                if (!a4.isEmpty()) {
                    kby a6 = kbz.m17615a();
                    bnre i2 = a4.listIterator();
                    while (i2.hasNext()) {
                        a6.mo14355a(((FillField) i2.next()).f11631a, null, a3, a5);
                    }
                    Account account = this.f26035b;
                    if (ccip.m129869i()) {
                        intent = new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage("com.google.android.gms").putExtra("extra.screenId", 413).putExtra("extra.accountName", account.name);
                        if (cciw.m129955d()) {
                            intent = lio.m19198b(10002).putExtra("com.google.android.gms.autofill.extra.INTENT", intent);
                        }
                    } else {
                        intent = lio.m19191a();
                    }
                    a6.mo14353a(PendingIntent.getActivity(this.f26034a, 0, intent, 134217728, Bundle.EMPTY).getIntentSender());
                    kbz a7 = a6.mo14352a();
                    if (a7 != null) {
                        j.mo67668c(new lgb(a7, lbe.MANAGE_PASSWORDS));
                    }
                    bmxv a8 = lgc.mo15061a().mo66810a((bmxj) new lgf(this));
                    if (a8.mo66813a()) {
                        Context context = this.f26034a;
                        CharSequence b2 = lbj.m18891a(context).mo15386b(C0126R.string.autofill_manage_payment_methods);
                        RemoteViews a9 = lbj.m18887a(context, b2, (CharSequence) null, kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.wallet_card_general, b2));
                        kby a10 = kbz.m17615a();
                        bnre i3 = a4.listIterator();
                        while (i3.hasNext()) {
                            a10.mo14355a(((FillField) i3.next()).f11631a, null, a9, a8);
                        }
                        PendingIntent a11 = lio.m19189a(this.f26034a, lio.m19200c(10).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", lqx.m19547a(lgc.f26027c)));
                        if (a11 != null) {
                            a10.mo14353a(a11.getIntentSender());
                        }
                        kbz a12 = a10.mo14352a();
                        if (a12 != null) {
                            bmxv = bmxv.m108566b(new lgb(a12, lbe.KEYBOARD_CREDENTIAL_PICKER));
                            if (bmxv.mo66813a()) {
                                j.mo67668c((lgb) bmxv.mo66814b());
                            }
                        }
                    }
                    bmxv = bmvz.f131120a;
                    if (bmxv.mo66813a()) {
                    }
                }
                return j.mo67664a();
            }
        }
        return bngx.m109376e();
    }
}
