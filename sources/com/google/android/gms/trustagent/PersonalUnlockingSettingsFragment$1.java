package com.google.android.gms.trustagent;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersonalUnlockingSettingsFragment$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aukv f109124a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalUnlockingSettingsFragment$1(aukv aukv, String str) {
        super(str);
        this.f109124a = aukv;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.android.facelock.FACE_UNLOCK_SETUP_COMPLETE".equals(intent.getAction())) {
            aukv aukv = this.f109124a;
            aunx aunx = aukv.f91993c;
            try {
                aumk aumk = (aumk) aukv.f91996f.mo50673a(aumk.class);
                aumk.mo50672a(aumk.f92084c, true);
                aukv.f91996f.mo50676a(aumk);
                aunw a = aukv.f91993c.mo50711a("Face trustlet is enabled by user", new Object[0]);
                a.mo50708c();
                a.mo50707b();
            } catch (aumn e) {
                aukv.f91993c.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
            }
        }
    }
}
