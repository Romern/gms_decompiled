package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthScopeDetailsChimeraActivity extends FragmentActivity implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: a */
    private String f11487a;

    /* renamed from: b */
    private Intent f11488b;

    /* renamed from: c */
    private ScrollView f11489c;

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
    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.f7440ok) {
            this.f11488b.putExtra("detail_end_time", System.currentTimeMillis());
            if (this.f11489c.getHeight() < this.f11489c.getChildAt(0).getMeasuredHeight()) {
                this.f11488b.putExtra("detail_screen_scrollable", true);
            } else {
                this.f11488b.putExtra("scroll_screen_end", true);
            }
            setResult(-1, this.f11488b);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        float f;
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.auth_consent_scope_details_activity);
        Intent intent = new Intent();
        this.f11488b = intent;
        intent.putExtra("detail_start_time", System.currentTimeMillis());
        this.f11487a = getIntent().getStringExtra("scope_details");
        ScrollView scrollView = (ScrollView) findViewById(C0126R.C0129id.scrollview_details);
        this.f11489c = scrollView;
        scrollView.setOnTouchListener(this);
        String str = this.f11487a;
        if (str != null) {
            Spanned fromHtml = Html.fromHtml(str.replaceAll("\n", "<br/>"));
            TextView textView = (TextView) findViewById(C0126R.C0129id.scope_details_text);
            textView.setText(fromHtml);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setClickable(true);
        } else {
            ((TextView) findViewById(C0126R.C0129id.scope_details_text)).setText((CharSequence) null);
        }
        ((Button) findViewById(C0126R.C0129id.f7440ok)).setOnClickListener(this);
        Resources resources = getResources();
        if (sre.m36081a(resources)) {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_resize_factor);
        }
        spa.m35815a(getContainerActivity(), (double) f);
    }

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
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() == C0126R.C0129id.scrollview_details && view.getHeight() + view.getScrollY() == this.f11489c.getChildAt(0).getMeasuredHeight()) {
            this.f11488b.putExtra("scroll_screen_end", true);
        }
        return false;
    }
}
