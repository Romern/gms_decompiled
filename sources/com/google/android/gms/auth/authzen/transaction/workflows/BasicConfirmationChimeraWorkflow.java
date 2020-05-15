package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BasicConfirmationChimeraWorkflow extends ijm {

    /* renamed from: s */
    public static final /* synthetic */ int f10504s = 0;

    /* renamed from: b */
    public static Intent m6538b(bypc bypc, String str, byte[] bArr) {
        Intent a = ijm.m15534a(bypc, str, bArr);
        a.setClassName(rpr.m34216b(), "com.google.android.gms.auth.authzen.transaction.workflows.BasicConfirmationWorkflow");
        return a;
    }

    /* renamed from: a */
    public final boolean mo7588a(ikz ikz, int i) {
        if (!super.mo7588a(ikz, i)) {
            String a = ikz.mo13099a();
            if (!ikv.f21250a.equals(a)) {
                if (ikp.f21219a.equals(a)) {
                    setResult(-1);
                    finish();
                    return true;
                }
                String valueOf = String.valueOf(a);
                throw new RuntimeException(valueOf.length() == 0 ? new String("Fragment not supported in basic confirm workflow: ") : "Fragment not supported in basic confirm workflow: ".concat(valueOf));
            } else if (i == 0) {
                mo13074a(byoo.APPROVE_SELECTED, 2);
                mo13066a(((ijm) this).f21116a.getString(ild.f21285h));
                return true;
            } else {
                mo13064a(ikz);
            }
        }
        return true;
    }
}
