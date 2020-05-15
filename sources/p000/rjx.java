package p000;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.pay.GetPayGlobalActionCardsRequest;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialRequest;
import com.google.android.gms.tapandpay.internal.firstparty.SetSelectedTokenRequest;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.PutDataRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;

/* renamed from: rjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rjx implements rkc, izm, alhr, artq {

    /* renamed from: A */
    public final rkz f43162A;

    /* renamed from: B */
    public final Looper f43163B;

    /* renamed from: C */
    public final int f43164C;

    /* renamed from: D */
    public final rkb f43165D;

    /* renamed from: E */
    public final rnm f43166E;

    /* renamed from: a */
    private final rot f43167a;

    /* renamed from: w */
    public final Context f43168w;

    /* renamed from: x */
    public final String f43169x;

    /* renamed from: y */
    public final rjo f43170y;

    /* renamed from: z */
    public final rjk f43171z;

    public rjx(Activity activity, rjo rjo, rjk rjk, rjw rjw) {
        sdo.m34966a(activity, "Null activity is not permitted.");
        sdo.m34966a(rjo, "Api must not be null.");
        sdo.m34966a(rjw, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f43168w = activity.getApplicationContext();
        this.f43169x = m33692a(activity);
        this.f43170y = rjo;
        this.f43171z = rjk;
        this.f43163B = rjw.f43161c;
        this.f43162A = rkz.m33905a(this.f43170y, this.f43171z);
        this.f43165D = new rnn(this);
        rnm a = rnm.m34128a(this.f43168w);
        this.f43166E = a;
        this.f43164C = a.mo24944a();
        this.f43167a = rjw.f43160b;
        if (!(activity instanceof GoogleApiActivity)) {
            try {
                rmd.m33975a(LifecycleCallback.m22509a(activity), this.f43166E, this.f43162A);
            } catch (IllegalStateException | ConcurrentModificationException e) {
            }
        }
        this.f43166E.mo24946a(this);
    }

    /* renamed from: a */
    private final aucb m33690a(SetSelectedTokenRequest setSelectedTokenRequest) {
        roz b = rpa.m34196b();
        b.f43472a = new asmw(setSelectedTokenRequest);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: b */
    public static aejv m33695b(aucf aucf) {
        return new aeha(aucf);
    }

    /* renamed from: c */
    public static boolean m33698c(Context context) {
        return context.getPackageManager().resolveService(new Intent("com.google.android.gms.trustagent.StateApi.START"), 0) != null;
    }

    /* renamed from: A */
    public final aucb mo24669A() {
        roz b = rpa.m34196b();
        b.f43472a = new auqt();
        return mo24701a(b.mo24977a());
    }

    /* renamed from: B */
    public final aucb mo24670B() {
        roz b = rpa.m34196b();
        b.f43472a = new auqu();
        return mo24701a(b.mo24977a());
    }

    /* renamed from: C */
    public final aucb mo24671C() {
        rkb rkb = this.f43165D;
        avds avds = new avds(rkb);
        rkb.mo24787a((rle) avds);
        return sdl.m34955a(avds, new rkj());
    }

    /* renamed from: D */
    public final aucb mo24672D() {
        rkb rkb = this.f43165D;
        avdu avdu = new avdu(rkb);
        rkb.mo24787a((rle) avdu);
        return sdl.m34955a(avdu, new rkj());
    }

    /* renamed from: E */
    public aucb mo24673E() {
        return sdl.m34955a(avva.m79409a(this.f43165D), new rkj());
    }

    /* renamed from: F */
    public aucb mo24674F() {
        return sdl.m34956a(axqq.m82909b(this.f43165D), axqs.f96277a);
    }

    /* renamed from: d */
    public final aucb mo24740d(Account account) {
        roz b = rpa.m34196b();
        b.f43472a = new alja(account);
        b.f43473b = new Feature[]{aldg.f73486f};
        b.mo24979b();
        return mo24701a(b.mo24977a());
    }

    /* renamed from: e */
    public final aucb mo24742e(Account account) {
        roz b = rpa.m34196b();
        b.f43472a = new asml(account);
        b.f43473b = new Feature[]{asih.f89021e};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: f */
    public final rkz mo24744f() {
        return this.f43162A;
    }

    /* renamed from: g */
    public final aucb mo24746g(String str) {
        return m33690a(new SetSelectedTokenRequest(str, 0, true, 0));
    }

    /* renamed from: h */
    public final aucb mo24748h() {
        rjo rjo = lrh.f26630a;
        rkb rkb = this.f43165D;
        tma tma = new tma(rkb);
        rkb.mo24787a((rle) tma);
        return sdl.m34955a(new dqw(tma), new rkj());
    }

    /* renamed from: i */
    public final aucb mo24750i() {
        return mo24701a((rpa) new qqd());
    }

    /* renamed from: j */
    public final aucb mo24752j() {
        rkb rkb = this.f43165D;
        adgk adgk = new adgk(rkb);
        rkb.mo24787a((rle) adgk);
        return sdl.m34956a(adgk, adef.f61486a);
    }

    /* renamed from: k */
    public final aucb mo24754k() {
        return mo24701a((rpa) new aefv());
    }

    /* renamed from: l */
    public final aucb mo24756l() {
        roz b = rpa.m34196b();
        b.f43472a = new aego(this);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: m */
    public final aucb mo24758m() {
        roz b = rpa.m34196b();
        b.f43472a = aegt.f63371a;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: n */
    public final aucb mo24760n() {
        rkb rkb = this.f43165D;
        aezh aezh = new aezh(rkb);
        rkb.mo24787a((rle) aezh);
        return sdl.m34955a(aezh, new rkj());
    }

    /* renamed from: o */
    public final aucb mo24761o() {
        return mo24701a((rpa) new afjt());
    }

    /* renamed from: p */
    public final aucb mo24762p() {
        return mo24701a((rpa) new afjx());
    }

    /* renamed from: q */
    public final aucb mo24763q() {
        return mo24701a((rpa) new afjz());
    }

    /* renamed from: r */
    public final aucb mo24764r() {
        return mo24701a((rpa) new afkb());
    }

    /* renamed from: s */
    public final void mo24765s() {
        roz b = rpa.m34196b();
        b.f43472a = new aljc();
        b.f43473b = new Feature[]{aldg.f73493m};
        b.mo24979b();
        mo24701a(b.mo24977a());
    }

    /* renamed from: t */
    public final aucb mo24766t() {
        return mo24701a((rpa) new apfr());
    }

    /* renamed from: u */
    public final aucb mo24767u() {
        rjo rjo = apfp.f84322a;
        rkb rkb = this.f43165D;
        apgl apgl = new apgl(rkb);
        rkb.mo24787a((rle) apgl);
        return sdl.m34955a(apgl, new rkj());
    }

    /* renamed from: v */
    public final void mo24768v() {
        mo24701a((rpa) new apfu());
    }

    /* renamed from: w */
    public final rke mo24769w() {
        rkb rkb = this.f43165D;
        asxd asxd = new asxd(rkb);
        rkb.mo24787a((rle) asxd);
        return asxd;
    }

    /* renamed from: x */
    public final aucb mo24770x() {
        roz b = rpa.m34196b();
        b.f43472a = new asmz();
        return mo24701a(b.mo24977a());
    }

    /* renamed from: y */
    public final aucb mo24771y() {
        roz b = rpa.m34196b();
        b.f43472a = asmo.f89255a;
        return mo24732b(b.mo24977a());
    }

    /* renamed from: z */
    public final void mo24772z() {
        roz b = rpa.m34196b();
        b.f43472a = asmq.f89257a;
        mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public static rjx m33696b(Context context) {
        return new rjx(context, (int[]) null);
    }

    /* renamed from: c */
    public final aucb mo24736c(Account account) {
        roz b = rpa.m34196b();
        b.f43472a = new aepx(account);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: f */
    public final void mo24745f(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new pqk(str);
        b.mo24979b();
        b.f43473b = new Feature[]{pfa.f39013f};
        mo24732b(b.mo24977a());
    }

    @Deprecated
    /* renamed from: i */
    public final rke mo24751i(String str) {
        rkb rkb = this.f43165D;
        asxg asxg = new asxg(rkb, str);
        rkb.mo24795b(asxg);
        return asxg;
    }

    /* renamed from: k */
    public aucb mo24755k(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new avue(this, str);
        b.f43473b = new Feature[]{avtu.f93904b};
        return mo24701a(b.mo24977a());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjx.<init>(android.content.Context, int[]):void
     arg types: [com.google.android.chimera.Activity, ?[OBJECT, ARRAY]]
     candidates:
      rjx.<init>(android.content.Context, allq):void
      rjx.<init>(android.content.Context, auzy):void
      rjx.<init>(android.content.Context, avty):void
      rjx.<init>(android.content.Context, rjg):void
      rjx.<init>(android.content.Context, rjw):void
      rjx.<init>(android.content.Context, byte[]):void
      rjx.<init>(android.content.Context, char[]):void
      rjx.<init>(android.content.Context, float[]):void
      rjx.<init>(android.content.Context, short[]):void
      rjx.<init>(android.content.Context, boolean[]):void
      rjx.<init>(android.content.Context, int[]):void */
    /* renamed from: b */
    public static rjx m33697b(com.google.android.chimera.Activity activity) {
        return new rjx((Context) activity, (int[]) null);
    }

    /* renamed from: a */
    private final aucb m33691a(rod rod, LocationRequestInternal locationRequestInternal) {
        aegz aegz = new aegz(rod);
        aegq aegq = new aegq(this, aegz, rod, locationRequestInternal);
        rom a = ron.m34179a();
        a.f43443a = aegq;
        a.f43444b = aegz;
        a.f43445c = rod;
        return mo24700a(a.mo24973a());
    }

    /* renamed from: b */
    public final aucb mo24729b(PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aefu(pendingIntent);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: d */
    public final aucb mo24741d(PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aehi(pendingIntent);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: e */
    public final aucb mo24743e(String str) {
        tjh a = tjj.m37079a();
        ((InterestUpdateBatchImpl) a).f30688a.add(new InterestUpdateBatchImpl.Operation(2, null, str));
        return sdl.m34954a(a.mo18075a(this.f43165D));
    }

    /* renamed from: g */
    public sar mo24747g() {
        Set set;
        GoogleSignInAccount a;
        sar sar = new sar();
        rjk rjk = this.f43171z;
        Account account = null;
        if (!(rjk instanceof rjg) || (a = ((rjg) rjk).mo16734a()) == null) {
            rjk rjk2 = this.f43171z;
            if (rjk2 instanceof rjf) {
                account = ((rjf) rjk2).mo24205b();
            }
        } else {
            String str = a.f10317d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        sar.f43957a = account;
        rjk rjk3 = this.f43171z;
        if (rjk3 instanceof rjg) {
            GoogleSignInAccount a2 = ((rjg) rjk3).mo16734a();
            if (a2 == null) {
                set = Collections.emptySet();
            } else {
                set = a2.mo7522a();
            }
        } else {
            set = Collections.emptySet();
        }
        if (sar.f43958b == null) {
            sar.f43958b = new C1225nr();
        }
        sar.f43958b.addAll(set);
        sar.f43960d = this.f43168w.getClass().getName();
        sar.f43959c = this.f43168w.getPackageName();
        return sar;
    }

    /* renamed from: j */
    public final aucb mo24753j(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new asmp(str);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: l */
    public aucb mo24757l(String str) {
        rzz.m34727a(str, "capability must not be null");
        return sdl.m34954a(axqb.m82891a(this.f43165D, str));
    }

    /* renamed from: m */
    public aucb mo24759m(String str) {
        rzz.m34727a(str, "capability must not be null");
        return sdl.m34954a(axqb.m82892b(this.f43165D, str));
    }

    /* renamed from: c */
    public final aucb mo24737c(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        sdo.m34959a(exchangeAssertionsForUserCredentialsRequest);
        arvx arvx = new arvx(exchangeAssertionsForUserCredentialsRequest);
        roz b = rpa.m34196b();
        b.f43472a = arvx;
        return mo24701a(b.mo24977a());
    }

    public rjx(Context context) {
        this(context, gje.f18333a, (rjk) null, rjw.f43159a);
        int i = gri.f18884a;
    }

    /* renamed from: b */
    public final aucb mo24730b(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        sdo.m34959a(exchangeAssertionsForUserCredentialsRequest);
        arvw arvw = new arvw(exchangeAssertionsForUserCredentialsRequest);
        roz b = rpa.m34196b();
        b.f43472a = arvw;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: d */
    public final aucb mo13530d(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new jaj(str);
        b.f43473b = new Feature[]{kaz.f23678a};
        return mo24701a(b.mo24977a());
    }

    /* renamed from: h */
    public final aucb mo24749h(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new asmy(str);
        return mo24732b(b.mo24977a());
    }

    public rjx(Context context, allq allq) {
        this(context, allr.f73629a, allq, rjw.f43159a);
    }

    /* renamed from: a */
    private static String m33692a(Object obj) {
        if (!ssw.m36269a()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }

    public rjx(Context context, allq allq, byte[] bArr) {
        this(context, allr.f73629a, allq, rjw.f43159a);
    }

    /* renamed from: c */
    public final aucb mo13529c(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new jal(str);
        b.f43473b = new Feature[]{kaz.f23678a};
        return mo24701a(b.mo24977a());
    }

    public rjx(Context context, auzy auzy) {
        this(context, auzz.f92845a, auzy, rjw.f43159a);
    }

    /* renamed from: a */
    public static rjx m33693a(com.google.android.chimera.Activity activity) {
        return new rjx(activity, asip.f89051a, (rjk) null, rjw.f43159a);
    }

    public rjx(Context context, avty avty) {
        this(context, avtz.f93909a, avty, rjw.f43159a);
    }

    /* renamed from: b */
    public final aucb mo13528b(String str) {
        roz b = rpa.m34196b();
        b.f43472a = new jak(str);
        b.f43473b = new Feature[]{kaz.f23678a};
        return mo24701a(b.mo24977a());
    }

    public rjx(Context context, rjg rjg) {
        this(context, zam.f54893c, rjg, rjw.f43159a);
    }

    /* renamed from: a */
    public static void m33694a(Channel channel) {
        sdo.m34966a(channel, "channel must not be null");
    }

    /* renamed from: c */
    public final void mo24738c(int i) {
        m33690a(new SetSelectedTokenRequest(null, -1, true, i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @Deprecated
    public rjx(Context context, rjo rjo, Looper looper, rot rot) {
        this(context, rjo, (rjk) null, r0.mo24666a());
        rjv rjv = new rjv();
        rjv.mo24667a(looper);
        rjv.mo24668a(rot);
    }

    /* renamed from: a */
    public final aucb mo24675a(int i, Bundle bundle) {
        roz b = rpa.m34196b();
        b.f43472a = new auqr(i, bundle);
        return mo24701a(b.mo24977a());
    }

    public rjx(Context context, rjo rjo, rjk rjk, rjw rjw) {
        sdo.m34966a(context, "Null context is not permitted.");
        sdo.m34966a(rjo, "Api must not be null.");
        sdo.m34966a(rjw, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f43168w = context.getApplicationContext();
        this.f43169x = m33692a(context);
        this.f43170y = rjo;
        this.f43171z = rjk;
        this.f43163B = rjw.f43161c;
        this.f43162A = rkz.m33905a(this.f43170y, this.f43171z);
        this.f43165D = new rnn(this);
        rnm a = rnm.m34128a(this.f43168w);
        this.f43166E = a;
        this.f43164C = a.mo24944a();
        this.f43167a = rjw.f43160b;
        this.f43166E.mo24946a(this);
    }

    /* renamed from: b */
    public final aucb mo24731b(rob rob) {
        return rpc.m34200a(mo24698a(rob));
    }

    /* renamed from: b */
    public final aucb mo24732b(rpa rpa) {
        return mo24677a(1, rpa);
    }

    /* renamed from: c */
    public final void mo24739c(PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aegw(pendingIntent);
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24676a(int i, String str, String str2) {
        roz b = rpa.m34196b();
        b.f43472a = new axee(i, str, str2);
        return mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final void mo24733b(asin asin) {
        rpc.m34200a(mo24698a(roe.m34171a(asin, "tapAndPayDataChangedListener")));
    }

    /* renamed from: b */
    public final void mo24734b(String str, long j) {
        mo24728a(str, j, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @Deprecated
    public rjx(Context context, rjo rjo, rjk rjk, rot rot) {
        this(context, rjo, rjk, r0.mo24666a());
        rjv rjv = new rjv();
        rjv.mo24668a(rot);
    }

    /* renamed from: b */
    public final boolean mo24735b(String str, int i) {
        try {
            this.f43168w.getPackageManager().getPackageInfo(str, i);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final aucb mo24677a(int i, rpa rpa) {
        aucf aucf = new aucf();
        rnm rnm = this.f43166E;
        rkv rkv = new rkv(i, rpa, aucf, this.f43167a);
        Handler handler = rnm.f43405o;
        handler.sendMessage(handler.obtainMessage(4, new rog(rkv, rnm.f43401k.get(), this)));
        return aucf.f91388a;
    }

    public rjx(Context context, rjw rjw) {
        this(context, axoz.f96226a, (rjk) null, rjw);
    }

    public rjx(Context context, rjw rjw, byte[] bArr) {
        this(context, axoz.f96226a, (rjk) null, rjw);
    }

    public rjx(Context context, rjw rjw, char[] cArr) {
        this(context, axoz.f96226a, (rjk) null, rjw);
    }

    /* renamed from: a */
    public final aucb mo24678a(aehz aehz) {
        return mo24731b(roe.m34171a(aehz, aehz.class.getSimpleName()));
    }

    public rjx(Context context, rjw rjw, short[] sArr) {
        this(context, axoz.f96226a, (rjk) null, rjw);
    }

    /* renamed from: a */
    public final aucb mo24679a(PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aefr(pendingIntent);
        return mo24732b(b.mo24977a());
    }

    public rjx(Context context, byte[] bArr) {
        this(context, brig.f142864a, Looper.getMainLooper(), new brhh());
        bdyx.m91614a(context);
    }

    /* renamed from: a */
    public aucb mo24680a(avub avub) {
        rod a = roe.m34172a(avub, this.f43163B, avub.class.getSimpleName());
        avuc avuc = new avuc(this, a, ((avty) this.f43171z).f93908b);
        avud avud = new avud(this);
        rom a2 = ron.m34179a();
        a2.f43443a = avuc;
        a2.f43444b = avud;
        a2.f43445c = a;
        a2.f43446d = new Feature[]{avtu.f93903a};
        return mo24700a(a2.mo24973a());
    }

    public rjx(Context context, char[] cArr) {
        this(context, apfp.f84322a, (rjk) null, new rky());
        if (apge.f84328a == null) {
            synchronized (apge.class) {
                if (apge.f84328a == null) {
                    apge.f84328a = new apge(null);
                }
            }
        }
    }

    public rjx(Context context, float[] fArr) {
        this(context, aeqc.f63620a, (rjk) null, new rky());
    }

    public rjx(Context context, int[] iArr) {
        this(context, asip.f89051a, (rjk) null, rjw.f43159a);
    }

    public rjx(Context context, short[] sArr) {
        this(context, aeie.f63411a, (rjk) null, rjw.f43159a);
    }

    public rjx(Context context, boolean[] zArr) {
        this(context, afkf.f64306a, (rjk) null, rjw.f43159a);
    }

    public rjx(com.google.android.chimera.Activity activity, rjo rjo, rjw rjw) {
        sdo.m34966a(activity, "Null chimeraActivity is not permitted.");
        sdo.m34966a(rjo, "Api must not be null.");
        sdo.m34966a(rjw, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f43168w = activity.getApplicationContext();
        this.f43169x = m33692a((Object) activity);
        this.f43170y = rjo;
        this.f43171z = null;
        this.f43163B = rjw.f43161c;
        this.f43162A = rkz.m33905a(this.f43170y, this.f43171z);
        this.f43165D = new rnn(this);
        rnm a = rnm.m34128a(this.f43168w);
        this.f43166E = a;
        this.f43164C = a.mo24944a();
        this.f43167a = rjw.f43160b;
        rmd.m33975a(LifecycleCallback.m22510a(activity), this.f43166E, this.f43162A);
        this.f43166E.mo24946a(this);
    }

    /* renamed from: a */
    public final aucb mo24681a(FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        rjo rjo = lrh.f26630a;
        return sdl.m34954a(tkf.m37133a(this.f43165D, fenceUpdateRequestImpl));
    }

    /* renamed from: a */
    public final aucb mo24682a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aefq(activityRecognitionRequest, pendingIntent);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24683a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aeft(activityTransitionRequest, pendingIntent);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24684a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aehh(geofencingRequest, pendingIntent);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24685a(LocationRequestInternal locationRequestInternal, aehz aehz, Looper looper) {
        return m33691a(roe.m34172a(aehz, aesk.m52500a(looper), aehz.class.getSimpleName()), locationRequestInternal);
    }

    /* renamed from: a */
    public final aucb mo24686a(OptInRequest optInRequest) {
        roz b = rpa.m34196b();
        b.f43472a = new aepy(optInRequest);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24687a(GetPayGlobalActionCardsRequest getPayGlobalActionCardsRequest) {
        roz b = rpa.m34196b();
        b.f43472a = new aliy(getPayGlobalActionCardsRequest);
        b.f43473b = new Feature[]{aldg.f73485e};
        b.mo24979b();
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24688a(ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest) {
        sdo.m34959a(exchangeAssertionsForUserCredentialsRequest);
        arvv arvv = new arvv(exchangeAssertionsForUserCredentialsRequest);
        roz b = rpa.m34196b();
        b.f43472a = arvv;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24689a(UdcCacheRequest udcCacheRequest) {
        rkb rkb = this.f43165D;
        avdq avdq = new avdq(rkb, udcCacheRequest);
        rkb.mo24787a((rle) avdq);
        return sdl.m34956a(avdq, new avaf());
    }

    /* renamed from: a */
    public aucb mo24690a(UsageReportingOptInOptions usageReportingOptInOptions) {
        rkb rkb = this.f43165D;
        avuy avuy = new avuy(rkb, usageReportingOptInOptions);
        rkb.mo24795b(avuy);
        return sdl.m34954a(avuy);
    }

    /* renamed from: a */
    public aucb mo24691a(PutDataRequest putDataRequest) {
        rkb rkb = this.f43165D;
        axqn axqn = new axqn(rkb, putDataRequest);
        rkb.mo24787a((rle) axqn);
        return sdl.m34956a(axqn, axqr.f96276a);
    }

    /* renamed from: a */
    public final aucb mo24692a(String str, int i, tjw tjw, tjx tjx) {
        tjh a = tjj.m37079a();
        a.mo18076a(str, i, tjw, tjx);
        return sdl.m34954a(a.mo18075a(this.f43165D));
    }

    /* renamed from: a */
    public final aucb mo24693a(String str, Bundle bundle) {
        sdo.m34977c(str);
        bngx a = bngx.m109356a(str);
        sdo.m34961a(a.size());
        return mo24701a((rpa) new qps(a, bundle));
    }

    /* renamed from: a */
    public aucb mo24694a(String str, String str2, byte[] bArr) {
        return sdl.m34956a(axsg.m83138a(this.f43165D, str, str2, bArr), axsh.f96301a);
    }

    /* renamed from: a */
    public aucb mo24695a(String str, byte[] bArr, avua avua, int i) {
        roz b = rpa.m34196b();
        b.f43472a = new avug(this, str, bArr, i, avua);
        b.f43473b = new Feature[]{avtu.f93904b};
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public aucb mo24696a(String str, byte[] bArr, int[] iArr, int i) {
        roz b = rpa.m34196b();
        b.f43472a = new avuh(this, str, bArr, iArr, i);
        b.f43473b = new Feature[]{avtu.f93904b};
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24697a(List list) {
        roz b = rpa.m34196b();
        b.f43472a = new aehj(list);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24698a(rob rob) {
        sdo.m34966a(rob, "Listener key cannot be null.");
        rnm rnm = this.f43166E;
        aucf aucf = new aucf();
        rkw rkw = new rkw(rob, aucf);
        Handler handler = rnm.f43405o;
        handler.sendMessage(handler.obtainMessage(13, new rog(rkw, rnm.f43401k.get(), this)));
        return aucf.f91388a;
    }

    @Deprecated
    /* renamed from: a */
    public final aucb mo24699a(roh roh, rpf rpf) {
        sdo.m34959a(roh);
        sdo.m34959a(rpf);
        sdo.m34966a(roh.mo24969a(), "Listener has already been released.");
        sdo.m34966a(rpf.f43482b, "Listener has already been released.");
        sdo.m34975b(roh.mo24969a().equals(rpf.f43482b), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.f43166E.mo24945a(this, roh, rpf, rju.f43156a);
    }

    /* renamed from: a */
    public final aucb mo24700a(ron ron) {
        sdo.m34959a(ron);
        sdo.m34966a(ron.f43448a.mo24969a(), "Listener has already been released.");
        sdo.m34966a(ron.f43449b.f43482b, "Listener has already been released.");
        return this.f43166E.mo24945a(this, ron.f43448a, ron.f43449b, ron.f43450c);
    }

    /* renamed from: a */
    public final aucb mo24701a(rpa rpa) {
        return mo24677a(0, rpa);
    }

    /* renamed from: a */
    public final aucb mo24702a(tiu tiu) {
        return sdl.m34955a(tjj.m37081b(this.f43165D, tiu), new rkj());
    }

    /* renamed from: a */
    public final aucb mo24703a(tiu tiu, tjc tjc) {
        return sdl.m34954a(tjj.m37077a(this.f43165D, tiu, tjc));
    }

    /* renamed from: a */
    public final aucb mo24704a(tjc tjc) {
        return sdl.m34954a(tjj.m37078a(this.f43165D, tjc));
    }

    /* renamed from: a */
    public final aucb mo24705a(boolean z) {
        return mo24701a((rpa) new afjv(z));
    }

    /* renamed from: a */
    public final aucb mo24706a(Account[] accountArr) {
        arvj arvj = new arvj(accountArr);
        roz b = rpa.m34196b();
        b.f43472a = arvj;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24707a(Assertion[] assertionArr) {
        sdo.m34959a(assertionArr);
        arvu arvu = new arvu(assertionArr);
        roz b = rpa.m34196b();
        b.f43472a = arvu;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24708a(Challenge[] challengeArr, boolean z, boolean z2) {
        arvt arvt = new arvt(challengeArr, z, z2);
        roz b = rpa.m34196b();
        b.f43472a = arvt;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo24709a(UserBootstrapInfo[] userBootstrapInfoArr) {
        arvs arvs = new arvs(userBootstrapInfoArr);
        roz b = rpa.m34196b();
        b.f43472a = arvs;
        return mo24701a(b.mo24977a());
    }

    /* renamed from: a */
    public final rke mo24710a(alkx alkx) {
        rjo rjo = allr.f73629a;
        rkb rkb = this.f43165D;
        if (alkx == null) {
            alkx = alkx.f73612a;
        }
        ambw ambw = new ambw(rkb, alkx);
        rkb.mo24787a((rle) ambw);
        return ambw;
    }

    /* renamed from: a */
    public final rke mo24711a(NotificationSettings notificationSettings) {
        rkb rkb = this.f43165D;
        asxi asxi = new asxi(rkb, notificationSettings);
        rkb.mo24795b(asxi);
        return asxi;
    }

    /* renamed from: a */
    public final rke mo24712a(RetrieveInAppPaymentCredentialRequest retrieveInAppPaymentCredentialRequest) {
        rkb rkb = this.f43165D;
        asxa asxa = new asxa(rkb, retrieveInAppPaymentCredentialRequest);
        rkb.mo24787a((rle) asxa);
        return asxa;
    }

    /* renamed from: a */
    public final rke mo24713a(String str, int i, int i2) {
        rjo rjo = allr.f73629a;
        return amcy.m62631b(this.f43165D, str, i, i2);
    }

    /* renamed from: a */
    public final rod mo24714a(Object obj, String str) {
        return roe.m34172a(obj, this.f43163B, str);
    }

    /* renamed from: a */
    public final void mo24715a(int i, rle rle) {
        rle.mo17721f();
        rnm rnm = this.f43166E;
        rkt rkt = new rkt(i, rle);
        Handler handler = rnm.f43405o;
        handler.sendMessage(handler.obtainMessage(4, new rog(rkt, rnm.f43401k.get(), this)));
    }

    /* renamed from: a */
    public final void mo24716a(aehy aehy) {
        rpc.m34200a(mo24698a(roe.m34171a(aehy, aehy.class.getSimpleName())));
    }

    /* renamed from: a */
    public final void mo24717a(Activity activity, int i, asxx asxx) {
        roz b = rpa.m34196b();
        b.f43472a = new asmn(activity, i, asxx);
        b.f43473b = new Feature[]{asih.f89031o};
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo24718a(Activity activity, int i, String str) {
        mo24732b(new asnc(str, activity, i));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo24719a(Activity activity, String str) {
        roz b = rpa.m34196b();
        b.f43472a = new asmm(str, activity);
        b.f43473b = new Feature[]{asih.f89031o};
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo24720a(asin asin) {
        rod a = mo24714a(asin, "tapAndPayDataChangedListener");
        rob rob = a.f43429b;
        sdo.m34966a(rob, "Key must not be null");
        mo24699a(new asiq(a, a), new asir(rob));
    }

    /* renamed from: a */
    public void mo24721a(axou axou) {
        rob rob = roe.m34172a(axou, this.f43163B, "MessageListener").f43429b;
        C1244oj.m19767a(rob, "Key must not be null");
        mo24698a(rob);
    }

    /* renamed from: a */
    public void mo24722a(axou axou, Uri uri) {
        C1244oj.m19767a(uri, "uri must not be null");
        sdo.m34975b(true, "invalid filter type");
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
        if (uri.getScheme() != null) {
            intentFilter.addDataScheme(uri.getScheme());
        }
        if (uri.getAuthority() != null) {
            intentFilter.addDataAuthority(uri.getAuthority(), Integer.toString(uri.getPort()));
        }
        if (uri.getPath() != null) {
            intentFilter.addDataPath(uri.getPath(), 0);
        }
        mo24723a(axou, new IntentFilter[]{intentFilter});
    }

    /* renamed from: a */
    public void mo24723a(axou axou, IntentFilter[] intentFilterArr) {
        rod a = roe.m34172a(axou, this.f43163B, "MessageListener");
        rob rob = a.f43429b;
        C1244oj.m19767a(rob, "Key must not be null");
        mo24699a(new axsi(axou, intentFilterArr, a), new axsj(axou, rob));
    }

    /* renamed from: a */
    public final void mo24724a(LocationRequest locationRequest, aehz aehz) {
        m33691a(mo24714a(aehz, aehz.class.getSimpleName()), LocationRequestInternal.m66889a(null, locationRequest));
    }

    /* renamed from: a */
    public final void mo24725a(LocationRequestInternal locationRequestInternal, aehy aehy, Looper looper) {
        rod a = roe.m34172a(aehy, aesk.m52500a(looper), aehy.class.getSimpleName());
        aegy aegy = new aegy(a);
        aegu aegu = new aegu(this, aegy, aehy, locationRequestInternal, a);
        rom a2 = ron.m34179a();
        a2.f43443a = aegu;
        a2.f43444b = aegy;
        a2.f43445c = a;
        mo24700a(a2.mo24973a());
    }

    /* renamed from: a */
    public final void mo24726a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        roz b = rpa.m34196b();
        b.f43472a = new aegv(this, locationRequestInternal, pendingIntent);
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo24727a(SelectPayGlobalActionCardRequest selectPayGlobalActionCardRequest) {
        roz b = rpa.m34196b();
        b.f43472a = new aliz(selectPayGlobalActionCardRequest);
        b.f43473b = new Feature[]{aldg.f73485e};
        b.mo24979b();
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo24728a(String str, long j, int i) {
        m33690a(new SetSelectedTokenRequest(str, j, true, i));
    }
}
