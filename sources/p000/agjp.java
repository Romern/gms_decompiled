package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: agjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UserAttributeParcel f65741a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f65742b;

    /* renamed from: c */
    final /* synthetic */ aghp f65743c;

    public agjp(aghp aghp, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.f65743c = aghp;
        this.f65741a = userAttributeParcel;
        this.f65742b = appMetadata;
    }

    public final void run() {
        this.f65743c.f65526a.mo35701y();
        if (this.f65741a.mo44016a() == null) {
            this.f65743c.f65526a.mo35677b(this.f65741a, this.f65742b);
        } else {
            this.f65743c.f65526a.mo35671a(this.f65741a, this.f65742b);
        }
    }
}
