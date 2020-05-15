package p000;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.ModuleContext;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: dgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dgb extends ContentProvider implements ContentProvider.ProxyCallbacks, dju {

    /* renamed from: a */
    public static final String[] f13048a = new String[0];

    /* renamed from: d */
    public static final dga f13049d = new dga();

    /* renamed from: b */
    public com.google.android.chimera.ContentProvider f13050b = null;

    /* renamed from: c */
    public boolean f13051c = false;

    /* renamed from: e */
    private ProviderInfo f13052e = null;

    /* renamed from: a */
    public final synchronized com.google.android.chimera.ContentProvider mo8921a() {
        com.google.android.chimera.ContentProvider contentProvider;
        contentProvider = this.f13050b;
        if (contentProvider == null) {
            mo8925b();
            contentProvider = this.f13050b;
        }
        return contentProvider;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        throw null;
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.applyBatch(arrayList);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new OperationApplicationException("Provider proxy missing implementation");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f13052e = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8925b() {
        throw null;
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.bulkInsert(uri, contentValuesArr);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                return a.call(str, str2, bundle);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } else {
            Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
            return null;
        }
    }

    public final Uri canonicalize(Uri uri) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.canonicalize(uri);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.delete(uri, str, strArr);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        com.google.android.chimera.ContentProvider a;
        synchronized (this) {
            try {
                this.f13051c = true;
                a = mo8921a();
                this.f13051c = false;
            } catch (Throwable th) {
                this.f13051c = false;
                throw th;
            }
        }
        if (a != null) {
            a.dump(fileDescriptor, printWriter, strArr);
        }
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.getStreamTypes(uri, str);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final String getType(Uri uri) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.getType(uri);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.insert(uri, contentValues);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean isTemporary() {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.publicIsTemporary();
        }
        return super.isTemporary();
    }

    public void onConfigurationChanged(Configuration configuration) {
        com.google.android.chimera.ContentProvider contentProvider;
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

    public final boolean onCreate() {
        return true;
    }

    public final void onLowMemory() {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.f13050b;
        }
        if (contentProvider != null) {
            contentProvider.onLowMemory();
        }
    }

    public final void onTrimMemory(int i) {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.f13050b;
        }
        if (contentProvider != null) {
            contentProvider.onTrimMemory(i);
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.openAssetFile(uri, str);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.openFile(uri, str);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.openTypedAssetFile(uri, str, bundle);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.query(uri, strArr, bundle, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        if (strArr == null) {
            strArr = f13048a;
        }
        return new MatrixCursor(strArr);
    }

    public final void shutdown() {
        com.google.android.chimera.ContentProvider contentProvider;
        synchronized (this) {
            contentProvider = this.f13050b;
            if (contentProvider != null) {
                this.f13050b = null;
            }
        }
        if (contentProvider != null) {
            contentProvider.shutdown();
        }
    }

    public final ContentProviderResult[] superApplyBatch(ArrayList arrayList) {
        return super.applyBatch(arrayList);
    }

    public final int superBulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return super.bulkInsert(uri, contentValuesArr);
    }

    public final Bundle superCall(String str, String str2, Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    public final Uri superCanonicalize(Uri uri) {
        return super.canonicalize(uri);
    }

    public final void superDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public final String[] superGetStreamTypes(Uri uri, String str) {
        return super.getStreamTypes(uri, str);
    }

    public final boolean superIsTemporary() {
        return super.isTemporary();
    }

    public final void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final AssetFileDescriptor superOpenAssetFile(Uri uri, String str) {
        return super.openAssetFile(uri, str);
    }

    public final ParcelFileDescriptor superOpenFile(Uri uri, String str) {
        return super.openFile(uri, str);
    }

    public final ParcelFileDescriptor superOpenFileHelper(Uri uri, String str) {
        return super.openFileHelper(uri, str);
    }

    public final AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle) {
        return super.openTypedAssetFile(uri, str, bundle);
    }

    public final Cursor superQuery(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return super.query(uri, strArr, bundle, cancellationSignal);
    }

    public final void superSetPathPermissions(PathPermission[] pathPermissionArr) {
        super.setPathPermissions(pathPermissionArr);
    }

    public final void superSetReadPermission(String str) {
        super.setReadPermission(str);
    }

    public final void superSetWritePermission(String str) {
        super.setWritePermission(str);
    }

    public final void superShutdown() {
        super.shutdown();
    }

    public final Uri superUncanonicalize(Uri uri) {
        return super.uncanonicalize(uri);
    }

    public final Uri uncanonicalize(Uri uri) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.uncanonicalize(uri);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.update(uri, contentValues, str, strArr);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    /* renamed from: a */
    public final synchronized void mo8922a(com.google.android.chimera.ContentProvider contentProvider, Context context) {
        this.f13050b = contentProvider;
        contentProvider.setProxy(this);
        bmzs.m108697a(this.f13052e, "attachInfo() has not been called", new Object[0]);
        contentProvider.attachInfo(context, this.f13052e);
        this.f13052e = null;
    }

    public final AssetFileDescriptor superOpenAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return super.openAssetFile(uri, str, cancellationSignal);
    }

    public final ParcelFileDescriptor superOpenFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return super.openFile(uri, str, cancellationSignal);
    }

    public final AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        return super.openTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    public final Cursor superQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return super.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.openAssetFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.openFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.query(uri, strArr, str, strArr2, str2);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        if (strArr == null) {
            strArr = f13048a;
        }
        return new MatrixCursor(strArr);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        com.google.android.chimera.ContentProvider a = mo8921a();
        if (a != null) {
            return a.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
        Log.e("ChimeraPrvdrProxy", "Provider proxy missing implementation");
        if (strArr == null) {
            strArr = f13048a;
        }
        return new MatrixCursor(strArr);
    }
}
