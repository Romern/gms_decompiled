package p000;

import android.content.Context;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.EnumMap;

/* renamed from: vrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrb {

    /* renamed from: a */
    static final EnumMap f49830a = new EnumMap(bpdi.class);

    /* renamed from: b */
    static final EnumMap f49831b = new EnumMap(bpdh.class);

    /* renamed from: c */
    static final EnumMap f49832c = new EnumMap(bpeb.class);

    /* renamed from: d */
    static final EnumMap f49833d = new EnumMap(bpea.class);

    /* renamed from: e */
    private static final EnumMap f49834e = new EnumMap(bpeb.class);

    /* renamed from: f */
    private static final EnumMap f49835f = new EnumMap(bpdi.class);

    /* renamed from: g */
    private final qws f49836g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpeb, bpeb]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpdi, bpdi]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpeb, btze]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpea, btzc]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpdi, btza]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [bpdh, btyy]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    static {
        f49834e.put((Enum) bpeb.DRIVING_MODE, (Object) bpeb.DRIVING_MODE_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_INTRO, (Object) bpeb.DRIVING_MODE_FRX_INTRO_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_SUCCESS, (Object) bpeb.DRIVING_MODE_FRX_SUCCESS_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR, (Object) bpeb.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_DND_ACCESS_REQUEST, (Object) bpeb.DRIVING_MODE_FRX_DND_ACCESS_REQUEST_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_DOWNLOAD, (Object) bpeb.DRIVING_MODE_FRX_DOWNLOAD_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_ERROR, (Object) bpeb.DRIVING_MODE_FRX_ERROR_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER, (Object) bpeb.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER_LOCATION);
        f49834e.put((Enum) bpeb.DRIVING_MODE_FRX_GEARHEAD_SETUP, (Object) bpeb.DRIVING_MODE_FRX_GEARHEAD_SETUP_LOCATION);
        f49835f.put((Enum) bpdi.DRIVING_MODE, (Object) bpdi.DRIVING_MODE_LOCATION);
        f49832c.put((Enum) bpeb.UNKNOWN_CONTEXT, (Object) btze.UNKNOWN_UI_CONTEXT);
        f49832c.put((Enum) bpeb.DRIVING_MODE, (Object) btze.DRIVING_MODE);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_INTRO, (Object) btze.DRIVING_MODE_FRX_INTRO);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_SUCCESS, (Object) btze.DRIVING_MODE_FRX_SUCCESS);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR, (Object) btze.DRIVING_MODE_FRX_CHOOSE_BEHAVIOR);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_DND_ACCESS_REQUEST, (Object) btze.DRIVING_MODE_FRX_DND_ACCESS_REQUEST);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_DOWNLOAD, (Object) btze.DRIVING_MODE_FRX_DOWNLOAD);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_ERROR, (Object) btze.DRIVING_MODE_FRX_ERROR);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER, (Object) btze.DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER);
        f49832c.put((Enum) bpeb.DRIVING_MODE_FRX_GEARHEAD_SETUP, (Object) btze.DRIVING_MODE_FRX_GEARHEAD_SETUP);
        f49833d.put((Enum) bpea.UNKNOWN_ACTION, (Object) btzc.UNKNOWN_UI_ACTION);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS, (Object) btzc.DRIVING_MODE_SETTINGS);
        f49833d.put((Enum) bpea.DRIVING_MODE_BEHAVIOR_SETTINGS, (Object) btzc.DRIVING_MODE_BEHAVIOR_SETTINGS);
        f49833d.put((Enum) bpea.DRIVING_MODE_MANUAL_TOGGLE_ENABLED, (Object) btzc.DRIVING_MODE_MANUAL_TOGGLE_ENABLED);
        f49833d.put((Enum) bpea.DRIVING_MODE_MANUAL_TOGGLE_DISABLED, (Object) btzc.DRIVING_MODE_MANUAL_TOGGLE_DISABLED);
        f49833d.put((Enum) bpea.DRIVING_MODE_PREFERENCE_GEAR_CLICKED, (Object) btzc.DRIVING_MODE_PREFERENCE_GEAR_CLICKED);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE);
        f49833d.put((Enum) bpea.DRIVING_MODE_AUTOMATIC_RULES_SETTINGS, (Object) btzc.DRIVING_MODE_AUTOMATIC_RULES_SETTINGS);
        f49833d.put((Enum) bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW, (Object) btzc.DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW);
        f49833d.put((Enum) bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT, (Object) btzc.DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT);
        f49833d.put((Enum) bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL, (Object) btzc.DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL);
        f49833d.put((Enum) bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE, (Object) btzc.DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE);
        f49833d.put((Enum) bpea.DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS, (Object) btzc.DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS);
        f49833d.put((Enum) bpea.DRIVING_MODE_START_GEARHEAD_BEHAVIOR, (Object) btzc.DRIVING_MODE_START_GEARHEAD_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_START_DND_BEHAVIOR, (Object) btzc.DRIVING_MODE_START_DND_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_START_THIRDPARTY_BEHAVIOR, (Object) btzc.DRIVING_MODE_START_THIRDPARTY_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_START_EMPTY_BEHAVIOR, (Object) btzc.DRIVING_MODE_START_EMPTY_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR, (Object) btzc.DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_STOP_DND_BEHAVIOR, (Object) btzc.DRIVING_MODE_STOP_DND_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR, (Object) btzc.DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_STOP_EMPTY_BEHAVIOR, (Object) btzc.DRIVING_MODE_STOP_EMPTY_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES, (Object) btzc.DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES);
        f49833d.put((Enum) bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT, (Object) btzc.DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT);
        f49833d.put((Enum) bpea.DRIVING_MODE_SETTINGS_FROM_SEARCH, (Object) btzc.DRIVING_MODE_SETTINGS_FROM_SEARCH);
        f49833d.put((Enum) bpea.DRIVING_MODE_START_MORRIS_BEHAVIOR, (Object) btzc.DRIVING_MODE_START_MORRIS_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_STOP_MORRIS_BEHAVIOR, (Object) btzc.DRIVING_MODE_STOP_MORRIS_BEHAVIOR);
        f49833d.put((Enum) bpea.DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS, (Object) btzc.DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_NEXT_BUTTON, (Object) btzc.DRIVING_MODE_FRX_NEXT_BUTTON);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_BACK_BUTTON, (Object) btzc.DRIVING_MODE_FRX_BACK_BUTTON);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_TERTIARY_BUTTON, (Object) btzc.DRIVING_MODE_FRX_TERTIARY_BUTTON);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_SWITCH_TOGGLED, (Object) btzc.DRIVING_MODE_FRX_SWITCH_TOGGLED);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_READY, (Object) btzc.DRIVING_MODE_FRX_READY);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS, (Object) btzc.DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX, (Object) btzc.DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX);
        f49833d.put((Enum) bpea.DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION, (Object) btzc.DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION);
        f49830a.put((Enum) bpdi.UNKNOWN_CONTEXT, (Object) btza.UNKNOWN_NON_UI_CONTEXT);
        f49830a.put((Enum) bpdi.DRIVING_MODE_GEARHEAD_SETTING_COPIER, (Object) btza.DRIVING_MODE_GEARHEAD_SETTING_COPIER);
        f49830a.put((Enum) bpdi.DRIVING_MODE_DND_SETTING_COPIER, (Object) btza.DRIVING_MODE_DND_SETTING_COPIER);
        f49830a.put((Enum) bpdi.DRIVING_MODE_LOCATION, (Object) btza.DRIVING_MODE_LOCATION);
        f49831b.put((Enum) bpdh.UNKNOWN_ACTION, (Object) btyy.UNKNOWN_NON_UI_ACTION);
        f49831b.put((Enum) bpdh.DRIVING_MODE_SETTINGS_COPY_STARTED, (Object) btyy.DRIVING_MODE_SETTINGS_COPY_STARTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_SETTINGS_COPY_ON_PACKAGE_REPLACED, (Object) btyy.DRIVING_MODE_SETTINGS_COPY_ON_PACKAGE_REPLACED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_SETTINGS_COPY_ON_LIFETIME_END, (Object) btyy.DRIVING_MODE_SETTINGS_COPY_ON_LIFETIME_END);
        f49831b.put((Enum) bpdh.DRIVING_MODE_SETTINGS_COPY_SUCCESS, (Object) btyy.DRIVING_MODE_SETTINGS_COPY_SUCCESS);
        f49831b.put((Enum) bpdh.DRIVING_MODE_SETTINGS_COPY_FAILED, (Object) btyy.DRIVING_MODE_SETTINGS_COPY_FAILED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_LAUNCH_SUCCESS, (Object) btyy.DRIVING_MODE_GEARHEAD_LAUNCH_SUCCESS);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_DISABLED_SUCCESS, (Object) btyy.DRIVING_MODE_GEARHEAD_DISABLED_SUCCESS);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_LAUNCH_FAILED_INVALID_CALLING_PACKAGE, (Object) btyy.DRIVING_MODE_GEARHEAD_LAUNCH_FAILED_INVALID_CALLING_PACKAGE);
        f49831b.put((Enum) bpdh.DRIVING_MODE_TOGGLE_ENABLED_BY_THIRD_PARTY, (Object) btyy.DRIVING_MODE_TOGGLE_ENABLED_BY_THIRD_PARTY);
        f49831b.put((Enum) bpdh.DRIVING_MODE_TOGGLE_DISABLED_BY_THIRD_PARTY, (Object) btyy.DRIVING_MODE_TOGGLE_DISABLED_BY_THIRD_PARTY);
        f49831b.put((Enum) bpdh.DRIVING_MODE_NO_BLUETOOTH_PERMISSION, (Object) btyy.DRIVING_MODE_NO_BLUETOOTH_PERMISSION);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_LAUNCH, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_LAUNCH);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECTED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_POCKET_TIMEOUT, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_POCKET_TIMEOUT);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_SKIPPED_IN_CALL, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_SKIPPED_IN_CALL);
        f49831b.put((Enum) bpdh.DRIVING_MODE_SETTINGS_RESET_INVALID_BEHAVIOR, (Object) btyy.DRIVING_MODE_SETTINGS_RESET_INVALID_BEHAVIOR);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_INSTALL_START, (Object) btyy.DRIVING_MODE_GEARHEAD_INSTALL_START);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_INSTALL_START_UPDATE, (Object) btyy.DRIVING_MODE_GEARHEAD_INSTALL_START_UPDATE);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_INSTALL_SUCCESS, (Object) btyy.DRIVING_MODE_GEARHEAD_INSTALL_SUCCESS);
        f49831b.put((Enum) bpdh.DRIVING_MODE_GEARHEAD_INSTALL_FAILURE, (Object) btyy.DRIVING_MODE_GEARHEAD_INSTALL_FAILURE);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED_WIRELESS, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED_WIRELESS);
        f49831b.put((Enum) bpdh.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_STARTED, (Object) btyy.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_STARTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_SUCCESS, (Object) btyy.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_SUCCESS);
        f49831b.put((Enum) bpdh.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_FAILED, (Object) btyy.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_FAILED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_CONNECTED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_CONNECTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECTED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_LAUNCH, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_LAUNCH);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_TERMINATE, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_TERMINATE);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_SKIPPED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_SKIPPED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_CONNECTED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_CONNECTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_DISCONNECTED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_AUDIO_ACTIVITY_RECOGNITION_DISCONNECTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_ABORTED, (Object) btyy.DRIVING_MODE_CAR_SERVICE_SETTINGS_COPY_ABORTED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_LIFETIME_START, (Object) btyy.DRIVING_MODE_LIFETIME_START);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECT_IGNORED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECT_IGNORED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECT_IGNORED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_DISCONNECT_IGNORED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_SUPPRESSED, (Object) btyy.DRIVING_MODE_AUTOLAUNCH_ACTIVITY_RECOGNITION_SUPPRESSED);
        f49831b.put((Enum) bpdh.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT, (Object) btyy.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT);
        f49831b.put((Enum) bpdh.DRIVING_MODE_MISSING_TRIGGER_SOURCE, (Object) btyy.DRIVING_MODE_MISSING_TRIGGER_SOURCE);
        f49831b.put((Enum) bpdh.DRIVING_MODE_MISSING_PENDING_TRIGGER_SOURCE, (Object) btyy.DRIVING_MODE_MISSING_PENDING_TRIGGER_SOURCE);
        f49831b.put((Enum) bpdh.DRIVING_MODE_NULL_PROXIMITY_SENSOR, (Object) btyy.DRIVING_MODE_NULL_PROXIMITY_SENSOR);
    }

    public vrb(Context context) {
        String str;
        Context applicationContext = context.getApplicationContext();
        if (!ceyg.m138424e()) {
            str = "DRIVINGMODE";
        } else {
            str = "CAR";
        }
        this.f49836g = new qws(applicationContext, str, null);
    }

    /* renamed from: a */
    private final void m41095a(bpcl bpcl, int i) {
        String valueOf = String.valueOf(bpcm.m111778a(i));
        String valueOf2 = String.valueOf(bpcl);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
        sb.append("Logging ");
        sb.append(valueOf);
        sb.append(", event: ");
        sb.append(valueOf2);
        sb.toString();
        qwo a = this.f49836g.mo24335a(bpcl.mo73642k());
        a.mo24325a("com.google.android.projection.gearhead");
        a.mo24328b(i - 1);
        a.mo24327b();
    }

    /* renamed from: a */
    private final void m41096a(btxm btxm, int i) {
        qwo a = this.f49836g.mo24335a(btxm.mo73642k());
        a.mo24325a("com.google.android.gms.location");
        a.mo24328b(i - 1);
        a.mo24327b();
    }

    /* renamed from: a */
    public final void mo28758a(bpdi bpdi, bpdh bpdh) {
        if (!ceyg.m138424e()) {
            bxvd da = bpcl.f135759L.mo74144da();
            bxvd da2 = bpdj.f136247f.mo74144da();
            bpdi bpdi2 = (bpdi) f49835f.get(bpdi);
            if (ccrj.m131353b() && bpdi2 != null) {
                int i = bpdi2.f136246K;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpdj bpdj = (bpdj) da2.f164949b;
                bpdj.f136249a |= 1;
                bpdj.f136250b = i;
            } else {
                int i2 = bpdi.f136246K;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpdj bpdj2 = (bpdj) da2.f164949b;
                bpdj2.f136249a |= 1;
                bpdj2.f136250b = i2;
            }
            int i3 = bpdh.f136208em;
            bpdj bpdj3 = (bpdj) da2.f164949b;
            bpdj3.f136249a |= 2;
            bpdj3.f136251c = i3;
            bpdj bpdj4 = (bpdj) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpcl bpcl = (bpcl) da.f164949b;
            bpdj4.getClass();
            bpcl.f135785m = bpdj4;
            bpcl.f135773a |= 8192;
            m41095a((bpcl) da.mo74062i(), 38);
            return;
        }
        bxvd da3 = btyv.f152987d.mo74144da();
        btza btza = (btza) f49830a.get(bpdi);
        btyy btyy = (btyy) f49831b.get(bpdh);
        if (btza == null || btyy == null) {
            Log.wtf("CAR.DRIVINGMODE", "Error of generating location non-UI event clearcut log");
            return;
        }
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        btyv btyv = (btyv) da3.f164949b;
        btyv.f152990b = btza.f153048e;
        int i4 = btyv.f152989a | 1;
        btyv.f152989a = i4;
        btyv.f152991c = btyy.f153041Q;
        btyv.f152989a = i4 | 2;
        bxvd da4 = btxm.f152814q.mo74144da();
        btyv btyv2 = (btyv) da3.mo74062i();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        btxm btxm = (btxm) da4.f164949b;
        btyv2.getClass();
        btxm.f152831p = btyv2;
        btxm.f152816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        m41096a((btxm) da4.mo74062i(), 19);
    }

    /* renamed from: a */
    public final void mo28759a(bpeb bpeb, bpea bpea) {
        if (ceyg.m138424e()) {
            bxvd da = btyw.f152992d.mo74144da();
            btze btze = (btze) f49832c.get(bpeb);
            btzc btzc = (btzc) f49833d.get(bpea);
            System.out.println("sj - log location UI event ");
            if (btze == null || btzc == null) {
                Log.wtf("CAR.DRIVINGMODE", "Error of generating location UI event clearcut log");
                return;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btyw btyw = (btyw) da.f164949b;
            btyw.f152995b = btze.f153104k;
            int i = btyw.f152994a | 1;
            btyw.f152994a = i;
            btyw.f152996c = btzc.f153091O;
            btyw.f152994a = i | 2;
            bxvd da2 = btxm.f152814q.mo74144da();
            btyw btyw2 = (btyw) da.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btxm btxm = (btxm) da2.f164949b;
            btyw2.getClass();
            btxm.f152830o = btyw2;
            btxm.f152816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            m41096a((btxm) da2.mo74062i(), 18);
            return;
        }
        bxvd da3 = bpcl.f135759L.mo74144da();
        bxvd da4 = bped.f137237x.mo74144da();
        bpeb bpeb2 = (bpeb) f49834e.get(bpeb);
        if (ccrj.m131353b() && bpeb2 != null) {
            int i2 = bpeb2.f137221cE;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bped bped = (bped) da4.f164949b;
            bped.f137239a |= 1;
            bped.f137240b = i2;
        } else {
            int i3 = bpeb.f137221cE;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bped bped2 = (bped) da4.f164949b;
            bped2.f137239a |= 1;
            bped2.f137240b = i3;
        }
        int i4 = bpea.f137033jW;
        bped bped3 = (bped) da4.f164949b;
        bped3.f137239a |= 2;
        bped3.f137241c = i4;
        bped bped4 = (bped) da4.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bpcl bpcl = (bpcl) da3.f164949b;
        bped4.getClass();
        bpcl.f135784l = bped4;
        bpcl.f135773a |= 4096;
        m41095a((bpcl) da3.mo74062i(), 37);
    }
}
