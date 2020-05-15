package p000;

import android.os.Build;
import android.service.autofill.UserData;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import java.time.YearMonth;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: lda */
final /* synthetic */ class lda implements bqeg {

    /* renamed from: a */
    private final bqgg f25826a;

    /* renamed from: b */
    private final bqgg f25827b;

    /* renamed from: c */
    private final bqgg f25828c;

    /* renamed from: d */
    private final bqgg f25829d;

    /* renamed from: e */
    private final UserFieldTypeManager f25830e;

    /* renamed from: f */
    private final kyq f25831f;

    public lda(bqgg bqgg, bqgg bqgg2, bqgg bqgg3, bqgg bqgg4, UserFieldTypeManager userFieldTypeManager, kyq kyq) {
        this.f25826a = bqgg;
        this.f25827b = bqgg2;
        this.f25828c = bqgg3;
        this.f25829d = bqgg4;
        this.f25830e = userFieldTypeManager;
        this.f25831f = kyq;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bmxv bmxv;
        UserData userData;
        Iterator it;
        Iterator it2;
        bqgg bqgg = this.f25826a;
        bqgg bqgg2 = this.f25827b;
        bqgg bqgg3 = this.f25828c;
        bqgg bqgg4 = this.f25829d;
        UserFieldTypeManager userFieldTypeManager = this.f25830e;
        kyq kyq = this.f25831f;
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
            Iterator it3 = r.mo67316o().iterator();
            UserData.Builder builder = null;
            int i = 0;
            int i2 = 0;
            while (it3.hasNext()) {
                kpb kpb2 = (kpb) it3.next();
                if (i >= UserData.getMaxCategoryCount()) {
                    break;
                }
                Iterator it4 = r.mo67127c(kpb2).iterator();
                boolean z = false;
                while (true) {
                    if (!it4.hasNext()) {
                        it = it3;
                        break;
                    }
                    String str3 = (String) it4.next();
                    it = it3;
                    if (i2 >= UserData.getMaxUserDataSize()) {
                        break;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (ccjc.f179140a.mo6606a().mo76098b() || !hashSet.contains(str3)) {
                        it2 = it4;
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
                    } else {
                        it2 = it4;
                    }
                    it3 = it;
                    it4 = it2;
                }
                if (z) {
                    i++;
                }
                if (i2 >= UserData.getMaxUserDataSize()) {
                    break;
                }
                it3 = it;
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
            bnsl bnsl = (bnsl) ldb.f25832a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ldb", "a", 234, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68448m();
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) ldb.f25832a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("ldb", "a", 236, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68448m();
        }
        return bqga.m112775a((Object) 1);
    }
}
