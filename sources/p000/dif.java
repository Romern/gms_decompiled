package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.SliceProvider;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: dif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dif extends SliceProvider implements SliceProvider.ProxyCallbacks, dju, dfx {

    /* renamed from: d */
    public static final die f13212d = new die();

    /* renamed from: a */
    public final String f13213a;

    /* renamed from: b */
    public com.google.android.chimera.SliceProvider f13214b = null;

    /* renamed from: c */
    public boolean f13215c = false;

    /* renamed from: e */
    private final bnic f13216e;

    /* renamed from: f */
    private ProviderInfo f13217f = null;

    public dif(String str) {
        this.f13213a = str;
        this.f13216e = bnon.f131923a;
    }

    /* renamed from: a */
    public final synchronized com.google.android.chimera.SliceProvider mo9062a() {
        com.google.android.chimera.SliceProvider sliceProvider;
        sliceProvider = this.f13214b;
        if (sliceProvider == null) {
            mo9066b();
            sliceProvider = this.f13214b;
        }
        return sliceProvider;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        throw null;
    }

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.applyBatch(arrayList);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new OperationApplicationException("Provider proxy missing implementation");
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f13217f = providerInfo;
        super.attachInfo(context, providerInfo);
        dfy.m8329a(context).mo8886a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9066b() {
        throw null;
    }

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.bulkInsert(uri, contentValuesArr);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return 0;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.call(str, str2, bundle);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final Uri canonicalize(Uri uri) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.canonicalize(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        com.google.android.chimera.SliceProvider a;
        synchronized (this) {
            try {
                this.f13215c = true;
                a = mo9062a();
                this.f13215c = false;
            } catch (Throwable th) {
                this.f13215c = false;
                throw th;
            }
        }
        if (a != null) {
            a.dump(fileDescriptor, printWriter, strArr);
        }
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.getStreamTypes(uri, str);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean isTemporary() {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.publicIsTemporary();
        }
        return super.isTemporary();
    }

    public Slice onBindSlice(Uri uri, Set set) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                return a.onBindSlice(uri, set);
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } else {
            throw new IllegalStateException("ChimeraSlicePrvdrProxy: Provider proxy missing implementation");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.f13214b;
        }
        if (sliceProvider != null) {
            ModuleContext moduleContext = ModuleContext.getModuleContext(sliceProvider.getContext());
            if (moduleContext != null) {
                moduleContext.updateModuleConfiguration(configuration);
            }
            sliceProvider.onConfigurationChanged(configuration);
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public PendingIntent onCreatePermissionRequest(Uri uri) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.onCreatePermissionRequest(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return super.onCreatePermissionRequest(uri);
    }

    public Collection onGetSliceDescendants(Uri uri) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.onGetSliceDescendants(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return Collections.emptyList();
    }

    public final void onLowMemory() {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.f13214b;
        }
        if (sliceProvider != null) {
            sliceProvider.onLowMemory();
        }
    }

    public Uri onMapIntentToUri(Intent intent) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.onMapIntentToUri(intent);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return super.onMapIntentToUri(intent);
    }

    public void onSlicePinned(Uri uri) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            a.onSlicePinned(uri);
        } else {
            Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        }
    }

    public void onSliceUnpinned(Uri uri) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            a.onSliceUnpinned(uri);
        } else {
            Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        }
    }

    public final void onTrimMemory(int i) {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.f13214b;
        }
        if (sliceProvider != null) {
            sliceProvider.onTrimMemory(i);
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.openAssetFile(uri, str);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.openFile(uri, str);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.openTypedAssetFile(uri, str, bundle);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final void shutdown() {
        com.google.android.chimera.SliceProvider sliceProvider;
        synchronized (this) {
            sliceProvider = this.f13214b;
            if (sliceProvider != null) {
                this.f13214b = null;
            }
        }
        if (sliceProvider != null) {
            sliceProvider.shutdown();
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

    public final Slice superOnBindSlice(Uri uri, Set set) {
        return super.onBindSlice(uri, set);
    }

    public final void superOnConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final PendingIntent superOnCreatePermissionRequest(Uri uri) {
        return super.onCreatePermissionRequest(uri);
    }

    public final Collection superOnGetSliceDescendants(Uri uri) {
        return super.onGetSliceDescendants(uri);
    }

    public final Uri superOnMapIntentToUri(Intent intent) {
        return super.onMapIntentToUri(intent);
    }

    public final void superOnSlicePinned(Uri uri) {
        super.onSlicePinned(uri);
    }

    public final void superOnSliceUnpinned(Uri uri) {
        super.onSliceUnpinned(uri);
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
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.uncanonicalize(uri);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo9063a(com.google.android.chimera.SliceProvider sliceProvider, Context context) {
        this.f13214b = sliceProvider;
        sliceProvider.setProxy(this);
        bmzs.m108697a(this.f13217f, "attachInfo() has not been called", new Object[0]);
        sliceProvider.attachInfo(context, this.f13217f);
        this.f13217f = null;
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

    public dif(String str, String... strArr) {
        super(strArr);
        this.f13213a = str;
        this.f13216e = bnic.m109496a((Object[]) strArr);
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.openAssetFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.openFile(uri, str, cancellationSignal);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        com.google.android.chimera.SliceProvider a = mo9062a();
        if (a != null) {
            return a.openTypedAssetFile(uri, str, bundle, cancellationSignal);
        }
        Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
        throw new FileNotFoundException("Provider proxy missing implementation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r0 >= r6.mo9303e()) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r5.f13216e.contains(r6.mo9302a(r0)) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0007, code lost:
        r6 = r6.mo9181f().mo69926e(p000.dmv.m8834a(r6.mo9181f().mo69896E(), getClass().getName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r6 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r6.mo9303e() != r5.f13216e.size()) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        r0 = 0;
     */
    /* renamed from: a */
    public final boolean mo8842a(djz djz) {
        synchronized (this) {
            if (this.f13214b != null) {
                return false;
            }
        }
    }
}
