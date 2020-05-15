package p000;

import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;

/* renamed from: axse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axse extends axpu {

    /* renamed from: a */
    private axot f96296a;

    /* renamed from: b */
    private rod f96297b;

    /* renamed from: c */
    private IntentFilter[] f96298c;

    public axse(rkb rkb, axot axot, rod rod, IntentFilter[] intentFilterArr) {
        super(rkb);
        sdo.m34959a(axot);
        this.f96296a = axot;
        sdo.m34959a(rod);
        this.f96297b = rod;
        this.f96298c = (IntentFilter[]) sdo.m34959a(intentFilterArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((axtl) rjd).mo53532a(this, this.f96296a, this.f96297b, this.f96298c);
        this.f96296a = null;
        this.f96297b = null;
        this.f96298c = null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        this.f96296a = null;
        this.f96297b = null;
        this.f96298c = null;
        return status;
    }
}
