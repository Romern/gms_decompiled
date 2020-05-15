package com.google.android.gms.org.conscrypt.p058ct;

import com.google.android.gms.org.conscrypt.p058ct.VerifiedSCT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.org.conscrypt.ct.CTVerificationResult */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CTVerificationResult {
    private final ArrayList invalidSCTs = new ArrayList();
    private final ArrayList validSCTs = new ArrayList();

    public void add(VerifiedSCT verifiedSCT) {
        if (verifiedSCT.status == VerifiedSCT.Status.VALID) {
            this.validSCTs.add(verifiedSCT);
        } else {
            this.invalidSCTs.add(verifiedSCT);
        }
    }

    public List getInvalidSCTs() {
        return Collections.unmodifiableList(this.invalidSCTs);
    }

    public List getValidSCTs() {
        return Collections.unmodifiableList(this.validSCTs);
    }
}
