package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: aele */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aele extends rtm implements rkk {

    /* renamed from: b */
    public final int f63482b;

    /* renamed from: c */
    public final Status f63483c;

    /* renamed from: d */
    private final String f63484d;

    /* renamed from: a */
    public static aele m52094a(Intent intent) {
        ArrayList b;
        if (intent == null || !intent.hasExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.PLACE_LIST_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.STATUS_EXTRA_KEY") || !intent.hasExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.TRANSITION_EXTRA_KEY") || (b = sef.m35076b(intent, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.PLACE_LIST_EXTRA_KEY", NearbyLikelihoodEntity.CREATOR)) == null) {
            return null;
        }
        Status status = (Status) sef.m35067a(intent, "com.google.android.gms.location.places.NearbyLikelihoodBuffer.STATUS_EXTRA_KEY", Status.CREATOR);
        if (status == null) {
            status = Status.f30109c;
        }
        return new aele(status.f30115i, b, intent.getIntExtra("com.google.android.gms.location.places.NearbyLikelihoodBuffer.TRANSITION_EXTRA_KEY", 0));
    }

    /* renamed from: b */
    public final aeld mo24661a(int i) {
        return new aent(this.f43665a, i);
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f63483c;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("status", this.f63483c);
        a.mo25396a("attributions", this.f63484d);
        return a.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public aele(int i, List list, int i2) {
        super(r7);
        rtu a = DataHolder.m22537a(aeok.f63573b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NearbyLikelihoodEntity nearbyLikelihoodEntity = (NearbyLikelihoodEntity) it.next();
                ContentValues s = nearbyLikelihoodEntity.f79533a.mo43688s();
                s.put("place_likelihood", Float.valueOf(nearbyLikelihoodEntity.f79534b));
                a.mo25160a(s);
                linkedHashSet.addAll(nearbyLikelihoodEntity.f79533a.f79548n);
            }
        }
        String a2 = aemu.m52174a(linkedHashSet);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(a2)) {
            bundle.putString("com.google.android.gms.location.places.NearbyLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY", a2);
        }
        DataHolder a3 = a.mo25164a(i, bundle);
        Status b = aemj.m52157b(a3.f30165e);
        this.f63483c = b;
        this.f63482b = !b.mo17710c() ? 0 : i2;
        Bundle bundle2 = a3.f30166f;
        this.f63484d = bundle2 != null ? bundle2.getString("com.google.android.gms.location.places.NearbyLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY") : null;
    }
}
