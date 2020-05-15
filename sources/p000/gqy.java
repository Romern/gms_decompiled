package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Random;

/* renamed from: gqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqy extends aaab {

    /* renamed from: a */
    private final gpg f18860a;

    /* renamed from: b */
    private final imk f18861b;

    /* renamed from: c */
    private final Account f18862c;

    /* renamed from: d */
    private final String f18863d;

    /* renamed from: e */
    private final int f18864e;

    /* renamed from: f */
    private final boolean f18865f;

    /* renamed from: g */
    private final ilo f18866g;

    /* renamed from: h */
    private final svq f18867h;

    /* renamed from: i */
    private final sek f18868i = ght.m13171a("RemoveAccountOperation");

    /* renamed from: j */
    private final gko f18869j;

    /* renamed from: k */
    private Bundle f18870k;

    /* renamed from: l */
    private String f18871l;

    public gqy(gpg gpg, imk imk, Account account, String str, Bundle bundle, ilo ilo, svq svq, gko gko, int i, boolean z) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "GetTokenWithDetails");
        this.f18860a = gpg;
        this.f18861b = imk;
        this.f18862c = account;
        this.f18863d = str;
        this.f18870k = bundle;
        this.f18866g = ilo;
        this.f18867h = svq;
        this.f18869j = gko;
        this.f18864e = i;
        this.f18865f = z;
    }

    /* renamed from: a */
    private static Bundle m13754a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("Error", str);
        return bundle;
    }

    /* renamed from: a */
    private static void m13755a(boet boet, Context context) {
        Random random = new Random();
        long a = spn.m35843a(context);
        if (a != 0) {
            random.setSeed(a);
        }
        if (random.nextDouble() < cbyz.f178573a.mo6606a().mo75620a() || ccao.m129151b()) {
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 1;
            int i = 1 | boct.f132610a;
            boct.f132610a = i;
            boet.getClass();
            boct.f132613d = boet;
            boct.f132610a = i | 2;
            new jyj(context).mo14225b((boct) da.mo74062i());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x031d A[SYNTHETIC, Splitter:B:114:0x031d] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0251 A[Catch:{ all -> 0x0334 }] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        long j;
        Bundle bundle;
        int i;
        String str;
        Context context2 = context;
        bxvd da = boet.f132836q.mo74144da();
        long j2 = this.f18870k.getLong("service_connection_start_time_millis", -1);
        if (j2 >= 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boet boet = (boet) da.f164949b;
            boet.f132838a |= 64;
            boet.f132845h = elapsedRealtime;
        }
        bogf bogf = (bogf) bogg.f132977f.mo74144da();
        ddx ddx = (ddx) this.f18861b.mo12005a(context2);
        ilq ilq = new ilq(context2);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        try {
            this.f18871l = this.f18870k.getString(gie.f18286b);
            int i2 = this.f18870k.getInt(gie.f18285a, 0);
            String[] a = this.f18867h.mo26175a(this.f18864e);
            if (this.f18871l == null && a != null && a.length > 0) {
                this.f18871l = a[0];
            }
            if (i2 == 0) {
                i = ilq.mo13122a(this.f18871l);
            } else {
                i = i2;
            }
            if (i != this.f18864e) {
                if (a != null) {
                    bogf.mo68907a(Arrays.asList(a));
                }
            }
            gic a2 = gic.m13182a(this.f18870k);
            bsoa a3 = a2.mo11902a();
            if (a3 == null) {
                a3 = bsoa.f146351k;
            }
            bxvd bxvd = (bxvd) a3.mo74142c(5);
            bxvd.mo73625a((bxvk) a3);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsoa bsoa = (bsoa) bxvd.f164949b;
            bsoa.f146361i = 1;
            bsoa.f146353a |= 512;
            gib gib = new gib(this.f18870k);
            gib.mo11901a((bsoa) bxvd.mo74062i());
            this.f18870k = gib.mo11900a().f18284a;
            ApplicationInformation b = a2.mo11903b();
            if (b == null) {
                str = this.f18869j.mo11990a(this.f18871l).f18411b;
            } else {
                this.f18871l = b.f10844b;
                str = b.f10845c;
            }
            if (str != null) {
                if (bogf.f164950c) {
                    bogf.mo74035c();
                    bogf.f164950c = false;
                }
                bogg bogg = (bogg) bogf.f164949b;
                str.getClass();
                bogg.f132979a |= 4;
                bogg.f132982d = str;
            }
            String str2 = this.f18871l;
            if (str2 != null) {
                if (bogf.f164950c) {
                    bogf.mo74035c();
                    bogf.f164950c = false;
                }
                bogg bogg2 = (bogg) bogf.f164949b;
                str2.getClass();
                bogg2.f132979a |= 1;
                bogg2.f132980b = str2;
            }
            AppDescription a4 = this.f18866g.mo13121a(ilq.f21311f, this.f18864e, this.f18871l, i, ilq);
            if (!"^^_account_id_^^".equals(this.f18863d)) {
                try {
                    TokenResponse a5 = ddx.mo8553a(this.f18862c, this.f18863d, this.f18870k, a4, this.f18865f, da);
                    bundle = a5 != null ? ddx.mo8552a(this.f18862c, this.f18863d, this.f18870k, a4, a5, da) : m13754a(izj.UNKNOWN_ERROR.f22000ac);
                } catch (RuntimeException e) {
                    e = e;
                    try {
                        ddx.m8218a(e, da);
                        if (e instanceof SecurityException) {
                            this.f18868i.mo25415d("Exception while trying to get token.", e, new Object[0]);
                            bundle = m13754a(izj.INTNERNAL_ERROR.f22000ac);
                            String str3 = this.f18863d;
                            if (bogf.f164950c) {
                                bogf.mo74035c();
                                bogf.f164950c = false;
                            }
                            bogg bogg3 = (bogg) bogf.f164949b;
                            str3.getClass();
                            bogg3.f132979a |= 2;
                            bogg3.f132981c = str3;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet2 = (boet) da.f164949b;
                            bogg bogg4 = (bogg) bogf.mo74062i();
                            bogg4.getClass();
                            boet2.f132844g = bogg4;
                            boet2.f132838a |= 32;
                            boolean z = this.f18870k.getBoolean("handle_notification");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet3 = (boet) da.f164949b;
                            boet3.f132838a |= 2;
                            boet3.f132840c = z;
                            boolean containsKey = this.f18870k.containsKey("callback_intent");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet4 = (boet) da.f164949b;
                            boet4.f132838a |= 4;
                            boet4.f132841d = containsKey;
                            boolean containsKey2 = this.f18870k.containsKey("sync_extras");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet5 = (boet) da.f164949b;
                            boet5.f132838a |= 8;
                            boet5.f132842e = containsKey2;
                            j = SystemClock.elapsedRealtime() - elapsedRealtime2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boet boet6 = (boet) da.f164949b;
                            boet6.f132838a |= 1;
                            boet6.f132839b = j;
                            m13755a((boet) da.mo74062i(), context2);
                            this.f18860a.mo12125a(Status.f30107a, bundle);
                        }
                        this.f18868i.mo25415d("Exception while trying to get token for security reasons.", e, new Object[0]);
                        gql gql = new gql(10);
                        gql.f18825a = e;
                        throw gql.mo12128a();
                    } catch (Throwable th) {
                        th = th;
                        String str4 = this.f18863d;
                        if (bogf.f164950c) {
                            bogf.mo74035c();
                            bogf.f164950c = false;
                        }
                        bogg bogg5 = (bogg) bogf.f164949b;
                        str4.getClass();
                        bogg5.f132979a |= 2;
                        bogg5.f132981c = str4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet7 = (boet) da.f164949b;
                        bogg bogg6 = (bogg) bogf.mo74062i();
                        bogg6.getClass();
                        boet7.f132844g = bogg6;
                        boet7.f132838a |= 32;
                        boolean z2 = this.f18870k.getBoolean("handle_notification");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet8 = (boet) da.f164949b;
                        boet8.f132838a |= 2;
                        boet8.f132840c = z2;
                        boolean containsKey3 = this.f18870k.containsKey("callback_intent");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet9 = (boet) da.f164949b;
                        boet9.f132838a |= 4;
                        boet9.f132841d = containsKey3;
                        boolean containsKey4 = this.f18870k.containsKey("sync_extras");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet10 = (boet) da.f164949b;
                        boet10.f132838a |= 8;
                        boet10.f132842e = containsKey4;
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boet boet11 = (boet) da.f164949b;
                        boet11.f132838a |= 1;
                        boet11.f132839b = elapsedRealtime3;
                        m13755a((boet) da.mo74062i(), context2);
                        throw th;
                    }
                }
            } else {
                bundle = ddx.mo8551a(this.f18862c, this.f18870k, a4, this.f18865f, da);
            }
            String str5 = this.f18863d;
            if (bogf.f164950c) {
                bogf.mo74035c();
                bogf.f164950c = false;
            }
            bogg bogg7 = (bogg) bogf.f164949b;
            str5.getClass();
            bogg7.f132979a |= 2;
            bogg7.f132981c = str5;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boet boet12 = (boet) da.f164949b;
            bogg bogg8 = (bogg) bogf.mo74062i();
            bogg8.getClass();
            boet12.f132844g = bogg8;
            boet12.f132838a |= 32;
            boolean z3 = this.f18870k.getBoolean("handle_notification");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boet boet13 = (boet) da.f164949b;
            boet13.f132838a |= 2;
            boet13.f132840c = z3;
            boolean containsKey5 = this.f18870k.containsKey("callback_intent");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boet boet14 = (boet) da.f164949b;
            boet14.f132838a |= 4;
            boet14.f132841d = containsKey5;
            boolean containsKey6 = this.f18870k.containsKey("sync_extras");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boet boet15 = (boet) da.f164949b;
            boet15.f132838a |= 8;
            boet15.f132842e = containsKey6;
            j = SystemClock.elapsedRealtime() - elapsedRealtime2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
        } catch (gkn e2) {
            String valueOf = String.valueOf(this.f18871l);
            throw new SecurityException(valueOf.length() == 0 ? new String("Invalid consumer package - ") : "Invalid consumer package - ".concat(valueOf), e2);
        } catch (RuntimeException e3) {
            e = e3;
            ddx.m8218a(e, da);
            if (e instanceof SecurityException) {
            }
        } catch (Throwable th2) {
            th = th2;
            String str42 = this.f18863d;
            if (bogf.f164950c) {
            }
            bogg bogg52 = (bogg) bogf.f164949b;
            str42.getClass();
            bogg52.f132979a |= 2;
            bogg52.f132981c = str42;
            if (da.f164950c) {
            }
            boet boet72 = (boet) da.f164949b;
            bogg bogg62 = (bogg) bogf.mo74062i();
            bogg62.getClass();
            boet72.f132844g = bogg62;
            boet72.f132838a |= 32;
            boolean z22 = this.f18870k.getBoolean("handle_notification");
            if (da.f164950c) {
            }
            boet boet82 = (boet) da.f164949b;
            boet82.f132838a |= 2;
            boet82.f132840c = z22;
            boolean containsKey32 = this.f18870k.containsKey("callback_intent");
            if (da.f164950c) {
            }
            boet boet92 = (boet) da.f164949b;
            boet92.f132838a |= 4;
            boet92.f132841d = containsKey32;
            boolean containsKey42 = this.f18870k.containsKey("sync_extras");
            if (da.f164950c) {
            }
            boet boet102 = (boet) da.f164949b;
            boet102.f132838a |= 8;
            boet102.f132842e = containsKey42;
            long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime2;
            if (da.f164950c) {
            }
            boet boet112 = (boet) da.f164949b;
            boet112.f132838a |= 1;
            boet112.f132839b = elapsedRealtime32;
            m13755a((boet) da.mo74062i(), context2);
            throw th;
        }
        boet boet62 = (boet) da.f164949b;
        boet62.f132838a |= 1;
        boet62.f132839b = j;
        m13755a((boet) da.mo74062i(), context2);
        this.f18860a.mo12125a(Status.f30107a, bundle);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f18860a.mo12125a(status, null);
    }
}
