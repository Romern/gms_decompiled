package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: mzr */
final /* synthetic */ class mzr implements Callable {

    /* renamed from: a */
    private final nab f35057a;

    public mzr(nab nab) {
        this.f35057a = nab;
    }

    public final Object call() {
        SQLiteDatabase a;
        File[] listFiles;
        nab nab = this.f35057a;
        int i = 0;
        nab.f35075a.logVerbose("*** initializing device ***", new Object[0]);
        luj luj = null;
        nab.f35117x.mo19826a(2, (String) null);
        nab.f35110q.sendBroadcast(new Intent("com.google.android.gms.backup.ACTION_TRANSPORT_INITIALIZE_DEVICE").setPackage("com.google.android.gms"));
        Account a2 = nab.f35115v.mo19624a();
        Context context = nab.f35110q;
        if (a2 != null && !TextUtils.isEmpty(a2.name)) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService").setAction("com.google.android.gms.backup.action.OPT_OUT");
            intent.putExtra("com.google.android.gms.backup.extra.optOut.accountName", a2.name);
            context.startService(intent);
        }
        if (nab.f35115v.mo19624a() == null) {
            nab.f35075a.logVerbose("No backup account for initializeDevice, returning OK", new Object[0]);
            nab.f35117x.mo19822a(4, 4);
        } else if (!nab.mo20370a(false)) {
            nab.f35117x.mo19823a(9, 4, nab.f35116w.f34946d);
            i = -1000;
        } else {
            lzw lzw = nab.f35096c;
            for (lzv lzv : lzw.f33308b.values()) {
                lzv.f33303a.clear();
                lzv.f33304b.clear();
                lzv.f33305c.clear();
            }
            lzw.f33309c = true;
            nab.f35119z.f35121b.edit().clear().commit();
            nab.f35118y.f34998c.edit().clear().apply();
            File a3 = ncz.m25947a(nab.f35110q);
            if (a3.exists() && (listFiles = a3.listFiles()) != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            nce nce = new nce(nab.f35110q, nab.f35109p, nab.f35115v.mo19624a());
            int i2 = Build.VERSION.SDK_INT;
            nce.f35237a.mo25412b("Clearing local crypto state.", new Object[0]);
            try {
                lwx lwx = lww.m24581a(nce.f35238b).f33131a;
                a = lwx.mo19716a();
                a.execSQL("DROP TABLE IF EXISTS tertiary_keys");
                lwx.onCreate(a);
                if (a != null) {
                    a.close();
                }
            } catch (lwy e) {
                nce.f35237a.mo25417e("Error clearing encryption database", e, new Object[0]);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            if (nce.mo20450a()) {
                SharedPreferences.Editor edit = nce.f35239c.f33100c.edit();
                bnrd a4 = lwc.f33099b.iterator();
                while (a4.hasNext()) {
                    edit.remove((String) a4.next());
                }
                edit.apply();
                lwc.f33098a.mo25412b("Cleared crypto settings for backup", new Object[0]);
                nce.f35239c.mo19696b(nce.f35240d);
            }
            try {
                nbd.m25878a(nce.f35238b).mo20432a();
            } catch (IOException e2) {
                nce.f35237a.mo25417e("Error clearing chunk listing store", e2, new Object[0]);
            }
            try {
                nbd.m25879b(nce.f35238b).mo20432a();
            } catch (IOException e3) {
                nce.f35237a.mo25417e("Error clearing key-value store", e3, new Object[0]);
            }
            nab.f35115v.f35035b.getSharedPreferences("BackupAccount", 0).edit().putBoolean("accountInitialized", true).apply();
            nad nad = nab.f35080E;
            rex rex = new rex();
            if (skh.m35531a().mo25690a(nad.f35123b, new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.backup.BackupStatsService").addCategory("android.intent.category.DEFAULT"), rex, 1)) {
                try {
                    IBinder a5 = rex.mo24567a();
                    if (a5 != null) {
                        IInterface queryLocalInterface = a5.queryLocalInterface("com.google.android.gms.backup.IBackupStatsService");
                        if (!(queryLocalInterface instanceof luj)) {
                            luj = new luh(a5);
                        } else {
                            luj = (luj) queryLocalInterface;
                        }
                    }
                    luj.mo19607a();
                    try {
                        skh.m35531a().mo25689a(nad.f35123b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e4) {
                        nad.f35122a.mo25415d("Exception when unbinding: ", e4, new Object[0]);
                    }
                } catch (Exception e5) {
                    nad.f35122a.mo25417e("Exception on clearing local backup stats", e5, new Object[0]);
                    try {
                        skh.m35531a().mo25689a(nad.f35123b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e6) {
                        nad.f35122a.mo25415d("Exception when unbinding: ", e6, new Object[0]);
                    }
                } catch (Throwable th2) {
                    try {
                        skh.m35531a().mo25689a(nad.f35123b, rex);
                    } catch (IllegalArgumentException | IllegalStateException e7) {
                        nad.f35122a.mo25415d("Exception when unbinding: ", e7, new Object[0]);
                    }
                    throw th2;
                }
            }
        }
        return Integer.valueOf(i);
        throw th;
    }
}
