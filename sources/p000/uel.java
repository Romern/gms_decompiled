package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.TrashResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uel extends ucg {

    /* renamed from: f */
    private final TrashResourceRequest f47360f;

    public uel(ubk ubk, TrashResourceRequest trashResourceRequest, uto uto) {
        super("TrashResourceOperation", ubk, uto, 21);
        this.f47360f = trashResourceRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        aaal.m21020a(this.f47360f, "Invalid trash request.");
        aaal.m21020a(this.f47360f.f30924a, "Invalid trash request.");
        this.f47237a.mo27082a(this.f47360f.f30924a, this.f47239c, true);
        this.f47238b.mo27971a();
    }
}
