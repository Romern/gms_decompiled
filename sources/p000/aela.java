package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aela */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aela extends rtm implements rkk {

    /* renamed from: b */
    private final String f63478b;

    /* renamed from: c */
    private final int f63479c;

    /* renamed from: d */
    private final Status f63480d;

    /* renamed from: e */
    private final boolean f63481e;

    public aela(DataHolder dataHolder, boolean z, int i) {
        super(dataHolder);
        this.f63480d = aemj.m52157b(dataHolder.f30165e);
        switch (i) {
            case 100:
            case 101:
            case 102:
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
            case ErrorInfo.TYPE_SDU_FAILED:
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
            case 106:
            case 107:
            case 108:
                this.f63479c = i;
                this.f63481e = z;
                Bundle bundle = dataHolder.f30166f;
                if (bundle != null) {
                    this.f63478b = bundle.getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
                    return;
                } else {
                    this.f63478b = null;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder(27);
                sb.append("invalid source: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24661a(int i) {
        return new rtr(this.f43665a, i);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63480d;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f63480d);
        a.mo25396a("attributions", this.f63478b);
        return a.toString();
    }

    /* renamed from: a */
    public final void mo34289a(Intent intent) {
        ArrayList arrayList = new ArrayList(mo24660a());
        Iterator it = iterator();
        long j = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aekz aekz = (aekz) ((aekz) it.next()).mo7556bF();
            if (aekz instanceof HierarchicalPlaceLikelihoodEntity) {
                HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) aekz;
                j += (long) sef.m35074a(hierarchicalPlaceLikelihoodEntity).length;
                if (j <= 400000) {
                    arrayList.add(hierarchicalPlaceLikelihoodEntity);
                } else if (Log.isLoggable("HPlaceLikelihoodBuffer", 5)) {
                    Log.w("HPlaceLikelihoodBuffer", String.format("Reached Binder size limit. Returned %d of %d results", Integer.valueOf(arrayList.size()), Integer.valueOf(mo24660a())));
                }
            }
        }
        sef.m35072a(arrayList, intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY");
        sef.m35071a(this.f63480d, intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY");
        intent.putExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", this.f63479c);
        intent.putExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY", this.f63481e);
    }
}
