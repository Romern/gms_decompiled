package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.FopDetailIntentArgs;
import com.google.android.gms.pay.GetPayGlobalActionCardsRequest;
import com.google.android.gms.pay.GetPayGlobalActionCardsResponse;
import com.google.android.gms.pay.GetSortOrderResponse;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;
import com.google.android.gms.pay.SortItem;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;
import com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asqc {

    /* renamed from: a */
    public static final srn f89375a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public final Context f89376b;

    /* renamed from: c */
    public final atkm f89377c;

    /* renamed from: d */
    private final boolean f89378d;

    public asqc(Context context) {
        boolean b = alfj.m60866b(context);
        this.f89376b = context;
        this.f89378d = b;
        this.f89377c = new atkm(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
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
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    private final PendingIntent m74437a(Account account, CardInfo cardInfo, boolean z) {
        int i;
        if (!cgwn.f187872a.mo6606a().mo84598M() || !this.f89378d) {
            return null;
        }
        TaskStackBuilder create = TaskStackBuilder.create(this.f89376b);
        if (account == null || cardInfo == null) {
            alhu alhu = new alhu();
            aleq aleq = alhu.f73520a;
            aleq.f73501a.f81525a = z;
            IntentSource intentSource = new ales().f73502a;
            intentSource.f81527a = 3;
            aleq.f73501a.f81526b = intentSource;
            create.addNextIntent(alhu.mo40351a().putExtra("global_actions_initiated", true));
            i = 0;
        } else {
            if (cgwk.f187853a.mo6606a().mo84572e()) {
                create.addNextIntent(new alhu().mo40351a());
            }
            alht alht = new alht();
            alht.mo40353a(account);
            String str = cardInfo.f108340a;
            FopDetailIntentArgs fopDetailIntentArgs = alht.f73519a.f73497a;
            fopDetailIntentArgs.f81473c = str;
            fopDetailIntentArgs.f81471a = cardInfo.f108338E;
            create.addNextIntent(alht.mo40351a().putExtra("global_actions_initiated", true));
            i = cardInfo.hashCode();
        }
        aten.m75741a();
        return create.getPendingIntent(i, 201326592);
    }

    /* renamed from: d */
    static long m74444d() {
        long d = cgwk.f187853a.mo6606a().mo84571d();
        if (d > 0) {
            return d;
        }
        bnsl bnsl = (bnsl) f89375a.mo68387b();
        bnsl.mo68432a("asqc", "d", 577, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68416a("invalid timeout millis for pay module of %d returned, using %d instead", d, 500);
        return 500;
    }

    /* renamed from: e */
    static int m74445e() {
        int b = (int) cgwk.f187853a.mo6606a().mo84569b();
        if (b > 0) {
            return b;
        }
        bnsl bnsl = (bnsl) f89375a.mo68387b();
        bnsl.mo68432a("asqc", "e", 590, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68409a("invalid card count from pay module of %d returned, using 1 instead", b);
        return 1;
    }

    /* renamed from: h */
    private final boolean m74446h() {
        boolean J = cgwn.f187872a.mo6606a().mo84595J();
        if (!cgwk.f187853a.mo6606a().mo84582o()) {
            return J;
        }
        boolean z = this.f89377c.f90420c.getBoolean("sticky_global_actions_flag", false);
        if (J && !z) {
            this.f89377c.f90420c.edit().putBoolean("sticky_global_actions_flag", true).apply();
        }
        return J || z;
    }

    /* renamed from: i */
    private final alhr m74447i() {
        return alfj.m60865a(this.f89376b);
    }

    /* renamed from: j */
    private final int m74448j() {
        if (!m74446h()) {
            return 5;
        }
        Context context = this.f89376b;
        if (!aswg.m74932a(context, atxx.m76531d(context))) {
            return 6;
        }
        if (!cgwn.f187872a.mo6606a().mo84596K() && atgf.m75807a(this.f89376b).mo49940a()) {
            return 7;
        }
        if (asjg.m74216b(this.f89376b).length == 0) {
            return 8;
        }
        if (cgwk.f187853a.mo6606a().mo84579l() && !this.f89378d) {
            m74447i().mo24765s();
        }
        if (cgwk.f187853a.mo6606a().mo84581n()) {
            if (cgwk.f187853a.mo6606a().mo84583p()) {
                boolean z = this.f89377c.f90420c.getBoolean("sticky_pay_module_availability_flag", false);
                if (this.f89378d && !z) {
                    this.f89377c.f90420c.edit().putBoolean("sticky_pay_module_availability_flag", true).apply();
                }
                if (!this.f89378d && !z) {
                    return 9;
                }
            } else if (!this.f89378d) {
                return 9;
            }
        }
        int i = Build.VERSION.SDK_INT;
        return (ssw.m36269a() || !cgwk.f187853a.mo6606a().mo84580m() || atxx.m76534g(this.f89376b) != 4) ? 11 : 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo49361b() {
        try {
            mo49359a(mo49356a(askg.m74283b(this.f89376b, null)));
        } catch (asks e) {
            bnsl bnsl = (bnsl) f89375a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("asqc", "b", 439, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("maybeLogFeatureEnabled: sql error");
        }
    }

    /* renamed from: c */
    public final void mo49362c() {
        if (cgwk.f187853a.mo6606a().mo84575h()) {
            try {
                atam a = mo49356a(askg.m74283b(this.f89376b, null));
                int g = mo49364g();
                bxvd g2 = a.mo49765g(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                bxvd da = bozb.f135362e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozb bozb = (bozb) da.f164949b;
                int i = g - 1;
                if (g != 0) {
                    bozb.f135366c = i;
                    bozb.f135364a |= 2;
                    if (g2.f164950c) {
                        g2.mo74035c();
                        g2.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) g2.f164949b;
                    bozb bozb2 = (bozb) da.mo74062i();
                    bpbx bpbx2 = bpbx.f135635S;
                    bozb2.getClass();
                    bpbx.f135678x = bozb2;
                    bpbx.f135655a |= 16777216;
                    a.mo49741a((bpbx) g2.mo74062i());
                    return;
                }
                throw null;
            } catch (asks e) {
                bnsl bnsl = (bnsl) f89375a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("asqc", "c", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("logFeatureAvailability error");
            }
        }
    }

    /* renamed from: f */
    public final String mo49363f() {
        return this.f89376b.getString(C0126R.string.tp_global_actions_error_message);
    }

    /* renamed from: g */
    public final int mo49364g() {
        int j = m74448j();
        if (j == 11) {
            return Settings.Secure.getInt(this.f89376b.getContentResolver(), "global_actions_panel_enabled", 0) != 1 ? 3 : 4;
        }
        return j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
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
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    private final PendingIntent m74438a(CardInfo cardInfo, boolean z) {
        int i;
        Intent intent = new Intent("com.google.commerce.tapandpay.android.globalactions.START");
        String b = atxn.m76507b(this.f89376b, intent);
        PendingIntent pendingIntent = null;
        r4 = null;
        Intent intent2 = null;
        if (!TextUtils.isEmpty(b)) {
            if (cardInfo != null) {
                i = cardInfo.f108340a.hashCode();
            } else {
                i = 0;
            }
            intent.setPackage(b);
            intent.putExtra("cards_tab", z);
            TaskStackBuilder create = TaskStackBuilder.create(this.f89376b);
            create.addNextIntent(intent);
            if (cardInfo != null) {
                Intent intent3 = new Intent("com.google.commerce.tapandpay.android.paymentmethod.VIEW_CARD");
                String b2 = atxn.m76507b(this.f89376b, intent3);
                if (!TextUtils.isEmpty(b2)) {
                    intent2 = intent3.setPackage(b2).putExtra("card_id", cardInfo.f108340a).putExtra("global_actions_initiated", true);
                }
            }
            if (intent2 == null) {
                intent.putExtra("global_actions_initiated", true);
                if (cardInfo != null) {
                    intent.putExtra("card_info_extra", cardInfo);
                }
            } else {
                create.addNextIntent(intent2);
            }
            pendingIntent = create.getPendingIntent(i, 134217728);
        }
        if (pendingIntent != null) {
            return pendingIntent;
        }
        Context context = this.f89376b;
        atxm atxm = new atxm();
        atxm.f91082a = "GlobalActions";
        atxm.mo50305a(MfiClient.ACCOUNT_ISSUER_GOOGLE, "no_app", "global_actions");
        Intent a = atxm.mo50304a();
        aten.m75741a();
        return PendingIntent.getActivity(context, 0, a, 201326592);
    }

    /* renamed from: a */
    private final Bitmap m74439a(int i, int i2) {
        if (i == 0) {
            return null;
        }
        Drawable b = C1391tv.m20459b(this.f89376b, i);
        if (b == null) {
            bnsl bnsl = (bnsl) f89375a.mo68388c();
            bnsl.mo68432a("asqc", "a", 697, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("missing drawable: %s", i);
            return null;
        }
        C1173lt.m19599a(b, C1133kh.m17843b(this.f89376b, C0126R.color.google_grey100));
        return aten.m75740a(b, i2, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [java.util.List, aspt]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    private final asqb m74440a(String str, int i, int i2) {
        SortItem[] sortItemArr;
        if (!cgwn.f187872a.mo6606a().mo84597L()) {
            return new asqb(bngx.m109376e(), bngx.m109376e(), 4, 0);
        }
        if (!this.f89378d) {
            return new asqb(bngx.m109376e(), bngx.m109376e(), 5, 0);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Account account = new Account(str, "com.google");
        aldz aldz = new aldz();
        aldz.f73499a.f81495a = account;
        int b = (int) cgwk.f187853a.mo6606a().mo84569b();
        if (b <= 0) {
            bnsl bnsl = (bnsl) f89375a.mo68387b();
            bnsl.mo68432a("asqc", "e", 590, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("invalid card count from pay module of %d returned, using 1 instead", b);
            b = 1;
        }
        GetPayGlobalActionCardsRequest getPayGlobalActionCardsRequest = aldz.f73499a;
        getPayGlobalActionCardsRequest.f81496b = b;
        getPayGlobalActionCardsRequest.f81497c = i;
        getPayGlobalActionCardsRequest.f81498d = i2;
        alhr i3 = m74447i();
        aucb a = i3.mo24687a(getPayGlobalActionCardsRequest);
        aucb d = cgwk.m147214b() ? i3.mo24740d(account) : aucu.m76776a();
        try {
            aucb b2 = aucu.m76786b(a, d);
            long d2 = cgwk.f187853a.mo6606a().mo84571d();
            if (d2 <= 0) {
                bnsl bnsl2 = (bnsl) f89375a.mo68387b();
                bnsl2.mo68432a("asqc", "d", 577, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68416a("invalid timeout millis for pay module of %d returned, using %d instead", d2, 500);
                d2 = 500;
            }
            aucu.m76783a(b2, d2, TimeUnit.MILLISECONDS);
            List a2 = bnkn.m109668a(Arrays.asList(((GetPayGlobalActionCardsResponse) a.mo50386d()).f81499a), (bmxj) new aspt(this));
            if (d.mo50384b()) {
                sortItemArr = ((GetSortOrderResponse) d.mo50386d()).f81510a.f81610b;
            } else {
                sortItemArr = new SortItem[0];
            }
            return new asqb(a2, Arrays.asList(sortItemArr), 2, SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (TimeoutException e) {
            return new asqb(bngx.m109376e(), bngx.m109376e(), 3, SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (InterruptedException | ExecutionException e2) {
            return new asqb(bngx.m109376e(), bngx.m109376e(), 6, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }

    /* renamed from: a */
    private final GlobalActionCard m74441a(int i, int i2, boolean z) {
        boolean z2;
        Drawable drawable;
        int i3;
        View inflate = ((LayoutInflater) C1133kh.m17838a(this.f89376b, LayoutInflater.class)).inflate((int) C0126R.C0128layout.tp_global_action_cta, (ViewGroup) null);
        inflate.setBackground(new asps(this.f89376b));
        PendingIntent a = m74437a((Account) null, (CardInfo) null, z);
        if (a == null) {
            a = m74438a((CardInfo) null, !z);
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z) {
            drawable = C1391tv.m20459b(this.f89376b, C0126R.C0127drawable.tp_gpay_logo_white);
            i3 = C0126R.string.tp_add_payment_method;
        } else {
            if (!z2) {
                i3 = C0126R.string.tp_global_actions_cta_message_when_monet_unavailable;
            } else {
                i3 = C0126R.string.tp_global_actions_cta_message;
            }
            drawable = C1391tv.m20459b(this.f89376b, C0126R.C0127drawable.quantum_ic_arrow_forward_vd_theme_24);
            C1173lt.m19599a(drawable, C1133kh.m17843b(this.f89376b, C0126R.color.google_grey100));
        }
        ((TextView) inflate.findViewById(C0126R.C0129id.text)).setText(i3);
        ((ImageView) inflate.findViewById(C0126R.C0129id.logo)).setImageDrawable(drawable);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
        inflate.measure(0, 0);
        inflate.layout(0, 0, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(inflate.getWidth(), inflate.getHeight(), Bitmap.Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        Bitmap a2 = aten.m75739a(createBitmap);
        aspq aspq = new aspq();
        aspq.mo49339a(3);
        aspq.mo49342a("");
        aspq.mo49341a(a2);
        aspq.mo49344b(this.f89376b.getString(i3));
        aspq.mo49340a(a);
        return aspq.f89360a;
    }

    /* renamed from: a */
    private final void m74442a(askf askf, int i, int i2, int i3, long j, int i4) {
        atam a = mo49356a(askf);
        bxvd g = a.mo49765g(128);
        bxvd da = bozg.f135375g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bozg bozg = (bozg) da.f164949b;
        int i5 = bozg.f135377a | 1;
        bozg.f135377a = i5;
        bozg.f135378b = i;
        int i6 = i5 | 2;
        bozg.f135377a = i6;
        bozg.f135379c = i2;
        bozg.f135380d = i3 - 1;
        int i7 = i6 | 4;
        bozg.f135377a = i7;
        int i8 = i7 | 8;
        bozg.f135377a = i8;
        bozg.f135381e = j;
        bozg.f135382f = i4 - 1;
        bozg.f135377a = i8 | 16;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bozg bozg2 = (bozg) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bozg2.getClass();
        bpbx.f135642F = bozg2;
        bpbx.f135656b |= 4;
        a.mo49741a((bpbx) g.mo74062i());
        mo49359a(a);
    }

    /* renamed from: a */
    private static void m74443a(List list, int i, String str, List list2) {
        int g;
        if (!list.isEmpty() && !list2.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((CardInfo) it.next()).f108338E;
                if (!TextUtils.isEmpty(str2)) {
                    SortItem sortItem = (SortItem) bnjd.m109602h(list2, new aspu(str2));
                    if (sortItem != null) {
                        hashMap.put(str2, Long.valueOf(sortItem.f81607b));
                    } else {
                        bnsl bnsl = (bnsl) f89375a.mo68388c();
                        bnsl.mo68432a("asqc", "a", 926, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("sortWithSortOrder: missing sort item for %s", str2);
                        return;
                    }
                } else {
                    bnsl bnsl2 = (bnsl) f89375a.mo68388c();
                    bnsl2.mo68432a("asqc", "a", 920, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("sortWithSortOrder: missing devicePaymentMethodId");
                    return;
                }
            }
            Collections.sort(list, new aspv(hashMap));
            if (!TextUtils.isEmpty(str) && (g = bnjd.m109601g(list, new aspw(str))) >= i) {
                list.add(0, (CardInfo) list.remove(g));
            }
        }
    }

    /* renamed from: a */
    public final atam mo49356a(askf askf) {
        String str;
        if (askf != null) {
            str = askf.f89124b;
        } else {
            str = null;
        }
        if (cgwk.f187853a.mo6606a().mo84568a() && str == null) {
            Account[] b = asjg.m74216b(this.f89376b);
            if (b.length > 0) {
                str = bmxx.m108579c(b[0].name);
            }
        }
        return atam.m75295a(this.f89376b, str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Status mo49357a(askf askf, SelectGlobalActionCardRequest selectGlobalActionCardRequest) {
        CardInfo cardInfo;
        askf askf2 = askf;
        SelectGlobalActionCardRequest selectGlobalActionCardRequest2 = selectGlobalActionCardRequest;
        if (!m74446h()) {
            return Status.f30107a;
        }
        if (cgwn.f187872a.mo6606a().mo84594I()) {
            if (askf2 != null) {
                if (this.f89378d) {
                    String str = askf2.f89124b;
                    algd algd = new algd();
                    Account account = new Account(str, "com.google");
                    SelectPayGlobalActionCardRequest selectPayGlobalActionCardRequest = algd.f73509a;
                    selectPayGlobalActionCardRequest.f81588a = account;
                    selectPayGlobalActionCardRequest.f81589b = selectGlobalActionCardRequest2.f108514a;
                    selectPayGlobalActionCardRequest.f81590c = selectGlobalActionCardRequest2.f108515b;
                    selectPayGlobalActionCardRequest.f81591d = selectGlobalActionCardRequest2.f108516c;
                    m74447i().mo24727a(selectPayGlobalActionCardRequest);
                }
            }
        }
        int i = selectGlobalActionCardRequest2.f108516c;
        String str2 = selectGlobalActionCardRequest2.f108515b;
        int i2 = selectGlobalActionCardRequest2.f108514a;
        if (i <= 0 || str2 == null || i2 == 0) {
            bnsl bnsl = (bnsl) f89375a.mo68387b();
            bnsl.mo68432a("asqc", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("handleSelectEvent: request invalid");
            return new Status(10);
        }
        int i3 = 5;
        if (i2 != 2) {
            if (askf2 == null || i2 != 4) {
                if (askf2 != null) {
                    new atdz(askf2).mo49874a((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                }
                cardInfo = null;
            } else {
                long g = cgwk.f187853a.mo6606a().mo84574g();
                atdz atdz = new atdz(askf2);
                sdo.m34970a(g >= 0);
                if (g == 0) {
                    atdz.mo49874a((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                    cardInfo = null;
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime + g;
                    String valueOf = String.valueOf(elapsedRealtime);
                    SQLiteDatabase d = atdz.mo49886d();
                    d.beginTransaction();
                    try {
                        d.delete("PaymentCardOverrides", "priority_override_realtime_max <= ?", new String[]{valueOf});
                        Integer valueOf2 = Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
                        d.execSQL("UPDATE PaymentCardOverrides SET priority_override_realtime_min = ?, priority_override_realtime_max = ? WHERE account_id = ? AND environment = ? AND priority = ?", new Object[]{Long.valueOf(elapsedRealtime), Long.valueOf(j), atdz.mo49890f(), atdz.mo49891g(), valueOf2});
                        atdy a = atdz.mo49867a(d, elapsedRealtime);
                        d.setTransactionSuccessful();
                        d.endTransaction();
                        bnsl bnsl2 = (bnsl) atdz.f90166a.mo68390d();
                        bnsl2.mo68432a("atdz", "a", 534, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68425a("updateCardOverrideDuration: priority %s timeout %s selected %s", valueOf2, Long.valueOf(g / 1000), a.f90164a);
                        asuc.getInstance().mo49501a(atdz.mo49888e(), a.f90164a, a.f90165b, "updateDuration");
                        cardInfo = null;
                    } catch (Throwable th) {
                        d.endTransaction();
                        throw th;
                    }
                }
            }
        } else if (askf2 == null) {
            bnsl bnsl3 = (bnsl) f89375a.mo68387b();
            bnsl3.mo68432a("asqc", "a", 264, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("handleSelectEvent: requestContext is null");
            return Status.f30109c;
        } else {
            atdz atdz2 = new atdz(askf2);
            cardInfo = atdz2.mo49880b(str2);
            if (cardInfo == null) {
                bnsl bnsl4 = (bnsl) f89375a.mo68387b();
                bnsl4.mo68432a("asqc", "a", 270, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("handleSelectEvent: card %s not found", str2);
                return Status.f30109c;
            }
            atdz2.mo49877a(cardInfo.f108340a, (long) i, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        }
        if (i2 != 4 && i2 != 2) {
            long j2 = (long) i;
            if (cgwn.m147255e() && !astb.m74737a(SystemClock.elapsedRealtime(), j2)) {
                mo49356a(askf).mo49754b();
            }
        } else if (cgwn.m147255e() && astb.m74742c(SystemClock.elapsedRealtime())) {
            mo49356a(askf).mo49759c();
        }
        atam a2 = mo49356a(askf);
        bxvd b = a2.mo49753b(129, cardInfo);
        bxvd da = bozd.f135369c.mo74144da();
        if (i2 == 1) {
            i3 = 2;
        } else if (i2 == 2) {
            i3 = 3;
        } else if (i2 == 3) {
            i3 = 4;
        } else if (i2 != 4) {
            i3 = 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bozd bozd = (bozd) da.f164949b;
        bozd.f135372b = i3 - 1;
        bozd.f135371a |= 1;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        bozd bozd2 = (bozd) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bozd2.getClass();
        bpbx.f135644H = bozd2;
        bpbx.f135656b |= 16;
        a2.mo49741a((bpbx) b.mo74062i());
        return Status.f30107a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asqc.a(int, int, boolean):com.google.android.gms.tapandpay.globalactions.GlobalActionCard
     arg types: [int, int, int]
     candidates:
      asqc.a(android.accounts.Account, com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):android.app.PendingIntent
      asqc.a(java.lang.String, int, int):asqb
      asqc.a(int, int, boolean):com.google.android.gms.tapandpay.globalactions.GlobalActionCard */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bepr.a(android.graphics.Bitmap, boolean):void
     arg types: [android.graphics.Bitmap, int]
     candidates:
      bepr.a(double, double):int
      bepr.a(android.graphics.Rect, android.graphics.Paint):void
      bepr.a(android.graphics.Bitmap, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asqc.a(android.accounts.Account, com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):android.app.PendingIntent
     arg types: [android.accounts.Account, com.google.android.gms.tapandpay.firstparty.CardInfo, int]
     candidates:
      asqc.a(java.lang.String, int, int):asqb
      asqc.a(int, int, boolean):com.google.android.gms.tapandpay.globalactions.GlobalActionCard
      asqc.a(android.accounts.Account, com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):android.app.PendingIntent */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asqc.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):android.app.PendingIntent
     arg types: [com.google.android.gms.tapandpay.firstparty.CardInfo, int]
     candidates:
      asqc.a(int, int):android.graphics.Bitmap
      asqc.a(askf, com.google.android.gms.tapandpay.globalactions.SelectGlobalActionCardRequest):com.google.android.gms.common.api.Status
      asqc.a(com.google.android.gms.tapandpay.firstparty.CardInfo, boolean):android.app.PendingIntent */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02dc A[SYNTHETIC] */
    /* renamed from: a */
    public final GetGlobalActionCardsResponse mo49358a(askf askf, int i, int i2, int i3, int i4) {
        GetAllCardsResponse getAllCardsResponse;
        asqb asqb;
        int i5;
        int i6;
        List list;
        List list2;
        boolean z;
        int i7;
        boolean z2;
        asjs asjs;
        int i8;
        int i9;
        String str;
        boolean z3;
        String str2;
        PendingIntent a;
        InStoreCvmConfig inStoreCvmConfig;
        int g;
        TokenStatus tokenStatus;
        askf askf2 = askf;
        int i10 = i;
        int i11 = i2;
        if (!mo49360a()) {
            aspo aspo = new aspo();
            aspo.mo49336a(new GlobalActionCard[0]);
            return aspo.f89359a;
        }
        bmxy.m108589a(i10 <= 0 ? false : i11 > 0 && i4 > 0, "invalid request");
        if (askf2 == null) {
            GlobalActionCard[] globalActionCardArr = {m74441a(i10, i11, false)};
            m74442a(null, 0, 0, 7, 0, 1);
            aspo aspo2 = new aspo();
            aspo2.mo49336a(globalActionCardArr);
            return aspo2.f89359a;
        }
        String str3 = askf2.f89124b;
        asqb a2 = m74440a(str3, i10, i11);
        List list3 = a2.f89371a;
        List list4 = a2.f89372b;
        GetAllCardsResponse a3 = new atdz(askf2).mo49869a();
        int max = Math.max(0, (i4 - list3.size()) - 1);
        List arrayList = new ArrayList(a3.f108369a.length);
        CardInfo[] cardInfoArr = a3.f108369a;
        int length = cardInfoArr.length;
        int i12 = 0;
        while (i12 < length) {
            List list5 = list3;
            List list6 = list4;
            GetAllCardsResponse getAllCardsResponse2 = a3;
            asqb asqb2 = a2;
            CardInfo cardInfo = cardInfoArr[i12];
            if (!(cardInfo == null || (tokenStatus = cardInfo.f108345f) == null || tokenStatus.f108459b != 5)) {
                arrayList.add(cardInfo);
            }
            i12++;
            a2 = asqb2;
            list4 = list6;
            a3 = getAllCardsResponse2;
            list3 = list5;
        }
        String str4 = a3.f108371c;
        Collections.sort(arrayList, new asqa(str4));
        if (!cgwk.m147214b()) {
            asqb = a2;
            getAllCardsResponse = a3;
        } else if (arrayList.isEmpty() || list4.isEmpty()) {
            asqb = a2;
            getAllCardsResponse = a3;
        } else {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            asqb = a2;
            int i13 = 0;
            while (true) {
                if (i13 < size) {
                    int i14 = size;
                    String str5 = ((CardInfo) arrayList.get(i13)).f108338E;
                    if (TextUtils.isEmpty(str5)) {
                        getAllCardsResponse = a3;
                        bnsl bnsl = (bnsl) f89375a.mo68388c();
                        bnsl.mo68432a("asqc", "a", 920, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("sortWithSortOrder: missing devicePaymentMethodId");
                        break;
                    }
                    getAllCardsResponse = a3;
                    SortItem sortItem = (SortItem) bnjd.m109602h(list4, new aspu(str5));
                    if (sortItem == null) {
                        bnsl bnsl2 = (bnsl) f89375a.mo68388c();
                        bnsl2.mo68432a("asqc", "a", 926, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("sortWithSortOrder: missing sort item for %s", str5);
                        break;
                    }
                    hashMap.put(str5, Long.valueOf(sortItem.f81607b));
                    i13++;
                    a3 = getAllCardsResponse;
                    size = i14;
                    list4 = list4;
                } else {
                    getAllCardsResponse = a3;
                    Collections.sort(arrayList, new aspv(hashMap));
                    if (!TextUtils.isEmpty(str4) && (g = bnjd.m109601g(arrayList, new aspw(str4))) >= max) {
                        arrayList.add(0, (CardInfo) arrayList.remove(g));
                    }
                }
            }
        }
        if (arrayList.size() > max) {
            arrayList = arrayList.subList(0, max);
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.f89376b);
        if (defaultAdapter != null) {
            i5 = defaultAdapter.isEnabled() ? 4 : 3;
        } else {
            i5 = 2;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size2);
        if (size2 != 0) {
            if (!cgwn.f187872a.mo6606a().mo84600O() || new atah(this.f89376b).mo49729a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            asjs asjs2 = new asjs(this.f89376b, str3);
            Account account = new Account(str3, "com.google");
            int i15 = 0;
            while (i15 < size2) {
                CardInfo cardInfo2 = (CardInfo) arrayList.get(i15);
                List list7 = list3;
                List list8 = arrayList;
                bepr bepr = new bepr(this.f89376b);
                asju.m74253a(cardInfo2, bepr);
                if (z2 && cgwn.m147266p()) {
                    bepr.mo60915a("");
                }
                String str6 = "";
                Uri uri = cardInfo2.f108347h;
                if (uri != null) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(asjs2.mo49202a(uri.toString()));
                    if (decodeFile != null) {
                        asjs = asjs2;
                        bepr.mo60914a(decodeFile, false);
                    } else {
                        asjs = asjs2;
                    }
                } else {
                    asjs = asjs2;
                }
                Bitmap a4 = aten.m75740a(bepr, i10, i11);
                if (i5 == 3) {
                    i8 = 2;
                } else if (i5 != 4) {
                    i8 = 1;
                } else {
                    i8 = (!z2 || (inStoreCvmConfig = cardInfo2.f108358s) == null || !inStoreCvmConfig.f108384a) ? 3 : 4;
                }
                int i16 = i8 - 1;
                if (i16 == 1) {
                    i9 = i5;
                    str = this.f89376b.getString(C0126R.string.tp_nfc_disabled);
                } else if (i16 == 2) {
                    i9 = i5;
                    str = this.f89376b.getString(C0126R.string.tp_global_actions_payment_card_text);
                } else if (i16 != 3) {
                    str = str6;
                    i9 = i5;
                } else {
                    i9 = i5;
                    str = this.f89376b.getString(C0126R.string.tp_tap_locked_prompt);
                }
                int i17 = i16 != 1 ? i16 != 2 ? i16 != 3 ? 0 : C0126R.C0127drawable.quantum_ic_lock_outline_vd_theme_24 : C0126R.C0127drawable.tp_nfc : C0126R.C0127drawable.tp_nfc_disabled;
                if (!z2) {
                    z3 = z2;
                } else if (cgwn.m147266p()) {
                    z3 = z2;
                    str2 = this.f89376b.getString(C0126R.string.tp_google_pay);
                    i15++;
                    String format = String.format("%s %s", this.f89376b.getString(C0126R.string.tp_token_selector_item_description, str2, Integer.valueOf(i15), Integer.valueOf(size2)), str);
                    aspq aspq = new aspq();
                    aspq.mo49339a(2);
                    aspq.mo49342a(cardInfo2.f108340a);
                    aspq.mo49341a(a4);
                    aspq.mo49344b(format);
                    aspq.mo49345c(str);
                    Bitmap bitmap = null;
                    if (i17 == 0) {
                        Drawable b = C1391tv.m20459b(this.f89376b, i17);
                        if (b == null) {
                            bnsl bnsl3 = (bnsl) f89375a.mo68388c();
                            bnsl3.mo68432a("asqc", "a", 697, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68409a("missing drawable: %s", i17);
                        } else {
                            C1173lt.m19599a(b, C1133kh.m17843b(this.f89376b, C0126R.color.google_grey100));
                            bitmap = aten.m75740a(b, i3, i3);
                        }
                    }
                    aspq.mo49343b(bitmap);
                    a = m74437a(account, cardInfo2, true);
                    if (a != null) {
                        a = m74438a(cardInfo2, false);
                    }
                    aspq.mo49340a(a);
                    arrayList2.add(aspq.f89360a);
                    i10 = i;
                    i11 = i2;
                    list3 = list7;
                    arrayList = list8;
                    i5 = i9;
                    asjs2 = asjs;
                    z2 = z3;
                } else {
                    z3 = z2;
                }
                str2 = cardInfo2.f108343d;
                i15++;
                String format2 = String.format("%s %s", this.f89376b.getString(C0126R.string.tp_token_selector_item_description, str2, Integer.valueOf(i15), Integer.valueOf(size2)), str);
                aspq aspq2 = new aspq();
                aspq2.mo49339a(2);
                aspq2.mo49342a(cardInfo2.f108340a);
                aspq2.mo49341a(a4);
                aspq2.mo49344b(format2);
                aspq2.mo49345c(str);
                Bitmap bitmap2 = null;
                if (i17 == 0) {
                }
                aspq2.mo49343b(bitmap2);
                a = m74437a(account, cardInfo2, true);
                if (a != null) {
                }
                aspq2.mo49340a(a);
                arrayList2.add(aspq2.f89360a);
                i10 = i;
                i11 = i2;
                list3 = list7;
                arrayList = list8;
                i5 = i9;
                asjs2 = asjs;
                z2 = z3;
            }
            list2 = list3;
            i6 = i5;
            list = arrayList;
        } else {
            list2 = list3;
            i6 = i5;
            list = arrayList;
        }
        if (!list.isEmpty() || !list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        int i18 = i;
        int i19 = i2;
        GlobalActionCard a5 = m74441a(i18, i19, z);
        ArrayList arrayList3 = new ArrayList(list2.size() + arrayList2.size() + 1);
        List list9 = list2;
        arrayList3.addAll(list9);
        arrayList3.addAll(arrayList2);
        arrayList3.add(a5);
        String str7 = getAllCardsResponse.f108371c;
        String str8 = getAllCardsResponse.f108372d;
        if (!TextUtils.isEmpty(str8)) {
            i7 = bnjd.m109601g(arrayList3, new aspx(str8));
        } else {
            i7 = -1;
        }
        if (i7 == -1) {
            i7 = bnjd.m109601g(arrayList3, aspy.f89368a);
        }
        int g2 = (i7 != -1 || TextUtils.isEmpty(str7)) ? i7 : bnjd.m109601g(arrayList3, new aspz(str7));
        int i20 = g2 == -1 ? 0 : g2;
        m74442a(askf, arrayList2.size(), list9.size(), asqb.f89374d, asqb.f89373c, i6);
        this.f89377c.mo50010a(i18, i19);
        aspo aspo3 = new aspo();
        aspo3.mo49336a((GlobalActionCard[]) arrayList3.toArray(new GlobalActionCard[0]));
        GetGlobalActionCardsResponse getGlobalActionCardsResponse = aspo3.f89359a;
        getGlobalActionCardsResponse.f108505b = i20;
        return getGlobalActionCardsResponse;
    }

    /* renamed from: a */
    public final void mo49359a(atam atam) {
        if (!this.f89377c.f90420c.getBoolean("global_actions_enabled_logged", false)) {
            atam.mo49741a(atam.mo49734a(138));
            this.f89377c.f90420c.edit().putBoolean("global_actions_enabled_logged", true).apply();
        }
    }

    /* renamed from: a */
    public final boolean mo49360a() {
        return m74448j() == 11;
    }
}
