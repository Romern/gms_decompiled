package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Response;

@Deprecated
/* renamed from: apqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apqz extends aprc implements sjr {
    /* renamed from: a */
    public final void mo47543a(apra apra) {
        GetCorpusHandlesRegisteredForIMECall$Response getCorpusHandlesRegisteredForIMECall$Response = new GetCorpusHandlesRegisteredForIMECall$Response();
        getCorpusHandlesRegisteredForIMECall$Response.f107438a = new Status(8, "API Disabled");
        Parcel bj = apra.mo8529bj();
        dcl.m8165a(bj, getCorpusHandlesRegisteredForIMECall$Response);
        apra.mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo47544b(apra apra) {
        GetIMEUpdatesCall$Response getIMEUpdatesCall$Response = new GetIMEUpdatesCall$Response();
        getIMEUpdatesCall$Response.f107442a = new Status(8, "API Disabled");
        Parcel bj = apra.mo8529bj();
        dcl.m8165a(bj, getIMEUpdatesCall$Response);
        apra.mo8530c(3, bj);
    }
}
