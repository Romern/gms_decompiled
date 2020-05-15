package com.google.android.gms.backup.p032g1.restore.mms;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import java.io.File;

/* renamed from: com.google.android.gms.backup.g1.restore.mms.BugleRestoreCompleteIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BugleRestoreCompleteIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final lvn f29050a = new lvn("BugleRestoreCompleteIntentOperation");

    /* renamed from: b */
    private static final Uri f29051b = new Uri.Builder().scheme("content").authority("com.google.android.gms.fileprovider").appendPath("mms").build();

    /* renamed from: a */
    private final void m21908a() {
        try {
            srj.m36120a(new File(getFilesDir(), "mms"));
            mcb mcb = new mcb(this);
            srj.m36120a(mcb.f33397b);
            srj.m36120a(mcb.f33396a);
            mce.m24860b(this);
        } catch (Exception e) {
            f29050a.mo25415d("Error cleaning up file.", e, new Object[0]);
        }
    }

    public final void onHandleIntent(Intent intent) {
        lvt lvt = lvt.f33072a;
        if (lvt.mo19674c(this)) {
            f29050a.mo25409a("MMS restore is complete", new Object[0]);
        } else if (!lvt.mo19672b(this)) {
            f29050a.mo25409a("MMS restore was not started", new Object[0]);
        } else if (intent == null) {
            f29050a.mo25409a("No intent provided, ignoring", new Object[0]);
        } else {
            String action = intent.getAction();
            if (action == null) {
                f29050a.mo25409a("No action provided, ignoring", new Object[0]);
            } else if (action.equals("com.google.android.gms.backup.g1.BUGLE_RESTORE_ABORT")) {
                f29050a.mo25409a("MMS restore was aborted", new Object[0]);
                if (ccls.m130543v()) {
                    lvt.mo19673c(this, false);
                } else {
                    lvt.mo19673c(this, true);
                }
                m21908a();
                revokeUriPermission(f29051b, 1);
            } else if (action.equals("com.google.android.gms.backup.g1.BUGLE_RESTORE_COMPLETE")) {
                int intExtra = intent.getIntExtra("com.google.android.gms.backup.g1.BUGLE_RESTORE_RESULT_CODE", 1);
                if (intExtra == 0) {
                    lvt.mo19673c(this, true);
                    m21908a();
                    f29050a.mo25409a("MMS restore completed successfully", new Object[0]);
                } else if (intExtra == 1) {
                    f29050a.mo25409a("MMS restore failed", new Object[0]);
                } else if (intExtra != 2) {
                    f29050a.mo25409a("MMS restore completed; result code is unrecognized", new Object[0]);
                } else {
                    f29050a.mo25409a("MMS restore failed; was not default sms provider", new Object[0]);
                }
                revokeUriPermission(f29051b, 1);
            } else {
                f29050a.mo25409a("Unrecognized action provided, ignoring", new Object[0]);
            }
        }
    }
}
