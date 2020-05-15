package com.google.android.gms.update;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.update.phone.layout.view.SystemUpdateSnackbar;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraUpdateFromSdCardActivity extends FragmentActivity implements View.OnClickListener {

    /* renamed from: h */
    private static boolean f109424h = false;

    /* renamed from: a */
    public avkm f109425a = null;

    /* renamed from: b */
    public String f109426b;

    /* renamed from: c */
    public View f109427c;

    /* renamed from: d */
    public Dialog f109428d;

    /* renamed from: e */
    public boolean f109429e;

    /* renamed from: f */
    public long f109430f;

    /* renamed from: g */
    public List f109431g;

    /* renamed from: i */
    private int f109432i;

    /* renamed from: j */
    private Handler f109433j;

    /* renamed from: k */
    private BroadcastReceiver f109434k = new aacn("ota") {
        /* class com.google.android.gms.update.ChimeraUpdateFromSdCardActivity.C16731 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = ChimeraUpdateFromSdCardActivity.this;
            if (chimeraUpdateFromSdCardActivity.f109430f == 0) {
                chimeraUpdateFromSdCardActivity.mo59650b();
            }
        }
    };

    /* renamed from: l */
    private BroadcastReceiver f109435l = new aacn("ota") {
        /* class com.google.android.gms.update.ChimeraUpdateFromSdCardActivity.C16742 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Received media removed intent: ");
            sb.append(valueOf);
            sb.toString();
            ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = ChimeraUpdateFromSdCardActivity.this;
            if (!chimeraUpdateFromSdCardActivity.f109429e) {
                chimeraUpdateFromSdCardActivity.mo59651c();
            }
        }
    };

    /* renamed from: m */
    private ServiceConnection f109436m = new avjp(this, "ota");

    /* renamed from: a */
    private final void m93687a(int i, int i2) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    /* renamed from: b */
    private final void m93689b(int i, int i2) {
        m93688a(i, getText(i2));
    }

    /* renamed from: f */
    private final void m93690f() {
        try {
            unregisterReceiver(this.f109434k);
        } catch (IllegalArgumentException e) {
        }
        try {
            unregisterReceiver(this.f109435l);
        } catch (IllegalArgumentException e2) {
        }
    }

    /* renamed from: g */
    private final void m93691g() {
        if (this.f109430f > 0) {
            this.f109430f = 0;
            this.f109429e = false;
        }
        mo59650b();
    }

    /* renamed from: h */
    private static final boolean m93692h() {
        return alai.m60751a().mo40053b() > 0;
    }

    /* renamed from: c */
    public final void mo59651c() {
        avkm avkm = this.f109425a;
        if (avkm != null) {
            try {
                avkm.mo51337d();
            } catch (RemoteException e) {
                Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on clearVerifiedState() failure.");
                mo59647a();
            }
        }
        finish();
    }

    /* renamed from: d */
    public final String mo59652d() {
        if (this.f109431g.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List list = this.f109431g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo59653e() {
        List list = this.f109431g;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f109431g;
            list2.remove(list2.size() - 1);
        }
    }

    public void onClick(View view) {
        if (this.f109432i == -1) {
            try {
                this.f109432i = this.f109425a.mo51333a();
            } catch (RemoteException e) {
                Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on click getStatus() failure.");
                mo59647a();
            }
        }
        int i = this.f109432i;
        if (i != 4) {
            if (i != 263) {
                mo59651c();
            } else if (view.getId() == C0126R.C0129id.action_button) {
                mo59651c();
            }
        } else if (view.getId() == C0126R.C0129id.action_button) {
            if (this.f109429e) {
                m93691g();
            } else if (this.f109430f <= 0) {
                this.f109429e = true;
                avlh.m78711a(this);
                this.f109430f = System.currentTimeMillis() + 9999;
                m93689b(C0126R.C0129id.action_button, C0126R.string.system_update_countdown_cancel_button);
                m93687a((int) C0126R.C0129id.action_button_2, 8);
                mo59649a(this.f109430f);
            }
        } else if (view.getId() == C0126R.C0129id.action_button_2) {
            this.f109431g.clear();
            this.f109426b = null;
            this.f109427c = null;
            this.f109430f = 0;
            mo59651c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m93692h()) {
            Toast makeText = Toast.makeText(this, (int) C0126R.string.system_update_not_owner_text, 1);
            makeText.setGravity(17, makeText.getXOffset(), makeText.getYOffset());
            makeText.show();
            finish();
            return;
        }
        this.f109431g = new ArrayList();
        if (bundle != null) {
            if (bundle.getStringArray("path_array") != null) {
                for (String str : bundle.getStringArray("path_array")) {
                    this.f109431g.add(str);
                }
            }
            if (bundle.getString("last_clicked_item") != null) {
                this.f109426b = bundle.getString("last_clicked_item");
            }
            this.f109430f = bundle.getLong("countdown_end", 0);
        } else {
            this.f109430f = 0;
        }
        this.f109432i = -1;
        mo59647a();
        this.f109433j = new adzt();
        int i = Build.VERSION.SDK_INT;
        setContentView((int) C0126R.C0128layout.system_update_activity_common);
        NavigationBar c = ((SetupWizardLayout) findViewById(C0126R.C0129id.setup_wizard_layout)).mo71377c();
        if (c != null) {
            c.setVisibility(8);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        registerReceiver(this.f109435l, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.update.UpdateFromSdCard.STATUS_CHANGED");
        registerReceiver(this.f109434k, intentFilter2);
        findViewById(C0126R.C0129id.action_button).setOnClickListener(this);
        findViewById(C0126R.C0129id.action_button_2).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (!m93692h()) {
            m93690f();
            if (f109424h) {
                skh.m35531a().mo25689a(this, this.f109436m);
                f109424h = false;
                this.f109425a = null;
            }
            Dialog dialog = this.f109428d;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        try {
            if (this.f109425a.mo51333a() == 1) {
                if (this.f109431g.isEmpty()) {
                    finish();
                } else {
                    mo59653e();
                    mo59650b();
                }
                return true;
            }
        } catch (RemoteException e) {
            Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on key down getStatus() failure.");
            mo59647a();
        }
        mo59651c();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!this.f109429e) {
            m93691g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.f109431g.isEmpty()) {
            String[] strArr = new String[this.f109431g.size()];
            this.f109431g.toArray(strArr);
            bundle.putStringArray("path_array", strArr);
        }
        String str = this.f109426b;
        if (str != null) {
            bundle.putString("last_clicked_item", str);
        }
        bundle.putLong("countdown_end", this.f109430f);
    }

    /* renamed from: b */
    public final void mo59650b() {
        int i;
        try {
            i = this.f109425a.mo51333a();
        } catch (RemoteException e) {
            Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on draw getStatus() failure.");
            mo59647a();
            i = -1;
        }
        mo59648a(i);
    }

    /* renamed from: a */
    private final void m93688a(int i, CharSequence charSequence) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            findViewById.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo59647a() {
        synchronized (this) {
            if (!f109424h) {
                Intent intent = new Intent(new Intent("com.google.android.gms.update.BIND_SDCARD_SERVICE"));
                intent.setPackage("com.google.android.gms");
                boolean a = skh.m35531a().mo25690a(this, intent, this.f109436m, 1);
                f109424h = a;
                if (!a) {
                    Log.e("CmaUpdateFromSdCardA", "bindService call to ChimeraUpdateFromSdCardService returned false!");
                }
            } else {
                mo59650b();
            }
        }
    }

    /* renamed from: a */
    public final void mo59648a(int i) {
        String str;
        m93687a((int) C0126R.C0129id.status, 8);
        m93687a((int) C0126R.C0129id.status2, 8);
        m93687a((int) C0126R.C0129id.size, 8);
        m93687a((int) C0126R.C0129id.progress, 8);
        m93687a((int) C0126R.C0129id.action_button, 8);
        m93687a((int) C0126R.C0129id.action_button_2, 8);
        int i2 = Build.VERSION.SDK_INT;
        SystemUpdateSnackbar systemUpdateSnackbar = (SystemUpdateSnackbar) findViewById(C0126R.C0129id.snackbar);
        if (systemUpdateSnackbar != null) {
            systemUpdateSnackbar.setVisibility(8);
        }
        m93687a((int) C0126R.C0129id.button_qualifier, 8);
        m93689b(C0126R.C0129id.title, C0126R.string.system_update_from_sd_card_button_and_title);
        StringBuilder sb = new StringBuilder(51);
        sb.append("drawing for the current service status: ");
        sb.append(i);
        sb.toString();
        this.f109432i = i;
        if (i == -1) {
            m93689b(C0126R.C0129id.description, C0126R.string.system_update_from_sd_card_unknown_status);
            m93689b(C0126R.C0129id.action_button, C0126R.string.common_cancel);
            m93687a((int) C0126R.C0129id.action_button, 0);
        } else if (i == 1) {
            new ArrayList();
            try {
                List a = this.f109425a.mo51334a(mo59652d());
                if (this.f109428d == null) {
                    Dialog dialog = new Dialog(this);
                    this.f109428d = dialog;
                    dialog.setContentView((int) C0126R.C0128layout.system_update_file_browser);
                    this.f109428d.setTitle((int) C0126R.string.system_update_file_browser_title);
                }
                if (!this.f109431g.isEmpty()) {
                    this.f109428d.findViewById(C0126R.C0129id.file_browser_cur_folder).setVisibility(0);
                    TextView textView = (TextView) this.f109428d.findViewById(C0126R.C0129id.file_browser_cur_folder_text);
                    if (!this.f109431g.isEmpty()) {
                        List list = this.f109431g;
                        str = (String) list.get(list.size() - 1);
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                    this.f109428d.findViewById(C0126R.C0129id.file_browser_cur_folder).setOnClickListener(new avjq(this));
                } else {
                    this.f109428d.findViewById(C0126R.C0129id.file_browser_cur_folder).setVisibility(8);
                }
                Button button = (Button) this.f109428d.findViewById(C0126R.C0129id.file_browser_ok_button);
                button.setEnabled(false);
                button.setOnClickListener(new avjr(this));
                ((Button) this.f109428d.findViewById(C0126R.C0129id.file_browser_cancel_button)).setOnClickListener(new avjs(this));
                avka avka = new avka(getContainerActivity().getLayoutInflater(), a);
                ListView listView = (ListView) this.f109428d.findViewById(C0126R.C0129id.file_browser_list_view);
                listView.setAdapter((ListAdapter) avka);
                listView.setOnItemClickListener(new avjt(this, avka));
                this.f109428d.setOnKeyListener(new avju(this));
                this.f109428d.show();
            } catch (RemoteException e) {
                Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on listFilesInDirectory() failure.");
                mo59647a();
            }
        } else if (i == 263) {
            m93689b(C0126R.C0129id.description, C0126R.string.system_update_verification_failed_text);
            m93687a((int) C0126R.C0129id.description, 0);
            m93689b(C0126R.C0129id.action_button, C0126R.string.common_ok);
            m93687a((int) C0126R.C0129id.action_button, 0);
        } else if (i == 1040) {
            m93689b(C0126R.C0129id.description, C0126R.string.system_update_from_sd_card_verified_description);
            m93687a((int) C0126R.C0129id.description, 0);
            int i3 = Build.VERSION.SDK_INT;
            SystemUpdateSnackbar systemUpdateSnackbar2 = (SystemUpdateSnackbar) findViewById(C0126R.C0129id.snackbar);
            if (systemUpdateSnackbar2 != null) {
                systemUpdateSnackbar2.setText((int) C0126R.string.system_update_low_battery_text);
                systemUpdateSnackbar2.setVisibility(0);
            }
        } else if (i == 3) {
            ProgressBar progressBar = (ProgressBar) findViewById(C0126R.C0129id.progress);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            m93689b(C0126R.C0129id.description, C0126R.string.system_update_from_sd_card_verifying_status);
            m93687a((int) C0126R.C0129id.description, 0);
            findViewById(C0126R.C0129id.action_button).setVisibility(8);
            m93689b(C0126R.C0129id.action_button_2, C0126R.string.common_cancel);
            m93687a((int) C0126R.C0129id.action_button_2, 0);
        } else if (i == 4) {
            m93687a((int) C0126R.C0129id.status, 0);
            m93689b(C0126R.C0129id.description, C0126R.string.system_update_from_sd_card_verified_description);
            m93687a((int) C0126R.C0129id.description, 0);
            m93689b(C0126R.C0129id.action_button, C0126R.string.system_update_restart_now);
            m93687a((int) C0126R.C0129id.action_button, 0);
            m93689b(C0126R.C0129id.action_button_2, C0126R.string.common_cancel);
            m93687a((int) C0126R.C0129id.action_button_2, 0);
        }
    }

    /* renamed from: a */
    public final void mo59649a(long j) {
        long j2 = this.f109430f;
        if (j == j2 && j2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f109430f;
            if (currentTimeMillis < j3) {
                int i = ((int) ((j3 - currentTimeMillis) / 1000)) + 1;
                m93688a((int) C0126R.C0129id.description, getResources().getQuantityString(C0126R.plurals.system_update_countdown_message, i, Integer.valueOf(i)));
                this.f109433j.postDelayed(new avjv(this, j), (long) ((int) ((this.f109430f - ((long) ((i - 1) * 1000))) - currentTimeMillis)));
            } else if (this.f109425a == null) {
                Log.e("CmaUpdateFromSdCardA", "Lost connection to the service. Cannot install.");
            } else {
                m93690f();
                try {
                    this.f109425a.mo51336c();
                } catch (RemoteException e) {
                    Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on installUpdate() failure.");
                    mo59647a();
                }
            }
        }
    }
}
