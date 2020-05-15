package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;

/* renamed from: oly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class oly {

    /* renamed from: b */
    public static final bnsn f37939b = odk.m28481a("CAR.SERVICE");

    /* renamed from: a */
    public final int mo22281a(String str, Bundle bundle, Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!mo21016a(bundle)) {
            return 2;
        }
        boolean a = oen.m28584a(context).mo22059a(mo21015a(), mo21017b(), str, nhg.SERVICE);
        oen.m28585a();
        if (a) {
            return 0;
        }
        bnsi c = f37939b.mo68388c();
        c.mo68432a("oly", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("Package NOT validated: %s", bryx.m114908a(str));
        return 16;
    }

    /* renamed from: a */
    public abstract CarInfo mo21015a();

    /* renamed from: a */
    public abstract boolean mo21016a(Bundle bundle);

    /* renamed from: b */
    public abstract CarUiInfo mo21017b();
}
