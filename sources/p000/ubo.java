package p000;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.drive.auth.AppIdentity;
import java.io.IOException;

/* renamed from: ubo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ubo implements IBinder.DeathRecipient {

    /* renamed from: a */
    final int f47177a;

    /* renamed from: b */
    final ParcelFileDescriptor f47178b;

    /* renamed from: c */
    final String f47179c;

    /* renamed from: d */
    final ufm f47180d;

    /* renamed from: e */
    final ukk f47181e;

    /* renamed from: f */
    final AppIdentity f47182f;

    /* renamed from: g */
    final IBinder f47183g;

    /* renamed from: h */
    final /* synthetic */ ubp f47184h;

    public ubo(ubp ubp, ParcelFileDescriptor parcelFileDescriptor, ufm ufm, ukk ukk, AppIdentity appIdentity, IBinder iBinder, String str) {
        this.f47184h = ubp;
        this.f47180d = ufm;
        this.f47181e = ukk;
        sdo.m34959a(parcelFileDescriptor);
        this.f47178b = parcelFileDescriptor;
        this.f47177a = ubp.f47186b.getAndIncrement();
        sdo.m34959a(appIdentity);
        this.f47182f = appIdentity;
        sdo.m34959a(iBinder);
        this.f47183g = iBinder;
        System.currentTimeMillis();
        this.f47179c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27158a() {
        try {
            this.f47178b.close();
        } catch (IOException e) {
            ubp.f47185a.mo25375b("Unable to close file: %d", Integer.valueOf(this.f47177a));
        }
        ufm ufm = this.f47180d;
        if (ufm != null) {
            ufm.mo27297c();
        }
        this.f47183g.unlinkToDeath(this, 0);
    }

    public final void binderDied() {
        ubp.f47185a.mo25369a("Client died with open content: %d.", Integer.valueOf(this.f47177a));
        this.f47184h.mo27166a(this);
        mo27158a();
    }
}
