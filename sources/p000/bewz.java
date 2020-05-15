package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: bewz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bewz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f112867a;

    /* renamed from: b */
    final /* synthetic */ bexa f112868b;

    public bewz(bexa bexa, long j) {
        this.f112868b = bexa;
        this.f112867a = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ae  */
    public final void run() {
        btuv btuv;
        bxvd da;
        bxvd da2;
        bxvd a;
        btuv btuv2;
        bewy a2;
        bmxv bmxv;
        String[] strArr = this.f112868b.f112870b;
        boolean z = false;
        for (String str : strArr) {
            bexa bexa = this.f112868b;
            long j = this.f112867a;
            Context context = bexa.f112869a;
            ClientContext clientContext = new ClientContext(spn.m35897i(context, context.getPackageName()), str, str, bexa.f112869a.getPackageName(), bexa.f112869a.getPackageName());
            bexb bexb = bexa.f112874f;
            clientContext.mo17806d("https://www.googleapis.com/auth/webhistory");
            try {
                adym adym = bexb.f112880a;
                bxvd da3 = bxpy.f164339d.mo74144da();
                bxvd da4 = bxpo.f164291c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                bxpo bxpo = (bxpo) da4.f164949b;
                "ACTIVITY_RECOGNITION_PERSONALIZATION".getClass();
                bxpo.f164293a |= 2;
                bxpo.f164294b = "ACTIVITY_RECOGNITION_PERSONALIZATION";
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxpy bxpy = (bxpy) da3.f164949b;
                bxpo bxpo2 = (bxpo) da4.mo74062i();
                bxpo2.getClass();
                bxpy.f164342b = bxpo2;
                bxpy.f164341a |= 1;
                bxvd da5 = bxpx.f164333e.mo74144da();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bxpx bxpx = (bxpx) da5.f164949b;
                bxpx.f164335a |= 1;
                bxpx.f164336b = 2017;
                int i = bxbo.ACTIVITY_RECOGNITION_PERSONALIZATION_DATATYPE.f162717qk;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bxpx bxpx2 = (bxpx) da5.f164949b;
                int i2 = bxpx2.f164335a | 2;
                bxpx2.f164335a = i2;
                bxpx2.f164337c = i;
                bxpx2.f164335a = i2 | 16;
                bxpx2.f164338d = 1;
                bxpx bxpx3 = (bxpx) da5.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxpy bxpy2 = (bxpy) da3.f164949b;
                bxpx3.getClass();
                if (!bxpy2.f164343c.mo73666a()) {
                    bxpy2.f164343c = GeneratedMessageLite.m124021a(bxpy2.f164343c);
                }
                bxpy2.f164343c.add(bxpx3);
                bxpy bxpy3 = (bxpy) da3.mo74062i();
                if (adym.f62906b == null) {
                    adym.f62906b = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/Read", ciie.m150370a(bxpy.f164339d), ciie.m150370a(bxqa.f164349b));
                }
                bxqa bxqa = (bxqa) adym.f62911a.mo25553a(adym.f62906b, clientContext, bxpy3, 10000, TimeUnit.MILLISECONDS);
                if (bxqa != null) {
                    bxus a3 = bxus.m123742a();
                    a3.mo73904a(btuv.f150639f);
                    if (bxqa.f164351a.size() != 0) {
                        bxwc bxwc = ((bxpz) bxqa.f164351a.get(0)).f164347a;
                        if (!bxwc.isEmpty()) {
                            bmxv = bmxv.m108566b((bxbp) bxwc.get(0));
                        } else {
                            bmxv = bmvz.f131120a;
                        }
                        if (bmxv.mo66813a()) {
                            try {
                                bygn bygn = ((bxbp) bmxv.mo66814b()).f162723d;
                                if (bygn == null) {
                                    bygn = bygn.f166357a;
                                }
                                bygn bygn2 = (bygn) GeneratedMessageLite.m124016a(bygn.f166357a, bygn.serializeToBytes(), a3);
                                bxvj bxvj = btuv.f150639f;
                                bygn2.mo74135a(bxvj);
                                Object b = bygn2.f164952m.mo73913b(bxvj.f164958d);
                                if (b == null) {
                                    b = bxvj.f164956b;
                                } else {
                                    bxvj.mo74139a(b);
                                }
                                btuv = (btuv) b;
                            } catch (bxwf e) {
                                btuv = null;
                                da = btxl.f152809d.mo74144da();
                                if (da.f164950c) {
                                }
                                btxl btxl = (btxl) da.f164949b;
                                btxl.f152813c = 2;
                                btxl.f152811a |= 2;
                                if (btuv == null) {
                                }
                                bewq a4 = bewq.m95998a(bexa.f112869a);
                                btxl btxl2 = (btxl) da.mo74062i();
                                da2 = btxm.f152814q.mo74144da();
                                if (da2.f164950c) {
                                }
                                btxm btxm = (btxm) da2.f164949b;
                                btxl2.getClass();
                                btxm.f152827l = btxl2;
                                btxm.f152816a |= 2048;
                                qwo a5 = a4.f112849a.mo24333a((btxm) da2.mo74062i());
                                a5.mo24328b(13);
                                a5.mo24327b();
                                a = btuv.f150638e.mo74141a(btuv);
                                if (a.f164950c) {
                                }
                                btuv btuv3 = (btuv) a.f164949b;
                                btuv3.f150641a |= 1;
                                btuv3.f150642b = j;
                                btuv2 = (btuv) a.mo74062i();
                                if ((btuv2.f150641a & 2) != 0) {
                                }
                                a2 = bexa.m96007a(btuv2);
                                if (a2 == null) {
                                }
                                bexa.mo61217b(str).mo61863a(btuv2);
                            }
                            da = btxl.f152809d.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            btxl btxl3 = (btxl) da.f164949b;
                            btxl3.f152813c = 2;
                            btxl3.f152811a |= 2;
                            if (btuv == null) {
                                bexa.f112872d.mo62048a(bfos.PERSONAL_MODEL_DOWNLOADED_NOT_NULL);
                                btuz btuz = btuv.f150644d;
                                if (btuz == null) {
                                    btuz = btuz.f150650c;
                                }
                                if (btuz.f150652a.size() != 0) {
                                    bfor bfor = bexa.f112872d;
                                    bfos bfos = bfos.PERSONAL_MODEL_NUMCLUSTERS;
                                    btuz btuz2 = btuv.f150644d;
                                    if (btuz2 == null) {
                                        btuz2 = btuz.f150650c;
                                    }
                                    bfor.mo62049a(bfos, btuz2.f150652a.size());
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    btxl btxl4 = (btxl) da.f164949b;
                                    btxl4.f152812b = 1;
                                    btxl4.f152811a |= 1;
                                } else {
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    btxl btxl5 = (btxl) da.f164949b;
                                    btxl5.f152812b = 4;
                                    btxl5.f152811a |= 1;
                                }
                            } else {
                                btuv = btuv.f150638e;
                                bexa.f112872d.mo62048a(bfos.PERSONAL_MODEL_DOWNLOADED_NULL);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                btxl btxl6 = (btxl) da.f164949b;
                                btxl6.f152812b = 3;
                                btxl6.f152811a |= 1;
                            }
                            bewq a42 = bewq.m95998a(bexa.f112869a);
                            btxl btxl22 = (btxl) da.mo74062i();
                            da2 = btxm.f152814q.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            btxm btxm2 = (btxm) da2.f164949b;
                            btxl22.getClass();
                            btxm2.f152827l = btxl22;
                            btxm2.f152816a |= 2048;
                            qwo a52 = a42.f112849a.mo24333a((btxm) da2.mo74062i());
                            a52.mo24328b(13);
                            a52.mo24327b();
                            a = btuv.f150638e.mo74141a(btuv);
                            if (a.f164950c) {
                                z = false;
                            } else {
                                a.mo74035c();
                                z = false;
                                a.f164950c = false;
                            }
                            btuv btuv32 = (btuv) a.f164949b;
                            btuv32.f150641a |= 1;
                            btuv32.f150642b = j;
                            btuv2 = (btuv) a.mo74062i();
                            if ((btuv2.f150641a & 2) != 0) {
                                btuy btuy = btuv2.f150643c;
                                if (btuy == null) {
                                    btuy = btuy.f150646b;
                                }
                                int a6 = btux.m117172a(btuy.f150648a);
                                if (a6 != 0 && a6 == 2) {
                                    bexa.f112871c.remove(str);
                                    bexa.mo61215a(str).delete();
                                    bexa.f112872d.mo62048a(bfos.PERSONAL_MODEL_DELETED);
                                }
                            }
                            a2 = bexa.m96007a(btuv2);
                            if (a2 == null) {
                                bexa.f112871c.put(str, a2);
                            } else if (bexa.f112871c.containsKey(str)) {
                                bexa.f112871c.remove(str);
                            }
                            bexa.mo61217b(str).mo61863a(btuv2);
                        }
                    }
                }
                btuv = null;
            } catch (chuw | gid e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("Cannot fetch model ");
                } else {
                    "Cannot fetch model ".concat(valueOf);
                }
                btuv = null;
                da = btxl.f152809d.mo74144da();
                if (da.f164950c) {
                }
                btxl btxl32 = (btxl) da.f164949b;
                btxl32.f152813c = 2;
                btxl32.f152811a |= 2;
                if (btuv == null) {
                }
                bewq a422 = bewq.m95998a(bexa.f112869a);
                btxl btxl222 = (btxl) da.mo74062i();
                da2 = btxm.f152814q.mo74144da();
                if (da2.f164950c) {
                }
                btxm btxm22 = (btxm) da2.f164949b;
                btxl222.getClass();
                btxm22.f152827l = btxl222;
                btxm22.f152816a |= 2048;
                qwo a522 = a422.f112849a.mo24333a((btxm) da2.mo74062i());
                a522.mo24328b(13);
                a522.mo24327b();
                a = btuv.f150638e.mo74141a(btuv);
                if (a.f164950c) {
                }
                btuv btuv322 = (btuv) a.f164949b;
                btuv322.f150641a |= 1;
                btuv322.f150642b = j;
                btuv2 = (btuv) a.mo74062i();
                if ((btuv2.f150641a & 2) != 0) {
                }
                a2 = bexa.m96007a(btuv2);
                if (a2 == null) {
                }
                bexa.mo61217b(str).mo61863a(btuv2);
            }
            da = btxl.f152809d.mo74144da();
            if (da.f164950c) {
            }
            btxl btxl322 = (btxl) da.f164949b;
            btxl322.f152813c = 2;
            btxl322.f152811a |= 2;
            if (btuv == null) {
            }
            bewq a4222 = bewq.m95998a(bexa.f112869a);
            btxl btxl2222 = (btxl) da.mo74062i();
            da2 = btxm.f152814q.mo74144da();
            if (da2.f164950c) {
            }
            btxm btxm222 = (btxm) da2.f164949b;
            btxl2222.getClass();
            btxm222.f152827l = btxl2222;
            btxm222.f152816a |= 2048;
            qwo a5222 = a4222.f112849a.mo24333a((btxm) da2.mo74062i());
            a5222.mo24328b(13);
            a5222.mo24327b();
            a = btuv.f150638e.mo74141a(btuv);
            if (a.f164950c) {
            }
            btuv btuv3222 = (btuv) a.f164949b;
            btuv3222.f150641a |= 1;
            btuv3222.f150642b = j;
            btuv2 = (btuv) a.mo74062i();
            if ((btuv2.f150641a & 2) != 0) {
            }
            a2 = bexa.m96007a(btuv2);
            if (a2 == null) {
            }
            try {
                bexa.mo61217b(str).mo61863a(btuv2);
            } catch (IOException e3) {
            }
        }
    }
}
