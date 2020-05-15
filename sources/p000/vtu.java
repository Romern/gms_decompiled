package p000;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: vtu */
final /* synthetic */ class vtu implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final vup f49964a;

    public vtu(vup vup) {
        this.f49964a = vup;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        vup vup = this.f49964a;
        if ("activated".equals(str)) {
            boolean z = sharedPreferences.getBoolean("activated", false);
            ArrayList arrayList = new ArrayList();
            for (vun vun : vup.f49995a) {
                try {
                    Parcel bj = vun.mo8529bj();
                    dcl.m8166a(bj, z);
                    vun.mo8528b(1, bj);
                } catch (RemoteException e) {
                    arrayList.add(vun);
                }
            }
            vup.f49995a.removeAll(arrayList);
        }
    }
}
