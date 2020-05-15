package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.drive.DriveId;

/* renamed from: vlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vlx extends vlg {

    /* renamed from: a */
    public static final sbw f49477a = new sbw("CreateFolderDialogFragm", "");

    /* renamed from: b */
    public EditText f49478b;

    /* renamed from: c */
    public vlw f49479c;

    /* renamed from: d */
    public boolean f49480d = false;

    /* renamed from: e */
    public DriveId f49481e;

    /* renamed from: a */
    public final void mo9306a() {
        Toast.makeText(getActivity(), (int) C0126R.string.drive_create_new_folder_error, 1).show();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f49479c = (vlw) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49481e = (DriveId) getArguments().getParcelable("parentDriveId");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        vlf vlf = (vlf) getActivity();
        Context a = vlk.m40825a(vlf);
        EditText editText = new EditText(a);
        this.f49478b = editText;
        editText.setText((int) C0126R.string.drive_default_new_folder_title);
        this.f49478b.setSelectAllOnFocus(true);
        this.f49478b.setSingleLine();
        this.f49478b.setInputType(16385);
        AlertDialog.Builder builder = new AlertDialog.Builder(vlk.m40825a(vlf));
        builder.setTitle((int) C0126R.string.drive_new_folder_title);
        EditText editText2 = this.f49478b;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0126R.dimen.drive_Space_2);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0126R.dimen.drive_Space_1);
        FrameLayout frameLayout = new FrameLayout(a);
        frameLayout.addView(editText2);
        frameLayout.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, 0);
        builder.setView(frameLayout);
        builder.setCancelable(true);
        builder.setPositiveButton(17039370, new vls(this));
        builder.setNegativeButton(17039360, new vlt(this));
        builder.setOnKeyListener(vlk.f49440a);
        AlertDialog create = builder.create();
        this.f49478b.setOnFocusChangeListener(new vlu(create));
        vlk.m40826a(this.f49478b, create);
        return create;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        vlw vlw;
        if (!this.f49480d && (vlw = this.f49479c) != null) {
            vlw.mo18325a(2, null);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        super.onResume();
        this.f49480d = false;
    }
}
