package p000;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: vlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vlr extends vlg {

    /* renamed from: a */
    public static final sbw f49457a = new sbw("CreateFileDialogFragmen", "");

    /* renamed from: b */
    public DriveId f49458b;

    /* renamed from: c */
    public MetadataBundle f49459c;

    /* renamed from: d */
    public int f49460d;

    /* renamed from: e */
    public int f49461e;

    /* renamed from: f */
    public String f49462f;

    /* renamed from: g */
    public String f49463g;

    /* renamed from: h */
    public String f49464h;

    /* renamed from: i */
    public rkb f49465i;

    /* renamed from: j */
    public EditText f49466j;

    /* renamed from: k */
    public boolean f49467k;

    /* renamed from: l */
    private Button f49468l;

    /* renamed from: m */
    private TextView f49469m;

    /* renamed from: n */
    private vda f49470n;

    /* renamed from: o */
    private Bundle f49471o;

    /* renamed from: a */
    public final void mo9306a() {
        this.f49469m.setOnClickListener(new vlo(this));
        DriveId driveId = this.f49458b;
        if (driveId != null) {
            driveId.mo18113b().mo27953a(this.f49465i).mo9458a(new vlp(this));
        } else {
            mo28621a((twz) null);
        }
        this.f49468l.setEnabled(true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 0) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f49458b = (DriveId) intent.getParcelableExtra("response_drive_id");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49467k = false;
        this.f49462f = getArguments().getString("accountName");
        this.f49463g = getArguments().getString("callerSdkAppId");
        this.f49464h = getArguments().getString("callerPackageName");
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f49458b = (DriveId) bundle.getParcelable("selectedCollectionDriveId");
        this.f49459c = (MetadataBundle) bundle.getParcelable("metadata");
        this.f49460d = bundle.getInt("requestId");
        this.f49461e = bundle.getInt("fileType", 0);
        this.f49471o = bundle.getBundle("logSessionState");
        if (this.f49459c == null) {
            MetadataBundle a = MetadataBundle.m23056a();
            this.f49459c = a;
            a.mo18273b(uzm.f48741Q, getResources().getString(C0126R.string.drive_create_file_default_title));
            this.f49459c.mo18273b(uzm.f48738N, "application/octet-stream");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.drive_create_file_dialog, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.drive_create_file_dialog_edittext_document_title);
        this.f49466j = editText;
        editText.setText((CharSequence) this.f49459c.mo18269a(uzm.f48741Q));
        ((TextView) inflate.findViewById(C0126R.C0129id.drive_create_file_dialog_account_name)).setText(this.f49462f);
        this.f49469m = (TextView) inflate.findViewById(C0126R.C0129id.drive_create_file_dialog_folder_selector);
        this.f49468l = (Button) inflate.findViewById(C0126R.C0129id.drive_button_bar_button_right);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.drive_button_bar_button_left);
        vln vln = new vln(this);
        this.f49468l.setOnClickListener(vln);
        this.f49468l.setText((int) C0126R.string.common_save);
        this.f49468l.setEnabled(false);
        button.setOnClickListener(vln);
        button.setText(17039360);
        ((vlf) getActivity()).mo8626a((Toolbar) inflate.findViewById(C0126R.C0129id.drive_create_file_dialog_toolbar));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f49467k) {
            Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            super.onDismiss(dialogInterface);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f49459c.mo18273b(uzm.f48741Q, this.f49466j.getText().toString());
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f49471o = this.f49470n.mo28313e();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f49468l.setEnabled(false);
        rkb rkb = this.f49465i;
        if (rkb != null && rkb.mo24805i()) {
            mo9306a();
        }
        vdm vdm = new vdm(vpu.m41033a(getActivity()), getActivity());
        Bundle bundle = this.f49471o;
        if (bundle == null) {
            vda a = vdm.mo28332a(new CallingAppInfo(this.f49463g, this.f49464h, 0), this.f49462f);
            this.f49470n = a;
            a.mo28310a();
            vdk d = ((vdv) this.f49470n).mo28316d();
            d.mo28309j();
            d.mo28300c(3, 28);
            d.mo28274a();
            return;
        }
        this.f49470n = vdm.mo28331a(bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("selectedCollectionDriveId", this.f49458b);
        bundle.putParcelable("metadata", this.f49459c);
        bundle.putInt("requestId", this.f49460d);
        bundle.putInt("fileType", this.f49461e);
        bundle.putParcelable("logSessionState", this.f49471o);
    }

    /* renamed from: a */
    public final void mo28620a(int i) {
        vdk d = ((vdv) this.f49470n).mo28316d();
        d.mo28300c(3, 27);
        d.mo28304e(i);
        d.mo28309j();
        d.mo28274a();
        this.f49470n.mo28311b();
    }

    /* renamed from: a */
    public final void mo28621a(twz twz) {
        String str;
        int i;
        String str2;
        int i2;
        DriveId driveId = twn.f46759e.mo26842a(this.f49465i).f48623a;
        if (twz == null || driveId.equals(twz.mo26854a())) {
            this.f49458b = driveId;
            str2 = vnr.f49586a.mo18341a(getActivity());
            i = vnr.f49586a.f31217a;
            str = str2;
        } else {
            this.f49458b = twz.mo26854a();
            str2 = twz.mo26858d();
            i = vlm.m40828a(twz.mo26857c()).mo28615a(twz.mo26860g());
            if (!twz.mo26860g()) {
                i2 = C0126R.string.drive_folder;
            } else {
                i2 = C0126R.string.drive_document_type_shared_folder;
            }
            String string = getString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(string).length());
            sb.append(str2);
            sb.append(" ");
            sb.append(string);
            str = sb.toString();
        }
        this.f49469m.setText(str2);
        this.f49469m.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.f49469m.getCompoundDrawables()[0].setColorFilter(Color.parseColor((String) twy.f46811V.mo58455c()), PorterDuff.Mode.SRC_ATOP);
        this.f49469m.setContentDescription(str);
    }
}
