package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import java.util.concurrent.Callable;

/* renamed from: ahki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahki {

    /* renamed from: a */
    public final ahky f67338a;

    /* renamed from: b */
    public final bqgj f67339b = ahhr.m55806b();

    ahki(ahky ahky) {
        this.f67338a = ahky;
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahki", "<init>", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Instantiated ServiceControllerRouter %s.", this);
    }

    /* renamed from: a */
    public static final byte[] m55918a(String str, byte[] bArr) {
        String str2;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        if (!stm.m36302d(str)) {
            return str.getBytes(ahkv.f67378a);
        }
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        if (str4.startsWith(str3)) {
            str2 = stm.m36301c(str4);
        } else {
            String c = stm.m36301c(str3);
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1 + String.valueOf(str4).length());
            sb.append(c);
            sb.append(" ");
            sb.append(str4);
            str2 = sb.toString();
        }
        return str2.getBytes(ahkv.f67378a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo36639b() {
        this.f67338a.mo36760a();
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahki", "b", 91, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Completed shutdown of ServiceControllerRouter %s.", this);
    }

    /* renamed from: c */
    public final void mo36641c(ahkv ahkv, boolean z) {
        mo36638a(new ahka(this, ahkv, z));
    }

    /* renamed from: d */
    public final void mo36642d(ahkv ahkv, boolean z) {
        mo36638a(new ahkc(this, ahkv, z));
    }

    /* renamed from: b */
    public final void mo36640b(ahkv ahkv, boolean z) {
        int i;
        if (ahkv.mo36728k()) {
            ahky ahky = this.f67338a;
            if (!z) {
                i = 8040;
            } else {
                i = 8041;
            }
            ahky.mo36765b(ahkv, i);
        }
    }

    public ahki(Context context) {
        ahpa ahpa = new ahpa(context);
        this.f67338a = ahpa;
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahki", "<init>", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Instantiated ServiceControllerRouter %s.", this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Integer mo36632a(AcceptConnectionRequestParams acceptConnectionRequestParams, ahkv ahkv) {
        String str = acceptConnectionRequestParams.f80560c;
        if (ahkv.mo36716e(str)) {
            return 8003;
        }
        if (!ahkv.mo36720g(str)) {
            return Integer.valueOf(this.f67338a.mo36757a(ahkv, str, acceptConnectionRequestParams.f80561d, acceptConnectionRequestParams.f80562e));
        }
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
        bnsl.mo68432a("ahki", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68418a("Client %d invoked acceptConnectionRequest() after having already accepted/rejected the connection to %s.", ahkv.mo36706b(), str);
        return 8009;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Integer mo36633a(RejectConnectionRequestParams rejectConnectionRequestParams, ahkv ahkv) {
        String str = rejectConnectionRequestParams.f80614b;
        if (ahkv.mo36716e(str)) {
            return 8003;
        }
        if (!ahkv.mo36720g(str)) {
            return Integer.valueOf(this.f67338a.mo36755a(ahkv, str));
        }
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
        bnsl.mo68432a("ahki", "a", 262, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68418a("Client %d invoked rejectConnectionRequest() after having already accepted/rejected the connection to %s.", ahkv.mo36706b(), str);
        return 8009;
    }

    /* renamed from: a */
    public final void mo36634a() {
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahki", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Initiating shutdown of ServiceControllerRouter %s.", this);
        mo36638a(new ahjs(this));
        ahhr.m55805a(this.f67339b, "ServiceControllerRouter.offBinderSerializer");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahki.a(ahkv, boolean):void
     arg types: [ahkv, int]
     candidates:
      ahki.a(java.lang.String, byte[]):byte[]
      ahki.a(com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams, ahkv):java.lang.Integer
      ahki.a(com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams, ahkv):java.lang.Integer
      ahki.a(aigr, java.util.concurrent.Callable):void
      ahki.a(ahkv, boolean):void */
    /* renamed from: a */
    public final void mo36635a(ahkv ahkv) {
        for (String str : ahkv.mo36738p()) {
            this.f67338a.mo36767c(ahkv, str);
        }
        for (String str2 : ahkv.mo36736o()) {
            this.f67338a.mo36767c(ahkv, str2);
        }
        mo36636a(ahkv, false);
        mo36640b(ahkv, false);
        ahkv.mo36717f();
        this.f67338a.mo36764b();
    }

    /* renamed from: a */
    public final void mo36636a(ahkv ahkv, boolean z) {
        int i;
        if (ahkv.mo36719g()) {
            ahky ahky = this.f67338a;
            if (!z) {
                i = 8040;
            } else {
                i = 8041;
            }
            ahky.mo36761a(ahkv, i);
        }
    }

    /* renamed from: a */
    public final void mo36637a(aigr aigr, Callable callable) {
        this.f67339b.execute(new ahjx(callable, aigr));
    }

    /* renamed from: a */
    public final void mo36638a(Runnable runnable) {
        this.f67339b.execute(runnable);
    }
}
