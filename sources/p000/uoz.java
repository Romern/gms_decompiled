package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.query.Query;
import java.util.Set;

/* renamed from: uoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface uoz {
    /* renamed from: a */
    void mo27808a();

    /* renamed from: a */
    void mo27809a(DriveId driveId, long j, utr utr);

    /* renamed from: a */
    void mo27810a(DriveId driveId, utr utr);

    /* renamed from: a */
    void mo27811a(DriveId driveId, utr utr, TransferProgressOptions transferProgressOptions);

    /* renamed from: a */
    void mo27812a(ChangeEvent changeEvent, ujx ujx);

    /* renamed from: a */
    void mo27813a(TransferProgressEvent transferProgressEvent, DriveId driveId);

    /* renamed from: a */
    void mo27814a(String str, boolean z);

    /* renamed from: a */
    void mo27815a(Set set);

    /* renamed from: a */
    void mo27816a(uqv uqv);

    /* renamed from: a */
    void mo27817a(utr utr);

    /* renamed from: a */
    void mo27818a(utr utr, long j, ChangesAvailableOptions changesAvailableOptions, Set set);

    /* renamed from: a */
    void mo27819a(utr utr, Query query, String str, ubi ubi, Set set, boolean z);

    /* renamed from: a */
    void mo27820a(vau vau);

    /* renamed from: a */
    boolean mo27821a(DriveId driveId);

    /* renamed from: b */
    void mo27822b(TransferProgressEvent transferProgressEvent, DriveId driveId);

    /* renamed from: b */
    void mo27823b(utr utr);
}
