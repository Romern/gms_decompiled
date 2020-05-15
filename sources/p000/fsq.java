package p000;

import android.text.TextUtils;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* renamed from: fsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fsq {
    /* renamed from: a */
    private static double m12256a(Feature feature) {
        String a = feature.mo7177a("factor");
        if (a != null) {
            return Double.parseDouble(a);
        }
        return 1.0d;
    }

    /* renamed from: b */
    public static double m12260b(RegisterSectionInfo registerSectionInfo) {
        Feature a = registerSectionInfo.mo7218a(2);
        if (a != null) {
            return m12256a(a);
        }
        return 1.0d;
    }

    /* renamed from: c */
    public static double m12262c(RegisterSectionInfo registerSectionInfo) {
        Feature a = registerSectionInfo.mo7218a(3);
        if (a != null) {
            return m12256a(a);
        }
        return 1.0d;
    }

    /* renamed from: a */
    public static Feature m12257a() {
        return new Feature(1);
    }

    /* renamed from: b */
    public static Feature m12261b() {
        return new Feature(4);
    }

    /* renamed from: c */
    public static Feature m12263c() {
        return new Feature(5);
    }

    /* renamed from: a */
    public static Feature m12258a(String... strArr) {
        Feature feature = new Feature(6);
        feature.mo7178a("annotators", TextUtils.join(",", (Object[]) sdo.m34959a(strArr)));
        return feature;
    }

    /* renamed from: a */
    public static boolean m12259a(RegisterSectionInfo registerSectionInfo) {
        return registerSectionInfo.mo7218a(4) != null;
    }
}
