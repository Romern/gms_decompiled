package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: areg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class areg implements ardz {

    /* renamed from: a */
    final /* synthetic */ arem f87505a;

    /* renamed from: b */
    private String f87506b;

    /* renamed from: c */
    private String f87507c;

    public areg(arem arem) {
        this.f87505a = arem;
    }

    /* renamed from: a */
    private final Bundle m72592a(ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("accounts", arrayList);
        araa araa = this.f87505a.f87523j;
        if (araa != null) {
            bundle.putBoolean("deviceOwnerSet", araa.mo48320a(2));
        }
        bundle.putString("restoreAccount", this.f87506b);
        bundle.putString("restoreToken", this.f87507c);
        return bundle;
    }

    /* renamed from: b */
    public final void mo48460b(List list) {
        this.f87505a.mo48473a(new BootstrapProgressResult(1, m72592a(new ArrayList(list))));
    }

    /* renamed from: a */
    public final void mo48453a() {
        arem arem = this.f87505a;
        if (arem.f87526m) {
            arem.f87524k = ((sny) arem.f87520g).schedule(new aree(this), cgps.m146494f(), TimeUnit.MILLISECONDS);
            return;
        }
        arem.mo48475g();
    }

    /* renamed from: a */
    public final void mo48454a(int i, String str) {
        this.f87505a.mo48238d(i);
        this.f87505a.f87062c.mo48223a(i);
    }

    /* renamed from: a */
    public final void mo48455a(PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", pendingIntent);
        this.f87505a.mo48473a(new BootstrapProgressResult(1, bundle));
    }

    /* renamed from: a */
    public final void mo48456a(BootstrapAccount bootstrapAccount) {
        this.f87505a.mo48473a(new BootstrapProgressResult(7, Bundle.EMPTY));
    }

    /* renamed from: a */
    public final void mo48457a(MessagePayload messagePayload) {
        this.f87505a.mo48233b(messagePayload);
    }

    /* renamed from: a */
    public final void mo48458a(String str, String str2) {
        this.f87506b = str;
        this.f87505a.f87525l.f87100b = str2;
        if (!TextUtils.isEmpty(str)) {
            this.f87505a.f87525l.f87101c = new BootstrapAccount(this.f87506b, "com.google");
        }
        this.f87507c = str2;
    }

    /* renamed from: a */
    public final void mo48459a(List list) {
        this.f87505a.mo48473a(new BootstrapProgressResult(4, m72592a(new ArrayList(list))));
    }
}
