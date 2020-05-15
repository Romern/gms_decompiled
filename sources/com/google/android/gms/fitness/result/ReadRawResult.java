package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReadRawResult extends AbstractSafeParcelable implements Closeable, rkk {
    public static final Parcelable.Creator CREATOR = new zga();

    /* renamed from: a */
    public final DataHolder f32358a;

    public ReadRawResult(DataHolder dataHolder) {
        this.f32358a = dataHolder;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return new Status(this.f32358a.f30165e);
    }

    public final void close() {
        DataHolder dataHolder = this.f32358a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public ReadRawResult(DataHolder dataHolder, List list) {
        this.f32358a = dataHolder;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((DataHolder) list.get(i)).close();
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f32358a, i, false);
        see.m35066c(parcel, 2, null, false);
        see.m35062b(parcel, a);
    }
}
