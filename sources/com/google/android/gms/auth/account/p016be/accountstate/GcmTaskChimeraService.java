package com.google.android.gms.auth.account.p016be.accountstate;

import android.accounts.Account;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.GcmTaskChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmTaskChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f9993a = ght.m13171a("GcmTaskChimeraService");

    /* renamed from: b */
    private static final imk f9994b = glc.f18455a;

    /* renamed from: c */
    private static final bmzi f9995c;

    static {
        imo imo = goa.f18759a;
        imo.getClass();
        f9995c = new gld(imo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c2 A[SYNTHETIC, Splitter:B:104:0x01c2] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ff A[Catch:{ RemoteException -> 0x00ab, IOException -> 0x00a9, rfv -> 0x0098, rfw -> 0x0096, gid -> 0x0085, all -> 0x02a0 }] */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        imk imk;
        imk imk2;
        bxvd da = bofx.f132950d.mo74144da();
        int i = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bofx bofx = (bofx) da.f164949b;
        bofx.f132953b = 2;
        int i2 = bofx.f132952a | 1;
        bofx.f132952a = i2;
        try {
            Bundle bundle = aecc.f63129b;
            if (bundle == null) {
                bofx.f132954c = 6;
                bofx.f132952a = i2 | 2;
                imk = f9994b;
            } else {
                String string = bundle.getString("EXTRA_ACTION");
                if (string != null) {
                    String string2 = bundle.getString("EXTRA_GAIA_ID");
                    if (string2 == null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bofx bofx2 = (bofx) da.f164949b;
                        bofx2.f132954c = 2;
                        bofx2.f132952a |= 2;
                        imk = f9994b;
                    } else {
                        Account account = null;
                        Account[] g = gik.m13219g(this, "com.google");
                        int length = g.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            Account account2 = g[i3];
                            if (string2.equals(gik.m13218f(this, account2.name))) {
                                account = account2;
                                break;
                            }
                            i3++;
                        }
                        if (account == null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bofx bofx3 = (bofx) da.f164949b;
                            bofx3.f132954c = 3;
                            bofx3.f132952a |= 2;
                            imk = f9994b;
                        } else {
                            int hashCode = string.hashCode();
                            char c = 65535;
                            if (hashCode != -857009880) {
                                if (hashCode == 674017394 && string.equals("CREDENTIAL_SYNC_ACTION")) {
                                    c = 1;
                                    if (c == 0) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bofx bofx4 = (bofx) da.f164949b;
                                        bofx4.f132953b = 3;
                                        bofx4.f132952a |= 1;
                                        gkx gkx = new gkx(this);
                                        goa goa = (goa) f9995c.mo6606a();
                                        f9993a.mo25409a("Account sync starts.", new Object[0]);
                                        try {
                                            bzxk a = gkx.mo12001a(account, gnv.m13523aE());
                                            if (!TextUtils.equals(account.name, a.f171764a)) {
                                                f9993a.mo25414c("Renaming account as primary email different from existing account.", new Object[0]);
                                                gkx.mo12002b(account, a.f171764a);
                                            }
                                            HashSet hashSet = new HashSet(a.f171765b);
                                            if (hashSet.isEmpty()) {
                                                f9993a.mo25416d("Existing services are unexpectedly empty. Skip updating.", new Object[0]);
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bofx bofx5 = (bofx) da.f164949b;
                                                bofx5.f132954c = 8;
                                                bofx5.f132952a |= 2;
                                                i = 2;
                                            } else {
                                                if (!hashSet.equals((Set) goa.mo12090a(account, gqd.f18812f))) {
                                                    goa.mo12095b(account, gqd.f18812f, hashSet);
                                                }
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bofx bofx6 = (bofx) da.f164949b;
                                                bofx6.f132954c = 1;
                                                bofx6.f132952a |= 2;
                                            }
                                        } catch (IOException e) {
                                            f9993a.mo25415d("Unable to look up account state from server.", e, new Object[0]);
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bofx bofx7 = (bofx) da.f164949b;
                                            bofx7.f132954c = 7;
                                            bofx7.f132952a |= 2;
                                            i = 1;
                                        }
                                        imk2 = f9994b;
                                    } else if (c != 1) {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bofx bofx8 = (bofx) da.f164949b;
                                        bofx8.f132954c = 5;
                                        bofx8.f132952a |= 2;
                                        imk = f9994b;
                                    } else {
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bofx bofx9 = (bofx) da.f164949b;
                                        bofx9.f132953b = 4;
                                        bofx9.f132952a |= 1;
                                        glv glv = new glv(new ilq(this));
                                        f9993a.mo25409a("Credential sync starts.", new Object[0]);
                                        ReauthSettingsResponse a2 = glv.mo12041a(new ReauthSettingsRequest(account, true));
                                        if (a2 == null) {
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            bofx bofx10 = (bofx) da.f164949b;
                                            bofx10.f132954c = 8;
                                            bofx10.f132952a |= 2;
                                            i = 2;
                                        } else {
                                            int i4 = a2.f10702b;
                                            if (i4 == 0) {
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bofx bofx11 = (bofx) da.f164949b;
                                                bofx11.f132954c = 1;
                                                bofx11.f132952a |= 2;
                                            } else if (i4 != 2) {
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bofx bofx12 = (bofx) da.f164949b;
                                                bofx12.f132954c = 0;
                                                bofx12.f132952a |= 2;
                                                i = 2;
                                            } else {
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bofx bofx13 = (bofx) da.f164949b;
                                                bofx13.f132954c = 7;
                                                bofx13.f132952a |= 2;
                                                i = 1;
                                            }
                                        }
                                        imk2 = f9994b;
                                    }
                                    ((glf) imk2.mo12005a(this)).mo12006a(f9993a, (bofx) da.mo74062i());
                                    return i;
                                }
                            } else if (string.equals("ACCOUNT_SYNC_ACTION")) {
                                c = 0;
                                if (c == 0) {
                                }
                                ((glf) imk2.mo12005a(this)).mo12006a(f9993a, (bofx) da.mo74062i());
                                return i;
                            }
                            if (c == 0) {
                            }
                            ((glf) imk2.mo12005a(this)).mo12006a(f9993a, (bofx) da.mo74062i());
                            return i;
                        }
                    }
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofx bofx14 = (bofx) da.f164949b;
                    bofx14.f132954c = 4;
                    bofx14.f132952a |= 2;
                    imk = f9994b;
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            f9993a.mo25415d("Unrecoverable exception - %s", e, e.getMessage());
        } catch (IOException e3) {
            e = e3;
            f9993a.mo25415d("Unrecoverable exception - %s", e, e.getMessage());
        } catch (rfv e4) {
            e = e4;
            f9993a.mo25415d("GMS is not available - %s", e, e.getMessage());
        } catch (rfw e5) {
            e = e5;
            f9993a.mo25415d("GMS is not available - %s", e, e.getMessage());
        } catch (gid e6) {
            f9993a.mo25415d("Auth exception - %s", e6, e6.getMessage());
        } catch (Throwable th) {
            ((glf) f9994b.mo12005a(this)).mo12006a(f9993a, (bofx) da.mo74062i());
            throw th;
        }
        ((glf) imk.mo12005a(this)).mo12006a(f9993a, (bofx) da.mo74062i());
        return 2;
    }
}
