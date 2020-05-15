package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* renamed from: afjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afjn extends dcj implements afjp {
    public afjn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdd.IMobileDataDownloadService");
    }

    /* renamed from: a */
    public final void mo34905a(afjj afjj, FileGroupRequest fileGroupRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afjj);
        dcl.m8165a(bj, fileGroupRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo34909a(rnt rnt, OverrideFileGroupRequest overrideFileGroupRequest) {
        throw null;
    }

    /* renamed from: b */
    public final void mo34911b(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(9, bj);
    }

    /* renamed from: c */
    public final void mo34913c(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(4, bj);
    }

    /* renamed from: d */
    public final void mo34914d(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(7, bj);
    }

    /* renamed from: e */
    public final void mo34915e(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(8, bj);
    }

    /* renamed from: f */
    public final void mo34916f(rnt rnt) {
        throw null;
    }

    /* renamed from: a */
    public final void mo34906a(afjm afjm) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, afjm);
        mo8528b(10, bj);
    }

    /* renamed from: b */
    public final void mo34912b(rnt rnt, FileGroupRequest fileGroupRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, fileGroupRequest);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo34907a(rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo34908a(rnt rnt, FileGroupRequest fileGroupRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, fileGroupRequest);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo34910a(boolean z, rnt rnt) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        dcl.m8164a(bj, rnt);
        mo8528b(3, bj);
    }
}
