package p000;

import android.net.Uri;
import android.util.Log;

/* renamed from: aphk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphk implements Runnable {

    /* renamed from: a */
    private final aphv f84379a;

    /* renamed from: b */
    private final int f84380b;

    /* renamed from: c */
    private final aapx f84381c;

    /* renamed from: d */
    private final apid f84382d;

    /* renamed from: e */
    private final aeco f84383e;

    /* renamed from: f */
    private final aeab f84384f;

    /* renamed from: g */
    private final Uri f84385g;

    /* renamed from: h */
    private final int f84386h;

    public aphk(int i, aphv aphv, aapx aapx, apid apid, aeco aeco, aeab aeab, Uri uri, int i2) {
        this.f84380b = i;
        this.f84379a = aphv;
        this.f84381c = aapx;
        this.f84382d = apid;
        this.f84383e = aeco;
        this.f84384f = aeab;
        this.f84385g = uri;
        this.f84386h = i2;
    }

    /* renamed from: a */
    public static aphk m70299a(aphv aphv, aapx aapx) {
        return new aphk(5, aphv, aapx, null, null, null, null, -1);
    }

    /* renamed from: b */
    static aphk m70300b(aphv aphv, aapx aapx) {
        return new aphk(6, aphv, aapx, null, null, null, null, -1);
    }

    public final void run() {
        switch (this.f84380b) {
            case 1:
                this.f84379a.mo47226a();
                return;
            case 2:
                apid apid = this.f84382d;
                if (apid != null && aphm.m70305b(apid)) {
                    this.f84379a.mo47231a(this.f84382d);
                    return;
                }
                String valueOf = String.valueOf(this.f84382d);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("Running in whitelist mode. Ignoring task: ");
                sb.append(valueOf);
                Log.w("NetworkScheduler", sb.toString());
                return;
            case 3:
                this.f84379a.mo47230a(this.f84383e);
                return;
            case 4:
                this.f84379a.mo47235b(this.f84383e);
                return;
            case 5:
                this.f84379a.mo47228a(this.f84381c);
                return;
            case 6:
                this.f84379a.mo47234b(this.f84381c);
                return;
            case 7:
                this.f84379a.mo47229a(this.f84384f, this.f84385g, this.f84386h);
                return;
            default:
                this.f84379a.mo47227a(this.f84386h);
                return;
        }
    }
}
