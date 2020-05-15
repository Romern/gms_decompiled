package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ijj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ijj {

    /* renamed from: a */
    private static ijj f21108a;

    /* renamed from: e */
    private static final sek f21109e = new sek("RegistrationManager");

    /* renamed from: b */
    private final Context f21110b;

    /* renamed from: c */
    private final iji f21111c;

    /* renamed from: d */
    private final Object f21112d = new Object();

    private ijj(Context context) {
        iji iji = new iji(context);
        this.f21110b = context;
        this.f21111c = iji;
    }

    /* renamed from: a */
    public static synchronized ijj m15530a() {
        ijj ijj;
        synchronized (ijj.class) {
            if (f21108a == null) {
                f21108a = new ijj(rpr.m34216b());
            }
            ijj = f21108a;
        }
        return ijj;
    }

    /* renamed from: a */
    private final void m15531a(int i) {
        iiq iiq = new iiq(this.f21110b);
        iiq.f21065d = i;
        if (((Boolean) igt.f20973w.mo58455c()).booleanValue() && Math.random() < ((Double) igt.f20974x.mo58455c()).doubleValue()) {
            bxvd da = bocy.f132650e.mo74144da();
            int i2 = iiq.f21065d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bocy bocy = (bocy) da.f164949b;
            int i3 = i2 - 1;
            if (i2 != 0) {
                bocy.f132653b = i3;
                int i4 = bocy.f132652a | 1;
                bocy.f132652a = i4;
                int i5 = i4 | 2;
                bocy.f132652a = i5;
                bocy.f132654c = Long.MIN_VALUE;
                bocy.f132652a = i5 | 4;
                bocy.f132655d = Long.MIN_VALUE;
                bocy bocy2 = (bocy) da.mo74062i();
                bxvd da2 = boct.f132600I.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boct boct = (boct) da2.f164949b;
                boct.f132612c = 7;
                int i6 = boct.f132610a | 1;
                boct.f132610a = i6;
                bocy2.getClass();
                boct.f132619j = bocy2;
                boct.f132610a = i6 | 128;
                boct boct2 = (boct) da2.mo74062i();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    new qws(iiq.f21062a, "ANDROID_AUTH", null).mo24333a(boct2).mo24327b();
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    private final void m15532a(boolean z, Account account) {
        Intent intent = new Intent("com.google.android.gms.auth.authzen.KEY_REGISTRATION_FINISHED");
        intent.putExtra("account", account);
        intent.putExtra("is_success", z);
        this.f21110b.sendBroadcast(intent, "com.google.android.gms.auth.authzen.permission.KEY_REGISTRATION_FINISHED");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0168 A[Catch:{ AssertionError -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x016b A[Catch:{ AssertionError -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01eb A[Catch:{ AssertionError -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ec A[Catch:{ AssertionError -> 0x00a2 }] */
    /* renamed from: a */
    public final boolean mo13062a(int i, String str, int i2, int i3) {
        String str2;
        int i4;
        int i5 = i;
        String str3 = str;
        int i6 = i2;
        synchronized (this.f21112d) {
            if (soz.m35807f(this.f21111c.f21107a)) {
                return false;
            }
            if (!soz.m35812h(this.f21111c.f21107a, str3)) {
                f21109e.mo25418e("Cannot initiate enrollment because account does not exist: %s.", sek.m35081a(str));
                return false;
            }
            Account account = new Account(str3, "com.google");
            if (i5 != 3 || !((Boolean) igt.f20966p.mo58455c()).booleanValue()) {
                ios a = inl.m15759a(this.f21110b);
                bxvd da = bsnn.f146304c.mo74144da();
                bsnm bsnm = bsnm.AUTHZEN;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bsnn) da.f164949b).f146306a = bsnm.mo3214a();
                bxvd da2 = bsnh.f146240b.mo74144da();
                bxvd da3 = bsnf.f146236b.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((bsnf) da3.f164949b).f146238a = 2;
                bsnf bsnf = (bsnf) da3.mo74062i();
                "com.google.android.gms".getClass();
                bsnf.getClass();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsnh bsnh = (bsnh) da2.f164949b;
                bxww bxww = bsnh.f146242a;
                if (!bxww.f165014a) {
                    bsnh.f146242a = bxww.mo74203a();
                }
                bsnh.f146242a.put("com.google.android.gms", bsnf);
                bxtx aL = ((bsnh) da2.mo74062i()).mo73639aL();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aL.getClass();
                ((bsnn) da.f164949b).f146307b = aL;
                bsnn bsnn = (bsnn) da.mo74062i();
                if (i5 != 2) {
                    if (i5 != 3) {
                        str2 = "AuthzenAccountRegistration";
                        int i7 = 6;
                        if (i6 != 11) {
                            i7 = 11;
                        } else if (i6 == 8) {
                            i7 = 8;
                        } else if (i6 == 5) {
                            i7 = 5;
                        } else if (i6 != 6) {
                            if (i6 == 4) {
                                i7 = 4;
                            } else {
                                if (i6 != 0) {
                                    if (i6 == 9) {
                                        i7 = 9;
                                    } else if (i6 == 12) {
                                        i7 = 12;
                                    } else if (i6 == 10) {
                                        i7 = 10;
                                    } else if (i6 == 3) {
                                        i7 = 3;
                                    } else if (i6 == 1) {
                                        i7 = 1;
                                    } else if (i6 == 7) {
                                        i7 = 7;
                                    } else if (i6 != 2) {
                                        i7 = 13;
                                        if (i6 != 13) {
                                            i7 = 14;
                                            if (i6 == 14) {
                                            }
                                        }
                                    } else {
                                        i7 = 2;
                                    }
                                }
                                i7 = 0;
                            }
                        }
                        aucb a2 = a.mo13178a(i7, Arrays.asList("PublicKey", "authzen"), str2, account, bsnn.mo73642k());
                        aucu.m76783a(a2, 60, TimeUnit.SECONDS);
                        Status status = ((KeyRegistrationResult) a2.mo50386d()).f10542b;
                        f21109e.mo25412b("Result of key registration=%s", status.mo17711d());
                        i4 = status.f30115i;
                        if (i4 == -25501) {
                            if (!(i4 == -25502 || i4 == -25505)) {
                                m15532a(false, account);
                                return false;
                            }
                        }
                        m15532a(true, account);
                        return true;
                    }
                }
                str2 = "ForceRegistration";
                int i72 = 6;
                if (i6 != 11) {
                }
                aucb a22 = a.mo13178a(i72, Arrays.asList("PublicKey", "authzen"), str2, account, bsnn.mo73642k());
                try {
                    aucu.m76783a(a22, 60, TimeUnit.SECONDS);
                    Status status2 = ((KeyRegistrationResult) a22.mo50386d()).f10542b;
                    f21109e.mo25412b("Result of key registration=%s", status2.mo17711d());
                    i4 = status2.f30115i;
                    if (i4 == -25501) {
                    }
                    m15532a(true, account);
                    return true;
                } catch (InterruptedException e) {
                    e = e;
                    f21109e.mo25417e("Failed to perform enrollment", e, new Object[0]);
                    m15532a(false, account);
                    m15531a(1);
                    return false;
                } catch (ExecutionException e2) {
                    e = e2;
                    f21109e.mo25417e("Failed to perform enrollment", e, new Object[0]);
                    m15532a(false, account);
                    m15531a(1);
                    return false;
                } catch (TimeoutException e3) {
                    e = e3;
                    f21109e.mo25417e("Failed to perform enrollment", e, new Object[0]);
                    m15532a(false, account);
                    m15531a(1);
                    return false;
                }
            } else {
                try {
                    Context context = this.f21111c.f21107a;
                    boolean a3 = new ijg(account, new ige(context), new ijh(context, account), new asfb(context, 1, "AuthzenEnroller", null, "com.google.android.gms"), new ijd(context), new shj(context, igi.m15410a(), "cryptauth/v1/", false, true, null, null, 4098)).mo13061a(i6, i3);
                    return a3;
                } catch (AssertionError e4) {
                    if (e4.getCause() instanceof NoSuchAlgorithmException) {
                        f21109e.mo25417e("Error getting algorithm.", e4, new Object[0]);
                        m15531a(8);
                        return false;
                    }
                    m15531a(1);
                    throw e4;
                }
            }
        }
    }
}
