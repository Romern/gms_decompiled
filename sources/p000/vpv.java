package p000;

import com.google.android.gms.drive.DriveSpace;
import java.util.Iterator;
import java.util.Set;

/* renamed from: vpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpv {
    /* renamed from: a */
    public static Set m41035a(uey uey, Set set) {
        Set set2 = uey.f47398e;
        if (set.isEmpty()) {
            C1225nr nrVar = new C1225nr();
            if (set2.contains(twt.f46774c) || set2.contains(twt.f46772a)) {
                nrVar.add(DriveSpace.f30734a);
            }
            if (set2.contains(twt.f46773b)) {
                nrVar.add(DriveSpace.f30735b);
            }
            if (!nrVar.isEmpty()) {
                return nrVar;
            }
            throw new aaaj(10, "The scopes requested imply no spaces. Request more scopes or explicitly request some spaces");
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DriveSpace driveSpace = (DriveSpace) it.next();
            if (DriveSpace.f30734a.equals(driveSpace)) {
                if (!set2.contains(twt.f46774c) && !set2.contains(twt.f46772a)) {
                    throw new aaaj(10, "Can't request the DRIVE space without FILE scope");
                }
            } else if (DriveSpace.f30735b.equals(driveSpace)) {
                if (!set2.contains(twt.f46773b)) {
                    throw new aaaj(10, "Can't request the APP_DATA_FOLDER space without APPFOLDER scope");
                }
            } else if (!DriveSpace.f30736c.equals(driveSpace)) {
                String valueOf = String.valueOf(driveSpace);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Unrecognized space: ");
                sb.append(valueOf);
                throw new aaaj(10, sb.toString());
            } else if (!uey.mo27265b()) {
                throw new aaaj(10, "The PHOTOS space is exclusive to the Google Drive app");
            }
        }
        return set;
    }
}
