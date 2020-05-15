package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearFieldCommunication$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ ailq f80654a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearFieldCommunication$1(ailq ailq, String str) {
        super(str);
        this.f80654a = ailq;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Tag tag;
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) && (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG")) != null) {
            this.f80654a.mo37649a(new ailo(this, tag));
        }
    }
}
