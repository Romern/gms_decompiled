package p000;

import android.content.Intent;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.tokenization.AccountSetupChimeraActivity;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atuh extends atue {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atuh(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Intent intent2 = intent;
        atsy atsy2 = atsy;
        if (i4 == 1) {
            if (intent2 != null) {
                i3 = intent2.getIntExtra("next_step", 0);
            } else {
                i3 = 0;
            }
            if (i5 == 17) {
                i3 = 1;
            }
            Intent intent3 = this.f90898f.getIntent();
            if (i3 == 0) {
                mo50192b(atsy2);
            } else if (i3 == 1) {
                mo50181a(atrq.m76260a(atsy2.f90861x, atsy2.f90857t, null, null, intent3.getBooleanExtra("extra_hide_warm_welcome", false), intent3.getStringExtra("extra_alt_brand_name"), atsy2.f90820L, null, false, atsy2.f90822N, atsy2.f90823O, atsy2.f90824P, atsy2.f90825Q), 3);
            } else if (i3 == 2) {
                mo50181a(AccountSetupChimeraActivity.m93192a(new askf(atsy2.f90857t, askc.m74272b(), this.f90898f), 1, 0, null, atsy2.f90861x, atsy2.f90820L, intent3.getStringExtra("extra_alt_brand_name"), intent3.getBooleanExtra("extra_hide_warm_welcome", false)), 2);
            }
        } else if (i4 == 2 || i4 == 3) {
            if (i5 == -1) {
                atsy2.f90831W = 1;
                atsy2.f90811C = (CardInfo) intent2.getParcelableExtra("new_card_info");
            }
            mo50192b(atsy2);
        } else if (i4 == 4 || i4 == 5) {
            mo50192b(atsy2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
     arg types: [java.lang.String, java.lang.String]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent} */
    /* renamed from: b */
    public final void mo50192b(atsy atsy) {
        boolean z = atsy.f90852o;
        int i = atsy.f90831W;
        if (i == 1) {
            mo50179a(-1, new Intent().putExtra("new_card_display_name", (CharSequence) atsy.f90811C.f108343d).putExtra("new_card_info", atsy.f90811C).putExtra("tokenization_result_code", 1));
            boolean z2 = atsy.f90852o;
            if (!atsy.mo50163a() && this.f90898f.getCallingActivity() == null) {
                Intent intent = new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY");
                intent.setFlags(268435456);
                if (atxn.m76506a(this.f90898f, intent)) {
                    this.f90898f.startActivity(intent);
                } else {
                    this.f90898f.startActivity(new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity"));
                }
            }
        } else if (i == 2) {
            mo50193c(14, atsy.f90828T);
        } else if (i == 3) {
            mo50193c(15, atsy.f90828T);
        } else if (i == 4) {
            mo50193c(16, atsy.f90828T);
        } else if (i != 5) {
            mo50193c(2, atsy.f90828T);
        } else {
            mo50193c(17, atsy.f90828T);
        }
        mo50178a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo50193c(int i, int i2) {
        mo50179a(0, new Intent().putExtra("tokenization_result_code", i).putExtra("save_status", i2));
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        CardInfo cardInfo;
        boolean z = atsy.f90852o;
        int i = atsy.f90831W;
        if (i != 1 && i != 5 && !this.f90898f.getIntent().getBooleanExtra("extra_hide_warm_welcome", false)) {
            boolean z2 = atsy.f90852o;
            rjx.m33697b((Activity) this.f90898f).mo24753j(atsy.f90857t.f108326b).mo50371a(new atug(this, atsy));
        } else if (atsy.f90822N && cgwn.m147257g()) {
            new adzt(Looper.getMainLooper()).postDelayed(new atuf(this, atsy), 1500);
        } else if (!atsy.f90823O || !atsy.f90824P || !cgwn.m147270t() || (cardInfo = atsy.f90811C) == null || cardInfo.f108345f.f108459b != 5) {
            mo50192b(atsy);
        } else {
            mo50181a(new Intent("com.google.android.gms.tapandpay.settings.GREEN_PATH_RESULT").setClassName(this.f90898f, "com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity").putExtra("extra_card_info", atsy.f90811C), 4);
        }
    }
}
