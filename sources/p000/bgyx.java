package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.util.ArrayList;

/* renamed from: bgyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReportingConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        Conditions conditions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, AccountConfig.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                conditions = (Conditions) sed.m34998a(parcel, readInt, Conditions.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ReportingConfig(arrayList, conditions);
    }
}
