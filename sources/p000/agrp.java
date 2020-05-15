package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agrp */
final /* synthetic */ class agrp implements Runnable {

    /* renamed from: a */
    private final agrq f66319a;

    /* renamed from: b */
    private final bwbv f66320b;

    public agrp(agrq agrq, bwbv bwbv) {
        this.f66319a = agrq;
        this.f66320b = bwbv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
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
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        if (r1.f66324c.mo25437a(r9) == null) goto L_0x00c5;
     */
    public final void run() {
        long j;
        long j2;
        long j3;
        Pair pair;
        bwbt c;
        int b;
        bxvd bxvd;
        byte[] bArr;
        String str;
        long j4;
        PendingIntent pendingIntent;
        long j5;
        Notification.Builder builder;
        btar btar;
        boolean z;
        Intent intent;
        int i;
        btap c2;
        Bitmap a;
        int b2;
        agrq agrq = this.f66319a;
        bwbv bwbv = this.f66320b;
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = agrq.m54999a(bwbv, currentTimeMillis);
        long b3 = agrq.m55007b(bwbv, Math.min(a2 - currentTimeMillis, 0L));
        if (!agqg.m54861p().booleanValue()) {
            pair = Pair.create(boox.BLOCKED_BY_PHENOTYPE, bygd.GCM_MESSAGE_BLOCKED_BY_PHENOTYPE);
            j = currentTimeMillis;
            j3 = a2;
            j2 = b3;
        } else {
            bwbt c3 = agrq.m55008c(bwbv);
            bwbu bwbu = bwbu.MSG_PLAN_STATUS_UPDATE;
            bszx bszx = bszx.GCORE_MSG_TYPE_UNSPECIFIED;
            int ordinal = bwbu.m121732a(bwbv.f158779a).ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE";
            } else if (ordinal != 1) {
                str = ordinal != 2 ? null : "com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT";
            } else if (!agqg.m54862q().booleanValue()) {
                pair = Pair.create(boox.BLOCKED_BY_PHENOTYPE, bygd.GCM_MESSAGE_BLOCKED_BY_PHENOTYPE);
                j = currentTimeMillis;
                j3 = a2;
                j2 = b3;
            } else {
                str = "com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER";
            }
            if (cfnf.m140504e()) {
                bszx a3 = bszx.m116352a(bwbv.f158782d);
                if (a3 == null) {
                    a3 = bszx.UNRECOGNIZED;
                }
                int ordinal2 = a3.ordinal();
                if (ordinal2 == 0 || ordinal2 == 13) {
                    pair = Pair.create(boox.GCM_MESSAGE_ERROR_INVALID_CHANNEL, bygd.GCM_MESSAGE_ERROR_INVALID_CHANNEL);
                    j = currentTimeMillis;
                    j3 = a2;
                    j2 = b3;
                } else {
                    bnhe bnhe = agrq.f66321a;
                    bszx a4 = bszx.m116352a(bwbv.f158782d);
                    if (a4 == null) {
                        a4 = bszx.UNRECOGNIZED;
                    }
                    str = (String) bnhe.get(a4);
                    bszx a5 = bszx.m116352a(bwbv.f158782d);
                    if (a5 == null) {
                        a5 = bszx.UNRECOGNIZED;
                    }
                    if (agrq.m55005a(a5)) {
                        int i2 = Build.VERSION.SDK_INT;
                    }
                    pair = Pair.create(boox.BLOCKED_BY_PHENOTYPE, bygd.GCM_MESSAGE_BLOCKED_BY_PHENOTYPE);
                    j = currentTimeMillis;
                    j3 = a2;
                    j2 = b3;
                }
            }
            if (c3 == null) {
                j = currentTimeMillis;
                j4 = a2;
                j2 = b3;
            } else if (str == null) {
                j = currentTimeMillis;
                j4 = a2;
                j2 = b3;
            } else if (!cfnf.f184517a.mo6606a().mo81635b() || (!c3.f158760a.isEmpty() && !c3.f158761b.isEmpty())) {
                int b4 = bwcc.m121742b(c3.f158766g);
                if ((b4 != 0 && b4 == 3) || (cfmj.m140161j() && (b2 = bwcc.m121742b(c3.f158766g)) != 0 && b2 == 14)) {
                    if (!agqg.m54864s().booleanValue()) {
                        pair = Pair.create(boox.BLOCKED_BY_PHENOTYPE, bygd.GCM_MESSAGE_BLOCKED_BY_PHENOTYPE);
                        j = currentTimeMillis;
                        j3 = a2;
                        j2 = b3;
                    } else {
                        String i3 = agyq.m55288i(agrq.f66323b);
                        if (agpk.m54727d() || agpk.m54726a().f66242a.mo35854a(i3) != null) {
                            btas d = agpk.m54726a().mo35844d(i3);
                            if (d == null) {
                                d = btas.f148044c;
                            }
                            if (d.f148047b <= 0 || cfnf.f184517a.mo6606a().mo81621I()) {
                                bxwc bxwc = d.f148046a;
                                int size = bxwc.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size) {
                                        break;
                                    }
                                    btaq btaq = (btaq) bxwc.get(i4);
                                    int b5 = bwcc.m121742b(btaq.f148038a);
                                    if (b5 != 0 && b5 == 3 && btaq.f148040c > 0 && !cfnf.f184517a.mo6606a().mo81648o()) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                        pair = Pair.create(boox.BLOCKED_EXTRA_WELCOME_NOTIFICATION, bygd.GCM_MESSAGE_BLOCKED_EXTRA_WELCOME_NOTIFICATION);
                        j = currentTimeMillis;
                        j3 = a2;
                        j2 = b3;
                    }
                }
                if (!agrq.mo36031b()) {
                    pair = Pair.create(boox.BLOCKED_BY_GMSCORE, bygd.GCM_MESSAGE_BLOCKED_BY_GMSCORE);
                    j = currentTimeMillis;
                    j3 = a2;
                    j2 = b3;
                } else if (!agrq.mo36028a(str)) {
                    pair = Pair.create(boox.BLOCKED_BY_USER, bygd.GCM_MESSAGE_BLOCKED_BY_USER);
                    j = currentTimeMillis;
                    j3 = a2;
                    j2 = b3;
                } else {
                    long min = Math.min(b3, agrq.m55007b(bwbv, 0));
                    if (min - cflx.f184311a.mo6606a().mo81437o() > 0) {
                        PendingIntent a6 = agrq.mo36024a(agrq.mo36026a(bwbv, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity"));
                        Intent a7 = agrq.mo36025a(bwbv);
                        if (a7 != null) {
                            pendingIntent = agrq.mo36029b(a7);
                        } else {
                            pendingIntent = null;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        long j6 = min;
                        int color = agrq.f66323b.getColor(C0126R.color.material_google_blue_600);
                        int i6 = Build.VERSION.SDK_INT;
                        Notification.Builder builder2 = new Notification.Builder(agrq.f66323b, str);
                        int i7 = Build.VERSION.SDK_INT;
                        j2 = b3;
                        Notification.Builder builder3 = new Notification.Builder(agrq.f66323b, str);
                        int i8 = Build.VERSION.SDK_INT;
                        boolean booleanValue = agqg.m54863r().booleanValue();
                        int i9 = Build.VERSION.SDK_INT;
                        j = currentTimeMillis;
                        Notification.Builder builder4 = new Notification.Builder(agrq.f66323b, str);
                        boolean z2 = !cfnf.m140513n() || !c3.f158769j;
                        boolean z3 = booleanValue & z2;
                        builder3.setAutoCancel(z2).setContentIntent(a6).setDeleteIntent(pendingIntent);
                        builder2.setContentTitle(c3.f158760a).setContentText(c3.f158761b).setAutoCancel(z2).setContentIntent(a6).setDeleteIntent(pendingIntent);
                        if (cfnf.f184517a.mo6606a().mo81632T()) {
                            builder2.setStyle(new Notification.BigTextStyle().bigText(c3.f158761b));
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (z3) {
                            builder2.setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION");
                            builder3.setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION");
                            builder4.setAutoCancel(z2).setContentIntent(a6).setDeleteIntent(pendingIntent).setGroup("com.google.android.gms.mobiledataplan.NOTIFICATION").setGroupSummary(true);
                            int i11 = Build.VERSION.SDK_INT;
                            builder4.setGroupAlertBehavior(2);
                            builder = builder3;
                            j5 = j6;
                        } else {
                            builder = builder3;
                            j5 = j6;
                        }
                        int i12 = Build.VERSION.SDK_INT;
                        builder.setColor(color).setCategory("msg");
                        builder2.setColor(color).setCategory("msg");
                        if (z3) {
                            builder4.setColor(color).setCategory("msg");
                        }
                        int i13 = Build.VERSION.SDK_INT;
                        if (!agqg.m54863r().booleanValue() || c3.f158767h.isEmpty()) {
                            int a8 = agrq.mo36023a();
                            builder2.setSmallIcon(a8);
                            builder.setSmallIcon(a8);
                            if (z3) {
                                builder4.setSmallIcon(a8);
                            }
                        } else {
                            Bitmap a9 = agrq.m55002a(c3, 1);
                            if (a9 != null) {
                                Icon createWithBitmap = Icon.createWithBitmap(a9);
                                builder2.setSmallIcon(createWithBitmap);
                                builder.setSmallIcon(createWithBitmap);
                                if (z3) {
                                    builder4.setSmallIcon(createWithBitmap);
                                }
                            } else {
                                int a10 = agrq.mo36023a();
                                builder2.setSmallIcon(a10);
                                builder.setSmallIcon(a10);
                                if (z3) {
                                    builder4.setSmallIcon(a10);
                                }
                            }
                        }
                        if (agqg.m54863r().booleanValue() && !c3.f158768i.isEmpty() && (a = agrq.m55002a(c3, 2)) != null) {
                            if (cfnf.f184517a.mo6606a().mo81629Q()) {
                                int i14 = Build.VERSION.SDK_INT;
                            }
                            builder2.setLargeIcon(a);
                        }
                        int i15 = Build.VERSION.SDK_INT;
                        String string = c3.f158765f.isEmpty() ? agrq.f66323b.getString(C0126R.string.mobile_data_plan) : c3.f158765f;
                        Bundle bundle = new Bundle();
                        bundle.putString("android.substName", string);
                        builder2.addExtras(bundle);
                        builder.setExtras(bundle);
                        if (z3) {
                            builder4.setExtras(bundle);
                        }
                        if (cfnf.f184517a.mo6606a().mo81631S()) {
                            String str2 = c3.f158764e;
                            if (TextUtils.isEmpty(str2)) {
                                j3 = a2;
                                agps a11 = agpk.m54726a().f66242a.mo35852a(Long.valueOf(c3.f158762c));
                                str2 = (a11 == null || (c2 = a11.mo35889c()) == null) ? null : stm.m36300b(c2.f148031c);
                            } else {
                                j3 = a2;
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                builder2.setSubText(str2);
                            }
                        } else {
                            j3 = a2;
                        }
                        int i16 = Build.VERSION.SDK_INT;
                        builder2.setTimeoutAfter(j5);
                        builder.setTimeoutAfter(j5);
                        if (z3) {
                            builder4.setTimeoutAfter(j5);
                        }
                        if (cfnf.f184517a.mo6606a().mo81633U()) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long min2 = Math.min(agrq.m54999a(bwbv, currentTimeMillis2), currentTimeMillis2);
                            builder2.setWhen(min2);
                            builder.setWhen(min2);
                            int i17 = Build.VERSION.SDK_INT;
                            builder2.setShowWhen(true);
                            builder.setShowWhen(true);
                            if (z3) {
                                builder4.setWhen(min2);
                                int i18 = Build.VERSION.SDK_INT;
                                builder4.setShowWhen(true);
                            }
                        }
                        if (cfnf.m140508i()) {
                            int i19 = Build.VERSION.SDK_INT;
                            for (int i20 = 0; i20 < bwbv.f158784f.size(); i20++) {
                                bwca bwca = (bwca) bwbv.f158784f.get(i20);
                                int b6 = bwcb.m121740b(bwca.f158805a);
                                if (b6 == 0) {
                                    b6 = 1;
                                }
                                int i21 = b6 - 2;
                                if (i21 == 1) {
                                    if (cfnf.f184517a.mo6606a().mo81647n()) {
                                        intent = agrq.mo36025a(bwbv);
                                        if (intent != null) {
                                            z = true;
                                        }
                                    }
                                } else if (i21 == 2) {
                                    intent = agrq.mo36026a(bwbv, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                                    z = false;
                                } else if (i21 != 3) {
                                    ((bnsl) agrq.f66322d.mo68388c()).mo68409a("Received invalid notification action %d", bwca.f158805a);
                                } else {
                                    intent = agrq.mo36026a(bwbv, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity");
                                    z = false;
                                }
                                int b7 = bwcb.m121740b(bwca.f158805a);
                                if (b7 == 0) {
                                    b7 = 1;
                                }
                                if (b7 != 1) {
                                    i = bwcb.m121739a(b7);
                                } else {
                                    i = 0;
                                }
                                Intent putExtra = intent.putExtra("NOTIFICATION_ACTION", i).putExtra("NOTIFICATION_ACTION_INDEX", i20);
                                builder2.addAction(new Notification.Action.Builder(qkj.m32287a(agrq.f66323b, 0), bwca.f158806b, z ? agrq.mo36029b(putExtra) : agrq.mo36024a(putExtra)).build());
                            }
                        }
                        int i22 = Build.VERSION.SDK_INT;
                        builder2.setPublicVersion(builder.build());
                        int i23 = (int) bwbv.f158781c;
                        agrq.f66324c.mo25445a("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", i23, builder2.build());
                        if (z3) {
                            agrq.f66324c.mo25445a("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", 0, builder4.build());
                        }
                        if (cfnf.m140509j()) {
                            long j7 = (long) i23;
                            if (cfnf.m140509j()) {
                                bwbt c4 = agrq.m55008c(bwbv);
                                if (c4 != null) {
                                    String i24 = agyq.m55288i(agrq.f66323b);
                                    if (i24 != null) {
                                        int b8 = bwcc.m121742b(c4.f158766g);
                                        if (b8 == 0) {
                                            b8 = 1;
                                        }
                                        if (agpk.m54726a().mo35844d(i24) == null) {
                                            btar = (btar) btas.f148044c.mo74144da();
                                        } else {
                                            btas d2 = agpk.m54726a().mo35844d(i24);
                                            bxvd bxvd2 = (bxvd) d2.mo74142c(5);
                                            bxvd2.mo73625a((bxvk) d2);
                                            btar = (btar) bxvd2;
                                        }
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 >= ((btas) btar.f164949b).f148046a.size()) {
                                                i25 = -1;
                                                break;
                                            }
                                            int b9 = bwcc.m121742b(btar.mo70732a(i25).f148038a);
                                            if (b9 == 0) {
                                                b9 = 1;
                                            }
                                            if (b9 == b8) {
                                                break;
                                            }
                                            i25++;
                                        }
                                        if (i25 != -1) {
                                            btaq a12 = btar.mo70732a(i25);
                                            bxvd bxvd3 = (bxvd) a12.mo74142c(5);
                                            bxvd3.mo73625a((bxvk) a12);
                                            btaq a13 = agrq.m55003a(bxvd3, j7);
                                            if (btar.f164950c) {
                                                btar.mo74035c();
                                                btar.f164950c = false;
                                            }
                                            btas btas = (btas) btar.f164949b;
                                            btas btas2 = btas.f148044c;
                                            a13.getClass();
                                            btas.mo70733a();
                                            btas.f148046a.set(i25, a13);
                                        } else {
                                            btaq btaq2 = btaq.f148036g;
                                            bxvd bxvd4 = (bxvd) btaq2.mo74142c(5);
                                            bxvd4.mo73625a((bxvk) btaq2);
                                            if (bxvd4.f164950c) {
                                                bxvd4.mo74035c();
                                                bxvd4.f164950c = false;
                                            }
                                            ((btaq) bxvd4.f164949b).f148038a = bwcc.m121741a(b8);
                                            btaq a14 = agrq.m55003a(bxvd4, j7);
                                            if (btar.f164950c) {
                                                btar.mo74035c();
                                                btar.f164950c = false;
                                            }
                                            btas btas3 = (btas) btar.f164949b;
                                            btas btas4 = btas.f148044c;
                                            a14.getClass();
                                            btas3.mo70733a();
                                            btas3.f148046a.add(a14);
                                        }
                                        agpk.m54726a().mo35833a(i24, (btas) btar.mo74062i());
                                    }
                                }
                            }
                        }
                        pair = Pair.create(boox.POP_UP, bygd.POP_UP);
                    } else {
                        j = currentTimeMillis;
                        j3 = a2;
                        j2 = b3;
                        ((bnsl) agrq.f66322d.mo68388c()).mo68415a("Notification expired before it reached the device with timeout %d", min);
                        pair = Pair.create(boox.BLOCKED_BY_TIMEOUT, bygd.GCM_MESSAGE_BLOCKED_BY_TIMEOUT);
                    }
                }
            } else {
                j = currentTimeMillis;
                j4 = a2;
                j2 = b3;
            }
            ((bnsl) agrq.f66322d.mo68388c()).mo68405a("Gcm message doesn't set notification data.");
            pair = Pair.create(boox.GCM_MESSAGE_NO_INFO, bygd.GCM_MESSAGE_NO_INFO);
        }
        agrl.m54942a().mo35999a(bwbv, (boox) pair.first, "MDP_Notification", (bygd) pair.second, j - j3, j2);
        if (cfmj.m140158g() && bygd.POP_UP == pair.second && (c = agrq.m55008c(bwbv)) != null && (b = bwcc.m121742b(c.f158766g)) != 0 && b == 14) {
            agpk a15 = agpk.m54726a();
            long currentTimeMillis3 = System.currentTimeMillis();
            agpl agpl = a15.f66242a;
            agpu b10 = agpl.mo35860b(1L);
            if (b10 == null) {
                agrl.m54942a().mo36003a(bygd.CACHING_ERROR_NON_EXISTING_DEVICE_TABLE_ON_WELCOME_NOTIFICATION, 19, "Local_Cache", "MDP_Notification");
                agpt agpt = new agpt();
                agpt.mo35895a((Long) 1L);
                b10 = agpt.mo35893a();
            }
            if (b10.mo35898d() != null) {
                bxzy d3 = b10.mo35898d();
                bxvd = (bxvd) d3.mo74142c(5);
                bxvd.mo73625a((bxvk) d3);
            } else {
                bxvd = bxzy.f165208b.mo74144da();
            }
            bxyk a16 = bxzt.m124580a(currentTimeMillis3);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxzy bxzy = bxzy.f165208b;
            a16.getClass();
            ((bxzy) bxvd.f164949b).f165210a = a16;
            agpt e = b10.mo35899e();
            bxzy bxzy2 = (bxzy) bxvd.mo74062i();
            if (bxzy2 != null) {
                bArr = bxzy2.mo73642k();
            } else {
                bArr = null;
            }
            e.f66254a.put("device_info", bArr);
            boolean a17 = agpl.mo35856a(e.mo35893a());
            agrl a18 = agrl.m54942a();
            bxvd da = booc.f133888c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booc) da.f164949b).f133890a = boob.m111380a(13);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booc) da.f164949b).f133891b = a17;
            a18.mo35992a((booc) da.mo74062i(), "MDP_Notification", (Integer) 0);
            boolean a19 = agpk.m54726a().mo35828a(bygb.PENDING, "MDP_Notification");
            agrl a20 = agrl.m54942a();
            bxvd da2 = booc.f133888c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((booc) da2.f164949b).f133890a = boob.m111380a(14);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((booc) da2.f164949b).f133891b = a19;
            a20.mo35992a((booc) da2.mo74062i(), "MDP_Notification", (Integer) 0);
        }
    }
}
