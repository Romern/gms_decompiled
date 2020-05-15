package p000;

import android.util.Log;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.UUID;

/* renamed from: ilo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilo {

    /* renamed from: a */
    public static final imo f21297a = new iln();

    /* renamed from: b */
    private static final Logger f21298b = new Logger("GLSActivity", "ClientIdentityHelper");

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* renamed from: a */
    public final AppDescription mo13121a(int i, int i2, String str, int i3, ilq ilq) {
        boolean z;
        String uuid = UUID.randomUUID().toString();
        String[] a = ilq.f21308c.mo26175a(i3);
        if (a != null) {
            int i4 = 0;
            while (true) {
                if (i4 < a.length) {
                    if (str.equals(a[i4])) {
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            boolean a2 = ilq.mo13124a(i2);
            boolean a3 = ilq.mo13124a(i3);
            if (z && (i3 == i2 || a2)) {
                return new AppDescription(str, i3, uuid, uuid);
            }
            if (!z) {
                String format = String.format("[%s] Apps with uid %s cannot masquerade as package %s in uid %s. [isClientAllowedToMasquerade? %s]", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Boolean.valueOf(a2));
                gin gin = new gin(format);
                f21298b.mo25415d(format, gin, new Object[0]);
                throw gin;
            } else if (a2 && a3) {
                return new AppDescription(str, i3, uuid, uuid);
            } else {
                String format2 = String.format("Fraud! Package %s isn't associated with uid %s!", str, Integer.valueOf(i3));
                ghz ghz = new ghz(format2);
                f21298b.mo25415d(format2, ghz, new Object[0]);
                throw ghz;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("Package not matching uid ");
        sb.append(i3);
        sb.append(" ");
        sb.append(str);
        Log.w("GLSActivity", sb.toString());
        z = false;
        boolean a22 = ilq.mo13124a(i2);
        boolean a32 = ilq.mo13124a(i3);
        if (z) {
            return new AppDescription(str, i3, uuid, uuid);
        }
        if (!z) {
        }
    }
}
