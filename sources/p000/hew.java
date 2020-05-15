package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: hew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hew extends aaab {

    /* renamed from: a */
    public final bqgy f19623a = bqgy.m112818c();

    /* renamed from: b */
    private final hep f19624b;

    /* renamed from: c */
    private final String f19625c;

    public hew(int i, String str, String str2, hep hep) {
        super(i, str);
        this.f19624b = hep;
        this.f19625c = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqga.m112781a(((het) het.f19617a.mo33309a()).mo12446a(this.f19624b, this.f19625c), new hev(this), bqfb.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f19623a.mo69136a((Throwable) adbe.m50108a("Error when executing the operation.", status.f30115i));
    }
}
