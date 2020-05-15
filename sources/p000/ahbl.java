package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: ahbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahbl extends dcj implements ahbn {
    public ahbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileService");
    }

    /* renamed from: a */
    public final void mo34997a(ahbk ahbk, DeleteFileRequest deleteFileRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ahbk);
        dcl.m8165a(bj, deleteFileRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo34998a(ahbk ahbk, OpenFileDescriptorRequest openFileDescriptorRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ahbk);
        dcl.m8165a(bj, openFileDescriptorRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo34999a(ahbk ahbk, RenameRequest renameRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ahbk);
        dcl.m8165a(bj, renameRequest);
        mo8528b(3, bj);
    }
}
