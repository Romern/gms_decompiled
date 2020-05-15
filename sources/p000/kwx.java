package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.metrics.MetricsContextImpl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MetricsContextImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        kzx kzx = kzx.f25494d;
        try {
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray != null) {
                kzx = (kzx) bxvk.m124014a(kzx.f25494d, createByteArray);
            }
        } catch (bxwf e) {
        }
        lbh lbh = lbh.f25725b;
        try {
            byte[] createByteArray2 = parcel.createByteArray();
            if (createByteArray2 != null) {
                lbh = (lbh) bxvk.m124014a(lbh.f25725b, createByteArray2);
            }
        } catch (bxwf e2) {
        }
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        MetricsContextImpl metricsContextImpl = new MetricsContextImpl(readInt, kzx, lbh);
        metricsContextImpl.f11653c = new AtomicInteger(readInt2);
        metricsContextImpl.f11654d = readInt3;
        for (int i = 0; i < readInt4; i++) {
            Integer valueOf = Integer.valueOf(parcel.readInt());
            metricsContextImpl.f11651a.put((AutofillId) parcel.readTypedObject(AutofillId.CREATOR), valueOf);
        }
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, MetricsContext.FillContext.CREATOR);
        metricsContextImpl.f11652b.mo67666b((Iterable) arrayList);
        return metricsContextImpl;
    }
}
