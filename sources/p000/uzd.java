package p000;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
import com.google.android.gms.drive.metadata.internal.PartialDriveId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: uzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzd extends uyz implements uwa {

    /* renamed from: c */
    public static final uyt f48724c = new uzc();

    public uzd() {
        super("parents", Collections.emptySet(), Arrays.asList("parentsExtra", "dbInstanceId", "parentsExtraHolder"), 4100000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo28089b(Bundle bundle) {
        return mo28089b(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        return mo28092c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Collection mo28096d(DataHolder dataHolder, int i, int i2) {
        DataHolder dataHolder2 = dataHolder;
        Bundle bundle = dataHolder2.f30166f;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("parentsExtra");
        if (parcelableArrayList == null) {
            if (bundle.getParcelable("parentsExtraHolder") != null) {
                synchronized (dataHolder) {
                    DataHolder dataHolder3 = (DataHolder) dataHolder2.f30166f.getParcelable("parentsExtraHolder");
                    if (dataHolder3 != null) {
                        try {
                            int i3 = dataHolder2.f30168h;
                            ArrayList arrayList = new ArrayList(i3);
                            HashMap hashMap = new HashMap(i3);
                            for (int i4 = 0; i4 < i3; i4++) {
                                int a = dataHolder2.mo17762a(i4);
                                ParentDriveIdSet parentDriveIdSet = new ParentDriveIdSet(new ArrayList());
                                arrayList.add(parentDriveIdSet);
                                hashMap.put(Long.valueOf(dataHolder2.mo17763a("sqlId", i4, a)), parentDriveIdSet);
                            }
                            Bundle bundle2 = dataHolder3.f30166f;
                            String string = bundle2.getString("childSqlIdColumn");
                            String string2 = bundle2.getString("parentSqlIdColumn");
                            String string3 = bundle2.getString("parentResIdColumn");
                            int i5 = dataHolder3.f30168h;
                            int i6 = 0;
                            while (i6 < i5) {
                                int a2 = dataHolder3.mo17762a(i6);
                                ((ParentDriveIdSet) hashMap.get(Long.valueOf(dataHolder3.mo17763a(string, i6, a2)))).f31072a.add(new PartialDriveId(dataHolder3.mo17769c(string3, i6, a2), dataHolder3.mo17763a(string2, i6, a2), 1));
                                i6++;
                                string3 = string3;
                            }
                            dataHolder2.f30166f.putParcelableArrayList("parentsExtra", arrayList);
                        } finally {
                            dataHolder3.close();
                            dataHolder2.f30166f.remove("parentsExtraHolder");
                        }
                    }
                }
                parcelableArrayList = bundle.getParcelableArrayList("parentsExtra");
            }
            if (parcelableArrayList == null) {
                return null;
            }
        }
        long j = bundle.getLong("dbInstanceId");
        HashSet hashSet = new HashSet();
        List list = ((ParentDriveIdSet) parcelableArrayList.get(i)).f31072a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            PartialDriveId partialDriveId = (PartialDriveId) list.get(i7);
            hashSet.add(new DriveId(partialDriveId.f31073a, partialDriveId.f31074b, j, partialDriveId.f31075c));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Collection mo28128c(Bundle bundle) {
        Collection c = super.mo28089b(bundle);
        if (c != null) {
            return new HashSet(c);
        }
        return null;
    }
}
