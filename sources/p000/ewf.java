package p000;

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.chimera.GoogleSettingsItem;
import com.google.android.gms.feedback.ThemeSettings;
import java.io.IOException;

/* renamed from: ewf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ewf extends evn {

    /* renamed from: c */
    private final bswr f15920c;

    /* renamed from: d */
    private final ffk f15921d;

    /* renamed from: e */
    private final Fragment f15922e;

    public ewf(bswr bswr, ffk ffk, Fragment fragment, ewh ewh, ewg ewg) {
        super(ewh, ewg);
        this.f15920c = bswr;
        this.f15921d = ffk;
        this.f15922e = fragment;
    }

    /* renamed from: a */
    public static Intent m11220a(String str) {
        return wgc.m41905a(new wge(str, "asm"));
    }

    /* renamed from: b */
    public static Intent m11222b(String str) {
        return new Intent("com.google.android.gms.people.profile.ACTION_SET_AVATAR").putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", str);
    }

    /* renamed from: c */
    public static Intent m11224c(String str) {
        return new Intent("android.intent.action.VIEW", Uri.fromParts("google.maps.timeline", "", null)).setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity")).putExtra("account_name", str);
    }

    /* renamed from: d */
    public static Intent m11225d(String str) {
        return new Intent().setClassName(rpr.m34216b().getApplicationContext(), "com.google.android.gms.auth.account.otp.OtpActivity").putExtra("account_name", str);
    }

    /* renamed from: a */
    public static boolean m11221a(Intent intent) {
        return spn.m35860a(rpr.m34216b().getApplicationContext(), intent);
    }

    /* renamed from: b */
    public static void m11223b() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public final void mo10533a() {
        int i;
        adyl.m51422a();
        try {
            bswr bswr = this.f15920c;
            switch (bswr.f147482b) {
                case 2:
                    String b = ffr.m11621b(this.f15921d);
                    Uri build = Uri.parse(cbri.f178135a.mo6606a().mo75267q()).buildUpon().appendQueryParameter("hl", fgd.m11651b()).build();
                    Spanned fromHtml = Html.fromHtml(this.f15922e.getContext().getString(C0126R.string.accountsettings_set_avatar_dialog_message, build.toString()));
                    Context context = this.f15922e.getContext();
                    if (!adyf.m51386a(eot.f15436a)) {
                        i = C0126R.style.AsCenteredMaterialDialogThemeLight;
                    } else {
                        i = C0126R.style.AsCenteredMaterialDialogThemeDark;
                    }
                    bhia bhia = new bhia(context, i);
                    bhia.mo63780b(true);
                    bhia.mo63791f(C0126R.string.accountsettings_set_avatar_dialog_title);
                    bhia.mo63783c(fromHtml);
                    bhia.mo63781c(17039360, new evx(this));
                    bhia.mo63786d((int) C0126R.string.accountsettings_set_avatar_dialog_positive_button, new evy(this, b));
                    C1350sh b2 = bhia.mo15904b();
                    b2.setOnShowListener(new evz(b2, build));
                    b2.setOnCancelListener(new ewa(this));
                    b2.show();
                    return;
                case 3:
                    mo10550a(m11220a(ffr.m11621b(this.f15921d)), 4);
                    return;
                case 4:
                    mo10550a(m11224c(ffr.m11621b(this.f15921d)), 5);
                    return;
                case 5:
                    mo10550a(m11225d(ffr.m11621b(this.f15921d)), 8);
                    return;
                case 6:
                case 8:
                case 9:
                case 13:
                default:
                    this.f15885b.mo10534a(new IllegalArgumentException("Unknown native action ID"));
                    return;
                case 7:
                    bsvy bsvy = bswr.f147483c;
                    if (bsvy == null) {
                        bsvy = bsvy.f147355c;
                    }
                    ffk ffk = this.f15921d;
                    wwu wwu = new wwu();
                    if (bsvy.f147358b) {
                        wwu.mo29497b(wwr.m42392a(this.f15922e.getActivity().getContainerActivity()));
                    }
                    if (ffr.m11620a(ffk)) {
                        wwu.f51496a = ffk.f16458a;
                    }
                    if (!stm.m36302d(bsvy.f147357a)) {
                        wwu.f51499d = bsvy.f147357a;
                    }
                    ThemeSettings themeSettings = new ThemeSettings();
                    themeSettings.f31623a = 0;
                    themeSettings.f31624b = ThemeSettings.m23410a(this.f15922e.getActivity().getContainerActivity());
                    wwu.f51501f = themeSettings;
                    aucb a = wvu.m42361a(this.f15922e.getActivity().getContainerActivity()).mo29487a(wwu.mo29490a());
                    a.mo50376a(this.f15922e.getActivity(), new ewb(this));
                    a.mo50375a(this.f15922e.getActivity(), new ewc(this));
                    return;
                case 10:
                    m11223b();
                    adyd.m51363a(this.f15922e.getContext()).mo33913a("com.google", null, null, null, null, new evw(this));
                    return;
                case 11:
                    bswc bswc = bswr.f147484d;
                    if (bswc == null) {
                        bswc = bswc.f147374c;
                    }
                    ffk ffk2 = this.f15921d;
                    int i2 = bswc.f147377b;
                    if (i2 != 0) {
                        esx a2 = esx.m11109a();
                        Intent intent = null;
                        if (a2.f15656b.getCount() <= 0) {
                            esw esw = a2.f15655a;
                            bnhe bnhe = esw.f15652a;
                            Integer valueOf = Integer.valueOf(i2);
                            if (bnhe.containsKey(valueOf)) {
                                intent = ((GoogleSettingsItem) esw.f15652a.get(valueOf)).f29956b;
                            }
                        }
                        if (intent != null) {
                            if (ffr.m11620a(ffk2)) {
                                intent.putExtra("extra.accountName", ffk2.f16458a);
                                intent.putExtra("authAccount", ffk2.f16458a);
                            }
                            mo10550a(intent, 14);
                            return;
                        }
                    }
                    this.f15885b.mo10534a(new IllegalStateException("Item is unspecified or intent is null"));
                    return;
                case 12:
                    adyl.m51423a(Uri.parse((String) ((bmzm) rsv.f43618g).f131273a), this.f15922e.getActivity());
                    return;
                case 14:
                    adyl.m51428d(this.f15922e.getContext());
                    return;
                case 15:
                    adyl.m51427c(this.f15922e.getContext());
                    return;
            }
        } catch (ffq e) {
            this.f15885b.mo10534a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10549a(AccountManagerFuture accountManagerFuture) {
        try {
            mo10550a((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 13);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f15885b.mo10534a(e);
        }
    }

    /* renamed from: a */
    public final void mo10550a(Intent intent, int i) {
        try {
            this.f15922e.startActivityForResult(intent, i);
            this.f15884a.mo10551a(true);
        } catch (ActivityNotFoundException e) {
            this.f15885b.mo10534a(e);
        }
    }
}
