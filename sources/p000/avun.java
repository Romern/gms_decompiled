package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.List;

/* renamed from: avun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avun extends dcj implements avup {
    public avun(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    /* renamed from: a */
    public final void mo51620a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: b */
    public final void mo51624b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: c */
    public final void mo51625c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: d */
    public final void mo51626d(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo51621a(Status status, ConsentInformation consentInformation) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, consentInformation);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo51622a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, usageReportingOptInOptions);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo51623a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeStringList(list);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo51616a(Status status, boolean z, ConsentInformation consentInformation) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, consentInformation);
        mo8530c(8, bj);
    }
}
