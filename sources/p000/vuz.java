package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* renamed from: vuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vuz extends sbm {
    /* renamed from: I */
    public final Feature[] mo6461I() {
        Feature[] featureArr = vqa.f49784b;
        int length = vqa.f49784b.length;
        return (Feature[]) Arrays.copyOf(featureArr, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drivingmode.internal.IDrivingModeService");
        if (queryLocalInterface instanceof vvc) {
            return (vvc) queryLocalInterface;
        }
        return new vva(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.drivingmode.START_DRIVING_MODE_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.drivingmode.internal.IDrivingModeService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12800000;
    }

    public vuz(Context context, Looper looper, sat sat, rjz rjz, rka rka) {
        super(context, looper, 184, sat, rjz, rka);
    }
}
