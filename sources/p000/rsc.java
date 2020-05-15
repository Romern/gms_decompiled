package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: rsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rsc {

    /* renamed from: a */
    public Map f43573a;

    public rsc(Context context) {
        InputStream open;
        try {
            open = context.getAssets().open("Receivers.pb");
            HashMap hashMap = new HashMap();
            for (sgl sgl : ((sgh) bxvk.m124010a(sgh.f44177b, open)).f44179a) {
                for (sgk sgk : sgl.f44418c) {
                    rsa rsa = new rsa(sgk, sgl.f44419d);
                    rsb rsb = (rsb) hashMap.get(rsa);
                    if (rsb == null) {
                        rsb = new rsb(m34324a(sgk), sgl.f44419d);
                        hashMap.put(rsa, rsb);
                    }
                    rsb.f43572c.add(sgl);
                }
            }
            this.f43573a = bnhe.m109413a(hashMap);
            if (open != null) {
                open.close();
                return;
            }
            return;
        } catch (IOException e) {
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static IntentFilter m34324a(sgk sgk) {
        IntentFilter intentFilter = new IntentFilter();
        bxwc bxwc = sgk.f44411a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            intentFilter.addAction((String) bxwc.get(i));
        }
        bxwc bxwc2 = sgk.f44412b;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            intentFilter.addCategory((String) bxwc2.get(i2));
        }
        bxwc bxwc3 = sgk.f44413c;
        int size3 = bxwc3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            sgg sgg = (sgg) bxwc3.get(i3);
            if (!TextUtils.isEmpty(sgg.f44170a)) {
                intentFilter.addDataScheme(sgg.f44170a);
            }
            if (!TextUtils.isEmpty(sgg.f44171b)) {
                String str = sgg.f44172c;
                String str2 = sgg.f44171b;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                intentFilter.addDataAuthority(str2, str);
            }
            if (!TextUtils.isEmpty(sgg.f44173d)) {
                intentFilter.addDataPath(sgg.f44173d, 0);
            }
            if (!TextUtils.isEmpty(sgg.f44174e)) {
                intentFilter.addDataPath(sgg.f44173d, 1);
            }
            if (!TextUtils.isEmpty(sgg.f44175f)) {
                intentFilter.addDataPath(sgg.f44173d, 2);
            }
            if (!TextUtils.isEmpty(sgg.f44176g)) {
                try {
                    intentFilter.addDataType(sgg.f44176g);
                } catch (IntentFilter.MalformedMimeTypeException e) {
                    Log.w("ReceiverRegistry", String.format(Locale.getDefault(), "Invalid mimetype %s on <receiver>", sgg.f44176g), e);
                }
            }
        }
        return intentFilter;
    }

    /* renamed from: a */
    public static void m34325a(SparseArray sparseArray, int i, List list) {
        if (!list.isEmpty()) {
            sparseArray.put(i, list);
        }
    }
}
