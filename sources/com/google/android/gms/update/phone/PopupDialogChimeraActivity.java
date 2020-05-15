package com.google.android.gms.update.phone;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PopupDialogChimeraActivity extends Activity {

    /* renamed from: b */
    public static final /* synthetic */ int f109500b = 0;

    /* renamed from: c */
    private static final long f109501c = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: d */
    private static final sek f109502d = avpq.m79022i("PopupDialogChimeraActivity");

    /* renamed from: a */
    public TextView f109503a;

    /* renamed from: e */
    private avpp f109504e;

    /* renamed from: f */
    private String f109505f;

    /* renamed from: g */
    private bnic f109506g;

    /* renamed from: h */
    private CountDownTimer f109507h;

    /* renamed from: i */
    private TextView f109508i;

    /* renamed from: j */
    private Button f109509j;

    /* renamed from: k */
    private Button f109510k;

    /* renamed from: l */
    private Button f109511l;

    /* renamed from: m */
    private boolean f109512m;

    /* renamed from: a */
    private final boolean m93724a() {
        if (getIntent().getIntExtra("device_system_update_status", 0) == 272 || getIntent().getIntExtra("device_system_update_status", 0) == 528) {
            return true;
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        this.f109504e = avpp.m79008a(this);
        int intExtra = getIntent().getIntExtra("type", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("is_glif", false);
        this.f109512m = booleanExtra;
        if (intExtra == 3 && booleanExtra) {
            requestWindowFeature(1);
            setContentView((int) C0126R.C0128layout.system_update_aggressive_popup_dialog);
            TextView textView = (TextView) findViewById(C0126R.C0129id.dialogTitle);
            this.f109508i = textView;
            textView.setVisibility(0);
        } else {
            setContentView((int) C0126R.C0128layout.system_update_popup_dialog);
        }
        this.f109503a = (TextView) findViewById(C0126R.C0129id.message);
        this.f109509j = (Button) findViewById(C0126R.C0129id.button1);
        this.f109510k = (Button) findViewById(C0126R.C0129id.button2);
        this.f109511l = (Button) findViewById(C0126R.C0129id.button3);
        if (intExtra == 1) {
            String b = bmxx.m108578b(getIntent().getStringExtra("message"));
            if (bmxx.m108577a(b)) {
                finish();
            } else {
                setTitle((int) C0126R.string.system_update_module_name);
                this.f109503a.setMovementMethod(LinkMovementMethod.getInstance());
                this.f109503a.setText(Html.fromHtml(b));
                this.f109509j.setVisibility(8);
                this.f109510k.setText((int) C0126R.string.common_ok);
                this.f109510k.setOnClickListener(new avqj(this));
                this.f109511l.setVisibility(8);
            }
        } else if (intExtra == 2) {
            avlf a = avko.m78681a(this);
            setTitle((int) C0126R.string.system_update_reboot_prompt_title);
            this.f109509j.setText((int) C0126R.string.common_not_now);
            this.f109509j.setOnClickListener(new avqk(this));
            this.f109510k.setText((int) C0126R.string.system_update_restart);
            this.f109510k.setOnClickListener(new avql(this, a));
            this.f109507h = new avqq(this, f109501c, TimeUnit.SECONDS.toMillis(1), a).start();
            this.f109511l.setVisibility(8);
        } else if (intExtra != 3) {
            finish();
        } else {
            avlf a2 = avko.m78681a(this);
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_security_update", false);
            if (this.f109512m) {
                TextView textView2 = this.f109508i;
                if (!booleanExtra2) {
                    i2 = C0126R.string.system_update_overdue_nonsecurity_update_status_text_glif;
                } else {
                    i2 = C0126R.string.system_update_overdue_security_update_status_text_glif;
                }
                textView2.setText(getText(i2));
            } else {
                if (!booleanExtra2) {
                    i = C0126R.string.system_update_nonsecurity_overdue_status_text;
                } else {
                    i = C0126R.string.system_update_security_overdue_status_text;
                }
                setTitle(i);
            }
            String charSequence = getText(C0126R.string.common_learn_more).toString();
            String valueOf = String.valueOf(TextUtils.expandTemplate(getIntent().getStringExtra("message"), new CharSequence[0]).toString());
            String valueOf2 = String.valueOf(charSequence);
            String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new avqr(this), str.length() - charSequence.length(), str.length(), 33);
            this.f109503a.setText(spannableString);
            this.f109503a.setMovementMethod(LinkMovementMethod.getInstance());
            this.f109503a.setHighlightColor(0);
            if (m93724a()) {
                this.f109509j.setText((int) C0126R.string.system_update_restart_now);
                this.f109509j.setOnClickListener(new avqm(this, a2));
            } else {
                this.f109509j.setText((int) C0126R.string.system_update_update_now);
                this.f109509j.setOnClickListener(new avqn(this, a2));
            }
            if (!getIntent().hasExtra("restart_window_start_time") || !m93724a()) {
                this.f109510k.setVisibility(8);
                if (this.f109512m) {
                    findViewById(C0126R.C0129id.download_tonight_button_group).setVisibility(8);
                }
            } else {
                this.f109510k.setText(TextUtils.expandTemplate(getText(C0126R.string.system_update_update_overnight), getIntent().getStringExtra("restart_window_start_time")));
                this.f109510k.setOnClickListener(new avqo(this, a2));
            }
            if (getIntent().getIntExtra("overdue_phase", 0) >= 3) {
                this.f109511l.setVisibility(8);
                if (this.f109512m) {
                    findViewById(C0126R.C0129id.remind_later_button_group).setVisibility(8);
                }
            } else {
                this.f109511l.setVisibility(0);
                if (this.f109512m) {
                    findViewById(C0126R.C0129id.remind_later_button_group).setVisibility(0);
                }
            }
            this.f109511l.setText((int) C0126R.string.system_update_remind_me_later);
            this.f109511l.setOnClickListener(new avqp(this));
        }
        View rootView = getWindow().getDecorView().getRootView();
        int i3 = Build.VERSION.SDK_INT;
        rootView.setLayoutDirection(3);
        setFinishOnTouchOutside(false);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        CountDownTimer countDownTimer = this.f109507h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    public final void onPause() {
        if (getIntent().getIntExtra("type", -1) == 1) {
            mo59676a(17);
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f109505f = String.valueOf(SystemClock.elapsedRealtime());
        bnia j = bnic.m109500j();
        for (String str : bmyx.m108640a(',').mo66920b().mo66917a().mo66918a((CharSequence) cfsg.m142818e())) {
            try {
                j.mo67629b(Integer.valueOf(str));
            } catch (NumberFormatException e) {
                f109502d.mo25416d("Failed to parse Ui event code: %s.", str);
            }
        }
        this.f109506g = j.mo67751a();
        if (getIntent().getIntExtra("type", -1) == 3) {
            mo59676a(20);
        }
    }

    /* renamed from: a */
    public final void mo59676a(int i) {
        if (this.f109506g.contains(Integer.valueOf(i))) {
            bxvd da = bohu.f133155d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bohu bohu = (bohu) da.f164949b;
            int i2 = bohu.f133157a | 1;
            bohu.f133157a = i2;
            bohu.f133158b = i;
            String str = this.f109505f;
            str.getClass();
            bohu.f133157a = i2 | 2;
            bohu.f133159c = str;
            this.f109504e.mo51480a((bohu) da.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo59677a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(getPackageManager()) == null) {
                sek sek = f109502d;
                String valueOf = String.valueOf(str);
                sek.mo25416d(valueOf.length() == 0 ? new String("No activity is able to handle the uri: ") : "No activity is able to handle the uri: ".concat(valueOf), new Object[0]);
                return;
            }
            startActivity(parseUri);
        } catch (URISyntaxException e) {
            sek sek2 = f109502d;
            String valueOf2 = String.valueOf(str);
            sek2.mo25418e(valueOf2.length() == 0 ? new String("Invalid url syntax: ") : "Invalid url syntax: ".concat(valueOf2), new Object[0]);
        }
    }
}
