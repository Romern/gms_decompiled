package p000;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aehl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehl {

    /* renamed from: a */
    public final int f63402a;

    /* renamed from: b */
    public final int f63403b;

    /* renamed from: c */
    public final List f63404c;

    /* renamed from: d */
    public final Location f63405d;

    private aehl(int i, int i2, List list, Location location) {
        this.f63402a = i;
        this.f63403b = i2;
        this.f63404c = list;
        this.f63405d = location;
    }

    /* renamed from: a */
    public static aehl m51844a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = (byte[]) arrayList2.get(i2);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                obtain.recycle();
                arrayList.add((ParcelableGeofence) ParcelableGeofence.CREATOR.createFromParcel(obtain));
            }
        }
        return new aehl(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: a */
    public final boolean mo34148a() {
        return this.f63402a != -1;
    }
}
