package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import android.security.keystore.recovery.LockScreenRequiredException;
import android.security.keystore.recovery.RecoveryController;
import java.security.UnrecoverableKeyException;

/* renamed from: lxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lxd {

    /* renamed from: a */
    private static final lvn f33136a = new lvn("InitializeFolsomSecondaryKeyTask");

    /* renamed from: b */
    private final Context f33137b;

    /* renamed from: c */
    private final lwc f33138c;

    /* renamed from: d */
    private final lwr f33139d;

    /* renamed from: e */
    private final lwj f33140e;

    /* renamed from: f */
    private final mbx f33141f;

    public lxd(Context context, lwc lwc, lwr lwr, lwj lwj, mbx mbx) {
        this.f33137b = context;
        this.f33138c = lwc;
        this.f33139d = lwr;
        this.f33140e = lwj;
        this.f33141f = mbx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    private final lwp m24588b() {
        bmxv c = m24589c();
        if (c.mo66813a()) {
            lwp lwp = (lwp) c.mo66814b();
            if (lwp.mo19710a(this.f33137b) == 3) {
                this.f33141f.mo19822a(21, 4);
                String valueOf = String.valueOf(lwp.f33123a);
                throw new lwt(valueOf.length() == 0 ? new String("Key destroyed: ") : "Key destroyed: ".concat(valueOf));
            }
            f33136a.mo25412b("Secondary key already initialized: %s", ((lwp) c.mo66814b()).f33123a);
            return (lwp) c.mo66814b();
        }
        f33136a.logVerbose("Initializing for crypto: generating a secondary key.", new Object[0]);
        try {
            lwp a = this.f33139d.mo19711a();
            String str = a.f33123a;
            f33136a.mo25414c("Generated new secondary key %s", str);
            try {
                this.f33140e.mo19705a(str, bnoj.f131912b);
                f33136a.logVerbose("Successfully synced %s with server.", str);
                try {
                    lwc lwc = this.f33138c;
                    sdo.m34971a(!lwc.mo19698c(), (Object) "Attempting to initialize an already initialized settings.");
                    lwc.mo19693a(str);
                    SharedPreferences.Editor edit = lwc.f33100c.edit();
                    edit.putBoolean("isInitialized", true);
                    edit.apply();
                    f33136a.logVerbose("Successfully saved %s as active secondary to disk.", str);
                    return a;
                } catch (lwg e) {
                    this.f33141f.mo19822a(20, 4);
                    throw new lxc(e);
                }
            } catch (mbi e2) {
                throw new lxc(e2);
            }
        } catch (InternalRecoveryServiceException | LockScreenRequiredException | UnrecoverableKeyException e3) {
            this.f33141f.mo19822a(26, 4);
            throw new lxc(e3);
        }
    }

    /* renamed from: c */
    private final bmxv m24589c() {
        if (!this.f33138c.mo19698c()) {
            return bmvz.f131120a;
        }
        bmxv a = this.f33138c.mo19691a();
        if (a.mo66813a()) {
            String str = (String) a.mo66814b();
            try {
                bmxv b = this.f33139d.mo19713b(str);
                if (b.mo66813a()) {
                    return b;
                }
                this.f33141f.mo19822a(23, 4);
                String valueOf = String.valueOf(str);
                throw new lws(valueOf.length() == 0 ? new String("Initialized with key but it was not in key store: ") : "Initialized with key but it was not in key store: ".concat(valueOf));
            } catch (InternalRecoveryServiceException | UnrecoverableKeyException e) {
                this.f33141f.mo19822a(24, 4);
                throw new lxc(e);
            }
        } else {
            this.f33141f.mo19822a(22, 4);
            throw new lws("Settings said crypto was initialized, but there was no active secondary alias");
        }
    }

    /* renamed from: a */
    public final lwp mo19720a() {
        Context context = this.f33137b;
        lxf lxf = new lxf(context, this.f33139d, this.f33140e, this.f33138c, RecoveryController.getInstance(context));
        synchronized (lxf.class) {
            lxf.mo19721a();
        }
        try {
            return m24588b();
        } catch (lwt e) {
            f33136a.mo25417e("Secondary key initialization failed, please file a bug", e, new Object[0]);
            mab.m24748a(this.f33137b, e, cclp.m130475e());
            throw e;
        }
    }
}
