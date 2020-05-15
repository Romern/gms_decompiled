package p000;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import java.util.Arrays;

/* renamed from: uzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzo extends uza implements uwb {

    /* renamed from: c */
    public static final uyt f48768c = new uzn();

    public uzo() {
        super("customProperties", Arrays.asList("hasCustomProperties", "sqlId"), Arrays.asList("customPropertiesExtra", "customPropertiesExtraHolder"), 5000000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28083a(Object obj, Object obj2) {
        uyp uyp = new uyp();
        uyp.mo28113a((AppVisibleCustomProperties) obj2);
        uyp.mo28113a((AppVisibleCustomProperties) obj);
        return uyp.mo28111a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        DataHolder dataHolder2 = dataHolder;
        Bundle bundle = dataHolder2.f30166f;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("customPropertiesExtra");
        if (sparseParcelableArray == null) {
            if (bundle.getParcelable("customPropertiesExtraHolder") != null) {
                synchronized (dataHolder) {
                    DataHolder dataHolder3 = (DataHolder) dataHolder2.f30166f.getParcelable("customPropertiesExtraHolder");
                    if (dataHolder3 != null) {
                        try {
                            Bundle bundle2 = dataHolder3.f30166f;
                            String string = bundle2.getString("entryIdColumn");
                            String string2 = bundle2.getString("keyColumn");
                            String string3 = bundle2.getString("visibilityColumn");
                            String string4 = bundle2.getString("valueColumn");
                            C1230nw nwVar = new C1230nw();
                            for (int i3 = 0; i3 < dataHolder3.f30168h; i3++) {
                                int a = dataHolder3.mo17762a(i3);
                                long a2 = dataHolder3.mo17763a(string, i3, a);
                                String c = dataHolder3.mo17769c(string2, i3, a);
                                int b = dataHolder3.mo17767b(string3, i3, a);
                                CustomProperty customProperty = new CustomProperty(new CustomPropertyKey(c, b), dataHolder3.mo17769c(string4, i3, a));
                                uyp uyp = (uyp) nwVar.mo15534a(a2);
                                if (uyp == null) {
                                    uyp = new uyp();
                                    nwVar.mo15540b(a2, uyp);
                                }
                                uyp.mo28114a(customProperty);
                            }
                            SparseArray sparseArray = new SparseArray();
                            for (int i4 = 0; i4 < dataHolder2.f30168h; i4++) {
                                uyp uyp2 = (uyp) nwVar.mo15534a(dataHolder2.mo17763a("sqlId", i4, dataHolder2.mo17762a(i4)));
                                if (uyp2 != null) {
                                    sparseArray.append(i4, uyp2.mo28111a());
                                }
                            }
                            dataHolder2.f30166f.putSparseParcelableArray("customPropertiesExtra", sparseArray);
                        } finally {
                            dataHolder3.close();
                            dataHolder2.f30166f.remove("customPropertiesExtraHolder");
                        }
                    }
                }
                sparseParcelableArray = bundle.getSparseParcelableArray("customPropertiesExtra");
            }
            if (sparseParcelableArray == null) {
                return AppVisibleCustomProperties.f31066a;
            }
        }
        return (AppVisibleCustomProperties) sparseParcelableArray.get(i, AppVisibleCustomProperties.f31066a);
    }
}
