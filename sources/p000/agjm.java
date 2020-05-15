package p000;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: agjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f65732a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f65733b;

    /* renamed from: c */
    final /* synthetic */ aghp f65734c;

    public agjm(aghp aghp, EventParcel eventParcel, AppMetadata appMetadata) {
        this.f65734c = aghp;
        this.f65732a = eventParcel;
        this.f65733b = appMetadata;
    }

    public final void run() {
        EventParams eventParams;
        aghp aghp = this.f65734c;
        EventParcel eventParcel = this.f65732a;
        AppMetadata appMetadata = this.f65733b;
        if (!(!"_cmp".equals(eventParcel.f80132a) || (eventParams = eventParcel.f80133b) == null || eventParams.f80131a.size() == 0)) {
            String c = eventParcel.f80133b.mo44010c("_cis");
            if (!TextUtils.isEmpty(c) && (("referrer broadcast".equals(c) || "referrer API".equals(c)) && aghp.f65526a.mo35680d().mo35320c(appMetadata.f80098a, aghn.f65457M))) {
                aghp.f65526a.mo35497E().f65570i.mo35436a("Event has been filtered ", eventParcel.toString());
                eventParcel = new EventParcel("_cmpx", eventParcel.f80133b, eventParcel.f80134c, eventParcel.f80135d);
            }
        }
        this.f65734c.f65526a.mo35701y();
        this.f65734c.f65526a.mo35669a(eventParcel, this.f65733b);
    }
}
