package p000;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: haz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class haz {

    /* renamed from: a */
    private final Status f19391a;

    /* renamed from: b */
    private final bmxv f19392b;

    private haz(Status status, bmxv bmxv) {
        sdo.m34959a(status);
        this.f19391a = status;
        this.f19392b = bmxv;
    }

    /* renamed from: a */
    public static haz m14155a() {
        return new haz(Status.f30111e, bmvz.f131120a);
    }

    /* renamed from: b */
    public static haz m14158b(String str) {
        return new haz(new Status(13, str), bmvz.f131120a);
    }

    /* renamed from: c */
    public final Intent mo12371c() {
        Intent intent = new Intent();
        sef.m35071a(this.f19391a, intent, "status");
        if (this.f19392b.mo66813a()) {
            sef.m35071a((SafeParcelable) this.f19392b.mo66814b(), intent, "sign_in_credential");
        }
        return intent;
    }

    /* renamed from: a */
    public static haz m14156a(SignInCredential signInCredential) {
        return new haz(Status.f30107a, bmxv.m108566b(signInCredential));
    }

    /* renamed from: b */
    public final int mo12370b() {
        return this.f19392b.mo66813a() ? -1 : 0;
    }

    /* renamed from: a */
    public static haz m14157a(String str) {
        return new haz(new Status(10, str), bmvz.f131120a);
    }
}
