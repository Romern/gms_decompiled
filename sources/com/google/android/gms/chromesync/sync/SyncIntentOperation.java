package com.google.android.gms.chromesync.sync;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f30022a = qqu.m32672c("SyncIntentOperation");

    /* renamed from: b */
    private static final Uri f30023b = Uri.parse("content://com.google.android.gms.chromesync.sync.ChimeraSyncReceiverService");

    /* renamed from: c */
    private acyn f30024c;

    /* renamed from: d */
    private qwa f30025d;

    /* renamed from: e */
    private qta f30026e;

    /* renamed from: a */
    public static PendingIntent m22434a(qwc qwc) {
        qwb qwb = new qwb(qwc);
        qwb.f42297b = 600;
        qwc a = qwb.mo24305a();
        Intent startIntent = IntentOperation.getStartIntent(rpr.m34216b(), SyncIntentOperation.class, "com.google.android.gms.chromesync.SCHEDULED_SYNC");
        startIntent.setData(f30023b.buildUpon().appendPath(qwc.f42300a.f61090d).build());
        startIntent.putExtra("syncRequest", a.mo24306a());
        return PendingIntent.getService(rpr.m34216b(), 0, startIntent, 134217728);
    }

    public final void onCreate() {
        this.f30024c = new acyn(this);
        this.f30025d = (qwa) qwa.f42284a.mo13145b();
        this.f30026e = (qta) qta.f42084i.mo13145b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.chromesync.sync.SyncIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04e0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04e0 A[ExcHandler: NameNotFoundException | qrp (e java.lang.Throwable), Splitter:B:1:0x000f] */
    public final void onHandleIntent(Intent intent) {
        bmxv a;
        bmxv bmxv;
        Object obj;
        SQLiteDatabase a2;
        f30022a.mo25414c("Handling the intent: %s.", intent);
        try {
            String action = intent.getAction();
            if (cdcx.m132659b()) {
                try {
                    if (spn.m35876d(this, "com.google.android.gms.pay.notifications.GcmBroadcastReceiver") != 1) {
                        spn.m35856a((Context) this, "com.google.android.gms.pay.notifications.GcmBroadcastReceiver", true);
                        f30022a.mo25414c("Setting component enabled: com.google.android.gms.pay.notifications.GcmBroadcastReceiver", new Object[0]);
                    }
                } catch (IllegalArgumentException e) {
                    sek sek = f30022a;
                    StringBuilder sb = new StringBuilder((int) ErrorInfo.TYPE_SDU_FAILED);
                    sb.append("Component ");
                    sb.append("com.google.android.gms.pay.notifications.GcmBroadcastReceiver");
                    sb.append(" is not included in the container");
                    sek.mo25412b(sb.toString(), new Object[0]);
                }
            }
            if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                for (acyr acyr : this.f30024c.mo33243a()) {
                    qwa qwa = this.f30025d;
                    qwb qwb = new qwb();
                    qwb.f42296a = acyr;
                    qwb.f42297b = 101;
                    qwa.mo24303a(qwb.mo24305a());
                }
                return;
            } else if (IntentOperation.ACTION_NEW_MODULE.equals(action) || "com.google.android.gms.chimera.container.CONTAINER_UPDATED".equals(action)) {
                for (acyr acyr2 : this.f30024c.mo33243a()) {
                    qwa qwa2 = this.f30025d;
                    qwb qwb2 = new qwb();
                    qwb2.f42296a = acyr2;
                    qwb2.f42297b = 100;
                    qwa2.mo24303a(qwb2.mo24305a());
                }
                ((qvi) qvi.f42229b.mo13145b()).mo24284a();
                return;
            } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action)) {
                for (acyr acyr3 : this.f30024c.mo33243a()) {
                    qwa qwa3 = this.f30025d;
                    qwb qwb3 = new qwb();
                    qwb3.f42296a = acyr3;
                    qwb3.f42297b = 700;
                    qwa3.mo24303a(qwb3.mo24305a());
                }
                ((qvi) qvi.f42229b.mo13145b()).mo24284a();
                return;
            } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                Uri data = intent.getData();
                if (data == null) {
                    f30022a.mo25412b("Empty package URI in the intent: %s.", intent);
                    return;
                }
                bmxv a3 = qqt.m32666a(this, data.getSchemeSpecificPart());
                if (a3.mo66813a()) {
                    qvi qvi = (qvi) qvi.f42229b.mo13145b();
                    String str = (String) a3.mo66814b();
                    synchronized (qvi.f42233f) {
                        qvi.mo24284a();
                        a = qvi.f42230c.mo24260a(str);
                    }
                    if (a.mo66813a()) {
                        synchronized (qvi.f42233f) {
                            qvi.mo24284a();
                            bnic b = qvi.f42231d.mo24265b(bngx.m109356a(str));
                            if (b.size() > 1) {
                                sek sek2 = qvi.f42228a;
                                String valueOf = String.valueOf(str);
                                sek2.mo25416d(valueOf.length() == 0 ? new String("There are multiple facets found for given facetID: ") : "There are multiple facets found for given facetID: ".concat(valueOf), new Object[0]);
                                bmxv = bmvz.f131120a;
                            } else {
                                Iterator it = b.iterator();
                                if (it.hasNext()) {
                                    obj = bnjr.m109620c(it);
                                } else {
                                    obj = null;
                                }
                                bmxv = bmxv.m108567c((byty) obj);
                            }
                        }
                        if (bmxv.mo66813a()) {
                            return;
                        }
                    }
                    qvi.f42228a.mo25414c("One of affiliation or grouping data for %s was not found. Marking affiliation data as stale...", str);
                    qvi.mo24285b();
                    qvi.mo24284a();
                    return;
                }
                f30022a.mo25412b("Unable to get the application URL for package: %s.", data.getSchemeSpecificPart());
                return;
            } else if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action)) {
                if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
                    qta qta = (qta) qta.f42084i.mo13145b();
                    SQLiteDatabase a4 = qta.f42087k.mo24263a();
                    HashSet hashSet = new HashSet();
                    Cursor query = a4.query("account_data", new String[]{"account"}, null, null, "account", null, null, null);
                    query.moveToFirst();
                    while (!query.isAfterLast()) {
                        hashSet.add(imu.m15739c(query, "account"));
                        query.moveToNext();
                    }
                    for (acyr acyr4 : qta.f42086j.mo33243a()) {
                        hashSet.remove(acyr4.f61090d);
                    }
                    synchronized (qta.f42088l) {
                        a4.beginTransaction();
                        try {
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                qta.f42087k.mo24263a().delete("account_data", "account=?", new String[]{(String) it2.next()});
                            }
                            a4.setTransactionSuccessful();
                        } finally {
                            a4.endTransaction();
                            qta.f42089m.clear();
                        }
                    }
                    qtv qtv = (qtv) qtv.f42127e.mo13145b();
                    a2 = qtv.f42130g.mo24263a();
                    a2.beginTransaction();
                    HashSet hashSet2 = new HashSet();
                    Cursor query2 = a2.query("sync_entities", new String[]{"account"}, null, null, "account", null, null, null);
                    query2.moveToFirst();
                    while (!query2.isAfterLast()) {
                        hashSet2.add(imu.m15739c(query2, "account"));
                        query2.moveToNext();
                    }
                    for (acyr acyr5 : qtv.f42129f.mo33243a()) {
                        hashSet2.remove(acyr5.f61090d);
                    }
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        qtv.f42130g.mo24263a().delete("sync_entities", qtv.f42123a, new String[]{(String) it3.next()});
                    }
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                }
                if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED")) {
                    for (Parcelable parcelable : intent.getParcelableArrayExtra("accountsMutated")) {
                        acyr a5 = acyr.m50017a(this, (Account) parcelable);
                        qwa qwa4 = this.f30025d;
                        qwb qwb4 = new qwb();
                        qwb4.f42296a = a5;
                        qwb4.f42297b = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
                        qwa4.mo24303a(qwb4.mo24305a());
                    }
                    return;
                }
                return;
            } else if ("com.google.android.gms.chromesync.SCHEDULED_SYNC".equals(action)) {
                bmxv a6 = qwc.m32987a(this, intent.getBundleExtra("syncRequest"));
                if (a6.mo66813a()) {
                    this.f30025d.mo24303a((qwc) a6.mo66814b());
                    return;
                }
                return;
            } else if (!"com.google.android.gms.chromesync.DATA_INVALIDATION_RECEIVED".equals(action)) {
                if (!"com.google.android.gms.phenotype.COMMITTED".equals(action) || !"com.google.android.gms.chromesync".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                    if (!"com.google.android.gms.phenotype.com.google.android.gms.chromesync.COMMITTED".equals(action)) {
                        if (!"com.google.firebase.INSTANCE_ID_EVENT".equals(action)) {
                            return;
                        }
                        if (!cdcx.m132659b() || !cdcx.f180510a.mo6606a().mo77276c()) {
                            f30022a.mo25412b("InstanceID rotation not necessary.", new Object[0]);
                            return;
                        }
                        for (acyr acyr6 : this.f30024c.mo33243a()) {
                            bnrd a7 = qwa.f42285b.keySet().iterator();
                            while (a7.hasNext()) {
                                this.f30026e.mo24255a(acyr6, qta.m32826a((String) a7.next()));
                            }
                            qwb qwb5 = new qwb();
                            qwb5.f42296a = acyr6;
                            qwb5.f42297b = 900;
                            this.f30025d.mo24303a(qwb5.mo24305a());
                        }
                        return;
                    }
                }
                if (cdcx.f180510a.mo6606a().mo77277d()) {
                    for (acyr acyr7 : this.f30024c.mo33243a()) {
                        qwa qwa5 = this.f30025d;
                        qwb qwb6 = new qwb();
                        qwb6.f42296a = acyr7;
                        qwb6.f42297b = 800;
                        qwa5.mo24303a(qwb6.mo24305a());
                    }
                    return;
                }
                return;
            } else {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("external_name");
                    String string2 = extras.getString("from");
                    String string3 = extras.getString("version");
                    if (string != null) {
                        if (!(string2 == null || string3 == null)) {
                            for (acyr acyr8 : this.f30024c.mo33243a()) {
                                String valueOf2 = String.valueOf((String) this.f30026e.mo24253a(acyr8, qta.m32826a(string)));
                                if (string2.equals(valueOf2.length() == 0 ? new String("/topics") : "/topics".concat(valueOf2)) && qwa.f42285b.containsKey(string)) {
                                    qwb qwb7 = new qwb();
                                    qwb7.f42296a = acyr8;
                                    qwb7.f42297b = ((Integer) qwa.f42285b.get(string)).intValue();
                                    qwb7.f42299d = string3;
                                    this.f30025d.mo24303a(qwb7.mo24305a());
                                }
                            }
                            return;
                        }
                    }
                    f30022a.mo25412b("Intent did not have required extras.", new Object[0]);
                    return;
                }
                f30022a.mo25412b("Received intent with no extras.", new Object[0]);
                return;
            }
        } catch (gid e2) {
            throw new qrp(qrq.m32742a(e2), "Error when wiping out the obsolete data.", e2);
        } catch (PackageManager.NameNotFoundException | qrp e3) {
        } catch (gid e4) {
            throw new qrp(qrq.m32742a(e4), "Error when wiping out the obsolete data.", e4);
        } catch (gid e5) {
            e = e5;
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
        f30022a.mo25418e("Error handling the intent: %s.", intent, e);
    }

    /* renamed from: a */
    public static Intent m22435a(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, SyncIntentOperation.class, "com.google.android.gms.chromesync.DATA_INVALIDATION_RECEIVED");
        if (startIntent != null) {
            startIntent.putExtras(intent);
            return startIntent;
        }
        throw new qrp(1025);
    }
}
