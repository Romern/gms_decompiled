package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ErrorChimeraActivity extends jxx implements imf {

    /* renamed from: a */
    public static final imr f11370a = imr.m15727a("title_res_id");

    /* renamed from: b */
    public static final imr f11371b = imr.m15727a("message");

    /* renamed from: c */
    public static final imr f11372c = imr.m15727a("back_visibility");

    /* renamed from: d */
    public static final imr f11373d = imr.m15727a("back_label_res_id");

    /* renamed from: e */
    public static final imr f11374e = imr.m15727a("is_setup_wizard");

    /* renamed from: f */
    private img f11375f;

    /* renamed from: a */
    public static Intent m6967a(Context context, int i, int i2) {
        return m6969a(context, "com.google.android.gms.auth.uiflows.addaccount.ErrorActivity", i, context.getString(i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "ErrorActivity";
    }

    public final void onBackPressed() {
        mo7874a(0, null);
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        boolean z = true;
        if (!gkf.f18388a.mo11981b(this)) {
            boolean a = rrp.m34306a(mo14203f().f43552a);
            LayoutInflater from = LayoutInflater.from(this);
            if (!a) {
                i = C0126R.C0128layout.auth_generic_suw_activity;
            } else {
                i = C0126R.C0128layout.auth_generic_suw_glif_activity;
            }
            img img = (img) from.inflate(i, (ViewGroup) null, false);
            this.f11375f = img;
            rrp.m34302a((ViewGroup) img);
            if (cbzk.m128961c()) {
                this.f23435m = (imj) this.f11375f;
            }
            this.f11375f.mo13137a(getText(((Integer) mo14202g().mo13146a(f11370a)).intValue()));
            this.f11375f.mo7888b((CharSequence) mo14202g().mo13146a(f11371b));
            Integer num = (Integer) mo14202g().mo13146a(f11372c);
            if (num != null) {
                img img2 = this.f11375f;
                if (num.intValue() != 0) {
                    z = false;
                }
                img2.mo7884a(z);
            }
            Integer num2 = (Integer) mo14202g().mo13146a(f11373d);
            if (num2 != null) {
                this.f11375f.mo7889c(getText(num2.intValue()));
            }
            this.f11375f.mo7883a(this);
            setContentView((View) this.f11375f);
        } else if (!((Boolean) mo14202g().mo13147a(f11374e, false)).booleanValue()) {
            setTheme(C0126R.style.TvMinuteMaidOpaque);
            setContentView(LayoutInflater.from(this).inflate((int) C0126R.C0128layout.auth_tv_glif_error_activity, (ViewGroup) null));
            ((TextView) findViewById(C0126R.C0129id.title)).setText(getText(((Integer) mo14202g().mo13146a(f11370a)).intValue()));
            ((TextView) findViewById(C0126R.C0129id.message)).setText((CharSequence) mo14202g().mo13146a(f11371b));
            TextView textView = (TextView) findViewById(C0126R.C0129id.button);
            textView.setText((int) C0126R.string.auth_device_management_go_back);
            textView.setOnClickListener(new jvu(this));
        } else {
            int i2 = Build.VERSION.SDK_INT;
            mo7874a(0, new Intent().putExtra("ERROR_OCCURRED", true));
        }
    }

    /* renamed from: a */
    public static Intent m6968a(Context context, int i, CharSequence charSequence) {
        return m6969a(context, "com.google.android.gms.auth.uiflows.addaccount.ErrorActivity", i, charSequence);
    }

    /* renamed from: a */
    protected static Intent m6969a(Context context, String str, int i, CharSequence charSequence) {
        Intent className = new Intent().setClassName(context, str);
        ims ims = new ims();
        ims.mo13148b(f11370a, Integer.valueOf(i));
        ims.mo13148b(f11371b, charSequence);
        ims.mo13148b(f11372c, 0);
        return className.putExtras(ims.f21367a);
    }

    /* renamed from: a */
    public final void mo7869a() {
        mo7874a(-1, null);
    }
}
