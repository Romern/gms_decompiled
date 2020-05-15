package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;
import com.google.android.gms.drive.internal.OnEventResponse;

/* renamed from: uuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uuc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnEventResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ChangeEvent changeEvent = null;
        CompletionEvent completionEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        ChangesAvailableEvent changesAvailableEvent = null;
        TransferStateEvent transferStateEvent = null;
        TransferProgressEvent transferProgressEvent = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                changeEvent = (ChangeEvent) sed.m34998a(parcel, readInt, ChangeEvent.CREATOR);
            } else if (a == 5) {
                completionEvent = (CompletionEvent) sed.m34998a(parcel, readInt, CompletionEvent.CREATOR);
            } else if (a == 6) {
                queryResultEventParcelable = (QueryResultEventParcelable) sed.m34998a(parcel, readInt, QueryResultEventParcelable.CREATOR);
            } else if (a == 7) {
                changesAvailableEvent = (ChangesAvailableEvent) sed.m34998a(parcel, readInt, ChangesAvailableEvent.CREATOR);
            } else if (a == 9) {
                transferStateEvent = (TransferStateEvent) sed.m34998a(parcel, readInt, TransferStateEvent.CREATOR);
            } else if (a != 10) {
                sed.m35002b(parcel, readInt);
            } else {
                transferProgressEvent = (TransferProgressEvent) sed.m34998a(parcel, readInt, TransferProgressEvent.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OnEventResponse(i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, transferStateEvent, transferProgressEvent);
    }
}
