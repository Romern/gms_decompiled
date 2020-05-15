package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.autofill.CustomDescription;
import android.service.autofill.SaveInfo;
import android.service.autofill.TextValueSanitizer;
import android.service.autofill.Validator;
import android.service.autofill.Validators;
import android.view.autofill.AutofillId;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

/* renamed from: lbp */
final /* synthetic */ class lbp implements Callable {

    /* renamed from: a */
    private final lbu f25742a;

    /* renamed from: b */
    private final FillField f25743b;

    /* renamed from: c */
    private final FillField f25744c;

    /* renamed from: d */
    private final FillField f25745d;

    /* renamed from: e */
    private final FillField f25746e;

    /* renamed from: f */
    private final List f25747f;

    /* renamed from: g */
    private final bqgg f25748g;

    /* renamed from: h */
    private final lcf f25749h;

    public lbp(lbu lbu, FillField fillField, FillField fillField2, FillField fillField3, FillField fillField4, List list, bqgg bqgg, lcf lcf) {
        this.f25742a = lbu;
        this.f25743b = fillField;
        this.f25744c = fillField2;
        this.f25745d = fillField3;
        this.f25746e = fillField4;
        this.f25747f = list;
        this.f25748g = bqgg;
        this.f25749h = lcf;
    }

    public final Object call() {
        bngx bngx;
        FillField fillField;
        byte[] bArr;
        FillField fillField2;
        FillField fillField3;
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse;
        bngx bngx2;
        FillField fillField4;
        FillField fillField5;
        int i;
        int length;
        boolean z;
        lbu lbu = this.f25742a;
        FillField fillField6 = this.f25743b;
        FillField fillField7 = this.f25744c;
        FillField fillField8 = this.f25745d;
        FillField fillField9 = this.f25746e;
        List list = this.f25747f;
        bqgg bqgg = this.f25748g;
        lcf lcf = this.f25749h;
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse2 = (GetSaveInstrumentDetailsResponse) bqga.m112780a((Future) bqgg);
        try {
            kek kek = (kek) bqga.m112780a((Future) lcf.f25780d);
            ArrayList arrayList = new ArrayList(kek.f23936a.size());
            bnrd a = kek.f23936a.iterator();
            while (a.hasNext()) {
                Object a2 = ((kct) a.next()).mo14368a();
                if (a2 instanceof kdb) {
                    arrayList.add((kdb) a2);
                }
            }
            bngx = bngx.m109368a((Collection) arrayList);
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) lbu.f25754a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lbu", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("fetch existing cards failed");
            bngx = bngx.m109376e();
        }
        AutofillId autofillId = fillField6.f11631a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(autofillId);
        if (fillField7 != null) {
            arrayList2.add(fillField7.f11631a);
        }
        if (fillField8 != null) {
            arrayList2.add(fillField8.f11631a);
        }
        if (fillField9 != null) {
            arrayList2.add(fillField9.f11631a);
        }
        FillField fillField10 = fillField6;
        bngx bngx3 = bngx;
        SaveInfo.Builder flags = new SaveInfo.Builder((!ssw.m36269a() || !cciw.m129956e()) ? 4 : 128, (AutofillId[]) arrayList2.toArray(new AutofillId[0])).setFlags(1);
        if (!list.isEmpty()) {
            flags.setOptionalIds((AutofillId[]) list.toArray(new AutofillId[0]));
        }
        if (lcf.f25782f.mo66813a()) {
            MetricsContext metricsContext = (MetricsContext) lcf.f25782f.mo66814b();
            FillForm fillForm = lcf.f25778b;
            bxvd da = lau.f25613i.mo74144da();
            bxvd da2 = kzz.f25505d.mo74144da();
            int a3 = metricsContext.mo7953a();
            fillField = fillField9;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((kzz) da2.f164949b).f25507a = a3;
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
            lbf a4 = kwv.m18703a(fillForm);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a4.getClass();
            ((lau) da.f164949b).f25619e = a4;
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
            bArr = ((lau) da.mo74062i()).mo73642k();
        } else {
            fillField = fillField9;
            bArr = new byte[0];
        }
        Intent a5 = kyu.m18809a(lbu.f25756b, lcf.f25778b.f11643c, lcf.f25777a, laz.PAYMENT_CARD, bArr);
        if (a5 != null) {
            flags.setNegativeAction(0, PendingIntent.getService(lbu.f25756b, 0, a5, 134217728).getIntentSender());
        }
        int i2 = Build.VERSION.SDK_INT;
        CustomDescription.Builder builder = new CustomDescription.Builder(lbj.m18886a(lbu.f25756b, getSaveInstrumentDetailsResponse2.f110186c));
        builder.addChild(16908308, kcb.m17625a(autofillId, lqy.f26619d, lqy.m19550a((CharSequence) lbu.f25756b.getString(C0126R.string.common_card))));
        builder.addChild(16908294, kcb.m17624a(autofillId, lqy.f26619d, qkj.m32287a(lbu.f25756b, C0126R.C0127drawable.quantum_ic_credit_card_black_24)));
        String[] strArr = getSaveInstrumentDetailsResponse2.f110184a;
        int[] iArr = getSaveInstrumentDetailsResponse2.f110185b;
        if (strArr != null && iArr != null && (length = strArr.length) > 0 && length == iArr.length) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str = strArr[i3];
                int i4 = iArr[i3];
                Pattern a6 = lbu.m18910a(str);
                if (a6 != null) {
                    CharSequence a7 = lra.m19564a(lbu.f25756b, i4);
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(lqy.f26618c);
                    builder.addChild(16908308, kcb.m17625a(autofillId, Pattern.compile(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)), lqy.m19550a(a7)));
                    builder.addChild(16908294, kcb.m17624a(autofillId, a6, qkj.m32287a(lbu.f25756b, lra.m19566b(lbu.f25756b, i4).mo14380b())));
                }
            }
        } else {
            bnsl bnsl2 = (bnsl) lbu.f25754a.mo68388c();
            bnsl2.mo68432a("lbu", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("binRegexes.length != cardNetworks.length");
        }
        ArrayList arrayList3 = new ArrayList(2);
        if (!(fillField7 == null || fillField8 == null)) {
            AutofillId autofillId2 = fillField7.f11631a;
            AutofillId autofillId3 = fillField8.f11631a;
            if (fillField7.f11632b == 3 && !lbu.m18911a(fillField7, lqy.f26622g)) {
                arrayList3.add(kcc.m17626a(autofillId3, lqy.f26624i));
            } else {
                arrayList3.add(Validators.and(kcc.m17626a(autofillId2, lqy.f26622g), kcc.m17626a(autofillId3, lqy.f26624i)));
                builder.addChild(qkj.m32287a(lbu.f25756b, C0126R.C0129id.card_expiration_month), kcb.m17625a(autofillId2, lqy.f26622g, "$1"));
                builder.addChild(qkj.m32287a(lbu.f25756b, C0126R.C0129id.card_expiration_year), kcb.m17625a(autofillId3, lqy.f26624i, "/$2"));
            }
        }
        if (fillField == null) {
            fillField2 = fillField;
        } else {
            fillField2 = fillField;
            if (fillField2.f11632b != 4) {
                AutofillId autofillId4 = fillField2.f11631a;
                arrayList3.add(kcc.m17626a(autofillId4, lqy.f26625j));
                builder.addChild(qkj.m32287a(lbu.f25756b, C0126R.C0129id.card_expiration_month), kcb.m17625a(autofillId4, lqy.f26625j, "$1"));
                builder.addChild(qkj.m32287a(lbu.f25756b, C0126R.C0129id.card_expiration_year), kcb.m17625a(autofillId4, lqy.f26625j, "/$3"));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(kcc.m17627a(autofillId));
        arrayList4.add(kcc.m17626a(autofillId, lqy.f26619d));
        arrayList4.add(Validators.or((Validator[]) arrayList3.toArray(new Validator[0])));
        int size = bngx3.size();
        int i5 = 0;
        while (i5 < size) {
            bngx bngx4 = bngx3;
            kdb kdb = (kdb) bngx4.get(i5);
            YearMonth yearMonth = kdb.f23849d;
            if (yearMonth != null) {
                String str2 = kdb.f23847b;
                ArrayList arrayList5 = new ArrayList(5);
                arrayList5.add(kcc.m17626a(autofillId, lqy.m19552a(str2)));
                if (fillField7 == null || fillField8 == null) {
                    i = size;
                    fillField4 = fillField7;
                    bngx2 = bngx4;
                    getSaveInstrumentDetailsResponse = getSaveInstrumentDetailsResponse2;
                } else {
                    i = size;
                    AutofillId autofillId5 = fillField7.f11631a;
                    fillField4 = fillField7;
                    String a8 = lqy.m19549a(yearMonth.getMonthValue());
                    bngx2 = bngx4;
                    getSaveInstrumentDetailsResponse = getSaveInstrumentDetailsResponse2;
                    StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 8);
                    sb.append("^\\D*");
                    sb.append(a8);
                    sb.append("\\D*$");
                    arrayList5.add(kcc.m17626a(autofillId5, Pattern.compile(sb.toString())));
                    AutofillId autofillId6 = fillField8.f11631a;
                    String b2 = lqy.m19554b(yearMonth.getYear());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 8);
                    sb2.append("^\\D*");
                    sb2.append(b2);
                    sb2.append("\\D*$");
                    arrayList5.add(kcc.m17626a(autofillId6, Pattern.compile(sb2.toString())));
                }
                if (fillField2 != null) {
                    AutofillId autofillId7 = fillField2.f11631a;
                    String a9 = lqy.m19549a(yearMonth.getMonthValue());
                    String str3 = lqy.f26623h;
                    fillField3 = fillField8;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a9).length() + 11 + String.valueOf(str3).length());
                    sb3.append("^\\D*");
                    sb3.append(a9);
                    sb3.append("\\D*");
                    sb3.append(str3);
                    sb3.append("\\D*$");
                    arrayList5.add(kcc.m17626a(autofillId7, Pattern.compile(sb3.toString())));
                    AutofillId autofillId8 = fillField2.f11631a;
                    int year = yearMonth.getYear();
                    String str4 = lqy.f26621f;
                    String b3 = lqy.m19554b(year);
                    fillField5 = fillField2;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 11 + String.valueOf(b3).length());
                    sb4.append("^\\D*");
                    sb4.append(str4);
                    sb4.append("\\D*");
                    sb4.append(b3);
                    sb4.append("\\D*$");
                    arrayList5.add(kcc.m17626a(autofillId8, Pattern.compile(sb4.toString())));
                } else {
                    fillField5 = fillField2;
                    fillField3 = fillField8;
                }
                arrayList4.add(Validators.or((Validator[]) arrayList5.toArray(new Validator[0])));
            } else {
                i = size;
                fillField5 = fillField2;
                fillField4 = fillField7;
                fillField3 = fillField8;
                bngx2 = bngx4;
                getSaveInstrumentDetailsResponse = getSaveInstrumentDetailsResponse2;
            }
            i5++;
            size = i;
            fillField2 = fillField5;
            fillField7 = fillField4;
            bngx3 = bngx2;
            getSaveInstrumentDetailsResponse2 = getSaveInstrumentDetailsResponse;
            fillField8 = fillField3;
        }
        FillField fillField11 = fillField2;
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse3 = getSaveInstrumentDetailsResponse2;
        if (strArr != null) {
            arrayList4.add(Validators.or((Validator[]) Arrays.stream(strArr).map(lbq.f25750a).filter(lbr.f25751a).map(new lbs(fillField10)).toArray(lbt.f25753a)));
        }
        flags.setValidator(Validators.and((Validator[]) arrayList4.toArray(new Validator[0]))).setCustomDescription(builder.build());
        int i6 = Build.VERSION.SDK_INT;
        flags.addSanitizer(new TextValueSanitizer(lqy.f26620e, "$1$2$3$4"), autofillId);
        if (fillField11 != null) {
            flags.addSanitizer(new TextValueSanitizer(lqy.f26625j, "$1/$3"), fillField11.f11631a);
        }
        return bmxv.m108566b(lcg.m18923a(flags.build(), getSaveInstrumentDetailsResponse3.f110187d, bngx.m109376e()));
    }
}
