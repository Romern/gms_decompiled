package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: dkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dkz {
    /* renamed from: a */
    public static djk m8772a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return m8773a(bundleExtra, "progressListener");
        }
        return null;
    }

    /* renamed from: a */
    public static djk m8773a(Bundle bundle, String str) {
        IBinder a = C1004fv.m12454a(bundle, str);
        if (a == null) {
            return null;
        }
        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.chimera.container.internal.IUpdateProgressListener");
        if (queryLocalInterface instanceof djk) {
            return (djk) queryLocalInterface;
        }
        return new dji(a);
    }

    /* renamed from: a */
    public static void m8774a(Intent intent, String str, djk djk) {
        if (djk != null) {
            Bundle bundle = new Bundle();
            m8775a(bundle, "progressListener", djk);
            intent.putExtra(str, bundle);
        }
    }

    /* renamed from: a */
    public static void m8775a(Bundle bundle, String str, djk djk) {
        if (djk != null) {
            C1004fv.m12455a(bundle, str, djk.asBinder());
        }
    }

    /* renamed from: a */
    public static void m8776a(djk djk, int i) {
        if (djk != null) {
            try {
                djk.mo8635a(i);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Failed to invoke updateComplete: ");
                sb.append(valueOf);
                Log.e("ChimeraUPLUtils", sb.toString());
            }
        }
    }
}
