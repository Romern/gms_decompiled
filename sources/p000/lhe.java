package p000;

import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.autofill.AutofillValue;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: lhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lhe implements lgw {

    /* renamed from: a */
    public static final srn f26088a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: e */
    private static final bngx f26089e = bngx.m109364a(kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PERSON_NAME, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY);

    /* renamed from: b */
    public final Context f26090b;

    /* renamed from: c */
    public final keo f26091c;

    /* renamed from: d */
    public final lho f26092d;

    /* renamed from: f */
    private final kdi f26093f;

    /* renamed from: g */
    private final kbe f26094g;

    /* renamed from: h */
    private final bngm f26095h;

    /* renamed from: i */
    private final bmzq f26096i;

    /* renamed from: j */
    private final kwu f26097j;

    /* renamed from: k */
    private final kpk f26098k;

    /* renamed from: l */
    private final kbs f26099l;

    /* renamed from: m */
    private final lgu f26100m;

    public lhe(Context context, kdi kdi, kbe kbe, bngm bngm, keo keo, lho lho, bmzq bmzq, kwu kwu, kpk kpk, lgu lgu, kbs kbs) {
        this.f26090b = context;
        this.f26093f = kdi;
        this.f26094g = kbe;
        this.f26095h = bngm;
        this.f26091c = keo;
        this.f26092d = lho;
        this.f26096i = bmzq;
        this.f26097j = kwu;
        this.f26098k = kpk;
        this.f26100m = lgu;
        this.f26099l = kbs;
    }

    /* renamed from: a */
    public static final bqgg m19050a(bqgg bqgg) {
        if (bqgg != null) {
            return bqdx.m112674a(bqgg, lhc.f26086a, bqfb.INSTANCE);
        }
        return bqga.m112775a(bmvz.f131120a);
    }

    /* renamed from: b */
    public final void mo15073b(bmza bmza, MetricsContext metricsContext) {
        mo15072a(bmza, metricsContext, false, false);
    }

    /* renamed from: a */
    private static FillField m19051a(List list, lgv lgv) {
        AutofillValue autofillValue;
        CharSequence textValue;
        if (!list.isEmpty() && !lgv.f26062a.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            bnhe a = kzc.m18813a(lgv, list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FillField fillField = (FillField) it.next();
                AssistStructure.ViewNode viewNode = (AssistStructure.ViewNode) a.get(fillField);
                if (viewNode != null && (autofillValue = viewNode.getAutofillValue()) != null && autofillValue.isText() && (textValue = autofillValue.getTextValue()) != null && textValue.length() > 0) {
                    return fillField;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r11 != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* renamed from: a */
    public final bqgg mo15069a(bqgj bqgj, lgv lgv) {
        String str;
        bmza bmza;
        int i;
        AssistStructure assistStructure;
        bqgg a;
        int i2;
        boolean z;
        Intent intent;
        bqgj bqgj2 = bqgj;
        lgv lgv2 = lgv;
        bmza b = bmza.m108659b(this.f26096i);
        AssistStructure assistStructure2 = (AssistStructure) bnjd.m109595d(lgv2.f26062a);
        int a2 = lgv2.mo15068a(assistStructure2);
        if (this.f26093f.f23888d == null) {
            Context context = this.f26090b;
            if (ccjf.m130037g()) {
                intent = lio.m19199b(assistStructure2, lgv2.f26063b.mo7976b(), a2).addFlags(268435456);
            } else {
                intent = lio.m19196a(assistStructure2, lgv2.f26063b.mo7976b(), a2).addFlags(268435456);
            }
            context.startActivity(intent);
            mo15071a(b, lgv2.f26063b.f11673e);
            return bqga.m112775a((Object) true);
        }
        ComponentName activityComponent = assistStructure2.getActivityComponent();
        if (activityComponent != null) {
            str = activityComponent.getPackageName();
        } else {
            str = null;
        }
        if (str == null) {
            return bqga.m112775a((Object) false);
        }
        try {
            kck b2 = this.f26098k.mo14765b(str);
            ImmutableDetectionHistory a3 = ImmutableDetectionHistory.m7172a(lgv2.f26063b.f11671c);
            FillForm c = a3.mo15004c();
            if (c != null) {
                if (!c.mo7949a(kpb.PAYMENT_CARD_EXPIRATION_DATE)) {
                    if (!c.mo7949a(kpb.PAYMENT_CARD_EXPIRATION_MONTH)) {
                        z = false;
                    } else if (!c.mo7949a(kpb.PAYMENT_CARD_EXPIRATION_YEAR)) {
                        z = false;
                    }
                    if (c.mo7949a(kpb.PAYMENT_CARD_NUMBER)) {
                    }
                }
                z = true;
                if (c.mo7949a(kpb.PAYMENT_CARD_NUMBER)) {
                }
            }
            bngs bngs = new bngs();
            FillField a4 = m19051a(a3.mo15003b(kpb.PAYMENT_CARD_NUMBER), lgv2);
            if (a4 != null) {
                bngs.mo67668c(a4);
                FillField a5 = m19051a(a3.mo15003b(kpb.PAYMENT_CARD_EXPIRATION_DATE), lgv2);
                if (a5 == null) {
                    FillField a6 = m19051a(a3.mo15003b(kpb.PAYMENT_CARD_EXPIRATION_MONTH), lgv2);
                    FillField a7 = m19051a(a3.mo15003b(kpb.PAYMENT_CARD_EXPIRATION_YEAR), lgv2);
                    if (a6 == null) {
                        c = null;
                    } else if (a7 != null) {
                        bngs.mo67667b((Object[]) new FillField[]{a6, a7});
                    } else {
                        c = null;
                    }
                } else {
                    bngs.mo67668c(a5);
                }
                bnre i3 = f26089e.listIterator();
                while (i3.hasNext()) {
                    FillField a8 = m19051a(a3.mo15003b((kpb) i3.next()), lgv2);
                    if (a8 != null) {
                        bngs.mo67668c(a8);
                    }
                }
                c = new FillForm(bngs.mo67664a(), b2);
            } else {
                c = null;
            }
            if (c == null) {
                c = a3.mo15004c();
                if (c == null) {
                    ((bnsl) f26088a.mo68388c()).mo68405a("No form found from DetectionHistory");
                    c = null;
                } else {
                    bngs bngs2 = new bngs();
                    int i4 = Build.VERSION.SDK_INT;
                    FillField a9 = m19051a(a3.mo15001b(lrb.m19567a(), kpb.NEW_PASSWORD, kpb.PASSWORD), lgv2);
                    if (a9 != null) {
                        bngs2.mo67668c(a9);
                    }
                    bngx a10 = bngs2.mo67664a();
                    if (!a10.isEmpty() && ccjp.m130130c()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(kpb.NEW_USERNAME);
                        arrayList.add(kpb.USERNAME);
                        if (ccjp.m130129b()) {
                            arrayList.add(kpb.EMAIL_ADDRESS);
                        }
                        if (ccjp.m130131d()) {
                            arrayList.add(kpb.PHONE_NUMBER);
                            arrayList.add(kpb.PHONE_NATIONAL);
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        FillField a11 = m19051a(a3.mo15001b(lrb.m19567a(), (kpb[]) arrayList.toArray(new kpb[0])), lgv2);
                        if (a11 == null) {
                            a11 = null;
                        } else if (a11.mo7943a(kpb.EMAIL_ADDRESS) || a11.mo7943a(kpb.PHONE_NUMBER) || a11.mo7943a(kpb.PHONE_NATIONAL)) {
                            kqg c2 = a11.mo7945c();
                            c2.mo14804a(kpb.USERNAME);
                            a11 = c2.mo14800a();
                        }
                        if (a11 != null) {
                            bngs bngs3 = new bngs();
                            bngs3.mo67668c(a11);
                            bngs3.mo67666b((Iterable) a10);
                            c = new FillForm(bngs3.mo67664a(), c.f11643c);
                        } else {
                            c = new FillForm(a10, c.f11643c);
                        }
                    }
                }
            }
            MetricsContext metricsContext = lgv2.f26063b.f11673e;
            if (c != null) {
                int i6 = Build.VERSION.SDK_INT;
                bnhp b3 = bnht.m109442b();
                bnhe a12 = kzc.m18813a(lgv2, c.f11641a);
                bnre i7 = c.f11641a.listIterator();
                while (i7.hasNext()) {
                    FillField fillField = (FillField) i7.next();
                    AssistStructure.ViewNode viewNode = (AssistStructure.ViewNode) a12.get(fillField);
                    if (viewNode != null) {
                        bnrd a13 = fillField.f11634d.iterator();
                        while (a13.hasNext()) {
                            b3.mo67730b((kpb) a13.next(), new kef(c.f11643c, viewNode.getAutofillValue(), viewNode.getAutofillOptions()));
                            a2 = a2;
                            assistStructure2 = assistStructure2;
                        }
                    }
                }
                int i8 = a2;
                AssistStructure assistStructure3 = assistStructure2;
                bnht c3 = b3.mo67731c();
                ClientState clientState = lgv2.f26063b;
                kel kel = new kel(bqgj, b2, bmvz.f131120a, bnon.f131923a, clientState.f11669a, lrb.m19568a(clientState));
                bnrd a14 = this.f26095h.iterator();
                while (true) {
                    if (!a14.hasNext()) {
                        bmza = b;
                        i = i8;
                        assistStructure = assistStructure3;
                        a = bqga.m112777a((Throwable) new RuntimeException("Cannot map data to any storable type."));
                        break;
                    }
                    Object a15 = ((kdn) a14.next()).mo14411a(c3);
                    if (a15 == null) {
                        kel = kel;
                    } else if (a15 instanceof Credential) {
                        Credential credential = (Credential) a15;
                        if (ccip.m129865e()) {
                            this.f26092d.mo15104b(b2.f23817a);
                        }
                        kcv kcv = credential.f11610c;
                        if (kcv instanceof kdl) {
                            kbs kbs = this.f26099l;
                            bqdx.m112674a(kbs.f23713b.mo15162a(b2.f23817a, kbs.f23712a), new kbp(kbs, b2, kcv), bqfb.INSTANCE);
                        }
                        if (credential.mo7929d()) {
                            a = m19050a(this.f26091c.mo14430a(new kem(kel, credential)));
                            bmza = b;
                            i = i8;
                            assistStructure = assistStructure3;
                        } else if (!credential.mo7926a() || credential.mo7927b()) {
                            a = bqdx.m112674a(this.f26100m.mo15066a(b2.f23817a, credential.f11610c), new lhb(this, kel, credential), bqfb.INSTANCE);
                            bmza = b;
                            i = i8;
                            assistStructure = assistStructure3;
                        } else {
                            this.f26100m.mo15067a(b2.f23817a, credential.f11610c, credential.f11608a);
                            a = m19050a(null);
                            bmza = b;
                            i = i8;
                            assistStructure = assistStructure3;
                        }
                    } else if (a15 instanceof PaymentCard) {
                        PaymentCard paymentCard = (PaymentCard) a15;
                        if (!ccip.m129871k()) {
                            a = m19050a(this.f26091c.mo14430a(new kem(kel, paymentCard)));
                            bmza = b;
                            i = i8;
                            assistStructure = assistStructure3;
                        } else {
                            PaymentsUtils$CardNetwork[] paymentsUtils$CardNetworkArr = clientState.f11670b;
                            int length = paymentsUtils$CardNetworkArr.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 < length) {
                                    PaymentsUtils$CardNetwork paymentsUtils$CardNetwork = paymentsUtils$CardNetworkArr[i9];
                                    Pattern c4 = paymentsUtils$CardNetwork.mo8002c();
                                    if (c4 != null && c4.matcher(paymentCard.f11613a.f23889a).matches()) {
                                        i2 = paymentsUtils$CardNetwork.mo7997a();
                                        break;
                                    }
                                    i9++;
                                } else {
                                    i2 = 0;
                                    break;
                                }
                            }
                            i = i8;
                            assistStructure = assistStructure3;
                            a = bqdx.m112674a(this.f26094g.mo14345b(), new lha(this, paymentCard, new PaymentCard(paymentCard.f11613a, paymentCard.f11614b, paymentCard.f11615c, paymentCard.f11616d, paymentCard.f11617e, i2), clientState, kel), bqfb.INSTANCE);
                            bmza = b;
                        }
                    } else {
                        i = i8;
                        assistStructure = assistStructure3;
                        a = m19050a(this.f26091c.mo14430a(new kem(kel, a15)));
                        bmza = b;
                    }
                }
                return bqdf.m112619a(bqdf.m112620a(bqdx.m112673a(a, new lgx(this, bmza, lgv2), bqgj2), kep.class, new lgy(this, assistStructure, lgv, i, bmza), bqfb.INSTANCE), Throwable.class, new lgz(this, bmza, lgv2), bqgj2);
            }
            ((bnsl) f26088a.mo68388c()).mo68405a("Unable to generate form from detection history");
            mo15073b(b, metricsContext);
            return bqga.m112775a((Object) false);
        } catch (kpi e) {
            bnsl bnsl = (bnsl) f26088a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68448m();
            return bqga.m112775a((Object) false);
        }
    }

    /* renamed from: a */
    public final void mo15071a(bmza bmza, MetricsContext metricsContext) {
        mo15072a(bmza, metricsContext, true, true);
    }

    /* renamed from: a */
    public final void mo15072a(bmza bmza, MetricsContext metricsContext, boolean z, boolean z2) {
        MetricsContext.FillContext fillContext;
        bmza.mo66931e();
        if (metricsContext == null) {
            ((bnsl) f26088a.mo68388c()).mo68405a("Metrics context missing.");
            return;
        }
        bnre i = metricsContext.mo7959e().mo67670d().listIterator();
        while (true) {
            if (!i.hasNext()) {
                fillContext = null;
                break;
            }
            fillContext = (MetricsContext.FillContext) i.next();
            if (fillContext.f11649c.mo66813a()) {
                break;
            }
        }
        if (fillContext == null) {
            ((bnsl) f26088a.mo68388c()).mo68405a("Fill context missing for save.");
        }
        bxvd da = lau.f25613i.mo74144da();
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
        ((lau) da.f164949b).f25618d = kzz;
        long a2 = bmza.mo66928a(TimeUnit.MILLISECONDS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lau lau = (lau) da.f164949b;
        lau.f25615a = a2;
        lau.f25616b = z;
        lau.f25617c = z2;
        lau.f25621g = lat.m18861a(3);
        if (fillContext != null) {
            if (fillContext.f11649c.mo66813a()) {
                laz laz = (laz) fillContext.f11649c.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((lau) da.f164949b).f25620f = laz.mo3214a();
            }
            if (fillContext.f11647a.mo66813a()) {
                lbf lbf = (lbf) fillContext.f11647a.mo66814b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lbf.getClass();
                ((lau) da.f164949b).f25619e = lbf;
            }
        }
        kwu kwu = this.f26097j;
        da.getClass();
        kwu.mo14903d(new lhd(da));
    }
}
