package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bzzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzzv implements bxvp {
    UNKNOWN_DATA_TYPE(0),
    ACTIVITY_SAMPLES(1),
    ACTIVITY_SEGMENT(2),
    CALORIES_BMR(3),
    CALORIES_EXPENDED(4),
    DISTANCE_DELTA(5),
    FLOOR_CHANGE(6),
    GOAL(7),
    HEART_RATE_BPM(8),
    HEIGHT(9),
    LOCATION_SAMPLE(10),
    NUTRITION(11),
    SESSION(12),
    SPEED_TYPE(13),
    STEP_COUNT_CUMULATIVE(14),
    STEP_COUNT_DELTA(15),
    WEIGHT_TYPE(16),
    STEP_LENGTH(17),
    STEP_COUNT_CADENCE(18),
    STRIDE_MODEL(19),
    INTERNAL_SPORTS_MODEL(20),
    CALORIES_CONSUMED(21),
    POWER_SAMPLE(22),
    ACTIVITY_SAMPLE(23),
    ACTIVITY_TRANSITION(24),
    ACCELEROMETER(25),
    SENSOR_EVENTS(26),
    SENSOR_CONST_RATE_EVENTS(27),
    INTERNAL_GOAL(28),
    LOCATION_TRACK(29),
    DISTANCE_CUMULATIVE(30),
    CYCLING_WHEEL_REVOLUTION_CUMULATIVE(31),
    CYCLING_WHEEL_REVOLUTION_RPM(32),
    CYCLING_PEDALING_CUMULATIVE(33),
    CYCLING_PEDALING_CADENCE(34),
    BODY_FAT_PERCENTAGE(35),
    BODY_WAIST_CIRCUMFERENCE(36),
    BODY_HIP_CIRCUMFERENCE(37),
    MOVES(38),
    HYDRATION(39),
    ACTIVE_MINUTES(40),
    ACTIVITY_EXERCISE(41),
    HEART_MINUTES(42),
    LOCATION_BOUNDING_BOX(43),
    INTERNAL_SESSION(44),
    INTERNAL_SESSION_DEBUG(45),
    INTERNAL_SESSION_V2(46),
    INTERNAL_QUALITY_ACTIVITY_STATS(47),
    BLOOD_PRESSURE(48),
    BLOOD_GLUCOSE(49),
    OXYGEN_SATURATION(50),
    BODY_TEMPERATURE(51),
    BODY_TEMPERATURE_BASAL(52),
    CERVICAL_MUCUS(53),
    CERVICAL_POSITION(54),
    MENSTRUATION(55),
    OVULATION_TEST(56),
    VAGINAL_SPOTTING(57),
    DEVICE_ON_BODY(58),
    INTERNAL_SYMPTOM(59),
    INTERNAL_PRESCRIPTION_EVENT(60),
    INTERNAL_PRIMARY_DEVICE(61),
    INTERNAL_MEDICATION_EVENT(62),
    INTERNAL_SESSION_V3(63),
    BODY_HIP_CIRCUMFERENCE_SUMMARY(64),
    FLOOR_CHANGE_SUMMARY(65),
    HEART_RATE_SUMMARY(66),
    WEIGHT_SUMMARY(67),
    CALORIES_BMR_SUMMARY(68),
    POWER_SUMMARY(69),
    BODY_TEMPERATURE_SUMMARY(70),
    BLOOD_GLUCOSE_SUMMARY(71),
    BLOOD_PRESSURE_SUMMARY(72),
    BODY_WAIST_CIRCUMFERENCE_SUMMARY(73),
    SPEED_SUMMARY(74),
    ACTIVITY_SUMMARY(75),
    BODY_TEMPERATURE_BASAL_SUMMARY(76),
    NUTRITION_SUMMARY(77),
    HEIGHT_SUMMARY(78),
    BODY_FAT_PERCENTAGE_SUMMARY(79),
    OXYGEN_SATURATION_SUMMARY(80),
    HEART_MINUTES_SUMMARY(81),
    INTERNAL_SLEEP_ATTRIBUTES(82),
    SLEEP_SEGMENT(83),
    INTERNAL_SLEEP_SCHEDULE(84);
    

    /* renamed from: aH */
    public final int f172235aH;

    private bzzv(int i) {
        this.f172235aH = i;
    }

    /* renamed from: a */
    public static bzzv m126373a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DATA_TYPE;
            case 1:
                return ACTIVITY_SAMPLES;
            case 2:
                return ACTIVITY_SEGMENT;
            case 3:
                return CALORIES_BMR;
            case 4:
                return CALORIES_EXPENDED;
            case 5:
                return DISTANCE_DELTA;
            case 6:
                return FLOOR_CHANGE;
            case 7:
                return GOAL;
            case 8:
                return HEART_RATE_BPM;
            case 9:
                return HEIGHT;
            case 10:
                return LOCATION_SAMPLE;
            case 11:
                return NUTRITION;
            case 12:
                return SESSION;
            case 13:
                return SPEED_TYPE;
            case 14:
                return STEP_COUNT_CUMULATIVE;
            case 15:
                return STEP_COUNT_DELTA;
            case 16:
                return WEIGHT_TYPE;
            case 17:
                return STEP_LENGTH;
            case 18:
                return STEP_COUNT_CADENCE;
            case 19:
                return STRIDE_MODEL;
            case 20:
                return INTERNAL_SPORTS_MODEL;
            case 21:
                return CALORIES_CONSUMED;
            case 22:
                return POWER_SAMPLE;
            case 23:
                return ACTIVITY_SAMPLE;
            case 24:
                return ACTIVITY_TRANSITION;
            case 25:
                return ACCELEROMETER;
            case 26:
                return SENSOR_EVENTS;
            case 27:
                return SENSOR_CONST_RATE_EVENTS;
            case 28:
                return INTERNAL_GOAL;
            case 29:
                return LOCATION_TRACK;
            case 30:
                return DISTANCE_CUMULATIVE;
            case 31:
                return CYCLING_WHEEL_REVOLUTION_CUMULATIVE;
            case 32:
                return CYCLING_WHEEL_REVOLUTION_RPM;
            case 33:
                return CYCLING_PEDALING_CUMULATIVE;
            case 34:
                return CYCLING_PEDALING_CADENCE;
            case 35:
                return BODY_FAT_PERCENTAGE;
            case 36:
                return BODY_WAIST_CIRCUMFERENCE;
            case FelicaException.TYPE_NOT_CLOSED:
                return BODY_HIP_CIRCUMFERENCE;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return MOVES;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return HYDRATION;
            case FelicaException.TYPE_PUSH_FAILED:
                return ACTIVE_MINUTES;
            case 41:
                return ACTIVITY_EXERCISE;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return HEART_MINUTES;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return LOCATION_BOUNDING_BOX;
            case FelicaException.TYPE_RESET_FAILED:
                return INTERNAL_SESSION;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return INTERNAL_SESSION_DEBUG;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return INTERNAL_SESSION_V2;
            case 47:
                return INTERNAL_QUALITY_ACTIVITY_STATS;
            case 48:
                return BLOOD_PRESSURE;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return BLOOD_GLUCOSE;
            case 50:
                return OXYGEN_SATURATION;
            case 51:
                return BODY_TEMPERATURE;
            case 52:
                return BODY_TEMPERATURE_BASAL;
            case 53:
                return CERVICAL_MUCUS;
            case 54:
                return CERVICAL_POSITION;
            case 55:
                return MENSTRUATION;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return OVULATION_TEST;
            case 57:
                return VAGINAL_SPOTTING;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return DEVICE_ON_BODY;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return INTERNAL_SYMPTOM;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return INTERNAL_PRESCRIPTION_EVENT;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return INTERNAL_PRIMARY_DEVICE;
            case 62:
                return INTERNAL_MEDICATION_EVENT;
            case 63:
                return INTERNAL_SESSION_V3;
            case 64:
                return BODY_HIP_CIRCUMFERENCE_SUMMARY;
            case KeyInformation.AES128_DES56:
                return FLOOR_CHANGE_SUMMARY;
            case 66:
                return HEART_RATE_SUMMARY;
            case KeyInformation.AES128_DES112:
                return WEIGHT_SUMMARY;
            case 68:
                return CALORIES_BMR_SUMMARY;
            case 69:
                return POWER_SUMMARY;
            case 70:
                return BODY_TEMPERATURE_SUMMARY;
            case 71:
                return BLOOD_GLUCOSE_SUMMARY;
            case 72:
                return BLOOD_PRESSURE_SUMMARY;
            case 73:
                return BODY_WAIST_CIRCUMFERENCE_SUMMARY;
            case 74:
                return SPEED_SUMMARY;
            case 75:
                return ACTIVITY_SUMMARY;
            case 76:
                return BODY_TEMPERATURE_BASAL_SUMMARY;
            case 77:
                return NUTRITION_SUMMARY;
            case 78:
                return HEIGHT_SUMMARY;
            case KeyInformation.AES128:
                return BODY_FAT_PERCENTAGE_SUMMARY;
            case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE:
                return OXYGEN_SATURATION_SUMMARY;
            case 81:
                return HEART_MINUTES_SUMMARY;
            case 82:
                return INTERNAL_SLEEP_ATTRIBUTES;
            case 83:
                return SLEEP_SEGMENT;
            case 84:
                return INTERNAL_SLEEP_SCHEDULE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126374b() {
        return bzzu.f172148a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f172235aH;
    }

    public final String toString() {
        return Integer.toString(this.f172235aH);
    }
}
