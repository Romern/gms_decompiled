package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: bfdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfdi {

    /* renamed from: a */
    public static final Pattern f113486a = Pattern.compile("com.google.android.apps.maps.*");

    /* renamed from: b */
    public static final Map f113487b;

    static {
        bfdh bfdh = new bfdh("com.google.android.apps.modis", false, true, bfgt.f113809C, false);
        bfdh bfdh2 = new bfdh("com.google.android.apps.activitydatacollection", false, true, bfgt.f113809C, false);
        bfdh bfdh3 = new bfdh("com.google.android.apps.maps", false, true, bfgt.f113809C, false);
        bfdh bfdh4 = new bfdh("com.google.android.gms", false, true, bfgt.f113809C, false);
        bfdh bfdh5 = new bfdh("com.google.nlpdemoapp", false, true, bfgt.f113809C, false);
        bfdh bfdh6 = new bfdh("com.google.android.apps.location.khamsin", false, true, bfgt.f113809C, false);
        bfdh bfdh7 = new bfdh("com.google.android.apps.highfive", false, false, bfgt.f113809C, false);
        bfdh bfdh8 = new bfdh("com.google.location.lbs.collectionlib", true, false, bfgt.m96707a(bfgt.f113811a, bfgt.f113812b, bfgt.f113814d, bfgt.f113817g, bfgt.f113818h, bfgt.f113827q, bfgt.f113828r, bfgt.f113814d, bfgt.f113815e, bfgt.f113816f, bfgt.f113819i), true);
        bfdh bfdh9 = new bfdh("com.google.location.lbs.activityclassifierapp", false, false, bfgt.f113809C, false);
        bfdh bfdh10 = new bfdh("com.google.android.apps.activityhistory", true, false, bfgt.f113809C, false);
        bfdh bfdh11 = new bfdh("com.google.android.apps.activityhistory.dogfood", true, false, bfgt.f113809C, false);
        bfdh bfdh12 = new bfdh("com.google.android.context.activity.dnd", true, false, bfgt.f113809C, false);
        bfdh bfdh13 = new bfdh("com.google.android.apps.location.context.activity.zen", true, false, bfgt.f113809C, false);
        bfdh bfdh14 = new bfdh("com.google.android.apps.location.context.activity.sleep", true, false, bfgt.f113809C, false);
        HashMap hashMap = new HashMap();
        hashMap.put(bfdh.f113481a, bfdh);
        hashMap.put(bfdh2.f113481a, bfdh2);
        hashMap.put(bfdh3.f113481a, bfdh3);
        hashMap.put(bfdh4.f113481a, bfdh4);
        hashMap.put(bfdh7.f113481a, bfdh7);
        hashMap.put(bfdh8.f113481a, bfdh8);
        hashMap.put(bfdh5.f113481a, bfdh5);
        hashMap.put(bfdh6.f113481a, bfdh6);
        hashMap.put(bfdh9.f113481a, bfdh9);
        hashMap.put(bfdh10.f113481a, bfdh10);
        hashMap.put(bfdh11.f113481a, bfdh10);
        hashMap.put(bfdh12.f113481a, bfdh12);
        hashMap.put(bfdh13.f113481a, bfdh13);
        hashMap.put(bfdh14.f113481a, bfdh14);
        f113487b = Collections.unmodifiableMap(hashMap);
    }
}
