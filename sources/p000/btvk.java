package p000;

import android.content.Context;

/* renamed from: btvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvk {

    /* renamed from: a */
    private static final String[] f152618a = {"ia_low_quality_sensor_timing.binaryproto", "ia_high_quality_sensor_timing.binaryproto", "ia_high_quality_sensor_timing_background_magcal.binaryproto", "ia_resilient_low_quality_sensor_timing.binaryproto", "ia_resilient_high_quality_sensor_timing.binaryproto", "ia_gb_resilient_low_quality_sensor_timing.binaryproto", "ia_gb_resilient_high_quality_sensor_timing.binaryproto", "ia_blue_pixel.binaryproto"};

    /* renamed from: b */
    private static final String[] f152619b = {"ia_heading_uncertainty_model_empirical_uncal_low_stddev.binaryproto", "ia_heading_uncertainty_model_empirical_uncal_med_stddev.binaryproto", "ia_heading_uncertainty_model_empirical_uncal_high_stddev.binaryproto"};

    /* renamed from: a */
    public static btvy m118920a(Context context, Integer num) {
        if (num.intValue() >= f152618a.length || num.intValue() < 0) {
            num = 0;
        }
        return (btvy) GeneratedMessageLite.m124014a(btvy.f152660f, srz.m36178b(context.getAssets().open(f152618a[num.intValue()])));
    }

    /* renamed from: b */
    public static btvw m118921b(Context context, Integer num) {
        if (num.intValue() >= f152619b.length || num.intValue() < 0) {
            num = 0;
        }
        return (btvw) GeneratedMessageLite.m124014a(btvw.f152646a, srz.m36178b(context.getAssets().open(f152619b[num.intValue()])));
    }
}
