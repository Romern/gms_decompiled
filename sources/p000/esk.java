package p000;

import android.accounts.Account;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: esk */
final /* synthetic */ class esk implements Callable {

    /* renamed from: a */
    private final esp f15609a;

    /* renamed from: b */
    private final bsxn f15610b;

    /* renamed from: c */
    private final long f15611c;

    /* renamed from: d */
    private final Set f15612d;

    /* renamed from: e */
    private final boolean f15613e;

    public esk(esp esp, bsxn bsxn, long j, Set set, boolean z) {
        this.f15609a = esp;
        this.f15610b = bsxn;
        this.f15611c = j;
        this.f15612d = set;
        this.f15613e = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x04dc  */
    public final Object call() {
        long j;
        boolean z;
        bxvd da;
        bxvf bxvf;
        long j2;
        eqx eqx;
        int i;
        bsxk bsxk;
        ern a;
        esp esp = this.f15609a;
        bsxn bsxn = this.f15610b;
        long j3 = this.f15611c;
        Set set = this.f15612d;
        boolean z2 = this.f15613e;
        eqx eqx2 = esp.f15633l;
        esr esr = esp.f15625d;
        if (ffr.m11620a(eqx2.f15541b)) {
            String b = fgd.m11651b();
            boolean a2 = adyf.m51386a(eot.f15436a);
            if (z2 && (a = eqx2.f15543d.mo10437a(eqx2.f15541b.f16458a, b, bsxn, a2, esr.f15638a)) != null) {
                if (!a.f15572f.mo10396c()) {
                    bxvd da2 = bswb.f147369d.mo74144da();
                    bsxk bsxk2 = a.f15572f.f15491a;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bswb bswb = (bswb) da2.f164949b;
                    bsxk2.getClass();
                    bswb.f147372b = bsxk2;
                    bswb.f147371a |= 1;
                    bswb bswb2 = (bswb) da2.mo74062i();
                    eqx2.f15540a.logVerbose("requestResource(%s): serving early from DB", Integer.valueOf(bsxn.f147589b));
                    return bswb2;
                }
                eqx2.f15540a.logVerbose("requestResource(%s): serving early from DB is in DB but stale", Integer.valueOf(bsxn.f147589b));
            }
            eqx2.f15540a.logVerbose("requestResource(%s): requesting via gRPC", Integer.valueOf(bsxn.f147589b));
            bxvd da3 = bswa.f147363e.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bswa bswa = (bswa) da3.f164949b;
            bsxn.getClass();
            bswa.f147367c = bsxn;
            bswa.f147365a |= 2;
            fgh fgh = (fgh) eqx2.f15544e.mo6606a();
            String str = esr.f15638a;
            bxvd da4 = bsxj.f147566k.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj = (bsxj) da4.f164949b;
            bsxj.f147569b = 1;
            bsxj.f147568a |= 1;
            bsvm b2 = fgh.mo10800b();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj2 = (bsxj) da4.f164949b;
            b2.getClass();
            bsxj2.f147570c = b2;
            bsxj2.f147568a |= 2;
            bsvn a3 = fgh.mo10799a();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj3 = (bsxj) da4.f164949b;
            a3.getClass();
            bsxj3.f147571d = a3;
            bsxj3.f147568a |= 4;
            String id = TimeZone.getDefault().getID();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj4 = (bsxj) da4.f164949b;
            id.getClass();
            bsxj4.f147568a |= 8;
            bsxj4.f147572e = id;
            int i2 = fgh.f16503c.getResources().getDisplayMetrics().densityDpi;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj5 = (bsxj) da4.f164949b;
            bsxj5.f147568a |= 16;
            bsxj5.f147573f = i2;
            int i3 = Build.VERSION.SDK_INT;
            boolean z3 = rpr.m34216b().getResources().getConfiguration().getLayoutDirection() == 1;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj6 = (bsxj) da4.f164949b;
            bsxj6.f147568a |= 64;
            bsxj6.f147574g = z3;
            boolean a4 = adyf.m51386a(eot.f15436a);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj7 = (bsxj) da4.f164949b;
            bsxj7.f147568a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bsxj7.f147575h = a4;
            boolean booleanValue = ((Boolean) fgh.f16504d.mo6606a()).booleanValue();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bsxj bsxj8 = (bsxj) da4.f164949b;
            bsxj8.f147568a |= 1024;
            bsxj8.f147576i = booleanValue;
            if (cbro.m128206j()) {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bsxj bsxj9 = (bsxj) da4.f164949b;
                str.getClass();
                bsxj9.f147568a |= 2048;
                bsxj9.f147577j = str;
            }
            fgh.mo10801c();
            bsxj bsxj10 = (bsxj) da4.mo74062i();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bswa bswa2 = (bswa) da3.f164949b;
            bsxj10.getClass();
            bswa2.f147366b = bsxj10;
            bswa2.f147365a |= 1;
            if (!bswa2.f147368d.mo73666a()) {
                bswa2.f147368d = GeneratedMessageLite.m124021a(bswa2.f147368d);
            }
            bxsy.m123078a(set, bswa2.f147368d);
            bswa bswa3 = (bswa) da3.mo74062i();
            Account account = new Account(eqx2.f15541b.f16458a, "com.google");
            ClientContext clientContext = new ClientContext();
            clientContext.f30215e = "com.google.android.gms";
            clientContext.f30216f = "com.google.android.gms";
            clientContext.f30212b = spn.f44932a;
            clientContext.f30214d = account;
            clientContext.f30213c = account;
            clientContext.mo17806d(cbri.f178135a.mo6606a().mo75263m());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                eor eor = eqx2.f15545f;
                if (eor.f15433c == null) {
                    eor.f15433c = chtv.m149566a(chtu.UNARY, "google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", ciie.m150370a(bswa.f147363e), ciie.m150370a(bswb.f147369d));
                }
                bswb bswb3 = (bswb) eor.f15434a.mo25553a(eor.f15433c, clientContext, bswa3, (long) eor.f15432b, TimeUnit.MILLISECONDS);
                ffv ffv = eqx2.f15546g;
                int i4 = bsxn.f147589b;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                bxvd da5 = bspq.f146567d.mo74144da();
                bxvf bxvf2 = (bxvf) bspp.f146553l.mo74144da();
                bsmt bsmt = bsmt.ACCOUNT_SETTINGS_MOBILE_MENU;
                j = elapsedRealtime;
                try {
                    if (bxvf2.f164950c) {
                        bxvf2.mo74035c();
                        bxvf2.f164950c = false;
                    }
                    bspp bspp = (bspp) bxvf2.f164949b;
                    bspp.f146556b = bsmt.f145305dO;
                    int i5 = bspp.f146555a | 1;
                    bspp.f146555a = i5;
                    bspp.f146557c = 2010;
                    int i6 = i5 | 2;
                    bspp.f146555a = i6;
                    int i7 = i6 | 8;
                    bspp.f146555a = i7;
                    bspp.f146559e = i4;
                    bspp.f146555a = i7 | 16;
                    bspp.f146560f = true;
                    bsow a5 = ffv.mo10785a("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", elapsedRealtime2, (String) null);
                    if (bxvf2.f164950c) {
                        bxvf2.mo74035c();
                        bxvf2.f164950c = false;
                    }
                    bspp bspp2 = (bspp) bxvf2.f164949b;
                    a5.getClass();
                    bspp2.f146561g = a5;
                    bspp2.f146555a |= 32;
                    bsof a6 = ffv.mo10784a();
                    if (bxvf2.f164950c) {
                        bxvf2.mo74035c();
                        bxvf2.f164950c = false;
                    }
                    bspp bspp3 = (bspp) bxvf2.f164949b;
                    a6.getClass();
                    bspp3.f146562h = a6;
                    bspp3.f146555a |= 64;
                    bspp bspp4 = (bspp) bxvf2.mo74062i();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bspq bspq = (bspq) da5.f164949b;
                    bspp4.getClass();
                    bspq.f146570b = bspp4;
                    bspq.f146569a |= 1;
                    ffv.mo10788a((bspq) da5.mo74062i());
                    eqx2.f15540a.logVerbose("GetResource(%s) RPC succeeded", Integer.valueOf(bsxn.f147589b));
                    bsxk bsxk3 = bswb3.f147372b;
                    if (bsxk3 == null) {
                        bsxk3 = bsxk.f147578f;
                    }
                    bsxn bsxn2 = bsxk3.f147583d;
                    if (bsxn2 == null) {
                        bsxn2 = bsxn.f147586d;
                    }
                    sdo.m34970a(bsxn2.equals(bsxn));
                    ArrayList arrayList = new ArrayList();
                    if ((bswb3.f147371a & 1) == 0) {
                        eqx = eqx2;
                        j2 = j3;
                        i = 0;
                    } else {
                        bsxk bsxk4 = bswb3.f147372b;
                        if (bsxk4 != null) {
                            bsxk = bsxk4;
                        } else {
                            bsxk = bsxk.f147578f;
                        }
                        eqx = eqx2;
                        i = 0;
                        j2 = j3;
                        arrayList.add(eqx2.mo10424a(bsxk, j3, b, a2, esr));
                    }
                    bxwc bxwc = bswb3.f147373c;
                    int size = bxwc.size();
                    while (i < size) {
                        arrayList.add(eqx.mo10424a((bsxk) bxwc.get(i), j2, b, a2, esr));
                        i++;
                    }
                    aucu.m76780a(eqx.f15542c, new eqw(new eqv(eqx, arrayList)));
                    return bswb3;
                } catch (Exception e) {
                    e = e;
                    eqx eqx3 = eqx2;
                    z = e instanceof chuw;
                    String str2 = "OTHER";
                    if (!z) {
                    }
                    ffv ffv2 = eqx3.f15546g;
                    int i8 = bsxn.f147589b;
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                    da = bspq.f146567d.mo74144da();
                    bxvf = (bxvf) bspp.f146553l.mo74144da();
                    bsmt bsmt2 = bsmt.ACCOUNT_SETTINGS_MOBILE_MENU;
                    if (bxvf.f164950c) {
                    }
                    bspp bspp5 = (bspp) bxvf.f164949b;
                    bspp5.f146556b = bsmt2.f145305dO;
                    int i9 = bspp5.f146555a | 1;
                    bspp5.f146555a = i9;
                    bspp5.f146557c = 2011;
                    int i10 = i9 | 2;
                    bspp5.f146555a = i10;
                    int i11 = i10 | 8;
                    bspp5.f146555a = i11;
                    bspp5.f146559e = i8;
                    bspp5.f146555a = i11 | 16;
                    bspp5.f146560f = true;
                    bsow a7 = ffv2.mo10785a("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", elapsedRealtime3, str2);
                    if (bxvf.f164950c) {
                    }
                    bspp bspp6 = (bspp) bxvf.f164949b;
                    a7.getClass();
                    bspp6.f146561g = a7;
                    bspp6.f146555a |= 32;
                    bsof a8 = ffv2.mo10784a();
                    if (bxvf.f164950c) {
                    }
                    bspp bspp7 = (bspp) bxvf.f164949b;
                    a8.getClass();
                    bspp7.f146562h = a8;
                    bspp7.f146555a |= 64;
                    if (da.f164950c) {
                    }
                    bspq bspq2 = (bspq) da.f164949b;
                    bspp bspp8 = (bspp) bxvf.mo74062i();
                    bspp8.getClass();
                    bspq2.f146570b = bspp8;
                    bspq2.f146569a |= 1;
                    ffv2.mo10788a((bspq) da.mo74062i());
                    if (!z) {
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
                j = elapsedRealtime;
                eqx eqx32 = eqx2;
                z = e instanceof chuw;
                String str22 = "OTHER";
                if (!z) {
                    int i12 = ((chuw) e).f189236a.f189233s.f189211r;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append("GRPC_STATUS:");
                    sb.append(i12);
                    str22 = sb.toString();
                } else if (e instanceof gid) {
                    gid gid = (gid) e;
                    if (gid instanceof UserRecoverableAuthException) {
                        str22 = "URA";
                    } else if (gid instanceof C1020gis) {
                        str22 = "URN";
                    }
                    str22 = str22.length() == 0 ? new String("AUTH:") : "AUTH:".concat(str22);
                } else if (e instanceof SecurityException) {
                    str22 = "SEC";
                }
                ffv ffv22 = eqx32.f15546g;
                int i82 = bsxn.f147589b;
                long elapsedRealtime32 = SystemClock.elapsedRealtime() - j;
                da = bspq.f146567d.mo74144da();
                bxvf = (bxvf) bspp.f146553l.mo74144da();
                bsmt bsmt22 = bsmt.ACCOUNT_SETTINGS_MOBILE_MENU;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bspp bspp52 = (bspp) bxvf.f164949b;
                bspp52.f146556b = bsmt22.f145305dO;
                int i92 = bspp52.f146555a | 1;
                bspp52.f146555a = i92;
                bspp52.f146557c = 2011;
                int i102 = i92 | 2;
                bspp52.f146555a = i102;
                int i112 = i102 | 8;
                bspp52.f146555a = i112;
                bspp52.f146559e = i82;
                bspp52.f146555a = i112 | 16;
                bspp52.f146560f = true;
                bsow a72 = ffv22.mo10785a("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", elapsedRealtime32, str22);
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bspp bspp62 = (bspp) bxvf.f164949b;
                a72.getClass();
                bspp62.f146561g = a72;
                bspp62.f146555a |= 32;
                bsof a82 = ffv22.mo10784a();
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bspp bspp72 = (bspp) bxvf.f164949b;
                a82.getClass();
                bspp72.f146562h = a82;
                bspp72.f146555a |= 64;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bspq bspq22 = (bspq) da.f164949b;
                bspp bspp82 = (bspp) bxvf.mo74062i();
                bspp82.getClass();
                bspq22.f146570b = bspp82;
                bspq22.f146569a |= 1;
                ffv22.mo10788a((bspq) da.mo74062i());
                if (!z) {
                    eqx32.f15540a.mo25418e("GetResource(%s) RPC failed - %s", Integer.valueOf(bsxn.f147589b), str22);
                } else {
                    eqx32.f15540a.mo25417e("GetResource(%s) RPC failed - %s", e, Integer.valueOf(bsxn.f147589b), str22);
                }
                throw e;
            }
        } else {
            throw new chuw(chuv.f189223j);
        }
    }
}
