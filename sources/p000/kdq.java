package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.time.YearMonth;

/* renamed from: kdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdq extends kdn {

    /* renamed from: b */
    private final Context f23895b;

    public kdq(Context context) {
        this.f23895b = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnhe mo14409a(Object obj, FillForm fillForm) {
        String str;
        bmxv bmxv;
        Object obj2;
        kdb kdb = (kdb) obj;
        kcu kcu = kdb.f23846a;
        YearMonth yearMonth = kdb.f23849d;
        if (yearMonth != null) {
            str = kds.m17696a(yearMonth);
        } else {
            str = null;
        }
        bmxv bmxv2 = kdb.f23850e;
        if (cciz.f179136a.mo6606a().mo76094a() && bmxv2.mo66813a()) {
            String trim = ((String) bmxv2.mo66814b()).trim();
            if (trim.isEmpty() || ((long) trim.length()) > cciz.f179136a.mo6606a().mo76095b() || trim.contains("\r") || trim.contains("\n")) {
                bmxv = bmvz.f131120a;
            } else {
                bmxv = bmxv.m108566b(trim);
            }
        } else {
            bmxv = bmvz.f131120a;
        }
        Object[] objArr = new Object[2];
        if (bmxv.mo66813a()) {
            obj2 = bmxv.mo66814b();
        } else {
            obj2 = lra.m19564a(this.f23895b, kdb.f23848c);
        }
        objArr[0] = obj2;
        objArr[1] = kdb.f23847b;
        String format = String.format("%s •••• %s", objArr);
        kcz b = lra.m19566b(this.f23895b, kdb.f23848c);
        PendingIntent a = lio.m19190a(this.f23895b, kcu, fillForm);
        if (a == null) {
            return bnoj.f131912b;
        }
        kpz a2 = kqk.m18330a(a);
        kqc kqc = new kqc(a2, format, str, b, kqo.m18353a(lqy.m19555b()));
        kqc kqc2 = new kqc(a2, format, str, b, kqo.m18353a(lqy.m19551a()));
        bnha h = bnhe.m109414h();
        bnre i = fillForm.mo7950b(kpb.PAYMENT_CARD_NUMBER).listIterator();
        while (i.hasNext()) {
            h.mo67695b((FillField) i.next(), kqc2);
        }
        bnre i2 = fillForm.mo7950b(kpb.PAYMENT_CARD_HOLDER_NAME).listIterator();
        while (i2.hasNext()) {
            h.mo67695b((FillField) i2.next(), kqc);
        }
        bnre i3 = fillForm.mo7950b(kpb.PERSON_NAME).listIterator();
        while (i3.hasNext()) {
            h.mo67695b((FillField) i3.next(), kqc);
        }
        return h.mo67618b();
    }

    /* renamed from: a */
    public final Class mo14410a() {
        return kdb.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14411a(bnht bnht) {
        return null;
    }

    /* renamed from: a */
    public final boolean mo14412a(bnic bnic) {
        return bnic.contains(kpb.PAYMENT_CARD_NUMBER);
    }
}
