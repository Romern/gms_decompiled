package p000;

import android.content.Context;
import android.os.Build;
import android.service.autofill.UserData;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import java.time.YearMonth;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* renamed from: ldb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ldb {

    /* renamed from: a */
    public static final srn f25832a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    final bqgj f25833b = bqgs.m112811a(Executors.newCachedThreadPool());

    /* renamed from: a */
    private final void m18945a(bqgg bqgg, bqgg bqgg2, bqgg bqgg3, bqgg bqgg4, UserFieldTypeManager userFieldTypeManager, kyq kyq) {
        bmxv bmxv;
        UserData userData;
        bndu bndu;
        bndu bndu2;
        try {
            bnia j = bnic.m109500j();
            j.mo67752b((Iterable) bqgg.get());
            j.mo67752b((Iterable) bqgg2.get());
            j.mo67752b((Iterable) bqgg3.get());
            j.mo67752b((Iterable) bqgg4.get());
            bnic a = j.mo67751a();
            bndu r = bndu.m109109r();
            bnrd a2 = a.iterator();
            while (a2.hasNext()) {
                Object a3 = ((kct) a2.next()).mo14368a();
                if (a3 instanceof kcy) {
                    r.mo67268a(kpb.EMAIL_ADDRESS, ((kcy) a3).f23845b);
                } else if (a3 instanceof kde) {
                    kde kde = (kde) a3;
                    String str = kde.f23861c;
                    String str2 = kde.f23860b;
                    r.mo67268a(kpb.PERSON_NAME_FAMILY, str);
                    r.mo67268a(kpb.PERSON_NAME_GIVEN, str2);
                    r.mo67268a(kpb.PERSON_NAME_MIDDLE, kde.f23862d);
                    kpb kpb = kpb.PERSON_NAME;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(str);
                    r.mo67268a(kpb, sb.toString());
                } else if (a3 instanceof kdf) {
                    kdf kdf = (kdf) a3;
                    r.mo67268a(kpb.PHONE_COUNTRY_CODE, kdf.f23869d);
                    r.mo67268a(kpb.PHONE_NATIONAL, kdf.f23870e);
                } else if (a3 instanceof kdg) {
                    kdg kdg = (kdg) a3;
                    r.mo67268a(kpb.POSTAL_ADDRESS, kdg.f23874b);
                    r.mo67268a(kpb.POSTAL_ADDRESS_REGION, kdg.f23875c);
                    r.mo67268a(kpb.POSTAL_ADDRESS_POSTAL_CODE, kdg.f23876d);
                    r.mo67268a(kpb.POSTAL_ADDRESS_LOCALITY, kdg.f23879g);
                } else if (a3 instanceof Credential) {
                    Credential credential = (Credential) a3;
                    if (credential.mo7926a()) {
                        r.mo67268a(kpb.USERNAME, credential.f11608a);
                    }
                    if (credential.mo7927b()) {
                        r.mo67268a(kpb.PASSWORD, credential.f11609b.f23889a);
                    }
                } else if (a3 instanceof kdb) {
                    kdb kdb = (kdb) a3;
                    YearMonth yearMonth = kdb.f23849d;
                    if (yearMonth != null) {
                        r.mo67268a(kpb.PAYMENT_CARD_EXPIRATION_YEAR, String.valueOf(yearMonth.getYear()));
                    }
                    r.mo67268a(kpb.PAYMENT_CARD_NUMBER, kdb.f23847b);
                }
            }
            HashSet hashSet = new HashSet();
            UserData.Builder builder = null;
            int i = 0;
            int i2 = 0;
            for (kpb kpb2 : r.mo67316o()) {
                if (i >= UserData.getMaxCategoryCount()) {
                    break;
                }
                Iterator it = r.mo67127c(kpb2).iterator();
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        bndu = r;
                        break;
                    }
                    String str3 = (String) it.next();
                    if (i2 >= UserData.getMaxUserDataSize()) {
                        bndu = r;
                        break;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (!ccjc.f179140a.mo6606a().mo76098b()) {
                        if (hashSet.contains(str3)) {
                            bndu2 = r;
                            r = bndu2;
                        }
                    }
                    bndu2 = r;
                    if (str3.length() >= UserData.getMinValueLength()) {
                        if (str3.length() <= UserData.getMaxValueLength()) {
                            if (builder == null) {
                                builder = new UserData.Builder("version_1", str3, kpb2.name());
                            } else {
                                builder.add(str3, kpb2.name());
                            }
                            userFieldTypeManager.mo7965b(kpb2);
                            hashSet.add(str3);
                            i2++;
                            z = true;
                        }
                    }
                    r = bndu2;
                }
                if (z) {
                    i++;
                }
                if (i2 >= UserData.getMaxUserDataSize()) {
                    break;
                }
                r = bndu;
            }
            if (builder != null) {
                bmxv = bmxv.m108566b(builder.build());
            } else {
                bmxv = bmvz.f131120a;
            }
            if (!bmxv.mo66813a()) {
                userData = new UserData.Builder("version_1", "aaa", "aaa").build();
            } else {
                userData = (UserData) bmxv.mo66814b();
            }
            kyq.f25431a.setUserData(userData);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bnsl bnsl = (bnsl) f25832a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ldb", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68448m();
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) f25832a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ldb", "a", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68448m();
        }
    }

    /* renamed from: a */
    public final void mo14994a(Context context, bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        bqgg bqgg;
        bqgg bqgg2;
        bqgg bqgg3;
        bqgg bqgg4;
        bnsl bnsl = (bnsl) f25832a.mo68390d();
        bnsl.mo68432a("ldb", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Sending user data to AutofillManager");
        kre a = krc.m18382a(context);
        kuw a2 = a.mo14825a(context);
        bmxv g = a2.mo14869g();
        bmxv h = a2.mo14870h();
        bmxv f = a2.mo14868f();
        bmxv e = a2.mo14867e();
        kyq k = a.mo14836k();
        UserFieldTypeManager r = a.mo14843r();
        kck kck = null;
        if (bmxv.mo66813a()) {
            try {
                kck = a.mo14833h().mo14765b((String) bmxv.mo66814b());
            } catch (kpi e2) {
            }
        }
        if (g.mo66813a()) {
            bqgg = ((khu) g.mo66814b()).mo14431a(this.f25833b);
        } else {
            bqgg = bqga.m112775a((Object) bnon.f131923a);
        }
        if (h.mo66813a()) {
            bqgg2 = ((kid) h.mo66814b()).mo14499b(this.f25833b);
        } else {
            bqgg2 = bqga.m112775a((Object) bnon.f131923a);
        }
        if (f.mo66813a() && kck != null) {
            bqgg3 = bqdx.m112674a(((kfx) f.mo66814b()).mo14429a(new kej(new kel(this.f25833b, kck, bmxv2.mo66813a() ? bnic.m109489a((kcv) bmxv2.mo66814b()) : bnon.f131923a, bmxv3), Credential.class)), lcz.f25823a, this.f25833b);
        } else {
            bqgg3 = bqga.m112775a((Object) bnon.f131923a);
        }
        if (e.mo66813a()) {
            khd khd = (khd) e.mo66814b();
            bqgj bqgj = this.f25833b;
            khf b = khl.m17863b();
            b.mo14470a(bqgj);
            b.mo14469a(bmvz.f131120a);
            b.mo14473b(bmvz.f131120a);
            b.mo14472a(khd.f24125f);
            b.mo14471a(khd);
            bqgg4 = b.mo14468a().mo14467a();
        } else {
            bqgg4 = bqga.m112775a((Object) bnon.f131923a);
        }
        bqga.m112783b(bqgg, bqgg2, bqgg3, bqgg4).mo69214a(new lda(bqgg, bqgg2, bqgg3, bqgg4, r, k), this.f25833b);
    }
}
