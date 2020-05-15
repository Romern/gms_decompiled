package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.Map;

/* renamed from: zqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqk {

    /* renamed from: a */
    public static final bnhe f55697a;

    /* renamed from: b */
    public static final bnic f55698b = bnic.m109494a("com.google.activity.summary", "com.google.blood_glucose.summary", "com.google.blood_pressure.summary", "com.google.body.fat.percentage.summary", "com.google.body.temperature.basal.summary", "com.google.body.temperature.summary", "com.google.calories.bmr.summary", "com.google.heart_rate.summary", "com.google.heart_minutes.summary", "com.google.location.bounding_box", "com.google.nutrition.summary", "com.google.oxygen_saturation.summary", "com.google.power.summary", "com.google.sleep.segment", "com.google.speed.summary", "com.google.height.summary", "com.google.weight.summary", "com.google.internal.goal", "com.google.internal.primary_device", "com.google.internal.sleep_attributes", "com.google.internal.sleep_schedule", bzzo.f172139g.f172336b);

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("com.google.floor_change", zqj.m45967a((int) C0126R.string.fitness_data_type_name_floor_change));
        h.mo67695b("com.google.stride_model", zqj.m45967a((int) C0126R.string.fitness_data_type_name_step_count));
        h.mo67695b("com.google.step_count.cumulative", zqj.m45967a((int) C0126R.string.fitness_data_type_name_step_count));
        h.mo67695b("com.google.step_count.delta", zqj.m45967a((int) C0126R.string.fitness_data_type_name_step_count));
        h.mo67695b("com.google.step_count.cadence", zqj.m45967a((int) C0126R.string.fitness_data_type_name_step_count));
        h.mo67695b(bzzo.f172134b.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_step_count));
        h.mo67695b("com.google.activity.segment", zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b("com.google.activity.sample", zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b("com.google.activity.samples", zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b(bzzo.f172133a.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b(bzzo.f172138f.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b(bzzo.f172140h.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b(bzzo.f172142j.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity));
        h.mo67695b("com.google.calories.consumed", zqj.m45967a((int) C0126R.string.fitness_data_type_name_calories_consumed));
        h.mo67695b("com.google.calories.expended", zqj.m45967a((int) C0126R.string.fitness_data_type_name_calories_expended));
        h.mo67695b(bzzo.f172136d.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_calories_expended));
        h.mo67695b("com.google.calories.bmr", zqj.m45967a((int) C0126R.string.fitness_data_type_name_calories_bmr));
        h.mo67695b("com.google.power.sample", zqj.m45967a((int) C0126R.string.fitness_data_type_name_power_sample));
        h.mo67695b("com.google.heart_rate.bpm", zqj.m45967a((int) C0126R.string.fitness_data_type_name_heart_rate_bpm));
        h.mo67695b("com.google.location.sample", zqj.m45967a((int) C0126R.string.fitness_data_type_name_location));
        h.mo67695b("com.google.location.track", zqj.m45967a((int) C0126R.string.fitness_data_type_name_location));
        h.mo67695b("com.google.internal.sports_model", zqj.m45967a((int) C0126R.string.fitness_data_type_name_location));
        h.mo67695b(bzzo.f172137e.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_location));
        h.mo67695b("com.google.distance.delta", zqj.m45967a((int) C0126R.string.fitness_data_type_name_distance));
        h.mo67695b("com.google.distance.cumulative", zqj.m45967a((int) C0126R.string.fitness_data_type_name_distance));
        h.mo67695b(bzzo.f172135c.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_distance));
        h.mo67695b(bzzo.f172141i.f172336b, zqj.m45967a((int) C0126R.string.fitness_data_type_name_distance));
        h.mo67695b("com.google.speed", zqj.m45967a((int) C0126R.string.fitness_data_type_name_distance));
        h.mo67695b("com.google.cycling.wheel_revolution.cumulative", zqj.m45967a((int) C0126R.string.fitness_data_type_name_cycling_wheel_revolution));
        h.mo67695b("com.google.cycling.wheel_revolution.rpm", zqj.m45967a((int) C0126R.string.fitness_data_type_name_cycling_wheel_revolution));
        h.mo67695b("com.google.cycling.pedaling.cumulative", zqj.m45967a((int) C0126R.string.fitness_data_type_name_cycling_pedal_revolution));
        h.mo67695b("com.google.cycling.pedaling.cadence", zqj.m45967a((int) C0126R.string.fitness_data_type_name_cycling_pedal_revolution));
        h.mo67695b("com.google.height", zqj.m45967a((int) C0126R.string.fitness_data_type_name_height));
        h.mo67695b("com.google.weight", zqj.m45967a((int) C0126R.string.fitness_data_type_name_weight));
        h.mo67695b("com.google.body.fat.percentage", zqj.m45967a((int) C0126R.string.fitness_data_type_name_body_fat_percentage));
        h.mo67695b("com.google.nutrition", zqj.m45967a((int) C0126R.string.fitness_data_type_name_nutrition));
        h.mo67695b("com.google.hydration", zqj.m45967a((int) C0126R.string.fitness_data_type_name_hydration));
        h.mo67695b("com.google.activity.exercise", zqj.m45967a((int) C0126R.string.fitness_data_type_name_activity_exercise));
        h.mo67695b("com.google.blood_pressure", zqj.m45967a((int) C0126R.string.fitness_data_type_name_blood_pressure));
        h.mo67695b("com.google.blood_glucose", zqj.m45967a((int) C0126R.string.fitness_data_type_name_blood_glucose));
        h.mo67695b("com.google.oxygen_saturation", zqj.m45967a((int) C0126R.string.fitness_data_type_name_oxygen_saturation));
        h.mo67695b("com.google.body.temperature", zqj.m45967a((int) C0126R.string.fitness_data_type_name_body_temperature));
        h.mo67695b("com.google.body.temperature.basal", zqj.m45967a((int) C0126R.string.fitness_data_type_name_body_temperature_basal));
        h.mo67695b("com.google.cervical_mucus", zqj.m45967a((int) C0126R.string.fitness_data_type_name_cervical_mucus));
        h.mo67695b("com.google.cervical_position", zqj.m45967a((int) C0126R.string.fitness_data_type_name_cervical_position));
        h.mo67695b("com.google.menstruation", zqj.m45967a((int) C0126R.string.fitness_data_type_name_menstruation));
        h.mo67695b("com.google.ovulation_test", zqj.m45967a((int) C0126R.string.fitness_data_type_name_ovulation_test));
        h.mo67695b("com.google.vaginal_spotting", zqj.m45967a((int) C0126R.string.fitness_data_type_name_vaginal_spotting));
        h.mo67695b("com.google.active_minutes", zqj.m45967a((int) C0126R.string.fitness_data_type_name_active_minutes));
        h.mo67695b("com.google.heart_minutes", zqj.m45967a((int) C0126R.string.fitness_data_type_name_heart_minutes));
        h.mo67695b("com.google.sensor.events", zqj.m45967a((int) C0126R.string.fitness_data_type_name_sensor_data));
        h.mo67695b("com.google.device_on_body", zqj.m45967a((int) C0126R.string.fitness_data_type_name_sensor_data));
        f55697a = h.mo67618b();
    }

    /* renamed from: a */
    public static bngx m45969a(zqj zqj) {
        if (zqj instanceof zqi) {
            return bngx.m109356a(((zqi) zqj).f55696a);
        }
        bngs j = bngx.m109377j();
        bnrd a = f55697a.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            if (((zqj) entry.getValue()).equals(zqj)) {
                j.mo67668c((String) entry.getKey());
            }
        }
        return j.mo67664a();
    }
}
