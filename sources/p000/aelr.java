package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

@Deprecated
/* renamed from: aelr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aelr extends rtm implements rkk {

    /* renamed from: b */
    private static final Comparator f63495b = new aelq();

    /* renamed from: c */
    private final String f63496c;

    /* renamed from: d */
    private final Status f63497d;

    public aelr(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    /* renamed from: a */
    public static aelr m52131a(Intent intent) {
        ArrayList b;
        if (intent == null || !intent.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY") || (b = sef.m35076b(intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.PLACE_LIST_EXTRA_KEY", HierarchicalPlaceLikelihoodEntity.CREATOR)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) b.get(i);
            float f = hierarchicalPlaceLikelihoodEntity.f79529c;
            if (f != -1.0f) {
                arrayList.add(PlaceLikelihoodEntity.m66960a(hierarchicalPlaceLikelihoodEntity.f79528b, f));
            }
        }
        Collections.sort(arrayList, f63495b);
        Status status = (Status) sef.m35067a(intent, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.STATUS_EXTRA_KEY", Status.CREATOR);
        if (status == null) {
            status = Status.f30109c;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY", -1);
        rtu a = DataHolder.m22537a(aeok.f63573b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PlaceLikelihoodEntity placeLikelihoodEntity = (PlaceLikelihoodEntity) arrayList.get(i2);
            a.mo25160a(placeLikelihoodEntity.mo43692c());
            linkedHashSet.addAll(placeLikelihoodEntity.f79558a.f79548n);
        }
        String a2 = aemu.m52174a(linkedHashSet);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(a2)) {
            m52132a(bundle, a2);
        }
        intent.getBooleanExtra("com.google.android.gms.location.places.PlaceLikelihoodBuffer.MOCK_PROVIDER_EXTRA_KEY", false);
        return new aelr(a.mo25164a(status.f30115i, bundle), intExtra, null);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63497d;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f63497d);
        a.mo25396a("attributions", this.f63496c);
        return a.toString();
    }

    public aelr(DataHolder dataHolder, int i, byte[] bArr) {
        super(dataHolder);
        Bundle bundle;
        this.f63497d = aemj.m52157b(dataHolder.f30165e);
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
                if (dataHolder == null || (bundle = dataHolder.f30166f) == null) {
                    this.f63496c = null;
                    return;
                } else {
                    this.f63496c = bundle.getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
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
    public static void m52132a(Bundle bundle, String str) {
        bundle.putString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY", str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24661a(int i) {
        return new aeof(this.f43665a, i);
    }
}
