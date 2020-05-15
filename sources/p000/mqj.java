package p000;

/* renamed from: mqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mqj implements bxvp {
    UNKNOWN(0),
    GET_DEVICES(1),
    COMMON_RESTORE(2),
    FULL_DATA_BACKUP(3),
    FULL_DATA_RESTORE(4),
    BACKUP_UI(5),
    BACKUP_START(6),
    BACKUP_END(7),
    BACKUP_ERROR(8),
    REQUEST_ERROR(9),
    RESTORE_START(10),
    NEXT_RESTORE_PACKAGE(11),
    RESTORE_END(12),
    RESTORE_INFO(13),
    RESTORE_ERROR(14),
    DEVICE_STATE_SNAPSHOT(15),
    INELIGIBILITY(16),
    CLOUD_RESTORE_START(17),
    CLOUD_RESTORE_JOB_FINISHED(18),
    CLOUD_RESTORE_END(19),
    CONTACTS_REQUEST_START(20),
    CONTACTS_REQUEST_ERROR(21),
    FETCH_CONTACTS_BACKUP_END(22),
    RESTORE_DEVICE_AND_SIM_CONTACTS_END(23),
    MIGRATE_CLEANER_ERROR(24),
    CLOUD_RESTORE_ERROR(25),
    CLOUD_RESTORE_SKIP(26),
    FULL_BACKUP_SCHEDULED(27),
    BACK_UP_NOW_START(28),
    BACK_UP_NOW_END(29),
    GMS_BACKUP_SCHEDULE(30),
    GMS_BACKUP_RUN(31),
    NO_BACKUP_NOTIFICATION(32),
    KEY_RECOVERY(33),
    APP_PICKER_HOST_START_APP_REQUEST(34),
    APP_PICKER_HOST_END(35),
    SUW_SCREEN_CHANGE(36),
    MMS_BACKUP_SCHEDULE(37),
    MMS_BACKUP_RUN(38),
    MMS_BACKUP(39),
    SET_BACKUP_ACCOUNT_SERVICE_INVOKED(40),
    MMS_RESTORE(41),
    UNLOCK_IS_REQUIRED(42);
    

    /* renamed from: R */
    public final int f34275R;

    private mqj(int i) {
        this.f34275R = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34275R;
    }

    public final String toString() {
        return Integer.toString(this.f34275R);
    }
}
