package p000;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.feedback.PreviewChimeraActivity;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: wvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wvg extends BaseAdapter {

    /* renamed from: a */
    public final List f51411a = new ArrayList();

    /* renamed from: b */
    public final PreviewChimeraActivity f51412b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: wvg.a(int, java.lang.Object):void
     arg types: [?, java.lang.String]
     candidates:
      wvg.a(int, java.lang.String):java.lang.String
      wvg.a(java.lang.String, java.lang.String):void
      wvg.a(int, java.lang.Object):void */
    public wvg(PreviewChimeraActivity previewChimeraActivity, ErrorReport errorReport) {
        this.f51412b = previewChimeraActivity;
        String str = errorReport.f31511B;
        if (str != null && !TextUtils.isEmpty(str)) {
            m42332a((int) C0126R.string.gf_user_account, (Object) errorReport.f31511B);
        }
        m42333a(C0126R.string.gf_error_report_type, Integer.valueOf(errorReport.f31536a.type), 2);
        if (!TextUtils.isEmpty(errorReport.f31546b)) {
            m42332a((int) C0126R.string.gf_error_report_description, (Object) errorReport.f31546b);
        }
        m42332a((int) C0126R.string.gf_error_report_package_name, (Object) errorReport.f31536a.packageName);
        m42332a((int) C0126R.string.gf_error_report_package_version, Integer.valueOf(errorReport.f31547c));
        m42332a((int) C0126R.string.gf_error_report_package_version_name, (Object) errorReport.f31548d);
        m42332a((int) C0126R.string.gf_error_report_installer_package_name, (Object) errorReport.f31536a.installerPackageName);
        m42332a((int) C0126R.string.gf_error_report_process_name, (Object) errorReport.f31536a.processName);
        m42333a(C0126R.string.gf_error_report_time, Long.valueOf(errorReport.f31536a.time), 1);
        m42332a((int) C0126R.string.gf_error_report_system_app, Boolean.valueOf(errorReport.f31536a.systemApp));
        m42332a((int) C0126R.string.gf_locale, (Object) errorReport.f31512C);
        m42331a((int) C0126R.string.gf_error_report_system);
        m42332a((int) C0126R.string.gf_error_report_device, (Object) errorReport.f31549e);
        m42332a((int) C0126R.string.gf_error_report_build_id, (Object) errorReport.f31550f);
        m42332a((int) C0126R.string.gf_error_report_build_type, (Object) errorReport.f31551g);
        m42332a((int) C0126R.string.gf_error_report_build_fingerprint, (Object) errorReport.f31554j);
        m42332a((int) C0126R.string.gf_error_report_model, (Object) errorReport.f31552h);
        m42332a((int) C0126R.string.gf_error_report_product, (Object) errorReport.f31553i);
        m42332a((int) C0126R.string.gf_error_report_sdk_version, Integer.valueOf(errorReport.f31555k));
        m42332a((int) C0126R.string.gf_error_report_release, (Object) errorReport.f31556l);
        m42332a((int) C0126R.string.gf_error_report_incremental, (Object) errorReport.f31557m);
        m42332a((int) C0126R.string.gf_error_report_codename, (Object) errorReport.f31558n);
        m42332a((int) C0126R.string.gf_error_report_board, (Object) errorReport.f31559o);
        m42332a((int) C0126R.string.gf_error_report_brand, (Object) errorReport.f31560p);
        String str2 = errorReport.f31511B;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            m42332a((int) C0126R.string.gf_user_account, (Object) errorReport.f31511B);
        }
        String[] strArr = errorReport.f31561q;
        if (!(strArr == null || strArr.length == 0)) {
            m42334a(C0126R.string.gf_error_report_running_apps, strArr, 0, "com.google.android.gms.feedback.ShowTextActivity", "running applications");
        }
        String[] strArr2 = errorReport.f31562r;
        if (strArr2 != null) {
            m42334a(C0126R.string.gf_system_log, strArr2, 0, "com.google.android.gms.feedback.ShowTextActivity", "system logs");
        }
        String[] strArr3 = errorReport.f31563s;
        if (strArr3 != null) {
            m42334a(C0126R.string.gf_event_log, strArr3, 0, "com.google.android.gms.feedback.ShowTextActivity", "event logs");
        }
        if (errorReport.f31536a.crashInfo != null) {
            m42331a((int) C0126R.string.gf_error_report_crash);
            m42332a((int) C0126R.string.gf_error_report_exception_class_name, (Object) errorReport.f31536a.crashInfo.exceptionClassName);
            m42332a((int) C0126R.string.gf_error_report_exception_throw_file_name, (Object) errorReport.f31536a.crashInfo.throwFileName);
            m42332a((int) C0126R.string.gf_error_report_exception_throw_class_name, (Object) errorReport.f31536a.crashInfo.throwClassName);
            m42332a((int) C0126R.string.gf_error_report_exception_throw_method_name, (Object) errorReport.f31536a.crashInfo.throwMethodName);
            m42332a((int) C0126R.string.gf_error_report_exception_throw_line_number, Integer.valueOf(errorReport.f31536a.crashInfo.throwLineNumber));
            m42334a(C0126R.string.gf_error_report_exception_stack_trace, errorReport.f31536a.crashInfo.stackTrace, 0, "com.google.android.gms.feedback.ShowTextActivity", "stack trace");
        }
        if (errorReport.f31536a.anrInfo != null) {
            m42331a((int) C0126R.string.gf_error_report_anr);
            if (errorReport.f31536a.anrInfo.activity != null) {
                m42332a((int) C0126R.string.gf_error_report_anr_activity, (Object) errorReport.f31536a.anrInfo.activity);
            }
            m42332a((int) C0126R.string.gf_error_report_anr_cause, (Object) errorReport.f31536a.anrInfo.cause);
            m42334a(C0126R.string.gf_error_report_anr_info, errorReport.f31536a.anrInfo.info, 0, "com.google.android.gms.feedback.ShowTextActivity", "anr info");
            String str3 = errorReport.f31564t;
            if (str3 != null) {
                m42334a(C0126R.string.gf_error_report_anr_stack_traces, str3, 0, "com.google.android.gms.feedback.ShowTextActivity", "anr stack trace");
            }
        }
        if (errorReport.f31536a.batteryInfo != null) {
            m42331a((int) C0126R.string.common_battery);
            m42332a((int) C0126R.string.gf_error_report_battery_usage_percent, Integer.valueOf(errorReport.f31536a.batteryInfo.usagePercent));
            m42333a(C0126R.string.gf_error_report_duration, Long.valueOf(errorReport.f31536a.batteryInfo.durationMicros), 3);
            m42334a(C0126R.string.gf_error_report_battery_usage_details, errorReport.f31536a.batteryInfo.usageDetails, 0, "com.google.android.gms.feedback.ShowTextActivity", "battery usage details");
            m42334a(C0126R.string.gf_error_report_battery_checkin_details, errorReport.f31536a.batteryInfo.checkinDetails, 0, "com.google.android.gms.feedback.ShowTextActivity", "battery checkin details");
        }
        if (errorReport.f31536a.runningServiceInfo != null) {
            m42331a((int) C0126R.string.gf_error_report_running_service);
            m42333a(C0126R.string.gf_error_report_duration, Long.valueOf(errorReport.f31536a.runningServiceInfo.durationMillis), 4);
            m42334a(C0126R.string.gf_error_report_running_service_details, errorReport.f31536a.runningServiceInfo.serviceDetails, 0, "com.google.android.gms.feedback.ShowTextActivity", "running service details");
        }
        m42331a((int) C0126R.string.gf_network_data);
        if (!TextUtils.isEmpty(errorReport.f31510A)) {
            m42332a((int) C0126R.string.gf_network_name, (Object) errorReport.f31510A);
        }
        m42333a(C0126R.string.gf_phone_type, Integer.valueOf(errorReport.f31569y), 5);
        m42333a(C0126R.string.gf_network_type, Integer.valueOf(errorReport.f31570z), 6);
        m42332a((int) C0126R.string.gf_network_mcc, Integer.valueOf(errorReport.f31515F));
        m42332a((int) C0126R.string.gf_network_mnc, Integer.valueOf(errorReport.f31516G));
        wwy wwy = FeedbackChimeraActivity.f31574e;
        if (wwy == null || !wwy.mo29516f()) {
            mo29447a(errorReport);
        } else if (FeedbackChimeraActivity.f31574e.mo29514d()) {
            mo29447a(errorReport);
        } else {
            m42332a((int) C0126R.string.common_loading, (Object) null);
            mo29446a();
        }
    }

    /* renamed from: a */
    private final String m42329a(double d) {
        int i;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        int floor = (int) Math.floor(d / 1000.0d);
        if (floor > 86400) {
            i = floor / 86400;
            floor -= 86400 * i;
        } else {
            i = 0;
        }
        if (floor > 3600) {
            i2 = floor / 3600;
            floor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (floor > 60) {
            i3 = floor / 60;
            floor -= i3 * 60;
        } else {
            i3 = 0;
        }
        if (i > 0) {
            sb.append(this.f51412b.getString(C0126R.string.gf_battery_history_days, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(floor)}));
        } else if (i2 > 0) {
            sb.append(this.f51412b.getString(C0126R.string.gf_battery_history_hours, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(floor)}));
        } else if (i3 > 0) {
            sb.append(this.f51412b.getString(C0126R.string.gf_battery_history_minutes, new Object[]{Integer.valueOf(i3), Integer.valueOf(floor)}));
        } else {
            sb.append(this.f51412b.getString(C0126R.string.gf_battery_history_seconds, new Object[]{Integer.valueOf(floor)}));
        }
        return sb.toString();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.f51411a.size();
    }

    public final Object getItem(int i) {
        return this.f51411a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        wvf wvf = (wvf) this.f51411a.get(i);
        LayoutInflater layoutInflater = (LayoutInflater) this.f51412b.getSystemService("layout_inflater");
        if (wvf.f51409e != null || wvf.mo29444a()) {
            if (!wvf.mo29445b()) {
                if (view == null || view.getId() != C0126R.C0129id.label_value_row) {
                    view = layoutInflater.inflate((int) C0126R.C0128layout.label_value_row, viewGroup, false);
                }
            } else if (view == null || view.getId() != C0126R.C0129id.expandable_row) {
                view = layoutInflater.inflate((int) C0126R.C0128layout.expandable_row, viewGroup, false);
                if (aayi.m47270b()) {
                    TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.label);
                    int i2 = Build.VERSION.SDK_INT;
                    Drawable drawable = textView2.getCompoundDrawablesRelative()[2];
                    if (drawable != null) {
                        PreviewChimeraActivity previewChimeraActivity = this.f51412b;
                        Drawable b = aayh.m47257b(drawable, previewChimeraActivity, aayi.m47263a(previewChimeraActivity, C0126R.attr.ghf_greyIconColor));
                        int i3 = Build.VERSION.SDK_INT;
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, b, (Drawable) null);
                    }
                }
            }
            TextView textView3 = (TextView) view.findViewById(C0126R.C0129id.label);
            if (wvf.mo29444a()) {
                textView3.setVisibility(8);
            } else {
                textView3.setVisibility(0);
                if (TextUtils.isEmpty(wvf.f51408d)) {
                    textView3.setText(wvf.f51405a.intValue());
                } else {
                    textView3.setText(wvf.f51408d);
                }
            }
            if (wvf.f51406b == null && (textView = (TextView) view.findViewById(C0126R.C0129id.value)) != null) {
                if (wvf.mo29444a()) {
                    textView.setGravity(17);
                    textView.setText(this.f51412b.getString(C0126R.string.common_loading));
                } else {
                    textView.setGravity(8388611);
                    int i4 = wvf.f51407c;
                    if (i4 == 0) {
                        textView.setText(String.valueOf(wvf.f51409e));
                    } else if (i4 == 1) {
                        textView.setText(DateFormat.getDateInstance(0).format(new Date(((Long) wvf.f51409e).longValue())));
                    } else if (i4 == 2) {
                        int intValue = ((Integer) wvf.f51409e).intValue();
                        if (intValue == 1) {
                            textView.setText((int) C0126R.string.gf_error_report_crash);
                        } else if (intValue == 2) {
                            textView.setText((int) C0126R.string.gf_error_report_anr);
                        } else if (intValue == 3) {
                            textView.setText((int) C0126R.string.common_battery);
                        } else if (intValue == 5) {
                            textView.setText((int) C0126R.string.gf_error_report_running_service);
                        } else if (intValue == 11) {
                            textView.setText((int) C0126R.string.gf_error_report_user_initiated);
                        }
                    } else if (i4 == 3) {
                        textView.setText(m42329a((double) (((Long) wvf.f51409e).longValue() / 1000)));
                    } else if (i4 == 4) {
                        textView.setText(m42329a((double) ((Long) wvf.f51409e).longValue()));
                    } else if (i4 != 5) {
                        textView.setText(m42330a(((Integer) wvf.f51409e).intValue(), "NETWORK_TYPE_"));
                    } else {
                        textView.setText(m42330a(((Integer) wvf.f51409e).intValue(), "PHONE_TYPE_"));
                    }
                }
            }
            return view;
        }
        if (view == null || view.getId() != C0126R.C0129id.section_header_row) {
            view = layoutInflater.inflate((int) C0126R.C0128layout.section_header_row, viewGroup, false);
        }
        ((TextView) view).setText(wvf.f51405a.intValue());
        return view;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return ((wvf) this.f51411a.get(i)).mo29445b();
    }

    /* renamed from: a */
    private static final String m42330a(int i, String str) {
        Field[] declaredFields = TelephonyManager.class.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field = declaredFields[i2];
            try {
                if (field.getName().startsWith(str)) {
                    String valueOf = String.valueOf(field.get(null));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length());
                    sb.append(valueOf);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(11);
                    sb3.append(i);
                    if (sb2.equals(sb3.toString())) {
                        return field.getName().substring(str.length());
                    }
                }
                i2++;
            } catch (IllegalArgumentException e) {
                StringBuilder sb4 = new StringBuilder(11);
                sb4.append(i);
                return sb4.toString();
            } catch (IllegalAccessException e2) {
                StringBuilder sb5 = new StringBuilder(11);
                sb5.append(i);
                return sb5.toString();
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m42331a(int i) {
        m42332a(i, (Object) null);
    }

    /* renamed from: a */
    private final void m42332a(int i, Object obj) {
        m42333a(i, obj, 0);
    }

    /* renamed from: a */
    private final void m42333a(int i, Object obj, int i2) {
        m42334a(i, obj, i2, null, null);
    }

    /* renamed from: a */
    private final void m42334a(int i, Object obj, int i2, String str, String str2) {
        this.f51411a.add(new wvf(null, Integer.valueOf(i), obj, str, i2, str2));
    }

    /* renamed from: a */
    private final void m42335a(String str, String str2) {
        this.f51411a.add(new wvf(str, null, str2, null, 0, null));
    }

    /* renamed from: a */
    public final void mo29446a() {
        new adzt(Looper.getMainLooper()).postDelayed(new wve(this), cdtr.m134943e());
    }

    /* renamed from: a */
    public final void mo29447a(ErrorReport errorReport) {
        boolean z;
        Bundle bundle = errorReport.f31513D;
        int i = 0;
        if (bundle == null || bundle.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m42331a((int) C0126R.string.gf_product_specific_data);
            if (aaya.m47229b(ceib.m136900e())) {
                ArrayList arrayList = new ArrayList(errorReport.f31513D.keySet());
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) arrayList.get(i2);
                    m42335a(str, errorReport.f31513D.getString(str));
                }
            } else {
                for (String str2 : errorReport.f31513D.keySet()) {
                    m42335a(str2, errorReport.f31513D.getString(str2));
                }
            }
        }
        String[] strArr = errorReport.f31531V;
        if (strArr != null && strArr.length > 0) {
            if (!z) {
                m42331a((int) C0126R.string.gf_product_specific_data);
            }
            while (true) {
                String[] strArr2 = errorReport.f31531V;
                if (i < strArr2.length) {
                    String str3 = strArr2[i];
                    this.f51411a.add(new wvf(str3, Integer.valueOf((int) C0126R.string.gf_product_specific_data), str3, "com.google.android.gms.feedback.ShowTextActivity", 0, "product specific binary data details"));
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
