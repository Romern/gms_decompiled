package com.google.android.gms.smartdevice.d2d.p065ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceDirectTransferChimeraActivity extends deu implements arzd, arok, arwr, arqe, aryt {

    /* renamed from: d */
    public static final asco f108018d = ascp.m73787a("SourceDirectTransferActivity");

    /* renamed from: b */
    arqp f108019b;

    /* renamed from: c */
    arba f108020c;

    /* renamed from: e */
    private aron f108021e;

    /* renamed from: f */
    private ResultReceiver f108022f;

    /* renamed from: g */
    private int f108023g;

    /* renamed from: h */
    private boolean f108024h;

    /* renamed from: i */
    private ProxyResultReceiver f108025i;

    /* renamed from: j */
    private long f108026j;

    /* renamed from: k */
    private boolean f108027k;

    /* renamed from: a */
    public static PendingIntent m92738a(Context context, ResultReceiver resultReceiver, BootstrapConfigurations bootstrapConfigurations, BootstrapOptions bootstrapOptions, boolean z, boolean z2) {
        ResultReceiver resultReceiver2;
        int i;
        Map b = bootstrapConfigurations.mo59039b();
        Context applicationContext = context.getApplicationContext();
        boolean z3 = bootstrapConfigurations.f107818j;
        long j = bootstrapOptions.f107839l;
        PostTransferAction postTransferAction = bootstrapOptions.f107848u;
        Intent intent = new Intent();
        intent.setClassName(context.getApplicationContext(), "com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferActivity");
        intent.addFlags(268468224);
        if (cgpm.f187459a.mo6606a().mo84238c()) {
            Parcel obtain = Parcel.obtain();
            resultReceiver.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            obtain.recycle();
            resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        } else {
            resultReceiver2 = resultReceiver;
        }
        intent.putExtra("resultReceiver", resultReceiver2);
        boui a = arsq.m73409a(context, postTransferAction);
        boui boui = boui.NONE;
        String str = (String) b.get("directTransferConfirmationBodyText");
        String str2 = (String) b.get("directTransfer3pConfirmationBodyText");
        String str3 = (String) b.get("directTransferConfirmationTitleText");
        String str4 = (String) b.get("directTransferConfirmationWatchIcon");
        String str5 = (String) b.get(BootstrapConfigurations.f107809b);
        String str6 = (String) b.get(BootstrapConfigurations.f107808a);
        if (!z) {
            if (a == boui) {
                i = C0126R.string.smartdevice_d2d_copy_account_text;
            } else {
                i = C0126R.string.copy_confirmation_description;
            }
            m92739a(context, intent, "styledConfirmationText", str, i);
        } else {
            m92739a(context, intent, "styledConfirmationText", str2, a == boui ? C0126R.string.smartdevice_d2d_copy_3p_account_text : C0126R.string.copy_confirmation_description_3p);
        }
        m92739a(context, intent, "confirmationTitle", str3, C0126R.string.smartdevice_d2d_copy_account_title);
        if (!cgpm.m146472b() || TextUtils.isEmpty(str5)) {
            intent.putExtra("confirmButton", context.getString(C0126R.string.smartdevice_action_copy));
        } else {
            intent.putExtra("confirmButton", str5);
        }
        if (cgpm.m146472b() && !TextUtils.isEmpty(str6)) {
            intent.putExtra("transitionTitle", str6);
        }
        if (!TextUtils.isEmpty(str4)) {
            intent.putExtra("deviceIconType", str4);
        } else {
            intent.putExtra("deviceIconType", "deviceIconPhone");
        }
        return PendingIntent.getActivity(applicationContext, 8, intent.putExtra("sessionId", j).putExtra("hasUserConfirmed", z3).putExtra("targetAcceptsManagedAccounts", z2), 134217728);
    }

    /* renamed from: k */
    private final void m92740k() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("resultReceiver", this.f108025i);
        this.f108022f.send(1001, bundle);
    }

    /* renamed from: l */
    private final void m92741l() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("lockScreenConfirmed", this.f108024h);
        this.f108022f.send(1004, bundle);
    }

    /* renamed from: m */
    private final void m92742m() {
        this.f108022f.send(1002, Bundle.EMPTY);
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i != 2001) {
            if (i == 2002) {
                onBackPressed();
                return;
            }
            StringBuilder sb = new StringBuilder(27);
            sb.append("Unknown action: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        } else if (!cgpa.f187426a.mo6606a().mo84218l()) {
            mo59125e();
        } else if (this.f108027k) {
            f108018d.mo25416d("Account transfer is in progress, skip the second click", new Object[0]);
        } else {
            this.f108027k = true;
            mo59125e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo59125e() {
        int i = this.f108023g;
        if (i == 2) {
            this.f108023g = 4;
            m92741l();
            this.f108021e.mo48709a(this.f108023g, 1);
        } else if (i == 3) {
            this.f108023g = i + 1;
            m92741l();
            this.f108021e.mo48709a(this.f108023g, 1);
        } else if (i == 4) {
            throw new IllegalStateException("Unexpected next() when state is STATE_IN_PROGRESS");
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        } else {
            throw new IllegalStateException("Unexpected next() when state is STATE_ACCOUNT_CHALLENGE");
        }
    }

    /* renamed from: g */
    public final void mo48960g() {
        if (!cgpa.f187426a.mo6606a().mo84212f()) {
            this.f108024h = true;
            mo59125e();
        } else if (!this.f108024h) {
            this.f108024h = true;
            f108018d.mo25412b("Screen unlocked", new Object[0]);
            mo59125e();
        } else {
            f108018d.mo25416d("Unexpected screen unlock", new Object[0]);
        }
    }

    /* renamed from: h */
    public final void mo48961h() {
        this.f108024h = false;
        mo59125e();
    }

    /* renamed from: i */
    public final void mo48962i() {
        this.f108021e.mo48709a(this.f108023g, 4);
    }

    /* renamed from: j */
    public final void mo48963j() {
    }

    public final void onBackPressed() {
        this.f108022f.send(1005, null);
        asbv.m73762a(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        arqh.m73305a((Activity) this);
        setContentView((int) C0126R.C0128layout.smartdevice_fragment_container);
        Intent intent = getIntent();
        this.f108022f = (ResultReceiver) intent.getParcelableExtra("resultReceiver");
        String stringExtra = intent.getStringExtra("styledConfirmationText");
        String stringExtra2 = intent.getStringExtra("confirmationTitle");
        String stringExtra3 = intent.getStringExtra("deviceIconType");
        String stringExtra4 = intent.getStringExtra("confirmButton");
        String stringExtra5 = intent.getStringExtra("transitionTitle");
        boolean booleanExtra = intent.getBooleanExtra("hasUserConfirmed", false);
        boolean booleanExtra2 = intent.getBooleanExtra("targetAcceptsManagedAccounts", false);
        this.f108026j = intent.getLongExtra("sessionId", -1);
        this.f108021e = new aron(this, new aroy(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5));
        if (arze.m73708a(this)) {
            i = booleanExtra ? 4 : 3;
        } else {
            i = 2;
        }
        if (bundle != null) {
            this.f108023g = bundle.getInt("state", i);
            this.f108024h = bundle.getBoolean("didUnlock");
        } else {
            this.f108023g = i;
            this.f108021e.mo48709a(i, 1);
        }
        if (arqd.m73298c(this).mo48618a() && !booleanExtra2) {
            this.f108021e.mo48709a(7, 4);
        }
        this.f108019b = new arrq(this);
        this.f108020c = aqxc.m72189b(this);
        if (cgpm.f187459a.mo6606a().mo84237b()) {
            aucb a = this.f108020c.mo24701a((rpa) new arku(this.f108026j));
            arqp arqp = this.f108019b;
            long j = this.f108026j;
            roz b = rpa.m34196b();
            b.f43472a = new arrn(j);
            b.f43473b = new Feature[]{aqwz.f87017e};
            aucu.m76786b(a, ((rjx) arqp).mo24701a(b.mo24977a())).mo50371a(new arox(this));
        }
        this.f108027k = false;
        if (cgpa.m146405f()) {
            this.f108025i = new ProxyResultReceiver(null, this);
            m92740k();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f108021e = null;
        if (cgpa.m146405f()) {
            m92742m();
            this.f108025i = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!cgpa.m146405f()) {
            m92742m();
            this.f108025i = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!cgpa.m146405f()) {
            this.f108025i = new ProxyResultReceiver(null, this);
            m92740k();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.f108023g);
        bundle.putBoolean("didUnlock", this.f108024h);
    }

    /* renamed from: a */
    private static void m92739a(Context context, Intent intent, String str, String str2, int i) {
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(str, str2);
        } else {
            intent.putExtra(str, context.getString(i));
        }
    }

    /* renamed from: a */
    public final void mo48948a(int i, int i2) {
        if (i == 1) {
            this.f108022f.send(1006, null);
            asbv.m73762a(this);
        }
    }

    /* renamed from: a */
    public final void mo48435a(int i, Bundle bundle) {
        switch (i) {
            case 1010:
                this.f108021e.mo48710a(5, 1, bundle);
                return;
            case 1011:
            case 1012:
            case 1013:
                asbv.m73762a(this);
                return;
            default:
                StringBuilder sb = new StringBuilder(46);
                sb.append("Unknown ResultReceiver resultCode: ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo48885a(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accountChallengeData", arrayList);
        this.f108022f.send(1003, bundle);
    }
}
