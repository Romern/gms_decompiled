package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.SliceProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: qlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlc extends dif {

    /* renamed from: e */
    private rpg f41634e;

    /* renamed from: f */
    private aabl f41635f = null;

    public qlc(String str) {
        super(str);
        qlp.m32393a();
    }

    /* renamed from: a */
    private final blji m32328a(String str) {
        if (this.f41635f == null && cdoz.m134484f()) {
            mo9062a();
        }
        if (cdoz.m134481c()) {
            return aabl.m21059a(this.f41635f, str, Binder.getCallingUid());
        }
        return aabl.m21058a(this.f41635f, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9066b() {
        if (!rpr.m34216b().getInSafeBoot()) {
            Context context = getContext();
            bmzs.m108696a(context);
            dif.f13212d.mo9148a(context, this, this.f13213a);
        }
    }

    /* renamed from: c */
    public final void mo9145c() {
        qmc.m32424a(true);
    }

    public final Slice onBindSlice(Uri uri, Set set) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        blji a = m32328a("onBindSlice");
        try {
            SliceProvider a2 = mo9062a();
            if (a2 != null) {
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                Slice onBindSlice = a2.onBindSlice(uri, set);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                if (a != null) {
                    a.close();
                }
                return onBindSlice;
            }
            throw new IllegalStateException("ChimeraSlicePrvdrProxy: Provider proxy missing implementation");
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            }
            throw th;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        SliceProvider sliceProvider;
        rpg rpg = this.f41634e;
        if (rpg != null) {
            rpg.mo24981a(configuration);
        }
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

    public final PendingIntent onCreatePermissionRequest(Uri uri) {
        blji a = m32328a("onCreatePermissionRequest");
        try {
            PendingIntent onCreatePermissionRequest = super.onCreatePermissionRequest(uri);
            if (a != null) {
                a.close();
            }
            return onCreatePermissionRequest;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final Collection onGetSliceDescendants(Uri uri) {
        Collection collection;
        blji a = m32328a("onGetSliceDescendants");
        try {
            SliceProvider a2 = mo9062a();
            if (a2 == null) {
                Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
                collection = Collections.emptyList();
            } else {
                collection = a2.onGetSliceDescendants(uri);
            }
            if (a != null) {
                a.close();
            }
            return collection;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final Uri onMapIntentToUri(Intent intent) {
        blji a = m32328a("onMapIntentToUri");
        try {
            Uri onMapIntentToUri = super.onMapIntentToUri(intent);
            if (a != null) {
                a.close();
            }
            return onMapIntentToUri;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onSlicePinned(Uri uri) {
        blji a = m32328a("onSlicePinned");
        try {
            SliceProvider a2 = mo9062a();
            if (a2 == null) {
                Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
            } else {
                a2.onSlicePinned(uri);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void onSliceUnpinned(Uri uri) {
        blji a = m32328a("onSliceUnpinned");
        try {
            SliceProvider a2 = mo9062a();
            if (a2 == null) {
                Log.e("ChimeraSlicePrvdrProxy", "Provider proxy missing implementation");
            } else {
                a2.onSliceUnpinned(uri);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
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

    public qlc(String str, String... strArr) {
        super(str, strArr);
        qlp.m32393a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8648a(Object obj, Context context) {
        aabl aabl;
        SliceProvider sliceProvider = (SliceProvider) obj;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof dfz)) {
            rpg rpg = new rpg(context);
            this.f41634e = rpg;
            context = rpg;
        }
        if (cdoz.m134484f()) {
            aabl = new aabl(context, sliceProvider.getClass(), 22);
        } else {
            aabl = null;
        }
        this.f41635f = aabl;
        super.mo9063a(sliceProvider, aabj.m21054a(context));
    }
}
