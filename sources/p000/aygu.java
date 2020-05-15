package p000;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aygu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aygu implements axxg {

    /* renamed from: a */
    final /* synthetic */ WearableChimeraService f97550a;

    public aygu(WearableChimeraService wearableChimeraService) {
        this.f97550a = wearableChimeraService;
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        String str;
        if (Log.isLoggable("WearableService", 2)) {
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("onDataItemChanged: ");
            sb.append(size);
            Log.v("WearableService", sb.toString());
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            axxi axxi = (axxi) arrayList.get(i);
            if (Log.isLoggable("WearableService", 2)) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                if (axxi.f96648c) {
                    str = "deleted";
                } else {
                    str = "changed";
                }
                objArr[0] = str;
                objArr[1] = axxi.f96647b.f96641c.toString();
                Log.v("WearableService", String.format(locale, "dataEvent:%s:%s", objArr));
            }
            axue axue = axxi.f96646a;
            this.f97550a.mo60325a(axue, new ayfr("dataChanged", new Intent("com.google.android.gms.wearable.DATA_CHANGED", axxi.f96647b.f96641c).setPackage(axue.f96378b), axxi));
        }
    }
}
