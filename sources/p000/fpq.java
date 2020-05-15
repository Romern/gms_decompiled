package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: fpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpq {

    /* renamed from: a */
    static List f17098a;

    /* renamed from: b */
    static final Object f17099b = new Object();

    /* renamed from: c */
    private final Context f17100c;

    protected fpq(Context context) {
        sdo.m34959a(context);
        this.f17100c = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r3.f17102b.f29962h != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r3.f17102b.f29962h != false) goto L_0x00f0;
     */
    /* renamed from: a */
    public final Collection mo11113a(boolean z) {
        f17098a = Collections.synchronizedList(new ArrayList());
        Bundle bundle = new Bundle();
        foi.m12085a(bundle, f17098a);
        Intent intent = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage(this.f17100c.getPackageName());
        bundle.putString("className", "GoogleSettingsIndexGetter");
        intent.putExtras(bundle);
        synchronized (f17099b) {
            this.f17100c.startService(intent);
            try {
                f17099b.wait();
            } catch (InterruptedException e) {
                Log.w("GoogleSettingsIndexGetter", e);
            }
        }
        HashMap hashMap = new HashMap();
        if (f17098a != null) {
            boolean f = soz.m35807f(this.f17100c);
            for (Parcel parcel : f17098a) {
                parcel.setDataPosition(0);
                GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) GoogleSettingsItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                if (googleSettingsItem.f29965k) {
                    fpr fpr = new fpr(this.f17100c, googleSettingsItem);
                    if (hashMap.containsKey(fpr.mo11115b())) {
                        String b = fpr.mo11115b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 39);
                        sb.append("index key (");
                        sb.append(b);
                        sb.append(") already present, ignore it");
                        Log.e("GoogleSettingsIndexGetter", sb.toString());
                    } else {
                        if (z && !f && fpr.f17106f) {
                            GoogleSettingsItem googleSettingsItem2 = fpr.f17102b;
                            if (googleSettingsItem2.f29967m) {
                                if (googleSettingsItem2.f29957c != 2) {
                                    if (googleSettingsItem2.f29960f) {
                                        if (!soz.m35802d(fpr.f17101a)) {
                                        }
                                    }
                                    if (fpr.f17102b.f29961g) {
                                        if (!soz.m35800c(fpr.f17101a)) {
                                        }
                                    }
                                    if (fpr.f17102b.f29957c == 3) {
                                        if (Settings.Global.getInt(fpr.f17101a.getContentResolver(), "development_settings_enabled", 0) != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        hashMap.put(fpr.mo11115b(), fpr);
                    }
                }
            }
        }
        List list = f17098a;
        if (list != null) {
            list.clear();
            f17098a = null;
        }
        return hashMap.values();
    }
}
