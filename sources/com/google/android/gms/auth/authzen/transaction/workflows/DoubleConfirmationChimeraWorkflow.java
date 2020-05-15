package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DoubleConfirmationChimeraWorkflow extends ijm {

    /* renamed from: s */
    public static final /* synthetic */ int f10505s = 0;

    /* renamed from: b */
    public static Intent m6540b(bypc bypc, String str, byte[] bArr) {
        Intent a = ijm.m15534a(bypc, str, bArr);
        a.setClassName(rpr.m34216b(), "com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationWorkflow");
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ijt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.auth.authzen.transaction.workflows.DoubleConfirmationChimeraWorkflow.a(ikz, int):boolean
      ijm.a(ikz, ikz):void
      ijm.a(java.lang.String, ikz):void
      ijm.a(ikz, int):boolean
      ijt.a(byoo, int):void
      iko.a(ikz, int):boolean
      ijt.a(int, boolean):void */
    /* renamed from: a */
    public final boolean mo7588a(ikz ikz, int i) {
        if (super.mo7588a(ikz, i)) {
            return true;
        }
        String a = ikz.mo13099a();
        if (ikv.f21250a.equals(a)) {
            if (i == 0) {
                mo13071a(2, false);
                Bundle bundle = ((ijm) this).f21116a;
                ikr ikr = new ikr();
                ikr.setArguments(bundle);
                mo13065a(ikz, ikr);
            } else {
                mo13074a(byoo.APPROVE_ABORTED, 3);
                mo13064a(ikz);
            }
            return true;
        } else if (ikr.f21234a.equals(a)) {
            if (i != 0) {
                mo13074a(byoo.APPROVE_ABORTED, 3);
                mo13069b(((ijm) this).f21116a.getString(ild.f21286i));
                setResult(-1);
                finish();
            } else {
                mo13074a(byoo.APPROVE_SELECTED, 2);
                mo13066a(((ijm) this).f21116a.getString(ild.f21285h));
            }
            return true;
        } else if (ikp.f21219a.equals(a)) {
            setResult(-1);
            finish();
            return true;
        } else {
            String valueOf = String.valueOf(a);
            throw new RuntimeException(valueOf.length() == 0 ? new String("Fragment not supported in double confirm workflow: ") : "Fragment not supported in double confirm workflow: ".concat(valueOf));
        }
    }
}
