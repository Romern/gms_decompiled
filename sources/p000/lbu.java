package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.service.autofill.CustomDescription;
import android.service.autofill.SaveInfo;
import android.service.autofill.TextValueSanitizer;
import android.service.autofill.Validator;
import android.service.autofill.Validators;
import android.view.autofill.AutofillId;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.service.common.ImmutableDetectionHistory;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@Deprecated
/* renamed from: lbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbu implements lch {

    /* renamed from: a */
    public static final srn f25754a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: d */
    private static final bnic f25755d = bnic.m109490a(kpb.PAYMENT_CARD_NUMBER, kpb.PAYMENT_CARD_HOLDER_NAME);

    /* renamed from: b */
    public final Context f25756b;

    /* renamed from: c */
    public final awkh f25757c;

    /* renamed from: e */
    private final kbe f25758e;

    public lbu(Context context, kbe kbe, awkh awkh) {
        this.f25756b = context;
        this.f25758e = kbe;
        this.f25757c = awkh;
    }

    /* renamed from: a */
    private final bmxv m18907a(FillField fillField, FillField fillField2, FillField fillField3, FillField fillField4, List list, GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse, List list2, lcf lcf) {
        byte[] bArr;
        Iterator it;
        int length;
        int[] iArr;
        FillField fillField5 = fillField;
        FillField fillField6 = fillField2;
        FillField fillField7 = fillField3;
        FillField fillField8 = fillField4;
        GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse2 = getSaveInstrumentDetailsResponse;
        lcf lcf2 = lcf;
        AutofillId autofillId = fillField5.f11631a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(autofillId);
        if (fillField6 != null) {
            arrayList.add(fillField6.f11631a);
        }
        if (fillField7 != null) {
            arrayList.add(fillField7.f11631a);
        }
        if (fillField8 != null) {
            arrayList.add(fillField8.f11631a);
        }
        SaveInfo.Builder flags = new SaveInfo.Builder((!ssw.m36269a() || !cciw.m129956e()) ? 4 : 128, (AutofillId[]) arrayList.toArray(new AutofillId[0])).setFlags(1);
        if (!list.isEmpty()) {
            flags.setOptionalIds((AutofillId[]) list.toArray(new AutofillId[0]));
        }
        if (lcf2.f25782f.mo66813a()) {
            MetricsContext metricsContext = (MetricsContext) lcf2.f25782f.mo66814b();
            FillForm fillForm = lcf2.f25778b;
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
            lbf a2 = kwv.m18703a(fillForm);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a2.getClass();
            ((lau) da.f164949b).f25619e = a2;
            laz laz = laz.PAYMENT_CARD;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lau) da.f164949b).f25620f = laz.mo3214a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lau lau = (lau) da.f164949b;
            lau.f25617c = false;
            lau.f25621g = lat.m18861a(4);
            bArr = ((lau) da.mo74062i()).serializeToBytes();
        } else {
            bArr = new byte[0];
        }
        Intent a3 = kyu.m18809a(this.f25756b, lcf2.f25778b.f11643c, lcf2.f25777a, laz.PAYMENT_CARD, bArr);
        if (a3 != null) {
            flags.setNegativeAction(0, PendingIntent.getService(this.f25756b, 0, a3, 134217728).getIntentSender());
        }
        int i = Build.VERSION.SDK_INT;
        CustomDescription.Builder builder = new CustomDescription.Builder(lbj.m18886a(this.f25756b, getSaveInstrumentDetailsResponse2.f110186c));
        builder.addChild(16908308, kcb.m17625a(autofillId, lqy.f26619d, lqy.m19550a((CharSequence) this.f25756b.getString(C0126R.string.common_card))));
        builder.addChild(16908294, kcb.m17624a(autofillId, lqy.f26619d, qkj.m32287a(this.f25756b, C0126R.C0127drawable.quantum_ic_credit_card_black_24)));
        String[] strArr = getSaveInstrumentDetailsResponse2.f110184a;
        int[] iArr2 = getSaveInstrumentDetailsResponse2.f110185b;
        if (strArr != null && iArr2 != null && (length = strArr.length) > 0 && length == iArr2.length) {
            int i2 = 0;
            while (i2 < strArr.length) {
                String str = strArr[i2];
                int i3 = iArr2[i2];
                Pattern a4 = m18910a(str);
                if (a4 != null) {
                    CharSequence a5 = lra.m19564a(this.f25756b, i3);
                    String valueOf = String.valueOf(str);
                    iArr = iArr2;
                    String valueOf2 = String.valueOf(lqy.f26618c);
                    builder.addChild(16908308, kcb.m17625a(autofillId, Pattern.compile(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)), lqy.m19550a(a5)));
                    builder.addChild(16908294, kcb.m17624a(autofillId, a4, qkj.m32287a(this.f25756b, lra.m19566b(this.f25756b, i3).mo14380b())));
                } else {
                    iArr = iArr2;
                }
                i2++;
                iArr2 = iArr;
            }
        } else {
            bnsl bnsl = (bnsl) f25754a.mo68388c();
            bnsl.mo68432a("lbu", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("binRegexes.length != cardNetworks.length");
        }
        ArrayList arrayList2 = new ArrayList(2);
        if (!(fillField6 == null || fillField7 == null)) {
            AutofillId autofillId2 = fillField6.f11631a;
            AutofillId autofillId3 = fillField7.f11631a;
            if (fillField6.f11632b == 3 && !m18911a(fillField6, lqy.f26622g)) {
                arrayList2.add(kcc.m17626a(autofillId3, lqy.f26624i));
            } else {
                arrayList2.add(Validators.and(kcc.m17626a(autofillId2, lqy.f26622g), kcc.m17626a(autofillId3, lqy.f26624i)));
                builder.addChild(qkj.m32287a(this.f25756b, C0126R.C0129id.card_expiration_month), kcb.m17625a(autofillId2, lqy.f26622g, "$1"));
                builder.addChild(qkj.m32287a(this.f25756b, C0126R.C0129id.card_expiration_year), kcb.m17625a(autofillId3, lqy.f26624i, "/$2"));
            }
        }
        if (!(fillField8 == null || fillField8.f11632b == 4)) {
            AutofillId autofillId4 = fillField8.f11631a;
            arrayList2.add(kcc.m17626a(autofillId4, lqy.f26625j));
            builder.addChild(qkj.m32287a(this.f25756b, C0126R.C0129id.card_expiration_month), kcb.m17625a(autofillId4, lqy.f26625j, "$1"));
            builder.addChild(qkj.m32287a(this.f25756b, C0126R.C0129id.card_expiration_year), kcb.m17625a(autofillId4, lqy.f26625j, "/$3"));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(kcc.m17627a(autofillId));
        arrayList3.add(kcc.m17626a(autofillId, lqy.f26619d));
        arrayList3.add(Validators.or((Validator[]) arrayList2.toArray(new Validator[0])));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            kdb kdb = (kdb) it2.next();
            YearMonth yearMonth = kdb.f23849d;
            if (yearMonth != null) {
                String str2 = kdb.f23847b;
                ArrayList arrayList4 = new ArrayList(5);
                arrayList4.add(kcc.m17626a(autofillId, lqy.m19552a(str2)));
                if (fillField6 == null || fillField7 == null) {
                    it = it2;
                } else {
                    AutofillId autofillId5 = fillField6.f11631a;
                    String a6 = lqy.m19549a(yearMonth.getMonthValue());
                    it = it2;
                    StringBuilder sb = new StringBuilder(String.valueOf(a6).length() + 8);
                    sb.append("^\\D*");
                    sb.append(a6);
                    sb.append("\\D*$");
                    arrayList4.add(kcc.m17626a(autofillId5, Pattern.compile(sb.toString())));
                    AutofillId autofillId6 = fillField7.f11631a;
                    String b2 = lqy.m19554b(yearMonth.getYear());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b2).length() + 8);
                    sb2.append("^\\D*");
                    sb2.append(b2);
                    sb2.append("\\D*$");
                    arrayList4.add(kcc.m17626a(autofillId6, Pattern.compile(sb2.toString())));
                }
                if (fillField8 != null) {
                    AutofillId autofillId7 = fillField8.f11631a;
                    String a7 = lqy.m19549a(yearMonth.getMonthValue());
                    String str3 = lqy.f26623h;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a7).length() + 11 + String.valueOf(str3).length());
                    sb3.append("^\\D*");
                    sb3.append(a7);
                    sb3.append("\\D*");
                    sb3.append(str3);
                    sb3.append("\\D*$");
                    arrayList4.add(kcc.m17626a(autofillId7, Pattern.compile(sb3.toString())));
                    AutofillId autofillId8 = fillField8.f11631a;
                    int year = yearMonth.getYear();
                    String str4 = lqy.f26621f;
                    String b3 = lqy.m19554b(year);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 11 + String.valueOf(b3).length());
                    sb4.append("^\\D*");
                    sb4.append(str4);
                    sb4.append("\\D*");
                    sb4.append(b3);
                    sb4.append("\\D*$");
                    arrayList4.add(kcc.m17626a(autofillId8, Pattern.compile(sb4.toString())));
                }
                arrayList3.add(Validators.or((Validator[]) arrayList4.toArray(new Validator[0])));
                fillField6 = fillField2;
                fillField7 = fillField3;
                fillField8 = fillField4;
                it2 = it;
            } else {
                fillField6 = fillField2;
                fillField7 = fillField3;
                fillField8 = fillField4;
            }
        }
        if (strArr != null) {
            arrayList3.add(Validators.or((Validator[]) Arrays.stream(strArr).map(lbq.f25750a).filter(lbr.f25751a).map(new lbs(fillField5)).toArray(lbt.f25753a)));
        }
        flags.setValidator(Validators.and((Validator[]) arrayList3.toArray(new Validator[0]))).setCustomDescription(builder.build());
        int i4 = Build.VERSION.SDK_INT;
        flags.addSanitizer(new TextValueSanitizer(lqy.f26620e, "$1$2$3$4"), autofillId);
        FillField fillField9 = fillField4;
        if (fillField9 != null) {
            flags.addSanitizer(new TextValueSanitizer(lqy.f26625j, "$1/$3"), fillField9.f11631a);
        }
        return bmxv.m108566b(lcg.m18923a(flags.build(), getSaveInstrumentDetailsResponse.f110187d, bngx.m109376e()));
    }

    /* renamed from: a */
    private final bngx m18908a(bqgg bqgg) {
        try {
            kek kek = (kek) bqga.m112780a((Future) bqgg);
            ArrayList arrayList = new ArrayList(kek.f23936a.size());
            bnrd a = kek.f23936a.iterator();
            while (a.hasNext()) {
                Object a2 = ((kct) a.next()).mo14368a();
                if (a2 instanceof kdb) {
                    arrayList.add((kdb) a2);
                }
            }
            return bngx.m109368a((Collection) arrayList);
        } catch (ExecutionException e) {
            bnsl bnsl = (bnsl) f25754a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lbu", "a", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("fetch existing cards failed");
            return bngx.m109376e();
        }
    }

    /* renamed from: a */
    private static FillField m18909a(FillForm fillForm, bngx bngx, kpb kpb, ImmutableDetectionHistory immutableDetectionHistory) {
        FillField fillField;
        if (fillForm.mo7949a(kpb)) {
            fillField = (FillField) fillForm.mo7950b(kpb).get(0);
        } else {
            fillField = null;
        }
        if (fillField != null) {
            return fillField;
        }
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            FillField fillField2 = (FillField) i.next();
            if (fillField2.mo7943a(kpb)) {
                return fillField2;
            }
        }
        return f25755d.contains(kpb) ? immutableDetectionHistory.mo15000a(kpb) : fillField;
    }

    /* renamed from: a */
    public static Pattern m18910a(String str) {
        try {
            return Pattern.compile(String.valueOf(str).concat(".*"));
        } catch (PatternSyntaxException e) {
            bnsl bnsl = (bnsl) f25754a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lbu", "a", 486, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68448m();
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m18911a(FillField fillField, Pattern pattern) {
        bnre i = fillField.f11633c.listIterator();
        while (i.hasNext()) {
            if (pattern.matcher((CharSequence) i.next()).find()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r11 == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f0, code lost:
        if (m18911a(r5, p000.lqy.f26625j) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        if (r5.f11632b == 4) goto L_0x00f8;
     */
    /* renamed from: a */
    public final bqgg mo14962a(lcf lcf) {
        boolean z;
        boolean z2;
        PackageInfo currentWebViewPackage;
        lcf lcf2 = lcf;
        if (!lcf2.f25777a.equals(lcf2.f25778b.f11643c) && (currentWebViewPackage = WebView.getCurrentWebViewPackage()) != null && (("com.android.chrome".equals(currentWebViewPackage.packageName) || "com.google.android.webview".equals(currentWebViewPackage.packageName) || "com.chrome.beta".equals(currentWebViewPackage.packageName) || "com.chrome.dev".equals(currentWebViewPackage.packageName) || "com.chrome.canary".equals(currentWebViewPackage.packageName)) && ((long) currentWebViewPackage.versionCode) < ccip.f179070a.mo6606a().mo76060w())) {
            return bqga.m112775a(bmvz.f131120a);
        }
        FillForm fillForm = lcf2.f25778b;
        FillField a = m18909a(fillForm, lcf2.f25781e, kpb.PAYMENT_CARD_NUMBER, lcf2.f25779c);
        if (a == null) {
            return bqga.m112775a(bmvz.f131120a);
        }
        FillField a2 = m18909a(fillForm, lcf2.f25781e, kpb.PAYMENT_CARD_EXPIRATION_MONTH, lcf2.f25779c);
        FillField a3 = m18909a(fillForm, lcf2.f25781e, kpb.PAYMENT_CARD_EXPIRATION_YEAR, lcf2.f25779c);
        FillField a4 = m18909a(fillForm, lcf2.f25781e, kpb.PAYMENT_CARD_EXPIRATION_DATE, lcf2.f25779c);
        if (a2 == null || a3 == null) {
            if (a4 != null) {
                int i = a4.f11632b;
                if (i != 1) {
                    if (i == 3) {
                    }
                }
            }
            return bqga.m112775a(bmvz.f131120a);
        }
        int i2 = a2.f11632b;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 == 3) {
            z = m18911a(a2, lqy.f26622g) || a2.f11633c.size() == 12 || a2.f11633c.size() == 13;
        }
        int i3 = a3.f11632b;
        if (i3 == 1) {
            z2 = true;
        } else {
            z2 = i3 == 3 && m18911a(a3, lqy.f26624i);
        }
        if (z) {
        }
        return bqga.m112775a(bmvz.f131120a);
        FillField[] fillFieldArr = {a, a2, a3, a4};
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < 4; i4++) {
            FillField fillField = fillFieldArr[i4];
            if (fillField != null && !hashSet.add(fillField.f11631a)) {
                return bqga.m112775a(bmvz.f131120a);
            }
        }
        bngx a5 = bngx.m109364a(kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_HOLDER_NAME, kpb.PERSON_NAME, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_COUNTRY);
        bnia j = bnic.m109500j();
        int size = a5.size();
        for (int i5 = 0; i5 < size; i5++) {
            kpb kpb = (kpb) a5.get(i5);
            if (fillForm.mo7949a(kpb)) {
                j.mo67629b(((FillField) fillForm.mo7950b(kpb).get(0)).f11631a);
            } else {
                if (f25755d.contains(kpb)) {
                    List b = lcf2.f25779c.mo15003b(kpb);
                    if (!b.isEmpty()) {
                        j.mo67629b(((FillField) b.get(0)).f11631a);
                    }
                }
                bnre i6 = lcf2.f25781e.listIterator();
                while (i6.hasNext()) {
                    FillField fillField2 = (FillField) i6.next();
                    if (fillField2.mo7943a(kpb)) {
                        j.mo67629b(fillField2.f11631a);
                    }
                }
            }
        }
        bngx g = j.mo67751a().mo67639g();
        bqgg a6 = bqdx.m112674a(this.f25758e.mo14345b(), new lbo(this, lcf2), bqfb.INSTANCE);
        return bqga.m112783b(a6, lcf2.f25780d).mo69216a(new lbp(this, a, a2, a3, a4, g, a6, lcf), bqfb.INSTANCE);
    }
}
