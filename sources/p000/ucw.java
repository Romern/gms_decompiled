package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.CreateContentsRequest;
import com.google.android.gms.drive.internal.OnContentsResponse;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucw extends ucg {

    /* renamed from: f */
    private final ubq f47279f;

    /* renamed from: g */
    private final CreateContentsRequest f47280g;

    public ucw(ubk ubk, ubq ubq, CreateContentsRequest createContentsRequest, uto uto) {
        super("CreateContentsOperation", ubk, uto, 3);
        this.f47279f = ubq;
        this.f47280g = createContentsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        this.f47239c.mo28295b(this.f47280g.f30829a);
        this.f47238b.mo27975a(new OnContentsResponse(this.f47279f.mo27162a(mo27233b(), this.f47280g.f30829a, this.f47238b.asBinder()), false));
    }
}
