package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.ClientContext;

@Deprecated
/* renamed from: sfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfr {

    /* renamed from: a */
    public static final sfr f44142a;

    /* renamed from: b */
    public final spx f44143b;

    /* renamed from: c */
    private final Context f44144c;

    /* renamed from: d */
    private final ClientContext f44145d;

    static {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = spn.f44932a;
        clientContext.f30215e = "com.google.android.gms";
        f44142a = m35174a(rpr.m34216b(), clientContext);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    protected sfr(Context context, ClientContext clientContext) {
        boolean z;
        spx a = spx.m35925a(context);
        sdo.m34959a(a);
        this.f44143b = a;
        sdo.m34959a(context);
        this.f44144c = context;
        sdo.m34959a(clientContext);
        this.f44145d = clientContext;
        if (clientContext.f30212b >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Calling UID is not available.");
        sdo.m34966a((Object) this.f44145d.f30215e, (Object) "Calling package name is not available.");
    }

    /* renamed from: a */
    public static sfr m35174a(Context context, ClientContext clientContext) {
        return new sfr(context, clientContext);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sfr.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      sfr.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):sfr
      sfr.a(java.lang.String, boolean):int */
    /* renamed from: a */
    public final int mo25481a(String str) {
        return mo25482a(str, true);
    }

    /* renamed from: a */
    public final int mo25482a(String str, boolean z) {
        ClientContext clientContext = this.f44145d;
        int i = clientContext.f30220j;
        if (i >= 0) {
            svq b = svr.m36484b(this.f44144c);
            ClientContext clientContext2 = this.f44145d;
            return C1145kt.m18541a(b.f45245a, str, i, clientContext2.f30212b, clientContext2.f30215e);
        }
        String str2 = clientContext.f30215e;
        if (svr.m36484b(this.f44144c).mo26171a(str, str2) == -1) {
            return -1;
        }
        int i2 = this.f44145d.f30212b;
        int i3 = Build.VERSION.SDK_INT;
        String a = this.f44143b.mo25953a(str);
        if (a == null) {
            return 0;
        }
        if ((!z ? this.f44143b.mo25962d(a, i2, str2) : this.f44143b.mo25960c(a, i2, str2)) != 0) {
            return -2;
        }
        return 0;
    }
}
