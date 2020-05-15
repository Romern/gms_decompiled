package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.ModuleContext;

/* renamed from: qkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qkx extends dgb {

    /* renamed from: e */
    private rpg f41627e;

    /* renamed from: f */
    private aabl f41628f = null;

    protected qkx() {
        qlp.m32393a();
    }

    /* renamed from: a */
    private final blji m32316a(String str) {
        if (this.f41628f == null) {
            mo8921a();
        }
        if (cdoz.m134481c()) {
            return aabl.m21059a(this.f41628f, str, Binder.getCallingUid());
        }
        return aabl.m21058a(this.f41628f, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8925b() {
        if (!rpr.m34216b().getInSafeBoot()) {
            Context context = getContext();
            bmzs.m108696a(context);
            dgb.f13049d.mo9147a(context, this);
        }
    }

    /* renamed from: c */
    public final void mo9145c() {
        qmc.m32424a(true);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        int i;
        blji a = m32316a("delete");
        try {
            ContentProvider a2 = mo8921a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                i = 0;
            } else {
                i = a2.delete(uri, str, strArr);
            }
            if (a != null) {
                a.close();
            }
            return i;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Uri uri2;
        blji a = m32316a("insert");
        try {
            ContentProvider a2 = mo8921a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                uri2 = null;
            } else {
                uri2 = a2.insert(uri, contentValues);
            }
            if (a != null) {
                a.close();
            }
            return uri2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        ContentProvider contentProvider;
        rpg rpg = this.f41627e;
        if (rpg != null) {
            rpg.mo24981a(configuration);
        }
        synchronized (this) {
            contentProvider = this.f13050b;
        }
        if (contentProvider != null) {
            ModuleContext moduleContext = ModuleContext.getModuleContext(contentProvider.getContext());
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            contentProvider.onConfigurationChanged(configuration);
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor;
        blji a = m32316a("query");
        try {
            ContentProvider a2 = mo8921a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                if (strArr == null) {
                    strArr = dgb.f13048a;
                }
                cursor = new MatrixCursor(strArr);
            } else {
                cursor = a2.query(uri, strArr, str, strArr2, str2);
            }
            if (a != null) {
                a.close();
            }
            return cursor;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        blji a = m32316a("update");
        try {
            ContentProvider a2 = mo8921a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                i = 0;
            } else {
                i = a2.update(uri, contentValues, str, strArr);
            }
            if (a != null) {
                a.close();
            }
            return i;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final boolean mo9146c(Context context) {
        String string;
        try {
            String name = getClass().getName();
            ProviderInfo providerInfo = context.getPackageManager().getProviderInfo(new ComponentName(context, name), 128);
            if (!(providerInfo.metaData == null || (string = providerInfo.metaData.getString("chimera.requiresExtractedAsset")) == null)) {
                qlp a = qlp.m32393a();
                StringBuilder sb = new StringBuilder(string.length() + 1 + String.valueOf(name).length());
                sb.append(string);
                sb.append(" ");
                sb.append(name);
                a.mo8861a(context, 82, sb.toString());
                qmc.m32416a();
                qmc.m32420a(context, string);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        ContentProvider contentProvider = (ContentProvider) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            rpg rpg = new rpg(context);
            this.f41627e = rpg;
            context = rpg;
        }
        this.f41628f = new aabl(context, contentProvider.getClass(), 5);
        super.mo8922a(contentProvider, aabj.m21054a(context));
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        Cursor cursor;
        blji a = m32316a("queryWithSignal");
        try {
            ContentProvider a2 = mo8921a();
            if (a2 == null) {
                Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
                if (strArr == null) {
                    strArr = dgb.f13048a;
                }
                cursor = new MatrixCursor(strArr);
            } else {
                cursor = a2.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            }
            if (a != null) {
                a.close();
            }
            return cursor;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
