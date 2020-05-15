package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: uzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzk extends uyz {
    public uzk() {
        super("spaces", Arrays.asList("inDriveSpace", "isAppData", "inGooglePhotosSpace"), Collections.emptySet(), 7000000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        return mo28092c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Collection mo28096d(DataHolder dataHolder, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (dataHolder.mo17771d("inDriveSpace", i, i2)) {
            arrayList.add(DriveSpace.f30734a);
        }
        if (dataHolder.mo17771d("isAppData", i, i2)) {
            arrayList.add(DriveSpace.f30735b);
        }
        if (dataHolder.mo17771d("inGooglePhotosSpace", i, i2)) {
            arrayList.add(DriveSpace.f30736c);
        }
        return arrayList;
    }
}
