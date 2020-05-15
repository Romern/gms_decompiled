package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.List;

/* renamed from: avup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface avup extends IInterface {
    /* renamed from: a */
    void mo51620a(Status status);

    /* renamed from: a */
    void mo51621a(Status status, ConsentInformation consentInformation);

    /* renamed from: a */
    void mo51622a(Status status, UsageReportingOptInOptions usageReportingOptInOptions);

    /* renamed from: a */
    void mo51623a(Status status, List list);

    /* renamed from: a */
    void mo51616a(Status status, boolean z, ConsentInformation consentInformation);

    /* renamed from: b */
    void mo51624b(Status status);

    /* renamed from: c */
    void mo51625c(Status status);

    /* renamed from: d */
    void mo51626d(Status status);
}
