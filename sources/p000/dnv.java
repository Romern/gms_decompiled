package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.SliceProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: dnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dnv extends SliceProvider {

    /* renamed from: a */
    private final dnu f13653a;

    /* renamed from: b */
    private final String[] f13654b;

    /* renamed from: c */
    private SliceManager f13655c;

    public dnv(dnu dnu, String[] strArr) {
        this.f13654b = (strArr == null || strArr.length == 0) ? null : strArr;
        this.f13653a = dnu;
    }

    /* renamed from: a */
    private final void m8908a(Uri uri) {
        if (uri != null) {
            String[] strArr = this.f13654b;
            for (String str : strArr) {
                if (getContext().checkCallingPermission(str) == 0) {
                    this.f13655c.grantSlicePermission(str, uri);
                    getContext().getContentResolver().notifyChange(uri, null);
                    return;
                }
            }
        }
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f13653a.attachInfo(context, providerInfo);
        super.attachInfo(context, providerInfo);
        this.f13655c = (SliceManager) context.getSystemService(SliceManager.class);
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        Intent intent;
        if (this.f13654b != null) {
            Uri uri = null;
            if (!"bind_slice".equals(str)) {
                if ("map_slice".equals(str) && (intent = (Intent) bundle.getParcelable("slice_intent")) != null) {
                    uri = onMapIntentToUri(intent);
                }
            } else if (bundle != null) {
                uri = (Uri) bundle.getParcelable("slice_uri");
            }
            if (!(uri == null || this.f13655c.checkSlicePermission(uri, Binder.getCallingPid(), Binder.getCallingUid()) == 0)) {
                m8908a(uri);
            }
        }
        return super.call(str, str2, bundle);
    }

    public final Slice onBindSlice(Uri uri, Set set) {
        aph.m1810b(set);
        try {
            return aph.m1805a(this.f13653a.mo9323a(uri));
        } catch (Exception e) {
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 27);
            sb.append("Slice with URI ");
            sb.append(uri2);
            sb.append(" is invalid.");
            Log.wtf("ChimeraSliceProviderWra", sb.toString(), e);
            return null;
        }
    }

    public final boolean onCreate() {
        return true;
    }

    public final PendingIntent onCreatePermissionRequest(Uri uri) {
        if (this.f13654b != null) {
            m8908a(uri);
        }
        return super.onCreatePermissionRequest(uri);
    }

    public final Uri onMapIntentToUri(Intent intent) {
        throw new UnsupportedOperationException("This provider has not implemented intent to uri mapping");
    }

    public final void onSlicePinned(Uri uri) {
        dnu dnu = this.f13653a;
        if (!dnu.f13651a.contains(uri)) {
            dnu.f13651a.add(uri);
        }
    }

    public final void onSliceUnpinned(Uri uri) {
        this.f13653a.mo9325b(uri);
        dnu dnu = this.f13653a;
        if (dnu.f13651a.contains(uri)) {
            dnu.f13651a.remove(uri);
        }
    }

    public final Collection onGetSliceDescendants(Uri uri) {
        return Collections.emptyList();
    }
}
