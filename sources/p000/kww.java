package p000;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;

/* renamed from: kww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kww implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MetricsContext.FillContext[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        lbf lbf;
        laz laz = null;
        boolean z = true;
        if (parcel.readInt() == 1) {
            try {
                lbf = (lbf) bxvk.m124014a(lbf.f25715f, (byte[]) bmxy.m108581a(parcel.createByteArray()));
            } catch (bxwf | NullPointerException e) {
                throw new BadParcelableException(e);
            }
        } else {
            lbf = null;
        }
        bngs j = bngx.m109377j();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            try {
                j.mo67668c((lba) bxvk.m124014a(lba.f25675f, (byte[]) bmxy.m108581a(parcel.createByteArray())));
                i++;
            } catch (bxwf | NullPointerException e2) {
                throw new BadParcelableException(e2);
            }
        }
        if (parcel.readInt() == 1) {
            laz = laz.m18867a(parcel.readInt());
        }
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new MetricsContext.FillContext(lbf, j.mo67664a(), laz, z);
    }
}
