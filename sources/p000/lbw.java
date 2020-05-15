package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.autofill.BatchUpdates;
import android.service.autofill.CustomDescription;
import android.service.autofill.SaveInfo;
import android.service.autofill.TextValueSanitizer;
import android.service.autofill.Validator;
import android.service.autofill.Validators;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;
import com.google.android.gms.autofill.util.PaymentsUtils$CardNetwork;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* renamed from: lbw */
final /* synthetic */ class lbw implements Callable {

    /* renamed from: a */
    private final lce f25761a;

    /* renamed from: b */
    private final lcf f25762b;

    /* renamed from: c */
    private final bqgg f25763c;

    /* renamed from: d */
    private final bqgg f25764d;

    public lbw(lce lce, lcf lcf, bqgg bqgg, bqgg bqgg2) {
        this.f25761a = lce;
        this.f25762b = lcf;
        this.f25763c = bqgg;
        this.f25764d = bqgg2;
    }

    public final Object call() {
        List list;
        AutofillId autofillId;
        FillForm fillForm;
        byte[] bArr;
        bngx bngx;
        AutofillId autofillId2;
        bmxv bmxv;
        int i;
        int length;
        boolean z;
        int i2;
        int i3;
        HashSet hashSet;
        lce lce = this.f25761a;
        lcf lcf = this.f25762b;
        bqgg bqgg = this.f25763c;
        bqgg bqgg2 = this.f25764d;
        try {
            list = (List) ((kek) bqga.m112780a((Future) lcf.f25780d)).f23936a.stream().map(lcb.f25769a).filter(lcc.f25770a).map(lcd.f25771a).collect(Collectors.toList());
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) lce.f25772a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lce", "a", 422, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to fetch existing payment cards");
            list = bngx.m109376e();
        }
        bmxv bmxv2 = (bmxv) bqgg.get();
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) bqga.m112780a((Future) bqgg2);
        FillForm fillForm2 = lcf.f25778b;
        AutofillId a = lce.m18916a(fillForm2, kpb.PAYMENT_CARD_NUMBER, lcf);
        if (a != null) {
            AutofillId a2 = lce.m18916a(fillForm2, kpb.PAYMENT_CARD_EXPIRATION_MONTH, lcf);
            AutofillId a3 = lce.m18916a(fillForm2, kpb.PAYMENT_CARD_EXPIRATION_YEAR, lcf);
            AutofillId a4 = lce.m18916a(fillForm2, kpb.PAYMENT_CARD_EXPIRATION_DATE, lcf);
            AutofillId[] autofillIdArr = {a, a2, a3, a4};
            HashSet hashSet2 = new HashSet();
            int i4 = 0;
            while (true) {
                HashSet hashSet3 = hashSet2;
                if (i4 >= 4) {
                    bngx a5 = bngx.m109367a(kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PERSON_NAME, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY, new kpb[0]);
                    ImmutableDetectionHistory immutableDetectionHistory = lcf.f25779c;
                    bnia j = bnic.m109500j();
                    bmxv bmxv3 = bmxv2;
                    int size = a5.size();
                    List list2 = list;
                    int i5 = 0;
                    while (i5 < size) {
                        bngx bngx2 = a5;
                        kpb kpb = (kpb) a5.get(i5);
                        bngx b = fillForm2.mo7950b(kpb);
                        if (b.isEmpty()) {
                            i2 = size;
                            if (lce.f25773b.contains(kpb)) {
                                for (FillField fillField : immutableDetectionHistory.mo15003b(kpb)) {
                                    j.mo67629b(fillField.f11631a);
                                }
                            }
                        } else {
                            i2 = size;
                        }
                        bnre i6 = b.listIterator();
                        while (true) {
                            i3 = i5 + 1;
                            if (!i6.hasNext()) {
                                break;
                            }
                            j.mo67629b(((FillField) i6.next()).f11631a);
                        }
                        i5 = i3;
                        a5 = bngx2;
                        size = i2;
                    }
                    bngx g = j.mo67751a().mo67639g();
                    SaveInfo.Builder flags = new SaveInfo.Builder((!ssw.m36269a() || !cciw.m129956e()) ? 4 : 128, new AutofillId[]{a}).setFlags(1);
                    if (!g.isEmpty()) {
                        flags.setOptionalIds((AutofillId[]) g.toArray(new AutofillId[0]));
                    }
                    if (lcf.f25782f.mo66813a()) {
                        MetricsContext metricsContext = (MetricsContext) lcf.f25782f.mo66814b();
                        FillForm fillForm3 = lcf.f25778b;
                        bxvd da = lau.f25613i.mo74144da();
                        bxvd da2 = kzz.f25505d.mo74144da();
                        fillForm = fillForm2;
                        int a6 = metricsContext.mo7953a();
                        autofillId = a4;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((kzz) da2.f164949b).f25507a = a6;
                        kzx b2 = metricsContext.mo7956b();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        b2.getClass();
                        ((kzz) da2.f164949b).f25508b = b2;
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
                        lbf a7 = kwv.m18703a(fillForm3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        a7.getClass();
                        ((lau) da.f164949b).f25619e = a7;
                        laz laz = laz.PAYMENT_CARD;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((lau) da.f164949b).f25620f = laz.mo3214a();
                        if (!da.f164950c) {
                            z = false;
                        } else {
                            da.mo74035c();
                            z = false;
                            da.f164950c = false;
                        }
                        lau lau = (lau) da.f164949b;
                        lau.f25617c = z;
                        lau.f25621g = lat.m18861a(4);
                        bArr = ((lau) da.mo74062i()).serializeToBytes();
                    } else {
                        fillForm = fillForm2;
                        autofillId = a4;
                        bArr = new byte[0];
                    }
                    Intent a8 = kyu.m18809a(lce.f25774c, lcf.f25778b.f11643c, lcf.f25777a, laz.PAYMENT_CARD, bArr);
                    if (a8 != null) {
                        flags.setNegativeAction(0, PendingIntent.getService(lce.f25774c, 0, a8, 134217728).getIntentSender());
                    }
                    String[] strArr = getSaveInstrumentDetailsResponse.f110184a;
                    int[] iArr = getSaveInstrumentDetailsResponse.f110185b;
                    if (strArr == null || iArr == null || (length = strArr.length) != iArr.length) {
                        bnsl bnsl2 = (bnsl) lce.f25772a.mo68388c();
                        bnsl2.mo68432a("lce", "a", 488, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("GetSaveInstrumentDetailsResponse contains unexpected format.");
                        bngx = bngx.m109376e();
                    } else {
                        bngs b3 = bngx.m109371b(length);
                        for (int i7 = 0; i7 < strArr.length; i7++) {
                            b3.mo67668c(PaymentsUtils$CardNetwork.m7183a(iArr[i7], strArr[i7]));
                        }
                        bngx = b3.mo67664a();
                    }
                    int i8 = Build.VERSION.SDK_INT;
                    RemoteViews a9 = lbj.m18886a(lce.f25774c, getSaveInstrumentDetailsResponse.f110186c);
                    int a10 = qkj.m32287a(lce.f25774c, C0126R.C0129id.card_expiration_container);
                    a9.setViewVisibility(a10, 4);
                    CustomDescription.Builder builder = new CustomDescription.Builder(a9);
                    int size2 = bngx.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        PaymentsUtils$CardNetwork paymentsUtils$CardNetwork = (PaymentsUtils$CardNetwork) bngx.get(i9);
                        Pattern c2 = paymentsUtils$CardNetwork.mo8002c();
                        if (c2 != null) {
                            CharSequence a11 = lra.m19564a(lce.f25774c, paymentsUtils$CardNetwork.mo7997a());
                            String valueOf = String.valueOf(paymentsUtils$CardNetwork.mo7998b());
                            i = size2;
                            String valueOf2 = String.valueOf(lqy.f26618c);
                            builder.addChild(16908308, kcb.m17625a(a, Pattern.compile(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)), lqy.m19550a(a11)));
                            builder.addChild(16908294, kcb.m17624a(a, c2, qkj.m32287a(lce.f25774c, lra.m19566b(lce.f25774c, paymentsUtils$CardNetwork.mo7997a()).mo14380b())));
                        } else {
                            i = size2;
                        }
                        i9++;
                        size2 = i;
                    }
                    if (a2 != null && a3 != null) {
                        builder.addChild(qkj.m32287a(lce.f25774c, C0126R.C0129id.card_expiration_month), kcb.m17625a(a2, lqy.f26622g, "$1"));
                        builder.addChild(qkj.m32287a(lce.f25774c, C0126R.C0129id.card_expiration_year), kcb.m17625a(a3, lqy.f26624i, "/$2"));
                        int i10 = Build.VERSION.SDK_INT;
                        Validator and = Validators.and(kcc.m17626a(a2, lqy.f26622g), kcc.m17626a(a3, lqy.f26624i));
                        RemoteViews a12 = lbj.m18886a(lce.f25774c, getSaveInstrumentDetailsResponse.f110186c);
                        a12.setViewVisibility(a10, 0);
                        builder.batchUpdate(and, new BatchUpdates.Builder().updateTemplate(a12).build());
                        autofillId2 = autofillId;
                    } else if (autofillId != null) {
                        autofillId2 = autofillId;
                        builder.addChild(qkj.m32287a(lce.f25774c, C0126R.C0129id.card_expiration_month), kcb.m17625a(autofillId2, lqy.f26625j, "$1"));
                        builder.addChild(qkj.m32287a(lce.f25774c, C0126R.C0129id.card_expiration_year), kcb.m17625a(autofillId2, lqy.f26625j, "/$3"));
                        int i11 = Build.VERSION.SDK_INT;
                        Validator a13 = kcc.m17626a(autofillId2, lqy.f26625j);
                        RemoteViews a14 = lbj.m18886a(lce.f25774c, getSaveInstrumentDetailsResponse.f110186c);
                        a14.setViewVisibility(a10, 0);
                        builder.batchUpdate(a13, new BatchUpdates.Builder().updateTemplate(a14).build());
                    } else {
                        autofillId2 = autofillId;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(kcc.m17627a(a));
                    arrayList.add(kcc.m17626a(a, lqy.f26619d));
                    arrayList.add(Validators.or((Validator[]) bngx.stream().map(lbx.f25765a).filter(lby.f25766a).map(new lbz(a)).toArray(lca.f25768a)));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        kdb kdb = (kdb) it.next();
                        StringBuilder sb = new StringBuilder("^(?<!");
                        int size3 = bngx.size();
                        int i12 = 0;
                        boolean z2 = false;
                        while (i12 < size3) {
                            PaymentsUtils$CardNetwork paymentsUtils$CardNetwork2 = (PaymentsUtils$CardNetwork) bngx.get(i12);
                            Iterator it2 = it;
                            int i13 = size3;
                            if (kdb.f23848c == paymentsUtils$CardNetwork2.mo7997a()) {
                                if (z2) {
                                    sb.append('|');
                                }
                                sb.append(paymentsUtils$CardNetwork2.mo7998b());
                                z2 = true;
                            }
                            i12++;
                            it = it2;
                            size3 = i13;
                        }
                        Iterator it3 = it;
                        if (z2) {
                            sb.append(").*(?<!");
                            sb.append(kdb.f23847b);
                            sb.append(")$");
                            bmxv = bmxv.m108566b(Pattern.compile(sb.toString()));
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                        if (bmxv.mo66813a()) {
                            arrayList.add(kcc.m17626a(a, (Pattern) bmxv.mo66814b()));
                            it = it3;
                        } else {
                            it = it3;
                        }
                    }
                    flags.setValidator(Validators.and((Validator[]) arrayList.toArray(new Validator[0]))).setCustomDescription(builder.build());
                    int i14 = Build.VERSION.SDK_INT;
                    flags.addSanitizer(new TextValueSanitizer(lqy.f26620e, "$1$2$3$4"), a);
                    if (autofillId2 != null) {
                        flags.addSanitizer(new TextValueSanitizer(lqy.f26625j, "$1/$3"), autofillId2);
                    }
                    if (ssw.m36269a() && ((autofillId2 == null && (a2 == null || a3 == null)) || (lce.m18916a(fillForm, kpb.PAYMENT_CARD_HOLDER_NAME, lcf) == null && !bmxv3.mo66813a()))) {
                        flags.setPositiveAction(1);
                    }
                    return bmxv.m108566b(lcg.m18923a(flags.build(), getSaveInstrumentDetailsResponse.f110187d, bngx));
                }
                List list3 = list;
                bmxv bmxv4 = bmxv2;
                FillForm fillForm4 = fillForm2;
                AutofillId autofillId3 = a4;
                AutofillId autofillId4 = autofillIdArr[i4];
                if (autofillId4 == null) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet3;
                    if (!hashSet.add(autofillId4)) {
                        break;
                    }
                }
                i4++;
                a4 = autofillId3;
                bmxv2 = bmxv4;
                hashSet2 = hashSet;
                fillForm2 = fillForm4;
                list = list3;
            }
        }
        return bmvz.f131120a;
    }
}
