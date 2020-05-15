package p000;

/* renamed from: beve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum beve {
    PHONE_ACTIVITY_DNN(1501260402953L, 1186103143, "phone_activity_dnn.model.uncompressed"),
    PHONE_TWO_WHEELER_DNN(1513124575461L, 2146722381, "two_wheeler_dnn.model.jpg"),
    PHONE_ACTIVITY_CNN(1539060079283L, 3380417373L, "phone_activity_cnn.model.uncompressed"),
    PHONE_ACTIVITY(1427499739686L, "phone_activity.model.jpg"),
    PHONE_BAR_GRU_FOR_CHRE_DNN(1540963941999L, "phone_bar_gru_for_chre_dnn.model.uncompressed"),
    PHONE_BAR_GRU_BATCH_FOR_OAR_DNN(1539020598205L, "phone_bar_gru_batch_for_oar_dnn.model.uncompressed"),
    PHONE_BAR_GRU_NON_BATCH_FOR_OAR_DNN(1539020353818L, "phone_bar_gru_non_batch_for_oar_dnn.model.uncompressed"),
    PHONE_BAR_GRU_BATCH_FOR_OAR_CNN(1539094352990L, "phone_bar_gru_batch_for_oar_cnn.model.uncompressed"),
    PHONE_BAR_GRU_NON_BATCH_FOR_OAR_CNN(1539094289514L, "phone_bar_gru_non_batch_for_oar_cnn.model.uncompressed"),
    WATCH_ACTIVITY(1474574629460L, "watch_activity.model.jpg"),
    PHONE_POSITION(1428630138407L, "phone_position.model.jpg"),
    PHONE_POSITION_IN_VEHICLE(1428630110146L, "phone_position_in_vehicle.model.jpg"),
    PHONE_POCKET_WALKING(1469566351197L, "phone_pocket_walking.model.jpg"),
    PHONE_FLOOR_CHANGE(1448472682338L, "floor_change.model.jpg"),
    PHONE_SLEEP_DNN(1569627785136L, 3817819787L, "sleep_activity_dnn.model.uncompressed"),
    WATCH_REP_SEGMENTATION(1448309879170L, "rep_segmentation.model.jpg"),
    WATCH_AUTOFIT_EXERCISE(1465344697439L, "autofit_exercise.model.jpg"),
    PHONE_ACTIVITY_CONTEXT_HUB(1464026440157L, "context_hub_phone_activity.model.jpg");
    

    /* renamed from: s */
    public final long f112631s;

    /* renamed from: t */
    public final long f112632t;

    /* renamed from: u */
    public final String f112633u;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private beve(long j, long j2, String str) {
        char c;
        String str2;
        this.f112631s = j;
        this.f112632t = j2;
        this.f112633u = str.length() == 0 ? new String("armodel/") : "armodel/".concat(str);
        switch (str.hashCode()) {
            case -2144462104:
                if (str.equals("phone_activity_dnn.model.uncompressed")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2069310744:
                if (str.equals("two_wheeler_dnn.model.jpg")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1703158136:
                if (str.equals("context_hub_phone_activity.model.jpg")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1675643643:
                if (str.equals("phone_position_in_vehicle.model.jpg")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1317404061:
                if (str.equals("autofit_exercise.model.jpg")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1096006425:
                if (str.equals("phone_bar_gru_non_batch_for_oar_dnn.model.uncompressed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -908973999:
                if (str.equals("sleep_activity_dnn.model.uncompressed")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -813315602:
                if (str.equals("phone_activity.model.jpg")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -486060881:
                if (str.equals("phone_pocket_walking.model.jpg")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -479238890:
                if (str.equals("phone_bar_gru_batch_for_oar_cnn.model.uncompressed")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -361818232:
                if (str.equals("phone_position.model.jpg")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -198492280:
                if (str.equals("phone_bar_gru_for_chre_dnn.model.uncompressed")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -106405815:
                if (str.equals("phone_activity_cnn.model.uncompressed")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 263956145:
                if (str.equals("floor_change.model.jpg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 942049864:
                if (str.equals("phone_bar_gru_non_batch_for_oar_cnn.model.uncompressed")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1335451186:
                if (str.equals("rep_segmentation.model.jpg")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case 1777672117:
                if (str.equals("phone_bar_gru_batch_for_oar_dnn.model.uncompressed")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2032475373:
                if (str.equals("watch_activity.model.jpg")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str2 = "/com/google/android/gmscore/integ/modules/location/nonwearable/assets/location/armodel/";
                break;
            case 12:
            case 13:
                str2 = "/com/google/android/gmscore/integ/modules/location/wearable/assets/location/armodel/";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                str2 = "/com/google/location/lbs/activity/model/";
                break;
            default:
                str2 = null;
                break;
        }
        String valueOf = String.valueOf(str2);
        if (str.length() == 0) {
            new String(valueOf);
        } else {
            valueOf.concat(str);
        }
    }

    private beve(long j, String str) {
        this(j, -1, str);
    }
}
