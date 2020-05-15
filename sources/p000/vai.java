package p000;

import android.content.SyncResult;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vai {

    /* renamed from: a */
    public static final sbw f48831a = new sbw("PreparedSyncMoreImpl", "");

    /* renamed from: b */
    public final AtomicBoolean f48832b = new AtomicBoolean(false);

    /* renamed from: c */
    public final vpu f48833c;

    /* renamed from: d */
    public final uih f48834d;

    /* renamed from: e */
    public final uli f48835e;

    /* renamed from: f */
    public final vac f48836f;

    /* renamed from: g */
    public final SyncResult f48837g;

    public vai(vpu vpu, uih uih, uli uli, vbh vbh, SyncResult syncResult) {
        sdo.m34959a(vpu);
        this.f48833c = vpu;
        this.f48834d = uih;
        this.f48835e = uli;
        this.f48836f = new vac(vbh);
        this.f48837g = syncResult;
    }

    /* renamed from: a */
    public final vag mo28160a(boolean z) {
        return new vag(z, this.f48836f.mo28157a().size(), this.f48837g.hasSoftError());
    }

    public final String toString() {
        return String.format(Locale.US, "PreparedSyncMore[%s]", this.f48834d.f47682a);
    }
}
