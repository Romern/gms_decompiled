package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlobalSearchApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fri();

    /* renamed from: a */
    public final GlobalSearchApplicationInfo f9559a;

    /* renamed from: b */
    public final GlobalSearchAppCorpusFeatures[] f9560b;

    /* renamed from: c */
    public final boolean f9561c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, boolean z, Map map) {
        this(globalSearchApplicationInfo, r0, z);
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr;
        if (map != null) {
            globalSearchAppCorpusFeaturesArr = new GlobalSearchAppCorpusFeatures[map.size()];
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                sdo.m34959a((Object) str);
                globalSearchAppCorpusFeaturesArr[i] = new GlobalSearchAppCorpusFeatures(str, (Feature[]) sdo.m34959a((Feature[]) entry.getValue()));
                i++;
            }
        } else {
            globalSearchAppCorpusFeaturesArr = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchApplication) {
            GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) obj;
            return sdg.m34949a(this.f9559a, globalSearchApplication.f9559a) && sdg.m34949a(Boolean.valueOf(this.f9561c), Boolean.valueOf(globalSearchApplication.f9561c)) && Arrays.equals(this.f9560b, globalSearchApplication.f9560b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9559a, Boolean.valueOf(this.f9561c), Integer.valueOf(Arrays.hashCode(this.f9560b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        fri.m12223a(this, parcel, i);
    }

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalSearchApplicationInfo, GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr, boolean z) {
        this.f9559a = globalSearchApplicationInfo;
        this.f9560b = globalSearchAppCorpusFeaturesArr;
        this.f9561c = z;
    }
}
