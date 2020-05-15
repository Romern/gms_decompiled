package p000;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mobiledataplan.notification.NotificationListenerIntentOperation;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* renamed from: agrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrq {

    /* renamed from: a */
    public static final bnhe f66321a;

    /* renamed from: d */
    public static final srn f66322d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    public final Context f66323b;

    /* renamed from: c */
    public final sex f66324c;

    /* renamed from: e */
    public final agza f66325e = new agza();

    /* renamed from: f */
    private final bqgj f66326f = snp.m35704b(9);

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(bszx.GCORE_MSG_TYPE_PLAN_STATUS_UPDATED, "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE");
        h.mo67695b(bszx.GCORE_MSG_TYPE_UPSELL_OFFER, "com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER");
        h.mo67695b(bszx.GCORE_MSG_TYPE_ACCOUNT_ALERT, "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        h.mo67695b(bszx.GCORE_MSG_TYPE_OUT_OF_DATA, "com.google.android.gms.mobiledataplan.NOTIFICATION.OUT_OF_DATA");
        h.mo67695b(bszx.GCORE_MSG_TYPE_EXPIRATION_REMINDER, "com.google.android.gms.mobiledataplan.NOTIFICATION.EXPIRATION_REMINDER");
        h.mo67695b(bszx.GCORE_MSG_TYPE_BALANCE_UPDATE, "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT");
        h.mo67695b(bszx.GCORE_MSG_TYPE_PURCHASE, "com.google.android.gms.mobiledataplan.NOTIFICATION.PURCHASE");
        h.mo67695b(bszx.GCORE_MSG_TYPE_SETUP, "com.google.android.gms.mobiledataplan.NOTIFICATION.NETWORK_SETUP");
        h.mo67695b(bszx.GCORE_MSG_TYPE_DAILY_UPDATE, "com.google.android.gms.mobiledataplan.NOTIFICATION.DAILY_UPDATE");
        h.mo67695b(bszx.GCORE_MSG_TYPE_PAYGO, "com.google.android.gms.mobiledataplan.NOTIFICATION.PAY_AS_YOU_GO");
        h.mo67695b(bszx.GCORE_MSG_TYPE_OTHER, "com.google.android.gms.mobiledataplan.NOTIFICATION.OTHER");
        f66321a = bnmt.m109791a(h.mo67618b());
    }

    public agrq() {
        rpr b = rpr.m34216b();
        this.f66323b = b;
        this.f66324c = sex.m35104a(b);
    }

    /* renamed from: a */
    public static long m54999a(bwbv bwbv, long j) {
        bwby bwby;
        bwbz bwbz;
        bwbw bwbw;
        bwbx bwbx;
        bwbu a = bwbu.m121732a(bwbv.f158779a);
        bxyk bxyk = bxyk.f165095c;
        bszx bszx = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            if (bwbv.f158779a == 2) {
                bwby = (bwby) bwbv.f158780b;
            } else {
                bwby = bwby.f158793d;
            }
            bxyk = bwby.f158796b;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
        } else if (ordinal == 1) {
            if (bwbv.f158779a == 3) {
                bwbz = (bwbz) bwbv.f158780b;
            } else {
                bwbz = bwbz.f158798d;
            }
            bxyk = bwbz.f158801b;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
        } else if (ordinal == 2) {
            if (bwbv.f158779a == 4) {
                bwbw = (bwbw) bwbv.f158780b;
            } else {
                bwbw = bwbw.f158785c;
            }
            bxyk = bwbw.f158787a;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
        } else if (ordinal == 3) {
            if (bwbv.f158779a == 5) {
                bwbx = (bwbx) bwbv.f158780b;
            } else {
                bwbx = bwbx.f158789c;
            }
            bxyk = bwbx.f158792b;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
        } else if (ordinal == 4) {
            ((bnsl) f66322d.mo68388c()).mo68420a("Received GCM message with unrecognized body type %s", a);
            return Long.MIN_VALUE;
        }
        return !bxyk.equals(bxyk.f165095c) ? bxzt.m124578a(bxyk) : j;
    }

    /* renamed from: b */
    public static int m55006b(bszx bszx) {
        bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
        bszx bszx2 = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
        switch (bszx.ordinal()) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 102;
            default:
                return 2;
        }
    }

    /* renamed from: c */
    public static bwbt m55008c(bwbv bwbv) {
        bwby bwby;
        bwbz bwbz;
        bwbw bwbw;
        bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
        bszx bszx = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
        int ordinal = bwbu.m121732a(bwbv.f158779a).ordinal();
        if (ordinal == 0) {
            if (bwbv.f158779a == 2) {
                bwby = (bwby) bwbv.f158780b;
            } else {
                bwby = bwby.f158793d;
            }
            bwbt bwbt = bwby.f158797c;
            return bwbt == null ? bwbt.f158758k : bwbt;
        } else if (ordinal == 1) {
            if (bwbv.f158779a == 3) {
                bwbz = (bwbz) bwbv.f158780b;
            } else {
                bwbz = bwbz.f158798d;
            }
            bwbt bwbt2 = bwbz.f158802c;
            return bwbt2 == null ? bwbt.f158758k : bwbt2;
        } else if (ordinal != 2) {
            return null;
        } else {
            if (bwbv.f158779a == 4) {
                bwbw = (bwbw) bwbv.f158780b;
            } else {
                bwbw = bwbw.f158785c;
            }
            bwbt bwbt3 = bwbw.f158788b;
            if (bwbt3 == null) {
                return bwbt.f158758k;
            }
            return bwbt3;
        }
    }

    /* renamed from: b */
    static long m55007b(bwbv bwbv, long j) {
        bwbw bwbw;
        int b;
        bszx a = bszx.m116352a(bwbv.f158782d);
        if (a == null) {
            a = bszx.UNRECOGNIZED;
        }
        bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
        switch (a.ordinal()) {
            case 1:
                return j + cfmv.f184430a.mo6606a().mo81550S();
            case 2:
                return j + cfmv.f184430a.mo6606a().mo81576ar();
            case 3:
                if (bwbv.f158779a == 4) {
                    bwbw = (bwbw) bwbv.f158780b;
                } else {
                    bwbw = bwbw.f158785c;
                }
                bwbt bwbt = bwbw.f158788b;
                if (bwbt == null) {
                    bwbt = bwbt.f158758k;
                }
                if (cfmj.m140158g() && bwbt != null && (b = bwcc.m121742b(bwbt.f158766g)) != 0 && b == 14) {
                    return cfmj.m140164m();
                }
                return j + cflx.f184311a.mo6606a().mo81423a();
            case 4:
                return j + cfnf.f184517a.mo6606a().mo81625M();
            case 5:
                return j + cfnf.f184517a.mo6606a().mo81622J();
            case 6:
                return j + cfnf.f184517a.mo6606a().mo81634a();
            case 7:
                return j + cfnf.f184517a.mo6606a().mo81628P();
            case 8:
                return j + cfnf.f184517a.mo6606a().mo81630R();
            case 9:
                return j + cfnf.f184517a.mo6606a().mo81638e();
            case 10:
                return j + cfnf.f184517a.mo6606a().mo81626N();
            case 11:
                return j + cfnf.f184517a.mo6606a().mo81624L();
            default:
                return Long.MIN_VALUE;
        }
    }

    /* renamed from: c */
    public final void mo36032c() {
        agrl a = agrl.m54942a();
        StatusBarNotification[] b = this.f66324c.mo25448b();
        for (StatusBarNotification statusBarNotification : b) {
            if ("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG".equals(statusBarNotification.getTag()) && ((statusBarNotification.getNotification().flags & 16) != 0 || !cfnf.m140513n())) {
                int id = statusBarNotification.getId();
                this.f66324c.mo25444a("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", id);
                bxvd da = bwbv.f158777g.mo74144da();
                long j = (long) id;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bwbv) da.f164949b).f158781c = j;
                a.mo35998a((bwbv) da.mo74062i(), boox.CLEARED_ALL_BY_USER, "MDP_UiAction", bygd.CLEARED_ALL_BY_USER);
            }
        }
    }

    /* renamed from: a */
    public static final NotificationChannel m55000a(String str, String str2) {
        return m55001a(str, str2, 3);
    }

    /* renamed from: a */
    public static final NotificationChannel m55001a(String str, String str2, int i) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION");
        return notificationChannel;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agrl.a(booc, java.lang.String, java.lang.Integer):void
     arg types: [booc, java.lang.String, int]
     candidates:
      agrl.a(int, java.lang.String, java.lang.String):boot
      agrl.a(int, boom, booa):void
      agrl.a(int, java.lang.Integer, java.lang.Long):void
      agrl.a(booj, java.lang.Integer, java.lang.Long):void
      agrl.a(boot, bygd, java.lang.Integer):void
      agrl.a(bopn, bygd, java.lang.Integer):void
      agrl.a(bxzv, int, int):void
      agrl.a(bygd, java.lang.String, java.lang.String):void
      agrl.a(java.lang.String, int, long):void
      agrl.a(booc, java.lang.String, java.lang.Integer):void */
    /* renamed from: a */
    static final Bitmap m55002a(bwbt bwbt, int i) {
        Bitmap bitmap;
        boolean z;
        if (agqg.m54856k().booleanValue()) {
            Bitmap a = bwbt.f158762c != 0 ? agpk.m54726a().mo35824a(Long.valueOf(bwbt.f158762c), i) : null;
            if (a != null) {
                return a;
            }
        }
        int i2 = i - 1;
        bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
        bszx bszx = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
        if (i2 != 0) {
            bitmap = agyt.m55300a(bwbt.f158768i);
        } else {
            bitmap = agyt.m55300a(bwbt.f158767h);
        }
        if (agqg.m54856k().booleanValue()) {
            try {
                if (bwbt.f158762c == 0) {
                    z = false;
                } else if (bitmap != null) {
                    agpk a2 = agpk.m54726a();
                    Long valueOf = Long.valueOf(bwbt.f158762c);
                    agpr agpr = new agpr();
                    agpr.mo35887a(valueOf);
                    if (i2 != 0) {
                        agpr.mo35884a(bitmap);
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        agpr.f66252a.put("carrier_app_logo", byteArrayOutputStream.toByteArray());
                    }
                    z = a2.f66242a.mo35855a(agpr.mo35883a());
                } else {
                    z = false;
                }
            } catch (RuntimeException e) {
                if (e.getClass().getName().equals("java.lang.RuntimeException")) {
                    bnsl bnsl = (bnsl) f66322d.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Failed to marshall Logo Parcelable");
                    z = false;
                } else {
                    throw e;
                }
            }
            if (cfmq.m140237h()) {
                agrl a3 = agrl.m54942a();
                bxvd da = booc.f133888c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booc) da.f164949b).f133890a = boob.m111380a(3);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booc) da.f164949b).f133891b = z;
                a3.mo35992a((booc) da.mo74062i(), "MDP_Notification", (Integer) 0);
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    public final PendingIntent mo36029b(Intent intent) {
        Context context = this.f66323b;
        int i = Build.VERSION.SDK_INT;
        return PendingIntent.getService(context, 0, becl.m91781a(intent, 201326592), 201326592);
    }

    /* renamed from: b */
    public final void mo36030b(bwbv bwbv) {
        this.f66326f.execute(new agrp(this, bwbv));
    }

    /* renamed from: b */
    public final boolean mo36031b() {
        return sey.m35126a(this.f66323b).mo25460a();
    }

    /* renamed from: a */
    public static btaq m55003a(bxvd bxvd, long j) {
        bxyk a = bxzt.m124580a(System.currentTimeMillis());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btaq btaq = (btaq) bxvd.f164949b;
        btaq btaq2 = btaq.f148036g;
        a.getClass();
        btaq.f148042e = a;
        bxyk bxyk = btaq.f148041d;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        if (bxyk.equals(bxyk.f165095c)) {
            bxyk bxyk2 = ((btaq) bxvd.f164949b).f148042e;
            if (bxyk2 == null) {
                bxyk2 = bxyk.f165095c;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxyk2.getClass();
            ((btaq) bxvd.f164949b).f148041d = bxyk2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btaq btaq3 = (btaq) bxvd.f164949b;
        btaq3.f148043f = j;
        btaq3.f148039b++;
        btaq3.f148040c++;
        int b = bwcc.m121742b(btaq3.f148038a);
        if (b == 0) {
            b = 1;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((btaq) bxvd.f164949b).f148038a = bwcc.m121741a(b);
        return (btaq) bxvd.mo74062i();
    }

    /* renamed from: a */
    static final void m55004a(Intent intent, bwbv bwbv) {
        bszx bszx;
        String str;
        int i;
        int i2;
        int i3;
        bwby bwby;
        bwbz bwbz;
        bwbw bwbw;
        bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
        bszx bszx2 = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
        int ordinal = bwbu.m121732a(bwbv.f158779a).ordinal();
        if (ordinal == 0) {
            if (bwbv.f158779a == 2) {
                bwby = (bwby) bwbv.f158780b;
            } else {
                bwby = bwby.f158793d;
            }
            bwbt bwbt = bwby.f158797c;
            if (bwbt == null) {
                bwbt = bwbt.f158758k;
            }
            str = bwbt.f158763d;
            int b = bwcc.m121742b(bwbt.f158766g);
            if (b == 0) {
                b = 1;
            }
            bszx = bszx.GCORE_MSG_TYPE_PLAN_STATUS_UPDATED;
        } else if (ordinal == 1) {
            if (bwbv.f158779a == 3) {
                bwbz = (bwbz) bwbv.f158780b;
            } else {
                bwbz = bwbz.f158798d;
            }
            bwbt bwbt2 = bwbz.f158802c;
            if (bwbt2 == null) {
                bwbt2 = bwbt.f158758k;
            }
            str = bwbt2.f158763d;
            int b2 = bwcc.m121742b(bwbt2.f158766g);
            if (b2 == 0) {
                b2 = 1;
            }
            bszx = bszx.GCORE_MSG_TYPE_UPSELL_OFFER;
        } else if (ordinal == 2) {
            if (bwbv.f158779a == 4) {
                bwbw = (bwbw) bwbv.f158780b;
            } else {
                bwbw = bwbw.f158785c;
            }
            bwbt bwbt3 = bwbw.f158788b;
            if (bwbt3 == null) {
                bwbt3 = bwbt.f158758k;
            }
            str = bwbt3.f158763d;
            i = bwcc.m121742b(bwbt3.f158766g);
            if (i == 0) {
                i = 1;
            }
            bszx = bszx.GCORE_MSG_TYPE_ACCOUNT_ALERT;
        } else {
            return;
        }
        if (cfnf.m140504e() && (bszx = bszx.m116352a(bwbv.f158782d)) == null) {
            bszx = bszx.UNRECOGNIZED;
        }
        Intent putExtra = intent.putExtra("NOTIFICATION_LOGGING_REQUESTING_CPID", str).putExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", bwbv.f158781c);
        if (bszx != bszx.UNRECOGNIZED) {
            i2 = bszx.mo3214a();
        } else {
            i2 = 0;
        }
        Intent putExtra2 = putExtra.putExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", i2);
        if (i != 1) {
            i3 = bwcc.m121741a(i);
        } else {
            i3 = 0;
        }
        putExtra2.putExtra("NOTIFICATION_LOGGING_NOTIFICATION_GENRE", i3).putExtra("NOTIFICATION_LOGGING_MESSAGE_CASE", bwbu.m121732a(bwbv.f158779a).f158776f);
        if (cfnf.m140508i()) {
            ArrayList arrayList = new ArrayList(bwbv.f158784f.size());
            ArrayList arrayList2 = new ArrayList(bwbv.f158784f.size());
            bxwc bxwc = bwbv.f158784f;
            int size = bxwc.size();
            for (int i4 = 0; i4 < size; i4++) {
                bwca bwca = (bwca) bxwc.get(i4);
                arrayList.add(bwca.f158806b);
                arrayList2.add(Integer.valueOf(bwca.f158805a));
            }
            intent.putExtra("NOTIFICATION_ACTION_LABELS", (String[]) arrayList.toArray(new String[0]));
            intent.putExtra("NOTIFICATION_ACTION_TYPES", bqcn.m112584a(arrayList2));
        }
        intent.setFlags(604012544);
    }

    /* renamed from: a */
    public static boolean m55005a(bszx bszx) {
        if (!cfnf.m140504e()) {
            bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
            bszx bszx2 = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
            int ordinal = bszx.ordinal();
            if (ordinal == 1) {
                return true;
            }
            if (ordinal == 2) {
                return cfmv.m140314m();
            }
            if (ordinal != 3) {
                return false;
            }
            return cfmv.m140315n();
        }
        bwbu bwbu2 = bwbu.MSG_PLAN_STATUS_UPDATE;
        bszx bszx3 = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
        switch (bszx.ordinal()) {
            case 1:
                return cfnf.f184517a.mo6606a().mo81614B();
            case 2:
                return cfnf.f184517a.mo6606a().mo81620H();
            case 3:
                return cfnf.m140503d();
            case 4:
                return cfnf.m140511l();
            case 5:
                return cfnf.m140507h();
            case 6:
                return cfnf.m140505f();
            case 7:
                return cfnf.m140514o();
            case 8:
                return cfnf.f184517a.mo6606a().mo81618F();
            case 9:
                return cfnf.m140506g();
            case 10:
                return cfnf.m140512m();
            case 11:
                return cfnf.m140510k();
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final int mo36023a() {
        try {
            return qkj.m32287a(this.f66323b, C0126R.C0127drawable.quantum_ic_data_usage_white_24);
        } catch (Resources.NotFoundException e) {
            return qkj.m32287a(this.f66323b, C0126R.C0127drawable.quantum_ic_google_white_24);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo36024a(Intent intent) {
        Context context = this.f66323b;
        int i = Build.VERSION.SDK_INT;
        return becl.m91780a(context, 0, intent, 201326592);
    }

    /* renamed from: a */
    public final Intent mo36025a(bwbv bwbv) {
        Intent startIntent = IntentOperation.getStartIntent(this.f66323b, NotificationListenerIntentOperation.class, "com.google.android.gms.mobiledataplan.NOTIFICATION_DELETE");
        if (startIntent == null) {
            ((bnsl) f66322d.mo68388c()).mo68405a("Using NotificationListenerIntentOperation.class out of GmsCore context");
            return null;
        }
        m55004a(startIntent, bwbv);
        return startIntent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo36026a(bwbv bwbv, String str) {
        Intent intent = new Intent("com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY");
        intent.setComponent(new ComponentName(this.f66323b, str));
        m55004a(intent, bwbv);
        return intent;
    }

    /* renamed from: a */
    public final void mo36027a(String str, String str2, String str3) {
        this.f66326f.execute(new agro(this, str3, str2, str));
    }

    /* renamed from: a */
    public final boolean mo36028a(String str) {
        if (this.f66325e.mo36210a(str)) {
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            if (this.f66324c.mo25449c("com.google.android.gms.mobiledataplan.NOTIFICATION") == null || this.f66324c.mo25449c("com.google.android.gms.mobiledataplan.NOTIFICATION").isBlocked() || this.f66324c.mo25437a(str) == null || this.f66324c.mo25437a(str).getImportance() == 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
