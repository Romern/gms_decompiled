package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.auth.firstparty.dataservice.GetAndAdvanceOtpCounterResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONStringer;

/* renamed from: aruc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aruc extends arwf {

    /* renamed from: a */
    public static final Logger f88303a = ascp.m73787a("Setup", "Accounts", "AccountsServiceImpl");

    /* renamed from: f */
    private static final long f88304f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: g */
    private static volatile boolean f88305g = false;

    /* renamed from: b */
    public final Context f88306b;

    /* renamed from: c */
    public final bqgh f88307c;

    /* renamed from: d */
    public final aqzf f88308d;

    /* renamed from: e */
    public final aqxl f88309e;

    /* renamed from: h */
    private final Handler f88310h;

    /* renamed from: i */
    private final ixl f88311i;

    /* renamed from: j */
    private final ios f88312j;

    /* renamed from: k */
    private final argz f88313k;

    public aruc(Context context, Handler handler) {
        if (aqzf.f87144a == null) {
            synchronized (aqzf.class) {
                if (aqzf.f87144a == null) {
                    aqzf.f87144a = new aqzk();
                }
            }
        }
        aqzf aqzf = aqzf.f87144a;
        artx artx = new artx(context);
        ixl ixl = new ixl(context);
        ios a = inl.m15759a(context);
        argz a2 = argz.m72750a(context);
        this.f88306b = context;
        this.f88310h = handler;
        this.f88308d = aqzf;
        this.f88312j = a;
        this.f88309e = arai.m72320a(context);
        this.f88311i = ixl;
        this.f88307c = bqgh.m112796a(artx);
        this.f88313k = a2;
        handler.post(new arty(this));
    }

    /* renamed from: a */
    public static byqn m73502a(DeviceRiskSignals deviceRiskSignals) {
        if (deviceRiskSignals == null) {
            return null;
        }
        bxvd da = byqn.f167402e.mo74144da();
        bxvd da2 = byqm.f167393h.mo74144da();
        long j = deviceRiskSignals.f108129c;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byqm byqm = (byqm) da2.f164949b;
        int i = byqm.f167395a | 2;
        byqm.f167395a = i;
        byqm.f167397c = j;
        String str = deviceRiskSignals.f108131e;
        str.getClass();
        int i2 = i | 16;
        byqm.f167395a = i2;
        byqm.f167399e = str;
        String str2 = deviceRiskSignals.f108130d;
        str2.getClass();
        byqm.f167395a = i2 | 8;
        byqm.f167398d = str2;
        int a = byqp.m125132a(deviceRiskSignals.f108128b);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byqm byqm2 = (byqm) da2.f164949b;
        int i3 = a - 1;
        if (a != 0) {
            byqm2.f167396b = i3;
            int i4 = byqm2.f167395a | 1;
            byqm2.f167395a = i4;
            long j2 = deviceRiskSignals.f108132f;
            int i5 = i4 | 32;
            byqm2.f167395a = i5;
            byqm2.f167400f = j2;
            long j3 = deviceRiskSignals.f108133g;
            byqm2.f167395a = i5 | 64;
            byqm2.f167401g = j3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byqn byqn = (byqn) da.f164949b;
            byqm byqm3 = (byqm) da2.mo74062i();
            byqm3.getClass();
            byqn.f167405b = byqm3;
            byqn.f167404a |= 1;
            ScreenlockState screenlockState = deviceRiskSignals.f108134h;
            if (screenlockState != null) {
                bxvd da3 = byqq.f167409i.mo74144da();
                long j4 = screenlockState.f108164e;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byqq byqq = (byqq) da3.f164949b;
                int i6 = byqq.f167411a | 32;
                byqq.f167411a = i6;
                byqq.f167417g = j4;
                boolean z = screenlockState.f108165f;
                int i7 = i6 | 64;
                byqq.f167411a = i7;
                byqq.f167418h = z;
                long j5 = screenlockState.f108163d;
                byqq.f167411a = i7 | 4;
                byqq.f167414d = j5;
                int a2 = byqs.m125135a(screenlockState.f108162c);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byqq byqq2 = (byqq) da3.f164949b;
                int i8 = a2 - 1;
                if (a2 != 0) {
                    byqq2.f167413c = i8;
                    int i9 = byqq2.f167411a | 2;
                    byqq2.f167411a = i9;
                    boolean z2 = screenlockState.f108161b;
                    byqq2.f167411a = i9 | 1;
                    byqq2.f167412b = z2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byqn byqn2 = (byqn) da.f164949b;
                    byqq byqq3 = (byqq) da3.mo74062i();
                    byqq3.getClass();
                    byqn2.f167406c = byqq3;
                    byqn2.f167404a |= 2;
                } else {
                    throw null;
                }
            }
            StarguardData starguardData = deviceRiskSignals.f108135i;
            if (starguardData != null) {
                bxvd da4 = byqt.f167420c.mo74144da();
                String b = bmxx.m108578b(starguardData.f108172b);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                byqt byqt = (byqt) da4.f164949b;
                b.getClass();
                byqt.f167422a |= 1;
                byqt.f167423b = b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byqn byqn3 = (byqn) da.f164949b;
                byqt byqt2 = (byqt) da4.mo74062i();
                byqt2.getClass();
                byqn3.f167407d = byqt2;
                byqn3.f167404a |= 4;
            }
            return (byqn) da.mo74062i();
        }
        throw null;
    }

    /* renamed from: b */
    private final C1240of m73507b(Challenge challenge, boolean z, boolean z2) {
        String str;
        byte[] bArr;
        int i;
        vvq b;
        rex rex;
        Context context;
        skh skh;
        iyv iyv;
        long j;
        long j2;
        Challenge challenge2 = challenge;
        boolean z3 = z;
        ((beon) this.f88309e.f87037d.mo6606a()).mo60861b(Integer.valueOf(challenge2.f108121b));
        if (challenge2.f108121b == 0) {
            String str2 = challenge2.f108122c;
            try {
                byte[] bArr2 = challenge2.f108124e;
                String hexString = Long.toHexString(spn.getAndroidId(this.f88306b));
                if (cgqi.f187508a.mo6606a().mo84279c()) {
                    bArr = m73502a(new arwk(this.f88306b, mo48835b(), m73505a(hexString, bArr2), z3).mo48875a()).serializeToBytes();
                    str = "source_device_signals_v2";
                } else {
                    boolean a = ascb.m73766a(this.f88306b);
                    bxvd da = bsaj.f143852g.mo74144da();
                    if (!a) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsaj bsaj = (bsaj) da.f164949b;
                    bsaj.f143857d = i;
                    int i2 = bsaj.f143854a | 4;
                    bsaj.f143854a = i2;
                    int i3 = i2 | 1;
                    bsaj.f143854a = i3;
                    bsaj.f143855b = a;
                    int i4 = i3 | 2;
                    bsaj.f143854a = i4;
                    bsaj.f143856c = z3;
                    if (a) {
                        rex = new rex();
                        try {
                            skh.m35531a().mo25690a(this.f88306b, new Intent().setClassName(this.f88306b, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), rex, 1);
                            IBinder a2 = rex.mo24567a();
                            if (a2 != null) {
                                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                                iyv = !(queryLocalInterface instanceof iyv) ? new iyt(a2) : (iyv) queryLocalInterface;
                            } else {
                                iyv = null;
                            }
                            long a3 = iyv.mo13498a();
                            long c = iyv.mo13499c();
                            if (a3 != -1) {
                                j = (SystemClock.elapsedRealtime() - a3) / 1000;
                            } else {
                                j = -1;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsaj bsaj2 = (bsaj) da.f164949b;
                            int i5 = bsaj2.f143854a | 8;
                            bsaj2.f143854a = i5;
                            bsaj2.f143858e = j;
                            if (c != -1) {
                                j2 = c / 1000;
                            } else {
                                j2 = -1;
                            }
                            bsaj2.f143854a = i5 | 16;
                            bsaj2.f143859f = j2;
                            skh = skh.m35531a();
                            context = this.f88306b;
                        } catch (RemoteException | InterruptedException e) {
                            f88303a.mo25415d("Could not get device signals. Setting to insecure.", e, new Object[0]);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsaj bsaj3 = (bsaj) da.f164949b;
                            int i6 = bsaj3.f143854a | 8;
                            bsaj3.f143854a = i6;
                            bsaj3.f143858e = -1;
                            bsaj3.f143854a = i6 | 16;
                            bsaj3.f143859f = -1;
                            skh = skh.m35531a();
                            context = this.f88306b;
                        }
                        skh.mo25689a(context, rex);
                    } else {
                        int i7 = i4 | 8;
                        bsaj.f143854a = i7;
                        bsaj.f143858e = -1;
                        bsaj.f143854a = i7 | 16;
                        bsaj.f143859f = -1;
                    }
                    Logger Logger = f88303a;
                    long j3 = ((bsaj) da.f164949b).f143858e;
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("lastUnlockDurationInS: ");
                    sb.append(j3);
                    Logger.mo25412b(sb.toString(), new Object[0]);
                    Logger logger2 = f88303a;
                    long j4 = ((bsaj) da.f164949b).f143859f;
                    StringBuilder sb2 = new StringBuilder(48);
                    sb2.append("lockScreenSetupDurationInS: ");
                    sb2.append(j4);
                    logger2.mo25412b(sb2.toString(), new Object[0]);
                    bxvd da2 = brzw.f143793i.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brzw brzw = (brzw) da2.f164949b;
                    hexString.getClass();
                    brzw.f143795a |= 1;
                    brzw.f143796b = hexString;
                    String str3 = Build.MODEL;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brzw brzw2 = (brzw) da2.f164949b;
                    str3.getClass();
                    brzw2.f143795a |= 4;
                    brzw2.f143798d = str3;
                    String str4 = Build.DEVICE;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brzw brzw3 = (brzw) da2.f164949b;
                    str4.getClass();
                    int i8 = brzw3.f143795a | 2;
                    brzw3.f143795a = i8;
                    brzw3.f143797c = str4;
                    "201515033".getClass();
                    brzw3.f143795a = i8 | 16;
                    brzw3.f143800f = "201515033";
                    String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brzw brzw4 = (brzw) da2.f164949b;
                    valueOf.getClass();
                    brzw4.f143795a |= 8;
                    brzw4.f143799e = valueOf;
                    bsaj bsaj4 = (bsaj) da.mo74062i();
                    bsaj4.getClass();
                    brzw4.f143802h = bsaj4;
                    brzw4.f143795a |= 64;
                    if (z2) {
                        String a4 = (bArr2 == null || (b = mo48835b()) == null) ? null : b.mo28905a(m73505a(((brzw) da2.f164949b).f143796b, bArr2));
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brzw brzw5 = (brzw) da2.f164949b;
                        a4.getClass();
                        brzw5.f143795a |= 32;
                        brzw5.f143801g = a4;
                    }
                    bArr = ((brzw) da2.mo74062i()).serializeToBytes();
                    str = "source_device_signals";
                }
                byte[] bytes = new JSONStringer().object().key("typ").value("navigator.id.getAssertion").key("challenge").value(sqd.m35972d(bArr2)).key(str).value(sqd.m35972d(bArr)).key("account_identifier").value(str2).endObject().toString().getBytes(bmwy.f131158c);
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
                Long l = ((GetAndAdvanceOtpCounterResponse) this.f88311i.mo13426a(new ixh(str2))).f10627b;
                if (l == null) {
                    this.f88309e.mo48203a(10659);
                    return null;
                }
                bxvd da3 = byrs.f167510d.mo74144da();
                ByteString a5 = ByteString.m123261a(digest);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byrs byrs = (byrs) da3.f164949b;
                a5.getClass();
                byrs.f167512a = 1 | byrs.f167512a;
                byrs.f167513b = a5;
                long longValue = l.longValue();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                byrs byrs2 = (byrs) da3.f164949b;
                byrs2.f167512a |= 2;
                byrs2.f167514c = longValue;
                byrs.m125228a(byrs2);
                return C1240of.m19758a(bytes, (byrs) da3.mo74062i());
            } catch (NoSuchAlgorithmException | JSONException e2) {
                f88303a.mo25410a(e2);
                this.f88309e.mo48203a(10660);
                return null;
            } catch (Throwable th) {
                skh.m35531a().mo25689a(this.f88306b, rex);
                throw th;
            }
        } else {
            Logger logger3 = f88303a;
            int i9 = challenge2.f108121b;
            StringBuilder sb3 = new StringBuilder(47);
            sb3.append("challenge status was not STATUS_OK: ");
            sb3.append(i9);
            logger3.mo25418e(sb3.toString(), new Object[0]);
            this.f88309e.mo48203a(10658);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo48837c(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        this.f88310h.post(new arua(this, exchangeAssertionsForUserCredentialsRequest, arwd));
    }

    /* renamed from: a */
    private static Assertion m73503a(Challenge challenge) {
        if (f88305g) {
            f88303a.mo25412b("Creating fake assertion for %s", challenge.f108122c);
            return new Assertion(challenge.f108122c, new byte[0], new byte[0], challenge.f108125f, challenge.f108124e);
        }
        cgqd.m146558c();
        return null;
    }

    /* renamed from: a */
    private static Object m73504a(aucb aucb) {
        aucu.m76783a(aucb, f88304f, TimeUnit.MILLISECONDS);
        return aucb.mo50386d();
    }

    /* renamed from: a */
    private static Map m73505a(String str, byte[] bArr) {
        byte[] bArr2;
        MessageDigest b = spn.m35868b("SHA-1");
        if (b == null) {
            f88303a.mo25416d("Could not get SHA-1 Message Digest.", new Object[0]);
            bArr2 = new byte[0];
        } else {
            bArr2 = b.digest(bArr);
        }
        return sqw.m36044b("androidId", str, "challengeHash", sqd.m35972d(bArr2));
    }

    /* renamed from: a */
    public static final byte[] m73506a(bysa bysa) {
        bxvd da = byrv.f167517d.mo74144da();
        int i = bysa.f167549q;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byrv byrv = (byrv) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            byrv.f167520b = i2;
            byrv.f167519a |= 1;
            byrv.m125232a(byrv);
            return ((byrv) da.mo74062i()).serializeToBytes();
        }
        throw null;
    }

    /* renamed from: a */
    public final brzo mo48822a(Assertion assertion) {
        bxvd da = brzo.f143767h.mo74144da();
        ByteString bxtx = bxtx.f164797b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzo brzo = (brzo) da.f164949b;
        bxtx.getClass();
        int i = brzo.f143769a | 4;
        brzo.f143769a = i;
        brzo.f143772d = bxtx;
        String str = assertion.f108113b;
        str.getClass();
        int i2 = 1;
        brzo.f143769a = i | 1;
        brzo.f143770b = str;
        int a = brzq.m114930a(assertion.f108118g);
        if (a != 0) {
            i2 = a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzo brzo2 = (brzo) da.f164949b;
        brzo2.f143775g = i2 - 1;
        brzo2.f143769a |= 32;
        ByteString a2 = bxtx.m123261a(assertion.f108117f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzo brzo3 = (brzo) da.f164949b;
        a2.getClass();
        brzo3.f143769a |= 16;
        brzo3.f143774f = a2;
        ByteString a3 = bxtx.m123261a(assertion.f108116e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzo brzo4 = (brzo) da.f164949b;
        a3.getClass();
        brzo4.f143769a |= 8;
        brzo4.f143773e = a3;
        ByteString a4 = bxtx.m123261a(assertion.f108114c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzo brzo5 = (brzo) da.f164949b;
        a4.getClass();
        brzo5.f143769a |= 2;
        brzo5.f143771c = a4;
        ByteString a5 = bxtx.m123261a(assertion.f108115d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brzo brzo6 = (brzo) da.f164949b;
        a5.getClass();
        brzo6.f143769a |= 4;
        brzo6.f143772d = a5;
        return (brzo) da.mo74062i();
    }

    /* renamed from: a */
    public final Assertion mo48823a(Challenge challenge, boolean z, boolean z2) {
        Assertion a = m73503a(challenge);
        if (a != null) {
            return a;
        }
        C1240of b = m73507b(challenge, z, z2);
        if (b != null) {
            byte[] bArr = (byte[]) b.f26798a;
            byrs byrs = (byrs) b.f26799b;
            if (!(bArr == null || byrs == null)) {
                Account account = new Account(challenge.f108122c, "com.google");
                try {
                    return new Assertion(challenge.f108122c, bArr, ((SignCryptedBlob) m73504a(this.f88312j.mo13184a("PublicKey", "authzen", account, new Payload(null, m73506a(bysa.GCMV1_IDENTITY_ASSERTION), byrs.serializeToBytes())))).f10555c, challenge.f108125f, challenge.f108124e);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    f88303a.mo25410a(e);
                    this.f88309e.mo48203a(10660);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final vvq mo48835b() {
        try {
            return (vvq) this.f88307c.get();
        } catch (InterruptedException | ExecutionException e) {
            f88303a.mo25415d("Could not get DroidGuard snapshot.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo48836b(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        String str;
        Status status;
        byte[] bArr;
        Status status2 = new Status(8);
        try {
            if (mo48835b() == null) {
                status = new Status(10651);
                try {
                    this.f88309e.mo48203a(status.f30115i);
                } catch (Throwable th) {
                    th = th;
                    status2 = status;
                    arwd.mo48870c(status2, exchangeAssertionsForUserCredentialsRequest);
                    throw th;
                }
            } else {
                String hexString = Long.toHexString(spn.getAndroidId(this.f88306b));
                String str2 = Build.DEVICE;
                String str3 = Build.MODEL;
                String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                ArrayList<Assertion> arrayList = exchangeAssertionsForUserCredentialsRequest.f108147b;
                if (arrayList != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    for (Assertion assertion : arrayList) {
                        byteArrayOutputStream.write(assertion.f108115d);
                    }
                    MessageDigest b = spn.m35868b("SHA-1");
                    if (b == null) {
                        f88303a.mo25416d("Could not get SHA-1 Message Digest.", new Object[0]);
                        bArr = new byte[0];
                    } else {
                        bArr = b.digest(byteArrayOutputStream.toByteArray());
                    }
                    String d = sqd.m35972d(bArr);
                    vvq b2 = mo48835b();
                    if (b2 != null) {
                        str = b2.mo28905a(sqw.m36044b("androidId", hexString, "encryptedUserAssertionHash", d));
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                exchangeAssertionsForUserCredentialsRequest.mo59155a(new DeviceSignals(hexString, str2, str3, valueOf, "201515033", str));
                exchangeAssertionsForUserCredentialsRequest.mo59157e(Locale.getDefault().toString());
                status = new Status(0);
            }
        } catch (IOException e) {
            f88303a.mo25415d("Could not convert assertions to bytes.", e, new Object[0]);
            str = null;
        } catch (Throwable th2) {
            th = th2;
            arwd.mo48870c(status2, exchangeAssertionsForUserCredentialsRequest);
            throw th;
        }
        arwd.mo48870c(status, exchangeAssertionsForUserCredentialsRequest);
    }

    /* renamed from: a */
    public final void mo48824a() {
        vvq b = mo48835b();
        if (b != null) {
            b.mo28907b();
        }
    }

    /* renamed from: a */
    public final void mo48825a(arwd arwd) {
        Account[] a = adyd.m51363a(this.f88306b).mo33916a("com.google");
        BootstrapAccount[] bootstrapAccountArr = new BootstrapAccount[a.length];
        for (int i = 0; i < a.length; i++) {
            Account account = a[i];
            bootstrapAccountArr[i] = new BootstrapAccount(account.name, account.type);
        }
        try {
            arwd.mo48866a(Status.f30107a, bootstrapAccountArr);
        } catch (RemoteException e) {
            f88303a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48826a(arwd arwd, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        Status status = new Status(8);
        try {
            String a = asbw.m73763a(this.f88306b);
            if (a != null) {
                f88303a.mo25414c("Backup account found.", new Object[0]);
                f88303a.mo25412b(a.length() == 0 ? new String("Backup enabled with account: ") : "Backup enabled with account: ".concat(a), new Object[0]);
            } else {
                f88303a.mo25414c("Backup account not found.", new Object[0]);
            }
            String hexString = Long.toHexString(spn.getAndroidId(this.f88306b));
            if (TextUtils.isEmpty(hexString)) {
                f88303a.mo25414c("Android ID is null or empty.", new Object[0]);
            }
            if (a == null) {
                a = "";
            }
            if (hexString == null) {
                hexString = "";
            }
            exchangeAssertionsForUserCredentialsRequest.mo59158f(a);
            exchangeAssertionsForUserCredentialsRequest.mo59159g(hexString);
            status = new Status(0);
        } finally {
            arwd.mo48869b(status, exchangeAssertionsForUserCredentialsRequest);
        }
    }

    /* renamed from: a */
    public final void mo48827a(arwd arwd, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest) {
        this.f88310h.post(new arub(this, exchangeSessionCheckpointsForUserCredentialsRequest, arwd));
    }

    /* renamed from: a */
    public final void mo48828a(arwd arwd, boolean z) {
        f88305g = z;
        arwd.mo48872a(new Status(0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f A[Catch:{ InvalidKeySpecException -> 0x00b0, InterruptedException -> 0x007c, ExecutionException -> 0x007a, TimeoutException -> 0x0078, all -> 0x00e5, all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095 A[Catch:{ InvalidKeySpecException -> 0x00b0, InterruptedException -> 0x007c, ExecutionException -> 0x007a, TimeoutException -> 0x0078, all -> 0x00e5, all -> 0x00e2 }] */
    /* renamed from: a */
    public final void mo48829a(arwd arwd, Account[] accountArr) {
        int length;
        Status status;
        UserBootstrapInfo[] userBootstrapInfoArr = null;
        if (accountArr == null || (length = accountArr.length) == 0) {
            arwd.mo48868a(new Status(10655), (UserBootstrapInfo[]) null);
            return;
        }
        if (cgpa.f187426a.mo6606a().mo84213g()) {
            argz argz = this.f88313k;
            List asList = Arrays.asList(accountArr);
            if (cgpa.m146403d()) {
                argz.mo48531b(asList);
            } else {
                argz.mo48529a(asList);
            }
            this.f88313k.mo48528a();
        }
        if (!cgpd.m146443b()) {
            Status status2 = new Status(8);
            try {
                userBootstrapInfoArr = new UserBootstrapInfo[length];
                int i = 0;
                while (i < length) {
                    String str = accountArr[i].name;
                    try {
                        Account account = accountArr[i];
                        if (f88305g) {
                            cgqd.m146558c();
                        }
                        userBootstrapInfoArr[i] = new UserBootstrapInfo(str, byrr.m125226a(byrr.m125227b(((CryptauthPublicKey) m73504a(this.f88312j.mo13188d("PublicKey", account))).f10517b)));
                        i++;
                    } catch (InvalidKeySpecException e) {
                        Logger Logger = f88303a;
                        String valueOf = String.valueOf(Logger.m35081a(str));
                        Logger.mo25417e(valueOf.length() == 0 ? new String("Could not get public key of user: ") : "Could not get public key of user: ".concat(valueOf), e, new Object[0]);
                        status = new Status(10657);
                        this.f88309e.mo48203a(status.f30115i);
                    } catch (InterruptedException e2) {
                        e = e2;
                        Logger logger2 = f88303a;
                        String valueOf2 = String.valueOf(Logger.m35081a(str));
                        logger2.mo25417e(valueOf2.length() == 0 ? new String("Failed retrieve PublicKey for account: ") : "Failed retrieve PublicKey for account: ".concat(valueOf2), e, new Object[0]);
                        status = new Status(10656);
                        try {
                            this.f88309e.mo48203a(status.f30115i);
                        } catch (Throwable th) {
                            th = th;
                            status2 = status;
                        }
                    } catch (ExecutionException e3) {
                        e = e3;
                        Logger logger22 = f88303a;
                        String valueOf22 = String.valueOf(Logger.m35081a(str));
                        logger22.mo25417e(valueOf22.length() == 0 ? new String("Failed retrieve PublicKey for account: ") : "Failed retrieve PublicKey for account: ".concat(valueOf22), e, new Object[0]);
                        status = new Status(10656);
                        this.f88309e.mo48203a(status.f30115i);
                    } catch (TimeoutException e4) {
                        e = e4;
                        Logger logger222 = f88303a;
                        String valueOf222 = String.valueOf(Logger.m35081a(str));
                        logger222.mo25417e(valueOf222.length() == 0 ? new String("Failed retrieve PublicKey for account: ") : "Failed retrieve PublicKey for account: ".concat(valueOf222), e, new Object[0]);
                        status = new Status(10656);
                        this.f88309e.mo48203a(status.f30115i);
                    } catch (Throwable th2) {
                        th = th2;
                        status2 = status;
                    }
                }
                status = new Status(0);
                arwd.mo48868a(status, userBootstrapInfoArr);
            } catch (Throwable th3) {
                th = th3;
                arwd.mo48868a(status2, userBootstrapInfoArr);
                throw th;
            }
        } else {
            ArrayList arrayList = new ArrayList(length);
            for (Account account2 : accountArr) {
                if (f88305g) {
                    cgqd.m146558c();
                }
                arrayList.add(this.f88312j.mo13188d("PublicKey", account2).mo50365a(new sty(this.f88310h), artw.f88291a).mo50363a(new artr(account2)));
            }
            aucu.m76788c(arrayList).mo50371a(new arts(this, arwd));
        }
    }

    /* renamed from: a */
    public final void mo48830a(arwd arwd, Assertion[] assertionArr) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest;
        Status status = new Status(0);
        try {
            exchangeAssertionsForUserCredentialsRequest = new ExchangeAssertionsForUserCredentialsRequest(new ArrayList(Arrays.asList(assertionArr)), cbxv.m128865c());
            try {
                arwd.mo48865a(new Status(0), exchangeAssertionsForUserCredentialsRequest);
            } catch (Throwable th) {
                th = th;
                arwd.mo48865a(status, exchangeAssertionsForUserCredentialsRequest);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            exchangeAssertionsForUserCredentialsRequest = null;
            arwd.mo48865a(status, exchangeAssertionsForUserCredentialsRequest);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo48831a(arwd arwd, Challenge[] challengeArr, boolean z) {
        mo48832a(arwd, challengeArr, z, false);
    }

    /* renamed from: a */
    public final void mo48832a(arwd arwd, Challenge[] challengeArr, boolean z, boolean z2) {
        aucb aucb;
        Throwable th;
        Status status;
        if (!cgpd.m146443b()) {
            Status status2 = new Status(8);
            try {
                ArrayList arrayList = new ArrayList(challengeArr.length);
                for (int i = 0; i < challengeArr.length; i++) {
                    Assertion a = mo48823a(challengeArr[i], z, z2);
                    if (a == null) {
                        Logger Logger = f88303a;
                        String valueOf = String.valueOf(challengeArr[i].f108122c);
                        Logger.mo25418e(valueOf.length() == 0 ? new String("Could not create assertion for account: ") : "Could not create assertion for account: ".concat(valueOf), new Object[0]);
                    } else {
                        arrayList.add(a);
                    }
                }
                if (arrayList.size() == 0) {
                    f88303a.mo25418e("No assertion infos returned!", new Object[0]);
                    status = new Status(10650);
                    try {
                        this.f88309e.mo48203a(status.f30115i);
                        arwd.mo48862a(status, (Assertion[]) null);
                    } catch (Throwable th2) {
                        th = th2;
                        status2 = status;
                        arwd.mo48862a(status2, (Assertion[]) null);
                        throw th;
                    }
                } else {
                    status = new Status(0);
                    arwd.mo48862a(status, (Assertion[]) arrayList.toArray(new Assertion[0]));
                }
            } catch (Throwable th3) {
                th = th3;
                arwd.mo48862a(status2, (Assertion[]) null);
                throw th;
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Challenge challenge : challengeArr) {
                Assertion a2 = m73503a(challenge);
                if (a2 != null) {
                    aucb = aucu.m76778a(a2);
                } else {
                    C1240of b = m73507b(challenge, z, z2);
                    if (b == null) {
                        aucb = aucu.m76777a((Exception) new rjp(Status.f30109c));
                    } else {
                        byte[] bArr = (byte[]) b.f26798a;
                        byrs byrs = (byrs) b.f26799b;
                        if (bArr == null || byrs == null) {
                            aucb = aucu.m76777a((Exception) new rjp(Status.f30109c));
                        } else {
                            aucb = this.f88312j.mo13184a("PublicKey", "authzen", new Account(challenge.f108122c, "com.google"), new Payload(null, m73506a(bysa.GCMV1_IDENTITY_ASSERTION), byrs.serializeToBytes())).mo50363a(new artv(challenge, bArr));
                        }
                    }
                }
                aucb.mo50372a(new artt(challenge));
                arrayList2.add(aucb);
            }
            aucu.m76788c(arrayList2).mo50371a(new artu(this, arwd));
        }
    }

    /* renamed from: a */
    public final void mo48833a(arwd arwd, UserBootstrapInfo[] userBootstrapInfoArr) {
        bsac bsac = (bsac) bsad.f143828d.mo74144da();
        if (bsac.f164950c) {
            bsac.mo74035c();
            bsac.f164950c = false;
        }
        bsad bsad = (bsad) bsac.f164949b;
        bsad.f143832c = 1;
        bsad.f143830a |= 1;
        bsai[] bsaiArr = new bsai[userBootstrapInfoArr.length];
        for (int i = 0; i < userBootstrapInfoArr.length; i++) {
            UserBootstrapInfo userBootstrapInfo = userBootstrapInfoArr[i];
            bxvd da = bsai.f143847d.mo74144da();
            String str = userBootstrapInfo.f108175b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsai bsai = (bsai) da.f164949b;
            str.getClass();
            bsai.f143849a |= 1;
            bsai.f143850b = str;
            ByteString a = ByteString.m123261a(userBootstrapInfo.f108176c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsai bsai2 = (bsai) da.f164949b;
            a.getClass();
            bsai2.f143849a |= 2;
            bsai2.f143851c = a;
            bsaiArr[i] = (bsai) da.mo74062i();
        }
        bsac.mo70094a(Arrays.asList(bsaiArr));
        bsad bsad2 = (bsad) bsac.mo74062i();
        bxvd da2 = bzws.f171671c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzws bzws = (bzws) da2.f164949b;
        bsad2.getClass();
        bzws.f171674b = bsad2;
        bzws.f171673a |= 1;
        this.f88310h.post(new artz(this, (bzws) da2.mo74062i(), arwd));
    }

    /* renamed from: a */
    public final UserCredential[] mo48834a(List list, bzxa[] bzxaArr) {
        String str;
        String str2;
        bzxa[] bzxaArr2 = bzxaArr;
        HashMap hashMap = new HashMap();
        for (bzxa bzxa : bzxaArr2) {
            hashMap.put(bzxa.f171712a, bzxa);
        }
        UserCredential[] userCredentialArr = new UserCredential[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bsah bsah = (bsah) list.get(i);
            int i2 = bsah.f143842b;
            if (i2 != 0) {
                ((beon) this.f88309e.f87038e.mo6606a()).mo60861b(Integer.valueOf(i2));
            }
            bzxa bzxa2 = (bzxa) hashMap.get(bsah.f143841a);
            if (bzxa2 != null) {
                String str3 = bzxa2.f171713b;
                str = bzxa2.f171714c;
                str2 = str3;
            } else {
                str2 = null;
                str = null;
            }
            userCredentialArr[i] = new UserCredential(bsah.f143841a, bsah.f143842b, bsah.f143843c, bsah.f143844d, bsah.f143845e, str2, str);
        }
        return userCredentialArr;
    }
}
