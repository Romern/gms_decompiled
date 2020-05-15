package p000;

import android.content.Context;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.CloseContentsRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: uda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uda extends ucg {

    /* renamed from: f */
    private final ubq f47286f;

    /* renamed from: g */
    private final CloseContentsRequest f47287g;

    public uda(ubk ubk, ubq ubq, CloseContentsRequest closeContentsRequest, uto uto) {
        super("DiscardContentsOperation", ubk, uto, 8);
        this.f47286f = ubq;
        this.f47287g = closeContentsRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        int i;
        boolean z;
        aaal.m21020a(this.f47287g, "Invalid close request: no request");
        CloseContentsRequest closeContentsRequest = this.f47287g;
        Contents contents = closeContentsRequest.f30823a;
        if (contents != null) {
            int i2 = contents.f30721b;
            srz.m36170a(contents.f30720a);
            i = i2;
        } else {
            i = closeContentsRequest.f30825c;
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        aaal.m21021a(z, "Invalid close request: no contents");
        aaal.m21020a(this.f47287g.f30824b, "Invalid close request: doesn't include save state");
        sdo.m34975b(true ^ this.f47287g.f30824b.booleanValue(), "DiscardContentsOperation wants to save contents.");
        this.f47286f.mo27167a(mo27233b(), i, MetadataBundle.m23056a(), this.f47287g.f30824b.booleanValue(), uaw.f47070a);
        this.f47238b.mo27971a();
    }
}
