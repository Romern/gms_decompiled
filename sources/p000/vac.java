package p000;

import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vac extends vbk {

    /* renamed from: a */
    private final List f48802a = new ArrayList();

    public vac(vbh vbh) {
        super(vbh);
    }

    /* renamed from: a */
    public final DriveId mo28156a(uos uos, vkr vkr, boolean z) {
        DriveId a = super.mo28156a(uos, vkr, z);
        if (a != null) {
            this.f48802a.add(vkr.mo28572g());
        }
        return a;
    }

    /* renamed from: a */
    public final List mo28157a() {
        return Collections.unmodifiableList(this.f48802a);
    }
}
