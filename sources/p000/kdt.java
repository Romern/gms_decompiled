package p000;

import android.text.TextUtils;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: kdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdt extends kee {

    /* renamed from: b */
    private final lrc f23905b;

    public kdt(lrc lrc) {
        super(kde.class, bnic.m109494a(kpb.PERSON_NAME, kpb.PERSON_NAME_GIVEN, kpb.PERSON_NAME_FAMILY, kpb.PERSON_NAME_MIDDLE, kpb.PERSON_NAME_MIDDLE_INITAL, kpb.PAYMENT_CARD_HOLDER_NAME, new kpb[0]));
        this.f23905b = lrc;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnhe mo14409a(Object obj, FillForm fillForm) {
        String str;
        FillForm fillForm2 = fillForm;
        kde kde = (kde) obj;
        boolean isEmpty = kde.f23860b.isEmpty();
        boolean isEmpty2 = kde.f23861c.isEmpty();
        boolean a = kqz.m18380a(kde.f23860b);
        boolean a2 = kqz.m18380a(kde.f23861c);
        if ((!a || !a2) && ((!isEmpty || !a2) && (!a || !isEmpty2))) {
            ArrayList arrayList = new ArrayList(3);
            if (!kde.f23860b.isEmpty()) {
                arrayList.add(kde.f23860b);
            }
            if (!kde.f23862d.isEmpty()) {
                arrayList.add(kde.f23862d);
            }
            if (!kde.f23861c.isEmpty()) {
                arrayList.add(kde.f23861c);
            }
            str = TextUtils.join(" ", arrayList);
        } else {
            String valueOf = String.valueOf(kde.f23861c);
            String valueOf2 = String.valueOf(kde.f23860b);
            str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        }
        bnha h = bnhe.m109414h();
        bnre i = fillForm2.mo7950b(kpb.PERSON_NAME).listIterator();
        while (i.hasNext()) {
            kdn.m17675a(h, (FillField) i.next(), str, str, (CharSequence) null, (kcz) null);
        }
        bnre i2 = fillForm2.mo7950b(kpb.PAYMENT_CARD_HOLDER_NAME).listIterator();
        while (i2.hasNext()) {
            kdn.m17675a(h, (FillField) i2.next(), str, str, (CharSequence) null, (kcz) null);
        }
        bnre i3 = fillForm2.mo7950b(kpb.PERSON_NAME_GIVEN).listIterator();
        while (i3.hasNext()) {
            kdn.m17675a(h, (FillField) i3.next(), kde.f23860b, str, (CharSequence) null, (kcz) null);
        }
        bnre i4 = fillForm2.mo7950b(kpb.PERSON_NAME_FAMILY).listIterator();
        while (i4.hasNext()) {
            kdn.m17675a(h, (FillField) i4.next(), kde.f23861c, str, (CharSequence) null, (kcz) null);
        }
        if (ccij.m129843d()) {
            String str2 = kde.f23863e;
            bnre i5 = fillForm2.mo7950b(kpb.GENDER).listIterator();
            while (i5.hasNext()) {
                FillField fillField = (FillField) i5.next();
                if (!ccip.f179070a.mo6606a().mo76053p()) {
                    kdn.m17675a(h, fillField, str2, str2, (CharSequence) null, (kcz) null);
                } else {
                    kdn.m17676a(h, fillField, new kqp(str2, this.f23905b), str2, (CharSequence) null, (kcz) null);
                }
            }
        }
        if (ccij.m129842c() && (kde.f23859a & 16) != 0) {
            bzru bzru = kde.f23864f;
            if (bzru == null) {
                bzru = bzru.f171201d;
            }
            int i6 = bzru.f171205c;
            int i7 = bzru.f171204b;
            int i8 = bzru.f171203a;
            Calendar instance = Calendar.getInstance();
            instance.set(i8, i7 - 1, i6);
            String format = DateFormat.getDateInstance(2, Locale.getDefault()).format(instance.getTime());
            String valueOf3 = String.valueOf(i6);
            String valueOf4 = String.valueOf(i7);
            String valueOf5 = String.valueOf(i8);
            bnre i9 = fillForm2.mo7950b(kpb.BIRTHDATE_DAY).listIterator();
            while (i9.hasNext()) {
                kdn.m17675a(h, (FillField) i9.next(), valueOf3, format, (CharSequence) null, (kcz) null);
            }
            bnre i10 = fillForm2.mo7950b(kpb.BIRTHDATE_MONTH).listIterator();
            while (i10.hasNext()) {
                FillField fillField2 = (FillField) i10.next();
                if (!fillField2.f11633c.isEmpty()) {
                    kdn.m17676a(h, fillField2, kqk.m18331a(i7), format, (CharSequence) null, (kcz) null);
                } else {
                    kdn.m17675a(h, fillField2, valueOf4, format, (CharSequence) null, (kcz) null);
                }
            }
            bnre i11 = fillForm2.mo7950b(kpb.BIRTHDATE_YEAR).listIterator();
            while (i11.hasNext()) {
                FillField fillField3 = (FillField) i11.next();
                if (!fillField3.f11633c.isEmpty()) {
                    kdn.m17676a(h, fillField3, kqk.m18333b(i8), format, (CharSequence) null, (kcz) null);
                } else {
                    kdn.m17675a(h, fillField3, valueOf5, format, (CharSequence) null, (kcz) null);
                }
            }
        }
        if (ccij.m129841b()) {
            String valueOf6 = String.valueOf(kde.f23865g);
            bnre i12 = fillForm2.mo7950b(kpb.AGE).listIterator();
            while (i12.hasNext()) {
                kdn.m17675a(h, (FillField) i12.next(), valueOf6, valueOf6, (CharSequence) null, (kcz) null);
            }
        }
        if (!kde.f23862d.isEmpty()) {
            bnre i13 = fillForm2.mo7950b(kpb.PERSON_NAME_MIDDLE).listIterator();
            while (i13.hasNext()) {
                kdn.m17675a(h, (FillField) i13.next(), kde.f23862d, str, (CharSequence) null, (kcz) null);
            }
            bnre i14 = fillForm2.mo7950b(kpb.PERSON_NAME_MIDDLE_INITAL).listIterator();
            while (i14.hasNext()) {
                kdn.m17675a(h, (FillField) i14.next(), String.valueOf(kde.f23862d.charAt(0)), str, (CharSequence) null, (kcz) null);
            }
        }
        return h.mo67618b();
    }
}
