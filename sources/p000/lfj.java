package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.service.common.DetectionHistory;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: lfj */
final /* synthetic */ class lfj implements bqeh {

    /* renamed from: a */
    private final lfm f25966a;

    /* renamed from: b */
    private final boolean f25967b;

    /* renamed from: c */
    private final kjp f25968c;

    /* renamed from: d */
    private final kck f25969d;

    /* renamed from: e */
    private final leh f25970e;

    /* renamed from: f */
    private final kjs f25971f;

    /* renamed from: g */
    private final boolean f25972g;

    /* renamed from: h */
    private final lfl f25973h;

    /* renamed from: i */
    private final kpb f25974i;

    /* renamed from: j */
    private final String f25975j;

    /* renamed from: k */
    private final String f25976k;

    /* renamed from: l */
    private final bqgj f25977l;

    /* renamed from: m */
    private final int f25978m;

    public lfj(lfm lfm, boolean z, int i, kjp kjp, kck kck, leh leh, kjs kjs, boolean z2, lfl lfl, kpb kpb, String str, String str2, bqgj bqgj) {
        this.f25966a = lfm;
        this.f25967b = z;
        this.f25978m = i;
        this.f25968c = kjp;
        this.f25969d = kck;
        this.f25970e = leh;
        this.f25971f = kjs;
        this.f25972g = z2;
        this.f25973h = lfl;
        this.f25974i = kpb;
        this.f25975j = str;
        this.f25976k = str2;
        this.f25977l = bqgj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0293, code lost:
        if (r2.equals(r1.mo66814b()) == false) goto L_0x029b;
     */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        String str2;
        bqgj bqgj;
        boolean z;
        kpb kpb;
        ClientState clientState;
        kca kca;
        String str3;
        boolean z2;
        ClientState clientState2;
        kca kca2;
        RemoteViews remoteViews;
        int i;
        lfm lfm = this.f25966a;
        boolean z3 = this.f25967b;
        int i2 = this.f25978m;
        kjp kjp = this.f25968c;
        kck kck = this.f25969d;
        leh leh = this.f25970e;
        kjs kjs = this.f25971f;
        boolean z4 = this.f25972g;
        lfl lfl = this.f25973h;
        kpb kpb2 = this.f25974i;
        String str4 = this.f25975j;
        String str5 = this.f25976k;
        bqgj bqgj2 = this.f25977l;
        bmxv bmxv = (bmxv) obj;
        String str6 = str4;
        if (bmxv.mo66813a()) {
            bqgj = bqgj2;
            str2 = str5;
            kpb = kpb2;
            str = str6;
            z = true;
        } else if (!z3 || !ccjv.m130168d()) {
            if (ccjv.m130167c()) {
                bqgj = bqgj2;
                str2 = str5;
                str = str6;
                kpb = kpb2;
                lfm.mo15053a(i2, false, z3, false, bmxv.m108566b(Integer.valueOf(lfm.f25985c.mo15085e())));
            } else {
                bqgj = bqgj2;
                str2 = str5;
                kpb = kpb2;
                str = str6;
            }
            z = false;
        } else {
            bqgj = bqgj2;
            str2 = str5;
            kpb = kpb2;
            str = str6;
            z = true;
        }
        FillForm a = kqj.m18328a(kjp, bmxv.m108566b(kck), leh.f25874d);
        kca kca3 = new kca();
        int i3 = Build.VERSION.SDK_INT;
        kca3.mo14365b();
        AbstractDetectionHistory$DetectionResult a2 = AbstractDetectionHistory$DetectionResult.m7160a(a, (List) kjs.f24277b.stream().map(new lfg(leh)).collect(Collectors.toList()));
        ClientState a3 = ClientState.m7165a();
        ClientState clientState3 = leh.f25873c;
        kjp kjp2 = kjp;
        a3.f11672d = lfm.f25987e;
        a3.f11671c.mo7980a(clientState3.f11671c.mo7979a());
        FillForm fillForm = a;
        boolean z5 = false;
        a3.f11671c.mo7981a(a2);
        a3.f11673e = (MetricsContext) lfm.f25988f.mo66815c();
        if (!z4) {
            clientState = a3;
            kca = kca3;
        } else if (z) {
            AutofillId autofillId = ((leg) lfl).f25869a;
            Context context = lfm.f25984b;
            bmxv bmxv2 = lfm.f25988f;
            Intent c = lio.m19200c(13);
            if (bmxv2.mo66813a()) {
                c.putExtra("com.google.android.gms.autofill.extra.METRICS_CONTEXT", lqx.m19547a((Parcelable) bmxv2.mo66814b()));
                if (bmxv.mo66813a()) {
                    c.putExtra("com.google.android.gms.autofill.extra.DEFAULT_OPT_IN_ACCOUNT", (Parcelable) bmxv.mo66814b());
                }
            }
            PendingIntent a4 = lio.m19189a(context, c);
            if (a4 != null) {
                Intent startIntent = IntentOperation.getStartIntent(lfm.f25984b, "com.google.android.gms.autofill.operation.RejectFillPromoOperation", "com.google.android.gms.autofill.operation.RejectFillPromoOperation");
                if (startIntent != null) {
                    startIntent.putExtra("fill_promo_rejected_domain_extra", str);
                }
                if (startIntent == null) {
                    bnsl bnsl = (bnsl) lfm.f25983a.mo68387b();
                    bnsl.mo68432a("lfm", "a", 648, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Reject fill promo intent couldn't be created");
                    str3 = str2;
                    z2 = true;
                } else {
                    PendingIntent service = PendingIntent.getService(lfm.f25984b, 0, startIntent, 134217728);
                    if (service == null) {
                        bnsl bnsl2 = (bnsl) lfm.f25983a.mo68387b();
                        bnsl2.mo68432a("lfm", "a", 654, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Reject fill promo pending intent couldn't be created");
                        str3 = str2;
                        z2 = true;
                    } else {
                        if (!ccjv.m130169e()) {
                            Context context2 = lfm.f25984b;
                            lrc a5 = lbj.m18891a(context2);
                            int a6 = qkj.m32287a(context2, C0126R.C0128layout.autofill_optin);
                            DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                            int i4 = displayMetrics.widthPixels;
                            float applyDimension = TypedValue.applyDimension(1, 480.0f, displayMetrics);
                            int min = (int) (Math.min(applyDimension, ((float) i4) * 0.9f) - TypedValue.applyDimension(1, 64.0f, displayMetrics));
                            remoteViews = new RemoteViews(context2.getPackageName(), a6);
                            remoteViews.setTextViewText(16908308, a5.mo15386b(C0126R.string.autofill_optin_line1));
                            remoteViews.setInt(16908308, "setMaxWidth", min);
                            remoteViews.setTextViewText(16908309, a5.mo15386b(C0126R.string.autofill_optin_line2));
                            remoteViews.setInt(16908309, "setMaxWidth", min);
                            remoteViews.setOnClickPendingIntent(16908327, service);
                        } else {
                            Context context3 = lfm.f25984b;
                            lrc a7 = lbj.m18891a(context3);
                            kcz a8 = kcz.m17657a("com.google.android.gms", C0126R.C0127drawable.product_logo_googleg_color_24, a7.mo15386b(C0126R.string.autofill_google_logo));
                            RemoteViews remoteViews2 = new RemoteViews(context3.getPackageName(), qkj.m32287a(context3, C0126R.C0128layout.autofill_new_optin));
                            boolean b = lbj.m18895b(context3);
                            if (!ccjv.f179210a.mo6606a().mo76167h()) {
                                i = 16908308;
                            } else if (kpb == null) {
                                i = 16908308;
                            } else if (kpb.equals(kpb.USERNAME)) {
                                CharSequence b2 = a7.mo15386b(C0126R.string.autofill_promo_username_and_password);
                                i = 16908308;
                                remoteViews2.setTextViewText(16908308, b2);
                            } else if (kpb.equals(kpb.PAYMENT_CARD_NUMBER)) {
                                CharSequence b3 = a7.mo15386b(C0126R.string.autofill_promo_payment);
                                i = 16908308;
                                remoteViews2.setTextViewText(16908308, b3);
                            } else {
                                i = 16908308;
                            }
                            remoteViews2.setTextColor(i, lbj.m18884a(b, context3));
                            remoteViews2.setTextColor(16908309, lbj.m18893b(b, context3));
                            remoteViews2.setImageViewIcon(16908294, lbj.m18885a(a8, context3));
                            remoteViews2.setOnClickPendingIntent(16908327, service);
                            remoteViews = remoteViews2;
                        }
                        z2 = true;
                        kca3.f23735a.setAuthentication(new AutofillId[]{autofillId}, a4.getIntentSender(), remoteViews);
                        kca3.f23736b = true;
                        bmxv l = lfm.f25985c.mo15092l();
                        if (l.mo66813a()) {
                            if (l.mo66813a()) {
                                str3 = str2;
                            } else {
                                str3 = str2;
                            }
                            z5 = true;
                        } else {
                            str3 = str2;
                        }
                        lfm.f25985c.mo15114q();
                        lfm.f25985c.mo15110e(str3);
                        z5 = true;
                    }
                }
            } else {
                str3 = str2;
                z2 = true;
                bnsl bnsl3 = (bnsl) lfm.f25983a.mo68387b();
                bnsl3.mo68432a("lfm", "a", 641, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("PendingIntent could not be created");
                z5 = false;
            }
            if (!ccjv.m130167c()) {
                clientState2 = a3;
                kca2 = kca3;
            } else {
                if (z5) {
                    bmxv l2 = lfm.f25985c.mo15092l();
                    if (l2.mo66813a()) {
                        if (l2.mo66813a()) {
                            if (str3.equals(l2.mo66814b())) {
                                z2 = false;
                            }
                        }
                    }
                    clientState2 = a3;
                    kca2 = kca3;
                    lfm.mo15053a(i2, true, z3, z2, bmxv.m108566b(Integer.valueOf(lfm.f25985c.mo15085e())));
                }
                z2 = false;
                clientState2 = a3;
                kca2 = kca3;
                lfm.mo15053a(i2, true, z3, z2, bmxv.m108566b(Integer.valueOf(lfm.f25985c.mo15085e())));
            }
            kca2.mo14360a(clientState2.mo7976b());
            return bqga.m112775a(new lei(bmxv.m108567c(kca2.mo14359a()), z5, false, bmvz.f131120a));
        } else {
            clientState = a3;
            kca = kca3;
        }
        DetectionHistory detectionHistory = leh.f25873c.f11671c;
        return bqdx.m112674a(lfm.f25986d.mo14962a(new lcf(kck, fillForm, ImmutableDetectionHistory.m7172a(detectionHistory), bqga.m112775a(new kek(bnon.f131923a)), kqh.m18326a(kjs.f24278c, leh.f25874d), lfm.f25988f)), new lfk(lfm, kjp2, kca, clientState), bqgj);
    }
}
