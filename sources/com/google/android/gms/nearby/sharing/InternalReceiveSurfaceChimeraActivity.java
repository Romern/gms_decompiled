package com.google.android.gms.nearby.sharing;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalReceiveSurfaceChimeraActivity extends ReceiveSurfaceChimeraActivity {
    public final void onCreate(Bundle bundle) {
        ShareTarget shareTarget;
        TransferMetadata transferMetadata;
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("share_target_bytes");
        if (byteArrayExtra != null) {
            try {
                shareTarget = (ShareTarget) akik.m59825a(byteArrayExtra, ShareTarget.CREATOR);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Received unexpected intent with invalid share target");
                shareTarget = null;
            }
        } else {
            shareTarget = null;
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("transfer_metadata_bytes");
        if (byteArrayExtra2 != null) {
            try {
                transferMetadata = (TransferMetadata) akik.m59825a(byteArrayExtra2, TransferMetadata.CREATOR);
            } catch (IllegalArgumentException e2) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Received unexpected intent with invalid TransferMetadata");
                transferMetadata = null;
            }
        } else {
            transferMetadata = null;
        }
        if (shareTarget != null && transferMetadata != null) {
            mo44466k();
            if (!this.f80943o) {
                this.f80938j.setText((CharSequence) null);
                super.mo44462b(shareTarget, transferMetadata);
            }
        }
    }
}
