package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: adjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjj extends sji {

    /* renamed from: a */
    private static final adfs f61912a = new adfs("DomainFilterUpdateOperation");

    /* renamed from: d */
    private final adje f61913d;

    /* renamed from: e */
    private final rnt f61914e;

    /* renamed from: f */
    private final camh f61915f;

    public adjj(adje adje, rnt rnt, camh camh) {
        super(121, "DomainFilterUpdateOperation");
        this.f61913d = adje;
        this.f61914e = rnt;
        this.f61915f = camh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        int a = this.f61913d.mo33558a(this.f61915f);
        if (a == 1) {
            this.f61914e.mo11797a(Status.f30107a);
            return;
        }
        f61912a.mo33429c("Could not update domain filter immediately. Status: %d, domainFilterRequestType: %s", Integer.valueOf(a), this.f61915f.name());
        this.f61914e.mo11797a(Status.f30111e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11357a(Status status) {
        this.f61914e.mo11797a(status);
    }
}
