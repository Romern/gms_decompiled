package p000;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.felicanetworks.mfc.C0126R;

/* renamed from: afgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afgw {

    /* renamed from: a */
    public static afhu f64238a;

    /* renamed from: a */
    public static afgv m53066a() {
        try {
            return new afgv(m53068b().mo34877a((int) C0126R.C0127drawable.spotlight_poi));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: b */
    private static afhu m53068b() {
        afhu afhu = f64238a;
        sdo.checkIfNull(afhu, "IBitmapDescriptorFactory is not initialized");
        return afhu;
    }

    /* renamed from: a */
    public static afgv m53067a(Bitmap bitmap) {
        try {
            return new afgv(m53068b().mo34878a(bitmap));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
