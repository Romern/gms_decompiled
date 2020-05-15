package com.google.android.gms.feedback;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ShowTextChimeraActivity extends Activity {

    /* renamed from: a */
    private final bqgj f31619a = snp.m35702a(9);

    /* renamed from: a */
    private final void m23400a(String str) {
        if (str != null) {
            ((TextView) findViewById(C0126R.C0129id.text)).setText(str);
            findViewById(C0126R.C0129id.empty_view).setVisibility(8);
            findViewById(C0126R.C0129id.text_view).setVisibility(0);
            findViewById(C0126R.C0129id.text_in_list_view).setVisibility(8);
            return;
        }
        findViewById(C0126R.C0129id.text_view).setVisibility(8);
        findViewById(C0126R.C0129id.empty_view).setVisibility(0);
        findViewById(C0126R.C0129id.text_in_list_view).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ErrorReport errorReport;
        super.onCreate(bundle);
        if (aayi.m47270b()) {
            errorReport = FeedbackChimeraActivity.m23367j();
            int intExtra = getIntent().getIntExtra("feedback.FIELD_NAME", 0);
            if (errorReport == null || intExtra == 0) {
                finish();
                return;
            }
            boolean a = aayi.m47267a();
            int i = C0126R.style.DarkDialogActivityStyle;
            if (a) {
                aayi.m47264a(this, errorReport, (int) C0126R.style.DialogActivityStyle, (int) C0126R.style.DarkDialogActivityStyle, (int) C0126R.style.DayNightDialogActivityStyle);
            } else {
                if (!aayi.m47268a(errorReport)) {
                    i = C0126R.style.DialogActivityStyle;
                }
                setTheme(i);
            }
            setContentView((int) C0126R.C0128layout.show_text_activity);
            setTitle(intExtra);
        } else {
            setContentView((int) C0126R.C0128layout.show_text_activity);
            int intExtra2 = getIntent().getIntExtra("feedback.FIELD_NAME", 0);
            ErrorReport j = FeedbackChimeraActivity.m23367j();
            if (j == null || intExtra2 == 0) {
                finish();
                return;
            } else {
                setTitle(intExtra2);
                errorReport = j;
            }
        }
        String stringExtra = getIntent().getStringExtra("feedback.FIELD_VALUE");
        if (TextUtils.equals(stringExtra, "running applications")) {
            mo18623a(errorReport.f31561q);
        } else if (TextUtils.equals(stringExtra, "system logs")) {
            mo18623a(errorReport.f31562r);
        } else if (TextUtils.equals(stringExtra, "event logs")) {
            mo18623a(errorReport.f31563s);
        } else if (TextUtils.equals(stringExtra, "stack trace")) {
            m23400a(errorReport.f31536a.crashInfo.stackTrace);
        } else if (TextUtils.equals(stringExtra, "anr info")) {
            m23400a(errorReport.f31536a.anrInfo.info);
        } else if (TextUtils.equals(stringExtra, "anr stack trace")) {
            m23400a(errorReport.f31564t);
        } else if (TextUtils.equals(stringExtra, "battery usage details")) {
            m23400a(errorReport.f31536a.batteryInfo.usageDetails);
        } else if (TextUtils.equals(stringExtra, "battery checkin details")) {
            m23400a(errorReport.f31536a.batteryInfo.checkinDetails);
        } else if (TextUtils.equals(stringExtra, "running service details")) {
            m23400a(errorReport.f31536a.runningServiceInfo.serviceDetails);
        } else if (TextUtils.equals(stringExtra, "product specific binary data details")) {
            new wyc(getIntent().getStringExtra("feedback.OBJECT_VALUE"), this).executeOnExecutor(this.f31619a, new Void[0]);
        }
    }

    /* renamed from: a */
    public final void mo18623a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            findViewById(C0126R.C0129id.text_view).setVisibility(8);
            findViewById(C0126R.C0129id.empty_view).setVisibility(0);
            findViewById(C0126R.C0129id.text_in_list_view).setVisibility(8);
            return;
        }
        findViewById(C0126R.C0129id.text_view).setVisibility(8);
        findViewById(C0126R.C0129id.empty_view).setVisibility(8);
        ListView listView = (ListView) findViewById(C0126R.C0129id.text_in_list_view);
        listView.setVisibility(0);
        listView.setAdapter((ListAdapter) new ArrayAdapter(this, 17367043, strArr));
        listView.setDivider(null);
        listView.setDividerHeight(0);
    }
}
