package com.google.android.gms.nearby.sharing;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalShareSheetChimeraActivity extends ShareSheetChimeraActivity {
    public final void onCreate(Bundle bundle) {
        ShareTarget shareTarget;
        ShareTarget shareTarget2;
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("direct_share_target_bytes");
        TransferMetadata transferMetadata = null;
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
        if (shareTarget != null) {
            this.f81016p = shareTarget;
            this.f81015o = shareTarget;
            ((ShareSheetChimeraActivity) this).f81009i.mo38707a(shareTarget);
            super.mo44487e(shareTarget);
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("share_target_bytes");
        if (byteArrayExtra2 != null) {
            try {
                shareTarget2 = (ShareTarget) akik.m59825a(byteArrayExtra2, ShareTarget.CREATOR);
            } catch (IllegalArgumentException e2) {
                bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("Received unexpected intent with invalid share target");
                shareTarget2 = null;
            }
        } else {
            shareTarget2 = null;
        }
        byte[] byteArrayExtra3 = getIntent().getByteArrayExtra("transfer_metadata_bytes");
        if (byteArrayExtra3 != null) {
            try {
                transferMetadata = (TransferMetadata) akik.m59825a(byteArrayExtra3, TransferMetadata.CREATOR);
            } catch (IllegalArgumentException e3) {
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
                bnsl3.mo68437a(e3);
                bnsl3.mo68405a("Received unexpected intent with invalid TransferMetadata");
            }
        }
        if (shareTarget2 != null && transferMetadata != null) {
            mo44484b(shareTarget2, transferMetadata);
        }
    }
}
