package com.google.android.gms.auth.authzen.transaction.workflows;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PinConfirmationChimeraWorkflow extends ijm {

    /* renamed from: s */
    public static final /* synthetic */ int f10506s = 0;

    /* renamed from: b */
    public static Intent m6542b(bypc bypc, String str, byte[] bArr) {
        Intent a = ijm.m15534a(bypc, str, bArr);
        a.setClassName(rpr.m34216b(), "com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationWorkflow");
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ijt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.auth.authzen.transaction.workflows.PinConfirmationChimeraWorkflow.a(ikz, int):boolean
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
                bypb bypb = this.f21134e.f167310d;
                if (bypb == null) {
                    bypb = bypb.f167289p;
                }
                byoa byoa = bypb.f167301l;
                if (byoa == null) {
                    byoa = byoa.f167173e;
                }
                if (((byor) byoa.f167176b.get(0)).f167240e && this.f21146q == 46) {
                    mo13071a(604, false);
                    mo13074a(byoo.APPROVE_SELECTED, 2);
                    mo13066a(((ijm) this).f21116a.getString(ild.f21285h));
                    return true;
                }
                bypb bypb2 = this.f21134e.f167310d;
                if (bypb2 == null) {
                    bypb2 = bypb.f167289p;
                }
                byoa byoa2 = bypb2.f167301l;
                if (byoa2 == null) {
                    byoa2 = byoa.f167173e;
                }
                bxvt bxvt = ((byor) byoa2.f167176b.get(0)).f167239d;
                Bundle bundle = ((ijm) this).f21116a;
                int intValue = ((Integer) bxvt.get(0)).intValue();
                sek sek = ikq.f21231g;
                String valueOf = String.valueOf(bxvt);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("Pins received: ");
                sb.append(valueOf);
                sek.mo25414c(sb.toString(), new Object[0]);
                ikq ikq = new ikq();
                bundle.putString(ikq.f21228d, Integer.toString(intValue));
                String str = ikq.f21229e;
                ArrayList arrayList = new ArrayList();
                int size = bxvt.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Integer.toString(((Integer) bxvt.get(i2)).intValue()));
                }
                Collections.shuffle(arrayList);
                bundle.putStringArrayList(str, arrayList);
                ikq.setArguments(bundle);
                mo13065a(ikz, ikq);
            } else {
                mo13064a(ikz);
            }
            return true;
        } else if (ikq.f21225a.equals(a)) {
            if (i == 0) {
                mo13074a(byoo.APPROVE_SELECTED, 2);
                mo13066a(((ijm) this).f21116a.getString(ild.f21285h));
            } else if (i == 1) {
                mo13074a(byoo.APPROVE_MISMATCHED, 202);
                Bundle bundle2 = (Bundle) ((ijm) this).f21116a.clone();
                bundle2.putString(ikp.f21220b, ((ijm) this).f21116a.getString(ild.f21281d));
                bundle2.putString(ikp.f21221c, ((ijm) this).f21116a.getString(ild.f21282e));
                bundle2.putString(ikp.f21223e, ((ijm) this).f21116a.getString(ild.f21283f));
                bundle2.putString(ikp.f21222d, ((ijm) this).f21116a.getString(ild.f21284g));
                mo13065a(ikz, ikp.m15623a(bundle2));
            } else {
                mo13074a(byoo.APPROVE_ABORTED, 3);
                mo13069b(((ijm) this).f21116a.getString(ild.f21286i));
                setResult(-1);
                finish();
            }
            return true;
        } else if (ikp.f21219a.equals(a)) {
            setResult(-1);
            finish();
            return true;
        } else {
            String valueOf2 = String.valueOf(a);
            throw new RuntimeException(valueOf2.length() == 0 ? new String("Fragment not supported in account recovery workflow: ") : "Fragment not supported in account recovery workflow: ".concat(valueOf2));
        }
    }
}
