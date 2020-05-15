package p000;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: avcq */
public final /* synthetic */ class avcq implements Runnable {

    /* renamed from: a */
    private final GcmChimeraBroadcastReceiver f92972a;

    /* renamed from: b */
    private final Context f92973b;

    /* renamed from: c */
    private final Intent f92974c;

    /* renamed from: d */
    private final BroadcastReceiver.PendingResult f92975d;

    public avcq(GcmChimeraBroadcastReceiver gcmChimeraBroadcastReceiver, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f92972a = gcmChimeraBroadcastReceiver;
        this.f92973b = context;
        this.f92974c = intent;
        this.f92975d = pendingResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03fe  */
    public final void run() {
        bxoc bxoc;
        HashMap hashMap;
        int i;
        bxwc bxwc;
        HashMap hashMap2;
        GcmChimeraBroadcastReceiver gcmChimeraBroadcastReceiver = this.f92972a;
        Context context = this.f92973b;
        Intent intent = this.f92974c;
        BroadcastReceiver.PendingResult pendingResult = this.f92975d;
        Context applicationContext = context.getApplicationContext();
        aveu aveu = (aveu) gcmChimeraBroadcastReceiver.f109365e.apply(applicationContext);
        long longValue = ((Long) aveu.f93039c.mo6606a()).longValue();
        if (aveu.f93040d.mo35048a(longValue)) {
            qws qws = (qws) aveu.f93038b.mo6606a();
            bxvd da = bxpw.f164324h.mo74144da();
            int i2 = (int) longValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw = (bxpw) da.f164949b;
            bxpw.f164326a |= 64;
            bxpw.f164329d = i2;
            bxot bxot = bxot.f164207c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw2 = (bxpw) da.f164949b;
            bxot.getClass();
            bxpw2.f164328c = bxot;
            bxpw2.f164327b = 3;
            bxvd da2 = bxpp.f164297d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxpp bxpp = (bxpp) da2.f164949b;
            "com.google.android.gms#udc-facs".getClass();
            bxpp.f164299a |= 1;
            bxpp.f164300b = "com.google.android.gms#udc-facs";
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw3 = (bxpw) da.f164949b;
            bxpp bxpp2 = (bxpp) da2.mo74062i();
            bxpp2.getClass();
            bxpw3.f164330e = bxpp2;
            bxpw3.f164326a |= 128;
            qwo a = qws.mo24333a(da.mo74062i());
            a.mo24328b(1002);
            a.mo24327b();
        }
        long b = gcmChimeraBroadcastReceiver.f109367g.mo54418b();
        if (chbh.m148019q()) {
            try {
                bxoc = (bxoc) GeneratedMessageLite.m124014a(bxoc.f164133b, Base64.decode(intent.getStringExtra("fsc_v1"), 0));
            } catch (bxwf e) {
                aveu aveu2 = (aveu) gcmChimeraBroadcastReceiver.f109365e.apply(applicationContext);
                bxvd da3 = bxpr.f164303d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxpr bxpr = (bxpr) da3.f164949b;
                bxpr.f164306b = 2;
                bxpr.f164305a |= 1;
                aveu2.mo51186a((bxpr) da3.mo74062i());
                bxoc = null;
            }
            if (bxoc == null) {
                bnsi c = GcmChimeraBroadcastReceiver.f109362b.mo68388c();
                c.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "b", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Corrupted push notification payload, pinging all accounts...");
                ((bboa) gcmChimeraBroadcastReceiver.f109363c.apply(applicationContext)).mo56267c().mo56224a(auzv.PUSH_MESSAGE);
            } else {
                List<Account> d = soz.m35801d(applicationContext, "com.google.android.gms");
                HashMap hashMap3 = new HashMap();
                aviw aviw = (aviw) gcmChimeraBroadcastReceiver.f109364d.apply(applicationContext);
                for (Account account : d) {
                    HashMap hashMap4 = hashMap3;
                    try {
                        hashMap2 = hashMap4;
                        try {
                            hashMap2.put(aviw.mo51285a(account), account);
                            hashMap3 = hashMap2;
                        } catch (gid | IOException e2) {
                            e = e2;
                            if (!chbh.f188248a.mo6606a().mo84950j()) {
                            }
                        }
                    } catch (gid | IOException e3) {
                        e = e3;
                        hashMap2 = hashMap4;
                        if (!chbh.f188248a.mo6606a().mo84950j()) {
                            bnsi c2 = avex.m78395a().mo68388c();
                            c2.mo68402a((int) chbh.m148013k());
                            c2.mo68437a(e);
                            c2.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c2.mo68405a("Failed to retrieve obfuscated Gaia id!");
                            hashMap3 = hashMap2;
                        } else {
                            hashMap3 = hashMap2;
                        }
                    }
                }
                bxwc bxwc2 = bxoc.f164135a;
                int size = bxwc2.size();
                int i3 = 0;
                while (i3 < size) {
                    String str = ((bxob) bxwc2.get(i3)).f164131a;
                    if (hashMap3.containsKey(str)) {
                        bxwc = bxwc2;
                        ((bboa) gcmChimeraBroadcastReceiver.f109363c.apply(applicationContext)).mo56266a((Account) hashMap3.get(str)).mo56224a(auzv.PUSH_MESSAGE);
                        aveu aveu3 = (aveu) gcmChimeraBroadcastReceiver.f109365e.apply(applicationContext);
                        bxvd da4 = bxpr.f164303d.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bxpr bxpr2 = (bxpr) da4.f164949b;
                        i = size;
                        bxpr2.f164306b = 1;
                        hashMap = hashMap3;
                        bxpr2.f164305a |= 1;
                        int size2 = bxoc.f164135a.size();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bxpr bxpr3 = (bxpr) da4.f164949b;
                        bxpr3.f164305a |= 2;
                        bxpr3.f164307c = size2;
                        aveu3.mo51186a((bxpr) da4.mo74062i());
                    } else {
                        bxwc = bxwc2;
                        hashMap = hashMap3;
                        i = size;
                        aveu aveu4 = (aveu) gcmChimeraBroadcastReceiver.f109365e.apply(applicationContext);
                        bxvd da5 = bxpr.f164303d.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bxpr bxpr4 = (bxpr) da5.f164949b;
                        bxpr4.f164306b = 3;
                        bxpr4.f164305a |= 1;
                        int size3 = bxoc.f164135a.size();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bxpr bxpr5 = (bxpr) da5.f164949b;
                        bxpr5.f164305a |= 2;
                        bxpr5.f164307c = size3;
                        aveu4.mo51186a((bxpr) da5.mo74062i());
                    }
                    i3++;
                    bxwc2 = bxwc;
                    size = i;
                    hashMap3 = hashMap;
                }
            }
        }
        try {
            bnsi d2 = GcmChimeraBroadcastReceiver.f109362b.mo68390d();
            d2.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Scheduling sync in reaction to push notification...");
            if (!((Boolean) ((bbjm) gcmChimeraBroadcastReceiver.f109366f.apply(applicationContext)).mo34087e(aval.SYNC_ID_CUSTOM_CACHE).get()).booleanValue()) {
                bnsi d3 = GcmChimeraBroadcastReceiver.f109362b.mo68390d();
                d3.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d3.mo68405a("Sync is disabled!");
            } else {
                bnsi d4 = GcmChimeraBroadcastReceiver.f109362b.mo68390d();
                d4.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d4.mo68405a("Sync scheduled successfully.");
            }
            long b2 = gcmChimeraBroadcastReceiver.f109367g.mo54418b();
            aveu aveu5 = (aveu) gcmChimeraBroadcastReceiver.f109365e.apply(applicationContext);
            long j = b2 - b;
            long longValue2 = ((Long) aveu5.f93039c.mo6606a()).longValue();
            if (aveu5.f93040d.mo35048a(longValue2)) {
                qws qws2 = (qws) aveu5.f93038b.mo6606a();
                bxvd da6 = bxpw.f164324h.mo74144da();
                int i4 = (int) longValue2;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bxpw bxpw4 = (bxpw) da6.f164949b;
                bxpw4.f164326a |= 64;
                bxpw4.f164329d = i4;
                bxvd da7 = bxot.f164207c.mo74144da();
                bxvd da8 = bxor.f164201c.mo74144da();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bxor bxor = (bxor) da8.f164949b;
                bxor.f164203a |= 1;
                bxor.f164204b = j;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bxot bxot2 = (bxot) da7.f164949b;
                bxor bxor2 = (bxor) da8.mo74062i();
                bxor2.getClass();
                bxot2.f164210b = bxor2;
                bxot2.f164209a = 1;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bxpw bxpw5 = (bxpw) da6.f164949b;
                bxot bxot3 = (bxot) da7.mo74062i();
                bxot3.getClass();
                bxpw5.f164328c = bxot3;
                bxpw5.f164327b = 3;
                bxvd da9 = bxpp.f164297d.mo74144da();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bxpp bxpp3 = (bxpp) da9.f164949b;
                "com.google.android.gms#udc-facs".getClass();
                bxpp3.f164299a |= 1;
                bxpp3.f164300b = "com.google.android.gms#udc-facs";
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bxpw bxpw6 = (bxpw) da6.f164949b;
                bxpp bxpp4 = (bxpp) da9.mo74062i();
                bxpp4.getClass();
                bxpw6.f164330e = bxpp4;
                bxpw6.f164326a |= 128;
                qwo a2 = qws2.mo24333a(da6.mo74062i());
                a2.mo24328b(1003);
                a2.mo24327b();
            }
            pendingResult.finish();
            bnsi d5 = GcmChimeraBroadcastReceiver.f109362b.mo68390d();
            d5.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d5.mo68405a("GCM push notification handled successfully.");
        } catch (InterruptedException | ExecutionException e4) {
            bnsi c3 = GcmChimeraBroadcastReceiver.f109362b.mo68388c();
            c3.mo68432a("com.google.android.gms.udc.gcm.GcmChimeraBroadcastReceiver", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68405a("Failed to handle GCM push notification!");
            throw new RuntimeException(e4);
        }
    }
}
