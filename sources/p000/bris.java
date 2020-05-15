package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.ResultSet;
import com.google.firebase.appindexing.internal.GetIndexableResponse;
import java.util.List;

/* renamed from: bris */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bris extends dcj implements briu {
    public bris(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingCallback");
    }

    /* renamed from: a */
    public final void mo69572a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeList(list);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo69573a(Status status, ResultSet[] resultSetArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedArray(resultSetArr, 0);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo69567a(GetIndexableResponse getIndexableResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getIndexableResponse);
        mo8530c(2, bj);
    }
}
