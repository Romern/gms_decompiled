package com.google.android.gms.drive.p039ui;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: com.google.android.gms.drive.ui.DriveUiTestCreateFileDialogChimeraFragmentActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DriveUiTestCreateFileDialogChimeraFragmentActivity extends FragmentActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vlr vlr = new vlr();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        MetadataBundle a = MetadataBundle.m23056a();
        a.mo18273b(uzm.f48741Q, "ui tester file title");
        a.mo18273b(uzm.f48738N, "application/octet-stream");
        extras.putParcelable("metadata", a);
        extras.putString("accountName", "driveUiTester");
        extras.putString("dialogTitle", "ui tester dialog title");
        vlr.setArguments(extras);
        vlr.show(getSupportFragmentManager(), "DriveUiTestCreateFileDi");
    }
}
