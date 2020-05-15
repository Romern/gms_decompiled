package com.google.android.gms.credential.manager;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.credential.manager.util.DarkThemeManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PasswordManagerChimeraActivity extends adcc {

    /* renamed from: b */
    private final AtomicBoolean f30704b = new AtomicBoolean(false);

    /* renamed from: c */
    private tuq f30705c;

    /* renamed from: d */
    private String f30706d;

    /* renamed from: e */
    private tsf f30707e;

    /* renamed from: a */
    private final void m22907a(boolean z) {
        bsmt bsmt;
        if (cdqa.m134649b()) {
            int i = Build.VERSION.SDK_INT;
        }
        if (tuz.m37509a(this) == null) {
            getSupportFragmentManager().beginTransaction().add(new tuz(), "RetainedCleanupFragment").commitNow();
        }
        tuq tuq = new tuq(this, this.f30706d, (Toolbar) findViewById(C0126R.C0129id.pwm_toolbar));
        tuq.f46692a.mo8626a(tuq.f46694c);
        C1341rz aW = tuq.f46692a.mo8628aW();
        if (aW != null) {
            aW.mo15858c(false);
            aW.mo15853b(true);
        }
        this.f30705c = tuq;
        String str = this.f30706d;
        tsk tsk = (tsk) tsl.m37443a(this);
        if (tsk == null) {
            tsk = new tsk();
            tuz.m37509a(this).mo26822a(tsm.class, tsk);
        }
        tsk.f46590a = this;
        tsk.f46591b = str;
        tsk.f46592c = C0126R.C0129id.main_container;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        tsk.f46593d = (tsp) supportFragmentManager.findFragmentByTag("CredentialsConfirmationFragmentTag");
        if (tsk.f46593d == null) {
            tsk.f46593d = tsp.m37449a(str);
            supportFragmentManager.beginTransaction().add(tsk.f46593d, "CredentialsConfirmationFragmentTag").commitNow();
        }
        tsk.f46593d.f46601c.mo2445a(this, new tsj(tsk));
        if (z) {
            if (!cdpx.m134644b() || !m22908e()) {
                tsl.m37443a(this).mo26766a(1, true);
            } else {
                tsl.m37443a(this).mo26766a(6, true);
            }
        }
        if (((tqe) getSupportFragmentManager().findFragmentByTag("user_metrics_fragment_tag")) == null) {
            String str2 = this.f30706d;
            if (!cdpx.m134644b() || !m22908e()) {
                bsmt = bsmt.PWM_ANDROID;
            } else {
                bsmt = bsmt.PWM_PICKER_ANDROID;
            }
            tqe tqe = new tqe();
            Bundle bundle = new Bundle();
            bundle.putString("pwm.DataFieldNames.accountName", str2);
            bundle.putSerializable("pwm.DataFieldNames.identityEventCategory", bsmt);
            tqe.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(tqe, "user_metrics_fragment_tag").commitNow();
        }
        this.f30707e = (tsf) adcj.m50162a(this, tsi.m37432a(this, this.f30706d)).mo3444a(tsf.class);
    }

    /* renamed from: e */
    private final boolean m22908e() {
        return getIntent().hasExtra("pwm.DataFieldNames.hasTwoFields");
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        tsf tsf = this.f30707e;
        if (tsf != null && tsf.mo26760d()) {
            this.f30707e.mo26761e();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1212) {
            this.f30704b.set(false);
            if (i2 == -1 && intent != null) {
                this.f30706d = intent.getStringExtra("authAccount");
                m22907a(true);
            } else {
                setResult(0);
                finish();
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        tsl.m37443a(this).mo26769b();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new DarkThemeManager(this);
        setContentView((int) C0126R.C0128layout.pwm_activity);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(C0126R.C0129id.main_swipe_refresh_layout);
        boolean z = false;
        swipeRefreshLayout.setEnabled(false);
        DarkThemeManager.m22911a(swipeRefreshLayout);
        if (!cdqa.m134649b()) {
            if (bundle == null) {
                String stringExtra = getIntent().getStringExtra("pwm.DataFieldNames.accountName");
                this.f30706d = stringExtra;
                if (stringExtra == null) {
                    throw new IllegalStateException("No account name given on start.");
                }
            } else {
                this.f30706d = bundle.getString("pwm.DataFieldNames.accountName");
            }
            if (bundle == null) {
                z = true;
            }
            m22907a(z);
        } else if (bundle == null) {
            String stringExtra2 = getIntent().getStringExtra("pwm.DataFieldNames.accountName");
            this.f30706d = stringExtra2;
            if (stringExtra2 == null) {
                List d = soz.m35801d(this, getPackageName());
                if (d.size() == 1) {
                    this.f30706d = ((Account) d.get(0)).name;
                }
            }
            if (!bmxx.m108577a(this.f30706d)) {
                m22907a(true);
            } else if (!this.f30704b.getAndSet(true)) {
                Intent a = rew.m33486a(null, null, new String[]{"com.google"}, true, null, false, 1, 2, null, true);
                if (!a.hasExtra("realClientPackage")) {
                    a.putExtra("realClientPackage", "com.google.android.gms");
                }
                acyp a2 = acyq.m50010a();
                a2.mo33245a(bmxv.m108566b(1001));
                a2.mo33246b(bmxv.m108566b(getResources().getString(C0126R.string.common_choose_account_label)));
                a.putExtra("first_party_options_bundle", a2.mo33244a().f61085a);
                startActivityForResult(a, 1212);
            }
        } else if (bundle.getBoolean("accountPickerVisisble", false)) {
            this.f30704b.set(true);
        } else {
            this.f30706d = bundle.getString("pwm.DataFieldNames.accountName");
            m22907a(false);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        tuq tuq = this.f30705c;
        C1341rz aW = tuq.f46692a.mo8628aW();
        if (aW != null) {
            aW.mo15863e((int) C0126R.C0127drawable.abc_ic_ab_back_material);
        }
        tuq.f46694c.findViewById(C0126R.C0129id.search_edit_text).setVisibility(8);
        tuq.f46694c.findViewById(C0126R.C0129id.save_edits_button).setVisibility(8);
        tuq.f46694c.findViewById(C0126R.C0129id.google_account_title).setVisibility(0);
        tuq.f46692a.getMenuInflater().inflate(C0126R.C0130menu.pwm_appbar_menu, menu);
        tuq.f46695d = menu.findItem(C0126R.C0129id.pwm_avatar_menu_item);
        C1264pc.m19827a(tuq.f46695d, tuq.f46692a.getResources().getText(C0126R.string.pwm_toolbar_avatar_button_description));
        tuq.f46697f.mo24713a(tuq.f46693b, 0, 0).mo9458a(new tun(tuq));
        tuq.f46698g.mo24710a((alkx) null).mo9458a(new tuo(tuq, tuq.f46693b));
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        tuq tuq = this.f30705c;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            tuq.f46692a.onBackPressed();
            return true;
        } else if (itemId != C0126R.C0129id.pwm_avatar_menu_item) {
            return false;
        } else {
            View findViewById = tuq.f46692a.findViewById(C0126R.C0129id.pwm_avatar_menu_item);
            if (C1221nn.m19678a(tux.m37507a()) == 1) {
                z = true;
            } else {
                z = false;
            }
            String str = tuq.f46693b;
            String str2 = tuq.f46696e;
            View inflate = tuq.f46692a.getLayoutInflater().inflate((int) C0126R.C0128layout.pwm_account_popup, (ViewGroup) tuq.f46692a.findViewById(C0126R.C0129id.pwm_app_bar), false);
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.account_name);
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.account_mail);
            if (str2 == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
            }
            textView2.setText(str);
            if (z) {
                textView.setGravity(8388611);
                textView2.setGravity(8388611);
            } else {
                textView.setGravity(8388613);
                textView2.setGravity(8388613);
            }
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
            popupWindow.setBackgroundDrawable(new ColorDrawable(C1133kh.m17843b(findViewById.getContext(), C0126R.color.google_transparent)));
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            inflate.setVisibility(4);
            popupWindow.showAsDropDown(findViewById, 0, 0);
            inflate.addOnLayoutChangeListener(new tup(inflate, popupWindow, z, findViewById));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("pwm.DataFieldNames.accountName", this.f30706d);
        if (cdqa.m134649b()) {
            bundle.putBoolean("accountPickerVisisble", this.f30704b.get());
        }
    }
}
