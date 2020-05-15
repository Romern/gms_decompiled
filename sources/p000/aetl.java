package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.locationsharing.common.model.LocationSharingSettings;
import java.util.concurrent.ExecutionException;

/* renamed from: aetl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aetl extends aesx {

    /* renamed from: b */
    private static final srn f63779b = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: c */
    private final boolean f63780c;

    /* renamed from: d */
    private final boolean f63781d;

    /* renamed from: e */
    private final String f63782e;

    /* renamed from: f */
    private final byte[] f63783f;

    public aetl(Context context, String str, boolean z, boolean z2, String str2, byte[] bArr) {
        super(context, str);
        this.f63780c = z;
        this.f63781d = z2;
        this.f63782e = str2;
        this.f63783f = bArr;
    }

    /* renamed from: a */
    private final boolean m52546a(String str) {
        StringBuilder sb = new StringBuilder("locationsharing");
        if (this.f63782e != null) {
            sb.append(":");
            sb.append(this.f63782e);
        }
        aept a = OptInRequest.m66974a(new Account(((aesx) this).f63753a, "com.google"));
        a.f63615c = str;
        a.f63614b = sb.toString();
        try {
            aucb a2 = aeqc.m52384a(getContext()).mo24686a(a.mo34445a());
            aucu.m76782a(a2);
            return a2.mo50384b();
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) f63779b.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aetl", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("InterruptedException awaiting opt in request");
            return false;
        } catch (ExecutionException e2) {
            bnsl bnsl2 = (bnsl) f63779b.mo68390d();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("aetl", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("ExecutionException awaiting opt in request");
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        bznm bznm;
        byte[] bArr;
        char c;
        LocationSharingSettings locationSharingSettings;
        aucb aucb;
        aetm a = aetm.m52547a();
        if (!this.f63780c && !this.f63781d) {
            return a;
        }
        byte[] bArr2 = new byte[0];
        if (cfaz.f183554a.mo6606a().mo80788k()) {
            bxvd da = bsqx.f146703c.mo74144da();
            bxtx a2 = bxtx.m123261a(ggj.m13107a());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsqx bsqx = (bsqx) da.f164949b;
            a2.getClass();
            bsqx.f146705a |= 1;
            bsqx.f146706b = a2;
            bsqx bsqx2 = (bsqx) da.mo74062i();
            bArr = bsqx2.mo73642k();
            Context context = getContext();
            String str = ((aesx) this).f63753a;
            byte[] bArr3 = this.f63783f;
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da2 = bssm.f146877d.mo74144da();
            bsmx bsmx = bsmx.LOCATION_SHARING_ANDROID_TOS_SCREEN;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bssm bssm = (bssm) da2.f164949b;
            bssm.f146880b = bsmx.f145962iC;
            bssm.f146879a |= 1;
            bssm bssm2 = (bssm) da2.mo74062i();
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw = (bsqw) bsqv.f164949b;
            bssm2.getClass();
            bsqw.f146702f = bssm2;
            bsqw.f146697a |= 8;
            bxvd da3 = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.LOCATION_SHARING_TOS_ACCEPTED;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsrf bsrf = (bsrf) da3.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da4 = bsrg.f146749m.mo74144da();
            bxvd da5 = bssf.f146855c.mo74144da();
            if (bArr3.length > 0) {
                bxtx a3 = bxtx.m123261a(bArr3);
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bssf bssf = (bssf) da5.f164949b;
                a3.getClass();
                bssf.f146857a |= 1;
                bssf.f146858b = a3;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsrg bsrg = (bsrg) da4.f164949b;
            bssf bssf2 = (bssf) da5.mo74062i();
            bssf2.getClass();
            bsrg.f146761k = bssf2;
            bsrg.f146752b |= 2;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsrf bsrf2 = (bsrf) da3.f164949b;
            bsrg bsrg2 = (bsrg) da4.mo74062i();
            bsrg2.getClass();
            bsrf2.f146748c = bsrg2;
            bsrf2.f146746a |= 2;
            if (bsqv.f164950c) {
                bsqv.mo74035c();
                bsqv.f164950c = false;
            }
            bsqw bsqw2 = (bsqw) bsqv.f164949b;
            bsrf bsrf3 = (bsrf) da3.mo74062i();
            bsrf3.getClass();
            bsqw2.f146701e = bsrf3;
            bsqw2.f146697a |= 4;
            bsqw bsqw3 = (bsqw) bsqv.mo74062i();
            bxvd bxvd = (bxvd) bsqw3.mo74142c(5);
            bxvd.mo73625a((bxvk) bsqw3);
            bsqv bsqv2 = (bsqv) bxvd;
            if (str == null) {
                bznm = null;
                aucb = aucu.m76778a((Object) null);
            } else {
                bznm = null;
                aucf aucf = new aucf();
                new aexm(context, str, aucf).start();
                aucb = aucf.f91388a;
            }
            aucb.mo50382b(new aexl(bsqv2, str, bsqx2, context));
        } else {
            bznm = null;
            bArr = bArr2;
        }
        if (this.f63780c) {
            aeua aeua = new aeua(((aesx) this).f63753a, getContext());
            byte[] bArr4 = this.f63783f;
            bxvd da6 = bznj.f170716d.mo74144da();
            bxvd da7 = bzmm.f170622e.mo74144da();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bzmm bzmm = (bzmm) da7.f164949b;
            bzmm.f170625b = 1;
            bzmm.f170624a |= 1;
            bxvd da8 = bzlm.f170545d.mo74144da();
            if (bArr.length > 0) {
                String a4 = boan.f132470d.mo68794a(bArr);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bzlm bzlm = (bzlm) da8.f164949b;
                a4.getClass();
                bzlm.f170547a |= 2;
                bzlm.f170548b = a4;
            }
            if (bArr4.length > 0) {
                bxtx a5 = bxtx.m123261a(bArr4);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bzlm bzlm2 = (bzlm) da8.f164949b;
                a5.getClass();
                bzlm2.f170547a |= 4;
                bzlm2.f170549c = a5;
            }
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bznj bznj = (bznj) da6.f164949b;
            bzlm bzlm3 = (bzlm) da8.mo74062i();
            bzlm3.getClass();
            bznj.f170720c = bzlm3;
            bznj.f170718a |= 4;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bzmm bzmm2 = (bzmm) da7.f164949b;
            bzmm2.f170626c = 3;
            bzmm2.f170624a |= 2;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bznj bznj2 = (bznj) da6.f164949b;
            bzmm bzmm3 = (bzmm) da7.mo74062i();
            bzmm3.getClass();
            bznj2.f170719b = bzmm3;
            bznj2.f170718a |= 2;
            try {
                bznm = (bznm) aeua.mo34565a((bznj) da6.mo74062i(), bznm.f170722c, "updatesharingstate");
            } catch (Exception e) {
                bqye.m113758a(e);
            }
            if (bznm != null) {
                int a6 = bznl.m125959a(bznm.f170724a);
                if (a6 != 0 && a6 == 3) {
                    c = 2;
                } else {
                    LocationSharingSettings a7 = aexo.m52652a(aeua.f63812c, aeua.f63811b);
                    if (a7 != null) {
                        locationSharingSettings = new LocationSharingSettings(a7.f79631a.booleanValue(), a7.mo43766a(), 1, a7.f79636f.booleanValue());
                    } else {
                        locationSharingSettings = aeua.f63809a;
                    }
                    aexo.m52653a(aeua.f63812c, aeua.f63811b, locationSharingSettings);
                    Context context2 = aeua.f63812c;
                    String str2 = aeua.f63811b;
                    bzmb bzmb = bznm.f170725b;
                    if (bzmb == null) {
                        bzmb = bzmb.f170600c;
                    }
                    aexp.m52656a(context2, str2, bzmb);
                    c = 0;
                }
            } else {
                c = 1;
            }
            if (c == 1) {
                a = new aetm(false, true, false);
            } else if (c == 2) {
                a = new aetm(false, false, true);
            }
        }
        if (a.f63785b) {
            return a;
        }
        if (!this.f63781d && !cfaz.f183554a.mo6606a().mo80783f()) {
            return a;
        }
        String a8 = boan.f132471e.mo68794a(bArr);
        StringBuilder sb = new StringBuilder("locationsharing");
        if (this.f63782e != null) {
            sb.append(":");
            sb.append(this.f63782e);
        }
        aept a9 = OptInRequest.m66974a(new Account(((aesx) this).f63753a, "com.google"));
        a9.f63615c = a8;
        a9.f63614b = sb.toString();
        try {
            aucb a10 = aeqc.m52384a(getContext()).mo24686a(a9.mo34445a());
            aucu.m76782a(a10);
            if (a10.mo50384b()) {
                return aetm.m52547a();
            }
        } catch (InterruptedException e2) {
            bnsl bnsl = (bnsl) f63779b.mo68390d();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("aetl", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("InterruptedException awaiting opt in request");
        } catch (ExecutionException e3) {
            bnsl bnsl2 = (bnsl) f63779b.mo68390d();
            bnsl2.mo68437a(e3);
            bnsl2.mo68432a("aetl", "a", 113, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("ExecutionException awaiting opt in request");
        }
        return new aetm(true, false, false);
    }
}
