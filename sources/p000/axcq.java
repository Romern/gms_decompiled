package p000;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.cast.JGCastService;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.p081ib.LaunchPendingIntentChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: axcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axcq implements ImageLoader.ImageListener, Runnable {

    /* renamed from: a */
    private final Context f95785a;

    /* renamed from: b */
    private final Intent f95786b;

    /* renamed from: c */
    private final String f95787c;

    /* renamed from: d */
    private final String f95788d;

    /* renamed from: e */
    private final BuyFlowConfig f95789e;

    /* renamed from: f */
    private final String f95790f;

    /* renamed from: g */
    private NotificationChannel f95791g;

    public axcq(Context context, Intent intent, String str, String str2, String str3, BuyFlowConfig buyFlowConfig) {
        this.f95785a = context;
        this.f95786b = intent;
        this.f95790f = str;
        this.f95787c = str2;
        this.f95788d = str3;
        this.f95789e = buyFlowConfig;
    }

    /* renamed from: a */
    public static Intent m82330a(Context context, Account account, int i, bwiv bwiv) {
        awkv awkv = new awkv(context);
        int i2 = bwiv.f159695a;
        if ((i2 & 2) != 0) {
            awkv.mo52222b(bwiv.f159697c.getKey());
        } else if ((i2 & 4) != 0) {
            awkv.mo52221a(bwiv.f159698d.getKey());
        }
        int a = bwix.m122006a(bwiv.f159696b);
        int i3 = 1;
        if (a == 0) {
            a = 1;
        }
        int i4 = a - 1;
        if (i4 != 1) {
            i3 = i4 != 5 ? i4 != 7 ? i4 != 9 ? i4 != 12 ? i4 != 16 ? i4 != 19 ? i4 != 20 ? i4 != 22 ? i4 != 23 ? 1000 : 13 : 12 : 9 : 5 : 14 : 10 : 8 : 7 : 6;
        }
        awkv.mo52223c(i3);
        m82332a(awkv, account, i);
        return awkv.mo52186a();
    }

    public final void onErrorResponse(VolleyError volleyError) {
    }

    public final void run() {
        bjvn.m104721b(this.f95785a).get(this.f95790f, this);
    }

    public final void onResponse(ImageLoader.ImageContainer imageContainer, boolean z) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f95785a;
        if (this.f95791g == null) {
            this.f95791g = new NotificationChannel("wallet.ui.notification.default_channel_id", "wallet notification channel", 4);
            sex.m35104a(this.f95785a).mo25442a(this.f95791g);
        }
        C1102je jeVar = new C1102je(context, this.f95791g.getId());
        jeVar.mo13630b(17301624);
        jeVar.mo13621a(imageContainer.getBitmap());
        jeVar.mo13640e(this.f95787c);
        jeVar.mo13632b(this.f95788d);
        jeVar.f22258j = 1;
        jeVar.mo13628a(new long[0]);
        jeVar.mo13627a(true);
        PendingIntent a = spn.m35844a(this.f95785a, this.f95786b, (int) JGCastService.FLAG_PRIVATE_DISPLAY);
        if (!chel.m148598b()) {
            Context context2 = this.f95785a;
            a = spn.m35844a(context2, LaunchPendingIntentChimeraActivity.m93989a(context2, this.f95789e, null, a), (int) JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        jeVar.f22254f = a;
        sey a2 = sey.m35126a(this.f95785a);
        a2.mo25456a(1);
        a2.mo25457a(1, jeVar.mo13629b());
    }

    /* renamed from: a */
    public static Intent m82331a(Context context, Account account, int i, bwiv bwiv, BuyFlowConfig buyFlowConfig) {
        awlc awlc = new awlc(context);
        if ((bwiv.f159695a & 4) != 0) {
            awlc.mo52233a(bwiv.f159698d.getKey());
        }
        m82332a(awlc, account, i);
        Intent a = awlc.mo52186a();
        a.addFlags(67108864);
        return awmz.m80254a(context, a, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_FROM_NOTIFICATION", buyFlowConfig);
    }

    /* renamed from: a */
    private static void m82332a(awjx awjx, Account account, int i) {
        int i2;
        if (chjt.f188692a.mo6606a().mo85287a()) {
            WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
            walletCustomTheme.mo59914a();
            awjx.mo52190a(walletCustomTheme);
        }
        awjx.mo52188a(account);
        awjx.mo52187a(i);
        if (!chei.f188531a.mo6606a().mo85175a()) {
            i2 = 1;
        } else {
            i2 = 3;
        }
        awjx.mo52192b(i2);
    }
}
