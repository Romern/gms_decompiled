package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqyq {

    /* renamed from: a */
    public boolean f87111a = false;

    /* renamed from: b */
    private final ArrayList f87112b = new ArrayList();

    /* renamed from: c */
    private final Map f87113c = new HashMap();

    /* renamed from: a */
    public final BootstrapConfigurations mo48280a() {
        if (this.f87112b.size() != 0) {
            BootstrapConfigurations bootstrapConfigurations = new BootstrapConfigurations();
            bootstrapConfigurations.mo59036a(this.f87112b);
            bootstrapConfigurations.mo59037a(this.f87113c);
            bootstrapConfigurations.mo59042d();
            bootstrapConfigurations.mo59038a(this.f87111a);
            return bootstrapConfigurations;
        }
        throw new IllegalArgumentException("Cannot build CompanionBootstrapOptions with zero accounts");
    }

    /* renamed from: a */
    public final void mo48281a(String str, String str2) {
        Map map = this.f87113c;
        sdo.m34959a((Object) str);
        sdo.m34959a((Object) str2);
        map.put(str, str2);
    }

    /* renamed from: a */
    public final void mo48282a(ArrayList arrayList) {
        this.f87112b.addAll(arrayList);
    }
}
