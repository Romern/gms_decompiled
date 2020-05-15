package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: emp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emp {

    /* renamed from: a */
    public final enc f15302a;

    public emp(enc enc) {
        this.f15302a = enc;
    }

    /* renamed from: b */
    public static Bundle m10680b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putString("version_code", str2);
        return bundle;
    }

    /* renamed from: a */
    public final int mo10288a(String str, String str2) {
        try {
            return this.f15302a.mo10301a(m10680b(str, str2)).getInt("module_status");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final void mo10289c(String str, String str2) {
        try {
            this.f15302a.mo10309c(m10680b(str, str2)).getBoolean("delete_successful");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
