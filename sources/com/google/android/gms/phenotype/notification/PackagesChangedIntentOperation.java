package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackagesChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f82124a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private Context f82125b;

    /* renamed from: c */
    private anfg f82126c;

    /* renamed from: d */
    private beai f82127d;

    /* renamed from: e */
    private PackageManager f82128e;

    /* renamed from: f */
    private rfz f82129f;

    public PackagesChangedIntentOperation() {
    }

    public final void onCreate() {
        this.f82125b = this;
        this.f82126c = anfg.m64152a(rpr.m34216b());
        this.f82128e = getPackageManager();
        this.f82127d = new beai(this.f82128e);
        this.f82129f = rfz.m33557a(this);
    }

    public final void onDestroy() {
        this.f82126c.close();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final void onHandleIntent(Intent intent) {
        String str;
        Throwable th;
        int i;
        Cursor query;
        Throwable th2;
        if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) || "android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
                        try {
                            if (!intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                                SQLiteDatabase writableDatabase = this.f82126c.getWritableDatabase();
                                query = writableDatabase.query("Packages", new String[]{"packageName"}, "androidPackageName = ?", new String[]{str}, null, null, null);
                                query.getCount();
                                while (query.moveToNext()) {
                                    anih.m64471a(writableDatabase, query.getString(0));
                                }
                                if (query != null) {
                                    query.close();
                                    return;
                                }
                                return;
                            }
                        } catch (Exception e) {
                            e = e;
                        } catch (Throwable th3) {
                            bqye.m113761a(th2, th3);
                        }
                    }
                    if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction())) {
                        SQLiteDatabase writableDatabase2 = this.f82126c.getWritableDatabase();
                        Cursor query2 = writableDatabase2.query("Packages", new String[]{"packageName"}, "androidPackageName = ?", new String[]{str}, null, null, null);
                        try {
                            query2.getCount();
                            while (query2.moveToNext()) {
                                String string = query2.getString(0);
                                if (!ange.m64198a(cgec.f186635a.mo6606a().mo83520a(), string)) {
                                    String[] strArr = {string};
                                    writableDatabase2.beginTransaction();
                                    writableDatabase2.delete("ExperimentTokens", "packageName = ? AND isCommitted = 1", strArr);
                                    writableDatabase2.delete("Flags", "packageName = ? AND committed = 1", strArr);
                                    writableDatabase2.delete("FlagOverrides", "packageName = ? AND committed = 1", strArr);
                                    writableDatabase2.delete("CrossLoggedExperimentTokens", "fromPackageName = ? AND isCommitted = 1", strArr);
                                    writableDatabase2.delete("ApplicationStates", "packageName = ?", strArr);
                                    writableDatabase2.setTransactionSuccessful();
                                    writableDatabase2.endTransaction();
                                    anhj.m64401a();
                                }
                            }
                            if (query2 != null) {
                                query2.close();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            if (query2 != null) {
                                query2.close();
                            }
                            throw th;
                        }
                    } else if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                        if (!cgeg.m144877b()) {
                            i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC;
                        } else {
                            i = 196;
                        }
                        PackageInfo packageInfo = this.f82128e.getPackageInfo(str, i);
                        if (this.f82129f.mo24606a(packageInfo)) {
                            List a = this.f82127d.mo58477a(packageInfo);
                            if (!a.isEmpty()) {
                                new anhq(new ango(), (braj[]) a.toArray(new braj[0])).mo41826a(this.f82125b, this.f82126c);
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bnsl bnsl = (bnsl) f82124a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("com.google.android.gms.phenotype.notification.PackagesChangedIntentOperation", "onHandleIntent", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("Could not manipulate package: %s with intent: %s", str, intent.getAction());
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th2;
    }

    public PackagesChangedIntentOperation(Context context, anfg anfg, beai beai, PackageManager packageManager, rfz rfz) {
        this.f82125b = context;
        this.f82126c = anfg;
        this.f82127d = beai;
        this.f82128e = packageManager;
        this.f82129f = rfz;
    }
}
