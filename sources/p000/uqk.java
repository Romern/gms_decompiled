package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uqk implements IBinder.DeathRecipient {

    /* renamed from: a */
    private static final sbw f48537a = new sbw("PackageEventRouter", "");

    /* renamed from: b */
    private final Context f48538b;

    /* renamed from: c */
    private final String f48539c;

    /* renamed from: d */
    private IBinder f48540d;

    /* renamed from: e */
    private ServiceConnection f48541e;

    /* renamed from: f */
    private utr f48542f;

    /* renamed from: g */
    private final List f48543g = new ArrayList();

    public uqk(Context context, String str) {
        this.f48538b = context;
        this.f48539c = str;
        f48537a.mo25369a("Starting new event router for %s", str);
        m39240d();
    }

    /* renamed from: b */
    private final synchronized void m39239b(DriveEvent driveEvent) {
        sdo.m34959a(this.f48542f);
        try {
            this.f48542f.mo27248a(new OnEventResponse(driveEvent));
            f48537a.mo25371b("Event sent OK.");
        } catch (RemoteException e) {
            f48537a.mo25378c("PackageEventRouter", "Could not send event", e);
            new Object[1][0] = driveEvent;
        }
    }

    /* renamed from: d */
    private final synchronized void m39240d() {
        f48537a.mo25369a("Connecting event router to %s", this.f48539c);
        Intent a = upz.m39219a(this.f48539c);
        this.f48541e = new uqj("drive", this);
        skh.m35531a().mo25690a(this.f48538b, a, this.f48541e, 1);
    }

    /* renamed from: a */
    public final synchronized void mo27869a(IBinder iBinder) {
        utr utr;
        f48537a.mo25369a("Connected to event service for %s", this.f48539c);
        try {
            this.f48540d = iBinder;
            iBinder.linkToDeath(this, 0);
        } catch (RemoteException e) {
            f48537a.mo25373b("PackageEventRouter", "Unable to link to event service death", e);
        }
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventCallback");
            utr = queryLocalInterface instanceof utr ? (utr) queryLocalInterface : new utp(iBinder);
        } else {
            utr = null;
        }
        this.f48542f = utr;
        List list = this.f48543g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m39239b((DriveEvent) list.get(i));
        }
        this.f48543g.clear();
    }

    public final synchronized void binderDied() {
        IBinder iBinder = this.f48540d;
        if (iBinder != null) {
            iBinder.unlinkToDeath(this, 0);
            mo27874c();
        }
    }

    /* renamed from: c */
    public final synchronized void mo27874c() {
        this.f48540d = null;
        this.f48541e = null;
        this.f48542f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo27872b() {
        f48537a.mo25369a("Stopping event router for %s", this.f48539c);
        if (this.f48541e != null) {
            skh.m35531a().mo25689a(this.f48538b, this.f48541e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27870a(DriveEvent driveEvent) {
        if (this.f48542f == null) {
            this.f48543g.add(driveEvent);
        } else {
            m39239b(driveEvent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo27871a() {
        if (!this.f48543g.isEmpty()) {
            return false;
        }
        f48537a.mo25369a("Stopping idle event router for %s", this.f48539c);
        mo27872b();
        return true;
    }
}
