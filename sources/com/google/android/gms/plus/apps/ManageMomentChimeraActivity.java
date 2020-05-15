package com.google.android.gms.plus.apps;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ItemScope;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentEntity;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ManageMomentChimeraActivity extends deu implements View.OnClickListener, DialogInterface.OnClickListener, DialogInterface.OnCancelListener, rjz, rka, anur, anmu, anmw, annv, annn, annz {

    /* renamed from: b */
    private Account f82258b;

    /* renamed from: c */
    private MomentEntity f82259c;

    /* renamed from: d */
    private ApplicationEntity f82260d;

    /* renamed from: e */
    private String f82261e;

    /* renamed from: f */
    private String f82262f;

    /* renamed from: g */
    private boolean f82263g;

    /* renamed from: h */
    private boolean f82264h;

    /* renamed from: i */
    private anmx f82265i;

    /* renamed from: j */
    private annw f82266j;

    /* renamed from: k */
    private anno f82267k;

    /* renamed from: l */
    private AlertDialog f82268l;

    /* renamed from: m */
    private final anul f82269m;

    /* renamed from: n */
    private anuy f82270n;

    /* renamed from: o */
    private anoa f82271o;

    public ManageMomentChimeraActivity() {
        this(anuy.f77749a);
    }

    /* renamed from: e */
    private final void m68326e() {
        ((TextView) findViewById(C0126R.C0129id.acl)).setText(String.format(getString(C0126R.string.plus_manage_moment_acl), this.f82261e));
        int i = Build.VERSION.SDK_INT;
        if (this.f82259c.mo46694j()) {
            Account account = this.f82258b;
            MomentEntity momentEntity = this.f82259c;
            String a = spn.m35852a((Activity) this);
            String str = this.f82261e;
            anmv a2 = anmv.m64789a(account, momentEntity, a);
            Bundle arguments = a2.getArguments();
            arguments.putString("acl_text", str);
            a2.setArguments(arguments);
            a2.show(getSupportFragmentManager(), "delete_moment_dialog");
        }
    }

    /* renamed from: g */
    private final void m68327g() {
        Toast.makeText(this, (int) C0126R.string.plus_manage_moment_acl_error, 1).show();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f82263g = false;
        this.f82268l = null;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f82263g = false;
        dialogInterface.dismiss();
        this.f82268l = null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (soz.m35807f(this)) {
            Log.w("AppSettings", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
        } else if (!rfz.m33557a(this).mo24610b(spn.m35852a((Activity) this))) {
            setResult(0);
            finish();
        } else {
            if (bundle != null) {
                this.f82258b = (Account) bundle.getParcelable("account");
                this.f82259c = (MomentEntity) bundle.getParcelable("moment");
                this.f82260d = (ApplicationEntity) bundle.getParcelable("application");
                this.f82261e = bundle.getString("moment_acl");
                this.f82263g = bundle.getBoolean("manage_error");
            }
            if (this.f82258b == null || this.f82259c == null) {
                this.f82258b = (Account) getIntent().getParcelableExtra("account");
                this.f82259c = (MomentEntity) getIntent().getParcelableExtra("app_activity");
                this.f82260d = (ApplicationEntity) getIntent().getParcelableExtra("application");
            }
            if (this.f82258b == null || this.f82259c == null) {
                if (Log.isLoggable("AppSettings", 5)) {
                    Log.w("AppSettings", String.format("Missing required extra(s): account=%s moment=%s", this.f82258b, this.f82259c));
                }
                setResult(1);
                finish();
                return;
            }
            setContentView((int) C0126R.C0128layout.plus_manage_moment_activity);
            int i = Build.VERSION.SDK_INT;
            mo8628aW().mo15862e();
            ((TextView) findViewById(C0126R.C0129id.action)).setVisibility(8);
            ((TextView) findViewById(C0126R.C0129id.target)).setText(this.f82259c.f82973f);
            if (this.f82259c.mo42750h()) {
                try {
                    ((TextView) findViewById(C0126R.C0129id.time)).setText(anmt.m64787a(this, anms.m64784a(this.f82259c.f82975h).f77160a));
                } catch (NumberFormatException e) {
                }
            }
            String str = null;
            if (this.f82259c.mo46694j()) {
                TextView textView = (TextView) findViewById(C0126R.C0129id.delete);
                textView.setOnClickListener(this);
                textView.setText((int) C0126R.string.plus_manage_moment_delete_label);
            } else {
                findViewById(C0126R.C0129id.manage_divider).setVisibility(8);
                findViewById(C0126R.C0129id.manage_layout).setVisibility(8);
                if (this.f82263g) {
                    View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.plus_delete_moment_dialog_contents, (ViewGroup) null);
                    TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.message);
                    textView2.setText(annj.m64806a(getText(C0126R.string.plus_manage_moment_no_in_app_delete), (String) ansx.f77702x.mo25081c()));
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f82268l = new AlertDialog.Builder(this).setPositiveButton((int) C0126R.string.plus_done, this).setOnCancelListener(this).setView(inflate).setInverseBackgroundForced(true).show();
                }
            }
            if (this.f82261e == null) {
                this.f82270n = anme.m64734a(this.f82269m, this, this, this, this.f82258b.name);
            } else {
                m68326e();
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            anmx anmx = (anmx) supportFragmentManager.findFragmentByTag("delete_moment_fragment");
            this.f82265i = anmx;
            if (anmx == null) {
                Account account = this.f82258b;
                anul anul = anuy.f77749a;
                anmx anmx2 = new anmx();
                anmx2.f77169a = anul;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("account", account);
                anmx2.setArguments(bundle2);
                this.f82265i = anmx2;
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.add(this.f82265i, "delete_moment_fragment");
                beginTransaction.commit();
            }
            ItemScope itemScope = this.f82259c.f82976i;
            if (itemScope != null) {
                str = itemScope.f82948c;
            }
            Drawable a = annt.m64831a(this).mo42012a(str);
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.image);
            imageView.setOnClickListener(this);
            imageView.setClickable(true);
            if (a != null) {
                ((ImageView) findViewById(C0126R.C0129id.image)).setImageDrawable(a);
                return;
            }
            ((ImageView) findViewById(C0126R.C0129id.image)).setImageResource(C0126R.C0127drawable.plus_icon_red_32);
            if (str != null) {
                this.f82262f = str;
                annw a2 = annw.m64835a((Context) this);
                this.f82266j = a2;
                a2.mo42016a((annv) this);
                this.f82266j.mo42017a(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        anno anno = this.f82267k;
        if (anno != null) {
            anno.mo41999b(this);
            this.f82267k = null;
        }
        annw annw = this.f82266j;
        if (annw != null) {
            annw.mo42018b(this);
            this.f82266j = null;
        }
        AlertDialog alertDialog = this.f82268l;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f82268l = null;
        }
    }

    public final void onPause() {
        super.onPause();
        anuy anuy = this.f82270n;
        if (anuy != null && (anuy.mo24648p() || this.f82270n.mo24649q())) {
            this.f82270n.mo14032j();
        }
        anoa anoa = this.f82271o;
        if (anoa != null) {
            anoa.mo42026a((annz) this);
            this.f82271o = null;
        }
        this.f82264h = false;
    }

    public final void onResumeFragments() {
        anuy anuy;
        super.onResumeFragments();
        if (this.f82261e == null && (anuy = this.f82270n) != null && !anuy.mo24648p() && !this.f82270n.mo24649q()) {
            this.f82270n.mo42332x();
        }
        ApplicationEntity applicationEntity = this.f82260d;
        if (applicationEntity == null || applicationEntity.f82380b == null) {
            anoa a = anoa.m64848a((Context) this);
            this.f82271o = a;
            a.mo42027a(this, this.f82259c.f82971d, this.f82258b.name);
        }
        this.f82264h = true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.f82258b);
        bundle.putParcelable("moment", this.f82259c);
        bundle.putParcelable("application", this.f82260d);
        bundle.putString("moment_acl", this.f82261e);
        bundle.putBoolean("manage_error", this.f82263g);
    }

    public ManageMomentChimeraActivity(anul anul) {
        this.f82263g = true;
        this.f82269m = anul;
    }

    /* renamed from: a */
    public final void mo42020a(anny anny) {
        String str;
        if (anny.f77255a.equals(this.f82259c.f82971d)) {
            this.f82260d = new ApplicationEntity(anny.f77256b, anny.f77257c, anny.f77255a);
            C1341rz aW = mo8628aW();
            ApplicationEntity applicationEntity = this.f82260d;
            if (applicationEntity == null || (str = applicationEntity.f82380b) == null) {
                aW.mo15855c((int) C0126R.string.plus_manage_moment_label);
            } else {
                aW.mo15845a(str);
            }
            aW.mo15853b(true);
            if (this.f82260d != null) {
                anlv a = anlw.m64727a(this).mo41925a(this.f82260d);
                aW.mo15842a(a.f77093b);
                String str2 = this.f82260d.f82381c;
                if (a.f77094c && str2 != null) {
                    anno a2 = anno.m64822a((Context) this);
                    this.f82267k = a2;
                    a2.mo41997a((annn) this);
                    this.f82267k.mo41998a(this.f82260d, str2);
                }
            }
        }
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        setResult(0);
        finish();
        return true;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f82270n.mo42314a(this, this.f82259c.f82974g);
    }

    public void onClick(View view) {
        String str;
        int id = view.getId();
        if (id == C0126R.C0129id.delete) {
            if (this.f82259c.mo46694j() && this.f82264h) {
                anmv.m64789a(this.f82258b, this.f82259c, spn.m35852a((Activity) this)).show(getSupportFragmentManager(), "delete_moment_dialog");
            }
        } else if (id == C0126R.C0129id.image) {
            ItemScope itemScope = this.f82259c.f82976i;
            if (itemScope != null) {
                str = itemScope.f82949d;
            } else {
                str = null;
            }
            shz.m35339a(this, this.f82258b.name, (String) null, !annj.m64807a(str, this, this) ? rig.f43044l : rig.f43043k, rih.f43054h, getPackageName());
        }
    }

    /* renamed from: a */
    public final void mo41933a(anxl anxl, Drawable drawable) {
        if (this.f82260d.f82382d.equals(anxl.mo42353c()) && drawable != null) {
            mo8628aW().mo15842a(drawable);
            anlw.m64727a(this).mo41926a(anxl, drawable);
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        m68327g();
    }

    /* renamed from: a */
    public final void mo41971a(String str) {
        anmx anmx = this.f82265i;
        if (!anmx.f77173e) {
            anmx.f77173e = true;
            anmx.f77174f = str;
            if (anmx.f77170b.mo24648p()) {
                anmx.mo7257g(Bundle.EMPTY);
            } else if (!anmx.f77171c) {
                anmx.f77170b.mo42332x();
                anmx.f77171c = true;
            }
            aoni a = aoni.m66138a(getString(C0126R.string.plus_delete_moment_progress_dialog_message));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a, "progress_dialog");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        if (Log.isLoggable("DeleteMomentFragment", 5)) {
            Log.w("DeleteMomentFragment", "Can only delete one app activity at a time.");
        }
        aong.m66135a(getString(C0126R.string.plus_delete_moment_failed_dialog_message)).show(getSupportFragmentManager(), "error_dialog");
    }

    /* renamed from: a */
    public final void mo42015a(String str, Drawable drawable) {
        if (this.f82262f.equals(str) && drawable != null) {
            ((ImageView) findViewById(C0126R.C0129id.image)).setImageDrawable(drawable);
            annt.m64831a(this).mo42013a(str, drawable);
        }
    }

    /* renamed from: a */
    public final void mo41973a(String str, boolean z) {
        aoni aoni = (aoni) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (aoni != null) {
            aoni.dismissAllowingStateLoss();
        }
        if (z) {
            aong a = aong.m66135a(getString(C0126R.string.plus_delete_moment_failed_dialog_message));
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(a, "error_dialog");
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("deleted_moment_id", str);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo42298a(List list) {
        if (list != null) {
            if (list.isEmpty()) {
                this.f82261e = getString(C0126R.string.plus_manage_app_only_you_label);
            } else {
                String string = getString(C0126R.string.plus_manage_moment_acl_separator);
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AudienceMember audienceMember = (AudienceMember) list.get(i);
                    if (sb.length() > 0) {
                        sb.append(string);
                    }
                    sb.append(audienceMember.f30296f);
                }
                this.f82261e = sb.toString();
            }
            m68326e();
            return;
        }
        m68327g();
    }
}
