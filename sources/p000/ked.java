package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.HashMap;
import java.util.function.Function;

/* renamed from: ked */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ked extends kee {

    /* renamed from: b */
    public static final /* synthetic */ int f23916b = 0;

    /* renamed from: c */
    private static final bnhe f23917c;

    /* renamed from: d */
    private static final bnic f23918d = bnic.m109494a(kpb.POSTAL_ADDRESS_COUNTRY, kpb.POSTAL_ADDRESS_REGION, kpb.POSTAL_ADDRESS_LOCALITY, kpb.POSTAL_ADDRESS_POSTAL_CODE, kpb.POSTAL_ADDRESS_STREET_ADDRESS, kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kpb.POSTAL_ADDRESS);

    /* renamed from: e */
    private final Context f23919e;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(kpb.POSTAL_ADDRESS, kdv.f23906a);
        h.mo67695b(kpb.POSTAL_ADDRESS_COUNTRY, kdw.f23907a);
        h.mo67695b(kpb.POSTAL_ADDRESS_REGION, kdx.f23908a);
        h.mo67695b(kpb.POSTAL_ADDRESS_LOCALITY, kdy.f23909a);
        h.mo67695b(kpb.POSTAL_ADDRESS_POSTAL_CODE, kdz.f23910a);
        h.mo67695b(kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE, kea.f23913a);
        h.mo67695b(kpb.POSTAL_ADDRESS_STREET_ADDRESS, keb.f23914a);
        h.mo67695b(kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS, kec.f23915a);
        f23917c = h.mo67618b();
    }

    public ked(Context context) {
        super(kdg.class, f23918d);
        this.f23919e = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnhe mo14409a(Object obj, FillForm fillForm) {
        String str;
        String str2;
        String str3;
        kdg kdg = (kdg) obj;
        bnia bnia = new bnia();
        bnia.mo67629b(kpb.POSTAL_ADDRESS);
        bnia.mo67629b(kpb.POSTAL_ADDRESS_COUNTRY);
        bnia.mo67629b(kpb.POSTAL_ADDRESS_REGION);
        bnia.mo67629b(kpb.POSTAL_ADDRESS_LOCALITY);
        bnia.mo67629b(kpb.POSTAL_ADDRESS_POSTAL_CODE);
        bnia.mo67629b(kpb.POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);
        if (kdg.f23880h.size() > 0) {
            bnia.mo67629b(kpb.POSTAL_ADDRESS_STREET_ADDRESS);
            if (kdg.f23880h.size() >= 2) {
                bnia.mo67629b(kpb.POSTAL_ADDRESS_EXTENDED_ADDRESS);
            }
        }
        HashMap hashMap = new HashMap();
        bnrd a = bnia.mo67751a().iterator();
        while (a.hasNext()) {
            kpb kpb = (kpb) a.next();
            bnre i = fillForm.mo7950b(kpb).listIterator();
            while (i.hasNext()) {
                FillField fillField = (FillField) i.next();
                Function function = (Function) f23917c.get(kpb);
                sdo.m34959a(function);
                if (!(function == null || (str = (String) function.apply(kdg)) == null || str.isEmpty())) {
                    if (cciw.f179109a.mo6606a().mo76091x()) {
                        str2 = kdg.f23881i;
                        if (bmwb.m108443a("home", str2)) {
                            str2 = this.f23919e.getString(C0126R.string.home_address_alias_name);
                        } else if (bmwb.m108443a("work", str2)) {
                            str2 = this.f23919e.getString(C0126R.string.work_address_alias_name);
                        }
                    } else {
                        str2 = kdg.f23881i;
                    }
                    if (!str2.isEmpty()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + str.length());
                        sb.append(str2);
                        sb.append(" - ");
                        sb.append(str);
                        str3 = sb.toString();
                    } else {
                        str3 = str;
                    }
                    kqc kqc = new kqc(kqk.m18332b(str), str3, null, null);
                    if (!(fillField == null || hashMap.put(fillField, kqc) == null)) {
                        ((bnsl) kdn.f23894a.mo68388c()).mo68420a("Multiple entries for same FillField with types %s.", fillField.f11634d);
                    }
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        bnrd a2 = f23917c.keySet().iterator();
        while (a2.hasNext()) {
            bnre i3 = fillForm.mo7950b((kpb) a2.next()).listIterator();
            while (i3.hasNext()) {
                FillField fillField2 = (FillField) i3.next();
                if (!hashMap.containsKey(fillField2) && fillField2 != null && fillField2.f11632b == 1 && hashMap.put(fillField2, kqc.m18316a()) != null) {
                    ((bnsl) kdn.f23894a.mo68388c()).mo68420a("Multiple entries for same FillField with types %s.", fillField2.f11634d);
                }
            }
        }
        return bnhe.m109413a(hashMap);
    }
}
