package p000;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: zln */
final /* synthetic */ class zln implements bmxj {
    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        if (queryLocalInterface instanceof zcy) {
            return (zcy) queryLocalInterface;
        }
        return new zcy(iBinder);
    }
}
