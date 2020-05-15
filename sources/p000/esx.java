package p000;

import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* renamed from: esx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esx {

    /* renamed from: c */
    private static volatile WeakReference f15654c = new WeakReference(null);

    /* renamed from: a */
    public volatile esw f15655a;

    /* renamed from: b */
    public final CountDownLatch f15656b = new CountDownLatch(1);

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IBinder, vzr], assign insn: 0x0014: INVOKE  (r0v3 ? I:vzr) = (r0v2 java.util.List) type: STATIC call: vzs.a(java.lang.Object):vzr */
    private esx() {
        ? a = vzs.m41642a(Collections.synchronizedList(new ArrayList()));
        Bundle bundle = new Bundle();
        C1004fv.m12455a(bundle, "settingsListKey", a);
        bundle.putString("className", "GmscoreSettingsProvider");
        Intent intent = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage(rpr.m34216b().getPackageName());
        intent.putExtras(bundle);
        rpr.m34216b().startService(intent);
    }

    /* renamed from: a */
    public static esx m11109a() {
        esx esx = (esx) f15654c.get();
        if (esx != null) {
            return esx;
        }
        esx esx2 = new esx();
        f15654c = new WeakReference(esx2);
        return esx2;
    }

    /* renamed from: a */
    public final esu mo10497a(int i) {
        this.f15656b.await();
        return (esu) this.f15655a.f15653b.get(Integer.valueOf(i));
    }
}
