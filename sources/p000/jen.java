package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: jen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jen {

    /* renamed from: a */
    public final Bundle f22297a;

    public jen() {
        this(new Bundle());
    }

    /* renamed from: a */
    public static jen m16608a(Intent intent) {
        return new jen(intent.getExtras());
    }

    /* renamed from: b */
    public final String mo13663b() {
        return this.f22297a.getString("authorization_code");
    }

    public jen(Bundle bundle) {
        sdo.m34959a(bundle);
        this.f22297a = bundle;
    }

    /* renamed from: a */
    public final String mo13662a() {
        return this.f22297a.getString("account_name");
    }
}
