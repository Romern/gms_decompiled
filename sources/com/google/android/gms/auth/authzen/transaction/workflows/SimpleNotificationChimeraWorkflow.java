package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SimpleNotificationChimeraWorkflow extends ijm {

    /* renamed from: s */
    public static final /* synthetic */ int f10507s = 0;

    /* renamed from: b */
    public static Intent m6544b(bypc bypc, String str, byte[] bArr) {
        Intent a = ijm.m15534a(bypc, str, bArr);
        a.setClassName(rpr.m34216b(), "com.google.android.gms.auth.authzen.transaction.workflows.SimpleNotificationWorkflow");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ikz mo7589a() {
        Bundle bundle = ((ijm) this).f21116a;
        ikx ikx = new ikx();
        ikx.setArguments(bundle);
        return ikx;
    }

    /* renamed from: a */
    public final boolean mo7588a(ikz ikz, int i) {
        if (super.mo7588a(ikz, i)) {
            return true;
        }
        if (ikx.f21267a.equals(ikz.mo13099a())) {
            mo13074a(byoo.APPROVE_SELECTED, 2);
            setResult(-1);
            finish();
            return true;
        }
        throw new UnsupportedOperationException("Fragment not supported in simple notification flow.");
    }
}
