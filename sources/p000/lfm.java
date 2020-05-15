package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: lfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lfm implements lej {

    /* renamed from: a */
    public static final srn f25983a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    public final Context f25984b;

    /* renamed from: c */
    public final lho f25985c;

    /* renamed from: d */
    public final lch f25986d;

    /* renamed from: e */
    public final UserFieldTypeManager f25987e;

    /* renamed from: f */
    public final bmxv f25988f;

    /* renamed from: g */
    public final bnhe f25989g;

    /* renamed from: h */
    public final bnhe f25990h;

    /* renamed from: i */
    private final adyd f25991i;

    /* renamed from: j */
    private final kju f25992j;

    /* renamed from: k */
    private final kpk f25993k;

    /* renamed from: l */
    private final kwu f25994l;

    public lfm(Context context, adyd adyd, lho lho, kju kju, lch lch, kpk kpk, UserFieldTypeManager userFieldTypeManager, bmxv bmxv, bnhe bnhe, bnhe bnhe2, kwu kwu) {
        this.f25984b = context;
        this.f25991i = adyd;
        this.f25985c = lho;
        this.f25992j = kju;
        this.f25986d = lch;
        this.f25993k = kpk;
        this.f25987e = userFieldTypeManager;
        this.f25988f = bmxv;
        this.f25989g = bnhe;
        this.f25990h = bnhe2;
        this.f25994l = kwu;
    }

    /* renamed from: a */
    static final /* synthetic */ bqgg m19019a(bnhe bnhe) {
        bnrd a = bnhe.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            try {
                bnrd a2 = ((kek) bqga.m112780a((Future) entry.getValue())).f23936a.iterator();
                while (a2.hasNext()) {
                    if (((kct) a2.next()).mo14368a() instanceof kdb) {
                        return bqga.m112775a(bmxv.m108566b((Account) entry.getKey()));
                    }
                }
                continue;
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) f25983a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lfm", "a", 599, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to retrieve fetch result.");
            }
        }
        return bqga.m112775a(bmvz.f131120a);
    }

    /* renamed from: a */
    static final /* synthetic */ bqgg m19020a(bnhe bnhe, kcv kcv) {
        bnrd a = bnhe.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            try {
                bnrd a2 = ((kek) bqga.m112780a((Future) entry.getValue())).f23936a.iterator();
                while (a2.hasNext()) {
                    Object a3 = ((kct) a2.next()).mo14368a();
                    if (a3 instanceof Credential) {
                        Credential credential = (Credential) a3;
                        if (credential.mo7929d() && credential.f11611d.contains(kcv)) {
                            return bqga.m112775a(bmxv.m108566b((Account) entry.getKey()));
                        }
                    }
                }
                continue;
            } catch (ExecutionException e) {
                bnsl bnsl = (bnsl) f25983a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("lfm", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to retrieve fetch result.");
            }
        }
        return bqga.m112775a(bmvz.f131120a);
    }

    /* renamed from: a */
    private final boolean m19021a(kca kca, AutofillId autofillId, bmxv bmxv, kpb kpb, String str, String str2) {
        RemoteViews remoteViews;
        kca kca2 = kca;
        kpb kpb2 = kpb;
        String str3 = str2;
        Context context = this.f25984b;
        bmxv bmxv2 = this.f25988f;
        Intent c = lio.m19200c(13);
        if (bmxv2.mo66813a()) {
            c.putExtra("com.google.android.gms.autofill.extra.METRICS_CONTEXT", lqx.m19547a((Parcelable) bmxv2.mo66814b()));
            if (bmxv.mo66813a()) {
                c.putExtra("com.google.android.gms.autofill.extra.DEFAULT_OPT_IN_ACCOUNT", (Parcelable) bmxv.mo66814b());
            }
        }
        PendingIntent a = lio.m19189a(context, c);
        if (a != null) {
            Intent startIntent = IntentOperation.getStartIntent(this.f25984b, "com.google.android.gms.autofill.operation.RejectFillPromoOperation", "com.google.android.gms.autofill.operation.RejectFillPromoOperation");
            if (startIntent != null) {
                startIntent.putExtra("fill_promo_rejected_domain_extra", str);
            }
            if (startIntent == null) {
                bnsl bnsl = (bnsl) f25983a.mo68387b();
                bnsl.mo68432a("lfm", "a", 648, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Reject fill promo intent couldn't be created");
                return false;
            }
            PendingIntent service = PendingIntent.getService(this.f25984b, 0, startIntent, 134217728);
            if (service == null) {
                bnsl bnsl2 = (bnsl) f25983a.mo68387b();
                bnsl2.mo68432a("lfm", "a", 654, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Reject fill promo pending intent couldn't be created");
                return false;
            }
            if (!ccjv.m130169e()) {
                Context context2 = this.f25984b;
                lrc a2 = lbj.m18891a(context2);
                int a3 = qkj.m32287a(context2, C0126R.C0128layout.autofill_optin);
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                float applyDimension = TypedValue.applyDimension(1, 480.0f, displayMetrics);
                int min = (int) (Math.min(applyDimension, ((float) i) * 0.9f) - TypedValue.applyDimension(1, 64.0f, displayMetrics));
                remoteViews = new RemoteViews(context2.getPackageName(), a3);
                remoteViews.setTextViewText(16908308, a2.mo15386b(C0126R.string.autofill_optin_line1));
                remoteViews.setInt(16908308, "setMaxWidth", min);
                remoteViews.setTextViewText(16908309, a2.mo15386b(C0126R.string.autofill_optin_line2));
                remoteViews.setInt(16908309, "setMaxWidth", min);
                remoteViews.setOnClickPendingIntent(16908327, service);
            } else {
                Context context3 = this.f25984b;
                lrc a4 = lbj.m18891a(context3);
                kcz a5 = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_googleg_color_24, a4.mo15386b(C0126R.string.autofill_google_logo));
                remoteViews = new RemoteViews(context3.getPackageName(), qkj.m32287a(context3, C0126R.C0128layout.autofill_new_optin));
                boolean b = lbj.m18895b(context3);
                if (ccjv.f179210a.mo6606a().mo76167h() && kpb2 != null) {
                    if (kpb2.equals(kpb.USERNAME)) {
                        remoteViews.setTextViewText(16908308, a4.mo15386b(C0126R.string.autofill_promo_username_and_password));
                    } else if (kpb2.equals(kpb.PAYMENT_CARD_NUMBER)) {
                        remoteViews.setTextViewText(16908308, a4.mo15386b(C0126R.string.autofill_promo_payment));
                    }
                }
                remoteViews.setTextColor(16908308, lbj.m18884a(b, context3));
                remoteViews.setTextColor(16908309, lbj.m18893b(b, context3));
                remoteViews.setImageViewIcon(16908294, lbj.m18885a(a5, context3));
                remoteViews.setOnClickPendingIntent(16908327, service);
            }
            kca2.f23735a.setAuthentication(new AutofillId[]{autofillId}, a.getIntentSender(), remoteViews);
            kca2.f23736b = true;
            bmxv l = this.f25985c.mo15092l();
            if (!l.mo66813a() || (l.mo66813a() && !str3.equals(l.mo66814b()))) {
                this.f25985c.mo15114q();
                this.f25985c.mo15110e(str3);
            }
            return true;
        }
        bnsl bnsl3 = (bnsl) f25983a.mo68387b();
        bnsl3.mo68432a("lfm", "a", 641, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("PendingIntent could not be created");
        return false;
    }

    /* renamed from: a */
    public final bqgg mo15036a(bqgj bqgj, leh leh) {
        String str;
        boolean z;
        ComponentName activityComponent = leh.f25872b.getActivityComponent();
        if (activityComponent != null) {
            str = activityComponent.getPackageName();
        } else {
            str = null;
        }
        if (str == null) {
            bnsl bnsl = (bnsl) f25983a.mo68388c();
            bnsl.mo68432a("lfm", "a", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Request AssistStructure missing android package name.");
            return bqga.m112775a(lei.f25876a);
        }
        try {
            kck b = this.f25993k.mo14765b(str);
            boolean a = leh.mo15035a();
            if (a && !ccjv.m130168d()) {
                return bqga.m112775a(lei.f25877b);
            }
            if (lqo.m19535a(this.f25991i).length == 0) {
                return bqga.m112775a(lei.f25877b);
            }
            if (!ccip.f179070a.mo6606a().mo76052o() || this.f25985c.mo15082b() >= lhi.f26106d || this.f25985c.mo15083c() >= lhi.f26107e || this.f25985c.mo15085e() >= lhi.f26108f) {
                z = a && ccjv.m130168d();
            } else {
                z = true;
            }
            if (!z && !ccip.f179070a.mo6606a().mo76033B()) {
                return bqga.m112775a(lei.f25877b);
            }
            String className = leh.f25872b.getActivityComponent().getClassName();
            kju kju = this.f25992j;
            kjq a2 = kjr.m17953a();
            a2.mo14542a(b);
            kjw c = kjx.m17960c();
            c.mo14552b(leh.f25872b.getActivityComponent().getPackageName());
            c.mo14551a(className);
            a2.mo14543a(c.mo14550a());
            a2.mo14541a(kog.m18243a(leh.f25872b));
            return bqdx.m112674a(kju.mo14544a(a2.mo14540a(), bqgj), new lfe(this, a, b, bqgj, leh, z, className), bqfb.INSTANCE);
        } catch (kpi e) {
            bnsl bnsl2 = (bnsl) f25983a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("lfm", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68448m();
            return bqga.m112777a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo15053a(int i, boolean z, boolean z2, boolean z3, bmxv bmxv) {
        bxvd da = las.f25605g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((las) da.f164949b).f25608b = i - 2;
        las las = (las) da.f164949b;
        las.f25609c = z;
        las.f25610d = z2;
        las.f25611e = z3;
        int intValue = ((Integer) ((bmyg) bmxv).f131198a).intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((las) da.f164949b).f25612f = intValue;
        if (this.f25988f.mo66813a()) {
            MetricsContext metricsContext = (MetricsContext) this.f25988f.mo66814b();
            bxvd da2 = kzz.f25505d.mo74144da();
            int a = metricsContext.mo7953a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((kzz) da2.f164949b).f25507a = a;
            kzx b = metricsContext.mo7956b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((kzz) da2.f164949b).f25508b = b;
            lbh c = metricsContext.mo7957c();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            c.getClass();
            ((kzz) da2.f164949b).f25509c = c;
            kzz kzz = (kzz) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kzz.getClass();
            ((las) da.f164949b).f25607a = kzz;
        }
        kwu kwu = this.f25994l;
        da.getClass();
        kwu.mo14913n(new lff(da));
    }
}
