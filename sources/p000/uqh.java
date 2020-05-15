package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqh {

    /* renamed from: a */
    private static final sbw f48531a = new sbw("GlobalTransferProgressS", "");

    /* renamed from: b */
    private final Map f48532b = new HashMap();

    /* renamed from: c */
    private final Map f48533c = new HashMap();

    /* renamed from: a */
    private final Map m39233a(int i) {
        if (i == 0) {
            return this.f48532b;
        }
        if (i == 1) {
            return this.f48533c;
        }
        throw new IllegalStateException("Unexpected transfer type");
    }

    /* renamed from: a */
    public final synchronized TransferProgressData mo27864a(int i, DriveId driveId) {
        TransferProgressData transferProgressData;
        transferProgressData = (TransferProgressData) m39233a(i).get(driveId);
        if (transferProgressData == null) {
            transferProgressData = new TransferProgressData(i, driveId);
        }
        return transferProgressData;
    }

    /* renamed from: a */
    public final synchronized List mo27865a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f48532b.size() + this.f48533c.size());
        arrayList.addAll(this.f48532b.values());
        arrayList.addAll(this.f48533c.values());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r7.f30793c == r0.f30793c) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r7.f30793c == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo27866a(TransferProgressData transferProgressData) {
        TransferProgressData transferProgressData2;
        sdo.m34959a(transferProgressData);
        Map a = m39233a(transferProgressData.f30791a);
        DriveId driveId = transferProgressData.f30792b;
        if (transferProgressData.f30793c == 0) {
            transferProgressData2 = (TransferProgressData) a.remove(driveId);
        } else {
            transferProgressData2 = (TransferProgressData) a.put(driveId, transferProgressData);
        }
        if (transferProgressData.equals(transferProgressData2)) {
            f48531a.mo25375b("Unexpected transfer transition from [%s] to [%s]", transferProgressData2, transferProgressData);
        }
        if (transferProgressData2 != null) {
        }
    }
}
