package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* renamed from: avut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avut extends dcj implements avuv {
    public avut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    /* renamed from: a */
    public final void mo51628a(avup avup) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avup);
        mo8528b(2, bj);
    }

    /* renamed from: b */
    public final void mo51633b(avus avus, avup avup) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avus);
        dcl.m8164a(bj, avup);
        mo8528b(5, bj);
    }

    /* renamed from: c */
    public final void mo51634c(avus avus, avup avup) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avus);
        dcl.m8164a(bj, avup);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo51629a(avus avus, avup avup) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avus);
        dcl.m8164a(bj, avup);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo51630a(UsageReportingOptInOptions usageReportingOptInOptions, avup avup) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, usageReportingOptInOptions);
        dcl.m8164a(bj, avup);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo51631a(String str, avup avup) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8164a(bj, avup);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo51632a(String str, ConsentInformation consentInformation, avup avup) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, consentInformation);
        dcl.m8164a(bj, avup);
        mo8528b(9, bj);
    }
}
