package com.google.android.gms.wallet.intentoperation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.analytics.events.AnalyticsSessionStartEndEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import com.google.android.gms.wallet.dynamite.logging.C1676b;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AnalyticsIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final awqd f110259a;

    /* renamed from: b */
    private awqe f110260b;

    public AnalyticsIntentOperation() {
        this(new awqd(), null);
    }

    /* renamed from: a */
    public static bpil m94032a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        bxvd da = bpil.f137777b.mo74144da();
        if (!((Boolean) awiu.f94495b.mo58455c()).booleanValue()) {
            return (bpil) da.mo74062i();
        }
        ArrayList a = m94033a(context, new awqd(), true, new awqe(context), walletAnalyticsEvent);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpil bpil = (bpil) da.f164949b;
        if (!bpil.f137779a.mo73666a()) {
            bpil.f137779a = GeneratedMessageLite.m124021a(bpil.f137779a);
        }
        bxsy.m123078a(a, bpil.f137779a);
        awqc.m80662a(context, walletAnalyticsEvent);
        return (bpil) da.mo74062i();
    }

    public final void onCreate() {
        if (this.f110260b == null) {
            this.f110260b = new awqe(this);
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (((Boolean) awiu.f94495b.mo58455c()).booleanValue()) {
            try {
                m94033a(this, this.f110259a, false, this.f110260b, (WalletAnalyticsEvent) intent.getParcelableExtra("wallet.analytics.event"));
            } catch (Throwable th) {
                C1676b.m93930a(this, th, getPackageName());
            }
        }
    }

    public AnalyticsIntentOperation(awqd awqd, awqe awqe) {
        this.f110259a = awqd;
        this.f110260b = awqe;
    }

    AnalyticsIntentOperation(awqd awqd, awqe awqe, Context context) {
        this(awqd, awqe);
        attachBaseContext(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0238  */
    /* renamed from: a */
    static ArrayList m94033a(Context context, awqd awqd, boolean z, awqe awqe, WalletAnalyticsEvent walletAnalyticsEvent) {
        awqu awqu;
        awqy awqy;
        awqu awqu2;
        Context context2 = context;
        boolean z2 = z;
        awqe awqe2 = awqe;
        WalletAnalyticsEvent walletAnalyticsEvent2 = walletAnalyticsEvent;
        ArrayList arrayList = new ArrayList();
        String str = walletAnalyticsEvent2.f110015m;
        if (TextUtils.isEmpty(str)) {
            Log.e("AnalyticsIntentOperatio", "Session id required for log correlation. Ignoring analytics event.");
            return arrayList;
        }
        Class a = awqv.m80733a(walletAnalyticsEvent);
        String string = awqe2.f94843a.getString(str, null);
        if (string != null) {
            bjvz a2 = bjwb.m104763a(string);
            if (a == awqg.class) {
                awqu = (awqu) a.cast(new awqg(a2));
            } else if (a == awqi.class) {
                awqu = (awqu) a.cast(new awqi(a2));
            } else if (a == awqq.class) {
                awqu = (awqu) a.cast(new awqq(a2));
            } else if (a == awqr.class) {
                awqu = (awqu) a.cast(new awqr(a2));
            } else if (a == awqs.class) {
                awqu = (awqu) a.cast(new awqs(a2));
            } else if (a == awqp.class) {
                awqu = (awqu) a.cast(new awqp(a2));
            } else if (a == awqo.class) {
                awqu = (awqu) a.cast(new awqo(a2));
            } else if (a.equals(awqx.class)) {
                awqu = (awqu) a.cast(new awqx(a2));
            } else if (a.equals(awqk.class)) {
                awqu = (awqu) a.cast(new awqk(a2));
            } else if (a.equals(awqj.class)) {
                awqu = (awqu) a.cast(new awqj(a2));
            } else if (a.equals(awqm.class)) {
                awqu = (awqu) a.cast(new awqm(a2));
            } else if (a.equals(awql.class)) {
                awqu = (awqu) a.cast(new awql(a2));
            } else if (a.equals(awqf.class)) {
                awqu = (awqu) a.cast(new awqf(a2));
            } else if (a.equals(awqw.class)) {
                awqu = (awqu) a.cast(new awqw(a2));
            } else if (a.equals(awqt.class)) {
                awqu = (awqu) a.cast(new awqt(a2));
            } else {
                throw new IllegalArgumentException("Unexpected SessionState type used");
            }
        } else {
            awqu = null;
        }
        if (awqu == null) {
            Class a3 = awqv.m80733a(walletAnalyticsEvent);
            if (a3 != null) {
                if (a3.equals(awqg.class)) {
                    awqu2 = new awqg();
                } else if (a3.equals(awqi.class)) {
                    awqu2 = new awqi();
                } else if (a3.equals(awqq.class)) {
                    awqu2 = new awqq();
                } else if (a3.equals(awqs.class)) {
                    awqu2 = new awqs();
                } else if (a3.equals(awqr.class)) {
                    awqu2 = new awqp();
                } else if (a3.equals(awqr.class)) {
                    awqu2 = new awqr();
                } else if (a3.equals(awqo.class)) {
                    awqu2 = new awqo();
                } else if (a3.equals(awqx.class)) {
                    awqu2 = new awqx();
                } else if (a3.equals(awqk.class)) {
                    awqu2 = new awqk();
                } else if (a3.equals(awqj.class)) {
                    awqu2 = new awqj();
                } else if (a3.equals(awqm.class)) {
                    awqu2 = new awqm();
                } else if (a3.equals(awql.class)) {
                    awqu2 = new awql();
                } else if (a3.equals(awqf.class)) {
                    awqu2 = new awqf();
                } else if (a3.equals(awqw.class)) {
                    awqu2 = new awqw();
                } else if (a3.equals(awqt.class)) {
                    awqu2 = new awqt();
                }
                if (awqu != null) {
                    awqu.mo52459a(context2, walletAnalyticsEvent2);
                    if (walletAnalyticsEvent2 instanceof AnalyticsSessionStartEndEvent) {
                        String str2 = ((AnalyticsSessionStartEndEvent) walletAnalyticsEvent2).f109919b;
                        if (str2 == null) {
                            Log.e("AnalyticsIntentOperatio", "TransactionKey must not be null. Ignoring analytics event.");
                        } else if (TextUtils.isEmpty(awqu.f94876k.f137854h)) {
                            bpje bpje = awqu.f94876k;
                            bxvd bxvd = (bxvd) bpje.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) bpje);
                            sdo.m34969a(str2, (Object) "transactionKey must not be null");
                            String string2 = awqe2.f94843a.getString(str2, null);
                            if (string2 == null) {
                                String a4 = awnm.m80359a();
                                long currentTimeMillis = System.currentTimeMillis();
                                long j = awqe2.f94844b;
                                awqy awqy2 = new awqy(currentTimeMillis + 86400000, a4);
                                SharedPreferences.Editor edit = awqe2.f94843a.edit();
                                edit.putString(str2, awqy2.toString());
                                edit.apply();
                                awqy = awqy2;
                            } else {
                                awqy = new awqy(bjwb.m104763a(string2));
                            }
                            String str3 = awqy.f94882b;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bpje bpje2 = (bpje) bxvd.f164949b;
                            bpje bpje3 = bpje.f137845k;
                            str3.getClass();
                            bpje2.f137847a |= 64;
                            bpje2.f137854h = str3;
                            awqu.f94876k = (bpje) bxvd.mo74062i();
                        }
                    }
                }
                return arrayList;
            }
            awqu2 = null;
            if (awqu != null) {
            }
            return arrayList;
        }
        awqu.mo52459a(context2, walletAnalyticsEvent2);
        if (awqu.mo52462a()) {
            ArrayList c = awqu.mo52466c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                WalletAnalyticsEvent walletAnalyticsEvent3 = (WalletAnalyticsEvent) c.get(i);
                if (walletAnalyticsEvent3 != null) {
                    arrayList.addAll(m94033a(context2, awqd, z2, awqe2, walletAnalyticsEvent3));
                }
            }
            bxvd da = bpik.f137757s.mo74144da();
            bpje bpje4 = awqu.f94876k;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpik bpik = (bpik) da.f164949b;
            bpje4.getClass();
            bpik.f137760b = bpje4;
            bpik.f137759a |= 1;
            awqu.mo52461a(da);
            bpik bpik2 = (bpik) da.mo74062i();
            arrayList.add(0, bpik2);
            if (z2) {
                return arrayList;
            }
            int i2 = spn.f44932a;
            awqd.m80663a(context2, "GMS_CORE_WALLET", bpik2, awqu.mo52463b());
            SharedPreferences.Editor edit2 = awqe2.f94843a.edit();
            edit2.remove(str);
            edit2.apply();
            if (walletAnalyticsEvent2 instanceof awea) {
                String str4 = awqu.f94877l;
                SharedPreferences.Editor edit3 = awqe2.f94843a.edit();
                edit3.remove(str4);
                edit3.apply();
            }
        } else if (!z2) {
            SharedPreferences.Editor edit4 = awqe2.f94843a.edit();
            long currentTimeMillis2 = System.currentTimeMillis();
            long j2 = awqe2.f94844b;
            awqu.f94875j = currentTimeMillis2 + 86400000;
            edit4.putString(str, awqu.toString());
            edit4.apply();
            Context context3 = awqe2.f94846d;
            SharedPreferences sharedPreferences = awqe2.f94843a;
            int i3 = awqe2.f94845c;
            new awpd(context3, sharedPreferences, 60).execute(new Void[0]);
        }
        return arrayList;
    }
}
