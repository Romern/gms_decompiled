package p000;

import com.google.android.gms.drive.DriveId;
import java.util.Arrays;

/* renamed from: vhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vhb {

    /* renamed from: a */
    public DriveId f49249a;

    /* renamed from: b */
    public String f49250b;

    /* renamed from: c */
    public final uey f49251c;

    /* renamed from: d */
    public final uih f49252d;

    /* renamed from: e */
    public final String f49253e;

    public vhb(DriveId driveId, uey uey) {
        this.f49249a = driveId;
        this.f49251c = uey;
        this.f49252d = uey.f47394a;
        this.f49253e = uey.f47395b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vhb vhb = (vhb) obj;
            return bkwv.m106779a(this.f49249a, vhb.f49249a) && bkwv.m106779a(this.f49252d, vhb.f49252d) && bkwv.m106779a(this.f49253e, vhb.f49253e) && bkwv.m106779a(this.f49250b, vhb.f49250b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49249a, this.f49250b, this.f49252d, this.f49253e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f49249a);
        String str = this.f49250b;
        String valueOf2 = String.valueOf(this.f49252d);
        String str2 = this.f49253e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 44 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("[driveId: ");
        sb.append(valueOf);
        sb.append(", localId: ");
        sb.append(str);
        sb.append(", account: ");
        sb.append(valueOf2);
        sb.append(", sdkAppId:");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public vhb(DriveId driveId, uih uih, String str) {
        this.f49249a = driveId;
        this.f49251c = null;
        this.f49252d = uih;
        this.f49253e = str;
    }

    public vhb(String str, uey uey) {
        this.f49250b = str;
        this.f49251c = uey;
        this.f49252d = uey.f47394a;
        this.f49253e = uey.f47395b;
    }
}
