package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import java.util.List;

/* renamed from: qry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qry extends dcj implements qsa {
    public qry(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.chromesync.internal.IChromeSyncApiService");
    }

    /* renamed from: a */
    public final void mo24234a(qrx qrx, int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, qrx);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8528b(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, bj);
    }

    /* renamed from: a */
    public final void mo24236a(qrx qrx, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo24242a(rnt rnt, Bundle bundle) {
        throw null;
    }

    /* renamed from: b */
    public final void mo24244b(qrx qrx, List list, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, qrx);
        bj.writeStringList(list);
        dcl.m8165a(bj, bundle);
        mo8528b(203, bj);
    }

    /* renamed from: a */
    public final void mo24235a(qrx qrx, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, qrx);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }

    /* renamed from: b */
    public final void mo24245b(rnt rnt, int i, Bundle bundle, Bundle bundle2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, bundle2);
        mo8528b(ErrorInfo.TYPE_SDU_MEMORY_FULL, bj);
    }

    /* renamed from: b */
    public final void mo24246b(rnt rnt, int i, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(i);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8528b(102, bj);
    }

    /* renamed from: a */
    public final void mo24237a(qrx qrx, List list, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, qrx);
        bj.writeStringList(list);
        dcl.m8165a(bj, bundle);
        mo8528b(202, bj);
    }

    /* renamed from: a */
    public final void mo24238a(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo24239a(rnt rnt, int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8528b(106, bj);
    }

    /* renamed from: a */
    public final void mo24240a(rnt rnt, int i, Bundle bundle, Bundle bundle2) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        dcl.m8165a(bj, bundle2);
        mo8528b(ErrorInfo.TYPE_SDU_FAILED, bj);
    }

    /* renamed from: a */
    public final void mo24241a(rnt rnt, int i, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeInt(i);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8528b(101, bj);
    }

    /* renamed from: a */
    public final void mo24243a(rnt rnt, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8528b(2, bj);
    }
}
