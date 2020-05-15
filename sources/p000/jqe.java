package p000;

import android.app.PendingIntent;
import android.os.Binder;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelApiChimeraService;
import java.util.List;

/* renamed from: jqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqe extends jsq implements aaai {

    /* renamed from: a */
    private final SecureChannelApiChimeraService f23043a;

    /* renamed from: b */
    private final aaag f23044b;

    /* renamed from: c */
    private final String f23045c;

    public jqe(SecureChannelApiChimeraService secureChannelApiChimeraService, aaag aaag, String str) {
        this.f23043a = secureChannelApiChimeraService;
        this.f23044b = aaag;
        this.f23045c = str;
    }

    /* renamed from: a */
    private final void m17112a() {
        if (C1145kt.m18541a(this.f23043a, "android.permission.BLUETOOTH", Binder.getCallingPid(), Binder.getCallingUid(), null) == -1) {
            throw new SecurityException("Missing permission android.permission.BLUETOOTH");
        }
    }

    /* renamed from: b */
    private final void m17113b() {
        if (ccid.f179036a.mo6606a().mo76002a() && !jpe.m17064a(this.f23043a)) {
            throw new SecurityException("Better Together must be enabled on an account to use the SecureChannel API!");
        }
    }

    /* renamed from: a */
    public final void mo13984a(rnt rnt, Role role, List list, PendingIntent pendingIntent) {
        m17112a();
        m17113b();
        this.f23044b.mo16659a(this.f23043a, new jpz(rnt, role, list, pendingIntent, this.f23045c));
    }

    /* renamed from: b */
    public final void mo13988b(rnt rnt, Role role, List list, PendingIntent pendingIntent) {
        m17112a();
        m17113b();
        this.f23044b.mo16659a(this.f23043a, new jre(rnt, role, list, pendingIntent, this.f23045c));
    }

    /* renamed from: a */
    public final void mo13985a(rnt rnt, String str, Role role, jsm jsm) {
        m17112a();
        m17113b();
        this.f23044b.mo16659a(this.f23043a, new joe(rnt, str, role, jsm));
    }

    /* renamed from: a */
    public final void mo13986a(rnt rnt, String str, Role role, byte[] bArr) {
        m17112a();
        m17113b();
        this.f23044b.mo16659a(this.f23043a, new jqh(rnt, str, role, bArr));
    }

    /* renamed from: a */
    public final void mo13987a(rnt rnt, jsm jsm) {
        m17112a();
        m17113b();
        this.f23044b.mo16659a(this.f23043a, new jqc(rnt, jsm));
    }
}
