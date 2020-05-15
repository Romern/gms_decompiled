package p000;

import com.google.android.gms.drive.DriveId;

/* renamed from: twz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class twz implements rty {
    /* renamed from: a */
    public final DriveId mo26854a() {
        return (DriveId) mo26855a(uzm.f48742a);
    }

    /* renamed from: a */
    public abstract Object mo26855a(uvy uvy);

    /* renamed from: b */
    public final String mo26856b() {
        return (String) mo26855a(uzm.f48748g);
    }

    /* renamed from: c */
    public final String mo26857c() {
        return (String) mo26855a(uzm.f48738N);
    }

    /* renamed from: d */
    public final String mo26858d() {
        return (String) mo26855a(uzm.f48741Q);
    }

    /* renamed from: f */
    public final boolean mo26859f() {
        return "application/vnd.google-apps.folder".equals(mo26857c());
    }

    /* renamed from: g */
    public final boolean mo26860g() {
        Boolean bool = (Boolean) mo26855a(uzm.f48758q);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo26861h() {
        Boolean bool = (Boolean) mo26855a(uzm.f48740P);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
