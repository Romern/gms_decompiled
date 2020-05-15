package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: akot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class akot extends aaab {

    /* renamed from: a */
    private final akou f72366a;

    public akot(akou akou, String str) {
        super(110, str);
        this.f72366a = akou;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f72366a.mo39615a(mo39614b(context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Status mo39614b(Context context);

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f72366a.mo39615a(status);
    }
}
