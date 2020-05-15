package p000;

import com.google.android.gms.auth.authzen.Permit;
import com.google.android.gms.auth.authzen.PermitAccess;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ifm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifm {

    /* renamed from: a */
    public String f20860a;

    /* renamed from: b */
    public String f20861b;

    /* renamed from: c */
    public String f20862c;

    /* renamed from: d */
    public PermitAccess f20863d;

    /* renamed from: e */
    public final Map f20864e = new LinkedHashMap();

    /* renamed from: f */
    public final Set f20865f = new HashSet();

    /* renamed from: a */
    public final Permit mo12967a() {
        return new Permit(2, this.f20860a, this.f20861b, this.f20862c, this.f20863d, this.f20864e, this.f20865f);
    }

    /* renamed from: a */
    public final void mo12968a(PermitAccess permitAccess) {
        this.f20864e.put(permitAccess.f10391b, permitAccess);
    }

    /* renamed from: a */
    public final void mo12969a(String str) {
        this.f20865f.add(str);
    }
}
