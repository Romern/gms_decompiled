package p000;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ahvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvf {

    /* renamed from: a */
    public final ahve f68156a;

    /* renamed from: b */
    public final Map f68157b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Context f68158c;

    public ahvf(Context context) {
        ahve ahve = new ahve(context);
        this.f68158c = context;
        this.f68156a = ahve;
    }

    /* renamed from: a */
    public final boolean mo37201a(String str, ahyz ahyz) {
        if (!cfoj.f184966a.mo6606a().mo82137bH()) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Flag is not turned on for uploading first connection to FMA.");
            return false;
        }
        mo37202b(str, ahyz);
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, boolean):void
     arg types: [java.lang.String, cakq, boolean]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020d  */
    /* renamed from: b */
    public final void mo37202b(String str, ahyz ahyz) {
        char c;
        int i;
        bxvd da;
        cakp cakp;
        bxvd da2;
        cakp cakp2;
        ahve ahve = this.f68156a;
        Context context = this.f68158c;
        int hashCode = str.hashCode();
        if (hashCode != -301431627) {
            if (hashCode == 1821585647 && str.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                c = 1;
                if (c == 0) {
                    i = 3;
                } else if (c != 1) {
                    i = 2;
                } else {
                    i = 4;
                }
                ByteString bxtx = ahyz.f68429c;
                String str2 = ahyz.f68428b;
                ClientContext clientContext = new ClientContext();
                clientContext.f30212b = Process.myUid();
                clientContext.f30215e = ahve.f68152a.getPackageName();
                clientContext.f30216f = ahve.f68152a.getPackageName();
                int a = buqx.m120256a(str2);
                da = cakp.f175028g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakp = (cakp) da.f164949b;
                bxtx.getClass();
                if (!cakp.f175030a.mo73666a()) {
                    cakp.f175030a = GeneratedMessageLite.m124021a(cakp.f175030a);
                }
                cakp.f175030a.add(bxtx);
                long b = ryv.m34682b(ahve.f68152a, "android_id");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakp cakp3 = (cakp) da.f164949b;
                cakp3.f175031b = b;
                cakp3.f175034e = 1;
                ((cakp) da.f164949b).f175032c = i - 2;
                long a2 = ((sqv) ahgz.m55754a(ahve.f68152a, sqv.class)).mo20505a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((cakp) da.f164949b).f175033d = a2;
                da2 = cako.f175025b.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((cako) da2.f164949b).f175027a = a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cako cako = (cako) da2.mo74062i();
                cako.getClass();
                ((cakp) da.f164949b).f175035f = cako;
                cakp2 = (cakp) da.mo74062i();
                ahwe a3 = ahve.f68153b.mo37223a(context, clientContext, cakp2, ahve.mo37200a(context));
                ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPair: Got a result from StoreAccessoryHelper: response=%s, isRetriable=%b", (Object) a3.mo37138a(), a3.mo37139b());
                if (a3.mo37138a() != cakq.SUCCESS && a3.mo37139b()) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FastPair: Saving a request that failed at %d", cakp2.f175033d);
                    ahtp ahtp = ahve.f68154c;
                    ahtt ahtt = new ahtt();
                    if (context != null) {
                        ahtt.f68028a = context;
                        if (cakp2 != null) {
                            ahtt.f68029b = cakp2;
                            ahtt.f68030c = clientContext;
                            ahtt.f68031d = Integer.valueOf((int) cfog.f184854a.mo6606a().mo81961W());
                            String str3 = ahtt.f68028a == null ? " context" : "";
                            if (ahtt.f68029b == null) {
                                str3 = str3.concat(" request");
                            }
                            if (ahtt.f68030c == null) {
                                str3 = String.valueOf(str3).concat(" clientContext");
                            }
                            if (ahtt.f68031d == null) {
                                str3 = String.valueOf(str3).concat(" allowedAttempts");
                            }
                            if (!str3.isEmpty()) {
                                String valueOf = String.valueOf(str3);
                                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                            }
                            ahtk ahtk = new ahtk(ahtt.f68028a, ahtt.f68029b, ahtt.f68030c, ahtt.f68031d.intValue());
                            if (!ahtk.mo37158e()) {
                                ahtp.m56639a(ahtk);
                            } else {
                                ahtp.f68017b.add(ahtk);
                                ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FailedStoreAccessoryRequestsController: Saving a request which failed at %d", ahtk.mo37159f());
                                if (ahtp.f68018c == null && !ahtp.f68019d && ((cfom.m141867b() && ((burl) ahgz.m55754a(ahtp.f68016a, burl.class)).mo73045e() != 2) || !cfom.m141867b())) {
                                    ahtp.f68018c = ahtp.mo37154a();
                                }
                            }
                        } else {
                            throw new NullPointerException("Null request");
                        }
                    } else {
                        throw new NullPointerException("Null context");
                    }
                }
                ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPair: notify FMA, uploaded action (%s) and got response from FMA request: %s", str, a3.mo37138a());
                this.f68157b.put(ahyz.f68429c, Long.valueOf(SystemClock.elapsedRealtime() + cfog.f184854a.mo6606a().mo81960V()));
                return;
            }
        } else if (str.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
            c = 0;
            if (c == 0) {
            }
            ByteString bxtx2 = ahyz.f68429c;
            String str22 = ahyz.f68428b;
            ClientContext clientContext2 = new ClientContext();
            clientContext2.f30212b = Process.myUid();
            clientContext2.f30215e = ahve.f68152a.getPackageName();
            clientContext2.f30216f = ahve.f68152a.getPackageName();
            int a4 = buqx.m120256a(str22);
            da = cakp.f175028g.mo74144da();
            if (da.f164950c) {
            }
            cakp = (cakp) da.f164949b;
            bxtx2.getClass();
            if (!cakp.f175030a.mo73666a()) {
            }
            cakp.f175030a.add(bxtx2);
            long b2 = ryv.m34682b(ahve.f68152a, "android_id");
            if (da.f164950c) {
            }
            cakp cakp32 = (cakp) da.f164949b;
            cakp32.f175031b = b2;
            cakp32.f175034e = 1;
            ((cakp) da.f164949b).f175032c = i - 2;
            long a22 = ((sqv) ahgz.m55754a(ahve.f68152a, sqv.class)).mo20505a();
            if (da.f164950c) {
            }
            ((cakp) da.f164949b).f175033d = a22;
            da2 = cako.f175025b.mo74144da();
            if (da2.f164950c) {
            }
            ((cako) da2.f164949b).f175027a = a4;
            if (da.f164950c) {
            }
            cako cako2 = (cako) da2.mo74062i();
            cako2.getClass();
            ((cakp) da.f164949b).f175035f = cako2;
            cakp2 = (cakp) da.mo74062i();
            ahwe a32 = ahve.f68153b.mo37223a(context, clientContext2, cakp2, ahve.mo37200a(context));
            ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPair: Got a result from StoreAccessoryHelper: response=%s, isRetriable=%b", (Object) a32.mo37138a(), a32.mo37139b());
            ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FastPair: Saving a request that failed at %d", cakp2.f175033d);
            ahtp ahtp2 = ahve.f68154c;
            ahtt ahtt2 = new ahtt();
            if (context != null) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
        ByteString bxtx22 = ahyz.f68429c;
        String str222 = ahyz.f68428b;
        ClientContext clientContext22 = new ClientContext();
        clientContext22.f30212b = Process.myUid();
        clientContext22.f30215e = ahve.f68152a.getPackageName();
        clientContext22.f30216f = ahve.f68152a.getPackageName();
        int a42 = buqx.m120256a(str222);
        da = cakp.f175028g.mo74144da();
        if (da.f164950c) {
        }
        cakp = (cakp) da.f164949b;
        bxtx22.getClass();
        if (!cakp.f175030a.mo73666a()) {
        }
        cakp.f175030a.add(bxtx22);
        long b22 = ryv.m34682b(ahve.f68152a, "android_id");
        if (da.f164950c) {
        }
        cakp cakp322 = (cakp) da.f164949b;
        cakp322.f175031b = b22;
        cakp322.f175034e = 1;
        ((cakp) da.f164949b).f175032c = i - 2;
        long a222 = ((sqv) ahgz.m55754a(ahve.f68152a, sqv.class)).mo20505a();
        if (da.f164950c) {
        }
        ((cakp) da.f164949b).f175033d = a222;
        da2 = cako.f175025b.mo74144da();
        if (da2.f164950c) {
        }
        ((cako) da2.f164949b).f175027a = a42;
        if (da.f164950c) {
        }
        cako cako22 = (cako) da2.mo74062i();
        cako22.getClass();
        ((cakp) da.f164949b).f175035f = cako22;
        cakp2 = (cakp) da.mo74062i();
        ahwe a322 = ahve.f68153b.mo37223a(context, clientContext22, cakp2, ahve.mo37200a(context));
        ((bnsl) ahsd.f67925a.mo68390d()).mo68431a("FastPair: Got a result from StoreAccessoryHelper: response=%s, isRetriable=%b", (Object) a322.mo37138a(), a322.mo37139b());
        ((bnsl) ahsd.f67925a.mo68390d()).mo68415a("FastPair: Saving a request that failed at %d", cakp2.f175033d);
        ahtp ahtp22 = ahve.f68154c;
        ahtt ahtt22 = new ahtt();
        if (context != null) {
        }
    }
}
