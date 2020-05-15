package p000;

import android.content.Context;
import android.os.Build;
import android.view.autofill.AutofillValue;
import com.google.android.gms.autofill.data.PaymentCard;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;

/* renamed from: kds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kds extends kdn {

    /* renamed from: b */
    private static final bnic f23902b = bnic.m109493a(kpb.PAYMENT_CARD_EXPIRATION_DATE, kpb.PAYMENT_CARD_EXPIRATION_MONTH, kpb.PAYMENT_CARD_EXPIRATION_YEAR, kpb.PAYMENT_CARD_CVN, kpb.PAYMENT_CARD_HOLDER_NAME);

    /* renamed from: c */
    private final kdn f23903c;

    /* renamed from: d */
    private final Context f23904d;

    public kds(kdn kdn, Context context) {
        this.f23903c = kdn;
        this.f23904d = context;
    }

    /* renamed from: a */
    static String m17696a(YearMonth yearMonth) {
        return DateTimeFormatter.ofPattern("M/yy").format(yearMonth);
    }

    /* renamed from: b */
    private static YearMonth m17698b(bnht bnht) {
        Integer num;
        Integer num2;
        int listValue;
        String a;
        String group;
        String group2;
        String a2;
        String group3;
        bnrd a3 = bnht.mo67692g(kpb.PAYMENT_CARD_EXPIRATION_MONTH).iterator();
        while (true) {
            if (!a3.hasNext()) {
                num = null;
                break;
            }
            kef kef = (kef) a3.next();
            AutofillValue autofillValue = kef.f23923b;
            if (autofillValue != null) {
                CharSequence[] charSequenceArr = kef.f23924c;
                if (autofillValue.isText()) {
                    String a4 = kdm.m17673a(autofillValue.getTextValue());
                    if (a4 != null) {
                        Matcher matcher = lqy.f26622g.matcher(a4);
                        if (matcher.matches() && (group3 = matcher.group(1)) != null) {
                            num = Integer.valueOf(Integer.parseInt(group3));
                        }
                    }
                    num = null;
                } else if (!autofillValue.isList()) {
                    num = null;
                } else if (charSequenceArr != null) {
                    int listValue2 = autofillValue.getListValue();
                    if (listValue2 < charSequenceArr.length && (a2 = kdm.m17673a(charSequenceArr[listValue2])) != null) {
                        try {
                            int parseInt = Integer.parseInt(a2);
                            if (parseInt > 0 && parseInt <= 12) {
                                num = Integer.valueOf(parseInt);
                            }
                        } catch (NumberFormatException e) {
                        }
                    }
                    int length = charSequenceArr.length;
                    num = length != 12 ? (length == 13 && listValue2 > 0) ? listValue2 <= 12 ? Integer.valueOf(listValue2) : null : null : (listValue2 < 0 || listValue2 > 11) ? null : Integer.valueOf(listValue2 + 1);
                } else {
                    num = null;
                }
                if (num != null) {
                    break;
                }
            }
        }
        bnrd a5 = bnht.mo67692g(kpb.PAYMENT_CARD_EXPIRATION_YEAR).iterator();
        while (true) {
            if (!a5.hasNext()) {
                num2 = null;
                break;
            }
            kef kef2 = (kef) a5.next();
            AutofillValue autofillValue2 = kef2.f23923b;
            if (autofillValue2 != null) {
                CharSequence[] charSequenceArr2 = kef2.f23924c;
                if (autofillValue2.isText()) {
                    String a6 = kdm.m17673a(autofillValue2.getTextValue());
                    if (a6 != null) {
                        Matcher matcher2 = lqy.f26624i.matcher(a6);
                        if (matcher2.matches() && (group2 = matcher2.group(1)) != null) {
                            num2 = Integer.valueOf(kdm.m17671a(Integer.parseInt(group2)));
                        }
                    }
                    num2 = null;
                } else if (!autofillValue2.isList()) {
                    num2 = null;
                } else {
                    if (!(charSequenceArr2 == null || (listValue = autofillValue2.getListValue()) >= charSequenceArr2.length || (a = kdm.m17673a(charSequenceArr2[listValue])) == null)) {
                        Matcher matcher3 = lqy.f26624i.matcher(a);
                        if (matcher3.matches() && (group = matcher3.group(1)) != null) {
                            num2 = Integer.valueOf(kdm.m17671a(Integer.parseInt(group)));
                        }
                    }
                    num2 = null;
                }
                if (num2 != null) {
                    break;
                }
            }
        }
        if (!(num == null || num2 == null)) {
            try {
                return YearMonth.of(kdm.m17671a(num2.intValue()), num.intValue());
            } catch (DateTimeException e2) {
            }
        }
        String a7 = kdm.m17672a(bnht.mo67692g(kpb.PAYMENT_CARD_EXPIRATION_DATE));
        if (a7 != null) {
            Matcher matcher4 = lqy.f26625j.matcher(a7);
            if (matcher4.matches()) {
                String group4 = matcher4.group(1);
                String group5 = matcher4.group(3);
                if (!(group4 == null || group5 == null)) {
                    try {
                        return YearMonth.of(kdm.m17671a(Integer.parseInt(group5)), Integer.parseInt(group4));
                    } catch (DateTimeException e3) {
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Class mo14410a() {
        return PaymentCard.class;
    }

    /* renamed from: a */
    private static void m17697a(bnha bnha, FillField fillField, kdj kdj, CharSequence charSequence, CharSequence charSequence2, kcz kcz) {
        if (kdj != null && !kdj.f23889a.isEmpty()) {
            kdn.m17676a(bnha, fillField, kqk.m18332b(kdj.f23889a), charSequence, charSequence2, kcz);
        }
    }

    /* renamed from: a */
    public final bnhe mo14409a(PaymentCard paymentCard, FillForm fillForm) {
        String str;
        kqu kqu;
        PaymentCard paymentCard2 = paymentCard;
        FillForm fillForm2 = fillForm;
        bnha h = bnhe.m109414h();
        kcz b = lra.m19566b(this.f23904d, paymentCard2.f11618f);
        String str2 = paymentCard2.f11613a.f23889a;
        String format = String.format("%s •••• %s", lra.m19564a(this.f23904d, paymentCard2.f11618f), str2.substring(str2.length() - 4));
        YearMonth yearMonth = paymentCard2.f11616d;
        if (yearMonth != null) {
            str = m17696a(yearMonth);
        } else {
            str = null;
        }
        bnre i = fillForm2.mo7950b(kpb.PAYMENT_CARD_NUMBER).listIterator();
        while (i.hasNext()) {
            m17697a(h, (FillField) i.next(), paymentCard2.f11613a, format, str, b);
        }
        bnre i2 = fillForm2.mo7950b(kpb.PAYMENT_CARD_CVN).listIterator();
        while (i2.hasNext()) {
            m17697a(h, (FillField) i2.next(), paymentCard2.f11614b, format, str, b);
        }
        bnre i3 = fillForm2.mo7950b(kpb.PAYMENT_CARD_HOLDER_NAME).listIterator();
        while (i3.hasNext()) {
            kdn.m17675a(h, (FillField) i3.next(), paymentCard2.f11615c, format, str, b);
        }
        bnre i4 = fillForm2.mo7950b(kpb.PERSON_NAME).listIterator();
        while (i4.hasNext()) {
            kdn.m17675a(h, (FillField) i4.next(), paymentCard2.f11615c, format, str, b);
        }
        if (yearMonth != null) {
            bnre i5 = fillForm2.mo7950b(kpb.PAYMENT_CARD_EXPIRATION_MONTH).listIterator();
            while (i5.hasNext()) {
                kdn.m17676a(h, (FillField) i5.next(), kqk.m18331a(yearMonth.getMonthValue()), format, str, b);
            }
            bnre i6 = fillForm2.mo7950b(kpb.PAYMENT_CARD_EXPIRATION_YEAR).listIterator();
            while (i6.hasNext()) {
                FillField fillField = (FillField) i6.next();
                int i7 = fillField.f11638h;
                if (i7 != -1 && i7 < 4) {
                    kqu = new kqu(yearMonth.getYear(), 2);
                } else {
                    kqu = kqk.m18333b(yearMonth.getYear());
                }
                kdn.m17676a(h, fillField, kqu, format, str, b);
            }
            bnre i8 = fillForm2.mo7950b(kpb.PAYMENT_CARD_EXPIRATION_DATE).listIterator();
            while (i8.hasNext()) {
                kdn.m17676a(h, (FillField) i8.next(), new kqs(yearMonth), format, str, b);
            }
        }
        kdg kdg = paymentCard2.f11617e;
        if (kdg != null) {
            h.mo67694a(this.f23903c.mo14409a(kdg, fillForm2));
        }
        int i9 = Build.VERSION.SDK_INT;
        bnhe b2 = h.mo67618b();
        bnrd a = f23902b.iterator();
        while (a.hasNext()) {
            bnre i10 = fillForm2.mo7950b((kpb) a.next()).listIterator();
            while (i10.hasNext()) {
                FillField fillField2 = (FillField) i10.next();
                if (!b2.containsKey(fillField2) && fillField2 != null && fillField2.f11632b == 1) {
                    h.mo67695b(fillField2, kqc.m18316a());
                }
            }
        }
        return h.mo67618b();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14411a(bnht bnht) {
        String str;
        kdj b = kdm.m17674b(bnht.mo67692g(kpb.PAYMENT_CARD_NUMBER));
        if (b == null) {
            return null;
        }
        kdj b2 = kdm.m17674b(bnht.mo67692g(kpb.PAYMENT_CARD_CVN));
        YearMonth b3 = m17698b(bnht);
        String a = kdm.m17672a(bnht.mo67692g(kpb.PAYMENT_CARD_HOLDER_NAME));
        if (a == null) {
            str = kdm.m17672a(bnht.mo67692g(kpb.PERSON_NAME));
        } else {
            str = a;
        }
        bxvd da = kdg.f23871j.mo74144da();
        String a2 = kdm.m17672a(bnht.mo67692g(kpb.POSTAL_ADDRESS_STREET_ADDRESS));
        if (a2 != null) {
            da.mo74043d(a2);
        }
        String a3 = kdm.m17672a(bnht.mo67692g(kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS));
        if (a3 != null) {
            da.mo74043d(a3);
        }
        String a4 = kdm.m17672a(bnht.mo67692g(kpb.POSTAL_ADDRESS_LOCALITY));
        if (a4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kdg kdg = (kdg) da.f164949b;
            a4.getClass();
            kdg.f23873a |= 32;
            kdg.f23879g = a4;
        }
        String a5 = kdm.m17672a(bnht.mo67692g(kpb.POSTAL_ADDRESS_REGION));
        if (a5 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kdg kdg2 = (kdg) da.f164949b;
            a5.getClass();
            kdg2.f23873a |= 16;
            kdg2.f23878f = a5;
        }
        String a6 = kdm.m17672a(bnht.mo67692g(kpb.POSTAL_ADDRESS_POSTAL_CODE));
        if (a6 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kdg kdg3 = (kdg) da.f164949b;
            a6.getClass();
            kdg3.f23873a |= 4;
            kdg3.f23876d = a6;
        }
        String a7 = kdm.m17672a(bnht.mo67692g(kpb.POSTAL_ADDRESS_COUNTRY));
        if (a7 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            kdg kdg4 = (kdg) da.f164949b;
            a7.getClass();
            kdg4.f23873a |= 2;
            kdg4.f23875c = a7;
        }
        return new PaymentCard(b, b2, str, b3, (kdg) da.mo74062i(), 0);
    }

    /* renamed from: a */
    public final boolean mo14412a(bnic bnic) {
        return bnic.contains(kpb.PAYMENT_CARD_NUMBER);
    }
}
