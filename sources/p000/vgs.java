package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogicalFilter[i];
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.util.List):void
     arg types: [com.google.android.gms.drive.query.internal.Operator, java.util.ArrayList]
     candidates:
      com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.lang.Iterable):void
      com.google.android.gms.drive.query.internal.LogicalFilter.<init>(com.google.android.gms.drive.query.internal.Operator, java.util.List):void */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Operator operator = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                operator = (Operator) sed.m34998a(parcel, readInt, Operator.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, FilterHolder.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new LogicalFilter(operator, (List) arrayList);
    }
}
