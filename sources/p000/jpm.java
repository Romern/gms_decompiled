package p000;

import android.app.PendingIntent;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: jpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpm implements Callable {

    /* renamed from: a */
    final /* synthetic */ jpo f22981a;

    /* renamed from: b */
    private final PendingIntent f22982b;

    /* renamed from: c */
    private final Role f22983c;

    /* renamed from: d */
    private final String f22984d;

    /* renamed from: e */
    private final boolean f22985e;

    /* renamed from: f */
    private final List f22986f;

    public jpm(jpo jpo, List list, Role role, PendingIntent pendingIntent, String str, boolean z) {
        this.f22981a = jpo;
        this.f22986f = list;
        this.f22983c = role;
        this.f22982b = pendingIntent;
        this.f22984d = str;
        this.f22985e = z;
    }

    /* renamed from: a */
    public final Status call() {
        jqf jqf = new jqf();
        jqf.f23046a = this.f22982b;
        jqf.f23048c = this.f22983c;
        jqf.mo13990a(this.f22986f);
        jqf.f23047b = this.f22984d;
        SecureChannelSubscription a = jqf.mo13989a();
        List list = this.f22986f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RemoteDevice remoteDevice = (RemoteDevice) list.get(i);
            if (this.f22985e) {
                if (this.f22981a.f22991b.mo13908b(remoteDevice.f11138b, this.f22983c.mo7789a())) {
                    try {
                        jpo.m17070a(rpr.m34216b(), a, remoteDevice.f11138b, this.f22983c.mo7789a());
                    } catch (PendingIntent.CanceledException e) {
                        return Status.f30111e;
                    }
                }
                this.f22981a.f22991b.mo13904a(remoteDevice, this.f22983c);
            } else {
                this.f22981a.f22991b.mo13905a(remoteDevice.f11138b, this.f22983c);
            }
        }
        jkf.m16838a(rpr.m34216b(), this.f22981a.f22991b);
        try {
            if (this.f22985e) {
                return this.f22981a.mo13978a(a);
            }
            boolean z = true;
            for (SecureChannelSubscription secureChannelSubscription : (List) this.f22981a.f22992c.mo14004b().get()) {
                if (this.f22983c.f11146b.equals(secureChannelSubscription.f11179b) && this.f22984d.equals(secureChannelSubscription.f11182e) && this.f22982b.equals(secureChannelSubscription.f11178a) && (this.f22983c.f11147c & secureChannelSubscription.f11180c) != 0) {
                    if (!Status.f30107a.equals(this.f22981a.mo13980a(this.f22986f, secureChannelSubscription))) {
                        z = false;
                    }
                }
            }
            return z ? Status.f30107a : Status.f30109c;
        } catch (InterruptedException | ExecutionException e2) {
            jpo.f22990a.mo25417e("SubsriptionCache error: ", e2, new Object[0]);
            return Status.f30108b;
        }
    }
}
