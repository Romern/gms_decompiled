package com.google.android.gms.constellation.verifier;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsSender$SmsPendingIntentReceiver extends aacn {

    /* renamed from: a */
    tdx f30608a;

    /* renamed from: b */
    cbqy f30609b;

    /* renamed from: c */
    boolean f30610c;

    /* renamed from: d */
    String f30611d;

    /* renamed from: e */
    final /* synthetic */ tet f30612e;

    /* renamed from: f */
    tek f30613f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmsSender$SmsPendingIntentReceiver(tet tet, tdx tdx, cbqy cbqy, boolean z, tek tek, String str) {
        super("constellation");
        this.f30612e = tet;
        this.f30608a = tdx;
        this.f30609b = cbqy;
        this.f30610c = z;
        this.f30613f = tek;
        this.f30611d = str;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        tet tet = this.f30612e;
        sek sek = tet.f45800a;
        tet.f45801b.unregisterReceiver(this);
        int resultCode = getResultCode();
        int intExtra = intent.getIntExtra("errorCode", -1);
        if (resultCode == -1) {
            this.f30613f.mo26441a(3, resultCode, intExtra);
            if (!this.f30610c) {
                i = 12;
            } else {
                i = 13;
            }
            tds.m36774a(this.f30612e.f45801b).mo26411a(this.f30608a, this.f30609b, i);
            tet.f45800a.mo25414c("Sms sent successfully to %s", this.f30611d);
        } else if (resultCode == 1) {
            this.f30613f.mo26441a(4, resultCode, intExtra);
            if (!this.f30610c) {
                i2 = 24;
            } else {
                i2 = 25;
            }
            tds.m36774a(this.f30612e.f45801b).mo26412a(this.f30608a, this.f30609b, i2, 43, String.valueOf(intExtra));
            tet.f45800a.mo25414c("Sms sending to %s failed", this.f30611d);
        } else if (resultCode == 2) {
            this.f30613f.mo26441a(4, resultCode, intExtra);
            if (!this.f30610c) {
                i3 = 24;
            } else {
                i3 = 25;
            }
            tds.m36774a(this.f30612e.f45801b).mo26412a(this.f30608a, this.f30609b, i3, 44, String.valueOf(intExtra));
            tet.f45800a.mo25414c("Sms sending failed", new Object[0]);
        } else if (resultCode == 3) {
            this.f30613f.mo26441a(4, resultCode, intExtra);
            if (!this.f30610c) {
                i4 = 24;
            } else {
                i4 = 25;
            }
            tds.m36774a(this.f30612e.f45801b).mo26412a(this.f30608a, this.f30609b, i4, 45, String.valueOf(intExtra));
            tet.f45800a.mo25414c("Sms sending failed", new Object[0]);
        } else if (resultCode != 4) {
            this.f30613f.mo26441a(4, resultCode, intExtra);
            if (!this.f30610c) {
                i6 = 24;
            } else {
                i6 = 25;
            }
            tds a = tds.m36774a(this.f30612e.f45801b);
            tdx tdx = this.f30608a;
            cbqy cbqy = this.f30609b;
            StringBuilder sb = new StringBuilder(23);
            sb.append(resultCode);
            sb.append(":");
            sb.append(intExtra);
            a.mo26412a(tdx, cbqy, i6, 50, sb.toString());
            tet.f45800a.mo25414c("Sms sending failed", new Object[0]);
        } else {
            this.f30613f.mo26441a(4, resultCode, intExtra);
            if (!this.f30610c) {
                i5 = 24;
            } else {
                i5 = 25;
            }
            tds.m36774a(this.f30612e.f45801b).mo26412a(this.f30608a, this.f30609b, i5, 46, String.valueOf(intExtra));
            tet.f45800a.mo25414c("Sms sending failed", new Object[0]);
        }
    }
}
