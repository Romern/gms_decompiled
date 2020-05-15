package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.UntrashResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uen extends ucg {

    /* renamed from: f */
    private final UntrashResourceRequest f47362f;

    public uen(ubk ubk, UntrashResourceRequest untrashResourceRequest, uto uto) {
        super("UntrashResourceOperation", ubk, uto, 33);
        this.f47362f = untrashResourceRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47362f, "Invalid untrash request.");
        aaal.m21020a(this.f47362f.f30926a, "Invalid untrash request.");
        this.f47237a.mo27082a(this.f47362f.f30926a, this.f47239c, false);
        this.f47238b.mo27971a();
    }
}
