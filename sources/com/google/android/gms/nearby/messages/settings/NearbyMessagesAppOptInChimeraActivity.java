package com.google.android.gms.nearby.messages.settings;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyMessagesAppOptInChimeraActivity extends Activity {

    /* renamed from: a */
    public Button f80824a;

    /* renamed from: b */
    private String f80825b;

    /* renamed from: c */
    private ajgk f80826c;

    /* renamed from: d */
    private CheckBox f80827d;

    /* renamed from: e */
    private TextView f80828e;

    /* renamed from: f */
    private C1350sh f80829f;

    /* renamed from: g */
    private boolean f80830g;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static PendingIntent m67429a(Context context, String str) {
        ajgk ajgk = new ajgk(context);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInActivity"));
        intent.putExtra("FAIL_IMMEDIATELY", false);
        intent.putExtra("OPT_IN_PACKAGE", str);
        ajgk.mo38613c();
        intent.putExtra("EXTRA_PACKAGE_DENIED", ajgk.mo38611b().getBoolean(str, false));
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    public final void onBackPressed() {
        mo44379a();
    }

    public void onConfirm(View view) {
        this.f80826c.mo38609a(this.f80825b, true);
        setResult(-1, new Intent());
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f80826c = new ajgk(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getBoolean("FAIL_IMMEDIATELY")) {
            setResult(0, new Intent());
            finish();
            return;
        }
        this.f80825b = extras.getString("OPT_IN_PACKAGE");
        this.f80830g = extras.getBoolean("EXTRA_PACKAGE_DENIED", false);
        String str = null;
        View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.messages_opt_in_popup, (ViewGroup) null);
        this.f80827d = (CheckBox) inflate.findViewById(C0126R.C0129id.never_ask_again);
        this.f80828e = (TextView) inflate.findViewById(C0126R.C0129id.learn_more);
        this.f80824a = (Button) inflate.findViewById(C0126R.C0129id.opt_in_allow);
        if (!cfop.f185115a.mo6606a().mo82242u()) {
            this.f80828e.setMovementMethod(LinkMovementMethod.getInstance());
            int i = Build.VERSION.SDK_INT;
            Spannable spannable = (Spannable) Html.fromHtml(getString(C0126R.string.messages_opt_in_text, new Object[]{getResources().getString(C0126R.string.messages_setting_path_v23), bute.m120427a(cfop.f185115a.mo6606a().mo82244w())}));
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannable.setSpan(new UnderlineSpan() {
                    /* class com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity.C16091 */

                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(NearbyMessagesAppOptInChimeraActivity.this.getResources().getColor(C0126R.color.messages_activity_primary));
                    }
                }, spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            }
            this.f80828e.setText(spannable);
        } else {
            this.f80828e.setVisibility(8);
        }
        this.f80827d.setOnCheckedChangeListener(new ajgi(this));
        this.f80824a.requestFocus();
        inflate.requestFocus();
        C1349sg sgVar = new C1349sg(this);
        sgVar.mo15907b(inflate);
        try {
            str = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.f80825b, 128)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Package name no longer exists: %s", this.f80825b);
            mo44379a();
        }
        sgVar.mo15897a(new ajgl(this, str));
        sgVar.mo15893a(new ajgj(this));
        C1350sh b = sgVar.mo15904b();
        this.f80829f = b;
        b.setCanceledOnTouchOutside(false);
        this.f80829f.show();
        m67430a(this.f80830g);
    }

    public void onDeny(View view) {
        if (this.f80827d.isChecked()) {
            ajgk ajgk = this.f80826c;
            ajgk.mo38608a().putBoolean(this.f80825b, false).commit();
        }
        ajgk ajgk2 = this.f80826c;
        ajgk2.mo38611b().edit().putBoolean(this.f80825b, true).commit();
        mo44379a();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C1350sh shVar = this.f80829f;
        if (shVar != null) {
            shVar.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        m67430a(this.f80830g);
    }

    /* renamed from: a */
    private final void m67430a(boolean z) {
        if (z) {
            this.f80827d.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo44379a() {
        this.f80826c.mo38609a(this.f80825b, false);
        setResult(0, new Intent());
        finish();
    }
}
