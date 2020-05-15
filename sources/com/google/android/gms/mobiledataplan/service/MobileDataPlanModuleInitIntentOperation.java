package com.google.android.gms.mobiledataplan.service;

import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MobileDataPlanModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    public static final srn f80317a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private static final Collection f80318b = Arrays.asList("com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailActivity", "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity", "com.google.android.gms.mobiledataplan.gcm.GcmBroadcastReceiver", "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.mobiledataplan.service.MobileDataPlanModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        booa booa;
        boolean z;
        btas d;
        ArrayList arrayList = new ArrayList(f80318b);
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            try {
                spn.m35856a((Context) this, str, true);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f80317a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68420a("Failed to enable %s", str);
            }
        }
        f80317a.mo26019b(agyt.m55307c()).mo68429a("%s: PeriodicService:%b Update:%b CpidManagement:%b BgManager:%b GcoreRegister:%b ConsentFetch:%b", "ModuleInit", Boolean.valueOf(cfmv.m140313l()), Boolean.valueOf(cfmv.m140317p()), Boolean.valueOf(cfmv.m140310i()), Boolean.valueOf(cflr.m139933j()), Boolean.valueOf(cflx.m140019f()), Boolean.valueOf(cfmd.m140084d()));
        if (cfmv.m140310i() && cfnf.m140509j()) {
            f80317a.mo26019b(agyt.m55307c()).mo68420a("%s: Resetting recent message count.", "ModuleInit");
            for (String str2 : agpk.m54726a().mo35840b()) {
                if (!TextUtils.isEmpty(str2) && (d = agpk.m54726a().mo35844d(str2)) != null) {
                    bxvd bxvd = (bxvd) d.mo74142c(5);
                    bxvd.mo73625a((bxvk) d);
                    btar btar = (btar) bxvd;
                    for (int i3 = 0; i3 < ((btas) btar.f164949b).f148046a.size(); i3++) {
                        btaq a = btar.mo70732a(i3);
                        if (a != null) {
                            bxvd bxvd2 = (bxvd) a.mo74142c(5);
                            bxvd2.mo73625a((bxvk) a);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = false;
                            }
                            ((btaq) bxvd2.f164949b).f148039b = 0;
                            if (btar.f164950c) {
                                btar.mo74035c();
                                btar.f164950c = false;
                            }
                            btas btas = (btas) btar.f164949b;
                            btaq btaq = (btaq) bxvd2.mo74062i();
                            btaq.getClass();
                            btas.mo70733a();
                            btas.f148046a.set(i3, btaq);
                        }
                    }
                    boolean a2 = agpk.m54726a().mo35833a(str2, (btas) btar.mo74062i());
                    if (cfmq.m140237h()) {
                        agrl a3 = agrl.m54942a();
                        bxvd da = booc.f133888c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133890a = boob.m111380a(5);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133891b = a2;
                        a3.mo35992a((booc) da.mo74062i(), "MDP_PeriodicService", (Integer) 0);
                    }
                }
            }
        }
        agrq agrq = new agrq();
        int i4 = Build.VERSION.SDK_INT;
        agrq.f66324c.mo25443a(new NotificationChannelGroup("com.google.android.gms.mobiledataplan.NOTIFICATION", agrq.f66323b.getString(C0126R.string.notification_group_name)));
        agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_ALERT", agrq.f66323b.getString(C0126R.string.notification_account_alert_channel)));
        agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.LOW_BALANCE", agrq.f66323b.getString(C0126R.string.notification_data_balance_channel)));
        agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.UPSELL_OFFER", agrq.f66323b.getString(C0126R.string.notification_upsell_channel)));
        if (cfnf.m140504e()) {
            if (cfnf.m140511l()) {
                agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.OUT_OF_DATA", agrq.f66323b.getString(C0126R.string.notification_out_of_data_channel)));
            }
            if (cfnf.m140507h()) {
                agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.EXPIRATION_REMINDER", agrq.f66323b.getString(C0126R.string.notification_expiration_channel)));
            }
            if (cfnf.m140505f()) {
                agrq.f66324c.mo25442a(agrq.m55001a("com.google.android.gms.mobiledataplan.NOTIFICATION.ACCOUNT_BALANCE_UPDATE", agrq.f66323b.getString(C0126R.string.notification_account_balance_channel), 4));
            }
            if (cfnf.m140514o()) {
                agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.PURCHASE", agrq.f66323b.getString(C0126R.string.notification_purchase_channel)));
            }
            if (cfnf.m140503d()) {
                agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.NETWORK_SETUP", agrq.f66323b.getString(C0126R.string.notification_network_setup_channel)));
            }
            if (cfnf.m140506g()) {
                agrq.f66324c.mo25442a(agrq.m55001a("com.google.android.gms.mobiledataplan.NOTIFICATION.DAILY_UPDATE", agrq.f66323b.getString(C0126R.string.notification_daily_update_channel), 1));
            }
            if (cfnf.m140512m()) {
                agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.PAY_AS_YOU_GO", agrq.f66323b.getString(C0126R.string.notification_paygo_channel)));
            }
            if (cfnf.m140510k()) {
                agrq.f66324c.mo25442a(agrq.m55000a("com.google.android.gms.mobiledataplan.NOTIFICATION.OTHER", agrq.f66323b.getString(C0126R.string.notification_other_channel)));
            }
        }
        rpr b = rpr.m34216b();
        booa booa2 = booa.f133882e;
        if (cfmq.m140236g()) {
            bxvd bxvd3 = (bxvd) booa2.mo74142c(5);
            bxvd3.mo73625a((bxvk) booa2);
            if ((i & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            booa booa3 = (booa) bxvd3.f164949b;
            booa3.f133885b = z;
            booa3.f133886c = (i & 8) != 0;
            if ((i & 2) != 0) {
                z2 = true;
            }
            booa3.f133884a = z2;
            booa = (booa) bxvd3.mo74062i();
        } else {
            booa = booa2;
        }
        if (cflr.m139933j()) {
            agsl a4 = agsl.m55046a();
            a4.f66368f.execute(new agsf(a4));
            f80317a.mo26019b(agyt.m55307c()).mo68420a("%s: PeriodicBgWorkflow will be started.", "ModuleInit");
        }
        if (cfmv.m140310i() && !cflr.f184273a.mo6606a().mo81405s()) {
            ChimeraPeriodicUpdaterService.m67286a(b, cfmv.m140301D(), cfmv.m140299B(), boom.MODULE_INIT_EVENT, booa);
            f80317a.mo26019b(agyt.m55307c()).mo68420a("%s: PeriodicCpidFetch will be started.", "ModuleInit");
        }
        if (agrv.m55020a(b)) {
            ChimeraPeriodicUpdaterService.m67284a(b, agrl.m54949c());
        }
        if (cflx.m140019f() && !cflr.m139937n()) {
            ChimeraPeriodicUpdaterService.m67283a((Context) b);
            f80317a.mo26019b(agyt.m55307c()).mo68420a("%s: PeriodicGcoreRegistration will be started.", "ModuleInit");
        }
        if (cfmd.m140084d() && !cflr.f184273a.mo6606a().mo81404r() && !cfmj.m140161j()) {
            ChimeraPeriodicUpdaterService.m67290b(b);
            f80317a.mo26019b(agyt.m55307c()).mo68420a("%s: PeriodicConsentFetch will be started.", "ModuleInit");
        }
        int i5 = Build.VERSION.SDK_INT;
        if (cfmv.m140312k()) {
            new adzt(b.getMainLooper()).post(agsb.f66346a);
        }
        f80317a.mo26019b(agyt.m55307c()).mo68424a("%s: flag %s.", "ModuleInit", Integer.toBinaryString(i));
    }
}
