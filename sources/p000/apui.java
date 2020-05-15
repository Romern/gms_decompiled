package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.security.snet.SnetWatchdogChimeraIntentService;
import java.util.concurrent.TimeUnit;

/* renamed from: apui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apui {
    /* renamed from: a */
    public static Bundle m71030a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putLong("idle_mode_wake_interval_ms", TimeUnit.HOURS.toMillis(cgkt.f187180a.mo6606a().mo84047v()));
        bundle.putLong("snet_watchdog_timeout_ms", SnetWatchdogChimeraIntentService.f107595a);
        bundle.putLong("snet_watchdog_idle_mode_timeout_ms", SnetWatchdogChimeraIntentService.f107596b);
        bundle.putInt("snet_max_exception_string_size", 2048);
        bundle.putString("snet_report_event_logs", cgkt.f187180a.mo6606a().mo84008K());
        bundle.putBoolean("snet_log_execution_points", cgkt.m145943o());
        boolean z = false;
        bundle.putBoolean("snet_report_non_system_apps", false);
        bundle.putBoolean("snet_report_system_apps", false);
        bundle.putBoolean("snet_report_more_app_info", false);
        bundle.putBoolean("snet_report_google_page", false);
        bundle.putBoolean("snet_report_proxy", false);
        bundle.putString("debug_status", cgkt.m145932d());
        bundle.putString("snet_sd_card_jpeg_name", "");
        bundle.putString("snet_logcat_tags", cgkt.f187180a.mo6606a().mo84001D());
        bundle.putInt("snet_logcat_lines", 0);
        bundle.putString("snet_tags_whitelist", cgkt.f187180a.mo6606a().mo84018U());
        bundle.putString("snet_idle_tags_whitelist", cgkt.f187180a.mo6606a().mo84048w());
        bundle.putInt("snet_num_sys_part_files", 5);
        bundle.putString("snet_sys_part_files", cgkt.f187180a.mo6606a().mo84016S());
        bundle.putLong("snet_num_sys_ca_certs", cgkt.f187180a.mo6606a().mo84006I());
        bundle.putBoolean("snet_log_sys_ca_cert", cgkt.f187180a.mo6606a().mo83999B());
        bundle.putString("snet_requested_ca_certs", "");
        bundle.putBoolean("clearcut_idle_logging_enabled", true);
        bundle.putBoolean("clearcut_jar_logging_enabled", true);
        bundle.putString("device_country", ryv.m34681a(context, "device_country", ""));
        bundle.putString("snet_system_properties", cgkt.f187180a.mo6606a().mo84017T());
        bundle.putString("snet_selected_files", cgkt.f187180a.mo6606a().mo84013P());
        String q = cgkt.f187180a.mo6606a().mo84042q();
        if (!TextUtils.isEmpty(q)) {
            String[] split = q.split(",");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = split[i];
                String[] split2 = str.split("-");
                if (split2.length == 2) {
                    try {
                        int parseInt = Integer.parseInt(split2[0]);
                        int parseInt2 = Integer.parseInt(split2[1]);
                        if (parseInt <= 15 && parseInt2 >= 15) {
                            z = true;
                            break;
                        }
                    } catch (NumberFormatException e) {
                    }
                } else if (Integer.parseInt(str) == 15) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        bundle.putBoolean("snet_is_targeted_by_gservices", z);
        return bundle;
    }
}
