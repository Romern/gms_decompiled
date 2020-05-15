package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: zys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zys extends qlg {
    public zys() {
        super(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zxq mo31606a() {
        zzi zzi = zzi.f56267a;
        Context applicationContext = getApplicationContext();
        sdo.checkIfNull(applicationContext, "context");
        return zzi.mo31625b(applicationContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final zyg mo31607b() {
        return zzi.f56267a.mo31621a(getApplicationContext());
    }

    /* renamed from: c */
    public abstract void mo19209c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo24073d(String str) {
        mo24071a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24071a(String str) {
        String str2;
        List<FontMatchSpec> list;
        try {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                Bundle bundle = getApplicationContext().getPackageManager().getApplicationInfo(str, 128).metaData;
                if (bundle == null) {
                    zyh.m46682b("FontsPackageChangeOp", "Package %s has no metadata", str);
                    str2 = null;
                } else {
                    str2 = bundle.getString("fontProviderRequests");
                }
            } catch (PackageManager.NameNotFoundException e) {
                Object[] objArr = {str};
                zyh zyh = zyh.f56175a;
                Log.e("FontsPackageChangeOp", zyh.mo31589a("Failed to load meta-data for %s", objArr), e);
                zyh.mo31590a("E", "FontsPackageChangeOp", zyh.mo31589a("Failed to load meta-data for %s", objArr), e);
                str2 = null;
            }
            if (str2 == null) {
                list = Collections.emptyList();
            } else {
                list = zyi.m46687a(str2);
            }
            if (!list.isEmpty()) {
                mo19209c();
                zyn a = zzi.f56267a.mo31622a();
                rzz.m34727a(a, "fontServer");
                zxq a2 = mo31606a();
                zyh.m46683c("FontsPackageChangeOp", "Setting manifest dependencies [%s] for package [%s] on Disk.", list, str);
                a2.mo31560a(str);
                ArrayList<FontMatchSpec> arrayList = new ArrayList();
                try {
                    sQLiteDatabase = a2.getWritableDatabase();
                    try {
                        for (FontMatchSpec fontMatchSpec : list) {
                            if (!a2.mo31561a(str, fontMatchSpec, sQLiteDatabase)) {
                                arrayList.add(fontMatchSpec);
                            }
                        }
                    } catch (SQLiteException e2) {
                    } catch (Throwable th) {
                        th = th;
                        a2.mo31562c(sQLiteDatabase);
                        throw th;
                    }
                } catch (SQLiteException e3) {
                } catch (Throwable th2) {
                    th = th2;
                    a2.mo31562c(sQLiteDatabase);
                    throw th;
                }
                a2.mo31562c(sQLiteDatabase);
                if (!arrayList.isEmpty()) {
                    zyh.m46683c("FontsPackageChangeOp", "%d font(s) need to be downloaded; requesting from GMS core.", Integer.valueOf(arrayList.size()));
                    for (FontMatchSpec fontMatchSpec2 : arrayList) {
                        new zyr(str, fontMatchSpec2, a2, a).run();
                    }
                }
            }
        } catch (Exception e4) {
            zyh.m46681a("FontsPackageChangeOp", e4, "Error executing onPackageAdded", new Object[0]);
            mo31607b().mo31587a(3, 23507, "com.google.android.gms.fonts.receiver");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17405a(String str, Intent intent) {
        try {
            zxq a = mo31606a();
            zyh.m46683c("FontsPackageChangeOp", "Remove all manifest dependencies for package [%s] on Disk.", str);
            a.mo31560a(str);
        } catch (Exception e) {
            zyh.m46681a("FontsPackageChangeOp", e, "Error executing onPackageRemoved", new Object[0]);
            mo31607b().mo31587a(3, 23508, "com.google.android.gms.fonts.receiver");
        }
    }
}
